import com.xjf.dao.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
//12
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        People people=context.getBean("people",People.class);
        people.getCat().shut();
        people.getDog().shout();
    }
}
