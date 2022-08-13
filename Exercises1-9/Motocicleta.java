package Ejercicios1Y9;

public class Motocicleta extends Vehiculo{
   
    private String tipo;
    
    public Motocicleta(){
        this.setNRuedas(0);
        this.setVelocidadActual(0);
        this.setVelocidadMaxima(0);
        this.setAntigüedad(0);
        tipo="";
    }
    
    public Motocicleta(int nr, int vel, int vel_m, int an, String ti){
           
        if(validaTipo(ti)){
            if(nr==2){
                this.setNRuedas(nr);
            }
            this.setVelocidadActual(vel);
            this.setVelocidadMaxima(vel_m);
            this.setAntigüedad(an);
        }else{
            System.err.println("Tipo de motocicleta no valido");
        }
        
        if(validaTipo(ti)){
            tipo=ti;
        }else{
            System.err.println("Tipo de motocicleta no valido");
        }
    }
    
    protected boolean validaTipo(String ti){
        boolean comp=false;
        
        if(ti.equals("scooter") || ti.equals("ciclomotor")){
            comp=true;
        }else{
            comp=false;
        }
        
        return comp;
    }
    
    public String toString(){
        return "La motocicleta de tipo " + tipo + " tiene " + this.n_Ruedas + " ruedas, su velocidad actual es: " + this.velocidad_Actual + " km/h. Y su velocidad maxima: " + this.velocidad_Maxima + " km/h. Tiene " + this.antigüedad + " años de antigüedad.";
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
