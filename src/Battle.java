public class Battle {

    public static void main(String[] args){
        Creature Creature1 = new Creature("Гоблин", 7, 2, 2, 15, 6, 2);
        Creature Creature2 = new Creature("Орк", 11, 3, 1, 11, 8, 2);
        System.out.println(Creature1.Name + " и " + Creature2.Name + " вступают в бой!");
        int HPofCreature1 = Creature1.HealthPoints;
        int HPofCreature2 = Creature2.HealthPoints;

        int initiativeOfCreature1 = Creature1.RollTheInitiative(Creature1.Agility);
        int initiativeOfCreature2 = Creature2.RollTheInitiative(Creature2.Agility);
        if(initiativeOfCreature1 > initiativeOfCreature2){
            System.out.println(Creature1.Name + " ходит первым с инициативой " + initiativeOfCreature1 + ".");
        }
        else{
            System.out.println(Creature2.Name + " ходит первым с инициативой " + initiativeOfCreature2 + ".");
        }

        while(HPofCreature1 > 0 && HPofCreature2 > 0){
            if(initiativeOfCreature1 > initiativeOfCreature2){
                System.out.print(Creature1.Name + " совершает атаку ");
                if(Creature1.Attack(Creature1.MainAttribute, Creature1.ProfBonus) >= Creature2.AC){
                    HPofCreature2 = HPofCreature2 - Creature1.Damage(Creature1.MainAttribute, Creature1.WeaponDice);
                    if(HPofCreature2 > 0){
                        System.out.println("У " + Creature2.Name + "а Осталось " + HPofCreature2 + " единиц здоровья из " + Creature2.HealthPoints + ".");
                    }
                    else{
                        System.out.println(Creature2.Name + " повержен!");
                        System.out.println(Creature1.Name + " побеждает в этом бою! У него ослоась " + HPofCreature1 + " единиц здоровья из " + Creature1.HealthPoints);
                        break;
                    }
                }
                else{
                    System.out.println("промахивается!");
                }

                System.out.print(Creature2.Name + " совершает атаку ");
                if(Creature2.Attack(Creature2.MainAttribute, Creature2.ProfBonus) >= Creature1.AC){
                    HPofCreature1 = HPofCreature1 - Creature2.Damage(Creature2.MainAttribute, Creature2.WeaponDice);
                    if(HPofCreature1 > 0){
                        System.out.println("У " + Creature1.Name + "а Осталось " + HPofCreature1 + " единиц здоровья из " + Creature1.HealthPoints + ".");
                    }
                    else{
                        System.out.println(Creature1.Name + " повержен!");
                        System.out.println(Creature2.Name + " побеждает в этом бою! У него ослоась " + HPofCreature2 + " единиц здоровья из " + Creature2.HealthPoints);
                        break;
                    }
                }
                else{
                    System.out.println("промахивается!");
                }
            }
            else{
                System.out.print(Creature2.Name + " совершает атаку ");
                if(Creature2.Attack(Creature2.MainAttribute, Creature2.ProfBonus) >= Creature1.AC){
                    HPofCreature1 = HPofCreature1 - Creature2.Damage(Creature2.MainAttribute, Creature2.WeaponDice);
                    if(HPofCreature1 > 0){
                        System.out.println("У " + Creature1.Name + "а Осталось " + HPofCreature1 + " единиц здоровья из " + Creature1.HealthPoints + ".");
                    }
                    else{
                        System.out.println(Creature1.Name + " повержен!");
                        System.out.println(Creature2.Name + " побеждает в этом бою! У него ослоась " + HPofCreature2 + " единиц здоровья из " + Creature2.HealthPoints);
                        break;
                    }
                }
                else{
                    System.out.println("промахивается!");
                }

                System.out.print(Creature1.Name + " совершает атаку ");
                if(Creature1.Attack(Creature1.MainAttribute, Creature1.ProfBonus) >= Creature2.AC){
                    HPofCreature2 = HPofCreature2 - Creature1.Damage(Creature1.MainAttribute, Creature1.WeaponDice);
                    if(HPofCreature2 > 0){
                        System.out.println("У " + Creature2.Name + "а Осталось " + HPofCreature2 + " единиц здоровья из " + Creature2.HealthPoints + ".");
                    }
                    else{
                        System.out.println(Creature2.Name + " повержен!");
                        System.out.println(Creature1.Name + " побеждает в этом бою! У него ослоась " + HPofCreature1 + " единиц здоровья из " + Creature1.HealthPoints);
                        break;
                    }
                }
                else{
                    System.out.println("промахивается!");
                }
            }
        }

    }
}


