package atv1.entities;

public class Rectangle {
	private Double width;
	private Double height;
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double Area() {
		return width * height;
	}
	
	public Double perimetre() {
		return 2*(width+height);
	}
	public Double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}
