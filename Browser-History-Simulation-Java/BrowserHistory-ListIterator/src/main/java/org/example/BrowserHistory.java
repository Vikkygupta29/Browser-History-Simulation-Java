package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BrowserHistory {
   private LinkedList<String> list = new LinkedList<>();
    private String currentPage = null;
    private ListIterator<String> listItr = list.listIterator();

    public void visitPage(String url){
        while(listItr.hasNext()){
            listItr.next();
            listItr.remove();
        }
        listItr.add(url);
        currentPage=url;
        System.out.println("Visited : " +url);
    }

    public void goBack(){
        if (!listItr.hasPrevious()) {
            System.out.println("No previous page exist.");
            return;
        }
        if (currentPage.equals(list.getFirst())) {
            System.out.println("No previous page exist.");
            return;
        }

        // Move before the current page
        listItr.previous();

        if (!listItr.hasPrevious()) {
            currentPage = list.getFirst();

            // Keep cursor after the first page
            listItr.next();

            System.out.println("Back to : " + currentPage);
            return;
        }

        currentPage = listItr.previous();

        // Keep cursor after currentPage
        listItr.next();

        System.out.println("Back to : " + currentPage);
    }
    public void goForward(){
        if (!listItr.hasNext()) {
            System.out.println("No forward page exist.");
            return;
        }

        // Move to the next page
        currentPage = listItr.next();

        System.out.println("Forward to : " + currentPage);
    }

    public void showCurrentPage(){
        if(currentPage == null){
            System.out.println("No page visited yet..");
        }else{
            System.out.println("current Page : " + currentPage);
        }

    }


    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("\n***************************");
        System.out.println("Mini Project - Browser History Simulation");
        System.out.println("**************************");

        System.out.println("\n -------Browser Menu------");
        System.out.println("1. Visit new page");
        System.out.println("2. Go Back");
        System.out.println("3. Go Forward");
        System.out.println("4. Show Current Page");
        System.out.println("0. Exit");

        System.out.printf("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter URL : ");
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
                System.out.println("Existing browser......");
                return;
            default:
                System.out.println("Invalid choice... please try again...");


        }
    }
    }
}