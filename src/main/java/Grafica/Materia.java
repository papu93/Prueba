package Grafica;

import Ui.UI;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import Controller.CursoController;
import Controller.UsuarioController;
import Model.Alumno;
import Model.Persona;
import java.util.Date;
import javax.swing.JComponent; 
public final class Materia {

    JLabel labelData1;
    JLabel labelMarco;
    JLabel labelData2;
    JLabel labelData3;
    JLabel labelData4;
    JLabel labelData5;
    JLabel labelData1d;
    JLabel labelData2d;
    JLabel labelData3d;
    JLabel labelData4d;
    JLabel labelData5d;
    JPanel panelHerramientas;
    JLabel labelBuscar;
    JPanel panelTabla;
    JTextField textFieldBuscarAlumno;
    JLabel labelOrdenar;
    JComboBox comboBoxOrdenar;
    JLabel labelMostrar;
    JComboBox comboBoxMostrar;
    JButton buttonBuscarAlumno;
    JLabel labelEditarNotas;
    JButton buttonEditarNotas;
    JButton buttonGuardarNotas;
    JLabel labelEditarAsistencia;
    JButton buttonEditarAsistencia;
    JButton buttonGuardarAsistencia;
    JTable tablaMateria;

    public Materia(UI ui, Background background) {
        this.labelData1 = new JLabel();
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

        this.labelMarco = new JLabel();
        labelMarco.setBounds(40, 25, 700, 160);
        labelMarco.setBorder(BorderFactory.createLineBorder(Color.white));
        labelMarco.setOpaque(false);
        // labelData1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        background.getPanel1().add(labelMarco);

        this.labelData2 = new JLabel();
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

        this.labelData3 = new JLabel();
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

        this.labelData4 = new JLabel();
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

        this.labelData5 = new JLabel();
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

        this.labelData1d = new JLabel();
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

        this.labelData2d = new JLabel();
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

        this.labelData3d = new JLabel();
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

        this.labelData4d = new JLabel();
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

        this.labelData5d = new JLabel();
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

        this.panelHerramientas = new JPanel();
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

        this.labelBuscar = new JLabel();
        labelBuscar.setBounds(10, 30, 100, 20);
        labelBuscar.setFont(ui.getFontPrimaria());
        labelBuscar.setText("Buscar:");
        labelBuscar.setForeground(Color.white);
        labelBuscar.setOpaque(false);
        labelBuscar.setHorizontalAlignment(JLabel.RIGHT);
        labelBuscar.setBackground(ui.getColorbase160());
        panelHerramientas.add(labelBuscar);

        this.textFieldBuscarAlumno = new JTextField();
        textFieldBuscarAlumno.setBounds(120, 30, 180, 20);
        textFieldBuscarAlumno.setFont(ui.getFontSecundaria());
        panelHerramientas.add(textFieldBuscarAlumno);

        this.labelOrdenar = new JLabel();
        labelOrdenar.setBounds(10, 70, 100, 20);
        labelOrdenar.setFont(ui.getFontPrimaria());
        labelOrdenar.setText("Ordenar:");
        labelOrdenar.setForeground(Color.white);
        labelOrdenar.setOpaque(false);
        labelOrdenar.setHorizontalAlignment(JLabel.RIGHT);
        labelOrdenar.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelOrdenar);

        this.comboBoxOrdenar = new JComboBox();
        comboBoxOrdenar.setBounds(120, 70, 200, 20);
        comboBoxOrdenar.setFont(ui.getFontSecundaria());
        comboBoxOrdenar.addItem("Alfabeticamente");
        comboBoxOrdenar.addItem("Inasistencias");
        comboBoxOrdenar.addItem("Promedio");
        panelHerramientas.add(comboBoxOrdenar);

        this.labelMostrar = new JLabel();
        labelMostrar.setBounds(10, 110, 100, 20);
        labelMostrar.setFont(ui.getFontPrimaria());
        labelMostrar.setText("Mostrar:");
        labelMostrar.setOpaque(false);
        labelMostrar.setForeground(Color.white);
        labelMostrar.setHorizontalAlignment(JLabel.RIGHT);
        labelMostrar.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelMostrar);

        this.comboBoxMostrar = new JComboBox();
        comboBoxMostrar.setBounds(120, 110, 200, 20);
        comboBoxMostrar.setFont(ui.getFontSecundaria());
        comboBoxMostrar.addItem("Aprobados");
        comboBoxMostrar.addItem("Desaprobados");
        comboBoxMostrar.addItem("Libres");
        panelHerramientas.add(comboBoxMostrar);

        this.buttonBuscarAlumno = new JButton("/IMGBuscar.jpg");
        buttonBuscarAlumno.setBounds(300, 30, 20, 20);
