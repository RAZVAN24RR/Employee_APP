package com.yourcompany.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

public class Team {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
   
    @ElementCollection
    private List<Long> members;

    @ElementCollection
    private List<String> projectsAssigned;

    public Team(String name, String department, List<Long> members, List<String> projectsAssigned) {
       this.name = name;
       this.department = department;
       this.members = members;
       this.projectsAssigned = projectsAssigned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setMembers(List<Long> members){
        this.members = members;
    }

    public List<Long> getMembers(){
        return members;
    }

    public List<String> getProjectsAssigned(){
        return projectsAssigned;
    }
    public void setProjectsAssigned(List<String> projectsAssigned){
        this.projectsAssigned = projectsAssigned;
    }

}
