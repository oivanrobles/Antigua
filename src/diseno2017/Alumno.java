/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseno2017;

import java.util.Date;

/**
 *
 * @author OscarIvan
 */
public class Alumno {


    private int Id;
    private String Nombre;
    private String Apellido; 
    private String Carne;
    private Date Fecha_Nacimiento;
    
    public Alumno()
    {
        Id =21; 
        Nombre ="Sin Nombre";
        Apellido = "Sin Apellido";
        Carne = AsignarCarne();
    }
    
    public Alumno(String nombre, String apellido)
    {
        Id =21; 
        Nombre =nombre;
        Apellido = apellido;
        Carne = AsignarCarne();
    }
    
    protected String AsignarCarne()
    {
        return "1231223";
    }
    public void setNombre(String nombre)
    {
        this.Nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.Nombre;
    }
    
    
    public void setApellido(String apellido)
    {
        this.Apellido = apellido;
    }
    public String getApellido()
    {
        return this.Apellido;
    }
    
    
    public void setCarne(String carne)
    {
        this.Carne = carne; 
    }
    
    public String getCarne()
    {
        return Carne;
    }
    
    public void setFecha_Nacimiento(Date fechaNacimiento)
    {
        Fecha_Nacimiento = fechaNacimiento;
    }
    public Date getFecha_Nacimiento()
    {
        return Fecha_Nacimiento;
    }
    
    @Override
    public String toString()
    {
        return "Nombre: " + Nombre + " Apellido: " + Apellido +  " Carne:" + Carne ;
    }
    
}
