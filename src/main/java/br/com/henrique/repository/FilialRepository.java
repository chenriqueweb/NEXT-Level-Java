package br.com.henrique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, String> {

}
