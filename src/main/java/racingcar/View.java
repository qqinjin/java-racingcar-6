package racingcar;

public class View {

    public void printStartMeg(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printGoCount(){
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printResultMeg(){
        System.out.println("실행 결과");
    }

    public void printRaceResult(Car[] cars){
        for(Car car  : cars){
            System.out.println(car);
        }
    }

    public void printWinner(String winner){
        System.out.println("최종 우승자 : " + winner);
    }
}
