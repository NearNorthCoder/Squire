package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.aj  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/aj.class */
public class aj implements W {
    public static /* synthetic */ WorldArea mc;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ WorldPoint me;
    private static /* synthetic */ WorldPoint md;
    private static /* synthetic */ int[] mf;
    private static /* synthetic */ int[] lIIlIIIII;
    private static /* synthetic */ String[] lIIIlllll;

    private static void lllIlllllll() {
        lIIIlllll = new String[lIIlIIIII[100]];
        lIIIlllll[lIIlIIIII[0]] = lllIllIllll("ivztEgZL0zgJFSng8jsTMQ==", "ezYFR");
        lIIIlllll[lIIlIIIII[1]] = lllIlllIIII("Ow6AJZRwKetKWeA0BDWefb/gZlLSm8/U9HsGIjIb+05dy66BQ9mdkv7sHxRMveboOfnXtO/9fRg=", "JavIL");
        lIIIlllll[lIIlIIIII[2]] = lllIlllIIIl("GhAcCCM1BQMPI3QFBUEmNR8B", "TqjaD");
        lIIIlllll[lIIlIIIII[3]] = lllIlllIIII("+jePEtfj2C0S4IKEIz39MA==", "iXKbh");
        lIIIlllll[lIIlIIIII[5]] = lllIlllIIII("vdi7ikskZTZH1UVLpshng7KQI46vrpAP", "rcZYE");
        lIIIlllll[lIIlIIIII[7]] = lllIlllIIII("Q5uL0Tv1Q0fJs8qaGc/H7ECT5c52AGfD", "qUiqr");
        lIIIlllll[lIIlIIIII[9]] = lllIlllIIII("13PwNEcwgItueBSaTC/acQ==", "dMYRD");
        lIIIlllll[lIIlIIIII[11]] = lllIlllIIII("YeKaU0OW4nndDopUx0PD/ATulUCqeZ34", "xzHdN");
        lIIIlllll[lIIlIIIII[13]] = lllIlllIIII("2xtVda/IYdY=", "EfKxi");
        lIIIlllll[lIIlIIIII[15]] = lllIlllIIIl("HyAWPC83LkU2JzA9", "YIeTF");
        lIIIlllll[lIIlIIIII[16]] = lllIlllIIIl("DQ5BNSo/Sww9KykCDzN4KR4RJDQzDhJ4eCkcCCA7MgIPM3guBEEWDQMiLxM=", "ZkaTX");
        lIIIlllll[lIIlIIIII[17]] = lllIllIllll("smN1F5aUAQfVfdGnIiBwTui8eVFx/HeL", "pbauX");
        lIIIlllll[lIIlIIIII[18]] = lllIlllIIIl("MQYdGQMZCE4DBRM=", "wonqj");
        lIIIlllll[lIIlIIIII[19]] = lllIlllIIIl("NwExTC4YHiAFJhZNOgMs", "qmHlH");
        lIIIlllll[lIIlIIIII[20]] = lllIlllIIIl("ADYZPCojIQ==", "FSxHB");
        lIIIlllll[lIIlIIIII[22]] = lllIllIllll("CkiDxfVfcS0P8qobpG002A==", "YLNNS");
        lIIIlllll[lIIlIIIII[25]] = lllIlllIIII("z2l7qh2rsUgeO9jAjFEcpw==", "dlxyA");
        lIIIlllll[lIIlIIIII[26]] = lllIlllIIIl("LTkAFx4AJQhHAgYsHA==", "iKogn");
        lIIIlllll[lIIlIIIII[28]] = lllIlllIIII("QK/EAOKSujl+8j+yoFu9FlnbLOyFxBLb", "mERqQ");
        lIIIlllll[lIIlIIIII[29]] = lllIlllIIII("7tgROGkDPyU=", "yuinW");
        lIIIlllll[lIIlIIIII[27]] = lllIlllIIII("rP3GNrmayu0=", "ICZYk");
        lIIIlllll[lIIlIIIII[32]] = lllIlllIIII("f8T6HvAHKWdNQpnqy8Euo+t5erZRLM5E", "HklOp");
        lIIIlllll[lIIlIIIII[33]] = lllIlllIIII("nvmD/hQfp8I=", "nwZnC");
        lIIIlllll[lIIlIIIII[34]] = lllIlllIIII("ncVnJK6L4ss=", "AFxyt");
        lIIIlllll[lIIlIIIII[35]] = lllIlllIIIl("PSkOSAEcaB4EDFMuERsdUzsIBwE=", "sHxhu");
        lIIIlllll[lIIlIIIII[36]] = lllIllIllll("FhDJwt/lgTk=", "RUjEi");
        lIIIlllll[lIIlIIIII[37]] = lllIllIllll("0ofePr/ffK0=", "cgXyY");
        lIIIlllll[lIIlIIIII[38]] = lllIlllIIII("ILDesLR4pl1RPN7Js6AsXw==", "GjYDw");
        lIIIlllll[lIIlIIIII[39]] = lllIlllIIII("4vzUImwM3CXBhKwbn6k27A==", "CcyIc");
        lIIIlllll[lIIlIIIII[40]] = lllIllIllll("MpJDNNqCABMhLSRK90UUCQ==", "CkhoX");
        lIIIlllll[lIIlIIIII[41]] = lllIlllIIII("FmF1IEOAXeQ=", "FNouW");
        lIIIlllll[lIIlIIIII[42]] = lllIllIllll("3tVRsochCNjvFXMx0ayN+g==", "wCsLG");
        lIIIlllll[lIIlIIIII[43]] = lllIllIllll("Xb2WFcswS4Ks4H7iseFa3+smp548Y/1EZutqmNSCbk6UifdOKJfOxsl46BBCnFVRBqgh981iNOs=", "bBFyr");
        lIIIlllll[lIIlIIIII[44]] = lllIlllIIIl("LQ8jPS0CGjw6LUMaOnQoAgA+", "cnUTJ");
        lIIIlllll[lIIlIIIII[45]] = lllIlllIIIl("Fx4KFis2CU8aIzYF", "XnoxB");
        lIIIlllll[lIIlIIIII[46]] = lllIlllIIII("bVcWJ5fxZUw0Q5fnwxzUHvIkTA2mKcJ1", "UIWPq");
        lIIIlllll[lIIlIIIII[47]] = lllIlllIIIl("HSoVBhVuIR0ZEScpE0oXKzM=", "NGtjy");
        lIIIlllll[lIIlIIIII[48]] = lllIllIllll("9bY459XFkjvZ0iHhhvM9mbLNGsnN+lS1H6k24b7os2p6OTmy+TcBMDEd6aGH8nad", "fubeJ");
        lIIIlllll[lIIlIIIII[49]] = lllIllIllll("cnc4R/lmajO0m8kVaotZckZblDvruraA", "cgmDY");
        lIIIlllll[lIIlIIIII[53]] = lllIllIllll("DhGmrEv3/SivPUGgnOJAOA==", "DHkde");
        lIIIlllll[lIIlIIIII[54]] = lllIlllIIII("B3rdc4Jqufgg7I2DbZEam02CzFb+5Crm", "ZuXYz");
        lIIIlllll[lIIlIIIII[55]] = lllIlllIIIl("BCMJMQ==", "SFhCs");
        lIIIlllll[lIIlIIIII[56]] = lllIlllIIII("IpuwGBQPaAI=", "sfNYo");
        lIIIlllll[lIIlIIIII[57]] = lllIlllIIII("W0qg/KFOVM3FRXlq/lYUOl7cFU7k7EJp", "SEODL");
        lIIIlllll[lIIlIIIII[58]] = lllIlllIIII("2VFuAEMOVgdVwk7ppKGbrvsz94pYkWaz", "eqpCl");
        lIIIlllll[lIIlIIIII[59]] = lllIlllIIII("mfYV6Ejjl11ekCW+3JDHkA==", "RzREy");
        lIIIlllll[lIIlIIIII[60]] = lllIllIllll("X7YvP1+DcffyAHjnbEPEVA==", "EBHgT");
        lIIIlllll[lIIlIIIII[61]] = lllIllIllll("2WmJCigGj/4=", "znVXU");
        lIIIlllll[lIIlIIIII[62]] = lllIllIllll("nJzvkijKBy0naWdW8bvgMg==", "LbiDU");
        lIIIlllll[lIIlIIIII[73]] = lllIlllIIIl("Mx82KSAbEQ==", "uvEAI");
        lIIIlllll[lIIlIIIII[75]] = lllIllIllll("9ZT2ce4AMp4JZR1jyfP1qk9obckhk7dL", "PjVZQ");
        lIIIlllll[lIIlIIIII[76]] = lllIlllIIII("/RoDxA3MKalUKwJnRnc35TC8rCi6p6k9", "mEDFE");
        lIIIlllll[lIIlIIIII[78]] = lllIlllIIIl("ESseDg85JU0EBz42", "WBmff");
        lIIIlllll[lIIlIIIII[79]] = lllIlllIIIl("MAI2ASETFQ==", "vgWuI");
        lIIIlllll[lIIlIIIII[80]] = lllIllIllll("M6NTEl5ZYWcN18Ma8G+2UA==", "ZMZIN");
        lIIIlllll[lIIlIIIII[81]] = lllIlllIIIl("FgEfMh0+D0woGzQ=", "PhlZt");
        lIIIlllll[lIIlIIIII[82]] = lllIllIllll("XTUKEohEGyg09F4r4wyROlsn0Mt54U/y", "wMKoT");
    }

