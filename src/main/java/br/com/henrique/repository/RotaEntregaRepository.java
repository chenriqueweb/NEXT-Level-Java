package br.com.henrique.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.RotaEntrega;

@Repository
public interface RotaEntregaRepository extends JpaRepository<RotaEntrega, String> {

    // Optional<RotaEntrega> findById(String siglaEstado, Integer codigo);

}
