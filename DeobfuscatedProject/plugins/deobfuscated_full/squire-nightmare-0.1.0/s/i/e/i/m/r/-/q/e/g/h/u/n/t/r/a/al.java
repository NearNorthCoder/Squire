/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

public abstract class al
extends C {
    private static final /* synthetic */ Logger eb;
    private static /* synthetic */ int[] llllIIllIlIl;
    protected final /* synthetic */ f ec;

    public abstract EquipmentSetup cq();

    @Override
    public boolean bY() {
        if (al.lIIIlllllllIIll(this.cK.assistantMode() ? 1 : 0)) {
            return llllIIllIlIl[0];
        }
        return this.cr();
    }

    public boolean x(NPC nPC) {
        return this.ec.a(nPC, this.cq());
    }

    private static void lIIIlllllllIIlI() {
        llllIIllIlIl = new int[2];
        al.llllIIllIlIl[0] = (0x6F ^ 0x38 ^ (0x43 ^ 0x2F)) & (3 ^ 0x29 ^ (0x18 ^ 9) ^ -1);
        al.llllIIllIlIl[1] = 1;
    }

    protected boolean cw() {
        int n2;
        TileObject tileObject = j.aV();
        RectangularArea rectangularArea = e.ay();
        Player player = Players.getLocal();
        if (al.lIIIlllllllIlll(tileObject) && al.lIIIlllllllIlll(rectangularArea) && al.lIIIlllllllIlIl(rectangularArea.contains(player.getWorldLocation()) ? 1 : 0)) {
            n2 = llllIIllIlIl[1];
            0;
            if ((0x6A ^ 0x64 ^ (0x33 ^ 0x39)) < 3) {
                return ((0x1C ^ 0x40 ^ (0x11 ^ 0x57)) & (142 + 78 - 131 + 88 ^ 61 + 80 - -23 + 7 ^ -1)) != 0;
            }
        } else {
            n2 = llllIIllIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlllllllIlIl(int n2) {
        return n2 == 0;
    }

    protected boolean cx() {
        List<WorldArea> list = e.ax();
        if (al.lIIIlllllllIlIl(list.isEmpty() ? 1 : 0)) {
            WorldPoint worldPoint = Players.getLocal().getWorldLocation();
            return list.stream().anyMatch(worldArea -> worldArea.contains(worldPoint));
        }
        return llllIIllIlIl[0];
    }

    protected boolean cy() {
        return this.cS.getWorldArea().contains(Players.getLocal().getWorldLocation());
    }

    private static boolean lIIIlllllllIlII(int n2, int n3) {
        return n2 != n3;
    }

    protected al(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
        this.ec = f2;
    }

    private static boolean lIIIlllllllIIll(int n2) {
        return n2 != 0;
    }

    static {
        al.lIIIlllllllIIlI();
        eb = LoggerFactory.getLogger(al.class);
    }

    protected boolean cv() {
        return this.cM.Y().contains(Players.getLocal().getWorldLocation());
    }

    protected boolean cz() {
        int n2;
        if (al.lIIIlllllllIIll(Players.getLocal().isMoving() ? 1 : 0) && al.lIIIlllllllIlll(Movement.getDestination())) {
            n2 = llllIIllIlIl[1];
            0;
            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = llllIIllIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlllllllIlll(Object object) {
        return object != null;
    }

    public abstract boolean cr();

    private static boolean lIIIlllllllIllI(int n2) {
        return n2 > 0;
    }

    protected boolean cu() {
        int n2;
        al var1;
        if (al.lIIIlllllllIlII(this.cM.ap(), llllIIllIlIl[1]) && al.lIIIlllllllIlIl(this.cz() ? 1 : 0) && !al.lIIIlllllllIIll(this.cv() ? 1 : 0) || al.lIIIlllllllIllI(var1.cM.ap()) && al.lIIIlllllllIIll(var1.cy() ? 1 : 0)) {
            n2 = llllIIllIlIl[1];
            0;
            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = llllIIllIlIl[0];
        }
        return n2 != 0;
    }
}

