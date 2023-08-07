package Classes;

public abstract class itemGenerator {
    public void openReward() {
        iGameIterm gameIterm = createItem();
        gameIterm.open();
    }

    public abstract iGameIterm createItem();
}
