import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss");
        LocalTime today = LocalTime.now();
        String fileName =  today.format(formatter) + "_list.txt";
        Input.createFile(fileName);
    }
}
