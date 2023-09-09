package com.example;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloWorldTest {

  @Test
  public void testPaddedMessage() {
    String expectedMessage = "********Hello World!";

    String result = new HelloWorld().hello();

    assertThat(result).isEqualTo(expectedMessage);
  }
}
