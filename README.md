
<h1 align="center" style="font-weight: bold;">Teste intuitivecare</h1>

<br>
<p align="center">
 <a href="#teste1e2">Teste 1 e 2</a> 🧩 •
 <a href="#teste3">Teste 3</a> 📊 •
 <a href="#teste4">Teste 4</a> 🌐
</p>

<br>

<h2 id="teste1e2">🧩 Teste 1 e 2</h2>

```plaintext
Teste Intuitivecare - Estrutura do Projeto
.
├── src
│   └── main
│       └── java
│           └── org.rafs
│               ├── compressor
│               │   ├── Compressor.java          // Interface para compressão de arquivos.
│               │   └── ZipCompressor.java       // Implementação da compressão em formato ZIP.
│               ├── config
│               │   └── Configurations.java      // Enumeração para centralizar configurações de paths e URLs.
│               ├── csv
│               │   ├── CsvSaver.java            // Interface para salvar dados em CSV.
│               │   └── SimpleCsvSaver.java      // Implementação concreta para salvar em CSV.
│               ├── extractor
│               │   ├── PdfDataExtractor.java    // Interface para extração de dados de PDFs.
│               │   └── TabulaPdfDataExtractor.java // Implementação usando Tabula para extrair dados de tabelas de PDF.
│               ├── manager
│               │   ├── DataExtractorManager.java // Gerencia a extração de dados de diferentes fontes.
│               │   └── WebScrapingManager.java  // Gerencia as operações de raspagem de dados da web.
│               └── scrapper
│                   ├── JsoupWebScraper.java     // Implementação de raspagem de dados usando Jsoup.
│                   └── WebScraper.java          // Interface para técnicas de raspagem de dados.
└── Main.java                                   // Classe principal que inicia o processo de extração e salvamento de dados.
```

### Tecnologias Utilizadas
- **Java**: Linguagem principal do projeto.
- **Jsoup**: Utilizado no pacote `scrapper` para realizar a raspagem de dados da web.
- **Tabula PDF**: Usado no `TabulaPdfDataExtractor` para extrair tabelas de documentos PDF.

### Princípio de Inversão de Dependência
O projeto aplica o princípio de inversão de dependência através do uso de interfaces (`Compressor`, `CsvSaver`, `PdfDataExtractor`, `WebScraper`), permitindo que detalhes de implementação específicos sejam facilmente modificáveis sem afetar outros componentes do sistema.

### Localização dos Arquivos
Os arquivos são salvos no diretório especificado nas configurações do `Configurations.java`, com todos os arquivos resultantes sendo armazenados em `downloads` na raiz do projeto java.

Este formato facilita a visualização da estrutura hierárquica do projeto e a localização dos componentes principais, sendo útil para compreensão rápida do layout e responsabilidades de cada parte do código.

<h2 id="teste3">📊 Teste 3</h2>

O Teste 3 é focado na manipulação e consulta de bancos de dados, utilizando scripts SQL compatíveis com MySQL 8.0 e PostgreSQL >10.0. As tarefas envolvem a preparação e o processamento de dados financeiros e cadastrais de operadoras de saúde.

### Localização dos Arquivos

Todos os scripts SQL utilizados para o Teste 3, bem como a documentação correspondente, estão localizados na pasta **Teste 3**. Esta pasta contém todas as informações e arquivos necessários para executar as tarefas especificadas.

<h2 id="teste4">🌐 Teste 4 </h2>

### Visão Geral 

O Teste 4 consiste no desenvolvimento de uma interface web e uma API para realização de buscas textuais em cadastros de operadoras. O backend foi desenvolvido utilizando Java com Spring e a biblioteca OpenCSV, seguindo os princípios de arquitetura limpa. O frontend foi construído com Vue.js e utiliza Axios para fazer requisições à API, além de Bootstrap para o design responsivo da interface.

## Estrutura do Projeto

### Backend

#### Tecnologias:
- **Java com Spring**: Framework utilizado para o desenvolvimento da API.
- **OpenCSV**: Biblioteca usada para o carregamento e manipulação de dados CSV.
- **Clean Architecture**: Utilizada para manter o código organizado e modular.
- **AWS Elastic Beanstalk**: Serviço usado para o deploy do backend.

#### Estrutura de diretórios:
```
org.rafs.intuitivecareback
├── config
├── domain.model
│   └── Operator
├── gateway
│   └── OperatorGateway
├── infra
│   ├── controller
│   │   └── OperatorController
│   ├── gateway
│   │   └── csv
│   │       ├── CsvLoader
│   │       ├── OpenCsvLoaderImpl
│   │       └── OperatorCsvGatewayImpl
│   ├── mapper
│   │   └── OperatorMapper
│   └── persistence.csv
│       └── OperatorCsv
└── usecase
    └── FindOperatorUseCase

```
- **URL Base**: `http://Intuitive-back.us-east-1.elasticbeanstalk.com`
- **Coleção do Postman**: Disponível na pasta Teste 4.

### Frontend

#### Tecnologias:
- **Vue.js**: Framework utilizado para a construção da interface web.
- **Axios**: Utilizado para fazer requisições HTTP ao servidor backend.
- **Bootstrap**: Utilizado para estilizar e tornar a interface responsiva.

#### Deploy:
- **AWS S3**: A interface estática foi hospedada no AWS S3.
- **URL**: `http://teste-intuitivecare.s3-website-us-east-1.amazonaws.com/`

