package utilities;

import java.util.Locale;

import com.github.javafaker.Faker;

public class Reusable_FakerUtils {

	public Faker faker;

	public Reusable_FakerUtils()
	{
		this.faker =  new Faker(Locale.UK);
	}

	public String randomFirstName()
	{
		return faker.name().firstName();
	}

	public String randomLastName()
	{
		return faker.name().lastName();
	}		

	public String  randomPhoneNum()
	{
		return faker.phoneNumber().cellPhone();
		
	}

	public String randomEmail()
	{
		return faker.internet().safeEmailAddress();
	}

	public String randomStreetAddress()
	{	
		return faker.address().streetAddress();
	}

	public String randomCity()
	{
		return faker.address().cityName();
	}
	
	public String randomPostalCode()
	{	
		return faker.address().zipCode();
	}

}
