/*Actividad nº 1
¿Qué longitud en cm necesita la persona con discapacidades para tener una 
pendiente de 7 %? Pendiente máxima deseada o pendiente generada a partir de
la longitud. Si se sabe lo siguiente como norma para calcular las rampas
para personas con discapacidades:
 */
package ClasesyObjetos;

public class Pendiente {
    //Atributos
    private float altura;
    private float base;
    private float pendiente; 
    private float porcentaje;
  
    
    
     //Metodo
public static void main(String[] args){
    Pendiente longitud  = new Pendiente();
    longitud.altura = 26;
    longitud.pendiente = 7;
    longitud.porcentaje = 100;
       
    
    longitud.base = (longitud.porcentaje*longitud.altura/longitud.pendiente);
    
    System.out.println("La altura de las gradas es: " +longitud.altura+"  cm."); 
    System.out.println("La pendiente es del       : " +longitud.pendiente+"  por ciento");
    System.out.println("La longitud buscada es    : " +longitud.base+"  cm.");  
    
}
    
}
