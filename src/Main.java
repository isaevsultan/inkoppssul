import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // person
        System.out.println("         \t\t\t PEOPLE");
        Person person1 = new Person();
        person1.setFirstName("Sultan");
       person1.setSurName("iSaev");
       person1.setDataOfBirth(LocalDate.of(2005,3,12));
       person1.setGender("M");

        Person person2 = new Person();
        person2.setFirstName("Adilet");
        person2.setSurName("Nurmatov");
        person2.setDataOfBirth(LocalDate.of(2002,9,24));
        person2.setGender("M");

      Person person3 = new Person();
      person3.setFirstName("NUrdan");
      person3.setSurName("Xalimov");
      person3.setDataOfBirth(LocalDate.of(2001,2,2));
      person3.setGender("M");

      Person[] people = {person1,person2,person3,};
      for( Person p:people) {
          System.out.println("    \t\t\t\tАты: "+p.getFirstName());
          System.out.println("      \t\t\tФамилясы: "+p.getSurName());
          System.out.println("   \t\t\t Туулган жылы: "+p.getDataOfBirth());
          System.out.println("     \t\t\t\tПол: "+p.getGender());
          System.out.println();


      }





// maashina
    Car car1 = new Car();
      car1.setColor("beliy");
    car1.setModel("Bmv");
    car1.setWeight(34.4532);
    car1.setPrice((float)70.0000);
    Car car3 = new Car();
   car3.setModel("toyto");
   car3.setColor("belyi");
   car3.setWeight(2.000);
   car3.setPrice((float)40.000);

//Unwer
        System.out.println("\t\t\t\t\tUNIVERSITY");
        University university1 = new University();
        university1.setNameSchool("Gardvard");
        university1.setNumberStudent(500);
        university1.setAdres(" toktogulova 123");
        University university2 = new University();
        university2.setNameSchool(" Manas");
        university2.setNumberStudent(300);
        university2.setAdres("chyi prostpect 123");
        University university3 = new University();
        university3.setNameSchool("Poliex");
        university3.setNumberStudent(600);
        university3.setAdres("Kalyk Akiev kochosy");
        University[] universities = {university1,university2,university3};
        for (int i = 0; i < universities.length; i++) {
            System.out.println("\t\t\t\tNameUnwer: "+universities[i].getNameSchool());
            System.out.println("\t\t\t\tNumberStudent: "+universities[i].getNumberStudent());
            System.out.println("\t\t\t\tAdres: "+universities[i].getAdres());
            System.out.println();


        }



        // shokol
        School school1 = new School();
        school1.setNameSchool("Bokonbaev ");
        school1.setAdres("Kalyk Akiev");
        school1.setNumberStudent(230);
        School school2 = new School();
        school2.setNameSchool("Toktogul Satylganov");
        school2.setAdres("Derbishov 23");
        school2.setNumberStudent(700);
        School school = new School();
        school.setNameSchool("Chyngyz Aitmatov #2");
        school.setAdres("Den Sopina 125");
        school.setNumberStudent(800);
        System.out.println();
        System.out.println("\t\t\t\t\t\t SCHOOL");
        School[] schools = {school1,school2,school};
        for(School s : schools){
            System.out.println("\t\t\t\tnameSchool:"+s.getNameSchool());
            System.out.println("\t\t\t\tAdres:"+s.getAdres());
            System.out.println("\t\t\t\tNumberStudent:"+s.getNumberStudent());
            System.out.println();
        }







    }
}