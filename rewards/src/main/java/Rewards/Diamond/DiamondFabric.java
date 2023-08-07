package Rewards.Diamond;

import Classes.iGameIterm;
import Classes.itemGenerator;
public class DiamondFabric extends itemGenerator {

    @Override
    public iGameIterm createItem() {
        return new Diamond();
    }
}
