package com.company.model;

public class StarShip implements Transport {

    private String model;
    private String weapon;

    public void move() {

    }

    public void stop() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
