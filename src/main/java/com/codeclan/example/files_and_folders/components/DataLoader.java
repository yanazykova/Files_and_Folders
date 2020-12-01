package com.codeclan.example.files_and_folders.components;

import com.codeclan.example.files_and_folders.repositories.FileRepository;
import com.codeclan.example.files_and_folders.repositories.FolderRepository;
import com.codeclan.example.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository pirateRepository;

    @Autowired
    FileRepository shipRepository;

    @Autowired
    FolderRepository raidRepository;


    public DataLoader() {

    }
}

