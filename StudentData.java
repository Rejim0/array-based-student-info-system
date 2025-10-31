public class StudentData implements dataRules{
	private String name; //key field
	private String ID;
	private double gpa;
	
	
//constructor	
	public StudentData(String n, String i, double g) {
		name = n;
		ID = i;
		gpa = g;
	}
	
	// Name (key) getter
	public String getName() { return name; }
	
	// Produce a complete duplicate of this student
	public dataRules deepcopy() {
		return new StudentData(name, ID, gpa);
    }
	
	// Check this student's name against another key
	public int compareTo(Object Key) {
		return name.compareTo((String) Key);
	}
	
	// Textual representation of the student’s information.
	public String toString() {
        return "Name: " + name + "\nID: " + ID + "\nGPA: " + gpa + "\n";
    }
	
	
	}
