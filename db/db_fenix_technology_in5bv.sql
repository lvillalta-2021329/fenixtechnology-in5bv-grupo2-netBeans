DROP DATABASE IF EXISTS db_fenix_technology_in5bv;
CREATE DATABASE db_fenix_technology_in5bv;
USE db_fenix_technology_in5bv;

CREATE TABLE IF NOT EXISTS personas (
	id_persona INT AUTO_INCREMENT,
    nombre1 VARCHAR(15),
    nombre2 VARCHAR(15),
    nombre3 VARCHAR(15),
    apellido1 VARCHAR(15),
    apellido2 Varchar(15),
    email VARCHAR(45),
    telefono VARCHAR(8),
    direccion VARCHAR(45),
    PRIMARY KEY (id_persona)
);

INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Edy", "Leonel", "Joel", "Letona", "Argueta", "eletona-2018439@gmail.com", "51674893", "4A av. 11-29 Zona 7 Colonia Landívar");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Kevin", "Alexander", "Hugo", "López", "Sánchez", "kevinlopez205@gmail.com", "87542631", "6A av. 6-59 Zona 8 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Carlos", "Javier", "Daniel", "Ramos", "Martínez", "cramos-2018526@gmail.com", "64251237", "8A av. 8-35 Zona 3 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Marta", "María", "Julia", "Caroline", "Estelle", "martajulia123@gmail.com", "52013684", "5A av. 5-69 Zona 12 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Jorge", "José", "Martín", "García", "Calamaco", "jorgemartin301@gmail.com", "64597821", "2A av. 2-10 Zona 2 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Claudia", "Lucía", "Paula", "Rebecca", "Catherine", "claudiarebecca405@gmail.com", "21643587", "4 calle. 6-22 Zona 10 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Diego", "Leo", "Pablo", "Rrodríguez", "Castro", "dpablo-2021365@gmail.com", "20316584", "7A av. 7-12 Zona 1 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Arles", "Hernández", "Mateo", "López", "López", "arlesmateo6000@gmail.com", "32015468", "9A av. 9-31 Zona 4 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Alex", "Daniel", "Lucas", "Quevedo", "Pérez", "alexquevedo502@gmail.com", "98547615", "12A av. 12-32 Zona 5 Ciudad de Guatemala");
INSERT INTO personas(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion)
VALUES("Andrea", "Allison", "Valeria", "Quiñones", "Jiménez", "avaleria-2022874@gmail.com", "21346857", "2 calle. 2-52 Zona 11 Ciudad de Guatemala");
SELECT * FROM personas;

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS tipo_productos (
	id_tipo_producto INT AUTO_INCREMENT,
    categoria VARCHAR(45),
    PRIMARY KEY (id_tipo_producto)
);

INSERT INTO tipo_productos(categoria) 
VALUES ("Computadoras");
INSERT INTO tipo_productos(categoria) 
VALUES ("Celular");
INSERT INTO tipo_productos(categoria) 
VALUES ("Audífonos");

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS proveedores (
	id_proveedor INT auto_increment,
    nombre_proveedor VARCHAR(45),
    telefono VARCHAR(8),
    direccion VARCHAR(100),
    PRIMARY KEY (id_proveedor)
);

INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Samsung", "67867567", "34a. Calle A 34-54, Colonia Flores");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Xiaomi", "41907626", "40a. Calle A 31-58 Colonia El Amparo 2, Zona 7 Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Huawei", "93825468", "20a. Calle A 20-01, Zona 6, Residenciales Cipresales Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Hp", "24578952", "3A avenida 3-15, Zona 6, Cdad. de Guatemla");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("DELL", "35201478", "12A avenida 12-54, Zona 4, Cdad. de Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Apple", "65748521", "7a. Ave. 14-00, Zona 9, Cdad. de Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("LG", "23698547", "10A avenida 10-32, Zona 3, Cdad. de Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("ASUS", "58974210", "6a. Ave. 14-43, Zona 1, Concordia, Gómez Carrillo, Cdad. de Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Motorola", "36987458", "6a. Ave. 10-46, Zona 1, Cdad. de Guatemala");
INSERT INTO proveedores(nombre_proveedor, telefono, direccion)
VALUES ("Lenovo", "98547825", "10a. Calle 00-25, Zona 14 Ave. Las Américas, Cdad. de Guatemala");

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS ofertas (
	id_oferta INT AUTO_INCREMENT,
    descuento DECIMAL(5,3),
    PRIMARY KEY (id_oferta)
);

INSERT INTO ofertas(descuento) 
VALUES(0.00);
INSERT INTO ofertas(descuento) 
VALUES(0.10);
INSERT INTO ofertas(descuento) 
VALUES(0.20);
INSERT INTO ofertas(descuento) 
VALUES(0.30);
INSERT INTO ofertas(descuento) 
VALUES(0.40);
INSERT INTO ofertas(descuento) 
VALUES(0.50);
INSERT INTO ofertas(descuento) 
VALUES(0.60);
INSERT INTO ofertas(descuento) 
VALUES(0.70);
INSERT INTO ofertas(descuento) 
VALUES(0.80);
INSERT INTO ofertas(descuento) 
VALUES(0.90);
INSERT INTO ofertas(descuento) 
VALUES(1.00);

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS productos (
	id_producto INT AUTO_INCREMENT,
    nombre_producto VARCHAR(30),
    descripcion VARCHAR(126),
    precio_unitario DECIMAL(5,2),
    stock INT,
    id_tipo_producto INT,
    id_proveedor INT,
    id_oferta INT,
    PRIMARY KEY (id_producto),
    CONSTRAINT fk_productos_tipo_productos
	FOREIGN KEY (id_tipo_producto)
	REFERENCES tipo_productos(id_tipo_producto)
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_productos_proveedores
	FOREIGN KEY (id_proveedor)
	REFERENCES proveedores(id_proveedor)
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_productos_ofertas
	FOREIGN KEY (id_oferta)
	REFERENCES ofertas(id_oferta)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("Samsung S20", "Octa Core 2.73GHz,2.5GHz,2GHz, 64GB, RAM: 4 GB", 4.10, 30, 2, 1, 6);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("Xiaomi redmi note 9", "MediaTek Helio G85 Octa-core, 128GB, RAM: 4 GB.", 5.10, 100, 2, 2, 4);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("Samsung A51", "Exynos 9611, 1080 x 2248 (Full HD+), RAM: 4 GB.", 3.10, 99, 2, 1, 2);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("DELL Optiplex 780", "Intel Core 2 Duo E8400 3.0 Ghz y 4 GB DDR3 SDRAM, disco duro de 250 GB.", 5.10, 100, 1, 5, 4);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("AirPods Pro", "Audio espacial con seguimiento dinámico del movimiento de la cabeza.", 5.10, 101, 3, 6, 5);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("DELL Optiplex 3040", "Intel i5-6500 3,2 GHz, memoria RAM de 8 GB, disco duro de 1 TB, Windows 10 Pro.", 5.10, 70, 1, 5, 3);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("Iphone 8 plus", "Procesador A11 Bionic, Touch ID, cámara dual de 12 MP, con zoom óptico 2X, 256 GB.", 4.10, 50, 2, 6, 2);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("Lenovo S500", "Intel Core i7, hasta 16 GB 1600 MHz-2 DIMM Slots y con almacenamiento de 500 GB 3.5.", 5.10, 101, 1, 10, 3);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("ASUS ET2323", "Intel Core i7-5500U, NVIDIA Geforce GT840M y ram de 8 GB DDR3L 1600 Mhz.", 5.10, 60, 1, 8, 4);
INSERT INTO productos(nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta) 
VALUES("Huawei FreeBuds", "Kirin A1, con Sensor óseo y un alto de 26 mm, inalámbricos.", 2.10, 99, 3, 3, 7);

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS detalle_ventas (
	id_detalle_venta INT AUTO_INCREMENT,
    cantidad INT,
    subtotal DECIMAL(5,2),
    id_producto INT,
    PRIMARY KEY (id_detalle_venta),
    CONSTRAINT fk_detalle_ventas_productos
	FOREIGN KEY (id_producto)
	REFERENCES productos(id_producto)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(5, 4.15, 1);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(12, 5.12, 2);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(10, 3.10, 3);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(2, 4.18, 4);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(4, 5.20, 5);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(6, 3.11, 6);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(2, 4.17, 7);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(3, 5.13, 8);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(9, 3.14, 9);
INSERT INTO detalle_ventas(cantidad, subtotal, id_producto) 
VALUES(12, 5.19, 10);


---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS clientes (
	id_cliente INT AUTO_INCREMENT,
    persona_id INT,
    nit VARCHAR(10),
    PRIMARY KEY (id_cliente),
    CONSTRAINT fk_clientes_personas
	FOREIGN KEY (persona_id)
	REFERENCES personas(id_persona)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO clientes(persona_id, nit) 
VALUES(1, "1234567893");
INSERT INTO clientes(persona_id, nit) 
VALUES(2, "5412578420");
INSERT INTO clientes(persona_id, nit) 
VALUES(3, "2365401257");
INSERT INTO clientes(persona_id, nit) 
VALUES(4, "3524789547");
INSERT INTO clientes(persona_id, nit) 
VALUES(5, "4578412503");
INSERT INTO clientes(persona_id, nit) 
VALUES(6, "8974567120");
INSERT INTO clientes(persona_id, nit) 
VALUES(7, "9857462310");
INSERT INTO clientes(persona_id, nit) 
VALUES(8, "7458143214");
INSERT INTO clientes(persona_id, nit) 
VALUES(9, "2103657894");
INSERT INTO clientes(persona_id, nit) 
VALUES(10, "2457016398");

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS facturas (
	no_factura INT AUTO_INCREMENT,
    serie VARCHAR(25),
    fecha DATE,
    nombre VARCHAR(50),
    direccion VARCHAR(50),
    nit VARCHAR(10),
    id_detalle_venta INT,
    id_cliente INT,
    PRIMARY KEY (no_factura),
    CONSTRAINT fk_facturas_detalle_ventas
	FOREIGN KEY (id_detalle_venta)
	REFERENCES detalle_ventas(id_detalle_venta)
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_facturas_clientes
	FOREIGN KEY (id_cliente)
	REFERENCES clientes(id_cliente)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("A1HS5D9E6O", "2022-01-12", "Samsung Exynos", "Ipodrono del norte Zona 2", "2401578954", 1, 1);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("P1E3D5K8PL", "2022-02-18", "Xiaomi 1440 x 3200 pixels", "Calzada el Salvador", "2014678954", 2, 2);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("2GHT978HTB", "2022-03-02", "Samsung Snapdragon 8 Gen", "Miraflores Roosvelt Zona 11", "8745123658", 3, 3);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("J5D20MB5G2", "2022-04-13", "DELL Optiplex 780 Core 2", "9 Avenida 7-60, Cdad. de Guatemala 10011", "2014387595", 4, 4);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("S04D1453E8", "2022-05-11", "AirPods", "6A Avenida 8-28, Cdad. de Guatemala 01009", "3014527895", 5, 5);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("JG1R2U3S80", "2022-06-05", "DELL Slim 3040 Core i5", "2da ave 11-09 zona 9, Plaza 2-11", "4521036987", 6, 6);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("C4S2E51T10", "2022-07-15", "Iphone 8 plus", "5ta. Calle Zona 9", "2784365987", 7, 7);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("SD074DG512", "2022-08-10", "Lenovo Desktop Core i5", "6A. Avenida 11-29 zona 1", "5210378946", 8, 8);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("KF014S53E0", "2022-09-17", "ASUS Intel Dual Core", "Plaza 00213 Zona 4", "6985471203", 9, 9);
INSERT INTO facturas(serie, fecha, nombre, direccion, nit, id_detalle_venta, id_cliente) 
VALUES("AA20D2EGT0", "2022-10-22", "Huawei FreeBuds", "Walmart Roosvelt Zona 11", "9574512012", 10, 10);

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS empleados (
	id_empleado INT,
    persona_id INT,
    PRIMARY KEY (id_empleado),
    CONSTRAINT fk_empleados_clientes
	FOREIGN KEY (persona_id)
	REFERENCES clientes(persona_id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO empleados(id_empleado, persona_id) 
VALUES(10, 1);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(15, 2);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(20, 3);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(12, 4);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(22, 5);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(05, 6);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(30, 7);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(55, 8);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(16, 9);
INSERT INTO empleados(id_empleado, persona_id) 
VALUES(09, 10);

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS roles (
	id_rol  INT AUTO_INCREMENT,
    descripcion_rol VARCHAR(45),
    PRIMARY KEY (id_rol)
);

INSERT INTO roles(descripcion_rol) 
VALUES("Administrador");
INSERT INTO roles(descripcion_rol) 
VALUES("Empleado");
INSERT INTO roles(descripcion_rol) 
VALUES("Cliente");

---------------------------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS usuarios (
	user VARCHAR(30),
    password VARCHAR(30),
    id_empleado INT,
    id_rol INT,
    PRIMARY KEY (user),
    CONSTRAINT fk_usuarios_empleados
	FOREIGN KEY (id_empleado)
	REFERENCES empleados(id_empleado)
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_usuarios_roles
	FOREIGN KEY (id_rol)
	REFERENCES roles(id_rol)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO usuarios(user, password, id_empleado, id_rol) 
VALUES("kinal", "1234", 10, 1);
INSERT INTO usuarios(user, password, id_empleado, id_rol) 
VALUES("Edy", "galex", 15, 2);
INSERT INTO usuarios(user, password, id_empleado, id_rol) 
VALUES("rol", "adminn", 20, 3);