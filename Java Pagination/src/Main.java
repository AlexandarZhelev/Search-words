import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {   //creating new array list and fill the array with the elements
        ArrayList<String> arraylist = new ArrayList<>();

        arraylist.add("University");
        arraylist.add("Java");
        arraylist.add("JavaScript");
        arraylist.add("PHP");
        arraylist.add("HTML");
        arraylist.add("CSS");
        arraylist.add("Spring");
        arraylist.add("Vue");
        arraylist.add("Angular");
        arraylist.add("CSS");
        arraylist.add("CSS");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keyword");
        String keyword = scanner.nextLine(); //submit the keyword from the console

        List <String> filteredList = new ArrayList<>(); //make new empty list where will store containing words
        for(String word : arraylist) //check if the word contain in the initial array list
        {
            if (word.contains(keyword)) // if the word is contained in the array, store it in to the new list
            {
                filteredList.add(word); //add the found word in the list
            }
        }

        if (filteredList.isEmpty()) //check if the list with contained words is empty, if a wrong word is entered, it will not be written on the sheet аnd an error message will be displayed
        {
            System.out.println("Няма резултат");
        }

        System.out.println("Enter the number of words per page");
        int wordsPerPage = scanner.nextInt(); //submit the number of words from the console

        System.out.println("Enter on which page to search");
        int pageNumber = scanner.nextInt(); //submit the page number from the console

        int totalPages = (int) Math.ceil(filteredList.size() / (double) wordsPerPage); //calculate the total pages by rounding the result up
        scanner.close();

        int totalElements = filteredList.size();

        //pagination
        int from = Math.max(0,(pageNumber - 1) * wordsPerPage);
        int to = Math.min(filteredList.size(), pageNumber * wordsPerPage);

        filteredList = filteredList.subList(from, to);

        //printing data and formatting the output
        System.out.println("Items " + filteredList + " " + "Total items:" + totalElements + " " + "Total pages:" + totalPages);
    }
}