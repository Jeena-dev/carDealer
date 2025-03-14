package ui;

import exception.DuplicateUserException;
import exception.UserNotFoundException;
import impl.CarRepositoryImpl;
import model.User;
import service.CarService;
import service.UserService;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);

    private final UserService userService;

    public MainMenu(UserService userService) {
        this.userService = userService;
    }

    public void showMenu(){
        System.out.println("welcome to the E-commerce App");
      while (true){
          System.out.println("=== Main Menu ===");
          System.out.println("Select an option from the following list");
          System.out.println("1. Register");
          System.out.println("2. Login");
          System.out.println("3. Exit");

          int choice = scanner.nextInt();
          scanner.nextLine();// clear the buffer

          switch (choice){
              case 1: handleRegistration();
              break;
              case 2: handleLogin();
              break;
              case 3:
                  System.out.println("Goodbye!");
                  System.exit(0);
              default:
                  System.out.println("Invalid choice");

          }
      }
    }

    private void handleLogin() {
        System.out.println("Enter username");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        try {
            User user = userService.loginUser(username,password);

            if(user.isAdmin()){
                new AdminMenu().showMenu(userService,new CarService(new CarRepositoryImpl()));
            } else {
                new UserMenu(user,new CarService(new CarRepositoryImpl())).showMenu();
            }
        }catch (UserNotFoundException ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }

    private void handleRegistration(){
     System.out.println("Enter user id");
     int id = scanner.nextInt();
     scanner.nextLine();
     System.out.println("Enter username");
     String username = scanner.nextLine();
     System.out.println("Enter password");
     String password = scanner.nextLine();
     System.out.println("Are you an admin? (yes/no)");
     boolean isAdmin = scanner.nextLine().equalsIgnoreCase("yes");


     User user = new User(id,username,password,isAdmin);

     try {
         userService.addUser(user);
         System.out.println("User registered successfully");
     }catch (DuplicateUserException ex){
         System.out.println("Error: "+ex.getMessage());
     }
 }
///    public static void main(String[] args) {
//        MainMenu mainMenu = new MainMenu(null);
//        mainMenu.showMenu();
//    }


}
