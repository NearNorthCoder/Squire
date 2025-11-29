package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

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
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/D.class */
public abstract class D extends Task {
    protected final /* synthetic */ C0011h cX;
    private static /* synthetic */ int[] llllIIllIlll;
    protected final /* synthetic */ SquireNightmareConfig cV;
    protected final /* synthetic */ SquireNightmarePlugin cW;
    protected static final /* synthetic */ WorldPoint cU;

    public SquireNightmarePlugin aB() {
        return this.cW;
    }

    public String toString() {
        return "OutsideTask(config=" + ag() + ", plugin=" + aB() + ", lootManager=" + u() + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<Integer> ca() {
        EquipmentSetup equipmentSetup = (EquipmentSetup) this.cV.totemGear().selected(EquipmentSetup.class);
        if (lIIIllllllllIIl(equipmentSetup)) {
            return null;
        }
        return ItemVariationMapping.getVariations(equipmentSetup.get(EquipmentInventorySlot.WEAPON));
    }

    public SquireNightmareConfig ag() {
        return this.cV;
    }

    private static boolean lIIIlllllllllIl(Object obj) {
        return obj != null;
    }

    static {
        lIIIllllllllIII();
        cU = new WorldPoint(llllIIllIlll[5], llllIIllIlll[6], llllIIllIlll[0]);
    }

    private static boolean lIIIllllllllIll(int i, int i2) {
        return i == i2;
    }

    public C0011h u() {
        return this.cX;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean cb() {
        if (lIIIllllllllIlI(Movement.isStaminaBoosted() ? 1 : 0) && lIIIllllllllIlI(C0013j.aU() ? 1 : 0)) {
            ?? r0 = llllIIllIlll[0];
            "".length();
            return 0 != 0 ? ((((225 + 146) - 327) + 183) ^ (((8 + 2) - (-91)) + 91)) & (((((62 + 147) - 24) + 1) ^ (((48 + 145) - 130) + 90)) ^ (-" ".length())) : r0;
        }
        return llllIIllIlll[1];
    }

    private static boolean lIIIlllllllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    protected boolean a(Object obj) {
        return obj instanceof D;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = llllIIllIlll[3];
        int i2 = llllIIllIlll[0];
        SquireNightmareConfig ag = ag();
        int i3 = i2 * llllIIllIlll[3];
        if (lIIIllllllllIIl(ag)) {
            hashCode = llllIIllIlll[4];
            "".length();
            if (0 != 0) {
                return (70 ^ 101) & ((83 ^ 112) ^ (-1));
            }
        } else {
            hashCode = ag.hashCode();
        }
        int i4 = i3 + hashCode;
        SquireNightmarePlugin aB = aB();
        int i5 = i4 * llllIIllIlll[3];
        if (lIIIllllllllIIl(aB)) {
            hashCode2 = llllIIllIlll[4];
            "".length();
            if ((19 ^ 23) < 0) {
                return (33 ^ 27) & ((176 ^ 138) ^ (-1));
            }
        } else {
            hashCode2 = aB.hashCode();
        }
        int i6 = i5 + hashCode2;
        C0011h u = u();
        int i7 = i6 * llllIIllIlll[3];
        if (lIIIllllllllIIl(u)) {
            hashCode3 = llllIIllIlll[4];
            "".length();
            if ("  ".length() >= (55 ^ 51)) {
                return (128 ^ 160) & ((55 ^ 23) ^ (-1));
            }
        } else {
            hashCode3 = u.hashCode();
        }
        return i7 + hashCode3;
    }

    private static boolean lIIIllllllllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (lIIIllllllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (lIIIllllllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
        if (lIIIllllllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIlllllllllII(obj, this)) {
            return llllIIllIlll[0];
        }
        if (lIIIllllllllIlI(obj instanceof D ? 1 : 0)) {
            return llllIIllIlll[1];
        }
        D d = (D) obj;
        if (lIIIllllllllIlI(d.a(this) ? 1 : 0)) {
            return llllIIllIlll[1];
        }
        SquireNightmareConfig ag = ag();
        SquireNightmareConfig ag2 = d.ag();
        if (lIIIllllllllIIl(ag)) {
            if (lIIIlllllllllIl(ag2)) {
                "".length();
                if ("  ".length() > (167 ^ 163)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return llllIIllIlll[1];
            }
            SquireNightmarePlugin aB = aB();
            SquireNightmarePlugin aB2 = d.aB();
            if (lIIIllllllllIIl(aB)) {
                if (lIIIlllllllllIl(aB2)) {
                    "".length();
                    if ("   ".length() > (63 ^ 59)) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llllIIllIlll[1];
                }
                C0011h u = u();
                C0011h u2 = d.u();
                if (lIIIllllllllIIl(u)) {
                    if (lIIIlllllllllIl(u2)) {
                        "".length();
                        if (0 != 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return llllIIllIlll[1];
                    }
                    return llllIIllIlll[0];
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public D(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        this.cV = squireNightmareConfig;
        this.cW = squireNightmarePlugin;
        this.cX = c0011h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lIIIllllllllIll(Players.getLocal().getWorldLocation().getPlane(), llllIIllIlll[2]) ? llllIIllIlll[1] : bY();
    }

    private static void lIIIllllllllIII() {
        llllIIllIlll = new int[7];
        llllIIllIlll[0] = " ".length();
        llllIIllIlll[1] = (199 ^ 165) & ((193 ^ 163) ^ (-1));
        llllIIllIlll[2] = "   ".length();
        llllIIllIlll[3] = 5 ^ 62;
        llllIIllIlll[4] = 133 ^ 174;
        llllIIllIlll[5] = (-((-19271) & 27494)) & (-1) & 12031;
        llllIIllIlll[6] = (-((-9425) & 32217)) & (-69) & 32639;
    }

    private static boolean lIIIllllllllIlI(int i) {
        return i == 0;
    }

    public abstract boolean bY();
}
