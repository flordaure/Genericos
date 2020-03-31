public class Persona implements Comparable {
    private String name;
    private String apellido;
    private int dni;

    public Persona (String name, String apellido, int dni){
        setName(name);
        setApellido(apellido);
        setDni(dni);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " Apellido: " + this.getApellido() + " DNI: " + this.getDni();
    }
}
