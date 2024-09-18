public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String cadena = "Hola mundo";
        int edad = 10;

        System.out.println(cadena);
        System.out.print("Tamano de la cadena: ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        for (int i = 0; i < cadena.length(); i++) {
            if (i == cadena.length() - 1) {
                System.out.print(cadena.charAt(i));
            } else {
                System.out.print(cadena.charAt(i) + "-");
            }
        }

        // Contar palabras
        int palabras = cadena.split(" ").length;
        System.out.println("\nNumero de palabras: "+palabras);

        //Contar cuantas A hay en la cadena
        int contadorA = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a') {
                contadorA++;
            }
        }
        System.out.println("Número de 'a': " + contadorA);
    }
}