import java.util.ArrayList;
import java.util.Scanner;

/*
Traverse the Web following hyperlinks on each webpage
Stop this process once 100 pages have been traversed
Algorithm
Add the starting URL to a list named listOfPendingURLs;
while listOfPendingURLs is not empty and size of listOfTraversedURLs <= 100{
	Remove a URL from listOfPendingURLs;
	if this URL is not in listOfTraversedURLs{
		Add it to listOfTraversedURLs
		Display this URL;
		Read the page from this URL and for each URL contained in the page{
			Add it to listOfPendingURLs if it is not in listOfTraversedURLs;
		}
	}
}
 */
public class WebCrawler {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a URL ");
		String url = in.nextLine();
		crawler(url); //Traverse the Web from the starting url
		
		in.close();
	}
	
	public static void crawler(String startingURL) {
		//list of pending URLs
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		//list of traversed URLs
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		//adding starting URL
		listOfPendingURLs.add(startingURL);
		while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size()<=100) {
			//get the first URL
			String urlString = listOfPendingURLs.remove(0);
			//if listOfTraversedURLs doesn't contain the url to be added
			if (!listOfTraversedURLs.contains(urlString)) {
				//URL traversed
				listOfTraversedURLs.add(urlString);
				System.out.println("Crawl " + urlString);
			}
			
			for (String s : getSubURLs(urlString)) {
				if (!listOfTraversedURLs.contains(s)){
					//add a new URL
					listOfPendingURLs.add(s);
				}
			}
		
		}
				
	}

	public static ArrayList<String> getSubURLs(String urlString){
		ArrayList<String> list = new ArrayList<>();
		try {
			java.net.URL url = new java.net.URL(urlString);
			Scanner in = new Scanner(url.openStream());
			int current = 0;
			while (in.hasNext()) {
				//read a line
				String line = in.nextLine();
				//search for a URL
				current = line.indexOf("http:", current);
				while (current > 0) { //end of a URL
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						//extract a URL
						list.add(line.substring(current, endIndex));
						//search for the next URL in this line
						current = line.indexOf("http:", endIndex);
					}else {
						current = -1;
					}
				}
			}
			in.close();
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		return list;
	}
	
	
}
