package racingcar.view;

import java.util.StringTokenizer;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class input{
    private int trial;
    public ArrayList<String> Cars = new ArrayList<>();

    public ArrayList<String> getCarName(){
        return Cars;
    }

    public void setCarName() {
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

    public int getTrial(){
        return trial;
    }
}
