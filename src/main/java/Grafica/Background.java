
package Grafica;

import Ui.UI;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Background {

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel2AlumnoDirectivo;
    JPanel panel2CursoDirectivo;
    JPanel panel2UsuarioDirectivo;
    JPanel panel2ProfesorlumnoDirectivo;
    JFrame ventana;
    
    public Background() {
 
        
    UI ui = new UI();
        
    JFrame frame = new JFrame();
    frame.setTitle(ui.getTitulo() + " " + ui.getVersionado());
    frame.setFont(ui.getFontSubtitulo());
//    frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));
    frame.setIconImage(new ImageIcon("Icon.jpg").getImage());
    frame.setMinimumSize(new Dimension(1280, 720));
    frame.setResizable(false);

    
        JPanel panela = new JPanel();
        JPanel panelb = new JPanel();
        JPanel panelc = new JPanel();

        panela.setBounds(0, 0, ui.getResolucionHorizontal(), 200);
        panela.setBackground(ui.getColorbase());
        panela.setBorder(BorderFactory.createRaisedBevelBorder());
        panela.setLayout(null);

        panelb.setBounds(440, 250, 400, 300);
        panelb.setBackground(ui.getColorbase());
        panelb.setBorder(BorderFactory.createRaisedBevelBorder());
        panelb.setLayout(null);
        

        panelc.setBounds(0, 600, ui.getResolucionHorizontal(), 120);
        panelc.setBackground(ui.getColorbase());
        panelc.setBorder(BorderFactory.createRaisedBevelBorder());
        panelc.setLayout(null);
        
        
        

        this.ventana = frame;
        this.panel1 = panela;
        this.panel2 = panelb;
        this.panel3 = panelc;
    }
    
    public void transicion(){
        this.getVentana().repaint();
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    void setWallpapper() {
            //AGREGAR IMAGEN DE FONDO DE PANTALLA
    }
    
}
