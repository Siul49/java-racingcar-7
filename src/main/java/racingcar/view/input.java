package racingcar.view;

import racingcar.model.Car;
import java.util.StringTokenizer;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.ArrayList;

public class input{
    private int trial;
    private ArrayList<String> Cars = new ArrayList<>();


    public void getCarName() {
        String CarNames = Console.readLine();
        StringTokenizer separatedCarNames = new StringTokenizer(CarNames, ",");

        while(separatedCarNames.hasMoreTokens()){
            Cars.add(separatedCarNames.nextToken().trim());
        }
    }

    public void setTrial(){
        trial = Integer.parseInt(Console.readLine());
    }
    public int getTrial(){
        return trial;
    }
}
