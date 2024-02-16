package com.telran.org.coffee.controller;

import com.telran.org.coffee.model.Coffee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// GET, POST, PUT, PACTH, DELETE

//http://localhost:8080 / GET
@RestController
@RequestMapping("/coffee") // //http://localhost:8080/coffee
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        init();
    }
    //    @GetMapping // данный метод обслуживает Get запросы
//    public String printHello(){
//        return "Hello";
//    }

    @GetMapping
    public List<Coffee> getCoffees(){
        return coffeeList;
    }

    //http://localhost:8080/coffee/ ererer-ererer-erere-rerer
    @GetMapping("/{id}")
    public Coffee getCoffeById(@PathVariable String id) {
        for (Coffee coffee : coffeeList) {
            if (coffee.getId().equals(id)) {
                return coffee;
            }
        }
        return null;
    }
    @PostMapping
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        coffeeList.add(coffee);
        return coffee;
    }

    private void init() {
        coffeeList.addAll(List.of(
                new Coffee("Cafe Laremo"),
                new Coffee("Cafe Verdano"),
                new Coffee("Cefe Nor Idra")));
    }
}
