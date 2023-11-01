package Lecture_11;

public class Television {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(4);
        tv1.setVolume(5);
        tv1.printDetails();

        TV tv2 = new TV(45,6,true);
        tv2.channelUp();
        tv2.volumeDown();
        tv2.turnOff();
        tv2.printDetails();
    }
}

class TV{
    int channel;
    int volumeLevel;
    boolean power=true;

    public TV(){}
    public TV(int channel, int volumeLevel, boolean power) {
        if(channel>=1&&channel<=120){
            this.channel = channel;
        }

        if(volumeLevel>=1&&volumeLevel<=7){
            this.volumeLevel = volumeLevel;
        }

        this.power = power;
    }

    public void turnOn(){this.power = true;}
    public void turnOff(){this.power = false;}
    public void setChannel(int newChannel){
        if(this.power&&newChannel>=1&&newChannel<=120){
        this.channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if(this.power&&newVolumeLevel>=1&&newVolumeLevel<=7){
        this.volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp(){
        if(this.power&&this.channel<120){
            this.channel++;
        }
    }
    public void channelDown(){
        if(this.power&&this.channel>1){
            this.channel--;
        }
    }
    public void volumeUp(){
        if(this.power&&this.volumeLevel<7){
            this.volumeLevel++;
        }
    }
    public void volumeDown(){
        if(this.power&&this.volumeLevel>1){
            this.volumeLevel--;
        }
    }
    public void printDetails(){
        System.out.println("Power: " + this.power + "\nChannel: " + this.channel + "\nVolume: " + this.volumeLevel);
    }
}
