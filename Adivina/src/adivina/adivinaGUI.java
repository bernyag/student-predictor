/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina;

import javax.swing.JOptionPane;

/**
 *
 * @author ianzaidenweber
 */
public class adivinaGUI extends javax.swing.JFrame {

    /**
     * Creates new form adivinaGUI
     */
    public adivinaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Preg = new javax.swing.JTextField();
        btn_Si = new javax.swing.JButton();
        btn_No = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        btn_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Preg.setEditable(false);
        txt_Preg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txt_Preg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Preg.setText("¿Su 2do proyecto fue Damas?");

        btn_Si.setBackground(new java.awt.Color(153, 255, 153));
        btn_Si.setText("Si");
        btn_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiActionPerformed(evt);
            }
        });

        btn_No.setBackground(new java.awt.Color(255, 153, 153));
        btn_No.setText("No");
        btn_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NoActionPerformed(evt);
            }
        });

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Unknown.png"))); // NOI18N
        icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txt_Nombre.setEditable(false);
        txt_Nombre.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_Reset.setBackground(new java.awt.Color(204, 255, 255));
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_No, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Preg, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txt_Nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txt_Preg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_No, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiActionPerformed
        
        if(txt_Preg.getText().equals("¿Su 2do proyecto fue Damas?")){
            txt_Preg.setText("¿Tiene dos nombres?");
        }
        else{
            if(txt_Preg.getText().equals("¿Tiene dos nombres?")){
                txt_Preg.setText("¿Va abajo de 9vno semestre?"); 
            }
            else {
                if(txt_Preg.getText().equals("¿Va abajo de 9vno semestre?")){
                    txt_Preg.setText("¿Va en 4to semestre?");
                }
                else{
                    if(txt_Preg.getText().equals("¿Va en 4to semestre?")){
                        txt_Nombre.setText("Eres Guillermo Jorge Naranjo?");
                        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Naranjo.png")));
                        btn_No.setEnabled(false);
                        btn_Si.setEnabled(false);
                    }
                }
            }
        }
        
         if(txt_Preg.getText().equals("¿Estudia Ing. en Computación?")){
             //Francisco aramburu
             txt_Nombre.setText("Eres Francisco Javier Aramburu?");
             icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Aramburu.png")));
             btn_No.setEnabled(false);
             btn_Si.setEnabled(false);
         }
        if(txt_Preg.getText().equals("¿Es Hombre?")){
             txt_Nombre.setText("Eres Luis Fernando Mendez?");
             icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/LuisF.png")));
             btn_No.setEnabled(false);
             btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿Usa lentes?")){
            txt_Nombre.setText("Eres Ian Zaidenweber?");
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Ian.png")));;
            btn_No.setEnabled(false);
            btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿Es de 6to semestre?")){
            txt_Nombre.setText("Eres Antonino Garcia?");
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/tocino.png")));;
            btn_No.setEnabled(false);
            btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿Estudia Ing. en computación?")){
                txt_Preg.setText("¿Es de 5to semestre?");
            }
        else {
            if(txt_Preg.getText().equals("¿Es de 5to semestre?")){
                txt_Nombre.setText("Eres Alexander Perelman?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Perel.png")));
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
            }  
        }
        
        if(txt_Preg.getText().equals("¿Es Mujer?")){
                txt_Nombre.setText("Eres Andrea de Anda?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Anda.png")));
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿Conecta 4?")){
                txt_Preg.setText("¿Tiene un solo nombre?");
            }
            else{
                if(txt_Preg.getText().equals("¿Tiene un solo nombre?")){
                    txt_Preg.setText("¿Es mujer?");
                }
                else{
                    if(txt_Preg.getText().equals("¿Es mujer?")){
                        txt_Preg.setText("¿tiene lentes?");
                    }
                    else{
                        if(txt_Preg.getText().equals("¿tiene lentes?")){
                            txt_Nombre.setText("Eres Natalia Hernandez?");
                            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Nata.png"))); 
                            btn_No.setEnabled(false);
                            btn_Si.setEnabled(false);
                        }
                    }
                }
            }
        
        if(txt_Preg.getText().equals("¿Va en 6to semestre?")){
            txt_Nombre.setText("Eres Mariano Franco?");
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Mariano.png"))); 
            btn_No.setEnabled(false);
            btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿Tiene lentes?")){
                txt_Nombre.setText("Eres Luis Andres Gomez?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/LuisG.png"))); 
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿usa lentes?")){
            txt_Preg.setText("¿Estudia Inge. en Computacion?");
        }
        else{
             if(txt_Preg.getText().equals("¿Estudia Inge. en Computacion?")){
                txt_Nombre.setText("Eres Andres Miguel Quevedo?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/TheQ.png")));
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
             }
        }
        
        if(txt_Preg.getText().equals("¿Va en 10mo semestre?")){
            txt_Nombre.setText("Eres Mario Galvez?");
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Marius.png")));
            btn_No.setEnabled(false);
            btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿En 8vo?")){
                txt_Nombre.setText("Eres Silvestre Leonardo Gonzalez?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Silver.png")));
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
        }
        
    }//GEN-LAST:event_btn_SiActionPerformed

    private void btn_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NoActionPerformed
        
        if(txt_Preg.getText().equals("¿Va abajo de 9vno semestre?")){
            txt_Preg.setText("¿Estudia Ing. en Computación?");
        }
        else{
            if(txt_Preg.getText().equals("¿Estudia Ing. en Computación?")){
                txt_Preg.setText("¿Es Hombre?");
            }
            else {
                if(txt_Preg.getText().equals("¿Es Hombre?")){
                    txt_Nombre.setText("Eres Zara Maria Ubaldo?");
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Zara.png")));
                    btn_No.setEnabled(false);
                    btn_Si.setEnabled(false);
                }
            }
        }
        
        if(txt_Preg.getText().equals("¿Tiene dos nombres?")){
                txt_Preg.setText("¿Estudia Ing. en computación?"); 
            }
        else {
            if(txt_Preg.getText().equals("¿Estudia Ing. en computación?")){
                txt_Preg.setText("¿Es de 6to semestre?"); 
            }
            else{
                if(txt_Preg.getText().equals("¿Es de 6to semestre?")){
                    txt_Preg.setText("¿Usa lentes?"); 
                }
                else {
                    if(txt_Preg.getText().equals("¿Usa lentes?")){
                        txt_Preg.setText("¿Va en 10mo semestre?");
                    }
                    else{
                        if(txt_Preg.getText().equals("¿Va en 10mo semestre?")){
                            txt_Nombre.setText("Eres Eduardo Pesqueira?");
                            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Pesca.png")));
                            btn_No.setEnabled(false);
                            btn_Si.setEnabled(false);
                        }
                    }
                }
            }   
        }
        if(txt_Preg.getText().equals("¿Es de 5to semestre?")){
                    txt_Preg.setText("¿Es Mujer?"); 
        }
        else{
            if(txt_Preg.getText().equals("¿Es Mujer?")){
                txt_Nombre.setText("Eres Bernardo Altamirano?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Berny.png"))); 
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
            }
         }
        
        //si no hizo damas siguiente rama
        if(txt_Preg.getText().equals("¿Su 2do proyecto fue Damas?")){
            txt_Preg.setText("¿Conecta 4?");
        }
        else{
            if(txt_Preg.getText().equals("¿Conecta 4?")){
            txt_Preg.setText("¿Tiene lentes?");
            }
            else {
                if(txt_Preg.getText().equals("¿Tiene lentes?")){
                    txt_Nombre.setText("Eres Mauricio Martinez?");
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Mauricio.png"))); 
                    btn_No.setEnabled(false);
                    btn_Si.setEnabled(false);
                }
            }
        }
       
          
        if(txt_Preg.getText().equals("¿Es mujer?")){
            txt_Preg.setText("¿Va en 6to semestre?");
        }
        else{
            if(txt_Preg.getText().equals("¿Va en 6to semestre?")){
                txt_Nombre.setText("Eres Diego Hernandez?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Diego.png"))); 
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
            }
        }
        
        if(txt_Preg.getText().equals("¿Tiene un solo nombre?")){
            txt_Preg.setText("¿usa lentes?");
        } 
        else{
            if(txt_Preg.getText().equals("¿usa lentes?")){
                txt_Nombre.setText("Eres Carlos Alberto Delgado?");
                txt_Preg.setText("Tendre que adivinar");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Carlos.png"))); 
                btn_Si.setEnabled(false);
            }
            else{
                if(txt_Preg.getText().equals("Tendre que adivinar")){
                    txt_Nombre.setText("Eres Jorge Edgar Rodriguez?");
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Jorge.png"))); 
                    btn_No.setEnabled(false);
                    btn_Si.setEnabled(false);
                }
            }
        }
        
        
        
        if(txt_Preg.getText().equals("¿Estudia Inge. en Computacion?")){
            txt_Nombre.setText("Eres Jose Francisco Garduño?");
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Suchil.png")));
            btn_No.setEnabled(false);
            btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿tiene lentes?")){
            txt_Nombre.setText("Eres Sofia Albert?");
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Sofia.png"))); 
            btn_No.setEnabled(false);
            btn_Si.setEnabled(false);
        }
        
        if(txt_Preg.getText().equals("¿Va en 4to semestre?")){
                txt_Preg.setText("¿En 8vo?"); 
        }
        else {
            if(txt_Preg.getText().equals("¿En 8vo?")){
                txt_Nombre.setText("Eres Miguel Angel Quintero?");
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Miguel.png")));
                btn_No.setEnabled(false);
                btn_Si.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_NoActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
          txt_Nombre.setText("");
          icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivina/FotosIA/Unknown.png")));
          txt_Preg.setText("¿Su 2do proyecto fue Damas?");
          btn_No.setEnabled(true);
          btn_Si.setEnabled(true);
    }//GEN-LAST:event_btn_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(adivinaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adivinaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adivinaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adivinaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adivinaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_No;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Si;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Preg;
    // End of variables declaration//GEN-END:variables
}
