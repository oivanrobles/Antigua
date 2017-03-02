/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Random;

/**
 *
 * @author OscarIvan
 */
public class Cliente {
    int IdCliente;
    int IdBanco;
    String Nombre;
    
    public Cliente(String nombre, int banco)
    {
        Nombre = nombre;
        IdBanco = banco;
        Random GeneradorId = new Random();
        IdCliente= GeneradorId.nextInt();        
    }
    public String getNombre()
    {
        return Nombre;
    }
    public int getId()
    {
        return IdCliente;
    } 
    public int getIdBanco()
    {
        return IdBanco;
    } 
    
}
