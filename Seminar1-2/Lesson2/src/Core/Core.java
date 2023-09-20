package Core;

import Abstraction.ItemGenerator;
import Rewards.DiamondsGenerator;
import Rewards.GoldGenerator;
import Rewards.NutsGenerator;
import Rewards.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Core {
// логика игры
    public  void run(){
        List<ItemGenerator> generatorList = new ArrayList<>();
        /*generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new DiamondsGenerator());
        generatorList.add(new NutsGenerator());
        ItemGenerator myGenerator = generatorList.get(0);
        System.out.println(myGenerator.openReward()); */


        int i = 0;

        while (true){

            Random random = new Random();
            int randomNumber = random.nextInt(10);
            if(randomNumber < 3)
                generatorList.add(new GoldGenerator());
            if (randomNumber > 3 && randomNumber < 5)
                generatorList.add(new SilverGenerator());
            if (randomNumber > 5 && randomNumber < 8)
                generatorList.add(new DiamondsGenerator());
            else
                generatorList.add(new NutsGenerator());

            ItemGenerator myGenerator = generatorList.get(i);
            System.out.println((i) + "Ваша награда: " + myGenerator.openReward());
            i++;



        }

    }
}