//        buttonBuscarAlumno.setIcon(new Image.getImage(getClass().getResource("IMGBuscar.jpg"))));
        buttonBuscarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //BUSCAR EN SQL
            }
        });
        panelHerramientas.add(buttonBuscarAlumno);

        this.labelEditarNotas = new JLabel();
        labelEditarNotas.setBounds(360, 80, 100, 20);
        labelEditarNotas.setFont(ui.getFontPrimaria());
        labelEditarNotas.setText("Notas");
        labelEditarNotas.setOpaque(false);
        labelEditarNotas.setForeground(Color.white);
        labelEditarNotas.setHorizontalAlignment(JLabel.CENTER);
        labelEditarNotas.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelEditarNotas);

        this.buttonEditarNotas = new JButton("IMGEditar.png");
        buttonEditarNotas.setBounds(375, 105, 30, 30);
//        buttonEditarNotas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGEditar.png"))));
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

        this.buttonGuardarNotas = new JButton("IMGGuardarEnBase.png");
        buttonGuardarNotas.setBounds(410, 105, 30, 30);
//        buttonGuardarNotas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGGuardarEnBase.png"))));
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

        this.labelEditarAsistencia = new JLabel();
        labelEditarAsistencia.setBounds(360, 20, 100, 20);
        labelEditarAsistencia.setFont(ui.getFontPrimaria());
        labelEditarAsistencia.setText("Asistencia");
        labelEditarAsistencia.setOpaque(false);
        labelEditarAsistencia.setForeground(Color.white);
        labelEditarAsistencia.setHorizontalAlignment(JLabel.CENTER);
        labelEditarAsistencia.setBackground(ui.getColorbase200());
        panelHerramientas.add(labelEditarAsistencia);

        this.buttonEditarAsistencia = new JButton("IMGEditar.png");
        buttonEditarAsistencia.setBounds(375, 45, 30, 30);
//        buttonEditarAsistencia.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGEditar.png"))));
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

        this.buttonGuardarAsistencia = new JButton("IMGGuardarEnBase.png");
        buttonGuardarAsistencia.setBounds(410, 45, 30, 30);
