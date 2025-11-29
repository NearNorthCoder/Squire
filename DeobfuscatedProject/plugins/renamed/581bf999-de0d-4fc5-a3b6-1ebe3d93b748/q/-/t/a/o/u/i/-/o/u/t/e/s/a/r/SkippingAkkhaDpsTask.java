/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.NEnum;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
/* TASK: Skipping Akkha DPS -> SkippingakkhadpsTask */
@TaskDesc(name="Skipping Akkha DPS", priority=150, blocking=true, register=true)
public class SkippingAkkhaDpsTask
extends ap_Unknown {
    private static /* synthetic */ int[] llIlIllIIII;
    private static final /* synthetic */ int dn;
    private /* synthetic */ boolean dp;
    private static final /* synthetic */ int do;
    private static /* synthetic */ String[] llIlIlIllll;
    private /* synthetic */ int dq;

    private static String lIlIIlllIllIll(String var3, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIlIllIIII[7]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIlIllIIII[8], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIllllI(Object object) {
        return object == null;
    }

    private static boolean lIlIIllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIlllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var8_8;
        ax var1;
        void var14;
        n n2 = this.bx();
        if (ax.lIlIIlllIllllI((Object)n2)) {
            return llIlIllIIII[0];
        }
        WorldPoint var12 = var14.a(var1.cu);
        NPC var13 = NPCs.getNearest((WorldPoint)var12, nPC -> {
            int n2;
            if (ax.lIlIIllllIIIII(nPC.getName().equals(llIlIlIllll[llIlIllIIII[0]]) ? 1 : 0) && ax.lIlIIllllIIIlI(nPC.getWorldLocation().distanceTo(var12), llIlIllIIII[6])) {
                n2 = llIlIllIIII[1];
                0;
                if (-2 >= 0) {
                    return ((0x7A ^ 0x10 ^ (0x84 ^ 0xB6)) & (0x1B ^ 0x44 ^ (0x6E ^ 0x69) ^ -1)) != 0;
                }
            } else {
                n2 = llIlIllIIII[0];
            }
            return n2 != 0;
        });
        if (!ax.lIlIIlllIlllll(var13) || ax.lIlIIllllIIIII(var13.isDead() ? 1 : 0)) {
            return llIlIllIIII[0];
        }
        int[] nArray = new int[llIlIllIIII[1]];
        nArray[ax.llIlIllIIII[0]] = llIlIllIIII[2];
        NPC var8 = NPCs.getNearest((int[])nArray);
        if (!ax.lIlIIlllIlllll(var8) || ax.lIlIIllllIIIIl(var8.getHealthRatio(), llIlIllIIII[3])) {
            return llIlIllIIII[0];
        }
        if (ax.lIlIIlllIllllI(var1.J())) {
            return llIlIllIIII[0];
        }
        if (ax.lIlIIllllIIIlI(var8.getHealthRatio() + llIlIllIIII[4], var8.getHealthScale()) && ax.lIlIIllllIIIll(var13.getAnimation(), llIlIllIIII[5])) {
            return llIlIllIIII[0];
        }
        WorldArea var4 = var13.getWorldArea();
        WorldPoint var9 = var4.toWorldPointList().stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var12))).orElse(null);
        if (ax.lIlIIlllIllllI(var9)) {
            return llIlIllIIII[0];
        }
        WorldPoint var7 = var4.toWorldPointList().stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var12))).orElse(null);
        if (ax.lIlIIlllIllllI(var7)) {
            return llIlIllIIII[0];
        }
        WorldPoint var2 = var9;
        if (ax.lIlIIllllIIlII(var13.getAnimationFrame(), llIlIllIIII[1])) {
            var2 = var7;
        }
        Movement.setDestination((WorldPoint)var8_8);
        return llIlIllIIII[1];
    }

    private static void lIlIIlllIlllII() {
        llIlIlIllll = new String[llIlIllIIII[1]];
        ax.llIlIlIllll[ax.llIlIllIIII[0]] = ax."Akkha's Shadow";
    }

    private static void lIlIIlllIlllIl() {
        llIlIllIIII = new int[9];
        ax.llIlIllIIII[0] = (0xF3 ^ 0xA1) & ~(0xC ^ 0x5E);
        ax.llIlIllIIII[1] = 1;
        ax.llIlIllIIII[2] = 0xFFFFEFDD & 0x3E3F;
        ax.llIlIllIIII[3] = -1;
        ax.llIlIllIIII[4] = 0xE8 ^ 0xB0 ^ (0xD0 ^ 0x8D);
        ax.llIlIllIIII[5] = 0xFFFFFEB1 & 0x277F;
        ax.llIlIllIIII[6] = 0x88 ^ 0x8E;
        ax.llIlIllIIII[7] = 0x48 ^ 0x40;
        ax.llIlIllIIII[8] = 2;
    }

    private static boolean lIlIIllllIIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ax(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIIllllIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIllllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllllIIIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        ax.lIlIIlllIlllIl();
        ax.lIlIIlllIlllII();
        dn = llIlIllIIII[5];
        do = llIlIllIIII[2];
    }
}

