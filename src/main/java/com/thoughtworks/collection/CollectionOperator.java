package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int leftBorder = Math.min(left, right);
        int rightBorder = Math.max(left, right);
        return IntStream.rangeClosed(leftBorder, rightBorder)
                .boxed()
                .sorted(left < right ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int leftBorder = Math.min(left, right);
        int rightBorder = Math.max(left, right);
        return IntStream.rangeClosed(leftBorder, rightBorder)
                .boxed()
                .filter(num -> num % 2 == 0)
                .sorted(left < right ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).skip(array.length - 1).findFirst().getAsInt();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
