package org.mapstruct.example.kotlin;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonMapperTest {

    @Test
    public void test() {
        var mapper = Mappers.getMapper(PersonMapper.class);
        var person = new PersonJ("Samuel", "Jackson", "0123 334466", LocalDate.of(1948, 12, 21));

        var personDto = mapper.mapToDto(person);
        assertThat(personDto).isNotNull();
        assertThat(personDto.getFirstName()).isEqualTo("Samuel");
        assertThat(personDto.getLastName()).isEqualTo("Jackson");
        assertThat(personDto.getPhone()).isEqualTo("0123 334466");
        assertThat(personDto.getBirthdate()).isEqualTo(LocalDate.of(1948, 12, 21));
        System.out.println(person);
        System.out.println(personDto);
    }
}
