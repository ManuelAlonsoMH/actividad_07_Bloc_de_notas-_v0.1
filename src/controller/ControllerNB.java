package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelNB;
import view.ViewNB;
/**
 *
 * @author alons
 */
public class ControllerNB implements ActionListener{
    
    private final ModelNB modelNB;
    private final ViewNB viewNB;
    
    public ControllerNB(ModelNB modelNB, ViewNB viewNB){
        this.modelNB = modelNB;
        this.viewNB = viewNB;
        viewNB.jmi_leer.addActionListener(this);
        viewNB.jmi_guardar.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewNB.jmi_leer){
            modelNB.setPath("C:\\Users\\alons\\Documents\\Escuela\\LeerEscribir.txt");
            modelNB.readFile(modelNB.getPath());      
            viewNB.jta_texto.setText(modelNB.getMessage());
        }else if(e.getSource()==viewNB.jmi_guardar){
            modelNB.setPath("C:\\Users\\alons\\Documents\\Escuela\\LeerEscribir.txt");
            modelNB.setMessage(viewNB.jta_texto.getText());
            modelNB.writeFile(modelNB.getPath(), modelNB.getMessage());
        }
    }
    private void initView() {
        viewNB.setTitle("NOTAS");
        viewNB.setResizable(false);
        viewNB.setLocationRelativeTo(null);
        viewNB.setVisible(true);
    }   
}
