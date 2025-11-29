package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Looting chest room", priority = 1000, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aY.class */
public class aY extends AbstractC0015ao {
    private static final /* synthetic */ int ey;
    private /* synthetic */ boolean eA;
    private static /* synthetic */ int[] llIlIllIIlI;
    private static final /* synthetic */ int ez;
    private static final /* synthetic */ int ew;
    private static /* synthetic */ String[] llIlIllIIIl;
    private static final /* synthetic */ int ex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        if (lIlIIllllIlIlI(TileObjects.getNearest(tileObject -> {
            if (lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] strArr = new String[llIlIllIIlI[1]];
                strArr[llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[19]];
                if (lIlIIllllIlIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llIlIllIIlI[1];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                }
            }
            return llIlIllIIlI[2];
        })) && lIlIIllllIlIll(this.eA ? 1 : 0)) {
            ?? r0 = llIlIllIIlI[1];
            "".length();
            return "  ".length() < " ".length() ? ((((14 + 59) - (-69)) + 29) ^ (((58 + 63) - 6) + 58)) & (((0 ^ 62) ^ (85 ^ 109)) ^ (-" ".length())) : r0;
        }
        return llIlIllIIlI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.eA = llIlIllIIlI[2];
    }

    @Inject
    protected aY(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        Widget widget = Widgets.get(llIlIllIIlI[4], llIlIllIIlI[5]);
        ItemContainer itemContainer = this.cu.getItemContainer(InventoryID.TOA_REWARD_CHEST);
        if (lIlIIllllIlIll(Widgets.isVisible(widget) ? 1 : 0) && lIlIIllllIllII(itemContainer)) {
            int i = llIlIllIIlI[1];
            Item[] items = itemContainer.getItems();
            int length = items.length;
            int i2 = llIlIllIIlI[2];
            while (lIlIIllllIllIl(i2, length)) {
                if (lIlIIllllIlllI(items[i2].getId(), llIlIllIIlI[1])) {
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i = llIlIllIIlI[2];
                }
                i2++;
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            this.eA = i;
            widget.interact(llIlIllIIIl[llIlIllIIlI[2]]);
            return llIlIllIIlI[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] strArr = new String[llIlIllIIlI[1]];
                strArr[llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[18]];
                if (lIlIIllllIlIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llIlIllIIlI[1];
                    "".length();
                    return (((((132 + 143) - 178) + 54) ^ (((14 + 177) - 135) + 137)) & (((82 ^ 58) ^ (54 ^ 8)) ^ (-" ".length()))) != 0 ? ((172 ^ 182) ^ (203 ^ 152)) & (((125 ^ 72) ^ (44 ^ 80)) ^ (-" ".length())) : r0;
                }
            }
            return llIlIllIIlI[2];
        });
        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
            if (lIlIIllllIlIll(List.of(Integer.valueOf(llIlIllIIlI[13]), Integer.valueOf(llIlIllIIlI[14]), Integer.valueOf(llIlIllIIlI[15])).contains(Integer.valueOf(tileObject2.getId())) ? 1 : 0)) {
                String[] strArr = new String[llIlIllIIlI[1]];
                strArr[llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[16]];
                if (lIlIIllllIlIll(tileObject2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llIlIllIIlI[1];
                    "".length();
                    return 0 != 0 ? ((100 ^ 70) ^ (137 ^ 177)) & (((60 ^ 46) ^ (2 ^ 10)) ^ (-" ".length())) : r0;
                }
            }
            return llIlIllIIlI[2];
        });
        if (!lIlIIllllIlIlI(nearest) || !lIlIIllllIlIlI(nearest2)) {
            if (lIlIIllllIllII(nearest)) {
                nearest.interact(llIlIllIIIl[llIlIllIIlI[7]]);
                "".length();
                if ((((28 ^ 6) ^ (107 ^ 58)) & (((11 ^ 21) ^ (47 ^ 122)) ^ (-" ".length()))) > 0) {
                    return ((((79 + 94) - 29) + 52) ^ (((108 + 35) - 104) + 153)) & (((83 ^ 31) ^ (17 ^ 89)) ^ (-" ".length()));
                }
            } else {
                nearest2.interact(llIlIllIIIl[llIlIllIIlI[5]]);
            }
            return llIlIllIIlI[1];
        }
        TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
            if (lIlIIllllIllll(tileObject3.getId(), llIlIllIIlI[12])) {
                ?? r0 = llIlIllIIlI[1];
                "".length();
                return " ".length() == (((62 ^ 44) ^ (128 ^ 134)) & (((((29 + 106) - 72) + 106) ^ (((80 + 166) - 146) + 89)) ^ (-" ".length()))) ? ((93 ^ 85) ^ (128 ^ 173)) & (((((183 + 112) - 272) + 202) ^ (((86 + 14) - 92) + 188)) ^ (-" ".length())) : r0;
            }
            return llIlIllIIlI[2];
        });
        if (lIlIIllllIlIlI(nearest3)) {
            nearest3 = TileObjects.getNearest(tileObject4 -> {
                return tileObject4.getName().toLowerCase().contains(llIlIllIIIl[llIlIllIIlI[11]]);
            });
            if (lIlIIllllIlIlI(nearest3)) {
                return llIlIllIIlI[2];
            }
        }
        String[] strArr = new String[llIlIllIIlI[6]];
        strArr[llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[1]];
        strArr[llIlIllIIlI[1]] = llIlIllIIIl[llIlIllIIlI[6]];
        nearest3.interact(strArr);
        return llIlIllIIlI[1];
    }

    private static String lIlIIllllIIlIl(String llllllllllllllllIIllIIIllIllIIIl, String llllllllllllllllIIllIIIllIllIIII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIllIllIIII.getBytes(StandardCharsets.UTF_8)), llIlIllIIlI[11]), "DES");
            Cipher llllllllllllllllIIllIIIllIllIIll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIllIllIIll.init(llIlIllIIlI[6], llllllllllllllllIIllIIIllIllIlII);
            return new String(llllllllllllllllIIllIIIllIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIllIllIIlI) {
            llllllllllllllllIIllIIIllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllllIllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = new int[llIlIllIIlI[1]];
        iArr[llIlIllIIlI[2]] = llIlIllIIlI[3];
        if (lIlIIllllIllII(TileObjects.getNearest(iArr))) {
            ?? r0 = llIlIllIIlI[1];
            "".length();
            return (-" ".length()) == "   ".length() ? ((148 ^ 143) ^ (170 ^ 130)) & (((24 ^ 121) ^ (115 ^ 33)) ^ (-" ".length())) : r0;
        }
        return llIlIllIIlI[2];
    }

    private static String lIlIIllllIIlll(String llllllllllllllllIIllIIIlllIlIllI, String llllllllllllllllIIllIIIlllIlIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIlllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIIlllIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIIlllIllIII.init(llIlIllIIlI[6], llllllllllllllllIIllIIIlllIllIIl);
            return new String(llllllllllllllllIIllIIIlllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIlllIlIlll) {
            llllllllllllllllIIllIIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIlIIllllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[llIlIllIIlI[1]];
            strArr[llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[8]];
            Dialog.chooseOption(strArr);
            "".length();
            sleep(llIlIllIIlI[8]);
            return llIlIllIIlI[1];
        } else if (lIlIIllllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIllIIlI[1];
        } else {
            String[] strArr2 = new String[llIlIllIIlI[1]];
            strArr2[llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[9]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (lIlIIllllIlIlI(nearest)) {
                return llIlIllIIlI[2];
            }
            nearest.interact(llIlIllIIIl[llIlIllIIlI[10]]);
            return llIlIllIIlI[1];
        }
    }

    static {
        lIlIIllllIlIIl();
        lIlIIllllIlIII();
        ez = llIlIllIIlI[12];
        ey = llIlIllIIlI[5];
        ex = llIlIllIIlI[4];
        ew = llIlIllIIlI[3];
    }

    private static String lIlIIllllIIllI(String llllllllllllllllIIllIIIlllIIIIIl, String llllllllllllllllIIllIIIlllIIIlIl) {
        String llllllllllllllllIIllIIIlllIIIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIlllIIIlII = new StringBuilder();
        char[] llllllllllllllllIIllIIIlllIIIIll = llllllllllllllllIIllIIIlllIIIlIl.toCharArray();
        int llllllllllllllllIIllIIIlllIIIIlI = llIlIllIIlI[2];
        char[] charArray = llllllllllllllllIIllIIIlllIIIIIl2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIIllIIIllIlllIlI = llIlIllIIlI[2];
        while (lIlIIllllIllIl(llllllllllllllllIIllIIIllIlllIlI, length)) {
            llllllllllllllllIIllIIIlllIIIlII.append((char) (charArray[llllllllllllllllIIllIIIllIlllIlI] ^ llllllllllllllllIIllIIIlllIIIIll[llllllllllllllllIIllIIIlllIIIIlI % llllllllllllllllIIllIIIlllIIIIll.length]));
            "".length();
            llllllllllllllllIIllIIIlllIIIIlI++;
            llllllllllllllllIIllIIIllIlllIlI++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllIIIlllIIIlII);
    }

    private static void lIlIIllllIlIII() {
        llIlIllIIIl = new String[llIlIllIIlI[20]];
        llIlIllIIIl[llIlIllIIlI[2]] = lIlIIllllIIlIl("8Fu8iv2F1+WBYNstS6u60g==", "TgFgB");
        llIlIllIIIl[llIlIllIIlI[1]] = lIlIIllllIIllI("IBwHFg==", "olbxa");
        llIlIllIIIl[llIlIllIIlI[6]] = lIlIIllllIIllI("BSYrAhA+", "VCJps");
        llIlIllIIIl[llIlIllIIlI[7]] = lIlIIllllIIlIl("JUPO/G8qN8w=", "pVAZz");
        llIlIllIIIl[llIlIllIIlI[5]] = lIlIIllllIIlll("eqZwiFmwNas=", "kfbXE");
        llIlIllIIIl[llIlIllIIlI[8]] = lIlIIllllIIlIl("G8ArP23ur0A=", "tASPp");
        llIlIllIIIl[llIlIllIIlI[9]] = lIlIIllllIIlIl("+T28H1MzS02wkR2nJIfqrg==", "MuINS");
        llIlIllIIIl[llIlIllIIlI[10]] = lIlIIllllIIlll("xrGobRovJ30=", "LfVTa");
        llIlIllIIIl[llIlIllIIlI[11]] = lIlIIllllIIlIl("7JPilKgGp24vB06tstjVXQ==", "LNwDd");
        llIlIllIIIl[llIlIllIIlI[16]] = lIlIIllllIIlIl("Z06sXn5oX0w=", "dwNOJ");
        llIlIllIIIl[llIlIllIIlI[18]] = lIlIIllllIIlIl("PkEC6WkjpgE=", "DCWdx");
        llIlIllIIIl[llIlIllIIlI[19]] = lIlIIllllIIllI("Pzw3Gw==", "pLRuT");
    }

    private static boolean lIlIIllllIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIllllIlIll(int i) {
        return i != 0;
    }

    private static void lIlIIllllIlIIl() {
        llIlIllIIlI = new int[21];
        llIlIllIIlI[0] = (-((-468) & 18427)) & (-129) & 32759;
        llIlIllIIlI[1] = " ".length();
        llIlIllIIlI[2] = ((((187 + 117) - 171) + 70) ^ (((119 + 35) - 145) + 127)) & (((((116 + 36) - 49) + 31) ^ (((190 + 146) - 144) + 5)) ^ (-" ".length()));
        llIlIllIIlI[3] = (-16401) & 61342;
        llIlIllIIlI[4] = (-26733) & 27503;
        llIlIllIIlI[5] = 173 ^ 169;
        llIlIllIIlI[6] = "  ".length();
        llIlIllIIlI[7] = "   ".length();
        llIlIllIIlI[8] = (1 ^ 21) ^ (130 ^ 147);
        llIlIllIIlI[9] = 75 ^ 77;
        llIlIllIIlI[10] = (239 ^ 148) ^ (198 ^ 186);
        llIlIllIIlI[11] = 133 ^ 141;
        llIlIllIIlI[12] = (-19217) & 65436;
        llIlIllIIlI[13] = (-" ".length()) & (-16385) & 61171;
        llIlIllIIlI[14] = (-" ".length()) & (-265) & 45052;
        llIlIllIIlI[15] = (-((-8867) & 25251)) & (-3) & 61175;
        llIlIllIIlI[16] = (((127 + 75) - 131) + 114) ^ (((131 + 114) - 181) + 112);
        llIlIllIIlI[17] = (-209) & 30202;
        llIlIllIIlI[18] = (((58 + 106) - 26) + 63) ^ (((105 + 62) - 44) + 72);
        llIlIllIIlI[19] = (((33 + 69) - (-13)) + 27) ^ (((44 + 102) - 87) + 74);
        llIlIllIIlI[20] = (((56 + 19) - 29) + 157) ^ (((30 + 16) - (-4)) + 149);
    }

    private static boolean lIlIIllllIlIlI(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIllllIllll(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIlIllIIlI[0];
    }

    private static boolean lIlIIllllIlllI(int i, int i2) {
        return i <= i2;
    }
}
