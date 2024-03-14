package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "singleton")
@Scope(scopeName = "prototype")
public class Doctor implements Staff{


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
}