    private static boolean llllIIIIIlI(int i, int i2) {
        return i < i2;
    }

    public static void af() {
        int[] iArr = new int[lIIlIIIII[1]];
        iArr[lIIlIIIII[0]] = lIIlIIIII[6];
        if (llllIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[6], lIIlIIIII[1], lIIlIIIII[4]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIIIII[1]];
        iArr2[lIIlIIIII[0]] = lIIlIIIII[8];
        if (llllIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[8], lIIlIIIII[1], lIIlIIIII[4]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIIIII[1]];
        iArr3[lIIlIIIII[0]] = lIIlIIIII[10];
        if (llllIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[10], lIIlIIIII[1], lIIlIIIII[63]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIIIII[1]];
        iArr4[lIIlIIIII[0]] = lIIlIIIII[14];
        if (llllIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[14], lIIlIIIII[64], lIIlIIIII[65]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIIIII[1]];
        iArr5[lIIlIIIII[0]] = lIIlIIIII[12];
        if (llllIIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[12], lIIlIIIII[66], lIIlIIIII[7]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIIIII[1]];
        iArr6[lIIlIIIII[0]] = lIIlIIIII[67];
        if (llllIIIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[67], lIIlIIIII[1], lIIlIIIII[4]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIIIII[1]];
        iArr7[lIIlIIIII[0]] = lIIlIIIII[24];
        if (llllIIIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[24], lIIlIIIII[16], lIIlIIIII[4]));
            "".length();
        }
        if (llllIIIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllll[lIIlIIIII[75]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[68], lIIlIIIII[7], lIIlIIIII[69]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIIIII[1]];
        iArr8[lIIlIIIII[0]] = lIIlIIIII[70];
        if (llllIIIIIll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIII[70], lIIlIIIII[54], lIIlIIIII[71]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (llllIIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aj.lIIlIIIII[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
        if (llllIIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aj.lIIlIIIII[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
        if (llllIIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aj.lIIlIIIII[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
        if (llllIIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aj.lIIlIIIII[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        if (llllIIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aj.lIIlIIIII[1]) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v319, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ef() {
        if (llllIIIIIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[0]];
            C0001b.a(bv);
            if (llllIIIIIlI(bv.size(), lIIlIIIII[1])) {
                System.out.println(lIIIlllll[lIIlIIIII[1]]);
                bt = lIIlIIIII[0];
            }
        }
        if (llllIIIIIll(bt ? 1 : 0)) {
            if (llllIIIIIll(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIIIIlII(nearest) && llllIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[2]];
                    C0000a.a(nearest);
                }
                if (llllIIIIlII(nearest) && llllIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIII[4]);
                        "".length();
                    }
                    if (llllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[5]];
                        if (llllIIIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIII[5]);
                            "".length();
                        }
                        if (llllIIIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIII[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIIII[1]];
                        iArr[lIIlIIIII[0]] = lIIlIIIII[6];
                        if (llllIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lIIlIIIII[1]];
                            strArr[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[7]];
                        }
                        int[] iArr2 = new int[lIIlIIIII[1]];
                        iArr2[lIIlIIIII[0]] = lIIlIIIII[8];
                        if (llllIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                            String[] strArr2 = new String[lIIlIIIII[1]];
                            strArr2[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[9]];
                        }
                        int[] iArr3 = new int[lIIlIIIII[1]];
                        iArr3[lIIlIIIII[0]] = lIIlIIIII[10];
                        if (llllIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
                            String[] strArr3 = new String[lIIlIIIII[1]];
                            strArr3[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[11]];
                        }
                        int[] iArr4 = new int[lIIlIIIII[1]];
                        iArr4[lIIlIIIII[0]] = lIIlIIIII[12];
                        if (llllIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
                            String[] strArr4 = new String[lIIlIIIII[1]];
                            strArr4[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[13]];
                        }
                        int[] iArr5 = new int[lIIlIIIII[1]];
                        iArr5[lIIlIIIII[0]] = lIIlIIIII[14];
                        if (llllIIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
                            String[] strArr5 = new String[lIIlIIIII[1]];
                            strArr5[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[15]];
                        }
                        if ((!llllIIIIIll(Bank.contains(C0005f.aO) ? 1 : 0) || llllIIIIllI(Inventory.getCount(C0005f.aO), lIIlIIIII[1])) && !llllIIIIIIl(Equipment.contains(C0005f.aO) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIlIIIII[1]];
                            iArr6[lIIlIIIII[0]] = lIIlIIIII[6];
                            if (llllIIIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllll[lIIlIIIII[17]], lIIlIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIIIII[1]];
                                    strArr6[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[82]];
                                    if (llllIIIIlIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }, lIIlIIIII[4]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIIlIIIII[1]];
                            iArr7[lIIlIIIII[0]] = lIIlIIIII[8];
                            if (llllIIIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllll[lIIlIIIII[18]], lIIlIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIIIII[1]];
                                    strArr6[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[81]];
                                    if (llllIIIIlIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return (132 ^ 128) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }, lIIlIIIII[4]);
                                "".length();
                            }
                            int[] iArr8 = new int[lIIlIIIII[1]];
                            iArr8[lIIlIIIII[0]] = lIIlIIIII[10];
                            if (llllIIIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllll[lIIlIIIII[19]], lIIlIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIIIII[1]];
                                    strArr6[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[80]];
                                    if (llllIIIIlIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return ((153 ^ 169) & ((103 ^ 87) ^ (-1))) > (88 ^ 92) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }, lIIlIIIII[4]);
                                "".length();
                            }
                            int[] iArr9 = new int[lIIlIIIII[1]];
                            iArr9[lIIlIIIII[0]] = lIIlIIIII[12];
                            if (llllIIIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllll[lIIlIIIII[20]], lIIlIIIII[21], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIIIII[1]];
                                    strArr6[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[79]];
                                    if (llllIIIIlIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return (-"   ".length()) > 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }, lIIlIIIII[4]);
                                "".length();
                            }
                            int[] iArr10 = new int[lIIlIIIII[1]];
                            iArr10[lIIlIIIII[0]] = lIIlIIIII[14];
                            if (llllIIIIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllll[lIIlIIIII[22]], lIIlIIIII[23], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIIIII[1]];
                                    strArr6[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[78]];
                                    if (llllIIIIlIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return (-" ".length()) > " ".length() ? ((213 ^ 196) ^ (92 ^ 7)) & (((78 ^ 58) ^ (163 ^ 157)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }, lIIlIIIII[4]);
                                "".length();
                            }
                            if (llllIIIIIIl(Bank.contains(C0005f.aO) ? 1 : 0)) {
                                C0000a.b(C0005f.aO, lIIlIIIII[1]);
                            }
                            int[] iArr11 = new int[lIIlIIIII[1]];
                            iArr11[lIIlIIIII[0]] = lIIlIIIII[24];
                            if (llllIIIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                C0000a.a(lIIlIIIII[24], lIIlIIIII[1]);
                            }
                        }
                        af();
                        System.out.println(lIIIlllll[lIIlIIIII[16]]);
                        bt = lIIlIIIII[1];
                        return;
                    }
                }
            }
            if (llllIIIIIIl(ab() ? 1 : 0)) {
                if (llllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[25]];
                    System.out.println(lIIIlllll[lIIlIIIII[26]]);
                    Inventory.getAll(mf).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llllIIIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (llllIIIIIlI(Skills.getLevel(Skill.FISHING), lIIlIIIII[27])) {
                        if (llllIIIIIlI(Skills.getLevel(Skill.FISHING), lIIlIIIII[7])) {
                            if (llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(md), lIIlIIIII[7])) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[28]];
                                if (llllIIIIIIl(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                                    Inventory.getFirst(C0005f.aO).interact(lIIIlllll[lIIlIIIII[29]]);
                                }
                                Movement.walkTo(md);
                                "".length();
                                Time.sleepTicks(lIIlIIIII[1]);
                                "".length();
                            }
                            if (llllIIIIIIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[27]];
                                if (llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
                                    int[] iArr12 = new int[lIIlIIIII[1]];
                                    iArr12[lIIlIIIII[0]] = lIIlIIIII[31];
                                    NPC nearest2 = NPCs.getNearest(iArr12);
                                    if (llllIIIIlII(nearest2) && llllIIIIIIl(mc.contains(nearest2) ? 1 : 0)) {
                                        int[] iArr13 = new int[lIIlIIIII[1]];
                                        iArr13[lIIlIIIII[0]] = lIIlIIIII[31];
                                        NPCs.getNearest(iArr13).interact(lIIlIIIII[0]);
                                        Time.sleepTicks(lIIlIIIII[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (llllIIIIllI(Skills.getLevel(Skill.FISHING), lIIlIIIII[7]) && llllIIIIIlI(Skills.getLevel(Skill.FISHING), lIIlIIIII[27])) {
                            if (llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[32]];
                                Movement.walkTo(md);
                                "".length();
                                Time.sleepTicks(lIIlIIIII[1]);
                                "".length();
                            }
                            if (llllIIIIIIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[33]];
                                if (llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
                                    int[] iArr14 = new int[lIIlIIIII[1]];
                                    iArr14[lIIlIIIII[0]] = lIIlIIIII[31];
                                    NPC nearest3 = NPCs.getNearest(iArr14);
                                    if (llllIIIIlII(nearest3) && llllIIIIIIl(mc.contains(nearest3) ? 1 : 0)) {
                                        int[] iArr15 = new int[lIIlIIIII[1]];
                                        iArr15[lIIlIIIII[0]] = lIIlIIIII[31];
                                        NPCs.getNearest(iArr15).interact(lIIIlllll[lIIlIIIII[34]]);
                                        Time.sleepTicks(lIIlIIIII[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llllIIIIllI(Skills.getLevel(Skill.FISHING), lIIlIIIII[27])) {
                        if (llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[35]];
                            Movement.walkTo(me);
                            "".length();
                            Time.sleepTicks(lIIlIIIII[1]);
                            "".length();
                        }
                        if (llllIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[36]];
                            if (llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30]) && llllIIIIlII(NPCs.getNearest(npc -> {
                                if (llllIIIlIII(npc.getId(), lIIlIIIII[77]) && llllIIIlIIl(npc.getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                                    ?? r0 = lIIlIIIII[1];
                                    "".length();
                                    return ((114 ^ 14) ^ (118 ^ 14)) <= 0 ? ((234 ^ 174) ^ (8 ^ 74)) & (((((46 + 161) - 81) + 37) ^ (((70 + 88) - 8) + 15)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIIIII[0];
                            }))) {
                                NPCs.getNearest(npc2 -> {
                                    if (llllIIIlIII(npc2.getId(), lIIlIIIII[77]) && llllIIIlIIl(npc2.getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return (-" ".length()) >= "  ".length() ? ((((83 + 99) - 51) + 61) ^ (((5 + 112) - 48) + 91)) & (((((177 + 73) - 234) + 215) ^ (((63 + 125) - 113) + 60)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }).interact(lIIIlllll[lIIlIIIII[37]]);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        llllIIIIIII();
        lllIlllllll();
        mc = new WorldArea(lIIlIIIII[83], lIIlIIIII[84], lIIlIIIII[29], lIIlIIIII[39], lIIlIIIII[0]);
        bv = new ArrayList();
        md = new WorldPoint(lIIlIIIII[85], lIIlIIIII[86], lIIlIIIII[0]);
        me = new WorldPoint(lIIlIIIII[87], lIIlIIIII[88], lIIlIIIII[0]);
        int[] iArr = new int[lIIlIIIII[17]];
        iArr[lIIlIIIII[0]] = lIIlIIIII[89];
        iArr[lIIlIIIII[1]] = lIIlIIIII[90];
        iArr[lIIlIIIII[2]] = lIIlIIIII[91];
        iArr[lIIlIIIII[3]] = lIIlIIIII[92];
        iArr[lIIlIIIII[5]] = lIIlIIIII[93];
        iArr[lIIlIIIII[7]] = lIIlIIIII[94];
        iArr[lIIlIIIII[9]] = lIIlIIIII[95];
        iArr[lIIlIIIII[11]] = lIIlIIIII[96];
        iArr[lIIlIIIII[13]] = lIIlIIIII[97];
        iArr[lIIlIIIII[15]] = lIIlIIIII[98];
        iArr[lIIlIIIII[16]] = lIIlIIIII[99];
        mf = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ei() {
        String[] strArr = new String[lIIlIIIII[1]];
        strArr[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[57]];
        if (!llllIIIIIIl(Inventory.contains(strArr) ? 1 : 0) || (llllIIIIIll(Inventory.contains(C0005f.aO) ? 1 : 0) && !llllIIIIIIl(Equipment.contains(C0005f.aO) ? 1 : 0))) {
            return lIIlIIIII[0];
        }
        ?? r0 = lIIlIIIII[1];
        "".length();
        return "   ".length() == 0 ? ((((172 + 235) - 211) + 43) ^ (((172 + 28) - 178) + 162)) & (((((90 + 30) - 106) + 226) ^ (((1 + 145) - 118) + 139)) ^ (-" ".length())) : r0;
    }

    private static boolean llllIIIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ab() {
        String[] strArr = new String[lIIlIIIII[1]];
        strArr[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[58]];
        if (llllIIIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIlIIIII[1]];
            strArr2[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[59]];
            if (llllIIIIIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIIlIIIII[1]];
                strArr3[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[60]];
                if (llllIIIIIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIlIIIII[1]];
                    strArr4[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[61]];
                    if (llllIIIIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        String[] strArr5 = new String[lIIlIIIII[1]];
                        strArr5[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[62]];
                        if (llllIIIIIIl(Inventory.contains(strArr5) ? 1 : 0) && (!llllIIIIIll(Inventory.contains(C0005f.aO) ? 1 : 0) || llllIIIIIIl(Equipment.contains(C0005f.aO) ? 1 : 0))) {
                            ?? r0 = lIIlIIIII[1];
                            "".length();
                            return "  ".length() <= (-" ".length()) ? ((40 ^ 7) ^ (77 ^ 116)) & (((197 ^ 185) ^ (207 ^ 165)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return lIIlIIIII[0];
    }

    private static boolean llllIIIlIIl(int i, int i2) {
        return i <= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIlllll[lIIlIIIII[73]];
    }

    private static void llllIIIIIII() {
        lIIlIIIII = new int[101];
        lIIlIIIII[0] = ((((60 + 31) - (-30)) + 27) ^ (((107 + 110) - 80) + 27)) & (((71 ^ 19) ^ (220 ^ 184)) ^ (-" ".length()));
        lIIlIIIII[1] = " ".length();
        lIIlIIIII[2] = "  ".length();
        lIIlIIIII[3] = "   ".length();
        lIIlIIIII[4] = (-((-1545) & 11887)) & (-1025) & 16366;
        lIIlIIIII[5] = (((41 + 101) - 111) + 101) ^ (((113 + 61) - 137) + 91);
        lIIlIIIII[6] = (-2641) & 2943;
        lIIlIIIII[7] = 84 ^ 81;
        lIIlIIIII[8] = (-7885) & 8191;
        lIIlIIIII[9] = 54 ^ 48;
        lIIlIIIII[10] = (-((-4597) & 13821)) & (-23235) & 32767;
        lIIlIIIII[11] = 175 ^ 168;
        lIIlIIIII[12] = (-((-1) & 23749)) & (-2) & 24063;
        lIIlIIIII[13] = (((4 + 113) - 88) + 149) ^ (((163 + 57) - 87) + 53);
        lIIlIIIII[14] = (-((-8449) & 10183)) & (-14337) & 16383;
        lIIlIIIII[15] = (52 ^ 115) ^ (121 ^ 55);
        lIIlIIIII[16] = 80 ^ 90;
        lIIlIIIII[17] = (85 ^ 61) ^ (93 ^ 62);
        lIIlIIIII[18] = 4 ^ 8;
        lIIlIIIII[19] = 148 ^ 153;
        lIIlIIIII[20] = 155 ^ 149;
        lIIlIIIII[21] = (-((-1262) & 27887)) & (-275) & 126899;
        lIIlIIIII[22] = (((50 + 21) - 70) + 129) ^ (((132 + 111) - 132) + 30);
        lIIlIIIII[23] = (-6165) & 7164;
        lIIlIIIII[24] = (-24727) & 32734;
        lIIlIIIII[25] = 184 ^ 168;
        lIIlIIIII[26] = (101 ^ 86) ^ (98 ^ 64);
        lIIlIIIII[27] = (227 ^ 197) ^ (120 ^ 74);
        lIIlIIIII[28] = (28 ^ 91) ^ (219 ^ 142);
        lIIlIIIII[29] = 44 ^ 63;
        lIIlIIIII[30] = -" ".length();
        lIIlIIIII[31] = (-232) & 1775;
        lIIlIIIII[32] = 5 ^ 16;
        lIIlIIIII[33] = (93 ^ 45) ^ (213 ^ 179);
        lIIlIIIII[34] = 171 ^ 188;
        lIIlIIIII[35] = (59 ^ 112) ^ (90 ^ 9);
        lIIlIIIII[36] = (((154 + 58) - 117) + 121) ^ (((23 + 151) - 159) + 178);
        lIIlIIIII[37] = 64 ^ 90;
        lIIlIIIII[38] = (82 ^ 33) ^ (29 ^ 117);
        lIIlIIIII[39] = (((5 + 157) - 65) + 64) ^ (((99 + 21) - 60) + 129);
        lIIlIIIII[40] = 116 ^ 105;
        lIIlIIIII[41] = (((155 + 21) - 49) + 41) ^ (((176 + 68) - 204) + 142);
        lIIlIIIII[42] = 155 ^ 132;
        lIIlIIIII[43] = (110 ^ 57) ^ (196 ^ 179);
        lIIlIIIII[44] = (100 ^ 109) ^ (16 ^ 56);
        lIIlIIIII[45] = (((53 + 6) - 40) + 132) ^ (((97 + 154) - 96) + 26);
        lIIlIIIII[46] = 57 ^ 26;
        lIIlIIIII[47] = 109 ^ 73;
        lIIlIIIII[48] = (((14 + 40) - (-66)) + 23) ^ (((86 + 128) - 121) + 77);
        lIIlIIIII[49] = 126 ^ 88;
        lIIlIIIII[50] = (-9371) & 9691;
        lIIlIIIII[51] = (-17921) & 20455;
        lIIlIIIII[52] = (-21001) & 24573;
        lIIlIIIII[53] = (23 ^ 122) ^ (241 ^ 187);
        lIIlIIIII[54] = 39 ^ 15;
        lIIlIIIII[55] = 158 ^ 183;
        lIIlIIIII[56] = (24 ^ 9) ^ (92 ^ 103);
        lIIlIIIII[57] = (((127 + 124) - 223) + 105) ^ (((171 + 127) - 204) + 80);
        lIIlIIIII[58] = (148 ^ 166) ^ (185 ^ 167);
        lIIlIIIII[59] = 46 ^ 3;
        lIIlIIIII[60] = (((222 + 148) - 244) + 106) ^ (((128 + 172) - 129) + 27);
        lIIlIIIII[61] = (105 ^ 78) ^ (2 ^ 10);
        lIIlIIIII[62] = (90 ^ 34) ^ (196 ^ 140);
        lIIlIIIII[63] = (-((-13057) & 32663)) & (-2) & 28607;
        lIIlIIIII[64] = (-28353) & 28652;
        lIIlIIIII[65] = (-((-12373) & 15447)) & (-24585) & 28158;
        lIIlIIIII[66] = (-((-29065) & 32189)) & (-258) & 16381;
        lIIlIIIII[67] = (-((-2309) & 18791)) & (-8193) & 28527;
        lIIlIIIII[68] = (-((-895) & 21375)) & (-290) & 32749;
        lIIlIIIII[69] = (-(53 ^ 38)) & (-6725) & 31742;
        lIIlIIIII[70] = (-(((104 + 125) - 217) + 149)) & (-8209) & 16375;
        lIIlIIIII[71] = (-((-1836) & 32639)) & (-41) & 31743;
        lIIlIIIII[72] = 114 ^ 22;
        lIIlIIIII[73] = 177 ^ 128;
        lIIlIIIII[74] = 81 ^ 50;
        lIIlIIIII[75] = (222 ^ 192) ^ (49 ^ 29);
        lIIlIIIII[76] = 137 ^ 186;
        lIIlIIIII[77] = (-((-19137) & 23233)) & (-2585) & 8188;
        lIIlIIIII[78] = (198 ^ 174) ^ (46 ^ 114);
        lIIlIIIII[79] = 105 ^ 92;
        lIIlIIIII[80] = 3 ^ 53;
        lIIlIIIII[81] = (14 ^ 116) ^ (48 ^ 125);
        lIIlIIIII[82] = 64 ^ 120;
        lIIlIIIII[83] = (-13318) & 15823;
        lIIlIIIII[84] = (-((-5397) & 14111)) & (-4114) & 16383;
        lIIlIIIII[85] = (-((-10589) & 12159)) & (-16393) & 20479;
        lIIlIIIII[86] = (-20491) & 24062;
        lIIlIIIII[87] = (-((-26149) & 30271)) & (-25090) & 31743;
        lIIlIIIII[88] = (-21004) & 24415;
        lIIlIIIII[89] = (-16409) & 17919;
        lIIlIIIII[90] = (-16907) & 18427;
        lIIlIIIII[91] = (-513) & 2031;
        lIIlIIIII[92] = (-((-441) & 24057)) & (-8195) & 32127;
        lIIlIIIII[93] = (-((-647) & 1687)) & (-16393) & 17759;
        lIIlIIIII[94] = (-((-1281) & 16277)) & (-1057) & 16383;
        lIIlIIIII[95] = (-((-529) & 32437)) & (-515) & 32767;
        lIIlIIIII[96] = (-((-8299) & 32379)) & (-8225) & 32639;
        lIIlIIIII[97] = (-((-2049) & 6942)) & (-33) & 16255;
        lIIlIIIII[98] = (-17171) & 28502;
        lIIlIIIII[99] = (-(192 ^ 197)) & (-16540) & 27871;
        lIIlIIIII[100] = (15 ^ 123) ^ (91 ^ 22);
    }

    private static boolean llllIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llllIIIIlIl(int i) {
        return i > 0;
    }

    private static boolean llllIIIIlll(int i, int i2) {
        return i > i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        ef();
        return lIIlIIIII[72];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
        if (llllIIIIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aj.lIIlIIIII[1]) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eh() {
        if (llllIIIIIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[42]];
            C0001b.a(bv);
            if (llllIIIIIlI(bv.size(), lIIlIIIII[1])) {
                System.out.println(lIIIlllll[lIIlIIIII[43]]);
                bt = lIIlIIIII[0];
            }
        }
        if (llllIIIIIll(bt ? 1 : 0)) {
            if (llllIIIIIll(ei() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIIIIlII(nearest) && llllIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[44]];
                    C0000a.a(nearest);
                }
                if (llllIIIIlII(nearest) && llllIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[45]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIII[4]);
                        "".length();
                    }
                    if (llllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[46]];
                        if (llllIIIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIII[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIIII[1]];
                        iArr[lIIlIIIII[0]] = lIIlIIIII[6];
                        if (llllIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lIIlIIIII[1]];
                            strArr[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[47]];
                        }
                        if (!llllIIIIIll(Bank.contains(C0005f.aO) ? 1 : 0) || !llllIIIIIll(Inventory.contains(C0005f.aO) ? 1 : 0) || !llllIIIIIll(Equipment.contains(C0005f.aO) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIlIIIII[1]];
                            iArr2[lIIlIIIII[0]] = lIIlIIIII[6];
                            if (llllIIIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllll[lIIlIIIII[49]], lIIlIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr2 = new String[lIIlIIIII[1]];
                                    strArr2[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[76]];
                                    if (llllIIIIlIl(Inventory.getCount(strArr2))) {
                                        ?? r0 = lIIlIIIII[1];
                                        "".length();
                                        return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIIIII[0];
                                }, lIIlIIIII[4]);
                                "".length();
                            }
                            if (llllIIIIIIl(Bank.contains(C0005f.aO) ? 1 : 0)) {
                                C0000a.b(C0005f.aO, lIIlIIIII[1]);
                            }
                        }
                        af();
                        System.out.println(lIIIlllll[lIIlIIIII[48]]);
                        bt = lIIlIIIII[1];
                        return;
                    }
                }
            }
            if (llllIIIIIIl(ei() ? 1 : 0)) {
                if (llllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIIIII[1]];
                    iArr3[lIIlIIIII[0]] = lIIlIIIII[50];
                    if (llllIIIIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIlIIIII[51], lIIlIIIII[52], lIIlIIIII[0]);
                        if (llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIII[9])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[53]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIlIIIII[1]);
                            "".length();
                        }
                        if (llllIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIII[13])) {
                            if (llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                            }
                            if (llllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                Bank.depositInventory();
                                Time.sleepTicks(lIIlIIIII[2]);
                                "".length();
                                C0000a.a(lIIlIIIII[6], lIIlIIIII[1]);
                            }
                        }
                    }
                }
                if (llllIIIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(md), lIIlIIIII[7])) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[54]];
                        if (llllIIIIIIl(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aO).interact(lIIIlllll[lIIlIIIII[55]]);
                        }
                        Movement.walkTo(md);
                        "".length();
                        Time.sleepTicks(lIIlIIIII[1]);
                        "".length();
                    }
                    if (llllIIIIIIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[56]];
                        if (llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
                            int[] iArr4 = new int[lIIlIIIII[1]];
                            iArr4[lIIlIIIII[0]] = lIIlIIIII[31];
                            if (llllIIIIlII(NPCs.getNearest(iArr4))) {
                                int[] iArr5 = new int[lIIlIIIII[1]];
                                iArr5[lIIlIIIII[0]] = lIIlIIIII[31];
                                NPCs.getNearest(iArr5).interact(lIIlIIIII[0]);
                                Time.sleepTicks(lIIlIIIII[7]);
                                "".length();
                            }
                        }
                    }
                }
                if (llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr6 = new int[lIIlIIIII[1]];
                    iArr6[lIIlIIIII[0]] = lIIlIIIII[50];
                    if (llllIIIIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIIIII[1]];
                        iArr7[lIIlIIIII[0]] = lIIlIIIII[50];
                        Inventory.getAll(iArr7).stream().forEach((v0) -> {
                            v0.drop();
                        });
                    }
                }
            }
        }
    }

    private static String lllIlllIIII(String lIIIlIlIllIllII, String lIIIlIlIllIlIll) {
        try {
            SecretKeySpec lIIIlIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIlIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIII[2], lIIIlIlIllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIlIllIllIl) {
            lIIIlIlIllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIll(int i) {
        return i == 0;
    }

    private static String lllIllIllll(String lIIIlIlIlIlllll, String lIIIlIlIlIllllI) {
        try {
            SecretKeySpec lIIIlIlIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIlIlIllllI.getBytes(StandardCharsets.UTF_8)), lIIlIIIII[13]), "DES");
            Cipher lIIIlIlIllIIIIl = Cipher.getInstance("DES");
            lIIIlIlIllIIIIl.init(lIIlIIIII[2], lIIIlIlIllIIIlI);
            return new String(lIIIlIlIllIIIIl.doFinal(Base64.getDecoder().decode(lIIIlIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIlIllIIIII) {
            lIIIlIlIllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIlIII(int i, int i2) {
        return i == i2;
    }

    public static void eg() {
        if (llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[38]];
            System.out.println(lIIIlllll[lIIlIIIII[39]]);
            Inventory.getAll(mf).stream().forEach((v0) -> {
                v0.drop();
            });
        }
        if (llllIIIIIll(Inventory.isFull() ? 1 : 0) && llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
            String[] strArr = new String[lIIlIIIII[1]];
            strArr[lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[40]];
            NPCs.getNearest(strArr).interact(lIIIlllll[lIIlIIIII[41]]);
            Time.sleepTicks(lIIlIIIII[2]);
            "".length();
        }
    }

    private static String lllIlllIIIl(String lIIIlIlIlIIllll, String lIIIlIlIlIIlllI) {
        String str = new String(Base64.getDecoder().decode(lIIIlIlIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIlIlIlIIlllI.toCharArray();
        int lIIIlIlIlIIlIll = lIIlIIIII[0];
        char[] charArray2 = str.toCharArray();
        int lIIIlIlIlIIIlII = charArray2.length;
        int i = lIIlIIIII[0];
        while (llllIIIIIlI(i, lIIIlIlIlIIIlII)) {
            char lIIIlIlIlIlIIII = charArray2[i];
            sb.append((char) (lIIIlIlIlIlIIII ^ charArray[lIIIlIlIlIIlIll % charArray.length]));
            "".length();
            lIIIlIlIlIIlIll++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llllIIIIllI(Skills.getLevel(Skill.FISHING), lIIlIIIII[74])) {
            ?? r0 = lIIlIIIII[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIII[0];
    }
}
