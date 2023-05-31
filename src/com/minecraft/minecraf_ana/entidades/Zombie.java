package com.minecraft.minecraf_ana.entidades;

public class Zombie extends MobHostil {
    public Zombie() {
        super(10, 4);
    }

    @Override
    public void moverse() {
        System.out.println("El Zombie, se mueve hacia el personaje");
    }
}
