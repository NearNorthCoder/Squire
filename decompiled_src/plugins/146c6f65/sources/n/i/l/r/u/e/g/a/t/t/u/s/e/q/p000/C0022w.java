package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Entering boss room", priority = 1)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/w.class */
public class C0022w extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlIlllIIl;
    private static /* synthetic */ String[] llIIlIlllIII;

    static {
        lllllIlllllllI();
        lllllIllllllIl();
    }

    private static boolean llllllIIIIIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllllIIIIIIlI(Object obj) {
        return obj != null;
    }

    private static void lllllIlllllllI() {
        llIIlIlllIIl = new int[7];
        llIIlIlllIIl[0] = " ".length();
        llIIlIlllIIl[1] = ((((173 + 108) - 63) + 21) ^ (((32 + 146) - 98) + 102)) & (((((174 + 70) - 72) + 56) ^ (((171 + 17) - 21) + 22)) ^ (-" ".length()));
        llIIlIlllIIl[2] = (-((-7761) & 16089)) & (-34) & 32235;
        llIIlIlllIIl[3] = (62 ^ 115) ^ (40 ^ 96);
        llIIlIlllIIl[4] = "  ".length();
        llIIlIlllIIl[5] = "   ".length();
        llIIlIlllIIl[6] = (((34 + 134) - 75) + 45) ^ (((35 + 60) - (-10)) + 25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0022w(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlIlllIIl[0]];
        enumC0003dArr[llIIlIlllIIl[1]] = EnumC0003d.AFK;
    }

    private static boolean lllllIllllllll(int i) {
        return i == 0;
    }

    private static String lllllIlllllIll(String lllllllllllllllIlIIllIIIlIIlllll, String lllllllllllllllIlIIllIIIlIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), llIIlIlllIIl[6]), "DES");
            Cipher lllllllllllllllIlIIllIIIlIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIlIlIIIIl.init(llIIlIlllIIl[4], lllllllllllllllIlIIllIIIlIlIIIlI);
            return new String(lllllllllllllllIlIIllIIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIlIlIIIII) {
            lllllllllllllllIlIIllIIIlIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIIIIl(Object obj) {
        return obj == null;
    }

    private static void lllllIllllllIl() {
        llIIlIlllIII = new String[llIIlIlllIIl[5]];
        llIIlIlllIII[llIIlIlllIIl[1]] = lllllIlllllIlI("NRMDCipJAxIANQ==", "dfjiA");
        llIIlIlllIII[llIIlIlllIIl[0]] = lllllIlllllIll("uy+f14Ify0NSFGYHH56/1y/Fw3PveAhMA3k6wpJLKnsAwPJXNX+s8+67qpJCnqZTuyOWWEQKk28=", "wOJan");
        llIIlIlllIII[llIIlIlllIIl[4]] = lllllIllllllII("4yrKiRdWM+A4vkV3AJlEyg==", "pcrxR");
    }

    private static boolean llllllIIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIIIIIIll(int i, int i2) {
        return i > i2;
    }

    private static String lllllIllllllII(String lllllllllllllllIlIIllIIIlIIlIIlI, String lllllllllllllllIlIIllIIIlIIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIIlIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIIlIIlIlII.init(llIIlIlllIIl[4], lllllllllllllllIlIIllIIIlIIlIlIl);
            return new String(lllllllllllllllIlIIllIIIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIlIIlIIll) {
            lllllllllllllllIlIIllIIIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lllllIlllllIlI(String lllllllllllllllIlIIllIIIlIllIlII, String lllllllllllllllIlIIllIIIlIllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIIIlIllIIll.toCharArray();
        int lllllllllllllllIlIIllIIIlIllIIII = llIIlIlllIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlllIIl[1];
        while (llllllIIIIIlII(i, length)) {
            char lllllllllllllllIlIIllIIIlIllIlIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIllIIIlIllIlIl ^ charArray[lllllllllllllllIlIIllIIIlIllIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIIIlIllIIII++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (lllllIllllllll(this.ba.h().enterBossRoom() ? 1 : 0)) {
            return llIIlIlllIIl[1];
        }
        int[] iArr = new int[llIIlIlllIIl[0]];
        iArr[llIIlIlllIIl[1]] = llIIlIlllIIl[2];
        if (llllllIIIIIIII(Inventory.getCount(iArr), this.ba.h().abortFishAmount())) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                return C0004e.ac.contains(Integer.valueOf(tileObject.getId()));
            });
            if (llllllIIIIIIIl(nearest)) {
                return llIIlIlllIIl[1];
            }
            nearest.interact(llIIlIlllIII[llIIlIlllIIl[1]]);
            return llIIlIlllIIl[0];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
            return C0004e.aF.contains(Integer.valueOf(tileObject2.getId()));
        });
        if (llllllIIIIIIIl(nearest2)) {
            return llIIlIlllIIl[1];
        }
        NPC aI = this.ba.X().aI();
        if (!llllllIIIIIIlI(aI) || llllllIIIIIIll(nearest2.distanceTo(Players.getLocal()), llIIlIlllIIl[3])) {
            ScenePoint fromWorld = ScenePoint.fromWorld(nearest2.getWorldLocation());
            Movement.setDestination(fromWorld.getX(), fromWorld.getY());
            return llIIlIlllIIl[0];
        } else if (llllllIIIIIIII(aI.getWorldArea().distanceTo(nearest2.getWorldLocation()), llIIlIlllIIl[0])) {
            Log.info(llIIlIlllIII[llIIlIlllIIl[0]]);
            return llIIlIlllIIl[0];
        } else {
            nearest2.interact(llIIlIlllIII[llIIlIlllIIl[4]]);
            return llIIlIlllIIl[0];
        }
    }
}
