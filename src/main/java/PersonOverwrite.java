
import java.util.List;
import java.util.stream.Collectors;


public class PersonOverwrite {

    public static List<String> checkPerson(List<String> residents, List person){
        String city = person.get(0).toString();
        String name = person.get(1).toString();
        String surname = person.get(2).toString();
        String pesel = person.get(3).toString();




        boolean match = residents.stream().anyMatch(s-> s.endsWith(pesel));


       if(match) {
           List<String> replaced = residents.stream().map(line -> line.replaceAll( ".*"+pesel, city+" " + name +" " + surname +" "+ pesel)).collect(Collectors.toList());
           System.out.println("Ten sam PESEL, dokonano podmiany");
           return replaced;

            }
       residents.add((person.get(0) + " " + person.get(1) + " " + person.get(2) + " " + person.get(3)));
       return residents;


    }
}
