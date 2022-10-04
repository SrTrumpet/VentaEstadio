import java.util.Scanner;

public class App {
	

	
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Menu menu = new Menu();
		Registro registro = new Registro();
		Asiento[][] asientoReal = new Asiento[30][40];
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
					int ciclosWhile = 0;
					
					while(ciclosWhile != cantAsientos) {
						
						
						int totalAPagar = 0;
						System.out.println("Ingrese su nombre: ");
						String nombre = leer.nextLine();
						System.out.println("Ingrese su rut: ");
						String rut = leer.nextLine();
						System.out.println("Ingrese su edad:");
						int edad = Integer.parseInt(leer.nextLine());
						
						System.out.println("Ingrese el tipo de asiento a comprar");
						System.out.println("Galeria = 1, Platea = 2, Cancha = 3");
						int tipoAsiento = Integer.parseInt(leer.nextLine());
						
						if(tipoAsiento == 1) {
							mostrarCancha(asientosDisponibles);
							System.out.println("Usted puede comprar desde el asiento 1 hasta el asiento numero 400: ");
							System.out.println("Ingrese el numero de asiento a comprar: ");
							int numeroAsiento = Integer.parseInt(leer.nextLine());
							
							if(numeroAsiento >= 1 && numeroAsiento <= 400) {
								if(verificarAsiento(asientosDisponibles, numeroAsiento)){
									System.out.println("Asiento agregado correctamente");
									totalAPagar += 30000;
									
									Persona p = new Persona(nombre, rut, edad);
									Asiento a = new Asiento(p, numeroAsiento);
									
									reservarAsiento(asientoReal, asientosDisponibles, numeroAsiento, a);
									
									mostrarCancha(asientosDisponibles);
									ciclosWhile++;
								}else {
									System.out.println("Asiento reservado con anterioridad!");
								}
							}else {
								System.out.println("Asiento ingresado fuera de rango!");
							}
							
							
						}else if (tipoAsiento == 2) {
							
						}else if(tipoAsiento == 3) {
							
						}else {
							System.out.println("Tipo de asiento ingresado no es valido!");
						}
						
						
						
						
					}
					
				}else {
					System.out.println("Ingreso una cantidad no admitida de asientos!");
				}
				
				
				
			}else if (datoSeleccion.equals("N")) {
				System.out.println("Te esperamos devuelta!, buen dia");
				opcion = 12;
			}else {
				System.out.println("Dato ingresado no es valido, intente nuevamente!");
				System.out.println("Buscar Comprador = Ingrese asiento: ");
				int asientoComprado = Integer.parseInt(leer.nextLine());
				mostrarComprador(asientoComprado, asientoReal);
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	private static void mostrarComprador(int numeroAsiento, Asiento[][] lista) {
		
		numeroAsiento = numeroAsiento - 1;
		int numeroActualAsiento = 0;
		
		for(int i = 0; i <  lista.length; i++) {
			for(int j = 0; j < lista[0].length; j++) {
				if(numeroActualAsiento == numeroAsiento) {
					System.out.println(lista[i][j].toString());
				}
				numeroActualAsiento++;
			}
		}
		
		
	}
	
	
	private static boolean reservarAsiento(Asiento[][] listaAsientos, String[][] graficoAsientos, int numeroAsiento,Asiento a) {
		numeroAsiento = numeroAsiento - 1;
		int numeroActualAsiento = 0;
		
		for(int i = 0; i <  graficoAsientos.length; i++) {
			for(int j = 0; j < graficoAsientos[0].length; j++) {
				if(numeroActualAsiento == numeroAsiento) {
					graficoAsientos[i][j] = "X";
					listaAsientos[i][j] = a;
					return true;
				}
				numeroActualAsiento++;
			}
		}
		return true;
		
	}
	
	private static void mostrarCancha(String[][] asientos) {
		
		String asientoFila = "";
		

		
		for(int i = 0; i < asientos.length; i++) {
			asientoFila = i+" ";
			for(int j = 0; j < asientos[0].length; j++) {
				asientoFila+= (asientos[i][j]+" ");
			}

			System.out.println(asientoFila);
			asientoFila = "";
		}
		
		
		
	}
	
	
	private static boolean verificarAsiento(String[][] asientos, int numeroAsiento) {
		numeroAsiento = numeroAsiento - 1;
		int contAsiento = 0;
		for(int i = 0; i < asientos.length; i++) {
			for(int j = 0; j < asientos[0].length; j++) {
				if (contAsiento == numeroAsiento) {
					return asientos[i][j].equals("O");
				}
				contAsiento++;
			}
		}
		return true;
		
	}
	
	private static String[][] reservarLugar(String[][] asientos){
		
		
		return null;
	}
	
	
	
	
	private static String[][] generarAsientos(String[][] asientos){
		for(int i = 0; i < asientos.length; i++) {
			for(int j = 0; j < asientos[0].length; j++) {
				asientos[i][j] = "O";
			}
		}
		return asientos;
	}
}
