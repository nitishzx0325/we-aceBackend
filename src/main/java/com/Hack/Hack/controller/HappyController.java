package com.Hack.Hack.controller;

import com.Hack.Hack.model.Happy;
import com.Hack.Hack.repository.HappyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class HappyController {

    @Autowired
    private HappyRepository happyRepository;

    @GetMapping("/happy")
    public List<Happy> getAllSurvey(){
        return happyRepository.findAll();
    }
    @PostMapping("/happy")
    public Happy createEmployee(@RequestBody Happy happy){
        return happyRepository.save(happy);
    }
}
