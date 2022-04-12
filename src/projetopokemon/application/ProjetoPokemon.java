/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopokemon.application;

import view.InitialScreen;

/**
 *
 * @author Intel i3-4010U
 */
public class ProjetoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitialScreen().setVisible(true);
            }

        });

    }

}
