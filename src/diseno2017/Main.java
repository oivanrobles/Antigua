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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        
                System.out.println("Bienvenido a la UMG");
        
        int Codigo;
        Codigo = 0;
        Codigo = 12;
        
        Alumno B;
        Alumno C; 
        B = new Alumno();
        C = new Alumno("Juan", "Perez");
        
        Curso Progra= new Curso("Progra",20);
        Progra.InscribirAlumno(new Alumno ("juan", "perez"));
        Progra.InscribirAlumno(new Alumno ("pedro", "gomez"));
        Progra.InscribirAlumno(new Alumno ("maria", "sagastume"));
        Progra.InscribirAlumno("Antonio", "Martinez");
        //System.out.println(Progra.MostrarInscritos());
        System.out.println(Progra);
    }
    
}
