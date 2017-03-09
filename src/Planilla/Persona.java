/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planilla;

/**
 *
 * @author OscarIvan
 */
public class Persona {
    
    protected String Nombre; 
    protected String Direccion; 
    protected String Telefono;
    
    public Persona()
    {}
    public Persona(String nombre, String direccion, String telefono)
    {
        Nombre = nombre; 
        Direccion = direccion; 
        Telefono = telefono;
    }
    
}
