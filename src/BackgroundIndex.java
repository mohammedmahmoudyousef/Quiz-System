/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahmo
 */
public class BackgroundIndex extends javax.swing.JPanel {
    
    private java.awt.Image backgroundIndex;

    public BackgroundIndex() {
        // Load image from resources folder (place it under /src or /resources)
        backgroundIndex = new javax.swing.ImageIcon(getClass().getResource("/background.jpg")).getImage();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundIndex, 0, 0, getWidth(), getHeight(), this);
    }
    
}
