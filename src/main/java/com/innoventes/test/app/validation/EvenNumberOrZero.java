package com.innoventes.test.app.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = EvenNumberOrZeroValidator.class)
public @interface EvenNumberOrZero {

    String message() default "The number must be even or zero";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
