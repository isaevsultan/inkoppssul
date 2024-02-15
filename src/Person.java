import java.time.LocalDate;

public class Person {
    private String firstName;
    private String surName;
    private LocalDate dataOfBirth;
   private String gender;


      public String getFirstName(){
       return firstName;
   }
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   public String getSurName(){
       return surName;
   }
    public void setSurName(String surName){
       this.surName = surName;
    }
    public LocalDate getDataOfBirth(){
       return dataOfBirth;
    }
    public void setDataOfBirth(LocalDate dataOfBirth){
     this.dataOfBirth = dataOfBirth;
    }
    public String getGender(){
       return gender;
    }
    public void setGender(String gender){
       this.gender = gender;
    }


}
