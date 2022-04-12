/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Intel i3-4010U
 */
public class Match extends javax.swing.JFrame {

    private Integer player1;
    private Integer player2;

    private Pokemon pokemonUm = gerarPokemon();
    private Pokemon pokemonDois = gerarPokemon();

    public Match(int player1, int player2) {
        this.player1 = player1;
        this.player2 = player2;

        initComponents();
        playerOne(player1);
        playerTwo(player2);

        menu.setBackground(new Color(0, 0, 0, 0));
        overlay.setBackground(new Color(0, 0, 0));
        overlay2.setBackground(new Color(0, 0, 0));
        overlay.setVisible(false);
        attackButton2.setEnabled(false);
        attackButton2.setBackground(new Color(200,200,200));
        
        attackButton.setBackground(new Color(200,200,200));
        
        switch (player2) {

            case 1:
                picachu2.setVisible(false);
                break;
            case 2:
                charizard2.setVisible(false);
                break;
            case 3:
                snorlax2.setVisible(false);
                break;
            case 4:
                charmander2.setVisible(false);
                break;
            case 5:
                bulbasaur2.setVisible(false);
                break;
        }

        attackButton.setBackground(new Color(220, 10, 45));
        attackButton2.setBackground(new Color(220, 10, 45));

        lifeLevel.setText(Double.toString(Math.round(pokemonUm.getVida())));
        lifeLevel2.setText(Double.toString(Math.round(pokemonDois.getVida())));
    }

    public Match() {
        initComponents();
    }

    private void playerOne(int player1) {

        switch (player1) {

            case 1:
                picachu.setVisible(true);
                charizard.setVisible(false);
                snorlax.setVisible(false);
                charmander.setVisible(false);
                bulbasaur.setVisible(false);
                break;
            case 2:
                charizard.setVisible(true);
                picachu.setVisible(false);
                snorlax.setVisible(false);
                charmander.setVisible(false);
                bulbasaur.setVisible(false);
                break;
            case 3:
                snorlax.setVisible(true);
                charmander.setVisible(false);
                bulbasaur.setVisible(false);
                charizard.setVisible(false);
                picachu.setVisible(false);
                break;
            case 4:
                charmander.setVisible(true);
                bulbasaur.setVisible(false);
                snorlax.setVisible(false);
                charizard.setVisible(false);
                picachu.setVisible(false);
                break;
            case 5:
                bulbasaur.setVisible(true);
                charmander.setVisible(false);
                snorlax.setVisible(false);
                charizard.setVisible(false);
                picachu.setVisible(false);
                break;
        }
    }

    private void playerTwo(int player2) {

        switch (player2) {

            case 1:
                picachu2.setVisible(true);
                charizard2.setVisible(false);
                charmander2.setVisible(false);
                snorlax2.setVisible(false);
                bulbasaur2.setVisible(false);
                break;
            case 2:
                charizard2.setVisible(true);
                charmander2.setVisible(false);
                picachu2.setVisible(false);
                bulbasaur2.setVisible(false);
                snorlax2.setVisible(false);
                break;
            case 3:
                snorlax2.setVisible(true);
                charmander2.setVisible(false);
                charizard2.setVisible(false);
                bulbasaur2.setVisible(false);
                picachu2.setVisible(false);
                break;
            case 4:
                charmander2.setVisible(true);
                bulbasaur2.setVisible(false);
                snorlax2.setVisible(false);
                charizard2.setVisible(false);
                picachu2.setVisible(false);
                break;
            case 5:
                bulbasaur2.setVisible(true);
                charmander2.setVisible(false);
                snorlax2.setVisible(false);
                charizard2.setVisible(false);
                picachu2.setVisible(false);
                break;
        }

    }

