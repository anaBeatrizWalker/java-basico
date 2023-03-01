package edu.anabeatriz.exercicios.map;

import java.util.*;
import java.util.Map.Entry;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
*/

public class PopulacaoEstados {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNO = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNO.toString()); //{AL=3351543, RN=3534265, PE=9616621, CE=9187103}

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoEstadosNO.put("RN", 3534165);
        System.out.println(populacaoEstadosNO.toString()); //{AL=3351543, RN=3534165, PE=9616621, CE=9187103}

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione: PB - 4.039.277: ");
        if(!populacaoEstadosNO.containsKey("PB")) populacaoEstadosNO.put("PB", 4039277);
        System.out.println(populacaoEstadosNO.toString()); //{PB=4039277, AL=3351543, RN=3534165, PE=9616621, CE=9187103}

        System.out.println("\nExiba a população do estado PE: " + populacaoEstadosNO.get("PE")); //9616621

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNO2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> populacao : populacaoEstadosNO2.entrySet()) {
            System.out.println(populacao.getKey() + " - " + populacao.getValue());
            /*
            PE - 9616621
            AL - 3351543
            CE - 9187103
            RN - 3534265
            PB - 4039277
            */
        }

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNO3 = new TreeMap<>(populacaoEstadosNO2);
        for (Map.Entry<String, Integer> populacao : populacaoEstadosNO3.entrySet()) {
            System.out.println(populacao.getKey() + " - " + populacao.getValue());
            /*
            AL - 3351543
            CE - 9187103
            PB - 4039277
            PE - 9616621
            RN - 3534265
            */
        }

        System.out.printf("\nExiba os estados em ordem de menor população para a maior: \n");
        Set<Map.Entry<String, Integer>> populacaoEstadosNO4 = new TreeSet<>(new ComparatorPopulacao());
        populacaoEstadosNO4.addAll(populacaoEstadosNO3.entrySet());
        for (Map.Entry<String, Integer> populacao : populacaoEstadosNO4) {
            System.out.println(populacao.getKey() + " - " + populacao.getValue());
        }

        System.out.printf("\nExiba o estado com a menor população e seu respectivo valor: ");
        Map<String, Integer> populacaoEstadosNO5 = new HashMap<>();
        populacaoEstadosNO5.putAll(populacaoEstadosNO3);
        Integer menorPop = Collections.min(populacaoEstadosNO5.values());
        String estado = "";
        for (Map.Entry<String,Integer> populacao : populacaoEstadosNO5.entrySet()) {
            if(populacao.getValue().equals(menorPop)){
                estado = populacao.getKey();
                System.out.println(estado + " - " + menorPop);
            }
        }

        System.out.println("\nExiba a soma da população dos estados: ");
        Iterator<Integer> iterator = populacaoEstadosNO3.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma); //29728809
        
        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populacaoEstadosNO3.size())); //5945761

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator2 = populacaoEstadosNO5.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next() < 4000000) iterator2.remove();
        }
        System.out.println(populacaoEstadosNO5.toString()); //{CE=9187103, PB=4039277, PE=9616621}

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNO5.clear();
        System.out.println(populacaoEstadosNO5.toString()); //{}
        
        System.out.println("\nConfira se a lista está vazia: " + populacaoEstadosNO5.isEmpty()); //true
    }
}

class ComparatorPopulacao implements Comparator<Map.Entry<String, Integer>>{
    @Override
    public int compare(Entry<String, Integer> populacao1, Entry<String, Integer> populacao2) {
        return populacao1.getValue().compareTo(populacao2.getValue());
    }
}