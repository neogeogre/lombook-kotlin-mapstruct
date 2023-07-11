package org.mapstruct.example.kotlin;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.time.LocalDate;

@Value
@Builder
@With
public class PersonJ {
    String firstName;
    String lastName;
    String phoneNumber;
    LocalDate birthdate;
}
