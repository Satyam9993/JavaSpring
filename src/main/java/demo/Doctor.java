package demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{


    String qualification;
//    Doctor(String qual){
//        qualification = qual;
//    }
//    private Nurse nurse;
    public void assist(){
        System.out.println("Doctor is Assisting");
    }


//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qual) {
//        this.qualification = qual;
//    }

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
}
