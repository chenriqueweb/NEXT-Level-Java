package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.Empresa;
import br.com.henrique.repository.EmpresaRepository;

@Service
public class EmpresaService {
    // @PersistenceContext
    
    @Autowired
    private EmpresaRepository repositEmpresa;

    // Lista Empresas
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas = repositEmpresa.findAll();
        
        return empresas;
    }

    // Busca pela Empresa
    public Empresa findById(Long codigo) {
        Empresa empresa = repositEmpresa.findById(codigo).orElse(null);
        return empresa;
    }

    // Inclui Empresa
    public void addEmpresa(Empresa empresa) {
        repositEmpresa.save(empresa);
    }

    // Atualiza uma Empresa
    public void updateEmpresa(Long codigo, Empresa empresa) {
        Empresa empresaAtualizado = this.findById(codigo);
        
        if (empresaAtualizado == null) {
            throw new RuntimeException("Empresa nao encontrada !");
        }
        empresaAtualizado.setRazaoSocial(empresa.getRazaoSocial());
        empresaAtualizado.setRaizCNPJ(empresa.getRaizCNPJ());
        empresaAtualizado.setDataAbertura(empresa.getDataAbertura());
        
        repositEmpresa.save(empresaAtualizado);
    }

    // Exclusão de Empresa
    public void deletaEmpresa(Long codigo) {
        Empresa empresaExclusao = this.findById(codigo);
        
        if(empresaExclusao == null) {
            throw new RuntimeException("Empresa nao encontrada !");
        }
        repositEmpresa.deleteById(codigo);
    }
    
}
