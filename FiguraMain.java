package HW;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import collection.Animal;


public class FiguraMain {

	public static void main(String[] args) throws CloneNotSupportedException, SQLException, MyExeption {
		Scanner scanner = new Scanner(System.in);
		Connect connect = new Connect();
		LinkedList<Shape> ll = new LinkedList<Shape>();
		Iterator<Shape> it = ll.iterator();
		MyExeption out = new MyExeption();
//		connect.addValue("Valera", "Red", 3.9, 4.7);
		
//		Figure figure = new Figure("Cool");
//		Shape shape = new Shape(figure, "Square", 10);
//		
//		Shape clone = (Shape) shape.clone();
//		System.out.println(shape);
//		System.out.println(clone);
//		clone.name = new String("Triangle");
//		clone.figure.discraption = "Bad";
//		System.out.println(shape);
//		System.out.println(clone);
		Check check = new Check();
		int sc = 0;
		int count = -1;
		String input = null;
		System.out.println("FIGURA: \n");
		while(sc != 4){
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Triangle");
			System.out.println("4. Read text file (LookText)");
			System.out.println("5 Collection");
			System.out.println("6. Exit \n");
			System.out.print("Enter figura: ");
			try{
				if(check.check(scanner)) input = scanner.nextLine();
				Figura figura = Figura.valueOf(input);
				switch(figura){
				case Circle:
					System.out.println("Input radius:");
					int radius  = scanner.nextInt();	
					Circle circle = new Circle(radius,Color.randColor());
					count++;
//					System.out.println(circle.getArea());
//					connect.addValue(circle.getName(), circle.getColor(), circle.getPerimeter(), circle.area);
//					circle.getRead(circle.getColor(), circle.getName(), circle.getPerimeter(), circle.area);
//					circle.getWrite();
					ll.add(circle);
					ll.get(count).getInfo();
					break;
				case Square:
					count++;
					System.out.println("Input side:");
					int side = scanner.nextInt();
					Square square = new Square(side, Color.randColor());
					ll.add(square);
					ll.get(count).getInfo();
//					connect.addValue(square.getName(), square.getColor(), square.getPerimeter(), square.getArea());
//					square.getRead(square.getName(), square.getColor(), square.getPerimeter(), square.getArea());
					break;
				case Triangle:
					System.out.println("1. Triangle Gerona.");
					System.out.println("2. Simple triangle.\n");
					System.out.println("Choose triangle: ");
					if(check.check(scanner)) sc = scanner.nextInt();
					switch(sc){
					case 1:
						count++;
						System.out.println("Input 1 side triangle: ");
						int side1 = scanner.nextInt();
						System.out.println("Input 2 side triangle: ");
						int side2 = scanner.nextInt();
						System.out.println("Input 3 side triangle: ");
						int side3 = scanner.nextInt();
						if(side1 < side2+side3 && side2<side1+side3 && side3<side2+side1){
							Triagle triagle	= new Triagle(side1,side2,side3,Color.randColor());
							ll.add(triagle);
							ll.get(count).getInfo();
//							connect.addValue(triagle.getName(), triagle.getColor(), triagle.getPerimeter(), triagle.getArea());
//							triagle.getRead(triagle.getName(), triagle.getColor(), triagle.getPerimeter(), triagle.getArea());
						}
						else System.out.println("Triangle unreal");
						break;
					case 2:
						count++;
						System.out.println("Input 1 side triangle: ");
						int side_1 = scanner.nextInt();
						System.out.println("Input 2 side triangle: ");
						int side_2 = scanner.nextInt();
						System.out.println("Input angle between a and b triangle: ");
						double angle = scanner.nextDouble();
						Triagle triagle = new Triagle(side_1,side_2,angle,Color.randColor());
						ll.add(triagle);
						ll.get(count).getInfo();
//						connect.addValue(triagle.getName(), triagle.getColor(), triagle.getPerimeter(), triagle.getArea());
//						triagle.getRead(triagle.getName(), triagle.getColor(), triagle.getPerimeter(), triagle.getArea());
						break;
					}
					break;
				case LookText:
					System.out.println("1. Circle");
					System.out.println("2. Square");
					System.out.println("3. Triangle.\n");
					System.out.println("Choose File: ");
					if(check.check(scanner)) sc = scanner.nextInt();
					switch(sc){
						case 1:
							Circle circle2 = new Circle();
							circle2.getWrite();
							break;
						case 2:
							Square square2 = new Square();
							square2.getWrite();
							break;
						case 3:
							Triagle triagle = new Triagle();
							triagle.getWrite();
							break;
						}
					break;
				case Col:
//					while(it.hasNext())it.next().getInfo();
					for(int i = 0; i<ll.size(); i++){
						System.out.println(ll.get(i).getName());
					}
					break;
				case Exit:
					sc = 4;
					System.out.println("Goodbye!");
					connect.closeAll();
					break;
				}	
			}catch(Exception e){
//				System.out.println("Error");
//				e.printStackTrace();
				}
			}
		}
	}
