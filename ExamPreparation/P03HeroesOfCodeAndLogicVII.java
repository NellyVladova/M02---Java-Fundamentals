package ExamPreparation;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] heroesInfo = scanner.nextLine().split("\\s+");
            String heroName = heroesInfo[0];
            int hitPoint = Integer.parseInt(heroesInfo[1]);
            int manaPoint = Integer.parseInt(heroesInfo[2]);
            List<Integer> pointsInfo = new ArrayList<>();
            pointsInfo.add(hitPoint);
            pointsInfo.add(manaPoint);
            heroesMap.putIfAbsent(heroName, pointsInfo);

        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] comArr = command.split(" - ");
            String firstCom = comArr[0];
            String name = comArr[1];

            switch (firstCom){
                case "CastSpell":
                    int neededMP = Integer.parseInt(comArr[2]);
                    String spellName = comArr[3];
                    int currMP = heroesMap.get(name).get(1);
                    if(neededMP<=currMP){
                        int leftMP = currMP - neededMP;
                        heroesMap.get(name).set(1, leftMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", name, spellName, leftMP);
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", name, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(comArr[2]);
                    String attacker = comArr[3];
                    int currHP = heroesMap.get(name).get(0);
                    int leftHP = currHP - damage;
                    if(leftHP>0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", name, damage, attacker, leftHP);
                        heroesMap.get(name).set(0, leftHP);
                    }else {
                        System.out.printf("%s has been killed by %s!\n", name, attacker);
                        heroesMap.remove(name);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(comArr[2]);
                    int increasedMP = heroesMap.get(name).get(1) + amount;
                    if(increasedMP>200){
                        increasedMP = 200;
                        amount = 200 - heroesMap.get(name).get(1);
                    }
                    heroesMap.get(name).set(1, increasedMP);
                    System.out.printf("%s recharged for %d MP!\n", name, amount);
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(comArr[2]);
                    int increasedHP = heroesMap.get(name).get(0) + healAmount;
                    if(increasedHP>100){
                        increasedHP = 100;
                        healAmount = 100 - heroesMap.get(name).get(0);
                    }
                    heroesMap.get(name).set(0, increasedHP);
                    System.out.printf("%s healed for %d HP!\n", name, healAmount);
                    break;
            }
            command = scanner.nextLine();
        }
        heroesMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEach(entry ->{
                    System.out.println(entry.getKey());
                    System.out.printf("  HP: %d\n", entry.getValue().get(0));
                    System.out.printf("  MP: %d\n", entry.getValue().get(1));
                });
    }
}
