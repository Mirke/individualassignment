-- DROP TABLE IF EXISTS ADDRESS;
-- DROP TABLE IF EXISTS MEMBER;
--
-- CREATE TABLE MEMBER (
--                         id INT AUTO_INCREMENT PRIMARY KEY ,
--                         firstName VARCHAR(80) NOT NULL ,
--                         lastName VARCHAR(80) NOT NULL ,
--                         email VARCHAR(120),
--                         phone VARCHAR(20) NOT NULL ,
--                         dateOfBirth VARCHAR(120) NOT NULL,
--                         address_id int,
--                         FOREIGN KEY (id) REFERENCES ADDRESS(id)
--
-- );
--
-- CREATE TABLE ADDRESS(
--                         id INT AUTO_INCREMENT PRIMARY KEY,
--                         street VARCHAR(120) NOT NULL,
--                         city VARCHAR(120) NOT NULL
-- );

INSERT INTO ADDRESS (id, street, city) VALUES
                                                 (0, 'Super street', 'Stockholm'),
                                                 (1,'Rocket street','Gothenburg');

INSERT INTO MEMBER (id, firstName, lastName, email, phone, dateOfBirth,address_id) VALUES
                                                                        (0, 'Bob','Petersson','bobpetersson@hotmail.com','070321321','1980-02-02',0),
                                                                        (1, 'Roberto','Vivo','awesomeperson@hotmail.com','0701235438','1992-05-05',1);

