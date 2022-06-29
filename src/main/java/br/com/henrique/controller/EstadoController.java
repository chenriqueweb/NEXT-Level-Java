package br.com.henrique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.henrique.model.Estado;
import br.com.henrique.service.EstadoService;

@RestController
@RequestMapping(path = "/estado")
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;
    
    // Lista Estado
    @GetMapping
    public List<Estado> findAll() {
        List<Estado> estados = estadoService.findAll();
        return estados;
    }
    
    // Busca pelo Estado
    @GetMapping(path = "{sigla}")
    public Estado findById(@PathVariable String sigla) {
        Estado estado = estadoService.findById(sigla);
        return estado;
    }
    
    // Inclui Estado
    @PostMapping
    public void addEstado(@RequestBody Estado estado) {
        estadoService.addEstado(estado);
    }
    
    // Altera Estado
    @PutMapping(path = "{sigla}")
    public void updateEstado(@PathVariable String sigla, @RequestBody Estado estado ) {
        estadoService.updateEstado(sigla, estado);
    }

    // Exclui Estado
    @DeleteMapping(path = "{sigla}")
    public void deletaEstado(@PathVariable String sigla) {
        estadoService.deletaEstado(sigla);
    }
}
