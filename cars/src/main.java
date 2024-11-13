import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        engine e1 = new engine(90, 1.9);
        car car1 = new car("Golf", "Vw", 200, e1);
        engine e2 = new engine(1500, 6.0);
        car car2 = new car("Chiron", "Bugatti", 500, e2);
        engine e3 = new engine(150, 1.8);
        car car3 = new car("Golf", "Vw", 280, e3);
        engine e4 = new engine(950, 2.6);
        car car4 = new car("240sx", "Nissan", 340, e4);
        engine e5 = new engine(1200, 6.0);
        car car5 = new car("Vayron", "Bugatti", 500, e2);
//        car[] carr1 = {car1,car2,car3,car4};
//        public int getCarr1(){
//            return carr1;

//        int topSpeed = 0;
//        car[] cars = new car[5];
//        cars[0] = car1;
//        cars[1] = car2;
//        cars[2] = car3;
//        cars[3] = car4;
//        cars[4] = car5;
//
//        for (int i = 0; i<cars.length; i++){
//            if(topSpeed< cars[i].getMaxSpeed()){
//                topSpeed=cars[i].getMaxSpeed();
//            }
//        }
//        for (int i = 0; i< cars.length; i++){
//            if(cars[i].getMaxSpeed() == topSpeed){
//                System.out.println(cars[i]);
//
//            }
//
//        }
        Comparator<car> compareHp = new Comparator<car>() {
            @Override
            public int compare(car o1, car o2) {
                return o1.getMaxSpeed().compareHp(o2.getMaxSpeed());
            }
        }
        ArrayList<car> carsArr = new ArrayList<>();
        carsArr.add(car1);
        carsArr.add(car2);
        carsArr.add(car3);
        carsArr.add(car4);
        carsArr.add(car5);
        Collections.sort(carsArr.compareHp);
        System.out.println(carsArr);


    }


}