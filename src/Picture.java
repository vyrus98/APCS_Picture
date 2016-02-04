
public class Picture {

	public Picture ()
	{
		Circle c=new Circle();
		c.makeVisible();
		c.changeColor("blue");
		c.moveVertical(50);
		c.moveHorizontal(100);
		
		Square s1=new Square();
		s1.makeVisible();
		s1.changeColor("green");
		s1.moveVertical(80);
		s1.moveHorizontal(100);
		
		Square s2=new Square();
		s2.makeVisible();
		s2.changeColor("green");
		s2.moveVertical(110);
		s2.moveHorizontal(80);
		
		Square s3=new Square();
		s3.makeVisible();
		s3.changeColor("green");
		s3.moveVertical(110);
		s3.moveHorizontal(120);
		
		Triangle t1=new Triangle();
		t1.makeVisible();
		t1.changeColor("black");
		t1.moveVertical(80);
		t1.moveHorizontal(85);
		
		Triangle t2=new Triangle();
		t2.makeVisible();
		t2.changeColor("black");
		t2.moveVertical(80);
		t2.moveHorizontal(145);
	}
	
	public static void main(String[] args) {
		Picture myPicture=new Picture();

	}

}
