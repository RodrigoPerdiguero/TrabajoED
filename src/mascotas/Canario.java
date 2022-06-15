package mascotas;
class Canario extends Ave {

    // Atributos
    private String color;
    private boolean canta;
    private String patas;
    // Constructor
    Canario(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela, String color, boolean canta, String patas) {
        super(nombre, edad, estado, fechaNac, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNac());
        System.out.println("Pico   : " + this.getPico());
        System.out.println("Vuela  : " + this.getVuela());
        System.out.println("Color  : " + this.getColor());
        System.out.println("Canta  : " + this.getCanta());
    }

    void habla() 
        System.out.println("PIO PIO" + this.getNombre() + this.getEdad());
    }

    void saluda() {
        System.out.println("Hola hola, como estas?");
    }

    void volar() {
        this.setEstado("Volando" + this.getVuela());
    }
    
    // GETTERES Y SETTERS


    public String getColor() {
        return color;
    }

    public void setColor(String origen) {
        this.color = origen;
    }

    public boolean getCanta() {
        return canta;
    }

    public void setCanta(boolean habla) {
        this.canta = habla;
    }

    public boolean getPatas() {
        return patas;
    }

    public void setPatas(String patas) {
        this.patas = patas;
    }
}
