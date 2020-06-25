package com.orange;

import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void f1() {
	  System.out.println("1");
	  System.out.println("FirstTest.f1()");
  }
  
  @Test
  public void f2() {
	  System.out.println("2");
  }
  
  @Test
  public void f3() {
	  System.out.println("3");
  }
}
