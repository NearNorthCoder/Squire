/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.C;
import java.util.Objects;
import net.runelite.api.Player;

public class B {
    private final /* synthetic */ C bT;
    private static /* synthetic */ int[] lIlIIIIllIII;
    private /* synthetic */ int bU;
    private final /* synthetic */ Player bS;

    private static void llIlIlIIllllII() {
        lIlIIIIllIII = new int[3];
        B.lIlIIIIllIII[0] = " ".length();
        B.lIlIIIIllIII[1] = "  ".length();
        B.lIlIIIIllIII[2] = (0x33 ^ 3) & ~(0x67 ^ 0x57);
    }

    private static boolean llIlIlIlIIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        B.llIlIlIIllllII();
    }

    public int bB() {
        return this.bU;
    }

    public B(Player player, C c2) {
        this.bS = player;
        this.bT = c2;
        this.bU = c2.bB();
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        int n2;
        B lllllllllllllllIlllIIIlIlIllllIl;
        void lllllllllllllllIlllIIIlIlIllllII;
        if (B.llIlIlIIlllllI(this, object)) {
            return lIlIIIIllIII[0];
        }
        if (!B.llIlIlIIllllll(lllllllllllllllIlllIIIlIlIllllII) || B.llIlIlIlIIIIII(lllllllllllllllIlllIIIlIlIllllIl.getClass(), lllllllllllllllIlllIIIlIlIllllII.getClass())) {
            return lIlIIIIllIII[2];
        }
        B lllllllllllllllIlllIIIlIlIlllIll = (B)lllllllllllllllIlllIIIlIlIllllII;
        if (B.llIlIlIlIIIIIl(Objects.equals(lllllllllllllllIlllIIIlIlIllllIl.bS.getName(), lllllllllllllllIlllIIIlIlIlllIll.bS.getName()) ? 1 : 0) && B.llIlIlIIlllllI((Object)lllllllllllllllIlllIIIlIlIllllIl.bT, (Object)lllllllllllllllIlllIIIlIlIlllIll.bT)) {
            n2 = lIlIIIIllIII[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0xB ^ 0x30) & ~(0xB7 ^ 0x8C)) != 0;
            }
        } else {
            n2 = lIlIIIIllIII[2];
        }
        return n2 != 0;
    }

    private static boolean llIlIlIIllllIl(int n2) {
        return n2 > 0;
    }

    public Player bz() {
        return this.bS;
    }

    public void by() {
        if (B.llIlIlIIllllIl(this.bU)) {
            this.bU -= lIlIIIIllIII[0];
        }
    }

    private static boolean llIlIlIlIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlIIllllll(Object object) {
        return object != null;
    }

    public C bA() {
        return this.bT;
    }

    public int hashCode() {
        Object[] objectArray = new Object[lIlIIIIllIII[1]];
        objectArray[B.lIlIIIIllIII[2]] = this.bS.getName();
        objectArray[B.lIlIIIIllIII[0]] = this.bT;
        return Objects.hash(objectArray);
    }

    private static boolean llIlIlIIlllllI(Object object, Object object2) {
        return object == object2;
    }
}

