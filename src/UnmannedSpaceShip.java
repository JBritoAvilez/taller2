import javax.swing.JOptionPane;
/**
 * @author Jonathan Emilio Brito Avilez
 */
public class UnmannedSpaceShip extends Spaceships {

    /**
     * Creación de los atributos de la clase NaveEspacialNoTripulada los cuales son:
     * largo
     * amplio
     * motores
     */
    public float length,broad;
    public int engines;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores a los atributos
     */

    public UnmannedSpaceShip(String name, float height, float mass, float length, float broad, int engines) {
        super(name, height, mass);
        this.length=0;
        this.broad=0;
        this.engines=0;
    }
    public UnmannedSpaceShip(){
        super();
        length = 0;
        broad = 0;
        engines = 0;
    }

    /**
     * Implementación de los métodos modificadores para los atributos de la clase
     */

    public void setLength(float length) {
        this.length = length;
    }

    public void setBroad(float broad) {
        this.broad = broad;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    /**
     * Implementación de los métodos selectores para obtener el valor de los atributos
     */

    public float getLength() {
        return length;
    }

    public float getBroad() {
        return broad;
    }

    public int getEngines() {
        return engines;
    }

    /**
     * Se sobrescribe en la clase NaveLanzadora los métodos abstracto de Despegar() y
     * VelocidadOrbital()
     */
    @Override
    public void takeoff() {
        if(acceleraTionTakeoff >= 11.19){
            JOptionPane.showInputDialog("su velocidad de despegue es de: "+acceleraTionTakeoff+"k/m");
        }
    }

    public void orbitalSpeed(){
        int atmosfera;
        for(int orbita = 0; orbita <101;orbita++){
            atmosfera = orbita + 1;
            System.out.println(atmosfera);
            if(atmosfera > 100){
                this.acceleraTionTakeoff = (float) 7.8;
                JOptionPane.showInputDialog("has llegado a la orbita y tu velocidad disminuyo hasta: "+acceleraTionTakeoff+"k/m");
            }
        }
    }
}
