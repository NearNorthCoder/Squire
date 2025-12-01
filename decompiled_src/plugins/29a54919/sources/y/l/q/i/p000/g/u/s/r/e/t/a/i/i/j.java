package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Traversing obstacles")
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.j  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/j.class */
public class j extends Task {
    private static final /* synthetic */ WorldPoint z;
    private final /* synthetic */ AgilityConfig B;
    private static /* synthetic */ String[] lIllIIIlIIl;
    private final /* synthetic */ SquireAgilityPlugin A;
    private static /* synthetic */ int[] lIllIIIlIll;

    private static void lIIlIlIlIlIlIl() {
        lIllIIIlIll = new int[16];
        lIllIIIlIll[0] = (37 ^ 14) & ((189 ^ 150) ^ (-1));
        lIllIIIlIll[1] = 92 ^ 86;
        lIllIIIlIll[2] = -" ".length();
        lIllIIIlIll[3] = (-((-21519) & 30015)) & (-7) & 9215;
        lIllIIIlIll[4] = "  ".length();
        lIllIIIlIll[5] = " ".length();
        lIllIIIlIll[6] = (-((-85) & 29014)) & (-1027) & 32611;
        lIllIIIlIll[7] = (-((-16561) & 29362)) & (-16409) & 32505;
        lIllIIIlIll[8] = "   ".length();
        lIllIIIlIll[9] = (-((-2113) & 31345)) & (-261) & 32764;
        lIllIIIlIll[10] = (-((-8961) & 11010)) & (-8193) & 16383;
        lIllIIIlIll[11] = (((89 + 98) - 123) + 78) ^ (((57 + 18) - 26) + 86);
        lIllIIIlIll[12] = (-21921) & 24574;
        lIllIIIlIll[13] = (-((-17683) & 30491)) & (-277) & 16383;
        lIllIIIlIll[14] = 117 ^ 113;
        lIllIIIlIll[15] = 162 ^ 170;
    }

    static {
        lIIlIlIlIlIlIl();
        lIIlIlIlIlIIll();
        z = new WorldPoint(lIllIIIlIll[12], lIllIIIlIll[13], lIllIIIlIll[8]);
    }

