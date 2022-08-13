/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios17_20;

/**
 *
 * @author jorge
 */
public class InstitutoSecundaria extends CentroEducativo{
    
    private String categoria;
    private Competicion comp;
    
    private class Competicion{
        private String nombre, tipo;
        private int numEstudiantes;
        
        public Competicion(){
            numEstudiantes=0;
            nombre="";
            tipo="";
            setNumEstudiantes(3);
        }
        
        public Competicion(String no, String ti, int nE){
            if(validaGrupo(nE)){
                numEstudiantes=nE;
            }
            nombre=no;
            if(validaTipo(ti)){
                tipo=ti;
            }
        }
        
        public Competicion(Competicion other){
        setNombre(other.getNombre());
        setNumEstudiantes(other.getNumEstudiantes());
        setNumProfesores(other.getNumProfesores());
        setCodigoPostal(other.getCodigoPostal());
        }   
        
        private boolean validaTipo(String ti){
            boolean comp=false;
            
            if(ti.equals("Cientifica") || ti.equals("Creativa") || ti.equals("")){
                comp=true;
            }
            
            return comp;
        }
        
        private boolean validaGrupo(int nE){
            boolean comp=false;
            
            if(nE>0 && nE<(getNumEstudiantes()/10)){
                comp=true;
            }
            
            return comp;
        }
        
        
        public String getCompeticion(){
            return nombre;
        }

        public String getTipo(){
            return tipo;
        }
        
        public int getGrupo(int nE){
            return numEstudiantes=nE;
        }
    }
    
    public InstitutoSecundaria(){
        setNombre("");
        setNumEstudiantes(0);
        setNumProfesores(0);
        setCodigoPostal(0);
        categoria="";
        comp=new Competicion();
    }
    
    public InstitutoSecundaria(String no, int nE, int nPr, int cP, String nC, String ti, int nPa){
        setNombre(no);
        setNumEstudiantes(nE);
        setNumProfesores(nPr);
        setCodigoPostal(cP);
        setCategoria();
        comp=new Competicion(nC, ti, nPa);
    }
    
    public InstitutoSecundaria(InstitutoSecundaria other){
        setNombre(other.getNombre());
        setNumEstudiantes(other.getNumEstudiantes());
        setNumProfesores(other.getNumProfesores());
        setCodigoPostal(other.getCodigoPostal());
        comp=new Competicion(other.comp);
    }
    
    public void setCategoria(){
        if(getNumEstudiantes()>=50 && getNumEstudiantes()<400){
            categoria="A";
        }
        
        if(getNumEstudiantes()>=400 && getNumEstudiantes()<700){
            categoria="B";
        }
        
        if(getNumEstudiantes()>=700 && getNumEstudiantes()<1000){
            categoria="C";
        }
        
        if(getNumEstudiantes()>=1000 && getNumEstudiantes()<1200){
            categoria="D";
        }
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    
    public String toString(){
        return "El centro " + getNombre() + " ubicado en la localidad de codigo postal: " + getCodigoPostal() + " tiene " + getNumProfesores() + " profesores " + " y " + getNumEstudiantes() + " estudiantes. \nRealiza la competicion " + comp.getCompeticion() + " que es de tipo: " + comp.getTipo() + " y participan " + comp.getParticipantes() + "";
    }
    
    public InstitutoSecundaria clone(){
        InstitutoSecundaria clon=new InstitutoSecundaria(this);
        return clon;
    }
    
    public boolean equals(InstitutoSecundaria other){
        boolean comp=false;
        
        if(super.equals(other) && categoria.equals(other.categoria)){
            comp=true;
        }
        
        return comp;
    }
}
