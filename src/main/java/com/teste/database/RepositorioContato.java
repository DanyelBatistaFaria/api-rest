package com.teste.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato, Long> {

}
