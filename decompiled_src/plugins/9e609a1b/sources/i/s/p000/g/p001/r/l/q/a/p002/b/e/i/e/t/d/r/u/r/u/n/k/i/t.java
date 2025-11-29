package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.t  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/t.class */
public class t implements M {
    private static /* synthetic */ String[] fE;
    static /* synthetic */ WorldPoint fD;
    static /* synthetic */ WorldPoint fy;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ String[] lIIIlllllIIll;
    public static /* synthetic */ List<C0003d> bA;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ boolean fx;
    static /* synthetic */ WorldPoint fA;
    private final /* synthetic */ int fF = lIIIlllllIlll[0];
    static /* synthetic */ WorldPoint fC;
    static /* synthetic */ WorldPoint fz;
    private static final /* synthetic */ String fw;
    static /* synthetic */ WorldPoint fB;
    static /* synthetic */ WorldPoint fd;
    private static final /* synthetic */ HashMap<Integer, String> fv;
    static /* synthetic */ int co;
    private static /* synthetic */ int[] lIIIlllllIlll;
    public static /* synthetic */ boolean by;

    private static boolean lIlIIllIIllllII(int i2) {
        return i2 != 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            bg();
            "".length();
            if ((72 ^ 76) < (29 ^ 25)) {
                return (54 ^ 39) & ((31 ^ 14) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllllIlll[86];
    }

    private static void bh() {
        if (lIlIIllIlIIIllI(fE)) {
            if (lIlIIllIIlllllI(Vars.getBit(lIIIlllllIlll[70])) && lIlIIllIIlllllI(Vars.getBit(lIIIlllllIlll[71]))) {
                return;
            }
            String[] strArr = new String[lIIIlllllIlll[10]];
            strArr[lIIIlllllIlll[0]] = fv.get(Integer.valueOf(Vars.getBit(lIIIlllllIlll[70])));
            strArr[lIIIlllllIlll[1]] = fv.get(Integer.valueOf(Vars.getBit(lIIIlllllIlll[71])));
            strArr[lIIIlllllIlll[3]] = fv.get(Integer.valueOf(Vars.getBit(lIIIlllllIlll[72])));
            strArr[lIIIlllllIlll[5]] = fv.get(Integer.valueOf(Vars.getBit(lIIIlllllIlll[73])));
            strArr[lIIIlllllIlll[4]] = fv.get(Integer.valueOf(Vars.getBit(lIIIlllllIlll[74])));
            fE = strArr;
            System.out.println("Say the following in order: " + String.join(lIIIlllllIIll[lIIIlllllIlll[75]], fE));
        }
    }

    private static boolean lIlIIllIlIIIIII(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIllIlIIIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIlllllIlll[3]];
        iArr[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
        iArr[lIIIlllllIlll[1]] = lIIIlllllIlll[8];
        int i2 = lIIIlllllIlll[0];
        while (lIlIIllIIllllIl(i2, iArr.length)) {
            int[] iArr2 = new int[lIIIlllllIlll[1]];
            iArr2[lIIIlllllIlll[0]] = iArr[i2];
            if (lIlIIllIIlllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIlllllIlll[0];
            }
            i2++;
            "".length();
            if (((((2 + 16) - 17) + 163) ^ (((66 + 14) - 48) + 128)) != ((103 ^ 22) ^ (253 ^ 136))) {
                return ((106 ^ 27) ^ (104 ^ 91)) & (((15 ^ 58) ^ (233 ^ 158)) ^ (-" ".length()));
            }
        }
        return lIIIlllllIlll[1];
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllllIIll[lIIIlllllIlll[87]];
    }

    private static String lIlIIllIIlIIlII(String lllllllllllllllIIIIIIIIlIIIlllII, String lllllllllllllllIIIIIIIIlIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIIIlIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllllIlll[3], lllllllllllllllIIIIIIIIlIIIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIIlIIIlllIl) {
            lllllllllllllllIIIIIIIIlIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIIlIIIlI(String lllllllllllllllIIIIIIIIlIIllllIl, String lllllllllllllllIIIIIIIIlIIlllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIIIIlIIlllIll.toCharArray();
        int lllllllllllllllIIIIIIIIlIIllIlIl = lIIIlllllIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllllIlll[0];
        while (lIlIIllIIllllIl(i2, length)) {
            char lllllllllllllllIIIIIIIIlIIllllll = charArray2[i2];
            sb.append((char) (lllllllllllllllIIIIIIIIlIIllllll ^ charArray[lllllllllllllllIIIIIIIIlIIllIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIIIIIlIIllIlIl++;
            i2++;
            "".length();
            if ((((((33 + 119) - 8) + 98) ^ (((95 + 76) - 26) + 52)) & (((116 ^ 77) ^ (10 ^ 4)) ^ (-" ".length()))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIllIlIIIlll(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[5])) {
            ?? r0 = lIIIlllllIlll[1];
            "".length();
            return (-" ".length()) > "  ".length() ? ((251 ^ 189) ^ (4 ^ 23)) & (((((203 + 103) - 297) + 242) ^ (((115 + 26) - 98) + 131)) ^ (-" ".length())) : r0;
        }
        return lIIIlllllIlll[0];
    }

    static {
        lIlIIllIIlllIlI();
        lIlIIllIIlIllll();
        fw = lIIIlllllIIll[lIIIlllllIlll[90]];
        fv = new u();
        bA = new ArrayList();
        fd = new WorldPoint(lIIIlllllIlll[91], lIIIlllllIlll[92], lIIIlllllIlll[0]);
        fy = new WorldPoint(lIIIlllllIlll[93], lIIIlllllIlll[94], lIIIlllllIlll[0]);
        fz = new WorldPoint(lIIIlllllIlll[93], lIIIlllllIlll[95], lIIIlllllIlll[3]);
        fA = new WorldPoint(lIIIlllllIlll[96], lIIIlllllIlll[97], lIIIlllllIlll[0]);
        fB = new WorldPoint(lIIIlllllIlll[96], lIIIlllllIlll[98], lIIIlllllIlll[0]);
        fC = new WorldPoint(lIIIlllllIlll[99], lIIIlllllIlll[100], lIIIlllllIlll[1]);
        fD = new WorldPoint(lIIIlllllIlll[101], lIIIlllllIlll[102], lIIIlllllIlll[0]);
        String[] strArr = new String[lIIIlllllIlll[31]];
        strArr[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[103]];
        strArr[lIIIlllllIlll[1]] = lIIIlllllIIll[lIIIlllllIlll[104]];
        strArr[lIIIlllllIlll[3]] = lIIIlllllIIll[lIIIlllllIlll[105]];
        strArr[lIIIlllllIlll[5]] = lIIIlllllIIll[lIIIlllllIlll[106]];
        strArr[lIIIlllllIlll[4]] = lIIIlllllIIll[lIIIlllllIlll[107]];
        strArr[lIIIlllllIlll[10]] = lIIIlllllIIll[lIIIlllllIlll[108]];
        strArr[lIIIlllllIlll[16]] = lIIIlllllIIll[lIIIlllllIlll[109]];
        strArr[lIIIlllllIlll[18]] = lIIIlllllIIll[lIIIlllllIlll[110]];
        strArr[lIIIlllllIlll[19]] = lIIIlllllIIll[lIIIlllllIlll[111]];
        strArr[lIIIlllllIlll[20]] = lIIIlllllIIll[lIIIlllllIlll[112]];
        strArr[lIIIlllllIlll[12]] = lIIIlllllIIll[lIIIlllllIlll[113]];
        strArr[lIIIlllllIlll[23]] = lIIIlllllIIll[lIIIlllllIlll[114]];
        strArr[lIIIlllllIlll[25]] = lIIIlllllIIll[lIIIlllllIlll[115]];
        strArr[lIIIlllllIlll[26]] = lIIIlllllIIll[lIIIlllllIlll[116]];
        strArr[lIIIlllllIlll[27]] = lIIIlllllIIll[lIIIlllllIlll[117]];
        strArr[lIIIlllllIlll[28]] = lIIIlllllIIll[lIIIlllllIlll[118]];
        strArr[lIIIlllllIlll[29]] = lIIIlllllIIll[lIIIlllllIlll[119]];
        strArr[lIIIlllllIlll[30]] = lIIIlllllIIll[lIIIlllllIlll[120]];
        bW = strArr;
    }

    private static void bi() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIllIIllllll(nearest) && lIlIIllIIlllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[76]];
            C0000a.a(nearest);
        }
        if (lIlIIllIIllllll(nearest) && lIlIIllIIllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIlllllIlll[2]);
                "".length();
                Time.sleepTicks(lIIIlllllIlll[5]);
                "".length();
            }
            if (lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[77]];
                if (lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] iArr = new int[lIIIlllllIlll[1]];
                    iArr[lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (lIlIIllIIlllllI(Inventory.contains(iArr) ? 1 : 0) && lIlIIllIlIIIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIlllllIlll[4]);
                        "".length();
                    }
                }
                if (lIlIIllIlIIIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIlllllIlll[3]);
                    "".length();
                }
                if (lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIlllllIlll[1]];
                    iArr2[lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (lIlIIllIIllllII(Inventory.contains(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                        C0000a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                        C0000a.a(lIIIlllllIlll[48], lIIIlllllIlll[1]);
                        C0000a.a(lIIIlllllIlll[24], lIIIlllllIlll[1]);
                        C0000a.a(lIIIlllllIlll[46], lIIIlllllIlll[1]);
                        Time.sleepTicks(lIIIlllllIlll[1]);
                        "".length();
                        int[] iArr3 = new int[lIIIlllllIlll[1]];
                        iArr3[lIIIlllllIlll[0]] = lIIIlllllIlll[11];
                        if (lIlIIllIIlllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            C0000a.a(lIIIlllllIlll[78], lIIIlllllIlll[1]);
                        }
                        C0000a.a(lIIIlllllIlll[17], Inventory.getFreeSlots() - lIIIlllllIlll[1]);
                    }
                }
                if (lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIlllllIlll[1]];
                    iArr4[lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (lIlIIllIIlllllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        if (lIlIIllIIlllllI(Equipment.contains(C0005f.aW) ? 1 : 0) && lIlIIllIIlllllI(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                            C0000a.b(C0005f.aW, lIIIlllllIlll[1]);
                        }
                        if (lIlIIllIIllllII(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aW).interact(lIIIlllllIIll[lIIIlllllIlll[79]]);
                            Time.sleepTicks(lIIIlllllIlll[5]);
                            "".length();
                        }
                        if (lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIIlllllIlll[10]);
                            "".length();
                        }
                        if (lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                            C0000a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                            C0000a.a(lIIIlllllIlll[7], lIIIlllllIlll[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIIIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIllIIlllllI(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllllIlll[0];
    }

    private static boolean lIlIIllIlIIIlll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIllIlIIIIIl(int i2) {
        return i2 < 0;
    }

    private static int lIlIIllIIlllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIllIlIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIlIIllIIlIIIll(String lllllllllllllllIIIIIIIIlIllIIllI, String lllllllllllllllIIIIIIIIlIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), lIIIlllllIlll[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllllIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIIlIllIIlll) {
            lllllllllllllllIIIIIIIIlIllIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIIlIllll() {
        lIIIlllllIIll = new String[lIIIlllllIlll[121]];
        lIIIlllllIIll[lIIIlllllIlll[0]] = lIlIIllIIlIIIlI("Ai8+ABUsIzRJBDE/OQcBZC8kDAs3anAaES0yMwEPKiFwCwcnLXAdCWQ3JQwVMA==", "DFPif");
        lIIIlllllIIll[lIIIlllllIlll[1]] = lIlIIllIIlIIIll("UVr7vlLOC/LHgrnegsR6CA==", "jJmun");
        lIIIlllllIIll[lIIIlllllIlll[3]] = lIlIIllIIlIIIll("n5UDAXOqbhUXY5u8l1LVGNJyqd0p/HkY", "xCQUS");
        lIIIlllllIIll[lIIIlllllIlll[5]] = lIlIIllIIlIIlII("PwH7VVuXldrzv6yRzQ9K56q5tBBczhIEksQKfUKhBZG3kBTT9LwYRKO2iKpjw21OBsfEDR7W3pY=", "zqaOE");
        lIIIlllllIIll[lIIIlllllIlll[4]] = lIlIIllIIlIIIll("m5oMh2mJGT9lF6aav9K76D3RdoWD9PW+DdmgXKQrQJPyRuSPYDs5xmQIr+spSkfxiOjXntO+eEo=", "ukpfm");
        lIIIlllllIIll[lIIIlllllIlll[10]] = lIlIIllIIlIIIlI("FAk3Cg==", "ClVxC");
        lIIIlllllIIll[lIIIlllllIlll[16]] = lIlIIllIIlIIIlI("EwgfPiw=", "WzvPG");
        lIIIlllllIIll[lIIIlllllIlll[18]] = lIlIIllIIlIIIlI("Mw4g", "voTIe");
        lIIIlllllIIll[lIIIlllllIlll[19]] = lIlIIllIIlIIIlI("FAsiVzg1SicDLSge", "ZjTwL");
        lIIIlllllIIll[lIIIlllllIlll[20]] = lIlIIllIIlIIlII("2ycSfSSwMOk=", "xGlvu");
        lIIIlllllIIll[lIIIlllllIlll[12]] = lIlIIllIIlIIlII("HyOflt3THCkwZThRPsTiZtwkVtpbIZ2C", "JIjyr");
        lIIIlllllIIll[lIIIlllllIlll[23]] = lIlIIllIIlIIIlI("OA0UaSYZHRUgGA==", "kdfIv");
        lIIIlllllIIll[lIIIlllllIlll[25]] = lIlIIllIIlIIIlI("Ij4BDDIDOwQdPwU=", "qWmzW");
        lIIIlllllIIll[lIIIlllllIlll[26]] = lIlIIllIIlIIIlI("IwkSWQYCSAcYAhkJDRc=", "mhdyr");
        lIIIlllllIIll[lIIIlllllIlll[27]] = lIlIIllIIlIIIlI("AjYdBS4oOU0jIDc+Aw==", "AWmqO");
        lIIIlllllIIll[lIIIlllllIlll[28]] = lIlIIllIIlIIIll("eJbk9KFhmMMjJvsOs2AjlQ==", "LjHWB");
        lIIIlllllIIll[lIIIlllllIlll[29]] = lIlIIllIIlIIIlI("GQ8UeS04TgYrOD4A", "WnbYY");
        lIIIlllllIIll[lIIIlllllIlll[30]] = lIlIIllIIlIIlII("c2H9LB2Vk6zubKVmN25N2Q==", "tVsRZ");
        lIIIlllllIIll[lIIIlllllIlll[31]] = lIlIIllIIlIIIll("UEH/2bWZvJg=", "xACfv");
        lIIIlllllIIll[lIIIlllllIlll[32]] = lIlIIllIIlIIIlI("CyUwOwI9cDw2Rz4xJzUV", "IPSPg");
        lIIIlllllIIll[lIIIlllllIlll[33]] = lIlIIllIIlIIIll("q0j0WZ03+W4Ncvehr+JnHRN1kEE6bDJo", "qFtID");
        lIIIlllllIIll[lIIIlllllIlll[34]] = lIlIIllIIlIIIlI("PiI2PgQfJg==", "sCXVk");
        lIIIlllllIIll[lIIIlllllIlll[35]] = lIlIIllIIlIIlII("AeiothsoFG8=", "kPKMi");
        lIIIlllllIIll[lIIIlllllIlll[36]] = lIlIIllIIlIIIll("eBujavH8FcU=", "HzPqP");
        lIIIlllllIIll[lIIIlllllIlll[37]] = lIlIIllIIlIIIlI("Lw4jECsOCg==", "boMxD");
        lIIIlllllIIll[lIIIlllllIlll[9]] = lIlIIllIIlIIlII("x/332nLJfNs=", "dcpSB");
        lIIIlllllIIll[lIIIlllllIlll[38]] = lIlIIllIIlIIlII("E0zmZyLI36A=", "ngTBD");
        lIIIlllllIIll[lIIIlllllIlll[39]] = lIlIIllIIlIIIlI("Dg4dMgovCg==", "CosZe");
        lIIIlllllIIll[lIIIlllllIlll[40]] = lIlIIllIIlIIlII("+LRAXV7oYlLr2rQAEW2Nzg==", "ZIFbK");
        lIIIlllllIIll[lIIIlllllIlll[41]] = lIlIIllIIlIIIll("x7jVK9XhoJg=", "JVEqS");
        lIIIlllllIIll[lIIIlllllIlll[42]] = lIlIIllIIlIIIlI("LQElGxZDCSMBGg==", "nmLvt");
        lIIIlllllIIll[lIIIlllllIlll[43]] = lIlIIllIIlIIlII("oaQwriDFg55IIjiK2gdXmw==", "eHcuq");
        lIIIlllllIIll[lIIIlllllIlll[44]] = lIlIIllIIlIIIlI("NhkjBDBEBzUJ", "dlPpI");
        lIIIlllllIIll[lIIIlllllIlll[45]] = lIlIIllIIlIIlII("wDlFXxIX03Y=", "XvuoD");
        lIIIlllllIIll[lIIIlllllIlll[47]] = lIlIIllIIlIIlII("EQibkV5cdo0yYmX4Ov4+ow==", "MaLDU");
        lIIIlllllIIll[lIIIlllllIlll[49]] = lIlIIllIIlIIlII("f3RkyauhZ2Y=", "GgRuh");
        lIIIlllllIIll[lIIIlllllIlll[50]] = lIlIIllIIlIIlII("Bk8GTyzwgFY=", "oUOKN");
        lIIIlllllIIll[lIIIlllllIlll[51]] = lIlIIllIIlIIIll("VYJ/kYHCG+lEPVMgF75mgg==", "FCfaQ");
        lIIIlllllIIll[lIIIlllllIlll[52]] = lIlIIllIIlIIIll("U19oMxZJ+8fBi6EUT718/w==", "vsZHy");
        lIIIlllllIIll[lIIIlllllIlll[53]] = lIlIIllIIlIIIlI("IzoVFzYCPxAGOwQ=", "pSyaS");
        lIIIlllllIIll[lIIIlllllIlll[54]] = lIlIIllIIlIIlII("iSdcFLwdE6erYeFibAF4C3iYsYw9o85X", "FaQoV");
        lIIIlllllIIll[lIIIlllllIlll[55]] = lIlIIllIIlIIIlI("HwAhWhQ+ECATKg==", "LiSzD");
        lIIIlllllIIll[lIIIlllllIlll[56]] = lIlIIllIIlIIIll("NIi0lB3XnvsWYPQkdTFQhg==", "ZEXyQ");
        lIIIlllllIIll[lIIIlllllIlll[57]] = lIlIIllIIlIIlII("CmZw2KzYPKs=", "rtszG");
        lIIIlllllIIll[lIIIlllllIlll[58]] = lIlIIllIIlIIlII("ZVtOwltiDRr/lerP6nqvkkZb/CNI3htK", "boyBb");
        lIIIlllllIIll[lIIIlllllIlll[59]] = lIlIIllIIlIIIlI("JQ8cVxwETg4SBQQA", "knjwh");
        lIIIlllllIIll[lIIIlllllIlll[60]] = lIlIIllIIlIIIll("ukLGTbcv0K0=", "fAmFl");
        lIIIlllllIIll[lIIIlllllIlll[61]] = lIlIIllIIlIIIlI("DRANPz80EAh0Hj8ZHj0uMg==", "ZulTZ");
        lIIIlllllIIll[lIIIlllllIlll[62]] = lIlIIllIIlIIIll("Afjy+wsD7rQ=", "ceLnF");
        lIIIlllllIIll[lIIIlllllIlll[63]] = lIlIIllIIlIIIll("gH43sP89c1w=", "PXfzc");
        lIIIlllllIIll[lIIIlllllIlll[15]] = lIlIIllIIlIIIll("49aF4Zihn2I=", "IwCHZ");
        lIIIlllllIIll[lIIIlllllIlll[64]] = lIlIIllIIlIIIll("sXx68fPE/To=", "utKGP");
        lIIIlllllIIll[lIIIlllllIlll[65]] = lIlIIllIIlIIIll("A+tBSYf1xY8=", "iKfRj");
        lIIIlllllIIll[lIIIlllllIlll[66]] = lIlIIllIIlIIlII("20Lyo/OKddro/oScO4PAPg==", "PiWMC");
        lIIIlllllIIll[lIIIlllllIlll[67]] = lIlIIllIIlIIIll("dChH9J6uShU=", "Zqgad");
        lIIIlllllIIll[lIIIlllllIlll[68]] = lIlIIllIIlIIIll("OCPxr9MkWneQw22ZVa5cpDtE/KvecF7a", "jwWam");
        lIIIlllllIIll[lIIIlllllIlll[69]] = lIlIIllIIlIIlII("bv2dsZiAXpq7DykTnhdxOw==", "rQauK");
        lIIIlllllIIll[lIIIlllllIlll[75]] = lIlIIllIIlIIlII("5RwMFCgbwHg=", "kiDHd");
        lIIIlllllIIll[lIIIlllllIlll[76]] = lIlIIllIIlIIIll("yurMOi+ey5jPodepn6mwdw==", "dQIkt");
        lIIIlllllIIll[lIIIlllllIlll[77]] = lIlIIllIIlIIIlI("AhI0MD4jHT10MCsdMT08LQ==", "JsZTR");
        lIIIlllllIIll[lIIIlllllIlll[79]] = lIlIIllIIlIIIlI("MzEzMw==", "dTRAW");
        lIIIlllllIIll[lIIIlllllIlll[87]] = lIlIIllIIlIIIll("l/+nFDhCtR+qonZu9xKo2A==", "YJupL");
        lIIIlllllIIll[lIIIlllllIlll[88]] = lIlIIllIIlIIlII("eUjKHdZ0pAefATmTYo6B9Gk9YNTER+2m", "ESKpR");
        lIIIlllllIIll[lIIIlllllIlll[89]] = lIlIIllIIlIIIlI("Py4DKiEs", "HGyKS");
        lIIIlllllIIll[lIIIlllllIlll[90]] = lIlIIllIIlIIIlI("JiY0dDYAKDd0Ngk6YyApCT1jPS8LKC0gIBwgLDphCS4iPS9X", "hICTA");
        lIIIlllllIIll[lIIIlllllIlll[103]] = lIlIIllIIlIIlII("VkmT3TOX8nA=", "UyWIF");
        lIIIlllllIIll[lIIIlllllIlll[104]] = lIlIIllIIlIIIlI("EBIVZiIhFx8oRhcWET8DNlohMwM3Dg==", "DzpFf");
        lIIIlllllIIll[lIIIlllllIlll[105]] = lIlIIllIIlIIIll("2Z8sU421VSFrl7oeR9k1T3V54iMuEXg+RMlRGBbShK1pNxEg3wDGI/DoIxCQbPJ1", "HOozW");
        lIIIlllllIIll[lIIIlllllIlll[106]] = lIlIIllIIlIIlII("McOeMPYWUfzxvsGHtmNgZeMJAda2u74jHFi113FkrPM=", "xINhN");
        lIIIlllllIIll[lIIIlllllIlll[107]] = lIlIIllIIlIIIlI("LQcAGWQTHEEZLB9PDAwjEwwAAWQTAQIMKg4OFQQrFFA=", "zoamD");
        lIIIlllllIIll[lIIIlllllIlll[108]] = lIlIIllIIlIIIll("w9DT/CO/4AXJWB3PgLL92X50DzUNfJyi47ZlE1PYUDMLErCjV65qa4Nb8nj2xRnX", "xWyHx");
        lIIIlllllIIll[lIIIlllllIlll[109]] = lIlIIllIIlIIIlI("MHg/LB8deCUmWh8xPy1aKjE9Px8LNDguEg12", "yXQIz");
        lIIIlllllIIll[lIIIlllllIlll[110]] = lIlIIllIIlIIIll("DDNAqO9OMYBN/qhUVFmOFxhlYQmB0yEO97YsLIL1n1BEfbQhpz0DD4s7WTYFjfD3xEnOmbhE8/U=", "qBKGj");
        lIIIlllllIIll[lIIIlllllIlll[111]] = lIlIIllIIlIIIll("OCArfX+eHUT7GlC8PAYOPXPa28nRy3TE", "EiIvl");
        lIIIlllllIIll[lIIIlllllIlll[112]] = lIlIIllIIlIIIlI("LAkZQTFVBwQOD1lMCBQMVRgCCAtVBRlBERgcBRMMFAIeTw==", "uljax");
        lIIIlllllIIll[lIIIlllllIlll[113]] = lIlIIllIIlIIlII("sHG/PQFVUriWTj3gq7oJEOunUvMs8Iz6WnkiYv8HPPw4DiubwY5J4OR7t9ykwi79", "WRlPi");
        lIIIlllllIIll[lIIIlllllIlll[114]] = lIlIIllIIlIIIlI("NR8RaFkaHxA9Vw==", "lzbDy");
        lIIIlllllIIll[lIIIlllllIlll[115]] = lIlIIllIIlIIIll("IrOcwW5zqr3xNxP19Ak5G/MIsOb6Bo7CSQEsDdPdmwTJUGYNTlwACnttufKsEiJLsFIksf/BMeN8PfomBAPaOA==", "kCdMu");
        lIIIlllllIIll[lIIIlllllIlll[116]] = lIlIIllIIlIIlII("iWML5Dw21O4qoXz3PpZGNzs3mTY8lWXSLIBxPVkiXVFD+9R/JEJ6+3pAadaPe7jE", "Jzbra");
        lIIIlllllIIll[lIIIlllllIlll[117]] = lIlIIllIIlIIlII("7edxSt9aHZ73JfycdHIMnVvOnJ8FNUQe+pr5TLgqQF7PZexLcUgActR5m+VBcOrx", "BVyJb");
        lIIIlllllIIll[lIIIlllllIlll[118]] = lIlIIllIIlIIlII("NVzZvAYL4QcIUTK3lsaQx/BfmfBw0tCXujcjtd+1FzE=", "nJMYS");
        lIIIlllllIIll[lIIIlllllIlll[119]] = lIlIIllIIlIIIll("P6xl7MB7j5Nardt9Teo4mFOU07PSf+EAHdakP2cwn9UJ6kquX92uwtxa3XOHoOYA", "YuDEm");
        lIIIlllllIIll[lIIIlllllIlll[120]] = lIlIIllIIlIIIll("5b50m+f8BXIYDmmd7kaG1cK5SRGBp67B1LxCoMkt2Rk=", "oeYAn");
    }

    private static boolean lIlIIllIIllllIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0164, code lost:
        if (lIlIIllIIllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.t.lIIIlllllIlll[10]) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIllIIllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.t.lIIIlllllIlll[9]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIlllllIlll[1]];
        iArr5[lIIIlllllIlll[0]] = lIIIlllllIlll[7];
        if (lIlIIllIIllllII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIlllllIlll[1]];
            iArr6[lIIIlllllIlll[0]] = lIIIlllllIlll[7];
            if (lIlIIllIIllllII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIlllllIlll[1]];
                iArr7[lIIIlllllIlll[0]] = lIIIlllllIlll[7];
            }
            iArr = new int[lIIIlllllIlll[1]];
            iArr[lIIIlllllIlll[0]] = lIIIlllllIlll[8];
            if (lIlIIllIIlllllI(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllllIlll[8], lIIIlllllIlll[1], lIIIlllllIlll[81]));
                "".length();
            }
            if (lIlIIllIIlllllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlllllIIll[lIIIlllllIlll[88]]);
            }) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllllIlll[82], lIIIlllllIlll[10], lIIIlllllIlll[83]));
                "".length();
            }
            iArr2 = new int[lIIIlllllIlll[1]];
            iArr2[lIIIlllllIlll[0]] = lIIIlllllIlll[17];
            if (lIlIIllIIllllII(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIlllllIlll[1]];
                iArr8[lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                if (lIlIIllIIllllII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIlllllIlll[1]];
                    iArr9[lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                }
                iArr3 = new int[lIIIlllllIlll[1]];
                iArr3[lIIIlllllIlll[0]] = lIIIlllllIlll[11];
                if (lIlIIllIIlllllI(Bank.contains(iArr3) ? 1 : 0)) {
                    bA.add(new C0003d(lIIIlllllIlll[11], lIIIlllllIlll[4], C0007h.bv));
                    "".length();
                }
                iArr4 = new int[lIIIlllllIlll[1]];
                iArr4[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (lIlIIllIIllllII(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllllIlll[1]];
                    iArr10[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                    if (!lIlIIllIIllllII(Bank.contains(iArr10) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr11 = new int[lIIIlllllIlll[1]];
                    iArr11[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                    if (!lIlIIllIIllllIl(Bank.getFirst(iArr11).getQuantity(), lIIIlllllIlll[28])) {
                        return;
                    }
                }
                bA.add(new C0003d(lIIIlllllIlll[6], lIIIlllllIlll[54], lIIIlllllIlll[85]));
                "".length();
            }
            bA.add(new C0003d(lIIIlllllIlll[17], lIIIlllllIlll[12], lIIIlllllIlll[84]));
            "".length();
            iArr3 = new int[lIIIlllllIlll[1]];
            iArr3[lIIIlllllIlll[0]] = lIIIlllllIlll[11];
            if (lIlIIllIIlllllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIlllllIlll[1]];
            iArr4[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
            if (lIlIIllIIllllII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllllIlll[6], lIIIlllllIlll[54], lIIIlllllIlll[85]));
            "".length();
        }
        bA.add(new C0003d(lIIIlllllIlll[7], lIIIlllllIlll[9], lIIIlllllIlll[80]));
        "".length();
        iArr = new int[lIIIlllllIlll[1]];
        iArr[lIIIlllllIlll[0]] = lIIIlllllIlll[8];
        if (lIlIIllIIlllllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIIllIIlllllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlllllIIll[lIIIlllllIlll[88]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIlllllIlll[1]];
        iArr2[lIIIlllllIlll[0]] = lIIIlllllIlll[17];
        if (lIlIIllIIllllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllllIlll[17], lIIIlllllIlll[12], lIIIlllllIlll[84]));
        "".length();
        iArr3 = new int[lIIIlllllIlll[1]];
        iArr3[lIIIlllllIlll[0]] = lIIIlllllIlll[11];
        if (lIlIIllIIlllllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIlllllIlll[1]];
        iArr4[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
        if (lIlIIllIIllllII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllllIlll[6], lIIIlllllIlll[54], lIIIlllllIlll[85]));
        "".length();
    }

    private static boolean lIlIIllIlIIIlIl(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIllIIllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIlIIIIll(int i2, int i3) {
        return i2 <= i3;
    }

    private static void lIlIIllIIlllIlI() {
        lIIIlllllIlll = new int[122];
        lIIIlllllIlll[0] = (78 ^ 15) & ((123 ^ 58) ^ (-1));
        lIIIlllllIlll[1] = " ".length();
        lIIIlllllIlll[2] = (-((-21381) & 30647)) & (-70) & 14335;
        lIIIlllllIlll[3] = "  ".length();
        lIIIlllllIlll[4] = 117 ^ 113;
        lIIIlllllIlll[5] = "   ".length();
        lIIIlllllIlll[6] = (-((-1675) & 26283)) & (-153) & 32767;
        lIIIlllllIlll[7] = (-((-16937) & 32681)) & (-16465) & 32734;
        lIIIlllllIlll[8] = (-((-17929) & 28239)) & (-20497) & 32735;
        lIIIlllllIlll[9] = 139 ^ 146;
        lIIIlllllIlll[10] = 102 ^ 99;
        lIIIlllllIlll[11] = (-((-8475) & 27455)) & (-129) & 31733;
        lIIIlllllIlll[12] = (((107 + 58) - 99) + 71) ^ (((49 + 44) - 8) + 46);
        lIIIlllllIlll[13] = (-((-1283) & 32031)) & (-1025) & 32767;
        lIIIlllllIlll[14] = (-((-18537) & 23675)) & (-2054) & 8191;
        lIIIlllllIlll[15] = 46 ^ 28;
        lIIIlllllIlll[16] = 118 ^ 112;
        lIIIlllllIlll[17] = (-12933) & 13311;
        lIIIlllllIlll[18] = (225 ^ 170) ^ (66 ^ 14);
        lIIIlllllIlll[19] = (27 ^ 61) ^ (233 ^ 199);
        lIIIlllllIlll[20] = (((184 + 138) - 148) + 31) ^ (((156 + 147) - 151) + 44);
        lIIIlllllIlll[21] = (-((-2147) & 31331)) & (-1) & 32383;
        lIIIlllllIlll[22] = (-25203) & 28671;
        lIIIlllllIlll[23] = (110 ^ 0) ^ (41 ^ 76);
        lIIIlllllIlll[24] = (-8846) & 11245;
        lIIIlllllIlll[25] = (68 ^ 46) ^ (70 ^ 32);
        lIIIlllllIlll[26] = (177 ^ 136) ^ (127 ^ 75);
        lIIIlllllIlll[27] = (65 ^ 33) ^ (68 ^ 42);
        lIIIlllllIlll[28] = 28 ^ 19;
        lIIIlllllIlll[29] = (21 ^ 97) ^ (85 ^ 49);
        lIIIlllllIlll[30] = 74 ^ 91;
        lIIIlllllIlll[31] = (((78 + 113) - 176) + 117) ^ (((48 + 1) - (-89)) + 12);
        lIIIlllllIlll[32] = (((117 + 70) - 66) + 13) ^ (((57 + 21) - (-14)) + 57);
        lIIIlllllIlll[33] = 24 ^ 12;
        lIIIlllllIlll[34] = 168 ^ 189;
        lIIIlllllIlll[35] = (132 ^ 184) ^ (83 ^ 121);
        lIIIlllllIlll[36] = (48 ^ 70) ^ (228 ^ 133);
        lIIIlllllIlll[37] = (131 ^ 137) ^ (89 ^ 75);
        lIIIlllllIlll[38] = 47 ^ 53;
        lIIIlllllIlll[39] = 43 ^ 48;
        lIIIlllllIlll[40] = (122 ^ 80) ^ (30 ^ 40);
        lIIIlllllIlll[41] = (((77 + 79) - 91) + 92) ^ (((27 + 40) - 31) + 92);
        lIIIlllllIlll[42] = (224 ^ 189) ^ (46 ^ 109);
        lIIIlllllIlll[43] = (((135 + 48) - 101) + 68) ^ (((129 + 37) - 44) + 15);
        lIIIlllllIlll[44] = (143 ^ 190) ^ (189 ^ 172);
        lIIIlllllIlll[45] = (((64 + 12) - (-1)) + 98) ^ (((140 + 53) - 88) + 37);
        lIIIlllllIlll[46] = (-9861) & 12261;
        lIIIlllllIlll[47] = (137 ^ 132) ^ (49 ^ 30);
        lIIIlllllIlll[48] = (-9377) & 11775;
        lIIIlllllIlll[49] = (((118 + 80) - 194) + 153) ^ (((85 + 100) - 175) + 180);
        lIIIlllllIlll[50] = 168 ^ 140;
        lIIIlllllIlll[51] = 158 ^ 187;
        lIIIlllllIlll[52] = 149 ^ 179;
        lIIIlllllIlll[53] = 155 ^ 188;
        lIIIlllllIlll[54] = (24 ^ 107) ^ (225 ^ 186);
        lIIIlllllIlll[55] = (20 ^ 62) ^ "   ".length();
        lIIIlllllIlll[56] = (((89 + 16) - 27) + 61) ^ (((61 + 28) - (-55)) + 17);
        lIIIlllllIlll[57] = 23 ^ 60;
        lIIIlllllIlll[58] = (((103 + 16) - (-25)) + 12) ^ (((22 + 103) - 52) + 103);
        lIIIlllllIlll[59] = 127 ^ 82;
        lIIIlllllIlll[60] = (((73 + 63) - 39) + 46) ^ (((24 + 128) - 5) + 14);
        lIIIlllllIlll[61] = 67 ^ 108;
        lIIIlllllIlll[62] = 77 ^ 125;
        lIIIlllllIlll[63] = 153 ^ 168;
        lIIIlllllIlll[64] = 86 ^ 101;
        lIIIlllllIlll[65] = 180 ^ 128;
        lIIIlllllIlll[66] = 46 ^ 27;
        lIIIlllllIlll[67] = (38 ^ 82) ^ (253 ^ 191);
        lIIIlllllIlll[68] = (235 ^ 192) ^ (220 ^ 192);
        lIIIlllllIlll[69] = (121 ^ 69) ^ (52 ^ 48);
        lIIIlllllIlll[70] = (-((-3653) & 16222)) & (-1249) & 16379;
        lIIIlllllIlll[71] = (-((-22599) & 32255)) & (-20481) & 32699;
        lIIIlllllIlll[72] = (-25689) & 28252;
        lIIIlllllIlll[73] = (-((-10777) & 32665)) & (-8233) & 32685;
        lIIIlllllIlll[74] = (-12449) & 15014;
        lIIIlllllIlll[75] = 32 ^ 25;
        lIIIlllllIlll[76] = (110 ^ 23) ^ (104 ^ 43);
        lIIIlllllIlll[77] = (227 ^ 179) ^ (253 ^ 150);
        lIIIlllllIlll[78] = (-18061) & 30687;
        lIIIlllllIlll[79] = 49 ^ 13;
        lIIIlllllIlll[80] = (-((-3601) & 24443)) & (-9217) & 30718;
        lIIIlllllIlll[81] = (-8237) & 10156;
        lIIIlllllIlll[82] = (-((-11279) & 31791)) & (-273) & 32764;
        lIIIlllllIlll[83] = (-(208 ^ 147)) & (-7698) & 32763;
        lIIIlllllIlll[84] = (-((-37) & 7911)) & (-8209) & 16382;
        lIIIlllllIlll[85] = (-8195) & 10094;
        lIIIlllllIlll[86] = 243 ^ 151;
        lIIIlllllIlll[87] = 133 ^ 184;
        lIIIlllllIlll[88] = (77 ^ 8) ^ (79 ^ 52);
        lIIIlllllIlll[89] = 178 ^ 141;
        lIIIlllllIlll[90] = (((178 + 153) - 189) + 86) ^ (((151 + 14) - 137) + 136);
        lIIIlllllIlll[91] = (-((-1193) & 14317)) & (-16385) & 32711;
        lIIIlllllIlll[92] = (-((-435) & 12731)) & (-16387) & 32106;
        lIIIlllllIlll[93] = (-16665) & 19868;
        lIIIlllllIlll[94] = (-12841) & 16312;
        lIIIlllllIlll[95] = (-((-1423) & 21983)) & (-8193) & 32249;
        lIIIlllllIlll[96] = (-((-7209) & 15662)) & (-16417) & 28095;
        lIIIlllllIlll[97] = (-20483) & 23978;
        lIIIlllllIlll[98] = (-2389) & 12285;
        lIIIlllllIlll[99] = (-((-20867) & 21463)) & (-20865) & 24573;
        lIIIlllllIlll[100] = (-(((47 + 78) - 44) + 49)) & (-8965) & 12255;
        lIIIlllllIlll[101] = (-((-3721) & 28617)) & (-4101) & 32223;
        lIIIlllllIlll[102] = (-((-361) & 29565)) & (-65) & 32639;
        lIIIlllllIlll[103] = 50 ^ 115;
        lIIIlllllIlll[104] = (81 ^ 25) ^ (155 ^ 145);
        lIIIlllllIlll[105] = (((14 + 143) - 106) + 177) ^ (((52 + 87) - 54) + 82);
        lIIIlllllIlll[106] = (87 ^ 26) ^ (178 ^ 187);
        lIIIlllllIlll[107] = (138 ^ 166) ^ (106 ^ 3);
        lIIIlllllIlll[108] = 59 ^ 125;
        lIIIlllllIlll[109] = 60 ^ 123;
        lIIIlllllIlll[110] = 5 ^ 77;
        lIIIlllllIlll[111] = (89 ^ 96) ^ (209 ^ 161);
        lIIIlllllIlll[112] = (((48 + 108) - 137) + 178) ^ (((98 + 37) - 19) + 27);
        lIIIlllllIlll[113] = (158 ^ 146) ^ (96 ^ 39);
        lIIIlllllIlll[114] = 216 ^ 148;
        lIIIlllllIlll[115] = (119 ^ 103) ^ (240 ^ 173);
        lIIIlllllIlll[116] = 215 ^ 153;
        lIIIlllllIlll[117] = (((33 + 97) - 4) + 15) ^ (((121 + 10) - 38) + 101);
        lIIIlllllIlll[118] = 236 ^ 188;
        lIIIlllllIlll[119] = (6 ^ 89) ^ (130 ^ 140);
        lIIIlllllIlll[120] = (140 ^ 128) ^ (245 ^ 171);
        lIIIlllllIlll[121] = (((144 + 7) - 30) + 101) ^ (((43 + 59) - 1) + 40);
    }

    private static boolean lIlIIllIlIIIIlI(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0b39, code lost:
        if (lIlIIllIIllllll(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v291, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v547, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v550, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v572, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bg() {
        if (lIlIIllIIllllII(by ? 1 : 0)) {
            C0001b.a(bA);
            if (lIlIIllIIllllIl(bA.size(), lIIIlllllIlll[1])) {
                System.out.println(lIIIlllllIIll[lIIIlllllIlll[0]]);
                by = lIIIlllllIlll[0];
            }
        }
        if (lIlIIllIIlllllI(by ? 1 : 0)) {
            if (lIlIIllIIlllllI(S() ? 1 : 0) && lIlIIllIIlllllI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIIllllll(nearest) && lIlIIllIIlllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[1]];
                    C0000a.a(nearest);
                }
                if (lIlIIllIIllllll(nearest) && lIlIIllIIllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllllIlll[2]);
                        "".length();
                    }
                    if (lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[3]];
                        if (lIlIIllIlIIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllllIlll[4]);
                            "".length();
                        }
                        if (lIlIIllIlIIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllllIlll[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllllIlll[5]];
                        iArr[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                        iArr[lIIIlllllIlll[1]] = lIIIlllllIlll[7];
                        iArr[lIIIlllllIlll[3]] = lIIIlllllIlll[8];
                        if (lIlIIllIIlllllI(C0004e.b(iArr) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllllIIll[lIIIlllllIlll[5]]);
                            by = lIIIlllllIlll[1];
                            return;
                        }
                        int[] iArr2 = new int[lIIIlllllIlll[1]];
                        iArr2[lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                        if (lIlIIllIIllllII(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIIlllllIlll[1]];
                            iArr3[lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                            if (lIlIIllIIllllIl(Bank.getFirst(iArr3).getQuantity(), lIIIlllllIlll[9])) {
                                W();
                                System.out.println(lIIIlllllIIll[lIIIlllllIlll[4]]);
                                by = lIIIlllllIlll[1];
                                return;
                            }
                        }
                        int[] iArr4 = new int[lIIIlllllIlll[5]];
                        iArr4[lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                        iArr4[lIIIlllllIlll[1]] = lIIIlllllIlll[7];
                        iArr4[lIIIlllllIlll[3]] = lIIIlllllIlll[8];
                        if (lIlIIllIIllllII(C0004e.b(iArr4) ? 1 : 0)) {
                            if (lIlIIllIIlllllI(Equipment.contains(C0005f.aW) ? 1 : 0) && lIlIIllIIlllllI(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                                C0000a.b(C0005f.aW, lIIIlllllIlll[1]);
                            }
                            if (lIlIIllIIllllII(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                                Inventory.getFirst(C0005f.aW).interact(lIIIlllllIIll[lIIIlllllIlll[10]]);
                                Time.sleepTicks(lIIIlllllIlll[5]);
                                "".length();
                            }
                            if (lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIIIlllllIlll[5]);
                                "".length();
                            }
                            C0000a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                            C0000a.a(lIIIlllllIlll[8], lIIIlllllIlll[1]);
                            C0000a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                            C0000a.a(lIIIlllllIlll[13], lIIIlllllIlll[14]);
                        }
                    }
                }
            }
            if (lIlIIllIIllllII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllIIllllIl(Movement.getRunEnergy(), lIIIlllllIlll[15])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllllIIll[lIIIlllllIlll[16]]);
                Time.sleepTicks(lIIIlllllIlll[1]);
                "".length();
            }
            int[] iArr5 = new int[lIIIlllllIlll[1]];
            iArr5[lIIIlllllIlll[0]] = lIIIlllllIlll[17];
            if (lIlIIllIIllllII(Inventory.contains(iArr5) ? 1 : 0) && lIlIIllIlIIIIIl(lIlIIllIIlllIll(C0004e.v(), 55.0d))) {
                int[] iArr6 = new int[lIIIlllllIlll[1]];
                iArr6[lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                Inventory.getFirst(iArr6).interact(lIIIlllllIIll[lIIIlllllIlll[18]]);
            }
            if (lIlIIllIIllllII(S() ? 1 : 0) && lIlIIllIIlllllI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                if (lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllllIlll[4]) && lIlIIllIIlllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[19]];
                    Movement.walkTo(fd);
                    "".length();
                    Time.sleepTicks(lIIIlllllIlll[1]);
                    "".length();
                }
                if (lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllllIlll[4])) {
                    C0006g.a(lIIIlllllIIll[lIIIlllllIlll[20]], bW);
                }
            }
            if (lIlIIllIlIIIlII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[1])) {
                WorldArea worldArea = new WorldArea(lIIIlllllIlll[21], lIIIlllllIlll[22], lIIIlllllIlll[19], lIIIlllllIlll[18], lIIIlllllIlll[0]);
                if (lIlIIllIIlllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[12]];
                    Movement.walkTo(fy);
                    "".length();
                    Time.sleepTicks(lIIIlllllIlll[1]);
                    "".length();
                }
                if (lIlIIllIIllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIIIlllllIIll[lIIIlllllIlll[23]], bW);
                }
            }
            if (lIlIIllIlIIIlII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[3])) {
                co = lIIIlllllIlll[0];
                int[] iArr7 = new int[lIIIlllllIlll[1]];
                iArr7[lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                if (lIlIIllIIlllllI(Inventory.contains(iArr7) ? 1 : 0)) {
                    String[] strArr = new String[lIIIlllllIlll[1]];
                    strArr[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[25]];
                    if (lIlIIllIIlllllI(Equipment.contains(strArr) ? 1 : 0) && lIlIIllIIlllllI(fx ? 1 : 0)) {
                        if (!lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fz), lIIIlllllIlll[4]) || lIlIIllIlIIIlIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllllIlll[3])) {
                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[26]];
                            Movement.walkTo(fz);
                            "".length();
                            Time.sleepTicks(lIIIlllllIlll[1]);
                            "".length();
                        }
                        if (lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fz), lIIIlllllIlll[4])) {
                            C0006g.a(lIIIlllllIIll[lIIIlllllIlll[27]], bW);
                        }
                    }
                }
                int[] iArr8 = new int[lIIIlllllIlll[1]];
                iArr8[lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                if (lIlIIllIIllllII(Inventory.contains(iArr8) ? 1 : 0) && lIlIIllIIlllllI(fx ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlllllIlll[1]];
                    strArr2[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[28]];
                    if (lIlIIllIIllllII(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fA), lIIIlllllIlll[4])) {
                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[29]];
                            Movement.walkTo(fA);
                            "".length();
                            Time.sleepTicks(lIIIlllllIlll[1]);
                            "".length();
                        }
                        if (lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fA), lIIIlllllIlll[4])) {
                            String[] strArr3 = new String[lIIIlllllIlll[1]];
                            strArr3[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[30]];
                            Item first = Inventory.getFirst(strArr3);
                            String[] strArr4 = new String[lIIIlllllIlll[1]];
                            strArr4[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[31]];
                            first.useOn(TileObjects.getNearest(strArr4));
                            Time.sleepTicks(lIIIlllllIlll[10]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIIIlllllIlll[1]];
                    strArr5[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[32]];
                    if (lIlIIllIIlllllI(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fB), lIIIlllllIlll[4])) {
                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[33]];
                            String[] strArr6 = new String[lIIIlllllIlll[1]];
                            strArr6[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[34]];
                            if (lIlIIllIIllllll(TileObjects.getNearest(strArr6))) {
                                String[] strArr7 = new String[lIIIlllllIlll[1]];
                                strArr7[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[35]];
                                TileObject nearest2 = TileObjects.getNearest(strArr7);
                                String[] strArr8 = new String[lIIIlllllIlll[1]];
                                strArr8[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[36]];
                                if (lIlIIllIIllllII(nearest2.hasAction(strArr8) ? 1 : 0)) {
                                    String[] strArr9 = new String[lIIIlllllIlll[1]];
                                    strArr9[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[37]];
                                    TileObjects.getNearest(strArr9).interact(lIIIlllllIIll[lIIIlllllIlll[9]]);
                                    Time.sleepTicks(lIIIlllllIlll[3]);
                                    "".length();
                                }
                            }
                            String[] strArr10 = new String[lIIIlllllIlll[1]];
                            strArr10[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[38]];
                            if (lIlIIllIIllllll(TileObjects.getNearest(strArr10))) {
                                String[] strArr11 = new String[lIIIlllllIlll[1]];
                                strArr11[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[39]];
                                TileObject nearest3 = TileObjects.getNearest(strArr11);
                                String[] strArr12 = new String[lIIIlllllIlll[1]];
                                strArr12[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[40]];
                                if (lIlIIllIIllllII(nearest3.hasAction(strArr12) ? 1 : 0)) {
                                    String[] strArr13 = new String[lIIIlllllIlll[1]];
                                    strArr13[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[41]];
                                    TileObjects.getNearest(strArr13).interact(lIIIlllllIIll[lIIIlllllIlll[42]]);
                                    Time.sleepTicks(lIIIlllllIlll[3]);
                                    "".length();
                                }
                            }
                            Movement.walkTo(fB);
                            "".length();
                            Time.sleepTicks(lIIIlllllIlll[1]);
                            "".length();
                        }
                        if (lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fB), lIIIlllllIlll[4])) {
                            String[] strArr14 = new String[lIIIlllllIlll[1]];
                            strArr14[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[43]];
                            if (lIlIIllIIllllll(TileObjects.getNearest(strArr14))) {
                                String[] strArr15 = new String[lIIIlllllIlll[1]];
                                strArr15[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[44]];
                                TileObjects.getNearest(strArr15).interact(lIIIlllllIIll[lIIIlllllIlll[45]]);
                                Time.sleepTicks(lIIIlllllIlll[4]);
                                "".length();
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lIIIlllllIlll[1]];
                iArr9[lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                if (lIlIIllIIllllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllllIlll[1]];
                    iArr10[lIIIlllllIlll[0]] = lIIIlllllIlll[46];
                    if (lIlIIllIIllllII(Inventory.contains(iArr10) ? 1 : 0)) {
                        fx = lIIIlllllIlll[1];
                    }
                }
                if (lIlIIllIIllllII(fx ? 1 : 0)) {
                    String[] strArr16 = new String[lIIIlllllIlll[1]];
                    strArr16[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[47]];
                    if (lIlIIllIIlllllI(Equipment.contains(strArr16) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIlllllIlll[1]];
                        iArr11[lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                        if (lIlIIllIIlllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                            String[] strArr17 = new String[lIIIlllllIlll[1]];
                            strArr17[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[49]];
                            if (lIlIIllIIlllllI(Inventory.contains(strArr17) ? 1 : 0)) {
                                bi();
                            }
                            String[] strArr18 = new String[lIIIlllllIlll[1]];
                            strArr18[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[50]];
                            if (lIlIIllIIllllII(Inventory.contains(strArr18) ? 1 : 0)) {
                                if (lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fC), lIIIlllllIlll[3])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[51]];
                                    Movement.walkTo(fC);
                                    "".length();
                                    Time.sleepTicks(lIIIlllllIlll[1]);
                                    "".length();
                                }
                                if (lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fC), lIIIlllllIlll[3])) {
                                    C0006g.a(lIIIlllllIIll[lIIIlllllIlll[52]], bW);
                                }
                            }
                        }
                    }
                }
                if (lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIlllllIlll[1]];
                    iArr12[lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (lIlIIllIIllllII(Inventory.contains(iArr12) ? 1 : 0)) {
                        String[] strArr19 = new String[lIIIlllllIlll[1]];
                        strArr19[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[53]];
                        if (lIlIIllIIlllllI(Equipment.contains(strArr19) ? 1 : 0)) {
                            int[] iArr13 = new int[lIIIlllllIlll[1]];
                            iArr13[lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                            if (lIlIIllIIlllllI(Inventory.contains(iArr13) ? 1 : 0)) {
                                bi();
                            }
                            int[] iArr14 = new int[lIIIlllllIlll[1]];
                            iArr14[lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                            if (lIlIIllIIllllII(Inventory.contains(iArr14) ? 1 : 0)) {
                                WorldArea worldArea2 = new WorldArea(lIIIlllllIlll[21], lIIIlllllIlll[22], lIIIlllllIlll[19], lIIIlllllIlll[18], lIIIlllllIlll[0]);
                                if (lIlIIllIIlllllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[54]];
                                    Movement.walkTo(fy);
                                    "".length();
                                    Time.sleepTicks(lIIIlllllIlll[1]);
                                    "".length();
                                }
                                if (lIlIIllIIllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    C0006g.a(lIIIlllllIIll[lIIIlllllIlll[55]], bW);
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[lIIIlllllIlll[1]];
                strArr20[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[56]];
                if (lIlIIllIIllllII(Equipment.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lIIIlllllIlll[1]];
                    strArr21[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[57]];
                    if (lIlIIllIlIIIllI(NPCs.getNearest(strArr21))) {
                        String[] strArr22 = new String[lIIIlllllIlll[1]];
                        strArr22[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[58]];
                        if (lIlIIllIlIIIllI(NPCs.getNearest(strArr22))) {
                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[59]];
                            Movement.walkTo(fD);
                            "".length();
                            Time.sleepTicks(lIIIlllllIlll[1]);
                            "".length();
                        }
                    }
                    String[] strArr23 = new String[lIIIlllllIlll[1]];
                    strArr23[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[60]];
                    if (lIlIIllIlIIIllI(NPCs.getNearest(strArr23))) {
                        String[] strArr24 = new String[lIIIlllllIlll[1]];
                        strArr24[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[61]];
                    }
                    if (lIlIIllIlIIIllI(fE)) {
                        bh();
                    }
                    NPC nearest4 = NPCs.getNearest(npc -> {
                        if (lIlIIllIIllllII(npc.getName().contains(lIIIlllllIIll[lIIIlllllIlll[89]]) ? 1 : 0) && lIlIIllIlIIlIII(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIIIlllllIlll[1];
                            "".length();
                            return (((((12 + 106) - 83) + 203) ^ (((42 + 156) - 81) + 53)) & (((((51 + 35) - (-104)) + 25) ^ (((31 + 87) - (-2)) + 27)) ^ (-" ".length()))) != 0 ? ((((154 + 145) - 156) + 28) ^ (((138 + 22) - 62) + 56)) & (((((79 + 95) - 140) + 123) ^ (((165 + 84) - 178) + 101)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIlll[0];
                    });
                    if (lIlIIllIIllllll(nearest4) && lIlIIllIlIIIllI(Players.getLocal().getInteracting())) {
                        nearest4.interact(lIIIlllllIIll[lIIIlllllIlll[62]]);
                        Time.sleepTicks(lIIIlllllIlll[3]);
                        "".length();
                    }
                    if (lIlIIllIlIIIllI(nearest4) && lIlIIllIlIIIllI(Players.getLocal().getInteracting())) {
                        String[] strArr25 = new String[lIIIlllllIlll[1]];
                        strArr25[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[63]];
                        if (lIlIIllIIllllll(NPCs.getNearest(strArr25))) {
                            String[] strArr26 = new String[lIIIlllllIlll[1]];
                            strArr26[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[15]];
                            if (lIlIIllIIlllllI(NPCs.getNearest(strArr26).isDead() ? 1 : 0) && lIlIIllIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr27 = new String[lIIIlllllIlll[1]];
                                strArr27[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[64]];
                                NPCs.getNearest(strArr27).interact(lIIIlllllIIll[lIIIlllllIlll[65]]);
                            }
                        }
                    }
                    if (lIlIIllIIllllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[66]];
                        List options = Dialog.getOptions();
                        if (lIlIIllIIlllllI(options.isEmpty() ? 1 : 0)) {
                            int i2 = lIIIlllllIlll[0];
                            do {
                                if (lIlIIllIIllllIl(i2, options.size())) {
                                    if (lIlIIllIIllllII(((Widget) options.get(i2)).getText().contains(lIIIlllllIIll[lIIIlllllIlll[67]]) ? 1 : 0)) {
                                        String[] strArr28 = new String[lIIIlllllIlll[1]];
                                        strArr28[lIIIlllllIlll[0]] = ((Widget) options.get(i2)).getText();
                                        Dialog.chooseOption(strArr28);
                                        "".length();
                                        Time.sleepTicks(lIIIlllllIlll[3]);
                                        "".length();
                                        "".length();
                                        if (" ".length() <= (((((18 + 41) - (-27)) + 78) ^ (((145 + 27) - 125) + 113)) & (((180 ^ 148) ^ (186 ^ 158)) ^ (-" ".length())))) {
                                            return;
                                        }
                                    } else {
                                        i2++;
                                        "".length();
                                    }
                                }
                            } while (" ".length() != "   ".length());
                            return;
                        }
                    }
                    String[] strArr29 = new String[lIIIlllllIlll[1]];
                    strArr29[lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[68]];
                    if (lIlIIllIIllllll(NPCs.getNearest(strArr29))) {
                        if (lIlIIllIIllllIl(co, lIIIlllllIlll[1]) && lIlIIllIIlllllI(cp ? 1 : 0)) {
                            P.lB += lIIIlllllIlll[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllllIlll[1];
                            P.lB = lIIIlllllIlll[0];
                            cp = lIIIlllllIlll[1];
                        }
                        if (lIlIIllIIllllII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[69]];
                            List options2 = Dialog.getOptions();
                            if (lIlIIllIIlllllI(options2.isEmpty() ? 1 : 0)) {
                                int i3 = lIIIlllllIlll[0];
                                while (lIlIIllIIllllIl(i3, options2.size())) {
                                    String str = fE[i3];
                                    int i4 = lIIIlllllIlll[0];
                                    while (true) {
                                        if (!lIlIIllIIllllIl(i4, options2.size())) {
                                            break;
                                        } else if (lIlIIllIIllllII(((Widget) options2.get(i4)).getText().contains(str) ? 1 : 0)) {
                                            System.out.println("Selecting: " + ((Widget) options2.get(i4)).getText());
                                            Time.sleepTicks(lIIIlllllIlll[3]);
                                            "".length();
                                            String[] strArr30 = new String[lIIIlllllIlll[1]];
                                            strArr30[lIIIlllllIlll[0]] = ((Widget) options2.get(i4)).getText();
                                            Dialog.chooseOption(strArr30);
                                            "".length();
                                            Time.sleepTicks(lIIIlllllIlll[12]);
                                            "".length();
                                            "".length();
                                            if ("   ".length() == "  ".length()) {
                                                return;
                                            }
                                        } else {
                                            i4++;
                                            "".length();
                                            if ((-"  ".length()) >= 0) {
                                                return;
                                            }
                                        }
                                    }
                                    i3++;
                                    "".length();
                                    if (" ".length() >= (23 ^ 19)) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0006g.a(bW);
        }
    }
}
