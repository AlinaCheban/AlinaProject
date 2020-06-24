package ua.edu.npu.lab01.task03;

public class ShorterThanAvg {

        public float avgLength(String[] strings, int N) {
            float averageLength = 0;
            for (int i=0; i<N; i++) {
                averageLength += strings[i].length();
            }
            averageLength /= N;
            System.out.println("Average length: " + averageLength);
            return averageLength;
        }
        public void strOutput(String[] strings, int N, float Average) {
            System.out.println("Strings shorter than average length:");
            for (int i=0; i<N; i++) {
                if (strings[i].length() < Average) {
                    System.out.println(strings[i]);
                }
            }
        }
    }


