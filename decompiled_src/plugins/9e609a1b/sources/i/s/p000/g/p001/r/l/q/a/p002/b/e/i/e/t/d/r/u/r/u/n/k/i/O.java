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
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.O  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/O.class */
public class O implements M {
    public static final /* synthetic */ WorldPoint in;
    public static final /* synthetic */ WorldPoint im;
    static final /* synthetic */ WorldPoint ir;
    public static /* synthetic */ List<C0003d> bA;
    private final /* synthetic */ int is = lIIIlllIllIII[0];
    static final /* synthetic */ WorldPoint iq;
    private static /* synthetic */ int[] lIIIlllIllIII;
    public static final /* synthetic */ WorldPoint io;
    public static final /* synthetic */ WorldPoint il;
    public static /* synthetic */ boolean by;
    static final /* synthetic */ WorldPoint ip;
    private static /* synthetic */ String[] lIIIlllIlIlll;

    private static void lIlIIlIIlIlIlll() {
        lIIIlllIlIlll = new String[lIIIlllIllIII[87]];
        lIIIlllIlIlll[lIIIlllIllIII[1]] = lIlIIlIIlIlIlII("71/XSdo8lSmKtFAnSREoNQ==", "FiNQM");
        lIIIlllIlIlll[lIIIlllIllIII[2]] = lIlIIlIIlIlIlII("Ea45MbUTHNnl7y/pybhrtYjnynIejyWSZJObhyXcQBJ/VnCoRUQ5L8Sez8h/aJwt", "iCEXR");
        lIIIlllIlIlll[lIIIlllIllIII[3]] = lIlIIlIIlIlIlIl("Z4l17L/s9EF701HDsz7GnbymP2q1MnQL", "Fuzuc");
        lIIIlllIlIlll[lIIIlllIllIII[4]] = lIlIIlIIlIlIllI("EAgnJScxBy5hKTkHIiglPw==", "XiIAK");
        lIIIlllIlIlll[lIIIlllIllIII[6]] = lIlIIlIIlIlIllI("Ei1MAyMgaAELIjYhAgVxNToNGzQ3aB8XITUkBQciaWgfFTgxKwQLPyJoGA1xBx01Kx8C", "EHlbQ");
        lIIIlllIlIlll[lIIIlllIllIII[13]] = lIlIIlIIlIlIllI("Big6Ixo=", "BZSMq");
        lIIIlllIlIlll[lIIIlllIllIII[15]] = lIlIIlIIlIlIllI("GhUtAkI6H2EQCyIUOA==", "NpAgb");
        lIIIlllIlIlll[lIIIlllIllIII[17]] = lIlIIlIIlIlIlIl("JN3SRwL76JE=", "bdeUy");
        lIIIlllIlIlll[lIIIlllIllIII[18]] = lIlIIlIIlIlIlII("YxPhrUL6TIPv4RgaDsQrUQ==", "jEOYZ");
        lIIIlllIlIlll[lIIIlllIllIII[19]] = lIlIIlIIlIlIlIl("ZSpRmuwhKJNgGCc4CaZoBhFsxH0+BomZLkg93I0D51FlPjMMimoR0g==", "IWCdQ");
        lIIIlllIlIlll[lIIIlllIllIII[21]] = lIlIIlIIlIlIllI("PCY8agYdZysmBhM1", "rGJJr");
        lIIIlllIlIlll[lIIIlllIllIII[41]] = lIlIIlIIlIlIllI("aUsEOSszSwAiKSE=", "XkpPH");
        lIIIlllIlIlll[lIIIlllIllIII[44]] = lIlIIlIIlIlIlIl("A0HPq7TZhInsmKDT7EfSOw==", "XJTBW");
        lIIIlllIlIlll[lIIIlllIllIII[20]] = lIlIIlIIlIlIllI("GRk0LyB1HCknNw==", "UxFHE");
        lIIIlllIlIlll[lIIIlllIllIII[46]] = lIlIIlIIlIlIlIl("9UVuQwKzNYI=", "GVnib");
        lIIIlllIlIlll[lIIIlllIllIII[47]] = lIlIIlIIlIlIlIl("3N9RKccfKzM=", "BRmJj");
        lIIIlllIlIlll[lIIIlllIllIII[48]] = lIlIIlIIlIlIllI("DQEkKQ==", "BqAGV");
        lIIIlllIlIlll[lIIIlllIllIII[49]] = lIlIIlIIlIlIlII("JdSzpe53ZvJFyJjVuVmCng==", "IKaqL");
        lIIIlllIlIlll[lIIIlllIllIII[51]] = lIlIIlIIlIlIllI("HyMkcjE+YjM+MTAw", "QBRRE");
        lIIIlllIlIlll[lIIIlllIllIII[52]] = lIlIIlIIlIlIllI("ECggCzUsKClEIyooKxc=", "EFNdA");
        lIIIlllIlIlll[lIIIlllIllIII[14]] = lIlIIlIIlIlIlII("lICHCDNxCdOqfYEmUyM+S2Kf2Js6Y6+A", "ibcwV");
        lIIIlllIlIlll[lIIIlllIllIII[53]] = lIlIIlIIlIlIlII("f1wz3J9BKa/DoZy2vWXG4w==", "SYtui");
        lIIIlllIlIlll[lIIIlllIllIII[54]] = lIlIIlIIlIlIlIl("bWpQAgzTYrY=", "cFoSu");
        lIIIlllIlIlll[lIIIlllIllIII[55]] = lIlIIlIIlIlIllI("FQYqIw==", "ZvOMO");
        lIIIlllIlIlll[lIIIlllIllIII[56]] = lIlIIlIIlIlIllI("FjEDHA==", "YAfrC");
        lIIIlllIlIlll[lIIIlllIllIII[57]] = lIlIIlIIlIlIlII("H9Ta2iVXgxlrLAL5cFaCWw==", "mjegA");
        lIIIlllIlIlll[lIIIlllIllIII[58]] = lIlIIlIIlIlIllI("LTUXIiYGKhFqcg==", "hMtJG");
        lIIIlllIlIlll[lIIIlllIllIII[59]] = lIlIIlIIlIlIlIl("onOc07lvfxZvF+Rtf6zcpA==", "jDhhn");
        lIIIlllIlIlll[lIIIlllIllIII[60]] = lIlIIlIIlIlIlII("0rlm2MHGT+0b3rBHnvpg/A==", "dVlJY");
        lIIIlllIlIlll[lIIIlllIllIII[61]] = lIlIIlIIlIlIllI("AzsvME47NGEvDzk9MzQF", "TRAUn");
        lIIIlllIlIlll[lIIIlllIllIII[62]] = lIlIIlIIlIlIlIl("PbfxPvH0Ppc=", "jtojw");
        lIIIlllIlIlll[lIIIlllIllIII[75]] = lIlIIlIIlIlIllI("BwQkLw8lVjEkCz4YLDgN", "WvEVj");
        lIIIlllIlIlll[lIIIlllIllIII[77]] = lIlIIlIIlIlIllI("HBM3BWUBHHkVIA8WLQplRg==", "nzYbE");
    }

    private static boolean lIlIIlIIlIllIIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlIIllIIIII(int i2, int i3) {
        return i2 <= i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIlIlll[lIIIlllIllIII[75]];
    }

    static {
        lIlIIlIIlIllIII();
        lIlIIlIIlIlIlll();
        il = new WorldPoint(lIIIlllIllIII[78], lIIIlllIllIII[79], lIIIlllIllIII[1]);
        im = new WorldPoint(lIIIlllIllIII[80], lIIIlllIllIII[81], lIIIlllIllIII[1]);
        in = new WorldPoint(lIIIlllIllIII[82], lIIIlllIllIII[83], lIIIlllIllIII[1]);
        io = new WorldPoint(lIIIlllIllIII[84], lIIIlllIllIII[43], lIIIlllIllIII[1]);
        ip = new WorldPoint(lIIIlllIllIII[1], lIIIlllIllIII[1], lIIIlllIllIII[1]);
        iq = new WorldPoint(lIIIlllIllIII[1], lIIIlllIllIII[1], lIIIlllIllIII[1]);
        ir = new WorldPoint(lIIIlllIllIII[85], lIIIlllIllIII[86], lIIIlllIllIII[1]);
        bA = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIIllIIIIl(Skills.getLevel(Skill.PRAYER), lIIIlllIllIII[76])) {
            ?? r0 = lIIIlllIllIII[2];
            "".length();
            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIllIII[1];
    }

