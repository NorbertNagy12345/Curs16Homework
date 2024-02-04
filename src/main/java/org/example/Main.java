package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CountryReader countryReader = new CountryReader(src/main/resources/countries.txt);


        CountryService countryService = countryReader.getCountryService();
        List<Country> allCountries = countryService.listAllCountries();
        List<String> allCountryNames = countryService.listAllCountryNames();


    }
}