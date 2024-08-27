package PrimerPunto;

public class ComparadorPorNombre implements Comparable<ComparadorPorNombre> {

    private Persona persona;

    public ComparadorPorNombre(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int compareTo(ComparadorPorNombre otraPersona) {
        return this.persona.getNombre().compareTo(otraPersona.persona.getNombre());
    }

    @Override
        public String toString() {
            return persona.toString();
        }

}
