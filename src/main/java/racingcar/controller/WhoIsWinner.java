package racingcar.controller;

import racingcar.model.Car;
import racingcar.controller.RacingCarController;
import java.util.List;
import java.util.ArrayList;

public class WhoIsWinner{
    List<String> winner= new ArrayList<>();

    public void JudgeWinner(){
        int maxDistance = 0;

        for (int i = 0; i < RacingCarController.numbersOfCar; i++){
            if (RacingCarController.car[i].Distance > maxDistance){
                maxDistance = RacingCarController.car[i].Distance;
            }
        }

        for (int i = 0; i < RacingCarController.numbersOfCar; i++){
            if (RacingCarController.car[i].Distance == maxDistance){
                winner.add(RacingCarController.car[i].getName());
            }
        }
    }
}