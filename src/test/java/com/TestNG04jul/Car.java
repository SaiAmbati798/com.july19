package com.TestNG04jul;

import org.testng.annotations.Test;

public class Car {
  @Test(priority=1)
  public void enterKey() {
	  System.out.println("Insert key in the key holder");
  }
  @Test(priority=2)
  public void StartIgnition() {
	  System.out.println("Start the ignition");
  }
  @Test(priority=3)
  public void changeGear() {
	  System.out.println("Change the gear");
  }
  @Test(priority=4,enabled=false)
  public void playMusic() {
	  System.out.println("Play the music ");
  }
}
