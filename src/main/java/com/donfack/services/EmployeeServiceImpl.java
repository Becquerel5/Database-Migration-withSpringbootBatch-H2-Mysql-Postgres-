package com.donfack.services;

import com.donfack.employee.model.Employee;
import com.donfack.employee.model.Role;
import com.donfack.employee.repository.EmployeeRepository;
import com.donfack.employee.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void addRoleToEmployee(String name, String roleName) {
        Employee employee =employeeRepository.findByName(name);
        Role role =roleRepository.findByRoleName(roleName);
        employee.getRoles().add(role);
    }
}
