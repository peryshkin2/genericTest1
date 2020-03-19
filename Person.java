package lambda;

import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public static void printPersons(
    	    List<Person> roster, CheckPerson tester) {
    	    for (Person p : roster) {
    	        if (tester.test(p)) {
    	            p.printPerson();
    	        }
    	    }
    	}

    public void printPerson() {
        System.out.println(name+" birthday="+birthday);
    }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getBirthday() {
		return birthday;
	}



	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}



	public Sex getGender() {
		return gender;
	}



	public void setGender(Sex gender) {
		this.gender = gender;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static List<Person> createShortList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printName() {
		// TODO Auto-generated method stub
		
	}
}

