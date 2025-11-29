/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Ancient
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.util.Comparator;
import java.util.stream.Stream;
import gg.squire.zammy.tasks.GameEnum3;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Blood barragin rest")
public class BloodBarraginRestTask
extends Task {
    private final  SquireZammyConfig as;
    private final  Client at;
    
    private final  l ar;

    @Inject
    public BloodBarraginRestTask(l l2, SquireZammyConfig squireZammyConfig, Client client) {
        this.ar = l2;
        this.as = squireZammyConfig;
        this.at = client;
    }

    static {
        w.var2();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        w var3;
        if (!(this.ar.B( != 0) ? 1 : 0) || (this.ar.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.ar.H( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = e.BALFRUG_KREEYATH.n();
        NPC var4 = NPCs.getNearest((int[])nArray);
        if (var4 != null && (var4.isDead( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = e.TSTANON_KARLAK.n();
        NPC var5 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[1];
        nArray3[0] = e.ZAKLN_GRITCH.n();
        NPC var6 = NPCs.getNearest((int[])nArray3);
        if (var6 != null && (var6.isDead( == 0) ? 1 : 0)) {
            if var5 != null {
                WorldArea var7 = var6.getWorldArea();
                WorldArea var8 = var5.getWorldArea();
                if ((var8.contains(var6.getWorldLocation( == 0)) ? 1 : 0)) {
                    WorldPoint var9 = var7.toWorldPointList().stream().flatMap(worldPoint -> {
                        WorldPoint[] worldPointArray = new WorldPoint[2];
                        worldPointArray[0] = worldPoint.dx(1).dy(1);
                        worldPointArray[1] = worldPoint.dx(3).dy(3);
                        worldPointArray[4] = worldPoint.dx(1).dy(3);
                        worldPointArray[5] = worldPoint.dx(3).dy(1);
                        return Stream.of(worldPointArray);
                    }).max(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var5.getWorldLocation()))).orElse(var7.getCenter());
                    Movement.walkTo((WorldPoint)var9);
                    0;
                    var3.sleep(2);
                    return 1;
                }
            }
            return var3.e(var6);
        }
        if (!var5 != null || (var5.isDead( != 0) ? 1 : 0)) {
            return 0;
        }
        return this.e((NPC)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(NPC nPC) {
        void var2_2;
        SpellBook.Ancient var10;
        SpellBook.Ancient ancient;
        if ((this.as.useBloodBarrage( != 0) ? 1 : 0)) {
            ancient = SpellBook.Ancient.BLOOD_BARRAGE;
            0;
            if (2 <= ((33 + 83 - 40 + 140 ^ 29 + 18 - -88 + 14) & (63 + 167 - 59 + 68 ^ 100 + 78 - 142 + 126 ^ -1))) {
                return ((0x8F ^ 0x98 ^ (0x83 ^ 0x9E)) & (0x34 ^ 0x2E ^ (0x7B ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            ancient = SpellBook.Ancient.BLOOD_BURST;
        }
        if (((var10 = ancient == 0).canCast() ? 1 : 0)) {
            return 0;
        }
        Magic.cast((Spevar2_2, (NPC)nPC);
        this.sleep(2);
        return 1;
    }

}

