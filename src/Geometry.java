
public class Geometry {
	
	private String type;
	
	public Geometry() {
		this.type = this.getClass().getName();
	}
	
	//setter
	public void settype (String Type) {
		this.type=Type;
	}
	
	//getter
	public String gettype() {
		return this.type;
	}
	
	

}
