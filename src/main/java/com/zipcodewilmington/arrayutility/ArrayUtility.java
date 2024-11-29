package com.zipcodewilmington.arrayutility;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<Array extends Object> {

    Array[] array;

    public ArrayUtility(Array[] inputArray){
        array = inputArray;
    }

}



































/*    private I[] anarray;

    public ArrayUtility(I[] inputArray){
        anarray = inputArray;
    }


    public I[] merge(I[] arrayToMerge){
        Object[] merged = Stream.of(anarray, arrayToMerge).flatMap(Stream::of).toArray(Object[]::new);
        return convertArray(merged);
    }

    public I getMostCommonFromMerge(I[] arrayToMerge) {
        I[] merged = merge(arrayToMerge);

        I common = merged[0];
        int commonCount = 0;
        for (I i : merged){
            int Count = getNumberOfOccurrences(merged,i);
            if (Count > commonCount){
                common = i;
                commonCount = Count;
            }
        }

        return common;
    }


    public Integer countDuplicatesInMerge(I[] arrayToMerge, I valueToEvaluate) {
        I[] merged = merge(arrayToMerge);

   return getNumberOfOccurrences(merged, valueToEvaluate); }


    public Integer getNumberOfOccurrences(I valueToEvalute){
        return getNumberOfOccurrences(anarray, valueToEvalute);
    }


    private Integer getNumberOfOccurrences(I [] merged,I valueToEvaluate) {

        int count=0;
        for (I i : merged){
            if (i.equals(valueToEvaluate)){
                count++;
            }
        }

    return count;
    }

    public I[] removeValue(I valueToRemove){
//so we want I to be part of a list for the generics String,Integer,Object, rather than have all those methods
        Object[] remove = Arrays.stream(anarray).filter(val -> !val.equals(valueToRemove)).toArray();
        return convertArray(remove);

}

    private I[] convertArray(Object[] remove) {
        I[] finalArray = Arrays.copyOfRange(anarray, 0,remove.length);
        for (int i = 0; i < remove.length; i++){
            finalArray[i] = (I)remove[i];
        }
   return finalArray;
    }*/

