import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Rectangle;

public class NaveEnemiga extends Rectangle {
	public static int contEsc;
	int velX;

	public NaveEnemiga() {
		super(1200 + (int) (Math.random() * 1200), (int) (Math.random() * 550) + 10, 100, 50); // int posX, int posY, int ancho, int alto
		velX = 10;
	}

	public void paint(Graphics g, Applet a) {
		g.drawImage(Asteroid.imgMarciano, x, y, width, height, a);
	}

	public void actualizar() {
		x -= velX;

		if (x <= -100) {
			x = 1200;
			y = (int) (Math.random() * 550) + 10;
			contEsc++;
		}
	}
}