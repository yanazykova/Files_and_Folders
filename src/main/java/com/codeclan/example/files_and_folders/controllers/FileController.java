package com.codeclan.example.files_and_folders.controllers;


import com.codeclan.example.files_and_folders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    @Autowired
    FileRepository fileRepository;

    @GetMapping("/files")
    public List<File> getAllFiles(){
        return fileRepository.findAll();
    }
}
