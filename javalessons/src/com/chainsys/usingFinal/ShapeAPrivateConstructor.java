package com.chainsys.usingFinal;

public class ShapeAPrivateConstructor {
	public int height;
	public int width;
	
	private ShapeAPrivateConstructor()
	{
		System.out.println("shapeA createdA"+hashCode());
	}
	
	
	private ShapeAPrivateConstructor(int X)
	{
		height=X;width=X;
		System.out.println(X+"shapeA creatdB"+hashCode());
	}
	public void echo()
	{
		System.out.println("shapeA creatA");
	}
	public static ShapeAPrivateConstructor getObject()//factory method
	{
		return new ShapeAPrivateConstructor();//call to private constructor
	}
	
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
				ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
}