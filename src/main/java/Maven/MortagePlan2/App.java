package Maven.MortagePlan2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args) throws IOException {
		//Specify the file path here...
		File file=new File("prospects.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		DecimalFormat decimalFormat2=new DecimalFormat("#.##");
		String str;
		String words[]=null;
		bufferedReader.readLine(); //Reading the first line which just provides the description
		while((str=bufferedReader.readLine())!=null) {
			words=str.split(",");
			if(words.length!=4)
				return;
			Customer c=new Customer();
			//Consumer Name
			c.setCustomerName(words[0]);
			//Total Loan
			c.setU(Double.parseDouble(words[1]));
			//Interest on yearly basis
			c.setYearlyInterest(Double.parseDouble(words[2]));
			//Years
			c.setZ(Integer.parseInt(words[3]));
			//Number of payments
			int p=c.getZ()*12;
			//Calculating interest on monthly basis
			double b=c.getYearlyInterest()/p;
			//Calculating fixed monthly payment
			double E=(c.getU()*(b*(power(1+b,p)))/((power(1+b,p))-1));
			//Output
			System.out.println(c.getCustomerName()+" wants to borrow "+c.getU()+" Euros for a period of "+c.getZ()+" years and pay "+decimalFormat2.format(E)+" Euros each month ");
		}
		fileReader.close();
	}

	static double power(double N, int P)
	{
		if (P == 0)
			return 1;
		else
			return N * power(N, P - 1);
	}
}
