package TernaryOperation;

import AccessModifiers.Animal;

import java.util.jar.Manifest;

public class TestAccessModifier {

    public static void main(String[] args) {
        Animal a = new Animal();

        a.name = "Tom";
        a.sleep();
    }
}
