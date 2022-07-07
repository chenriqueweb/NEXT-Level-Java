package br.com.henrique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.RotaEntrega;

@Repository
public interface RotaEntregaRepository extends JpaRepository<RotaEntrega, Long> {

}
