package org.example;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Builder
public class Country {
    private static int idCounter = 1;
    @Getter
    private int id;
    private String name;
    private String capital;
    private long population;
    private double area;
    private String continent;
    private List<String> neighbours;

    public Country(String name, String capital, long population, double area, String continent, List<String> neighbours) {
        this.id = idCounter++;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbours = neighbours;
    }


}

