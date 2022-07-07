package br.com.henrique.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.henrique.model.Empresa;
import br.com.henrique.model.Estado;
import br.com.henrique.model.Filial;
import br.com.henrique.model.FilialChavePK;
import br.com.henrique.model.Microzona;
import br.com.henrique.model.Municipio;
import br.com.henrique.service.EmpresaService;
import br.com.henrique.service.EstadoService;
import br.com.henrique.service.FaixasCEPMicrozonaService;
import br.com.henrique.service.FilialService;
import br.com.henrique.service.MicrozonaService;
import br.com.henrique.service.MunicipioService;
import br.com.henrique.service.RotaEntregaService;

@Configuration
public class AutoCargaBanco implements CommandLineRunner {
    
    @Autowired
    private EmpresaService empresaService;
    
    @Autowired
    private EstadoService estadoService;    
    
    @Autowired
    private MunicipioService municipioService;  
    
    @Autowired
    private FilialService filialService;       
    
    @Autowired
    private FaixasCEPMicrozonaService faixasCEPMicrozona;    
 
    @Autowired
    private MicrozonaService microzonaService;    
  
    
    @Autowired
    private RotaEntregaService rotaEntregaService;
    
    @Override
    public void run(String...args) throws Exception { 
        
        // Carga da Tabela: EMPRESA
        Empresa empresa1 = new Empresa(null, "teste-01", "111.456.789/0001-01", "2022-06-25");
        Empresa empresa2 = new Empresa(null, "teste-02", "222.456.789/0001-01", "2022-06-26");
        Empresa empresa3 = new Empresa(null, "teste-03", "333.456.789/0001-01", "2022-06-27");
        Empresa empresa4 = new Empresa(null, "teste-04", "333.456.789/0001-01", "2022-06-27");
       
        empresaService.addEmpresa(empresa1);
        empresaService.addEmpresa(empresa2);
        empresaService.addEmpresa(empresa3);
        empresaService.addEmpresa(empresa4);  

        
        // Carga da Tabela: ESTADO        
        Estado estado1 = new Estado("RJ", "Rio de Janeiro");
        Estado estado2 = new Estado("SP","Sao Paulo");
        Estado estado3 = new Estado("MG","Minas Gerais");
        Estado estado4 = new Estado("ES","Espirito Santo");

        estadoService.addEstado(estado1);       
        estadoService.addEstado(estado2);
        estadoService.addEstado(estado3);       
        estadoService.addEstado(estado4);  
        
        
        // Carga da Tabela: MUNICIPIO
        Estado estadoMunicipioRJ = new Estado("RJ", "Rio de Janeiro");
        Estado estadoMunicipioSP = new Estado("SP", "Sao Paulo");
//      Estado estadoMunicipioMG = new Estado("MG", "Minas Gerais");
//      Estado estadoMunicipioES = new Estado("ES", "Espirito Santo");
        
        Municipio municipio1 = new Municipio(null, "Barra do Pirai", estadoMunicipioRJ);
        Municipio municipio2 = new Municipio(null, "Volta Redonda", estadoMunicipioRJ);
        Municipio municipio3 = new Municipio(null, "São Caetano", estadoMunicipioSP);
        Municipio municipio4 = new Municipio(null, "Jundiai", estadoMunicipioSP);

        municipioService.addMunicipio(municipio1);
        municipioService.addMunicipio(municipio2);
        municipioService.addMunicipio(municipio3);
        municipioService.addMunicipio(municipio4);     
        
        
        // Carga da Tabela: FILIAL
        FilialChavePK filialChavePK = new FilialChavePK();
        filialChavePK.setCodigoEmpresa(1);
        filialChavePK.setCodigoFilial(1);
        Filial filial1 = new Filial(filialChavePK, "Filial-01", "123.456.0001/01", "Barra do Pirai");
        filialService.addFilial(filial1);

        filialChavePK.setCodigoEmpresa(1);
        filialChavePK.setCodigoFilial(2);
        Filial filial2 = new Filial(filialChavePK, "Filial-02", "222.456.0001/01", "Sao Caetano do Sul");
        filialService.addFilial(filial2);
        
        
        // Carga da Tabela: MICROZONA
        Microzona microzona1 = new Microzona(null, "Microzona-01", "A", "N", "S", "N", "S", "N", "S", "N", 1, "RJ", 1);        
        Microzona microzona2 = new Microzona(null, "Microzona-02", "A", "N", "S", "N", "N", "S", "N", "N", 1, "RJ", 1);
        Microzona microzona3 = new Microzona(null, "Microzona-03", "A", "N", "S", "N", "S", "N", "S", "N", 1, "RJ", 1);
        Microzona microzona4 = new Microzona(null, "Microzona-04", "A", "N", "S", "N", "N", "S", "N", "N", 1, "SP", 1);
        Microzona microzona5 = new Microzona(null, "Microzona-05", "A", "N", "S", "N", "S", "N", "S", "N", 1, "SP", 1);        
        
        microzonaService.addMicrozona(microzona1);
        microzonaService.addMicrozona(microzona2);        
        microzonaService.addMicrozona(microzona3);
        microzonaService.addMicrozona(microzona4);
        microzonaService.addMicrozona(microzona5);        
        
        // Carga da Tabela: ROTA DE ENTREGA
//        RotaEntrega rotaEntrega1 = new RotaEntrega("RJ", null, "Rota-01", "X", 1, 1, "12");
//        RotaEntrega rotaEntrega2 = new RotaEntrega("RJ", null, "Rota-02", "X", 1, 1, "12");
//        RotaEntrega rotaEntrega3 = new RotaEntrega("MG", null, "Rota-03", "X", 1, 1, "12");
//        RotaEntrega rotaEntrega4 = new RotaEntrega("SP", null, "Rota-04", "X", 1, 1, "12");
//        RotaEntrega rotaEntrega5 = new RotaEntrega("SP", null, "Rota-05", "X", 1, 1, "12");        
//        
//        rotaEntregaService.addRotaEntrega(rotaEntrega1);
//        rotaEntregaService.addRotaEntrega(rotaEntrega2);
//        rotaEntregaService.addRotaEntrega(rotaEntrega3);
//        rotaEntregaService.addRotaEntrega(rotaEntrega4);
//        rotaEntregaService.addRotaEntrega(rotaEntrega5);        
        
        
        
        
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
