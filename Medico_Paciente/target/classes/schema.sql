DROP TABLE IF EXISTS consulta;
DROP TABLE IF EXISTS paciente;
DROP TABLE IF EXISTS medico;
DROP TABLE IF EXISTS obra_social;
DROP TABLE IF EXISTS medicamento;
DROP TABLE IF EXISTS historial_clinico;

CREATE TABLE obra_social (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nombre VARCHAR(100),
                             creado_en TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE medico (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nombre VARCHAR(100),
                        especialidad VARCHAR(100)
);

CREATE TABLE paciente (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          nombre VARCHAR(100),
                          edad INT,
                          obra_social_id BIGINT,
                          FOREIGN KEY (obra_social_id) REFERENCES obra_social(id)
);

CREATE TABLE medicamento (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nombre VARCHAR(100),
                             descripcion VARCHAR(255),
                             creado_en TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE historial_clinico (
                                   id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                   paciente_id BIGINT,
                                   observaciones VARCHAR(255),
                                   FOREIGN KEY (paciente_id) REFERENCES paciente(id)
);

CREATE TABLE consulta (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          paciente_id BIGINT,
                          medico_id BIGINT,
                          fecha DATE,
                          diagnostico VARCHAR(255),
                          FOREIGN KEY (paciente_id) REFERENCES paciente(id),
                          FOREIGN KEY (medico_id) REFERENCES medico(id)
);
