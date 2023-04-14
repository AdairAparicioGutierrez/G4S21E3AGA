/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21e3aga;

/**
 *
 * @author walmart
 */
public class G4S21E3AGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("operaciones"+ args.length);
        for (int a=0; a<args.length;a++)
        
        System.out.println("valor#"+a+", contiene ->"+ args[a]);
        for (int a=0; a<args.length;a++){
            if(args[a].equals( "2-6")) break;
        System.out.println("El resultado es 8, del valor #"+args[a]);
        }
           
        for (int a=1; a<args.length;a++){
            if(args[a].equals( "2x6")) break;
        System.out.println("El resultado es -4, del valor #"+args[a]);
        }
         
        for (int a=2; a<args.length;a++){
            if(args[a].equals( "2/6")) break;
        System.out.println("El resultado es 12, del valor #"+args[a]);
        }
       
        for(int a=3; a<args.length;a++){
            if(args[a].equals("")) break;
        System.out.println("El resultado .3333, del valor #"+args[a]);
        }
        
        System.out.println("Nos salimos de la ejecucion");
        
        
        
        }
    }
    

