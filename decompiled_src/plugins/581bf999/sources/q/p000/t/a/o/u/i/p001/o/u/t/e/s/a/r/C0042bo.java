package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Doing match puzzle", priority = 50, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bo  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bo.class */
public class C0042bo extends AbstractC0040bm {
    private static /* synthetic */ String[] llIIlIIlIII;
    private static /* synthetic */ int[] llIIlIIlIIl;

    @Inject
    protected C0042bo(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig, c0067p);
    }

    private static boolean lIlIIIIIlIIIII(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIIlIIIIl(int i, int i2) {
        return i < i2;
    }

    public GroundObject cb() {
        GroundObject groundObject = (TileObject) TileObjects.getAll(tileObject -> {
            String[] strArr = new String[llIIlIIlIIl[0]];
            strArr[llIIlIIlIIl[1]] = llIIlIIlIII[llIIlIIlIIl[2]];
            return tileObject.hasAction(strArr);
        }).stream().min(Comparator.comparingInt((v0) -> {
            return v0.getId();
        }).thenComparingInt(tileObject2 -> {
            return tileObject2.getWorldLocation().distanceTo(Players.getLocal());
        })).orElse(null);
        if (lIlIIIIIlIIIII(groundObject instanceof GroundObject ? 1 : 0)) {
            return groundObject;
        }
        return null;
    }

    private static void lIlIIIIIIllllI() {
        llIIlIIlIIl = new int[5];
        llIIlIIlIIl[0] = " ".length();
        llIIlIIlIIl[1] = ((7 ^ 84) ^ (132 ^ 139)) & (((113 ^ 21) ^ (130 ^ 186)) ^ (-" ".length()));
        llIIlIIlIIl[2] = "  ".length();
        llIIlIIlIIl[3] = "   ".length();
        llIIlIIlIIl[4] = 183 ^ 191;
    }

    static {
        lIlIIIIIIllllI();
        lIlIIIIIIlllIl();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        String[] strArr = new String[llIIlIIlIIl[0]];
        strArr[llIIlIIlIIl[1]] = llIIlIIlIII[llIIlIIlIIl[1]];
        return TileObjects.getAll(strArr).stream().anyMatch((v0) -> {
            return Reachable.isInteractable(v0);
        });
    }

    private static String lIlIIIIIIlllII(String llllllllllllllllIlIIIIIIIIllIIIl, String llllllllllllllllIlIIIIIIIIllIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIlIIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIlIIl[2], llllllllllllllllIlIIIIIIIIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIIIIllIIlI) {
            llllllllllllllllIlIIIIIIIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIlllll(Object obj) {
        return obj == null;
    }

    private static String lIlIIIIIIllIll(String llllllllllllllllIlIIIIIIIIIlllII, String llllllllllllllllIlIIIIIIIIlIIIII) {
        String llllllllllllllllIlIIIIIIIIIlllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIIIIIIlIIIII.toCharArray();
        int llllllllllllllllIlIIIIIIIIIlllIl = llIIlIIlIIl[1];
        char[] charArray2 = llllllllllllllllIlIIIIIIIIIlllII2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIlIIIIIIIIIlIlIl = llIIlIIlIIl[1];
        while (lIlIIIIIlIIIIl(llllllllllllllllIlIIIIIIIIIlIlIl, length)) {
            char llllllllllllllllIlIIIIIIIIlIIIlI = charArray2[llllllllllllllllIlIIIIIIIIIlIlIl];
            sb.append((char) (llllllllllllllllIlIIIIIIIIlIIIlI ^ charArray[llllllllllllllllIlIIIIIIIIIlllIl % charArray.length]));
            "".length();
            llllllllllllllllIlIIIIIIIIIlllIl++;
            llllllllllllllllIlIIIIIIIIIlIlIl++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIIIIIlllIl() {
        llIIlIIlIII = new String[llIIlIIlIIl[3]];
        llIIlIIlIII[llIIlIIlIIl[1]] = lIlIIIIIIllIll("Ji0eAToZ", "uTscU");
        llIIlIIlIII[llIIlIIlIIl[0]] = lIlIIIIIIlllII("8fTVBhe0+2uonroJ/XltBw==", "NHrAR");
        llIIlIIlIII[llIIlIIlIIl[2]] = lIlIIIIIIllIll("DCAwKjUsNyE=", "MCDCC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public boolean bY() {
        GroundObject cb = cb();
        if (lIlIIIIIIlllll(cb)) {
            return llIIlIIlIIl[1];
        }
        cb.interact(llIIlIIlIII[llIIlIIlIIl[0]]);
        return llIIlIIlIIl[0];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public int bZ() {
        GroundObject cb = cb();
        if (lIlIIIIIIlllll(cb)) {
            int i = llIIlIIlIIl[1];
            "".length();
            return "   ".length() <= (-" ".length()) ? (130 ^ 187) & ((73 ^ 112) ^ (-1)) : i;
        }
        return cb.getWorldX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        if (lIlIIIIIIlllll(cb())) {
            ?? r0 = llIIlIIlIIl[0];
            "".length();
            return (("  ".length() ^ (205 ^ 158)) & (((112 ^ 49) ^ (155 ^ 139)) ^ (-" ".length()))) == " ".length() ? ((((213 + 223) - 414) + 219) ^ (((58 + 110) - 133) + 150)) & (((((48 + 162) - 32) + 35) ^ (((37 + 48) - 76) + 148)) ^ (-" ".length())) : r0;
        }
        return llIIlIIlIIl[1];
    }
}
