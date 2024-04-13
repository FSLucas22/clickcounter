public class Main {
    public static void main(String[] args) {
        var clickCounter = new ClickCounter();
        clickCounter.subscribe(
                numberOfClicks -> System.out.println(
                        "A new click occurred! Current number of clicks: " + numberOfClicks
                )
        );

        clickCounter.click();
        clickCounter.click();
        clickCounter.click();
    }
}
