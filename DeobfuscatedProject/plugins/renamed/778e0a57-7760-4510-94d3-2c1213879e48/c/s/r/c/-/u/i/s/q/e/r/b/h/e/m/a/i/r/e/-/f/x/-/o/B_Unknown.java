/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.CEnum;
import java.util.Objects;
import net.runelite.api.Player;

public class B_Unknown {
    private final /* synthetic */ C bT;
    private static /* synthetic */ int[] lIlIIIIllIII;
    private /* synthetic */ int bU;
    private final /* synthetic */ Player bS;

    private static void llIlIlIIllllII() {
        lIlIIIIllIII = new int[3];
        B.lIlIIIIllIII[0] = 1;
        B.lIlIIIIllIII[1] = 2;
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
        B var3;
        void var2;
        if (B.llIlIlIIlllllI(this, object)) {
            return lIlIIIIllIII[0];
        }
        if (!B.llIlIlIIllllll(var2) || B.llIlIlIlIIIIII(var3.getClass(), var2.getClass())) {
            return lIlIIIIllIII[2];
        }
        B var1 = (B)var2;
        if (B.llIlIlIlIIIIIl(Objects.equals(var3.bS.getName(), var1.bS.getName()) ? 1 : 0) && B.llIlIlIIlllllI((Object)var3.bT, (Object)var1.bT)) {
            n2 = lIlIIIIllIII[0];
            0;
            if (2 >= 3) {
                return false;
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

