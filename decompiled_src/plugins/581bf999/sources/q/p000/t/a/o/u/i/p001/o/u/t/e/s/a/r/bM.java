package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bM.class */
public abstract class bM extends AbstractC0015ao {
    private static final /* synthetic */ int gP;
    private static final /* synthetic */ int gN;
    private static /* synthetic */ String[] llIIlIlIIll;
    private static final /* synthetic */ int gQ;
    private static /* synthetic */ int[] llIIlIlIlll;
    private static final /* synthetic */ int gO;

    public Set<WorldPoint> cs() {
        return o(llIIlIlIlll[12]);
    }

    private static boolean lIlIIIIlIllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        String[] strArr = new String[llIIlIlIlll[1]];
        strArr[llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[2]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIIIlIlIlIl(nearest)) {
            String[] strArr2 = new String[llIIlIlIlll[1]];
            strArr2[llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[1]];
            if (!lIlIIIIlIlIllI(nearest.hasAction(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llIIlIlIlll[1]];
                strArr3[llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[8]];
                if (lIlIIIIlIlIlll(nearest.hasAction(strArr3) ? 1 : 0)) {
                    return llIIlIlIlll[2];
                }
                if (lIlIIIIlIlIlll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                    return llIIlIlIlll[1];
                } else if (!lIlIIIIlIlIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                    nearest.interact(llIIlIlIIll[llIIlIlIlll[10]]);
                    return llIIlIlIlll[2];
                } else {
                    String[] strArr4 = new String[llIIlIlIlll[1]];
                    strArr4[llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[9]];
                    Dialog.chooseOption(strArr4);
                    "".length();
                    return llIIlIlIlll[1];
                }
            }
        }
        return llIIlIlIlll[2];
    }

    static {
        lIlIIIIlIlIIII();
        lIlIIIIlIIllll();
        gP = llIIlIlIlll[11];
        gN = llIIlIlIlll[13];
        gO = llIIlIlIlll[0];
        gQ = llIIlIlIlll[3];
    }

