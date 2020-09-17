package parcial;
import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

ejercicio2();



   }
    
    
    
    
    static void ejercicio2() {
        System.out.println("Buenos dias, bienvenido al calendario");
        int dia=-1,mes=-1,ano=-1, verificador=0, lim=-1;
        
        System.out.println("Por favor introduzca el año");
        while ((ano<0)) {
        	ano=scanner(0, 99999999);
        }
        

        //MES
        System.out.println("Por favor introduzca el mes");
        while ((mes<0) || (mes>=12)) {
        	mes=scanner(0,12);
        }
        //limites dias del mes
        //verificar bisiesto
       verificador = bisiesto(ano);
       lim= limitador (verificador, mes);

        
        //lim1 son Enero, marzo, mayo, julio, agosto, octubre y diciembre. 
        // lim2 Abril, junio, septiembre y noviembre
     
        System.out.println("Por favor introduzca el dia");
        while ((dia<0) || (dia>lim)) {
        	dia=scanner(0,lim);
        }
        String mesn = cadena(mes); 
        
        System.out.println("El mes de "+mesn+" tiene "+lim+" días");
        System.out.println("La fecha calculada es: "+dia+" de "+mesn+" del año "+ano);
        
		
	}




	public static String cadena(int mes) {
        String m="";
        
        switch (mes) {
    	case 1:
    		m="Enero";
    		break;
    	case 2:
    		m="Febrero";
    		break;
    	case 3:
    		m="Marzo";
    		break;
    	case 4:
    		m="Abril";
    		break;
    	case 5:
    		m="Mayo";
    		break;
    	case 6:
    		m="Junio";
    		break;
    	case 7:
    		m="Julio";
    		break;
    	case 8:
    		m="Agosto";
    		break;
    	case 9:
    		m="Septiembre";
    		break;
    	case 10:
    		m="Octubre";
    		break;
    	case 11:
    		m="Noviembre";
    		break;
    	case 12:
    		m="Diciembre";
    		break;
    	}
        return m;
    }
    
    public static int limitador(int v, int mes) {
    	int lim=0;
        if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
        	lim=31;
        }
        else if (mes==4||mes==6||mes==9||mes==11) {
        	lim=30;
        }
        else if(v==1) {
      	   lim=29;
         }
        else if (mes==2){
        	lim=28;
        }
        return lim;
        
    }
    
    
    
    /* SCANNER DE TECLADO------------------------------------------------------------------------------------------------------------*/
    public static int scanner(int lim, int lim2) {
        int numero;
        System.out.println("introduce el número:");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        if ((numero <= lim) || (numero>lim2)) {
            System.out.println("Has introducido un valor no válido, por favor vuelve a intentarlo");
            return -1;
        }

        return numero;
    }
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/
    
    //AÑO BISIESTO
    public static int bisiesto (int ano) {
    	int n=0; 
    if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
        n=1; // Es bisiesto
    }

    else 
    {
    	n=0; //No es bisiesto
    }
    return n;
    }
    
    
    
}