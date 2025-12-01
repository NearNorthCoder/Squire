package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ai  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ai.class */
public class C0009ai implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int nh;
    private static final /* synthetic */ int nf;
    private static final /* synthetic */ int ne;
    private static final /* synthetic */ int nk;
    private static final /* synthetic */ int ni;
    private static final /* synthetic */ int nj;
    private static /* synthetic */ String[] lIlllllIII;
    private static final /* synthetic */ int nl;
    private static final /* synthetic */ int nm;
    private static final /* synthetic */ int no;
    private static final /* synthetic */ int nn;
    public static /* synthetic */ List<C0017d> bv;
    private static final /* synthetic */ int ng;
    private static /* synthetic */ int[] lIlllllIlI;

    private static boolean lIlIIIIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIlIIIlI(Object obj) {
        return obj != null;
    }

    private static void lIlIIIIIllIll() {
        lIlllllIII = new String[lIlllllIlI[49]];
        lIlllllIII[lIlllllIlI[0]] = lIlIIIIIllIII("LsGUPrSdP14cSuCflVESTw==", "IrUMJ");
        lIlllllIII[lIlllllIlI[1]] = lIlIIIIIllIIl("mvAZKuR717g4jJ3VB6J1wOkEbdK8RiyQTlTTbHDOFqqU79TjrmG9bYxmIZjj+HD2ZKPK2MzyXOg=", "Ylvdz");
        lIlllllIII[lIlllllIlI[3]] = lIlIIIIIllIIl("m7ik9+PwdySV92tGRml9XWx3ji8YrmCH", "OgVnz");
        lIlllllIII[lIlllllIlI[4]] = lIlIIIIIllIlI("Fj4jNy03KWY7JTcl", "YNFYD");
        lIlllllIII[lIlllllIlI[6]] = lIlIIIIIllIIl("tVIFOpDp3Yrb7R+5JA7w9HbJb2M3HMBV", "VjpBZ");
        lIlllllIII[lIlllllIlI[10]] = lIlIIIIIllIII("zYE6I14vTPQ98TlFFpFfD/AIBc3iFWxXvtdPjLRZVMTncfAi3EaWl/CKXdYbF3Xx", "CCQuf");
        lIlllllIII[lIlllllIlI[13]] = lIlIIIIIllIIl("oxhMD6M6aLXnkBrWzafYDqPRhIOTBFLfUPmaiaM4GqN22GMCNS/oQYqb3hE/vS+3", "MRMFR");
        lIlllllIII[lIlllllIlI[15]] = lIlIIIIIllIlI("PBNZJysOVhQvKhgfFyF5GAMJNjUCEwpqeRgBEDI6Ax8XIXkfGVkEDDI/NwE=", "kvyFY");
        lIlllllIII[lIlllllIlI[16]] = lIlIIIIIllIII("7iiOrBHpBNJq4+RjF2SVxw==", "bWizM");
        lIlllllIII[lIlllllIlI[17]] = lIlIIIIIllIII("I+emYkMKyn799qio18bOsA==", "HLNij");
        lIlllllIII[lIlllllIlI[21]] = lIlIIIIIllIIl("TzU3zW44c3INum5txD8aLZyhS4lGFiWl", "xrSIn");
        lIlllllIII[lIlllllIlI[22]] = lIlIIIIIllIlI("KAQkSy0ICygJLhA=", "geOkA");
        lIlllllIII[lIlllllIlI[25]] = lIlIIIIIllIII("Hw03c7ajMY6/ru/teNxEtsaa1xy3fgGd", "wJXHj");
        lIlllllIII[lIlllllIlI[26]] = lIlIIIIIllIIl("mBLYc0/CAm+HA8CkMmncoA==", "gvFhh");
        lIlllllIII[lIlllllIlI[28]] = lIlIIIIIllIlI("FCk3Gwk6LDwISiUsPgMFJWU+AAQ1Jz0YGQ==", "RERoj");
        lIlllllIII[lIlllllIlI[7]] = lIlIIIIIllIIl("UdNF9nFk0vdMaYHZhVrVRw==", "ptwTx");
        lIlllllIII[lIlllllIlI[29]] = lIlIIIIIllIIl("DPnictMDGrfzW33bsQBbuV5uKTDvInRJ", "UkNbT");
        lIlllllIII[lIlllllIlI[30]] = lIlIIIIIllIII("iSPsgdlyD1xFVbb+YeVKSg==", "nmPxK");
        lIlllllIII[lIlllllIlI[36]] = lIlIIIIIllIII("bR709YsJrcW1n0KKekLmSw==", "KZGfZ");
        lIlllllIII[lIlllllIlI[44]] = lIlIIIIIllIII("qrTLVRI9RCIZU2EFAFGpohROBSEm1sb/", "Xhbix");
    }

    private static String lIlIIIIIllIIl(String llllllllllllllllllIlllIIIIlIlIlI, String llllllllllllllllllIlllIIIIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIlllllIlI[16]), "DES");
            Cipher llllllllllllllllllIlllIIIIlIllII = Cipher.getInstance("DES");
            llllllllllllllllllIlllIIIIlIllII.init(lIlllllIlI[3], secretKeySpec);
            return new String(llllllllllllllllllIlllIIIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIIIIlIlIll) {
            llllllllllllllllllIlllIIIIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIIIllllI();
        lIlIIIIIllIll();
        ni = lIlllllIlI[32];
        nk = lIlllllIlI[14];
        ng = lIlllllIlI[12];
        nl = lIlllllIlI[31];
        nn = lIlllllIlI[45];
        no = lIlllllIlI[46];
        nh = lIlllllIlI[47];
        nf = lIlllllIlI[9];
        ne = lIlllllIlI[8];
        nj = lIlllllIlI[33];
        nm = lIlllllIlI[48];
        bv = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[2])) {
            ?? r0 = lIlllllIlI[1];
            "".length();
            return 0 != 0 ? ((151 ^ 140) ^ (131 ^ 137)) & (((234 ^ 196) ^ (84 ^ 107)) ^ (-" ".length())) : r0;
        }
        return lIlllllIlI[0];
    }

    private static String lIlIIIIIllIlI(String llllllllllllllllllIlllIIIlIIllII, String llllllllllllllllllIlllIIIlIIlIll) {
        String llllllllllllllllllIlllIIIlIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIlllIIIlIIlIll.toCharArray();
        int llllllllllllllllllIlllIIIlIIlIII = lIlllllIlI[0];
        char[] charArray2 = llllllllllllllllllIlllIIIlIIllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlllllIlI[0];
        while (lIlIIIIlIIIII(i, length)) {
            char llllllllllllllllllIlllIIIlIIllIl = charArray2[i];
            sb.append((char) (llllllllllllllllllIlllIIIlIIllIl ^ charArray[llllllllllllllllllIlllIIIlIIlIII % charArray.length]));
            "".length();
            llllllllllllllllllIlllIIIlIIlIII++;
            i++;
            "".length();
            if (((116 ^ 114) & ((122 ^ 124) ^ (-1))) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIIIlllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    private static boolean an() {
        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) {
            int[] iArr = new int[lIlllllIlI[1]];
            iArr[lIlllllIlI[0]] = lIlllllIlI[8];
            if (lIlIIIIlIIIll(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIlllllIlI[1]];
                iArr2[lIlllllIlI[0]] = lIlllllIlI[12];
                if (lIlIIIIlIIIll(Inventory.getCount(iArr2))) {
                    ?? r0 = lIlllllIlI[1];
                    "".length();
                    return (-" ".length()) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlllllIlI[0];
        } else if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) {
            int[] iArr3 = new int[lIlllllIlI[1]];
            iArr3[lIlllllIlI[0]] = lIlllllIlI[14];
            if (lIlIIIIlIIIll(Inventory.getCount(iArr3))) {
                int[] iArr4 = new int[lIlllllIlI[1]];
                iArr4[lIlllllIlI[0]] = fx();
                if (lIlIIIIlIIIll(Inventory.getCount(iArr4))) {
                    ?? r02 = lIlllllIlI[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return lIlllllIlI[0];
        } else {
            int[] iArr5 = new int[lIlllllIlI[1]];
            iArr5[lIlllllIlI[0]] = lIlllllIlI[8];
            if (lIlIIIIlIIIll(Inventory.getCount(iArr5))) {
                int[] iArr6 = new int[lIlllllIlI[1]];
                iArr6[lIlllllIlI[0]] = lIlllllIlI[9];
                if (lIlIIIIlIIIll(Inventory.getCount(iArr6))) {
                    ?? r03 = lIlllllIlI[1];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlllllIlI[0];
        }
    }

    private static int fx() {
        return lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[27]) ? lIlllllIlI[31] : (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[20]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[27])) ? lIlllllIlI[32] : (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[20])) ? lIlllllIlI[33] : lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[12]) ? lIlllllIlI[8] : lIlllllIlI[0];
    }

    private static int fw() {
        return lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11]) ? lIlllllIlI[14] : (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) ? lIlllllIlI[12] : lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7]) ? lIlllllIlI[9] : lIlllllIlI[0];
    }

    private static String lIlIIIIIllIII(String llllllllllllllllllIlllIIIIllIlll, String llllllllllllllllllIlllIIIIllIllI) {
        try {
            SecretKeySpec llllllllllllllllllIlllIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlllIIIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlllIIIIlllIIl.init(lIlllllIlI[3], llllllllllllllllllIlllIIIIlllIlI);
            return new String(llllllllllllllllllIlllIIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIIIIlllIII) {
            llllllllllllllllllIlllIIIIlllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIlllllIlI[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fv();
        return lIlllllIlI[43];
    }

    private static boolean lIlIIIIlIIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x017d, code lost:
        if (lIlIIIIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b7, code lost:
        if (lIlIIIIlIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[10]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028b, code lost:
        if (lIlIIIIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02c5, code lost:
        if (lIlIIIIlIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02c8, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[13]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x038c, code lost:
        if (lIlIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[1]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03c5, code lost:
        if (lIlIIIIlIIIII(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[1]) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03c8, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[15]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0009ai.lIlllllIlI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03e3, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v183, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v260, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v291, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fv() {
        if (lIlIIIIIlllll(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[0]];
            C0015b.a(bv);
            if (lIlIIIIlIIIII(bv.size(), lIlllllIlI[1])) {
                System.out.println(lIlllllIII[lIlllllIlI[1]]);
                bt = lIlllllIlI[0];
            }
        }
        if (lIlIIIIlIIIIl(bt ? 1 : 0) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[2])) {
            if (lIlIIIIlIIIIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIlIIIlI(nearest) && lIlIIIIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllIII[lIlllllIlI[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIlIIIlI(nearest) && lIlIIIIIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIII[lIlllllIlI[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllllIlI[5]);
                        "".length();
                    }
                    if (lIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIII[lIlllllIlI[6]];
                        if (lIlIIIIlIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllllIlI[6]);
                            "".length();
                        }
                        if (lIlIIIIlIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllllIlI[3]);
                            "".length();
                        }
                        if (lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7])) {
                            int[] iArr = new int[lIlllllIlI[1]];
                            iArr[lIlllllIlI[0]] = lIlllllIlI[8];
                            if (lIlIIIIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlllllIlI[1]];
                                iArr2[lIlllllIlI[0]] = lIlllllIlI[8];
                            }
                            int[] iArr3 = new int[lIlllllIlI[1]];
                            iArr3[lIlllllIlI[0]] = lIlllllIlI[9];
                            if (lIlIIIIlIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlllllIlI[1]];
                                iArr4[lIlllllIlI[0]] = lIlllllIlI[9];
                            }
                            Bank.withdrawAll(lIlllllIlI[8], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlllllIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr5 = new int[lIlllllIlI[1]];
                                iArr5[lIlllllIlI[0]] = lIlllllIlI[8];
                                if (lIlIIIIlIIIll(Inventory.getCount(iArr5))) {
                                    ?? r0 = lIlllllIlI[1];
                                    "".length();
                                    return " ".length() == 0 ? ((((119 + 136) - 97) + 50) ^ (((89 + 156) - 241) + 193)) & (((135 ^ 197) ^ (108 ^ 59)) ^ (-" ".length())) : r0;
                                }
                                return lIlllllIlI[0];
                            }, lIlllllIlI[5]);
                            "".length();
                            Bank.withdrawAll(lIlllllIlI[9], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlllllIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr5 = new int[lIlllllIlI[1]];
                                iArr5[lIlllllIlI[0]] = lIlllllIlI[9];
                                if (lIlIIIIlIIIll(Inventory.getCount(iArr5))) {
                                    ?? r0 = lIlllllIlI[1];
                                    "".length();
                                    return " ".length() > "  ".length() ? ((10 ^ 56) ^ (121 ^ 89)) & ((((67 ^ 92) & ((188 ^ 163) ^ (-1))) ^ (72 ^ 90)) ^ (-" ".length())) : r0;
                                }
                                return lIlllllIlI[0];
                            }, lIlllllIlI[5]);
                            "".length();
                        }
                        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) {
                            int[] iArr5 = new int[lIlllllIlI[1]];
                            iArr5[lIlllllIlI[0]] = lIlllllIlI[8];
                            if (lIlIIIIlIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllllIlI[1]];
                                iArr6[lIlllllIlI[0]] = lIlllllIlI[8];
                            }
                            int[] iArr7 = new int[lIlllllIlI[1]];
                            iArr7[lIlllllIlI[0]] = lIlllllIlI[12];
                            if (lIlIIIIlIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlllllIlI[1]];
                                iArr8[lIlllllIlI[0]] = lIlllllIlI[12];
                            }
                            Bank.withdrawAll(lIlllllIlI[8], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlllllIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr9 = new int[lIlllllIlI[1]];
                                iArr9[lIlllllIlI[0]] = lIlllllIlI[8];
                                if (lIlIIIIlIIIll(Inventory.getCount(iArr9))) {
                                    ?? r0 = lIlllllIlI[1];
                                    "".length();
                                    return "   ".length() > "   ".length() ? ((((156 + 115) - 256) + 170) ^ (((88 + 107) - 92) + 37)) & (((((66 + 173) - 117) + 122) ^ (((166 + 115) - 233) + 145)) ^ (-" ".length())) : r0;
                                }
                                return lIlllllIlI[0];
                            }, lIlllllIlI[5]);
                            "".length();
                            Bank.withdrawAll(lIlllllIlI[12], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlllllIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr9 = new int[lIlllllIlI[1]];
                                iArr9[lIlllllIlI[0]] = lIlllllIlI[12];
                                if (lIlIIIIlIIIll(Inventory.getCount(iArr9))) {
                                    ?? r0 = lIlllllIlI[1];
                                    "".length();
                                    return (123 ^ 127) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlllllIlI[0];
                            }, lIlllllIlI[5]);
                            "".length();
                        }
                        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) {
                            int[] iArr9 = new int[lIlllllIlI[1]];
                            iArr9[lIlllllIlI[0]] = lIlllllIlI[14];
                            if (lIlIIIIlIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlllllIlI[1]];
                                iArr10[lIlllllIlI[0]] = lIlllllIlI[14];
                            }
                            int[] iArr11 = new int[lIlllllIlI[1]];
                            iArr11[lIlllllIlI[0]] = fx();
                            if (lIlIIIIlIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlllllIlI[1]];
                                iArr12[lIlllllIlI[0]] = fx();
                            }
                            int[] iArr13 = new int[lIlllllIlI[1]];
                            iArr13[lIlllllIlI[0]] = lIlllllIlI[14];
                            if (lIlIIIIlIIIII(Inventory.getCount(iArr13), lIlllllIlI[1])) {
                                Bank.withdraw(lIlllllIlI[14], lIlllllIlI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr14 = new int[lIlllllIlI[1]];
                                    iArr14[lIlllllIlI[0]] = lIlllllIlI[14];
                                    if (lIlIIIIlIIIll(Inventory.getCount(iArr14))) {
                                        ?? r0 = lIlllllIlI[1];
                                        "".length();
                                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlllllIlI[0];
                                }, lIlllllIlI[5]);
                                "".length();
                            }
                            int[] iArr14 = new int[lIlllllIlI[1]];
                            iArr14[lIlllllIlI[0]] = lIlllllIlI[14];
                            if (lIlIIIIlIIIll(Inventory.getCount(iArr14))) {
                                Bank.withdrawAll(fx(), Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIlllllIlI[1]];
                                    iArr15[lIlllllIlI[0]] = fx();
                                    if (lIlIIIIlIIIll(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIlllllIlI[1];
                                        "".length();
                                        return (-" ".length()) > 0 ? ((((49 + 42) - 33) + 90) ^ (((12 + 106) - (-43)) + 19)) & (((221 ^ 157) ^ (238 ^ 142)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlllllIlI[0];
                                }, lIlllllIlI[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIIIIIlllll(an() ? 1 : 0)) {
                if (lIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIlIIIIlIIIIl(Bank.isOpen() ? 1 : 0) && lIlIIIIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    if (lIlIIIIIlllll(GrandExchange.isOpen() ? 1 : 0)) {
                        GrandExchange.openBank();
                    }
                    if (lIlIIIIlIIIIl(Production.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIII[lIlllllIlI[16]];
                        int[] iArr15 = new int[lIlllllIlI[1]];
                        iArr15[lIlllllIlI[0]] = fw();
                        Item first = Inventory.getFirst(iArr15);
                        int[] iArr16 = new int[lIlllllIlI[1]];
                        iArr16[lIlllllIlI[0]] = fx();
                        Item first2 = Inventory.getFirst(iArr16);
                        if (lIlIIIIlIIIlI(first) && lIlIIIIlIIIlI(first2)) {
                            Time.sleepTicks(lIlllllIlI[4]);
                            "".length();
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIlllllIlI[5]);
                            "".length();
                        }
                    }
                    if (lIlIIIIIlllll(Production.isOpen() ? 1 : 0)) {
                        if (lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[17]];
                            Production.chooseOption(lIlllllIlI[1]);
                            Time.sleepTicks(lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0) || lIlIIIIIlllll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                                    ?? r0 = lIlllllIlI[1];
                                    "".length();
                                    return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlllllIlI[0];
                            }, C0018e.c(lIlllllIlI[18], lIlllllIlI[19]));
                            "".length();
                        }
                        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[20])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[21]];
                            Production.chooseOption(lIlllllIII[lIlllllIlI[22]]);
                            Time.sleepTicks(lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[lIlllllIlI[1]];
                                    iArr17[lIlllllIlI[0]] = lIlllllIlI[33];
                                    if (!lIlIIIIlIIIII(Inventory.getCount(iArr17), lIlllllIlI[1])) {
                                        return lIlllllIlI[0];
                                    }
                                }
                                ?? r0 = lIlllllIlI[1];
                                "".length();
                                return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }, C0018e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[20]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[12])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[25]];
                            Production.chooseOption(lIlllllIII[lIlllllIlI[26]]);
                            Time.sleepTicks(lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[lIlllllIlI[1]];
                                    iArr17[lIlllllIlI[0]] = lIlllllIlI[32];
                                    if (!lIlIIIIlIIIII(Inventory.getCount(iArr17), lIlllllIlI[1])) {
                                        return lIlllllIlI[0];
                                    }
                                }
                                ?? r0 = lIlllllIlI[1];
                                "".length();
                                return (((71 ^ 64) ^ (15 ^ 41)) & (((6 ^ 58) ^ (133 ^ 152)) ^ (-" ".length()))) == "   ".length() ? ((224 ^ 145) ^ (3 ^ 62)) & (((166 ^ 178) ^ (41 ^ 113)) ^ (-" ".length())) : r0;
                            }, C0018e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[12]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[27])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[28]];
                            Production.chooseOption(lIlllllIII[lIlllllIlI[7]]);
                            Time.sleepTicks(lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[lIlllllIlI[1]];
                                    iArr17[lIlllllIlI[0]] = lIlllllIlI[32];
                                    if (!lIlIIIIlIIIII(Inventory.getCount(iArr17), lIlllllIlI[1])) {
                                        return lIlllllIlI[0];
                                    }
                                }
                                ?? r0 = lIlllllIlI[1];
                                "".length();
                                return "   ".length() == 0 ? ((50 ^ 25) ^ (81 ^ 105)) & (((52 ^ 62) ^ (122 ^ 99)) ^ (-" ".length())) : r0;
                            }, C0018e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[27])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[29]];
                            Production.chooseOption(lIlllllIII[lIlllllIlI[30]]);
                            Time.sleepTicks(lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[lIlllllIlI[1]];
                                    iArr17[lIlllllIlI[0]] = lIlllllIlI[31];
                                    if (!lIlIIIIlIIIII(Inventory.getCount(iArr17), lIlllllIlI[1])) {
                                        return lIlllllIlI[0];
                                    }
                                }
                                ?? r0 = lIlllllIlI[1];
                                "".length();
                                return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }, C0018e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static void Q() {
        if (lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7])) {
            C0017d c0017d = new C0017d(lIlllllIlI[8], lIlllllIlI[34], lIlllllIlI[12]);
            C0017d c0017d2 = new C0017d(lIlllllIlI[9], lIlllllIlI[35], lIlllllIlI[36]);
            bv.add(c0017d);
            "".length();
            bv.add(c0017d2);
            "".length();
        }
        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[7]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11])) {
            C0017d c0017d3 = new C0017d(lIlllllIlI[8], lIlllllIlI[34], lIlllllIlI[12]);
            C0017d c0017d4 = new C0017d(lIlllllIlI[12], lIlllllIlI[35], lIlllllIlI[37]);
            bv.add(c0017d3);
            "".length();
            bv.add(c0017d4);
            "".length();
        }
        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[11]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[20])) {
            C0017d c0017d5 = new C0017d(lIlllllIlI[33], lIlllllIlI[38], lIlllllIlI[2]);
            C0017d c0017d6 = new C0017d(lIlllllIlI[14], lIlllllIlI[1], lIlllllIlI[5]);
            bv.add(c0017d5);
            "".length();
            bv.add(c0017d6);
            "".length();
        }
        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[20]) && lIlIIIIlIIIII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[27])) {
            C0017d c0017d7 = new C0017d(lIlllllIlI[32], lIlllllIlI[34], lIlllllIlI[2]);
            C0017d c0017d8 = new C0017d(lIlllllIlI[14], lIlllllIlI[1], lIlllllIlI[5]);
            bv.add(c0017d7);
            "".length();
            bv.add(c0017d8);
            "".length();
        }
        if (lIlIIIIlIIlII(Skills.getLevel(Skill.FLETCHING), lIlllllIlI[27])) {
            C0017d c0017d9 = new C0017d(lIlllllIlI[31], lIlllllIlI[34], lIlllllIlI[2]);
            C0017d c0017d10 = new C0017d(lIlllllIlI[14], lIlllllIlI[1], lIlllllIlI[5]);
            bv.add(c0017d9);
            "".length();
            bv.add(c0017d10);
            "".length();
        }
        if (lIlIIIIlIIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllllIII[lIlllllIlI[44]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lIlllllIlI[39], lIlllllIlI[10], lIlllllIlI[40]));
            "".length();
        }
        int[] iArr = new int[lIlllllIlI[1]];
        iArr[lIlllllIlI[0]] = lIlllllIlI[41];
        if (lIlIIIIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lIlllllIlI[41], lIlllllIlI[12], lIlllllIlI[42]));
            "".length();
        }
    }

    private static boolean lIlIIIIlIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIIIIlIIIll(int i) {
        return i > 0;
    }

    private static void lIlIIIIIllllI() {
        lIlllllIlI = new int[50];
        lIlllllIlI[0] = ((97 ^ 106) ^ (146 ^ 149)) & (((((128 + 34) - 63) + 63) ^ (((34 + 46) - (-12)) + 82)) ^ (-" ".length()));
        lIlllllIlI[1] = " ".length();
        lIlllllIlI[2] = 65 ^ 125;
        lIlllllIlI[3] = "  ".length();
        lIlllllIlI[4] = "   ".length();
        lIlllllIlI[5] = (-8260) & 13259;
        lIlllllIlI[6] = (8 ^ 37) ^ (184 ^ 145);
        lIlllllIlI[7] = 153 ^ 150;
        lIlllllIlI[8] = 53 ^ 0;
        lIlllllIlI[9] = (52 ^ 24) ^ (100 ^ 111);
        lIlllllIlI[10] = (212 ^ 186) ^ (126 ^ 21);
        lIlllllIlI[11] = 132 ^ 154;
        lIlllllIlI[12] = 237 ^ 197;
        lIlllllIlI[13] = 106 ^ 108;
        lIlllllIlI[14] = (-16389) & 17334;
        lIlllllIlI[15] = (74 ^ 9) ^ (52 ^ 112);
        lIlllllIlI[16] = 37 ^ 45;
        lIlllllIlI[17] = (13 ^ 47) ^ (170 ^ 129);
        lIlllllIlI[18] = (-((-8089) & 24507)) & (-2) & 31919;
        lIlllllIlI[19] = (-13313) & 30312;
        lIlllllIlI[20] = 80 ^ 115;
        lIlllllIlI[21] = (64 ^ 52) ^ (240 ^ 142);
        lIlllllIlI[22] = 85 ^ 94;
        lIlllllIlI[23] = (-21027) & 98026;
        lIlllllIlI[24] = (-((-1489) & 9726)) & (-1) & 96237;
        lIlllllIlI[25] = 20 ^ 24;
        lIlllllIlI[26] = (((100 + 106) - 163) + 108) ^ (((148 + 10) - 37) + 33);
        lIlllllIlI[27] = 81 ^ 102;
        lIlllllIlI[28] = 101 ^ 107;
        lIlllllIlI[29] = (8 ^ 101) ^ (192 ^ 189);
        lIlllllIlI[30] = 53 ^ 36;
        lIlllllIlI[31] = (-10769) & 12285;
        lIlllllIlI[32] = (-24593) & 26111;
        lIlllllIlI[33] = (-14863) & 16383;
        lIlllllIlI[34] = (-24582) & 27581;
        lIlllllIlI[35] = (-24623) & 26622;
        lIlllllIlI[36] = 134 ^ 148;
        lIlllllIlI[37] = (((230 + 64) - 166) + 105) ^ (((147 + 86) - 106) + 69);
        lIlllllIlI[38] = (-((-17389) & 30701)) & (-18456) & 32767;
        lIlllllIlI[39] = (-((-10241) & 31011)) & (-2) & 32751;
        lIlllllIlI[40] = (-67) & 25066;
        lIlllllIlI[41] = (-((-873) & 9209)) & (-16393) & 32735;
        lIlllllIlI[42] = (-((-4642) & 32371)) & (-35) & 28663;
        lIlllllIlI[43] = (223 ^ 162) ^ (71 ^ 94);
        lIlllllIlI[44] = 78 ^ 93;
        lIlllllIlI[45] = 174 ^ 144;
        lIlllllIlI[46] = (-21633) & 22483;
        lIlllllIlI[47] = (((61 + 100) - 16) + 9) ^ (((125 + 19) - (-12)) + 23);
        lIlllllIlI[48] = (-22791) & 24567;
        lIlllllIlI[49] = 143 ^ 155;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIlllllIII[lIlllllIlI[36]];
    }
}
