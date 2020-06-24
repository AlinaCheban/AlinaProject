package ua.edu.npu.lab01.task08;

import java.util.ArrayList;

public class Counting {

        ArrayList<String> countingWords = new ArrayList<>();
        ArrayList<Integer> counting = new ArrayList<>();
        public void count(String[] arr) {
            int tempInd;
            int temp;
            int j = 0;
            while(j < arr.length) {
                if(countingWords.contains(arr[j])){
                    tempInd = countingWords.indexOf(arr[j]);
                    temp = counting.get(tempInd);
                    counting.set(tempInd, temp+1);
                }
                else {
                    countingWords.add(arr[j]);
                    counting.add(1);
                }
                j++;
            }
        }

        public void Out () {
            for(int i = 0; i< countingWords.size(); i++) {
                System.out.println(countingWords.get(i) + " = " + counting.get(i));
            }
        }
    }


