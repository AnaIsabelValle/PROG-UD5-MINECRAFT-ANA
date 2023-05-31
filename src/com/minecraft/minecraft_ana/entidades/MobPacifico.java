package com.minecraft.minecraft_ana.entidades;

import com.minecraft.minecraft_ana.interfaces.Daño;

public abstract class MobPacifico extends Mob implements Daño {
    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dañoRecibido = ataque;
        int saludRestante = salud - dañoRecibido;
    }
}
