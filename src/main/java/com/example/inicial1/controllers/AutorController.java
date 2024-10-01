package com.example.inicial1.controllers;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.services.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

    @Autowired
    private AutorServiceImpl autorService;
}
