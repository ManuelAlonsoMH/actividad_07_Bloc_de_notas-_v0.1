
package main;
import model.ModelNB;
import view.ViewNB;
import controller.ControllerNB;
/**
 *
 * @author alons
 */
public class Main {
    private static ModelNB modelNB;
    private static ViewNB viewNB;
    private static ControllerNB controllerNB;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelNB = new ModelNB();
        viewNB = new ViewNB();
        controllerNB = new ControllerNB(modelNB, viewNB);
    }
}
