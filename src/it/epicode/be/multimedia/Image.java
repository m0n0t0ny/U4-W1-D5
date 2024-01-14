package it.epicode.be.multimedia;

import it.epicode.be.controls.Brightness;

public class Image extends Title implements Brightness {

    private int brightness;


    public Image(String titolo, int brightness) {
        super(titolo);
        this.brightness = brightness;
    }


    public void show() {


        System.out.println(getTitle());


        System.out.println("*".repeat(getBrightness()));

    }

    @Override
    public void BrightnessUp() {
        if (getBrightness() == 10) {
            System.out.println("Luminosità massima raggiunta.");
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

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
