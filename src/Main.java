public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("Renault", "Clio", 2020);

        System.out.println("Auto 2, marca: " + auto2.getMarca());
        System.out.println("Auto 2, modelo: " + auto2.getModelo());

        auto1.setMarca("Ford");
        auto1.setModelo("Focus");

        System.out.println("Auto 1, marca: " + auto1.getMarca());
        System.out.println("Auto 1, modelo: " + auto1.getModelo());

        AutoDeportivo bugatti = new AutoDeportivo();
        bugatti.setMarca("Bugatti");
        bugatti.setEsConvertible(true);

        if (bugatti.isEsConvertible()) {
            System.out.println("El auto marca " + bugatti.getMarca() + " es convertible");
        } else {
            System.out.println("El auto marca " + bugatti.getMarca() + " no es convertible");
        }

        Persona emanuel = new Persona("Emanuel", "Garcia", 25, "Programador", true);
        Persona miguel = new Persona("Miguel", "Garcia", 70, "ingeniero", false);

        System.out.println("El primer cliente se llama: " + emanuel.getNombre() + " " + emanuel.getApellido());
        // Verificar si Emanuel es bilingüe y mostrar un mensaje
        if (emanuel.getBilingue()) {
            System.out.println("Emanuel es bilingüe.");
        } else {
            System.out.println("Emanuel no es bilingüe.");
        }
    }
}