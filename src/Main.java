import java.util.Scanner;
import javax.swing.JOptionPane;

/**1
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Main {
    /**
     *Se implementa el método con el menu de opciones de la aplicación
     */
    public static int menu(){
        int opción = 0;
        do{
            opción = Integer.parseInt(JOptionPane.showInputDialog("===== CREACIÓN DE NAVES ESPACIALES PORFAVOR ELIJA CUAL CREAR ===== \n\n"
                    + "1.Creación de nave lanzadora\n"
                    + "2. Creación de nave no tripulada\n"
                    + "3. Creación de nave tripulada\n"
                    + "4. Salir \n"
                    + "\n Seleccione una opción del 1 al 4\""));

        }while (opción <=0 || opción > 4);
        return opción;


    }

    /**
     *Se crea el método que permite captura la información correspondiente de las Naves Espaciales
     *Se pasa como parámetro un objeto de la clase NavesEspaciales para enviar la información capturada
     *a los respectivos métodos modificadores
     */
    public static void CapturarDatos(Spaceships Ss){

        String N = JOptionPane.showInputDialog("Escribe el nombre que desea tener su nave");
        Ss.setName(N);
        float H = Float.parseFloat(JOptionPane.showInputDialog("Pofavor digite la Altura de su nave, la cual se tomara la medidas en M"));
        Ss.setHeight(H);
        float M =Float.parseFloat(JOptionPane.showInputDialog("Pofavor digite la Masa de su nave, la cual se tomara la medidas en Tonelada"));
        Ss.setMass(M);
        float AT =Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite la velocidad de despegue la cual debe de ser mayor a 11.19 K/s"));
        Ss.setAcceleraTionTakeoff(AT);

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Se crea los objetos de las clases NaveLanzadora(SV), NaveNoTripulada(US) y
         * NAveTripulada(MS)
         */

        ShuttleVehicle SV = new ShuttleVehicle();
        UnmannedSpaceShip US = new UnmannedSpaceShip();
        MannedSpaceship MS = new MannedSpaceship();

        int option;
        do{
            option = menu();
            switch(option){
                case 1:
                    /**
                     * En la primera opción del menu se capta la información de la NaveLanzadora y
                     * se ejecutan los comandos
                     */
                    CapturarDatos(SV);
                    String L = JOptionPane.showInputDialog("Porfavor digite la Carga que desas llevar");
                    SV.setLoad(L);
                    float D = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite el Diámetro que sea tener su nave"));
                    SV.setDiameter(D);
                    int S = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite el numero de Etapas que deseas tener en tu nave"));
                    SV.setStage(S);
                    JOptionPane.showConfirmDialog(null,"Su nave a sido creada con las siguientes medidas"
                            +"\nEl nombre de tu nave es: "+SV.getName()
                            +"\nTiene una altura de: "+SV.getHeight()+"m"
                            +"\nTiene una masa de: "+SV.getMass()+"t"
                            +"\nTu nave lleva la carga llamada: "+SV.getLoad()
                            +"\nTiene un diámetro de: "+SV.getDiameter()+"m3"
                            +"\nTu nave cuenta con: "+SV.getStage()+" etapas"
                    );
                    SV.takeoff();
                    SV.orbitalSpeed();

                    break;
                case 2:
                    /**
                     * En la primera opción del menu se capta la información de la NaveNoTripulada y
                     * se ejecutan los comandos
                     */
                    CapturarDatos(US);
                    float Le = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite la Longitud de su nave"));
                    US.setLength(Le);
                    float B = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite el Ancho que desea tener su nave"));
                    US.setBroad(B);
                    int En = Integer.parseInt(JOptionPane.showInputDialog("Digite porfavor el numero de Motores que desea tener su nave"));
                    US.setEngines(En);
                    JOptionPane.showInputDialog(null,"Sunave a sido creada con las siguientes medidas"
                            +"\nEl nombre de tu nave es: "+US.getName()
                            +"\nTiene una altura de: "+US.getHeight()+"m"
                            +"\nTiene una masa de: "+US.getMass()+"t"
                            +"\nTiene una longitud de: "+US.getLength()
                            +"\nTiene una Longitud de: "+US.getBroad()
                            +"\nSu nave cuenta con "+US.getEngines()+" motores"
                    );
                    US.takeoff();
                    US.orbitalSpeed();
                    break;
                case 3:
                    /**
                     * En la primera opción del menu se capta la información de la NaveTripulada y
                     * se ejecutan los comandos
                     */
                    CapturarDatos(MS);
                    float CH = Float.parseFloat(JOptionPane.showInputDialog("Porfavod digite la Altura de la capsula la cual estará medida en metros"));
                    MS.setCapsuleHeight(CH);
                    float RH = Float.parseFloat(JOptionPane.showInputDialog("Porfavor digite la Altura que desea tener su cohete el cual estará medido en metro"));
                    MS.setRocketHeight(RH);
                    int CM = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite el Numero de Tripulante que ira en la nave"));
                    MS.setCrewMember(CM);
                    JOptionPane.showInputDialog(null+"Su nave a sido creada con las siguientes medidas"
                            +"\nEl nombre de tu nave es: "+MS.getName()
                            +"\nTiene una altura de: "+MS.getHeight()+"m"
                            +"\nTiene una masa de: "+MS.getMass()+"t"
                            +"\nSu capsula tiene una altura de: "+MS.getCapsuleHeight()+"m"
                            +"\nSu cohete tiene una altura de: "+MS.getRocketHeight()+"m"
                            +"\nLlevas "+MS.getCrewMember()+" tripulantes");
                    MS.takeoff();
                    MS.orbitalSpeed();
                    break;
                case 4:
                    break;
            }
        }while (option !=4);
    }

}
