package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.v  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/v.class */
public class v implements F {
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ boolean bz;
    static /* synthetic */ String[] bX;
    static /* synthetic */ WorldPoint dc;
    private static /* synthetic */ String[] llIlllll;
    static /* synthetic */ int dg;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ WorldPoint dd;
    private static /* synthetic */ int[] lllIIIII;
    static /* synthetic */ int ci;
    static /* synthetic */ WorldPoint df;
    static /* synthetic */ boolean cj;

    static {
        lIlllIIIlIl();
        lIlllIIIlII();
        bB = new ArrayList();
        dc = new WorldPoint(lllIIIII[68], lllIIIII[69], lllIIIII[6]);
        dd = new WorldPoint(lllIIIII[70], lllIIIII[71], lllIIIII[6]);
        de = new WorldPoint(lllIIIII[72], lllIIIII[73], lllIIIII[6]);
        df = new WorldPoint(lllIIIII[74], lllIIIII[75], lllIIIII[6]);
        String[] strArr = new String[lllIIIII[1]];
        strArr[lllIIIII[6]] = llIlllll[lllIIIII[76]];
        strArr[lllIIIII[5]] = llIlllll[lllIIIII[42]];
        strArr[lllIIIII[8]] = llIlllll[lllIIIII[77]];
        bX = strArr;
        dg = lllIIIII[78];
    }

    private static boolean lIlllIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIlllIIIlII() {
        llIlllll = new String[lllIIIII[79]];
        llIlllll[lllIIIII[6]] = lIllIllllll("6p01EPor2QSnHgRaoWxWVaDn4mc+p3LYe/52DYJfN+Cai1k4wc5fHGL/L4mdzyHw", "JBoEj");
        llIlllll[lllIIIII[5]] = lIlllIIIIII("IQM9Yg4AQikjFAQ=", "obKBz");
        llIlllll[lllIIIII[8]] = lIllIllllll("VnKcORiR1WosVEyYARs4DQtyA5UySioG", "VuSee");
        llIlllll[lllIIIII[1]] = lIllIllllll("z0CZ/Wlv4PdLJKBBWZfcbjWs2HFC1Te5tBpQSB2kMsTcRJN+DTNdO/JpGS/JLrm8GT0PfHT1Mok=", "PiRSR");
        llIlllll[lllIIIII[9]] = lIllIllllll("xtU7NjkescoefrKaUq/wxKUADqztB01sGRC17Fh9H7rfHvDMOlu/+Zwp4cY2gvLbBUEJwezLBjo=", "uQpWY");
        llIlllll[lllIIIII[3]] = lIlllIIIIII("DR8+IAM=", "ImWNh");
        llIlllll[lllIIIII[18]] = lIllIllllll("cJtSVNtGB0k=", "wplzE");
        llIlllll[lllIIIII[20]] = lIlllIIIIlI("Jmbk1kEgZaVwsb3aLA1M1A==", "LYIPQ");
        llIlllll[lllIIIII[21]] = lIlllIIIIII("MQgAOg==", "pziIo");
        llIlllll[lllIIIII[23]] = lIlllIIIIII("PRIsJSs=", "yeMWM");
        llIlllll[lllIIIII[4]] = lIlllIIIIlI("RfErl0YIPO0=", "qUFkL");
        llIlllll[lllIIIII[2]] = lIlllIIIIII("OxkmbDgaWDYtIBkBcDw5Fw==", "uxPLL");
        llIlllll[lllIIIII[29]] = lIlllIIIIlI("eLflbuYrcTrJdmugdb+Z2w==", "zowfS");
        llIlllll[lllIIIII[30]] = lIlllIIIIlI("Kcpz8ZaHHCs=", "AyvJd");
        llIlllll[lllIIIII[31]] = lIllIllllll("Ybu/9Aun3FrrQq5+QdwnRk8iYqHh0ObV", "TjHNh");
        llIlllll[lllIIIII[32]] = lIllIllllll("+gWQkN4ODjy775PzAEI70g==", "JEcCT");
        llIlllll[lllIIIII[33]] = lIlllIIIIII("FTZSCTUweDYROCY+", "TXrfY");
        llIlllll[lllIIIII[36]] = lIlllIIIIlI("b7voJPsk7zXBuG8Ro/LLv5Ruw422al4K", "YnBmp");
        llIlllll[lllIIIII[37]] = lIllIllllll("+1dKdjfdk8aMJjEPvxvakQ==", "ULNgb");
        llIlllll[lllIIIII[38]] = lIlllIIIIlI("g5JtYO18OJ4ZxyqHVq+ToA==", "Bxwzk");
        llIlllll[lllIIIII[34]] = lIlllIIIIII("PhUhNCU=", "lzIUN");
        llIlllll[lllIIIII[39]] = lIlllIIIIlI("OnJW8F++KNIkwjSkUwSbWQ==", "xAOFJ");
        llIlllll[lllIIIII[40]] = lIlllIIIIII("MRYRICk=", "cyyAB");
        llIlllll[lllIIIII[43]] = lIlllIIIIII("KTkpCisEeCQGJhU=", "aXGnG");
        llIlllll[lllIIIII[44]] = lIlllIIIIII("KyYJNiE=", "yIaWJ");
        llIlllll[lllIIIII[45]] = lIlllIIIIII("IScjFg==", "vBBdF");
        llIlllll[lllIIIII[47]] = lIllIllllll("m/FBVwAlCU8=", "XlKdW");
        llIlllll[lllIIIII[48]] = lIllIllllll("hsl+nNo87YY=", "FARUY");
        llIlllll[lllIIIII[49]] = lIlllIIIIII("LzgsRRYOeTMGBwcwPwsG", "aYZeb");
        llIlllll[lllIIIII[50]] = lIlllIIIIII("JzMCNhYNZx80EAAuEzkR", "fGvWu");
        llIlllll[lllIIIII[41]] = lIlllIIIIII("JjoHESMKNwY=", "oYbwJ");
        llIlllll[lllIIIII[51]] = lIlllIIIIlI("awcN9n9nIyE=", "TQjAX");
        llIlllll[lllIIIII[55]] = lIllIllllll("iG2P85ZoCZs=", "JnJrL");
        llIlllll[lllIIIII[56]] = lIllIllllll("7LGp7q+ECXDGWmCS9Z0j1w==", "lPvIs");
        llIlllll[lllIIIII[57]] = lIlllIIIIII("BSAQBg==", "DRyuJ");
        llIlllll[lllIIIII[58]] = lIllIllllll("zir62d9+ta4HXHuJnMX24w==", "BROko");
        llIlllll[lllIIIII[59]] = lIlllIIIIII("DSYTKCk=", "IQrZO");
        llIlllll[lllIIIII[66]] = lIlllIIIIlI("s86ORbSYd6q4gAOobA+CUQ==", "mvTth");
        llIlllll[lllIIIII[67]] = lIlllIIIIlI("6ZGRaDFLgpxBIyMONu65Uptp2VXXHWAr", "DEvzZ");
        llIlllll[lllIIIII[76]] = lIllIllllll("wuPai4VKFUE=", "hSfEw");
        llIlllll[lllIIIII[42]] = lIlllIIIIII("PDkwPXEIMD9pKAQkcT00Bz1xJDRLMDMmJB9xNT4wGSc0OnEKPzVpMAc0bg==", "kQQIQ");
        llIlllll[lllIIIII[77]] = lIllIllllll("42gycZ4Hy2ywnFLwbO6I2Y7G+qIanzAaYJhkY4Mnnbmi4sjQKWsNt6FfOk/tYFS5XIq3vc8GHlk=", "KHKvr");
    }

