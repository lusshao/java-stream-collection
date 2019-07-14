package com.thoughtworks.collection;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(x->x*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(x->{
            return new String((char)(x+96)+"");
        }).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(x->{
            int a = x/26;
            int b = x%26;
            if(a<=0){
                return letters[b-1];
            }else if(b>0){
                return letters[a-1]+letters[b-1];
            }else{
                return letters[a-2]+letters[25];
            }
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
