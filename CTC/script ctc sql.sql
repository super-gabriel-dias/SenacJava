use db_ctc;



CREATE TABLE tb_plano (
                id_plano INTEGER NOT NULL,
                tipo_plano INTEGER NOT NULL,
                horarios VARCHAR(225) NOT NULL,
                validade INT NOT NULL,
                PRIMARY KEY (id_plano)
);


CREATE TABLE tb_cliente (
                id_aluno INT NOT NULL,
                nome VARCHAR(45) NOT NULL,
                cpf VARCHAR(11) NOT NULL,
                endereco VARCHAR(225) NOT NULL,
                telefone1 VARCHAR(11) NOT NULL,
                telefone2 VARCHAR(11),
                email VARCHAR(225) NOT NULL,
                id_plano INT NOT NULL,
                PRIMARY KEY (id_aluno)
);


CREATE TABLE tb_planodetreino (
                id_treino INT NOT NULL,
                id_aluno INT NOT NULL,
                PRIMARY KEY (id_treino)
);


CREATE TABLE tb_funcionarios (
                id_funcionario INT NOT NULL,
                nome VARCHAR(45) NOT NULL,
                cpf VARCHAR(11) NOT NULL,
                endereco VARCHAR(45) NOT NULL,
                telefone VARCHAR(11) NOT NULL,
                cargo VARCHAR(45) NOT NULL,
                id_aluno INT NOT NULL,
                id_treino INT NOT NULL,
                PRIMARY KEY (id_funcionario)
);


CREATE TABLE tb_rh (
                id_admin INT NOT NULL,
                id_plano INT NOT NULL,
                cobranca DATE NOT NULL,
                pagamento_funcionarios DOUBLE PRECISION NOT NULL,
                avaliacao_funcionarios FLOAT(3) NOT NULL,
                id_aluno INT NOT NULL,
                id_funcionario INT NOT NULL,
                PRIMARY KEY (id_admin)
);


ALTER TABLE tb_cliente ADD CONSTRAINT tb_plano_tb_cliente_fk
FOREIGN KEY (id_plano)
REFERENCES tb_plano (id_plano)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE tb_funcionarios ADD CONSTRAINT tb_cliente_tb_funcionarios_fk
FOREIGN KEY (id_aluno)
REFERENCES tb_cliente (id_aluno)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE tb_rh ADD CONSTRAINT tb_cliente_tb_rh_fk
FOREIGN KEY (id_aluno)
REFERENCES tb_cliente (id_aluno)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE tb_planodetreino ADD CONSTRAINT tb_cliente_tb_planodetreino_fk
FOREIGN KEY (id_aluno)
REFERENCES tb_cliente (id_aluno)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE tb_funcionarios ADD CONSTRAINT tb_planodetreino_tb_funcionarios_fk
FOREIGN KEY (id_treino)
REFERENCES tb_planodetreino (id_treino)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE tb_rh ADD CONSTRAINT tb_funcionarios_tb_rh_fk
FOREIGN KEY (id_funcionario)
REFERENCES tb_funcionarios (id_funcionario)
ON DELETE NO ACTION
ON UPDATE NO ACTION;