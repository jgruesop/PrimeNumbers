public class Prime {
    public void checkPrime(int... numbers) {
        //Obtiener un número dado en la matriz
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }

    //Valida si el número es primo
    private static boolean isPrime(int n) {
        //Si el número de la matriz es 1, este no es primo.
        if (n == 1)
            return false;
        //Comprueba los números cuyo resto es 0 al ser divididos     
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
