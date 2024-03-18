package com.innoventes.test.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenNumberOrZeroValidator implements ConstraintValidator<EvenNumberOrZero, Number> {

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext context) {
        return value.longValue() % 2 == 0;
    }
}
