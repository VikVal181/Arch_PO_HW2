package Rewards.Gem;

import Classes.iGameIterm;
import Classes.itemGenerator;
public class GemFabric extends itemGenerator {

    @Override
    public iGameIterm createItem() {
        return new Gem();
    }
}
