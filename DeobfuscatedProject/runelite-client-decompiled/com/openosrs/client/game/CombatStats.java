/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.game;

public final class CombatStats {
    private final int magicAttack;
    private final int magicDefence;
    private final int magicStr;
    private final int meleeAtkCrush;
    private final int meleeAtkSlash;
    private final int meleeAtkStab;
    private final int meleeAttack;
    private final int meleeDefCrush;
    private final int meleeDefence;
    private final int meleeDefSlash;
    private final int meleeDefStab;
    private final int meleeStr;
    private final int rangeAttack;
    private final int rangeDefence;
    private final int rangeStr;
    private final int speed;

    public CombatStats(int magicAttack, int magicDefence, int magicStr, int meleeAtkCrush, int meleeAtkSlash, int meleeAtkStab, int meleeAttack, int meleeDefCrush, int meleeDefence, int meleeDefSlash, int meleeDefStab, int meleeStr, int rangeAttack, int rangeDefence, int rangeStr, int speed) {
        this.magicAttack = magicAttack;
        this.magicDefence = magicDefence;
        this.magicStr = magicStr;
        this.meleeAtkCrush = meleeAtkCrush;
        this.meleeAtkSlash = meleeAtkSlash;
        this.meleeAtkStab = meleeAtkStab;
        this.meleeAttack = meleeAttack;
        this.meleeDefCrush = meleeDefCrush;
        this.meleeDefence = meleeDefence;
        this.meleeDefSlash = meleeDefSlash;
        this.meleeDefStab = meleeDefStab;
        this.meleeStr = meleeStr;
        this.rangeAttack = rangeAttack;
        this.rangeDefence = rangeDefence;
        this.rangeStr = rangeStr;
        this.speed = speed;
    }

    public int getMagicAttack() {
        return this.magicAttack;
    }

    public int getMagicDefence() {
        return this.magicDefence;
    }

    public int getMagicStr() {
        return this.magicStr;
    }

    public int getMeleeAtkCrush() {
        return this.meleeAtkCrush;
    }

    public int getMeleeAtkSlash() {
        return this.meleeAtkSlash;
    }

    public int getMeleeAtkStab() {
        return this.meleeAtkStab;
    }

    public int getMeleeAttack() {
        return this.meleeAttack;
    }

    public int getMeleeDefCrush() {
        return this.meleeDefCrush;
    }

    public int getMeleeDefence() {
        return this.meleeDefence;
    }

    public int getMeleeDefSlash() {
        return this.meleeDefSlash;
    }

    public int getMeleeDefStab() {
        return this.meleeDefStab;
    }

    public int getMeleeStr() {
        return this.meleeStr;
    }

    public int getRangeAttack() {
        return this.rangeAttack;
    }

    public int getRangeDefence() {
        return this.rangeDefence;
    }

    public int getRangeStr() {
        return this.rangeStr;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CombatStats)) {
            return false;
        }
        CombatStats other = (CombatStats)o;
        if (this.getMagicAttack() != other.getMagicAttack()) {
            return false;
        }
        if (this.getMagicDefence() != other.getMagicDefence()) {
            return false;
        }
        if (this.getMagicStr() != other.getMagicStr()) {
            return false;
        }
        if (this.getMeleeAtkCrush() != other.getMeleeAtkCrush()) {
            return false;
        }
        if (this.getMeleeAtkSlash() != other.getMeleeAtkSlash()) {
            return false;
        }
        if (this.getMeleeAtkStab() != other.getMeleeAtkStab()) {
            return false;
        }
        if (this.getMeleeAttack() != other.getMeleeAttack()) {
            return false;
        }
        if (this.getMeleeDefCrush() != other.getMeleeDefCrush()) {
            return false;
        }
        if (this.getMeleeDefence() != other.getMeleeDefence()) {
            return false;
        }
        if (this.getMeleeDefSlash() != other.getMeleeDefSlash()) {
            return false;
        }
        if (this.getMeleeDefStab() != other.getMeleeDefStab()) {
            return false;
        }
        if (this.getMeleeStr() != other.getMeleeStr()) {
            return false;
        }
        if (this.getRangeAttack() != other.getRangeAttack()) {
            return false;
        }
        if (this.getRangeDefence() != other.getRangeDefence()) {
            return false;
        }
        if (this.getRangeStr() != other.getRangeStr()) {
            return false;
        }
        return this.getSpeed() == other.getSpeed();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getMagicAttack();
        result = result * 59 + this.getMagicDefence();
        result = result * 59 + this.getMagicStr();
        result = result * 59 + this.getMeleeAtkCrush();
        result = result * 59 + this.getMeleeAtkSlash();
        result = result * 59 + this.getMeleeAtkStab();
        result = result * 59 + this.getMeleeAttack();
        result = result * 59 + this.getMeleeDefCrush();
        result = result * 59 + this.getMeleeDefence();
        result = result * 59 + this.getMeleeDefSlash();
        result = result * 59 + this.getMeleeDefStab();
        result = result * 59 + this.getMeleeStr();
        result = result * 59 + this.getRangeAttack();
        result = result * 59 + this.getRangeDefence();
        result = result * 59 + this.getRangeStr();
        result = result * 59 + this.getSpeed();
        return result;
    }

    public String toString() {
        return "CombatStats(magicAttack=" + this.getMagicAttack() + ", magicDefence=" + this.getMagicDefence() + ", magicStr=" + this.getMagicStr() + ", meleeAtkCrush=" + this.getMeleeAtkCrush() + ", meleeAtkSlash=" + this.getMeleeAtkSlash() + ", meleeAtkStab=" + this.getMeleeAtkStab() + ", meleeAttack=" + this.getMeleeAttack() + ", meleeDefCrush=" + this.getMeleeDefCrush() + ", meleeDefence=" + this.getMeleeDefence() + ", meleeDefSlash=" + this.getMeleeDefSlash() + ", meleeDefStab=" + this.getMeleeDefStab() + ", meleeStr=" + this.getMeleeStr() + ", rangeAttack=" + this.getRangeAttack() + ", rangeDefence=" + this.getRangeDefence() + ", rangeStr=" + this.getRangeStr() + ", speed=" + this.getSpeed() + ")";
    }
}

