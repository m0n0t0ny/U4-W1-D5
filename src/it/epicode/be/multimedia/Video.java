package it.epicode.be.multimedia;

import it.epicode.be.controls.Brightness;
import it.epicode.be.controls.Volume;

public class Video extends Title implements Brightness, Volume {

    private int brightness;
    private int duration;
    private int volume;

    public Video(String titolo, int brightness, int duration, int volume) {
        super(titolo);
        this.brightness = brightness;
        this.duration = duration;
        this.volume = volume;
    }


    public void play() {
        for (int i = 1; i <= getDuration(); i++) {
            System.out.println(getTitle());
        }
        System.out.println("!".repeat(getVolume()) + " " + "*".repeat(getBrightness()));

    }


    @Override
    public void BrightnessUp() {
        if (getBrightness() == 10) {
            System.out.println("Luminosità massima raggiunta");
        } else {
            setBrightness(getBrightness() + 1);
        }
    }

    @Override
    public void BrightnessDown() {
        if (getBrightness() == 0) {
            System.out.println("Luminosità minima raggiunta");
        } else {
            setBrightness(getBrightness() - 1);
        }
    }

    @Override
    public void VolumeUp() {
        if (getVolume() == 10) {
            System.out.println("Volume massimo raggiunto");
        } else {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void VolumeDown() {
        if (getVolume() == 0) {
            System.out.println("Volume minimo raggiunto");
        } else {
            setVolume(getVolume() - 1);
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
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
}
