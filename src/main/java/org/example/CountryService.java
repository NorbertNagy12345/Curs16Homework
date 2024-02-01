package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
public class CountryService {

    private List<Country> countries;

    public CountryService() {
        this.countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> listAllCountries() {
        return new ArrayList<>(countries);
    }

    public List<String> listAllCountryNames() {
        List<String> countryNames = new ArrayList<>();
        for (Country country : countries) {
            countryNames.add(country.getName());
        }
        return countryNames;
    }
}
