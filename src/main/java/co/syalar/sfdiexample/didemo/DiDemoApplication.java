package co.syalar.sfdiexample.didemo;

import co.syalar.sfdiexample.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
    }

}
