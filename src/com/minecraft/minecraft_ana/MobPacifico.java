package com.minecraft.minecraft_ana;

import com.minecraft.interfaces.Daño;

public abstract class MobPacifico extends Mob implements Daño {
    public MobPacifico(int salud) {
        super(salud);
    }
}
