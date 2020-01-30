# java-for-web-cap5-area-administrativa

01-28-20 

Início

Instalação do spring security

* Pagina de login
   - Página a ser exibida após o login
   - Páginas a ser exibida depois do logout
 * Instalacao do Spring Security
 * Adaptação da conexao hibernate para spring
   - Uso de um datasource JNDI

Configuração de um datasource para o projeto

* cricaçao das dependências no arquivo pom.xml
* Criar o arquivo context.xml
* Alterar o arquivo web.xml
   adicionar uma referencia ao arquivo context.xml
* Alterar o arquivo hibernate.cfg.xml
* Mover a biblioteca MySQL :
   copiar o arquivo mysql-connector-java<versão>-bin.jar para a pasta %TOMCAT_HOME%\lib
   obs : no eclipse após fazer essa alteração deve-se apagar o servidor (tomcat) em uso e adicionar um novo,
   de modo a receber a nova configuração do jar mysql-connector que está na sua pasta lib
