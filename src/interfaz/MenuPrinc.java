/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Logica.Manejadora;
import java.applet.AudioClip;
 /**
 *
 * @author Carlos Elguedo
 */
public class MenuPrinc extends javax.swing.JPanel {

    
    
    /**
     * Creates new form Menu
     */
    
    public MenuPrinc() {
        initComponents();
        iniciaSonido();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenTitulo = new javax.swing.JLabel();
        panelDeBot = new javax.swing.JPanel();
        botUnjugador = new javax.swing.JButton();
        botDosjugadores = new javax.swing.JButton();
        botConf = new javax.swing.JButton();
        botCeditos = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();
        imgCarga = new javax.swing.JLabel();
        TextCarga = new javax.swing.JLabel();

        setBackground(new java.awt.Color(12, 245, 26));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        setForeground(new java.awt.Color(51, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 600));

        ImagenTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ImagenTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/titulo.png"))); // NOI18N

        panelDeBot.setBackground(new java.awt.Color(102, 255, 102));
        panelDeBot.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null), "Menu Inicial"));
        panelDeBot.setForeground(new java.awt.Color(102, 255, 102));
        panelDeBot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botUnjugador.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        botUnjugador.setText("Dos jugadores");
        botUnjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botUnjugadorActionPerformed(evt);
            }
        });

        botDosjugadores.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        botDosjugadores.setText("Damas Clasico");
        botDosjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDosjugadoresActionPerformed(evt);
            }
        });

        botConf.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        botConf.setText("Configuraraciones");
        botConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfActionPerformed(evt);
            }
        });

        botCeditos.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        botCeditos.setText("Creditos");
        botCeditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCeditosActionPerformed(evt);
            }
        });

        botSalir.setFont(new java.awt.Font("Tekton Pro", 2, 18)); // NOI18N
        botSalir.setText("Salir");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeBotLayout = new javax.swing.GroupLayout(panelDeBot);
        panelDeBot.setLayout(panelDeBotLayout);
        panelDeBotLayout.setHorizontalGroup(
            panelDeBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeBotLayout.createSequentialGroup()
                .addGroup(panelDeBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeBotLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panelDeBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botUnjugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botDosjugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botConf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(botCeditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDeBotLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelDeBotLayout.setVerticalGroup(
            panelDeBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeBotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botUnjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botDosjugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botConf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botCeditos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        imgCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loading.gif"))); // NOI18N

        TextCarga.setForeground(new java.awt.Color(0, 0, 204));
        TextCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCarga.setText("Cargando...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(panelDeBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(imgCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagenTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(panelDeBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(TextCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botUnjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botUnjugadorActionPerformed
        AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/aleluya.wav"));
            sonido.play();
        Manejadora obj = new Manejadora();
        obj.UnJugador();
    }//GEN-LAST:event_botUnjugadorActionPerformed

    private void botConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfActionPerformed
        AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/aleluya.wav"));
            sonido.play();
        Manejadora obj = new Manejadora();
        obj.Configuracion();
    }//GEN-LAST:event_botConfActionPerformed

    private void botDosjugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDosjugadoresActionPerformed
        AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/aleluya.wav"));
            sonido.play();
        Manejadora obj = new Manejadora();
        obj.DosJugadores();
    }//GEN-LAST:event_botDosjugadoresActionPerformed

    private void botCeditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCeditosActionPerformed
        AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/aleluya.wav"));
            sonido.play();
        Manejadora obj = new Manejadora();
        obj.Creditos();
    }//GEN-LAST:event_botCeditosActionPerformed

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        Manejadora obj = new Manejadora();
        obj.Salir();
    }//GEN-LAST:event_botSalirActionPerformed

    public void iniciaSonido(){
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenTitulo;
    private javax.swing.JLabel TextCarga;
    private javax.swing.JButton botCeditos;
    private javax.swing.JButton botConf;
    private javax.swing.JButton botDosjugadores;
    private javax.swing.JButton botSalir;
    private javax.swing.JButton botUnjugador;
    private javax.swing.JLabel imgCarga;
    private javax.swing.JPanel panelDeBot;
    // End of variables declaration//GEN-END:variables
}
