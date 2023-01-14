package com.donfack;

import com.donfack.employee.model.Employee;
import com.donfack.employee.model.Room;
import com.donfack.employee.repository.EmployeeRepository;
import com.donfack.employee.repository.RoleRepository;
import com.donfack.employee.repository.RoomRepository;
import com.donfack.services.EmployeeService;
import com.donfack.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class DonfackApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DonfackApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public void run(String... args) throws Exception {


		/*Employee id= employeeRepository.findById(4L).get();
		System.err.println(id);

		Room room = new Room();
		room.setName("room1");
		room.setNumber(1);
		room.setEmployeeid(id);
		roomRepository.save(room);*/


       /* Role role = new Role();
        role.setRoleName("admin");

		Role role1 = new Role();
		role1.setRoleName("manager");

		Role role2 = new Role();
		role2.setRoleName("user");*/



        /*roleRepository.save(role);
		roleRepository.save(role1);
		roleRepository.save(role2);*/


		/*Employee employee =new Employee();
		String pw = employee.getPassword();
		employee.setName("user1");
		employee.setSalary(543453453);
		employee.setPassword("employee.getPassword()passwordEncoder.encode(pw)");
		employee.setDate(Date.from(Instant.now()));
        employee.setRoles(new ArrayList<>());
		employeeRepository.save(employee);


		Employee employee1 =new Employee();
		employee1.setName("user2");
		employee1.setSalary(543453453);
		employee1.setPassword("FBFBDFBDF");
		employee1.setDate(Date.from(Instant.now()));
        employee1.setRoles(new ArrayList<>());
		employeeRepository.save(employee1);

		Employee employee3 =new Employee();
		employee3.setName("admin");
		employee3.setSalary(543453453);
		employee3.setPassword("FBFBDFBDF");
		employee3.setDate(Date.from(Instant.now()));
		employee3.setRoles(new ArrayList<>());
		employeeRepository.save(employee3);*/



		/*employeeService.addRoleToEmployee("user1","user");
		employeeService.addRoleToEmployee("user1","admin");
		employeeService.addRoleToEmployee("admin","admin");
		employeeService.addRoleToEmployee("user2","manager");
		employeeService.addRoleToEmployee("user2","manager");*/




		/*User1 user = new User1();
		user.setNumber("5154");
		user.setPassword("LDDDD");
		user.setUsername("DTFB");
		user.setDate(Date.from(Instant.now()));
		userRepository.save(user);

		User1 user1 = new User1();
		user1.setNumber("58653120");
		user1.setPassword("dcsdvsdv");
		user1.setUsername("sdvsdvsddv");
		user1.setDate(Date.from(Instant.now()));
		userRepository.save(user1);*/
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return  new BCryptPasswordEncoder();
	}


}
