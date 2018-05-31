/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */

class Point {

	private int x;
	private int y;

	// Default constructor: responsible to create def coordinates for x, y;
	public Point() {

		this(1, 1);//calling another const in SAME object
		System.out.println("------Def Const: Point---------");
	}

	// Parameterized constructor: responsible to create user given coordinates for x, y;
	public Point(int x, int y) {

		System.out.println("------Param Const: Point(x, y)---------");
		this.x = x;
		this.y = y;
	}
	
	// Parameterized constructor: responsible to create Point by copying coordinates from another Point for x, y;
		public Point(Point p) {

			this(p.x, p.y);
			System.out.println("------Param Const: Point(p)---------");
		}
		
		public void printCoor() {
			System.out.println("x=" + x +","+ "y=" + y);
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
}

public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Point p1 = new Point();//def const
		p1.printCoor();

		Point p2 = new Point(10, 20);
		p2.printCoor();
		
		Point p3 = new Point();
		p3.printCoor();
	}

}
