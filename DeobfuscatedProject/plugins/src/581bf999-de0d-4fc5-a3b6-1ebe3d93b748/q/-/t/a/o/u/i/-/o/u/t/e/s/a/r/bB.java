/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging electric skull", priority=30, blocking=true, register=true)
public class bB
extends bG {
    private static final /* synthetic */ int fY;
    private static final /* synthetic */ int fX;
    private /* synthetic */ int ga;
    private static /* synthetic */ int[] llIIlIlllll;
    private /* synthetic */ WorldPoint fZ;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        bB llllllllllllllllIIllllIllllIIlll;
        if (!bB.lIlIIIIlllIIII(this.fZ) || bB.lIlIIIIlllIIIl(this.cu.getTickCount(), this.ga)) {
            llllllllllllllllIIllllIllllIIlll.fZ = null;
            return llIIlIlllll[0];
        }
        int llllllllllllllllIIllllIllllIIllI = llllllllllllllllIIllllIllllIIlll.fZ.distanceTo(Players.getLocal().getWorldLocation());
        if (!bB.lIlIIIIlllIIlI(llllllllllllllllIIllllIllllIIllI, llIIlIlllll[1]) || bB.lIlIIIIlllIIIl(llllllllllllllllIIllllIllllIIllI, llIIlIlllll[2])) {
            return llIIlIlllll[1];
        }
        llllllllllllllllIIllllIllllIIlll.aY.a(llIIlIlllll[3]);
        WorldPoint llllllllllllllllIIllllIllllIIlIl = llllllllllllllllIIllllIllllIIlll.cn();
        if (bB.lIlIIIIlllIIll(llllllllllllllllIIllllIllllIIlIl) && bB.lIlIIIIlllIIll(llllllllllllllllIIllllIllllIIlIl = llllllllllllllllIIllllIllllIIlll.cm())) {
            return llIIlIlllll[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return llIIlIlllll[1];
    }

    private static boolean lIlIIIIlllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIlllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIlllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIIlllIlIl(int n2) {
        return n2 != 0;
    }

    static {
        bB.lIlIIIIllIllll();
        fX = llIIlIlllll[7];
        fY = llIIlIlllll[9];
    }

    private static boolean lIlIIIIlllIlII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIIIlllIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private WorldPoint cn() {
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIlllll[2]];
        worldPointArray[bB.llIIlIlllll[0]] = this.fZ.dx(llIIlIlllll[5]);
        worldPointArray[bB.llIIlIlllll[1]] = this.fZ.dx(llIIlIlllll[1]);
        worldPointArray[bB.llIIlIlllll[6]] = this.fZ.dy(llIIlIlllll[5]);
        worldPointArray[bB.llIIlIlllll[4]] = this.fZ.dy(llIIlIlllll[1]);
        return Stream.of(worldPointArray).filter(worldPoint -> {
            boolean bl2;
            if (bB.lIlIIIIlllIllI(worldPoint.equals((Object)this.fZ) ? 1 : 0)) {
                bl2 = llIIlIlllll[1];
                "".length();
                if (null != null) {
                    return ((0x37 ^ 0x15 ^ (0xF1 ^ 0x88)) & (69 + 194 - 93 + 38 ^ 81 + 28 - 44 + 74 ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIlIlllll[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            boolean bl2;
            if (bB.lIlIIIIlllIllI(this.co().getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIlIlllll[1];
                "".length();
                if ("   ".length() < " ".length()) {
                    return ((0xA0 ^ 0x99) & ~(0xF8 ^ 0xC1)) != 0;
                }
            } else {
                bl2 = llIIlIlllll[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    @Override
    public void r() {
        super.r();
        this.fZ = null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        void llllllllllllllllIIllllIlllIlllIl;
        void llllllllllllllllIIllllIlllIlllll;
        bB llllllllllllllllIIllllIllllIIIII;
        void llllllllllllllllIIllllIlllIllllI;
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
        if (bB.lIlIIIIlllIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIIlIlllll[7])) {
            if (bB.lIlIIIIlllIIIl(worldPoint.distanceTo((Locatable)Players.getLocal()), llIIlIlllll[2])) {
                return;
            }
            llllllllllllllllIIllllIllllIIIII.fZ = llllllllllllllllIIllllIlllIllllI;
            llllllllllllllllIIllllIllllIIIII.ga = llllllllllllllllIIllllIllllIIIII.cu.getTickCount() + llIIlIlllll[8];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        } else if (bB.lIlIIIIlllIlII(llllllllllllllllIIllllIlllIlllll.getGraphicsObject().getId(), llIIlIlllll[9]) && bB.lIlIIIIlllIlIl((llllllllllllllllIIllllIlllIlllIl = llllllllllllllllIIllllIlllIllllI).equals((Object)llllllllllllllllIIllllIllllIIIII.fZ) ? 1 : 0)) {
            llllllllllllllllIIllllIllllIIIII.fZ = null;
        }
    }

    private WorldPoint cm() {
        return Players.getLocal().getWorldLocation().createWorldArea(llIIlIlllll[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bB.lIlIIIIlllIIIl(worldPoint.distanceTo(this.fZ), llIIlIlllll[2])) {
                bl2 = llIIlIlllll[1];
                "".length();
                if (null != null) {
                    return ((0x60 ^ 0x4C) & ~(0x36 ^ 0x1A)) != 0;
                }
            } else {
                bl2 = llIIlIlllll[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    private static void lIlIIIIllIllll() {
        llIIlIlllll = new int[10];
        bB.llIIlIlllll[0] = (0x81 ^ 0xAE ^ (0x81 ^ 0x9B)) & (0xB2 ^ 0xBD ^ (0x7E ^ 0x44) ^ -" ".length());
        bB.llIIlIlllll[1] = " ".length();
        bB.llIIlIlllll[2] = 0x89 ^ 0x8D;
        bB.llIIlIlllll[3] = 0x4D ^ 0x57 ^ (0xB ^ 0x32);
        bB.llIIlIlllll[4] = "   ".length();
        bB.llIIlIlllll[5] = -" ".length();
        bB.llIIlIlllll[6] = "  ".length();
        bB.llIIlIlllll[7] = -(0xFFFF9EDB & 0x7B75) & (0xFFFF9FFF & 0x7FF7);
        bB.llIIlIlllll[8] = 0xA3 ^ 0xA5 ^ "   ".length();
        bB.llIIlIlllll[9] = 0xFFFF8DD7 & 0x7ABE;
    }

    @Inject
    protected bB(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIIIIlllIIll(Object object) {
        return object == null;
    }
}

