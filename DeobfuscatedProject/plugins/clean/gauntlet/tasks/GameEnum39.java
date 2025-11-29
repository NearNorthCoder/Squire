/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gauntlet.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GameEnum;

public final class GameEnum39
extends Enum<f> {
    public static final  /* enum */ f TIER_1_LEGS;
    public static final  /* enum */ f TIER_2_BOW;
    
    public static final  /* enum */ f TIER_1_BOW;
    public static final  /* enum */ f TIER_1_STAFF;
    private final  int normalItemId;
    public static final  /* enum */ f TIER_2_STAFF;
    public static final  /* enum */ f TIER_3_STAFF;
    private final  Map<i, Integer> resourceList;
    public static final  /* enum */ f TIER_1_HELM;
    private final  String normalItemName;
    private static final  f[] $VALUES;
    private final  int corruptedItemId;
    public static final  /* enum */ f TIER_1_BODY;
    public static final  /* enum */ f TELEPORT_CRYSTAL;
    private final  f upgradesFrom;
    
    private final  String corruptedItemName;
    public static final  /* enum */ f VIAL;
    public static final  /* enum */ f TIER_3_BOW;

    static {
        f.llllllIIllIIll();
        f.llllllIIIllIII();
        VIAL = new GameEnum39(llIIlIllllIl[llIIlIlllllI[2]], llIIlIlllllI[3], llIIlIllllIl[llIIlIlllllI[0]], llIIlIlllllI[3], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[4]));
        TELEPORT_CRYSTAL = new GameEnum39(llIIlIllllIl[llIIlIlllllI[6]], llIIlIlllllI[7], llIIlIllllIl[llIIlIlllllI[8]], llIIlIlllllI[9], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10]));
        TIER_1_STAFF = new GameEnum39(llIIlIllllIl[llIIlIlllllI[12]], llIIlIlllllI[13], llIIlIllllIl[llIIlIlllllI[14]], llIIlIlllllI[15], null, Map.of(i.WEAPON_FRAME, llIIlIlllllI[2], i.CRYSTAL_SHARD, llIIlIlllllI[16]));
        TIER_2_STAFF = new GameEnum39(llIIlIllllIl[llIIlIlllllI[4]], llIIlIlllllI[18], llIIlIllllIl[llIIlIlllllI[19]], llIIlIlllllI[20], TIER_1_STAFF, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[21]));
        TIER_3_STAFF = new GameEnum39(llIIlIllllIl[llIIlIlllllI[23]], llIIlIlllllI[24], llIIlIllllIl[llIIlIlllllI[25]], llIIlIlllllI[26], TIER_2_STAFF, Map.of(i.CRYSTAL_ORB, llIIlIlllllI[2]));
        TIER_1_BOW = new GameEnum39(llIIlIllllIl[llIIlIlllllI[28]], llIIlIlllllI[29], llIIlIllllIl[llIIlIlllllI[30]], llIIlIlllllI[31], null, Map.of(i.WEAPON_FRAME, llIIlIlllllI[2], i.CRYSTAL_SHARD, llIIlIlllllI[16]));
        TIER_2_BOW = new GameEnum39(llIIlIllllIl[llIIlIlllllI[33]], llIIlIlllllI[34], llIIlIllllIl[llIIlIlllllI[16]], llIIlIlllllI[35], TIER_1_BOW, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[21]));
        TIER_3_BOW = new GameEnum39(llIIlIllllIl[llIIlIlllllI[37]], llIIlIlllllI[38], llIIlIllllIl[llIIlIlllllI[39]], llIIlIlllllI[40], TIER_2_BOW, Map.of(i.CRYSTALLINE_BOWSTRING, llIIlIlllllI[2]));
        TIER_1_HELM = new GameEnum39(llIIlIllllIl[llIIlIlllllI[42]], llIIlIlllllI[43], llIIlIllllIl[llIIlIlllllI[44]], llIIlIlllllI[45], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10], i.BARK, llIIlIlllllI[2], i.ORE, llIIlIlllllI[2], i.WOOL, llIIlIlllllI[2]));
        TIER_1_BODY = new GameEnum39(llIIlIllllIl[llIIlIlllllI[47]], llIIlIlllllI[48], llIIlIllllIl[llIIlIlllllI[49]], llIIlIlllllI[50], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10], i.BARK, llIIlIlllllI[2], i.ORE, llIIlIlllllI[2], i.WOOL, llIIlIlllllI[2]));
        TIER_1_LEGS = new GameEnum39(llIIlIllllIl[llIIlIlllllI[52]], llIIlIlllllI[53], llIIlIllllIl[llIIlIlllllI[54]], llIIlIlllllI[55], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10], i.BARK, llIIlIlllllI[2], i.ORE, llIIlIlllllI[2], i.WOOL, llIIlIlllllI[2]));
        f[] fArray = new f[llIIlIlllllI[19]];
        fArray[f.llIIlIlllllI[1]] = VIAL;
        fArray[f.llIIlIlllllI[2]] = TELEPORT_CRYSTAL;
        fArray[f.llIIlIlllllI[0]] = TIER_1_STAFF;
        fArray[f.llIIlIlllllI[5]] = TIER_2_STAFF;
        fArray[f.llIIlIlllllI[6]] = TIER_3_STAFF;
        fArray[f.llIIlIlllllI[8]] = TIER_1_BOW;
        fArray[f.llIIlIlllllI[11]] = TIER_2_BOW;
        fArray[f.llIIlIlllllI[12]] = TIER_3_BOW;
        fArray[f.llIIlIlllllI[14]] = TIER_1_HELM;
        fArray[f.llIIlIlllllI[17]] = TIER_1_BODY;
        fArray[f.llIIlIlllllI[4]] = TIER_1_LEGS;
        $VALUES = fArray;
    }

        return String.valueOf(var1);
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum39.class, string);
    }

    public int[] ad() {
        int[] nArray = new int[llIIlIlllllI[0]];
        nArray[f.llIIlIlllllI[1]] = this.normalItemId;
        nArray[f.llIIlIlllllI[2]] = this.corruptedItemId;
        return nArray;
    }

    public List<String> ae() {
        return List.of(this.normalItemName, this.corruptedItemName);
    }

    private static boolean llllllIIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public Map<i, Integer> ag() {
        return this.resourceList;
    }

    private static void llllllIIIllIII() {
        llIIlIllllIl = new String[llIIlIlllllI[56]];
        f.llIIlIllllIl[f.llIIlIlllllI[1]] = "VIAL";
        f.llIIlIllllIl[f.llIIlIlllllI[2]] = "Vial";
        f.llIIlIllllIl[f.llIIlIlllllI[0]] = "Vial";
        f.llIIlIllllIl[f.llIIlIlllllI[5]] = "TELEPORT_CRYSTAL";
        f.llIIlIllllIl[f.llIIlIlllllI[6]] = "Teleport crystal";
        f.llIIlIllllIl[f.llIIlIlllllI[8]] = "Corrupted teleport crystal";
        f.llIIlIllllIl[f.llIIlIlllllI[11]] = "TIER_1_STAFF";
        f.llIIlIllllIl[f.llIIlIlllllI[12]] = "Crystal staff (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[14]] = "Corrupted staff (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[17]] = "TIER_2_STAFF";
        f.llIIlIllllIl[f.llIIlIlllllI[4]] = "Crystal staff (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[19]] = "Corrupted staff (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[22]] = "TIER_3_STAFF";
        f.llIIlIllllIl[f.llIIlIlllllI[23]] = "Crystal staff (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[25]] = "Corrupted staff (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[27]] = "TIER_1_BOW";
        f.llIIlIllllIl[f.llIIlIlllllI[28]] = "Crystal bow (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[30]] = "Corrupted bow (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[32]] = "TIER_2_BOW";
        f.llIIlIllllIl[f.llIIlIlllllI[33]] = "Crystal bow (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[16]] = "Corrupted bow (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[36]] = "TIER_3_BOW";
        f.llIIlIllllIl[f.llIIlIlllllI[37]] = "Crystal bow (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[39]] = "Corrupted bow (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[41]] = "TIER_1_HELM";
        f.llIIlIllllIl[f.llIIlIlllllI[42]] = "Crystal helm (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[44]] = "Corrupted helm (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[46]] = "TIER_1_BODY";
        f.llIIlIllllIl[f.llIIlIlllllI[47]] = "Crystal body (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[49]] = "Corrupted body (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[51]] = "TIER_1_LEGS";
        f.llIIlIllllIl[f.llIIlIlllllI[52]] = "Crystal legs (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[54]] = "Corrupted legs (basic)";
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public f af() {
        return this.upgradesFrom;
    }

    private GameEnum39(String string2, int n3, String string3, int n4, f f2, Map<i, Integer> map) {
        this.normalItemName = string2;
        this.normalItemId = n3;
        this.corruptedItemName = string3;
        this.corruptedItemId = n4;
        this.upgradesFrom = f2;
        this.resourceList = map;
    }

    public List<Integer> ac() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

}

