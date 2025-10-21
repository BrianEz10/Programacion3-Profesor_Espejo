INSERT INTO OBRA_SOCIAL (id, nombre, creado_en) VALUES (1, 'OSDE', NOW());
INSERT INTO OBRA_SOCIAL (id, nombre, creado_en) VALUES (2, 'Swiss Medical', NOW());

INSERT INTO MEDICAMENTO (id, nombre, descripcion, creado_en) VALUES (1, 'Paracetamol', 'Analgesico y antipiretico', NOW());
INSERT INTO MEDICAMENTO (id, nombre, descripcion, creado_en) VALUES (2, 'Amoxicilina', 'Antibiotico', NOW());
INSERT INTO MEDICAMENTO (id, nombre, descripcion, creado_en) VALUES (3, 'Ibuprofeno', 'Antiinflamatorio', NOW());

INSERT INTO PACIENTE (id, nombre, edad, obra_social_id, creado_en) VALUES (1, 'Marta Gómez', 32, 1, NOW());
INSERT INTO PACIENTE (id, nombre, edad, obra_social_id, creado_en) VALUES (2, 'Pedro Martínez', 28, 2, NOW());
INSERT INTO PACIENTE (id, nombre, edad, obra_social_id, creado_en) VALUES (3, 'Celeste López', 45, 1, NOW());

INSERT INTO HISTORIAL_CLINICO (id, paciente_id, descripcion, creado_en) VALUES (1, 1, 'Historial: Asma controlada. Alergia a penicilina.', NOW());
INSERT INTO HISTORIAL_CLINICO (id, paciente_id, descripcion, creado_en) VALUES (2, 3, 'Historial: Hipertension arterial. Cirugia en 2015.', NOW());

INSERT INTO MEDICO (id, nombre, especialidad, creado_en) VALUES (1, 'Dr. Perez', 'Clinico', NOW());
INSERT INTO MEDICO (id, nombre, especialidad, creado_en) VALUES (2, 'Dra. Díaz', 'Pediatria', NOW());

INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id, creado_en) VALUES (1, '2024-10-01', 'Resfriado ', 1, 1, NOW());
INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id, creado_en) VALUES (2, '2024-10-05', 'Dolor estomacal', 2, 1, NOW());
INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id, creado_en) VALUES (3, '2024-09-20', 'Control hipertension', 3, 1, NOW());
INSERT INTO CONSULTA (id, fecha, diagnostico, paciente_id, medico_id, creado_en) VALUES (4, '2024-10-10', 'Escalofrios constantes', 1, 2, NOW());

INSERT INTO PACIENTE_MEDICAMENTO (paciente_id, medicamento_id) VALUES (1, 1);
INSERT INTO PACIENTE_MEDICAMENTO (paciente_id, medicamento_id) VALUES (1, 3);
INSERT INTO PACIENTE_MEDICAMENTO (paciente_id, medicamento_id) VALUES (2, 2);
