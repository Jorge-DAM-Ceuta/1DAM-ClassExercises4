package Ejercicios1Y9;

public class Barco extends Vehiculo{
    
    private String especialidad;
    
    public Barco(){
        this.setNRuedas(0);
        this.setVelocidadActual(0);
        this.setVelocidadMaxima(0);
        this.setAntigüedad(0);
    }
    
    public Barco(int vel, int vel_m, int an, String es){
           
        if(validaEspecialidad(es)){
            this.setVelocidadActual(vel);
            this.setVelocidadMaxima(vel_m);
            this.setAntigüedad(an);
            especialidad=es;
        }else{
            System.err.println("Tipo de barco no valido");
            this.setVelocidadActual(0);
            this.setVelocidadMaxima(0);
            this.setAntigüedad(0);
            especialidad="";
        }
    }
    
    protected boolean validaEspecialidad(String es){
        boolean comp=false;
        
        if(es.equals("comercial") || es.equals("mercante")){
            comp=true;
        }else{
            comp=false;
        }
        
        return comp;
    }
    
    public String toString(){
        return "El barco de especialidad " + especialidad + " va a una velocidad de " + this.velocidad_Actual + " km/h. Y su velocidad maxima: " + this.velocidad_Maxima + " km/h. Tiene " + this.antigüedad + " años de antigüedad.";
    }
    
    public void acelerar(int kmh){
        if((velocidad_Actual+kmh)<=velocidad_Maxima && kmh>0){
            this.velocidad_Actual+=kmh;
        }else{
            System.err.println("");
        }
    }
    
    
    public void frenar(int kmh){
        if((velocidad_Actual-kmh)>=0 && kmh>0){
            this.velocidad_Actual+=kmh;
        }else{
            System.err.println("");
        }
    }
}