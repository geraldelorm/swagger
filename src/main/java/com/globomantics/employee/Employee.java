package com.globomantics.employee;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "Employee Id - auto generated")
    public Long id;

    @ApiModelProperty(value = "Description about name")
    public String name;

    @ApiModelProperty(value = "Description about title")
    public String title;

    @ApiModelProperty(value = "Description about department", required = true)
    @NotNull
    public String department;

    protected Employee() {
    }

    public Employee(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }
}
