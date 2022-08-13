package Ejercicio3;

public class UsoWrapper {
  
    private static int transformaASCII(char n){
        int num=0;
        
        switch(n){
            case 48:
                num=0;
            break;
            
            case 49:
                num=1;
            break;
            
            case 50:
                num=2;
            break;
            
            case 51:
                num=3;
            break;
            
            case 52:
                num=4;
            break;
            
            case 53:
                num=5;
            break;
            
            case 54:
                num=6;
            break;
            
            case 55:
                num=7;
            break;
            
            case 56:
                num=8;
            break;
            
            case 57:
                num=9;
            break;
            
        }
        
        return num;
    }
    
    public static int StringtoNumber(String a){
        int resultado=0;
        int contador=0;
        
        for(int i=a.length()-1; i>0; i--){
            
            char cifra= a.charAt(i);
            resultado+=transformaASCII(cifra)*Math.pow(10, contador);
            contador++;
        }
        
        for(int i=0; i<a.length(); i++){
            resultado+=(int)(a.charAt(i));
            resultado=resultado*10;
        }
        
        return resultado;
    }
}
