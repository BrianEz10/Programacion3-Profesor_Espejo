INSERT INTO OBRA_SOCIAL (id, nombre) VALUES (1, 'OSDE');
INSERT INTO OBRA_SOCIAL (id, nombre) VALUES (2, 'Swiss Medical');

INSERT INTO MEDICAMENTO (id, nombre, descripcion) VALUES (1, 'Paracetamol', 'Analgesico y antipiretico');
INSERT INTO MEDICAMENTO (id, nombre, descripcion) VALUES (2, 'Amoxicilina', 'Antibiotico');
INSERT INTO MEDICAMENTO (id, nombre, descripcion) VALUES (3, 'Ibuprofeno', 'Antiinflamatorio');

INSERT INTO PACIENTE (id, nombre, edad, obra_social_id) VALUES (1, 'Marta Gómez', 32, 1);
INSERT INTO PACIENTE (id, nombre, edad, obra_social_id) VALUES (2, 'Pedro Martínez', 28, 2);
INSERT INTO PACIENTE (id, nombre, edad, obra_social_id) VALUES (3, 'Celeste López', 45, 1);

INSERT INTO HISTORIAL_CLINICO (id, paciente_id) VALUES (1, 1);
INSERT INTO HISTORIAL_CLINICO (id, paciente_id) VALUES (2, 3);

INSERT INTO MEDICO (id, nombre, especialidad) VALUES (1, 'Dr. Perez', 'Clinico');
INSERT INTO MEDICO (id, nombre, especialidad) VALUES (2, 'Dra. Díaz', 'Pediatria');

INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id) VALUES (1, '2024-10-01', 'Resfriado ', 1, 1);
INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id) VALUES (2, '2024-10-05', 'Dolor estomacal', 2, 1);
INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id) VALUES (3, '2024-09-20', 'Control hipertension', 3, 1);
INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id) VALUES (4, '2024-10-10', 'Escalofrios constantes', 1, 2);

--INSERT INTO PACIENTE_MEDICAMENTO (paciente_id, medicamento_id) VALUES (1, 1);
--INSERT INTO PACIENTE_MEDICAMENTO (paciente_id, medicamento_id) VALUES (1, 3);
--INSERT INTO PACIENTE_MEDICAMENTO (paciente_id, medicamento_id) VALUES (2, 2);