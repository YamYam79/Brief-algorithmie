package fr.simplon.exercises;

/**
 * Exercice 5: Tableaux - Opérations de base
 * 
 * Objectif: Apprendre à manipuler des tableaux
 */
public class Exercise05ArraysBasics {
    
    /**
     * Crée un tableau contenant les nombres de 1 à n
     * @param n la taille du tableau
     * @return un tableau [1, 2, 3, ..., n]
     */
    public int[] createSequence(int n) {
        int[] tableau = new int[n]; // crée une boite avec le nom "tableau" et contenant un tableau avec des entiers (n cases vides)
        for (int i = 0; i < n;i++){ // crée un boite avec le nom "i" et contanant le chiffre 0 - test si i < n si oui, va dans la boucle, si non, va à la ligne 20
            tableau[i] =  i + 1; // affecte à t'indice i de ta boite "tableau" la valeur i + 1
        }
        return tableau;
    }
    
    /**
     * Retourne le premier élément d'un tableau
     * @param array le tableau
     * @return le premier élément
     */
    public int getFirstElement(int[] array) {
        return array[0];
    }
    
    /**
     * Retourne le dernier élément d'un tableau
     * @param array le tableau
     * @return le dernier élément
     */
    public int getLastElement(int[] array) {
        return array[array.length-1];
    }
    
    /**
     * Compte le nombre d'occurrences d'une valeur dans un tableau
     * @param array le tableau
     * @param value la valeur à chercher
     * @return le nombre d'occurrences
     */
    public int countOccurrences(int[] array, int value) {
        /**
         * [1, 2, 4, 3, 2]
         * value = 2
        */
       int total = 0;
        for (int index = 0; index < array.length;index++){
            int valueFound = array[index];
            if(value == valueFound){
                total = total + 1;
            }
        }
       return total;
    }
    
    /**
     * Vérifie si un tableau contient une valeur
     * @param array le tableau
     * @param value la valeur à chercher
     * @return true si la valeur est présente, false sinon
     */
    public boolean contains(int[] array, int value) {
       for (int index = 0; index <array.length; index++) {
        if (array[index] == value ) {
            return true;
        }
    }
    return false;
    }
}
