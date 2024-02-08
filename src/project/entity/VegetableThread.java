package project.entity;

import project.utils.Constants;

public class VegetableThread extends Thread{

    @Override
    public void run(){
        for(String vegetable: Constants.VEGETABLES){
            System.out.println(vegetable);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
