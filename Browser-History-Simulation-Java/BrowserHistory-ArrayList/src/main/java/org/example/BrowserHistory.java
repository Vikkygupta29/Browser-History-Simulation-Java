package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class BrowserHistory {

    private ArrayList<String> history = new ArrayList<>();
    private int currentIndex = -1;

    // Visit a new page
    public void visitPage(String url) {

        // Remove all forward history
        while (history.size() > currentIndex + 1) {
            history.remove(history.size() - 1);
        }

        history.add(url);
        currentIndex++;

        System.out.println("Visited : " + url);
    }

    // Go back
    public void goBack() {

        if (currentIndex <= 0) {
            System.out.println("No previous page exist.");
            return;
        }

        currentIndex--;

        System.out.println("Back to : " + history.get(currentIndex));
    }

    // Go forward
    public void goForward() {

        if (currentIndex >= history.size() - 1) {
            System.out.println("No forward page exist.");
            return;
        }

        currentIndex++;

        System.out.println("Forward to : " + history.get(currentIndex));
    }

    // Show current page
    public void showCurrentPage() {

        if (currentIndex == -1) {
            System.out.println("No page visited yet.");
            return;
        }

        System.out.println("Current Page : " + history.get(currentIndex));
    }

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n***************************");
            System.out.println("Mini Project - Browser History Simulation");
            System.out.println("***************************");

            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("0. Exit");

            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter URL : ");
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
                    System.out.println("Exiting Browser...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}