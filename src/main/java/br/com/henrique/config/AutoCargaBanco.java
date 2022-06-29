package br.com.henrique.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.henrique.model.Empresa;
import br.com.henrique.model.Estado;
import br.com.henrique.service.EmpresaService;
import br.com.henrique.service.EstadoService;

@Configuration
public class AutoCargaBanco implements CommandLineRunner {
    
    @Autowired
    private EmpresaService empresaService;
    private EstadoService estadoService;
    
    @Override
    public void run(String...args) throws Exception {
        // Carga da Tabela: EMPRESA
        Empresa empresa1 = new Empresa(null, "teste-01", "111.456.789/0001-01", "2022-06-25");
        Empresa empresa2 = new Empresa(null, "teste-02", "222.456.789/0001-01", "2022-06-26");
        Empresa empresa3 = new Empresa(null, "teste-03", "333.456.789/0001-01", "2022-06-27");
       
        empresaService.addEmpresa(empresa1);
        empresaService.addEmpresa(empresa2);
        empresaService.addEmpresa(empresa3);
        
        
        // Carga da Tabela: ESTADO
        Estado estado1 = new Estado("RJ","Rio de Janeiro");
        Estado estado2 = new Estado("SP","S�o Paulo");
        Estado estado3 = new Estado("MG","Minas Gerais");
        Estado estado4 = new Estado("ES","Esp�rito Santo");

//        estadoService.addEstado(estado1);
//        estadoService.addEstado(estado2);
//        estadoService.addEstado(estado3);
//        estadoService.addEstado(estado4);
        
        
//      @GetMapping("/empresa")
//      public List<Empresa> listar() {
//          var empresa1 = new Empresa();
//          empresa1.setCodigo(1L);
//          empresa1.setRazaoSocial("Empresa 1");
//          empresa1.setRaizCNPJ("111.456.0001/01");
//          empresa1.setDataAbertura("2002-06-27");
//          
//          var empresa2 = new Empresa();
//          empresa1.setCodigo(2L);
//          empresa1.setRazaoSocial("Empresa 2");
//          empresa1.setRaizCNPJ("222.456.0001/01");
//          empresa1.setDataAbertura("2002-06-24");
//          
//          return Arrays.asList(empresa1, empresa2);
//      }
        
        
    }
    
}
