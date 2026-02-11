package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {

    /**
     * Calcule la somme des nombres de 1 à n
     * 
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
        int result = 0;
        for (int x = 1; x <= n; x++) {
            result = result + x;
        }
        return result;
    }

    /**
     * Inverse un nombre (ex: 123 -> 321)
     * 
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {
        int inverse = 0;
        while (number > 0) {
            int chiffre = number % 10; // prend le dernier chiffre
            inverse = inverse * 10 + chiffre; // ajoute le chiffre à droite de "inverse"
            number = number / 10; // accède au chiffre suivant
        }
        return inverse;
    }

    /**
     * Calcule la factorielle d'un nombre (n!)
     * 
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int result = 1;
        for (int x = n; x > 1; x--) {
            result = result * x;
        }
        return result;
    }

    /**
     * Compte le nombre de chiffres dans un nombre
     * 
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {
        String n = "" + number;
        return n.length();
    }

    /**
     * Vérifie si un nombre est premier
     * 
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */

    public boolean isPrime(int number) {
        boolean result = true;
        if(number <= 1) {
            return false;
        }
        for (int x = 2; x < number; x++) {
            if (number % x == 0) {
                result = false;
            }
        }
        return result;
    }
}
