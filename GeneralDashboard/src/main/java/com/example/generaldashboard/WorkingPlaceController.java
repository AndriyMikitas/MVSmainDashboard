package com.example.generaldashboard;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")
public class WorkingPlaceController {

    @Autowired
    private WorkingPlaceRepository workingPlaceRepository;


    @GetMapping("/workingplaces")
    public List<WorkingPlace> getAllWorkingPlaces(){
        return workingPlaceRepository.findAll();
    }


}