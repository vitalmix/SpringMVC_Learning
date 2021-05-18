package com.company.model.annotations;

import com.company.model.validators.WeaponValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = WeaponValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WeaponCode {

    public String value() default "A44";

    public String message() default "must starts with A44";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
