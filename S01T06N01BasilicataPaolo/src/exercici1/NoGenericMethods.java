package exercici1;

public class NoGenericMethods {
	
	
	private Empleado empleado1;
	private Empleado empleado2;
	private Empleado empleado3;
	
	public Empleado getEmpleado1() {
		return empleado1;
	}


	public void setEmpleado1(Empleado empleado1) {
		this.empleado1 = empleado1;
	}


	public Empleado getEmpleado2() {
		return empleado2;
	}


	public void setEmpleado2(Empleado empleado2) {
		this.empleado2 = empleado2;
	}


	public Empleado getEmpleado3() {
		return empleado3;
	}


	public void setEmpleado3(Empleado empleado3) {
		this.empleado3 = empleado3;
	}


	public NoGenericMethods(Object obj1,Object obj2,Object obj3) {
		this.empleado1 = (Empleado)obj1;
		this.empleado2 = (Empleado)obj2;
		this.empleado3 = (Empleado)obj3;
	}
	


}
