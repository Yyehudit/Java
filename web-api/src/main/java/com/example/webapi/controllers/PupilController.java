package com.example.webapi.controllers;

import com.example.webapi.entities.Pupil;
import com.example.webapi.services.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pupil")
public class PupilController {

    //CRUD: Create Read Update Delete

    //הזרקת תלויות - בקשה מ- spring להביא את המופע הנוכחי
    @Autowired
    PupilService pupilService;

    @GetMapping
    public List<Pupil> getPupils() {
        return pupilService.getPupils();
    }

    @GetMapping("/{id}")
    public Pupil getPupilById(@PathVariable int id) {
        return pupilService.getPupilById(id);
    }

    @GetMapping("/name/{name}")
    public Pupil getPupilByName(@PathVariable String name) {
        return pupilService.getPupilByName(name);
    }

    @PostMapping
    public void addPupil(@RequestBody Pupil pupil) {
        pupilService.addPupil(pupil);
    }

    @DeleteMapping("/{id}")
    public void deletePupil(@PathVariable int id) {
        pupilService.deletePupil(id);
    }

    @PutMapping("/{id}")
    public void updatePupil(@PathVariable int id, @RequestBody Pupil upToDatePupil) {
        pupilService.updatePupil(id, upToDatePupil);
    }


}
