import com.blogspot.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*

        // Account examples
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Account account1 = new Account();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        account1.setFullName(nombre);
        account1.setAccountNumber(numero);
        account1.setRateInterest(tipo);
        account1.setBalance(importe);

        //se crea el objeto cuenta2 con los valores leidos por teclado
        //se ejecuta el constructor con parámetros
        Account account2 = new Account("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        //se crea cuenta3 como copia de cuenta1
        //se ejecuta el constructor copia
        Account account3 = new Account(account1);

        //mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + account1.getFullName());
        System.out.println("Número de cuenta: " + account1.getAccountNumber());
        System.out.println("Tipo de interés: " + account1.getRateInterest());
        System.out.println("Saldo: " + account1.getBalance());
        System.out.println();

        //se realiza un ingreso en cuenta1
        account1.pay(4000);

        //mostrar el saldo de cuenta1 después del ingreso
        System.out.println("Saldo: " + account1.getBalance());

        //mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + account2.getFullName());
        System.out.println("Número de cuenta: " + account2.getAccountNumber());
        System.out.println("Tipo de interés: " + account2.getRateInterest());
        System.out.println("Saldo: " + account2.getBalance());
        System.out.println();

        //mostrar los datos de cuenta3
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + account3.getFullName());
        System.out.println("Número de cuenta: " + account3.getAccountNumber());
        System.out.println("Tipo de interés: " + account3.getRateInterest());
        System.out.println("Saldo: " + account3.getBalance());
        System.out.println();

        //realizar una transferencia de 10€ desde cuenta3 a cuenta2
        account3.transfer(account2, 10);

        //mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + account2.getBalance());
        System.out.println();

        //mostrar el saldo de cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + account3.getBalance());
        System.out.println();

         */

        /*

        // Counter examples

        //Utilizar el constructor por defecto
        Counter contador1 = new Counter();

        int n;
        System.out.println("Introduce valor para inicializar el contador: ");
        n = sc.nextInt();

        //asignar un valor al contador
        contador1.setCount(n);
        //incrementar el contador
        contador1.increase();
        //mostrar el valor actual
        System.out.println(contador1.getCount());

        contador1.increase();
        contador1.increase();

        //mostrar el valor actual
        System.out.println(contador1.getCount());

        //restar 1 al valor del contador
        contador1.decrease();

        //mostrar el valor actual
        System.out.println(contador1.getCount());

        //crear un nuevo objeto Contador con valor inicial 10
        Counter contador2 = new Counter(10);

        //incrementar y decrementar el contador2 y mostrar su valor
        contador2.increase();
        System.out.println(contador2.getCount());
        contador2.decrease();
        System.out.println(contador2.getCount());

        //crear un objeto Contador utilizando el constructor copia
        //se crea el objeto contador3 como copia de contador2
        Counter contador3 = new Counter(contador2);

        //mostrar el valor de contador3
        System.out.println(contador3.getCount());

        */

        /*

        // Book examples

        String titulo, autor;
        int ejemplares;

        //se crea el objeto libro1 utilizando el constructor con parámetros
        Book libro1 = new Book("El quijote", "Cervantes", 1, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Book libro2 = new Book();

        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();

        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        libro2.setTitle(titulo);
        libro2.setAuthor(autor);
        libro2.setNumberCopies(ejemplares);

        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitle());
        System.out.println("Autor: " + libro1.getAuthor());
        System.out.println("Ejemplares: " + libro1.getNumberCopies());
        System.out.println("Prestados: " + libro1.getNumberCopiesLent());
        System.out.println();

        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.loan()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitle());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitle() + " para prestar");
        }

        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (libro1.refund()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitle());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitle() + " prestados");
        }

        //se realiza otro préstamo de libro1
        if (libro1.loan()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitle());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitle() + " para prestar");
        }

        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.refund()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitle());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitle() + " para prestar");
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitle());
        System.out.println("Autor: " + libro1.getAuthor());
        System.out.println("Ejemplares: " + libro1.getNumberCopies());
        System.out.println("Prestados: " + libro1.getNumberCopiesLent());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitle());
        System.out.println("Autor: " + libro2.getAuthor());
        System.out.println("Ejemplares: " + libro2.getNumberCopies());
        System.out.println("Prestados: " + libro2.getNumberCopiesLent());
        System.out.println();

        System.out.println(libro2);

        */

        /*

        // Fraction examples

        // Se crean 4 fracciones
        Fraction f1 = new Fraction(1, 4); // Fracción 1/4
        Fraction f2 = new Fraction(1, 2); // Fracción 1/2
        Fraction f3 = new Fraction(); // Fracción 0/1
        Fraction f4 = new Fraction(4); // Fracción 4/1
        // operaciones aritméticas con esas fracciones
        Fraction suma = f1.add(f2);
        Fraction resta = f1.sub(f3);
        Fraction producto = f1.mul(f4);
        Fraction cociente = f1.div(f2);
        //mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);

         */

        /*

        // Date examples

        int d, m, a;

        //Se pide por teclado el dia, mes y año
        System.out.println("Introduce Fecha...");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();

        //Se crea un objeto Fecha utilizando el consructor con parámetros
        Date fecha = new Date(d,m,a);

        if (fecha.correctDate()) { //si la fecha es correcta

            //Se muestra utilizando el método toString()
            System.out.println("Fecha introducida: " + fecha);

            //Se muestran los 10 días siguientes utilizando el método diaSiguiente()
            System.out.println("Los 10 días siguientes son:");
            for (int i = 1; i <= 10; i++) {
                fecha.nextDay();
                System.out.println(fecha);
            }

        } else { //Si la fecha no es correcta
            System.out.println("Fecha no valida");
        }

         */
    }
}
