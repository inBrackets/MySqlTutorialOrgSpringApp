/* Create the tables */
CREATE TABLE productlines (
                              productLine varchar(50),
                              textDescription varchar(4000) DEFAULT NULL,
                              htmlDescription mediumtext,
                              image mediumblob,
                              PRIMARY KEY (productLine)
);

CREATE TABLE products (
                          productCode varchar(15),
                          productName varchar(70) NOT NULL,
                          productLine varchar(50) NOT NULL,
                          productScale varchar(10) NOT NULL,
                          productVendor varchar(50) NOT NULL,
                          productDescription text NOT NULL,
                          quantityInStock smallint(6) NOT NULL,
                          buyPrice decimal(10,2) NOT NULL,
                          MSRP decimal(10,2) NOT NULL,
                          PRIMARY KEY (productCode),
                          FOREIGN KEY (productLine) REFERENCES productlines (productLine)
);

CREATE TABLE offices (
                         officeCode varchar(10),
                         city varchar(50) NOT NULL,
                         phone varchar(50) NOT NULL,
                         address_line1 varchar(50) NOT NULL,
                         address_line2 varchar(50) DEFAULT NULL,
                         state varchar(50) DEFAULT NULL,
                         country varchar(50) NOT NULL,
                         postal_code varchar(15) NOT NULL,
                         territory varchar(10) NOT NULL,
                         PRIMARY KEY (officeCode)
);

CREATE TABLE employees (
                           employeeNumber int,
                           lastName varchar(50) NOT NULL,
                           firstName varchar(50) NOT NULL,
                           extension varchar(10) NOT NULL,
                           email varchar(100) NOT NULL,
                           officeCode varchar(10) NOT NULL,
                           reportsTo int DEFAULT NULL,
                           jobTitle varchar(50) NOT NULL,
                           PRIMARY KEY (employeeNumber),
                           FOREIGN KEY (reportsTo) REFERENCES employees (employeeNumber),
                           FOREIGN KEY (officeCode) REFERENCES offices (officeCode)
);

CREATE TABLE customers (
                           customer_number int,
                           customer_name varchar(50) NOT NULL,
                           contact_last_name varchar(50) NOT NULL,
                           contact_first_name varchar(50) NOT NULL,
                           phone varchar(50) NOT NULL,
                           address_line1 varchar(50) NOT NULL,
                           address_line2 varchar(50) DEFAULT NULL,
                           city varchar(50) NOT NULL,
                           state varchar(50) DEFAULT NULL,
                           postal_code varchar(15) DEFAULT NULL,
                           country varchar(50) NOT NULL,
                           sales_rep_employee_number int DEFAULT NULL,
                           credit_limit decimal(10,2) DEFAULT NULL,
                           PRIMARY KEY (customer_number),
                           FOREIGN KEY (sales_rep_employee_number) REFERENCES employees (employeeNumber)
);

CREATE TABLE payments (
                          customer_number int,
                          checkNumber varchar(50) NOT NULL,
                          paymentDate date NOT NULL,
                          amount decimal(10,2) NOT NULL,
                          PRIMARY KEY (customer_number,checkNumber),
                          FOREIGN KEY (customer_number) REFERENCES customers (customer_number)
);

CREATE TABLE orders (
                        orderNumber int,
                        orderDate date NOT NULL,
                        requiredDate date NOT NULL,
                        shippedDate date DEFAULT NULL,
                        status varchar(15) NOT NULL,
                        comments text,
                        customer_number int NOT NULL,
                        PRIMARY KEY (orderNumber),
                        FOREIGN KEY (customer_number) REFERENCES customers (customer_number)
);

CREATE TABLE orderdetails (
                              orderNumber int,
                              productCode varchar(15) NOT NULL,
                              quantityOrdered int NOT NULL,
                              priceEach decimal(10,2) NOT NULL,
                              orderLineNumber smallint(6) NOT NULL,
                              PRIMARY KEY (orderNumber,productCode),
                              FOREIGN KEY (orderNumber) REFERENCES orders (orderNumber),
                              FOREIGN KEY (productCode) REFERENCES products (productCode)
);