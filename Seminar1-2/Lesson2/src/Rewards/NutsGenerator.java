package Rewards;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class NutsGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new NutsRewards();
    }
}
