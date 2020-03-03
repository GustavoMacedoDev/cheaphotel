/* Lógico_1: */

CREATE TABLE hotel (
    id_hotel INTEGER PRIMARY KEY NOT NULL,
    nome CHAR  NOT NULL,
    cnpj CHAR  NOT NULL,
    telefone CHAR  NOT NULL,
    email CHAR  NOT NULL,
    horario_checkin CHAR  NOT NULL,
    horario_checkout CHAR  NOT NULL
);

CREATE TABLE usuario (
    id_usuario INTEGER PRIMARY KEY  NOT NULL,
    login CHAR  NOT NULL,
    senha CHAR  NOT NULL
);