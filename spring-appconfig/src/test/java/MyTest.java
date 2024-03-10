import com.xjf.Config.xjfConfig;
import com.xjf.pojo.USer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String []args){
        ApplicationContext context=new AnnotationConfigApplicationContext(xjfConfig.class);
        USer uSer=context.getBean("getUser",USer.class);
        System.out.println(uSer.getName());
    }
}
