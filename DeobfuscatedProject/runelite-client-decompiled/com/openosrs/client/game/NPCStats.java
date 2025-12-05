/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.game;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class NPCStats {
    private final String name;
    private final String wiki;
    private final int hitpoints;
    private final int combatLevel;
    private final int slayerLevel;
    private final int attackSpeed;
    private final int attackLevel;
    private final int strengthLevel;
    private final int defenceLevel;
    private final int rangeLevel;
    private final int magicLevel;
    private final int stab;
    private final int slash;
    private final int crush;
    private final int range;
    private final int magic;
    private final int stabDef;
    private final int slashDef;
    private final int crushDef;
    private final int rangeDef;
    private final int magicDef;
    private final int bonusAttack;
    private final int bonusStrength;
    private final int bonusRangeStrength;
    private final int bonusMagicDamage;
    private final boolean poisonImmune;
    private final boolean venomImmune;
    private final boolean cannonImmune;
    private final boolean thrallImmune;
    private final boolean demon;
    private final boolean dragon;
    private final boolean fiery;
    private final boolean kalphite;
    private final boolean leafy;
    private final boolean shade;
    private final boolean spectral;
    private final boolean undead;
    private final boolean vampyre1;
    private final boolean vampyre2;
    private final boolean vampyre3;
    private final boolean xerician;
    private final int respawn;
    public static final TypeAdapter<NPCStats> NPC_STATS_TYPE_ADAPTER = new TypeAdapter<NPCStats>(){

        @Override
        public void write(JsonWriter out, NPCStats value) {
            throw new UnsupportedOperationException("Not supported");
        }

        @Override
        public NPCStats read(JsonReader in) throws IOException {
            in.beginObject();
            Builder builder = NPCStats.builder();
            in.skipValue();
            builder.name(in.nextString());
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "wiki": {
                        builder.wiki(in.nextString());
                        break;
                    }
                    case "hitpoints": {
                        builder.hitpoints(in.nextInt());
                        break;
                    }
                    case "combatLevel": {
                        builder.combatLevel(in.nextInt());
                        break;
                    }
                    case "slayerLevel": {
                        builder.slayerLevel(in.nextInt());
                        break;
                    }
                    case "attackSpeed": {
                        builder.attackSpeed(in.nextInt());
                        break;
                    }
                    case "attackLevel": {
                        builder.attackLevel(in.nextInt());
                        break;
                    }
                    case "strengthLevel": {
                        builder.strengthLevel(in.nextInt());
                        break;
                    }
                    case "defenceLevel": {
                        builder.defenceLevel(in.nextInt());
                        break;
                    }
                    case "rangeLevel": {
                        builder.rangeLevel(in.nextInt());
                        break;
                    }
                    case "magicLevel": {
                        builder.magicLevel(in.nextInt());
                        break;
                    }
                    case "stab": {
                        builder.stab(in.nextInt());
                        break;
                    }
                    case "slash": {
                        builder.slash(in.nextInt());
                        break;
                    }
                    case "crush": {
                        builder.crush(in.nextInt());
                        break;
                    }
                    case "range": {
                        builder.range(in.nextInt());
                        break;
                    }
                    case "magic": {
                        builder.magic(in.nextInt());
                        break;
                    }
                    case "stabDef": {
                        builder.stabDef(in.nextInt());
                        break;
                    }
                    case "slashDef": {
                        builder.slashDef(in.nextInt());
                        break;
                    }
                    case "crushDef": {
                        builder.crushDef(in.nextInt());
                        break;
                    }
                    case "rangeDef": {
                        builder.rangeDef(in.nextInt());
                        break;
                    }
                    case "magicDef": {
                        builder.magicDef(in.nextInt());
                        break;
                    }
                    case "bonusAttack": {
                        builder.bonusAttack(in.nextInt());
                        break;
                    }
                    case "bonusStrength": {
                        builder.bonusStrength(in.nextInt());
                        break;
                    }
                    case "bonusRangeStrength": {
                        builder.bonusRangeStrength(in.nextInt());
                        break;
                    }
                    case "bonusMagicDamage": {
                        builder.bonusMagicDamage(in.nextInt());
                        break;
                    }
                    case "poisonImmune": {
                        builder.poisonImmune(in.nextBoolean());
                        break;
                    }
                    case "venomImmune": {
                        builder.venomImmune(in.nextBoolean());
                        break;
                    }
                    case "cannonImmune": {
                        builder.cannonImmune(in.nextBoolean());
                        break;
                    }
                    case "thrallImmune": {
                        builder.thrallImmune(in.nextBoolean());
                        break;
                    }
                    case "demon": {
                        builder.demon(in.nextBoolean());
                        break;
                    }
                    case "dragon": {
                        builder.dragon(in.nextBoolean());
                        break;
                    }
                    case "fiery": {
                        builder.fiery(in.nextBoolean());
                        break;
                    }
                    case "kalphite": {
                        builder.kalphite(in.nextBoolean());
                        break;
                    }
                    case "leafy": {
                        builder.leafy(in.nextBoolean());
                        break;
                    }
                    case "shade": {
                        builder.shade(in.nextBoolean());
                        break;
                    }
                    case "spectral": {
                        builder.spectral(in.nextBoolean());
                        break;
                    }
                    case "undead": {
                        builder.undead(in.nextBoolean());
                        break;
                    }
                    case "vampyre1": {
                        builder.vampyre1(in.nextBoolean());
                        break;
                    }
                    case "vampyre2": {
                        builder.vampyre2(in.nextBoolean());
                        break;
                    }
                    case "vampyre3": {
                        builder.vampyre3(in.nextBoolean());
                        break;
                    }
                    case "xerician": {
                        builder.xerician(in.nextBoolean());
                        break;
                    }
                    case "respawn": {
                        builder.respawn(in.nextInt());
                    }
                }
            }
            in.endObject();
            return builder.build();
        }
    };

    public double calculateXpModifier() {
        double averageLevel = Math.floor((this.attackLevel + this.strengthLevel + this.defenceLevel + this.hitpoints) / 4);
        double averageDefBonus = Math.floor((this.stabDef + this.slashDef + this.crushDef) / 3);
        return 1.0 + Math.floor(averageLevel * (averageDefBonus + (double)this.bonusStrength + (double)this.bonusAttack) / 5120.0) / 40.0;
    }

    NPCStats(String name, String wiki, int hitpoints, int combatLevel, int slayerLevel, int attackSpeed, int attackLevel, int strengthLevel, int defenceLevel, int rangeLevel, int magicLevel, int stab, int slash, int crush, int range, int magic, int stabDef, int slashDef, int crushDef, int rangeDef, int magicDef, int bonusAttack, int bonusStrength, int bonusRangeStrength, int bonusMagicDamage, boolean poisonImmune, boolean venomImmune, boolean cannonImmune, boolean thrallImmune, boolean demon, boolean dragon, boolean fiery, boolean kalphite, boolean leafy, boolean shade, boolean spectral, boolean undead, boolean vampyre1, boolean vampyre2, boolean vampyre3, boolean xerician, int respawn) {
        this.name = name;
        this.wiki = wiki;
        this.hitpoints = hitpoints;
        this.combatLevel = combatLevel;
        this.slayerLevel = slayerLevel;
        this.attackSpeed = attackSpeed;
        this.attackLevel = attackLevel;
        this.strengthLevel = strengthLevel;
        this.defenceLevel = defenceLevel;
        this.rangeLevel = rangeLevel;
        this.magicLevel = magicLevel;
        this.stab = stab;
        this.slash = slash;
        this.crush = crush;
        this.range = range;
        this.magic = magic;
        this.stabDef = stabDef;
        this.slashDef = slashDef;
        this.crushDef = crushDef;
        this.rangeDef = rangeDef;
        this.magicDef = magicDef;
        this.bonusAttack = bonusAttack;
        this.bonusStrength = bonusStrength;
        this.bonusRangeStrength = bonusRangeStrength;
        this.bonusMagicDamage = bonusMagicDamage;
        this.poisonImmune = poisonImmune;
        this.venomImmune = venomImmune;
        this.cannonImmune = cannonImmune;
        this.thrallImmune = thrallImmune;
        this.demon = demon;
        this.dragon = dragon;
        this.fiery = fiery;
        this.kalphite = kalphite;
        this.leafy = leafy;
        this.shade = shade;
        this.spectral = spectral;
        this.undead = undead;
        this.vampyre1 = vampyre1;
        this.vampyre2 = vampyre2;
        this.vampyre3 = vampyre3;
        this.xerician = xerician;
        this.respawn = respawn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public String getWiki() {
        return this.wiki;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public int getCombatLevel() {
        return this.combatLevel;
    }

    public int getSlayerLevel() {
        return this.slayerLevel;
    }

    public int getAttackSpeed() {
        return this.attackSpeed;
    }

    public int getAttackLevel() {
        return this.attackLevel;
    }

    public int getStrengthLevel() {
        return this.strengthLevel;
    }

    public int getDefenceLevel() {
        return this.defenceLevel;
    }

    public int getRangeLevel() {
        return this.rangeLevel;
    }

    public int getMagicLevel() {
        return this.magicLevel;
    }

    public int getStab() {
        return this.stab;
    }

    public int getSlash() {
        return this.slash;
    }

    public int getCrush() {
        return this.crush;
    }

    public int getRange() {
        return this.range;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getStabDef() {
        return this.stabDef;
    }

    public int getSlashDef() {
        return this.slashDef;
    }

    public int getCrushDef() {
        return this.crushDef;
    }

    public int getRangeDef() {
        return this.rangeDef;
    }

    public int getMagicDef() {
        return this.magicDef;
    }

    public int getBonusAttack() {
        return this.bonusAttack;
    }

    public int getBonusStrength() {
        return this.bonusStrength;
    }

    public int getBonusRangeStrength() {
        return this.bonusRangeStrength;
    }

    public int getBonusMagicDamage() {
        return this.bonusMagicDamage;
    }

    public boolean isPoisonImmune() {
        return this.poisonImmune;
    }

    public boolean isVenomImmune() {
        return this.venomImmune;
    }

    public boolean isCannonImmune() {
        return this.cannonImmune;
    }

    public boolean isThrallImmune() {
        return this.thrallImmune;
    }

    public boolean isDemon() {
        return this.demon;
    }

    public boolean isDragon() {
        return this.dragon;
    }

    public boolean isFiery() {
        return this.fiery;
    }

    public boolean isKalphite() {
        return this.kalphite;
    }

    public boolean isLeafy() {
        return this.leafy;
    }

    public boolean isShade() {
        return this.shade;
    }

    public boolean isSpectral() {
        return this.spectral;
    }

    public boolean isUndead() {
        return this.undead;
    }

    public boolean isVampyre1() {
        return this.vampyre1;
    }

    public boolean isVampyre2() {
        return this.vampyre2;
    }

    public boolean isVampyre3() {
        return this.vampyre3;
    }

    public boolean isXerician() {
        return this.xerician;
    }

    public int getRespawn() {
        return this.respawn;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NPCStats)) {
            return false;
        }
        NPCStats other = (NPCStats)o;
        if (this.getHitpoints() != other.getHitpoints()) {
            return false;
        }
        if (this.getCombatLevel() != other.getCombatLevel()) {
            return false;
        }
        if (this.getSlayerLevel() != other.getSlayerLevel()) {
            return false;
        }
        if (this.getAttackSpeed() != other.getAttackSpeed()) {
            return false;
        }
        if (this.getAttackLevel() != other.getAttackLevel()) {
            return false;
        }
        if (this.getStrengthLevel() != other.getStrengthLevel()) {
            return false;
        }
        if (this.getDefenceLevel() != other.getDefenceLevel()) {
            return false;
        }
        if (this.getRangeLevel() != other.getRangeLevel()) {
            return false;
        }
        if (this.getMagicLevel() != other.getMagicLevel()) {
            return false;
        }
        if (this.getStab() != other.getStab()) {
            return false;
        }
        if (this.getSlash() != other.getSlash()) {
            return false;
        }
        if (this.getCrush() != other.getCrush()) {
            return false;
        }
        if (this.getRange() != other.getRange()) {
            return false;
        }
        if (this.getMagic() != other.getMagic()) {
            return false;
        }
        if (this.getStabDef() != other.getStabDef()) {
            return false;
        }
        if (this.getSlashDef() != other.getSlashDef()) {
            return false;
        }
        if (this.getCrushDef() != other.getCrushDef()) {
            return false;
        }
        if (this.getRangeDef() != other.getRangeDef()) {
            return false;
        }
        if (this.getMagicDef() != other.getMagicDef()) {
            return false;
        }
        if (this.getBonusAttack() != other.getBonusAttack()) {
            return false;
        }
        if (this.getBonusStrength() != other.getBonusStrength()) {
            return false;
        }
        if (this.getBonusRangeStrength() != other.getBonusRangeStrength()) {
            return false;
        }
        if (this.getBonusMagicDamage() != other.getBonusMagicDamage()) {
            return false;
        }
        if (this.isPoisonImmune() != other.isPoisonImmune()) {
            return false;
        }
        if (this.isVenomImmune() != other.isVenomImmune()) {
            return false;
        }
        if (this.isCannonImmune() != other.isCannonImmune()) {
            return false;
        }
        if (this.isThrallImmune() != other.isThrallImmune()) {
            return false;
        }
        if (this.isDemon() != other.isDemon()) {
            return false;
        }
        if (this.isDragon() != other.isDragon()) {
            return false;
        }
        if (this.isFiery() != other.isFiery()) {
            return false;
        }
        if (this.isKalphite() != other.isKalphite()) {
            return false;
        }
        if (this.isLeafy() != other.isLeafy()) {
            return false;
        }
        if (this.isShade() != other.isShade()) {
            return false;
        }
        if (this.isSpectral() != other.isSpectral()) {
            return false;
        }
        if (this.isUndead() != other.isUndead()) {
            return false;
        }
        if (this.isVampyre1() != other.isVampyre1()) {
            return false;
        }
        if (this.isVampyre2() != other.isVampyre2()) {
            return false;
        }
        if (this.isVampyre3() != other.isVampyre3()) {
            return false;
        }
        if (this.isXerician() != other.isXerician()) {
            return false;
        }
        if (this.getRespawn() != other.getRespawn()) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$wiki = this.getWiki();
        String other$wiki = other.getWiki();
        return !(this$wiki == null ? other$wiki != null : !this$wiki.equals(other$wiki));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getHitpoints();
        result = result * 59 + this.getCombatLevel();
        result = result * 59 + this.getSlayerLevel();
        result = result * 59 + this.getAttackSpeed();
        result = result * 59 + this.getAttackLevel();
        result = result * 59 + this.getStrengthLevel();
        result = result * 59 + this.getDefenceLevel();
        result = result * 59 + this.getRangeLevel();
        result = result * 59 + this.getMagicLevel();
        result = result * 59 + this.getStab();
        result = result * 59 + this.getSlash();
        result = result * 59 + this.getCrush();
        result = result * 59 + this.getRange();
        result = result * 59 + this.getMagic();
        result = result * 59 + this.getStabDef();
        result = result * 59 + this.getSlashDef();
        result = result * 59 + this.getCrushDef();
        result = result * 59 + this.getRangeDef();
        result = result * 59 + this.getMagicDef();
        result = result * 59 + this.getBonusAttack();
        result = result * 59 + this.getBonusStrength();
        result = result * 59 + this.getBonusRangeStrength();
        result = result * 59 + this.getBonusMagicDamage();
        result = result * 59 + (this.isPoisonImmune() ? 79 : 97);
        result = result * 59 + (this.isVenomImmune() ? 79 : 97);
        result = result * 59 + (this.isCannonImmune() ? 79 : 97);
        result = result * 59 + (this.isThrallImmune() ? 79 : 97);
        result = result * 59 + (this.isDemon() ? 79 : 97);
        result = result * 59 + (this.isDragon() ? 79 : 97);
        result = result * 59 + (this.isFiery() ? 79 : 97);
        result = result * 59 + (this.isKalphite() ? 79 : 97);
        result = result * 59 + (this.isLeafy() ? 79 : 97);
        result = result * 59 + (this.isShade() ? 79 : 97);
        result = result * 59 + (this.isSpectral() ? 79 : 97);
        result = result * 59 + (this.isUndead() ? 79 : 97);
        result = result * 59 + (this.isVampyre1() ? 79 : 97);
        result = result * 59 + (this.isVampyre2() ? 79 : 97);
        result = result * 59 + (this.isVampyre3() ? 79 : 97);
        result = result * 59 + (this.isXerician() ? 79 : 97);
        result = result * 59 + this.getRespawn();
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $wiki = this.getWiki();
        result = result * 59 + ($wiki == null ? 43 : $wiki.hashCode());
        return result;
    }

    public String toString() {
        return "NPCStats(name=" + this.getName() + ", wiki=" + this.getWiki() + ", hitpoints=" + this.getHitpoints() + ", combatLevel=" + this.getCombatLevel() + ", slayerLevel=" + this.getSlayerLevel() + ", attackSpeed=" + this.getAttackSpeed() + ", attackLevel=" + this.getAttackLevel() + ", strengthLevel=" + this.getStrengthLevel() + ", defenceLevel=" + this.getDefenceLevel() + ", rangeLevel=" + this.getRangeLevel() + ", magicLevel=" + this.getMagicLevel() + ", stab=" + this.getStab() + ", slash=" + this.getSlash() + ", crush=" + this.getCrush() + ", range=" + this.getRange() + ", magic=" + this.getMagic() + ", stabDef=" + this.getStabDef() + ", slashDef=" + this.getSlashDef() + ", crushDef=" + this.getCrushDef() + ", rangeDef=" + this.getRangeDef() + ", magicDef=" + this.getMagicDef() + ", bonusAttack=" + this.getBonusAttack() + ", bonusStrength=" + this.getBonusStrength() + ", bonusRangeStrength=" + this.getBonusRangeStrength() + ", bonusMagicDamage=" + this.getBonusMagicDamage() + ", poisonImmune=" + this.isPoisonImmune() + ", venomImmune=" + this.isVenomImmune() + ", cannonImmune=" + this.isCannonImmune() + ", thrallImmune=" + this.isThrallImmune() + ", demon=" + this.isDemon() + ", dragon=" + this.isDragon() + ", fiery=" + this.isFiery() + ", kalphite=" + this.isKalphite() + ", leafy=" + this.isLeafy() + ", shade=" + this.isShade() + ", spectral=" + this.isSpectral() + ", undead=" + this.isUndead() + ", vampyre1=" + this.isVampyre1() + ", vampyre2=" + this.isVampyre2() + ", vampyre3=" + this.isVampyre3() + ", xerician=" + this.isXerician() + ", respawn=" + this.getRespawn() + ")";
    }

    public static class Builder {
        private String name;
        private String wiki;
        private int hitpoints;
        private int combatLevel;
        private int slayerLevel;
        private int attackSpeed;
        private int attackLevel;
        private int strengthLevel;
        private int defenceLevel;
        private int rangeLevel;
        private int magicLevel;
        private int stab;
        private int slash;
        private int crush;
        private int range;
        private int magic;
        private int stabDef;
        private int slashDef;
        private int crushDef;
        private int rangeDef;
        private int magicDef;
        private int bonusAttack;
        private int bonusStrength;
        private int bonusRangeStrength;
        private int bonusMagicDamage;
        private boolean poisonImmune;
        private boolean venomImmune;
        private boolean cannonImmune;
        private boolean thrallImmune;
        private boolean demon;
        private boolean dragon;
        private boolean fiery;
        private boolean kalphite;
        private boolean leafy;
        private boolean shade;
        private boolean spectral;
        private boolean undead;
        private boolean vampyre1;
        private boolean vampyre2;
        private boolean vampyre3;
        private boolean xerician;
        private int respawn;

        Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder wiki(String wiki) {
            this.wiki = wiki;
            return this;
        }

        public Builder hitpoints(int hitpoints) {
            this.hitpoints = hitpoints;
            return this;
        }

        public Builder combatLevel(int combatLevel) {
            this.combatLevel = combatLevel;
            return this;
        }

        public Builder slayerLevel(int slayerLevel) {
            this.slayerLevel = slayerLevel;
            return this;
        }

        public Builder attackSpeed(int attackSpeed) {
            this.attackSpeed = attackSpeed;
            return this;
        }

        public Builder attackLevel(int attackLevel) {
            this.attackLevel = attackLevel;
            return this;
        }

        public Builder strengthLevel(int strengthLevel) {
            this.strengthLevel = strengthLevel;
            return this;
        }

        public Builder defenceLevel(int defenceLevel) {
            this.defenceLevel = defenceLevel;
            return this;
        }

        public Builder rangeLevel(int rangeLevel) {
            this.rangeLevel = rangeLevel;
            return this;
        }

        public Builder magicLevel(int magicLevel) {
            this.magicLevel = magicLevel;
            return this;
        }

        public Builder stab(int stab) {
            this.stab = stab;
            return this;
        }

        public Builder slash(int slash) {
            this.slash = slash;
            return this;
        }

        public Builder crush(int crush) {
            this.crush = crush;
            return this;
        }

        public Builder range(int range) {
            this.range = range;
            return this;
        }

        public Builder magic(int magic) {
            this.magic = magic;
            return this;
        }

        public Builder stabDef(int stabDef) {
            this.stabDef = stabDef;
            return this;
        }

        public Builder slashDef(int slashDef) {
            this.slashDef = slashDef;
            return this;
        }

        public Builder crushDef(int crushDef) {
            this.crushDef = crushDef;
            return this;
        }

        public Builder rangeDef(int rangeDef) {
            this.rangeDef = rangeDef;
            return this;
        }

        public Builder magicDef(int magicDef) {
            this.magicDef = magicDef;
            return this;
        }

        public Builder bonusAttack(int bonusAttack) {
            this.bonusAttack = bonusAttack;
            return this;
        }

        public Builder bonusStrength(int bonusStrength) {
            this.bonusStrength = bonusStrength;
            return this;
        }

        public Builder bonusRangeStrength(int bonusRangeStrength) {
            this.bonusRangeStrength = bonusRangeStrength;
            return this;
        }

        public Builder bonusMagicDamage(int bonusMagicDamage) {
            this.bonusMagicDamage = bonusMagicDamage;
            return this;
        }

        public Builder poisonImmune(boolean poisonImmune) {
            this.poisonImmune = poisonImmune;
            return this;
        }

        public Builder venomImmune(boolean venomImmune) {
            this.venomImmune = venomImmune;
            return this;
        }

        public Builder cannonImmune(boolean cannonImmune) {
            this.cannonImmune = cannonImmune;
            return this;
        }

        public Builder thrallImmune(boolean thrallImmune) {
            this.thrallImmune = thrallImmune;
            return this;
        }

        public Builder demon(boolean demon) {
            this.demon = demon;
            return this;
        }

        public Builder dragon(boolean dragon) {
            this.dragon = dragon;
            return this;
        }

        public Builder fiery(boolean fiery) {
            this.fiery = fiery;
            return this;
        }

        public Builder kalphite(boolean kalphite) {
            this.kalphite = kalphite;
            return this;
        }

        public Builder leafy(boolean leafy) {
            this.leafy = leafy;
            return this;
        }

        public Builder shade(boolean shade) {
            this.shade = shade;
            return this;
        }

        public Builder spectral(boolean spectral) {
            this.spectral = spectral;
            return this;
        }

        public Builder undead(boolean undead) {
            this.undead = undead;
            return this;
        }

        public Builder vampyre1(boolean vampyre1) {
            this.vampyre1 = vampyre1;
            return this;
        }

        public Builder vampyre2(boolean vampyre2) {
            this.vampyre2 = vampyre2;
            return this;
        }

        public Builder vampyre3(boolean vampyre3) {
            this.vampyre3 = vampyre3;
            return this;
        }

        public Builder xerician(boolean xerician) {
            this.xerician = xerician;
            return this;
        }

        public Builder respawn(int respawn) {
            this.respawn = respawn;
            return this;
        }

        public NPCStats build() {
            return new NPCStats(this.name, this.wiki, this.hitpoints, this.combatLevel, this.slayerLevel, this.attackSpeed, this.attackLevel, this.strengthLevel, this.defenceLevel, this.rangeLevel, this.magicLevel, this.stab, this.slash, this.crush, this.range, this.magic, this.stabDef, this.slashDef, this.crushDef, this.rangeDef, this.magicDef, this.bonusAttack, this.bonusStrength, this.bonusRangeStrength, this.bonusMagicDamage, this.poisonImmune, this.venomImmune, this.cannonImmune, this.thrallImmune, this.demon, this.dragon, this.fiery, this.kalphite, this.leafy, this.shade, this.spectral, this.undead, this.vampyre1, this.vampyre2, this.vampyre3, this.xerician, this.respawn);
        }

        public String toString() {
            return "NPCStats.Builder(name=" + this.name + ", wiki=" + this.wiki + ", hitpoints=" + this.hitpoints + ", combatLevel=" + this.combatLevel + ", slayerLevel=" + this.slayerLevel + ", attackSpeed=" + this.attackSpeed + ", attackLevel=" + this.attackLevel + ", strengthLevel=" + this.strengthLevel + ", defenceLevel=" + this.defenceLevel + ", rangeLevel=" + this.rangeLevel + ", magicLevel=" + this.magicLevel + ", stab=" + this.stab + ", slash=" + this.slash + ", crush=" + this.crush + ", range=" + this.range + ", magic=" + this.magic + ", stabDef=" + this.stabDef + ", slashDef=" + this.slashDef + ", crushDef=" + this.crushDef + ", rangeDef=" + this.rangeDef + ", magicDef=" + this.magicDef + ", bonusAttack=" + this.bonusAttack + ", bonusStrength=" + this.bonusStrength + ", bonusRangeStrength=" + this.bonusRangeStrength + ", bonusMagicDamage=" + this.bonusMagicDamage + ", poisonImmune=" + this.poisonImmune + ", venomImmune=" + this.venomImmune + ", cannonImmune=" + this.cannonImmune + ", thrallImmune=" + this.thrallImmune + ", demon=" + this.demon + ", dragon=" + this.dragon + ", fiery=" + this.fiery + ", kalphite=" + this.kalphite + ", leafy=" + this.leafy + ", shade=" + this.shade + ", spectral=" + this.spectral + ", undead=" + this.undead + ", vampyre1=" + this.vampyre1 + ", vampyre2=" + this.vampyre2 + ", vampyre3=" + this.vampyre3 + ", xerician=" + this.xerician + ", respawn=" + this.respawn + ")";
        }
    }
}

