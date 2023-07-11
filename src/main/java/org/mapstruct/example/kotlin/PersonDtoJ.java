package org.mapstruct.example.kotlin;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PersonDtoJ{
    String firstName;
    String lastName;
    String phone;
    LocalDate birthdate;
}
