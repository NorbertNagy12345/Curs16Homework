package org.example;

import lombok.Data;
import lombok.Getter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
@Getter
@Data
public class CountryReader {

    private CountryService countryService;

    public CountryReader(String filePath) {
        this.countryService = new CountryService();
        readCountriesFromFile(filePath);
    }

    private void readCountriesFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] countryData = line.split("\\|");

                String name = countryData[0];
                String capital = countryData[1];
                long population = Long.parseLong(countryData[2]);
                double area = Double.parseDouble(countryData[3]);
                String continent = countryData[4];
                List<String> neighbours = List.of(countryData[5].split("~"));

                countryService.addCountry(new Country(name, capital, population, area, continent, neighbours));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
