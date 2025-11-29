/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i BARK;
    public static final  /* enum */ i HERB;
    
    public static final  /* enum */ i ORE;
    public static final  /* enum */ i FISH;
    private final  int normalToolId;
    private final  int corruptedToolId;
    public static final  /* enum */ i WOOL;
    private final  int normalObjectId;
    
    public static final  /* enum */ i CRYSTAL_ORB;
    public static final  /* enum */ i CRYSTALLINE_BOWSTRING;
    private final  int corruptedObjectId;
    private static final  i[] $VALUES;
    public static final  /* enum */ i CRYSTAL_SHARD;
    private final  int normalItemId;
    private final  int corruptedItemId;
    public static final  /* enum */ i CRYSTAL_DUST;
    public static final  /* enum */ i WEAPON_FRAME;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    public List<Integer> aA() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(int n3, int n4, int n5, int n6, int n7, int n8) {
        this.normalToolId = n3;
        this.normalItemId = n4;
        this.normalObjectId = n5;
        this.corruptedToolId = n6;
        this.corruptedItemId = n7;
        this.corruptedObjectId = n8;
    }

        return String.valueOf(var1);
    }

    private static void llllllIIlIllll() {
        llIIllIIIIlI = new String[llIIllIIIIll[46]];
        i.llIIllIIIIlI[i.llIIllIIIIll[2]] = "ORE";
        i.llIIllIIIIlI[i.llIIllIIIIll[1]] = "HERB";
        i.llIIllIIIIlI[i.llIIllIIIIll[3]] = "WOOL";
        i.llIIllIIIIlI[i.llIIllIIIIll[18]] = "BARK";
        i.llIIllIIIIlI[i.llIIllIIIIll[25]] = "FISH";
        i.llIIllIIIIlI[i.llIIllIIIIll[31]] = "CRYSTAL_SHARD";
        i.llIIllIIIIlI[i.llIIllIIIIll[34]] = "CRYSTAL_DUST";
        i.llIIllIIIIlI[i.llIIllIIIIll[37]] = "WEAPON_FRAME";
        i.llIIllIIIIlI[i.llIIllIIIIll[40]] = "CRYSTAL_ORB";
        i.llIIllIIIIlI[i.llIIllIIIIll[43]] = "CRYSTALLINE_BOWSTRING";
    }

    private static boolean llllllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int aC() {
        return Inventory.getCount((boolean)llIIllIIIIll[1], (int[])this.aB());
    }

    public List<Integer> ay() {
        return List.of(Integer.valueOf(this.normalToolId), Integer.valueOf(this.corruptedToolId));
    }

    static {
        i.llllllIIllIIII();
        i.llllllIIlIllll();
        ORE = new GameEnum(llIIllIIIIll[4], llIIllIIIIll[5], llIIllIIIIll[6], llIIllIIIIll[7], llIIllIIIIll[8], llIIllIIIIll[9]);
        HERB = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[10], llIIllIIIIll[11], llIIllIIIIll[0], llIIllIIIIll[12], llIIllIIIIll[13]);
        WOOL = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[14], llIIllIIIIll[15], llIIllIIIIll[0], llIIllIIIIll[16], llIIllIIIIll[17]);
        BARK = new GameEnum(llIIllIIIIll[19], llIIllIIIIll[20], llIIllIIIIll[21], llIIllIIIIll[22], llIIllIIIIll[23], llIIllIIIIll[24]);
        FISH = new GameEnum(llIIllIIIIll[26], llIIllIIIIll[27], llIIllIIIIll[28], llIIllIIIIll[29], llIIllIIIIll[27], llIIllIIIIll[30]);
        CRYSTAL_SHARD = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[32], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[33], llIIllIIIIll[0]);
        CRYSTAL_DUST = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[35], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[36], llIIllIIIIll[0]);
        WEAPON_FRAME = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[38], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[39], llIIllIIIIll[0]);
        CRYSTAL_ORB = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[41], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[42], llIIllIIIIll[0]);
        CRYSTALLINE_BOWSTRING = new GameEnum(llIIllIIIIll[0], llIIllIIIIll[44], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[45], llIIllIIIIll[0]);
        i[] iArray = new i[llIIllIIIIll[46]];
        iArray[i.llIIllIIIIll[2]] = ORE;
        iArray[i.llIIllIIIIll[1]] = HERB;
        iArray[i.llIIllIIIIll[3]] = WOOL;
        iArray[i.llIIllIIIIll[18]] = BARK;
        iArray[i.llIIllIIIIll[25]] = FISH;
        iArray[i.llIIllIIIIll[31]] = CRYSTAL_SHARD;
        iArray[i.llIIllIIIIll[34]] = CRYSTAL_DUST;
        iArray[i.llIIllIIIIll[37]] = WEAPON_FRAME;
        iArray[i.llIIllIIIIll[40]] = CRYSTAL_ORB;
        iArray[i.llIIllIIIIll[43]] = CRYSTALLINE_BOWSTRING;
        $VALUES = iArray;
    }

    public boolean ax() {
        boolean bl;
        if (i.llllllIIllIIIl(this.normalToolId, llIIllIIIIll[0])) {
            bl = llIIllIIIIll[1];

            if (3 != 3) {
                return false;
            }
        } else {
            bl = llIIllIIIIll[2];
        }
        return bl;
    }

    public int[] aB() {
        int[] nArray = new int[llIIllIIIIll[3]];
        nArray[i.llIIllIIIIll[2]] = this.normalItemId;
        nArray[i.llIIllIIIIll[1]] = this.corruptedItemId;
        return nArray;
    }

    private static boolean llllllIIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    public List<Integer> az() {
        return List.of(Integer.valueOf(this.normalObjectId), Integer.valueOf(this.corruptedObjectId));
    }
}

