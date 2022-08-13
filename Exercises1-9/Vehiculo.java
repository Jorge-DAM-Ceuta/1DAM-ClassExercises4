package Ejercicios1Y9;

public abstract class Vehiculo {
    
    protected int n_Ruedas, velocidad_Actual, velocidad_Maxima, antigüedad;
    
    public Vehiculo(){
        n_Ruedas=0;
        velocidad_Actual=0;
        velocidad_Maxima=0;
        antigüedad=0;
    }
    
    public Vehiculo(int nr, int va, int vm, int an){
        n_Ruedas=nr;
        velocidad_Actual=va;
        velocidad_Maxima=vm;
        antigüedad=an;
    }
    
    public Vehiculo(Vehiculo otro){
        n_Ruedas=otro.n_Ruedas;
        velocidad_Actual=otro.velocidad_Actual;
        velocidad_Maxima=otro.velocidad_Maxima;
        antigüedad=otro.antigüedad;
    }
    
    public void setNRuedas(int nr){
        if(nr>0){
            n_Ruedas=nr;
        }else{
            System.err.println("El numero de ruedas no puede ser inferior o igual a 0");
        }
        
    }
    
    public void setVelocidadActual(int va){
        if(velocidad_Actual>=0){
            velocidad_Actual=va;
        }else{
            System.err.println("La velocidad no puede ser inferior a 0");
        }
        
    }
    
    public void setVelocidadMaxima(int vm){
        if(velocidad_Maxima>0){
            velocidad_Actual=vm;
        }else{
            System.err.println("La velocidad no puede ser 0 o menor");
        }
        velocidad_Maxima=vm;
    }
    
    public void setAntigüedad(int an){
        
        if(antigüedad>=0){
            antigüedad=an;
        }else{
            System.err.println("La antigüedad no puede ser menor que 0");
        }
        
    }
    
    public final int getNRuedas(){
        return n_Ruedas;
    }
    
    public final int getVelocidadActual(){
        return velocidad_Actual;
    }
    
    public final int getVelocidadMaxima(){
        return velocidad_Maxima;
    }
    
    public final int getAntigüedad(){
        return antigüedad;
    }
    
    public String toString(){
        return "El vehículo tiene " + n_Ruedas + " ruedas, su velocidad actual es: " + velocidad_Actual + " km/h. Y su velocidad maxima: " + velocidad_Maxima + " km/h. Tiene " + antigüedad + " años de antigüedad";
    }
    
    public abstract void acelerar(int kmh);
        /*if((velocidad_Actual+kmh)<=velocidad_Maxima && kmh>0){
            this.velocidad_Actual+=kmh;
        }else{
            System.err.println("");
        }*/
    
    
    public abstract void frenar(int kmh);
        /*if((velocidad_Actual-kmh)>=0 && kmh>0){
            this.velocidad_Actual+=kmh;
        }else{
            System.err.println("");
        }*/
    
}
