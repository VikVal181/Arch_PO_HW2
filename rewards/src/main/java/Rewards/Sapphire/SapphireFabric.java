package Rewards.Sapphire;

import Classes.iGameIterm;
import Classes.itemGenerator;
public class SapphireFabric extends itemGenerator {

    @Override
    public iGameIterm createItem() {
        return new Sapphire();
    }
}
