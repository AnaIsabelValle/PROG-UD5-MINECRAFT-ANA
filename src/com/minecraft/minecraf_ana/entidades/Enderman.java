package com.minecraft.minecraf_ana.entidades;

public class Enderman extends MobHostil {
    public Enderman() {
        super(14, 6);
    }

    @Override
    public void moverse() {
        System.out.println("El Enderman, se le teletransporta detrás");
    }
}