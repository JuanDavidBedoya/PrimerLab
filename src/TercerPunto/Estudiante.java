package TercerPunto;

public class Estudiante extends Persona{

    private int matricula;

    public Estudiante(String nombre, int edad, String genero, int matricula) {
        super(nombre, edad, genero);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula=" + matricula;
    }

}
