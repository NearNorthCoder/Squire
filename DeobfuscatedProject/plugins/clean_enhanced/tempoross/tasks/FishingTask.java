/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Fishing", priority=7, blocking=true)
public class FishingTask
extends TemporossTaskBase {

    private static void var3() {
        var2 = new String[var1[2]];
        j.var2[j.var1[1]] = "Shadow danger in fishin!";
        j.var2[j.var1[0]] = "Harpoon";
    }

    private static boolean var4(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var1 = new int[10];
        j.var1[0] = 1;
        j.var1[1] = (3 ^ 6) & ~(0x7D ^ 0x78);
        j.var1[2] = 2;
        j.var1[3] = -(0xFFFFF7FA & 0x4FD7) & (0xFFFFF7FF & 0xEFFF);
        j.var1[4] = 0xD ^ 0x50 ^ (0xC5 ^ 0x9C);
        j.var1[5] = 0xFFFFEB4B & 0x3DFD;
        j.var1[6] = 0xFFFFBFE5 & 0x695F;
        j.var1[7] = 0xFFFFF9F9 & 0x2F4E;
        j.var1[8] = 115 + 151 - 167 + 62 ^ 41 + 116 - 122 + 146;
        j.var1[9] = 0x50 ^ 0x58;
    }

    @Override
    public boolean ak() {
        int n2;
        if (j.var12(this.ar.L() ? 1 : 0) && j.var13(this.au.f(), this.as.numberOfFish())) {
            n2 = var1[0];
            0;
            if null != null {
                return ((0x12 ^ 0x4F ^ (0x18 ^ 0x7D)) & (51 + 132 - 52 + 32 ^ 94 + 48 - 1 + 14 ^ -1)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    @Inject
    protected FishingTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        j.var11();
        j.var3();
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    public boolean b(c c2) {
        if (j.var14(this.au.a(c2.ag()) ? 1 : 0)) {
            return this.au.e(c2.ag());
        }
        this.au.b(c2.ag());
        0;
        return var1[0];
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var5_5;
        void var17;
        j var18;
        Player player = Players.getLocal();
        if (j.var16(player)) {
            return var1[1];
        }
        int var19 = var18.au.a();
        c var20 = var18.ar.N();
        if (j.var13(var19, var1[2])) {
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[j.var1[1]] = var1[3];
        TileObject var21 = TileObjects.getNearest((int[])nArray);
        if (j.var14(var21 instanceof GameObject) && j.var14(((GameObject)var21).getWorldArea().contains(var17.getWorldLocation()) ? 1 : 0)) {
            System.out.println(var2[var1[1]]);
        }
        NPC var22 = null;
        if (j.var13(var18.au.f(), var18.as.numberOfFish() - var1[4])) {
            var22 = NPCs.getNearest(nPC -> {
                int n2;
                if (j.var15(var1[5], nPC.getId()) && j.var4(nPC.getWorldLocation().distanceTo(var20.ah()), var1[8]) && j.var14(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = var1[0];
                    0;
                    if null != null {
                        return ((0xAF ^ 0x90) & ~(4 ^ 0x3B)) != 0;
                    }
                } else {
                    n2 = var1[1];
                }
                return n2 != 0;
            });
        }
        if (j.var16(var22)) {
            var22 = NPCs.getNearest(nPC -> {
                int n2;
                if (j.var14(Set.of(Integer.valueOf(var1[6]), Integer.valueOf(var1[7]), Integer.valueOf(var1[5])).contains(nPC.getId()) ? 1 : 0) && j.var4(nPC.getWorldLocation().distanceTo(var20.ah()), var1[8]) && j.var14(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = var1[0];
                    0;
                    if (-1 > 3) {
                        return ((153 + 42 - 192 + 162 ^ 138 + 34 - 64 + 34) & (0x4A ^ 9 ^ (0x16 ^ 0x7E) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[1];
                }
                return n2 != 0;
            });
        }
        if (j.var16(var22)) {
            return var18.b(var20);
        }
        if (j.var14(var18.au.a((Locatable)var22) ? 1 : 0) && j.var14(var18.au.c(var17.getWorldLocation()) ? 1 : 0)) {
            return var1[0];
        }
        if (j.var14(var17.getInteracting() instanceof NPC) && j.var14(var18.au.c(var17.getWorldLocation()) ? 1 : 0) && (!j.var15(var22.getId(), var1[5]) || j.var15(var17.getInteracting().getId(), var1[5])) && j.var12(Dialog.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        var5_5.interact(var2[var1[0]]);
        return var1[0];
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }
}

