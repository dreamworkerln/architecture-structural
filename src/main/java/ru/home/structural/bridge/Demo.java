package ru.home.structural.bridge;


import ru.home.structural.bridge.devices.Device;
import ru.home.structural.bridge.devices.Radio;
import ru.home.structural.bridge.devices.Tv;
import ru.home.structural.bridge.remotes.AdvancedRemote;
import ru.home.structural.bridge.remotes.BasicRemote;


// example forked from
// https://github.com/RefactoringGuru/design-patterns-java/tree/master/src/refactoring_guru/bridge/example
public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
