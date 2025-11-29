package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Skipping Akkha DPS", priority = 150, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ax  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ax.class */
public class C0024ax extends AbstractC0016ap {
    private static /* synthetic */ int[] llIlIllIIII;
    private static final /* synthetic */ int dn;
    private /* synthetic */ boolean dp;

    /* renamed from: do  reason: not valid java name */
    private static final /* synthetic */ int f0do;
    private static /* synthetic */ String[] llIlIlIllll;
    private /* synthetic */ int dq;

    private static String lIlIIlllIllIll(String llllllllllllllllIIllIIlIIIIlIlll, String llllllllllllllllIIllIIlIIIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIlIllIIII[7]), "DES");
            Cipher llllllllllllllllIIllIIlIIIIllIIl = Cipher.getInstance("DES");
            llllllllllllllllIIllIIlIIIIllIIl.init(llIlIllIIII[8], llllllllllllllllIIllIIlIIIIllIlI);
            return new String(llllllllllllllllIIllIIlIIIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlIIIIllIII) {
            llllllllllllllllIIllIIlIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlllIlllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        EnumC0065n bx = bx();
        if (lIlIIlllIllllI(bx)) {
            return llIlIllIIII[0];
        }
        WorldPoint a = bx.a(this.cu);
        NPC nearest = NPCs.getNearest(a, npc -> {
            if (lIlIIllllIIIII(npc.getName().equals(llIlIlIllll[llIlIllIIII[0]]) ? 1 : 0) && lIlIIllllIIIlI(npc.getWorldLocation().distanceTo(a), llIlIllIIII[6])) {
                ?? r0 = llIlIllIIII[1];
                "".length();
                return (-"  ".length()) >= 0 ? ((122 ^ 16) ^ (132 ^ 182)) & (((27 ^ 68) ^ (110 ^ 105)) ^ (-" ".length())) : r0;
            }
            return llIlIllIIII[0];
        });
        if (!lIlIIlllIlllll(nearest) || lIlIIllllIIIII(nearest.isDead() ? 1 : 0)) {
            return llIlIllIIII[0];
        }
        int[] iArr = new int[llIlIllIIII[1]];
        iArr[llIlIllIIII[0]] = llIlIllIIII[2];
        NPC nearest2 = NPCs.getNearest(iArr);
        if (!lIlIIlllIlllll(nearest2) || lIlIIllllIIIIl(nearest2.getHealthRatio(), llIlIllIIII[3])) {
            return llIlIllIIII[0];
        }
        if (lIlIIlllIllllI(J())) {
            return llIlIllIIII[0];
        }
        if (lIlIIllllIIIlI(nearest2.getHealthRatio() + llIlIllIIII[4], nearest2.getHealthScale()) && lIlIIllllIIIll(nearest.getAnimation(), llIlIllIIII[5])) {
            return llIlIllIIII[0];
        }
        WorldArea worldArea = nearest.getWorldArea();
        WorldPoint worldPoint = (WorldPoint) worldArea.toWorldPointList().stream().min(Comparator.comparingDouble(worldPoint2 -> {
            return worldPoint2.distanceTo2DHypotenuse(a);
        })).orElse(null);
        if (lIlIIlllIllllI(worldPoint)) {
            return llIlIllIIII[0];
        }
        WorldPoint worldPoint3 = (WorldPoint) worldArea.toWorldPointList().stream().max(Comparator.comparingDouble(worldPoint4 -> {
            return worldPoint4.distanceTo2DHypotenuse(a);
        })).orElse(null);
        if (lIlIIlllIllllI(worldPoint3)) {
            return llIlIllIIII[0];
        }
        WorldPoint worldPoint5 = worldPoint;
        if (lIlIIllllIIlII(nearest.getAnimationFrame(), llIlIllIIII[1])) {
            worldPoint5 = worldPoint3;
        }
        Movement.setDestination(worldPoint5);
        return llIlIllIIII[1];
    }

    private static void lIlIIlllIlllII() {
        llIlIlIllll = new String[llIlIllIIII[1]];
        llIlIlIllll[llIlIllIIII[0]] = lIlIIlllIllIll("IGP5pJmQ840ocU8Zw05I+g==", "AUBGz");
    }

    private static void lIlIIlllIlllIl() {
        llIlIllIIII = new int[9];
        llIlIllIIII[0] = (243 ^ 161) & ((12 ^ 94) ^ (-1));
        llIlIllIIII[1] = " ".length();
        llIlIllIIII[2] = (-4131) & 15935;
        llIlIllIIII[3] = -" ".length();
        llIlIllIIII[4] = (232 ^ 176) ^ (208 ^ 141);
        llIlIllIIII[5] = (-335) & 10111;
        llIlIllIIII[6] = 136 ^ 142;
        llIlIllIIII[7] = 72 ^ 64;
        llIlIllIIII[8] = "  ".length();
    }

    private static boolean lIlIIllllIIIII(int i) {
        return i != 0;
    }

    @Inject
    protected C0024ax(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIIllllIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIllllIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIllllIIIll(int i, int i2) {
        return i != i2;
    }

    static {
        lIlIIlllIlllIl();
        lIlIIlllIlllII();
        dn = llIlIllIIII[5];
        f0do = llIlIllIIII[2];
    }
}
