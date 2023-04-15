INSERT INTO ADDRESS (postalCode, street, city)
VALUES (12345, 'Wind Street', 'Stockholm'),
       (98765, 'Earth Street', 'Malmö'),
       (77777, 'Ice Street', 'Luleå'),
       (33333, 'Fire Street', 'Umeå'),
       (67898, 'Water Street', 'Gothenburg');

INSERT INTO MEMBER (firstName, lastName, email, phone, dateOfBirth, address_id)
VALUES ('Claire', 'Redfield', 'Claire@umbrellacorp.org', '0784598753', '1979-02-02', 12345),
       ('Chris', 'Redfield', 'Chris@umbrellacorp.org', '0789843216', '1973-03-03', 12345),
       ('Rebecca', 'Chambers', 'Rebecca@umbrellacorp.org', '0789875463', '1980-04-04', 98765);

INSERT INTO MEMBER (firstName, lastName, email, dateOfBirth, address_id)
VALUES ('Albert', 'Wesker', 'Albert@umbrellacorp.org', '1960-05-05', 77777),
       ('Ada', 'Wong', 'Ada@umbrellacorp.org', '1974-06-06', 67898);