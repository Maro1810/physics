import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Scanner;



public class Frame extends JPanel implements ActionListener, KeyListener, MouseListener {
    
    static double xInitial;
    static double yInitial;

	double xPosition;
	double yPosition;

	double time = 0;

    static double velocity = 5;
    static double angle = 60;

	double grav = 9.81;

	Timer t;
    
    public void paint(Graphics g) {
		super.paintComponent(g);	
		Graphics2D g2d = (Graphics2D) g;

        xPosition = 10*(velocity * Math.cos(Math.toRadians(angle)))*time;
		
		System.out.println(yPosition);
		yPosition = 10*(velocity*Math.sin(Math.toRadians(angle))*time)-(0.5*grav*Math.pow(time, 2));
		yPosition = (yPosition > 0 ? yPosition : 0);

		Shape oval = new Ellipse2D.Double((xPosition+10),(520-yPosition), 20, 20);
        g.setColor(Color.GREEN);
        g.fillRect(0, 540, 1000, 30);

        g2d.setPaint(Color.BLACK);
        g2d.fill(oval);

		time += (0.05);
		
	}
	public void update() {

	}
		
	public static void main(String[] arg) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter an initial x position: ");

        // xInitial = (int) scanner.nextDouble();

        // System.out.print("Enter an initial y position: ");

        // yInitial = (int) scanner.nextDouble();

        // System.out.print("Enter an initial velocity: ");

        // velocity = scanner.nextDouble();

        // System.out.print("Enter an angle: ");

        // angle = scanner.nextDouble();

		Frame f = new Frame();
	}

	public Frame() {
			JFrame f = new JFrame("physics engine thing");
			f.setSize(new Dimension(1000, 600));
			f.setBackground(Color.WHITE);
			f.add(this);
			f.setResizable(false);
			f.setLayout(new GridLayout(1,2));
			f.addKeyListener(this);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			t = new Timer(16, this);
			t.start();
			f.setVisible(true);

	
			
		
	}

    

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent key) {

		
	}

	@Override
	public void keyReleased(KeyEvent key) {

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		repaint();

	}
}