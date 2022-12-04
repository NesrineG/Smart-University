package com.example.SmartUniversity.SmartUniversity.service;

import com.example.SmartUniversity.SmartUniversity.Exception.UserNotFoundException;
import com.example.SmartUniversity.SmartUniversity.model.Classe;
import com.example.SmartUniversity.SmartUniversity.repo.ClasseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {

    private final ClasseRepo classeRepo;

    public ClasseService(ClasseRepo classeRepo) {
        this.classeRepo = classeRepo;
    }

    //Add a Classe
    public Classe AddClasse(Classe classe){
        return classeRepo.save(classe);
    }

    //Find a Classe
    public List<Classe> findAllClasses(){
        return classeRepo.findAll();
    }

    //Find a classe ById
    public Classe findClasseById(Integer Cid){
        return classeRepo.findById(Cid).orElseThrow(() -> new UserNotFoundException("Classe by id" + Cid + "was not found"));
    }

}
