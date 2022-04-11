import javax.swing.JOptionPane;
/**
 * @author Jonatha Emilio Brito Avilez
 */

public class MannedSpaceship extends  Spaceships implements Flight{

    /**
     * Creación de los atributos de la clase NaveEspacialTripulada los cuales son:
     * Altura de la cápsula
     * Altura del cohete
     * Miembro de la tripulación
     */
    public float capsuleHeight,rocketHeight;
    private int crewMember;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores a los atributos
     */
    public MannedSpaceship(String name, float height, float mass,float capsuleHeight,float rocketHeight,int crewMember) {
        super(name, height, mass);
        this.capsuleHeight= capsuleHeight;
        this.rocketHeight= rocketHeight;
        this.crewMember= crewMember;

    }
    public MannedSpaceship(){
        super();
        capsuleHeight= 0;
        rocketHeight= 0;
        crewMember= 0;
    }

    /**
     * Implementación de los métodos modificadores para los atributos de la clase
     */

    public void setCapsuleHeight(float capsuleHeight) {
        this.capsuleHeight = capsuleHeight;
    }

    public void setRocketHeight(float rocketHeight) {
        this.rocketHeight = rocketHeight;
    }

    public void setCrewMember(int crewMember) {
        this.crewMember = crewMember;
    }

    /**
     * Implementación de los métodos selectores para obtener el valor de los atributos
     */

    public float getCapsuleHeight() {
        return capsuleHeight;
    }

    public float getRocketHeight() {
        return rocketHeight;
    }

    public int getCrewMember() {
        return crewMember;
    }

    /**
     * Se sobrescribe en la clase NaveTripulada los métodos abstractos de Despegar() y
     * VelocidadOrbital()
     */

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

    @Override
    public void takeoff() {
        if(acceleraTionTakeoff >= 11.19){
            JOptionPane.showInputDialog("su velocidad de despegue es de: "+acceleraTionTakeoff+"k/m");
        }
    }

}