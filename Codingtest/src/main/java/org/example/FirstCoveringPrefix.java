package org.example;

import java.util.HashSet;

public class FirstCoveringPrefix {
    public static void main(String[] args) {
        System.out.println(ps(new int[]{5, 3, 19, 7, 3, 5, 7, 3}));
    }
    public static int ps(int[] a)
    {
        var length = a.length;
        var temp = new HashSet<Integer>();
        var result = 0;

        for (int i=0; i<length; i++)
        {
            if (!temp.contains(a[i]))
            {
                temp.add(a[i]);
                result = i;
            }
        }
        return result;
    }
}
