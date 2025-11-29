package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging Melee", priority = 30, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.U  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/U.class */
public class U extends ad {
    private /* synthetic */ int at;
    private static final /* synthetic */ List<Integer> as;
    private static /* synthetic */ int[] lIllIIllllIll;

    private static void llIIIlllIIIllII() {
        lIllIIllllIll = new int[20];
        lIllIIllllIll[0] = ((((69 + 21) - (-83)) + 40) ^ (((160 + 93) - 115) + 55)) & (((67 ^ 120) ^ (43 ^ 4)) ^ (-" ".length()));
        lIllIIllllIll[1] = -" ".length();
        lIllIIllllIll[2] = -"   ".length();
        lIllIIllllIll[3] = -"  ".length();
        lIllIIllllIll[4] = " ".length();
        lIllIIllllIll[5] = "   ".length();
        lIllIIllllIll[6] = 164 ^ 161;
        lIllIIllllIll[7] = 146 ^ 154;
        lIllIIllllIll[8] = (-((-13575) & 29999)) & (-10241) & 28607;
        lIllIIllllIll[9] = (-((-3202) & 11429)) & (-6213) & 16383;
        lIllIIllllIll[10] = "  ".length();
        lIllIIllllIll[11] = (-31108) & 32747;
        lIllIIllllIll[12] = (-149) & 1789;
        lIllIIllllIll[13] = 154 ^ 158;
        lIllIIllllIll[14] = (-((-5137) & 15377)) & (-20481) & 32767;
        lIllIIllllIll[15] = (-14228) & 16275;
        lIllIIllllIll[16] = (126 ^ 88) ^ (140 ^ 172);
        lIllIIllllIll[17] = (-30209) & 32700;
        lIllIIllllIll[18] = 68 ^ 67;
        lIllIIllllIll[19] = (-((-142) & 5775)) & (-24585) & 32767;
    }

    private static boolean llIIIlllIIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIlllIIlIIIl(int i) {
        return i <= 0;
    }

    private static boolean llIIIlllIIlIIII(int i) {
        return i > 0;
    }

    private static boolean llIIIlllIIlIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        WorldPoint dx;
        NPC W = this.az.W();
        if (!llIIIlllIIIllIl(W) && !llIIIlllIIIlllI(this.az.U() ? 1 : 0)) {
            int orientation = W.getOrientation() + Players.getLocal().getOrientation();
            WorldPoint ai = ai();
            if (llIIIlllIIIllll(C(), EnumC0010k.MAGMA_CENTER_NW)) {
                dx = ai.dx(lIllIIllllIll[1]).dy(lIllIIllllIll[2]);
                "".length();
                if (" ".length() > ((((3 + 99) - 27) + 72) ^ (((98 + 20) - 117) + 150))) {
                    return ((113 ^ 124) ^ (83 ^ 62)) & (((((93 + 139) - 119) + 89) ^ (((62 + 36) - 4) + 76)) ^ (-" ".length()));
                }
            } else {
                dx = ai.dx(lIllIIllllIll[3]);
            }
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (llIIIlllIIlIIII(Math.min(worldLocation.distanceTo(ai), worldLocation.distanceTo(dx)))) {
                if (llIIIlllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Movement.walkTo(ai);
                    "".length();
                    return lIllIIllllIll[4];
                }
                return lIllIIllllIll[0];
            } else if (llIIIlllIIIlllI(as.contains(Integer.valueOf(orientation)) ? 1 : 0)) {
                this.at = this.aB.getTickCount() + lIllIIllllIll[4];
                return lIllIIllllIll[4];
            } else if (llIIIlllIIlIIIl(this.aB.getTickCount() - this.at)) {
                return lIllIIllllIll[4];
            } else {
                sleep(Rand.nextInt(lIllIIllllIll[5], lIllIIllllIll[6]));
                if (llIIIlllIIlIIlI(ai.equals(worldLocation) ? 1 : 0)) {
                    Movement.walk(dx);
                    "".length();
                    if ("  ".length() < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    Movement.walk(ai);
                }
                return lIllIIllllIll[4];
            }
        }
        return lIllIIllllIll[0];
    }

    private static boolean llIIIlllIIIlllI(int i) {
        return i == 0;
    }

    @Inject
    protected U(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    static {
        llIIIlllIIIllII();
        Integer[] numArr = new Integer[lIllIIllllIll[7]];
        numArr[lIllIIllllIll[0]] = Integer.valueOf(lIllIIllllIll[8]);
        numArr[lIllIIllllIll[4]] = Integer.valueOf(lIllIIllllIll[9]);
        numArr[lIllIIllllIll[10]] = Integer.valueOf(lIllIIllllIll[11]);
        numArr[lIllIIllllIll[5]] = Integer.valueOf(lIllIIllllIll[12]);
        numArr[lIllIIllllIll[13]] = Integer.valueOf(lIllIIllllIll[14]);
        numArr[lIllIIllllIll[6]] = Integer.valueOf(lIllIIllllIll[15]);
        numArr[lIllIIllllIll[16]] = Integer.valueOf(lIllIIllllIll[17]);
        numArr[lIllIIllllIll[18]] = Integer.valueOf(lIllIIllllIll[19]);
        as = Arrays.asList(numArr);
    }

    private static boolean llIIIlllIIIllIl(Object obj) {
        return obj == null;
    }
}
