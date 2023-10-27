package racingcar;
import camp.nextstep.edu.missionutils.Console;
public class View {

    public String printStartMeg(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public int printGoCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(Console.readLine());
    }

    public void printResultMeg(){
        System.out.println("실행 결과");
    }

    public void printRaceResult(Car[] cars){
        for(Car car  : cars){
            System.out.println(car);
        }
        System.out.println();
    }

    public void printWinner(String winner){
        System.out.println("최종 우승자 : " + winner);
    }
}
