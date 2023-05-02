package serrano.victor.itacademy.acces.especialitzacio.java.exercici2.inici;

public class Test {
	
	public static void main(String args[]) {
		
			Operaciones operacion = new Operaciones();
			
			operacion.creacioInstancies();
			
			operacion.getAll();
			
			String dni="66666666F";
			
			System.out.println("Ejecucion de busqueda de DNI: "+dni);
			if (operacion.getByDni(dni)!=null) {
				System.out.println("Se ha encontrado el DNI: " + dni+" y pertenese a la persona: ");
				System.out.println(operacion.getByDni(dni));
			}
			else{
				System.out.println("El DNI: " + dni + " no se ha encontrado registrado");
			}
			
			
	}
	
	

}
