public class Sorted_StudentArray{
	private StudentData[] data; // array to hold student records
	private int next; // next index
	private int size; // maximum size of array
	
	
//constructor	
	public Sorted_StudentArray(int s) {
		size = s;
		next = 0;
		data = new StudentData[s];
	}
	
// Method to insert new student in sorted order array	
public boolean insert(StudentData newStudent) {
	if(next >= size)
		return false;
	
	int i = next - 1;
	while(i >= 0 && data[i].compareTo(newStudent.getName())>0) {
		data[i+1] = data[i];
		i--;
	}
	data[i+1] = (StudentData) newStudent.deepcopy();
	next++;
	return true;
	
}

// Method to fetch student using binary search
public StudentData fetch(String choosen_value) {
	int low = 0, high = next - 1;
	while(low <= high) {
		int mid_value = (low+high)/2;
		int comparison = data[mid_value].compareTo(choosen_value);
		
		if(comparison == 0) return (StudentData) data[mid_value].deepcopy();
		else if (comparison < 0) low = mid_value + 1;
		else high = mid_value - 1;
	}
	return null;
		
	
}

// Method to delete a student by name
public boolean delete(String choosen_value) {
	int i = 0;
	while(i < next && data[i].compareTo(choosen_value) != 0) 
		i++;
	if( i == next) return false;
	
	for (int j = i; j < next - 1; j++) {
		data[j] = data[j+1];
		
	}
	 data[next - 1] = null;
     next--;
     return true;
 }

// Method to update the info
public boolean update(String choosen_value, StudentData newStudent) {
    if (!delete(choosen_value)) return false;
    return insert(newStudent);
}

// To print all the students
public void showAll() {
    for (int i = 0; i < next; i++) {
        System.out.println(data[i]);
    }
}








	
}