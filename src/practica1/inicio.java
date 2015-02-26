package practica1;
import javax.swing.JOptionPane;

public class inicio extends javax.swing.JFrame {

    private jugadores listaJugadores;
    private menuCatalogo plantas;
    private menuCatalogo zombies;
    private Catalogo p,z;  //p->cat. plantas z->cat. zombies 
    int ancho=0,alto=0;
    
    
    public inicio() {
        initComponents();
        listaJugadores=new jugadores();
        p=new Catalogo();
        z=new Catalogo();
        /*listaJugadores.add(1, "planta", 14);
        listaJugadores.add(2, "zombie", 15);
        listaJugadores.otros(1, "P");
        listaJugadores.otros(2, "Z");
        listaJugadores.otros(1, "L");
        listaJugadores.otros(2, "O");
        listaJugadores.otros(1, "A");
        listaJugadores.otros(2, "M");    
        //listaJugadores.grafica();*/
        
        p.add(1,0,0,"planta1", "planta1.gif", 54, 1);
        p.add(1,0,0,"planta2", "planta2.gif", 90, 0);
        p.add(1,0,0,"planta3", "planta3.gif", 60, 0);
        p.add(1,0,0,"planta4", "planta4.gif", 70, 0);
        p.add(1,0,0,"planta6", "planta6.gif", 100, 1);
        p.add(1,0,0,"planta7", "planta7.gif", 110, 1);
        
        z.add(2, 0, 0, "zombiee1","z2.gif", 90, 0);
        z.add(2, 0, 0, "zombiee2","z3.gif", 80, 0);
        z.add(2, 0, 0, "zombiee3","z4.gif", 70, 0);
        z.add(2, 0, 0, "zombiee4","z5.gif", 60, 0);
        z.add(2, 0, 0, "zombiee5","z1.gif", 50, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Nb.ScrollPane.Border.color"));
        jLabel1.setText("Plantas vrs Zombies");

        jButton1.setText("Jugador Plantas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Jugador Zombies");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comenzar Juego");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(277, 277, 277))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jMenu1.setText("Catalogo");

        jMenuItem1.setText("Plantas...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Zombies...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Graficas");

        jMenuItem3.setText("Jugadores...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem5.setText("Catalogos...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Plantas...");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Zombies...");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Tablero");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pantalla2 p0=new pantalla2();
        p0.lista=listaJugadores;
        p0.actual=1; //planta
        p0.setVisible(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pantalla2 z0=new pantalla2();
        z0.lista=listaJugadores;
        z0.actual=2;  //zombie
        z0.setVisible(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean resp=listaJugadores.completa();
        
        if(resp==true && !p.vacia() && !z.vacia()){
            JOptionPane.showMessageDialog(null,"iniciara juego....");
            String anch=JOptionPane.showInputDialog(null,"Ingrese el ancho del tablero");
            String alt=JOptionPane.showInputDialog(null,"Ingrese el alto del tablero");
            ancho=Integer.parseInt(anch);
            alto=Integer.parseInt(alt);
            JOptionPane.showMessageDialog(null,"tamaño del tablero "+ancho+" x "+alto);

        }else{
            JOptionPane.showMessageDialog(null,"Complete la informacion necesaria antes de iniciar el juego!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        listaJugadores.recorrer();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        plantas=new menuCatalogo();
        plantas.tipo=1;
        plantas.catPersonajes=p;
        plantas.cargarCatalogo();
        plantas.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        zombies=new menuCatalogo();
        zombies.tipo=2;
        zombies.catPersonajes=z;
        zombies.cargarCatalogo();
        zombies.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        listaJugadores.grafica();
        JOptionPane.showMessageDialog(null,"la grafica ha sido creada en: \n /home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/jugadores.png");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String planta=p.contenido();
        String zombiee=z.contenido();
        archivos arch=new archivos();
        arch.archivoCatalogo(planta, zombiee);
        JOptionPane.showMessageDialog(null,"la grafica ha sido creada en: \n /home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/catalogos.png");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}