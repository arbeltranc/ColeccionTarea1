/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;

/**
 *
 * @author ALEX BELTRAN
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("\t\tUniversidad de las Fuerzas Armadas ESPE-L");
        System.out.println("\n\t\t\t   Ingeniería Automotriz");
        System.out.println("\t\t\t\tProgramación");
        System.out.println("\n\t\t\t Docente: Ing. Luis Guerra");
        System.out.println("\t\t\t Estudiante: Alex Beltran");
        
        Collection listaComponentes=new ArrayList<String>();//El tipo de listaComponentes es Collection
        
        listaComponentes.add("protoboard");
        listaComponentes.add("\nbatería de 9 voltios");
        listaComponentes.add("\nbroche para batería de 9 voltios");
        listaComponentes.add("\ncables");
        listaComponentes.add("\ninterruptor");
        listaComponentes.add("\nrelevador T73");
        listaComponentes.add("\ncapacitor de 4700 micro faradios");
        listaComponentes.add("\nresistencia 1 de 1 ohm");
        listaComponentes.add("\nresistencia 2 de 1 ohm");
        listaComponentes.add("\ndiodo led amarillo 1");
        listaComponentes.add("\ndiodo led amarillo 2");
        
    System.out.println("\nNúmero de componentes antes de ser eliminados: "+listaComponentes.size());
    System.out.println("LAS COMPONENTES SON: ");
    System.out.println(listaComponentes.toString());
    
    listaComponentes.remove("protoboard");
    listaComponentes.remove("\nbatería de 9 voltios");
    listaComponentes.remove("\nbroche para batería de 9 voltios");
    listaComponentes.remove("\ncables");
    listaComponentes.remove("\ninterruptor");
    listaComponentes.remove("\nrelevador T73");
    
    System.out.println("\nNúmero de componentes después de utilizar protoboard, batería de 9 voltios,"
            + "\nbroche para batería de 9 voltios, cables y relevador T73: "+listaComponentes.size());
    System.out.println("LOS COMPONENTES QUE QUEDAN SON: ");
    System.out.println(listaComponentes.toString());
        
    }
    
}
