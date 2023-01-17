package com.merkle.doornumbers.Entity;

import java.util.ArrayList;
import java.util.List;

public class Permutator  {

    private List<Integer[]> permutations;

    public Permutator(List<Integer> policeDoor, List<Integer> fireStationDoor, List<Integer> courtDoor) {
        this.permutations = new ArrayList<>();
        setPermutations(policeDoor, fireStationDoor, courtDoor);
    }

    public void setPermutations(List<Integer> policeDoor, List<Integer> fireStationDoor, List<Integer> courtDoor) {
        for (int i = 0; i < policeDoor.size(); i++) {
            for (int j = 0; j < fireStationDoor.size(); j++) {
                for (int k = 0; k < courtDoor.size(); k++) {
                    if (policeDoor.get(i) != fireStationDoor.get(j) &&
                        fireStationDoor.get(j) != courtDoor.get(k) &&
                        policeDoor.get(i) != courtDoor.get(k)) {

                        Integer[] possib = new Integer[3];
                        possib[0] = policeDoor.get(i);
                        possib[1] = fireStationDoor.get(j);
                        possib[2] = courtDoor.get(k);

                        permutations.add(possib);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
            for (int i = 0; i < permutations.size(); i++) {
                System.out.println("{" + permutations.get(i)[0] + ", " + permutations.get(i)[1] + ", " + permutations.get(i)[2] + "}");
            }
            System.out.println("Total : " + permutations.size());
        return null;
    }
}
