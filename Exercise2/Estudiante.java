package Ejercicio2;

public final class Estudiante extends Persona{
    
    private String enseñanza, examen;
    
    public Estudiante(){
        nombre="";
        edad=0;
        enseñanza="";
    }
    
    public Estudiante(String no, int ed, String en){
        nombre=no;
        edad=ed;
        if(validaEnseñanza(en)){
            enseñanza=en;
        }
    }
    
    public Estudiante(Estudiante otro){
        this.nombre=otro.nombre;
        this.edad=otro.edad;
        this.enseñanza=otro.enseñanza;
    }
    
    private boolean validaEnseñanza(String en){
        boolean comp=false;
        
        if(en.equals("Primaria") || en.equals("Secundaria") || en.equals("Formacion profesional") || en.equals("Universitaria")){
            comp=true;
        }else{
            comp=false;
        }
        
        return comp;
    }
    
    public void printExamen(){
        System.out.println("Va a realizar el examen de " + examen);
    }
    
    public String getEnseñanza(){
        return enseñanza;
    }
    
    public String toString(){
        return "El estudiante " + nombre + " de " + edad + " años estudia " + enseñanza;
    }
}
