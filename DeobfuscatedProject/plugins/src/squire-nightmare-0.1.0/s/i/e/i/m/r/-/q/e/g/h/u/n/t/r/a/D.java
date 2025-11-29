/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.game.ItemVariationMapping
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.Collection;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

public abstract class D
extends Task {
    protected final /* synthetic */ h cX;
    private static /* synthetic */ int[] llllIIllIlll;
    protected final /* synthetic */ SquireNightmareConfig cV;
    protected final /* synthetic */ SquireNightmarePlugin cW;
    protected static final /* synthetic */ WorldPoint cU;

    public SquireNightmarePlugin aB() {
        return this.cW;
    }

    public String toString() {
        return "OutsideTask(config=" + this.ag() + ", plugin=" + this.aB() + ", lootManager=" + this.u() + ")";
    }

    protected Collection<Integer> ca() {
        EquipmentSetup equipmentSetup = (EquipmentSetup)this.cV.totemGear().selected(EquipmentSetup.class);
        if (D.lIIIllllllllIIl(equipmentSetup)) {
            return null;
        }
        int n2 = equipmentSetup.get(EquipmentInventorySlot.WEAPON);
        return ItemVariationMapping.getVariations((int)n2);
    }

    public SquireNightmareConfig ag() {
        return this.cV;
    }

    private static boolean lIIIlllllllllIl(Object object) {
        return object != null;
    }

    static {
        D.lIIIllllllllIII();
        cU = new WorldPoint(llllIIllIlll[5], llllIIllIlll[6], llllIIllIlll[0]);
    }

    private static boolean lIIIllllllllIll(int n2, int n3) {
        return n2 == n3;
    }

    public h u() {
        return this.cX;
    }

    protected boolean cb() {
        int n2;
        if (D.lIIIllllllllIlI(Movement.isStaminaBoosted() ? 1 : 0) && D.lIIIllllllllIlI(j.aU() ? 1 : 0)) {
            n2 = llllIIllIlll[0];
            "".length();
            if (null != null) {
                return ((225 + 146 - 327 + 183 ^ 8 + 2 - -91 + 91) & (62 + 147 - 24 + 1 ^ 48 + 145 - 130 + 90 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllIIllIlll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIlllllllllII(Object object, Object object2) {
        return object == object2;
    }

    protected boolean a(Object object) {
        return object instanceof D;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        D lllllllllllllllIIlIlllIIlllIIIII;
        int n4;
        int n5 = llllIIllIlll[3];
        int n6 = llllIIllIlll[0];
        SquireNightmareConfig squireNightmareConfig = this.ag();
        int n7 = n6 * llllIIllIlll[3];
        if (D.lIIIllllllllIIl(squireNightmareConfig)) {
            n4 = llllIIllIlll[4];
            "".length();
            if (null != null) {
                return (0x46 ^ 0x65) & ~(0x53 ^ 0x70);
            }
        } else {
            void lllllllllllllllIIlIlllIIllIlllIl;
            n4 = lllllllllllllllIIlIlllIIllIlllIl.hashCode();
        }
        int lllllllllllllllIIlIlllIIllIllllI = n7 + n4;
        SquireNightmarePlugin lllllllllllllllIIlIlllIIllIlllII = lllllllllllllllIIlIlllIIlllIIIII.aB();
        int n8 = lllllllllllllllIIlIlllIIllIllllI * llllIIllIlll[3];
        if (D.lIIIllllllllIIl((Object)lllllllllllllllIIlIlllIIllIlllII)) {
            n3 = llllIIllIlll[4];
            "".length();
            if ((0x13 ^ 0x17) < 0) {
                return (0x21 ^ 0x1B) & ~(0xB0 ^ 0x8A);
            }
        } else {
            n3 = ((Object)((Object)lllllllllllllllIIlIlllIIllIlllII)).hashCode();
        }
        lllllllllllllllIIlIlllIIllIllllI = n8 + n3;
        h lllllllllllllllIIlIlllIIllIllIll = lllllllllllllllIIlIlllIIlllIIIII.u();
        int n9 = lllllllllllllllIIlIlllIIllIllllI * llllIIllIlll[3];
        if (D.lIIIllllllllIIl(lllllllllllllllIIlIlllIIllIllIll)) {
            n2 = llllIIllIlll[4];
            "".length();
            if ("  ".length() >= (0x37 ^ 0x33)) {
                return (0x80 ^ 0xA0) & ~(0x37 ^ 0x17);
            }
        } else {
            n2 = lllllllllllllllIIlIlllIIllIllIll.hashCode();
        }
        n6 = n9 + n2;
        return n6;
    }

    private static boolean lIIIllllllllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block25: {
            block26: {
                h lllllllllllllllIIlIlllIIlllIIlll;
                h lllllllllllllllIIlIlllIIlllIlIII;
                block24: {
                    D lllllllllllllllIIlIlllIIlllIllll;
                    D lllllllllllllllIIlIlllIIlllIllIl;
                    block22: {
                        block23: {
                            SquireNightmarePlugin lllllllllllllllIIlIlllIIlllIlIIl;
                            SquireNightmarePlugin lllllllllllllllIIlIlllIIlllIlIlI;
                            block21: {
                                block19: {
                                    block20: {
                                        SquireNightmareConfig lllllllllllllllIIlIlllIIlllIlIll;
                                        SquireNightmareConfig lllllllllllllllIIlIlllIIlllIllII;
                                        block18: {
                                            void lllllllllllllllIIlIlllIIlllIlllI;
                                            if (D.lIIIlllllllllII(object, (Object)this)) {
                                                return llllIIllIlll[0];
                                            }
                                            if (D.lIIIllllllllIlI(lllllllllllllllIIlIlllIIlllIlllI instanceof D)) {
                                                return llllIIllIlll[1];
                                            }
                                            lllllllllllllllIIlIlllIIlllIllIl = (D)lllllllllllllllIIlIlllIIlllIlllI;
                                            if (D.lIIIllllllllIlI(lllllllllllllllIIlIlllIIlllIllIl.a((Object)lllllllllllllllIIlIlllIIlllIllll) ? 1 : 0)) {
                                                return llllIIllIlll[1];
                                            }
                                            lllllllllllllllIIlIlllIIlllIllII = lllllllllllllllIIlIlllIIlllIllll.ag();
                                            lllllllllllllllIIlIlllIIlllIlIll = lllllllllllllllIIlIlllIIlllIllIl.ag();
                                            if (!D.lIIIllllllllIIl(lllllllllllllllIIlIlllIIlllIllII)) break block18;
                                            if (!D.lIIIlllllllllIl(lllllllllllllllIIlIlllIIlllIlIll)) break block19;
                                            "".length();
                                            if ("  ".length() > (0xA7 ^ 0xA3)) {
                                                return ((0xB6 ^ 0xBE) & ~(0x5E ^ 0x56)) != 0;
                                            }
                                            break block20;
                                        }
                                        if (!D.lIIIllllllllIlI(lllllllllllllllIIlIlllIIlllIllII.equals(lllllllllllllllIIlIlllIIlllIlIll) ? 1 : 0)) break block19;
                                    }
                                    return llllIIllIlll[1];
                                }
                                lllllllllllllllIIlIlllIIlllIlIlI = lllllllllllllllIIlIlllIIlllIllll.aB();
                                lllllllllllllllIIlIlllIIlllIlIIl = lllllllllllllllIIlIlllIIlllIllIl.aB();
                                if (!D.lIIIllllllllIIl((Object)lllllllllllllllIIlIlllIIlllIlIlI)) break block21;
                                if (!D.lIIIlllllllllIl((Object)lllllllllllllllIIlIlllIIlllIlIIl)) break block22;
                                "".length();
                                if ("   ".length() > (0x3F ^ 0x3B)) {
                                    return ((0xEE ^ 0xC1) & ~(0x70 ^ 0x5F)) != 0;
                                }
                                break block23;
                            }
                            if (!D.lIIIllllllllIlI(((Object)((Object)lllllllllllllllIIlIlllIIlllIlIlI)).equals((Object)lllllllllllllllIIlIlllIIlllIlIIl) ? 1 : 0)) break block22;
                        }
                        return llllIIllIlll[1];
                    }
                    lllllllllllllllIIlIlllIIlllIlIII = lllllllllllllllIIlIlllIIlllIllll.u();
                    lllllllllllllllIIlIlllIIlllIIlll = lllllllllllllllIIlIlllIIlllIllIl.u();
                    if (!D.lIIIllllllllIIl(lllllllllllllllIIlIlllIIlllIlIII)) break block24;
                    if (!D.lIIIlllllllllIl(lllllllllllllllIIlIlllIIlllIIlll)) break block25;
                    "".length();
                    if (null != null) {
                        return ((0x55 ^ 0x16) & ~(0xE4 ^ 0xA7)) != 0;
                    }
                    break block26;
                }
                if (!D.lIIIllllllllIlI(lllllllllllllllIIlIlllIIlllIlIII.equals(lllllllllllllllIIlIlllIIlllIIlll) ? 1 : 0)) break block25;
            }
            return llllIIllIlll[1];
        }
        return llllIIllIlll[0];
    }

    protected D(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        this.cV = squireNightmareConfig;
        this.cW = squireNightmarePlugin;
        this.cX = h2;
    }

    public boolean run() {
        if (D.lIIIllllllllIll(Players.getLocal().getWorldLocation().getPlane(), llllIIllIlll[2])) {
            return llllIIllIlll[1];
        }
        return this.bY();
    }

    private static void lIIIllllllllIII() {
        llllIIllIlll = new int[7];
        D.llllIIllIlll[0] = " ".length();
        D.llllIIllIlll[1] = (0xC7 ^ 0xA5) & ~(0xC1 ^ 0xA3);
        D.llllIIllIlll[2] = "   ".length();
        D.llllIIllIlll[3] = 5 ^ 0x3E;
        D.llllIIllIlll[4] = 0x85 ^ 0xAE;
        D.llllIIllIlll[5] = -(0xFFFFB4B9 & 0x6B66) & (0xFFFFFFFF & 0x2EFF);
        D.llllIIllIlll[6] = -(0xFFFFDB2F & 0x7DD9) & (0xFFFFFFBB & 0x7F7F);
    }

    private static boolean lIIIllllllllIlI(int n2) {
        return n2 == 0;
    }

    public abstract boolean bY();
}

