package com.donfack.employee.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    //@Column(name = "employee_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int salary;
    private String password;
    private Date date;
    private  String nullfiledE1;
    private String nameroom;


    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles;
}
