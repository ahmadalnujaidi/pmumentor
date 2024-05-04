package com.pmumentor;

import com.pmumentor.service.ContentService;
import com.pmumentor.service.EventService;
import com.pmumentor.service.UserService;

import java.util.Scanner;

public class App {
    private static final UserService userService = new UserService();
    private static final EventService eventService = new EventService();
    private static final ContentService contentService = new ContentService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> createEvent();
                case 4 -> shareContent();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Register User");
        System.out.println("2. Login");
        System.out.println("3. Create Event");
        System.out.println("4. Share Content");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static void registerUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        userService.registerUser(name, email, password);
    }

    private static void loginUser() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        userService.login(email, password);
    }

    private static void createEvent() {
        System.out.print("Enter event title: ");
        String title = scanner.nextLine();
        System.out.print("Enter event description: ");
        String description = scanner.nextLine();

        eventService.createEvent(title, description);
    }

    private static void shareContent() {
        System.out.print("Enter content title: ");
        String title = scanner.nextLine();
        System.out.print("Enter content URL: ");
        String url = scanner.nextLine();

        contentService.shareContent(title, url);
    }
}
