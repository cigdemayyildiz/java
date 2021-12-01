package Primitives;

public class LogicalOperator {

    public static void main(String[] args) {

        // && --> and

        int myAge = 15;
        boolean myDress = true;

        int ageRequirement = 21;
        boolean casualDress = true;

        boolean attend = myAge >= ageRequirement && myDress==casualDress;
        System.out.println("Can I go that event? --> " + attend); // false

        myAge = 20;
        boolean attend2 = myAge >= ageRequirement && myDress==casualDress;
        System.out.println(attend2); // false

        boolean attend3 = myAge <= ageRequirement && myDress == casualDress;
        System.out.println(attend3); // true

        // || --> or

        int myNewAge = 28;
        boolean myMoney = false;
        int ageRqrmnt = 18;
        boolean moneyRqrmnt = true;

        boolean go = myNewAge >= ageRqrmnt || myMoney==moneyRqrmnt;
        System.out.println(go); // true

        myNewAge = 8;
        go = myNewAge >= ageRqrmnt || myMoney==moneyRqrmnt;
        System.out.println(go); // false

        myMoney = true;
        go = myNewAge >= ageRqrmnt || myMoney==moneyRqrmnt;
        System.out.println(go); // true
    }
}
