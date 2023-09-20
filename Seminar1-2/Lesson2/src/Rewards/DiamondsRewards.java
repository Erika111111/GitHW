package Rewards;

import Abstraction.IGameItem;

public class DiamondsRewards implements IGameItem {
    @Override
    public String open() {
        return "Diamonds";
    }
}
