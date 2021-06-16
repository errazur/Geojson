
public class Point extends Geometry {
	
	private double [] coordinate = new double [2];
	
	public Point (double x, double y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	public Point (double [] coordinate) {
		super();
		this.setcoordinate(coordinate);
	}
	
	public Point(Point p) {
		super();
		this.setcoordinate(p.getCoordinate());
	}
	
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Point)){ return false;} 
		if (((Point) o).getX() == this.getX() && ((Point) o).getY() == this.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBetween (Point p1, Point p2) {
		if (p1.getX() < this.coordinate[0] && p2.getX() > this.coordinate[0] && p1.getY() < this.coordinate[1] && p2.getY() < this.coordinate[1]) {
			return true;
		}
		if(p1.getX() < this.coordinate[0] && p2.getX() > this.coordinate[0] && p1.getY() < this.coordinate[1] && p2.getY() > this.coordinate[1]) {
			return true;
		}
		if(p1.getX() < this.coordinate[0] && p2.getX() > this.coordinate[0] && p1.getY() > this.coordinate[1] && p2.getY() > this.coordinate[1]) {
			return true;
		}
		if(p1.getX() < this.coordinate[0] && p2.getX() > this.coordinate[0] && p1.getY() > this.coordinate[1] && p2.getY() < this.coordinate[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	public boolean isBetween (Point p1, Point p2) {
	    return (
	            (
	                // p1 x < p2 x
	                this.getX() > p1.getX() && 
	                this.getX() < p2.getX()
	            ) || (
	                // p1 x > p2 x
	                this.getX() < p1.getX() && 
	                this.getX() > p2.getX()
	            )
	        ) && (
	            (
	                // p1 y < p2 y
	                this.getY() > p1.getY() &&
	                this.getY() < p2.getY()
	            ) || (
	                // p1 y > p2 y
	                this.getY() < p1.getY() &&
	                this.getY() > p2.getY()
	            )
	        );
	}
	*/
	
	public double distance (Point p1, Point p2) {
		double d = ((p2.getX() - p1.getX())*((p2.getX() - p1.getX())		+		(p1.getY() - p2.getY()) * (p1.getY() - p2.getY())));
		d = Math.sqrt(d);
				return d;
	}
	
	//getter
	public double getX () {
		return this.coordinate[0];
	}
	
	public double getY() {
		return this.coordinate[1];
	}
	
	public double [] getCoordinate () {
		return this.coordinate;
	}
	
	
	
	//setter
	public void setX(double x) {
		this.coordinate[0]=x;
	}
	
	public void setY(double Y) {
		this.coordinate[1]=Y;
	}
	
	public void setcoordinate (double[] coordinate) {
		this.coordinate = coordinate;
	}

}
