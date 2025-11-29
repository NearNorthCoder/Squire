package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Crafting Blood Runes")
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.d  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/d.class */
public class d extends Task {
    private static /* synthetic */ String[] lIllIIlllIlIl;
    private final /* synthetic */ SquireZeahRunecrafter v;
    private static final /* synthetic */ WorldPoint t;
    private static /* synthetic */ int[] lIllIIlllIlll;
    private final /* synthetic */ a u;
    private static final /* synthetic */ WorldArea s;

    @Inject
    public d(a aVar, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.u = aVar;
        this.v = squireZeahRunecrafter;
    }

    private static void llIIIlllIIIIIll() {
        lIllIIlllIlll = new int[12];
        lIllIIlllIlll[0] = (151 ^ 131) & ((16 ^ 4) ^ (-1));
        lIllIIlllIlll[1] = " ".length();
        lIllIIlllIlll[2] = (-18979) & 32423;
        lIllIIlllIlll[3] = (-((-13731) & 30699)) & (-274) & 30687;
        lIllIIlllIlll[4] = (-16573) & 24510;
        lIllIIlllIlll[5] = (-((-17739) & 18415)) & (-17) & 28670;
        lIllIIlllIlll[6] = (-20497) & 22206;
        lIllIIlllIlll[7] = (-24577) & 28397;
        lIllIIlllIlll[8] = 17 ^ 3;
        lIllIIlllIlll[9] = 136 ^ 153;
        lIllIIlllIlll[10] = (-((-5125) & 23885)) & (-8193) & 28671;
        lIllIIlllIlll[11] = (-((-2051) & 22795)) & (-8194) & 32765;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIlllIIIIlII(this.v.a() ? 1 : 0) || llIIIlllIIIIlIl(m() ? 1 : 0)) {
            return lIllIIlllIlll[0];
        }
        TileObject p = p();
        if (llIIIlllIIIIllI(p)) {
            a(p);
            "".length();
            if ("   ".length() == 0) {
                return ((248 ^ 178) ^ (125 ^ 25)) & (((((18 + 90) - 23) + 59) ^ (((79 + 110) - 132) + 133)) ^ (-" ".length()));
            }
        } else {
            q();
        }
        return lIllIIlllIlll[1];
    }

    private static boolean llIIIlllIIIIlIl(int i) {
        return i == 0;
    }

    private static boolean llIIIlllIIIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlllIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static String llIIIllIlllllIl(String llllllllllllllIllIIlIIIIllllIIll, String llllllllllllllIllIIlIIIIllllIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlIIIIllllIIII = llllllllllllllIllIIlIIIIllllIIlI.toCharArray();
        int llllllllllllllIllIIlIIIIlllIllll = lIllIIlllIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIIlIIIIlllIIlll = lIllIIlllIlll[0];
        while (llIIIlllIIIlIII(llllllllllllllIllIIlIIIIlllIIlll, length)) {
            char llllllllllllllIllIIlIIIIlllIIllI = charArray[llllllllllllllIllIIlIIIIlllIIlll];
            sb.append((char) (llllllllllllllIllIIlIIIIlllIIllI ^ llllllllllllllIllIIlIIIIllllIIII[llllllllllllllIllIIlIIIIlllIllll % llllllllllllllIllIIlIIIIllllIIII.length]));
            "".length();
            llllllllllllllIllIIlIIIIlllIllll++;
            llllllllllllllIllIIlIIIIlllIIlll++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean m() {
        if (!llIIIlllIIIIlIl(n() ? 1 : 0) || llIIIlllIIIIlII(o() ? 1 : 0)) {
            ?? r0 = lIllIIlllIlll[1];
            "".length();
            return (((97 ^ 9) ^ (223 ^ 161)) & (((5 ^ 89) ^ (235 ^ 161)) ^ (-" ".length()))) < 0 ? ((((72 + 19) - 69) + 143) ^ (((82 + 122) - 160) + 117)) & (((((20 + 10) - (-112)) + 3) ^ (((127 + 18) - 119) + 123)) ^ (-" ".length())) : r0;
        }
        return lIllIIlllIlll[0];
    }

    private void a(TileObject tileObject) {
        tileObject.interact(lIllIIlllIlIl[lIllIIlllIlll[0]]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TileObject p() {
        int[] iArr = new int[lIllIIlllIlll[1]];
        iArr[lIllIIlllIlll[0]] = lIllIIlllIlll[5];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (llIIIlllIIIIllI(nearest) && llIIIlllIIIIlII(Reachable.isInteractable(nearest) ? 1 : 0)) {
            "".length();
            if (((120 ^ 26) & ((195 ^ 161) ^ (-1))) > ((187 ^ 146) & ((148 ^ 189) ^ (-1)))) {
                return null;
            }
            return nearest;
        }
        return null;
    }

    private static boolean llIIIlllIIIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean n() {
        int[] iArr = new int[lIllIIlllIlll[1]];
        iArr[lIllIIlllIlll[0]] = lIllIIlllIlll[2];
        if (llIIIlllIIIIlIl(Inventory.contains(iArr) ? 1 : 0) && llIIIlllIIIIlll(this.u.h(), this.u.j()) && llIIIlllIIIIlII(Inventory.isFull() ? 1 : 0)) {
            ?? r0 = lIllIIlllIlll[1];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIlllIlll[0];
    }

    private static void llIIIllIllllllI() {
        lIllIIlllIlIl = new String[lIllIIlllIlll[1]];
        lIllIIlllIlIl[lIllIIlllIlll[0]] = llIIIllIlllllIl("FD0EBw==", "VTjcG");
    }

    private void q() {
        Movement.walkTo(t);
        "".length();
    }

    private static boolean llIIIlllIIIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean o() {
        if (llIIIlllIIIIlII(s.contains(Players.getLocal()) ? 1 : 0)) {
            int[] iArr = new int[lIllIIlllIlll[1]];
            iArr[lIllIIlllIlll[0]] = lIllIIlllIlll[3];
            if (llIIIlllIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIlllIlll[1]];
                iArr2[lIllIIlllIlll[0]] = lIllIIlllIlll[4];
                if (llIIIlllIIIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = lIllIIlllIlll[1];
                    "".length();
                    return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIllIIlllIlll[0];
    }

    static {
        llIIIlllIIIIIll();
        llIIIllIllllllI();
        s = new WorldArea(lIllIIlllIlll[6], lIllIIlllIlll[7], lIllIIlllIlll[8], lIllIIlllIlll[9], lIllIIlllIlll[0]);
        t = new WorldPoint(lIllIIlllIlll[10], lIllIIlllIlll[11], lIllIIlllIlll[0]);
    }
}
