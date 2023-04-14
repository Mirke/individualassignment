DROP TABLE IF EXISTS MEMBER;
DROP TABLE IF EXISTS ADDRESS;


CREATE TABLE ADDRESS(
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        street VARCHAR(120) NOT NULL,
                        city VARCHAR(120) NOT NULL
);

CREATE TABLE MEMBER (
    id INT AUTO_INCREMENT PRIMARY KEY ,
    firstName VARCHAR(80) NOT NULL ,
    lastName VARCHAR(80) NOT NULL ,
    email VARCHAR(120),
    phone VARCHAR(20) NOT NULL ,
    dateOfBirth VARCHAR(200) NOT NULL,
    address_id int,
    FOREIGN KEY (address_id) REFERENCES ADDRESS(id)
);

