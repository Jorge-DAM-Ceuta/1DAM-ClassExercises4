package Ejercicios7Y8;

public class Cirug�a extends Cita{
    private String tipo;
    
    public Cirug�a(){
        setNombre("");
        setApellidos("");
        setEspecialidad("");
        setFecha("");
        setHoras("");
        tipo="";
    }
    
    public Cirug�a(String no, String ap, String es, String fe, String ho, String ti){
        setNombre(no);
        setApellidos(ap);
        if(es.equals("Cirujano")){
            setEspecialidad(es);
        }
        setFecha(fe);
        setHoras(ho);
        if(validaTipo(ti)){
            tipo=ti;
        }
    }
    
    public Cirug�a(Cirug�a otro){
        setNombre(otro.getNombre());
        setApellidos(otro.getApellidos());
        setEspecialidad(otro.getEspecialidad());
        setFecha(otro.getFecha());
        setHoras(otro.getHora());
        tipo=otro.tipo;
    }
    
    public boolean validaTipo(String ti){
        boolean comp=false;
        
        if(tipo.equals("Rutinaria") || tipo.equals("Urgencia")){
            comp=true;
        }
        
        return comp;
    }
    
    public void setTipo(String ti){
        if(ti.equals("Rutinaria") || ti.equals("Urgencia")){
            tipo=ti;
        }
    }
    
    public void setMedicoCirugia(String es){
        if(es.equals("Cirujano")){
            this.setEspecialidad(es);
        }
    }
    
    public String toString(){
        return "Operación: " + tipo + " para el paciente " + getNombre() + "" + getApellidos() + " , será atendido por el médico " + getEspecialidad() + " el día " + getFecha() + " a las " + getHora() + " horas.";
    }
}
