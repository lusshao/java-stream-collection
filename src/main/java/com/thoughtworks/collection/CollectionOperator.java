package com.thoughtworks.collection;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left>right){
            left = left+right;
            right = left-right;
            left = left-right;
            return IntStream.rangeClosed(left, right).mapToObj(Integer::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }else{
            return IntStream.rangeClosed(left, right).mapToObj(Integer::valueOf).collect(Collectors.toList());
        }

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left>right){
            left = left+right;
            right = left-right;
            left = left-right;
            return IntStream.rangeClosed(left, right).mapToObj(Integer::valueOf).filter(i->i%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }else{
            return IntStream.rangeClosed(left, right).mapToObj(Integer::valueOf).filter(i->i%2==0).collect(Collectors.toList());
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        return  Arrays.stream(array).filter(i->i%2==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).skip(array.length-1).findFirst().getAsInt();
    }

//    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
//        throw new NotImplementedException();
//    }
}
