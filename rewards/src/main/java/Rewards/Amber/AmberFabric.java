package Rewards.Amber;

import Classes.iGameIterm;
import Classes.itemGenerator;
public class AmberFabric extends itemGenerator {

    @Override
    public iGameIterm createItem() {
        return new Amber();
    }
}
