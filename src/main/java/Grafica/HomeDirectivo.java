/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Ui.UI;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Usuario
 */
public class HomeDirectivo {

    JPanel panelHomeDirectivoSI;
    JPanel panelHomeDirectivoSD;
    JPanel panelHomeDirectivoII;
    JPanel panelHomeDirectivoID;
    JLabel labelTituloSI;
    JLabel labelBuscarSI;
    JButton buttonBuscarAlumnoSI;
    JLabel labelTituloSD;
    JLabel labelBuscarSD;
    JTextField textFieldBuscarAlumnoSD;
    JButton buttonBuscarAlumnoSD;
    JLabel labelTituloII;
    JLabel labelBuscarII;
    JComboBox comboBoxBuscarII;
    JLabel labelTituloID;
    JLabel labelBuscarID;
    JTextField textFieldBuscarID;
    JButton buttonBuscarID;
    JButton buttonAddUsuarioID;
    JButton buttonModificarUsuarioID;

    public HomeDirectivo(UI ui, Background background) {
        this.panelHomeDirectivoSI = new JPanel();
        panelHomeDirectivoSI.setBounds(230, 225, 400, 150);
        panelHomeDirectivoSI.setBackground(ui.getColorbase());
        panelHomeDirectivoSI.setBorder(BorderFactory.createEtchedBorder());
        panelHomeDirectivoSI.setLayout(null);
        background.getVentana().add(panelHomeDirectivoSI);

        this.panelHomeDirectivoSD = new JPanel();
        panelHomeDirectivoSD.setBounds(650, 225, 400, 150);
        panelHomeDirectivoSD.setBorder(BorderFactory.createEtchedBorder());
        panelHomeDirectivoSD.setBackground(ui.getColorbase());
        panelHomeDirectivoSD.setLayout(null);
        background.getVentana().add(panelHomeDirectivoSD);

        this.panelHomeDirectivoII = new JPanel();
        panelHomeDirectivoII.setBounds(230, 400, 400, 150);
        panelHomeDirectivoII.setBorder(BorderFactory.createEtchedBorder());
        panelHomeDirectivoII.setBackground(ui.getColorbase());
        panelHomeDirectivoII.setLayout(null);
        background.getVentana().add(panelHomeDirectivoII);

        this.panelHomeDirectivoID = new JPanel();
        panelHomeDirectivoID.setBounds(650, 400, 400, 150);
        panelHomeDirectivoID.setBorder(BorderFactory.createEtchedBorder());
        panelHomeDirectivoID.setBackground(ui.getColorbase());
        panelHomeDirectivoID.setLayout(null);
        background.getVentana().add(panelHomeDirectivoID);

        //SI
        this.labelTituloSI = new JLabel();
        labelTituloSI.setBounds(325, 5, 70, 30);
        labelTituloSI.setText("Alumnos ");
        labelTituloSI.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloSI.setFont(ui.getFontPrimaria());
        labelTituloSI.setForeground(Color.WHITE);
        labelTituloSI.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoSI.add(labelTituloSI);

        this.labelBuscarSI = new JLabel();
        labelBuscarSI.setBounds(30, 75, 100, 20);
        labelBuscarSI.setText("Buscar: ");
        labelBuscarSI.setFont(ui.getFontPrimaria());
        labelBuscarSI.setForeground(Color.WHITE);
        labelBuscarSI.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoSI.add(labelBuscarSI);

        JTextField textFieldBuscarAlumnoSI = new JTextField();
        textFieldBuscarAlumnoSI.setBounds(130, 75, 180, 20);
        textFieldBuscarAlumnoSI.setFont(ui.getFontSecundaria());
        panelHomeDirectivoSI.add(textFieldBuscarAlumnoSI);

        this.buttonBuscarAlumnoSI = new JButton();
        buttonBuscarAlumnoSI.setBounds(310, 75, 20, 20);
        //buttonBuscarAlumnoSI.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg")))); PARA SOLUCIONAR
        buttonBuscarAlumnoSI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoSI.add(buttonBuscarAlumnoSI);

        //SD
        this.labelTituloSD = new JLabel();
        labelTituloSD.setBounds(5, 5, 80, 30);
        labelTituloSD.setText(" Docentes");
        labelTituloSD.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloSD.setFont(ui.getFontPrimaria());
        labelTituloSD.setForeground(Color.WHITE);
        labelTituloSD.setHorizontalAlignment(SwingConstants.LEFT);
        panelHomeDirectivoSD.add(labelTituloSD);

        this.labelBuscarSD = new JLabel();
        labelBuscarSD.setBounds(30, 75, 100, 20);
        labelBuscarSD.setText("Buscar: ");
        labelBuscarSD.setFont(ui.getFontPrimaria());
        labelBuscarSD.setForeground(Color.WHITE);
        labelBuscarSD.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoSD.add(labelBuscarSD);

        this.textFieldBuscarAlumnoSD = new JTextField();
        textFieldBuscarAlumnoSD.setBounds(130, 75, 180, 20);
        textFieldBuscarAlumnoSD.setFont(ui.getFontSecundaria());
        panelHomeDirectivoSD.add(textFieldBuscarAlumnoSD);

        this.buttonBuscarAlumnoSD = new JButton();
        buttonBuscarAlumnoSD.setBounds(310, 75, 20, 20);
        //buttonBuscarAlumnoSD.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg")))); PARA SOLUCIONAR
        buttonBuscarAlumnoSD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoSD.add(buttonBuscarAlumnoSD);

        //II
        this.labelTituloII = new JLabel();
        labelTituloII.setBounds(335, 5, 60, 30);
        labelTituloII.setText("Cursos ");
        labelTituloII.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloII.setFont(ui.getFontPrimaria());
        labelTituloII.setForeground(Color.WHITE);
        labelTituloII.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoII.add(labelTituloII);

        this.labelBuscarII = new JLabel();
        labelBuscarII.setBounds(30, 75, 100, 20);
        labelBuscarII.setText("Buscar: ");
        labelBuscarII.setFont(ui.getFontPrimaria());
        labelBuscarII.setForeground(Color.WHITE);
        labelBuscarII.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoII.add(labelBuscarII);

        this.comboBoxBuscarII = new JComboBox();
        comboBoxBuscarII.setBounds(130, 75, 200, 20);
        comboBoxBuscarII.setFont(ui.getFontSecundaria());
        panelHomeDirectivoII.add(comboBoxBuscarII);
        comboBoxBuscarII.addItem("Matematica 1B");
        comboBoxBuscarII.addItem("Lengua 2C");
        comboBoxBuscarII.addItem("ED Fisica 1A");
        comboBoxBuscarII.addItem("Historia 1A");
        comboBoxBuscarII.addItem("Quimica 9Q");
        comboBoxBuscarII.addItem("ED Sexual Integral 3A");
        comboBoxBuscarII.addItem("Control de la ira 2K");

        //ID
        this.labelTituloID = new JLabel();
        labelTituloID.setBounds(5, 5, 75, 30);
        labelTituloID.setText(" Usuarios");
        labelTituloID.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloID.setFont(ui.getFontPrimaria());
        labelTituloID.setForeground(Color.WHITE);
        labelTituloID.setHorizontalAlignment(SwingConstants.LEFT);
        panelHomeDirectivoID.add(labelTituloID);

        this.labelBuscarID = new JLabel();
        labelBuscarID.setBounds(30, 50, 100, 20);
        labelBuscarID.setText("Buscar: ");
        labelBuscarID.setFont(ui.getFontPrimaria());
        labelBuscarID.setForeground(Color.WHITE);
        labelBuscarID.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoID.add(labelBuscarID);

        this.textFieldBuscarID = new JTextField();
        textFieldBuscarID.setBounds(130, 50, 180, 20);
        textFieldBuscarID.setFont(ui.getFontSecundaria());
        panelHomeDirectivoID.add(textFieldBuscarID);

        this.buttonBuscarID = new JButton();
        buttonBuscarID.setBounds(310, 50, 20, 20);
        //buttonBuscarID.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg")))); PARA SOLUCIONAR
        buttonBuscarID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoID.add(buttonBuscarID);

        this.buttonAddUsuarioID = new JButton();
        buttonAddUsuarioID.setBounds(80, 90, 100, 30);
        buttonAddUsuarioID.setText("Añadir");
        buttonAddUsuarioID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoID.add(buttonAddUsuarioID);

        this.buttonModificarUsuarioID = new JButton();
        buttonModificarUsuarioID.setBounds(220, 90, 100, 30);
        buttonModificarUsuarioID.setText("Modificar");
        buttonModificarUsuarioID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoID.add(buttonModificarUsuarioID);

    }

