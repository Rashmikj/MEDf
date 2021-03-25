package Interface;



 interface Drawable {

	void draw();
}
class Rectangle implements Drawable
{
	public void draw() {
		System.out.println("draw the triangle");
	}
	}
class Circle implements Drawable
{
	public void draw() {
		System.out.println("draw the circle");
	}
	}

public class INTERface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle();
c.draw();
Rectangle r=new Rectangle();
r.draw();
Drawable d=new  Circle();
d.draw();
	}

}
