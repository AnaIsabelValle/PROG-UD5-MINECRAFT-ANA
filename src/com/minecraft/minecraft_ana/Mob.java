package com.minecraft.minecraft_ana;

public abstract class Mob {
    private int salud;

    public Mob(int salud) {
        this.salud = salud;
    }
    public abstract void moverse();
}
