package exercici1;

public class Empleado {

	private String nom;
	private String DNI;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public Empleado(String nom,String dni) {
		this.nom = nom;
		this.DNI = dni;
	}

}
