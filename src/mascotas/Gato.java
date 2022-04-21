package mascotas;
class Gato extends Mascota {

    // Atributos
    private String color;
    private boolean peloLargo;
    
    // Constructor
    Gato(String nombre, int edad, String estado, String fechaNac, String colores, boolean peloLargo) {
        super(nombre, edad, estado, fechaNac);
        this.color = colores;
        this.peloLargo = peloLargo;
    }

    void muestra() {
    	System.out.println("Datos gato: ");
        System.out.println("Nombre   : " + this.getNombre());
        System.out.println("Edad     : " + this.getEdad());
        System.out.println("Estado   : " + this.getEstado());
        System.out.println("Nacido   : " + this.getFechaNac());
        System.out.println("Color    : " + this.getColor());
        System.out.println("PeloLargo: " + this.getPeloLargo());
        System.out.println("Grito    : " + Grito);
    }

    //Gato original
    void habla() {
		System.out.println("MIAU MIAU");
    }

    // GETTERS Y SETTERS
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
}
