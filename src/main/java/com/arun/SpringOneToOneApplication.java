package com.arun;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arun.entity.Laptop;
import com.arun.entity.Student;
import com.arun.repository.LaptopRepository;
import com.arun.repository.StudentRepository;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringOneToOneApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringOneToOneApplication.class, args);
		
//		Student s1=new Student();
//		s1.setStudentId(505);
//		s1.setStudentName("Arun");
//		
//		Laptop l1=new Laptop();
//		l1.setLaptopId(1000);
//		l1.setLaptopName("Hp Pavilion");
//		l1.setStudent(s1);
//		s1.setLaptop(l1);
		
		
         StudentRepository studentrepository=context.getBean(StudentRepository.class);
//		studentrepository.save(s1);
		
//		Student student=studentrepository.findById(505).get();
//		System.out.println(student);
        
        Student std=studentrepository.findById(505).get();
        System.out.println(std.getStudentName());
        
        Laptop lap=std.getLaptop();
        System.out.println(lap.getLaptopName());
        
        Student std1=lap.getStudent();
        System.out.println(std1.getStudentId());
        

        
		
	
		
		
		
		
		
		
		

		
		
	}

}
