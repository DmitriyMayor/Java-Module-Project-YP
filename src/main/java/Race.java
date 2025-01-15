public class Race {
    String leader = "";
    int distance = 0;

    public void leaderCalculation(Car car) {
        int newDistance = 24 * car.speed;
        if (newDistance > this.distance) {
            this.distance = newDistance;
            this.leader = car.name;
        }
    }

}
