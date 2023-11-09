package org.kata.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import io.swagger.v3.oas.annotations.media.Schema;
import org.kata.dto.enums.GenderType;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Jacksonized
@Schema(description = "DTO according to Individual entity")
public class IndividualDto {
    @Schema(description = "ICP", example = "123-456-7890")
    private String icp;

    @Schema(description = "First name", example = "Steve")
    private String name;

    @Schema(description = "Surname", example = "Jobs")
    private String surname;

    @Schema(description = "Second name", example = "Paul")
    private String patronymic;

    @Schema(description = "Full name", example = "Steven Paul Jobs")
    private String fullName;

    @Schema(description = "Genger", example = "MALE")
    private GenderType gender;

    @Schema(description = "Place of birth", example = "San Francisco")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String placeOfBirth;

    @Schema(description = "Country of birth", example = "USA")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String countryOfBirth;

    @Schema(description = "Date of birth", example = "1955-02-24")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date birthDate;

    @Schema(description = "Identity cards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DocumentDto> documents;

    @Schema(description = "Contacts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ContactMediumDto> contacts;

    @Schema(description = "Addresses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AddressDto> address;

    @Schema(description = "Avatars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AvatarDto> avatar;
}
