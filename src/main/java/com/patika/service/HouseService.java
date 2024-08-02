package com.patika.service;

import com.patika.models.House;
import com.patika.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public double getTotalPriceOfEv() {
        return houseRepository.getEvList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVilla() {
        return houseRepository.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfYazlik() {
        return houseRepository.getYazlikList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllHouses() {
        return getTotalPriceOfEv() + getTotalPriceOfVilla() + getTotalPriceOfYazlik();
    }

    public double getAverageSizeOfEv() {
        return houseRepository.getEvList().stream().mapToDouble(House::getSize).average().orElse(0);
    }

    public double getAverageSizeOfVilla() {
        return houseRepository.getVillaList().stream().mapToDouble(House::getSize).average().orElse(0);
    }

    public double getAverageSizeOfYazlik() {
        return houseRepository.getYazlikList().stream().mapToDouble(House::getSize).average().orElse(0);
    }

    public double getAverageSizeOfAllHouses() {
        double totalSize = houseRepository.getEvList().stream().mapToDouble(House::getSize).sum()
                + houseRepository.getVillaList().stream().mapToDouble(House::getSize).sum()
                + houseRepository.getYazlikList().stream().mapToDouble(House::getSize).sum();
        int totalCount = houseRepository.getEvList().size() + houseRepository.getVillaList().size() + houseRepository.getYazlikList().size();
        return totalCount == 0 ? 0 : totalSize / totalCount;
    }

    public List<House> filterHousesByRoomsAndHalls(int rooms, int halls) {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(houseRepository.getEvList());
        allHouses.addAll(houseRepository.getVillaList());
        allHouses.addAll(houseRepository.getYazlikList());

        return allHouses.stream()
                .filter(house -> house.getRooms() == rooms && house.getHalls() == halls)
                .toList();
    }
}
