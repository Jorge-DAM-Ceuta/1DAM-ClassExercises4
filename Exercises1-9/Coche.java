package Ejercicios1Y9;

public class Coche extends Vehiculo{
   
    private String combustible;
    
    public Coche(){
        this.setNRuedas(0);
        this.setVelocidadActual(0);
        this.setVelocidadMaxima(0);
        this.setAntigüedad(0);
        combustible="";
    }
    
    public Coche(int nr, int vel, int vel_m, int an, String com){
           
        if(validaCombustible(com)){
            this.setNRuedas(nr);
            this.setVelocidadActual(vel);
            this.setVelocidadMaxima(vel_m);
            this.setAntigüedad(an);
            combustible=com;
        }else{
            System.err.println("Tipo de combustible no valido");
            this.setNRuedas(0);
            this.setVelocidadActual(0);
            this.setVelocidadMaxima(0);
            this.setAntigüedad(0);
            combustible="";
        }
    }
    
    protected boolean validaCombustible(String com){
        boolean comp=false;
        
        if(com.equals("gasolina") || com.equals("gasoil") || com.equals("electrico")){
            comp=true;
        }else{
            comp=false;
        }
        
        return comp;
    }
    
    public String toString(){
        return "El coche tiene " + this.n_Ruedas + " ruedas, su velocidad actual es: " + this.velocidad_Actual + " km/h. Y su velocidad maxima: " + this.velocidad_Maxima + " km/h. Tiene " + this.antigüedad + " años de antigüedad. Y su combustible es " + combustible;
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