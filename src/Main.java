import java.time.temporal.Temporal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Er udarbejdet i samarbejde med Matias Storm

        //Vi har ændret lidt i designet, og rykket bestemmelse af membertype i Member Klassen, ud i en setMetode, som bliver kaldt af constructoren
        //Fordelen ved ikke at have det i getMetoden er, at den type metoder bliver kaldt langt oftere, så hvis programmet skal
        //Blive stort og stærkt engang kører vi en masse linjer kode igen og igen uden grund

        String str = "";
        String divider = "***************************************************";
        ArrayList<Person> fitnessList = new ArrayList<>();
        fitnessList.add(new Member(true, "Morten", "130195-1303"));
        fitnessList.add(new Member(false, "Martin", "221175-1011"));
        fitnessList.add(new Member(true, "Martina", "050970-1410"));
        fitnessList.add(new Member(false, "Marcel", "221175-1011"));
        fitnessList.add(new Administration("Claus", "221175-1011", 37, 33000, 5));
        fitnessList.add(new Administration("Anna", "011080-1012", 37, 33000, 5));
        fitnessList.add(new Instructor("Tove", "011080-1014", 20, 199));
        fitnessList.add(new Instructor("Henning", "011081-1015", 15, 199));

        //Prints employees
        System.out.println("Name      CPR           Hours  Salary  Vacation");
        System.out.println(divider);
        for (Person person: fitnessList) {
           str = "";
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                str += employee.getName() + " ".repeat(10 - employee.getName().length());
                str += employee.getCpr() + "     ";
                str += employee.getHours() + "   ";
                str += employee.getSalary() + "   ";
                if (employee instanceof Administration) {
                    Administration admin = (Administration) employee;
                    str += admin.getVacation();
                }
                System.out.println(str);
            }

        }

        System.out.println(" ");
        //Prints members

        System.out.println("Name    CPR   Membership Fee");

        for(Person person: fitnessList) {
           str = "";
            if (person instanceof Member)
                str +=  person.getName() + " " + person.getCpr() + " " + ((Member) person).getMemberType() + " " + ((Member) person).getMonthlyFee();
                System.out.println(str);
        }


        System.out.println("Name    CPR  ");
        for (Person person: fitnessList) {
            str = "";
            str += person.getName() + " " + person.getCpr();
            System.out.println(str);
        }


    }
}
