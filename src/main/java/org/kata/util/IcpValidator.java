package org.kata.util;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IcpValidator implements
        ConstraintValidator<IcpConstraint, String> {

    @Override
    public void initialize(IcpConstraint icp) {
    }

    @Override
    public boolean isValid(String icp,
                           ConstraintValidatorContext cxt) {
        return icp != null && icp.matches("(^[0-9]{3}-[0-9]{3}-[0-9]{4})");

    }

}