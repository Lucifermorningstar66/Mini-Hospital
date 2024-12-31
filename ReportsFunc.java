import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReportsFunc {
    public static ArrayList<String> rep = new ArrayList<>();
    public static File file1 = new File("Hospital\\patientlist.txt");
    public static File file2 = new File("Hospital\\equipmentlist.txt");
    public static void reader (){
        try{
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){
                String array = scanner.nextLine();
                array = array.trim().substring(1,array.indexOf("]"));
                array = array.replace(" ","");
                String[] list = array.split(",");
                Patient patient = new Patient(list[0],list[1],list[2],list[3]);

                try{
                    Scanner scanner2 = new Scanner(file2);
                    while (scanner2.hasNextLine()){
                        String array2 = scanner2.nextLine();
                        array2 = array2.trim().substring(1,array2.indexOf("]"));
                        array2 = array2.replace(" ","");
                        String[] list2 = array2.split(",");
                        Equipment equipment = new Equipment(list2[0],list2[1]);
                        if (patient.getNumber().equals(equipment.getPatNumber())){
                            rep.add(patient.toString() + "  <--->  " + equipment.toString());
                            rep.add("\n");
                        }else {
                            rep.add(patient.toString());
                            rep.add("\n");
                        }
                    }
                }catch (FileNotFoundException e2) {
                    System.out.println("An error occurred.");
                    e2.printStackTrace();
                }
            }
        }catch (FileNotFoundException e2) {
            System.out.println("An error occurred.");
            e2.printStackTrace();
        }
    }
}