    private static boolean lIIlIlIlIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIlIlIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    public boolean run() {
        b course;
        int i;
        b course2;
        Player local = Players.getLocal();
        if (lIIlIlIlIlIllI(local)) {
            return lIllIIIlIll[0];
        }
        if (lIIlIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIlIllIII(Movement.getRunEnergy(), lIllIIIlIll[1])) {
            Movement.toggleRun();
        }
        if (lIIlIlIlIllIIl(local.getAnimation(), lIllIIIlIll[2]) && lIIlIlIlIllIIl(local.getAnimation(), lIllIIIlIll[3])) {
            return lIllIIIlIll[0];
        }
        WorldPoint worldLocation = local.getWorldLocation();
        b a = this.A.a();
        if (lIIlIlIlIlIllI(a)) {
            if (lIIlIlIlIlIlll(worldLocation.getPlane())) {
                SquireAgilityPlugin squireAgilityPlugin = this.A;
                if (lIIlIlIlIllIlI(this.B.progressive() ? 1 : 0)) {
                    course2 = b.j();
                    "".length();
                    if (" ".length() > ((((40 + 1) - (-108)) + 3) ^ (((16 + 83) - 61) + 118))) {
                        return ((85 ^ 101) ^ (178 ^ 160)) & (((((134 + 140) - 231) + 118) ^ (((3 + 77) - 63) + 114)) ^ (-" ".length()));
                    }
                } else {
                    course2 = this.B.course();
                }
                squireAgilityPlugin.a(course2);
                "".length();
                if (((148 ^ 136) & ((105 ^ 117) ^ (-1))) >= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                this.A.a(b.b(worldLocation.getRegionID()));
            }
        }
        if (lIIlIlIlIllIlI(this.B.progressive() ? 1 : 0)) {
            course = b.j();
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            course = this.B.course();
        }
        b bVar = course;
        if (lIIlIlIlIllIll(bVar, a) && lIIlIlIlIlIlll(local.getPlane())) {
            String str = lIllIIIlIIl[lIllIIIlIll[0]];
            Object[] objArr = new Object[lIllIIIlIll[4]];
            objArr[lIllIIIlIll[0]] = a;
            objArr[lIllIIIlIll[5]] = bVar;
            Log.info(str, objArr);
            this.A.a(bVar);
            return lIllIIIlIll[5];
        } else if (lIIlIlIlIlIllI(a)) {
            String str2 = lIllIIIlIIl[lIllIIIlIll[5]];
            Object[] objArr2 = new Object[lIllIIIlIll[5]];
            objArr2[lIllIIIlIll[0]] = Integer.valueOf(worldLocation.getRegionID());
            Log.info(str2, objArr2);
            return lIllIIIlIll[0];
        } else {
            c k = a.k();
            if (lIIlIlIlIllIlI(Players.getLocal().getWorldLocation().equals(z) ? 1 : 0)) {
                Movement.walkTo(new WorldPoint(lIllIIIlIll[6], lIllIIIlIll[7], lIllIIIlIll[8]));
                "".length();
                sleep(lIllIIIlIll[8]);
                return lIllIIIlIll[0];
            } else if (lIIlIlIlIllIlI(Reachable.isWalkable(new WorldPoint(lIllIIIlIll[9], lIllIIIlIll[10], lIllIIIlIll[0])) ? 1 : 0) && lIIlIlIlIlIlll(Static.getClient().getTopLevelWorldView().getPlane())) {
                String[] strArr = new String[lIllIIIlIll[5]];
                strArr[lIllIIIlIll[0]] = lIllIIIlIIl[lIllIIIlIll[4]];
                TileObjects.getNearest(strArr).interact(str3 -> {
                    return lIllIIIlIll[5];
                });
                return lIllIIIlIll[5];
            } else if (lIIlIlIlIlIllI(k)) {
                if (lIIlIlIlIlllII(worldLocation.getPlane(), lIllIIIlIll[8])) {
                    return lIllIIIlIll[0];
                }
                String str4 = lIllIIIlIIl[lIllIIIlIll[8]];
                Object[] objArr3 = new Object[lIllIIIlIll[5]];
                objArr3[lIllIIIlIll[0]] = a;
                Log.info(str4, objArr3);
                return lIllIIIlIll[5];
            } else {
                TileObject r = k.r();
                if (lIIlIlIlIlllIl(r) && !lIIlIlIlIllllI(r.distanceTo(Players.getLocal()), lIllIIIlIll[11])) {
                    r.interact(k.n());
                    return lIllIIIlIll[5];
                } else if (lIIlIlIlIlllII(worldLocation.getPlane(), lIllIIIlIll[8])) {
                    Movement.setDestination(k.getWorldLocation());
                    return lIllIIIlIll[5];
                } else {
                    if (lIIlIlIlIlIllI(r)) {
                        i = lIllIIIlIll[5];
                        "".length();
                        if (" ".length() >= "  ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        i = lIllIIIlIll[0];
                    }
                    Movement.walkTo(k.getWorldLocation(), i);
                    "".length();
                    return lIllIIIlIll[5];
                }
            }
        }
    }

    private static void lIIlIlIlIlIIll() {
        lIllIIIlIIl = new String[lIllIIIlIll[14]];
        lIllIIIlIIl[lIllIIIlIll[0]] = lIIlIlIlIIllIl("mYB/9nhrbFpgNqIVPT0JmhJhu/V9/y5JQAgWE3FfDY8=", "WHeGp");
        lIllIIIlIIl[lIllIIIlIll[5]] = lIIlIlIlIIllIl("k9T0ZaTHMSeROy17N6pBCi2VtQXsc9pufx4NDAKD6h3Cava1QaXYWBFyt3Npw45cE32HHk2/JKAou+Gvj4JjuNW9q7alheF+", "LZcpk");
        lIllIIIlIIl[lIllIIIlIll[4]] = lIIlIlIlIlIIIl("ztV6x6bihow=", "mzteF");
        lIllIIIlIIl[lIllIIIlIll[8]] = lIIlIlIlIlIIlI("CwRQLQM2HxEhDSBLFi0UKw9QLQ9lCB83EzYOSmIaOA==", "EkpBa");
    }

    private static boolean lIIlIlIlIlIllI(Object obj) {
        return obj == null;
    }

    @Inject
    public j(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.A = squireAgilityPlugin;
        this.B = agilityConfig;
    }

    private static String lIIlIlIlIlIIlI(String llllllllllllllllIlIlIlIIlIllIlIl, String llllllllllllllllIlIlIlIIlIllIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIlIIlIllIlII.toCharArray();
        int llllllllllllllllIlIlIlIIlIllIIIl = lIllIIIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIlIll[0];
        while (lIIlIlIlIlllll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIlIlIIlIllIIIl % charArray.length]));
            "".length();
            llllllllllllllllIlIlIlIIlIllIIIl++;
            i++;
            "".length();
            if ((((54 ^ 20) ^ (73 ^ 32)) & (((((53 + 217) - 39) + 5) ^ (((99 + 4) - 58) + 122)) ^ (-" ".length()))) < (((((50 + 86) - 117) + 138) ^ (((13 + 148) - 61) + 83)) & (((((134 + 34) - 107) + 86) ^ (((143 + 65) - 48) + 25)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIlIlIIllIl(String llllllllllllllllIlIlIlIIllIIIlIl, String llllllllllllllllIlIlIlIIllIIIlII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIlIll[4], llllllllllllllllIlIlIlIIllIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIllIIIllI) {
            llllllllllllllllIlIlIlIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIlIllIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIlIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIlIlllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIlIllIIl(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIlIlIlIIIl(String llllllllllllllllIlIlIlIIlIlIIIII, String llllllllllllllllIlIlIlIIlIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIlIIlllll.getBytes(StandardCharsets.UTF_8)), lIllIIIlIll[15]), "DES");
            Cipher llllllllllllllllIlIlIlIIlIlIIIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlIIlIlIIIlI.init(lIllIIIlIll[4], secretKeySpec);
            return new String(llllllllllllllllIlIlIlIIlIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIlIIlllII) {
            llllllllllllllllIlIlIlIIlIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIlllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIlIlIllIII(int i, int i2) {
        return i > i2;
    }
}
