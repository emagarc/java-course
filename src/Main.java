public class Main {
    public static void main(String[] args) {
        Automovil autoFamiliar = new AutoFamiliar();
        Automovil autoDeportivo = new AutoDeportivo("Renault", "Clio", 2020, true);
        Automovil autoDeportivo2 = new AutoDeportivo("Fiat");

        System.out.println("Auto 2, marca: " + autoDeportivo.getMarca());
        System.out.println("Auto 2, modelo: " + autoDeportivo.getModelo());

        autoFamiliar.setMarca("Ford");
        autoFamiliar.setModelo("Focus");

        System.out.println("Auto 1, marca: " + autoFamiliar.getMarca());
        System.out.println("Auto 1, modelo: " + autoFamiliar.getModelo());

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