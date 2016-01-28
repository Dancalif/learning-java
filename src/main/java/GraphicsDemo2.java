import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo2 extends Canvas {
	public void paint(Graphics g) {

		g.setColor(Color.black);
		g.drawOval(280, 60, 130, 200); 
		g.drawOval(600, 60, 130, 200); 
//		g.setColor(Color.blue);
//		g.drawOval(350, 130, 50, 100);
//		g.drawOval(610, 130, 50, 100);
//		g.setColor(Color.red);
		g.fillOval(350, 130, 50, 100);
		g.fillOval(610, 130, 50, 100);

		g.setColor(Color.red);
		g.drawArc(460, 200, 150, 150, 130, 100);

		g.setColor(Color.black);
		g.drawArc(360, 370, 300, 80, 130, 210);

		for (int i = 0; i < 20; i++) {

			g.setColor(Color.blue);
			g.fillOval(350, 130, 50, 100);
			g.fillOval(610, 130, 50, 100);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(Color.green);
			g.fillOval(350, 130, 50, 100);
			g.fillOval(610, 130, 50, 100);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(Color.yellow);
			g.fillOval(350, 130, 50, 100);
			g.fillOval(610, 130, 50, 100);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(Color.red);
			g.fillOval(350, 130, 50, 100);
			g.fillOval(610, 130, 50, 100);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;

		}
	}

	public static void main(String[] args) {

		JFrame win = new JFrame("My window!!!");
		win.setSize(1000, 500);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo2 canvas = new GraphicsDemo2();
		win.add(canvas);
		win.setVisible(true);
	}
}