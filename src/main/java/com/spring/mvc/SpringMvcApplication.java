package com.spring.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.mvc.domain.Categoria;
import com.spring.mvc.repositories.CategoriaRepository;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner{

	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		System.out.println(list);
		
		categoriaRepository.saveAll(list);
//		Arrays.asList(cat1, cat2)
	}
}
