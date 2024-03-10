import com.feng.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String []args){
         ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        User user= (User) applicationContext.getBean("user7");
        User user1= (User) applicationContext.getBean("user4");
        user.show();
        System.out.println(user1==user);//输出为true，说明在配置文件加载的时候，对应对象已经被创建好了且只有一份
    }
}
