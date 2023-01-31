package mensaje;

import java.util.Scanner;

// @author ALISrj & cbhas

public class parteMensajeFinal {

    public static String obtenerMensaje(int contador) {
        Scanner entrada = new Scanner(System.in);

        String mensaje = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante",
            "Excelente campaña"};

        System.out.printf("\nSe han creado %d cuentas", contador);

        if (contador >= 1 && contador <= 5) {
            mensaje = "\n" + mensajeFinal[0] + "\n";
        } else {
            if (contador >= 6 && contador <= 15) {
                mensaje = "\n" + mensajeFinal[1] + "\n";

            } else {
                if (contador >= 16) {
                    mensaje = "\n" + mensajeFinal[2] + "\n";

                }
            }
        }

        return mensaje;
    }

}
