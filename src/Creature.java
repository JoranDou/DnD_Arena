public class Creature {

    String Name;
    int HealthPoints;
    int MainAttribute;
    int Agility;
    int AC;
    int WeaponDice;
    int ProfBonus;

    public Creature(String newName, int HP, int MainMod, int agilityMod, int newAC, int newWeaponDice, int newProfBonus){
        Name = newName;
        HealthPoints = HP;
        MainAttribute = MainMod;
        Agility = agilityMod;
        AC = newAC;
        WeaponDice = newWeaponDice;
        ProfBonus = newProfBonus;
    }

    public int RollTheInitiative(int agility){
        DiceRoller Roll = new DiceRoller();
        int a = Roll.RollTheDice(1, 20);
        int initiative = a + agility;
        return initiative;
    }

    public int Attack(int mod, int ProfBonus){
        DiceRoller Roll = new DiceRoller();
        int Attack = Roll.RollTheDice(1, 20) + mod + ProfBonus;
        System.out.println("с результатом " + Attack + " и ");
        return Attack;
    }

    public int Damage(int mod, int WeaponDice){
        DiceRoller Roll = new DiceRoller();
        int Damage = Roll.RollTheDice(1, WeaponDice) + mod;
        System.out.println("попадает! Он наносиит " + Damage + " единиц урона.");
        return Damage;
    }

}
