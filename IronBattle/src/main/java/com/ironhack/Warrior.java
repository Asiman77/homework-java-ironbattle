package com.ironhack;

import java.util.Random;

public class Warrior extends Character implements Attacker{

    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = new Random().nextInt(41) + 10;
        this.strength = new Random().nextInt(10) + 1;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public void attack(Character character) {
        if(!isAlive() || this.stamina ==0){
            System.out.println("This character cant attack");
        }

        else{
            System.out.println(" Attacked succesfully ");
            character.setHp(character.getHp()-strength);
            this.stamina--;
        }
    }
}
