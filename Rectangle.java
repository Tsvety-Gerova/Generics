
	public class Rectangle extends GeometricObject {

		private double width;
		private double height;
		
		public Rectangle () {
		}
	 
		public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
		}
		
		public double sumArea (Circle[] c) {
			for (int i = 0; i < 1000; i ++) {
				sumArea += area;
			} 
			return sumArea;
		}
		
		public int max (Circle c) {
			return this.compareTo(c);
		}
		
		public Rectangle (double width, double height, String color, boolean filled) {
			this.width = width;
			this.height = height;
			setColor(color);
			setFilled(filled);
		}
		
		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public String toString () {
			return "Rectangle " + "\n a is " + width + "b is" + height;
		}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return width * height;
		}
}

