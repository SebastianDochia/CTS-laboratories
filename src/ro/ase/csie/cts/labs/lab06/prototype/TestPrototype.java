package ro.ase.csie.cts.labs.lab06.prototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Char3DModel mickeyMouse = new Char3DModel(CharacterType.DISNEY, "red");

//        Char3DModel mickeyMouse2 = new Char3DModel(CharacterType.DISNEY, "red");
//        Char3DModel mickeyMouse3 = new Char3DModel(CharacterType.DISNEY, "red");
//        Char3DModel mickeyMouse4 = new Char3DModel(CharacterType.DISNEY, "red");

        Char3DModel mickeyMouse2 = (Char3DModel) mickeyMouse.clone();
    }
}
