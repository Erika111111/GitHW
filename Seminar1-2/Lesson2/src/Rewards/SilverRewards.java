package Rewards;

import Abstraction.IGameItem;

public class SilverRewards implements IGameItem {
    @Override
    public String open() {
        return "Silver";
    }
}
