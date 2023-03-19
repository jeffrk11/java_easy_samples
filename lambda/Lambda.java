package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda{

    public static void main(String[] args){
        String environment = "snow";

        Wizard wizard = new Wizard();
        wizard.throwSpell( spell-> {
            if(environment.equals("snow"))
                return 5;
            else if(environment.equals("grass"))
                return 15;
            else
                return 10;
        });

        wizard.takeDamage( spell -> {
            if(spell != null)
                return true;
            return false;
        });
    }

}