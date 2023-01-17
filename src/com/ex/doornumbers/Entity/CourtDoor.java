package com.ex.doornumbers.Entity;

import com.ex.doornumbers.Interfaces.DoorNumberCalculator;

import java.util.ArrayList;
import java.util.List;

public class CourtDoor implements DoorNumberCalculator {

    private List<Integer> courtDoor;

    public CourtDoor(Integer maxDoors) {
        this.courtDoor = new ArrayList<>();
        numberCalculator(maxDoors);
    }

    public List<Integer> getCourtDoor() {
        return courtDoor;
    }

    @Override
    public void numberCalculator(Integer maxDoors) {
        for(int i = 1; i <= maxDoors; i++){
            if(i % 10 != 3) {
                courtDoor.add(i);
            }
        }
    }

    @Override
    public String toString() {
        for(int i = 0; i < courtDoor.size(); i++){
            System.out.println(courtDoor.get(i));
        }
        return null;
    }
}
