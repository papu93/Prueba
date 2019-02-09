/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Grafica.Background;
import Grafica.Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Usuario
 */
public class UI {

    int resolucionVertical = 720;
    int resolucionHorizontal = 1280;
    String titulo = "SiVGE";
    String versionado = "0.0";
    Color colorbase;
    Color colorbase160;
    Color colorbase200;
    Font fontTitulo;
    Font fontSubtitulo;
    Font fontPrimaria;
    Font fontSecundaria;
    Font fontTituloMateria;

    public UI() {
        this.colorbase = new Color(115, 127, 164);
        this.fontTituloMateria = new Font("Arial", Font.BOLD, 24);
        this.colorbase160 = new Color(32 ,40, 77);
        this.colorbase200 = new Color(32, 40, 77);
        this.fontTitulo = new Font("BankGothic Lt BT", Font.BOLD, 64);
        this.fontPrimaria = new Font("Arial", Font.BOLD, 14);
        this.fontSecundaria = new Font("Arial", Font.PLAIN, 14);
        this.fontSubtitulo = new Font("BankGothic Lt BT", Font.BOLD, 14);
    }

    
    public void inite(UI ui,Background background){
        background.getVentana().add(background.getPanel3());
        background.getVentana().add(background.getPanel2());
        background.getVentana().add(background.getPanel1());
        background.getVentana().setSize(ui.getResolucionHorizontal(), ui.getResolucionVertical());
        background.getVentana().setLayout(null);
        background.getVentana().setVisible(true);
        background.getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void ignite(UI ui,Background background) {

        
        JLabel labelTitulo32131231321321321321321321321 = new JLabel();
        labelTitulo32131231321321321321321321321.setBounds(0, 0, 400, 100);
        labelTitulo32131231321321321321321321321.setText("SiVGE");
        labelTitulo32131231321321321321321321321.setFont(this.getFontTitulo());
        labelTitulo32131231321321321321321321321.setForeground(Color.white);
        labelTitulo32131231321321321321321321321.setVerticalAlignment(JLabel.CENTER);
        labelTitulo32131231321321321321321321321.setOpaque(false);
        labelTitulo32131231321321321321321321321.setHorizontalAlignment(JLabel.CENTER);
        background.getPanel2().add(labelTitulo32131231321321321321321321321);

        JLabel labelUsuario = new JLabel();
        labelUsuario.setBounds(0, 125, 150, 30);
        labelUsuario.setText("DNI: ");
        labelUsuario.setFont(this.getFontPrimaria());
        labelUsuario.setForeground(Color.white);
        labelUsuario.setHorizontalAlignment(JLabel.RIGHT);
        labelUsuario.setVerticalAlignment(JLabel.CENTER);
        background.getPanel2().add(labelUsuario);

        JTextField textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(150, 125, 200, 30);
        textFieldUsuario.setFont(this.getFontSecundaria());
        background.getPanel2().add(textFieldUsuario);

        JLabel labelPass = new JLabel();
        labelPass.setBounds(0, 160, 150, 30);
        labelPass.setText("CONTRASEÑA: ");
        labelPass.setFont(this.getFontPrimaria());
        labelPass.setForeground(Color.white);
        labelPass.setHorizontalAlignment(JLabel.RIGHT);
        labelPass.setVerticalAlignment(JLabel.CENTER);
        background.getPanel2().add(labelPass);

        JPasswordField textFieldPass = new JPasswordField();
        textFieldPass.setBounds(150, 160, 200, 30);
        textFieldPass.setFont(this.getFontSecundaria());
        background.getPanel2().add(textFieldPass);

        JButton buttonEntrar = new JButton();
        buttonEntrar.setBounds(230, 215, 120, 40);
        buttonEntrar.setText("Iniciar Sesion");
        buttonEntrar.setFont(this.getFontSecundaria());
        buttonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Login.salir(ui, background);
            }
        });
        background.getPanel2().add(buttonEntrar);
        

        JLabel labelDescripcion = new JLabel();
        labelDescripcion.setText("Sistema Virtual De Gestion Escolar");
        labelDescripcion.setFont(this.getFontSubtitulo());
        labelDescripcion.setBounds(485, 35, 310, 40);
        labelDescripcion.setHorizontalAlignment(JLabel.CENTER);
        labelDescripcion.setVerticalAlignment(JLabel.BOTTOM);
        background.getPanel3().add(labelDescripcion);
        
        //MATERIA
        
        JLabel labelData1 = new JLabel();
        labelData1.setBounds(10, 30, 150, 30);
        labelData1.setText("Materia:");
        labelData1.setFont(ui.getFontTituloMateria());
        labelData1.setForeground(Color.white);
        labelData1.setBackground(ui.getColorbase200());
        labelData1.setVerticalAlignment(JLabel.CENTER);
        labelData1.setOpaque(false);
        labelData1.setHorizontalAlignment(JLabel.RIGHT);
       // labelData1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData1);
        
                JLabel labelMarco = new JLabel();
        labelMarco.setBounds(40, 25, 700, 160);
        labelMarco.setBorder(BorderFactory.createLineBorder(Color.white));
        labelMarco.setOpaque(false);
       // labelData1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelMarco);
        
        
        JLabel labelData2 = new JLabel();
        labelData2.setBounds(10, 70, 150, 20);
        labelData2.setText("Grado:");
        labelData2.setFont(ui.getFontPrimaria());
        labelData2.setForeground(Color.white);
        labelData2.setBackground(ui.getColorbase160());
        labelData2.setVerticalAlignment(JLabel.CENTER);
        labelData2.setOpaque(false);
        labelData2.setHorizontalAlignment(JLabel.RIGHT);
        //labelData2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData2);
        
        JLabel labelData3 = new JLabel();
        labelData3.setBounds(10, 100, 150, 20);
        labelData3.setText("Profesor:");
        labelData3.setFont(ui.getFontPrimaria());
        labelData3.setForeground(Color.white);
        labelData3.setBackground(ui.getColorbase200());
        labelData3.setVerticalAlignment(JLabel.CENTER);
        labelData3.setOpaque(false);
        labelData3.setHorizontalAlignment(JLabel.RIGHT);
        //labelData3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData3);
        
        JLabel labelData4 = new JLabel();
        labelData4.setBounds(10, 130, 150, 20);
        labelData4.setText("Aula:");
        labelData4.setFont(ui.getFontPrimaria());
        labelData4.setForeground(Color.white);
        labelData4.setBackground(ui.getColorbase160());
        labelData4.setVerticalAlignment(JLabel.CENTER);
        labelData4.setOpaque(false);
        labelData4.setHorizontalAlignment(JLabel.RIGHT);
        //labelData4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData4);
        
           JLabel labelData5 = new JLabel();
        labelData5.setBounds(10, 160, 150, 20);
        labelData5.setText("Alumnos:");
        labelData5.setFont(ui.getFontPrimaria());
        labelData5.setForeground(Color.white);
        labelData5.setBackground(ui.getColorbase200());
        labelData5.setVerticalAlignment(JLabel.CENTER);
        labelData5.setOpaque(false);
        labelData5.setHorizontalAlignment(JLabel.RIGHT);
        //labelData5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData5);
        
        JLabel labelData1d = new JLabel();
        labelData1d.setBounds(170, 30, 400, 30);
        labelData1d.setText(" Educacion Fisica Cuantica");
        labelData1d.setFont(ui.getFontTituloMateria());
        labelData1d.setForeground(Color.white);
        labelData1d.setBackground(ui.getColorbase200());
        labelData1d.setVerticalAlignment(JLabel.CENTER);
        labelData1d.setOpaque(false);
        labelData1d.setHorizontalAlignment(JLabel.LEFT);
        //labelData1d.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData1d);
        
        JLabel labelData2d = new JLabel();
        labelData2d.setBounds(170, 70, 400, 20);
        labelData2d.setText(" 4 B");
        labelData2d.setFont(ui.getFontPrimaria());
        labelData2d.setForeground(Color.white);
        labelData2d.setBackground(ui.getColorbase160());
        labelData2d.setVerticalAlignment(JLabel.CENTER);
        labelData2d.setOpaque(false);
        labelData2d.setHorizontalAlignment(JLabel.LEFT);
        //labelData2d.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData2d);
        
        JLabel labelData3d = new JLabel();
        labelData3d.setBounds(170, 100, 400, 20);
        labelData3d.setText(" Nestor Enbloque");
        labelData3d.setFont(ui.getFontPrimaria());
        labelData3d.setForeground(Color.white);
        labelData3d.setBackground(ui.getColorbase200());
        labelData3d.setVerticalAlignment(JLabel.CENTER);
        labelData3d.setOpaque(false);
        labelData3d.setHorizontalAlignment(JLabel.LEFT);
        //labelData3d.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData3d);
        
        JLabel labelData4d = new JLabel();
        labelData4d.setBounds(170, 130, 400, 20);
        labelData4d.setText(" Biblioteca");
        labelData4d.setFont(ui.getFontPrimaria());
        labelData4d.setForeground(Color.white);
        labelData4d.setBackground(ui.getColorbase160());
        labelData4d.setVerticalAlignment(JLabel.CENTER);
        labelData4d.setOpaque(false);
        labelData4d.setHorizontalAlignment(JLabel.LEFT);
        //labelData4d.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData4d);
        
        JLabel labelData5d = new JLabel();
        labelData5d.setBounds(170, 160, 400, 20);
        labelData5d.setText(" 579");
        labelData5d.setFont(ui.getFontPrimaria());
        labelData5d.setForeground(Color.white);
        labelData5d.setBackground(ui.getColorbase200());
        labelData5d.setVerticalAlignment(JLabel.CENTER);
        labelData5d.setOpaque(false);
        labelData5d.setHorizontalAlignment(JLabel.LEFT);
        //labelData5d.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelData5d);
        
        JPanel panelHerramientas = new JPanel();
        panelHerramientas.setBounds(770, 30, 500, 150);
        TitledBorder border = new TitledBorder("Herramientas");
        border.setTitleJustification(TitledBorder.LEADING);
        border.setTitleFont(ui.getFontPrimaria());
        border.setTitlePosition(TitledBorder.TOP);
        border.setTitleColor(Color.white);
        panelHerramientas.setLayout(null);
        panelHerramientas.setBackground(ui.getColorbase());
        panelHerramientas.setBorder(border);
        
        
        background.getPanel1().add(panelHerramientas);
        
        JLabel labelBuscar = new JLabel();
        labelBuscar.setBounds(10, 30, 100, 20);
        labelBuscar.setFont(ui.getFontPrimaria());
        labelBuscar.setText("Buscar:");
        labelBuscar.setForeground(Color.white);
        labelBuscar.setOpaque(false);
        labelBuscar.setHorizontalAlignment(JLabel.RIGHT);
        labelBuscar.setBackground(ui.getColorbase160());
        panelHerramientas.add(labelBuscar);
        
        
        JTextField textFieldBuscarAlumno = new JTextField();
        textFieldBuscarAlumno.setBounds(120, 30, 180, 20);
        textFieldBuscarAlumno.setFont(ui.getFontSecundaria());
        panelHerramientas.add(textFieldBuscarAlumno);
        
        JLabel labelOrdenar = new JLabel();
        labelOrdenar.setBounds(10, 70, 100, 20);
        labelOrdenar.setFont(ui.getFontPrimaria());
        labelOrdenar.setText("Ordenar:");
        labelOrdenar.setForeground(Color.white);
        labelOrdenar.setOpaque(false);
        labelOrdenar.setHorizontalAlignment(JLabel.RIGHT);
        labelOrdenar.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelOrdenar);

        JComboBox comboBoxOrdenar = new JComboBox();
        comboBoxOrdenar.setBounds(120, 70, 200, 20);
        comboBoxOrdenar.setFont(ui.getFontSecundaria());
        comboBoxOrdenar.addItem("Alfabeticamente");
        comboBoxOrdenar.addItem("Inasistencias");
        comboBoxOrdenar.addItem("Promedio");
        panelHerramientas.add(comboBoxOrdenar);
        
        JLabel labelMostrar = new JLabel();
        labelMostrar.setBounds(10, 110, 100, 20);
        labelMostrar.setFont(ui.getFontPrimaria());
        labelMostrar.setText("Mostrar:");
        labelMostrar.setOpaque(false);
        labelMostrar.setForeground(Color.white);
        labelMostrar.setHorizontalAlignment(JLabel.RIGHT);
        labelMostrar.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelMostrar);     
        
        JComboBox comboBoxMostrar = new JComboBox();
        comboBoxMostrar.setBounds(120, 110, 200, 20);
        comboBoxMostrar.setFont(ui.getFontSecundaria());
        comboBoxMostrar.addItem("Aprobados");
        comboBoxMostrar.addItem("Desaprobados");
        comboBoxMostrar.addItem("Libres");
        panelHerramientas.add(comboBoxMostrar);
        
        JButton buttonBuscarAlumno = new JButton();
        buttonBuscarAlumno.setBounds(300, 30, 20, 20);
        buttonBuscarAlumno.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg"))));
        buttonBuscarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHerramientas.add(buttonBuscarAlumno);
        
        JLabel labelEditarNotas = new JLabel();
        labelEditarNotas.setBounds(360, 80, 100, 20);
        labelEditarNotas.setFont(ui.getFontPrimaria());
        labelEditarNotas.setText("Notas");
        labelEditarNotas.setOpaque(false);
        labelEditarNotas.setForeground(Color.white);
        labelEditarNotas.setHorizontalAlignment(JLabel.CENTER);
        labelEditarNotas.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelEditarNotas);
        
        JButton buttonEditarNotas = new JButton();
        buttonEditarNotas.setBounds(375, 105, 30, 30);
        buttonEditarNotas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGEditar.png"))));
        buttonEditarNotas.setBorder(BorderFactory.createRaisedBevelBorder());
        
        buttonEditarNotas.addActionListener(new ActionListener() {   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
              //background.getPanel1().getComponentAt(8, 11).setEnabled(false);
             JPanel panelLis = new JPanel();
             panelLis = (JPanel) background.getPanel1().getComponent(11);
             panelLis.getComponent(8).setEnabled(false);
             panelLis.getComponent(9).setEnabled(true);
                
            }
        });
        panelHerramientas.add(buttonEditarNotas);
        
        JButton buttonGuardarNotas = new JButton();
        buttonGuardarNotas.setBounds(410, 105, 30, 30);
        buttonGuardarNotas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGGuardarEnBase.png"))));
        buttonGuardarNotas.setBorder(BorderFactory.createRaisedBevelBorder());
        buttonGuardarNotas.setEnabled(false);
        buttonGuardarNotas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                             JPanel panelLis = new JPanel();
             panelLis = (JPanel) background.getPanel1().getComponent(11);
             panelLis.getComponent(8).setEnabled(true);
             panelLis.getComponent(9).setEnabled(false);
                    
                
