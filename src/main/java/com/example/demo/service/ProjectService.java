package com.example.demo.service;

import com.example.demo.domain.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getByOwnerId(Integer owner_id);
    Project getById(Integer id);
    void addProject(Project project);
    void deleteProject(Integer id);
}
