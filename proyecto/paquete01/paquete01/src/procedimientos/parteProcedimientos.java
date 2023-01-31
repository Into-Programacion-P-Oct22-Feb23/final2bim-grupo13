package procedimientos;
import java.util.Scanner;

// @author ALISrj & cbhas

public class parteProcedimientos {
    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);

        int edad;
        String usuario;
        String nombres;
        String apellidos;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        String mensaje;

        System.out.println("\nIngrese el nombre de usuario:");
        usuario = entrada.nextLine();

        System.out.println("Ingrese sus nombres reales:");
        nombres = entrada.nextLine();

        System.out.println("Ingrese sus apellidos reales:");
        apellidos = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese la ciudad en la que reside:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese el pais en el que reside:");
        pais = entrada.nextLine();

        System.out.println("Ingrese el idioma que más domine:");
        idioma = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("\nCuenta de TWITTER\nNombre de usuario:\t%s\n"
                + "Nombres:\t%s\nApellidos:\t%s\nEdad:\t%d\nCiudad:\t%s\n"
                + "País:\t%s\nIdioma:\t%s\nEmail:\t%s\n",
                usuario,
                nombres,
                apellidos,
                edad,
                ciudad,
                pais,
                idioma,
                correo);

        System.out.println(mensaje);
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int numero;
        String ciudad;
        String pais;
        String area;
        String mensaje;

        System.out.println("\nIngrese el nombre de usuario:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el número de teléfono:");
        numero = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese la ciudad en la que reside:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese el pais en el que reside:");
        pais = entrada.nextLine();

        System.out.println("Ingrese su área de interés:");
        area = entrada.nextLine();

        mensaje = String.format("\nCuenta TELEGRAM\nNombre de usuario:\t%s\n"
                + "Numero:\t%d\nCiudad:\t%s\nPaís:\t%s\nArea deinterés:\t%s\n",
                nombre,
                numero,
                ciudad,
                pais,
                area);
        System.out.println(mensaje);
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String ciudad;
        int edad;
        String correo;
        String mensaje;

        System.out.println("\nIngrese el nombre de usuario:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese la ciudad en la que reside:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("\nCuenta INSTAGRAM\nNombre de usuario:\t%s\n"
                + "Edad:\t%d\nCiudad:\t%s\nCorreo:\t%s\n",
                nombre,
                edad,
                ciudad,
                correo);
        System.out.println(mensaje);
    }
    
}
