package PruebaMaven2.maven2;

public class Combinar {

	public static String combinar(Object [] array) {
		// return StringUtils.join(array, " ");
		int i;
		String resultado = "";
		for(i = 0; i < array.length; i++){
			resultado += array[i] + " ";
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Object[] array = {"hola", 3.14126, "adios", 4, true};
		String resultado = combinar(array);
		System.out.println(resultado);
	}

}
