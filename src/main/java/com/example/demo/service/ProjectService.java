package com.example.demo.service;

import com.example.demo.domain.Project;
import com.example.demo.domain.Project_User;

import java.util.List;
import java.util.Map;

public interface ProjectService {
    List<Map> getByOwnerId(Integer owner_id);
    List<Map> getByUserId(Integer user_id);
    Project getById(Integer id);
    Map getMapById(Integer id);
    String getRelation(Project_User project_user);
    Integer addProject(Project project);//返回主键
    void updateProject(Project project);
    void addRelation(Project_User project_user);
    void deleteProject(Integer id);
    List<Map> getMemberByProjectId(Integer project_id);
    void kick(Integer member_id,Integer project_id);
}
