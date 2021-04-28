import java.util.Arrays;
import java.util.Random;

public abstract class Character {
    private String name;
    private int level;
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;
    private int strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod;
    private int strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc;
    private int proficiencyMod;
    private int health;
    private boolean isDead = false;

    
        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}
