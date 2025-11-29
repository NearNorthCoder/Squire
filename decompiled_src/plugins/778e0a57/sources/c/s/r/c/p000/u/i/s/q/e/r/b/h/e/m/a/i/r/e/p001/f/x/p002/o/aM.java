package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Loot Chest", priority = 50000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aM  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aM.class */
public class aM extends aR {
    private static /* synthetic */ String[] lIlIIlllllII;
    private static /* synthetic */ int[] lIlIIlllllIl;

    private static void llIllIllIlllll() {
        lIlIIlllllIl = new int[13];
        lIlIIlllllIl[0] = ((1 ^ 89) ^ (231 ^ 186)) & (((60 ^ 38) ^ (11 ^ 20)) ^ (-" ".length()));
        lIlIIlllllIl[1] = " ".length();
        lIlIIlllllIl[2] = (-7169) & 7707;
        lIlIIlllllIl[3] = 128 ^ 133;
        lIlIIlllllIl[4] = "  ".length();
        lIlIIlllllIl[5] = "   ".length();
        lIlIIlllllIl[6] = (111 ^ 66) ^ (31 ^ 54);
        lIlIIlllllIl[7] = 168 ^ 174;
        lIlIIlllllIl[8] = 175 ^ 168;
        lIlIIlllllIl[9] = (((114 + 104) - 95) + 4) ^ (193 ^ 181);
        lIlIIlllllIl[10] = 114 ^ 122;
        lIlIIlllllIl[11] = 183 ^ 190;
        lIlIIlllllIl[12] = 152 ^ 146;
    }

    private static void llIllIllIllllI() {
        lIlIIlllllII = new String[lIlIIlllllIl[12]];
        lIlIIlllllII[lIlIIlllllIl[0]] = llIllIllIllIll("ztpmAAPfUG6DRqZAn86atQ==", "eqbKp");
        lIlIIlllllII[lIlIIlllllIl[1]] = llIllIllIlllII("ERQ7PAgq", "BqZNk");
        lIlIIlllllII[lIlIIlllllIl[4]] = llIllIllIlllIl("OdHam3Xg36I=", "xqiFb");
        lIlIIlllllII[lIlIIlllllIl[5]] = llIllIllIlllII("HDIKAQ==", "HSadX");
        lIlIIlllllII[lIlIIlllllIl[6]] = llIllIllIlllII("Ey8lFw==", "GNNrZ");
        lIlIIlllllII[lIlIIlllllIl[3]] = llIllIllIlllIl("BsBFUIv2ai4=", "kDSrC");
        lIlIIlllllII[lIlIIlllllIl[7]] = llIllIllIllIll("9ONpBhVEHPg=", "ZeAyM");
        lIlIIlllllII[lIlIIlllllIl[8]] = llIllIllIlllIl("J0yj0ZHH32w=", "tdveA");
        lIlIIlllllII[lIlIIlllllIl[10]] = llIllIllIlllII("NAc3IAcbHXQqChAaIA==", "uiTIb");
        lIlIIlllllII[lIlIIlllllIl[11]] = llIllIllIlllII("AQEIFhc6", "Rdidt");
    }

