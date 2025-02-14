package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;

import racingcar.view.*;
import racingcar.model.Car;

public class RacingCarController{
    public static int numbersOfCar = input.Cars.size();
    public static Car[] car = new Car[numbersOfCar];

    public void setCarName(){
        for (int i = 0; i < numbersOfCar; i++){
            car[i].setName(input.Cars.get(i));
            car[i].Distance = 0;
        }
    }

    public void RacingGame() {
        for (int k = 0; k < input.getTrial(); k++)
            for (int i = 0; i < numbersOfCar; i++) {
                int randomDistance = Randoms.pickNumberInRange(0, 9);
                car[i].Distance += randomDistance;
            }

            output.displayPresentSituation();
        }
    }
}