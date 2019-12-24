import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Properties;

public class CountryCodeTest {

		/**
		 * path for PIN.properties file
		 */
		public static String COUNTRY_PATH = "/countries.properties"; 
		
		private static Hashtable<String, String[]> propertiesFromCountry;
		private static Hashtable<String, String[]> propertiesFromCountryCode;

		static {
			String[] result1 = new String[0];
			try {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + COUNTRY_PATH);
				Properties propCountry = new Properties();
				propCountry.load(fis);
				String countriesProperties = propCountry.getProperty("countriesProperties"); 
				result1 = countriesProperties.split(":"); 
				System.out.println("Country properties: " + result1);
			} catch (Exception e) {
				// do nothing
			}
			propertiesFromCountry = new Hashtable<String, String[]>(result1.length);
			propertiesFromCountryCode = new Hashtable<String, String[]>(
					result1.length);
			
			for (int i = 0; i < result1.length; i++) {
				String[] result2 = result1[i].trim().split("\\|"); 
				String[] countryProperties = new String[] { result2[0].trim(),
						result2[1].trim(), result2[2].trim(),result2[3] };
				propertiesFromCountry.put(countryProperties[0], countryProperties);
				propertiesFromCountryCode.put(countryProperties[2],
						countryProperties);
			}
}
		
		public static void main(String[]args) {
			System.out.println();
		}
}

		