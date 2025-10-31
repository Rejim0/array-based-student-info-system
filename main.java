import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Ask the user to enter max number of student record.
		System.out.println("Enter the maximum number of students record: ");
		int MaxSize = scanner.nextInt();
		scanner.nextLine();
		
		//create sorted student array.
		Sorted_StudentArray students = new Sorted_StudentArray(MaxSize);
		
		// Loop for Menu.
		while(true) {
			System.out.println("\n1.Insert  2.Fetch  3.Delete  4.Update  5.Show All  6.Exit");
			System.out.println("----------------------------------------------------------------");
            System.out.print("Enter Required option from menu : ");
            int menu_pick = scanner.nextInt();
            scanner.nextLine();
			
			// Option 1 for insert.
			if (menu_pick == 1) {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("ID: ");
				String id = scanner.nextLine();
				System.out.print("GPA: ");
				double gpa = scanner.nextDouble();
				scanner.nextLine();
				
				students.insert(new StudentData(name, id, gpa));
				
				
			}
			
			// Option 2 for Fetch.
			else if(menu_pick == 2) {
				System.out.print("Enter name to Fetch: ");
				String name = scanner.nextLine();
				StudentData fetchStudent = students.fetch(name);
				System.out.println((fetchStudent != null) ? fetchStudent: "Not Found.");
					
			}
			// Option 3 for Delete.
			else if(menu_pick == 3) {
				System.out.println("Enter name to delete: ");
				String name = scanner.nextLine();
				System.out.println(students.delete(name) ? "Deleted.":"Not Found.");
				
			}
			// Option 4 for Update.
			else if(menu_pick == 4) {
				System.out.print("Enter name to update: ");
                String oldName = scanner.nextLine();
                System.out.print("New Name: ");
                String newName = scanner.nextLine();
                System.out.print("New ID: ");
                String newId = scanner.nextLine();
                System.out.print("New GPA: ");
                double newGpa = scanner.nextDouble();
                scanner.nextLine();
                
                students.update(oldName, new StudentData(newName, newId, newGpa));
				
			}
			
			// Option 5 for printing all students.
			else if (menu_pick == 5) {
				students.showAll();
			}
			// Option 6 for exit.
			else if(menu_pick == 6) {
				System.out.println("See ya !");
				break;
			}
			
			
		}
		scanner.close();
		

		
		
		
		
		
	}

}
