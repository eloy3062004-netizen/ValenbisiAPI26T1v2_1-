package tema4;
import java.util.ArrayList;
public class PersonTester {
		public static void showStaff(ArrayList<Person> l, String school) {
			for (int i = 0; i < l.size(); i++) {
				Person p=l.get(i);
				//System.out.println(p.toString());
				if (p instanceof Staff) {
					
					if(((Staff)p).getSchool().equals(school))
						System.out.println(p.toString());;
				}
				//System.out.println(p.getProgram());
			}
		
		}
		public static void main(String[] args) {
			ArrayList<Person> p = new ArrayList<Person>();
			p.add(new Student("Mario", "Calle", "DAW", 1, 200));
			p.add(new Student("Anne", "Avenida", "DAM", 2, 200));
			p.add(new Staff("Iván", "Calle", "Abastos", 2500));
			p.add(new Student("Pepe", "Calle", "DAW", 2, 230));
			p.add(new Student("Peter", "Avenida", "ASIR", 1, 200));
			p.add(new Staff("Elena", "fhasdjklh", "IES Juan de Garay", 2900));
			p.add(new Staff("Pascual", "fhasdjklh", "IES Juan de Garay", 2900));
			showStaff(p, "IES Juan de Garay");
			//System.out.println(p);

		}

	}

