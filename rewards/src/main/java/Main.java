import Classes.itemGenerator;

import Rewards.Amber.AmberFabric;
import Rewards.Gold.GoldFabric;
import Rewards.Gem.GemFabric;
import Rewards.Platinum.PlatinumFabric;
import Rewards.Sapphire.SapphireFabric;
import Rewards.Silver.SilverFabric;
import Rewards.Diamond.DiamondFabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        itemGenerator goldFabric = new GoldFabric();
        itemGenerator gemFabric = new GemFabric();
        itemGenerator silverFabric = new SilverFabric();
        itemGenerator diamondFabric = new DiamondFabric();
        itemGenerator sapphireFabric = new SapphireFabric();
        itemGenerator amberFabric = new AmberFabric();
        itemGenerator platinumFabric = new PlatinumFabric();

        List<itemGenerator> fabricList = new ArrayList<>();

        fabricList.add(goldFabric);
        fabricList.add(gemFabric);
        fabricList.add(silverFabric);
        fabricList.add(diamondFabric);
        fabricList.add(sapphireFabric);
        fabricList.add(amberFabric);
        fabricList.add(platinumFabric);

        for (int i = 0; i < 30; i++) {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }

    }
}