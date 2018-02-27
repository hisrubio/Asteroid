import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

public class Nave extends Rectangle {
	public static final int ANCHO = 50;
	public static final int ALTO = 80;
	private Image imagen;
	private boolean viva = true;
	static double theta = 0;

	public Nave(Image img) {
		super(Fondo.WDIMENSION / 2, Fondo.HDIMENSION / 2, ANCHO, ALTO);
		imagen = img;
	}
	public void dibujar(Graphics g, Applet a) {

		Graphics2D g2 = (Graphics2D) g;
		g2.translate(x + ANCHO / 2, y + ALTO / 2);// traslada el graphics a el centro de la nave
		g2.rotate(theta);
		g2.setColor(Color.MAGENTA);

		g2.drawImage(imagen, -ANCHO / 2, -ALTO / 2, ANCHO, ALTO, a);// pinta el centro de la imagen en el 0,0 del graphics
		// g2.drawLine(0, 0, 200, 0);
	}

	public void avanzar() {
		if (x > Fondo.WDIMENSION)
			x = 0;
		if (x < 0)
			x = Fondo.WDIMENSION;
		if (y > Fondo.HDIMENSION)
			y = 0;
		if (y < 0)
			y = Fondo.HDIMENSION;;

		x += 10 * Math.cos((theta));
		y += 10 * Math.sin((theta));
	}

	public void girar(boolean sentido) {
		if (sentido)// sentido true giro izquierda
			theta -= (Math.PI / 18);
		else
			theta += (Math.PI / 18);
	}

	public boolean isViva() {
		return viva;
	}
	public void setViva(boolean viva) {
		this.viva = viva;
	}
}
