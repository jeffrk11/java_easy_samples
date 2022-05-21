package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;

public class Stream {
    public static void main(String[] args){
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
    

        var data = new Data<Integer>();
        
        System.out.println(data.data);
    }
}

class Data{

    static <T> T enrich(Enrich<T> enr){
        var aux = T;
        return enr.enrich(T);
    }
    
}

@FunctionalInterface
interface Enrich<T>{
    T enrich(T t);
}
