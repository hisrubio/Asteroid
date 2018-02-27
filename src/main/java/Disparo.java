import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Disparo extends Rectangle {
	public static final int ANCHO = 15;
	public static final int ALTO = 15;
	double theta;

	Image imagen;
	public Disparo(Image img, int posx, int posy, double angulo) {
		super(posx - ANCHO / 2, posy - ALTO / 2, ANCHO, ALTO);
		imagen = img;
		theta = angulo;
	}
	public void dibujar(Graphics gege, Applet a) {
		gege.drawImage(imagen, x, y, ANCHO, ALTO, a);
	}
	public void actualizar() {
		x += 25 * Math.cos((theta));
		y += 25 * Math.sin((theta));
	}
}