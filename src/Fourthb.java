

    import java.util.Arrays;
            import java.util.List;
    import java.util.stream.Collectors;

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
        Employee[] e=new Employee[5];
        e[0]=new Employee("Yasu Yasamina Yas",2000,"SGNR");
        e[1]=new Employee("Kenny Chesling Somewhere",3000,"Chandigarh");
        e[2]=new Employee("Kelly Clarkson Stronger",20000,"Ohio");
        e[3]=new Employee("Ross Manuco Rude",8000,"Hawaii");
        e[4]=new Employee("Zooey Deschanel New",1000,"Delhi");
//        List<String> result = e.stream().filter(x -> {x.salary<5000&&x.city=="Delhi"})
//                .collect(Collectors.toList());

        result.forEach(word -> System.out.println(word));

    }
}
