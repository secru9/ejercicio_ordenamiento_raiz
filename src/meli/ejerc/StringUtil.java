package meli.ejerc;

import java.util.ArrayList;
import java.util.Collection;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String res = "";

		for (int i = 0; i < n; i++) {
			res = res + c;
		}
		return res;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String res = "";
		int dif = n - s.length();
		return replicate(c, dif) + s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] res = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = Integer.toString(arr[i]);
		}
		return res;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = Integer.parseInt(arr[i]) ;
		}
		return res;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max )
				max = arr[i].length();
		}
		return max;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{

		for (int i = 0; i < arr.length; i++) {
			arr[i] = lpad(arr[i], maxLength(arr), c);
		}

	}

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("321");
		s.add("443321");
		s.add("324321");
		s.add("3231");
		s.add("322221");

		for (String se: s
			 ) {
			System.out.println(se);
		}

	}
}
