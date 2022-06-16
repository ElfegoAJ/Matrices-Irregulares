
import java.io.*;

public class Lecturas {
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private static InputStreamReader isrC = new InputStreamReader(System.in);
    private static BufferedReader brC = new BufferedReader(isrC);
            
    
    public int entero(){
        
        try{
            return Integer.parseInt(br.readLine());
        }catch(Exception e){
            System.out.println("Error... Se esperaba un entero"+e.getMessage());
            return 0;
        }
    }
    
    public int entero(Boolean b){
        do {
            try{
                return Integer.parseInt(br.readLine());
            }catch(Exception e){
                System.out.println("Error, se esperaba un entero. Vuelva a intentarlo"+e.getMessage());
            }
        } while (b);
        return 0;
    }
    
    public double doble(){
        try{
            return Double.parseDouble(br.readLine());
        }catch(Exception e){
            System.out.println("Error, se esperaba un flotante"+e.getMessage());
            return 0;
        }
    }
    
    public double doble(Boolean b){
        do {
            try{
                return Double.parseDouble(br.readLine());
            }catch(Exception e){
                System.out.println("Error, se esperaba un flotante, vuelva a intentar"+e.getMessage());
            }
        } while (b);
        return 0;
    }
    
    public char caracter(){
        char c = ' ';
        try{
            c=(char)br.read();
            String s = br.readLine();
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        return 0;
    }
    
    
    public String cadena(){
        try{
            return br.readLine();
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
            return "";
        }
    }
    
    public static int enteroC(){
        try{
            return Integer.parseInt(brC.readLine());
        }catch(Exception e){
            System.out.println("Error... se esperaba un entero"+e.getMessage());
        }
        return 0;
    }
    
    public static int enteroC(Boolean b){
        do {
            try{
                return Integer.parseInt(brC.readLine());
            }catch(Exception  e){
                System.out.println("Error, se esperaba un entero, vuelva a intentarlo"+e.getMessage());
            }
        } while (b);
        return 0;
    }
    
    public static double dobleC(){
        try{
            return Double.parseDouble(brC.readLine());
        }catch(Exception e){
            System.out.println("Error, se esperaba un flotante"+e.getMessage());
        }
        return 0;
    }
    
    public static double dobleC(Boolean b){
        do {
            try{
                return Double.parseDouble(brC.readLine());
            }catch(Exception e){
                System.out.println("Error, se esperaba un flotante, vuelva a intentarlo"+e.getMessage());
            }
        } while (b);
        return 0;
    }
    
    public static char caracterC(){
        char c=' ';
        try{
            c=(char)brC.read();
            String s = brC.readLine();
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        return c;
    }
    
    public static String cadenaC(){
        try{
            return brC.readLine();
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
            return "";
        }
    }
    
}
