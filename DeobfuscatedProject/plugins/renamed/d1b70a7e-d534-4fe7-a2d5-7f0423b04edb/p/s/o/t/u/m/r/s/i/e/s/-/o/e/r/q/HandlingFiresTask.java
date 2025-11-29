/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.NPCs
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.NPCs;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Handling fires -> HandlingfiresTask */
@TaskDesc(name="Handling fires", priority=20, blocking=true)
public class HandlingFiresTask
extends l_Unknown {
    private static /* synthetic */ int[] lIIlllIIIllIl;
    private static /* synthetic */ String[] lIIlllIIIlIll;

    static {
        i.lIllIIlIIlllllI();
        i.lIllIIlIIlllIIl();
    }

    private static void lIllIIlIIlllIIl() {
        lIIlllIIIlIll = new String[lIIlllIIIllIl[5]];
        i.lIIlllIIIlIll[i.lIIlllIIIllIl[2]] = i."dousing fire to get to proper fire!";
        i.lIIlllIIIlIll[i.lIIlllIIIllIl[0]] = i."Douse";
    }

    private static void lIllIIlIIlllllI() {
        lIIlllIIIllIl = new int[6];
        i.lIIlllIIIllIl[0] = 1;
        i.lIIlllIIIllIl[1] = 0x70 ^ 0x53;
        i.lIIlllIIIllIl[2] = (5 ^ 0x46) & ~(0x87 ^ 0xC4);
        i.lIIlllIIIllIl[3] = 3;
        i.lIIlllIIIllIl[4] = 0xFFFFE3C7 & 0x3DFB;
        i.lIIlllIIIllIl[5] = 2;
    }

    private static String lIllIIlIIllIlll(String var3, String var6) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIlllIIIllIl[5], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIIIIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ak() {
        int n2;
        if (i.lIllIIlIIllllll(this.ar.E(), lIIlllIIIllIl[0]) && i.lIllIIlIIllllll(this.au.b(), lIIlllIIIllIl[1]) && i.lIllIIlIlIIIIII(this.ar.I() ? 1 : 0)) {
            n2 = lIIlllIIIllIl[0];
            0;
            
            }
        } else {
            n2 = lIIlllIIIllIl[2];
        }
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        i var7;
        void var8;
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), nPC -> {
            int n2;
            if (i.lIllIIlIlIIIIlI(nPC.getId(), lIIlllIIIllIl[4])) {
                String[] stringArray = new String[lIIlllIIIllIl[0]];
                stringArray[i.lIIlllIIIllIl[2]] = lIIlllIIIlIll[lIIlllIIIllIl[0]];
                if (i.lIllIIlIlIIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIllIl[0];
                    0;
                    if (((81 + 40 - 115 + 213 ^ 22 + 115 - 80 + 87) & (0x75 ^ 0x3B ^ (0x84 ^ 0x81) ^ -1)) >= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllIIIllIl[2];
            return n2 != 0;
        });
        if (i.lIllIIlIlIIIIIl(nPC2)) {
            return lIIlllIIIllIl[2];
        }
        if (i.lIllIIlIIllllll(var8.distanceTo(var7.ar.N().ag()), lIIlllIIIllIl[3])) {
            var7.ar.a(lIIlllIIIllIl[2]);
            return lIIlllIIIllIl[2];
        }
        if (i.lIllIIlIlIIIIII(var7.au.a((Locatable)var8) ? 1 : 0)) {
            System.out.println(lIIlllIIIlIll[lIIlllIIIllIl[2]]);
            var7.au.b((SceneEntity)var8);
            0;
            return lIIlllIIIllIl[0];
        }
        this.au.b(nPC2);
        0;
        return lIIlllIIIllIl[0];
    }

    @Inject
    protected i(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIIlIIlllIII(String var13, String var15) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var14 = var15.toCharArray();
        int var12 = lIIlllIIIllIl[2];
        char[] var1 = var13.toCharArray();
        int var5 = var1.length;
        int var2 = lIIlllIIIllIl[2];
        while (i.lIllIIlIlIIIIll(var2, var5)) {
            char var16 = var1[var2];
            var9.append((char)(var16 ^ var14[var12 % var14.length]));
            0;
            ++var12;
            ++var2;
            0;
            if (-(9 + 131 - 74 + 79 ^ 141 + 75 - 138 + 71) <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIllIIlIIllllll(int n2, int n3) {
        return n2 > n3;
    }
}

