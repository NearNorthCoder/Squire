package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.by  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/by.class */
public abstract class AbstractC0052by extends AbstractC0015ao {
    private static /* synthetic */ int[] lIllIllIIII;
    private static final /* synthetic */ int fJ;
    private static final /* synthetic */ int fK;
    private static final /* synthetic */ int fL;
    private static final /* synthetic */ int fI;
    private static /* synthetic */ String[] lIllIlIlIII;
    protected static final /* synthetic */ List<Integer> fH;

    private static boolean lIIlIlllIlllll(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.obeliskGear();
    }

    private static String lIIlIlllIIIIll(String llllllllllllllllIlIlIIIIllllIlll, String llllllllllllllllIlIlIIIIllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIIlllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIIlllllIIl.init(lIllIllIIII[5], secretKeySpec);
            return new String(llllllllllllllllIlIlIIIIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIIlllllIII) {
            llllllllllllllllIlIlIIIIlllllIII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIIllI() {
        lIllIlIlIII = new String[lIllIllIIII[18]];
        lIllIlIlIII[lIllIllIIII[3]] = lIIlIlllIIIIll("Dkm10eBshws=", "ZWNfK");
        lIllIlIlIII[lIllIllIIII[2]] = lIIlIlllIIIlII("zivG3PqC1+RRC6J63oxvrA==", "uFlFW");
        lIllIlIlIII[lIllIllIIII[5]] = lIIlIlllIIIlII("RYNaqav6Mn6SiLmbN2aNoA==", "boqbE");
        lIllIlIlIII[lIllIllIIII[6]] = lIIlIlllIIIIll("+3yb/RaXX/cfrKULDyl9uxddX0tPFidY", "tXUGv");
        lIllIlIlIII[lIllIllIIII[7]] = lIIlIlllIIIlIl("Eyo/", "JOLZJ");
        lIllIlIlIII[lIllIllIIII[8]] = lIIlIlllIIIlIl("HBYQ", "Ieusd");
        lIllIlIlIII[lIllIllIIII[9]] = lIIlIlllIIIlII("S6TwLS44hOQ=", "avNQv");
        lIllIlIlIII[lIllIllIIII[10]] = lIIlIlllIIIlII("V//xqnVdHGE=", "fgLnd");
        lIllIlIlIII[lIllIllIIII[11]] = lIIlIlllIIIIll("dnTVW9W52Z0=", "Fpufy");
        lIllIlIlIII[lIllIllIIII[12]] = lIIlIlllIIIlIl("JgwEIxQf", "qmvGq");
        lIllIlIlIII[lIllIllIIII[13]] = lIIlIlllIIIlII("Cpaf60izzlc=", "quHBC");
    }

    private static void lIIlIlllIllllI() {
        lIllIllIIII = new int[19];
        lIllIllIIII[0] = (-17424) & 32607;
        lIllIllIIII[1] = (-((-8226) & 26287)) & (-33) & 32765;
        lIllIllIIII[2] = " ".length();
        lIllIllIIII[3] = (123 ^ 39) & ((4 ^ 88) ^ (-1));
        lIllIllIIII[4] = (-((-11907) & 28339)) & (-2) & 61375;
        lIllIllIIII[5] = "  ".length();
        lIllIllIIII[6] = "   ".length();
        lIllIllIIII[7] = 70 ^ 66;
        lIllIllIIII[8] = (113 ^ 85) ^ (24 ^ 57);
        lIllIllIIII[9] = (18 ^ 95) ^ (243 ^ 184);
        lIllIllIIII[10] = (136 ^ 183) ^ (55 ^ 15);
        lIllIllIIII[11] = 133 ^ 141;
        lIllIllIIII[12] = (211 ^ 180) ^ (235 ^ 133);
        lIllIllIIII[13] = (79 ^ 122) ^ (126 ^ 65);
        lIllIllIIII[14] = (-((-9031) & 31591)) & (-18) & 32247;
        lIllIllIIII[15] = (-16453) & 28142;
        lIllIllIIII[16] = (-((-20885) & 23966)) & (-65) & 48895;
        lIllIllIIII[17] = (-17673) & 63423;
        lIllIllIIII[18] = 109 ^ 102;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public AbstractC0052by(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIlIllllIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllllIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        String[] strArr = new String[lIllIllIIII[2]];
        strArr[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[2]];
        if (lIIlIllllIIIIl(NPCs.getNearest(strArr))) {
            ?? r0 = lIllIllIIII[2];
            "".length();
            return (-((214 ^ 151) ^ (126 ^ 59))) >= 0 ? ((21 ^ 49) ^ (165 ^ 149)) & (((8 ^ 86) ^ (233 ^ 163)) ^ (-" ".length())) : r0;
        }
        return lIllIllIIII[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    protected boolean aS() {
        String[] strArr = new String[lIllIllIIII[2]];
        strArr[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[3]];
        if (lIIlIllllIIIIl(NPCs.getNearest(strArr)) && lIIlIllllIIIIl(NPCs.getNearest(npc -> {
            if (lIIlIlllIlllll(npc.getName().contains(lIllIlIlIII[lIllIllIIII[12]]) ? 1 : 0)) {
                String[] strArr2 = new String[lIllIllIIII[2]];
                strArr2[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[13]];
                if (!lIIlIllllIIIlI(npc.hasAction(strArr2) ? 1 : 0) || lIIlIllllIIIll(npc.getAnimation(), lIllIllIIII[14])) {
                    ?? r0 = lIllIllIIII[2];
                    "".length();
                    return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIllIIII[3];
        }))) {
            ?? r0 = lIllIllIIII[2];
            "".length();
            return (-"   ".length()) > 0 ? ("  ".length() ^ (109 ^ 49)) & (((190 ^ 174) ^ (57 ^ 119)) ^ (-" ".length())) : r0;
        }
        return lIllIllIIII[3];
    }

    private static boolean lIIlIllllIIIII(Object obj) {
        return obj != null;
    }

    static {
        lIIlIlllIllllI();
        lIIlIlllIIIllI();
        fI = lIllIllIIII[0];
        fL = lIllIllIIII[1];
        fJ = lIllIllIIII[15];
        fK = lIllIllIIII[4];
        fH = List.of(Integer.valueOf(lIllIllIIII[16]), Integer.valueOf(lIllIllIIII[17]));
    }

    private static boolean lIIlIllllIIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        if (lIIlIlllIlllll(this.cw.j(lIllIllIIII[1]) ? 1 : 0)) {
            return lIllIllIIII[2];
        }
        int[] iArr = new int[lIllIllIIII[2]];
        iArr[lIllIllIIII[3]] = lIllIllIIII[4];
        if (lIIlIllllIIIII(TileObjects.getNearest(iArr))) {
            ?? r0 = lIllIllIIII[2];
            "".length();
            return (-" ".length()) > (-" ".length()) ? ((((119 + 218) - 285) + 175) ^ (((7 + 78) - 50) + 144)) & (((165 ^ 174) ^ (201 ^ 146)) ^ (-" ".length())) : r0;
        }
        return lIllIllIIII[3];
    }

    private static String lIIlIlllIIIlII(String llllllllllllllllIlIlIIIlIIIIIlII, String llllllllllllllllIlIlIIIlIIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIIIIIIll.getBytes(StandardCharsets.UTF_8)), lIllIllIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlIIIIIlIl) {
            llllllllllllllllIlIlIIIlIIIIIlIl.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return lIllIllIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        String[] strArr = new String[lIllIllIIII[2]];
        strArr[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[5]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIIlIllllIIIlI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            if (lIIlIlllIlllll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIllIllIIII[2];
            }
            String[] strArr2 = new String[lIllIllIIII[2]];
            strArr2[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[9]];
            if (lIIlIlllIlllll(nearest.hasAction(strArr2) ? 1 : 0)) {
                nearest.interact(lIllIlIlIII[lIllIllIIII[10]]);
                return lIllIllIIII[2];
            }
            nearest.interact(lIllIlIlIII[lIllIllIIII[11]]);
            return lIllIllIIII[2];
        }
        String[] strArr3 = new String[lIllIllIIII[2]];
        strArr3[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[6]];
        TileObject nearest2 = TileObjects.getNearest(strArr3);
        if (lIIlIllllIIIIl(nearest2)) {
            return lIllIllIIII[3];
        }
        if (lIIlIlllIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIllIIII[2];
        } else if (!lIIlIlllIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            nearest2.interact(lIllIlIlIII[lIllIllIIII[8]]);
            return lIllIllIIII[2];
        } else {
            String[] strArr4 = new String[lIllIllIIII[2]];
            strArr4[lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[7]];
            Dialog.chooseOption(strArr4);
            "".length();
            return lIllIllIIII[2];
        }
    }

    private static boolean lIIlIllllIIlII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIlllIIIlIl(String llllllllllllllllIlIlIIIIlllIIlll, String llllllllllllllllIlIlIIIIlllIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIlIIIIlllIIlII = llllllllllllllllIlIlIIIIlllIIllI.toCharArray();
        int llllllllllllllllIlIlIIIIlllIIIll = lIllIllIIII[3];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIllIIII[3];
        while (lIIlIllllIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIlIlIIIIlllIIlII[llllllllllllllllIlIlIIIIlllIIIll % llllllllllllllllIlIlIIIIlllIIlII.length]));
            "".length();
            llllllllllllllllIlIlIIIIlllIIIll++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
