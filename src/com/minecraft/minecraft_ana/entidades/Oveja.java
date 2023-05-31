package com.minecraft.minecraft_ana.entidades;

public class Oveja extends MobPacifico {
    public Oveja() {
        super(5);
    }

    @Override
    public void moverse() {
        System.out.println("La oveja, se mueve por el campo");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
