# java-for-web-cap5-area-administrativa

01-28-20 

In�cio

Instala��o do spring security

* Pagina de login
   - P�gina a ser exibida ap�s o login
   - P�ginas a ser exibida depois do logout
 * Instalacao do Spring Security
 * Adapta��o da conexao hibernate para spring
   - Uso de um datasource JNDI

Configura��o de um datasource para o projeto

* crica�ao das depend�ncias no arquivo pom.xml
* Criar o arquivo context.xml
* Alterar o arquivo web.xml
   adicionar uma referencia ao arquivo context.xml
* Alterar o arquivo hibernate.cfg.xml
* Mover a biblioteca MySQL :
   copiar o arquivo mysql-connector-java<vers�o>-bin.jar para a pasta %TOMCAT_HOME%\lib
   obs : no eclipse ap�s fazer essa altera��o deve-se apagar o servidor (tomcat) em uso e adicionar um novo,
   de modo a receber a nova configura��o do jar mysql-connector que est� na sua pasta lib
