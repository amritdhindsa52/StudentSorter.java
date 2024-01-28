import java.util.ArrayList;

public class StudentSorter {
    // Bubble sort method to sort students by roll number
    public static void sortByRollNumber(ArrayList<Student> students) {
        int n = students.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (students.get(j).rollno > students.get(j + 1).rollno) {
                    // Swap the elements if they are in the wrong order
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Bubble sort method to sort students by name
    public static void sortByName(ArrayList<Student> students) {
        int n = students.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (students.get(j).name.compareTo(students.get(j + 1).name) > 0) {
                    // Swap the elements if they are in the wrong order
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
