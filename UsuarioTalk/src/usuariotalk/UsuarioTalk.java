package usuariotalk;

import java.util.Scanner;

public class UsuarioTalk {

	public static void main(String[] args) {
		/*Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla el siguiente mensaje
		: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”.
		Los datos en rojo son los datos introducidos por el usuario.*/
		
		//Declaramos las variables que ultilizaremos
		
		String nombre;
		byte edad;
		
		//Invocamos el Scanner
		
		Scanner ld = new Scanner(System.in);
		
		//Imprimimos en pantalla la solicitud
		
		System.out.println("Por favor introduzca su nombre: ");
		
		//Y la almacenamos en la variable nombre
		
		nombre = ld.next();
		
		//procedemos a solicitar la edad
		 
		System.out.println("Por favor introduzca su edad: ");
		
		//Lo almacenamos en la variable edad
		
		edad = ld.nextByte();
		
		//procedemos a imprimir el mensaje final en la pantalla
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		ld.close();
		
		
		// TODO Auto-generated method stub

	}

}
