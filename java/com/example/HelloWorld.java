package com.example;

import com.google.common.base.Strings;

public class HelloWorld {

  public String hello() {
    String message = "Hello World!";
    String paddedMessage = Strings.padStart(message, 20, '*');
    return paddedMessage;
  }

  public static void main(String[] args) {
    System.out.println(new HelloWorld().hello());
  }
}
