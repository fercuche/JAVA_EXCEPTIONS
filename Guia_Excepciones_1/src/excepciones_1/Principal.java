package excepciones_1;

public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1 = null;

        try {
            persona1.esMayorDeEdad();
        } catch (NullPointerException e){
            System.out.println("La persona no tiene datos");
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }



    }

}
