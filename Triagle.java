package HW;

public class Triagle extends Shape{	
	int side1;
	int side2;
	double side3;
	double angle;
	Triagle() {}
	Triagle(int a, int b, int c, String color){
		name = "Triangle Gerona";
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
		this.color = color;
		setAreaGerona(side1, side2, side3);
		setPerimeterGerona();
		setColor(color);
//		getInfo();
	}
	Triagle(int a, int b, double angle, String color){
		name = "Simple Triangle";
		this.side1 = a;
		this.side2 = b;
		this.angle = angle;
		this.color = color;
		setAreaAngle(side1, side2, angle);
		setPerimeter();
		setColor(color);
//		getInfo();
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	void setAreaAngle(int a, int b, double angle){
		side1 = a;
		side2 = b;
		this.angle = angle;
		area = 0.5*side1*side2*Math.sin(angle);
	}
	void setAreaGerona(int a, int b, double c) {
		side1 =a;
		side2 = b;
		side3 = c;
		double p = (side1+side2+side3)/2;
		area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	void setPerimeter(){
		if(angle == 90){
			side3 = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
		}
		else side3 = Math.sqrt(Math.pow(side1, 2)*Math.pow(side2, 2)-2*side1*side2*Math.cos(angle));
		setPerimeterGerona();
	}

	public void setPerimeterGerona() {
		perimeter = side1+side2+side3;
	}
}
