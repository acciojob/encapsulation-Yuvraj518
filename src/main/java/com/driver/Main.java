package com.driver;

public class Main {
  public static void main( String args[]){
    RWOnly rw=new RWOnly();
    //rw.name="Deepak";
    // java: name has private access in com.driver.RWOnly
    rw.setName("Deepak");
    rw.getName();

  }
}
