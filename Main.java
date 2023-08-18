import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
        trabajadores.add(new Obrero(" Jose", "Bernal", 22, "Felipe", "Obrero", 1500.8));
        trabajadores.add(new Obrero(" Carlos", "Segundo", 42, "Atlaco", "Obrero", 2000.5));
        trabajadores.add(new Supervisor("Luis", "Torres", 45, "Mexico", "Supervi", 3000.6));
        trabajadores.add(new Supervisor("Alex", "Rosas", 37, "Tol", "Supervi", 500.7));
        trabajadores.add(new Gerente("Pablo", "Tercero", 25, "Atlaco", "Gerente", 339.8));
        trabajadores.add(new Gerente("Juan", "Lopez", 28, "Felipe", "Gerente", 899.6));
        System.out.println("\t\tRegistro de Personal de la Empresa");
        System.out.println("***************************************************************************************");
        System.out.println("Nombre\t\tApellido\tEdad\t\tMunicipio\tPuesto\t\tSueldo");
        System.out.println("***************************************************************************************");
        for (Trabajador trabajador : trabajadores) {
            System.out.println(
                    trabajador.nombre + "\t\t" + trabajador.getApellido() + "\t\t" + trabajador.getEdad() + "\t\t" +
                            trabajador.getMunicipio() + "\t\t" + trabajador.getPuesto() + "\t\t"
                            + trabajador.calcularSalario());

        }
        System.out.println("***************************************************************************************");
    }
}