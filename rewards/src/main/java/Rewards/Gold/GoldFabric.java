package Rewards.Gold;

import Classes.iGameIterm;
import Classes.itemGenerator;
public class GoldFabric extends itemGenerator {
    @Override
    public iGameIterm createItem() {
        return new Gold();
    }
}
