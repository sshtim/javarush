package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Solution))
            return false;
        if(this==null && o!=null || this!=null && o==null)
            return false;
        else if(this==null && o==null)
            return true;
        Solution n = (Solution) o;
        return n.getFirst().equals(first) && n.getLast().equals(last);
    }

    @Override
    public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31*result + (last != null ? last.hashCode() : 0);
            return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));

        System.out.println(s.contains(new Solution("Mickey", "Mouse")));

        Solution s1 = new Solution("Mickey", "Mouse");
        Solution s2 = new Solution("Mickey", "Mouse");
        System.out.println(s1.first.hashCode()==s2.first.hashCode()&& s1.last.hashCode()==s2.last.hashCode());
    }
}
