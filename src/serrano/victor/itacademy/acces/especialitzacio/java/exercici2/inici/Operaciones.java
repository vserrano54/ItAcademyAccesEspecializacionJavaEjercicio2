package serrano.victor.itacademy.acces.especialitzacio.java.exercici2.inici;

import java.util.ArrayList;

import serrano.victor.itacademy.acces.especializacio.java.exercici2.entitats.Alumno;
import serrano.victor.itacademy.acces.especializacio.java.exercici2.entitats.Mentor;
import serrano.victor.itacademy.acces.especializacio.java.exercici2.entitats.Persona;

public class Operaciones {
	
	private ArrayList<Alumno> alumnos;
	private ArrayList<Mentor> mentores;
	
	public Operaciones() {
		alumnos = new ArrayList<Alumno>();
		mentores = new ArrayList<Mentor>();
	}
	
	public void creacioInstancies() {
		agregarAlumno(new Alumno("1111111A","Joan","Armengol","Castells",(float)9.5));
		agregarAlumno(new Alumno("2222222B","Anna","Marti","Pujol",(float)10.0));
		agregarAlumno(new Alumno("3333333C","Montse","Llopart","Lladó",(float)7.8));
		
		agregarMentor(new Mentor("44444444D","Marina","Llucià","Pedrol",(short)1530));//1530;
		agregarMentor(new Mentor("55555555E","Alfons","Riera","Manent",(short)1600)); //1600
		agregarMentor(new Mentor("66666666F","Eva","Solsona","Riba",(short)890));	
		
	}
	
	public void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public void agregarMentor(Mentor mentor) {
		mentores.add(mentor);
	}
	
	public void getAll() {
		
		System.out.println("Nombre Completo de los alumnos");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombreCompleto());
		}
		
		System.out.println();
		
		System.out.println("Lista con todos los datos del alumno");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);	
		}
		
		System.out.println();
		System.out.println("Nombre Completo de los Mentores");
		for (Mentor mentor : mentores) {
			System.out.println(mentor.getNombreCompleto());
		}
		
		System.out.println();
		System.out.println("Lista con todos los datos de los mentores");
		for (Mentor mentor : mentores) {
			System.out.println(mentor);
		}
		
		System.out.println();
	}
	
	public Persona getByDni(String dni) {
		
		Persona personaEncontrada = null;
		boolean bandera = false;
		
		for (int i=0;i<alumnos.size();i++) {
			if (alumnos.get(i).getDni().equals(dni)) {
				personaEncontrada = (Persona)(alumnos.get(i));
				bandera = true;
			}
			if (bandera == true)
				break;
				
		}
		if (bandera ==false) {
			for (int i=0;i<mentores.size();i++) {
				if (mentores.get(i).getDni().equals(dni)) {
					personaEncontrada = (Persona)(mentores.get(i));
					bandera = true;
				}
				if (bandera == true)
					break;
					
			}
		}
		
		return personaEncontrada;
	}

}
