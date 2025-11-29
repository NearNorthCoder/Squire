/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.game.ItemManager
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.ItemManager;

public final class GameEnum24
extends Enum<d> {
    public static final  /* enum */ d WATER;
    public static final  /* enum */ d LAW;
    public static final  /* enum */ d NATURE;
    public static final  /* enum */ d AIR;
    public static final  /* enum */ d CHAOS;
    private final  int runeId;
    private final  b cellType;
    public static final  /* enum */ d EARTH;
    public static final  /* enum */ d FIRE;
    private final  int talismanId;
    private static final  d[] $VALUES;
    public static final  /* enum */ d MIND;
    private final  WorldPoint location;
    public static final  /* enum */ d DEATH;
    private final  int levelRequired;
    public static final  /* enum */ d BLOOD;
    
    public static final  /* enum */ d COSMIC;
    private final  boolean isCatalytic;
    
    private final  int spriteId;
    public static final  /* enum */ d BODY;

    private static void lllllllIIlIIII() {
        llIIlllIIlII = new String[llIIlllIIlIl[75]];
        d.llIIlllIIlII[d.llIIlllIIlIl[0]] = "Guardian of %s";
        d.llIIlllIIlII[d.llIIlllIIlIl[1]] = "AIR";
        d.llIIlllIIlII[d.llIIlllIIlIl[7]] = "MIND";
        d.llIIlllIIlII[d.llIIlllIIlIl[12]] = "WATER";
        d.llIIlllIIlII[d.llIIlllIIlIl[19]] = "EARTH";
        d.llIIlllIIlII[d.llIIlllIIlIl[13]] = "FIRE";
        d.llIIlllIIlII[d.llIIlllIIlIl[30]] = "BODY";
        d.llIIlllIIlII[d.llIIlllIIlIl[37]] = "COSMIC";
        d.llIIlllIIlII[d.llIIlllIIlIl[43]] = "CHAOS";
        d.llIIlllIIlII[d.llIIlllIIlIl[20]] = "NATURE";
        d.llIIlllIIlII[d.llIIlllIIlIl[56]] = "LAW";
        d.llIIlllIIlII[d.llIIlllIIlIl[63]] = "DEATH";
        d.llIIlllIIlII[d.llIIlllIIlIl[69]] = "BLOOD";
    }

    public String U() {
        String string = super.toString();
        return string.charAt(llIIlllIIlIl[0]) + string.substring(llIIlllIIlIl[1]).toLowerCase();
    }

    public boolean Z() {
        return this.isCatalytic;
    }

    public b aa() {
        return this.cellType;
    }

    public BufferedImage b(ItemManager itemManager) {
        return itemManager.getImage(this.talismanId);
    }

    public String T() {
        Object[] objectArray = new Object[llIIlllIIlIl[1]];
        objectArray[d.llIIlllIIlIl[0]] = this.U();
        return String.format(llIIlllIIlII[llIIlllIIlIl[0]], objectArray);
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int W() {
        return this.runeId;
    }

    private static boolean lllllllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int Y() {
        return this.spriteId;
    }

    public int X() {
        return this.talismanId;
    }

    static {
        d.lllllllIIlIIIl();
        d.lllllllIIlIIII();
        AIR = new GameEnum24(llIIlllIIlIl[1], llIIlllIIlIl[2], llIIlllIIlIl[3], llIIlllIIlIl[4], llIIlllIIlIl[0], b.WEAK, new WorldPoint(llIIlllIIlIl[5], llIIlllIIlIl[6], llIIlllIIlIl[0]));
        MIND = new GameEnum24(llIIlllIIlIl[7], llIIlllIIlIl[8], llIIlllIIlIl[9], llIIlllIIlIl[10], llIIlllIIlIl[1], b.WEAK, new WorldPoint(llIIlllIIlIl[11], llIIlllIIlIl[6], llIIlllIIlIl[0]));
        WATER = new GameEnum24(llIIlllIIlIl[13], llIIlllIIlIl[14], llIIlllIIlIl[15], llIIlllIIlIl[16], llIIlllIIlIl[0], b.MEDIUM, new WorldPoint(llIIlllIIlIl[17], llIIlllIIlIl[18], llIIlllIIlIl[0]));
        EARTH = new GameEnum24(llIIlllIIlIl[20], llIIlllIIlIl[21], llIIlllIIlIl[22], llIIlllIIlIl[23], llIIlllIIlIl[0], b.STRONG, new WorldPoint(llIIlllIIlIl[17], llIIlllIIlIl[24], llIIlllIIlIl[0]));
        FIRE = new GameEnum24(llIIlllIIlIl[25], llIIlllIIlIl[26], llIIlllIIlIl[27], llIIlllIIlIl[28], llIIlllIIlIl[0], b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[5], llIIlllIIlIl[29], llIIlllIIlIl[0]));
        BODY = new GameEnum24(llIIlllIIlIl[31], llIIlllIIlIl[32], llIIlllIIlIl[33], llIIlllIIlIl[34], llIIlllIIlIl[1], b.WEAK, new WorldPoint(llIIlllIIlIl[35], llIIlllIIlIl[36], llIIlllIIlIl[0]));
        COSMIC = new GameEnum24(llIIlllIIlIl[38], llIIlllIIlIl[39], llIIlllIIlIl[40], llIIlllIIlIl[41], llIIlllIIlIl[1], b.MEDIUM, new WorldPoint(llIIlllIIlIl[42], llIIlllIIlIl[36], llIIlllIIlIl[0]));
        CHAOS = new GameEnum24(llIIlllIIlIl[44], llIIlllIIlIl[45], llIIlllIIlIl[46], llIIlllIIlIl[47], llIIlllIIlIl[1], b.MEDIUM, new WorldPoint(llIIlllIIlIl[48], llIIlllIIlIl[49], llIIlllIIlIl[0]));
        NATURE = new GameEnum24(llIIlllIIlIl[50], llIIlllIIlIl[51], llIIlllIIlIl[52], llIIlllIIlIl[53], llIIlllIIlIl[1], b.STRONG, new WorldPoint(llIIlllIIlIl[54], llIIlllIIlIl[55], llIIlllIIlIl[0]));
        LAW = new GameEnum24(llIIlllIIlIl[57], llIIlllIIlIl[58], llIIlllIIlIl[59], llIIlllIIlIl[60], llIIlllIIlIl[1], b.STRONG, new WorldPoint(llIIlllIIlIl[61], llIIlllIIlIl[62], llIIlllIIlIl[0]));
        DEATH = new GameEnum24(llIIlllIIlIl[64], llIIlllIIlIl[65], llIIlllIIlIl[66], llIIlllIIlIl[67], llIIlllIIlIl[1], b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[48], llIIlllIIlIl[68], llIIlllIIlIl[0]));
        BLOOD = new GameEnum24(llIIlllIIlIl[70], llIIlllIIlIl[71], llIIlllIIlIl[72], llIIlllIIlIl[73], llIIlllIIlIl[1], b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[74], llIIlllIIlIl[29], llIIlllIIlIl[0]));
        d[] dArray = new d[llIIlllIIlIl[69]];
        dArray[d.llIIlllIIlIl[0]] = AIR;
        dArray[d.llIIlllIIlIl[1]] = MIND;
        dArray[d.llIIlllIIlIl[7]] = WATER;
        dArray[d.llIIlllIIlIl[12]] = EARTH;
        dArray[d.llIIlllIIlIl[19]] = FIRE;
        dArray[d.llIIlllIIlIl[13]] = BODY;
        dArray[d.llIIlllIIlIl[30]] = COSMIC;
        dArray[d.llIIlllIIlIl[37]] = CHAOS;
        dArray[d.llIIlllIIlIl[43]] = NATURE;
        dArray[d.llIIlllIIlIl[20]] = LAW;
        dArray[d.llIIlllIIlIl[56]] = DEATH;
        dArray[d.llIIlllIIlIl[63]] = BLOOD;
        $VALUES = dArray;
    }

    public WorldPoint ab() {
        return this.location;
    }

    public int V() {
        return this.levelRequired;
    }

    private GameEnum24(int n3, int n4, int n5, int n6, boolean bl, b b2, WorldPoint worldPoint) {
        this.levelRequired = n3;
        this.runeId = n4;
        this.talismanId = n5;
        this.spriteId = n6;
        this.isCatalytic = bl;
        this.cellType = b2;
        this.location = worldPoint;
    }

    public BufferedImage a(ItemManager itemManager) {
        return itemManager.getImage(this.runeId);
    }

        return String.valueOf(var1);
    }
}

