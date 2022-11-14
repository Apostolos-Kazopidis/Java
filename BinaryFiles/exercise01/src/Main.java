import java.io.*;
import java.util.Scanner;

public class Main {

    public static int readInt(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            System.out.print("Your choice: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice < lower || choice > upper) {
                    System.out.println("Error: Between " + lower + " and " + upper);
                }
                else
                    return choice;
            }
            else {
                sc.next();
                System.out.println("Error: Invalid input");
            }
        }
    }

    public static void saveFile(String fileName, User[] users, int curUsers) {
        File f = new File(fileName);

        try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)))) {

            for (int i=0; i<curUsers; i++) {
                os.writeObject(users[i]);
            }

        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static int loadFile(String fileName, User[] users) {
        File f = new File(fileName);

        int cnt = 0;
        try (ObjectInputStream os = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {

            while(true) {
                users[cnt] = (User) os.readObject();
                System.out.println(users[cnt]);
                cnt++;
            }
        } catch (IOException | ClassNotFoundException e) {
            return cnt;
        }
    }

    public static void main(String[] args) {
        final int MAX_USERS =10;
        final String fileName = "users.bin";
        User[] users = new User[MAX_USERS];
        int curUsers = loadFile(fileName,users);

        boolean exit = false;

        try(Scanner sc = new Scanner(System.in)) {

            while (!exit) {
                int choice;
                System.out.println("====================");
                System.out.println("Menu");
                System.out.println("1-Insert User");
                System.out.println("2-Delete User");
                System.out.println("3-Print User");
                System.out.println("4-Exit");
                System.out.println("====================");
                choice = readInt(sc,1,4);

                switch (choice) {
                    case 1:
                        if (curUsers == MAX_USERS) {
                            System.out.println("Max Users reached");
                            break;
                        }

                        sc.nextLine();
                        System.out.println("Insert new user");
                        System.out.print("fullName: ");
                        String fullName = sc.nextLine();
                        System.out.print("userName: ");
                        String userName = sc.next();
                        System.out.print("passWord: ");
                        String passWord = sc.next();
                        System.out.print("role (1-admin | 2-user): ");
                        int role = readInt(sc,1,2);
                        users[curUsers] = new User(fullName,userName,passWord,role);
                        curUsers++;
                        System.out.println("User added!");
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("Delete user");
                        System.out.println("Give a fullName: ");
                        String name = sc.nextLine();

                        boolean found = false;
                        for(int i=0; i<curUsers; i++) {
                            if(users[i].getFullName().equals(name)) {
                                found = true;
                                users[i] = users[curUsers-1];
                                curUsers--;
                                System.out.println("User deleted! ");
                                break;
                            }
                        }

                        if(!found)
                            System.out.println("User doesn't exist!");


                        break;
                    case 3:
                        for(int i=0; i<curUsers; i++) {
                            System.out.println(users[i]);
                        }
                        break;
                    case 4:
                        exit = true;
                        saveFile(fileName, users, 5);
                }


            }

        }

    }
}