//SQL
            }
        });
        panelHerramientas.add(buttonGuardarNotas);
        
        
        
        JLabel labelEditarAsistencia = new JLabel();
        labelEditarAsistencia.setBounds(360, 20, 100, 20);
        labelEditarAsistencia.setFont(ui.getFontPrimaria());
        labelEditarAsistencia.setText("Asistencia");
        labelEditarAsistencia.setOpaque(false);
        labelEditarAsistencia.setForeground(Color.white);
        labelEditarAsistencia.setHorizontalAlignment(JLabel.CENTER);
        labelEditarAsistencia.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelEditarAsistencia);
        
        JButton buttonEditarAsistencia = new JButton();
        buttonEditarAsistencia.setBounds(375, 45, 30, 30);
        buttonEditarAsistencia.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGEditar.png"))));
        buttonEditarAsistencia.setBorder(BorderFactory.createRaisedBevelBorder());
        buttonEditarAsistencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JPanel panelLis = new JPanel();
             panelLis = (JPanel) background.getPanel1().getComponent(11);
             panelLis.getComponent(11).setEnabled(false);
             panelLis.getComponent(12).setEnabled(true);
                    
                
            }
        });
        panelHerramientas.add(buttonEditarAsistencia);
        
        JButton buttonGuardarAsistencia = new JButton();
        buttonGuardarAsistencia.setBounds(410, 45, 30, 30);
        buttonGuardarAsistencia.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGGuardarEnBase.png"))));
        buttonGuardarAsistencia.setBorder(BorderFactory.createRaisedBevelBorder());
        buttonGuardarAsistencia.setEnabled(false);
        buttonGuardarAsistencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               JPanel panelLis = new JPanel();
             panelLis = (JPanel) background.getPanel1().getComponent(11);
             panelLis.getComponent(11).setEnabled(true);
             panelLis.getComponent(12).setEnabled(false);
                    
                
            }
        });
        panelHerramientas.add(buttonGuardarAsistencia);
        
        JTable tablaMateria = new JTable();
        tablaMateria.setBounds(5, 5,1200, 370);
        //SEGUIR TABLA
        
        
        background.getPanel2().add(tablaMateria);
        
        //HOME DIRECTIVO
        
        JPanel panelHomeDirectivoSI = new JPanel();
        panelHomeDirectivoSI.setBounds(230, 225, 400, 150);
        panelHomeDirectivoSI.setBackground(ui.colorbase);
        panelHomeDirectivoSI.setBorder(BorderFactory.createEtchedBorder());  
        panelHomeDirectivoSI.setLayout(null);
        background.getVentana().add(panelHomeDirectivoSI);
        
        
        
        JPanel panelHomeDirectivoSD = new JPanel();
        panelHomeDirectivoSD.setBounds(650, 225, 400, 150);
        panelHomeDirectivoSD.setBorder(BorderFactory.createEtchedBorder()); 
        panelHomeDirectivoSD.setBackground(ui.colorbase);
        panelHomeDirectivoSD.setLayout(null);
        background.getVentana().add(panelHomeDirectivoSD);
        
        JPanel panelHomeDirectivoII = new JPanel();
        panelHomeDirectivoII.setBounds(230, 400, 400, 150);
        panelHomeDirectivoII.setBorder(BorderFactory.createEtchedBorder()); 
        panelHomeDirectivoII.setBackground(ui.colorbase);
        panelHomeDirectivoII.setLayout(null);
        background.getVentana().add(panelHomeDirectivoII);
        
        
        JPanel panelHomeDirectivoID = new JPanel();
        panelHomeDirectivoID.setBounds(650, 400, 400, 150);
        panelHomeDirectivoID.setBorder(BorderFactory.createEtchedBorder()); 
        panelHomeDirectivoID.setBackground(ui.colorbase);
        panelHomeDirectivoID.setLayout(null);
        background.getVentana().add(panelHomeDirectivoID);    
        
        //SI
        
        JLabel labelTituloSI = new JLabel();
        labelTituloSI.setBounds(325, 5, 70, 30);
        labelTituloSI.setText("Alumnos ");
        labelTituloSI.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloSI.setFont(ui.getFontPrimaria());
        labelTituloSI.setForeground(Color.WHITE);
        labelTituloSI.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoSI.add(labelTituloSI);
        
        JLabel labelBuscarSI = new JLabel();
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
        
        JButton buttonBuscarAlumnoSI = new JButton();
        buttonBuscarAlumnoSI.setBounds(310, 75, 20, 20);
        buttonBuscarAlumnoSI.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg"))));
        buttonBuscarAlumnoSI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoSI.add(buttonBuscarAlumnoSI);
        
        //SD
        
        JLabel labelTituloSD = new JLabel();
        labelTituloSD.setBounds(5, 5, 80, 30);
        labelTituloSD.setText(" Docentes");
        labelTituloSD.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloSD.setFont(ui.getFontPrimaria());
        labelTituloSD.setForeground(Color.WHITE);
        labelTituloSD.setHorizontalAlignment(SwingConstants.LEFT);
        panelHomeDirectivoSD.add(labelTituloSD);
        
        JLabel labelBuscarSD = new JLabel();
        labelBuscarSD.setBounds(30, 75, 100, 20);
        labelBuscarSD.setText("Buscar: ");
        labelBuscarSD.setFont(ui.getFontPrimaria());
        labelBuscarSD.setForeground(Color.WHITE);
        labelBuscarSD.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoSD.add(labelBuscarSD);
        
        JTextField textFieldBuscarAlumnoSD = new JTextField();
        textFieldBuscarAlumnoSD.setBounds(130, 75, 180, 20);
        textFieldBuscarAlumnoSD.setFont(ui.getFontSecundaria());
        panelHomeDirectivoSD.add(textFieldBuscarAlumnoSD);
        
        JButton buttonBuscarAlumnoSD = new JButton();
        buttonBuscarAlumnoSD.setBounds(310, 75, 20, 20);
        buttonBuscarAlumnoSD.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg"))));
        buttonBuscarAlumnoSD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoSD.add(buttonBuscarAlumnoSD);
        
        //II
        
        JLabel labelTituloII = new JLabel();
        labelTituloII.setBounds(335, 5, 60, 30);
        labelTituloII.setText("Cursos ");
        labelTituloII.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloII.setFont(ui.getFontPrimaria());
        labelTituloII.setForeground(Color.WHITE);
        labelTituloII.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoII.add(labelTituloII);
        
        JLabel labelBuscarII = new JLabel();
        labelBuscarII.setBounds(30, 75, 100, 20);
        labelBuscarII.setText("Buscar: ");
        labelBuscarII.setFont(ui.getFontPrimaria());
        labelBuscarII.setForeground(Color.WHITE);
        labelBuscarII.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoII.add(labelBuscarII);
        
        JComboBox comboBoxBuscarII = new JComboBox();
        comboBoxBuscarII.setBounds(130, 75, 200, 20);
        comboBoxBuscarII.setFont(ui.getFontSecundaria());
        panelHomeDirectivoII.add(comboBoxBuscarII); comboBoxBuscarII.addItem("Matematica 1B");comboBoxBuscarII.addItem("Lengua 2C");comboBoxBuscarII.addItem("ED Fisica 1A");comboBoxBuscarII.addItem("Historia 1A");comboBoxBuscarII.addItem("Quimica 9Q");comboBoxBuscarII.addItem("ED Sexual Integral 3A"); comboBoxBuscarII.addItem("Control de la ira 2K");
        
        //ID
        
        JLabel labelTituloID = new JLabel();
        labelTituloID.setBounds(5, 5, 75, 30);
        labelTituloID.setText(" Usuarios");
        labelTituloID.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        labelTituloID.setFont(ui.getFontPrimaria());
        labelTituloID.setForeground(Color.WHITE);
        labelTituloID.setHorizontalAlignment(SwingConstants.LEFT);
        panelHomeDirectivoID.add(labelTituloID);
        
        JLabel labelBuscarID = new JLabel();
        labelBuscarID.setBounds(30, 50, 100, 20);
        labelBuscarID.setText("Buscar: ");
        labelBuscarID.setFont(ui.getFontPrimaria());
        labelBuscarID.setForeground(Color.WHITE);
        labelBuscarID.setHorizontalAlignment(SwingConstants.RIGHT);
        panelHomeDirectivoID.add(labelBuscarID);
        
        JTextField textFieldBuscarID = new JTextField();
        textFieldBuscarID.setBounds(130, 50, 180, 20);
        textFieldBuscarID.setFont(ui.getFontSecundaria());
        panelHomeDirectivoID.add(textFieldBuscarID);
        
        JButton buttonBuscarID = new JButton();
        buttonBuscarID.setBounds(310, 50, 20, 20);
        buttonBuscarID.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGBuscar.jpg"))));
        buttonBuscarID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoID.add(buttonBuscarID);
        
        JButton buttonAddUsuarioID = new JButton();
        buttonAddUsuarioID.setBounds(80, 90, 100, 30);
        buttonAddUsuarioID.setText("Añadir");
        buttonAddUsuarioID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoID.add(buttonAddUsuarioID);
        
        JButton buttonModificarUsuarioID = new JButton();
        buttonModificarUsuarioID.setBounds(220, 90, 100, 30);
        buttonModificarUsuarioID.setText("Modificar");
        buttonModificarUsuarioID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHomeDirectivoID.add(buttonModificarUsuarioID);
        
        background.getVentana().add(background.getPanel3());
        background.getVentana().add(background.getPanel2());
        background.getVentana().add(background.getPanel1());
        background.getVentana().setSize(this.getResolucionHorizontal(), this.getResolucionVertical());
        background.getVentana().setLayout(null);
        background.getVentana().setVisible(true);
        background.getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }
    
    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public void setFontSubtitulo(Font fontSubtitulo) {
        this.fontSubtitulo = fontSubtitulo;
    }
    
    public Font getFontPrimaria() {
        return fontPrimaria;
    }

    public Color getColorbase160() {
        return colorbase160;
    }

    public void setColorbase160(Color colorbase160) {
        this.colorbase160 = colorbase160;
    }

    public Color getColorbase200() {
        return colorbase200;
    }

    public void setColorbase200(Color colorbase200) {
        this.colorbase200 = colorbase200;
    }

    public Font getFontSecundaria() {
        return fontSecundaria;
    }

    public void setFontSecundaria(Font fontSecundaria) {
        this.fontSecundaria = fontSecundaria;
    }

    public void setFontPrimaria(Font fontPrimaria) {
        this.fontPrimaria = fontPrimaria;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public void setFontTitulo(Font fontTitulo) {
        this.fontTitulo = fontTitulo;
    }

    public Color getColorbase() {
        return colorbase;
    }

    public Font getFontTituloMateria() {
        return fontTituloMateria;
    }

    public void setFontTituloMateria(Font fontTituloMateria) {
        this.fontTituloMateria = fontTituloMateria;
    }

    public void setColorbase(Color colorbase) {
        this.colorbase = colorbase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVersionado() {
        return versionado;
    }

    public void setVersionado(String versionado) {
        this.versionado = versionado;
    }

    public int getResolucionVertical() {
        return resolucionVertical;
    }

    public void setResolucionVertical(int resolucionVertical) {
        this.resolucionVertical = resolucionVertical;
    }

    public int getResolucionHorizontal() {
        return resolucionHorizontal;
    }

    public void setResolucionHorizontal(int resolucionHorizontal) {
        this.resolucionHorizontal = resolucionHorizontal;
    }

}
