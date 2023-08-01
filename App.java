package com.lvg.rj.spcdd;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.lvg.rj.spcdd.beans.Wish;
import com.lvg.rj.spcdd.beans.person;
//import com.lvg.rj.spcdd.beans.Wish;
public class App 
{
    public static void main( String[] args )
    {
ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("beans.xml");
person p= container.getBean("per1",person.class);
System.out.println(p.getSsn()+" "+p.getName()+" "+p.getAge());
System.out.println(p.getAddress().getHno()+" "+p.getAddress().getStreetName());
System.out.println(p.getAddress().getCity()+" "+p.getAddress().getState());
container.close();
    }
}
