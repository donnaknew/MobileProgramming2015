package kr.ac.kookmin.shape;

public class Rectangle extends Shape {
	
	//implement here
	private int w;
	private int h;
	
	Rectangle(Point center, int w, int h) {
		super(center);
		this.w = w;
		this.h = h;
	}
	public Rectangle getBounds(){
		return this;
	}
	public int getHeight(){
		return h;
	}
	public int getWidth(){
		return w;
	}
	@Override
	public void draw(Graphics g){
		g.draw(this);
	}
	@Override
	public String toString(){
		return "Rectangle";
	}
}
