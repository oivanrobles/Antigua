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
public class Banco {
    private int IdBanco;
    private String Nombre;
    
    public Banco(String nombre)
    {
        Nombre = nombre;
        Random GeneradorId = new Random();
        IdBanco= GeneradorId.nextInt();        
    }
    public String getNombre()
    {
        return Nombre;
    }
    public int getId()
    {
        return IdBanco;
    }           
    
    @Override
    public String toString()
    {
        return "IdBanco>" + String.valueOf(IdBanco) + " Nombre: " + Nombre;
    }
    
    public void Transaccion(float monto,  Monetarios origen, Monetarios destino)
    {
        origen.Debitar(monto);
        destino.Acreditar(monto);
    }            
}
