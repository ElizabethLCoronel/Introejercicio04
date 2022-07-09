public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 54;
        cliente.telefono = "55-5421-3126";
        cliente.nombre = "Alejandro";
        cliente.credito= 250000;
        System.out.println("Soy el cliente: "+ cliente.nombre+ ", tengo: " + cliente.edad + " anios, mi telefono es: " + cliente.telefono + " y cuento con un Credito de: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 53;
        trabajador.telefono = "33-2411-1662";
        trabajador.nombre = "Elizabeth";
        trabajador.salario = 159888.58;
        System.out.println("Soy la trabajadora: " +trabajador.nombre + ", tengo: " +trabajador.edad + " anios, mi telefono es: " + trabajador.telefono + " y mi salario es: " + trabajador.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

}
class Cliente extends Persona {
    double credito;

}

class Trabajador extends Persona {
    double salario;

}