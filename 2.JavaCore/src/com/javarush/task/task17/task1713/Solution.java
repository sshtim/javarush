package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* 
Общий список
*/

public class Solution{
    private static  ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    public synchronized static void trimToSize() {
        original.trimToSize();
    }

    public synchronized static void ensureCapacity(int minCapacity) {
        original.ensureCapacity(minCapacity);
    }

    public synchronized static int size() {
        return original.size();
    }

    public synchronized static boolean isEmpty() {
        return original.isEmpty();
    }

    public synchronized static boolean contains(Object o) {
        return original.contains(o);
    }

    public synchronized static int indexOf(Object o) {
        return original.indexOf(o);
    }

    public synchronized static int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    public synchronized static Object[] toArray() {
        return original.toArray();
    }

    public synchronized static <T> T[] toArray(T[] a) {
        return original.toArray(a);
    }

    public synchronized static Long get(int index) {
        return original.get(index);
    }

    public synchronized static Long set(int index, Long element) {
        return original.set(index, element);
    }

    public synchronized static boolean add(Long aLong) {
        return original.add(aLong);
    }

    public synchronized static void add(int index, Long element) {
        original.add(index, element);
    }

    public synchronized static Long remove(int index) {
        return original.remove(index);
    }

    public synchronized static boolean remove(Object o) {
        return original.remove(o);
    }

    public synchronized static void clear() {
        original.clear();
    }

    public synchronized static boolean addAll(Collection<? extends Long> c) {
        return original.addAll(c);
    }

    public synchronized static boolean addAll(int index, Collection<? extends Long> c) {
        return original.addAll(index, c);
    }

    public synchronized static boolean removeAll(Collection<?> c) {
        return original.removeAll(c);
    }

    public synchronized static boolean retainAll(Collection<?> c) {
        return original.retainAll(c);
    }

    public synchronized static ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    public synchronized static ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    public synchronized static Iterator<Long> iterator() {
        return original.iterator();
    }

    public synchronized static List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
    }

    public synchronized static void forEach(Consumer<? super Long> action) {
        original.forEach(action);
    }

    public synchronized static Spliterator<Long> spliterator() {
        return original.spliterator();
    }

    public synchronized static boolean removeIf(Predicate<? super Long> filter) {
        return original.removeIf(filter);
    }

    public synchronized static void replaceAll(UnaryOperator<Long> operator) {
        original.replaceAll(operator);
    }

    public static void sort(Comparator<? super Long> c) {
        original.sort(c);
    }

    public synchronized static boolean containsAll(Collection<?> c) {
        return original.containsAll(c);
    }

    public synchronized static Stream<Long> stream() {
        return original.stream();
    }

    public synchronized static Stream<Long> parallelStream() {
        return original.parallelStream();
    }
}
