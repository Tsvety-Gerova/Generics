
	public abstract class GeometricObject implements Comparable <GeometricObject> {
		
		private String color = "white";
		private boolean filled;
		private java.util.Date dateCreated;
		int area;
		static double sumArea;
		
		//public abstract double getArea();
		
		public static double sumArea(GeometricObject[] a) {
			return sumArea;
		}
		
		public GeometricObject() {
			dateCreated = new java.util.Date();
		}
		
		public GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}
			
		public static void max (GeometricObject obj) {
		}
		
		@Override
		public int compareTo(GeometricObject o) {
			if (getArea() > o.getArea()) {
				return 1;
			} else if (getArea() < o.getArea()) {
			return -1;
		}
		return 0;	
		}
		
		 
		public abstract double getArea();
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		public java.util.Date getDateCreated() {
			return dateCreated;
		}

		public void setDateCreated(java.util.Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		
		public String toString () {
			return "Created on " + dateCreated + "\n color: "  + color + " and filled "  + filled + "is geometric object";
		}
		
}
