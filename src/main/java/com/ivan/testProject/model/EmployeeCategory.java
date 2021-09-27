package com.ivan.testProject.model;

import javax.persistence.*;

@Entity
@Table
public class EmployeeCategory {
    @Id
    @Column
    private Long id;
    @Column
    private String name;

    public EmployeeCategory() {}

    public EmployeeCategory(String name) {
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
}
