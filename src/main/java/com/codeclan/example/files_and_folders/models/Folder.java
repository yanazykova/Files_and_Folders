package com.codeclan.example.files_and_folders.models;

import com.codeclan.example.files_and_folders.models.File;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Column(name = "user")
    private String user;

    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;

    public Folder() {
    }

    public Folder(String title, List<File> files) {
        this.title = title;
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
