package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aI.class */
public abstract class aI extends AbstractC0015ao {
    protected static final /* synthetic */ Point dH;
    private static /* synthetic */ int[] lIlllIlIlIl;
    private static final /* synthetic */ int dO;
    private static /* synthetic */ String[] lIlllIlIIll;
    protected static final /* synthetic */ int dN;
    protected static final /* synthetic */ Point dI;
    protected static final /* synthetic */ Point dM;
    protected static final /* synthetic */ Point dG;
    protected static final /* synthetic */ Point dK;
    private static final /* synthetic */ int[] dP;
    protected static final /* synthetic */ Point dJ;
    protected static final /* synthetic */ Point dL;

    private static String lIIllIIlIllIII(String llllllllllllllllIlIIllIlIIIIIIlI, String llllllllllllllllIlIIllIlIIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIlIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIlIlIl[1], llllllllllllllllIlIIllIlIIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIlIIIIIIll) {
            llllllllllllllllIlIIllIlIIIIIIll.printStackTrace();
            return null;
        }
    }

    static {
        lIIllIIlIlllIl();
        lIIllIIlIllIIl();
        dN = lIlllIlIlIl[12];
        dO = lIlllIlIlIl[0];
        dG = new Point(lIlllIlIlIl[13], lIlllIlIlIl[14]);
        dH = new Point(lIlllIlIlIl[15], lIlllIlIlIl[14]);
        dI = new Point(lIlllIlIlIl[16], lIlllIlIlIl[14]);
        dJ = new Point(lIlllIlIlIl[16], lIlllIlIlIl[17]);
        dK = new Point(lIlllIlIlIl[18], lIlllIlIlIl[14]);
        dL = new Point(lIlllIlIlIl[13], lIlllIlIlIl[19]);
        dM = new Point(lIlllIlIlIl[20], lIlllIlIlIl[21]);
        int[] iArr = new int[lIlllIlIlIl[5]];
        iArr[lIlllIlIlIl[2]] = lIlllIlIlIl[22];
        iArr[lIlllIlIlIl[3]] = lIlllIlIlIl[23];
        iArr[lIlllIlIlIl[1]] = lIlllIlIlIl[12];
        iArr[lIlllIlIlIl[4]] = lIlllIlIlIl[24];
        dP = iArr;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.babaSpecialStyle();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaAttackStyle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        String[] strArr = new String[lIlllIlIlIl[3]];
        strArr[lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIllIIllIIIII(nearest)) {
            return lIlllIlIlIl[2];
        }
        r();
        nearest.interact(lIlllIlIIll[lIlllIlIlIl[4]]);
        return lIlllIlIlIl[3];
    }

    private static boolean lIIllIIllIIIlI(int i) {
        return i > 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        return e(dP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        String[] strArr = new String[lIlllIlIlIl[1]];
        strArr[lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[2]];
        strArr[lIlllIlIlIl[3]] = lIlllIlIIll[lIlllIlIlIl[3]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIIlIllllI(nearest) && lIIllIIlIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            ?? r0 = lIlllIlIlIl[3];
            "".length();
            return "  ".length() == 0 ? (" ".length() ^ (149 ^ 182)) & (((((31 + 67) - 52) + 82) ^ (((100 + 20) - 73) + 115)) ^ (-" ".length())) : r0;
        }
        return lIlllIlIlIl[2];
    }

    private static String lIIllIIlIlIlll(String llllllllllllllllIlIIllIlIIIlIlll, String llllllllllllllllIlIIllIlIIIlIllI) {
        String llllllllllllllllIlIIllIlIIIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIlIIIlIlIl = new StringBuilder();
        char[] llllllllllllllllIlIIllIlIIIlIlII = llllllllllllllllIlIIllIlIIIlIllI.toCharArray();
        int llllllllllllllllIlIIllIlIIIlIIll = lIlllIlIlIl[2];
        char[] charArray = llllllllllllllllIlIIllIlIIIlIlll2.toCharArray();
        int length = charArray.length;
        int i = lIlllIlIlIl[2];
        while (lIIllIIllIIIll(i, length)) {
            char llllllllllllllllIlIIllIlIIIIlIlI = charArray[i];
            llllllllllllllllIlIIllIlIIIlIlIl.append((char) (llllllllllllllllIlIIllIlIIIIlIlI ^ llllllllllllllllIlIIllIlIIIlIlII[llllllllllllllllIlIIllIlIIIlIIll % llllllllllllllllIlIIllIlIIIlIlII.length]));
            "".length();
            llllllllllllllllIlIIllIlIIIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIllIlIIIlIlIl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NPC bB() {
        return NPCs.getNearest(dP);
    }

    public int bA() {
        double bit = (Vars.getBit(lIlllIlIlIl[10]) / Vars.getBit(lIlllIlIlIl[11])) * 100.0d;
        return lIIllIIllIIIlI(lIIllIIllIIIIl(bit, 66.0d)) ? lIlllIlIlIl[3] : lIIllIIllIIIlI(lIIllIIllIIIIl(bit, 33.0d)) ? lIlllIlIlIl[1] : lIlllIlIlIl[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIIllIIlIlllll(super.bn() ? 1 : 0)) {
            return lIlllIlIlIl[3];
        }
        if (lIIllIIlIlllll(Dialog.isOpen() ? 1 : 0) && lIIllIIlIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlllIlIlIl[3];
        }
        String[] strArr = new String[lIlllIlIlIl[1]];
        strArr[lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[5]];
        strArr[lIlllIlIlIl[3]] = lIlllIlIIll[lIlllIlIlIl[6]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIIllIIIII(nearest)) {
            return lIlllIlIlIl[2];
        }
        String[] strArr2 = new String[lIlllIlIlIl[3]];
        strArr2[lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[7]];
        if (lIIllIIlIlllll(nearest.hasAction(strArr2) ? 1 : 0)) {
            nearest.interact(lIlllIlIIll[lIlllIlIlIl[8]]);
            return lIlllIlIlIl[3];
        }
        nearest.interact(lIlllIlIIll[lIlllIlIlIl[9]]);
        return lIlllIlIlIl[3];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        return bC();
    }

    private static boolean lIIllIIllIIIII(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return lIlllIlIlIl[0];
    }

    public abstract boolean bC();

    private static boolean lIIllIIlIllllI(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aI(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static int lIIllIIllIIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIllIIlIllIIl() {
        lIlllIlIIll = new String[lIlllIlIlIl[25]];
        lIlllIlIIll[lIlllIlIlIl[2]] = lIIllIIlIlIlll("NycUHCUTOQ==", "vWyyN");
        lIlllIlIIll[lIlllIlIlIl[3]] = lIIllIIlIlIlll("AgkIBi45Hws=", "MzesC");
        lIlllIlIIll[lIlllIlIlIl[1]] = lIIllIIlIlIlll("PRIgLgYGBThrFRsOPz8XBQ==", "iwLKv");
        lIlllIlIIll[lIlllIlIlIl[4]] = lIIllIIlIllIII("mREjXpXgg8+O9IGEUV/bWQ==", "JLVLp");
        lIlllIlIIll[lIlllIlIlIl[5]] = lIIllIIlIlIlll("LSIYAQQJPA==", "lRudo");
        lIlllIlIIll[lIlllIlIlIl[6]] = lIIllIIlIllIII("Eg6BfQogBuUz3/JyroBiOA==", "PUUIe");
        lIlllIlIIll[lIlllIlIlIl[7]] = lIIllIIlIlIlll("Fxc+GjtrDjIYJiM=", "FbWyP");
        lIlllIlIIll[lIlllIlIlIl[8]] = lIIllIIlIllIII("P4g120f2rqEQfI0w+d+gAg==", "haYJc");
        lIlllIlIIll[lIlllIlIlIl[9]] = lIIllIIlIllIII("WHqOIl+7aww=", "kbJSI");
    }

    private static boolean lIIllIIllIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIIlIlllll(int i) {
        return i != 0;
    }

    private static void lIIllIIlIlllIl() {
        lIlllIlIlIl = new int[26];
        lIlllIlIlIl[0] = (-1163) & 16350;
        lIlllIlIlIl[1] = "  ".length();
        lIlllIlIlIl[2] = ((138 ^ 151) ^ (115 ^ 68)) & (((153 ^ 189) ^ (164 ^ 170)) ^ (-" ".length()));
        lIlllIlIlIl[3] = " ".length();
        lIlllIlIlIl[4] = "   ".length();
        lIlllIlIlIl[5] = 97 ^ 101;
        lIlllIlIlIl[6] = 63 ^ 58;
        lIlllIlIlIl[7] = (((98 + 68) - 74) + 83) ^ (((103 + 116) - 183) + 133);
        lIlllIlIlIl[8] = (76 ^ 96) ^ (91 ^ 112);
        lIlllIlIlIl[9] = (255 ^ 173) ^ (41 ^ 115);
        lIlllIlIlIl[10] = (-26661) & 32759;
        lIlllIlIlIl[11] = (-((-2769) & 27388)) & (-1) & 30719;
        lIlllIlIlIl[12] = (-((-23041) & 23377)) & (-20482) & 32597;
        lIlllIlIlIl[13] = 81 ^ 71;
        lIlllIlIlIl[14] = (110 ^ 70) ^ (6 ^ 9);
        lIlllIlIlIl[15] = 102 ^ 113;
        lIlllIlIlIl[16] = 162 ^ 136;
        lIlllIlIlIl[17] = 133 ^ 166;
        lIlllIlIlIl[18] = (110 ^ 43) ^ (33 ^ 77);
        lIlllIlIlIl[19] = (((104 + 48) - 113) + 112) ^ (((70 + 121) - 146) + 132);
        lIlllIlIlIl[20] = 72 ^ 105;
        lIlllIlIlIl[21] = 184 ^ 157;
        lIlllIlIlIl[22] = (-16822) & 28599;
        lIlllIlIlIl[23] = (-(151 ^ 182)) & (-16385) & 28543;
        lIlllIlIlIl[24] = (-((-25859) & 30199)) & (-9) & 16127;
        lIlllIlIlIl[25] = (((1 + 155) - 3) + 11) ^ (((152 + 100) - 201) + 122);
    }
}
