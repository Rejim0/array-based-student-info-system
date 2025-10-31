// Defines the general structure that all data objects must follow
public interface dataRules{
	dataRules deepcopy();  // Produce a complete duplicate of the object
	int compareTo(Object Key); // Check this object’s key against another key
	String toString(); // Convert the data of the object to a string and return it
}	
	
