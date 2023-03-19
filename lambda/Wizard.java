package lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Wizard{
    
    String spell = "FireBall";
    String type = "Fire";

    public void throwSpell(Function<String, Integer> modificatorDamage) {
        System.out.println("charging..."+spell);
        System.out.println("damage: "+ modificatorDamage.apply(spell));
    }
    public int takeDamage(Predicate<String> takingDamage){
        System.out.println("taking damage?...");
        if(takingDamage.test(type))
            return 10;
        else
            return 0;
    }
}
