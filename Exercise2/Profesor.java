package Ejercicio2;

public class Profesor extends Persona{
    
    private Estudiante [] grupo_Estudiantes;
    private int tamaño=0;
    
    public Profesor(){
        nombre="";
        edad=0;
        tamaño=26;
    }
    
    public Profesor(String no, int ed, int tam){
        nombre=no;
        edad=ed;
        tamaño=tam;
    }
    
    public Profesor(Profesor otro){
        this.nombre=otro.nombre;
        this.edad=otro.edad;
        this.tamaño=otro.tamaño;
    }
    
    public boolean validaEstudiantes(String enseñanza){
        boolean comp=true;
        
        for(int i=0; i<tamaño; i++){
            if(grupo_Estudiantes[i].getEnseñanza().equals(enseñanza)==false){
                return false;
            }
        }
        return comp;
    }
    
    public String toString(){
        return "El Profesor " + nombre + " de " + edad + " años tiene un grupo de " + tamaño + " alumnos";
    }
}