    public void entrar(Background background) {
        this.panelHomeDirectivoSI.setVisible(true);
        this.panelHomeDirectivoSD.setVisible(true);
        this.panelHomeDirectivoII.setVisible(true);
        this.panelHomeDirectivoID.setVisible(true);
        

    }

    public void salir(Background background) {
        this.panelHomeDirectivoSI.setVisible(false);
        this.panelHomeDirectivoSD.setVisible(false);
        this.panelHomeDirectivoII.setVisible(false);
        this.panelHomeDirectivoID.setVisible(false);
        

    }

    public JPanel getPanelHomeDirectivoSI() {
        return panelHomeDirectivoSI;
    }

    public void setPanelHomeDirectivoSI(JPanel panelHomeDirectivoSI) {
        this.panelHomeDirectivoSI = panelHomeDirectivoSI;
    }

    public JPanel getPanelHomeDirectivoSD() {
        return panelHomeDirectivoSD;
    }

    public void setPanelHomeDirectivoSD(JPanel panelHomeDirectivoSD) {
        this.panelHomeDirectivoSD = panelHomeDirectivoSD;
    }

    public JPanel getPanelHomeDirectivoII() {
        return panelHomeDirectivoII;
    }

    public void setPanelHomeDirectivoII(JPanel panelHomeDirectivoII) {
        this.panelHomeDirectivoII = panelHomeDirectivoII;
    }

