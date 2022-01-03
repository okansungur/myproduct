DROP SCHEMA IF EXISTS shopping cascade;
DROP TABLE IF EXISTS  product cascade;
DROP TABLE IF EXISTS  manufacturer cascade;
DROP SEQUENCE IF EXISTS  product_sequence cascade;
DROP SEQUENCE IF EXISTS  manufacturer_sequence cascade;

create schema shopping;

CREATE SEQUENCE product_sequence INCREMENT 1 START 1;



CREATE TABLE shopping.product (
  productid INTEGER DEFAULT nextval('product_sequence'::regclass) NOT NULL,
  name VARCHAR(100),
  cost DOUBLE PRECISION,
  stock int,
  manufacturerid int,
  CONSTRAINT product_pkey PRIMARY KEY(productid)
) 
WITH (oids = false);


INSERT INTO   shopping.product( name,  cost,stock,manufacturerid) VALUES ('testitem',1,10,1);
INSERT INTO   shopping.product( name,  cost,stock,manufacturerid) VALUES ('poster',200,20,2);
INSERT INTO   shopping.product( name,  cost,stock,manufacturerid) VALUES ('Giftcard',300,30,3);
INSERT INTO   shopping.product( name,  cost,stock,manufacturerid) VALUES ('Notebook',150,30,3);
INSERT INTO   shopping.product( name,  cost,stock,manufacturerid) VALUES ('rubber',10,20,2);
INSERT INTO   shopping.product( name,  cost,stock,manufacturerid) VALUES ('pencil',100,40,1);
