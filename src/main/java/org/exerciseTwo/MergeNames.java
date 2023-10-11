package org.exerciseTwo;

import java.util.HashSet;
import java.util.Set;

public class MergeNames {

    // TODO - Implement the uniqueNames method. When passed two arrays of names,
    //  it will return an array containing the names that appear in either or both arrays. The returned array should have no duplicates.
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqueNames;
        uniqueNames = new HashSet<>();

        for (String name : names1) {
            uniqueNames.add(name);
        }

        for (String name : names2) {
            uniqueNames.add(name);
        }

        return uniqueNames.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};


        String[] result = MergeNames.uniqueNames(names1, names2);

        // Print the unique names and should print Ava, Emma, Olivia, Sophia
        for (String name : result) {
            System.out.print(name + " ");
        }
    }
}
