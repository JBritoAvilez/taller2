import javax.swing.JOptionPane;
/**
 * @author Jonathan Emilio Brito Avilez
 */
public class ShuttleVehicle extends Spaceships implements Flight{

    /**
     * Creación de los atributos de la clase VehículoLanzadera los cuales son:
     * Carga
     * Diámetro
     * Escenario
     */
    public String load;
    public float diameter;
    public int stage;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores a los atributos
     */
    public ShuttleVehicle(){
        super();
        load = "";
        diameter = 0;
        stage = 0;
    }

    public ShuttleVehicle(String name, float height, float mass,String load, float diameter, int stage) {
        super(name, height, mass);
        this.load = load;
        this.diameter = diameter;
        this.stage = stage;
    }


    /**
     * Implementación de los métodos modificadores para los atributos de la clase
     */
    public void setLoad(String load) {
        this.load = load;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    /**
     * Implementación de los métodos selectores para obtener el valor de los atributos
     */
    public String getLoad() {
        return load;
    }
    public float getDiameter() {
        return diameter;
    }

    public int getStage() {
        return stage;
    }

    /**
     * Se sobrescribe en la clase NaveLanzadora los métodos abstractos de Despegar() y
     * VelocidadOrbital()
     */
    @Override
    public void takeoff(){
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