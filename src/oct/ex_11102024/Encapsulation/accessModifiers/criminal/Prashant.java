package oct.ex_11102024.Encapsulation.accessModifiers.criminal;

import oct.ex_11102024.Encapsulation.accessModifiers.police.Cop;

public class Prashant {
    public static void main(String[] args) {
        Cop prashant = new Cop(90);
        //prashant.canIShoot();// prashant can not shoot coz 'canIShoot' is protected by police folder
    }
}
