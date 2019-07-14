package com.thoughtworks.collection;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            leftBorder += rightBorder;
            rightBorder = leftBorder - rightBorder;
            leftBorder -= rightBorder;
        }
        return IntStream.rangeClosed(leftBorder, rightBorder).filter(num -> num % 2 == 0).sum();
    }

//    public int getSumOfOdds(int leftBorder, int rightBorder) {
//        throw new NotImplementedException();
//    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(x -> x).map(x -> x * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num -> {
            if (num % 2 != 0) {
                num = num * 3 + 2;
            }
            return num;
        }).collect(Collectors.toList());
    }

//    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().mapToDouble(x -> x).average().orElse(Double.NaN);
    }

//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(i->i%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
