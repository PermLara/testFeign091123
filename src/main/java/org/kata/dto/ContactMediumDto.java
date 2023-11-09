package org.kata.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.kata.dto.enums.ContactMediumType;

@Data
@Builder
@Jacksonized
public class ContactMediumDto {
    private String icp;

    private ContactMediumType type;

    private String value;
}
