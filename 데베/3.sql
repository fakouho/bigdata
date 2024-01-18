create database mun;

CREATE TABLE t_ordert_ordert_cus (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(255),
    customer_address VARCHAR(255)
);
CREATE TABLE t_order (
    order_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    quantity INT,
    price INT,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES t_cus(customer_id)
);

