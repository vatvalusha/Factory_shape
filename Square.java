package HW;

public class Square extends Shape {
	int side;
	Square() {}
	Square(int side, String c){
		name = "Square";
		this.side = side;
		this.color = c;
		setArea(side);
		setPerimeter();
		setColor(c);
//		getInfo();
	}
	void setArea(int r){
		side = r;
		area = (int)Math.pow(side, 2);
	}
	
	void setPerimeter(){
		perimeter = 4*side;
	}
	public void setColor(String c) {
		color = c;
	}
}
