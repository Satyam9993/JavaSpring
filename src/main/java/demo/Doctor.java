package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope(value = "singleton")
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {


    String qualification;

    public void assist(){
        System.out.println("Doctor is Assisting");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qual) {
        this.qualification = qual;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Name Method is Called");
    }


    @PostConstruct
    public void postConstructMethod(){
        System.out.println("This is Post Construct");
    }
}
