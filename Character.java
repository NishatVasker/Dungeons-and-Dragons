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

   

    public Character(String name, int level, int strength, int dexterity, int constitution, int intelligence,
                    int wisdom, int charisma, int proficiencyMod, int health, boolean isDead) {
        this.name=name;
        this.level=level;
        this.strength=strength;
        this.dexterity=dexterity;
        this.constitution=constitution;
        this.intelligence=intelligence;
        this.wisdom=wisdom;
        this.charisma=charisma;
        this.proficiencyMod=proficiencyMod;
        this.health=health;
        this.isDead=isDead;

    }

   

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}
