package mascotas;
class Loro extends Ave {

    // Atributos
    private String origen;
    private boolean habla;
    private String pelaje;

    // Constructor
    Loro(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela, String origen, boolean habla, String pelaje) {
        super(nombre, edad, estado, fechaNac, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNac());
        System.out.println("Pico   : " + this.getPico());
        System.out.println("Vuela  : " + this.getVuela());
        System.out.println("Vuela  : " + this.getHabla());
        System.out.println("Vuela  : " + this.getOrigen());
        System.out.println("Pelaje : " + this.getPelaje());
    }

    void habla() {
        System.out.println("HOLA HOLA");
    }

    void saluda() {
        System.out.println("Buenos días");
    }

    void volar() {
        this.setEstado("Volando");
    }

    // GETTERES Y SETTERS

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean getHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    
    public boolean getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }


}

