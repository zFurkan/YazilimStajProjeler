package ifDemo;

public class Main {

	public static void main(String[] args) {
		int sayi1=20;
        int sayi2=25;
	    int sayi3=2;
        int Enbuyuk=sayi1;
        
        if(Enbuyuk<sayi2) {
        	Enbuyuk=sayi2;
        }
        if(Enbuyuk<sayi3) {
        	Enbuyuk=sayi3;
        }
    System.out.println("En büyük sayi ="+Enbuyuk);
        
	}

}
