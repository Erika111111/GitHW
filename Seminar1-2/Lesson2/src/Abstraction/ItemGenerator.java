package Abstraction;
// абстракция класса фабрики
public abstract class ItemGenerator {
    // метод взаимодействия с абстрактной продукцией
    // return: содержимое из разных сундуков
    public  String openReward(){
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    //метод создания экземпляра продукта
    // return: экземпляр продукта
    public  abstract IGameItem createItem();
}
