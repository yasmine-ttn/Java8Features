

    import java.util.Arrays;
            import java.util.List;
    import java.util.stream.Collectors;
    import java.util.stream.Stream;

    class Employee{
        String fullName;
        long salary;
        String city;

        public Employee(String  fullName,long salary,String city)
        {
            this.fullName=fullName;
            this.salary=salary;
            this.city=city;
        }
    }

    public class Fourthb {
    public static void main(String[] args) {
        Employee[] employees=new Employee[5];
        employees[0]=new Employee("Yasu Yasamina Yas",2000,"SGNR");
        employees[1]=new Employee("Kenny Chesling Somewhere",3000,"Chandigarh");
        employees[2]=new Employee("Kelly Clarkson Stronger",2000,"Delhi");
        employees[3]=new Employee("Kishore Kumar",4000,"Delhi");
        employees[4]=new Employee("Kishore Sharma New",1000,"Delhi");

        System.out.println(Stream.of(employees)
                .filter(e-> e.salary<5000 && e.city.equals("Delhi") )
                .map(e->e.fullName.split(" ")[0]).collect(Collectors.toSet()));;
//       Stream.of(employees)
//                .filter(e-> e.salary<5000 && e.city.equals("Delhi") ).forEach(System.out::println);



    }
}
