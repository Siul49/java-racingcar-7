package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car{
    private int SpeedPerSecond;
    private int score;
    private String name;

    Car(String carName){
        SpeedPerSecond = Randoms.pickNumberInRange(0,9);
        name = carName;
        score = 0;
    }

    public int getScore(){
        return score;
    }

    public int getSpeedPerSecond(){
        return SpeedPerSecond;
    }

    public String getName(){
        return name;
    }

}