package com.example.store.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/message")
public class HomeController {

    List<String> name= Arrays.asList("utkarsh","rohit");

    @GetMapping
    public List<String> getList(){
        return name;
    }

}
