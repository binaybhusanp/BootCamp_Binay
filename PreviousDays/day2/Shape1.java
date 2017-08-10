public class Shape1 {
	
	public static void main(String args[]) {
	Shape1 circle = new Shape1();
	circle.paint("2B");
	circle.paint(12);
	circle.paint(3,1);
	}
	void paint(String pencilSize) {
		System.out.println("Paint using a Pencil");
	}
	void paint(int brushSize) {
	System.out.println("Paint using a Brush");
	}
	void paint(int fingers, int hand) {
		System.out.println("Paint using a Hand");
	}
	
}
