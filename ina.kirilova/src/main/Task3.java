package main;

import java.util.*;
import java.lang.*;

public class Task3 {

    public static TreeMap<String, Float> triagalnici = new TreeMap<>();

    public static <K, V extends Comparable<V>> Map<K, V> valueSort(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K o2, K o1) {
                int comp = map.get(o1).compareTo(map.get(o2));
                if (comp == 0) {
                    return 1;
                } else {
                    return comp;
                }
            }
        };
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        sorted.putAll(map);
        System.out.print(sorted);
        return sorted;

    }
    public static void getarea() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name and sides");
        String infotriangle = sc.nextLine();
        String[] info = infotriangle.split(",");
        String name = info[0].trim();
        float strana1 = Float.parseFloat(info[1].trim());
        float strana2 = Float.parseFloat(info[2].trim());
        float strana3 = Float.parseFloat(info[3].trim());

        float semiper = (strana1 + strana2 + strana3) / 2;
        float area = (float) Math.sqrt(semiper * (semiper - strana1) * (semiper - strana2) * (semiper - strana3));
        System.out.print(area);

        triagalnici.put(name, area);

    }


    public static void cont() {
        System.out.print("Do you want to continue? Yes/No");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        switch (answer) {
            case "yes", "YES", "Yes", "y", "Y": {
                getarea();
                cont();
                break;
            }
            case "no", "No", "NO", "n", "N": {
                System.out.print("this is the end of the program");
                break;
            }
            default:
                System.out.print("Enter a valid option");
                break;
        }
    }


    public static void main(String[] arguments) {
        getarea();
        cont();
        valueSort(triagalnici);

    }
}
