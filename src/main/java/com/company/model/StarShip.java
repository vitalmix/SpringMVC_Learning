package com.company.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StarShip implements Transport {

    @NotNull(message = "is required")
    @Size(min = 3, message = "size of model must be => 3")
    private String model;
    private String weapon;
    private String module;

    @Min(value = 0, message = "value of passengers can't be < 0")
    @Max(value = 10, message = "value of passengers can't be > 10")
    private int numOfPassengers;

    private LinkedHashMap<String, String> weaponOptions;

    private ArrayList<String> additionalModules;

    public StarShip() {

        weaponOptions = new LinkedHashMap<>();

        weaponOptions.put("Rockets", "Rockets");
        weaponOptions.put("MashGun", "MashGun");
        weaponOptions.put("LaserGun", "LaserGun");
        weaponOptions.put("None", "None");

        additionalModules = new ArrayList<>();
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

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public ArrayList<String> getPutAdditionalModules() {
        return additionalModules;
    }

    public void setPutAdditionalModules(ArrayList<String> additionalModules) {
        this.additionalModules = additionalModules;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}
