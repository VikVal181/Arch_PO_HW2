package Rewards.Silver;

import Classes.iGameIterm;
import Classes.itemGenerator;


public class SilverFabric extends itemGenerator {
    @Override
    public iGameIterm createItem() {
        return new Silver();
    }
}