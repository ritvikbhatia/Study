public class CombinationStrategy implements Strategy{
    @Override
    public void printStrategy() {
        Strategy strategy=new MyStrategy();
        Strategy secStrategy=new SecondStrategy();
        strategy.printStrategy();
        secStrategy.printStrategy();
    }
}
