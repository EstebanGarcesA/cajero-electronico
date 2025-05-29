import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        while (intentos < 3){
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();

            if (usuario.equals("admin") && contrasena.equals("1234")){
                System.out.println(usuario + ". Bienvenido al cajero electronico");
                double saldoCuenta = 0;
                System.out.println("Seleccione una opcion: \n1. Consultar saldo\n2. Retirar Dinero\n3. Depositar Dinero\n4. Transferir dinero\n5. Cerrar Sesión");
                int opcion = sc.nextInt();
            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
                intentos++;
            }
        }
        System.out.println("Ha alcanzado el numero de intentos. Contactar con el administrador.");

    }
}
