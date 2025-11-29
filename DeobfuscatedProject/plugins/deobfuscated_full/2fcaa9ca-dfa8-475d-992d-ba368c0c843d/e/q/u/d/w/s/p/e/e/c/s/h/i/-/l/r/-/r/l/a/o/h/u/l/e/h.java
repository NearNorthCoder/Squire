/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.client.util.Log;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;

public final class h
extends Enum<h> {
    private /* synthetic */ Supplier<WorldArea> area;
    public static final /* synthetic */ /* enum */ h FLOOR_IV;
    private static /* synthetic */ int[] lllIIIlIllll;
    public static final /* synthetic */ /* enum */ h FLOOR_II;
    public static final /* synthetic */ /* enum */ h FLOOR_I;
    public static final /* synthetic */ /* enum */ h FLOOR_V;
    private static /* synthetic */ String[] lllIIIlIllIl;
    private /* synthetic */ int nextReq;
    public static final /* synthetic */ /* enum */ h FLOOR_III;
    private static final /* synthetic */ h[] $VALUES;

    private static void lIIIlIIlIIlllll() {
        lllIIIlIllll = new int[30];
        h.lllIIIlIllll[0] = 2 & ~2;
        h.lllIIIlIllll[1] = 1;
        h.lllIIIlIllll[2] = 85 + 105 - 140 + 188 ^ 24 + 121 - 113 + 158;
        h.lllIIIlIllll[3] = 2;
        h.lllIIIlIllll[4] = 3;
        h.lllIIIlIllll[5] = 0x5A ^ 0x6C ^ (0xAD ^ 0x9F);
        h.lllIIIlIllll[6] = 0xE ^ 0x43 ^ (0xD3 ^ 0x9B);
        h.lllIIIlIllll[7] = 0xE8 ^ 0xC1 ^ (0x59 ^ 0x76);
        h.lllIIIlIllll[8] = 0x74 ^ 0x73;
        h.lllIIIlIllll[9] = 0xF3 ^ 0xA7 ^ (0x65 ^ 0x39);
        h.lllIIIlIllll[10] = 0x1D ^ 0x26 ^ (0x8D ^ 0xBF);
        h.lllIIIlIllll[11] = 0x33 ^ 0x39;
        h.lllIIIlIllll[12] = 0x3B ^ 0x30;
        h.lllIIIlIllll[13] = 0x27 ^ 0x49 ^ (0x51 ^ 0x24);
        h.lllIIIlIllll[14] = 0x4B ^ 0x75;
        h.lllIIIlIllll[15] = 2 + 52 - -94 + 35 ^ 13 + 126 - 95 + 143;
        h.lllIIIlIllll[16] = 0x15 ^ 0x23 ^ (0xD0 ^ 0xAE);
        h.lllIIIlIllll[17] = 0x63 ^ 0x6E;
        h.lllIIIlIllll[18] = 0x65 ^ 0x47;
        h.lllIIIlIllll[19] = 0xB4 ^ 0x93 ^ (0x7D ^ 8);
        h.lllIIIlIllll[20] = 0x12 ^ 0x1C;
        h.lllIIIlIllll[21] = 111 + 95 - 127 + 77 ^ 47 + 113 - 79 + 52;
        h.lllIIIlIllll[22] = 0x8B ^ 0xC3 ^ (0x4E ^ 0x13);
        h.lllIIIlIllll[23] = 0xA3 ^ 0xAC;
        h.lllIIIlIllll[24] = 0x10 ^ 3;
        h.lllIIIlIllll[25] = 0xCF ^ 0x93;
        h.lllIIIlIllll[26] = 103 + 24 - 35 + 71 ^ 161 + 133 - 108 + 3;
        h.lllIIIlIllll[27] = 99 + 78 - 113 + 75 ^ 118 + 58 - 61 + 55;
        h.lllIIIlIllll[28] = 0x8B ^ 0x82 ^ (0xE1 ^ 0x86);
        h.lllIIIlIllll[29] = 0x4A ^ 0x43 ^ (0x6B ^ 0x72);
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private static String lIIIlIIlIIllIlI(String var6, String var12) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lllIIIlIllll[9]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lllIIIlIllll[3], var10);
            return new String(var14.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J() {
        void var3_3;
        void var22;
        h var16;
        Player player = Players.getLocal();
        if (h.lIIIlIIlIlIIIII(player)) {
            return lllIIIlIllll[0];
        }
        if (h.lIIIlIIlIlIIIIl(var16.a((Locatable)var22) ? 1 : 0)) {
            return lllIIIlIllll[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIIIlIIlIlIIIll(tileObject.getName().toLowerCase().startsWith(lllIIIlIllIl[lllIIIlIllll[9]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIlIllll[1]];
                stringArray[h.lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[10]];
                if (h.lIIIlIIlIlIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIIlIllll[1]];
                    stringArray2[h.lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[11]];
                    if (h.lIIIlIIlIlIIIll(tileObject.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = lllIIIlIllll[1];
                        0;
                        if (-2 < 0) return n2 != 0;
                        return (1 & ~1) != 0;
                    }
                }
            }
            n2 = lllIIIlIllll[0];
            return n2 != 0;
        });
        if (h.lIIIlIIlIlIIIII(var3)) {
            Log.error((String)lllIIIlIllIl[lllIIIlIllll[0]]);
            return lllIIIlIllll[0];
        }
        if (h.lIIIlIIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), var16.nextReq)) {
            var3.interact(lllIIIlIllIl[lllIIIlIllll[1]]);
            return lllIIIlIllll[1];
        }
        if (h.lIIIlIIlIlIIIlI(Movement.getRunEnergy(), lllIIIlIllll[2])) {
            var3.interact(lllIIIlIllIl[lllIIIlIllll[3]]);
            return lllIIIlIllll[1];
        }
        TileObject var20 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIIIlIIlIlIIIll(tileObject.getName().startsWith(lllIIIlIllIl[lllIIIlIllll[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIlIllll[1]];
                stringArray[h.lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[8]];
                if (h.lIIIlIIlIlIIIll(tileObject.hasAction(stringArray) ? 1 : 0) && h.lIIIlIIlIlIIIll(this.area.get().contains((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lllIIIlIllll[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x14 ^ 0x28 ^ (0x2D ^ 0x18)) & (67 + 0 - 59 + 125 ^ 123 + 16 - 33 + 34 ^ -1)) != 0;
                }
            }
            n2 = lllIIIlIllll[0];
            return n2 != 0;
        });
        if (h.lIIIlIIlIlIIIII(var20)) {
            var3.interact(lllIIIlIllIl[lllIIIlIllll[4]]);
            System.out.println(lllIIIlIllIl[lllIIIlIllll[5]]);
            return lllIIIlIllll[0];
        }
        var3_3.interact(lllIIIlIllIl[lllIIIlIllll[6]]);
        return lllIIIlIllll[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.area.get()));
        squireSepulchre.a(this.name());
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIIIlIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    static {
        h.lIIIlIIlIIlllll();
        h.lIIIlIIlIIlllIl();
        FLOOR_I = new h(new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[13], lllIIIlIllll[1], b.C), lllIIIlIllll[12], lllIIIlIllll[12], lllIIIlIllll[14]);
        FLOOR_II = new h(new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[13], lllIIIlIllll[1], b.G), lllIIIlIllll[12], lllIIIlIllll[12], lllIIIlIllll[16]);
        FLOOR_III = new h(new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[18], lllIIIlIllll[1], b.J), lllIIIlIllll[12], lllIIIlIllll[5], lllIIIlIllll[19]);
        FLOOR_IV = new h(new RegionPoint(lllIIIlIllll[21], lllIIIlIllll[22], lllIIIlIllll[1], b.L), lllIIIlIllll[23], lllIIIlIllll[24], lllIIIlIllll[25]);
        FLOOR_V = new h(new RegionPoint(lllIIIlIllll[26], lllIIIlIllll[27], lllIIIlIllll[0], b.N), lllIIIlIllll[6], lllIIIlIllll[5], lllIIIlIllll[28]);
        h[] hArray = new h[lllIIIlIllll[6]];
        hArray[h.lllIIIlIllll[0]] = FLOOR_I;
        hArray[h.lllIIIlIllll[1]] = FLOOR_II;
        hArray[h.lllIIIlIllll[3]] = FLOOR_III;
        hArray[h.lllIIIlIllll[4]] = FLOOR_IV;
        hArray[h.lllIIIlIllll[5]] = FLOOR_V;
        $VALUES = hArray;
    }

    private static boolean lIIIlIIlIlIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIIIlIIlIIlllIl() {
        lllIIIlIllIl = new String[lllIIIlIllll[29]];
        h.lllIIIlIllIl[h.lllIIIlIllll[0]] = h."obelisk is null";
        h.lllIIIlIllIl[h.lllIIIlIllll[1]] = h."Quick-exit";
        h.lllIIIlIllIl[h.lllIIIlIllll[3]] = h."Activate";
        h.lllIIIlIllIl[h.lllIIIlIllll[4]] = h."Quick-exit";
        h.lllIIIlIllIl[h.lllIIIlIllll[5]] = h."we null";
        h.lllIIIlIllIl[h.lllIIIlIllll[6]] = h."Climb-down";
        h.lllIIIlIllIl[h.lllIIIlIllll[7]] = h."Stairs";
        h.lllIIIlIllIl[h.lllIIIlIllll[8]] = h."Climb-down";
        h.lllIIIlIllIl[h.lllIIIlIllll[9]] = h."magical obelisk";
        h.lllIIIlIllIl[h.lllIIIlIllll[10]] = h."Activate";
        h.lllIIIlIllIl[h.lllIIIlIllll[11]] = h."Quick-exit";
        h.lllIIIlIllIl[h.lllIIIlIllll[12]] = h."FLOOR_I";
        h.lllIIIlIllIl[h.lllIIIlIllll[15]] = h."FLOOR_II";
        h.lllIIIlIllIl[h.lllIIIlIllll[17]] = h."FLOOR_III";
        h.lllIIIlIllIl[h.lllIIIlIllll[20]] = h."FLOOR_IV";
        h.lllIIIlIllIl[h.lllIIIlIllll[23]] = h."FLOOR_V";
    }

    private static boolean lIIIlIIlIlIIIII(Object object) {
        return object == null;
    }

    private static String lIIIlIIlIIlIlll(String var21, String var8) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var19 = var8.toCharArray();
        int var2 = lllIIIlIllll[0];
        char[] var4 = var21.toCharArray();
        int var17 = var4.length;
        int var9 = lllIIIlIllll[0];
        while (h.lIIIlIIlIlIIIlI(var9, var17)) {
            char var23 = var4[var9];
            var1.append((char)(var23 ^ var19[var2 % var19.length]));
            0;
            ++var2;
            ++var9;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public boolean a(Locatable locatable) {
        if (h.lIIIlIIlIlIIIll(this.area.get().contains(locatable) ? 1 : 0)) {
            return lllIIIlIllll[1];
        }
        return lllIIIlIllll[0];
    }

    private static String lIIIlIIlIIllIII(String var18, String var11) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lllIIIlIllll[3], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private h(RegionPoint regionPoint, int n3, int n4, int n5) {
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
        this.nextReq = n5;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }
}

