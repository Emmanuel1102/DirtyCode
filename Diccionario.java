import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
public class Diccionario {

	public static String[] generarContra(int CantidadContra){
		
						
			
			System.out.println("Ingresa  palabra");
			Scanner sc1 = new Scanner(System.in);
			String escaner1 = sc1.next();
			
			System.out.println("Ingresa algun numero");
			Scanner sc2 = new Scanner(System.in);
			String escaner2 = sc2.next();
			
			System.out.println("Ingresa un caracter especial");
			Scanner sc3 = new Scanner(System.in);
			String escaner3 = sc3.next();
			
			System.out.println("Ingresa un caracter en mayuscula");
			Scanner sc4 = new Scanner(System.in);
			String escaner4 = sc4.next();
			
			
			
			String Contra[]= new String[CantidadContra];
			
			String[]Listas1={escaner1,escaner2};
			String[]Listas2={escaner1,escaner3};
			String[]Listas3={escaner1,escaner4};
			String[]Listas4={escaner2,escaner3};
			String[]Listas5={escaner3,escaner4};
			String[]Listas6={escaner2,escaner4};


			for(int i=0;i<CantidadContra;i++){
				
			Contra[i] = Listas1[(int) (Math.random() * ((Listas1.length - 1) - 0 + 1) + 0)] +
					      Listas2[(int) (Math.random() * ((Listas2.length - 1) - 0 + 1) + 0)] +
					      Listas3[(int) (Math.random() * ((Listas3.length - 1) - 0 + 1) + 0)] +
					      Listas4[(int) (Math.random() * ((Listas4.length - 1) - 0 + 1) + 0)] +
					      Listas5[(int) (Math.random() * ((Listas5.length - 1) - 0 + 1) + 0)] +
					      Listas6[(int) (Math.random() * ((Listas6.length - 1) - 0 + 1) + 0)] ;


			}
			return Contra;
		}

		public static void imprimir(String[] ContrassGenerados) {
			for (int i = 0; i < ContrassGenerados.length; i++) {
			

				
				System.out.println(ContrassGenerados[i]);
			}
		}

	
	public static void main(String[] args) {
			
			imprimir(generarContra(1000000));
		
		
			
		}
		
	}
	
	

