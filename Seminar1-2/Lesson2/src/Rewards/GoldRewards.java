package Rewards;

import Abstraction.IGameItem;

public class GoldRewards implements IGameItem {
    @Override
    public String open() {
        return "Gold";
    }
}
