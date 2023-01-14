package com.donfack.employee.repository;

import com.donfack.employee.model.Employee;

import java.sql.Date;
import java.util.List;


import org.hibernate.annotations.Formula;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    Employee findByName(String name);



    List<Employee> findAllRoom();

    @Query("SELECT e.id as employeeId, e.name,e.password,e.salary,r.name,r.number from Employee e inner join RoomM r on  e.id  = r.employeeid  order by e.id")
    List<Object> getEmpByRoom();
}
