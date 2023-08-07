package Rewards.Platinum;

import Classes.iGameIterm;
import Classes.itemGenerator;
public class PlatinumFabric extends itemGenerator {
    @Override
    public iGameIterm createItem() {
        return new Platinum();
    }
}
