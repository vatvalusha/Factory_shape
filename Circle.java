package HW;


public class Circle extends Shape {
	int radius;
//	JButton b1;
//	JLabel l1;
	Circle(){}
	
		Circle(int radius, String color){
//		b1 = new JButton("Circle");
//		l1 = new JLabel();
//		add(b1, BorderLayout.EAST);
		
		name = "Circle";
		this.radius = radius;
		this.color = color;
		setColor(color);	
		try {
			setArea(radius);
		} catch (MyExeption e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		setPerimeter();
//		getInfo();
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	public void setColor(String c) {
		color = c;
	}
	void setArea(int r) throws MyExeption {
		if(r <=0){
			MyExeption exeption = new MyExeption();
			throw exeption;
//			System.out.println("Can't be zero or less zero FUN");
//			System.exit(0);
			
		}
		else{
			radius = r;
			area = pi*Math.pow(radius, 2);
		}
	}
	
	
	double setPerimeter(){
		perimeter = 2*radius*pi;
		return perimeter;
	}
	
//	void getRead(String a, String b, double per, double area ){
//		try(FileWriter fileWriter = new FileWriter("D:\\Circle.txt", true)) {
//			fileWriter.append("Name: "+a+" Color: "+b +" Per: "+per+" Area: "+area+"\n");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	void getWrite(){
//		try(FileReader fileReader = new FileReader("D:\\Circle.txt")) {
//			int c;
//			while((c=fileReader.read())!=-1){
//				System.out.print((char)c);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	@Override
//	public void action() {
//		b1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				conclusion();
//			}
//		});
//		
//	}
//	@Override
//	public void conclusion() {
//		l1.setText(name);
//	}
}
