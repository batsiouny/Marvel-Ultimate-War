package model.world;

import java.util.ArrayList;

import model.effects.Stun;

public class AntiHero extends Champion implements Damageable{

	public AntiHero(String name, int maxHP, int maxMana, int actions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, maxMana, actions, speed, attackRange, attackDamage);

	}
	
	public void useLeaderAbility(ArrayList<Champion> targets){
		for(int i=0; i < targets.size(); i++){
			
			Champion x = targets.get(i);
			Stun stun = new Stun(2);
			stun.apply(x);
			x.getAppliedEffects().add(stun);
		}
	}
}
