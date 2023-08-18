class Gerente extends Trabajador {
    public Gerente(String nombre, String apellido, int edad, String municipio, String puesto, double salario) {
        super(nombre, apellido, edad, municipio, puesto, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + 2400;
    }
}