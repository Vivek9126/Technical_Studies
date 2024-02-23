//Convert List of Person objects into map of person name as Key and Email as value using Java 8 streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.test.pojos.Person;

public class ListAsMapJavaStream {

	public static void main(String[] args) {
       Person p1= new Person(1,"Vivek","Vivek@gmail.com");
       Person p2= new Person(2,"Vikas","Vikas@gmail.com");
       
       List<Person> personlist = new ArrayList<Person>();
       personlist.add(p1);
       personlist.add(p2);
       
       personlist.stream().collect(Collectors.toMap(Person::getName, Person::getEmail)).entrySet().stream().forEach(System.out::println);;
       
	}

}
