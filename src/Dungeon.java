import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    private int numberoflevels = 16;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void rooms() {
        int numberofrooms;
        numberofrooms = random.nextInt(5);
        numberofrooms += 1;
        System.out.println(numberofrooms);

        System.out.println("A hero has entered to the dungeon to save as many townspeople as possible");

        if (numberofrooms == 1) {

            System.out.println("You are in the room 1");

        } else if (numberofrooms == 2) {

            System.out.println("You are in the room 1");
            System.out.println("There is one door in this room would you like to open it (yes/no) ");
            String a = scanner.nextLine();

            if (a.equals("yes")) {
                System.out.println("You have entered the room number 2");
            } else if (a.equals("no")) {

                System.out.println("Stay here then");
            } else {
                System.out.println("You have entered a wrong word");
            }

        } else if (numberofrooms == 3) {

            System.out.println("You are in the room 1");
            System.out.println("There is one door in this room would you like to open it (yes/no) ");
            String a = scanner.nextLine();

            if (a.equals("yes")) {
                System.out.println("You have entered the room number 2");
                System.out.println("There is one door in this room would you like to open it (yes/no) ");
                String b = scanner.nextLine();

                if (b.equals("yes")) {
                    System.out.println("You have entered the room number 3");
                } else if (b.equals("no")) {

                    System.out.println("Stay here then");
                } else {
                    System.out.println("You have entered a wrong word");
                }


            } else if (a.equals("no")) {

                System.out.println("Stay here then");
            } else {
                System.out.println("You have entered a wrong word");
            }


        } else if (numberofrooms == 4) {

            System.out.println("You are in the room 1");
            System.out.println("There is one door in this room would you like to open it (yes/no) ");
            String a = scanner.nextLine();

            if (a.equals("yes")) {
                System.out.println("You have entered the room number 2");
                System.out.println("There is one door in this room would you like to open it (yes/no) ");
                String b = scanner.nextLine();

                if (b.equals("yes")) {
                    System.out.println("You have entered the room number 3");
                    System.out.println("There is one door in this room would you like to open it (yes/no) ");
                    String c = scanner.nextLine();

                    if (c.equals("yes")) {
                        System.out.println("You have entered the room number 4");


                    } else if (b.equals("no")) {

                        System.out.println("Stay here then");
                    } else {
                        System.out.println("You have entered a wrong word");
                    }


                } else if (a.equals("no")) {

                    System.out.println("Stay here then");
                } else {
                    System.out.println("You have entered a wrong word");
                }}

            } else if (numberofrooms == 5) {
                System.out.println("You are in the room 1");
                System.out.println("There is one door in this room would you like to open it (yes/no) ");
                String a = scanner.nextLine();

                if (a.equals("yes")) {
                    System.out.println("You have entered the room number 2");
                    System.out.println("There is one door in this room would you like to open it (yes/no) ");
                    String b = scanner.nextLine();

                    if (b.equals("yes")) {
                        System.out.println("You have entered the room number 3");
                        System.out.println("There is one door in this room would you like to open it (yes/no) ");
                        String c = scanner.nextLine();

                        if (c.equals("yes")) {
                            System.out.println("You have entered the room number 4");
                            System.out.println("There is one door in this room would you like to open it (yes/no) ");
                            String d = scanner.nextLine();
                            if (d.equals("yes")) {
                                System.out.println("You have entered the room number 5");
                            } else if (d.equals("no")) {
                                System.out.println("Stay here then");
                            } else {
                                System.out.println("Wrong number");
                            }


                        } else if (b.equals("no")) {

                            System.out.println("Stay here then");
                        } else {
                            System.out.println("You have entered a wrong word");
                        }


                    } else if (a.equals("no")) {

                        System.out.println("Stay here then");
                    } else {
                        System.out.println("You have entered a wrong word");
                    }
                }

            }


        }

    }
