public class Main {
    public static void main(String[] args) throws Exception {
        String numero = "9";
        String nueve = numero;

        //crea un número con 100 nueves
        for (int x=0; x<100; x++){
            numero += nueve;
        }
        numero = "8";
        boolean repetir = true;
        boolean suma = false;
        int numSeleccionado;
        int longitud = numero.length();
        int maxLongitud = numero.length();
        String numFinal = "";

        //suma 1 al número
        
        //Para el caso que solo tenga un dígito
        if(maxLongitud == 1){
            numSeleccionado = Integer.parseInt(numero);
            if(numSeleccionado == 9){
                numFinal = "10";
            }
            else{
                numSeleccionado++;
                numFinal += numSeleccionado;
            }
            repetir = false;
        }
        
        //Para el caso que tenga mínimo 2 dígitos
        while (repetir){
            longitud--;
            numSeleccionado = Integer.parseInt(numero.substring(longitud, longitud+1));
            if(maxLongitud == longitud+1){//suma el primer número +1
                if(numSeleccionado == 9){
                    numSeleccionado = 0;
                    suma = true;
                }
                else{
                    numSeleccionado++;
                }
            }
            else if (longitud > 0){//si el anterior número fue un 9 sumado se le sumará el 1 correspondiente
                if(suma){
                    if(numSeleccionado == 9){
                        numSeleccionado = 0;
                        suma = true;
                    }
                    else{
                        numSeleccionado ++;
                        suma = false;
                    }
                }
            }
            else{
                if(numSeleccionado == 9){//final del número
                    numSeleccionado = 10;
                    suma = true;
                }
                repetir = false;
            }
            numFinal = numSeleccionado + numFinal;
        }
        System.out.println(numero);
        System.out.println(numFinal);
       
    }
}
