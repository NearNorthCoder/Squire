/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.construction.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum15
extends Enum<aW> {
    private final  int level;
    public static final  /* enum */ aW FALADOR;
    public static final  /* enum */ aW PROGRESSIVE;
    public static final  /* enum */ aW CAMELOT;
    private final  Spell spell;
    private static final  aW[] $VALUES;
    public static final  /* enum */ aW LUMBRIDGE;
    private static  String[] lIllIIlI;
    public static final  /* enum */ aW VARROCK;
    private static  int[] lIllIIll;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    private static void var2() {
        lIllIIll = new int[11];
        aW.lIllIIll[0] = 1;
        aW.lIllIIll[1] = (0x86 ^ 0xB1) & ~(0x83 ^ 0xB4);
        aW.lIllIIll[2] = 143 + 41 - 24 + 3 ^ 31 + 53 - -11 + 91;
        aW.lIllIIll[3] = 0x65 ^ 0x7A;
        aW.lIllIIll[4] = 2;
        aW.lIllIIll[5] = 0x47 ^ 0x62;
        aW.lIllIIll[6] = 3;
        aW.lIllIIll[7] = 0xE9 ^ 0xC4;
        aW.lIllIIll[8] = 0x7B ^ 0x7F;
        aW.lIllIIll[9] = 0x6D ^ 0x68;
        aW.lIllIIll[10] = 78 + 180 - 170 + 115 ^ 109 + 139 - 110 + 57;
    }

    public Spell co() {
        return this.spell;
    }

    public static aW[] values() {
        return (aW[])$VALUES.clone();
    }

    private static boolean var3(int n2, int n3) {
        return n2 >= n3;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = lIllIIll[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = lIllIIll[1];
        while (aW.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((9 ^ 0x10) & ~(0xBC ^ 0xA5)) >= -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private GameEnum15(Spell spell, int n3) {
        this.spell = spell;
        this.level = this.cp();
    }

    public boolean cn() {
        int n2;
        if (aW.var3(Skills.getBoostedLevel((SkiSkill.MAGIC), this.level) && aW.var1(this.spell.canCast() ? 1 : 0)) {
            n2 = lIllIIll[0];
            0;
            if (3 > 3) {
                return (((0xE5 ^ 0xC4) & ~(0x31 ^ 0x10) ^ (0x1A ^ 0x57)) & (0x87 ^ 0x8E ^ (0xC9 ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIll[1];
        }
        return n2 != 0;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public int cp() {
        return this.level;
    }

    private static void var4() {
        lIllIIlI = new String[lIllIIll[9]];
        aW.lIllIIlI[aW.lIllIIll[1]] = "VARROCK";
        aW.lIllIIlI[aW.lIllIIll[0]] = "LUMBRIDGE";
        aW.lIllIIlI[aW.lIllIIll[4]] = "FALADOR";
        aW.lIllIIlI[aW.lIllIIll[6]] = "CAMELOT";
        aW.lIllIIlI[aW.lIllIIll[8]] = "PROGRESSIVE";
    }

    public static aW valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }
}

