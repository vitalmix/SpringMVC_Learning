package com.company.model;

import java.util.LinkedHashMap;

public class StarShip implements Transport {

    private String model;
    private String weapon;

    private LinkedHashMap<String, String> weaponOptions;

    public StarShip() {

        weaponOptions = new LinkedHashMap<>();

        weaponOptions.put("Rockets", "Rockets");
        weaponOptions.put("MashGun", "MashGun");
        weaponOptions.put("LaserGun", "LaserGun");
        weaponOptions.put("None", "None");


    }

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

    public LinkedHashMap<String, String> getWeaponOptions() {
        return weaponOptions;
    }
}
