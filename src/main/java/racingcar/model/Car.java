package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car{
    private int Distance;
    private String Name;

    Car(String carName){
        Name = carName;
        Distance = 0;
    }

    public int getScore(){
        return Distance;
    }

    public String getName(){
        return Name;
    }

}