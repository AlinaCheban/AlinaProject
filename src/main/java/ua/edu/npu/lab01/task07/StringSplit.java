package ua.edu.npu.lab01.task07;

public class StringSplit {

        String[] StringArr;
        public void split(String s) {
            StringArr = s.split(" ");
        }

        public String[] getStringArr() {
            return StringArr;
        }

        public void out (String[] arr) {
            for (String a : arr)
                System.out.print(a + " ");
        }
    }


