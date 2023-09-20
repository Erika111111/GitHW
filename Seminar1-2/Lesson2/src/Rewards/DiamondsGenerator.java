package Rewards;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class DiamondsGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new DiamondsRewards();
    }
}
