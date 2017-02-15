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
        C = new Alumno();
        
        System.out.println(B.equals(C));
        System.out.println(B.toString());
        System.out.println(B.getNombre());
        B.setNombre("Juan");
        System.out.println(B.getNombre());
    }
    
}
