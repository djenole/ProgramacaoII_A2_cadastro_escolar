# ProgramacaoII_A2_cadastro_escolar
Grupo 4: Djenole, Juliana, Roberto


1) Crie uma classe para representar o objeto do negócio (do mundo real) Aluno, que
deverá ter os atributos Id, Nome, e-mail, CPF, Data de Nascimento, Naturalidade e
Endereço.
2) Crie uma classe para se conectar ao banco de dados local de sua máquina, utilizando
o padrão de projetos Factory (crie toda a estrutura de banco de dados necessária para
suportar o sistema).
3) Crie uma classe no padrão Data Access Object (DAO) para suportar as regras de
negócio a serem implementadas para o sistema de cadastro escolar.
4) Crie um método para inserir os dados do Aluno no banco de dados (dentro do DAO)
e uma classe para fazer os testes utilizando a classe Scanner para o usuário entrar com
os dados de forma interativa.
5) Crie um método (dentro do DAO) para listar as informações inseridas no item 4),
bem como as classes para realizar os devidos testes.
6) Crie um método (dentro do DAO) para listar as informações inseridas no item 4),
mas agora filtradas pela letra de início do nome, bem como as classes para realizar os
devidos testes.
7) Crie um método para alterar os dados de um determinado Aluno (DICA: utilize o id
para selecionar o Aluno) no seu DAO e uma ou mais classes para fazer esse teste (pode
escolher qualquer forma para realizar esse teste).
1
8) Crie um método para remover um determinado Aluno (DICA: utilize o id para
selecionar o Aluno) no seu DAO e uma ou mais classes para fazer esse teste (pode
escolher qualquer forma para realizar esse teste).
9) Com a finalidade de aumentar o desacoplamento, crie interface(s) para separar a
definição (especificação) da implementação das funcionalidades do sistema.
10) Ao invés de utilizar DAO, utilize Hibernate/JPA para desenvolver a camada de
persistência de seu sistema.
