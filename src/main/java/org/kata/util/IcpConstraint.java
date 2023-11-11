package org.kata.util;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//https://www.baeldung.com/spring-mvc-custom-validator

@Documented
@Constraint(validatedBy = IcpValidator.class)
@Target( { ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IcpConstraint {
    String message() default "Invalid icp, use example 123-456-7890";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

