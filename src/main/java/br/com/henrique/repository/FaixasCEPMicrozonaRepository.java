package br.com.henrique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.FaixasCEPMicrozona;

@Repository
public interface FaixasCEPMicrozonaRepository  extends JpaRepository<FaixasCEPMicrozona, Long> {

}
