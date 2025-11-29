package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Building work area", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.d  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/d.class */
public class d extends Task {
    private static /* synthetic */ String[] lIIlllIIIIlll;
    private static /* synthetic */ int[] lIIlllIIIlIII;
    private final /* synthetic */ a ae;
    private final /* synthetic */ Client af;

    private static String lIllIIlIIIlllll(String llllllllllllllIlllIllIIlIIllllIl, String llllllllllllllIlllIllIIlIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIlIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlIIlllllI) {
            llllllllllllllIlllIllIIlIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIIllI(int i) {
        return i != 0;
    }

    @Inject
    public d(a aVar, Client client) {
        this.ae = aVar;
        this.af = client;
    }

    static {
        lIllIIlIIlIIlII();
        lIllIIlIIlIIIll();
    }

    private static void lIllIIlIIlIIlII() {
        lIIlllIIIlIII = new int[5];
        lIIlllIIIlIII[0] = (48 ^ 101) & ((70 ^ 19) ^ (-1));
        lIIlllIIIlIII[1] = " ".length();
        lIIlllIIIlIII[2] = "  ".length();
        lIIlllIIIlIII[3] = "   ".length();
        lIIlllIIIlIII[4] = (((53 + 188) - 102) + 63) ^ (((151 + 190) - 339) + 192);
    }

    private static boolean lIllIIlIIlIlIII(Object obj) {
        return obj == null;
    }

    private static String lIllIIlIIlIIIlI(String llllllllllllllIlllIllIIlIlIIlIlI, String llllllllllllllIlllIllIIlIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIlIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlIlIIlIll) {
            llllllllllllllIlllIllIIlIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlIIlIIlIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        int i;
        if (!lIllIIlIIlIIlIl(this.af.isInInstancedRegion() ? 1 : 0) && !lIllIIlIIlIIllI(this.ae.M() ? 1 : 0) && !lIllIIlIIlIIlll(this.ae.N())) {
            NPC nearest = NPCs.getNearest(npc -> {
                String[] strArr = new String[lIIlllIIIlIII[1]];
                strArr[lIIlllIIIlIII[0]] = lIIlllIIIIlll[lIIlllIIIlIII[2]];
                return npc.hasAction(strArr);
            });
            String[] strArr = new String[lIIlllIIIlIII[1]];
            strArr[lIIlllIIIlIII[0]] = lIIlllIIIIlll[lIIlllIIIlIII[0]];
            TileObject nearest2 = TileObjects.getNearest(strArr);
            if (!lIllIIlIIlIIlll(nearest) || lIllIIlIIlIlIII(nearest2)) {
                return lIIlllIIIlIII[0];
            }
            if (lIllIIlIIlIlIIl(nearest.getWorldLocation().getX(), nearest2.getWorldLocation().getX())) {
                i = lIIlllIIIlIII[1];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = lIIlllIIIlIII[0];
            }
            this.ae.a(new c(nearest.getWorldLocation(), nearest2.getWorldLocation(), i));
            System.out.println(lIIlllIIIIlll[lIIlllIIIlIII[1]]);
            return lIIlllIIIlIII[1];
        }
        return lIIlllIIIlIII[0];
    }

    private static void lIllIIlIIlIIIll() {
        lIIlllIIIIlll = new String[lIIlllIIIlIII[3]];
        lIIlllIIIIlll[lIIlllIIIlIII[0]] = lIllIIlIIIlllll("BEt8hi1e/vQVCK2boMsKT5ASmU4bNbmF", "DEvuP");
        lIIlllIIIIlll[lIIlllIIIlIII[1]] = lIllIIlIIIlllll("B/w95jfvEygKPWKiRIa7OJV352puYt+SPf6JDJslRBA=", "NVWnV");
        lIIlllIIIIlll[lIIlllIIIlIII[2]] = lIllIIlIIlIIIlI("aUbxCS5uxks=", "tJbdP");
    }
}
