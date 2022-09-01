import java.util.*;
import java.io.File;
import java.util.Scanner;;
import java.io.FileNotFoundException;


public class projectOne {
    public static void main(String args[]){
        //Create a list and fills the list with names of students. Student names need to be on seperate lines.
        List<String> students = new ArrayList<String>();
        try {
            //The text file needs to be in the same directory as the .java file
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              students.add(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          System.out.println(students);
          // THE NEXT STEP IS TO CREATE A "GROUP" OBJECT/CLASS WITH TWO ATTRIBUTES, GROUP NAME AND A LIST OF STUDENTS
          // I JUST PUT A LINK IN SLACK THAT LOOKS LIKE IT COULD HELP WITH CREATING THAT
          // students.remove(1);
          //Asks the user for the desired number of groups
        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("There are " + students.size() + " students. How many groups do you want?");
        //   int numbOfGroups = sc.nextInt();
    }
}