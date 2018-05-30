package com.spring.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
