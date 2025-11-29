package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Filling empty buckets", priority = 10, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.h  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/h.class */
public class h extends l {
    private static /* synthetic */ int[] lIIlllIIIIIll;
    private /* synthetic */ int ak;
    private static /* synthetic */ String[] lIIlllIIIIIII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIlIIIlIIlI(this.ar.l() ? 1 : 0) && lIllIIlIIIlIIll(this.ar.L() ? 1 : 0) && lIllIIlIIIlIIlI(Inventory.contains(item -> {
            if (lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[10]]) ? 1 : 0)) {
                String[] strArr = new String[lIIlllIIIIIll[3]];
                strArr[lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[11]];
                if (lIllIIlIIIlIIll(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIlllIIIIIll[3];
                    "".length();
                    return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIlllIIIIIll[0];
        }) ? 1 : 0)) {
            int[] iArr = new int[lIIlllIIIIIll[1]];
            iArr[lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
            iArr[lIIlllIIIIIll[3]] = lIIlllIIIIIll[4];
            if (lIllIIlIIIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIlllIIIIIll[3];
                "".length();
                return " ".length() == 0 ? ((((21 + 144) - 109) + 142) ^ (((43 + 74) - 36) + 50)) & (((29 ^ 80) ^ (100 ^ 108)) ^ (-" ".length())) : r0;
            }
        }
        return lIIlllIIIIIll[0];
    }

    static {
        lIllIIlIIIlIIIl();
        lIllIIlIIIIllII();
    }

    private static void lIllIIlIIIlIIIl() {
        lIIlllIIIIIll = new int[13];
        lIIlllIIIIIll[0] = (238 ^ 187) & ((243 ^ 166) ^ (-1));
        lIIlllIIIIIll[1] = "  ".length();
        lIIlllIIIIIll[2] = (-3107) & 28671;
        lIIlllIIIIIll[3] = " ".length();
        lIIlllIIIIIll[4] = (-6180) & 31743;
        lIIlllIIIIIll[5] = "   ".length();
        lIIlllIIIIIll[6] = (46 ^ 53) ^ (146 ^ 141);
        lIIlllIIIIIll[7] = 181 ^ 185;
        lIIlllIIIIIll[8] = (222 ^ 183) ^ (169 ^ 197);
        lIIlllIIIIIll[9] = 4 ^ 2;
        lIIlllIIIIIll[10] = (11 ^ 27) ^ (11 ^ 28);
        lIIlllIIIIIll[11] = (120 ^ 111) ^ (189 ^ 162);
        lIIlllIIIIIll[12] = 18 ^ 27;
    }

    private static boolean lIllIIlIIIlIlII(int i) {
        return i > 0;
    }

    private static String lIllIIlIIIIIlIl(String llllllllllllllIlllIllIIllIIIlIII, String llllllllllllllIlllIllIIllIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIll[11]), "DES");
            Cipher llllllllllllllIlllIllIIllIIIlIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIllIIIlIlI.init(lIIlllIIIIIll[1], secretKeySpec);
            return new String(llllllllllllllIlllIllIIllIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIllIIIlIIl) {
            llllllllllllllIlllIllIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIIIIIlll(String llllllllllllllIlllIllIIllIIlllIl, String llllllllllllllIlllIllIIllIIlllII) {
        String llllllllllllllIlllIllIIllIIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIIllIIllIlI = llllllllllllllIlllIllIIllIIlllII.toCharArray();
        int llllllllllllllIlllIllIIllIIllIIl = lIIlllIIIIIll[0];
        char[] charArray = llllllllllllllIlllIllIIllIIlllIl2.toCharArray();
        int llllllllllllllIlllIllIIllIIlIIlI = charArray.length;
        int i = lIIlllIIIIIll[0];
        while (lIllIIlIIIlIllI(i, llllllllllllllIlllIllIIllIIlIIlI)) {
            char llllllllllllllIlllIllIIllIIllllI = charArray[i];
            sb.append((char) (llllllllllllllIlllIllIIllIIllllI ^ llllllllllllllIlllIllIIllIIllIlI[llllllllllllllIlllIllIIllIIllIIl % llllllllllllllIlllIllIIllIIllIlI.length]));
            "".length();
            llllllllllllllIlllIllIIllIIllIIl++;
            i++;
            "".length();
            if ((((28 ^ 17) ^ (127 ^ 92)) & (((98 ^ 110) ^ (131 ^ 161)) ^ (-" ".length()))) >= ((93 ^ 11) ^ (220 ^ 142))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIIIlIIlI(int i) {
        return i != 0;
    }

    private static void lIllIIlIIIIllII() {
        lIIlllIIIIIII = new String[lIIlllIIIIIll[12]];
        lIIlllIIIIIII[lIIlllIIIIIll[0]] = lIllIIlIIIIIlIl("aM33n4p8BXT3hT9c9uk4Gg==", "pYjeI");
        lIIlllIIIIIII[lIIlllIIIIIll[3]] = lIllIIlIIIIIllI("fFYI2fR7OFo=", "cUSIq");
        lIIlllIIIIIII[lIIlllIIIIIll[1]] = lIllIIlIIIIIlll("FCMfGi4=", "QNonW");
        lIIlllIIIIIII[lIIlllIIIIIll[5]] = lIllIIlIIIIIllI("W+U0CHs0IjAH6q0u18pRfg==", "bZAui");
        lIIlllIIIIIII[lIIlllIIIIIll[6]] = lIllIIlIIIIIlIl("Yv8cJ//X6ZfMl1kdPsLh0g==", "SzZgZ");
        lIIlllIIIIIII[lIIlllIIIIIll[8]] = lIllIIlIIIIIllI("gIGUu1uFk0o=", "obdPZ");
        lIIlllIIIIIII[lIIlllIIIIIll[9]] = lIllIIlIIIIIllI("EGn6/0sSqRg=", "qvgfu");
        lIIlllIIIIIII[lIIlllIIIIIll[10]] = lIllIIlIIIIIllI("0y8oc+1w4Pw=", "fsxiD");
        lIIlllIIIIIII[lIIlllIIIIIll[11]] = lIllIIlIIIIIlll("NQAWDR0=", "pmfyd");
    }

    private static String lIllIIlIIIIIllI(String llllllllllllllIlllIllIIllIlIllIl, String llllllllllllllIlllIllIIllIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIIIll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIllIlIlllI) {
            llllllllllllllIlllIllIIllIlIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        Player local = Players.getLocal();
        if (lIllIIlIIIlIlII(this.ak)) {
            if (lIllIIlIIIlIlIl(local) && lIllIIlIIIlIIlI(local.isMoving() ? 1 : 0)) {
                return lIIlllIIIIIll[3];
            }
            this.ak -= lIIlllIIIIIll[3];
            if (lIllIIlIIIlIIll(Inventory.contains(item -> {
                if (lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[8]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIlllIIIIIll[3]];
                    strArr[lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[9]];
                    if (lIllIIlIIIlIIll(item.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIlllIIIIIll[3];
                        "".length();
                        return (((74 ^ 15) ^ (223 ^ 150)) & (((207 ^ 133) ^ (60 ^ 122)) ^ (-" ".length()))) != 0 ? ((187 ^ 178) ^ (110 ^ 107)) & (((54 ^ 50) ^ (42 ^ 34)) ^ (-" ".length())) : r0;
                    }
                }
                return lIIlllIIIIIll[0];
            }) ? 1 : 0)) {
                this.ak = lIIlllIIIIIll[0];
                return lIIlllIIIIIll[0];
            }
            return lIIlllIIIIIll[3];
        }
        SceneEntity nearest = TileObjects.getNearest(tileObject -> {
            if (lIllIIlIIIlIIlI(tileObject.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIIlllIIIIIll[3]];
                strArr[lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[6]];
                if (lIllIIlIIIlIIlI(tileObject.hasAction(strArr) ? 1 : 0) && lIllIIlIIIlIllI(tileObject.getWorldLocation().distanceTo(this.ar.N().ag()), lIIlllIIIIIll[7])) {
                    ?? r0 = lIIlllIIIIIll[3];
                    "".length();
                    return " ".length() == (-" ".length()) ? ((((45 + 74) - 99) + 116) ^ (((59 + 55) - 79) + 98)) & (((((86 + 58) - 79) + 83) ^ (((110 + 67) - 151) + 127)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlllIIIIIll[0];
        });
        if (!lIllIIlIIIlIlIl(nearest) || lIllIIlIIIlIIlI(this.au.a((Locatable) nearest) ? 1 : 0)) {
            return lIIlllIIIIIll[3];
        }
        if (lIllIIlIIIlIIlI(this.au.a((Locatable) nearest) ? 1 : 0)) {
            return this.au.b(nearest);
        }
        nearest.interact(lIIlllIIIIIII[lIIlllIIIIIll[0]]);
        this.ak = Inventory.getAll(item2 -> {
            if (lIllIIlIIIlIIlI(item2.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[3]]) ? 1 : 0)) {
                String[] strArr = new String[lIIlllIIIIIll[3]];
                strArr[lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[1]];
                if (lIllIIlIIIlIIll(item2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIlllIIIIIll[3];
                    "".length();
                    return "  ".length() >= ((230 ^ 161) ^ (9 ^ 74)) ? ((((195 + 180) - 343) + 219) ^ (((26 + 159) - 83) + 59)) & (((7 ^ 25) ^ (255 ^ 187)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlllIIIIIll[0];
        }).size() * lIIlllIIIIIll[1];
        return lIIlllIIIIIll[3];
    }

    @Inject
    protected h(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
        this.ak = lIIlllIIIIIll[0];
    }

    private static boolean lIllIIlIIIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIIIlIIll(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIIIlIlIl(Object obj) {
        return obj != null;
    }
}
