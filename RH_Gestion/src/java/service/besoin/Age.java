/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

/**
 *
 * @author HERINIAINA
 */
public class Age {
    private int min;
    private int max;
    private int coeff;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public void setMax(String maxAge) {
        int max = Integer.parseInt(maxAge);
        setMax(max);
    }

    public void setMin(String minAge) {
        int min = Integer.parseInt(minAge);
        setMin(min);
    }
    
    public Age(String minAge, String maxAge, String coeffAge) {
        setMax(maxAge);
        setMin(minAge);
        int coeff = Integer.parseInt(coeffAge);
        setCoeff(coeff);
    }
}
