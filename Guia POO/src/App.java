public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        VehiculoPasajeros auto = new VehiculoPasajeros("Nissan", "Frontier NP300", 2020, 15000, 5);
        Camion camion = new Camion("Hino", "300", 2019, 75000, 20000, 4);

        System.out.println("Información del Auto:");
        auto.mostrarInfo();
        auto.realizarMantenimiento();

        System.out.println("\nInformación del Camion:");
        camion.mostrarInfo();
        camion.realizarMantenimiento();

        double costoPorKm = 0.5;
        int kilometrosRecorridos = 10000;
        double costoTotal = auto.calcularCostoMantenimiento(costoPorKm, kilometrosRecorridos);
        System.out.println("\nCosto de mantenimiento del Auto: " + costoTotal);


    }
}
