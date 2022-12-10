package task;
import java.util.ArrayList;
import java.util.Scanner;
public class task {
    ArrayList<String> j = new ArrayList<String>();

    Scanner g = new Scanner(System.in);


    public void enable(){
       j.add(0, "");
        j.add(1, "");
        j.add(2, "");
        j.add(3, "");
    }





    public void newTask(){
        System.out.println("Enter name: ");
        j.add(0, g.nextLine());
    }

    public void addDate(){
        System.out.println("Enter due date: ");
        j.add(1, g.nextLine());
    }

    public void addStatus(){
        System.out.println("Enter Status: ");
        j.add(2, g.nextLine());
    }



    public void showTask(){


       System.out.print("\nName: " + j.get(0) + "      ");
        System.out.print("Date: " + j.get(1) + "      ");
        System.out.print("Status: " + j.get(2) + "      ");
        System.out.print("description: " + j.get(3) + "      \n\n");
    }

    public void addDescription(){
        System.out.println("Enter description: ");
        j.add(3, g.nextLine());


    }

    public void statusDone(){
        j.add(2, "done");
    }



}

