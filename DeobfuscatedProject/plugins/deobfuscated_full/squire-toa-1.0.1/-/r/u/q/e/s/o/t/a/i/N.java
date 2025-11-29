/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

/* TASK: Handling babboon prayers -> HandlingbabboonprayersTask */
@TaskDesc(name="Handling babboon prayers")
public class N
extends z {
    private static /* synthetic */ String[] lIlIIIIIIllll;
    private static /* synthetic */ int[] lIlIIIIIlIIII;

    private static String lIllIlIllllllll(String var3, String var15) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIIIIIlIIII[2], var4);
            return new String(var7.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean I() {
        boolean bl;
        if (N.lIllIllIIIIlIIl((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            bl = lIlIIIIIlIIII[0];
            0;
            if (-(0xAD ^ 0xA8) >= 0) {
                return false;
            }
        } else {
            bl = lIlIIIIIlIIII[1];
        }
        return bl;
    }

    private static void lIllIllIIIIIIlI() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIII[6]];
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[1]] = N."Baboon Thrower";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[0]] = N."Baboon Mage";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[2]] = N."Baboon Brawler";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[3]] = N."Baboon Thrall";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[5]] = N."Baboon";
    }

    @Override
    public boolean C() {
        boolean bl;
        if (N.lIllIllIIIIlIII((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            return lIlIIIIIlIIII[1];
        }
        if (N.lIllIllIIIIIlIl(NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIllll[lIlIIIIIlIIII[5]])))) {
            bl = lIlIIIIIlIIII[0];
            0;
            if (3 != 3) {
                return false;
            }
        } else {
            bl = lIlIIIIIlIIII[1];
        }
        return bl;
    }

    @Override
    public int F() {
        return lIlIIIIIlIIII[4];
    }

    private static boolean lIllIllIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        N.lIllIllIIIIIIll();
        N.lIllIllIIIIIIlI();
    }

    private static void lIllIllIIIIIIll() {
        lIlIIIIIlIIII = new int[8];
        N.lIlIIIIIlIIII[0] = 1;
        N.lIlIIIIIlIIII[1] = (36 + 27 - -67 + 22 ^ 97 + 42 - 16 + 6) & (136 + 76 - 69 + 4 ^ 136 + 100 - 233 + 135 ^ -1);
        N.lIlIIIIIlIIII[2] = 2;
        N.lIlIIIIIlIIII[3] = 3;
        N.lIlIIIIIlIIII[4] = 0xFFFFBB57 & 0x7FFA;
        N.lIlIIIIIlIIII[5] = 0x88 ^ 0x8C;
        N.lIlIIIIIlIIII[6] = 0x2F ^ 0x2A;
        N.lIlIIIIIlIIII[7] = 0x7C ^ 0x74;
    }

    private static String lIllIllIIIIIIII(String var5, String var13) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var8 = var13.toCharArray();
        int var22 = lIlIIIIIlIIII[1];
        char[] var2 = var5.toCharArray();
        int var1 = var2.length;
        int var10 = lIlIIIIIlIIII[1];
        while (N.lIllIllIIIIlIlI(var10, var1)) {
            char var19 = var2[var10];
            var23.append((char)(var19 ^ var8[var22 % var8.length]));
            0;
            ++var22;
            ++var10;
            0;
            if (-1 <= (0xAD ^ 0xA9)) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    @Override
    public n J() {
        return this.aT.prayModeBaboons();
    }

    @Inject
    public N(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static boolean lIllIllIIIIIlIl(Object object) {
        return object != null;
    }

    private static String lIllIllIIIIIIIl(String var6, String var12) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIII[7]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIlIIIIIlIIII[2], var24);
            return new String(var20.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> E() {
        Prayer var16;
        void var14;
        void var11;
        String[] stringArray = new String[lIlIIIIIlIIII[0]];
        stringArray[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[1]];
        int n2 = NPCs.getAll((String[])stringArray).size();
        String[] stringArray2 = new String[lIlIIIIIlIIII[0]];
        stringArray2[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[0]];
        int n3 = NPCs.getAll((String[])stringArray2).size();
        Prayer prayer = null;
        if (N.lIllIllIIIIIlII(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (1 == 0) {
                return null;
            }
        } else if (N.lIllIllIIIIIlII((int)var11, (int)var14)) {
            var16 = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (3 <= 0) {
                return null;
            }
        } else {
            String[] stringArray3 = new String[lIlIIIIIlIIII[2]];
            stringArray3[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[2]];
            stringArray3[N.lIlIIIIIlIIII[0]] = lIlIIIIIIllll[lIlIIIIIlIIII[3]];
            NPC var21 = NPCs.getNearest((String[])stringArray3);
            if (!N.lIllIllIIIIIlIl(var21) || N.lIllIllIIIIIllI(var21.distanceTo((Locatable)Players.getLocal()), lIlIIIIIlIIII[2])) {
                if (N.lIllIllIIIIIlll((int)var14)) {
                    var16 = Prayer.PROTECT_FROM_MAGIC;
                    0;
                    if (-2 > 0) {
                        return null;
                    }
                }
            } else {
                var16 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (N.lIllIllIIIIIlIl(var16)) {
            N var9;
            return List.of(var9.H(), var16);
        }
        return List.of(this.H());
    }

    private static boolean lIllIllIIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIllIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIIIIIlll(int n2) {
        return n2 > 0;
    }
}

