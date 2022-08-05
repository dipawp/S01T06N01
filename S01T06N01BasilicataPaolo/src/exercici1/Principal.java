package exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado empleado1 = new Empleado("Jordi", "4765887U");
		Empleado empleado2 = new Empleado("Marc" , "3877556T");
		Empleado empleado3 = new Empleado("Pau", "3677432R");
		
		
		NoGenericMethods ngm1 = new NoGenericMethods(empleado1,empleado2,empleado3);
		NoGenericMethods ngm2 = new NoGenericMethods(empleado2,empleado3,empleado1);
		NoGenericMethods ngm3 = new NoGenericMethods(empleado3,empleado1,empleado2);
		}

}
