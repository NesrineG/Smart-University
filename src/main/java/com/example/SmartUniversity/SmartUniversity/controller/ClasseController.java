package com.example.SmartUniversity.SmartUniversity.controller;


import com.example.SmartUniversity.SmartUniversity.model.Classe;
import com.example.SmartUniversity.SmartUniversity.service.ClasseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
public class ClasseController {
    private final ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Classe>> getAllClasses(){
        List<Classe> classes = classeService.findAllClasses();
        return new ResponseEntity<>(classes , HttpStatus.OK);
    }

    @GetMapping("/find/{Cid}")
    public ResponseEntity<Classe> getClasseById(@PathVariable("Cid") Integer Cid){
        Classe classe = classeService.findClasseById(Cid);
        return new ResponseEntity<>(classe , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Classe> AddClasse(@RequestBody Classe classe){
        Classe newClasse = classeService.AddClasse(classe);
        return new ResponseEntity<>(newClasse , HttpStatus.CREATED);
    }
}