    private Pokemon gerarPokemon() {

        double vida = 100.0;
        double defesa = 5 + Math.round(Math.random() * 10);
        double ataque = 5 + Math.round(Math.random() * 150);
        double dano = (vida + defesa) - ataque;

        Pokemon pokemon = new Pokemon(vida, defesa, dano, ataque);

        return pokemon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        playerTitle2 = new javax.swing.JLabel();
        playerTitle1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        overlay = new javax.swing.JButton();
        picachu = new javax.swing.JLabel();
        charizard = new javax.swing.JLabel();
        snorlax = new javax.swing.JLabel();
        charmander = new javax.swing.JLabel();
        bulbasaur = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lifeLevel = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        damageLevel = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        overlay2 = new javax.swing.JButton();
        picachu2 = new javax.swing.JLabel();
        charizard2 = new javax.swing.JLabel();
        snorlax2 = new javax.swing.JLabel();
        charmander2 = new javax.swing.JLabel();
        bulbasaur2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lifeLevel2 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        attackButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        damageLevel2 = new javax.swing.JTextPane();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        playerTitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player2 P.png"))); // NOI18N
        jPanel1.add(playerTitle2);
        playerTitle2.setBounds(700, 10, 183, 54);

        playerTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player1P.png"))); // NOI18N
        jPanel1.add(playerTitle1);
        playerTitle1.setBounds(70, 10, 183, 59);

        jPanel4.setBackground(new java.awt.Color(255, 204, 3));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.setPreferredSize(new java.awt.Dimension(246, 300));

        overlay.setBackground(new java.awt.Color(255, 255, 255));
        overlay.setText("VEZ DO PLAYER 2");

        picachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/picachuCerto.png"))); // NOI18N

        charizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charizardCerto.png"))); // NOI18N

        snorlax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/snorlaxCerto.png"))); // NOI18N

        charmander.setBackground(new java.awt.Color(204, 204, 204));
        charmander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmanderCerto.png"))); // NOI18N

        bulbasaur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bulbasaurCerto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picachu, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charizard, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(snorlax, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(charmander, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap(63, Short.MAX_VALUE)
                    .addComponent(bulbasaur)
                    .addContainerGap()))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bulbasaur, charizard, charmander, picachu, snorlax});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overlay, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(charizard, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picachu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(snorlax, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(charmander)
                    .addContainerGap(17, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(bulbasaur, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bulbasaur, charizard, charmander, picachu, snorlax});

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("VIDA:");

        attackButton.setForeground(new java.awt.Color(255, 51, 0));
        attackButton.setText("ATACAR");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("DANO:");

        lifeLevel.setEditable(false);
        lifeLevel.setFocusable(false);
        jScrollPane5.setViewportView(lifeLevel);

        damageLevel.setEditable(false);
        damageLevel.setFocusable(false);
        jScrollPane6.setViewportView(damageLevel);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(attackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(70, 70, 320, 390);

        jPanel3.setBackground(new java.awt.Color(255, 204, 3));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.setPreferredSize(new java.awt.Dimension(246, 300));

        overlay2.setBackground(new java.awt.Color(255, 255, 255));
        overlay2.setText("VEZ DO PLAYER 1");

        picachu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/picachuCerto.png"))); // NOI18N

        charizard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charizardCerto.png"))); // NOI18N

        snorlax2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/snorlaxCerto.png"))); // NOI18N

        charmander2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmanderCerto.png"))); // NOI18N

        bulbasaur2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bulbasaurCerto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picachu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(charizard2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(snorlax2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(charmander2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(bulbasaur2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(overlay2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(charizard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(picachu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(snorlax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(27, 27, 27)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(charmander2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(bulbasaur2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(overlay2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lifeLevel2.setEditable(false);
        lifeLevel2.setFocusable(false);
        jScrollPane2.setViewportView(lifeLevel2);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("VIDA:");

        attackButton2.setForeground(new java.awt.Color(255, 51, 0));
        attackButton2.setText("ATACAR");
        attackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButton2ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("DANO:");

        damageLevel2.setEditable(false);
        damageLevel2.setFocusable(false);
        jScrollPane4.setViewportView(damageLevel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attackButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(attackButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(530, 70, 320, 390);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        menu.setBorderPainted(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu);
        menu.setBounds(40, 470, 60, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scene.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-40, -40, 1080, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        new MenuScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed

        double dano = 3 + Math.round(Math.random() * 50);
        pokemonUm.setDano(dano);
        pokemonDois.setVida(pokemonDois.getVida() - pokemonUm.getDano());
        lifeLevel2.setText(Double.toString(Math.round(pokemonDois.getVida())));
        damageLevel2.setText(Double.toString(Math.round(pokemonUm.getDano())));
        attackButton.setEnabled(false);
        attackButton.setBackground(new Color(200,200,200));
        attackButton2.setEnabled(true);
        overlay.setVisible(true);
        overlay2.setVisible(false);

        switch (player1) {

            case 1:
                picachu.setVisible(false);
                break;
            case 2:
                charizard.setVisible(false);
                break;
            case 3:
                snorlax.setVisible(false);
                break;
            case 4:
                charmander.setVisible(false);
                break;
            case 5:
                bulbasaur.setVisible(false);
                break;
        }

        switch (player2) {

            case 1:
                picachu2.setVisible(true);
                break;
            case 2:
                charizard2.setVisible(true);
                break;
            case 3:
                snorlax2.setVisible(true);
                break;
            case 4:
                charmander2.setVisible(true);
                break;
            case 5:
                bulbasaur2.setVisible(true);
                break;
        }

        if (pokemonUm.getDano() < 0.0) {
            damageLevel2.setText("0.0");
        }

        if (pokemonDois.getVida() > 100.0) {
            pokemonDois.setVida(100.0);
            lifeLevel2.setText(Double.toString(Math.round(pokemonDois.getVida())));
        }

        if (pokemonDois.getVida() < 0.0) {
            new GameOver(1).setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_attackButtonActionPerformed

    private void attackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButton2ActionPerformed

        double dano = 3 + Math.round(Math.random() * 50);
        pokemonDois.setDano(dano);
        pokemonUm.setVida(pokemonUm.getVida() - pokemonDois.getDano());
        lifeLevel.setText(Double.toString(Math.round(pokemonUm.getVida())));
        damageLevel.setText(Double.toString(Math.round(pokemonUm.getDano())));
        attackButton2.setEnabled(false);
        attackButton2.setBackground(new Color(200,200,200));
        attackButton.setEnabled(true);
        overlay2.setVisible(true);
        overlay.setVisible(false);

        switch (player1) {

            case 1:
                picachu.setVisible(true);
                break;
            case 2:
                charizard.setVisible(true);
                break;
            case 3:
                snorlax.setVisible(true);
                break;
            case 4:
                charmander.setVisible(true);
                break;
            case 5:
                bulbasaur.setVisible(true);
                break;
        }

        switch (player2) {

            case 1:
                picachu2.setVisible(false);
                break;
            case 2:
                charizard2.setVisible(false);
                break;
            case 3:
                snorlax2.setVisible(false);
                break;
            case 4:
                charmander2.setVisible(false);
                break;
            case 5:
                bulbasaur2.setVisible(false);
                break;
        }

        if (pokemonDois.getDano() < 0.0) {
            damageLevel.setText("0.0");
        }

        if (pokemonUm.getVida() > 100.0) {
            pokemonUm.setVida(100.0);
            lifeLevel.setText(Double.toString(Math.round(pokemonUm.getVida())));
        }

        if (pokemonUm.getVida() < 0.0) {
            new GameOver(2).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_attackButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Match().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackButton;
    private javax.swing.JButton attackButton2;
    private javax.swing.JLabel bulbasaur;
    private javax.swing.JLabel bulbasaur2;
    private javax.swing.JLabel charizard;
    private javax.swing.JLabel charizard2;
    private javax.swing.JLabel charmander;
    private javax.swing.JLabel charmander2;
    private javax.swing.JTextPane damageLevel;
    private javax.swing.JTextPane damageLevel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane lifeLevel;
    private javax.swing.JTextPane lifeLevel2;
    private javax.swing.JButton menu;
    private javax.swing.JButton overlay;
    private javax.swing.JButton overlay2;
    private javax.swing.JLabel picachu;
    private javax.swing.JLabel picachu2;
    private javax.swing.JLabel playerTitle1;
    private javax.swing.JLabel playerTitle2;
    private javax.swing.JLabel snorlax;
    private javax.swing.JLabel snorlax2;
    // End of variables declaration//GEN-END:variables
}
