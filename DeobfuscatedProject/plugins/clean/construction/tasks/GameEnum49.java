/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.construction.tasks;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;

public final class GameEnum49
extends Enum<i> {
    
    public static final  /* enum */ i GHOSTS;
    private final  Color textColor;
    private final  Skill type;
    public static final  /* enum */ i TRIPLE;
    public static final  /* enum */ i LAVA;
    public static final  /* enum */ i AUTO;
    
    private static final  i[] $VALUES;
    private final  int tickDelay;
    public static final  /* enum */ i SPAWNING;

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum49.class, string);
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

    static {
        i.lIIlllIIIIl();
        i.lIIlllIIIII();
        SPAWNING = new GameEnum49(null, lIllIIIll[1], null);
        AUTO = new GameEnum49(Skill.ATTACK, lIllIIIll[3], null);
        TRIPLE = new GameEnum49(Skill.FLETCHING, lIllIIIll[3], new Color(lIllIIIll[5], lIllIIIll[6], lIllIIIll[7]));
        GHOSTS = new GameEnum49(Skill.PRAYER, lIllIIIll[9], new Color(lIllIIIll[7], lIllIIIll[7], lIllIIIll[7]));
        LAVA = new GameEnum49(Skill.FIREMAKING, lIllIIIll[9], new Color(lIllIIIll[7], lIllIIIll[5], lIllIIIll[5]));
        i[] iArray = new i[lIllIIIll[10]];
        iArray[i.lIllIIIll[0]] = SPAWNING;
        iArray[i.lIllIIIll[2]] = AUTO;
        iArray[i.lIllIIIll[4]] = TRIPLE;
        iArray[i.lIllIIIll[8]] = GHOSTS;
        iArray[i.lIllIIIll[1]] = LAVA;
        $VALUES = iArray;
    }

    public Skill L() {
        return this.type;
    }

    private GameEnum49(Skill skill, int n3, Color color) {
        this.type = skill;
        this.tickDelay = n3;
        this.textColor = color;
    }

    private static void lIIlllIIIII() {
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

}

