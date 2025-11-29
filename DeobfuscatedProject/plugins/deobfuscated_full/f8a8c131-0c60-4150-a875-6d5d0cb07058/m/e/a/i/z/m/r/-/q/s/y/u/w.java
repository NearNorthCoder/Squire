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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.util.Comparator;
import java.util.stream.Stream;
import m.e.a.i.z.m.r.-.q.s.y.u.e;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

/* TASK: Blood barragin rest -> BloodbarraginrestTask */
@TaskDesc(name="Blood barragin rest")
public class w
extends Task {
    private final /* synthetic */ SquireZammyConfig as;
    private final /* synthetic */ Client at;
    private static /* synthetic */ int[] lIllIIlIIlIII;
    private final /* synthetic */ l ar;

    @Inject
    public w(l l2, SquireZammyConfig squireZammyConfig, Client client) {
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
        NPC var7 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIllIIlIIlIII[1]];
        nArray3[w.lIllIIlIIlIII[0]] = e.ZAKLN_GRITCH.n();
        NPC var3 = NPCs.getNearest((int[])nArray3);
        if (w.llIIIlIlllIlIIl(var3) && w.llIIIlIlllIlIII(var3.isDead() ? 1 : 0)) {
            if (w.llIIIlIlllIlIIl(var7)) {
                WorldArea var6 = var3.getWorldArea();
                WorldArea var5 = var7.getWorldArea();
                if (w.llIIIlIlllIlIII(var5.contains(var3.getWorldLocation()) ? 1 : 0)) {
                    WorldPoint var8 = var6.toWorldPointList().stream().flatMap(worldPoint -> {
                        WorldPoint[] worldPointArray = new WorldPoint[lIllIIlIIlIII[2]];
                        worldPointArray[w.lIllIIlIIlIII[0]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[1]);
                        worldPointArray[w.lIllIIlIIlIII[1]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[3]);
                        worldPointArray[w.lIllIIlIIlIII[4]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[3]);
                        worldPointArray[w.lIllIIlIIlIII[5]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[1]);
                        return Stream.of(worldPointArray);
                    }).max(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var7.getWorldLocation()))).orElse(var6.getCenter());
                    Movement.walkTo((WorldPoint)var8);
                    0;
                    var1.sleep(lIllIIlIIlIII[2]);
                    return lIllIIlIIlIII[1];
                }
            }
            return var1.e(var3);
        }
        if (!w.llIIIlIlllIlIIl(var7) || w.llIIIlIlllIIlll(var7.isDead() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        return this.e((NPC)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(NPC nPC) {
        void var2_2;
        SpellBook.Ancient var4;
        SpellBook.Ancient ancient;
        if (w.llIIIlIlllIIlll(this.as.useBloodBarrage() ? 1 : 0)) {
            ancient = SpellBook.Ancient.BLOOD_BARRAGE;
            0;
            if (2 <= ((33 + 83 - 40 + 140 ^ 29 + 18 - -88 + 14) & (63 + 167 - 59 + 68 ^ 100 + 78 - 142 + 126 ^ -1))) {
                return ((0x8F ^ 0x98 ^ (0x83 ^ 0x9E)) & (0x34 ^ 0x2E ^ (0x7B ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            ancient = SpellBook.Ancient.BLOOD_BURST;
        }
        if (w.llIIIlIlllIlIII((var4 = ancient).canCast() ? 1 : 0)) {
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

    private static void llIIIlIlllIIllI() {
        lIllIIlIIlIII = new int[6];
        w.lIllIIlIIlIII[0] = (0x8D ^ 0x81) & ~(0x3C ^ 0x30);
        w.lIllIIlIIlIII[1] = 1;
        w.lIllIIlIIlIII[2] = 131 + 142 - 177 + 48 ^ 136 + 38 - 78 + 52;
        w.lIllIIlIIlIII[3] = -1;
        w.lIllIIlIIlIII[4] = 2;
        w.lIllIIlIIlIII[5] = 3;
    }

    private static boolean llIIIlIlllIlIIl(Object object) {
        return object != null;
    }
}

