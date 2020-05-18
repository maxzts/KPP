public class StartGameThread extends Thread {
    public void run() {
        GameWindow w = new GameWindow();
        w.setUpGame();
    }
}
