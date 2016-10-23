package hello;

import org.joda.time.LocalTime;

public class HelloWorld{
    public  void main(String[] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("the current time:" +currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}