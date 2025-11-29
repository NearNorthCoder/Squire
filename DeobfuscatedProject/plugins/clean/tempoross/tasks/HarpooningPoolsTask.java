/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Harpooning pools", priority=600, blocking=true)
public class HarpooningPoolsTask
extends TemporossTaskBase {
    
    public static final  int am;
    private final  Random an;
    private  boolean ao;
    public static final  int al;
    private  int aq;
    private  int ap;

    private static boolean lIllIIlIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Inject
    protected HarpooningPoolsTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.an = new Random();
        this.ao = lIIlllIIlIIIl[0];
        this.aq = this.an.nextInt(lIIlllIIlIIIl[1]) + lIIlllIIlIIIl[2];
    }

    private static boolean lIllIIlIlIllIll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIlIlll(Object object) {
        return object == null;
    }

    private static void lIllIIlIlIIIlll() {
        lIIlllIIIlllI = new String[lIIlllIIlIIIl[9]];
        k.lIIlllIIIlllI[k.lIIlllIIlIIIl[0]] = "Harpoon";
        k.lIIlllIIIlllI[k.lIIlllIIlIIIl[3]] = "Douse";
    }

    static {
        k.lIllIIlIlIIlllI();
        k.lIllIIlIlIIIlll();
        am = lIIlllIIlIIIl[11];
        al = lIIlllIIlIIIl[10];
    }

    private static boolean lIllIIlIlIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        int n2;
        block2: {
            block3: {
                if (!k.lIllIIlIlIlIlIl(this.ar.M() ? 1 : 0) || !k.lIllIIlIlIlIllI(this.ar.L() ? 1 : 0) || !k.lIllIIlIlIlIllI(this.ar.m() ? 1 : 0)) break block2;
                if (!k.lIllIIlIlIlIllI(this.as.solo() ? 1 : 0)) break block3;
                int[] nArray = new int[lIIlllIIlIIIl[3]];
                nArray[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[4];
                if (!k.lIllIIlIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIlllIIlIIIl[3]];
                nArray2[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[5];
                if (!k.lIllIIlIlIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n2 = lIIlllIIlIIIl[3];

            if (3 < (0xC4 ^ 0xC0)) return n2 != 0;
            return false;
        }
        n2 = lIIlllIIlIIIl[0];
        return n2 != 0;
    }

    private static boolean lIllIIlIlIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIlIlIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        int llllllllllllllIlllIlIllllllllllI22;
        void v2;
        c llllllllllllllIlllIlIllllllllllI22;
        void var2;
        void var3;
        k var4;
        void var5;
        int[] nArray = new int[lIIlllIIlIIIl[3]];
        nArray[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[6];
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), (int[])nArray);
        int[] nArray2 = new int[lIIlllIIlIIIl[3]];
        nArray2[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[7];
        NPC nPC3 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), (int[])nArray2);
        Player player = Players.getLocal();
        if (k.lIllIIlIlIlIlll(player)) {
            return lIIlllIIlIIIl[0];
        }
        if (k.lIllIIlIlIlIlIl(Movement.isRunEnabled() ? 1 : 0) && (!k.lIllIIlIlIlIlIl(var5.isMoving() ? 1 : 0) || k.lIllIIlIlIlIllI(var5.isAnimating() ? 1 : 0)) && k.lIllIIlIlIllIII(Movement.getRunEnergy(), var4.aq)) {
            Movement.toggleRun();
            var4.aq = var4.an.nextInt(lIIlllIIlIIIl[1]) + lIIlllIIlIIIl[2];
        }
        if (k.lIllIIlIlIlIlll(var3) && k.lIllIIlIlIlIlll(var2) && k.lIllIIlIlIllIII(var5.distanceTo((llllllllllllllIlllIlIllllllllllI22 = var4.ar.N()).ag()), lIIlllIIlIIIl[8])) {
            return var4.ar.f(llllllllllllllIlllIlIllllllllllI22.ag());
        }
        if (k.lIllIIlIlIlIllI(var4.as.solo() ? 1 : 0)) {
            llllllllllllllIlllIlIllllllllllI22 = NPCs.getNearest(nPC -> {
                int n2;
                if (k.lIllIIlIlIllIIl(nPC.getId(), lIIlllIIlIIIl[13])) {
                    String[] stringArray = new String[lIIlllIIlIIIl[3]];
                    stringArray[k.lIIlllIIlIIIl[0]] = lIIlllIIIlllI[lIIlllIIlIIIl[3]];
                    if (k.lIllIIlIlIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIlIIIl[3];

                        if (2 > 0) return n2 != 0;
                        return (2 & (2 ^ -1)) != 0;
                    }
                }
                n2 = lIIlllIIlIIIl[0];
                return n2 != 0;
            });
            int var6 = var4.au.c();
            if (k.lIllIIlIlIlIlll(llllllllllllllIlllIlIllllllllllI22)) {
                int var7 = var4.ar.E();
                if (k.lIllIIlIlIllIIl(var7, lIIlllIIlIIIl[3]) && k.lIllIIlIlIllIlI(var6, var4.ar.F())) {
                    var4.ar.d(lIIlllIIlIIIl[0]);
                    var4.ar.u();
                    var4.ao = lIIlllIIlIIIl[0];
                    return lIIlllIIlIIIl[0];
                }
                if (k.lIllIIlIlIllIIl(var7, lIIlllIIlIIIl[9]) && k.lIllIIlIlIllIlI(var6, var4.ar.G())) {
                    var4.ar.d(lIIlllIIlIIIl[0]);
                    var4.ar.u();
                    var4.ao = lIIlllIIlIIIl[0];
                    return lIIlllIIlIIIl[0];
                }
            }
        }
        if (k.lIllIIlIlIllIll(var3) && k.lIllIIlIlIlIllI(var3.equals(var5.getInteracting()) ? 1 : 0)) {
            int llllllllllllllIlllIlIllllllllllI22 = var5.getAnimation();
            var3.getWorldArea().distanceTo2D(var5.getWorldLocation());

            if (k.lIllIIlIlIlIllI(var5.isAnimating() ? 1 : 0) && k.lIllIIlIlIlllII(llllllllllllllIlllIlIllllllllllI22, lIIlllIIlIIIl[10]) && k.lIllIIlIlIlllII(llllllllllllllIlllIlIllllllllllI22, lIIlllIIlIIIl[11])) {
                var4.ao = lIIlllIIlIIIl[3];
            }
            return lIIlllIIlIIIl[0];
        }
        if (k.lIllIIlIlIllIll(var3)) {
            v2 = var3;

            if (-1 > 1) {
                return ((0x5F ^ 0x43 ^ (0xA9 ^ 0x89)) & (57 + 137 - 137 + 116 ^ 80 + 139 - 80 + 6 ^ -1)) != 0;
            }
        } else {
            v2 = var2;
        }
        if (k.lIllIIlIlIllIII(llllllllllllllIlllIlIllllllllllI22 = var5.distanceTo((Locatable)v2), lIIlllIIlIIIl[12])) {
            if (k.lIllIIlIlIlIllI(Movement.shouldWalk() ? 1 : 0)) {
                void v4;
                a a2 = var4.ar;
                if (k.lIllIIlIlIllIll(var3)) {
                    v4 = var3;

                    }
                } else {
                    v4 = var2;
                }
                return a2.c((NPC)v4);
            }
            return lIIlllIIlIIIl[3];
        }
        if (k.lIllIIlIlIlIlll(var3)) {
            if (k.lIllIIlIlIlIllI(var4.ao ? 1 : 0)) {
                var4.ar.d(lIIlllIIlIIIl[0]);
                var4.ar.u();
                var4.ao = lIIlllIIlIIIl[0];
            }
            return lIIlllIIlIIIl[0];
        }
        return this.ar.a(nPC2, lIIlllIIIlllI[lIIlllIIlIIIl[0]]);
    }

    private static boolean lIllIIlIlIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIlIlIlIlIl(int n2) {
        return n2 == 0;
    }
}

