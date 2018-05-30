package com.spring.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
