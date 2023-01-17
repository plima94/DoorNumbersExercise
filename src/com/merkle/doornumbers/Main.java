package com.merkle.doornumbers;

import com.merkle.doornumbers.Entity.CourtDoor;
import com.merkle.doornumbers.Entity.FireStationDoor;
import com.merkle.doornumbers.Entity.Permutator;
import com.merkle.doornumbers.Entity.PoliceDoor;

public class Main {
    public static void main(String[] args) {

        Integer maxDoors = 4;

        PoliceDoor policeDoor = new PoliceDoor(maxDoors);
        FireStationDoor fireStationDoor = new FireStationDoor(maxDoors);
        CourtDoor courtDoor = new CourtDoor(maxDoors);

        Permutator permutator = new Permutator(policeDoor.getPoliceDoor(), fireStationDoor.getFireStationDoor(), courtDoor.getCourtDoor());

        permutator.toString();

    }
}
