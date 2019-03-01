package hello;

import org.joda.time.LocalTime;
import java.util.logging.Logger;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    logger.log("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    logger.log(greeter.sayHello);
  }
}
