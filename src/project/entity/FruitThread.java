package project.entity;

import project.utils.Constants;

public class FruitThread extends Thread{

    @Override
    public void run(){
        for (String fruit: Constants.FRUITS){
            System.out.println(fruit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
