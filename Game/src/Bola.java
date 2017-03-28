import processing.core.PApplet;

public abstract class Bola {
	
	private PApplet app;
	private float posX, posY, tamano;
	
	public Bola(PApplet app, float posX, float posY, float tamano){
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamano = tamano;
	}
	
	public abstract void pintar();
	
	public abstract void mover();

}
