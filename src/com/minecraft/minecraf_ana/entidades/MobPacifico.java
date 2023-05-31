package com.minecraft.minecraf_ana.entidades;

import com.minecraft.minecraf_ana.interfaces.Daño;

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
