public class Matriz {
    
    String mat[][][];
    
    public Matriz() {
        mat = new String[2][][];
    }

    public void numHermanos(int pos, int n) {
        try {
            mat[pos] = new String[n][];
        } catch (Exception e) {
            System.out.println("Error, la posicion es invalida"+e.getMessage());
        }

    }

    public void numHijos(int pos) {
        try {
            String s = pos==0?" del papá":" de la mamá";
            for (int i = 0; i < mat[pos].length; i++) {
                System.out.println("Para el hermano " + s + " numero " + i + " Proporciona el numero de hijos");
                int n = Lecturas.enteroC();
                mat[pos][i]= new String[n];
            }

        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
    
    public void capturasNombres(int pos){
        try{
            String s = pos==0?" del papá":" de la mamá";
            for (int i = 0; i < mat[pos].length; i++) {
                for (int j = 0; j < mat[pos][i].length; j++) {
                    System.out.println("Dame el nombre del hijo "+j+ " del hermano "+i+s);
                    mat[pos][i][j]=Lecturas.cadenaC();
                }
            }
        
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    
    public void despliega(){
        try{
            for (int i = 0; i < mat.length; i++) {
                String s = i==0?"papá":"mamá";
                System.out.println(s);
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.println("\tHermano "+j);
                    for (int k = 0; k < mat[i][j].length; k++) {
                        System.out.println("\tHijo "+k+": "+mat[i][j][k]);
                    }
                }
            }
            
        }catch(Exception e){
            System.out.println("Posiciones invalidas"+e.getMessage());
        }
    }
    
}

//Elfego Adair Juarez Arias UAEMEX
