package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Doctor d = context.getBean(Doctor.class);
//        d.assist();
//        Nurse n = context.getBean(Nurse.class);
//        Nurse n = (Nurse) context.getBean("nurse"); // Not used generally
//        n.assist();

//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();

//        Doctor s = context.getBean(Doctor.class);
//        s.assist();
//        System.out.println(s.getQualification());
//        s.getNurse().assist();
//
//        Doctor s = context.getBean(Doctor.class);
//        System.out.println(s.qualification);



//        Nurse n = context.getBean(Nurse.class);
//        n.assist();


//        Java Configuartion

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor d = context.getBean(Doctor.class);
        d.setQualification("MBBS");
        System.out.println(d.qualification);
        d.assist();

        Doctor d1 = context.getBean(Doctor.class);
        System.out.println(d1.qualification);
    }
}
