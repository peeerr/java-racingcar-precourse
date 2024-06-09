package model;

import java.util.ArrayList;
import java.util.List;
import util.RandomNumberGenerator;

public class RacingCarGame {

    private final List<Car> cars = new ArrayList<>();
    private final int movementCount;

    private final RandomNumberGenerator generator = new RandomNumberGenerator();;

    public RacingCarGame(String[] carNames, int movementCount) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.movementCount = movementCount;
    }

    public void startRacing() {
        for (int i = 0; i < movementCount; i++) {
            for (Car car : cars) {
                car.move(generator.generateRandomNumber());
            }
        }
    }

}
