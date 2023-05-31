package com.minecraft.minecraf_ana.entidades;

import com.minecraft.minecraf_ana.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    private int fuerza;

    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public int atarcar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dañoRecibido = ataque;
        int saludRestante = salud - dañoRecibido;
        System.out.println("El daño recibido es de : " + dañoRecibido + " y la salud restante es de : "
                + saludRestante);


    }

    @Override
    public void moverse() {

    }
}
