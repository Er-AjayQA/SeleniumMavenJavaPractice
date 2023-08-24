package genericUtilities;

import java.util.Date;
/**
 * @author Ajay Kumar
 * Java Utility is to provide java generic methods which we can use in this project or another also.
 * The Java Utility class provides the different methods like getRandomNhmber(), Java date etc.
 * 
 */
import java.util.Random;

public class JavaUtility {

		/**
		 * This method generates one random number between 0-1000, and also return it.
		 * @return
		 */
		public int getRandomNuber()
		{
			Random rndNum= new Random();
			return rndNum.nextInt(1000);
		}
		
		/**
		 * This method generate the real-time date format.
		 * Here we customize date format according to our requirement. 
		 * @return
		 */
		public String getCustomDate()
		{
			Date dt= new Date();
			String date= dt.toString().replace(":", "_").replace(" ", "-");
			return date;
		}

}
