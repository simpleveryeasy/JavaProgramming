package week11;

import java.util.ArrayList;

public class TVTest {

    public static void main(String[] args) {
        // we will create a TV object
        TV samsung = new TV(); //new keyword invokes constructor with no parameters
        System.out.println(samsung); //TV{channel=1, volumeLevel=1, on=false}

        samsung.turnOn();
        samsung.setChannel(7);
        samsung.setVolumeLevel(3);
        System.out.println(samsung);//TV{channel=7, volumeLevel=3, on=true}

        TV lg = new TV();
        lg.setChannel(7);
        lg.setVolumeLevel(3);
        System.out.println(lg); //TV{channel=1, volumeLevel=1, on=false}
        lg.turnOn();
        lg.setChannel(7);
        lg.setVolumeLevel(3);
        System.out.println(lg); //TV{channel=7, volumeLevel=3, on=true}

        TV sony = new TV(3, 4, true);

        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(samsung);
        tvList.add(lg);
        tvList.add(sony);

        for (TV eachTv : tvList){ // eachTv becomes object reference for out TV objects
            System.out.println("is the TV on? " + eachTv.on);
        }
    }
}
