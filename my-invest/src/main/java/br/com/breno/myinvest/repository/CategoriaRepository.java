package br.com.breno.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.breno.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	

}
