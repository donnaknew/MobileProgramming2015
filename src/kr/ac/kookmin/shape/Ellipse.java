package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	
	//implement here
	private int w;
	private int h;
	
	Ellipse(Point center, int w, int h) {
		super(center);
		this.w = w;
		this.h = h;
		// TODO Auto-generated constructor stub
	}	
	public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}
	public int getSemiMajorAxis(){
		return 2*w;
	}
	public int getSemiMinorAxis(){
		return 2*h;
	}
	@Override
	public void draw(Graphics g){
		g.draw(this);
	}
	@Override
	public String toString(){
		return "Ellipse";
	}
}
