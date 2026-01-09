public class Seccion04 {
    public static void main(String[] args) throws Exception {

        int midato = 30000;

        byte opcion=56;
        boolean esPrimo=true;

        //Es un IF ternario
        byte esPrimoByte = (byte)(esPrimo ? 1 : 0);

        byte esPrimoByte2=0;
        if (esPrimo)
            esPrimoByte2=1;
        else
            esPrimoByte2=0;    


        procesarDatoPequeño((byte)(esPrimo ? 1 : 0));

        procesarDatoPequeño((byte)midato);
        procesarDatoMayor(midato);

        if (opcion==0)    
            procesarDatoBooleano(false);
        else if (opcion==1) 
            procesarDatoBooleano(true);
        else
            System.out.println("");

    }

    // Ejercicio 1
    static void procesarDatoBooleano(boolean dato) {
        System.out.printf("El valor paso es %d", dato);
    }

    static void procesarDatoPequeño(byte dato) {
        System.out.printf("El valor paso es %d", dato);
    }

    static void procesarDatoMayor(double dato) {
        System.out.printf("El valor paso es %d", dato);
    }
}
