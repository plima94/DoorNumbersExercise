package com.merkle.doornumbers.Entity;

import com.merkle.doornumbers.Interfaces.DoorNumberCalculator;

import java.util.ArrayList;
import java.util.List;

public class PoliceDoor implements DoorNumberCalculator {

    private List<Integer> policeDoor;

    public PoliceDoor(Integer maxDoors) {
        this.policeDoor = new ArrayList<>();
        numberCalculator(maxDoors);
    }

    public List<Integer> getPoliceDoor() {
        return policeDoor;
    }

    @Override
    public void numberCalculator(Integer maxDoors) {
        for(int i = 2; i <= maxDoors; i+= 2){
                policeDoor.add(i);
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < policeDoor.size(); i++) {
            System.out.println(policeDoor.get(i));
        }
        return null;
    }
}
