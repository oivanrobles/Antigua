/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseno2017;

/**
 *
 * @author OscarIvan
 */
public class Curso {
    private int Id;
    private final  String Nombre;
    private final Alumno Inscritos [];
    private int Cupo;
    private int Asignados;
    
    public Curso(String nombre, int cupo)
    {
            this.Nombre = nombre;
            this.Cupo = cupo;
            Inscritos = new Alumno[Cupo];
            Asignados = 0;
    }
        
    public void InscribirAlumno(Alumno aInscribir)
    {
        Inscritos[Asignados]= aInscribir;
        Asignados++;
    }
    public void InscribirAlumno(String nombre, String apellido)
    {
        Inscritos[Asignados]= new Alumno (nombre, apellido);
        Asignados++;
    }
    
    public String MostrarInscritos()
    {
        String Cadena ="Inscritos> ";
        for (int i=0;i< Asignados; i++)
        {
            Cadena += "; Alumno: " + Inscritos[i].toString() + "\n";
        
        }
        return Cadena;
    }
    
    @Override 
    public String toString()
    {
        return " Nombre> " +this.Nombre +"\n " + MostrarInscritos();
    }
}
