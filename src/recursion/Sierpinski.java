/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

/**
 *
 * @author 068788892
 */
public class Sierpinski {

    public static void drawTriangle(Graphics g, int depth, Point p1, Point p2, Point p3) {
        if (depth == 1) {
            Polygon p = new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            g.fillPolygon(p);
        } else {
            Point p4 = midpoint(p1, p2);
            Point p5 = midpoint(p2, p3);
            Point p6 = midpoint(p1, p3);
            
            drawTriangle(g, depth - 1, p1, p4, p6);
            drawTriangle(g, depth - 1, p4, p2, p5);
            drawTriangle(g, depth - 1, p6, p5, p3);
        }
    }

    public static Point midpoint(Point p1, Point p2) {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
    }
}
