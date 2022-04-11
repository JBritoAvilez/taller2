/**
 * @author Jonathan Emilio Brito Avilez
 */
public abstract class Spaceships {

    /**
     * Creación de los atributos de la clase NaveEspaciales los cuales son:
     * Nombre
     * Altura
     * Masa
     * Aceleración de despegue
     */
    public String name;
    public float height,mass;
    public float acceleraTionTakeoff = (float) 11.19;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores a los atributos
     */
    public Spaceships(String name,float height, float mass){
        this.name = name;
        this.height = height;
        this.mass = mass;
    }

    public Spaceships(){
        name = "";
        height = 0;
        mass = 0;
    }

    /**
     * Implementación de los métodos modificadores para los atributos de la clase
     */

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getMass() {
        return mass;
    }

    public float getAcceleraTionTakeoff() {
        return acceleraTionTakeoff;
    }

    /**
     * Implementación de los métodos selectores para obtener el valor de los atributos
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public void setAcceleraTionTakeoff(float acceleraTionTakeoff) {
        this.acceleraTionTakeoff = acceleraTionTakeoff;
    }

    public abstract void takeoff();

    /**
     * Se declara los métodos abstractos Despegar() y VElocidadOrbital(), este método no
     * tiene cuerpo y debe ser sobrescrito para ser implementado en las clases hijas que
     * se creen de la clase NavesEspaciales
     */
    public abstract void orbitalSpeed();
}
