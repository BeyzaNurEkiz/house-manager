package com.patika.repository;
import com.patika.models.Ev;
import com.patika.models.Villa;
import com.patika.models.Yazlik;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<Ev> evList;
    private List<Villa> villaList;
    private List<Yazlik> yazlikList;

    public HouseRepository() {
        this.evList = new ArrayList<>();
        this.villaList = new ArrayList<>();
        this.yazlikList = new ArrayList<>();

        // Sample data
        evList.add(new Ev(100000, 120, 3, 1));
        evList.add(new Ev(150000, 150, 4, 1));
        evList.add(new Ev(200000, 180, 5, 2));

        villaList.add(new Villa(300000, 250, 6, 2));
        villaList.add(new Villa(350000, 300, 7, 2));
        villaList.add(new Villa(400000, 350, 8, 3));

        yazlikList.add(new Yazlik(250000, 200, 4, 1));
        yazlikList.add(new Yazlik(280000, 220, 5, 1));
        yazlikList.add(new Yazlik(320000, 240, 6, 2));
    }

    public List<Ev> getEvList() {
        return evList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<Yazlik> getYazlikList() {
        return yazlikList;
    }
}

