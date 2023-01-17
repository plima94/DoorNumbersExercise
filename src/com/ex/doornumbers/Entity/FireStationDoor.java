package com.ex.doornumbers.Entity;

import com.ex.doornumbers.Interfaces.DoorNumberCalculator;

import java.util.ArrayList;
import java.util.List;

public class FireStationDoor implements DoorNumberCalculator {

    private List<Integer> fireStationDoor;

    public FireStationDoor(Integer maxDoors) {
        this.fireStationDoor = new ArrayList<>();
        numberCalculator(maxDoors);
    }

    public List<Integer> getFireStationDoor() {
        return fireStationDoor;
    }

    @Override
    public void numberCalculator(Integer maxDoors) {
        for (int i = 1; i <= maxDoors; i++) {
            if (checkPrime(i)) {
                fireStationDoor.add(i);
            }
        }
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        for(int i = 0; i < fireStationDoor.size(); i++){
            System.out.println(fireStationDoor.get(i));
        }
        return null;
    }
}
