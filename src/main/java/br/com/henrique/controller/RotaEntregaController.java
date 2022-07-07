package br.com.henrique.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.henrique.model.RotaEntrega;
import br.com.henrique.service.RotaEntregaService;

@RestController
@RequestMapping(path = "/rotaEntrega")
public class RotaEntregaController {
    
    @Autowired
    private RotaEntregaService rotaEntregaService;

    // Lista RotaEntrega
    @GetMapping
    public ResponseEntity<List<RotaEntrega>> findAll() {
        List<RotaEntrega> rotaEntregas = rotaEntregaService.findAll();
        return ResponseEntity.ok().body(rotaEntregas);
    }
    
    // Busca por RotaEntrega
    @GetMapping(path = "{codigo}")
    public ResponseEntity<RotaEntrega> findById(@PathVariable Long codigo) {
        RotaEntrega rotaEntrega = rotaEntregaService.findById(codigo);
        return ResponseEntity.ok().body(rotaEntrega);
    }
    
    // Inclui RotaEntrega
    @PostMapping
    public ResponseEntity<Void> addRotaEntrega(@RequestBody RotaEntrega rotaEntrega) {
        RotaEntrega rotaEntregaNova = rotaEntregaService.addRotaEntrega(rotaEntrega);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{codigo}").buildAndExpand(rotaEntregaNova.getCodigo()).toUri();
        return ResponseEntity.created(uri).build();
    }

    // Altera RotaEntrega
    @PutMapping(path = "{codigo}")
    public ResponseEntity<Void> updateRotaEntrega(@PathVariable Long codigo, @RequestBody RotaEntrega rotaEntrega) {
        rotaEntregaService.updateRotaEntrega(codigo, rotaEntrega);
        return ResponseEntity.noContent().build();
    }
    
    // Exclusão RotaEntrega
    @DeleteMapping(path = "{codigo}")
    public ResponseEntity<Void> deletaRotaEntrega(@PathVariable Long codigo) {
        rotaEntregaService.deletaRotaEntrega(codigo);
        return ResponseEntity.noContent().build();
    }
    
    //-----------------------------------------------------------------------------------------------------
    // Exclui rotaEntrega e chama Lista de RotaEntregas
    // method Post (página)
    @PostMapping(path = "/remover/{codigo}")
    public ModelAndView deletaRotaEntregaWeb(@PathVariable Long codigo) {
        rotaEntregaService.deletaRotaEntrega(codigo);
        
        List<RotaEntrega> rotaEntregas = rotaEntregaService.findAll();
        
        ModelAndView modelAndView = new ModelAndView("RotaEntregaListar");
        modelAndView.addObject("rotaEntregas", rotaEntregas);
        
        return modelAndView;
    }         
    
    // Altera rotaEntrega
    // method Post (página)
    @GetMapping(path = "/editar/{codigo}")
    public ModelAndView editarRotaEntregaWeb(@PathVariable Long codigo) {
        ModelAndView modelAndView = new ModelAndView("RotaEntregaFormulario");
        
        RotaEntrega rotaEntrega = rotaEntregaService.findById(codigo);
        
        modelAndView.addObject("rotaEntrega", rotaEntrega);
        
        return modelAndView;
    }
}