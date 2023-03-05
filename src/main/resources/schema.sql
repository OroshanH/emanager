CREATE TABLE PRODUKT
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    produktid INTEGER NOT NULL,
    navn VARCHAR(255) NOT NULL,
    beskrivelse VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE INBOUND
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    quantity INTEGER NOT NULL,
    produktid INTEGER NOT NULL,
    purchaseorderid INTEGER AUTO_INCREMENT NOT NULL,
    purchaseorderlineid INTEGER AUTO_INCREMENT NOT NULL,
    PRIMARY KEY (id)
);