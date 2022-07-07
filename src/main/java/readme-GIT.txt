1 - Criar modelo - @Entity
2 - Criar repositorio [interface] - @Repository - extends JpaRepository<T, ID>

3 - Criar Servico - @Service - Metodos de servico HTTP
4 - Criar Controle - @RestController - Com seus mapeamentos da URI e seus Métodos chamando os Métodos de Serviço

---------------------------------------
# Listar
- Empresa - ok
- Estado - ok
- Municipio - ok
- Filial - ok
- Microzona - okk
  - Rota de Entrega 
  - Faixa de CEPs Microzona

---------------------------------------
# Consultar
- Empresa - ok
- Estado - ok
- Municipio - ok
- Filial - ((( nao esta considerando Empresa )))
- Microzona - ok

---------------------------------------
# Inclusão
- Empresa - ok
- Estado - ok
- Municipio - ok
- Filial - ok
- Microzona - ok

---------------------------------------
# Alteração
- Empresa - ok
- Estado - ok
- Municipio - ok
- Filial - ((( nao esta considerando Empresa )))
- Microzona - ok

---------------------------------------
# Exclusão
- Empresa - ok
- Estado - ok
- Municipio - ok
- Filial - ((( nao esta considerando Empresa )))
- Microzona - ok