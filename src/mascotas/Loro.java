package mascotas;
class Loro extends Ave {

    // Atributos
    private String origen;
    private boolean habla;

    // Constructor
    Loro(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela, String origen, boolean habla) {
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
        System.out.println("Origen : " + this.getOrigen());
        System.out.println("Habla  : " + this.getHabla());
        
    }

    void habla() {
        System.out.println("HOLA HOLA");
<<<<<<< HEAD
        System.out.println("HOLA CROCROOO");
=======
        System.out.println("HOLA HOLA esto es Otra Prueba123");
>>>>>>> branch 'andrei_leila' of https://github.com/RodrigoPerdiguero/TrabajoED.git
    }
    void saluda() {
        System.out.println("Buenos d�as");
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

}
