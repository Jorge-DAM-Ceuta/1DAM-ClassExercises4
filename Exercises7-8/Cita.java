package Ejercicios7Y8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Cita {
    
    protected String nombrePaciente, apellidosPaciente, especialidadMedico;
    protected LocalDate fecha;
    protected LocalTime hora;
    
    public Cita(){
        nombrePaciente="";
        apellidosPaciente="";
        especialidadMedico="";
        fecha=null;
        hora=null;
    }
    
    public Cita(String no, String ap, String es, String fe, String ho){
        if(validaNombre(no)){
            nombrePaciente=no;
        }
        
        if(validaApellidos(ap)){
            apellidosPaciente=ap;
        }
        
        if(validaEspecialidad(es)){
            especialidadMedico=es;
        }
        
        int año, mes, dia, horas, minutos, segundos;
        dia=Integer.parseInt(fe.substring(0, 2));
        mes=Integer.parseInt(fe.substring(3, 5));
        año=Integer.parseInt(fe.substring(6));
        horas=Integer.parseInt(ho.substring(0, 2)); 
        minutos=Integer.parseInt(ho.substring(3, 5));
        segundos=Integer.parseInt(ho.substring(6));
        
        this.fecha=LocalDate.of(año, mes, dia);
        LocalDate actual = LocalDate.now();
        if(this.fecha.isBefore(actual)==true){
            System.err.println("Error con la fecha solicitada.");
            this.fecha=null;
        }
        LocalTime hora_actual = LocalTime.now();
        this.hora=LocalTime.of(horas, minutos, segundos);
        if(this.fecha.equals(actual) && this.hora.isBefore(hora_actual)){
            System.err.println("Error con la hora solicitada.");
            this.hora=null;
        
        }
    }
    
    public Cita(Cita other){
        nombrePaciente=other.nombrePaciente;
        apellidosPaciente=other.apellidosPaciente;
        especialidadMedico=other.especialidadMedico;
        fecha=other.fecha;
        hora=other.hora;
    }
    
    public boolean validaNombre(String no){
        boolean comp=false;
        
        if(no.length()>=3){
            no=no.trim();
            comp=true;
        }
        
        return comp;
    }
    
    public boolean validaApellidos(String ap){
        boolean comp=false;
        
        if(ap.length()>1){
            ap=ap.trim();
            comp=true;
        }
        
        return comp;
    }
    
    public boolean validaEspecialidad(String es){
        boolean comp=false;
        
        if(es.equals("Generalista") || es.equals("TraumatÃ³logo") || es.equals("OtorrinolaringÃ³logo") || es.equals("Cirujano")){
            especialidadMedico=es;
            comp=true;
        }
        
        return comp;
    }
    
    public void setNombre(String no){
        if(validaNombre(no)){
            nombrePaciente=no;
        }
    }
    
    public void setApellidos(String ap){
        apellidosPaciente=ap.trim();
    }
    
    public void setEspecialidad(String es){
        if(validaEspecialidad(es)){
            especialidadMedico=es;
        }
    }
    
    public void setFecha(String fe){
        int Año, Mes, Dia;
        Dia=Integer.parseInt(fe.substring(0, 2));
        Mes=Integer.parseInt(fe.substring(3, 5));
        Año=Integer.parseInt(fe.substring(6));
            
        fecha=LocalDate.of(Año, Mes, Dia);
        LocalDate fechaActual=LocalDate.now();
            
        if(fecha.isBefore(fechaActual)){
            System.err.println("Error con la fecha solicitada.");
            fecha=null;
        }
    }
    
    public void setHoras(String ho){
        int Horas, Minutos, Segundos;
        Horas=Integer.parseInt(ho.substring(0, 2));
        Minutos=Integer.parseInt(ho.substring(3, 5));
        Segundos=Integer.parseInt(ho.substring(6));
        
            hora=LocalTime.of(Horas, Minutos, Segundos);
            LocalTime horaActual=LocalTime.now();
            LocalDate fechaActual=LocalDate.now();
            
            if(fecha.equals(fechaActual) && hora.isBefore(horaActual)){
                System.err.println("Error con la hora solicitada");
                hora=null;
            }
    }
    
    public final String getNombre(){
        return nombrePaciente;
    }
    
    public final String getApellidos(){
        return apellidosPaciente;
    }
    
    public final String getEspecialidad(){
        return especialidadMedico;
    }
    
    public final String getFecha(){
        String dia, mes, año;
        dia="" + fecha.getDayOfMonth();
        mes="" + fecha.getMonthValue();
        año="" + fecha.getYear();
        
        if(Integer.parseInt(dia)<10){
            dia="0" + fecha.getDayOfMonth();
        }
        if(Integer.parseInt(mes)<10){
            mes="0" + fecha.getMonthValue();
        }
        String formatoEuropa="" + dia + "/" + mes + "/" + año;
        return formatoEuropa;
    }
    
    public final LocalDate getFechaDate(){
        return fecha;
    }
    
    
    public final String getHora(){
        String horas, minutos, segundos;
        horas="" + hora.getHour();
        minutos="" + hora.getMinute();
        segundos="" + hora.getSecond();
        
        if(Integer.parseInt(horas)<10){
            horas="0" + hora.getHour();
        }
        if(Integer.parseInt(minutos)<10){
            horas="0" + hora.getMinute();
        }
        if(Integer.parseInt(segundos)<10){
            horas="0" + hora.getSecond();
        }
        String horaFinal=horas + ":" + minutos + ":" + segundos;
        return horaFinal;
    }
    
    public String toString(){
        return "El paciente " + "" + nombrePaciente + "" + apellidosPaciente + " sera atendido por el medico " + especialidadMedico + " el dÃ­a " + fecha + " a las " + hora;
    }
}
