DROP TABLE IF EXISTS MEMBER;
DROP TABLE IF EXISTS ADDRESS;

CREATE TABLE ADDRESS
(
    postalCode INT PRIMARY KEY,
    street     VARCHAR(120) NOT NULL,
    city       VARCHAR(120) NOT NULL
);

CREATE TABLE MEMBER
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    firstName   VARCHAR(80)  NOT NULL,
    lastName    VARCHAR(80)  NOT NULL,
    email       VARCHAR(120) NOT NULL,
    phone       VARCHAR(20),
    dateOfBirth VARCHAR(200) NOT NULL,
    address_id  int          NOT NULL,
    FOREIGN KEY (address_id) REFERENCES ADDRESS (postalCode)
);

