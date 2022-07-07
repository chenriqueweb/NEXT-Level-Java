package br.com.henrique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.Filial;
import br.com.henrique.model.FilialChavePK;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {

    // void save(FilialChavePK filialChavePK, Filial filial);

}
