package edu.upc.eetac.dsa.egalmes.ejerciciosobjetos;

public class Arbol {
	int altura;
	String nom;
	
	//4 constructores
	public Arbol (int a)
	{
		altura=a;
		System.out.println ("Un Árbol de " + a + " metros");
	}
	public Arbol (String nombre )
	{
	 nom = nombre;
	System.out.println ("Un " + nombre);
	}
	public Arbol ()
	{
		System.out.println ("Un árbol genérico");
	}
	public Arbol (int a, String n)
	{	
		altura = a;
		nom = n;
		System.out.println ("Un " +n+ "de " + a + " metros." );
	}
	
	
	
	
}
