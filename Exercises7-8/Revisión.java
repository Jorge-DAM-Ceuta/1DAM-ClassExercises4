package Ejercicios7Y8;

import java.time.LocalDate;

public class Revisión extends Cita{
    private Consulta consultaAsociada;
    
    public Revisión(){
        setNombre("");
        setApellidos("");
        setEspecialidad("");
        setFecha("");
        setHoras("");
        consultaAsociada=new Consulta();
    }
    
    public Revisión(String no, String ap, String es, String fe, String ho, Consulta asociada){
        consultaAsociada=new Consulta(asociada);
        LocalDate fechaAsociada=consultaAsociada.getFechaDate();
        fechaAsociada=fechaAsociada.plusDays(14);
        
        setFecha(fe);
        setNombre(no);
        setApellidos(ap);
        
    //Para que sea el mismo mÃ©dico
        if(especialidadMedico.equals(consultaAsociada.getEspecialidad())){
            setEspecialidad(especialidadMedico);
        }
        
        if(fechaAsociada.isBefore(consultaAsociada.getFechaDate())){
            System.err.println("Error con la fecha de la cita");
            setFecha("");
        }else{
            setFecha(fe);
            setHoras(ho);
        }
    }
    
    public Revisión(Revisión otro){
        setNombre(otro.getNombre());
        setApellidos(otro.getApellidos());
        setEspecialidad(otro.getEspecialidad());
        setFecha(otro.getFecha());
        setHoras(otro.getHora());
        consultaAsociada=new Consulta(otro.consultaAsociada);
    }
    
    /*public boolean compruebaCita(String fe){
        boolean comp=false;
        int AÃ±o, Mes, Dia;
        
            Dia=Integer.parseInt(fe.substring(0, 2));
            Mes=Integer.parseInt(fe.substring(3, 5));
            AÃ±o=Integer.parseInt(fe.substring(6));
            
            fechaRevision=LocalDate.of(AÃ±o, Mes, Dia);
            LocalDate fechaActual=LocalDate.now();
            
            if(fechaRevision.isAfter(fecha)){
                System.err.println("Error con la fecha solicitada.");
                comp=true;
            }
            
        return comp;
    }*/
    
    public String toString(){
        return "Cita para el paciente " + "" + getNombre() + "" + getApellidos() + " , serÃ¡ atendido por el mÃ©dico " + getEspecialidad() + ". La revisiÃ³n es el dÃ­a " + getFecha() + " a las " + getHora() + " horas.";
    }
    
    public void setMedicoRevision(String medico){
        if(medico.equals("Generalista")){
            especialidadMedico=medico;
        }
    }
    
    public void setFechaAsociada(String fecha){
        LocalDate fechaAsociada = consultaAsociada.getFechaDate();
        fechaAsociada = fechaAsociada.plusDays(14);
        if(fechaAsociada.isBefore(consultaAsociada.getFechaDate())){
            System.err.println("Error con la fecha de la cita");
        }else{
            this.setFecha(fecha);
        }
    }
}
