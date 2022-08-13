package Ejercicios17_20;

public class CentroEducativo {
    
    private String nombre;
    private int numEstudiantes, numProfesores, codigoPostal;
    
    public CentroEducativo(){
        nombre="";
        numEstudiantes=codigoPostal=numProfesores=0;
    }
    
    public CentroEducativo(String no, int nE, int nP, int cP){
        if(checkNombre(no)){
            nombre=no;
        }
        
        if(checkNumEstudiantes(nE)){
            numEstudiantes=nE;
        }
        
        if(checkCodigoPostal(cP)){
            codigoPostal=cP;
        }
        
        if(checkNumProfesores(cP)){
            numProfesores=cP;
        }
        
    }
    
    public CentroEducativo(CentroEducativo other){
        nombre=other.nombre;
        numEstudiantes=other.numEstudiantes;
        numProfesores=other.numProfesores;
        codigoPostal=other.codigoPostal;
    }
    
    private boolean checkNombre(String no){
        boolean comp=false;
        
        if(no.length()>=10 && no.length()<=30){
            comp=true;
        }
        
        return comp;
    }
    
    private boolean checkNumEstudiantes(int nE){
        boolean comp=false;
        
        if(nE>=50 && nE<=1200){
            comp=true;
        }
        
        return comp;
    }
    
    private boolean checkCodigoPostal(int cP){
        boolean comp=false;
        
        if(cP>0 && cP<53000){
            comp=true;
        }
        
        return comp;
    }
    
    private boolean checkNumProfesores(int nP){
        boolean comp=false;
        
        if(nP>5 && nP<200){
            comp=true;
        }
        
        return comp;
    }

    public void setNombre(String no){
        if(checkNombre(no)){
            nombre=no;
        }
    }
 
    public void setNumEstudiantes(int nE){
        if(checkNumEstudiantes(nE)){
            numEstudiantes=nE;
        }
    }
    
    public void setNumProfesores(int cP){
        if(checkNumProfesores(cP)){
            numProfesores=cP;
        }
    }
    
    public void setCodigoPostal(int cP){
        if(checkCodigoPostal(cP)){
            codigoPostal=cP;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumEstudiantes(){
        return numEstudiantes;
    }
    
    public int getNumProfesores(){
        return numProfesores;
    }
    
    public int getCodigoPostal(){
        return codigoPostal;
    }
    
    public String toString(){
        return "El centro " + nombre + " ubicado en la localidad de codigo postal: " + codigoPostal + " tiene " + numProfesores + " profesores " + " y " + numEstudiantes + " estudiantes.";
    }
    
    public CentroEducativo clone(){
        CentroEducativo clon=new CentroEducativo(this);
        return clon;
    }
    
    public boolean equals(CentroEducativo other){
        boolean comp=false;
        
        if(nombre.equals(other.nombre) && numEstudiantes==other.numEstudiantes && numProfesores==other.numProfesores && codigoPostal==other.codigoPostal){
            comp=true;
        }
        
        return comp;
    }
}
