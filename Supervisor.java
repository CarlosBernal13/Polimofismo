
public class Supervisor extends Trabajador {
    public Supervisor(String nombre, String apellido, int edad, String municipio, String puesto, double salario) {
        super(nombre, apellido, edad, municipio, puesto, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + 4000;
    }
}
