/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

/* TASK: Runnin up on a Totem -> RunninuponatotemTask */
@TaskDesc(name="Runnin up on a Totem", priority=1)
public class am
extends al {
    private static final /* synthetic */ Logger ed;
    private static /* synthetic */ int[] llllIllIIIII;

    private static boolean lIIlIIIlIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean cr() {
        return llllIllIIIII[0];
    }

    private static boolean lIIlIIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIlIIllllI(int n2) {
        return n2 > 0;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIIIlIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIlIIIIl(Object object) {
        return object == null;
    }

    @Inject
    protected am(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIlIIIlIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        am.lIIlIIIlIIlllII();
        ed = LoggerFactory.getLogger(am.class);
    }

    @Override
    public boolean bY() {
        int var9;
        int n2;
        int var7;
        int n3;
        am var1;
        if (am.lIIlIIIlIIlllIl(this.cu() ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIllllI(var1.cM.at())) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIlllIl(e.ax().isEmpty() ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIlllll(var1.cJ.aX())) {
            n3 = llllIllIIIII[1];
            0;
            if (-(0xB3 ^ 0xB7) >= 0) {
                return false;
            }
        } else {
            n3 = llllIllIIIII[0];
        }
        if (am.lIIlIIIlIlIIIII(var7 = n3)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIlllll(var1.cJ.aY())) {
            n2 = llllIllIIIII[1];
            0;
            
            }
        } else {
            n2 = llllIllIIIII[0];
        }
        if (am.lIIlIIIlIlIIIII(var9 = n2)) {
            return llllIllIIIII[0];
        }
        Player var3 = Players.getLocal();
        Actor var2 = var3.getInteracting();
        if (am.lIIlIIIlIlIIIIl(var2)) {
            return llllIllIIIII[0];
        }
        List var6 = NPCs.getAll(nPC -> {
            int n2;
            if (am.lIIlIIIlIlIIIII(SquireNightmarePlugin.q.contains(nPC.getId()) ? 1 : 0) && am.lIIlIIIlIlIIIII(this.cM.ag.containsKey(nPC.getId()) ? 1 : 0) && am.lIIlIIIlIlIIIll(this.cM.ag.get(nPC.getId()), llllIllIIIII[4])) {
                n2 = llllIllIIIII[1];
                0;
                if (-1 > (34 + 93 - -41 + 8 ^ 73 + 15 - 45 + 137)) {
                    return false;
                }
            } else {
                n2 = llllIllIIIII[0];
            }
            return n2 != 0;
        });
        if (am.lIIlIIIlIlIIIII(var6.isEmpty() ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIlIIIlI(var6.size(), llllIllIIIII[1])) {
            return llllIllIIIII[0];
        }
        RectangularArea var8 = e.ay();
        NPC var4 = (NPC)var6.get(llllIllIIIII[0]);
        if (am.lIIlIIIlIIlllll(var8) && am.lIIlIIIlIIlllIl(var8.contains(var4.getWorldLocation()) ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        WorldArea var5 = var4.getWorldLocation().toWorldArea(llllIllIIIII[2], llllIllIIIII[2]);
        if (am.lIIlIIIlIlIIIlI(var4.getWorldArea().distanceTo((Locatable)var3), llllIllIIIII[3])) {
            Movement.setDestination((WorldPoint)var5.getCenter());
            return llllIllIIIII[1];
        }
        return llllIllIIIII[0];
    }

    private static boolean lIIlIIIlIIlllll(Object object) {
        return object != null;
    }

    private static void lIIlIIIlIIlllII() {
        llllIllIIIII = new int[5];
        am.llllIllIIIII[0] = (0x43 ^ 0x4D) & ~(0 ^ 0xE);
        am.llllIllIIIII[1] = 1;
        am.llllIllIIIII[2] = 3;
        am.llllIllIIIII[3] = 0x1A ^ 0x1E;
        am.llllIllIIIII[4] = 52 + 153 - 58 + 53;
    }
}

