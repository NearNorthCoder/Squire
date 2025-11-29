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
        w llllllllllllllIllIIlIlIIllIllIlI;
        if (!w.llIIIlIlllIIlll(this.ar.B() ? 1 : 0) || w.llIIIlIlllIIlll(this.ar.A() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        if (w.llIIIlIlllIlIII(llllllllllllllIllIIlIlIIllIllIlI.ar.H() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        int[] nArray = new int[lIllIIlIIlIII[1]];
        nArray[w.lIllIIlIIlIII[0]] = e.BALFRUG_KREEYATH.n();
        NPC llllllllllllllIllIIlIlIIllIllIIl = NPCs.getNearest((int[])nArray);
        if (w.llIIIlIlllIlIIl(llllllllllllllIllIIlIlIIllIllIIl) && w.llIIIlIlllIlIII(llllllllllllllIllIIlIlIIllIllIIl.isDead() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        int[] nArray2 = new int[lIllIIlIIlIII[1]];
        nArray2[w.lIllIIlIIlIII[0]] = e.TSTANON_KARLAK.n();
        NPC llllllllllllllIllIIlIlIIllIllIII = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIllIIlIIlIII[1]];
        nArray3[w.lIllIIlIIlIII[0]] = e.ZAKLN_GRITCH.n();
        NPC llllllllllllllIllIIlIlIIllIlIlll = NPCs.getNearest((int[])nArray3);
        if (w.llIIIlIlllIlIIl(llllllllllllllIllIIlIlIIllIlIlll) && w.llIIIlIlllIlIII(llllllllllllllIllIIlIlIIllIlIlll.isDead() ? 1 : 0)) {
            if (w.llIIIlIlllIlIIl(llllllllllllllIllIIlIlIIllIllIII)) {
                WorldArea llllllllllllllIllIIlIlIIllIlIllI = llllllllllllllIllIIlIlIIllIlIlll.getWorldArea();
                WorldArea llllllllllllllIllIIlIlIIllIlIlIl = llllllllllllllIllIIlIlIIllIllIII.getWorldArea();
                if (w.llIIIlIlllIlIII(llllllllllllllIllIIlIlIIllIlIlIl.contains(llllllllllllllIllIIlIlIIllIlIlll.getWorldLocation()) ? 1 : 0)) {
                    WorldPoint llllllllllllllIllIIlIlIIllIlIlII = llllllllllllllIllIIlIlIIllIlIllI.toWorldPointList().stream().flatMap(worldPoint -> {
                        WorldPoint[] worldPointArray = new WorldPoint[lIllIIlIIlIII[2]];
                        worldPointArray[w.lIllIIlIIlIII[0]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[1]);
                        worldPointArray[w.lIllIIlIIlIII[1]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[3]);
                        worldPointArray[w.lIllIIlIIlIII[4]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[3]);
                        worldPointArray[w.lIllIIlIIlIII[5]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[1]);
                        return Stream.of(worldPointArray);
                    }).max(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(llllllllllllllIllIIlIlIIllIllIII.getWorldLocation()))).orElse(llllllllllllllIllIIlIlIIllIlIllI.getCenter());
                    Movement.walkTo((WorldPoint)llllllllllllllIllIIlIlIIllIlIlII);
                    "".length();
                    llllllllllllllIllIIlIlIIllIllIlI.sleep(lIllIIlIIlIII[2]);
                    return lIllIIlIIlIII[1];
                }
            }
            return llllllllllllllIllIIlIlIIllIllIlI.e(llllllllllllllIllIIlIlIIllIlIlll);
        }
        if (!w.llIIIlIlllIlIIl(llllllllllllllIllIIlIlIIllIllIII) || w.llIIIlIlllIIlll(llllllllllllllIllIIlIlIIllIllIII.isDead() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        return this.e((NPC)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(NPC nPC) {
        void var2_2;
        SpellBook.Ancient llllllllllllllIllIIlIlIIllIIlllI;
        SpellBook.Ancient ancient;
        if (w.llIIIlIlllIIlll(this.as.useBloodBarrage() ? 1 : 0)) {
            ancient = SpellBook.Ancient.BLOOD_BARRAGE;
            "".length();
            if ("  ".length() <= ((33 + 83 - 40 + 140 ^ 29 + 18 - -88 + 14) & (63 + 167 - 59 + 68 ^ 100 + 78 - 142 + 126 ^ -" ".length()))) {
                return ((0x8F ^ 0x98 ^ (0x83 ^ 0x9E)) & (0x34 ^ 0x2E ^ (0x7B ^ 0x6B) ^ -" ".length())) != 0;
            }
        } else {
            ancient = SpellBook.Ancient.BLOOD_BURST;
        }
        if (w.llIIIlIlllIlIII((llllllllllllllIllIIlIlIIllIIlllI = ancient).canCast() ? 1 : 0)) {
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
        w.lIllIIlIIlIII[1] = " ".length();
        w.lIllIIlIIlIII[2] = 131 + 142 - 177 + 48 ^ 136 + 38 - 78 + 52;
        w.lIllIIlIIlIII[3] = -" ".length();
        w.lIllIIlIIlIII[4] = "  ".length();
        w.lIllIIlIIlIII[5] = "   ".length();
    }

    private static boolean llIIIlIlllIlIIl(Object object) {
        return object != null;
    }
}

