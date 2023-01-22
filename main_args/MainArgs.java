package main_args;

class MainArgs {
    //java needs a main method to start, it always looks for the main method
    //you cant change the String type, you can change the name of parameter args, e.g args, arguments, strings...
    //the main method needs to be public so JRE can accesss and execute 
    //the main method needs to be static so JVM can load without instantiate
    //the main method needs to be void because it doesnt return anything
    public static void main(String[] args) {
        System.out.println("hello my args ");
        // if there are any args, you can get and do anything
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}