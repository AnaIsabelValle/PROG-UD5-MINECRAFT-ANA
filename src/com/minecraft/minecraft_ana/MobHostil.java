package com.minecraft.minecraft_ana;

import com.minecraft.interfaces.Combate;

public class MobHostil extends Mob implements Combate {
    private int fuerza;

    @Override
    public int atarcar() {
        return 0;
    }

    @Override
    public void recibirAtaque(int ataque) {

    }

    @Override
    public void moverse() {

    }
}
