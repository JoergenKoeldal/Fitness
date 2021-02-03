public class Instructor extends Employee {

    public Instructor (String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    @Override
    public int getSalary() {
        return getHours()*199;
    }


}
