import java.util.ArrayList;

import java.util.Scanner;


public class DirLister {


	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contentsList = new ArrayList<>();
        while (true) {
            String inputLine = scanner.nextLine();
            

            if (inputLine.equals("")) {
                break;
            }

            contentsList.add(inputLine);
        }
        for (int i = 0; i < contentsList.size(); i++) {
            System.out.println((i + 1) + ". " + contentsList.get(i));
        }
	}
}
