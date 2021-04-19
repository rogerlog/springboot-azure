# Deploy de uma aplicação Spring Boot na Azure



- CosmosDB com a API MongoDB na Plataforma Azure
- API REST Reativa utilizando Spring Boot e Spring Webflux
- Deploy da aplicação Spring Boot na Plataforma Azure
- Microservices com Spring Boot e Spring Cloud, principais componentes de uma arquitetura.

#### Projeto

- Spring Web Flux

- Cosmos DB da plataforma Azure

- https://portal.azure.com

- Criar conta do Azure Cosmos DB

  - Criar Grupo de Recursos. azure-springboot
  - API do Azure Cosmos DB para MongoDB

- Cadeia de Conexão 

- Utiliza o servidor Netty no IntelliJ

- Login na plataforma Azure

  ```shell
  az login
  ```

- Para a conta Free da Azure colocar no `pom.xml`

```xml
 <pricingTier>P1v2</pricingTier>  
          <region>centralus</region>
 <pricingTier>F1</pricingTier>
```

- Maven pacotes

  ```shell
   mvn clean package
  ```

- Configuração

  ```shell
  mvn azure-webapp:config
  ```

- Deploy

  ```shell
  mvn azure-webapp:deploy
  ```

- Endereço

  https://springboot-1618609221337.azurewebsites.net/