package pryarraylista;

import java.util.ArrayList;

public class PryArraylista {
    public static void main(String[] args) {
       ArrayList<Integer> numerosPares=new ArrayList<>();
       numerosPares.add(8);
       numerosPares.add(6);
       numerosPares.add(4);
            for (double numerosPare : numerosPares) {
                System.out.println(numerosPare);
                System.out.println("NUMEROS PARES:"+numerosPare);
        }
           
        }
    
}
     /*ArrayList <String> names = new ArrayList<String>();
        
        //String nombre[]=new String[50];
        //int nombres[]={15,15,15,15};
        
        names.add("ANA");
        names.add("PEDRO");
        names.add("LUIS");
        names.set(0,"ANITA");
        String n_luis= names.get(0);
        System.out.println(n_luis);
        
        //REPETIR 200 VECES LA SINTAXIS DE DECLARAR UN ARRAY
        //100       String nombre[]=new String [20];
        //100       String nombre[]={"EWE","EWEW","WEW"};
    }/*
