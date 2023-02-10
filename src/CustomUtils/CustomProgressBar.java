/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomUtils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author ortiz
 */
public class CustomProgressBar extends JPanel {

    private int rectX = 0;
    private int rectY = 0;
    private int rectWidth = 0;
    private int rectHeight = 0;
    private Color color = Color.WHITE;
    private Graphics g;

    public CustomProgressBar(int rectX, int rectY, int rectWidth, int rectHeight, Color color, Graphics g) {
        this.rectX = rectX;
        this.rectY = rectY;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.color = color;
        this.g = g;
        super.printComponent(g);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.draw(new Rectangle2D.Double(this.rectX, this.rectY, this.rectWidth, this.rectHeight));
    }
}
