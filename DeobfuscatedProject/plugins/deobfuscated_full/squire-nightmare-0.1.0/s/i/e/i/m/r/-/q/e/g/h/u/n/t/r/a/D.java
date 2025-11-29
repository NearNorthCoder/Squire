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
            0;
            
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
        D var4;
        int n4;
        int n5 = llllIIllIlll[3];
        int n6 = llllIIllIlll[0];
        SquireNightmareConfig squireNightmareConfig = this.ag();
        int n7 = n6 * llllIIllIlll[3];
        if (D.lIIIllllllllIIl(squireNightmareConfig)) {
            n4 = llllIIllIlll[4];
            0;
            
            }
        } else {
            void var2;
            n4 = var2.hashCode();
        }
        int var12 = n7 + n4;
        SquireNightmarePlugin var13 = var4.aB();
        int n8 = var12 * llllIIllIlll[3];
        if (D.lIIIllllllllIIl((Object)var13)) {
            n3 = llllIIllIlll[4];
            0;
            if ((0x13 ^ 0x17) < 0) {
                return (0x21 ^ 0x1B) & ~(0xB0 ^ 0x8A);
            }
        } else {
            n3 = ((Object)((Object)var13)).hashCode();
        }
        var12 = n8 + n3;
        h var8 = var4.u();
        int n9 = var12 * llllIIllIlll[3];
        if (D.lIIIllllllllIIl(var8)) {
            n2 = llllIIllIlll[4];
            0;
            if (2 >= (0x37 ^ 0x33)) {
                return (0x80 ^ 0xA0) & ~(0x37 ^ 0x17);
            }
        } else {
            n2 = var8.hashCode();
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
                h var3;
                h var9;
                block24: {
                    D var10;
                    D var14;
                    block22: {
                        block23: {
                            SquireNightmarePlugin var5;
                            SquireNightmarePlugin var1;
                            block21: {
                                block19: {
                                    block20: {
                                        SquireNightmareConfig var11;
                                        SquireNightmareConfig var7;
                                        block18: {
                                            void var6;
                                            if (D.lIIIlllllllllII(object, (Object)this)) {
                                                return llllIIllIlll[0];
                                            }
                                            if (D.lIIIllllllllIlI(var6 instanceof D)) {
                                                return llllIIllIlll[1];
                                            }
                                            var14 = (D)var6;
                                            if (D.lIIIllllllllIlI(var14.a((Object)var10) ? 1 : 0)) {
                                                return llllIIllIlll[1];
                                            }
                                            var7 = var10.ag();
                                            var11 = var14.ag();
                                            if (!D.lIIIllllllllIIl(var7)) break block18;
                                            if (!D.lIIIlllllllllIl(var11)) break block19;
                                            0;
                                            if (2 > (0xA7 ^ 0xA3)) {
                                                return false;
                                            }
                                            break block20;
                                        }
                                        if (!D.lIIIllllllllIlI(var7.equals(var11) ? 1 : 0)) break block19;
                                    }
                                    return llllIIllIlll[1];
                                }
                                var1 = var10.aB();
                                var5 = var14.aB();
                                if (!D.lIIIllllllllIIl((Object)var1)) break block21;
                                if (!D.lIIIlllllllllIl((Object)var5)) break block22;
                                0;
                                if (3 > (0x3F ^ 0x3B)) {
                                    return false;
                                }
                                break block23;
                            }
                            if (!D.lIIIllllllllIlI(((Object)((Object)var1)).equals((Object)var5) ? 1 : 0)) break block22;
                        }
                        return llllIIllIlll[1];
                    }
                    var9 = var10.u();
                    var3 = var14.u();
                    if (!D.lIIIllllllllIIl(var9)) break block24;
                    if (!D.lIIIlllllllllIl(var3)) break block25;
                    0;
                    
                    }
                    break block26;
                }
                if (!D.lIIIllllllllIlI(var9.equals(var3) ? 1 : 0)) break block25;
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
        D.llllIIllIlll[0] = 1;
        D.llllIIllIlll[1] = (0xC7 ^ 0xA5) & ~(0xC1 ^ 0xA3);
        D.llllIIllIlll[2] = 3;
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

