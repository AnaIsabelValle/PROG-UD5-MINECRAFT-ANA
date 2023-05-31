package com.minecraft.minecraft_ana.entidades;

public class Enderman extends MobHostil {
    public Enderman() {
        super(14, 6);
    }

    @Override
    public void moverse() {
        System.out.println("El Enderman, se le teletransporta detrás");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
