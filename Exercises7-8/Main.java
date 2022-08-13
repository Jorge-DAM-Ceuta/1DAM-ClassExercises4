package Ejercicios7Y8;

public class Main {

    public static void main(String[] args) {
        
        Cita c1, c2;
        Cirug�a cir;
        Consulta c3=new Consulta("Jorge", "Muñoz García", "Traumatólogo", "15-11-2023", "19:30:00", "Dolor de espalda", 2);
        
       // c1=new Consulta("Jorge", "Muñoz García", "Generalista", "31-12-2023", "17:01:59", "Dolor de cabeza", 2);
        //System.out.println(c1.toString());
        
        //c2=new Revisi�n("Jorge", "Muñoz García", "Traumatólogo", "17-12-2023", "14:00:00", c3);
        //System.out.println(c2.toString());
        
        //cir=c3.situacionPaciente();
        c1=new Consulta();
                c1.situacionPaciente();
    }
    
}
