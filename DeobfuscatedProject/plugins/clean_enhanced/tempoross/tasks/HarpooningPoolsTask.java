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
import java.util.Random;
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

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (k.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var7);
    }

    @Inject
    protected HarpooningPoolsTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.an = new Random();
        this.ao = var2[0];
        this.aq = this.an.nextInt(var2[1]) + var2[2];
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static void var16() {
        var1 = new String[var2[9]];
        k.var1[k.var2[0]] = "Harpoon";
        k.var1[k.var2[3]] = "Douse";
    }

    static {
        k.var17();
        k.var16();
        am = var2[11];
        al = var2[10];
    }

    private static boolean var18(int n2) {
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
                if (!k.var19(this.ar.M() ? 1 : 0) || !k.var18(this.ar.L() ? 1 : 0) || !k.var18(this.ar.m() ? 1 : 0)) break block2;
                if (!k.var18(this.as.solo() ? 1 : 0)) break block3;
                int[] nArray = new int[var2[3]];
                nArray[k.var2[0]] = var2[4];
                if (!k.var19(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var2[3]];
                nArray2[k.var2[0]] = var2[5];
                if (!k.var19(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n2 = var2[3];
            0;
            if (3 < (0xC4 ^ 0xC0)) return n2 != 0;
            return ((0x44 ^ 0x56) & ~(0x9D ^ 0x8F)) != 0;
        }
        n2 = var2[0];
        return n2 != 0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    private static void var17() {
        var2 = new int[14];
        k.var2[0] = (0x6E ^ 0x27) & ~(0x8F ^ 0xC6);
        k.var2[1] = 0x20 ^ 0x2A;
        k.var2[2] = 0x51 ^ 0x70 ^ (0x2E ^ 0x1B);
        k.var2[3] = 1;
        k.var2[4] = -(0xFFFF9F7D & 0x6CA3) & (0xFFFFFFFF & 0x6FFD);
        k.var2[5] = 0xFFFFEFDD & 0x73FE;
        k.var2[6] = 0xFFFFE94B & 0x3FFF;
        k.var2[7] = -(0xFFFF9E85 & 0x63FF) & (0xFFFFFBCE & 0x2FFF);
        k.var2[8] = 92 + 29 - 20 + 28 ^ 61 + 38 - 98 + 131;
        k.var2[9] = 2;
        k.var2[10] = 0xFFFFCBFA & 0x3745;
        k.var2[11] = -(0xFFFFD41F & 0x2FED) & (0xFFFFEFDF & 0x1EFF);
        k.var2[12] = 0x6E ^ 6 ^ (0x7E ^ 0x12);
        k.var2[13] = 0xFFFFF1C7 & 0x2FFB;
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        int llllllllllllllIlllIlIllllllllllI22;
        void v2;
        c llllllllllllllIlllIlIllllllllllI22;
        void var28;
        void var29;
        k var30;
        void var31;
        int[] nArray = new int[var2[3]];
        nArray[k.var2[0]] = var2[6];
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), (int[])nArray);
        int[] nArray2 = new int[var2[3]];
        nArray2[k.var2[0]] = var2[7];
        NPC nPC3 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), (int[])nArray2);
        Player player = Players.getLocal();
        if (k.var15(player)) {
            return var2[0];
        }
        if (k.var19(Movement.isRunEnabled() ? 1 : 0) && (!k.var19(var31.isMoving() ? 1 : 0) || k.var18(var31.isAnimating() ? 1 : 0)) && k.var32(Movement.getRunEnergy(), var30.aq)) {
            Movement.toggleRun();
            var30.aq = var30.an.nextInt(var2[1]) + var2[2];
        }
        if (k.var15(var29) && k.var15(var28) && k.var32(var31.distanceTo((llllllllllllllIlllIlIllllllllllI22 = var30.ar.N()).ag()), var2[8])) {
            return var30.ar.f(llllllllllllllIlllIlIllllllllllI22.ag());
        }
        if (k.var18(var30.as.solo() ? 1 : 0)) {
            llllllllllllllIlllIlIllllllllllI22 = NPCs.getNearest(nPC -> {
                int n2;
                if (k.var21(nPC.getId(), var2[13])) {
                    String[] stringArray = new String[var2[3]];
                    stringArray[k.var2[0]] = var1[var2[3]];
                    if (k.var18(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[3];
                        0;
                        if (2 > 0) return n2 != 0;
                        return (2 & (2 ^ -1)) != 0;
                    }
                }
                n2 = var2[0];
                return n2 != 0;
            });
            int var33 = var30.au.c();
            if (k.var15(llllllllllllllIlllIlIllllllllllI22)) {
                int var34 = var30.ar.E();
                if (k.var21(var34, var2[3]) && k.var3(var33, var30.ar.F())) {
                    var30.ar.d(var2[0]);
                    var30.ar.u();
                    var30.ao = var2[0];
                    return var2[0];
                }
                if (k.var21(var34, var2[9]) && k.var3(var33, var30.ar.G())) {
                    var30.ar.d(var2[0]);
                    var30.ar.u();
                    var30.ao = var2[0];
                    return var2[0];
                }
            }
        }
        if (k.var14(var29) && k.var18(var29.equals(var31.getInteracting()) ? 1 : 0)) {
            int llllllllllllllIlllIlIllllllllllI22 = var31.getAnimation();
            var29.getWorldArea().distanceTo2D(var31.getWorldLocation());
            0;
            if (k.var18(var31.isAnimating() ? 1 : 0) && k.var20(llllllllllllllIlllIlIllllllllllI22, var2[10]) && k.var20(llllllllllllllIlllIlIllllllllllI22, var2[11])) {
                var30.ao = var2[3];
            }
            return var2[0];
        }
        if (k.var14(var29)) {
            v2 = var29;
            0;
            if (-1 > 1) {
                return ((0x5F ^ 0x43 ^ (0xA9 ^ 0x89)) & (57 + 137 - 137 + 116 ^ 80 + 139 - 80 + 6 ^ -1)) != 0;
            }
        } else {
            v2 = var28;
        }
        if (k.var32(llllllllllllllIlllIlIllllllllllI22 = var31.distanceTo((Locatable)v2), var2[12])) {
            if (k.var18(Movement.shouldWalk() ? 1 : 0)) {
                void v4;
                a a2 = var30.ar;
                if (k.var14(var29)) {
                    v4 = var29;
                    0;
                    if null != null {
                        return ((0x89 ^ 0xA6 ^ (0x75 ^ 0x4D)) & (0x17 ^ 0x41 ^ (0x5E ^ 0x1F) ^ -1)) != 0;
                    }
                } else {
                    v4 = var28;
                }
                return a2.c((NPC)v4);
            }
            return var2[3];
        }
        if (k.var15(var29)) {
            if (k.var18(var30.ao)) {
                var30.ar.d(var2[0]);
                var30.ar.u();
                var30.ao = var2[0];
            }
            return var2[0];
        }
        return this.ar.a(nPC2, var1[var2[0]]);
    }

    private static boolean var32(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }
}

