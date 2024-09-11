package com.yourcompany.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String department;
    private String position;
    private LocalDate date_of_birth;
    private Integer teamNr;
    private String favoriteTechnologies;

    public Employee() {} 
    
    public Employee(String name, String email, String department, String position, LocalDate date_of_birth, Integer teamNr, String favoriteTechnologies) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.date_of_birth = date_of_birth;
        this.position = position;
        this.teamNr = teamNr;
        this.favoriteTechnologies = favoriteTechnologies;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setDateOfBirth(LocalDate date_of_birth){
        this.date_of_birth = date_of_birth;
    }

    public LocalDate getDateOfBirth(){
        return date_of_birth;
    }

    public Integer getTeamNr(){
        return this.teamNr;
    } 

    public void setTeamNr(Integer teamNr){
        this.teamNr = teamNr;
    }

    public void setFavoriteTechnologies(String favoriteTechnologies){
        this.favoriteTechnologies = favoriteTechnologies;
    }

    public String getFavoriteTechnologies(){
        return favoriteTechnologies;
    }
}


