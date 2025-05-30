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

                int opcion = 0;
                double saldoCuenta = 11000;
                int transacciones = 0;
                do {
                    System.out.println("Seleccione una opcion: \n1. Consultar saldo\n2. Retirar Dinero\n3. Transferir dinero\n4. Depositar dinero\n5. Cerrar Sesión");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo es: "+ saldoCuenta);
                            transacciones ++;
                            break;
                        case 2:
                            System.out.print("Ingrese el valor a retirar: ");
                            double valorRetiro = sc.nextDouble();
                            if (valorRetiro >= saldoCuenta){
                                System.out.println("El saldo " + valorRetiro + " supera el valor que tiene en la cuenta" );
                            } else {
                                if (saldoCuenta - valorRetiro < 1){
                                    System.out.println("La cuenta no puede quedar en 0");
                                }else {
                                    saldoCuenta -= valorRetiro;
                                    System.out.println("Retiro exitoso. su nuevo saldo es: "+saldoCuenta);
                                    transacciones++;
                                }

                            }
                            break;
                        case 3:
                            System.out.print("Ingrese el valor a transferir: ");
                            double valorTransferencia = sc.nextDouble();
                            System.out.println("Ingrese el numero de cuenta a la que va a transferir");

                            if (valorTransferencia >= saldoCuenta){
                                System.out.println("El saldo " + valorTransferencia + " supera el valor que tiene en la cuenta" );
                            } else {
                                if (saldoCuenta - valorTransferencia < 1){
                                    System.out.println("La cuenta no puede quedar en 0");
                                }else {
                                    saldoCuenta -= valorTransferencia;
                                    System.out.println("Transferencia exitosa a la cuenta X. su nuevo saldo es: "+saldoCuenta);
                                    transacciones ++;
                                }

                            }
                            break;
                        case 4:
                            System.out.print("Ingrese el valor a consignar: ");
                            double valorConsignacion = sc.nextDouble();
                            if (valorConsignacion<0){
                                System.out.println("No puede ingresar valores negativos");
                            }else if (valorConsignacion < 10000){
                                System.out.println("El  valor minimo a consignar es 10000");
                            }else if (valorConsignacion > 1000000) {
                                System.out.println("El  valor maximo a consignar es 1000000");
                            } else {
                                saldoCuenta += valorConsignacion;
                                System.out.println("Consignacion exitosa. Su nuevo saldo es: "+ saldoCuenta);
                                transacciones ++;
                            }
                            break;
                        case 5:
                            System.out.println("Cerrando sesión...");
                            intentos = 3;
                            break;


                        default:
                            break;
                    }
                }while(opcion != 5);
                System.out.println("Cantidad de transacciones exitosas realizadas el día de hoy "+ transacciones);
            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
                intentos++;
            }
        }
        System.out.println("Ha alcanzado el numero de intentos. Contactar con el administrador.");

    }
}