    private static boolean lIlllIIlIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0176, code lost:
        if (lIlllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x031e, code lost:
        if (lIlllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a9, code lost:
        if (lIlllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[4]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (lIlllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[3]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11 = new int[lllIIIII[5]];
        iArr11[lllIIIII[6]] = lllIIIII[11];
        if (lIlllIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lllIIIII[5]];
            iArr12[lllIIIII[6]] = lllIIIII[11];
            if (lIlllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lllIIIII[5]];
                iArr13[lllIIIII[6]] = lllIIIII[11];
            }
            iArr = new int[lllIIIII[5]];
            iArr[lllIIIII[6]] = lllIIIII[25];
            if (lIlllIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIII[25], lllIIIII[5], lllIIIII[60]));
                "".length();
            }
            iArr2 = new int[lllIIIII[5]];
            iArr2[lllIIIII[6]] = lllIIIII[22];
            if (lIlllIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIII[22], lllIIIII[5], lllIIIII[60]));
                "".length();
            }
            iArr3 = new int[lllIIIII[5]];
            iArr3[lllIIIII[6]] = lllIIIII[10];
            if (lIlllIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr14 = new int[lllIIIII[5]];
                iArr14[lllIIIII[6]] = lllIIIII[10];
                if (lIlllIIlIIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIIIII[5]];
                    iArr15[lllIIIII[6]] = lllIIIII[10];
                }
                iArr4 = new int[lllIIIII[5]];
                iArr4[lllIIIII[6]] = lllIIIII[19];
                if (lIlllIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIII[19], lllIIIII[5], lllIIIII[60]));
                    "".length();
                }
                iArr5 = new int[lllIIIII[5]];
                iArr5[lllIIIII[6]] = lllIIIII[17];
                if (lIlllIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIII[17], lllIIIII[5], lllIIIII[60]));
                    "".length();
                }
                iArr6 = new int[lllIIIII[5]];
                iArr6[lllIIIII[6]] = lllIIIII[15];
                if (lIlllIIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIII[15], lllIIIII[5], lllIIIII[60]));
                    "".length();
                }
                iArr7 = new int[lllIIIII[5]];
                iArr7[lllIIIII[6]] = lllIIIII[16];
                if (lIlllIIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIII[16], lllIIIII[5], lllIIIII[60]));
                    "".length();
                }
                iArr8 = new int[lllIIIII[5]];
                iArr8[lllIIIII[6]] = lllIIIII[14];
                if (lIlllIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr16 = new int[lllIIIII[5]];
                    iArr16[lllIIIII[6]] = lllIIIII[14];
                    if (lIlllIIlIIl(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lllIIIII[5]];
                        iArr17[lllIIIII[6]] = lllIIIII[14];
                    }
                    iArr9 = new int[lllIIIII[5]];
                    iArr9[lllIIIII[6]] = lllIIIII[12];
                    if (lIlllIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr18 = new int[lllIIIII[5]];
                        iArr18[lllIIIII[6]] = lllIIIII[12];
                        if (lIlllIIlIIl(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lllIIIII[5]];
                            iArr19[lllIIIII[6]] = lllIIIII[12];
                        }
                        if (lIlllIIlIlI(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(llIlllll[lllIIIII[67]]);
                        }) ? 1 : 0)) {
                            bB.add(new C0003d(lllIIIII[63], lllIIIII[3], lllIIIII[64]));
                            "".length();
                        }
                        iArr10 = new int[lllIIIII[5]];
                        iArr10[lllIIIII[6]] = lllIIIII[13];
                        if (lIlllIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
                            bB.add(new C0003d(lllIIIII[13], lllIIIII[42], lllIIIII[62]));
                            "".length();
                            return;
                        }
                        return;
                    }
                    bB.add(new C0003d(lllIIIII[12], lllIIIII[4], lllIIIII[62]));
                    "".length();
                    if (lIlllIIlIlI(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(llIlllll[lllIIIII[67]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[lllIIIII[5]];
                    iArr10[lllIIIII[6]] = lllIIIII[13];
                    if (lIlllIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bB.add(new C0003d(lllIIIII[14], lllIIIII[4], lllIIIII[62]));
                "".length();
                iArr9 = new int[lllIIIII[5]];
                iArr9[lllIIIII[6]] = lllIIIII[12];
                if (lIlllIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bB.add(new C0003d(lllIIIII[12], lllIIIII[4], lllIIIII[62]));
                "".length();
                if (lIlllIIlIlI(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(llIlllll[lllIIIII[67]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[lllIIIII[5]];
                iArr10[lllIIIII[6]] = lllIIIII[13];
                if (lIlllIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bB.add(new C0003d(lllIIIII[10], lllIIIII[9], lllIIIII[61]));
            "".length();
            iArr4 = new int[lllIIIII[5]];
            iArr4[lllIIIII[6]] = lllIIIII[19];
            if (lIlllIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lllIIIII[5]];
            iArr5[lllIIIII[6]] = lllIIIII[17];
            if (lIlllIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lllIIIII[5]];
            iArr6[lllIIIII[6]] = lllIIIII[15];
            if (lIlllIIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lllIIIII[5]];
            iArr7[lllIIIII[6]] = lllIIIII[16];
            if (lIlllIIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lllIIIII[5]];
            iArr8[lllIIIII[6]] = lllIIIII[14];
            if (lIlllIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bB.add(new C0003d(lllIIIII[14], lllIIIII[4], lllIIIII[62]));
            "".length();
            iArr9 = new int[lllIIIII[5]];
            iArr9[lllIIIII[6]] = lllIIIII[12];
            if (lIlllIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bB.add(new C0003d(lllIIIII[12], lllIIIII[4], lllIIIII[62]));
            "".length();
            if (lIlllIIlIlI(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(llIlllll[lllIIIII[67]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[lllIIIII[5]];
            iArr10[lllIIIII[6]] = lllIIIII[13];
            if (lIlllIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bB.add(new C0003d(lllIIIII[11], lllIIIII[3], C0008i.bw));
        "".length();
        iArr = new int[lllIIIII[5]];
        iArr[lllIIIII[6]] = lllIIIII[25];
        if (lIlllIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lllIIIII[5]];
        iArr2[lllIIIII[6]] = lllIIIII[22];
        if (lIlllIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lllIIIII[5]];
        iArr3[lllIIIII[6]] = lllIIIII[10];
        if (lIlllIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bB.add(new C0003d(lllIIIII[10], lllIIIII[9], lllIIIII[61]));
        "".length();
        iArr4 = new int[lllIIIII[5]];
        iArr4[lllIIIII[6]] = lllIIIII[19];
        if (lIlllIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lllIIIII[5]];
        iArr5[lllIIIII[6]] = lllIIIII[17];
        if (lIlllIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lllIIIII[5]];
        iArr6[lllIIIII[6]] = lllIIIII[15];
        if (lIlllIIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lllIIIII[5]];
        iArr7[lllIIIII[6]] = lllIIIII[16];
        if (lIlllIIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lllIIIII[5]];
        iArr8[lllIIIII[6]] = lllIIIII[14];
        if (lIlllIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bB.add(new C0003d(lllIIIII[14], lllIIIII[4], lllIIIII[62]));
        "".length();
        iArr9 = new int[lllIIIII[5]];
        iArr9[lllIIIII[6]] = lllIIIII[12];
        if (lIlllIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bB.add(new C0003d(lllIIIII[12], lllIIIII[4], lllIIIII[62]));
        "".length();
        if (lIlllIIlIlI(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(llIlllll[lllIIIII[67]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[lllIIIII[5]];
        iArr10[lllIIIII[6]] = lllIIIII[13];
        if (lIlllIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            bd();
            "".length();
            if ((-"   ".length()) > 0) {
                return (26 ^ 1) & ((85 ^ 78) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIIIII[65];
    }

    private static void lIlllIIIlIl() {
        lllIIIII = new int[80];
        lllIIIII[0] = (-(179 ^ 185)) & (-28945) & 29631;
        lllIIIII[1] = "   ".length();
        lllIIIII[2] = 87 ^ 92;
        lllIIIII[3] = 117 ^ 112;
        lllIIIII[4] = (182 ^ 148) ^ (9 ^ 33);
        lllIIIII[5] = " ".length();
        lllIIIII[6] = (27 ^ 42) & ((43 ^ 26) ^ (-1));
        lllIIIII[7] = (-((-4893) & 31583)) & (-1046) & 32735;
        lllIIIII[8] = "  ".length();
        lllIIIII[9] = (208 ^ 192) ^ (84 ^ 64);
        lllIIIII[10] = (-((-20537) & 22717)) & (-20481) & 24565;
        lllIIIII[11] = (-((-16769) & 19375)) & (-1) & 15231;
        lllIIIII[12] = (-(245 ^ 198)) & (-24705) & 32763;
        lllIIIII[13] = (-((-9135) & 25535)) & (-137) & 24543;
        lllIIIII[14] = (-((-10505) & 27067)) & (-8198) & 32767;
        lllIIIII[15] = (-((-12743) & 29143)) & (-12353) & 30679;
        lllIIIII[16] = (-((-141) & 14525)) & (-1) & 16317;
        lllIIIII[17] = (-((-19229) & 31613)) & (-16390) & 30717;
        lllIIIII[18] = 40 ^ 46;
        lllIIIII[19] = (-24623) & 26543;
        lllIIIII[20] = 52 ^ 51;
        lllIIIII[21] = 24 ^ 16;
        lllIIIII[22] = (-21185) & 22243;
        lllIIIII[23] = (228 ^ 195) ^ (21 ^ 59);
        lllIIIII[24] = (-((-337) & 31569)) & (-1) & 31611;
        lllIIIII[25] = (-((-16401) & 22745)) & (-16897) & 24571;
        lllIIIII[26] = (-12293) & 13287;
        lllIIIII[27] = 81 ^ 99;
        lllIIIII[28] = (-12429) & 14319;
        lllIIIII[29] = 164 ^ 168;
        lllIIIII[30] = 65 ^ 76;
        lllIIIII[31] = (47 ^ 87) ^ (100 ^ 18);
        lllIIIII[32] = (((110 + 159) - 217) + 131) ^ (((2 + 85) - (-82)) + 15);
        lllIIIII[33] = 50 ^ 34;
        lllIIIII[34] = (((11 + 66) - 75) + 126) ^ (((146 + 64) - 132) + 70);
        lllIIIII[35] = (-14401) & 16383;
        lllIIIII[36] = (183 ^ 192) ^ (104 ^ 14);
        lllIIIII[37] = 104 ^ 122;
        lllIIIII[38] = (208 ^ 197) ^ (121 ^ 127);
        lllIIIII[39] = (227 ^ 175) ^ (37 ^ 124);
        lllIIIII[40] = 103 ^ 113;
        lllIIIII[41] = (110 ^ 89) ^ (189 ^ 148);
        lllIIIII[42] = 180 ^ 156;
        lllIIIII[43] = 76 ^ 91;
        lllIIIII[44] = (((19 + 24) - (-25)) + 73) ^ (((58 + 8) - 51) + 134);
        lllIIIII[45] = (((125 + 13) - 84) + 80) ^ (((13 + 7) - (-71)) + 68);
        lllIIIII[46] = (-643) & 8151;
        lllIIIII[47] = (((153 + 138) - 284) + 161) ^ (((137 + 90) - 93) + 44);
        lllIIIII[48] = 76 ^ 87;
        lllIIIII[49] = 113 ^ 109;
        lllIIIII[50] = (234 ^ 155) ^ (215 ^ 187);
        lllIIIII[51] = 78 ^ 81;
        lllIIIII[52] = (-((-4697) & 21241)) & (-8713) & 32766;
        lllIIIII[53] = (-((-261) & 17174)) & (-12329) & 32447;
        lllIIIII[54] = (-4761) & 8184;
        lllIIIII[55] = 21 ^ 53;
        lllIIIII[56] = 33 ^ 0;
        lllIIIII[57] = ((239 ^ 166) & ((76 ^ 5) ^ (-1))) ^ (119 ^ 85);
        lllIIIII[58] = (105 ^ 13) ^ (41 ^ 110);
        lllIIIII[59] = (((60 + 108) - 146) + 128) ^ (((131 + 125) - 215) + 137);
        lllIIIII[60] = (-((-4922) & 7999)) & (-65) & 12141;
        lllIIIII[61] = (-4176) & 8175;
        lllIIIII[62] = (-20482) & 22381;
        lllIIIII[63] = (-20786) & 32765;
        lllIIIII[64] = (-3670) & 28669;
        lllIIIII[65] = (((101 + 131) - 140) + 72) ^ (((84 + 47) - 59) + 120);
        lllIIIII[66] = ((88 ^ 109) & ((8 ^ 61) ^ (-1))) ^ (146 ^ 183);
        lllIIIII[67] = (((145 + 1) - 0) + 26) ^ (((53 + 125) - 151) + 111);
        lllIIIII[68] = (-((-27267) & 31643)) & (-16481) & 24063;
        lllIIIII[69] = (-17186) & 20407;
        lllIIIII[70] = (-20579) & 23535;
        lllIIIII[71] = (-((-19747) & 28643)) & (-16402) & 28669;
        lllIIIII[72] = (-21645) & 24509;
        lllIIIII[73] = (-(39 ^ 76)) & (-6145) & 16127;
        lllIIIII[74] = (-9257) & 12265;
        lllIIIII[75] = (-28783) & 32255;
        lllIIIII[76] = (69 ^ 60) ^ (78 ^ 16);
        lllIIIII[77] = (((126 + 103) - 174) + 106) ^ (((109 + 3) - 56) + 80);
        lllIIIII[78] = (-27971) & 28651;
        lllIIIII[79] = (251 ^ 155) ^ (215 ^ 157);
    }

    private static String lIlllIIIIII(String lIlIIIllIlllIlI, String lIlIIIllIlllllI) {
        String lIlIIIllIlllIlI2 = new String(Base64.getDecoder().decode(lIlIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIllIllllIl = new StringBuilder();
        char[] charArray = lIlIIIllIlllllI.toCharArray();
        int lIlIIIllIlllIll = lllIIIII[6];
        char[] charArray2 = lIlIIIllIlllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIII[6];
        while (lIlllIIIllI(i, length)) {
            char lIlIIIllIllIIlI = charArray2[i];
            lIlIIIllIllllIl.append((char) (lIlIIIllIllIIlI ^ charArray[lIlIIIllIlllIll % charArray.length]));
            "".length();
            lIlIIIllIlllIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIlIIIllIllllIl);
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIlllll[lllIIIII[66]];
    }

    private static String lIllIllllll(String lIlIIIllIIlllIl, String lIlIIIllIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), lllIIIII[21]), "DES");
            Cipher lIlIIIllIIlllll = Cipher.getInstance("DES");
            lIlIIIllIIlllll.init(lllIIIII[8], secretKeySpec);
            return new String(lIlIIIllIIlllll.doFinal(Base64.getDecoder().decode(lIlIIIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIllIIllllI) {
            lIlIIIllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIIIII[6];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        int[] iArr = new int[lllIIIII[5]];
        iArr[lllIIIII[6]] = lllIIIII[25];
        if (lIlllIIllII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lllIIIII[5]];
            iArr2[lllIIIII[6]] = lllIIIII[16];
            if (lIlllIIllII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lllIIIII[5]];
                iArr3[lllIIIII[6]] = lllIIIII[17];
                if (lIlllIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lllIIIII[5]];
                    iArr4[lllIIIII[6]] = lllIIIII[19];
                    if (lIlllIIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIIIII[5]];
                        iArr5[lllIIIII[6]] = lllIIIII[10];
                        if (lIlllIIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIIIII[5]];
                            iArr6[lllIIIII[6]] = lllIIIII[22];
                            if (lIlllIIlIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lllIIIII[5]];
                                iArr7[lllIIIII[6]] = lllIIIII[26];
                                if (lIlllIIlIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                    ?? r0 = lllIIIII[5];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lllIIIII[6];
    }

    private static boolean lIlllIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlllIIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllIlIIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b3a, code lost:
        if (lIlllIIlIll(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b52, code lost:
        if (lIlllIlIIII(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[41]) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b55, code lost:
        gg.squire.account.AccBuilderBarrows.c = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.llIlllll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[56]];
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.w.bg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b65, code lost:
        r0 = new java.lang.String[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5]];
        r0[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[6]] = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.llIlllll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[57]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b85, code lost:
        if (lIlllIIlIll(net.unethicalite.api.entities.NPCs.getNearest(r0)) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0b8e, code lost:
        if (lIlllIIlIlI(net.unethicalite.api.widgets.Dialog.isOpen() ? 1 : 0) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b91, code lost:
        gg.squire.account.AccBuilderBarrows.c = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.llIlllll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[58]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0ba9, code lost:
        if (lIlllIIIllI(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.ci, p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5]) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0bac, code lost:
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.Q.kZ += p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5];
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.Q.o(gg.squire.account.AccBuilderBarrows.m);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.ci += p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5];
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.Q.kZ = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[6];
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.cj = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bdc, code lost:
        r0 = new int[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5]];
        r0[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[6]] = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[52];
        r0 = net.unethicalite.api.items.Inventory.getFirst(r0);
        r1 = new java.lang.String[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5]];
        r1[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[6]] = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.llIlllll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[59]];
        r0.useOn(net.unethicalite.api.entities.TileObjects.getNearest(r1));
        net.unethicalite.api.commons.Time.sleepTicks(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c23, code lost:
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0006g.a(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.bX);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c29, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d9, code lost:
        if (lIlllIIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021d, code lost:
        if (lIlllIIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[3]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0261, code lost:
        if (lIlllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[4]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0264, code lost:
        ag();
        java.lang.System.out.println(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.llIlllll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[1]]);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.bz = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.v.lllIIIII[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027e, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v414, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v442, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bd() {
        if (lIlllIIIllI(C0004e.j(lllIIIII[0]), lllIIIII[1])) {
            w.bf();
        }
        if (lIlllIIIlll(C0004e.j(lllIIIII[0]), lllIIIII[1]) && lIlllIIIllI(C0004e.j(lllIIIII[2]), lllIIIII[3])) {
            s.aI();
        }
        if (!lIlllIIIlll(Skills.getLevel(Skill.COOKING), lllIIIII[4]) || !lIlllIIIlll(C0004e.j(lllIIIII[0]), lllIIIII[1]) || !lIlllIIlIII(C0004e.j(lllIIIII[2]), lllIIIII[3])) {
            return;
        }
        if (lIlllIIlIIl(bz ? 1 : 0)) {
            C0001b.a(bB);
            if (lIlllIIIllI(bB.size(), lllIIIII[5])) {
                System.out.println(llIlllll[lllIIIII[6]]);
                bz = lllIIIII[6];
            }
        }
        if (!lIlllIIlIlI(bz ? 1 : 0)) {
            return;
        }
        if (lIlllIIlIlI(ac() ? 1 : 0) && lIlllIIlIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIlllIIlIll(nearest) && lIlllIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlllll[lllIIIII[5]];
                C0000a.a(nearest);
            }
            if (lIlllIIlIll(nearest) && lIlllIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lllIIIII[7]);
                    "".length();
                }
                if (lIlllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[8]];
                    if (lIlllIIllII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIIIII[9]);
                        "".length();
                    }
                    if (lIlllIIllII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lllIIIII[8]);
                        "".length();
                    }
                    int[] iArr = new int[lllIIIII[5]];
                    iArr[lllIIIII[6]] = lllIIIII[10];
                    if (lIlllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lllIIIII[5]];
                        iArr2[lllIIIII[6]] = lllIIIII[10];
                    }
                    int[] iArr3 = new int[lllIIIII[5]];
                    iArr3[lllIIIII[6]] = lllIIIII[11];
                    if (lIlllIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIIII[5]];
                        iArr4[lllIIIII[6]] = lllIIIII[11];
                    }
                    int[] iArr5 = new int[lllIIIII[5]];
                    iArr5[lllIIIII[6]] = lllIIIII[12];
                    if (lIlllIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllIIIII[5]];
                        iArr6[lllIIIII[6]] = lllIIIII[12];
                    }
                    int[] iArr7 = new int[lllIIIII[2]];
                    iArr7[lllIIIII[6]] = lllIIIII[13];
                    iArr7[lllIIIII[5]] = lllIIIII[14];
                    iArr7[lllIIIII[8]] = lllIIIII[12];
                    iArr7[lllIIIII[1]] = lllIIIII[15];
                    iArr7[lllIIIII[9]] = lllIIIII[16];
                    iArr7[lllIIIII[3]] = lllIIIII[17];
                    iArr7[lllIIIII[18]] = lllIIIII[19];
                    iArr7[lllIIIII[20]] = lllIIIII[10];
                    iArr7[lllIIIII[21]] = lllIIIII[22];
                    iArr7[lllIIIII[23]] = lllIIIII[24];
                    iArr7[lllIIIII[4]] = lllIIIII[25];
                    if (lIlllIIlIlI(C0004e.b(iArr7) ? 1 : 0)) {
                        ag();
                        System.out.println(llIlllll[lllIIIII[9]]);
                        bz = lllIIIII[5];
                        return;
                    }
                    int[] iArr8 = new int[lllIIIII[2]];
                    iArr8[lllIIIII[6]] = lllIIIII[13];
                    iArr8[lllIIIII[5]] = lllIIIII[14];
                    iArr8[lllIIIII[8]] = lllIIIII[12];
                    iArr8[lllIIIII[1]] = lllIIIII[15];
                    iArr8[lllIIIII[9]] = lllIIIII[16];
                    iArr8[lllIIIII[3]] = lllIIIII[17];
                    iArr8[lllIIIII[18]] = lllIIIII[19];
                    iArr8[lllIIIII[20]] = lllIIIII[10];
                    iArr8[lllIIIII[21]] = lllIIIII[22];
                    iArr8[lllIIIII[23]] = lllIIIII[24];
                    iArr8[lllIIIII[4]] = lllIIIII[25];
                    if (lIlllIIlIIl(C0004e.b(iArr8) ? 1 : 0)) {
                        C0000a.a(lllIIIII[13], lllIIIII[4]);
                        C0000a.a(lllIIIII[14], lllIIIII[4]);
                        C0000a.a(lllIIIII[12], lllIIIII[4]);
                        C0000a.a(lllIIIII[15], lllIIIII[5]);
                        C0000a.a(lllIIIII[16], lllIIIII[5]);
                        C0000a.a(lllIIIII[17], lllIIIII[5]);
                        C0000a.a(lllIIIII[19], lllIIIII[5]);
                        C0000a.a(lllIIIII[10], lllIIIII[9]);
                        C0000a.a(lllIIIII[22], lllIIIII[5]);
                        C0000a.a(lllIIIII[25], lllIIIII[5]);
                        C0000a.a(lllIIIII[24], lllIIIII[3]);
                        C0000a.a(lllIIIII[11], lllIIIII[8]);
                        C0000a.a(lllIIIII[26], lllIIIII[7]);
                    }
                }
            }
        }
        if (lIlllIIlIIl(Inventory.contains(C0005f.bb) ? 1 : 0) && lIlllIIIllI(Movement.getRunEnergy(), lllIIIII[27])) {
            Inventory.getFirst(C0005f.bb).interact(llIlllll[lllIIIII[3]]);
            Time.sleepTicks(lllIIIII[5]);
            "".length();
        }
        if (lIlllIIlIIl(ac() ? 1 : 0) && lIlllIIlIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            if (lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(dc), lllIIIII[9])) {
                String[] strArr = new String[lllIIIII[5]];
                strArr[lllIIIII[6]] = llIlllll[lllIIIII[18]];
                if (lIlllIIlllI(NPCs.getNearest(strArr))) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[20]];
                    w.bg();
                }
            }
            String[] strArr2 = new String[lllIIIII[5]];
            strArr2[lllIIIII[6]] = llIlllll[lllIIIII[21]];
            if (lIlllIIlIll(NPCs.getNearest(strArr2))) {
                if (lIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr3 = new String[lllIIIII[5]];
                    strArr3[lllIIIII[6]] = llIlllll[lllIIIII[23]];
                    TileObjects.getNearest(strArr3).interact(llIlllll[lllIIIII[4]]);
                    Time.sleepTicks(lllIIIII[5]);
                    "".length();
                }
                C0006g.a(bX);
            }
        }
        if (lIlllIIlIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[4])) {
            if (lIlllIIllll(Vars.getBit(lllIIIII[28]), lllIIIII[5])) {
                if (lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(dd), lllIIIII[20])) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[2]];
                    Movement.walkTo(dd);
                    "".length();
                    Time.sleepTicks(lllIIIII[5]);
                    "".length();
                }
                if (lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(dd), lllIIIII[20])) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[29]];
                    C0006g.a(llIlllll[lllIIIII[30]], bX);
                }
            }
            if (lIlllIIlIII(Vars.getBit(lllIIIII[28]), lllIIIII[5])) {
                int[] iArr9 = new int[lllIIIII[5]];
                iArr9[lllIIIII[6]] = lllIIIII[10];
                if (lIlllIIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIIII[5]];
                    iArr10[lllIIIII[6]] = lllIIIII[26];
                    Item first = Inventory.getFirst(iArr10);
                    int[] iArr11 = new int[lllIIIII[5]];
                    iArr11[lllIIIII[6]] = lllIIIII[10];
                    first.useOn(Inventory.getFirst(iArr11));
                    Time.sleepTicks(lllIIIII[5]);
                    "".length();
                }
                int[] iArr12 = new int[lllIIIII[5]];
                iArr12[lllIIIII[6]] = lllIIIII[10];
                if (lIlllIIlIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                    if (lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                        AccBuilderBarrows.c = llIlllll[lllIIIII[31]];
                        Movement.walkTo(de);
                        "".length();
                        Time.sleepTicks(lllIIIII[5]);
                        "".length();
                    }
                    if (lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                        AccBuilderBarrows.c = llIlllll[lllIIIII[32]];
                        C0006g.a(llIlllll[lllIIIII[33]], bX);
                    }
                }
            }
        }
        if (lIlllIIlIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[34])) {
            if (lIlllIIllll(Vars.getBit(lllIIIII[35]), lllIIIII[9])) {
                ci = lllIIIII[6];
                if (lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[36]];
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(lllIIIII[5]);
                    "".length();
                }
                if (lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[37]];
                    C0006g.a(llIlllll[lllIIIII[38]], bX);
                    C0006g.a(llIlllll[lllIIIII[34]], bX);
                }
            }
            if (lIlllIIlIII(Vars.getBit(lllIIIII[35]), lllIIIII[9])) {
                AccBuilderBarrows.c = llIlllll[lllIIIII[39]];
                C0006g.a(llIlllll[lllIIIII[40]], bX);
            }
        }
        if (!lIlllIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[41]) || lIlllIIlIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[42])) {
            AccBuilderBarrows.c = llIlllll[lllIIIII[43]];
            C0006g.a(llIlllll[lllIIIII[44]], bX);
        }
        if (!lIlllIIlIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[27])) {
            return;
        }
        int[] iArr13 = new int[lllIIIII[5]];
        iArr13[lllIIIII[6]] = lllIIIII[22];
        if (lIlllIIlIlI(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIIIII[5]];
            iArr14[lllIIIII[6]] = lllIIIII[22];
            if (lIlllIIlIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIIIII[5]];
                iArr15[lllIIIII[6]] = lllIIIII[22];
                Inventory.getFirst(iArr15).interact(llIlllll[lllIIIII[45]]);
                Time.sleepTicks(lllIIIII[5]);
                "".length();
            }
        }
        int[] iArr16 = new int[lllIIIII[5]];
        iArr16[lllIIIII[6]] = lllIIIII[22];
        if (lIlllIIlIIl(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIIIII[5]];
            iArr17[lllIIIII[6]] = lllIIIII[46];
            if (lIlllIIlIll(TileItems.getNearest(iArr17))) {
                int[] iArr18 = new int[lllIIIII[5]];
                iArr18[lllIIIII[6]] = lllIIIII[46];
                TileItems.getNearest(iArr18).interact(llIlllll[lllIIIII[47]]);
                Time.sleepTicks(lllIIIII[5]);
                "".length();
            }
        }
        int[] iArr19 = new int[lllIIIII[5]];
        iArr19[lllIIIII[6]] = lllIIIII[46];
        if (lIlllIIlIIl(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[lllIIIII[5]];
            iArr20[lllIIIII[6]] = lllIIIII[25];
            if (lIlllIIlIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lllIIIII[5]];
                iArr21[lllIIIII[6]] = lllIIIII[25];
                if (lIlllIIlIlI(Equipment.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIIIII[5]];
                    iArr22[lllIIIII[6]] = lllIIIII[25];
                    Inventory.getFirst(iArr22).interact(llIlllll[lllIIIII[48]]);
                    Time.sleepTicks(lllIIIII[5]);
                    "".length();
                }
            }
            if (lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(df), lllIIIII[18])) {
                AccBuilderBarrows.c = llIlllll[lllIIIII[49]];
                Movement.walkTo(df);
                "".length();
                Time.sleepTicks(lllIIIII[5]);
                "".length();
            }
            if (lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), lllIIIII[18])) {
                AccBuilderBarrows.c = llIlllll[lllIIIII[50]];
                if (lIlllIIlllI(Players.getLocal().getInteracting())) {
                    String[] strArr4 = new String[lllIIIII[5]];
                    strArr4[lllIIIII[6]] = llIlllll[lllIIIII[41]];
                    NPCs.getNearest(strArr4).interact(llIlllll[lllIIIII[51]]);
                    Time.sleepTicks(lllIIIII[1]);
                    "".length();
                }
            }
        }
        int[] iArr23 = new int[lllIIIII[5]];
        iArr23[lllIIIII[6]] = lllIIIII[52];
        if (!lIlllIIlIIl(Inventory.contains(iArr23) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lllIIIII[53], lllIIIII[54], lllIIIII[6]);
        if (lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(dc), lllIIIII[9])) {
            String[] strArr5 = new String[lllIIIII[5]];
            strArr5[lllIIIII[6]] = llIlllll[lllIIIII[55]];
        }
    }

    private static boolean lIlllIIllII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIlllIlIIIl(Quests.getState(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            ?? r0 = lllIIIII[5];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIII[6];
    }

    private static boolean lIlllIIlllI(Object obj) {
        return obj == null;
    }

    private static String lIlllIIIIlI(String lIlIIIllIlIlIlI, String lIlIIIllIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIII[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIllIlIlIll) {
            lIlIIIllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIlllIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlllIIllll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlllIIllIl(int i, int i2) {
        return i > i2;
    }
}
