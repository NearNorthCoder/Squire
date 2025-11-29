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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum29;
import gg.squire.autotoa.tasks.AutotoaManager;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@TaskDesc(name="Skipping Akkha DPS", priority=150, blocking=true, register=true)
public class SkippingAkkhaDpsTask
extends AutotoaTaskBase {
    
    private static final  int dn;
    private  boolean dp;
    private static final  int do;
    
    private  int dq;

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
        void var2;
        n n2 = this.bx();
        if (ax.lIlIIlllIllllI((Object)n2)) {
            return llIlIllIIII[0];
        }
        WorldPoint var3 = var2.a(var1.cu);
        NPC var4 = NPCs.getNearest((WorldPoint)var3, nPC -> {
            int n2;
            if (ax.lIlIIllllIIIII(nPC.getName().equals(llIlIlIllll[llIlIllIIII[0]]) ? 1 : 0) && ax.lIlIIllllIIIlI(nPC.getWorldLocation().distanceTo(var3), llIlIllIIII[6])) {
                n2 = llIlIllIIII[1];

            } else {
                n2 = llIlIllIIII[0];
            }
            return n2 != 0;
        });
        if (!ax.lIlIIlllIlllll(var4) || ax.lIlIIllllIIIII(var4.isDead() ? 1 : 0)) {
            return llIlIllIIII[0];
        }
        int[] nArray = new int[llIlIllIIII[1]];
        nArray[ax.llIlIllIIII[0]] = llIlIllIIII[2];
        NPC var5 = NPCs.getNearest((int[])nArray);
        if (!ax.lIlIIlllIlllll(var5) || ax.lIlIIllllIIIIl(var5.getHealthRatio(), llIlIllIIII[3])) {
            return llIlIllIIII[0];
        }
        if (ax.lIlIIlllIllllI(var1.J())) {
            return llIlIllIIII[0];
        }
        if (ax.lIlIIllllIIIlI(var5.getHealthRatio() + llIlIllIIII[4], var5.getHealthScale()) && ax.lIlIIllllIIIll(var4.getAnimation(), llIlIllIIII[5])) {
            return llIlIllIIII[0];
        }
        WorldArea var6 = var4.getWorldArea();
        WorldPoint var7 = var6.toWorldPointList().stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var3))).orElse(null);
        if (ax.lIlIIlllIllllI(var7)) {
            return llIlIllIIII[0];
        }
        WorldPoint var8 = var6.toWorldPointList().stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var3))).orElse(null);
        if (ax.lIlIIlllIllllI(var8)) {
            return llIlIllIIII[0];
        }
        WorldPoint var9 = var7;
        if (ax.lIlIIllllIIlII(var4.getAnimationFrame(), llIlIllIIII[1])) {
            var9 = var8;
        }
        Movement.setDestination((WorldPoint)var8_8);
        return llIlIllIIII[1];
    }

    private static void lIlIIlllIlllII() {
        llIlIlIllll = new String[llIlIllIIII[1]];
        ax.llIlIlIllll[ax.llIlIllIIII[0]] = "Akkha's Shadow";
    }

    private static boolean lIlIIllllIIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected SkippingAkkhaDpsTask(Client client, z z2, TOAConfig tOAConfig) {
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

