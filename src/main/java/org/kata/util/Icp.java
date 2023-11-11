package org.kata.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Icp {

    @IcpConstraint
    private String icp;

    @Override
    public String toString() {
        return icp;
    }
}
