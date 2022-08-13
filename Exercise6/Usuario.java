package Ejercicio6;

import java.time.LocalDateTime;
        
public class Usuario {
    
    private String nombre_Usuario, contraseña, email;
    private LocalDateTime fecha;

    public Usuario(){
        nombre_Usuario="";
        contraseña="";
        email="";
        fecha=null;
    }
    
    public Usuario(String nu, String e, String c){
        if(nombre_Usuario.contains(" ") || nombre_Usuario.isEmpty()){
            System.out.println("Error con el usuario");
        }else{
            this.nombre_Usuario=nu;
        }
        
        if(!email.contains("@") || email.isEmpty()){
            System.out.println("Error con el email");
        }else{
            this.email=e;
        }
        
        boolean c8= (c.length()>=8);
        boolean cMay= !c.equals(c.toLowerCase());
        boolean cMin= !c.equals(c.toUpperCase());
        
        if(c8 && cMay && cMin){
            this.contraseña=c;
        }else{
            System.out.println("Error con la contraseña");
        }
        
        this.fecha=LocalDateTime.now();
    }
    
    public Usuario(String nu, String e, String c, String fe){
        if(nombre_Usuario.contains(" ") || nombre_Usuario.isEmpty()){
            System.out.println("Error con el usuario");
        }else{
            this.nombre_Usuario=nu;
        }
        
        if(!email.contains("@") || email.isEmpty()){
            System.out.println("Error con el email");
        }else{
            this.email=e;
        }
        
        boolean c8= (c.length()>=8);
        boolean cMay= !c.equals(c.toLowerCase());
        boolean cMin= !c.equals(c.toUpperCase());
        
        if(c8 && cMay && cMin){
            this.contraseña=c;
        }else{
            System.out.println("Error con la contraseña");
        }
        
        if(fe.length()==19){
            String Dia=fe.substring(0, 2);
            String Mes=fe.substring(3, 5);
            String Año=fe.substring(6, 10);
            String Hora=fe.substring(11, 13);
            String Minutos=fe.substring(14, 16);
            String Segundos=fe.substring(17, 19);
        
            if(Integer.parseInt(Dia)<=31){
                if(Integer.parseInt(Mes)<=12){
                    if(Año.length()==4){
                        if(Integer.parseInt(Hora)<=23){
                            if(Integer.parseInt(Minutos)<=60){
                                if(Integer.parseInt(Segundos)<=60){
                                    this.fecha=LocalDateTime.of(Integer.parseInt(Año), Integer.parseInt(Mes), Integer.parseInt(Dia), Integer.parseInt(Hora), Integer.parseInt(Minutos), Integer.parseInt(Segundos));
                                }
                            }
                        }
                    }
                }
            }
        }        
    }
    
    public Usuario(Usuario copia){
        this.nombre_Usuario=copia.nombre_Usuario;
        this.contraseña=copia.contraseña;
        this.email=copia.email;
        this.fecha=copia.fecha;
    }
    
    public int calculaAntigüedad(){
       LocalDateTime antigüedad = LocalDateTime.now();
       antigüedad=antigüedad.minusYears(fecha.getYear());
       
       System.out.println("El usuario lleva incrito " + antigüedad.getYear() + " años.");
       return antigüedad.getYear();
    }
    
    public int getAñoInscripcion(){
        return fecha.getYear();
    }
    
    public void premioFidelidad(){
       int dias=fecha.getDayOfYear();
       LocalDateTime fechaActual=LocalDateTime.now();
       int FechaActual=fechaActual.getDayOfYear();
       
       for(int i=0; i<FechaActual; i++){
           if(i==60){
               if(FechaActual%dias==0){
                   System.out.println("El usuario ha recibido un premio por fidelidad! Recoger en tienda");
               }
           }
       }
    }
    
    public void setFecha(LocalDateTime a){
        fecha=a;
    }
}

