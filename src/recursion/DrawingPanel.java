/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author 068788892
 */
public class DrawingPanel extends javax.swing.JPanel {

    private int size = 820;
    private int triangleHeight = (int) Math.round(size * Math.sqrt(3.0) / 2.0);
    
    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        initComponents();
        
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        Point p1 = new Point(0, triangleHeight);
        Point p2 = new Point(size / 2, 0);
        Point p3 = new Point(size, triangleHeight);
        Sierpinski.drawTriangle(g, 9, p1, p2, p3);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}