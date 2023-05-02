package serrano.victor.itacademy.acces.especializacio.java.exercici2.entitats;

public class Mentor extends Persona{
	
	private short horasDedicacionAnual;

	public Mentor(String dni, String nombre, String apellido1, String apellido2, short horasDedicacionAnual) {
		super(dni,nombre,apellido1,apellido2);
		if (horasDedicacionAnual<0)
			this.horasDedicacionAnual = 0;
		else if (horasDedicacionAnual>1600)
			this.horasDedicacionAnual = 1600;
		else
			this.horasDedicacionAnual=horasDedicacionAnual;
	
	}
	
	
   public short getHorasDedicacionAnual() {
		return horasDedicacionAnual;
	}


	public void setHorasDedicacionAnual(short horasDedicacionAnual){
			this.horasDedicacionAnual=horasDedicacionAnual;
	}



@Override
   public String getNombreCompleto() {
	
	   StringBuilder nombreCompleto = new StringBuilder();
	
	   nombreCompleto.append("- Mentor ").append(super.getNombreCompleto());
	
	   return nombreCompleto.toString();
		
	}


@Override
public String toString() {
	return "Mentor [DNI = " + getDni() + ", Nombre = " + getNombre() + ", Apellido1 = "
			+ getApellido1() + ", Apellido2 = " + getApellido2() + ", horasDedicacionAnual = " + getHorasDedicacionAnual() + "]";
}


   

}
