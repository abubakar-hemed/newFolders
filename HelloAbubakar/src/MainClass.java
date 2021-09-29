import java.util.Scanner;

class Animal{
	String voice;
	String legs;
	
	public void cat(String catVoice, int catLegs) {
		//catVoice = voice;
		//catLegs = legs;
		System.out.println("This is the voice of " +catVoice+ " and the cat has " +catLegs+" legs"  );
	}
	
	public void dog(String dogVoice, int dogLegs) {
		//dogVoice =  voice;
		System.out.println("This is the voice ofs "+dogVoice+" and the dog has  "+dogLegs+" legs");
	}
}
public class MainClass {
public static void main(String[] args) {
	System.out.println("Please put an animal name \n");
	Scanner nameE= new Scanner(System.in);
	String name = nameE.nextLine();
	int otherLegs = 4;
	Animal animals = new Animal();
	SortingAlgrm sort = new SortingAlgrm();
	switch(name) {
	case "cat":
	animals.cat(name, otherLegs);
	break;
	case "dog":
		animals.dog(name, otherLegs);
		break;
	case "selection":
		
        int[] arr2 = sort.selectSort();
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
		break;
	case "insertion":
		int[] arr3 = sort.insertionSort();
        for(int i:arr3){
            System.out.print(i);
            System.out.print(", ");
        }
		break;
	case "bubble":
		int[] array = sort.my_list;
		 sort.bubbleSort(array);
		 break;
	default:
		System.out.println("please use DOG or CAT");
	}
}
}
