package com.company.model.validators;

import com.company.model.annotations.WeaponCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WeaponValidator implements ConstraintValidator<WeaponCode, String> {

    private String weaponPrefix;

    @Override
    public void initialize(WeaponCode weaponCode) {
        weaponPrefix = weaponCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if(s != null) {
            return s.startsWith(weaponPrefix);
        }

        return false;
    }
}
