package com.travellab;

import com.travellab.model.Country;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode(exclude = "id")
@ToString
@Getter
@Setter
public class CountryDto {
    private Long id;

    private String name;

    private String description;

    private String kitchen;

    private String geography;

    private String climate;

    private String imagePath;

    public static CountryDto from(Country country) {
        return new CountryDto(country.getId(), country.getName(), country.getDescription(),
                country.getKitchen(), country.getGeography(), country.getClimate(), country.getImagePath());
    }
}
