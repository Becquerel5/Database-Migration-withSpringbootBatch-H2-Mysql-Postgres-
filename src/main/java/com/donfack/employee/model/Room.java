package com.donfack.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int number;

    //@JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = true)
    @ManyToOne
    private Employee employeeid;

}
