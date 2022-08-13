package Ejercicios7Y8;

public class Consulta extends Cita{
    private String diagnostico;
    private int nivelRiesgo;
    
    public Consulta(){
        setNombre("");
        setApellidos("");
        setEspecialidad("");
        setFecha("");
        setHoras("");
        diagnostico="";
        nivelRiesgo=0;
    }
    
    public Consulta(String no, String ap, String es, String fe, String ho, String di, int nr){
        setNombre(no);
        setApellidos(ap);
        setEspecialidad(es);
        setFecha(fe);
        setHoras(ho);
        diagnostico=di;
        if(nivelRiesgo>0 && nivelRiesgo<=3){
            nivelRiesgo=nr;
        }
    }
    
    public Consulta(Consulta otro){
        setNombre(otro.getNombre());
        setApellidos(otro.getApellidos());
        setEspecialidad(otro.getEspecialidad());
        setFecha(otro.getFecha());
        setHoras(otro.getHora());
        diagnostico=otro.diagnostico;
        nivelRiesgo=otro.nivelRiesgo;
    }
    
    public void setDiagnostico(String di){
        diagnostico=di;
    }
    
    public String getDiagnostico(){
        return diagnostico;
    }
    
    public void setNivelRiesgo(int nr){
        if(nr>0 && nr<=3){
            nivelRiesgo=nr;
        }
    }
    
    public int getNivelRiesgo(){
        return nivelRiesgo;
    }
    
    public Cirug�a situacionPaciente(){
        Cirug�a a=new Cirug�a();
        
        switch(nivelRiesgo){
            case 1:
                System.out.println("El paciente presenta el siguiente diagnostico " + this.diagnostico);
                break;
            case 2:
                System.out.println("El paciente presenta el siguiente diagnostico " + diagnostico + " y se le generará una cita para Cirugia rutinaria.");
                a = new Cirug�a(getNombre(), getApellidos(), "Cirujano", getFecha(), getHora(), "Rutinaria");
                break;
            case 3:
                System.out.println("El paciente pasará directamente a quirófano");
                a = new Cirug�a(getNombre(), getApellidos(), getEspecialidad(), getFecha(), getHora(), "Urgencia");
                break;
          
        }
        return a;
    }
    
    public String toString(){
        return "Cita para el paciente " + getNombre() + " " + getApellidos() + ", con diagnóstico " + diagnostico + " de nivel de riesgo " + nivelRiesgo + " , será atendido por el médico " + getEspecialidad() + " el día " + getFecha() + " a las " + getHora() + " horas.";
    }
}
