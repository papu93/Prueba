/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Controller.UsuarioController;
import Ui.UI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario
 */
public class Login {

    JLabel labelTitulo;
    JLabel labelUsuario;
    JTextField textFieldUsuario;
    JLabel labelPass;
    JPasswordField textFieldPass;
    JButton buttonEntrar;
    JLabel labelDescripcion;

    public Login(UI ui, Background background) {
        this.labelTitulo = new JLabel();
        labelTitulo.setBounds(0, 0, 400, 100);
        labelTitulo.setText("SiVGE");
        labelTitulo.setFont(ui.getFontTitulo());
        labelTitulo.setForeground(Color.white);
        labelTitulo.setVerticalAlignment(JLabel.CENTER);
        labelTitulo.setOpaque(false);
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
        background.getPanel2().add(labelTitulo);

        this.labelUsuario = new JLabel();
        labelUsuario.setBounds(0, 125, 150, 30);
        labelUsuario.setText("DNI: ");
        labelUsuario.setFont(ui.getFontPrimaria());
        labelUsuario.setForeground(Color.white);
        labelUsuario.setHorizontalAlignment(JLabel.RIGHT);
        labelUsuario.setVerticalAlignment(JLabel.CENTER);
        background.getPanel2().add(labelUsuario);

        this.textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(150, 125, 200, 30);
        textFieldUsuario.setFont(ui.getFontSecundaria());
        this.textFieldUsuario.setVisible(true);
        background.getPanel2().add(textFieldUsuario);

        this.labelPass = new JLabel();
        labelPass.setBounds(0, 160, 150, 30);
        labelPass.setText("CONTRASEÑA: ");
        labelPass.setFont(ui.getFontPrimaria());
        labelPass.setForeground(Color.white);
        labelPass.setHorizontalAlignment(JLabel.RIGHT);
        labelPass.setVerticalAlignment(JLabel.CENTER);
        background.getPanel2().add(labelPass);

        this.textFieldPass = new JPasswordField();
        textFieldPass.setBounds(150, 160, 200, 30);
        textFieldPass.setFont(ui.getFontSecundaria());
        background.getPanel2().add(textFieldPass);

        this.buttonEntrar = new JButton();
        buttonEntrar.setBounds(230, 215, 120, 40);
        buttonEntrar.setText("Iniciar Sesion");
        buttonEntrar.setFont(ui.getFontSecundaria());
        buttonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String password = new String(textFieldPass.getPassword());
                boolean result =  UsuarioController.Login(textFieldUsuario.getText(), password);
    
                if(result) {
                    Materia materiaVista = new Materia(ui,background);
                    materiaVista.entrar(background);
                    background.getVentana().repaint();//SwingUtilities.updateComponentTreeUI(background.ventana);//Login.salir(ui, background);
                } else
                    System.out.println("asdasdasdasdasdasdasdasdas");
            }
        });
        background.getPanel2().add(buttonEntrar);

        this.labelDescripcion = new JLabel();
        labelDescripcion.setText("Sistema Virtual De Gestion Escolar");
        labelDescripcion.setFont(ui.getFontSubtitulo());
        labelDescripcion.setBounds(485, 35, 310, 40);
        labelDescripcion.setHorizontalAlignment(JLabel.CENTER);
        labelDescripcion.setVerticalAlignment(JLabel.BOTTOM);
        background.getPanel3().add(labelDescripcion);

        background.getVentana().add(background.getPanel3());
        background.getVentana().add(background.getPanel2());
        background.getVentana().add(background.getPanel1());
        background.getVentana().setSize(ui.getResolucionHorizontal(), ui.getResolucionVertical());
        background.getVentana().repaint();
        background.getVentana().setLayout(null);
        background.getVentana().setVisible(true);
        background.getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void entrar(Background background) {
        background.getPanel2().setVisible(true);
        this.labelDescripcion.setVisible(true);
    }

    public void salir(Background background) {
        background.getPanel2().setVisible(false);
        this.labelDescripcion.setVisible(false);
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }

    public void setLabelTitulo(JLabel labelTitulo) {
        this.labelTitulo = labelTitulo;
    }

    public JLabel getLabelUsuario() {
        return labelUsuario;
    }

    public void setLabelUsuario(JLabel labelUsuario) {
        this.labelUsuario = labelUsuario;
    }

    public JTextField getTextFieldUsuario() {
        return textFieldUsuario;
    }

    public void setTextFieldUsuario(JTextField textFieldUsuario) {
        this.textFieldUsuario = textFieldUsuario;
    }

    public JLabel getLabelPass() {
        return labelPass;
    }

    public void setLabelPass(JLabel labelPass) {
        this.labelPass = labelPass;
    }

    public JPasswordField getTextFieldPass() {
        return textFieldPass;
    }

    public void setTextFieldPass(JPasswordField textFieldPass) {
        this.textFieldPass = textFieldPass;
    }

    public JButton getButtonEntrar() {
        return buttonEntrar;
    }

    public void setButtonEntrar(JButton buttonEntrar) {
        this.buttonEntrar = buttonEntrar;
    }

    public JLabel getLabelDescripcion() {
        return labelDescripcion;
    }

    public void setLabelDescripcion(JLabel labelDescripcion) {
        this.labelDescripcion = labelDescripcion;
    }
    
    

        

}


// Variables declaration - do not modify                     
// End of variables declaration                   

