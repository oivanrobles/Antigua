/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author OscarIvan
 */
public class Monetarios extends Cuenta{

    public Monetarios(String nombre, int cliente) {
        super(nombre, cliente);
    }
    public Monetarios(String nombre, int cliente, float saldo) {
        super(nombre, cliente);
        this.Saldo = saldo;
    }
    public void Acreditar(float monto)
    {
        Saldo += monto;
    }
    
    public void Debitar(float monto)
    {
        if (Saldo - monto > 0)
            Saldo -= monto;
    }
}
