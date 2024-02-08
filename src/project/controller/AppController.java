package project.controller;

import project.entity.FruitThread;
import project.entity.VegetableThread;
import project.view.AppView;

public class AppController {
    public void runApp(){
        AppView view = new AppView();
        FruitThread fruitThread = new FruitThread();
        VegetableThread vegetableThread = new VegetableThread();
        view.getInfoVegetables();
        vegetableThread.start();
        try{
            vegetableThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        view.getInfoFruits();
        fruitThread.start();
    }
}
