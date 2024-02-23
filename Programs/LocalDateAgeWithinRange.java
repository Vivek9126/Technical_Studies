//Finding the List of Employees within age range of 25 to 35

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalDateAgeWithinRange {
	
    public Long id;
		public String name;
		public LocalDate dob;
	 
		public Long getId() {
			return id;
		}
	 
		public void setId(Long id) {
			this.id = id;
		}
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public LocalDate getDob() {
			return dob;
		}
	 
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		
		public LocalDateAgeWithinRange(Long id, String name, LocalDate dob) {
			super();
			this.id = id;
			this.name = name;
			this.dob = dob;
		}
	 
		public static void main(String[] args) {
			LocalDateAgeWithinRange l1 = new LocalDateAgeWithinRange(1L,"vikas", LocalDate.of(1991, 01, 01));
			LocalDateAgeWithinRange l2 = new LocalDateAgeWithinRange(2L,"vivek", LocalDate.of(1999, 11, 29));
			
			List<LocalDateAgeWithinRange> list = Arrays.asList(l1,l2);
			LocalDate now = LocalDate.now();
			list.forEach(n->{
				Period p = Period.between(n.getDob(), now);
				int ageDiff = p.getYears();
				if(ageDiff>=25 && ageDiff<=35) {
					System.out.println(n.getName());
				}
			});
			
			list.stream().filter(n-> LocalDateAgeWithinRange.getYears(n, LocalDate.now()) >=25).collect(Collectors.toList());
			
		}
		
		public static int getYears(LocalDateAgeWithinRange d1,LocalDate d2) {
			return Period.between(d1.getDob(), d2).getYears();
			
		}
	 

}
