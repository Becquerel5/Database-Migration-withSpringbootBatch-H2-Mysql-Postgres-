package com.donfack.employee.repository;

import com.donfack.employee.model.Role;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRoleName(String roleName);
}
