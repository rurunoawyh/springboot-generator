
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wb-wyh270612 on 2017/8/28.
 *
 * @author wb-wyh270612
 * @date 2017/08/28
 */
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.alibaba.ibmanager.core")
public class Hello{
    @RequestMapping("/demo")
    @ResponseBody
    public String home(String name){
        return name;
    }

    public static void main(String [] args){
        SpringApplication.run(Hello.class,args);
    }
}
