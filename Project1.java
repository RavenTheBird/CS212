import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Project1 {
	public static void main(String[] args) {
		try {
			Car[] unsorted = new Car[20];
			Car[] sorted = new Car[20];

			
			Scanner fill = new Scanner(new File("cars.txt"));
			int i = 0;
			
			while (true) {

				if (!fill.hasNextLine()) {
					break;
				}

				String line = fill.nextLine();
				StringTokenizer st = new StringTokenizer(line, ",");

				if (st.countTokens() == 4) {
					
					String make = st.nextToken();
					String model = st.nextToken();
					int year = Integer.parseInt(st.nextToken());
					int miles = Integer.parseInt(st.nextToken());
					Car tempCar = new Car( make,model, year, miles);

					unsorted[i] = tempCar;
					sorted[i] = tempCar;
					i++;
				}

				else {
					System.out.println(line);
				}

			}
			selectionSort(sorted,i);

			
			Gui myGui = new Gui();
			myGui.showGui();
			myGui.SortedAndUnsorted(unsorted, sorted,i);
			
			fill.close();
			
		} // TRY CATCH BLOCK. TRY

		catch (FileNotFoundException e) {
			System.out.println("File not found");
		} // CATCH BLOCK
	}
	


	public static void selectionSort(Car[] input,int size) {
		for (int i = 0; i < size; i++) {
			int minIndex = i;
			for (int j = i + 1; j <  size; j++) {
				if (input[j].getMake().compareToIgnoreCase(input[minIndex].getMake()) < 0) {
					minIndex = j;
				}
			}
			swap(input, i, minIndex);
		}
	}// selection sort function

	public static void swap(Car[] input, int i, int j) {
		Car temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}
}// swap class
