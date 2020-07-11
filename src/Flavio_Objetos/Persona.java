
package Flavio_Objetos;

public class Persona {
    //atributos
    String nombre;
    int edad;
    double estatura;
    //Metodos
    
    //Metodo Constructor this

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(double estatura) {
        this.estatura = estatura;
    }
    
      
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    public void mostrarDatos1(){
        System.out.println("Su estatura es: "+estatura+" cm. ");
    }
}  