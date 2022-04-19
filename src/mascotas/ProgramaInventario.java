package mascotas;
public class ProgramaInventario {
    
    public static void main(String args[]) {
        
        // Creamos unas cuantas mascotas
        Perro p1 = new Perro("bolo",5, "jugando", "Feb-2019", "Pastor alemán", false);
        Perro p2 = new Perro("Babe", 7, "durmiendo", "Abril-2020", "Rottweiler", false);
        Gato g1 = new Gato("Misi", 2, "durmiendo", "Sept-2017", "negro", false);
        Gato g2 = new Gato("Lunares", 2, "rascandose", "Julio-2021", "blanco", true);
        Loro l1 = new Loro("Lasi", 10, "hablando", "Enero-2022", "largo", true, "Murcia", true);
        Canario c1 = new Canario("Lorillo", 6, "piando", "Dic-2019", "corto", true, "amarillo", true);
        
        // Creamos inventario
        Inventario inventario = new Inventario();
        
        // Añadimos mascotas al inventario
        inventario.insertarAnimal(p1);
        inventario.insertarAnimal(p2);
        inventario.insertarAnimal(g1);
        inventario.insertarAnimal(g2);
        inventario.insertarAnimal(l1);
        inventario.insertarAnimal(c1);
        
        // Mostramos lista de animales
        inventario.mostrarListaAnimales();
        System.out.println("");
        
        // Mostramos todos los animales
        inventario.mostrarTodosAnimales();
        
        // Eliminamos un par de mascotas
        inventario.eliminarAnimal(1);
        inventario.eliminarAnimal(2);
        
        // Mostramos lista de animales
        inventario.mostrarListaAnimales();
        System.out.println("");
        
    }
    
}
