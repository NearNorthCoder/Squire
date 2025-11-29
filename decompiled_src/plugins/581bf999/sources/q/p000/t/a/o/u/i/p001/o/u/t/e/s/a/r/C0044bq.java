package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Doing pressure order", priority = 5, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bq  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bq.class */
public class C0044bq extends AbstractC0040bm {
    private static /* synthetic */ int[] llIIIIIllIl;
    private static /* synthetic */ String[] llIIIIIlIIl;
    private final /* synthetic */ Set<WorldPoint> fv;

    private static void lIIlllIIllIIII() {
        llIIIIIlIIl = new String[llIIIIIllIl[5]];
        llIIIIIlIIl[llIIIIIllIl[1]] = lIIlllIIlIllIl("9KxeFguVug/MV7538TPGjA==", "upfgc");
        llIIIIIlIIl[llIIIIIllIl[0]] = lIIlllIIlIlllI("GT0XOQ==", "IHdQn");
        llIIIIIlIIl[llIIIIIllIl[6]] = lIIlllIIlIllIl("zbA7ZR/OEzCVxiTVYTGL9Q==", "BJAVK");
        llIIIIIlIIl[llIIIIIllIl[8]] = lIIlllIIlIllll("BlIe58+e/QLL5atHY4/O+A==", "vmvxC");
        llIIIIIlIIl[llIIIIIllIl[9]] = lIIlllIIlIlllI("Jj4AAyMJJEMIMxMkDAQ=", "gPcjF");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[llIIIIIllIl[0]];
        iArr[llIIIIIllIl[1]] = llIIIIIllIl[2];
        if (lIIlllIIlllIII(TileObjects.getAll(iArr).size(), llIIIIIllIl[3])) {
            ?? r0 = llIIIIIllIl[0];
            "".length();
            return ((61 ^ 40) ^ (108 ^ 125)) == ((((2 ^ 60) ^ " ".length()) & (((97 ^ 95) ^ " ".length()) ^ (-" ".length()))) & ((((194 ^ 151) ^ (80 ^ 8)) & (((((24 + 77) - 91) + 126) ^ (((75 + 97) - 101) + 62)) ^ (-" ".length()))) ^ (-" ".length()))) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return llIIIIIllIl[1];
    }

    @Inject
    protected C0044bq(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig, c0067p);
        this.fv = new HashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public boolean bY() {
        Queue<WorldPoint> R = this.fh.R();
        if (!lIIlllIIlllIIl(R) || lIIlllIIlllIlI(R.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[llIIIIIllIl[0]];
            strArr[llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[1]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIlllIIlllIll(nearest)) {
                return llIIIIIllIl[1];
            }
            nearest.interact(llIIIIIlIIl[llIIIIIllIl[0]]);
            sleep(llIIIIIllIl[5]);
            return llIIIIIllIl[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        WorldPoint peek = R.peek();
        if (lIIlllIIlllIIl(peek) && lIIlllIIlllIlI(peek.equals(worldLocation) ? 1 : 0)) {
            R.remove();
            "".length();
        }
        String str = llIIIIIlIIl[llIIIIIllIl[6]];
        Object[] objArr = new Object[llIIIIIllIl[6]];
        objArr[llIIIIIllIl[1]] = peek;
        objArr[llIIIIIllIl[0]] = this.fv;
        Log.info(str, objArr);
        WorldArea createWorldArea = worldLocation.dx(llIIIIIllIl[7]).dy(llIIIIIllIl[7]).createWorldArea(llIIIIIllIl[8], llIIIIIllIl[8]);
        if (lIIlllIIlllIlI(createWorldArea.contains(peek) ? 1 : 0)) {
            Movement.setDestination(peek);
            "".length();
            if ((-"   ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            WorldPoint worldPoint = (WorldPoint) createWorldArea.toWorldPointList().stream().filter(worldPoint2 -> {
                int[] iArr = new int[llIIIIIllIl[0]];
                iArr[llIIIIIllIl[1]] = llIIIIIllIl[4];
                return TileObjects.getAll(iArr).stream().noneMatch(tileObject -> {
                    return tileObject.getWorldLocation().equals(worldPoint2);
                });
            }).filter(worldPoint3 -> {
                if (lIIlllIIllllII(worldPoint3.equals(worldLocation) ? 1 : 0)) {
                    ?? r0 = llIIIIIllIl[0];
                    "".length();
                    return (18 ^ 22) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIIIllIl[1];
            }).min(Comparator.comparingInt(worldPoint4 -> {
                return worldPoint4.distanceTo(peek);
            })).orElse(null);
            String str2 = llIIIIIlIIl[llIIIIIllIl[8]];
            Object[] objArr2 = new Object[llIIIIIllIl[0]];
            objArr2[llIIIIIllIl[1]] = worldPoint;
            Log.info(str2, objArr2);
            if (lIIlllIIlllIIl(worldPoint)) {
                Movement.setDestination(worldPoint);
            }
        }
        return llIIIIIllIl[0];
    }

    private static void lIIlllIIllIlll() {
        llIIIIIllIl = new int[11];
        llIIIIIllIl[0] = " ".length();
        llIIIIIllIl[1] = (146 ^ 149) & ((179 ^ 180) ^ (-1));
        llIIIIIllIl[2] = (-18467) & 63807;
        llIIIIIllIl[3] = (((43 + 5) - 4) + 140) ^ (((117 + 56) - 158) + 162);
        llIIIIIllIl[4] = (-((-30222) & 32495)) & (-513) & 48125;
        llIIIIIllIl[5] = (((123 + 27) - 107) + 140) ^ (((52 + 105) - 81) + 102);
        llIIIIIllIl[6] = "  ".length();
        llIIIIIllIl[7] = -" ".length();
        llIIIIIllIl[8] = "   ".length();
        llIIIIIllIl[9] = 120 ^ 124;
        llIIIIIllIl[10] = (109 ^ 87) ^ (80 ^ 98);
    }

    private static boolean lIIlllIIlllIlI(int i) {
        return i != 0;
    }

    private static String lIIlllIIlIllIl(String llllllllllllllllIlIIIlllIlIIIIll, String llllllllllllllllIlIIIlllIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llIIIIIllIl[10]), "DES");
            Cipher llllllllllllllllIlIIIlllIlIIIlIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlllIlIIIlIl.init(llIIIIIllIl[6], llllllllllllllllIlIIIlllIlIIIllI);
            return new String(llllllllllllllllIlIIIlllIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlllIlIIIlII) {
            llllllllllllllllIlIIIlllIlIIIlII.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = new int[llIIIIIllIl[0]];
        iArr[llIIIIIllIl[1]] = llIIIIIllIl[4];
        return TileObjects.getAll(iArr).stream().anyMatch((v0) -> {
            return Reachable.isInteractable(v0);
        });
    }

    private static boolean lIIlllIIlllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIIllllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlllIIlIlllI(String llllllllllllllllIlIIIlllIIllIIll, String llllllllllllllllIlIIIlllIIllIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIIIlllIIllIIII = llllllllllllllllIlIIIlllIIllIIlI.toCharArray();
        int llllllllllllllllIlIIIlllIIlIllll = llIIIIIllIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIIIllIl[1];
        while (lIIlllIIllllIl(i, length)) {
            char llllllllllllllllIlIIIlllIIllIlII = charArray[i];
            sb.append((char) (llllllllllllllllIlIIIlllIIllIlII ^ llllllllllllllllIlIIIlllIIllIIII[llllllllllllllllIlIIIlllIIlIllll % llllllllllllllllIlIIIlllIIllIIII.length]));
            "".length();
            llllllllllllllllIlIIIlllIIlIllll++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlllIIllIlll();
        lIIlllIIllIIII();
    }

    private static boolean lIIlllIIlllIIl(Object obj) {
        return obj != null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fv.clear();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public int bZ() {
        String[] strArr = new String[llIIIIIllIl[0]];
        strArr[llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[9]];
        TileObject nearest = TileObjects.getNearest(strArr);
        return lIIlllIIlllIIl(nearest) ? nearest.getWorldLocation().getX() : llIIIIIllIl[1];
    }

    private static boolean lIIlllIIlllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIIllllII(int i) {
        return i == 0;
    }

    private static String lIIlllIIlIllll(String llllllllllllllllIlIIIlllIlIlIIII, String llllllllllllllllIlIIIlllIlIIllll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlllIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlllIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIIllIl[6], llllllllllllllllIlIIIlllIlIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlllIlIlIIIl) {
            llllllllllllllllIlIIIlllIlIlIIIl.printStackTrace();
            return null;
        }
    }
}
