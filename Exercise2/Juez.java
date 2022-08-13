package Ejercicio2;

public class Juez extends Persona{
    
    public Juez(){
        nombre="";
        edad=0;
    }
    
    public Juez(String no, int ed){
        nombre=no;
        edad=ed;
    }
    
    public Juez(Juez otro){
        this.nombre=otro.nombre;
        this.edad=otro.edad;
    }
    
    public boolean cerificaEdad(Persona otro){
        boolean comp=false;
        
        if(otro.edad>=18){
            comp=true;
        }else{
            comp=false;
        }
        
        System.out.println("La persona es mayor de edad? " + comp);
        return comp;
    }
    
    public String toString(){
        return "El juez " + nombre + " tiene " + edad + " años";
    }
}
