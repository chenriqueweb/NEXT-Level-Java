package br.com.henrique.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.Filial;
import br.com.henrique.model.FilialPK;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Integer> {

    Optional<Filial> findById(FilialPK filialChavePK);

    void deleteById(FilialPK filialChavePK);

    // void save(FilialChavePK filialChavePK, Filial filial);

}
