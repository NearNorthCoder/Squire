package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import net.runelite.api.Actor;
import net.runelite.api.Prayer;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aS  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aS.class */
final class aS {
    private final /* synthetic */ Prayer ep;
    private final /* synthetic */ Actor eo;
    private static /* synthetic */ int[] llIlIIlIIlI;

    public aS(Actor actor, Prayer prayer) {
        this.eo = actor;
        this.ep = prayer;
    }

    private static boolean lIlIIlIlIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIlIlIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public Prayer bI() {
        return this.ep;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        if (lIlIIlIlIlIlII(r0.equals(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
        if (lIlIIlIlIlIlII(r0.equals(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIlIIlIlIlIIll(obj, this)) {
            return llIlIIlIIlI[1];
        }
        if (lIlIIlIlIlIlII(obj instanceof aS ? 1 : 0)) {
            return llIlIIlIIlI[3];
        }
        aS aSVar = (aS) obj;
        Actor bH = bH();
        Actor bH2 = aSVar.bH();
        if (lIlIIlIlIlIIlI(bH)) {
            if (lIlIIlIlIlIlIl(bH2)) {
                "".length();
                if (((((55 + 100) - 10) + 23) ^ (((72 + 100) - 72) + 72)) <= 0) {
                    return ((187 ^ 175) ^ (224 ^ 192)) & (((195 ^ 151) ^ (91 ^ 59)) ^ (-" ".length()));
                }
                return llIlIIlIIlI[3];
            }
            Prayer bI = bI();
            Prayer bI2 = aSVar.bI();
            if (lIlIIlIlIlIIlI(bI)) {
                if (lIlIIlIlIlIlIl(bI2)) {
                    "".length();
                    if ("  ".length() < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llIlIIlIIlI[3];
                }
                return llIlIIlIIlI[1];
            }
        }
    }

    public String toString() {
        return "BabboonPrayerHandler.BaboonAttack(baboon=" + String.valueOf(bH()) + ", style=" + String.valueOf(bI()) + ")";
    }

    static {
        lIlIIlIlIlIIIl();
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = llIlIIlIIlI[0];
        int i2 = llIlIIlIIlI[1];
        Actor bH = bH();
        int i3 = i2 * llIlIIlIIlI[0];
        if (lIlIIlIlIlIIlI(bH)) {
            hashCode = llIlIIlIIlI[2];
            "".length();
            if ((-(46 ^ 43)) >= 0) {
                return (112 ^ 69) & ((176 ^ 133) ^ (-1));
            }
        } else {
            hashCode = bH.hashCode();
        }
        int i4 = i3 + hashCode;
        Prayer bI = bI();
        int i5 = i4 * llIlIIlIIlI[0];
        if (lIlIIlIlIlIIlI(bI)) {
            hashCode2 = llIlIIlIIlI[2];
            "".length();
            if (((1 ^ 59) & ((182 ^ 140) ^ (-1))) > 0) {
                return (105 ^ 85) & ((169 ^ 149) ^ (-1));
            }
        } else {
            hashCode2 = bI.hashCode();
        }
        return i5 + hashCode2;
    }

    private static boolean lIlIIlIlIlIlII(int i) {
        return i == 0;
    }

    public Actor bH() {
        return this.eo;
    }

    private static void lIlIIlIlIlIIIl() {
        llIlIIlIIlI = new int[4];
        llIlIIlIIlI[0] = (21 ^ 71) ^ (120 ^ 17);
        llIlIIlIIlI[1] = " ".length();
        llIlIIlIIlI[2] = (128 ^ 150) ^ (30 ^ 35);
        llIlIIlIIlI[3] = (195 ^ 147) & ((2 ^ 82) ^ (-1));
    }

    private static boolean lIlIIlIlIlIlIl(Object obj) {
        return obj != null;
    }
}
