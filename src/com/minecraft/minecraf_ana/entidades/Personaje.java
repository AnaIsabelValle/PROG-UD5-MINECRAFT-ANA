package com.minecraft.minecraf_ana.entidades;

import com.minecraft.minecraf_ana.interfaces.Combate;

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
        int dañoRecibido = ataque - defensa;
        if (dañoRecibido < 0) {
            dañoRecibido = 0;
        }
        salud -= dañoRecibido;
        System.out.println("El personaje ha recibido un daño de: " + dañoRecibido);
        System.out.println("El personaje tiene una salud de : " + salud);
    }
}
