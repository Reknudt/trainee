CREATE TABLE IF NOT EXISTS `files` (

    `id` SERIAL8 NOT NULL,
    `data` BYTEA NOT NULL,
    `name` VARCHAR NOT NULL,
    `type` VARCHAR NOT NULL,
    constraint file_pk PRIMARY KEY (id)

) DEFAULT CHARSET=UTF8;