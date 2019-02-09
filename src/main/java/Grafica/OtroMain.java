/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Ui.UI;

/**
 *
 * @author Usuario
 */
public class OtroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UI ui = new UI();
        Background background = new Background();
        ui.inite(ui, background);
//        Login login = new Login(ui, background);
        
        Login loginVista = new Login(ui, background);
        //HomeDirectivo homeDirectivoVista = new HomeDirectivo(ui, background);
        
        loginVista.entrar(background);
        
        
//        loginVista.salir(background);
        //homeDirectivoVista.entrar(background);
        //homeDirectivoVista.salir(background);
        
        
//        Materia materiaVista = new Materia(ui,background);
//        
//        
//        materiaVista.entrar(background);
        
        //materiaVista.salir(background);
        //background.transicion();
    }
    
}