    @Inject
    protected aM(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIllIlllIIIlI(int i, int i2) {
        return i >= i2;
    }

    static {
        llIllIllIlllll();
        llIllIllIllllI();
    }

    private static boolean llIllIlllIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* renamed from: do  reason: not valid java name */
    private boolean m40do() {
        Widget widget = Widgets.get(lIlIIlllllIl[2], lIlIIlllllIl[1], lIlIIlllllIl[9]);
        if (llIllIlllIIIIl(widget) && llIllIlllIIIII(widget.isVisible() ? 1 : 0)) {
            ?? r0 = lIlIIlllllIl[1];
            "".length();
            return ((((7 + 8) - 8) + 149) ^ (((116 + 74) - 159) + 121)) == " ".length() ? ("  ".length() ^ (23 ^ 19)) & (((162 ^ 198) ^ (87 ^ 53)) ^ (-" ".length())) : r0;
        }
        return lIlIIlllllIl[0];
    }

    private static boolean llIllIlllIIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIllIllIlllII(String lllllllllllllllIllIlIllIlIIIIlII, String lllllllllllllllIllIlIllIlIIIIIll) {
        String lllllllllllllllIllIlIllIlIIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIllIlIIIIIlI = new StringBuilder();
        char[] lllllllllllllllIllIlIllIlIIIIIIl = lllllllllllllllIllIlIllIlIIIIIll.toCharArray();
        int lllllllllllllllIllIlIllIlIIIIIII = lIlIIlllllIl[0];
        char[] charArray = lllllllllllllllIllIlIllIlIIIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlllllIl[0];
        while (llIllIlllIIllI(i, length)) {
            char lllllllllllllllIllIlIllIlIIIIlIl = charArray[i];
            lllllllllllllllIllIlIllIlIIIIIlI.append((char) (lllllllllllllllIllIlIllIlIIIIlIl ^ lllllllllllllllIllIlIllIlIIIIIIl[lllllllllllllllIllIlIllIlIIIIIII % lllllllllllllllIllIlIllIlIIIIIIl.length]));
            "".length();
            lllllllllllllllIllIlIllIlIIIIIII++;
            i++;
            "".length();
            if ((((((17 + 54) - (-66)) + 24) ^ (((31 + 104) - 51) + 54)) & (((((135 + 8) - 67) + 81) ^ (((25 + 5) - (-19)) + 133)) ^ (-" ".length()))) != (((117 ^ 101) ^ (123 ^ 52)) & (((((239 + 172) - 205) + 41) ^ (((145 + 47) - 154) + 130)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIllIlIIIIIlI);
    }

    private static boolean llIllIlllIIlII(int i) {
        return i == 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return null;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIllIlllIIIll(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    private boolean dn() {
        Widget widget = Widgets.get(lIlIIlllllIl[2], lIlIIlllllIl[3], lIlIIlllllIl[0]);
        Widget widget2 = Widgets.get(lIlIIlllllIl[2], lIlIIlllllIl[3], lIlIIlllllIl[1]);
        Widget widget3 = Widgets.get(lIlIIlllllIl[2], lIlIIlllllIl[3], lIlIIlllllIl[4]);
        if (llIllIlllIIIIl(widget)) {
            String[] strArr = new String[lIlIIlllllIl[1]];
            strArr[lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[4]];
            if (llIllIlllIIIII(widget.hasAction(strArr) ? 1 : 0)) {
                widget.interact(lIlIIlllllII[lIlIIlllllIl[5]]);
                return lIlIIlllllIl[1];
            }
        }
        if (llIllIlllIIIIl(widget3)) {
            String[] strArr2 = new String[lIlIIlllllIl[1]];
            strArr2[lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[6]];
            if (llIllIlllIIIII(widget3.hasAction(strArr2) ? 1 : 0)) {
                widget3.interact(lIlIIlllllII[lIlIIlllllIl[3]]);
                return lIlIIlllllIl[1];
            }
        }
        if (llIllIlllIIIIl(widget2)) {
            String[] strArr3 = new String[lIlIIlllllIl[1]];
            strArr3[lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[7]];
            if (llIllIlllIIIII(widget2.hasAction(strArr3) ? 1 : 0)) {
                widget2.interact(lIlIIlllllII[lIlIIlllllIl[8]]);
                return lIlIIlllllIl[1];
            }
        }
        this.ea.b((boolean) lIlIIlllllIl[1]);
        return lIlIIlllllIl[0];
    }

    private static boolean llIllIlllIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean llIllIlllIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean run() {
        if (!llIllIlllIIIII(this.eb.pause() ? 1 : 0) && !llIllIlllIIIII(this.ea.G() ? 1 : 0) && !llIllIlllIIlII(this.ec.isInInstancedRegion() ? 1 : 0)) {
            this.bS = Players.getLocal();
            return llIllIlllIIIll(this.bS) ? lIlIIlllllIl[0] : (!llIllIlllIIlIl(C0046u.bh(), EnumC0048w.GET_OUT) || llIllIlllIIIII(this.bS.getPlane())) ? lIlIIlllllIl[0] : cg();
        }
        return lIlIIlllllIl[0];
    }

    private static String llIllIllIllIll(String lllllllllllllllIllIlIllIIllIllll, String lllllllllllllllIllIlIllIIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlllllIl[4], lllllllllllllllIllIlIllIIlllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIllIIlllIIII) {
            lllllllllllllllIllIlIllIIlllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlllIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (llIllIlllIIIII(m40do() ? 1 : 0)) {
            return dn();
        }
        if (llIllIlllIIIII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        TileObject dq = dq();
        if (llIllIlllIIIIl(dq) && llIllIlllIIIlI(dq.getWorldY(), this.bS.getWorldY())) {
            dq.interact(lIlIIlllllII[lIlIIlllllIl[0]]);
            return lIlIIlllllIl[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIllIlllIIIII(tileObject.getName().equals(lIlIIlllllII[lIlIIlllllIl[10]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlllllIl[1]];
                strArr[lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[11]];
                if (llIllIlllIIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIlllllIl[1];
                    "".length();
                    return "   ".length() < "   ".length() ? ((((30 + 6) - (-73)) + 109) ^ (((127 + 41) - 153) + 130)) & (((136 ^ 140) ^ (249 ^ 182)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIlllllIl[0];
        });
        if (llIllIlllIIIll(nearest)) {
            return lIlIIlllllIl[0];
        }
        nearest.interact(lIlIIlllllII[lIlIIlllllIl[1]]);
        return lIlIIlllllIl[1];
    }

    private static String llIllIllIlllIl(String lllllllllllllllIllIlIllIIllIIIlI, String lllllllllllllllIllIlIllIIllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIlllllIl[10]), "DES");
            Cipher lllllllllllllllIllIlIllIIllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIllIlIllIIllIIlII.init(lIlIIlllllIl[4], secretKeySpec);
            return new String(lllllllllllllllIllIlIllIIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIllIIllIIIll) {
            lllllllllllllllIllIlIllIIllIIIll.printStackTrace();
            return null;
        }
    }
}
