package HW;

public class Color {

	static String[] color = {"Red", "Green", "Blue", "Yelow","Pink","Orange","Brown","Black","White","Gray"};
	static String randColor(){
		return color[(int)((Math.random()*10))];
	}
}
