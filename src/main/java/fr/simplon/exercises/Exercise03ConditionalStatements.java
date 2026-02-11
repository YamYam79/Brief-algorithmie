package fr.simplon.exercises;

/**
 * Exercice 3: Instructions conditionnelles
 * 
 * Objectif: Apprendre à utiliser if/else pour prendre des décisions
 */
public class Exercise03ConditionalStatements {

    /**
     * Retourne le plus grand de deux nombres
     * 
     * @param a premier nombre
     * @param b second nombre
     * @return le plus grand des deux nombres
     */
    public int max(int a, int b) {
        int plusGrand;
        if (a <= b) {
            plusGrand = b;
        } else {
            plusGrand = a;
        }
return plusGrand;
    }

    /**
     * Vérifie si un nombre est positif
     * 
     * @param number le nombre à vérifier
     * @return true si le nombre est positif (> 0), false sinon
     */
    public boolean isPositive(int number) {
        boolean isPositive;
        if (number >= 0) {
            isPositive = true;
        } else {
            isPositive = false;
        }
        return isPositive;
    }

    /**
     * Retourne la valeur absolue d'un nombre
     * 
     * @param number le nombre
     * @return la valeur absolue du nombre
     */
    public int absoluteValue(int number) {
        int absolute;
        if (number >= 0) {
            absolute = number;
        } else { 
            absolute = -number;
        }   
        return absolute;
    }

    /**
     * Vérifie si un nombre est pair
     * 
     * @param number le nombre à vérifier
     * @return true si le nombre est pair, false sinon
     */
    public boolean isEven(int number) {
       boolean isEven;
       if (number % 2 == 0 )
        {
       isEven = true;
        
       } else {
            isEven = false;
       }
       return isEven;
    }

    /**
     * Retourne une note en lettre basée sur un score
     * 
     * @param score le score (0-100)
     * @return "A" si >= 90, "B" si >= 80, "C" si >= 70, "D" si >= 60, "F" sinon
     */
    public String getGrade(int score) {
    
        if (score >= 90) {
            return "A";
        } 
        if (score >= 80){
            return "B";
        }
        if (score >=70){
            return "C";
        }
        if (score>=60){
            return "D";
        }
        if (score<=59) {
            return "F";
        }
        return getGrade(score);
    }
}
