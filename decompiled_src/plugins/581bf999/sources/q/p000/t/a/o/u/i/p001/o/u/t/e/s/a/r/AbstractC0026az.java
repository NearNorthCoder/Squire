package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.az  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/az.class */
public abstract class AbstractC0026az extends AbstractC0015ao {
    private static /* synthetic */ String[] llIlIIlIIll;
    private static /* synthetic */ int[] llIlIIllIlI;
    private static final /* synthetic */ int dx;
    private static final /* synthetic */ int dv;
    private static final /* synthetic */ int du;
    protected static final /* synthetic */ int dt;
    protected static final /* synthetic */ int ds;
    private static final /* synthetic */ int[] dw;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0026az(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIlIIlIlIllIIl() {
        llIlIIlIIll = new String[llIlIIllIlI[17]];
        llIlIIlIIll[llIlIIllIlI[2]] = lIlIIlIlIlIllI("tr7Fq3R1Coc=", "dqYzU");
        llIlIIlIIll[llIlIIllIlI[1]] = lIlIIlIlIlIllI("lUKFRcWcJNQ5Vj+gu5VDtA==", "GrAFZ");
        llIlIIlIIll[llIlIIllIlI[6]] = lIlIIlIlIlIlll("PDsvFWoYMycbJhA/", "hZDpG");
        llIlIIlIIll[llIlIIllIlI[7]] = lIlIIlIlIlIlll("Nj8bKhsbLkY1ARExCj0N", "rZkEh");
        llIlIIlIIll[llIlIIllIlI[8]] = lIlIIlIlIlIllI("1zWFTRG2ZUM=", "nAmMN");
        llIlIIlIIll[llIlIIllIlI[9]] = lIlIIlIlIllIII("EKB3huaQ+iE=", "kNRkQ");
        llIlIIlIIll[llIlIIllIlI[10]] = lIlIIlIlIllIII("bSjUiT+K8M8=", "VZnJr");
        llIlIIlIIll[llIlIIllIlI[11]] = lIlIIlIlIllIII("NLvNR1Ft3c7WtmMUgRMI2Q==", "fANUK");
        llIlIIlIIll[llIlIIllIlI[12]] = lIlIIlIlIllIII("M+olUfUDLl8=", "JSWBc");
        llIlIIlIIll[llIlIIllIlI[13]] = lIlIIlIlIllIII("jC0CMJ1nPWw=", "NWaCv");
    }

    private static void lIlIIlIlllIlIl() {
        llIlIIllIlI = new int[18];
        llIlIIllIlI[0] = (-16430) & 31103;
        llIlIIllIlI[1] = " ".length();
        llIlIIllIlI[2] = ((63 ^ 111) ^ (206 ^ 193)) & (((35 ^ 118) ^ (62 ^ 52)) ^ (-" ".length()));
        llIlIIllIlI[3] = (-((-8467) & 28503)) & (-11) & 65535;
        llIlIIllIlI[4] = (-((-29834) & 30427)) & (-1025) & 47103;
        llIlIIllIlI[5] = (-((-14374) & 30903)) & (-1029) & 31997;
        llIlIIllIlI[6] = "  ".length();
        llIlIIllIlI[7] = "   ".length();
        llIlIIllIlI[8] = (64 ^ 70) ^ "  ".length();
        llIlIIllIlI[9] = (49 ^ 103) ^ (217 ^ 138);
        llIlIIllIlI[10] = 116 ^ 114;
        llIlIIllIlI[11] = (((2 + 42) - 37) + 144) ^ (((64 + 6) - (-61)) + 13);
        llIlIIllIlI[12] = 8 ^ 0;
        llIlIIllIlI[13] = 191 ^ 182;
        llIlIIllIlI[14] = (-(51 ^ 119)) & (-3617) & 49151;
        llIlIIllIlI[15] = (-((-16563) & 20659)) & (-16453) & 32254;
        llIlIIllIlI[16] = (-((-11153) & 27601)) & (-1) & 28155;
        llIlIIllIlI[17] = 122 ^ 112;
    }

    private static boolean lIlIIlIllllIII(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIlIIllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        if (lIlIIlIllllIII(Vars.getBit(llIlIIllIlI[5])) && !lIlIIlIllllIII(Inventory.isFull() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlIIlIllllIlI(tileObject.getId(), llIlIIllIlI[14]) && lIlIIlIllllIII(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                    ?? r0 = llIlIIllIlI[1];
                    "".length();
                    return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIIllIlI[2];
            });
            if (lIlIIlIllllIIl(nearest)) {
                return llIlIIllIlI[2];
            }
            nearest.interact(llIlIIlIIll[llIlIIllIlI[6]]);
            return llIlIIllIlI[1];
        }
        String[] strArr = new String[llIlIIllIlI[1]];
        strArr[llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[2]];
        TileObject nearest2 = TileObjects.getNearest(strArr);
        if (lIlIIlIlllIllI(nearest2)) {
            nearest2.interact(llIlIIlIIll[llIlIIllIlI[1]]);
            return llIlIIllIlI[1];
        }
        return llIlIIllIlI[2];
    }

    private static String lIlIIlIlIlIllI(String llllllllllllllllIIllIllIIIIIIIlI, String llllllllllllllllIIllIllIIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIllIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIllIIIIIIIll) {
            llllllllllllllllIIllIllIIIIIIIll.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIlIllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIlllIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIlIIlIllllIlI(tileObject.getId(), llIlIIllIlI[14]) && lIlIIlIllllIII(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                ?? r0 = llIlIIllIlI[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIllIlI[2];
        });
        if (lIlIIlIllllIIl(nearest)) {
            return llIlIIllIlI[2];
        }
        if (lIlIIlIlllIlll(Vars.getBit(llIlIIllIlI[5]))) {
            nearest.interact(llIlIIlIIll[llIlIIllIlI[7]]);
            return llIlIIllIlI[1];
        }
        if (lIlIIlIllllIII(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llIlIIllIlI[1]];
                strArr[llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[13]];
                return item.hasAction(strArr);
            });
            if (lIlIIlIlllIllI(first)) {
                first.interact(llIlIIlIIll[llIlIIllIlI[8]]);
                return llIlIIllIlI[1];
            }
            "".length();
            if (" ".length() == 0) {
                return ((227 ^ 144) ^ (106 ^ 94)) & (((124 ^ 104) ^ (44 ^ 127)) ^ (-" ".length()));
            }
        } else {
            TileItem tileItem = (TileItem) TileItems.getAll((v0) -> {
                return Reachable.isInteractable(v0);
            }).stream().filter(tileItem2 -> {
                if (lIlIIlIlllIlll(tileItem2.getName().equals(llIlIIlIIll[llIlIIllIlI[12]]) ? 1 : 0)) {
                    ?? r0 = llIlIIllIlI[1];
                    "".length();
                    return (((((150 + 165) - 280) + 138) ^ (((89 + 34) - 74) + 110)) & (((214 ^ 199) ^ (59 ^ 24)) ^ (-" ".length()))) >= " ".length() ? ((((93 + 108) - 187) + 144) ^ (((57 + 146) - 85) + 57)) & (((229 ^ 156) ^ (26 ^ 82)) ^ (-" ".length())) : r0;
                }
                return llIlIIllIlI[2];
            }).max(Comparator.comparingInt(tileItem3 -> {
                return Prices.getItemPrice(tileItem3.getId());
            })).orElse(null);
            if (lIlIIlIlllIllI(tileItem)) {
                tileItem.interact(llIlIIlIIll[llIlIIllIlI[9]]);
                return llIlIIllIlI[1];
            }
        }
        String[] strArr = new String[llIlIIllIlI[1]];
        strArr[llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[10]];
        TileObject nearest2 = TileObjects.getNearest(strArr);
        if (lIlIIlIlllIllI(nearest2)) {
            nearest2.interact(llIlIIlIIll[llIlIIllIlI[11]]);
            return llIlIIllIlI[1];
        }
        return llIlIIllIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        NPC nearest = NPCs.getNearest(dw);
        int[] iArr = new int[llIlIIllIlI[1]];
        iArr[llIlIIllIlI[2]] = llIlIIllIlI[4];
        TileObject nearest2 = TileObjects.getNearest(iArr);
        if ((lIlIIlIlllIllI(nearest) && lIlIIlIlllIlll(nearest.isDead() ? 1 : 0) && !lIlIIlIlllIlll(Reachable.isInteractable(nearest) ? 1 : 0)) || (lIlIIlIlllIllI(nearest2) && lIlIIlIllllIII(Reachable.isInteractable(nearest2) ? 1 : 0))) {
            ?? r0 = llIlIIllIlI[1];
            "".length();
            return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIllIlI[2];
    }

