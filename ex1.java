import java.util.Scanner;
 
public class ex1{
 
	public static void main (String []args){
		Scanner kb = new Scanner(System.in);
		int primer = 'a';
		int ultim = 'l';
 
		System.out.print("Introduce el caracter: ");
		char letra = kb.next().charAt(0);
		System.out.print("El caracter complementario es: ");
		int resultado = ultim-letra;
		System.out.println((char)(primer+resultado));
        kb.close();
	}
}