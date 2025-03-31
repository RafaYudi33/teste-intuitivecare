use teste_intuitive_care;

-- Mostra o diretório permitido para LOAD DATA INFILE
SELECT @@secure_file_priv; 

-- Tabela com os dados cadastrais das operadoras de planos de saúde
CREATE TABLE operadoras_ativas (
    registro_ans VARCHAR(10) PRIMARY KEY,
    cnpj VARCHAR(20) NULL,
    razao_social VARCHAR(255) NULL,
    nome_fantasia VARCHAR(255) NULL,
    modalidade VARCHAR(100) NULL,
    logradouro VARCHAR(255) NULL,
    numero VARCHAR(20) NULL,
    complemento VARCHAR(100) NULL,
    bairro VARCHAR(100) NULL,
    cidade VARCHAR(100) NULL,
    uf CHAR(2) NULL,
    cep VARCHAR(10) NULL,
    ddd VARCHAR(5) NULL,
    telefone VARCHAR(20) NULL,
    fax VARCHAR(20) NULL,
    endereco_eletronico VARCHAR(255) NULL,
    representante VARCHAR(100) NULL,
    cargo_representante VARCHAR(100) NULL,
    regiao_de_comercializacao INT NULL,
    data_registro_ans DATE NULL
);

-- Tabela com as demonstrações contábeis por operadora
CREATE TABLE demonstracoes_contabeis (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_ DATE,
    reg_ans VARCHAR(10) NULL,
    cd_conta_contabil VARCHAR(20) NULL,
    descricao TEXT,
    vl_saldo_inicial DECIMAL(15, 2),
    vl_saldo_final DECIMAL(15, 2)
);

-- Importa CSV com operadoras, tratando valor vazio na coluna numérica
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Relatorio_cadop.csv'
INTO TABLE operadoras_ativas
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(registro_ans, cnpj, razao_social, nome_fantasia, modalidade,
 logradouro, numero, complemento, bairro, cidade, uf, cep,
 ddd, telefone, fax, endereco_eletronico, representante, cargo_representante,
 @regiao, data_registro_ans)
SET regiao_de_comercializacao = NULLIF(@regiao, '');



-- Importação com normalização dos saldos (vírgula → ponto)
-- e parse de datas quando necessário
-- OBS: Substituir o caminho conforme necessário

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/1T2023.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_,reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/2t2023.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_,reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/3T2023.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_, reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/4T2023.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(@data_str, reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    data_ = STR_TO_DATE(@data_str, '%d/%m/%Y'),
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/1T2024.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_ ,reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');
    
    
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/2T2024.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_, reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');
    
    
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/3T2024.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_,reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/4T2024.csv'
INTO TABLE demonstracoes_contabeis
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(data_ , reg_ans, cd_conta_contabil, descricao, @vl_saldo_inicial_raw, @vl_saldo_final_raw)
SET
    vl_saldo_inicial = REPLACE(@vl_saldo_inicial_raw, ',', '.'),
    vl_saldo_final = REPLACE(@vl_saldo_final_raw, ',', '.');

-- -----------------------------------------------------------------------------------------

-- Último trimestre
SELECT
    dc.reg_ans,
    oa.razao_social,
    SUM(dc.vl_saldo_final) AS total_despesa
FROM demonstracoes_contabeis dc
JOIN operadoras_ativas oa ON dc.reg_ans = oa.registro_ans
WHERE dc.descricao LIKE '%EVENTOS/ SINISTROS CONHECIDOS OU AVISADOS  DE ASSISTÊNCIA A SAÚDE MEDICO HOSPITALAR%'
  AND dc.data_ >= DATE_SUB(CURDATE(), INTERVAL 3 MONTH)
GROUP BY dc.reg_ans, oa.razao_social
ORDER BY total_despesa DESC
LIMIT 10
;

-- Último ano
SELECT
    dc.reg_ans,
    oa.razao_social,
    SUM(dc.vl_saldo_final) AS total_despesa
FROM demonstracoes_contabeis dc
JOIN operadoras_ativas oa ON dc.reg_ans = oa.registro_ans
WHERE dc.descricao LIKE '%EVENTOS/ SINISTROS CONHECIDOS OU AVISADOS  DE ASSISTÊNCIA A SAÚDE MEDICO HOSPITALAR%'
  AND dc.data_ >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)
GROUP BY dc.reg_ans, oa.razao_social
ORDER BY total_despesa DESC
LIMIT 10
;