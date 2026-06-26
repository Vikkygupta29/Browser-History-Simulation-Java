package org.example;

import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();

    // Visit a new page
    public void visitPage(String url) {

        backStack.push(url);

        // Clear forward history
        forwardStack.clear();

        System.out.println("Visited : " + url);
    }

    // Go Back
    public void goBack() {

        if (backStack.size() <= 1) {
            System.out.println("No previous page exists.");
            return;
        }

        forwardStack.push(backStack.pop());

        System.out.println("Back to : " + backStack.peek());
    }

    // Go Forward
    public void goForward() {

        if (forwardStack.isEmpty()) {
            System.out.println("No forward page exists.");
            return;
        }

        String page = forwardStack.pop();
        backStack.push(page);

        System.out.println("Forward to : " + backStack.peek());
    }

    // Show Current Page
    public void showCurrentPage() {

        if (backStack.isEmpty()) {
            System.out.println("No page visited yet.");
            return;
        }

        System.out.println("Current Page : " + backStack.peek());
    }

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n***************************");
            System.out.println("Browser History");
            System.out.println("***************************");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visitPage(url);
                    break;

                case 2:
                    browser.goBack();
                    break;

                case 3:
                    browser.goForward();
                    break;

                case 4:
                    browser.showCurrentPage();
                    break;

                case 0:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}