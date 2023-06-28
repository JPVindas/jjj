
package newpackage;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Metodo constructor

    public Persona(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }
    public void mostrardatos(){
        System.out.println("El nombre es: "+  nombre);
        System.out.println("la edad es: "+  edad);
    }
    
    }
        
        
