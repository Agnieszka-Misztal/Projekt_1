import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonOverwriteTest {
    List<String> residents = new ArrayList<String>();
    List<String> newResidents = new ArrayList<String>();
    List<String> person = new ArrayList<String>();

    @Before
    public void input(){
        residents = Arrays.asList("Wrocław Tomek Nowak 49040501580");
        person = Arrays.asList("Wrocław", "Jan", "Kowalski", "49040501580");
        newResidents = Arrays.asList("Wrocław Jan Kowalski 49040501580");


    }

    @Test
    public void checkIfPersonWithTheSamePeselIsReplaced(){
        Assert.assertEquals(newResidents, PersonOverwrite.checkPerson(residents, person));
    }



}