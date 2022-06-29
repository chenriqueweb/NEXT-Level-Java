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

import br.com.henrique.model.Empresa;
import br.com.henrique.service.EmpresaService;

@RestController
@RequestMapping(path = "/empresa")
public class EmpresaController {
    
    @Autowired
    private EmpresaService service;

    // Lista Empresa
    @GetMapping
    public List<Empresa> findAll() {
        List<Empresa> empresa = service.findAll();
        return empresa;
    }
    
    // Busca por Empresa
    @GetMapping(path = "{codigo}")
    public Empresa findById(@PathVariable Long codigo) {
        Empresa empresa = service.findById(codigo);
        return empresa;
    }
    
    // Inclui Empresa
    @PostMapping
    public void addEmpresa(@RequestBody Empresa empresa) {
        service.addEmpresa(empresa);
    }

    // Altera Empresa
    @PutMapping(path = "{codigo}")
    public void updateEmpresa(@PathVariable Long codigo, @RequestBody Empresa empresa) {
        service.updateEmpresa(codigo, empresa);
    }
    
    // Deleta Empresa
    @DeleteMapping(path = "{codigo}")
    public void deletaEmpresa(@PathVariable Long codigo) {
        service.deletaEmpresa(codigo);
    }
}