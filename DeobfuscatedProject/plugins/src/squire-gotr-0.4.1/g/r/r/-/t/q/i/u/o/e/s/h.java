/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import gg.squire.client.plugins.fw.Task;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.util.function.BooleanSupplier;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public abstract class h
extends Task {
    private /* synthetic */ int ba;
    protected static final /* synthetic */ int aR;
    private /* synthetic */ boolean bb;
    private /* synthetic */ int aY;
    protected final /* synthetic */ SquireGOTRConfig aW;
    protected final /* synthetic */ SquireGOTRPlugin aV;
    protected static final /* synthetic */ int aT;
    private final /* synthetic */ c[] aX;
    protected static final /* synthetic */ int aU;
    private /* synthetic */ BooleanSupplier aZ;
    private static /* synthetic */ int[] llIlIIIIlIII;
    protected static final /* synthetic */ int aS;

    private static boolean lIIIIIIIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIIllllI(int n2) {
        return n2 == 0;
    }

    private boolean ai() {
        h lllllllllllllllIlIIlIlIIllIlllIl;
        if (h.lIIIIIIIIIllllI(this.aX.length)) {
            return llIlIIIIlIII[0];
        }
        c[] lllllllllllllllIlIIlIlIIllIlllII = lllllllllllllllIlIIlIlIIllIlllIl.aX;
        int lllllllllllllllIlIIlIlIIllIllIll = lllllllllllllllIlIIlIlIIllIlllII.length;
        int lllllllllllllllIlIIlIlIIllIllIlI = llIlIIIIlIII[1];
        while (h.lIIIIIIIIlIIIIl(lllllllllllllllIlIIlIlIIllIllIlI, lllllllllllllllIlIIlIlIIllIllIll)) {
            c lllllllllllllllIlIIlIlIIllIllIIl = lllllllllllllllIlIIlIlIIllIlllII[lllllllllllllllIlIIlIlIIllIllIlI];
            if (h.lIIIIIIIIlIIIlI((Object)lllllllllllllllIlIIlIlIIllIllIIl, (Object)lllllllllllllllIlIIlIlIIllIlllIl.aV.m())) {
                return llIlIIIIlIII[0];
            }
            ++lllllllllllllllIlIIlIlIIllIllIlI;
            "".length();
            if (-" ".length() < 0) continue;
            return ((31 + 141 - 111 + 103 ^ 57 + 63 - 102 + 112) & (0x4A ^ 0x2F ^ (0x5D ^ 0x1E) ^ -" ".length())) != 0;
        }
        return llIlIIIIlIII[1];
    }

    static {
        h.lIIIIIIIIIlllII();
        aU = llIlIIIIlIII[4];
        aT = llIlIIIIlIII[5];
        aR = llIlIIIIlIII[6];
        aS = llIlIIIIlIII[7];
    }

    private static boolean lIIIIIIIIlIIIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean b(GameObject gameObject) {
        boolean bl;
        void lllllllllllllllIlIIlIlIIlllIllII;
        void lllllllllllllllIlIIlIlIIlllIllIl;
        WorldPoint worldPoint = Movement.getDestination();
        if (!h.lIIIIIIIIIlllIl(worldPoint) || h.lIIIIIIIIIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        WorldArea lllllllllllllllIlIIlIlIIlllIlIll = lllllllllllllllIlIIlIlIIlllIllIl.getWorldArea();
        if (!h.lIIIIIIIIIllllI(lllllllllllllllIlIIlIlIIlllIlIll.contains((WorldPoint)lllllllllllllllIlIIlIlIIlllIllII) ? 1 : 0) || h.lIIIIIIIIIlllll(lllllllllllllllIlIIlIlIIlllIlIll.isInMeleeDistance((WorldPoint)lllllllllllllllIlIIlIlIIlllIllII) ? 1 : 0)) {
            bl = llIlIIIIlIII[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0xB8 ^ 0xA6 ^ (0x86 ^ 0x94)) & (0x30 ^ 0x69 ^ (0xD7 ^ 0x82) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIIlIII[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(WorldPoint worldPoint) {
        boolean bl;
        void lllllllllllllllIlIIlIlIIlllIIlll;
        void lllllllllllllllIlIIlIlIIlllIlIII;
        WorldPoint worldPoint2 = Movement.getDestination();
        if (!h.lIIIIIIIIIlllIl(worldPoint2) || h.lIIIIIIIIIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (h.lIIIIIIIIlIIIII(lllllllllllllllIlIIlIlIIlllIlIII.distanceTo((WorldPoint)lllllllllllllllIlIIlIlIIlllIIlll), llIlIIIIlIII[2])) {
            bl = llIlIIIIlIII[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0xE3 ^ 0x9F ^ (0xD6 ^ 0x91)) & (0x6B ^ 3 ^ (0x7F ^ 0x2C) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIIlIII[1];
        }
        return bl;
    }

    protected void a(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = n2;
    }

    private static boolean lIIIIIIIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean aj() {
        return llIlIIIIlIII[1];
    }

    protected void b(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = n2;
        this.sleep(n2);
    }

    protected void c(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        if (h.lIIIIIIIIIlllIl(this.aZ)) {
            this.ba = n2;
        }
        this.sleep(n2);
        this.bb = llIlIIIIlIII[0];
    }

    private static boolean lIIIIIIIIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIIIIIIIIIlllII() {
        llIlIIIIlIII = new int[8];
        h.llIlIIIIlIII[0] = " ".length();
        h.llIlIIIIlIII[1] = (207 + 221 - 335 + 139 ^ 130 + 24 - 44 + 69) & (0x7A ^ 0x42 ^ (0xF1 ^ 0x92) ^ -" ".length());
        h.llIlIIIIlIII[2] = "   ".length();
        h.llIlIIIIlIII[3] = 0xBA ^ 0xBE;
        h.llIlIIIIlIII[4] = -(0xFFFFF81F & 0x5FE4) & (0xFFFFFDFF & 0x5E7F);
        h.llIlIIIIlIII[5] = -(0xFFFFFF9B & 0x7C67) & (0xFFFFFFBF & 0x7F7F);
        h.llIlIIIIlIII[6] = 0xFFFFECF5 & 0x379F;
        h.llIlIIIIlIII[7] = 0xFFFFFFEB & 0x1BF7;
    }

    public h(SquireGOTRPlugin squireGOTRPlugin, c ... cArray) {
        this.aV = squireGOTRPlugin;
        this.aW = squireGOTRPlugin.w();
        this.aX = cArray;
    }

    private static boolean lIIIIIIIIlIIIll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean ah() {
        boolean bl;
        void lllllllllllllllIlIIlIlIIlllIIlII;
        Player player = Players.getLocal();
        if (h.lIIIIIIIIIllllI(player.isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[0];
        }
        WorldPoint lllllllllllllllIlIIlIlIIlllIIIll = Movement.getDestination();
        if (!h.lIIIIIIIIIlllIl(lllllllllllllllIlIIlIlIIlllIIIll) || h.lIIIIIIIIlIIIII(lllllllllllllllIlIIlIlIIlllIIIll.distanceTo((Locatable)lllllllllllllllIlIIlIlIIlllIIlII), llIlIIIIlIII[3])) {
            bl = llIlIIIIlIII[0];
            "".length();
            if (-" ".length() > (0x6A ^ 0x37 ^ (0xC ^ 0x55))) {
                return ((163 + 26 - 140 + 160 ^ 31 + 122 - 82 + 87) & (0xF6 ^ 0xBB ^ "  ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIIlIII[1];
        }
        return bl;
    }

    public void sleep(int n2) {
        this.aY += n2;
    }

    protected abstract boolean ak();

    public boolean run() {
        h lllllllllllllllIlIIlIlIIllIlIlll;
        if (h.lIIIIIIIIIllllI(this.aj() ? 1 : 0) && h.lIIIIIIIIIlllll(this.aW.helperMode() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (!h.lIIIIIIIIIlllll(lllllllllllllllIlIIlIlIIllIlIlll.ai() ? 1 : 0) || h.lIIIIIIIIIlllll(lllllllllllllllIlIIlIlIIllIlIlll.aV.l() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (h.lIIIIIIIIIlllIl(lllllllllllllllIlIIlIlIIllIlIlll.aZ) && h.lIIIIIIIIIlllll(lllllllllllllllIlIIlIlIIllIlIlll.aZ.getAsBoolean() ? 1 : 0)) {
            lllllllllllllllIlIIlIlIIllIlIlll.aY = lllllllllllllllIlIIlIlIIllIlIlll.ba;
        }
        if (h.lIIIIIIIIlIIIll(lllllllllllllllIlIIlIlIIllIlIlll.aY)) {
            lllllllllllllllIlIIlIlIIllIlIlll.aY -= llIlIIIIlIII[0];
            return lllllllllllllllIlIIlIlIIllIlIlll.bb;
        }
        this.aZ = null;
        this.bb = llIlIIIIlIII[1];
        return this.ak();
    }
}

