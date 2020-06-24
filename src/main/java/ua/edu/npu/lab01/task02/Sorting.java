package ua.edu.npu.lab01.task02;

    public class Sorting {
        public String[] sorting(String[] tempArr, int N) {
            String temp;
            for(int i = 1; i < N; i++) {
                for(int j = 0; j < N-i; j++) {
                    if(tempArr[j].length() > tempArr[j+1].length()) {
                        temp = tempArr[j];
                        tempArr[j] = tempArr[j+1];
                        tempArr[j+1] = temp;
                    }
                }
            }
            return tempArr;
        }
    }