    private static int cM() {
        return (lIlIIlIIlIllIlI(Skills.getLevel(Skill.PRAYER), lIIIlllIllIII[70]) && lIlIIlIIllIIIIl(Skills.getLevel(Skill.PRAYER), lIIIlllIllIII[71])) ? ((lIIIlllIllIII[69] - Skills.getExperience(Skill.PRAYER)) / lIIIlllIllIII[72]) + lIIIlllIllIII[21] : ((lIIIlllIllIII[73] - Skills.getExperience(Skill.PRAYER)) / lIIIlllIllIII[72]) + lIIIlllIllIII[62];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIlIIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean S() {
        int[] iArr = new int[lIIIlllIllIII[2]];
        iArr[lIIIlllIllIII[1]] = lIIIlllIllIII[9];
        if (lIlIIlIIlIllIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIlllIllIII[2]];
            iArr2[lIIIlllIllIII[1]] = lIIIlllIllIII[9];
            if (lIlIIlIIllIIIIl(Inventory.getFirst(iArr2).getQuantity(), lIIIlllIllIII[12])) {
                if (lIlIIlIIlIllIll(Inventory.contains(C0005f.bf) ? 1 : 0)) {
                    if (lIlIIlIIlIllIIl(Equipment.contains(C0005f.bf) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIlllIllIII[2]];
                        iArr3[lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                        if (lIlIIlIIlIllIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIlllIllIII[2]];
                            iArr4[lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                        }
                    }
                }
                ?? r0 = lIIIlllIllIII[2];
                "".length();
                return (150 ^ 146) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIIlllIllIII[1];
    }

    private static boolean lIlIIlIIlIlllII(Object obj) {
        return obj != null;
    }

    private static String lIlIIlIIlIlIlIl(String lllllllllllllllIIIIIlIlIIIIlllll, String lllllllllllllllIIIIIlIlIIIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIlIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lIIIlllIllIII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIllIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIlIIIlIIIlI) {
            lllllllllllllllIIIIIlIlIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIllIll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIIlIlllll(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIlIIlIlIllI(String lllllllllllllllIIIIIlIlIIIllIllI, String lllllllllllllllIIIIIlIlIIIllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIlIlIIIllIIll = lllllllllllllllIIIIIlIlIIIllIlIl.toCharArray();
        int lllllllllllllllIIIIIlIlIIIllIIlI = lIIIlllIllIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllIllIII[1];
        while (lIlIIlIIlIllIlI(i2, length)) {
            char lllllllllllllllIIIIIlIlIIIllIlll = charArray[i2];
            sb.append((char) (lllllllllllllllIIIIIlIlIIIllIlll ^ lllllllllllllllIIIIIlIlIIIllIIll[lllllllllllllllIIIIIlIlIIIllIIlI % lllllllllllllllIIIIIlIlIIIllIIll.length]));
            "".length();
            lllllllllllllllIIIIIlIlIIIllIIlI++;
            i2++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIlIIlIlllIl(int i2) {
        return i2 > 0;
    }

    private static void W() {
        int[] iArr = new int[lIIIlllIllIII[2]];
        iArr[lIIIlllIllIII[1]] = lIIIlllIllIII[8];
        if (lIlIIlIIlIllIll(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIllIII[8], lIIIlllIllIII[13], C0007h.bv));
            "".length();
        }
        int[] iArr2 = new int[lIIIlllIllIII[2]];
        iArr2[lIIIlllIllIII[1]] = lIIIlllIllIII[0];
        if (lIlIIlIIlIllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIllIII[0], cM(), lIIIlllIllIII[63]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlllIllIII[2]];
        iArr3[lIIIlllIllIII[1]] = lIIIlllIllIII[7];
        if (lIlIIlIIlIllIll(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIllIII[7], lIIIlllIllIII[3], lIIIlllIllIII[5]));
            "".length();
        }
        if (lIlIIlIIlIllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIlIlll[lIIIlllIllIII[77]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIllIII[64], lIIIlllIllIII[13], lIIIlllIllIII[65]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlllIllIII[2]];
        iArr4[lIIIlllIllIII[1]] = lIIIlllIllIII[66];
        if (lIlIIlIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIllIII[66], lIIIlllIllIII[67], lIIIlllIllIII[68]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIllIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v306, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52, types: [boolean] */
    public static void cL() {
        if (lIlIIlIIlIllIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[1]];
            C0001b.a(bA);
            if (lIlIIlIIlIllIlI(bA.size(), lIIIlllIllIII[2])) {
                System.out.println(lIIIlllIlIlll[lIIIlllIllIII[2]]);
                by = lIIIlllIllIII[1];
            }
        }
        if (lIlIIlIIlIllIll(by ? 1 : 0)) {
            if (lIlIIlIIlIllIll(S() ? 1 : 0) && lIlIIlIIlIllIlI(Game.getWildyLevel(), lIIIlllIllIII[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIlIlllII(nearest) && lIlIIlIIlIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIIlIlllII(nearest) && lIlIIlIIlIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[4]];
                    if (lIlIIlIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIllIII[5]);
                        "".length();
                    }
                    if (lIlIIlIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIIlIlllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIllIII[6]);
                            "".length();
                        }
                        if (lIlIIlIIlIlllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIllIII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIllIII[4]];
                        iArr[lIIIlllIllIII[1]] = lIIIlllIllIII[7];
                        iArr[lIIIlllIllIII[2]] = lIIIlllIllIII[0];
                        iArr[lIIIlllIllIII[3]] = lIIIlllIllIII[8];
                        if (lIlIIlIIlIllIll(C0004e.b(iArr) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIlIlll[lIIIlllIllIII[6]]);
                            by = lIIIlllIllIII[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIIlllIllIII[4]];
                        iArr2[lIIIlllIllIII[1]] = lIIIlllIllIII[7];
                        iArr2[lIIIlllIllIII[2]] = lIIIlllIllIII[0];
                        iArr2[lIIIlllIllIII[3]] = lIIIlllIllIII[8];
                        if (lIlIIlIIlIllIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIlIIlIIlIllIll(Equipment.contains(C0005f.bf) ? 1 : 0)) {
                                C0000a.b(C0005f.bf, lIIIlllIllIII[2]);
                            }
                            C0000a.b(C0005f.ba, lIIIlllIllIII[2]);
                            C0000a.a(lIIIlllIllIII[9], lIIIlllIllIII[10]);
                            C0000a.b(lIIIlllIllIII[0], lIIIlllIllIII[11]);
                        }
                    }
                }
            }
            if (lIlIIlIIlIllIIl(S() ? 1 : 0)) {
                if (lIlIIlIIlIllIIl(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIIlIllIlI(Movement.getRunEnergy(), lIIIlllIllIII[12])) {
                    Inventory.getFirst(C0005f.ba).interact(lIIIlllIlIlll[lIIIlllIllIII[13]]);
                    Time.sleepTicks(lIIIlllIllIII[2]);
                    "".length();
                }
                if (lIlIIlIIlIllIll(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIIlIllllI(Movement.getRunEnergy(), lIIIlllIllIII[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIIIlllIllIII[13]);
                    "".length();
                }
                if (lIlIIlIIlIllIlI(Game.getWildyLevel(), lIIIlllIllIII[2])) {
                    AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[15]];
                    if (lIlIIlIIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIIlIIlIllIll(Dialog.isOpen() ? 1 : 0) && lIlIIlIIlIllIIl(Inventory.contains(C0005f.bf) ? 1 : 0) && lIlIIlIIlIlllll(Players.getLocal().getAnimation(), lIIIlllIllIII[16])) {
                        Inventory.getFirst(C0005f.bf).interact(lIIIlllIlIlll[lIIIlllIllIII[17]]);
                        Time.sleepTicks(lIIIlllIllIII[3]);
                        "".length();
                    }
                    String[] strArr = new String[lIIIlllIllIII[3]];
                    strArr[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[18]];
                    strArr[lIIIlllIllIII[2]] = lIIIlllIlIlll[lIIIlllIllIII[19]];
                    C0006g.a(strArr);
                }
                if (lIlIIlIIlIlllIl(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIIIlllIllIII[2]];
                    iArr3[lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                    if (lIlIIlIIlIllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIlIIlIIlIllllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                            AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIIIlllIllIII[20]];
                            worldPointArr[lIIIlllIllIII[1]] = new WorldPoint(lIIIlllIllIII[22], lIIIlllIllIII[23], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[2]] = new WorldPoint(lIIIlllIllIII[24], lIIIlllIllIII[25], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[3]] = new WorldPoint(lIIIlllIllIII[26], lIIIlllIllIII[27], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[4]] = new WorldPoint(lIIIlllIllIII[28], lIIIlllIllIII[29], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[6]] = new WorldPoint(lIIIlllIllIII[30], lIIIlllIllIII[31], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[13]] = new WorldPoint(lIIIlllIllIII[32], lIIIlllIllIII[33], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[15]] = new WorldPoint(lIIIlllIllIII[34], lIIIlllIllIII[35], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[17]] = new WorldPoint(lIIIlllIllIII[36], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[18]] = new WorldPoint(lIIIlllIllIII[38], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[19]] = new WorldPoint(lIIIlllIllIII[39], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[21]] = new WorldPoint(lIIIlllIllIII[40], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[41]] = new WorldPoint(lIIIlllIllIII[42], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                            worldPointArr[lIIIlllIllIII[44]] = new WorldPoint(lIIIlllIllIII[45], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIlllIllIII[2]);
                            "".length();
                        }
                        if (lIlIIlIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                            AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[41]];
                            String[] strArr2 = new String[lIIIlllIllIII[2]];
                            strArr2[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIIIlllIllIII[2]];
                            strArr3[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIIIlllIllIII[2]];
                            strArr4[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[46]];
                            if (lIlIIlIIlIllIIl(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIIIlllIlIlll[lIIIlllIllIII[47]]);
                            }
                            if (lIlIIlIIlIlllII(nearest2)) {
                                String[] strArr5 = new String[lIIIlllIllIII[2]];
                                strArr5[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[48]];
                                if (lIlIIlIIlIllIll(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIIIlllIllIII[2]];
                                    iArr4[lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIIIlllIllIII[2]];
                                    strArr6[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIIIlllIllIII[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIIlllIllIII[2]];
                    iArr5[lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                    if (lIlIIlIIlIllIll(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIlllIllIII[2]];
                        iArr6[lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                        if (lIlIIlIIlIllIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIlIIlIIlIllllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                                AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIIlllIllIII[20]];
                                worldPointArr2[lIIIlllIllIII[1]] = new WorldPoint(lIIIlllIllIII[22], lIIIlllIllIII[23], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[2]] = new WorldPoint(lIIIlllIllIII[24], lIIIlllIllIII[25], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[3]] = new WorldPoint(lIIIlllIllIII[26], lIIIlllIllIII[27], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[4]] = new WorldPoint(lIIIlllIllIII[28], lIIIlllIllIII[29], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[6]] = new WorldPoint(lIIIlllIllIII[30], lIIIlllIllIII[31], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[13]] = new WorldPoint(lIIIlllIllIII[32], lIIIlllIllIII[33], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[15]] = new WorldPoint(lIIIlllIllIII[34], lIIIlllIllIII[35], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[17]] = new WorldPoint(lIIIlllIllIII[36], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[18]] = new WorldPoint(lIIIlllIllIII[38], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[19]] = new WorldPoint(lIIIlllIllIII[39], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[21]] = new WorldPoint(lIIIlllIllIII[40], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[41]] = new WorldPoint(lIIIlllIllIII[42], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                                worldPointArr2[lIIIlllIllIII[44]] = new WorldPoint(lIIIlllIllIII[45], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIlllIllIII[2]);
                                "".length();
                            }
                            if (lIlIIlIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                                AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[52]];
                                if (!lIlIIlIIlIllIll(Dialog.canLevelUpContinue() ? 1 : 0) || lIlIIlIIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIIIlllIllIII[2]];
                                strArr7[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIIIlllIllIII[2]];
                                strArr8[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIIIlllIllIII[2]];
                                strArr9[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[54]];
                                if (lIlIIlIIlIllIIl(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIIIlllIlIlll[lIIIlllIllIII[55]]);
                                }
                                if (lIlIIlIIlIlllII(nearest4)) {
                                    String[] strArr10 = new String[lIIIlllIllIII[2]];
                                    strArr10[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[56]];
                                    if (lIlIIlIIlIllIll(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIlIIlIIlIllIll(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIIIlllIllIII[2]];
                                            iArr7[lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIIIlllIllIII[3]);
                                            "".length();
                                        }
                                        if (lIlIIlIIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIlIIlIIlIllIll(options.isEmpty() ? 1 : 0)) {
                                                int i2 = lIIIlllIllIII[1];
                                                while (lIlIIlIIlIllIlI(i2, options.size())) {
                                                    int[] iArr8 = new int[lIIIlllIllIII[2]];
                                                    iArr8[lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                                                    if (lIlIIlIIlIlllll(((Item) Inventory.getAll(iArr8).get(lIIIlllIllIII[1])).getQuantity(), lIIIlllIllIII[2]) && lIlIIlIIlIllIIl(((Widget) options.get(i2)).getText().contains(lIIIlllIlIlll[lIIIlllIllIII[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i2)).getClickPoint().getX(), ((Widget) options.get(i2)).getClickPoint().getY(), (boolean) lIIIlllIllIII[2]);
                                                        Time.sleepTicks(lIIIlllIllIII[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIIIlllIllIII[2]];
                                                    iArr9[lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                                                    if (lIlIIlIIlIlllll(((Item) Inventory.getAll(iArr9).get(lIIIlllIllIII[1])).getQuantity(), lIIIlllIllIII[13]) && lIlIIlIIlIllIIl(((Widget) options.get(i2)).getText().contains(lIIIlllIlIlll[lIIIlllIllIII[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i2)).getClickPoint().getX(), ((Widget) options.get(i2)).getClickPoint().getY(), (boolean) lIIIlllIllIII[2]);
                                                        Time.sleepTicks(lIIIlllIllIII[3]);
                                                        "".length();
                                                    }
                                                    if (lIlIIlIIlIllIIl(((Widget) options.get(i2)).getText().contains(lIIIlllIlIlll[lIIIlllIllIII[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i2)).getClickPoint().getX(), ((Widget) options.get(i2)).getClickPoint().getY(), (boolean) lIIIlllIllIII[2]);
                                                        Time.sleepTicks(lIIIlllIllIII[3]);
                                                        "".length();
                                                    }
                                                    i2++;
                                                    "".length();
                                                    if (" ".length() < (-" ".length())) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0004e.s();
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[lIIIlllIllIII[2]];
            iArr10[lIIIlllIllIII[1]] = lIIIlllIllIII[9];
            if (lIlIIlIIlIllIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIIlllIllIII[2]];
                iArr11[lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                if (!lIlIIlIIlIllIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIIlllIllIII[2]];
                iArr12[lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                if (!lIlIIlIIlIllIll(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIlIIlIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[60]];
                String[] strArr11 = new String[lIIIlllIllIII[2]];
                strArr11[lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIlIIlIIlIlllII(nearest6)) {
                    nearest6.interact(lIIIlllIlIlll[lIIIlllIllIII[62]]);
                }
            }
        }
    }

    private static void lIlIIlIIlIllIII() {
        lIIIlllIllIII = new int[88];
        lIIIlllIllIII[0] = (-(((112 + 107) - 90) + 69)) & (-26659) & 27391;
        lIIIlllIllIII[1] = (174 ^ 143) & ((161 ^ 128) ^ (-1));
        lIIIlllIllIII[2] = " ".length();
        lIIIlllIllIII[3] = "  ".length();
        lIIIlllIllIII[4] = "   ".length();
        lIIIlllIllIII[5] = (-26657) & 31656;
        lIIIlllIllIII[6] = 64 ^ 68;
        lIIIlllIllIII[7] = (-10321) & 31486;
        lIIIlllIllIII[8] = (-((-8449) & 26511)) & (-33) & 30719;
        lIIIlllIllIII[9] = (-((-9573) & 30069)) & (-11273) & 32763;
        lIIIlllIllIII[10] = (-17098) & 27597;
        lIIIlllIllIII[11] = (((((97 + 84) - 124) + 88) + (((143 + 94) - 135) + 73)) - ((-2145) & 2418)) + ((17 + 47) - 5) + 95;
        lIIIlllIllIII[12] = (203 ^ 133) ^ (19 ^ 111);
        lIIIlllIllIII[13] = (85 ^ 117) ^ (170 ^ 143);
        lIIIlllIllIII[14] = 32 ^ 52;
        lIIIlllIllIII[15] = 101 ^ 99;
        lIIIlllIllIII[16] = -" ".length();
        lIIIlllIllIII[17] = 116 ^ 115;
        lIIIlllIllIII[18] = (41 ^ 84) ^ (109 ^ 24);
        lIIIlllIllIII[19] = (41 ^ 94) ^ (52 ^ 74);
        lIIIlllIllIII[20] = (((135 + 155) - 183) + 58) ^ (((146 + 37) - 15) + 0);
        lIIIlllIllIII[21] = (((135 + 16) - 21) + 21) ^ (((86 + 94) - 177) + 154);
        lIIIlllIllIII[22] = (-36) & 3063;
        lIIIlllIllIII[23] = (-16538) & 20379;
        lIIIlllIllIII[24] = (-((-18642) & 19699)) & (-4109) & 8191;
        lIIIlllIllIII[25] = (-((-12749) & 29133)) & (-4101) & 24319;
        lIIIlllIllIII[26] = (-((-871) & 17271)) & (-1025) & 20443;
        lIIIlllIllIII[27] = (-20483) & 24314;
        lIIIlllIllIII[28] = (-8225) & 11239;
        lIIIlllIllIII[29] = (-((-18483) & 22587)) & (-259) & 8191;
        lIIIlllIllIII[30] = (-8217) & 11226;
        lIIIlllIllIII[31] = (-((-2645) & 19039)) & (-5) & 20223;
        lIIIlllIllIII[32] = (-((-2549) & 28151)) & (-4161) & 32767;
        lIIIlllIllIII[33] = (-12306) & 16127;
        lIIIlllIllIII[34] = (-((-23405) & 32621)) & (-4105) & 16319;
        lIIIlllIllIII[35] = (-16641) & 20458;
        lIIIlllIllIII[36] = (-13377) & 16367;
        lIIIlllIllIII[37] = (-8197) & 12015;
        lIIIlllIllIII[38] = (-((-20771) & 30075)) & (-16385) & 28671;
        lIIIlllIllIII[39] = (-29775) & 32750;
        lIIIlllIllIII[40] = (-(39 ^ 2)) & (-17473) & 20478;
        lIIIlllIllIII[41] = (29 ^ 1) ^ (121 ^ 110);
        lIIIlllIllIII[42] = (-29793) & 32755;
        lIIIlllIllIII[43] = (-16643) & 20462;
        lIIIlllIllIII[44] = 186 ^ 182;
        lIIIlllIllIII[45] = (-((-6687) & 7807)) & (-20481) & 24559;
        lIIIlllIllIII[46] = (54 ^ 64) ^ (236 ^ 148);
        lIIIlllIllIII[47] = 37 ^ 42;
        lIIIlllIllIII[48] = 11 ^ 27;
        lIIIlllIllIII[49] = (142 ^ 189) ^ (40 ^ 10);
        lIIIlllIllIII[50] = (-((-4639) & 14335)) & (-16391) & 26623;
        lIIIlllIllIII[51] = (177 ^ 157) ^ (39 ^ 25);
        lIIIlllIllIII[52] = (99 ^ 20) ^ (116 ^ 16);
        lIIIlllIllIII[53] = (107 ^ 61) ^ (197 ^ 134);
        lIIIlllIllIII[54] = 148 ^ 130;
        lIIIlllIllIII[55] = (40 ^ 17) ^ (180 ^ 154);
        lIIIlllIllIII[56] = 24 ^ 0;
        lIIIlllIllIII[57] = (99 ^ 33) ^ (245 ^ 174);
        lIIIlllIllIII[58] = 170 ^ 176;
        lIIIlllIllIII[59] = (((1 + 95) - (-23)) + 22) ^ (((139 + 78) - 81) + 14);
        lIIIlllIllIII[60] = 174 ^ 178;
        lIIIlllIllIII[61] = 177 ^ 172;
        lIIIlllIllIII[62] = 57 ^ 39;
        lIIIlllIllIII[63] = (-((-6721) & 23364)) & (-1029) & 20471;
        lIIIlllIllIII[64] = (-20499) & 32478;
        lIIIlllIllIII[65] = (-3141) & 28140;
        lIIIlllIllIII[66] = (-((-4867) & 21435)) & (-1) & 24575;
        lIIIlllIllIII[67] = (21 ^ 43) ^ (9 ^ 31);
        lIIIlllIllIII[68] = (-17529) & 18428;
        lIIIlllIllIII[69] = (-((-6991) & 23535)) & (-4610) & 294895;
        lIIIlllIllIII[70] = (213 ^ 133) ^ (91 ^ 55);
        lIIIlllIllIII[71] = (85 ^ 22) ^ (206 ^ 160);
        lIIIlllIllIII[72] = (-((-16641) & 22317)) & (-24578) & 30703;
        lIIIlllIllIII[73] = (-2071) & 63582;
        lIIIlllIllIII[74] = 115 ^ 23;
        lIIIlllIllIII[75] = 76 ^ 83;
        lIIIlllIllIII[76] = (119 ^ 102) ^ (182 ^ 196);
        lIIIlllIllIII[77] = 152 ^ 184;
        lIIIlllIllIII[78] = (-((-5797) & 30383)) & (-4097) & 31711;
        lIIIlllIllIII[79] = (-(((84 + 99) - 86) + 104)) & (-19) & 4062;
        lIIIlllIllIII[80] = (-1037) & 4030;
        lIIIlllIllIII[81] = (-((-10319) & 31055)) & (-8195) & 32747;
        lIIIlllIllIII[82] = (-4146) & 7095;
        lIIIlllIllIII[83] = (-((-229) & 29175)) & (-1) & 32767;
        lIIIlllIllIII[84] = (-((-913) & 29691)) & (-17) & 31742;
        lIIIlllIllIII[85] = (-4522) & 7615;
        lIIIlllIllIII[86] = (-21073) & 24563;
        lIIIlllIllIII[87] = 172 ^ 141;
    }

    private static boolean lIlIIlIIlIllllI(int i2, int i3) {
        return i2 > i3;
    }

    private static String lIlIIlIIlIlIlII(String lllllllllllllllIIIIIlIlIIlIIIllI, String lllllllllllllllIIIIIlIlIIlIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIlIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIlIIlIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIlIIlIIlIII.init(lIIIlllIllIII[3], lllllllllllllllIIIIIlIlIIlIIlIIl);
            return new String(lllllllllllllllIIIIIlIlIIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIlIIlIIIlll) {
            lllllllllllllllIIIIIlIlIIlIIIlll.printStackTrace();
            return null;
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cL();
            "".length();
            if (((164 ^ 169) & ((0 ^ 13) ^ (-1))) < ((142 ^ 157) & ((68 ^ 87) ^ (-1)))) {
                return (90 ^ 73) & ((59 ^ 40) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIllIII[74];
    }

    private static boolean lIlIIlIIlIllIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIIllIIIIl(int i2, int i3) {
        return i2 >= i3;
    }
}
