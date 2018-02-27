import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Fondo {
	public static final int WDIMENSION = 1200;
	public static final int HDIMENSION = 600;

	private Image imagen;

	public Fondo(Image img) {
		imagen = img;
	}
	public void dibujar(Graphics gege, Applet a) {
		gege.drawImage(imagen, 0, 0, WDIMENSION, HDIMENSION, a);
	}
}