/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

/* TASK: Getting killcount -> GettingkillcountTask */
@TaskDesc(name="Getting killcount", priority=5)
public class A
extends Task {
    private static /* synthetic */ int[] lllIIIIlIlI;
    private final /* synthetic */ Client aE;
    private final /* synthetic */ e aD;
    private static /* synthetic */ String[] lllIIIIIllI;
    private static final /* synthetic */ WorldPoint aC;

    private static String lIlIllIIllIlll(String var7, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lllIIIIlIlI[1], var5);
            return new String(var16.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIlIIIlII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIIlIl(Object object) {
        return object == null;
    }

    private static String lIlIllIIlllIll(String var6, String var18) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var11 = var18.toCharArray();
        int var1 = lllIIIIlIlI[0];
        char[] var14 = var6.toCharArray();
        int var13 = var14.length;
        int var15 = lllIIIIlIlI[0];
        while (A.lIlIllIlIIlIIl(var15, var13)) {
            char var4 = var14[var15];
            var8.append((char)(var4 ^ var11[var1 % var11.length]));
            0;
            ++var1;
            ++var15;
            0;
            if (3 <= (0x24 ^ 0x20)) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    static {
        A.lIlIllIlIIIIIl();
        A.lIlIllIIllllII();
        aC = new WorldPoint(lllIIIIlIlI[14], lllIIIIlIlI[15], lllIIIIlIlI[1]);
    }

    private static boolean lIlIllIlIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public A(e e2) {
        this.aD = e2;
        this.aE = Static.getClient();
    }

    private int R() {
        A var9;
        if (A.lIlIllIlIIIllI(this.aE.getVarbitValue(lllIIIIlIlI[3]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[4];
        }
        if (A.lIlIllIlIIIllI(var9.aE.getVarbitValue(lllIIIIlIlI[5]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[6];
        }
        if (A.lIlIllIlIIIllI(var9.aE.getVarbitValue(lllIIIIlIlI[7]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[8];
        }
        if (A.lIlIllIlIIIllI(var9.aE.getVarbitValue(lllIIIIlIlI[9]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[10];
        }
        return lllIIIIlIlI[11];
    }

    private static boolean lIlIllIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIIllllII() {
        lllIIIIIllI = new String[lllIIIIlIlI[1]];
        A.lllIIIIIllI[A.lllIIIIlIlI[0]] = A."Attack";
        A.lllIIIIIllI[A.lllIIIIlIlI[2]] = A."Goblin";
    }

    private static boolean lIlIllIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        A var10;
        if (A.lIlIllIlIIIIlI(this.aD.t() ? 1 : 0)) {
            return lllIIIIlIlI[0];
        }
        if (A.lIlIllIlIIIIll(var10.aD.x(), var10.R())) {
            return lllIIIIlIlI[0];
        }
        Player var3 = Players.getLocal();
        if (A.lIlIllIlIIIlII(var3.getInteracting())) {
            return lllIIIIlIlI[0];
        }
        NPC var12 = NPCs.getNearest(nPC -> {
            int n2;
            if (A.lIlIllIlIIIlll(nPC.isDead() ? 1 : 0) && A.lIlIllIlIIIIlI(nPC.getName().equals(lllIIIIIllI[lllIIIIlIlI[2]]) ? 1 : 0) && A.lIlIllIlIIlIII(nPC.distanceTo((Locatable)var3), lllIIIIlIlI[12]) && A.lIlIllIlIIlIII(nPC.distanceTo(aC), lllIIIIlIlI[13])) {
                n2 = lllIIIIlIlI[2];
                0;
                if (2 == ((0x22 ^ 0x28 ^ (5 ^ 0x2B)) & (0xB6 ^ 0xAF ^ (0x2C ^ 0x11) ^ -1))) {
                    return ((0xB5 ^ 0xBA ^ (0x97 ^ 0xC6)) & (0x63 ^ 0x25 ^ (0xAF ^ 0xB7) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIIlIlI[0];
            }
            return n2 != 0;
        });
        if (A.lIlIllIlIIIlIl(var12)) {
            return lllIIIIlIlI[0];
        }
        var2_2.interact(lllIIIIIllI[lllIIIIlIlI[0]]);
        this.sleep(lllIIIIlIlI[1]);
        return lllIIIIlIlI[2];
    }

    private static void lIlIllIlIIIIIl() {
        lllIIIIlIlI = new int[16];
        A.lllIIIIlIlI[0] = (0x62 ^ 0x79) & ~(0xB4 ^ 0xAF);
        A.lllIIIIlIlI[1] = 2;
        A.lllIIIIlIlI[2] = 1;
        A.lllIIIIlIlI[3] = 0xFFFFB6DE & 0x7B65;
        A.lllIIIIlIlI[4] = 51 + 102 - 73 + 95 ^ 119 + 12 - 23 + 52;
        A.lllIIIIlIlI[5] = 0xFFFFBEFF & 0x7343;
        A.lllIIIIlIlI[6] = 0x28 ^ 0x1D ^ (0x30 ^ 0x1C);
        A.lllIIIIlIlI[7] = 0xFFFFF37E & 0x3EC3;
        A.lllIIIIlIlI[8] = 0x33 ^ 0x2D;
        A.lllIIIIlIlI[9] = -(0xFFFFA53D & 0x5EDF) & (0xFFFFF7DD & 0x3E7F);
        A.lllIIIIlIlI[10] = 0x58 ^ 0x7B;
        A.lllIIIIlIlI[11] = 0x2A ^ 2;
        A.lllIIIIlIlI[12] = 9 ^ 3;
        A.lllIIIIlIlI[13] = 0xC3 ^ 0x9D ^ (8 ^ 0x5E);
        A.lllIIIIlIlI[14] = 0xFFFFBFFE & 0x4B3F;
        A.lllIIIIlIlI[15] = -(0xFFFFFABE & 0x4F6F) & (0xFFFFFFFF & 0x5EFF);
    }
}

