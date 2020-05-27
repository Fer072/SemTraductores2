/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintactico;

/**
 *
 * @author andre
 */
public enum Token { // DECLARACIÓN DE CLASE ENUM CON LOS TOKENS DE NUESTRO LENGUAJE
    IDENTIFICADOR, CONSTANTE, TIPODATO, OPSUMA, OPMUL, OPREL, OPOR, OPAND, OPNOT, 
    OPIGUALDAD, PUNTOCOMA, COMA, PARIZQ, PARDER, LLAVEIZQ, LLAVEDER, OPASIGN, IF, WHILE,
    DO, FOR, DOSPUNTOS, ELSE, RETURN, FINCADENA, ERROR
}
