package Ejercicio2;

public class Persona {

    protected String nombre;
    protected int edad;
    
    public Persona(){
        nombre="";
        edad=0;
    }
    
    public Persona(String no, int ed){
        nombre=no;
        if(edad>=0){    
        edad=ed;
        }
    }
        
    public Persona(Persona otro){
        this.nombre=otro.nombre;
        this.edad=otro.edad;
    }
    
    public void setNombre(String no){
        nombre=no;
    }
    
    public void setEdad(int ed){
        if(edad>=0){    
            edad=ed;
        }
    }
    
    public final String getNombre(){
        return nombre;
    }
    
    public final int getEdad(){
        return edad;
    }
    
    public String toString(){
        return "La persona se llama " + nombre + " y tiene " + edad + " años";
    }
    
    public void validaEdad(){
        
        if(edad>=18){
            System.out.println("La persona es MAYOR de edad");
        }else{
            System.out.println("La persona es MENOR de edad");
        }
    }
}
