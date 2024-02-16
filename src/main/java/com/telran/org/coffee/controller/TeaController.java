package com.telran.org.coffee.controller;

import com.telran.org.coffee.model.Tea;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tea")   // //http://localhost:8080/tea
public class TeaController {

    private List<Tea> teaList = new ArrayList<>();

    public TeaController() {
        init();
    }

    @GetMapping
    public Iterable<Tea> getTeas(){
        return teaList;
    }

    @GetMapping ("/{id}") // //http://localhost:8080/tea/ .........uuid......
    public Tea getTeaById(@PathVariable String id){
        for (Tea tea : teaList){
            if(tea.getId().equals(id)){
                return tea;
            }
        }
        return null;
    }

    @PostMapping
    public Tea addTea(@RequestBody Tea tea){
        teaList.add(tea);
        return tea;
    }

    public void init() {
        teaList.addAll(List.of(
                new Tea("Monday"),
                new Tea("Thursday"),
                new Tea("Wednesday")));
    }
}
