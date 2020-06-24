package ua.edu.npu.lab01.task11;

public class pointArr {

        protected Point[] pArr;

        public pointArr(int n) {
            pArr = new Point[n];
            for (int i = 0; i < n; ++i) {
                pArr[i] = new Point((int)(Math.random() * 9), (int)(Math.random() * 9));
            }
        }
    }


