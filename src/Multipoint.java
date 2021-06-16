import java.util.List;

public class Multipoint extends Geometry {

List<Point> coordinates;
    
    public Multipoint () {
        super();
    }
    public Multipoint (List<Point> points) {
        super();
        this.setCoordinates(points);
    }
    
    //setter
    public void setCoordinates(List<Point> coordinates) {
        this.coordinates = coordinates;
    }
    
    //getter
    public List<Point> getCoordinates() {
        return coordinates;
    }

    public void addPoint(Point p) {
        this.coordinates.add(p);
    }
	
}
