
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int suma;
		suma = x+y;
		return suma;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int resta;
		resta = x-y;
		return resta;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int multiplicacion;
		multiplicacion = x*y;
		return multiplicacion;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int residual;
		residual = x % y;
		return residual;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		if(x % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		if(x % 3 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		if(x > y){
			System.out.print(x);
			return x;
		}
		else{
			System.out.print(y);
			return y;
		}
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		int mayor; 
		mayor = 18;
		if(edad >= mayor){
			return true;
		}
		else{
			return false;
		}
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if(x)
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if(x > y && x > z){
			return x;
		}
		else if(y > x && y > z){
			return y;
		}
		else{
			return z;
		}
	}
	
	public static void main(String[] args)
	{
		
	}

}
