
public class mainFamily {

    

    public static void main(String[] args) {
        Matriz m = new Matriz();
        
        System.out.println("Dame el numero de hermanos de papá");
        m.numHermanos(0, Lecturas.enteroC());
        System.out.println("Dame el numero de hermanos de la mamá");
        m.numHermanos(1, Lecturas.enteroC());
        System.out.println("Captura el numero de hijos del papá");
        m.numHijos(0);
        System.out.println("Captura el numero de hijos de la mamá");
        m.numHijos(1);
        System.out.println("Captura nombres de sobrinos del papá");
        m.capturasNombres(0);
        System.out.println("Captura nombres de sobrinos de la mamá");
        m.capturasNombres(1);
        m.despliega();
    }
}
//Elfego Adair Juarez Arias UAEMEX
