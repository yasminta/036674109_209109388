package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void Ep_equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	/*הפונקציה תחזיר האם המספרים שהוזנו מחזירים משולש*/
	public void Ep_isNotTriangle() {
		int a = 0;
		int b = 3;
		int c = 4;
		triangle.classifyTriangle(a, b, c);
		String Expected = Triangle_Types.Nottriangle.toString();
		String Result = triangle.get_type().toString();
		assertEquals(Expected, Result.toString());
	}
	@Test
	public void Ep_isIsosceles() {
		int a = 3;
		int b = 3;
		int c = 4;
		triangle.classifyTriangle(a, b, c);
		String Expected = Triangle_Types.isosceles.toString();
		String Result = triangle.get_type().toString();
		assertEquals(Expected, Result.toString());
	}
	/*הפונקציה תחזיר האם המספרים שהוזנו יוצרים משולש שונה צלעות*/
	@Test
	public void Ep_isTriangle() {
		int a = 5;
		int b = 3;
		int c = 4;
		triangle.classifyTriangle(a, b, c);
		String Expected = Triangle_Types.Scalene.toString();
		String Result = triangle.get_type().toString();
		assertEquals(Expected, Result.toString());
	}
}  