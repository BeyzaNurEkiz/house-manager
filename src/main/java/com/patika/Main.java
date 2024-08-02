package com.patika;

import com.patika.repository.HouseRepository;
import com.patika.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseRepository houseRepository = new HouseRepository();
        HouseService houseService = new HouseService(houseRepository);

        System.out.println("Evlerin toplam fiyatı: " + houseService.getTotalPriceOfEv());
        System.out.println("Villaların toplam fiyatı: " + houseService.getTotalPriceOfVilla());
        System.out.println("Yazlıkların toplam fiyatı: " + houseService.getTotalPriceOfYazlik());
        System.out.println("Tüm tipteki evlerin toplam fiyatı: " + houseService.getTotalPriceOfAllHouses());

        System.out.println("Evlerin ortalama metrekaresi: " + houseService.getAverageSizeOfEv());
        System.out.println("Villaların ortalama metrekaresi: " + houseService.getAverageSizeOfVilla());
        System.out.println("Yazlıkların ortalama metrekaresi: " + houseService.getAverageSizeOfYazlik());
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi " + houseService.getAverageSizeOfAllHouses());

        System.out.println("Oda ve salon sayısına göre tüm tipteki evler: " + houseService.filterHousesByRoomsAndHalls(3, 1));
    }

}