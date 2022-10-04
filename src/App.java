import java.util.Scanner;

public class App {
	

	
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Menu menu = new Menu();
		String[][] asientosDisponibles = new String[30][40];
		generarAsientos(asientosDisponibles);
		
		
		//Generar un while y el numero 12 será el que lo corte
		
		int opcion = 0;
		
		while(opcion != 12) {
			
			System.out.println("Bienvenido:");
			System.out.println("existen 3 tipos de asientos: Galeria = 30.000 clp, Platea: 60.000 clp y Cancha: 120.000 clp");
			System.out.println("Desea comprar tickets? S/N");
			
			String datoSeleccion =  leer.nextLine().toUpperCase();
			
			if(datoSeleccion.equals("S")) {
				System.out.println("Cuantos asientos quiere reservar?: ");
				int cantAsientos = Integer.parseInt(leer.nextLine());
				
				if(cantAsientos < 1) {
					System.out.println("Debe ingresar alomenos 1!");
				}else if (cantAsientos >= 1) {
					Asiento[] listaAsientos = new Asiento[cantAsientos];
					for (int i = 0; i < cantAsientos; i++) {
						
					}
				}else {
					System.out.println("Ingreso una cantidad no admitida de asientos!");
				}
				
				
				
			}else if (datoSeleccion.equals("N")) {
				System.out.println("Te esperamos devuelta!, buen dia");
				opcion = 12;
			}else {
				System.out.println("Dato ingresado no es valido, intente nuevamente!");
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	private static String[][] reservarLugar(String[][] asientos){
		
		
		return null;
	}
	
	
	
	
	private static String[][] generarAsientos(String[][] asientos){
		for(int i = 0; i < asientos.length; i++) {
			for(int j = 0; j < asientos[0].length; i++) {
				asientos[i][j] = "O";
			}
		}
		return asientos;
	}
}
