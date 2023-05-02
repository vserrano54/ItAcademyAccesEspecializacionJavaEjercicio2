package serrano.victor.itacademy.acces.especializacio.java.exercici2.entitats;

public class Alumno extends Persona {
	
	private float notaAcces;

	
	
	public Alumno(String dni, String nombre, String apellido1, String apellido2, float notaAccess) {
		super(dni,nombre,apellido1,apellido2);
		this.notaAcces = notaAccess;
	
	}
	
	public float getNotaAcces() {
		return notaAcces;
	}

	public void setNotaAcces(float notaAcces) {
		this.notaAcces = notaAcces;
	}
	
   @Override
   public String getNombreCompleto() {
	
	   StringBuilder nombreCompleto = new StringBuilder();
	
	   nombreCompleto.append("- Alumno ").append(super.getNombreCompleto());
	
	   return nombreCompleto.toString();
		
	}

@Override
	public String toString() {
	
	return "Alumno [DNI = " +  getDni() + ", Nombre = " +  getNombre() + ", Apellido1 = " + getApellido1() + ", Apellido2 = " + getApellido2()
	+ ", notaAcces = " + getNotaAcces()+ "]";
	
		
	}
   
	

}
