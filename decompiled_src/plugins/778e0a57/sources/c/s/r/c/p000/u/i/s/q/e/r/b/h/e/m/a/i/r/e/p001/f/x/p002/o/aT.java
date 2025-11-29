package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Finishing floor", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aT  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aT.class */
public class aT extends U {
    private static /* synthetic */ String[] lIlIIIlIIIll;
    private /* synthetic */ C0039n ak;
    private static /* synthetic */ int[] lIlIIIlIIlII;

    private static boolean llIlIlIlllIIlI(int i) {
        return i == 0;
    }

    private static boolean llIlIlIlllIlIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIlIlIlllIIlI(C0046u.bf() ? 1 : 0)) {
            return lIlIIIlIIlII[1];
        }
        this.ak = this.co.L();
        if (llIlIlIlllIlII(this.ak.bw, N.END)) {
            ?? r0 = lIlIIIlIIlII[0];
            "".length();
            return ((107 ^ 43) ^ (203 ^ 143)) < (-" ".length()) ? ((((178 + 162) - 254) + 123) ^ (((6 + 115) - 9) + 81)) & (((251 ^ 154) ^ (237 ^ 156)) ^ (-" ".length())) : r0;
        }
        return lIlIIIlIIlII[1];
    }

    private static boolean llIlIlIlllIIIl(int i) {
        return i != 0;
    }

    private static boolean llIlIlIlllIIll(Object obj) {
        return obj == null;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean dX() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[4]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIlII[0]];
                strArr[lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[5]];
                if (llIlIlIlllIIIl(tileObject.hasAction(strArr) ? 1 : 0) && llIlIlIlllIIIl(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIlII[0];
                    "".length();
                    return 0 != 0 ? ((129 ^ 178) ^ (157 ^ 142)) & (((205 ^ 129) ^ (230 ^ 138)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIlIIlII[1];
        });
        if (!llIlIlIlllIIll(nearest) && !llIlIlIlllIlIl(Movement.getRunEnergy(), lIlIIIlIIlII[2])) {
            nearest.interact(lIlIIIlIIIll[lIlIIIlIIlII[3]]);
            return lIlIIIlIIlII[0];
        }
        return lIlIIIlIIlII[1];
    }

    private static boolean llIlIlIlllIllI(int i, int i2) {
        return i < i2;
    }

    private static void llIlIlIllIlllI() {
        lIlIIIlIIIll = new String[lIlIIIlIIlII[10]];
        lIlIIIlIIIll[lIlIIIlIIlII[1]] = llIlIlIllIlIll("Ch0TDT4=", "OsghL");
        lIlIIIlIIIll[lIlIIIlIIlII[0]] = llIlIlIllIllII("pSJJphjDeC4=", "fLLBK");
        lIlIIIlIIIll[lIlIIIlIIlII[3]] = llIlIlIllIllII("tb2z7d3IG8c=", "YoXgu");
        lIlIIIlIIIll[lIlIIIlIIlII[4]] = llIlIlIllIllIl("UyRZaeK9C1rdcMeUBRRa7g==", "tZhOe");
        lIlIIIlIIIll[lIlIIIlIIlII[5]] = llIlIlIllIllII("HVQ6dQT2lDk=", "VTkJL");
        lIlIIIlIIIll[lIlIIIlIIlII[6]] = llIlIlIllIllIl("6JI1uo33jPM=", "vyUsi");
        lIlIIIlIIIll[lIlIIIlIIlII[7]] = llIlIlIllIlIll("EzsaPxc=", "VUnZe");
        lIlIIIlIIIll[lIlIIIlIIlII[8]] = llIlIlIllIlIll("ARUEIg==", "IzhGI");
        lIlIIIlIIIll[lIlIIIlIIlII[9]] = llIlIlIllIlIll("DgkGFRk=", "Kgrpk");
    }

    static {
        llIlIlIllIllll();
        llIlIlIllIlllI();
    }

    private static String llIlIlIllIllII(String lllllllllllllllIlllIIIIlIlIlIlII, String lllllllllllllllIlllIIIIlIlIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlIIlII[3], lllllllllllllllIlllIIIIlIlIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIlIlIlIlIl) {
            lllllllllllllllIlllIIIIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIllIllIl(String lllllllllllllllIlllIIIIlIllllIIl, String lllllllllllllllIlllIIIIlIllllIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIlIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIlIllllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIlII[9]), "DES");
            Cipher lllllllllllllllIlllIIIIlIllllIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIIlIllllIll.init(lIlIIIlIIlII[3], lllllllllllllllIlllIIIIlIlllllII);
            return new String(lllllllllllllllIlllIIIIlIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIlIllllIlI) {
            lllllllllllllllIlllIIIIlIllllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIllIllll() {
        lIlIIIlIIlII = new int[11];
        lIlIIIlIIlII[0] = " ".length();
        lIlIIIlIIlII[1] = ((25 ^ 46) ^ (145 ^ 131)) & (((((72 + 118) - 120) + 69) ^ (((54 + 116) - 115) + 119)) ^ (-" ".length()));
        lIlIIIlIIlII[2] = (239 ^ 129) ^ (107 ^ 57);
        lIlIIIlIIlII[3] = "  ".length();
        lIlIIIlIIlII[4] = "   ".length();
        lIlIIIlIIlII[5] = (74 ^ 24) ^ (216 ^ 142);
        lIlIIIlIIlII[6] = 97 ^ 100;
        lIlIIIlIIlII[7] = (((59 + 147) - 190) + 182) ^ (((129 + 53) - 79) + 89);
        lIlIIIlIIlII[8] = 90 ^ 93;
        lIlIIIlIIlII[9] = (((64 + 15) - (-11)) + 54) ^ (((72 + 123) - 72) + 29);
        lIlIIIlIIlII[10] = 203 ^ 194;
    }

    private static boolean llIlIlIlllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    protected aT(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIlIlllIIIl(tileObject.getName().contains(lIlIIIlIIIll[lIlIIIlIIlII[8]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIlII[0]];
                strArr[lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[9]];
                if (llIlIlIlllIIIl(tileObject.hasAction(strArr) ? 1 : 0) && llIlIlIlllIIIl(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIlII[0];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIlIIlII[1];
        });
        if (llIlIlIlllIIII(nearest) && llIlIlIlllIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            if (!llIlIlIlllIIIl(dX() ? 1 : 0) && !llIlIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
                nearest.interact(lIlIIIlIIIll[lIlIIIlIIlII[1]]);
                return lIlIIIlIIlII[0];
            }
            return lIlIIIlIIlII[0];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
            if (llIlIlIlllIIIl(tileObject2.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[6]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIlII[0]];
                strArr[lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[7]];
                if (llIlIlIlllIIIl(tileObject2.hasAction(strArr) ? 1 : 0) && llIlIlIlllIIIl(this.ak.a((Locatable) tileObject2) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIlII[0];
                    "".length();
                    return "  ".length() <= " ".length() ? ((((16 + 88) - (-78)) + 56) ^ (((98 + 176) - 151) + 60)) & (((((56 + 90) - (-35)) + 63) ^ (((50 + 150) - 27) + 0)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIlIIlII[1];
        });
        if (llIlIlIlllIIll(nearest2)) {
            return lIlIIIlIIlII[1];
        }
        nearest2.interact(lIlIIIlIIIll[lIlIIIlIIlII[0]]);
        return lIlIIIlIIlII[0];
    }

    private static String llIlIlIllIlIll(String lllllllllllllllIlllIIIIlIllIlIIl, String lllllllllllllllIlllIIIIlIllIlIII) {
        String lllllllllllllllIlllIIIIlIllIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIlIllIIlll = new StringBuilder();
        char[] lllllllllllllllIlllIIIIlIllIIllI = lllllllllllllllIlllIIIIlIllIlIII.toCharArray();
        int lllllllllllllllIlllIIIIlIllIIlIl = lIlIIIlIIlII[1];
        char[] charArray = lllllllllllllllIlllIIIIlIllIlIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIlIIlII[1];
        while (llIlIlIlllIllI(i, length)) {
            char lllllllllllllllIlllIIIIlIllIlIlI = charArray[i];
            lllllllllllllllIlllIIIIlIllIIlll.append((char) (lllllllllllllllIlllIIIIlIllIlIlI ^ lllllllllllllllIlllIIIIlIllIIllI[lllllllllllllllIlllIIIIlIllIIlIl % lllllllllllllllIlllIIIIlIllIIllI.length]));
            "".length();
            lllllllllllllllIlllIIIIlIllIIlIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIIIlIllIIlll);
    }

    private static boolean llIlIlIlllIIII(Object obj) {
        return obj != null;
    }
}