    private static boolean lIlIIIIlIlIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIlIlIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIIlIlIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[llIIlIlIlll[1]];
        iArr[llIIlIlIlll[2]] = llIIlIlIlll[3];
        if (lIlIIIIlIlIIIl(TileObjects.getNearest(iArr)) && lIlIIIIlIlIIlI(aX())) {
            ?? r0 = llIIlIlIlll[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIlIlll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean cq() {
        NPC co = co();
        if (lIlIIIIlIlIlIl(co) && lIlIIIIlIlIlII(co.getAnimation(), llIIlIlIlll[11])) {
            ?? r0 = llIIlIlIlll[1];
            "".length();
            return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIlIlll[2];
    }

    public NPC co() {
        int[] iArr = new int[llIIlIlIlll[10]];
        iArr[llIIlIlIlll[2]] = llIIlIlIlll[4];
        iArr[llIIlIlIlll[1]] = llIIlIlIlll[5];
        iArr[llIIlIlIlll[8]] = llIIlIlIlll[6];
        iArr[llIIlIlIlll[9]] = llIIlIlIlll[7];
        return NPCs.getNearest(iArr);
    }

    private static void lIlIIIIlIIllll() {
        llIIlIlIIll = new String[llIIlIlIlll[14]];
        llIIlIlIIll[llIIlIlIlll[2]] = lIlIIIIIlllIII("f8rSHLXnZkCFDU3LlKGFAMTG3CYKVj+H", "HDJXj");
        llIIlIlIIll[llIIlIlIlll[1]] = lIlIIIIIlllIII("YERDxK4KZ08=", "qVxNc");
        llIIlIlIIll[llIIlIlIlll[8]] = lIlIIIIIlllIII("Ys8LMNrpd0fGuwLmDgsgzQ==", "KYbXi");
        llIIlIlIIll[llIIlIlIlll[9]] = lIlIIIIlIIlllI("DBce", "Urmxv");
        llIIlIlIIll[llIIlIlIlll[10]] = lIlIIIIIlllIII("xOrnnxA+bzQ=", "ITrdT");
    }

    private static boolean lIlIIIIlIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIlIlIIlI(int i) {
        return i <= 0;
    }

    public Set<WorldPoint> o(int i) {
        HashSet hashSet = new HashSet();
        this.cu.getGraphicsObjects().forEach(graphicsObject -> {
            if (lIlIIIIlIlIlII(graphicsObject.getId(), llIIlIlIlll[13]) && lIlIIIIlIllIII(graphicsObject.getFrame(), i)) {
                hashSet.add(WorldPoint.fromLocal(this.cu, graphicsObject.getLocation()));
                "".length();
            }
        });
        return hashSet;
    }

    private static boolean lIlIIIIlIlIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIIlIlIIll(int i, int i2) {
        return i != i2;
    }

    private static String lIlIIIIIlllIII(String llllllllllllllllIIlllllIlIIIIlII, String llllllllllllllllIIlllllIlIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlIlll[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllllIlIIIIlIl) {
            llllllllllllllllIIlllllIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.finalWardenGear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int aX = aX();
        if (lIlIIIIlIlIIll(aX, llIIlIlIlll[4]) && lIlIIIIlIlIIll(aX, llIIlIlIlll[5]) && lIlIIIIlIlIIll(aX, llIIlIlIlll[6]) && !lIlIIIIlIlIlII(aX, llIIlIlIlll[7])) {
            return llIIlIlIlll[2];
        }
        ?? r0 = llIIlIlIlll[1];
        "".length();
        return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean cr() {
        if (!lIlIIIIlIlIIll(aX(), llIIlIlIlll[6]) || lIlIIIIlIlIlII(aX(), llIIlIlIlll[7])) {
            ?? r0 = llIIlIlIlll[1];
            "".length();
            return ((154 ^ 165) & ((133 ^ 186) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIlIlll[2];
    }

    private static String lIlIIIIlIIlllI(String llllllllllllllllIIlllllIlIIllIIl, String llllllllllllllllIIlllllIlIIllIII) {
        String llllllllllllllllIIlllllIlIIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllllIlIIllIII.toCharArray();
        int llllllllllllllllIIlllllIlIIlIIII = llIIlIlIlll[2];
        char[] charArray2 = llllllllllllllllIIlllllIlIIllIIl2.toCharArray();
        int llllllllllllllllIIlllllIlIIIlllI = charArray2.length;
        int i = llIIlIlIlll[2];
        while (lIlIIIIlIllIIl(i, llllllllllllllllIIlllllIlIIIlllI)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlllllIlIIlIIII % charArray.length]));
            "".length();
            llllllllllllllllIIlllllIlIIlIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIIlIllIII(int i, int i2) {
        return i > i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public bM(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.finalWardenSpec();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIIlIlIlll[0];
    }

    private static void lIlIIIIlIlIIII() {
        llIIlIlIlll = new int[15];
        llIIlIlIlll[0] = (-16933) & 32628;
        llIIlIlIlll[1] = " ".length();
        llIIlIlIlll[2] = ((201 ^ 166) ^ (62 ^ 13)) & (((((20 + 8) - (-54)) + 131) ^ (((26 + 124) - 47) + 34)) ^ (-" ".length()));
        llIIlIlIlll[3] = (-20545) & 65486;
        llIIlIlIlll[4] = (-20997) & 32757;
        llIIlIlIlll[5] = (-4097) & 15858;
        llIIlIlIlll[6] = (-((-31965) & 32477)) & (-1) & 12275;
        llIIlIlIlll[7] = (-4610) & 16373;
        llIIlIlIlll[8] = "  ".length();
        llIIlIlIlll[9] = "   ".length();
        llIIlIlIlll[10] = (16 ^ 52) ^ (142 ^ 174);
        llIIlIlIlll[11] = (-((-12293) & 29199)) & (-4129) & 30719;
        llIIlIlIlll[12] = (((135 + 136) - 236) + 122) ^ (((7 + 0) - (-119)) + 29);
        llIIlIlIlll[13] = (-(166 ^ 135)) & (-25089) & 27371;
        llIIlIlIlll[14] = (25 ^ 64) ^ (204 ^ 144);
    }
}