//        buttonGuardarAsistencia.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMGGuardarEnBase.png"))));
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

        this.panelTabla = new JPanel();
        panelTabla.setBounds(12, 215, 1250, 370);
        panelTabla.setBorder(BorderFactory.createRaisedBevelBorder());
        panelTabla.setLayout(null);
        panelTabla.setBackground(ui.getColorbase());
        panelTabla.setOpaque(true);
        background.getVentana().add(panelTabla);

        //**********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************        
        this.tablaMateria = new JTable();
        this.tablaMateria.setModel(new javax.swing.table.DefaultTableModel(

           //datos por defecto a mostrar

           new Object [][] {

               {null, null, null, null, null} //fila uno

           },

           //nombre de las columnas

           new String [] {

               "DNI", "Apellido", "Nombre", "Fecha Nacimiento", "Dirección"

           }

       ) {

           Class[] types = new Class [] {

               //tipo de dato de cada columna

               //

               java.lang.String.class, java.lang.String.class, java.lang.String.class, Date.class, java.lang.String.class

           };

           boolean[] canEdit = new boolean [] {

               //indica si se puede editar o no una celda -> para nuestro caso siempre en false

               false, false, false, false, false

           };

           @Override

           public Class getColumnClass(int columnIndex) {

               return types [columnIndex];

           }



           @Override

           public boolean isCellEditable(int rowIndex, int columnIndex) {

               return canEdit [columnIndex];

           }

       });
        tablaMateria.setBounds(5, 5, 1240, 360);
        tablaMateria.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
        
        //JComponent jc;
        tablaMateria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        //JTable.setViewportView(tablaMateria);
        
        this.materiaPanel();
        this.cargarTabla();
        this.panelTabla.add(tablaMateria);
        //**********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************

        background.getVentana().add(background.getPanel3());
        background.getVentana().add(background.getPanel2());
        background.getVentana().add(background.getPanel1());
        background.getVentana().setSize(ui.getResolucionHorizontal(), ui.getResolucionVertical());
        background.getVentana().repaint();
        background.getVentana().setLayout(null);
        background.getVentana().setVisible(true);
        background.getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    Materia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void entrar(Background background) {
        this.labelData1.setVisible(true);
        this.labelMarco.setVisible(true);
        this.labelData2.setVisible(true);
        this.labelData3.setVisible(true);
        this.labelData4.setVisible(true);
        this.labelData5.setVisible(true);
        this.labelData1d.setVisible(true);
        this.labelData2d.setVisible(true);
        this.labelData3d.setVisible(true);
        this.labelData4d.setVisible(true);
        this.labelData5d.setVisible(true);
        this.panelHerramientas.setVisible(true);
        this.labelBuscar.setVisible(true);
        this.panelTabla.setVisible(true);
        this.textFieldBuscarAlumno.setVisible(true);
        this.labelOrdenar.setVisible(true);
        this.comboBoxOrdenar.setVisible(true);
        this.labelMostrar.setVisible(true);
        this.comboBoxMostrar.setVisible(true);
        this.buttonBuscarAlumno.setVisible(true);
        this.labelEditarNotas.setVisible(true);
        this.buttonEditarNotas.setVisible(true);
        this.buttonGuardarNotas.setVisible(true);
        this.labelEditarAsistencia.setVisible(true);
        this.buttonEditarAsistencia.setVisible(true);
        this.buttonGuardarAsistencia.setVisible(true);
        
        this.tablaMateria.setVisible(true);

    }

    public void salir(Background background) {
        this.labelData1.setVisible(false);
        this.labelMarco.setVisible(false);
        this.labelData2.setVisible(false);
        this.labelData3.setVisible(false);
        this.labelData4.setVisible(false);
        this.labelData5.setVisible(false);
        this.labelData1d.setVisible(false);
        this.labelData2d.setVisible(false);
        this.labelData3d.setVisible(false);
        this.labelData4d.setVisible(false);
        this.labelData5d.setVisible(false);
        this.panelHerramientas.setVisible(false);
        this.labelBuscar.setVisible(false);
        
        
        this.panelTabla.setVisible(false);
        
        
        this.textFieldBuscarAlumno.setVisible(false);
        this.labelOrdenar.setVisible(false);
        this.comboBoxOrdenar.setVisible(false);
        this.labelMostrar.setVisible(false);
        this.comboBoxMostrar.setVisible(false);
        this.buttonBuscarAlumno.setVisible(false);
        this.labelEditarNotas.setVisible(false);
        this.buttonEditarNotas.setVisible(false);
        this.buttonGuardarNotas.setVisible(false);
        this.labelEditarAsistencia.setVisible(false);
        this.buttonEditarAsistencia.setVisible(false);
        this.buttonGuardarAsistencia.setVisible(false);
    
        
        this.tablaMateria.setVisible(false);
        this.panelTabla.setVisible(false);

    
    }

    public JLabel getLabelData1() {
        return labelData1;
    }

    public void setLabelData1(JLabel labelData1) {
        this.labelData1 = labelData1;
    }

    public JLabel getLabelMarco() {
        return labelMarco;
    }

    public void setLabelMarco(JLabel labelMarco) {
        this.labelMarco = labelMarco;
    }

    public JLabel getLabelData2() {
        return labelData2;
    }

    public void setLabelData2(JLabel labelData2) {
        this.labelData2 = labelData2;
    }

    public JLabel getLabelData3() {
        return labelData3;
    }

    public void setLabelData3(JLabel labelData3) {
        this.labelData3 = labelData3;
    }

    public JLabel getLabelData4() {
        return labelData4;
    }

    public void setLabelData4(JLabel labelData4) {
        this.labelData4 = labelData4;
    }

    public JLabel getLabelData5() {
        return labelData5;
    }

    public void setLabelData5(JLabel labelData5) {
        this.labelData5 = labelData5;
    }

    public JLabel getLabelData1d() {
        return labelData1d;
    }

    public void setLabelData1d(JLabel labelData1d) {
        this.labelData1d = labelData1d;
    }

    public JLabel getLabelData2d() {
        return labelData2d;
    }

    public void setLabelData2d(JLabel labelData2d) {
        this.labelData2d = labelData2d;
    }

    public JLabel getLabelData3d() {
        return labelData3d;
    }

    public void setLabelData3d(JLabel labelData3d) {
        this.labelData3d = labelData3d;
    }

    public JLabel getLabelData4d() {
        return labelData4d;
    }

    public void setLabelData4d(JLabel labelData4d) {
        this.labelData4d = labelData4d;
    }

    public JLabel getLabelData5d() {
        return labelData5d;
    }

    public void setLabelData5d(JLabel labelData5d) {
        this.labelData5d = labelData5d;
    }

    public JPanel getPanelHerramientas() {
        return panelHerramientas;
    }

    public void setPanelHerramientas(JPanel panelHerramientas) {
        this.panelHerramientas = panelHerramientas;
    }

    public JLabel getLabelBuscar() {
        return labelBuscar;
    }

    public void setLabelBuscar(JLabel labelBuscar) {
        this.labelBuscar = labelBuscar;
    }

    public JPanel getPanelTabla() {
        return panelTabla;
    }

    public void setPanelTabla(JPanel panelTabla) {
        this.panelTabla = panelTabla;
    }

    public JTextField getTextFieldBuscarAlumno() {
        return textFieldBuscarAlumno;
    }

    public void setTextFieldBuscarAlumno(JTextField textFieldBuscarAlumno) {
        this.textFieldBuscarAlumno = textFieldBuscarAlumno;
    }

    public JLabel getLabelOrdenar() {
        return labelOrdenar;
    }

    public void setLabelOrdenar(JLabel labelOrdenar) {
        this.labelOrdenar = labelOrdenar;
    }

    public JComboBox getComboBoxOrdenar() {
        return comboBoxOrdenar;
    }

    public void setComboBoxOrdenar(JComboBox comboBoxOrdenar) {
        this.comboBoxOrdenar = comboBoxOrdenar;
    }

    public JLabel getLabelMostrar() {
        return labelMostrar;
    }

    public void setLabelMostrar(JLabel labelMostrar) {
        this.labelMostrar = labelMostrar;
    }

    public JComboBox getComboBoxMostrar() {
        return comboBoxMostrar;
    }

    public void setComboBoxMostrar(JComboBox comboBoxMostrar) {
        this.comboBoxMostrar = comboBoxMostrar;
    }

    public JButton getButtonBuscarAlumno() {
        return buttonBuscarAlumno;
    }

    public void setButtonBuscarAlumno(JButton buttonBuscarAlumno) {
        this.buttonBuscarAlumno = buttonBuscarAlumno;
    }

    public JLabel getLabelEditarNotas() {
        return labelEditarNotas;
    }

    public void setLabelEditarNotas(JLabel labelEditarNotas) {
        this.labelEditarNotas = labelEditarNotas;
    }

    public JButton getButtonEditarNotas() {
        return buttonEditarNotas;
    }

    public void setButtonEditarNotas(JButton buttonEditarNotas) {
        this.buttonEditarNotas = buttonEditarNotas;
    }

    public JButton getButtonGuardarNotas() {
        return buttonGuardarNotas;
    }

    public void setButtonGuardarNotas(JButton buttonGuardarNotas) {
        this.buttonGuardarNotas = buttonGuardarNotas;
    }

    public JLabel getLabelEditarAsistencia() {
        return labelEditarAsistencia;
    }

    public void setLabelEditarAsistencia(JLabel labelEditarAsistencia) {
        this.labelEditarAsistencia = labelEditarAsistencia;
    }

    public JButton getButtonEditarAsistencia() {
        return buttonEditarAsistencia;
    }

    public void setButtonEditarAsistencia(JButton buttonEditarAsistencia) {
        this.buttonEditarAsistencia = buttonEditarAsistencia;
    }

    public JButton getButtonGuardarAsistencia() {
        return buttonGuardarAsistencia;
    }

    public void setButtonGuardarAsistencia(JButton buttonGuardarAsistencia) {
        this.buttonGuardarAsistencia = buttonGuardarAsistencia;
    }

    public JTable getTablaMateria() {
        return tablaMateria;
    }

    public void setTablaMateria(JTable tablaMateria) {
        this.tablaMateria = tablaMateria;
        
    }
    private CursoController cursoController;
    
    
    public void cargarTabla(){
        List<Model.Alumno> alumnos = this.cursoController.getAll();
        this.cleanTable();
        DefaultTableModel modelo = (DefaultTableModel) this.tablaMateria.getModel();
        for (Model.Alumno alumno : alumnos) {
            Object[] row = {alumno.getPersona().getDni(), alumno.getPersona().getApellido(), alumno.getPersona().getNombre(), alumno.getPersona().getFechaNacimiento(), alumno.getPersona().getDireccion() };

            modelo.addRow(row);
             
        }
    }

    private void cleanTable(){
        DefaultTableModel model = (DefaultTableModel) this.tablaMateria.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }    

     

    public void materiaPanel() {
        
        this.cursoController = new CursoController();
        
    }
}
