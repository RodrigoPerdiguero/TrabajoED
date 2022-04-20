package mascotas;
public class Perro extends Mascota {

    // Atributos
    private String raza;
    private boolean pulgas;
    private boolean vacunas;

    // Constructor
    Perro(String nombre, int edad, String estado, String fechaNac, String raza, boolean pulgas,boolean vacunas) {
        super(nombre, edad, estado, fechaNac);
        this.raza = raza;
        this.pulgas = pulgas;
        this.vacunas = vacunas;
    }
@Override
    public void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNac());
        System.out.println("Raza   : " + this.getRaza());
        System.out.println("Tiene pulgas : " + this.getPulgas());
        System.out.println("Vacunas : " + this.getVacunas());
    }

  

    // GETTERS Y SETTERS

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    
    public boolean getVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }
}
