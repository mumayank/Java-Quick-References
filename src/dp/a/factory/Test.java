package dp.a.factory;

public class Test {
	public static void main(String args[]) {
		Shape shape = FactoryShape.getShape(ShapeType.SQUARE);
		shape.printArea();
		
		shape = FactoryShape.getShape(ShapeType.CIRCLE);
		shape.printArea();
		
		shape = FactoryShape.getShape(ShapeType.TRIANGLE);
		shape.printArea();
	}
}
