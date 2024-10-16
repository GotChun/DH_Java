package C13;

class Point2D {
	int x;
	int y;

	Point2D() {
		System.out.println("Spitfire!"); //
	}

		
	Point2D(int x){
		this.x = x;
		System.out.println("Point2D(int x) 생성자 호출");		//오버로딩
	}
	Point2D(int x , int y){
		this.x = x;
		this.y = y;
		System.out.println("Point2D(int x , int y) 생성자 호출");
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
}
	
//	---------------------------------
	class Point3D extends Point2D {
		int z;

		Point3D() {
			System.out.println("포인또 3d 생성자");
		}
		
		Point3D(int x){
			super(x);	//인자 하나를 받는 생성자를 호출함
			System.out.println("Point3D(int x) 생성자 호출");
		}

		Point3D(int x,int y){
			super(x,y);
			System.out.println("Point3D(int x,int y) 생성자 호출");
		}
		Point3D(int x,int y,int z){
			super(x,y);
			this.z = z;
			System.out.println("Point3D(int x,int y,zzzzzz) 생성자 호출");
		}
		@Override
		public String toString() {
			return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
		}
	}
public class C02InheritanceMain {
	
	public static void main(String[] args) {
	
		Point3D obj = new Point3D();
		System.out.println();
		Point3D obj2 = new Point3D(1);
		System.out.println();
		Point3D obj3 = new Point3D(1,2,20);
		Point2D obj1 = new Point2D();
		
		System.out.println(obj3);
			
			
	}
}
