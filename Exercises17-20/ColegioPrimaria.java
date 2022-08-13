/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios17_20;

/**
 *
 * @author jorge
 */
public class ColegioPrimaria extends CentroEducativo{
        
    private String evento;
    
    public ColegioPrimaria(){
        setNombre("");
        setNumEstudiantes(0);
        setNumProfesores(0);
        setCodigoPostal(0);
        evento="";
    }
    
    public ColegioPrimaria(String no, int nE, int nP, int cP, String ev){
        setNombre(no);
        setNumEstudiantes(nE);
        setNumProfesores(nP);
        setCodigoPostal(cP);
        if(ev.isBlank()==false){
            evento=ev;
        }
    }
    
    public ColegioPrimaria(ColegioPrimaria other){
        setNombre(other.getNombre());
        setNumEstudiantes(other.getNumEstudiantes());
        setNumProfesores(other.getNumProfesores());
        setCodigoPostal(other.getCodigoPostal());
        evento=other.evento;
    }
    
    public void setEvento(String ev){
        evento=ev;
    }
    
    public String getEvento(){
        return evento;
    }
    
    public void setNumEstudiantes(int nE){
        if(nE>=50 && nE<=600){
            super.setNumEstudiantes(nE);
        }
    }
    
    public void setNumProfesores(int cP){
        if(cP>=5 && cP<=100){
            super.setNumProfesores(cP);
        }
    }
    
    public String toString(){
        return "El centro " + getNombre() + " ubicado en la localidad de codigo postal: " + getCodigoPostal() + " tiene " + getNumProfesores() + " profesores " + " y " + getNumEstudiantes() + " estudiantes. \nEste mes tiene un evento de: " + evento;
    }
    
    public ColegioPrimaria clone(){
        ColegioPrimaria clon=new ColegioPrimaria(this);
        return clon;
    }
    
    public boolean equals(ColegioPrimaria other){
        boolean comp=false;
        
        if(super.equals(other) && evento.equals(other.evento)){
            comp=true;
        }
        
        return comp;
    }
    
    public void anunciaEvento(){
        System.out.println("El colegio" + getNombre() + " va a realizar este mes el evento " + evento + ".");
    }
           
    public void anunciaEvento(String complementario){
        System.out.println("El colegio" + getNombre() + " va a realizar este mes el evento " + evento + " y además de forma complementaria: " + complementario + ".");
    }
            
}
