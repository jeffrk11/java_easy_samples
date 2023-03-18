package lambda;

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
    }

}