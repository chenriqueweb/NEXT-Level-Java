package br.com.henrique.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.model.RotaEntrega;
import br.com.henrique.model.RotaEntregaPK;

@Repository
public interface RotaEntregaRepository extends JpaRepository<RotaEntrega, Integer> {

    Optional<RotaEntrega> findById(RotaEntregaPK rotaEntregaPK);

    void deleteById(RotaEntregaPK rotaEntregaPK);

    // Optional<RotaEntrega> findById(String siglaEstado, Integer codigo);

}
