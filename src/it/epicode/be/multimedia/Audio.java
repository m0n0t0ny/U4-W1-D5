package it.epicode.be.multimedia;

import it.epicode.be.controls.Volume;

public class Audio extends Title implements Volume {

    private int duration;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public void play() {

        for (int i = 1; i <= getDuration(); i++) {
            System.out.println(getTitle());

        }
        System.out.println("!".repeat(getVolume()));
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public void VolumeUp() {
        if (getVolume() == 10) {
            System.out.println("Volume massimo raggiunto!");
        } else {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void VolumeDown() {
        if (getVolume() == 0) {
            System.out.println("Volume minimo raggiunto!");
        } else {
            setVolume(getVolume() - 1);
        }

    }
}
