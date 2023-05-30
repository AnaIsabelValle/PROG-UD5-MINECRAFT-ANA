package com.minecraft.minecraft_ana;

import com.minecraft.interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    @Override
    public int atarcar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {

    }
}
