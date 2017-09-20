package dp.a.factory;

public class FactoryShape {
	
	public static Shape getShape(ShapeType shapeType) {
		switch(shapeType) {
		case SQUARE: return new Square();
		case CIRCLE: return new Circle();
		case TRIANGLE: return new Triangle();
		default: return null;
		}
	}
	
}
