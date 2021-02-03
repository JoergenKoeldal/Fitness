import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String str = "";
       Member member1 = new Member(true, "Morten", "130195-1303");
        ArrayList<Person> fitnessList = new ArrayList<>();
        fitnessList.add(member1);
        fitnessList.add(new Member(false, "Martin", "221175-1011"));
        fitnessList.add(new Member(true, "Martina", "050970-1410"));
        fitnessList.add(new Member(false, "Marcel", "221175-1011"));
        fitnessList.add(new Administration("Claus", "221175-1011", 37, 33000, 5));
        fitnessList.add(new Administration("Anna", "011080-1012", 37, 33000, 5));
        fitnessList.add(new Instructor("Tove", "011080-1014", 20, 199));
        fitnessList.add(new Instructor("Henning", "011081-1015", 15, 199));

        //Prints employees
        System.out.println("Name  CPR     Hours Salary Vacation");
        for (Person person: fitnessList) {
           str = "";
            if (person instanceof Employee) {
                str += person.getName() + " " + person.getCpr() + " " + ((Employee) person).getHours() + " " + ((Employee) person).getSalary();
                if (person instanceof Administration) {
                   str += " " + ((Administration) person).getVacation();
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
