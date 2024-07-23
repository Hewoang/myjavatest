package com.javatest.houserent.service;

import com.javatest.houserent.domain.House;




public class HouseService {
    private House[] houses;
    private int houseCount;
    private int idC;
    private House[] sk = new House[3];

    public HouseService(int size) {
        this.houses = new House[size];
        houses[0] = new House(1, "噶士大夫", "12311234212", "qwerqwerqwer", 5000, false);
    }

    public House[] getHouse() {
        return houses;
    }
    public boolean add(House newhouse) {
        if (houseCount == houses.length) {
            System.out.println("已满，先删");
            return false;
        }
        houses[houseCount++] = newhouse;
        newhouse.setId(++idC);
        return true;
    }

    public boolean del(int id) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id) {
                index = i;
            }
        }

        if (index == -1) {
            return false;
        }
        for (int i = index; i < houses.length-1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseCount]=null;
        return true;
    }

    public House[] seek(String address) {
        for (int i = 0; i < houseCount; i++) {
            if (houses[i].getAddress().equals(address)) {
                sk[i] = houses[i];
            }
        }
        if (sk==null){
            return null;
        }
        return sk;
    }
    public House[] seek(int rent) {
        for (int i = 0; i < houseCount; i++) {
            if (houses[i].getRent() == rent) {
                sk[i] = houses[i];
            }
        }
        if (sk==null){
            return null;
        }
        return sk;
    }
    public House[] seek(boolean state) {
        for (int i = 0; i < houseCount; i++) {
            if (houses[i].getState() == state) {
                sk[i] = houses[i];
            }
        }
        if (sk==null){
            return null;
        }
        return sk;
    }
}
