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
public class Cuenta {
    protected int IdCuenta;
    protected    int IdCliente;
    protected String Nombre;
    protected float Saldo;
    
    public Cuenta(String nombre, int cliente)
    {
        Nombre = nombre;
        IdCliente = cliente;
        Saldo = (float) 0.0;
        Random GeneradorId = new Random();
        IdCuenta= GeneradorId.nextInt();        
    }
    public String getNombre()
    {
        return Nombre;
    }
    public int getId()
    {
        return IdCuenta;
    } 
    public int getIdCliente()
    {
        return IdCliente;
    } 
    public float getSaldo()
    {
        return Saldo;
    } 
}
