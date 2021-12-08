DROP TABLE EMPLEADO cascade constraints;
DROP TABLE OPERARIO_WEB cascade constraints;
DROP TABLE OPERARIO_PRODUCCION cascade constraints;
DROP TABLE REPARTIDOR cascade constraints;
DROP TABLE CLIENTE cascade constraints;
DROP TABLE PEDIDO cascade constraints;
DROP TABLE DETALLE_PEDIDOS cascade constraints;
DROP TABLE PRODUCTO cascade constraints;
DROP TABLE MATERIAL cascade constraints;
DROP TABLE COMPOSICIONES cascade constraints;












---Se import� los datos
CREATE TABLE CLIENTE(

    ID_CLIENTE NUMBER PRIMARY KEY NOT NULL,
    NOMBRES VARCHAR2(40) NOT NULL,
    APELIIDOS VARCHAR2(40) NOT NULL,
    DIRECCION_VIVVIENDA VARCHAR2(40) NOT NULL,
    EMAIL VARCHAR2(50) NOT NULL,
    DNI NUMBER NOT NULL,
    ESTADO_CLIENTE VARCHAR(20) DEFAULT 'ACTIVE'
    );

CREATE TABLE PRODUCTO (
    ID_PRODUCTO NUMBER PRIMARY KEY NOT NULL,
    COLOR VARCHAR2(20) NOT NULL,
    TALLA VARCHAR2(10) NOT NULL,
    PRECIO NUMBER NOT NULL,
    NOMBRE VARCHAR2(40) NOT NULL,
    PRODUCTO_ESTADO VARCHAR(20) DEFAULT 'ACTIVE'
    );
    
    
    
CREATE TABLE PEDIDO(
    ID_PEDIDO NUMBER PRIMARY KEY NOT NULL,
    ID_CLIENTE REFERENCES CLIENTE NOT NULL,
    FECHA_REGISTRO DATE NOT NULL,
    ESTADO_PEDIDO VARCHAR2(40)
    
    
);    


CREATE TABLE DETALLE_PEDIDOS (
    
    ID_PEDIDO REFERENCES PEDIDO NOT NULL,
    ID_PRODUCTO REFERENCES PRODUCTO NOT NULL,
    DP_PRECIO NUMBER NOT NULL,
    CANTIDAD NUMBER NOT NULL
    );
