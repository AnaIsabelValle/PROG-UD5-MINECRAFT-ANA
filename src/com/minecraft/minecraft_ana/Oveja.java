package com.minecraft.minecraft_ana;

public class Oveja extends MobPacifico {
    public Oveja() {
        super(5);
    }

    @Override
    public void moverse() {
        System.out.println("La oveja, se mueve por el campo");
    }
}
