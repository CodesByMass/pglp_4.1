package com.main;

public class PhoneNumber {

  private String type;
  private String number;

  public PhoneNumber(String type, String number) {
    this.type = type;
    this.number = number;
  }

  public String getType() {
    return type;
  }

  public String getNumber() {
    return number;
  }
}
