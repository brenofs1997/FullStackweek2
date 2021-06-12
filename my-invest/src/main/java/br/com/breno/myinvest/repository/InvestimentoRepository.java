package br.com.breno.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.breno.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento,Long>{

}
