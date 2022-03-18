package excepciones_1;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;

    //constructor vacio
    public Persona() {

    }

    //constructor parametrizado
    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodos
    public void crearPersona() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre de la persona:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        edad = scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.println("Ingrese el sexo\n(H)ombre,(M)ujer u (O)tro:");
            sexo = scanner.nextLine();
            if ((!"M".equals(sexo) && !"H".equals(sexo) && !"O".equals(sexo))) {
                System.out.println("Ingrese una opción válida");
            }
        } while (!"M".equals(sexo) && !"H".equals(sexo) && !"O".equals(sexo));
        System.out.println("Ingrese el peso:");
        peso = scanner.nextFloat();
        System.out.println("Ingrese la altura en metros");
        altura = scanner.nextFloat();
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >25) {
            return 1;
        } else {
            return 0; 
        }

    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
