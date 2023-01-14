package com.donfack.employee.repository;

import com.donfack.employee.model.Employee;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.hibernate.annotations.Formula;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//@Repository
@Mapper
public interface EmployeeRepository /*extends JpaRepository<Employee,Long>*/ {

    Employee findByName(String name);


    @Query("SELECT " +
            "e.id, " +
            "e.name, " +
            "e.salary, " +
            "e.password, " +
            "r.name, " +
            "r.number " +
            "FROM Employee e " +
            "left join Room r on e.id=r.employeeid.id ")
    List<Employee> getEmployeeRoom();


    @Select("SELECT " +
            "e.id, " +
            "e.name, " +
            "e.salary, " +
            "e.password, " +
            "r.name, " +
            "r.number " +
            "FROM Employee e " +
            "left join Room r on e.id=r.employeeid.id ")
    @Results(value = {
            @Result(column = "id", property = "id", javaType = Long.class, id = true, jdbcType = JdbcType.BIGINT),
            @Result(column = "name", property = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(column = "salary", property = "salary", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(column = "name", property = "nameroom", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(column = "number", property = "number", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    List<Employee> findAllRoom();

  /*  @Query("SELECT e.id as employeeId, e.name,e.password,e.salary,r.name,r.number from Employee e inner join RoomM r on  e.id  = r.employeeid  order by e.id")
    List<Object> getEmpByRoom();*/
}
