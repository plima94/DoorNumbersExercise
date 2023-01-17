package com.ex.doornumbers;

import com.ex.doornumbers.Entity.CourtDoor;
import com.ex.doornumbers.Entity.FireStationDoor;
import com.ex.doornumbers.Entity.Permutator;
import com.ex.doornumbers.Entity.PoliceDoor;

public class Main {
    public static void main(String[] args) {

        Integer maxDoors = 99;

        PoliceDoor policeDoor = new PoliceDoor(maxDoors);
        FireStationDoor fireStationDoor = new FireStationDoor(maxDoors);
        CourtDoor courtDoor = new CourtDoor(maxDoors);

        Permutator permutator = new Permutator(policeDoor.getPoliceDoor(), fireStationDoor.getFireStationDoor(), courtDoor.getCourtDoor());

        permutator.toString();

    }
}