    public JPanel getPanelHomeDirectivoID() {
        return panelHomeDirectivoID;
    }

    public void setPanelHomeDirectivoID(JPanel panelHomeDirectivoID) {
        this.panelHomeDirectivoID = panelHomeDirectivoID;
    }

    public JLabel getLabelTituloSI() {
        return labelTituloSI;
    }

    public void setLabelTituloSI(JLabel labelTituloSI) {
        this.labelTituloSI = labelTituloSI;
    }

    public JLabel getLabelBuscarSI() {
        return labelBuscarSI;
    }

    public void setLabelBuscarSI(JLabel labelBuscarSI) {
        this.labelBuscarSI = labelBuscarSI;
    }

    public JButton getButtonBuscarAlumnoSI() {
        return buttonBuscarAlumnoSI;
    }

    public void setButtonBuscarAlumnoSI(JButton buttonBuscarAlumnoSI) {
        this.buttonBuscarAlumnoSI = buttonBuscarAlumnoSI;
    }

    public JLabel getLabelTituloSD() {
        return labelTituloSD;
    }

    public void setLabelTituloSD(JLabel labelTituloSD) {
        this.labelTituloSD = labelTituloSD;
    }

    public JLabel getLabelBuscarSD() {
        return labelBuscarSD;
    }

    public void setLabelBuscarSD(JLabel labelBuscarSD) {
        this.labelBuscarSD = labelBuscarSD;
    }

    public JTextField getTextFieldBuscarAlumnoSD() {
        return textFieldBuscarAlumnoSD;
    }

    public void setTextFieldBuscarAlumnoSD(JTextField textFieldBuscarAlumnoSD) {
        this.textFieldBuscarAlumnoSD = textFieldBuscarAlumnoSD;
    }

    public JButton getButtonBuscarAlumnoSD() {
        return buttonBuscarAlumnoSD;
    }

    public void setButtonBuscarAlumnoSD(JButton buttonBuscarAlumnoSD) {
        this.buttonBuscarAlumnoSD = buttonBuscarAlumnoSD;
    }

    public JLabel getLabelTituloII() {
        return labelTituloII;
    }

    public void setLabelTituloII(JLabel labelTituloII) {
        this.labelTituloII = labelTituloII;
    }

    public JLabel getLabelBuscarII() {
        return labelBuscarII;
    }

    public void setLabelBuscarII(JLabel labelBuscarII) {
        this.labelBuscarII = labelBuscarII;
    }

    public JComboBox getComboBoxBuscarII() {
        return comboBoxBuscarII;
    }

    public void setComboBoxBuscarII(JComboBox comboBoxBuscarII) {
        this.comboBoxBuscarII = comboBoxBuscarII;
    }

    public JLabel getLabelTituloID() {
        return labelTituloID;
    }

    public void setLabelTituloID(JLabel labelTituloID) {
        this.labelTituloID = labelTituloID;
    }

    public JLabel getLabelBuscarID() {
        return labelBuscarID;
    }

    public void setLabelBuscarID(JLabel labelBuscarID) {
        this.labelBuscarID = labelBuscarID;
    }

    public JTextField getTextFieldBuscarID() {
        return textFieldBuscarID;
    }

    public void setTextFieldBuscarID(JTextField textFieldBuscarID) {
        this.textFieldBuscarID = textFieldBuscarID;
    }

    public JButton getButtonBuscarID() {
        return buttonBuscarID;
    }

    public void setButtonBuscarID(JButton buttonBuscarID) {
        this.buttonBuscarID = buttonBuscarID;
    }

    public JButton getButtonAddUsuarioID() {
        return buttonAddUsuarioID;
    }

    public void setButtonAddUsuarioID(JButton buttonAddUsuarioID) {
        this.buttonAddUsuarioID = buttonAddUsuarioID;
    }

    public JButton getButtonModificarUsuarioID() {
        return buttonModificarUsuarioID;
    }

    public void setButtonModificarUsuarioID(JButton buttonModificarUsuarioID) {
        this.buttonModificarUsuarioID = buttonModificarUsuarioID;
    }

}
