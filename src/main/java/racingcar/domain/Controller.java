package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Race race;
    private View raceView = new View();

    public void startRace() {

        String carInput = raceView.startMeg();
        List<String> carNames = splitNames(carInput);

        this.race = new Race(carNames.toArray(new String[0]));

        int countNumber = raceView.countMeg();

        raceView.resultMeg();

        for (int i = 0; i < countNumber; i++) {

             for(String carName : carNames){
                race.moveCars(carName);
            }
            raceView.raceResult(race.getCars());
        }

        String winnerCar = checkWinner();

        raceView.winnerCar(winnerCar);
    }

    private List<String> splitNames(String carInput) {

        String[] carArray = carInput.split(",");
        List<String> carNames = new ArrayList<>();

        for (String carName : carArray) {
            carNames.add(carName.trim());
        }
        return carNames;
    }

    private int maxCount() {

        int maxMove = -1;

        for (Car car : race.getCars()) {

            if (car.getMove() > maxMove) {
                maxMove = car.getMove();
            }
        }
        return maxMove;
    }

    private String checkWinner() {

        int maxMove = maxCount();
        List<String> winnerCar = new ArrayList<>();

        for (Car car : race.getCars()) {
            if (car.getMove() == maxMove) {
                winnerCar.add(car.getName());
            }
        }
        return String.join(", ", winnerCar);
    }
}
