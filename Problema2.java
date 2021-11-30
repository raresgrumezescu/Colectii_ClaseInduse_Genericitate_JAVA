package laborator8;

class Catalog extends TreeSet<Catalog> {
	class Student implements Comparable<Student>{
		String name;
		double media;
		int clazz;
		
		Student (String nume, double media, int clazz) {
			this.name = nume;
			this.media = media;
			this.clazz = clazz;
		}
		
		public double compareTo(Student stud1, Student stud2) {
			double medie1 = stud1.media;
			double medie2 = stud2.media;
			if (medie1 != medie2)
				return medie2 - medie1;
			else if (stud1.name.compareTo(stud2.name) > 0)
						return 1;
				else return -1;
		}
		
		public String toString (Student stud) {
			return stud.name + " " + stud.media + " " + stud.clazz;
		}
	}
	
	public Catalog (Comparator comparator) {
		
	}
	
	public Catalog () {
		
	}
	
	public void addStudent (String nume, double media, int clazz) {
		Student stud = new Student(nume, media, clazz);
		this.add(stud);
	}
	
	public Student getStudent (String name) {
		
	}
}

public class Problema2 {

}
