# ACE (Análise e Consulta de Eventos)

Esse Commit é separado do restante para emergências:

* Versão Java: 23
* Sistema Operacional: Linux - Windows
* Bibliotecas Adicionais: RS componentes;
* Banco de dados (SGDB): PostGreSQL
* IDE: NetBeans

## Como importar a biblioteca

![][https://youtu.be/u0rKzvETito]

OBS: Sem ela o código não funciona

### Nesse mesmo esquema, integre o PostGre e faça um usuário com essas configurações

## Conexão pelo PostgreSQL
* User: acicUSER (Opcional, só alterar no código)
* Senha: 123 (Opcional, só alterar no código)
* Database: acicDATA (Opcional, só alterar no código)
* Tabela acic_table (Opcional, só alterar no código)
    * OBS: **AS COLUNAS DEVEM SER OBRIGATORIAMENTE ASSIM**
    * Colunas: id(PK), service(VARCHAR(60)), descri(VARCHAR(300)), data(Date)
