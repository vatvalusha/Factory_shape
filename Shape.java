package HW;

import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

public class Shape extends JFrame implements Cloneable, FunctForShapes {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String color;
	String name;
	double area;
	double perimeter;
	
	final double pi = 3.1415; 
	
	Figure figure;
	
	Shape()
	{		
	}
	Shape(Figure figure, String name, int area){
		this.figure = figure;
		this.name = name;
		this.area = area;
	}
	
	public void getInfo(){
		System.out.println( "Color: "+color+"; Name: "
				+name+"; Area: "+area+"; Perimeter: "+perimeter);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public double getPerimeter(){
		return perimeter;
	}
	public double getArea(){
		return area;
	}
	@Override
	public String toString() {
		return "Shape [name=" + name + ", area=" + area + ", figure=" + figure + "]";
	}
		
	
	void getRead(String a, String b, double per, double area ){
		try(FileWriter fileWriter = new FileWriter("D:\\Circle.txt", true)) {
			fileWriter.append("Name: "+a+" Color: "+b +" Per: "+per+" Area: "+area+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	void getWrite(){
		try(FileReader fileReader = new FileReader("D:\\Circle.txt")) {
			int c;
			while((c=fileReader.read())!=-1){
				System.out.print((char)c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	
	
	
	
}

class Figure{
	String discraption;
	
	public Figure(String dis) {
		discraption = dis;
	}

	@Override
	public String toString() {
		return "Figure [discraption=" + discraption + "]";
	}
	
	
	
}
