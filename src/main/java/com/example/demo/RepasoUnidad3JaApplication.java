package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;



@SpringBootApplication
public class RepasoUnidad3JaApplication implements CommandLineRunner {
	@Autowired
	IEstudianteService iEstudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoUnidad3JaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

//		Estudiante estu = new Estudiante();
//		estu.setNombre("Jhonatan");
//		estu.setApellido("Altamirano");
//		estu.setCedula("1727501510");
//		estu.setCiudad("Quito");
//		estu.setPais("Ecuador");
//		estu.setSalario(new BigDecimal(400));
//		estu.setHobby("Dibujar");
//		estu.setFechaNacimiento(LocalDateTime.of(2000, 03, 16, 13, 50));
//		this.iEstudianteService.crear(estu);
//	
//		Estudiante estu1 = new Estudiante();
//		estu1.setNombre("Grace");
//		estu1.setApellido("Analuiza");
//		estu1.setCedula("1727501511");
//		estu1.setCiudad("Quito");
//		estu1.setPais("Ecuador");
//		estu1.setSalario(new BigDecimal(485));
//		estu1.setHobby("Dibujar");
//		estu1.setFechaNacimiento(LocalDateTime.of(1997, 03, 16, 13, 50));
//		this.iEstudianteService.crear(estu1);
//		
//		Estudiante estu2 = new Estudiante();
//		estu2.setNombre("Lenin");
//		estu2.setApellido("Caroa");
//		estu2.setCedula("1727501513");
//		estu2.setCiudad("Quito");
//		estu2.setPais("Ecuador");
//		estu2.setSalario(new BigDecimal(600));
//		estu2.setHobby("Dibujar");
//		estu2.setFechaNacimiento(LocalDateTime.of(2005, 03, 16, 13, 50));
//		this.iEstudianteService.crear(estu2);
		
//		Estudiante estu3 = new Estudiante();
//		estu3.setNombre("Carlos");
//		estu3.setApellido("Ortiz");
//		estu3.setCedula("1727501514");
//		estu3.setCiudad("Quito");
//		estu3.setPais("Ecuador");
//		estu3.setGenero("M");
//		estu3.setSalario(new BigDecimal(800));
//		estu3.setHobby("Correr");
//		estu3.setFechaNacimiento(LocalDateTime.of(2009, 03, 16, 13, 50));
//		this.iEstudianteService.crear(estu3);
//		
//		Estudiante estu4 = new Estudiante();
//		estu4.setNombre("Dayana");
//		estu4.setApellido("Poluchi");
//		estu4.setCedula("1727501516");
//		estu4.setCiudad("Quito");
//		estu4.setPais("Ecuador");
//		estu4.setGenero("F");
//		estu4.setSalario(new BigDecimal(800));
//		estu4.setHobby("Dormir");
//		estu4.setFechaNacimiento(LocalDateTime.of(2005, 03, 16, 13, 50));
//		this.iEstudianteService.crear(estu4);
		
		
		
		
		
		System.out.println(this.iEstudianteService.buscarPorNombreQuery("Caroa"));
		System.out.println("TypedQuery");
		System.out.println(this.iEstudianteService.buscarPorNombreTypedQuery("Grace"));		
		System.out.println("NamedQuery");
		System.out.println(this.iEstudianteService.buscarPorCedulaNamedQuery("1727501510"));
		System.out.println("combinado");
		System.out.println(this.iEstudianteService.buscarPorNombreNamedQueryTyped("Lenin"));
		System.out.println("NativeQuery");
		System.out.println(this.iEstudianteService.buscarPorNombreNativeQuery("Lenin"));
		System.out.println("Combinado Native Typed Named");
		System.out.println(this.iEstudianteService.buscarPorNombreNativeQueryTypedNamed("Lenin"));		
		System.out.println("DTO");
		System.out.println(this.iEstudianteService.buscarPorNombreTypedQueryDTO("Lenin"));	
		System.out.println("QueryTypedCriteria");
		System.out.println(this.iEstudianteService.buscarPorNombreQueryTypedCriteria("Lenin"));	
		
		System.out.println("QueryTypedCriteria");
		System.out.println(this.iEstudianteService.buscarPorNombreCriteriaAndOr("Carlos","Caroa","F"));	
		
	}

}
