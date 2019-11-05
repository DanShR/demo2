package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    /*private final CountryRepo countryRepo;

    @Autowired
    public DemoController(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }*/

    @GetMapping
    public String demo() {
        /*Country country = new Country();
        country.setName("RU");
        countryRepo.save(country);
        List<Country> countryList = countryRepo.findAll();*/
        return "hello from demo 2";
    }

}
