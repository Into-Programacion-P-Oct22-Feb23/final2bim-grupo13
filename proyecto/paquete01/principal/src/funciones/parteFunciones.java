package funciones;
import java.util.Scanner;


// @author ALISrj & cbhas

public class parteFunciones {

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String mensaje;

        System.out.println("\nIngrese el nombre de usuario:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese la ciudad en la que reside:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese el pais en el que reside:");
        pais = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("\nCuenta de FACEBOOK\nUsuario:\t%s\n"
                + "Edad:\t\t%d\nCiudad:\t\t%s\nPaís:\t\t%s\nEmail:\t\t%s\n",
                nombre,
                edad,
                ciudad,
                pais,
                correo);

        return mensaje;
    }
    
    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int numero;
        int edad;
        String ciudad;
        String pais;
        String mensaje;

        System.out.println("\nIngrese el nombre de usuario:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el número de teléfono:");
        numero = entrada.nextInt();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese la ciudad en la que reside:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese el pais en el que reside:");
        pais = entrada.nextLine();

        mensaje = String.format("\nCuenta WHATSAPP\nNombre de usuario:\t%s\n"
                + "Numero:\t%d\nEdad:\t%d\nCiudad:\t%s\nPaís:\t%s\n",
                nombre,
                numero,
                edad,
                ciudad,
                pais);

        return mensaje;
    }
    
    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int numero;
        String ciudad;
        String pais;
        String hobby;
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

        System.out.println("Ingrese su hobby principal:");
        hobby = entrada.nextLine();

        mensaje = String.format("\nCuenta SIGNAL\nNombre de usuario:\t%s\n"
                + "Numero:\t%d\nCiudad:\t%s\nPaís:\t%s\nHobby principal:\t%s\n",
                nombre,
                numero,
                ciudad,
                pais,
                hobby);
        return mensaje;
    }
    
    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String correo;
        String mensaje;

        System.out.println("\nIngrese el nombre de usuario:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("\nCuenta FLICKR\nNombre de usuario:\t%s\nC"
                + "orreo:\t\t\t%s\n",
                nombre,
                correo);
        return mensaje;
    }
    
    

}