    static {
        lIlIIlIlllIlIl();
        lIlIIlIlIllIIl();
        ds = llIlIIllIlI[5];
        du = llIlIIllIlI[0];
        dt = llIlIIllIlI[14];
        dx = llIlIIllIlI[3];
        dv = llIlIIllIlI[4];
        int[] iArr = new int[llIlIIllIlI[6]];
        iArr[llIlIIllIlI[2]] = llIlIIllIlI[15];
        iArr[llIlIIllIlI[1]] = llIlIIllIlI[16];
        dw = iArr;
    }

    private static String lIlIIlIlIllIII(String llllllllllllllllIIllIlIlllllIlIl, String llllllllllllllllIIllIlIlllllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlllllIIlI.getBytes(StandardCharsets.UTF_8)), llIlIIllIlI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIllIlI[6], llllllllllllllllIIllIlIllllllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIlIlllllIllI) {
            llllllllllllllllIIllIlIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[llIlIIllIlI[1]];
        iArr[llIlIIllIlI[2]] = llIlIIllIlI[3];
        if (lIlIIlIlllIllI(TileObjects.getNearest(iArr))) {
            ?? r0 = llIlIIllIlI[1];
            "".length();
            return "   ".length() != "   ".length() ? ((((86 + 120) - 163) + 133) ^ (((32 + 130) - 114) + 101)) & (((100 ^ 39) ^ (117 ^ 19)) ^ (-" ".length())) : r0;
        }
        return llIlIIllIlI[2];
    }

    private static boolean lIlIIlIllllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlIlllIllI(Object obj) {
        return obj != null;
    }

    private static String lIlIIlIlIlIlll(String llllllllllllllllIIllIlIllllIIlIl, String llllllllllllllllIIllIlIllllIIlII) {
        String llllllllllllllllIIllIlIllllIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlIllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIlIllllIIIlI = llllllllllllllllIIllIlIllllIIlII.toCharArray();
        int llllllllllllllllIIllIlIllllIIIIl = llIlIIllIlI[2];
        char[] charArray = llllllllllllllllIIllIlIllllIIlIl2.toCharArray();
        int length = charArray.length;
        int i = llIlIIllIlI[2];
        while (lIlIIlIllllIll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIllIlIllllIIIlI[llllllllllllllllIIllIlIllllIIIIl % llllllllllllllllIIllIlIllllIIIlI.length]));
            "".length();
            llllllllllllllllIIllIlIllllIIIIl++;
            i++;
            "".length();
            if (" ".length() <= ((86 ^ 90) & ((40 ^ 36) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
