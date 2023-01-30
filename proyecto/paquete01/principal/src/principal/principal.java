package principal;

import java.util.Scanner;
import funciones.parteFunciones;
import procedimientos.parteProcedimientos;
import mensaje.parteMensajeFinal;

// @author ALISrj & cbhas

public class principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcionC;
        int numeroCuentas = 0;
        boolean bandera = true;
        String mensaje;
        String opcionS;

        while (bandera) {
            System.out.println("Ingrese 1 para crear cuenta de Facebook  \n"
                    + "Ingrese 2 para crear cuenta de Twiteer   \n"
                    + "Ingrese 3 para crear cuenta de Whatsapp  \n"
                    + "Ingrese 4 para crear cuenta de Telegram  \n"
                    + "Ingrese 5 para crear cuenta de Signal    \n"
                    + "Ingrese 6 para crear cuenta de Instagram \n"
                    + "Ingrese 7 para crear cuenta de Flickr    \n"
                    + "-----------------------------------------");
            opcionC = entrada.nextInt();

            if (opcionC <= 7 && opcionC >= 0) {
                if (opcionC == 1) {
                    System.out.println(parteFunciones.crearFacebook());
                } else {
                    if (opcionC == 2) {
                        parteProcedimientos.crearTwitter();
                    } else {
                        if (opcionC == 3) {
                            System.out.println(parteFunciones.crearWhatsapp());
                        } else {
                            if (opcionC == 4) {
                                parteProcedimientos.crearTelegram();
                            } else {
                                if (opcionC == 5) {
                                    System.out.println(parteFunciones.crearSignal());
                                } else {
                                    if (opcionC == 6) {
                                        parteProcedimientos.crearInstagram();
                                    } else {
                                        System.out.println(parteFunciones.crearFlickr());
                                    }
                                }
                            }
                        }
                    }
                }

                numeroCuentas = numeroCuentas + 1;
                entrada.nextLine();

                System.out.println("Si desea salir del ciclo ingrese 's'");
                opcionS = entrada.nextLine();

                if ("s".equals(opcionS)) {
                    bandera = false;
                }

            } else {
                System.out.println("\nError en opción seleccionada\nIngrese "
                        + "nuevamente\n");
            }
        }

        mensaje = parteMensajeFinal.obtenerMensaje(numeroCuentas);
        System.out.println(mensaje);

    }

}
