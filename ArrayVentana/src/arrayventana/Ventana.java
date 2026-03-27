package arrayventana;

import java.util.ArrayList;

public class Ventana extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana.class.getName());

    int contador = 0;
    private final ArrayList<Persona> listaPersonas;

    public Ventana(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
        initComponents();
        nombreRes.setText(listaPersonas.get(0).getNombre());
        edadRes.setText(listaPersonas.get(0).getEdad());
        mailRes.setText(listaPersonas.get(0).getMail());
        anterior.setEnabled(false);
        primero.setEnabled(false);
        guardarEdad.setEnabled(false);
        guardarNombre.setEnabled(false);
        guardarMail.setEnabled(false);
        guardarNombre.setVisible(false);
        guardarEdad.setVisible(false);
        guardarMail.setVisible(false);
        guardar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        nombreRes = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        edadRes = new javax.swing.JTextField();
        mail = new javax.swing.JLabel();
        mailRes = new javax.swing.JTextField();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        primero = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editarNombre = new javax.swing.JButton();
        editarEdad = new javax.swing.JButton();
        editarMail = new javax.swing.JButton();
        guardarNombre = new javax.swing.JButton();
        guardarMail = new javax.swing.JButton();
        guardarEdad = new javax.swing.JButton();

        jButton3.setText("editar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre.setText("Nombre");

        nombreRes.setEditable(false);

        edad.setText("Edad");

        edadRes.setEditable(false);

        mail.setText("Mail");

        mailRes.setEditable(false);

        anterior.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        anterior.setText("<");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        siguiente.setText(">");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        primero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        primero.setText("<<");
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });

        ultimo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ultimo.setText(">>");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editarNombre.setText("editar");
        editarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNombreActionPerformed(evt);
            }
        });

        editarEdad.setText("editar");
        editarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEdadActionPerformed(evt);
            }
        });

        editarMail.setText("editar");
        editarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMailActionPerformed(evt);
            }
        });

        guardarNombre.setText("guardar");
        guardarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarNombreActionPerformed(evt);
            }
        });

        guardarMail.setText("guardar");
        guardarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarMailActionPerformed(evt);
            }
        });

        guardarEdad.setText("guardar");
        guardarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre)
                                        .addComponent(edad)
                                        .addComponent(mail))
                                    .addGap(64, 64, 64))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(primero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anterior)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(guardar)
                                    .addComponent(añadir))
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ultimo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombreRes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edadRes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mailRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(eliminar))))
                    .addComponent(editarMail)
                    .addComponent(editarNombre)
                    .addComponent(editarEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarNombre)
                    .addComponent(guardarMail)
                    .addComponent(guardarEdad))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad)
                    .addComponent(edadRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarEdad))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail)
                    .addComponent(mailRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarMail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(siguiente)
                    .addComponent(primero)
                    .addComponent(ultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadir)
                    .addComponent(eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        --contador;
        ultimo.setEnabled(true);
        if (contador == 0) {
            anterior.setEnabled(false);
            primero.setEnabled(false);
        } else {
            anterior.setEnabled(true);
            primero.setEnabled(true);
        }
        if (contador == listaPersonas.size() - 1) {
            siguiente.setEnabled(false);
        } else {
            siguiente.setEnabled(true);
        }
        nombreRes.setText(listaPersonas.get(contador).getNombre());
        edadRes.setText(listaPersonas.get(contador).getEdad());
        mailRes.setText(listaPersonas.get(contador).getMail());

    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        ++contador;
        if (contador == 0) {
            anterior.setEnabled(false);
            primero.setEnabled(false);
        } else {
            anterior.setEnabled(true);
            primero.setEnabled(true);
        }
        if (contador == listaPersonas.size() - 1) {
            siguiente.setEnabled(false);
            ultimo.setEnabled(false);
        } else {
            siguiente.setEnabled(true);
            ultimo.setEnabled(true);
        }
        nombreRes.setText(listaPersonas.get(contador).getNombre());
        edadRes.setText(listaPersonas.get(contador).getEdad());
        mailRes.setText(listaPersonas.get(contador).getMail());

    }//GEN-LAST:event_siguienteActionPerformed

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        contador = 0;
        ultimo.setEnabled(true);
        siguiente.setEnabled(true);
        anterior.setEnabled(false);
        primero.setEnabled(false);

        nombreRes.setText(listaPersonas.get(0).getNombre());
        edadRes.setText(listaPersonas.get(0).getEdad());
        mailRes.setText(listaPersonas.get(0).getMail());

    }//GEN-LAST:event_primeroActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        contador = listaPersonas.size() - 1;
        ultimo.setEnabled(false);
        siguiente.setEnabled(false);
        primero.setEnabled(true);
        anterior.setEnabled(true);
        nombreRes.setText(listaPersonas.get(listaPersonas.size() - 1).getNombre());
        edadRes.setText(listaPersonas.get(listaPersonas.size() - 1).getEdad());
        mailRes.setText(listaPersonas.get(listaPersonas.size() - 1).getMail());
    }//GEN-LAST:event_ultimoActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        nombreRes.setText("");
        edadRes.setText("");
        mailRes.setText("");
        

        nombreRes.setEditable(true);
        edadRes.setEditable(true);
        mailRes.setEditable(true);
        guardar.setVisible(true);
        
        primero.setEnabled(false);
        siguiente.setEnabled(false);
        anterior.setEnabled(false);
        ultimo.setEnabled(false);
        eliminar.setEnabled(false);
        
        añadir.setEnabled(false);
        editarNombre.setEnabled(false);
        editarEdad.setEnabled(false);
        editarMail.setEnabled(false);

    }//GEN-LAST:event_añadirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        nombreRes.setEditable(false);
        edadRes.setEditable(false);
        mailRes.setEditable(false);

        listaPersonas.add(new Persona(nombreRes.getText(), edadRes.getText(), mailRes.getText()));
        primero.setEnabled(true);
        siguiente.setEnabled(true);
        anterior.setEnabled(true);
        ultimo.setEnabled(true);
        eliminar.setEnabled(true);
        
        guardar.setVisible(false);
        añadir.setEnabled(true);
        editarNombre.setEnabled(true);
        editarEdad.setEnabled(true);
        editarMail.setEnabled(true);

        nombreRes.setText(listaPersonas.get(0).getNombre());
        edadRes.setText(listaPersonas.get(0).getEdad());
        mailRes.setText(listaPersonas.get(0).getMail());

    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       listaPersonas.remove(contador);
        
       nombreRes.setText(listaPersonas.get(contador).getNombre());
        edadRes.setText(listaPersonas.get(contador).getEdad());
        mailRes.setText(listaPersonas.get(contador).getMail()); 
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEdadActionPerformed
        edadRes.setText("");
        edadRes.setEditable(true);
        desactivarBotones();
        guardarEdad.setEnabled(true);
        guardarEdad.setVisible(true);
        

    }//GEN-LAST:event_editarEdadActionPerformed

    private void editarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNombreActionPerformed
        nombreRes.setText("");
        nombreRes.setEditable(true);
        desactivarBotones();
        guardarNombre.setEnabled(true);
        guardarNombre.setVisible(true);


    }//GEN-LAST:event_editarNombreActionPerformed

    private void guardarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarNombreActionPerformed
        activarBotones();
        listaPersonas.get(contador).setNombre(nombreRes.getText());
        nombreRes.setEditable(false);
        guardarNombre.setEnabled(false);
        guardarEdad.setEnabled(false);
        guardarMail.setEnabled(false);
        guardarNombre.setVisible(false);
    }//GEN-LAST:event_guardarNombreActionPerformed

    private void guardarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEdadActionPerformed
        activarBotones();
        listaPersonas.get(contador).setEdad(edadRes.getText());
        edadRes.setEditable(false);
        guardarNombre.setEnabled(false);
        guardarEdad.setEnabled(false);
        guardarMail.setEnabled(false);
        guardarEdad.setVisible(false);
    }//GEN-LAST:event_guardarEdadActionPerformed

    private void editarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMailActionPerformed
        mailRes.setText("");
        mailRes.setEditable(true);
        desactivarBotones();
        guardarMail.setEnabled(true);
        guardarMail.setVisible(true);
    }//GEN-LAST:event_editarMailActionPerformed

    private void guardarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarMailActionPerformed
        activarBotones();
        listaPersonas.get(contador).setMail(mailRes.getText());
        mailRes.setEditable(false);
        guardarNombre.setEnabled(false);
        guardarEdad.setEnabled(false);
        guardarMail.setEnabled(false);
        guardarMail.setVisible(false);
    }//GEN-LAST:event_guardarMailActionPerformed

    public void desactivarBotones() {
        editarNombre.setEnabled(false);
        editarEdad.setEnabled(false);
        editarMail.setEnabled(false);
        guardarEdad.setEnabled(false);
        guardarNombre.setEnabled(false);
        guardarMail.setEnabled(false);
        primero.setEnabled(false);
        anterior.setEnabled(false);
        siguiente.setEnabled(false);
        ultimo.setEnabled(false);
        añadir.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        
    }

    public void activarBotones() {
        editarNombre.setEnabled(true);
        editarEdad.setEnabled(true);
        editarMail.setEnabled(true);
        guardarEdad.setEnabled(true);
        guardarNombre.setEnabled(true);
        guardarMail.setEnabled(true);
        primero.setEnabled(true);
        anterior.setEnabled(true);
        siguiente.setEnabled(true);
        ultimo.setEnabled(true);
        añadir.setEnabled(true);
        guardar.setEnabled(true);
        eliminar.setEnabled(true);
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton añadir;
    private javax.swing.JLabel edad;
    private javax.swing.JTextField edadRes;
    private javax.swing.JButton editarEdad;
    private javax.swing.JButton editarMail;
    private javax.swing.JButton editarNombre;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarEdad;
    private javax.swing.JButton guardarMail;
    private javax.swing.JButton guardarNombre;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField mailRes;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreRes;
    private javax.swing.JButton primero;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
