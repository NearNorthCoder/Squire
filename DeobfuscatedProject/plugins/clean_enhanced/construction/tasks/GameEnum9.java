/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.construction.tasks;

import java.awt.Color;
import net.runelite.api.Skill;

public final class GameEnum9
extends Enum<i> {
    private static  String[] lIllIIIlI;
    public static final  /* enum */ i GHOSTS;
    private final  Color textColor;
    private final  Skill type;
    public static final  /* enum */ i TRIPLE;
    public static final  /* enum */ i LAVA;
    public static final  /* enum */ i AUTO;
    private static  int[] lIllIIIll;
    private static final  i[] $VALUES;
    private final  int tickDelay;
    public static final  /* enum */ i SPAWNING;

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    public int S() {
        return this.tickDelay;
    }

    public String toString() {
        return "Phase{type=" + this.type + ", tickDelay=" + this.tickDelay + ", textColor=" + this.textColor + "}";
    }

    public Color T() {
        return this.textColor;
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public Skill L() {
        return this.type;
    }

    private GameEnum9(Skill skill, int n3, Color color) {
        this.type = skill;
        this.tickDelay = n3;
        this.textColor = color;
    }

    private static void var7() {
        lIllIIIll = new int[11];
        i.lIllIIIll[0] = (0x40 ^ 0x6C) & ~(0x49 ^ 0x65);
        i.lIllIIIll[1] = 118 + 172 - 262 + 153 ^ 38 + 142 - 47 + 44;
        i.lIllIIIll[2] = 1;
        i.lIllIIIll[3] = 0xA1 ^ 0xC0 ^ (0x7E ^ 0x19);
        i.lIllIIIll[4] = 2;
        i.lIllIIIll[5] = 16 + 74 - 73 + 136;
        i.lIllIIIll[6] = 7 + 131 - 1 + 16 + (0x6B ^ 0x72) - -(0x4D ^ 0x53) + (0x67 ^ 0x61);
        i.lIllIIIll[7] = 235 + 144 - 364 + 240;
        i.lIllIIIll[8] = 3;
        i.lIllIIIll[9] = 0x2E ^ 0x26;
        i.lIllIIIll[10] = 0xBF ^ 0xBA;
    }

    private static void var8() {
        lIllIIIlI = new String[lIllIIIll[10]];
        i.lIllIIIlI[i.lIllIIIll[0]] = "SPAWNING";
        i.lIllIIIlI[i.lIllIIIll[2]] = "AUTO";
        i.lIllIIIlI[i.lIllIIIll[4]] = "TRIPLE";
        i.lIllIIIlI[i.lIllIIIll[8]] = "GHOSTS";
        i.lIllIIIlI[i.lIllIIIll[1]] = "LAVA";
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

