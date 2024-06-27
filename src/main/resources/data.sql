CREATE TABLE IF NOT EXISTS tb_medico (
    med_id INT AUTO_INCREMENT PRIMARY KEY,
    med_nome VARCHAR(255) NOT NULL,
    especialidade VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS tb_paciente (
    pac_cpf VARCHAR(11) NOT NULL PRIMARY KEY,
    pac_nome VARCHAR(100) NOT NULL,
    pac_telefone VARCHAR(15) NOT NULL
);

INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Violeta Ferreira de Pacheco', 'DENTISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Bruno Armando de Barros Neto', 'DENTISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Pedro Davi de Madeira', 'DENTISTA');

INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Hilton Delgado Neto', 'DERMATOLOGISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Andrea Neila Madeira', 'DERMATOLOGISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Monica Batista de Assis', 'DERMATOLOGISTA');

INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Paula Rosilda Corona Gil', 'FISIOTERAPEUTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Andressa Maria de Ortiz', 'FISIOTERAPEUTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Luciano Bonilha Filho', 'FISIOTERAPEUTA');

INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Rebeca Lira Delgado', 'NUTRICIONISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Benjamin Matias Filho', 'NUTRICIONISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Bruno Ramos de Jesus', 'NUTRICIONISTA');

INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Marciane Rosa Camacho de Duarte', 'PSICOLOGISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Rogerio Leon Ribeiro', 'PSICOLOGISTA');
INSERT INTO tb_medico (med_nome, especialidade)
    VALUES ('Leandro Bittencourt Sobrinho', 'PSICOLOGISTA');


INSERT INTO tb_paciente (pac_cpf, pac_nome, pac_telefone)
    VALUES ('23239788888', 'Ivete Fontes de Martines', '(27) 93521-3648');
INSERT INTO tb_paciente (pac_cpf, pac_nome, pac_telefone)
    VALUES ('52248304781', 'Lucas Barros de Gil', '(49) 92286-4845');
INSERT INTO tb_paciente (pac_cpf, pac_nome, pac_telefone)
    VALUES ('66886168312', 'Hernani Roger de Aranda', '(43) 92404-0611');
INSERT INTO tb_paciente (pac_cpf, pac_nome, pac_telefone)
    VALUES ('45474335504', 'Gilmara Marques Pena', '(51) 92112-5415');
INSERT INTO tb_paciente (pac_cpf, pac_nome, pac_telefone)
    VALUES ('56354136840', 'Frederico Gomes Sobrinho', '(55) 92673-3688');