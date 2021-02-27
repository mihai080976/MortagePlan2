package Maven.MortagePlan2;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     * @throws IOException
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {
        File file=new File("prospects.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        //making sure file is not empty
        assertTrue( (bufferedReader.readLine()) != null  );
    }
}

