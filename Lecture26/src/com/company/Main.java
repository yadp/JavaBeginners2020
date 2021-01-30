package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<String, String> map = new HashMap();//HashTable, TreeMap
        map.put("Test", "TestValue");
        map.put("Exampel","ExampleValue");
        map.put("Test", "New Value");

        String testValue = map.get("Test");

        System.out.println(map);
        System.out.println(testValue);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        Iterator it=keys.iterator();
        while (it.hasNext()){
            map.get(it.hasNext());
        }

        System.out.println(map.size());






















        /*List<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(5);
        list.add(7);

        System.out.println(list);
        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            Integer numnber= it.next();
            System.out.println(numnber);
            if(numnber.equals(3)){
                it.remove();
            }

        }

        System.out.println(list);

        Set<String> setExample= new HashSet<>();

        System.out.println("Try to add test"+ setExample.add("Test"));
        System.out.println("Try to add test"+ setExample.add("Test"));
        setExample.add("Yavor");
        setExample.add("Test");
        System.out.println(setExample);

        Iterator<String> iterator= setExample.iterator();

        while (iterator.hasNext()){
            String word= iterator.next();
            System.out.println(word);
            if(word.equals("Yavor")){
                iterator.remove();
            }

        }
        System.out.println(setExample);

        Collections.sort(list);

        System.out.println(list);

        Collections.addAll(list,4,5,3,2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List listEmpty= Collections.emptyList();
*/









       /* int a=5;
        String b="test";

        List<Integer> list= new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(8);

        List<Integer> linkedList= new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }
        System.out.println(linkedList);

        System.out.println( " Duplicates: " + findDuplicates(linkedList));

        String one= "one";
        String two = "two";


        Integer smallInt= 5;
        Integer secondInt=smallInt;
        Integer third= new Integer(5);


        if ( smallInt.equals(third)){
            System.out.println(true);
        }
*/
    }

    private static boolean findDuplicates(List<Integer> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = 0; j < linkedList.size(); j++) {
                if(i!=j && linkedList.get(i).equals(linkedList.get(j))){
                    return true;
                }

            }

        }
        return false;
    }
}
