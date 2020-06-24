package ua.edu.npu.lab01.task10;

public class Main {

        public static void main(String[] args) {
            ComparingPerimeter comparingPerimeter = new ComparingPerimeter();
            Input input = new Input();
            PointArr pointArr = new PointArr(input.getDotNumber());
            input.getCoordinates(pointArr);
            comparingPerimeter.getBiggerPerimeter(pointArr);
            comparingPerimeter.Output();
        }
    }


