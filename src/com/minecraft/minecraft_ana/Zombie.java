package com.minecraft.minecraft_ana;

import com.minecraft.interfaces.Daño;

public class Zombie extends MobHostil implements Daño {
    public Zombie() {
        super(10, 4);
    }

    @Override
    public void moverse() {
        System.out.println("El Zombie, se mueve hacia el personaje");
    }
}
