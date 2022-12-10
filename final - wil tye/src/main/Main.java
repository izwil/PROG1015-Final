package main;
import task.task;
import java.util.Scanner;
public class Main {




    public static void main(String[] args) {

        //creates and enables the 4 slots for tasks
        task j = new task();
        task h = new task();
        task k = new task();
        task l = new task();
        j.enable();
        h.enable();
        k.enable();
        l.enable();

        Scanner g = new Scanner(System.in);


        //start of menu
        int loop = 1;
        while(loop == 1){
            System.out.println("0.End\n1.Add task\n2.edit task\n3.show all tasks\n4.mark task as done\n5.remove task");
            int menu = g.nextInt();

            //what task to edit/create
            if(menu == 1 || menu == 2){
            System.out.println("1.slot 1\n2.slot 2\n3.slot 3\n4.slot 4");
                menu = g.nextInt();


                //if task 1, what to change about it
                if(menu == 1){
                    int i = 1;
                    while(i == 1) {
                        System.out.println("0.go back\n1.add/change name\n2.add date\n3.add status\n4.add description\n5.show task");
                        menu = g.nextInt();
                        if (menu == 1) {
                            j.newTask();
                        } else if (menu == 2) {
                            j.addDate();
                        } else if (menu == 5) {
                            j.showTask();
                        } else if (menu == 3) {
                            j.addStatus();
                        }else if (menu == 0) {
                            i = 0;
                        }else if (menu == 4) {
                            j.addDescription();
                        }
                    }
                }

                //if task 2, what to change about it
                if(menu == 2){
                    int i = 1;
                    while(i == 1) {
                        System.out.println("0.go back\n1.add/change name\n2.add date\n3.add status\n4.add description\n5.show task");
                        menu = g.nextInt();
                        if (menu == 1) {
                            h.newTask();
                        } else if (menu == 2) {
                            h.addDate();
                        } else if (menu == 6) {
                            h.showTask();
                        } else if (menu == 3) {
                            h.addStatus();
                        }else if (menu == 0) {
                            i = 0;
                        }else if (menu == 4) {
                            h.addDescription();
                        }
                    }
                }


                //if task 3, what to change about it
                if(menu == 3){
                    int i = 1;
                    while(i == 1) {
                        System.out.println("0.go back\n1.add/change name\n2.add date\n3.add status\n4.add description\n5.show task");
                        menu = g.nextInt();
                        if (menu == 1) {
                            k.newTask();
                        } else if (menu == 2) {
                            k.addDate();
                        } else if (menu == 6) {
                            k.showTask();
                        } else if (menu == 3) {
                            k.addStatus();
                        }else if (menu == 0) {
                            i = 0;
                        }else if (menu == 4) {
                            k.addDescription();
                        }
                    }
                }


                //if task 4, what to change about it
                if(menu == 4){
                    int i = 1;
                    while(i == 1) {
                        System.out.println("0.go back\n1.add/change name\n2.add date\n3.add status\n4.add description\n5.show task");
                        menu = g.nextInt();
                        if (menu == 1) {
                            l.newTask();
                        } else if (menu == 2) {
                            l.addDate();
                        } else if (menu == 6) {
                            l.showTask();
                        } else if (menu == 3) {
                            l.addStatus();
                        }else if (menu == 0) {
                            i = 0;
                        }else if (menu == 4) {
                            l.addDescription();
                        }
                    }
                }



            //shows all tasks
            }else if(menu == 3){
                j.showTask();
                h.showTask();
                k.showTask();
                l.showTask();


            //mark tasks as done
            }else if(menu == 4){
                System.out.println("1.slot 1\n2.slot 2\n3.slot 3\n4.slot 4");
                menu = g.nextInt();
                if(menu == 1){
                    j.statusDone();
                }else if(menu == 2){
                    h.statusDone();
                }else if(menu == 3){
                    k.statusDone();
                }else if(menu == 4){
                    l.statusDone();
                }



            //exit menu and end code
            }else if(menu == 0){
                loop = 0;

            //remove task
            }else if(menu == 5){
                System.out.println("1.slot 1\n2.slot 2\n3.slot 3\n4.slot 4");
                menu = g.nextInt();
                if(menu == 1){
                   j.enable();
                }else if(menu == 2){
                    h.enable();
                }else if(menu == 3){
                    k.enable();
                }else if(menu == 4){
                    l.enable();
                }


            }




        }













    }


}