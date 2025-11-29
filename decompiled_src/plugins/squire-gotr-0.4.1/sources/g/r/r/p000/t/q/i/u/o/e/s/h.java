package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.util.function.BooleanSupplier;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.h  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/h.class */
public abstract class h extends Task {
    private /* synthetic */ int ba;
    protected static final /* synthetic */ int aR;
    private /* synthetic */ boolean bb;
    private /* synthetic */ int aY;
    protected final /* synthetic */ SquireGOTRConfig aW;
    protected final /* synthetic */ SquireGOTRPlugin aV;
    protected static final /* synthetic */ int aT;
    private final /* synthetic */ EnumC0002c[] aX;
    protected static final /* synthetic */ int aU;
    private /* synthetic */ BooleanSupplier aZ;
    private static /* synthetic */ int[] llIlIIIIlIII;
    protected static final /* synthetic */ int aS;

    private static boolean lIIIIIIIIIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIIIllllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    private boolean ai() {
        if (lIIIIIIIIIllllI(this.aX.length)) {
            return llIlIIIIlIII[0];
        }
        EnumC0002c[] enumC0002cArr = this.aX;
        int length = enumC0002cArr.length;
        int i = llIlIIIIlIII[1];
        while (lIIIIIIIIlIIIIl(i, length)) {
            if (lIIIIIIIIlIIIlI(enumC0002cArr[i], this.aV.m())) {
                return llIlIIIIlIII[0];
            }
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return ((((31 + 141) - 111) + 103) ^ (((57 + 63) - 102) + 112)) & (((74 ^ 47) ^ (93 ^ 30)) ^ (-" ".length()));
            }
        }
        return llIlIIIIlIII[1];
    }

    static {
        lIIIIIIIIIlllII();
        aU = llIlIIIIlIII[4];
        aT = llIlIIIIlIII[5];
        aR = llIlIIIIlIII[6];
        aS = llIlIIIIlIII[7];
    }

    private static boolean lIIIIIIIIlIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean b(GameObject gameObject) {
        WorldPoint destination = Movement.getDestination();
        if (!lIIIIIIIIIlllIl(destination) || lIIIIIIIIIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        WorldArea worldArea = gameObject.getWorldArea();
        if (!lIIIIIIIIIllllI(worldArea.contains(destination) ? 1 : 0) || lIIIIIIIIIlllll(worldArea.isInMeleeDistance(destination) ? 1 : 0)) {
            ?? r0 = llIlIIIIlIII[0];
            "".length();
            return "  ".length() == 0 ? ((184 ^ 166) ^ (134 ^ 148)) & (((48 ^ 105) ^ (215 ^ 130)) ^ (-" ".length())) : r0;
        }
        return llIlIIIIlIII[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        WorldPoint destination = Movement.getDestination();
        if (!lIIIIIIIIIlllIl(destination) || lIIIIIIIIIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (lIIIIIIIIlIIIII(worldPoint.distanceTo(destination), llIlIIIIlIII[2])) {
            ?? r0 = llIlIIIIlIII[0];
            "".length();
            return "  ".length() >= "   ".length() ? ((227 ^ 159) ^ (214 ^ 145)) & (((107 ^ 3) ^ (127 ^ 44)) ^ (-" ".length())) : r0;
        }
        return llIlIIIIlIII[1];
    }

    protected void a(int i, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = i;
    }

    private static boolean lIIIIIIIIlIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected boolean aj() {
        return llIlIIIIlIII[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = i;
        sleep(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public void c(int i, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        if (lIIIIIIIIIlllIl(this.aZ)) {
            this.ba = i;
        }
        sleep(i);
        this.bb = llIlIIIIlIII[0];
    }

    private static boolean lIIIIIIIIIlllll(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIIlIIIII(int i, int i2) {
        return i <= i2;
    }

    private static void lIIIIIIIIIlllII() {
        llIlIIIIlIII = new int[8];
        llIlIIIIlIII[0] = " ".length();
        llIlIIIIlIII[1] = ((((207 + 221) - 335) + 139) ^ (((130 + 24) - 44) + 69)) & (((122 ^ 66) ^ (241 ^ 146)) ^ (-" ".length()));
        llIlIIIIlIII[2] = "   ".length();
        llIlIIIIlIII[3] = 186 ^ 190;
        llIlIIIIlIII[4] = (-((-2017) & 24548)) & (-513) & 24191;
        llIlIIIIlIII[5] = (-((-101) & 31847)) & (-65) & 32639;
        llIlIIIIlIII[6] = (-4875) & 14239;
        llIlIIIIlIII[7] = (-21) & 7159;
    }

    public h(SquireGOTRPlugin squireGOTRPlugin, EnumC0002c... enumC0002cArr) {
        this.aV = squireGOTRPlugin;
        this.aW = squireGOTRPlugin.w();
        this.aX = enumC0002cArr;
    }

    private static boolean lIIIIIIIIlIIIll(int i) {
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean ah() {
        Player local = Players.getLocal();
        if (lIIIIIIIIIllllI(local.isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[0];
        }
        WorldPoint destination = Movement.getDestination();
        if (!lIIIIIIIIIlllIl(destination) || lIIIIIIIIlIIIII(destination.distanceTo(local), llIlIIIIlIII[3])) {
            ?? r0 = llIlIIIIlIII[0];
            "".length();
            return (-" ".length()) > ((106 ^ 55) ^ (12 ^ 85)) ? ((((163 + 26) - 140) + 160) ^ (((31 + 122) - 82) + 87)) & (((246 ^ 187) ^ "  ".length()) ^ (-" ".length())) : r0;
        }
        return llIlIIIIlIII[1];
    }

    public void sleep(int i) {
        this.aY += i;
    }

    protected abstract boolean ak();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public boolean run() {
        if (lIIIIIIIIIllllI(aj() ? 1 : 0) && lIIIIIIIIIlllll(this.aW.helperMode() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (!lIIIIIIIIIlllll(ai() ? 1 : 0) || lIIIIIIIIIlllll(this.aV.l() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (lIIIIIIIIIlllIl(this.aZ) && lIIIIIIIIIlllll(this.aZ.getAsBoolean() ? 1 : 0)) {
            this.aY = this.ba;
        }
        if (lIIIIIIIIlIIIll(this.aY)) {
            this.aY -= llIlIIIIlIII[0];
            return this.bb;
        }
        this.aZ = null;
        this.bb = llIlIIIIlIII[1];
        return ak();
    }
}
