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
public class Proveedor extends Persona {
    private String SituacionIVA;
    
    public Proveedor(String nombre, String direccion, String telefono, String situacionIVA)
    {
        Nombre = nombre;
        super.Direccion = direccion;
        super.Telefono = telefono;
        this.SituacionIVA = situacionIVA;
    }
}
