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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco miBanco =  new Banco("Banco Industrial");
        Cliente nuevoCliente = new Cliente("Juan Perez", miBanco.getId());
        
        System.out.println("Banco");
        System.out.println(miBanco.toString());
        System.out.println("Cliente");
        System.out.println(nuevoCliente.getNombre());
        System.out.println(nuevoCliente.getIdBanco());
        Monetarios nuevaCuenta = new Monetarios("0101",nuevoCliente.getId());
        Monetarios otraCuenta = new Monetarios("0101",nuevoCliente.getId(), 200);
        System.out.println("Cuenta");
        System.out.println(nuevaCuenta.getSaldo());
        nuevaCuenta.Acreditar(100);
        nuevaCuenta.Acreditar(110);
        
        System.out.println(nuevaCuenta.getSaldo());
        nuevaCuenta.Debitar(80);        
        System.out.println(nuevaCuenta.getSaldo());
        System.out.println("Transaccion");
        miBanco.Transaccion(100, nuevaCuenta, otraCuenta);
        System.out.println(nuevaCuenta.getSaldo());
        System.out.println(otraCuenta.getSaldo());
    }
    
}
