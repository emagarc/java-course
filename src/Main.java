public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("Renault", "Clio", 2020);

        System.out.println("Auto 1, marca: " + auto1.marca);
        System.out.println("Auto 2, marca: " + auto2.marca);

        Persona emanuel = new Persona("Emanuel", "Garcia", 25, "Programador", true);
        Persona miguel = new Persona("Miguel", "Garcia", 70, "ingeniero", false);

        System.out.println("El primer cliente se llama: " + emanuel.nombre);
        // Verificar si Emanuel es bilingüe y mostrar un mensaje
        if (emanuel.bilingue) {
            System.out.println("Emanuel es bilingüe.");
        } else {
            System.out.println("Emanuel no es bilingüe.");
        }
    }
}