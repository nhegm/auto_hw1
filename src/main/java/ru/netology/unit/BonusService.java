package ru.netology.unit;

public class BonusService {
    public int calculateBonus(int amount) {
        if (amount < 1_000) {
            return 0;
        }
        int bonus = (amount - 1_000) / 100;
        if (bonus > 100) {
            return 100;
        }
        return bonus;
    }
}