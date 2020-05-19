

import java.io.FileNotFoundException;
import java.util.*;


public class Input {


   public static void createFile(String fileName){
       List<String> residents = new ArrayList<String>();

        try (Formatter output = new Formatter(fileName)){
            Scanner scanner = new Scanner(System.in);

            Boolean read = true;
            while (read) {
                List<String> person = new ArrayList<String>();
                System.out.println("Podaj miasto: ");
                person.add(scanner.nextLine());
                System.out.println("Podaj kolejno odzelone spacjami imię, nazwisko, numer PESEL");
                String nextData = scanner.nextLine();
                for (String data: nextData.split(" "))
                {person.add(data);
                }
                if(Check.checkPESEL(person.get(3))==false){
                    System.out.println("Błedny nr PESEL, spróbuj ponownie");
                    continue;
                }


                residents = PersonOverwrite.checkPerson(residents, person);


                System.out.println("Czy dodać kolejną osobę do listy? [t/n]");
                if(scanner.nextLine().equals("n")){
                    read=false;
                }
            }
            for (String s: residents) {
                try {
                    output.format(s + "\n");
                }catch (NoSuchElementException e){
                    System.out.println("blad zapisu");
                }
            }

        }catch (FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }
   }


    
}
