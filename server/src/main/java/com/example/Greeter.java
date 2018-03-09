package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * 
   * @param someone
   * @return
   */
  public final String greet(final String someone) {
	  System.out.println("\t I am Raghavendra and I have started Jenkins.");
    return String.format("Hello, %s!", someone);
  }
}
