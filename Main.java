public class Main {
    public static void main(String[] args) {
        Persona nombre = new Persona();
        nombre.setNombre("andrea");
        System.out.println(nombre.getNombre());

        Persona edad = new Persona();
        edad.setEdad(25);
        System.out.println(edad.getEdad());

        Persona telefono = new Persona();
        telefono.setTelefono(123456789);
        System.out.println(telefono.getTelefono());

    }

}


class Persona {

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    public int getEdad() {
        return this.edad;

    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;

    }

    public int getTelefono() {
        return this.telefono;

    }
}
