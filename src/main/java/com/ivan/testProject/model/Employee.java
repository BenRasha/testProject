package com.ivan.testProject.model;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private Long categoryId;

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    public Long getId() {
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

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }
}
