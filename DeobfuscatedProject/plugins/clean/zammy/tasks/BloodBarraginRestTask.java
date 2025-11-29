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
import gg.squire.zammy.tasks.GameEnum16;
import gg.squire.zammy.tasks.LHelper;
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
        w.llIIIlIlllIIllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        w var1;
        if (!w.llIIIlIlllIIlll(this.ar.B() ? 1 : 0) || w.llIIIlIlllIIlll(this.ar.A() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        if (w.llIIIlIlllIlIII(var1.ar.H() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        int[] nArray = new int[lIllIIlIIlIII[1]];
        nArray[w.lIllIIlIIlIII[0]] = e.BALFRUG_KREEYATH.n();
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (w.llIIIlIlllIlIIl(var2) && w.llIIIlIlllIlIII(var2.isDead() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        int[] nArray2 = new int[lIllIIlIIlIII[1]];
        nArray2[w.lIllIIlIIlIII[0]] = e.TSTANON_KARLAK.n();
        NPC var3 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIllIIlIIlIII[1]];
        nArray3[w.lIllIIlIIlIII[0]] = e.ZAKLN_GRITCH.n();
        NPC var4 = NPCs.getNearest((int[])nArray3);
        if (w.llIIIlIlllIlIIl(var4) && w.llIIIlIlllIlIII(var4.isDead() ? 1 : 0)) {
            if (w.llIIIlIlllIlIIl(var3)) {
                WorldArea var5 = var4.getWorldArea();
                WorldArea var6 = var3.getWorldArea();
                if (w.llIIIlIlllIlIII(var6.contains(var4.getWorldLocation()) ? 1 : 0)) {
                    WorldPoint var7 = var5.toWorldPointList().stream().flatMap(worldPoint -> {
                        WorldPoint[] worldPointArray = new WorldPoint[lIllIIlIIlIII[2]];
                        worldPointArray[w.lIllIIlIIlIII[0]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[1]);
                        worldPointArray[w.lIllIIlIIlIII[1]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[3]);
                        worldPointArray[w.lIllIIlIIlIII[4]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[3]);
                        worldPointArray[w.lIllIIlIIlIII[5]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[1]);
                        return Stream.of(worldPointArray);
                    }).max(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var3.getWorldLocation()))).orElse(var5.getCenter());
                    Movement.walkTo((WorldPoint)var7);

                    var1.sleep(lIllIIlIIlIII[2]);
                    return lIllIIlIIlIII[1];
                }
            }
            return var1.e(var4);
        }
        if (!w.llIIIlIlllIlIIl(var3) || w.llIIIlIlllIIlll(var3.isDead() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        return this.e((NPC)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(NPC nPC) {
        void var2_2;
        SpellBook.Ancient var8;
        SpellBook.Ancient ancient;
        if (w.llIIIlIlllIIlll(this.as.useBloodBarrage() ? 1 : 0)) {
            ancient = SpellBook.Ancient.BLOOD_BARRAGE;

            if (2 <= ((33 + 83 - 40 + 140 ^ 29 + 18 - -88 + 14) & (63 + 167 - 59 + 68 ^ 100 + 78 - 142 + 126 ^ -1))) {
                return ((0x8F ^ 0x98 ^ (0x83 ^ 0x9E)) & (0x34 ^ 0x2E ^ (0x7B ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            ancient = SpellBook.Ancient.BLOOD_BURST;
        }
        if (w.llIIIlIlllIlIII((var8 = ancient).canCast() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        Magic.cast((Spell)var2_2, (NPC)nPC);
        this.sleep(lIllIIlIIlIII[2]);
        return lIllIIlIIlIII[1];
    }

    private static boolean llIIIlIlllIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIlllIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIlllIlIIl(Object object) {
        return object != null;
    }
}

