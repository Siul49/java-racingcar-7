package racingcar.view;

import racingcar.model.Car;
import java.util.StringTokenizer;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.ArrayList;
import racingcar.model.Car;

public class input{
    private static int trial;
    public static ArrayList<String> Cars = new ArrayList<>();


    public void getCarName() {
        String CarNames = Console.readLine();
        StringTokenizer separatedCarNames = new StringTokenizer(CarNames, ",");

        while(separatedCarNames.hasMoreTokens()){
            String oneOfCarName = separatedCarNames.nextToken().trim();
            Cars.add(oneOfCarName);
        }

    }

    public void setTrial(){
        trial = Integer.parseInt(Console.readLine());
    }

    public static int getTrial(){
        return trial;
    }
}
