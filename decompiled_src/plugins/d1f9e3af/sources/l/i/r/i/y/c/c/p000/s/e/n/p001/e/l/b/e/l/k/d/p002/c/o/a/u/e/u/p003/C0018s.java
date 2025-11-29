package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.s  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/s.class */
public class C0018s implements W {
    static /* synthetic */ WorldArea cq;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ int cl;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ String cu;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldArea co;
    static /* synthetic */ WorldPoint cs;
    static /* synthetic */ WorldArea cp;
    static /* synthetic */ WorldPoint cr;
    private static /* synthetic */ int ct;
    private static /* synthetic */ int[] lIIIllIIl;
    private static /* synthetic */ String[] lIIIllIII;
    public static /* synthetic */ boolean bt;

    private static int lllIlIIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lllIlIlIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lllIlIlIIlI(cu, lIIIllIII[lIIIllIIl[159]]) ? lIIIllIII[lIIIllIIl[160]] : "Animal Magnetism - " + cu;
    }

    private static boolean lllIlIIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIlIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lllIlIIlIll(int i, int i2) {
        return i >= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aI();
            "".length();
            if (((((65 + 79) - 41) + 58) ^ (((91 + 113) - 176) + 137)) == 0) {
                return ((((125 + 19) - 26) + 105) ^ (((53 + 155) - 70) + 20)) & (((((207 + 189) - 372) + 194) ^ (((149 + 122) - 249) + 133)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIllIIl[100];
    }

    private static void aJ() {
        if (lllIlIIIlll(new WorldArea(lIIIllIIl[52], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIl[0]];
            strArr[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[142]];
            TileObjects.getNearest(strArr).interact(lIIIllIII[lIIIllIIl[143]]);
            Time.sleepTicks(lIIIllIIl[9]);
            "".length();
        }
        if (lllIlIIlIIl(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[144]];
            if (lllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(bX);
            "".length();
            Time.sleepTicks(lIIIllIIl[0]);
            "".length();
        }
        if (lllIlIIIlll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
            C0006g.a(lIIIllIII[lIIIllIIl[145]], bR);
        }
        if (lllIlIIIlll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIllIIl[52], lIIIllIIl[53], lIIIllIIl[1])) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIllIIl[0]];
            strArr2[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[99]];
            TileObjects.getNearest(strArr2).interact(lIIIllIII[lIIIllIIl[146]]);
            Time.sleepTicks(lIIIllIIl[9]);
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[16]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[28]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028f, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[13]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0318, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[8]) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[8]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x058d, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[13]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[4]) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
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
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14 = new int[lIIIllIIl[0]];
        iArr14[lIIIllIIl[1]] = lIIIllIIl[43];
        if (lllIlIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIIIllIIl[0]];
            iArr15[lIIIllIIl[1]] = lIIIllIIl[43];
            if (lllIlIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIllIIl[0]];
                iArr16[lIIIllIIl[1]] = lIIIllIIl[43];
            }
            iArr = new int[lIIIllIIl[0]];
            iArr[lIIIllIIl[1]] = lIIIllIIl[30];
            if (lllIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIllIIl[0]];
                iArr17[lIIIllIIl[1]] = lIIIllIIl[30];
                if (lllIlIIIlll(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIIllIIl[0]];
                    iArr18[lIIIllIIl[1]] = lIIIllIIl[30];
                }
                iArr2 = new int[lIIIllIIl[0]];
                iArr2[lIIIllIIl[1]] = lIIIllIIl[31];
                if (lllIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr19 = new int[lIIIllIIl[0]];
                    iArr19[lIIIllIIl[1]] = lIIIllIIl[31];
                    if (lllIlIIIlll(Bank.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lIIIllIIl[0]];
                        iArr20[lIIIllIIl[1]] = lIIIllIIl[31];
                    }
                    iArr3 = new int[lIIIllIIl[0]];
                    iArr3[lIIIllIIl[1]] = lIIIllIIl[103];
                    if (lllIlIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        bv.add(new C0003d(lIIIllIIl[103], lIIIllIIl[8], lIIIllIIl[151]));
                        "".length();
                    }
                    iArr4 = new int[lIIIllIIl[0]];
                    iArr4[lIIIllIIl[1]] = lIIIllIIl[37];
                    if (lllIlIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        bv.add(new C0003d(lIIIllIIl[37], lIIIllIIl[0], lIIIllIIl[27]));
                        "".length();
                    }
                    iArr5 = new int[lIIIllIIl[0]];
                    iArr5[lIIIllIIl[1]] = lIIIllIIl[32];
                    if (lllIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr21 = new int[lIIIllIIl[0]];
                        iArr21[lIIIllIIl[1]] = lIIIllIIl[32];
                        if (lllIlIIIlll(Bank.contains(iArr21) ? 1 : 0)) {
                            int[] iArr22 = new int[lIIIllIIl[0]];
                            iArr22[lIIIllIIl[1]] = lIIIllIIl[32];
                        }
                        iArr6 = new int[lIIIllIIl[0]];
                        iArr6[lIIIllIIl[1]] = lIIIllIIl[33];
                        if (lllIlIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr23 = new int[lIIIllIIl[0]];
                            iArr23[lIIIllIIl[1]] = lIIIllIIl[33];
                            if (lllIlIIIlll(Bank.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIIIllIIl[0]];
                                iArr24[lIIIllIIl[1]] = lIIIllIIl[33];
                            }
                            iArr7 = new int[lIIIllIIl[0]];
                            iArr7[lIIIllIIl[1]] = lIIIllIIl[29];
                            if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr25 = new int[lIIIllIIl[0]];
                                iArr25[lIIIllIIl[1]] = lIIIllIIl[29];
                                if (lllIlIIIlll(Bank.contains(iArr25) ? 1 : 0)) {
                                    int[] iArr26 = new int[lIIIllIIl[0]];
                                    iArr26[lIIIllIIl[1]] = lIIIllIIl[29];
                                }
                                iArr8 = new int[lIIIllIIl[0]];
                                iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
                                if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIIllIIl[39], lIIIllIIl[0], lIIIllIIl[27]));
                                    "".length();
                                }
                                iArr9 = new int[lIIIllIIl[0]];
                                iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
                                if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIIllIIl[38], lIIIllIIl[0], lIIIllIIl[27]));
                                    "".length();
                                }
                                iArr10 = new int[lIIIllIIl[0]];
                                iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
                                if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIIllIIl[40], lIIIllIIl[0], lIIIllIIl[152]));
                                    "".length();
                                }
                                iArr11 = new int[lIIIllIIl[0]];
                                iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
                                if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIIllIIl[41], lIIIllIIl[0], lIIIllIIl[153] + C0004e.c(lIIIllIIl[154], lIIIllIIl[155])));
                                    "".length();
                                }
                                if (lllIlIIlIIl(Bank.contains(item -> {
                                    return item.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
                                }) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIIllIIl[156], lIIIllIIl[8], lIIIllIIl[157]));
                                    "".length();
                                }
                                iArr12 = new int[lIIIllIIl[0]];
                                iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
                                if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                                    int[] iArr27 = new int[lIIIllIIl[0]];
                                    iArr27[lIIIllIIl[1]] = lIIIllIIl[34];
                                    if (lllIlIIIlll(Bank.contains(iArr27) ? 1 : 0)) {
                                        int[] iArr28 = new int[lIIIllIIl[0]];
                                        iArr28[lIIIllIIl[1]] = lIIIllIIl[34];
                                    }
                                    iArr13 = new int[lIIIllIIl[0]];
                                    iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                                    if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr29 = new int[lIIIllIIl[0]];
                                        iArr29[lIIIllIIl[1]] = lIIIllIIl[36];
                                        if (!lllIlIIIlll(Bank.contains(iArr29) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr30 = new int[lIIIllIIl[0]];
                                        iArr30[lIIIllIIl[1]] = lIIIllIIl[36];
                                        if (!lllIlIIlIII(Bank.getFirst(iArr30).getQuantity(), lIIIllIIl[28])) {
                                            return;
                                        }
                                    }
                                    bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
                                    "".length();
                                }
                                bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
                                "".length();
                                iArr13 = new int[lIIIllIIl[0]];
                                iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                                if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
                                "".length();
                            }
                            bv.add(new C0003d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]));
                            "".length();
                            iArr8 = new int[lIIIllIIl[0]];
                            iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
                            if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            iArr9 = new int[lIIIllIIl[0]];
                            iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
                            if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            iArr10 = new int[lIIIllIIl[0]];
                            iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
                            if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[lIIIllIIl[0]];
                            iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
                            if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            if (lllIlIIlIIl(Bank.contains(item2 -> {
                                return item2.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[lIIIllIIl[0]];
                            iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
                            if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
                            "".length();
                            iArr13 = new int[lIIIllIIl[0]];
                            iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                            if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
                            "".length();
                        }
                        bv.add(new C0003d(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]));
                        "".length();
                        iArr7 = new int[lIIIllIIl[0]];
                        iArr7[lIIIllIIl[1]] = lIIIllIIl[29];
                        if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]));
                        "".length();
                        iArr8 = new int[lIIIllIIl[0]];
                        iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
                        if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        iArr9 = new int[lIIIllIIl[0]];
                        iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
                        if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        iArr10 = new int[lIIIllIIl[0]];
                        iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
                        if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[lIIIllIIl[0]];
                        iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
                        if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        if (lllIlIIlIIl(Bank.contains(item22 -> {
                            return item22.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lIIIllIIl[0]];
                        iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
                        if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
                        "".length();
                        iArr13 = new int[lIIIllIIl[0]];
                        iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                        if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
                        "".length();
                    }
                    bv.add(new C0003d(lIIIllIIl[32], lIIIllIIl[13], lIIIllIIl[27]));
                    "".length();
                    iArr6 = new int[lIIIllIIl[0]];
                    iArr6[lIIIllIIl[1]] = lIIIllIIl[33];
                    if (lllIlIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]));
                    "".length();
                    iArr7 = new int[lIIIllIIl[0]];
                    iArr7[lIIIllIIl[1]] = lIIIllIIl[29];
                    if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]));
                    "".length();
                    iArr8 = new int[lIIIllIIl[0]];
                    iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
                    if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lIIIllIIl[0]];
                    iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
                    if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIIIllIIl[0]];
                    iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
                    if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lIIIllIIl[0]];
                    iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
                    if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    if (lllIlIIlIIl(Bank.contains(item222 -> {
                        return item222.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lIIIllIIl[0]];
                    iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
                    if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
                    "".length();
                    iArr13 = new int[lIIIllIIl[0]];
                    iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                    if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
                    "".length();
                }
                bv.add(new C0003d(lIIIllIIl[31], lIIIllIIl[28], lIIIllIIl[150]));
                "".length();
                iArr3 = new int[lIIIllIIl[0]];
                iArr3[lIIIllIIl[1]] = lIIIllIIl[103];
                if (lllIlIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIllIIl[0]];
                iArr4[lIIIllIIl[1]] = lIIIllIIl[37];
                if (lllIlIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIIIllIIl[0]];
                iArr5[lIIIllIIl[1]] = lIIIllIIl[32];
                if (lllIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIIllIIl[32], lIIIllIIl[13], lIIIllIIl[27]));
                "".length();
                iArr6 = new int[lIIIllIIl[0]];
                iArr6[lIIIllIIl[1]] = lIIIllIIl[33];
                if (lllIlIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]));
                "".length();
                iArr7 = new int[lIIIllIIl[0]];
                iArr7[lIIIllIIl[1]] = lIIIllIIl[29];
                if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]));
                "".length();
                iArr8 = new int[lIIIllIIl[0]];
                iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
                if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIIIllIIl[0]];
                iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
                if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIIIllIIl[0]];
                iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
                if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIIIllIIl[0]];
                iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
                if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                }
                if (lllIlIIlIIl(Bank.contains(item2222 -> {
                    return item2222.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lIIIllIIl[0]];
                iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
                if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
                "".length();
                iArr13 = new int[lIIIllIIl[0]];
                iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
                "".length();
            }
            bv.add(new C0003d(lIIIllIIl[30], lIIIllIIl[16], lIIIllIIl[149]));
            "".length();
            iArr2 = new int[lIIIllIIl[0]];
            iArr2[lIIIllIIl[1]] = lIIIllIIl[31];
            if (lllIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIllIIl[31], lIIIllIIl[28], lIIIllIIl[150]));
            "".length();
            iArr3 = new int[lIIIllIIl[0]];
            iArr3[lIIIllIIl[1]] = lIIIllIIl[103];
            if (lllIlIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIllIIl[0]];
            iArr4[lIIIllIIl[1]] = lIIIllIIl[37];
            if (lllIlIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIIllIIl[0]];
            iArr5[lIIIllIIl[1]] = lIIIllIIl[32];
            if (lllIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIllIIl[32], lIIIllIIl[13], lIIIllIIl[27]));
            "".length();
            iArr6 = new int[lIIIllIIl[0]];
            iArr6[lIIIllIIl[1]] = lIIIllIIl[33];
            if (lllIlIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]));
            "".length();
            iArr7 = new int[lIIIllIIl[0]];
            iArr7[lIIIllIIl[1]] = lIIIllIIl[29];
            if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]));
            "".length();
            iArr8 = new int[lIIIllIIl[0]];
            iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
            if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIIIllIIl[0]];
            iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
            if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIIIllIIl[0]];
            iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
            if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIIIllIIl[0]];
            iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
            if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
            }
            if (lllIlIIlIIl(Bank.contains(item22222 -> {
                return item22222.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lIIIllIIl[0]];
            iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
            if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
            "".length();
            iArr13 = new int[lIIIllIIl[0]];
            iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
            if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
            "".length();
        }
        bv.add(new C0003d(lIIIllIIl[43], lIIIllIIl[4], C0004e.c(lIIIllIIl[147], lIIIllIIl[148])));
        "".length();
        iArr = new int[lIIIllIIl[0]];
        iArr[lIIIllIIl[1]] = lIIIllIIl[30];
        if (lllIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[30], lIIIllIIl[16], lIIIllIIl[149]));
        "".length();
        iArr2 = new int[lIIIllIIl[0]];
        iArr2[lIIIllIIl[1]] = lIIIllIIl[31];
        if (lllIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[31], lIIIllIIl[28], lIIIllIIl[150]));
        "".length();
        iArr3 = new int[lIIIllIIl[0]];
        iArr3[lIIIllIIl[1]] = lIIIllIIl[103];
        if (lllIlIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIllIIl[0]];
        iArr4[lIIIllIIl[1]] = lIIIllIIl[37];
        if (lllIlIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIIllIIl[0]];
        iArr5[lIIIllIIl[1]] = lIIIllIIl[32];
        if (lllIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[32], lIIIllIIl[13], lIIIllIIl[27]));
        "".length();
        iArr6 = new int[lIIIllIIl[0]];
        iArr6[lIIIllIIl[1]] = lIIIllIIl[33];
        if (lllIlIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]));
        "".length();
        iArr7 = new int[lIIIllIIl[0]];
        iArr7[lIIIllIIl[1]] = lIIIllIIl[29];
        if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]));
        "".length();
        iArr8 = new int[lIIIllIIl[0]];
        iArr8[lIIIllIIl[1]] = lIIIllIIl[39];
        if (lllIlIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIIllIIl[0]];
        iArr9[lIIIllIIl[1]] = lIIIllIIl[38];
        if (lllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIIIllIIl[0]];
        iArr10[lIIIllIIl[1]] = lIIIllIIl[40];
        if (lllIlIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIIIllIIl[0]];
        iArr11[lIIIllIIl[1]] = lIIIllIIl[41];
        if (lllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
        }
        if (lllIlIIlIIl(Bank.contains(item222222 -> {
            return item222222.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lIIIllIIl[0]];
        iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
        if (lllIlIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[34], lIIIllIIl[13], C0008i.bq));
        "".length();
        iArr13 = new int[lIIIllIIl[0]];
        iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
        if (lllIlIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]));
        "".length();
    }

    private static boolean lllIlIIllIl(int i) {
        return i > 0;
    }

    private static String lllIlIIIIlI(String lIIIlllIIIlIIlI, String lIIIlllIIIlIllI) {
        String lIIIlllIIIlIIlI2 = new String(Base64.getDecoder().decode(lIIIlllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlllIIIlIlIl = new StringBuilder();
        char[] charArray = lIIIlllIIIlIllI.toCharArray();
        int lIIIlllIIIlIIll = lIIIllIIl[1];
        char[] charArray2 = lIIIlllIIIlIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIl[1];
        while (lllIlIIlIII(i, length)) {
            char lIIIlllIIIllIII = charArray2[i];
            lIIIlllIIIlIlIl.append((char) (lIIIlllIIIllIII ^ charArray[lIIIlllIIIlIIll % charArray.length]));
            "".length();
            lIIIlllIIIlIIll++;
            i++;
            "".length();
            if (((118 ^ 85) & ((91 ^ 120) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(lIIIlllIIIlIlIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIIllIIl[20]];
        iArr[lIIIllIIl[1]] = lIIIllIIl[36];
        iArr[lIIIllIIl[0]] = lIIIllIIl[37];
        iArr[lIIIllIIl[9]] = lIIIllIIl[34];
        iArr[lIIIllIIl[11]] = lIIIllIIl[40];
        iArr[lIIIllIIl[13]] = lIIIllIIl[41];
        iArr[lIIIllIIl[8]] = lIIIllIIl[30];
        iArr[lIIIllIIl[16]] = lIIIllIIl[31];
        int i = lIIIllIIl[1];
        while (lllIlIIlIII(i, iArr.length)) {
            int[] iArr2 = new int[lIIIllIIl[0]];
            iArr2[lIIIllIIl[1]] = iArr[i];
            if (lllIlIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIllIIl[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((60 + 81) - 45) + 64) ^ (((124 + 49) - 73) + 55)) & (((((170 + 124) - 120) + 6) ^ (((106 + 138) - 211) + 110)) ^ (-" ".length()));
            }
        }
        return lIIIllIIl[0];
    }

    private static boolean lllIlIIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllIlIIlIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[2])) {
            ?? r0 = lIIIllIIl[0];
            "".length();
            return (((((127 + 24) - 100) + 97) ^ (((127 + 15) - 104) + 94)) & (((37 ^ 64) ^ (202 ^ 191)) ^ (-" ".length()))) >= ((18 ^ 77) ^ (126 ^ 37)) ? ((120 ^ 59) ^ (84 ^ 42)) & (((212 ^ 128) ^ (15 ^ 102)) ^ (-" ".length())) : r0;
        }
        return lIIIllIIl[1];
    }

    private static boolean lllIlIlIIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x069d, code lost:
        if (lllIlIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[8]) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06e0, code lost:
        if (lllIlIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[16]) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0723, code lost:
        if (lllIlIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[28]) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0766, code lost:
        if (lllIlIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[13]) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x07a9, code lost:
        if (lllIlIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[8]) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
        if (lllIlIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[13]) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07ef, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[35]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0018s.lIIIllIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x080a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v893, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v926, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v311, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v93, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aI() {
        if (lllIlIIIlll(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllIlIIlIII(bv.size(), lIIIllIIl[0])) {
                System.out.println(lIIIllIII[lIIIllIIl[1]]);
                bt = lIIIllIIl[1];
            }
        }
        if (lllIlIIlIIl(bt ? 1 : 0) && lllIlIIlIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[2])) {
            if (lllIlIIlIII(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4])) {
                cu = lIIIllIII[lIIIllIIl[0]];
                F.bG();
            }
            if (lllIlIIlIlI(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4]) && (!lllIlIIlIll(C0004e.j(lIIIllIIl[5]), lIIIllIIl[6]) || lllIlIIlIII(C0004e.j(lIIIllIIl[7]), lIIIllIIl[8]))) {
                cu = lIIIllIII[lIIIllIIl[9]];
                C0024y.aX();
            }
            if (lllIlIIlIlI(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4]) && lllIlIIlIll(C0004e.j(lIIIllIIl[5]), lIIIllIIl[6]) && lllIlIIlIll(C0004e.j(lIIIllIIl[7]), lIIIllIIl[8]) && lllIlIIlIII(C0004e.j(lIIIllIIl[10]), lIIIllIIl[11])) {
                cu = lIIIllIII[lIIIllIIl[11]];
                N.cn();
            }
            if (lllIlIIlIlI(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4]) && lllIlIIlIll(C0004e.j(lIIIllIIl[5]), lIIIllIIl[6]) && lllIlIIlIll(C0004e.j(lIIIllIIl[7]), lIIIllIIl[8]) && lllIlIIlIlI(C0004e.j(lIIIllIIl[10]), lIIIllIIl[11]) && lllIlIIlIII(Skills.getLevel(Skill.CRAFTING), lIIIllIIl[12])) {
                cu = lIIIllIII[lIIIllIIl[13]];
                ah.dO();
            }
            if (lllIlIIlIlI(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4]) && lllIlIIlIll(C0004e.j(lIIIllIIl[5]), lIIIllIIl[6]) && lllIlIIlIll(C0004e.j(lIIIllIIl[7]), lIIIllIIl[8]) && lllIlIIlIlI(C0004e.j(lIIIllIIl[10]), lIIIllIIl[11]) && lllIlIIlIll(Skills.getLevel(Skill.CRAFTING), lIIIllIIl[12]) && lllIlIIlIII(Skills.getLevel(Skill.WOODCUTTING), lIIIllIIl[14])) {
                cu = lIIIllIII[lIIIllIIl[8]];
                am.ez();
            }
            if (lllIlIIlIlI(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4]) && lllIlIIlIll(C0004e.j(lIIIllIIl[5]), lIIIllIIl[6]) && lllIlIIlIll(C0004e.j(lIIIllIIl[7]), lIIIllIIl[8]) && lllIlIIlIlI(C0004e.j(lIIIllIIl[10]), lIIIllIIl[11]) && lllIlIIlIll(Skills.getLevel(Skill.CRAFTING), lIIIllIIl[12]) && lllIlIIlIll(Skills.getLevel(Skill.WOODCUTTING), lIIIllIIl[14]) && lllIlIIlIII(Skills.getLevel(Skill.RANGED), lIIIllIIl[15])) {
                cu = lIIIllIII[lIIIllIIl[16]];
                if (lllIlIIlIII(ct, lIIIllIIl[0])) {
                    C0013n.bU = lIIIllIIl[1];
                    ct += lIIIllIIl[0];
                }
                C0012m.ap();
            }
            if (lllIlIIlIlI(C0004e.j(lIIIllIIl[3]), lIIIllIIl[4]) && lllIlIIlIll(C0004e.j(lIIIllIIl[5]), lIIIllIIl[6]) && lllIlIIlIll(C0004e.j(lIIIllIIl[7]), lIIIllIIl[8]) && lllIlIIlIlI(C0004e.j(lIIIllIIl[10]), lIIIllIIl[11]) && lllIlIIlIll(Skills.getLevel(Skill.CRAFTING), lIIIllIIl[12]) && lllIlIIlIll(Skills.getLevel(Skill.WOODCUTTING), lIIIllIIl[14]) && lllIlIIlIll(Skills.getLevel(Skill.RANGED), lIIIllIIl[15])) {
                if (!lllIlIIlIll(C0004e.j(lIIIllIIl[17]), lIIIllIIl[18]) || lllIlIIlIII(Skills.getLevel(Skill.HUNTER), lIIIllIIl[19])) {
                    cu = lIIIllIII[lIIIllIIl[20]];
                    E.bD();
                }
                if (lllIlIIlIll(C0004e.j(lIIIllIIl[17]), lIIIllIIl[18]) && lllIlIIlIll(Skills.getLevel(Skill.HUNTER), lIIIllIIl[19]) && lllIlIIlIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6])) {
                    cu = lIIIllIII[lIIIllIIl[21]];
                    A.bq();
                }
                if (lllIlIIlIll(C0004e.j(lIIIllIIl[17]), lIIIllIIl[18]) && lllIlIIlIll(Skills.getLevel(Skill.HUNTER), lIIIllIIl[19]) && lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && lllIlIIlIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22])) {
                    cu = lIIIllIII[lIIIllIIl[19]];
                    C0017r.aG();
                }
                if (lllIlIIlIll(C0004e.j(lIIIllIIl[17]), lIIIllIIl[18]) && lllIlIIlIll(Skills.getLevel(Skill.HUNTER), lIIIllIIl[19]) && lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22]) && lllIlIIlIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIllIIl[19])) {
                    String[] strArr = new String[lIIIllIIl[0]];
                    strArr[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[4]];
                    if (lllIlIIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
                        cu = lIIIllIII[lIIIllIIl[23]];
                        C0019t.aL();
                    }
                }
                C0019t.aM();
            }
            if (lllIlIIlIIl(ab() ? 1 : 0) && lllIlIIlIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) && lllIlIIlIll(C0004e.j(lIIIllIIl[17]), lIIIllIIl[18]) && lllIlIIlIll(Skills.getLevel(Skill.HUNTER), lIIIllIIl[19]) && lllIlIIlIll(Skills.getLevel(Skill.RANGED), lIIIllIIl[15]) && lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22]) && lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIllIIl[19])) {
                String[] strArr2 = new String[lIIIllIIl[0]];
                strArr2[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[24]];
                if (lllIlIIlIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    cu = lIIIllIII[lIIIllIIl[25]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (lllIlIIllII(nearest) && lllIlIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[26]];
                        C0000a.a(nearest);
                    }
                    if (lllIlIIllII(nearest) && lllIlIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIlIIlIIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIllIIl[27]);
                            "".length();
                        }
                        if (lllIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[28]];
                            if (lllIlIIllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIllIIl[13]);
                                "".length();
                            }
                            if (lllIlIIllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIllIIl[9]);
                                "".length();
                            }
                            int[] iArr = new int[lIIIllIIl[0]];
                            iArr[lIIIllIIl[1]] = lIIIllIIl[29];
                            if (lllIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIllIIl[0]];
                                iArr2[lIIIllIIl[1]] = lIIIllIIl[29];
                            }
                            int[] iArr3 = new int[lIIIllIIl[0]];
                            iArr3[lIIIllIIl[1]] = lIIIllIIl[30];
                            if (lllIlIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIllIIl[0]];
                                iArr4[lIIIllIIl[1]] = lIIIllIIl[30];
                            }
                            int[] iArr5 = new int[lIIIllIIl[0]];
                            iArr5[lIIIllIIl[1]] = lIIIllIIl[31];
                            if (lllIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIllIIl[0]];
                                iArr6[lIIIllIIl[1]] = lIIIllIIl[31];
                            }
                            int[] iArr7 = new int[lIIIllIIl[0]];
                            iArr7[lIIIllIIl[1]] = lIIIllIIl[32];
                            if (lllIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIllIIl[0]];
                                iArr8[lIIIllIIl[1]] = lIIIllIIl[32];
                            }
                            int[] iArr9 = new int[lIIIllIIl[0]];
                            iArr9[lIIIllIIl[1]] = lIIIllIIl[33];
                            if (lllIlIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIllIIl[0]];
                                iArr10[lIIIllIIl[1]] = lIIIllIIl[33];
                            }
                            int[] iArr11 = new int[lIIIllIIl[0]];
                            iArr11[lIIIllIIl[1]] = lIIIllIIl[34];
                            if (lllIlIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIllIIl[0]];
                                iArr12[lIIIllIIl[1]] = lIIIllIIl[34];
                            }
                            int[] iArr13 = new int[lIIIllIIl[23]];
                            iArr13[lIIIllIIl[1]] = lIIIllIIl[36];
                            iArr13[lIIIllIIl[0]] = lIIIllIIl[37];
                            iArr13[lIIIllIIl[9]] = lIIIllIIl[33];
                            iArr13[lIIIllIIl[11]] = lIIIllIIl[38];
                            iArr13[lIIIllIIl[13]] = lIIIllIIl[32];
                            iArr13[lIIIllIIl[8]] = lIIIllIIl[34];
                            iArr13[lIIIllIIl[16]] = lIIIllIIl[39];
                            iArr13[lIIIllIIl[20]] = lIIIllIIl[40];
                            iArr13[lIIIllIIl[21]] = lIIIllIIl[41];
                            iArr13[lIIIllIIl[19]] = lIIIllIIl[30];
                            iArr13[lIIIllIIl[4]] = lIIIllIIl[31];
                            if (lllIlIIlIIl(C0004e.b(iArr13) ? 1 : 0)) {
                                af();
                                System.out.println(lIIIllIII[lIIIllIIl[42]]);
                                bt = lIIIllIIl[0];
                                return;
                            }
                            int[] iArr14 = new int[lIIIllIIl[23]];
                            iArr14[lIIIllIIl[1]] = lIIIllIIl[36];
                            iArr14[lIIIllIIl[0]] = lIIIllIIl[37];
                            iArr14[lIIIllIIl[9]] = lIIIllIIl[33];
                            iArr14[lIIIllIIl[11]] = lIIIllIIl[38];
                            iArr14[lIIIllIIl[13]] = lIIIllIIl[32];
                            iArr14[lIIIllIIl[8]] = lIIIllIIl[34];
                            iArr14[lIIIllIIl[16]] = lIIIllIIl[39];
                            iArr14[lIIIllIIl[20]] = lIIIllIIl[40];
                            iArr14[lIIIllIIl[21]] = lIIIllIIl[41];
                            iArr14[lIIIllIIl[19]] = lIIIllIIl[30];
                            iArr14[lIIIllIIl[4]] = lIIIllIIl[31];
                            if (lllIlIIIlll(C0004e.b(iArr14) ? 1 : 0)) {
                                C0000a.a(lIIIllIIl[34], lIIIllIIl[13]);
                                C0000a.a(lIIIllIIl[37], lIIIllIIl[0]);
                                C0000a.a(lIIIllIIl[43], lIIIllIIl[0]);
                                C0000a.a(lIIIllIIl[32], lIIIllIIl[13]);
                                C0000a.a(lIIIllIIl[29], lIIIllIIl[13]);
                                C0000a.a(lIIIllIIl[40], lIIIllIIl[0]);
                                C0000a.a(lIIIllIIl[41], lIIIllIIl[0]);
                                C0000a.a(lIIIllIIl[36], lIIIllIIl[4]);
                                C0000a.a(lIIIllIIl[30], lIIIllIIl[4]);
                                C0000a.a(lIIIllIIl[31], lIIIllIIl[28]);
                                C0000a.a(lIIIllIIl[44], lIIIllIIl[0]);
                                C0000a.a(lIIIllIIl[45], lIIIllIIl[27]);
                            }
                        }
                    }
                }
            }
            if (lllIlIIIlll(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIlIIlIII(Movement.getRunEnergy(), lIIIllIIl[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIllIII[lIIIllIIl[46]]);
                Time.sleepTicks(lIIIllIIl[0]);
                "".length();
            }
            if (lllIlIIIlll(Inventory.contains(C0005f.aS) ? 1 : 0) && lllIlIIlIII(Prayers.getPoints(), lIIIllIIl[47])) {
                Inventory.getFirst(C0005f.aS).interact(lIIIllIII[lIIIllIIl[12]]);
            }
            if (lllIlIIlllI(lllIlIIIllI(C0004e.u(), 60.0d))) {
                String[] strArr3 = new String[lIIIllIIl[0]];
                strArr3[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[48]];
                if (lllIlIIIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIllIIl[0]];
                    strArr4[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[49]];
                    Inventory.getFirst(strArr4).interact(lIIIllIII[lIIIllIIl[50]]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                }
            }
            if (lllIlIIIlll(ab() ? 1 : 0) && lllIlIIlIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (lllIlIIlIIl(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[51]];
                    if (lllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIIIllIIl[0]);
                    "".length();
                }
                if (lllIlIIIlll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
                    cl = lIIIllIIl[1];
                    C0006g.a(lIIIllIII[lIIIllIIl[47]], bR);
                }
                if (lllIlIIIlll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIllIIl[52], lIIIllIIl[53], lIIIllIIl[1])) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIIllIIl[0]];
                    strArr5[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[54]];
                    TileObjects.getNearest(strArr5).interact(lIIIllIII[lIIIllIIl[55]]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                }
                if (lllIlIIIlll(new WorldArea(lIIIllIIl[52], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[lIIIllIIl[0]];
                    strArr6[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[57]];
                    TileObjects.getNearest(strArr6).interact(lIIIllIII[lIIIllIIl[58]]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[4])) {
                int[] iArr15 = new int[lIIIllIIl[0]];
                iArr15[lIIIllIIl[1]] = lIIIllIIl[44];
                if (lllIlIIlIIl(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIIllIIl[0]];
                    iArr16[lIIIllIIl[1]] = lIIIllIIl[44];
                    Inventory.getFirst(iArr16).interact(lIIIllIII[lIIIllIIl[59]]);
                }
                int[] iArr17 = new int[lIIIllIIl[0]];
                iArr17[lIIIllIIl[1]] = lIIIllIIl[60];
                if (lllIlIIlIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIIllIIl[61], lIIIllIIl[62], lIIIllIIl[1]);
                    int[] iArr18 = new int[lIIIllIIl[0]];
                    iArr18[lIIIllIIl[1]] = lIIIllIIl[63];
                    if (lllIlIIlIIl(Inventory.contains(iArr18) ? 1 : 0) && lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIl[48])) {
                        if (lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIllIIl[8])) {
                            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[64]];
                            Movement.walkTo(cr);
                            "".length();
                            Time.sleepTicks(lIIIllIIl[0]);
                            "".length();
                        }
                        if (lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIllIIl[8])) {
                            if (lllIlIIlIIl(Shop.isOpen() ? 1 : 0)) {
                                String[] strArr7 = new String[lIIIllIIl[0]];
                                strArr7[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[65]];
                                NPCs.getNearest(strArr7).interact(lIIIllIII[lIIIllIIl[10]]);
                                Time.sleepTicks(lIIIllIIl[9]);
                                "".length();
                            }
                            if (lllIlIIIlll(Shop.isOpen() ? 1 : 0)) {
                                Shop.buyFive(lIIIllIIl[63]);
                                Time.sleepTicks(lIIIllIIl[11]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[lIIIllIIl[0]];
                    iArr19[lIIIllIIl[1]] = lIIIllIIl[63];
                    if (lllIlIIIlll(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (lllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIlIIl(cq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIIIllIIl[0]];
                            iArr20[lIIIllIIl[1]] = lIIIllIIl[31];
                            if (lllIlIIIlll(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIIIllIIl[0]];
                                iArr21[lIIIllIIl[1]] = lIIIllIIl[31];
                                Inventory.getFirst(iArr21).interact(lIIIllIII[lIIIllIIl[66]]);
                                Time.sleepTicks(lIIIllIIl[20]);
                                "".length();
                            }
                        }
                        if (!lllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIlIIIlll(cq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIIIllIIl[61], lIIIllIIl[62], lIIIllIIl[1]);
                            if (lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIllIIl[8]) && lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[67]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIIIllIIl[0]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIIIllIIl[0]];
                            strArr8[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[14]];
                            if (lllIlIIIlll(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIllIIl[8]) && lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                    String[] strArr9 = new String[lIIIllIIl[0]];
                                    strArr9[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[68]];
                                    TileObjects.getNearest(strArr9).interact(lIIIllIII[lIIIllIIl[69]]);
                                    Time.sleepTicks(lIIIllIIl[13]);
                                    "".length();
                                }
                                String[] strArr10 = new String[lIIIllIIl[0]];
                                strArr10[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[70]];
                                if (lllIlIIllII(TileObjects.getNearest(strArr10))) {
                                    String[] strArr11 = new String[lIIIllIIl[0]];
                                    strArr11[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[71]];
                                    if (lllIlIIIlll(Inventory.contains(strArr11) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIIIllIIl[0]];
                                        strArr12[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[22]];
                                        Item first = Inventory.getFirst(strArr12);
                                        String[] strArr13 = new String[lIIIllIIl[0]];
                                        strArr13[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[72]];
                                        first.useOn(TileObjects.getNearest(strArr13));
                                        Time.sleep(C0004e.c(lIIIllIIl[73], lIIIllIIl[74]));
                                        "".length();
                                    }
                                }
                            }
                            String[] strArr14 = new String[lIIIllIIl[0]];
                            strArr14[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[75]];
                            if (lllIlIIlIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                                if (lllIlIIlIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIllIIl[0])) {
                                    String[] strArr15 = new String[lIIIllIIl[0]];
                                    strArr15[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[76]];
                                    TileObjects.getNearest(strArr15).interact(lIIIllIII[lIIIllIIl[77]]);
                                    Time.sleepTicks(lIIIllIIl[8]);
                                    "".length();
                                }
                                if (lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                    do {
                                        String[] strArr16 = new String[lIIIllIIl[0]];
                                        strArr16[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[78]];
                                        if (lllIlIIIlll(Inventory.contains(strArr16) ? 1 : 0)) {
                                            String[] strArr17 = new String[lIIIllIIl[0]];
                                            strArr17[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[79]];
                                            TileObjects.getNearest(strArr17).interact(lIIIllIII[lIIIllIIl[80]]);
                                            Time.sleepTicks(lIIIllIIl[9]);
                                            "".length();
                                            "".length();
                                        }
                                    } while ((-" ".length()) >= (-" ".length()));
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr22 = new int[lIIIllIIl[0]];
                    iArr22[lIIIllIIl[1]] = lIIIllIIl[32];
                    if (lllIlIIlIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                        String[] strArr18 = new String[lIIIllIIl[0]];
                        strArr18[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[81]];
                        if (lllIlIIlIIl(Inventory.contains(strArr18) ? 1 : 0) && lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIl[48])) {
                            if (lllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                C0006g.a(lIIIllIII[lIIIllIIl[82]], bR);
                                Time.sleepTicks(lIIIllIIl[0]);
                                "".length();
                            }
                            C0006g.a(bR);
                        }
                    }
                }
                int[] iArr23 = new int[lIIIllIIl[0]];
                iArr23[lIIIllIIl[1]] = lIIIllIIl[60];
                if (lllIlIIIlll(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lIIIllIIl[9]];
                    iArr24[lIIIllIIl[1]] = lIIIllIIl[83];
                    iArr24[lIIIllIIl[0]] = lIIIllIIl[29];
                    if (lllIlIIIlll(Inventory.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[lIIIllIIl[9]];
                        iArr25[lIIIllIIl[1]] = lIIIllIIl[83];
                        iArr25[lIIIllIIl[0]] = lIIIllIIl[29];
                        Inventory.getAll(iArr25).stream().forEach(item -> {
                            item.interact(lIIIllIII[lIIIllIIl[162]]);
                        });
                    }
                    if (lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                        Movement.walkTo(cs);
                        "".length();
                        Time.sleepTicks(lIIIllIIl[0]);
                        "".length();
                    }
                    if (lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                        C0006g.a(lIIIllIII[lIIIllIIl[15]], bR);
                    }
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[48])) {
                C0006g.a(lIIIllIII[lIIIllIIl[84]], bR);
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[64])) {
                C0006g.a(lIIIllIII[lIIIllIIl[85]], bR);
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[22])) {
                C0006g.a(lIIIllIII[lIIIllIIl[86]], bR);
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[15])) {
                C0006g.a(lIIIllIII[lIIIllIIl[87]], bR);
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[6])) {
                C0006g.a(lIIIllIII[lIIIllIIl[88]], bR);
            }
            if (!lllIlIlIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[89]) || lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[90])) {
                WorldPoint worldPoint3 = new WorldPoint(lIIIllIIl[91], lIIIllIIl[92], lIIIllIIl[1]);
                if (lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIIllIIl[11])) {
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[93]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lIIIllIIl[0]);
                    "".length();
                }
                if (lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIIllIIl[11])) {
                    C0006g.a(lIIIllIII[lIIIllIIl[94]], bR);
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[95])) {
                if (lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                    Movement.walkTo(cs);
                    "".length();
                    Time.sleepTicks(lIIIllIIl[0]);
                    "".length();
                }
                if (lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                    C0006g.a(lIIIllIII[lIIIllIIl[96]], bR);
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[97])) {
                C0006g.a(lIIIllIII[lIIIllIIl[98]], bR);
            }
            if (!lllIlIlIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[99]) || lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[100])) {
                C0006g.a(lIIIllIII[lIIIllIIl[6]], bR);
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[100])) {
                String[] strArr19 = new String[lIIIllIIl[0]];
                strArr19[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[101]];
                if (lllIlIIIlll(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[lIIIllIIl[0]];
                    strArr20[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[102]];
                    if (lllIlIIlIIl(Inventory.contains(strArr20) ? 1 : 0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Integer.valueOf(lIIIllIIl[33]), Integer.valueOf(lIIIllIIl[8]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIIllIIl[38]), Integer.valueOf(lIIIllIIl[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIIllIIl[39]), Integer.valueOf(lIIIllIIl[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIIllIIl[103]), Integer.valueOf(lIIIllIIl[0]));
                        "".length();
                        C0004e.a(hashMap, lIIIllIIl[1], lIIIllIIl[1]);
                    }
                    String[] strArr21 = new String[lIIIllIIl[0]];
                    strArr21[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[104]];
                    if (lllIlIIIlll(Inventory.contains(strArr21) ? 1 : 0)) {
                        aJ();
                    }
                }
            }
            if (!lllIlIlIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[105]) || lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[106])) {
                String[] strArr22 = new String[lIIIllIIl[0]];
                strArr22[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[107]];
                NPC nearest2 = NPCs.getNearest(strArr22);
                if (lllIlIIllII(nearest2)) {
                    if (lllIlIIIlll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0006g.a(lIIIllIII[lIIIllIIl[3]], bR);
                    }
                    if (lllIlIIlIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2);
                        "".length();
                        Time.sleepTicks(lIIIllIIl[0]);
                        "".length();
                    }
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[108])) {
                String[] strArr23 = new String[lIIIllIIl[0]];
                strArr23[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[109]];
                if (lllIlIIlIIl(Inventory.contains(strArr23) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIIIllIIl[110], lIIIllIIl[111], lIIIllIIl[1]);
                    WorldPoint worldPoint5 = new WorldPoint(lIIIllIIl[110], lIIIllIIl[112], lIIIllIIl[1]);
                    if (lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[113]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIIIllIIl[0]);
                        "".length();
                    }
                    if (lllIlIIIlll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        Movement.walkTo(worldPoint5);
                        "".length();
                    }
                    if (lllIlIIIlll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        String[] strArr24 = new String[lIIIllIIl[0]];
                        strArr24[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[114]];
                        Item first2 = Inventory.getFirst(strArr24);
                        String[] strArr25 = new String[lIIIllIIl[0]];
                        strArr25[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[115]];
                        first2.useOn(Inventory.getFirst(strArr25));
                        Time.sleepTicks(lIIIllIIl[11]);
                        "".length();
                    }
                }
                String[] strArr26 = new String[lIIIllIIl[0]];
                strArr26[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[89]];
                if (lllIlIIIlll(Inventory.contains(strArr26) ? 1 : 0)) {
                    aJ();
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[116])) {
                WorldPoint worldPoint6 = new WorldPoint(lIIIllIIl[117], lIIIllIIl[118], lIIIllIIl[1]);
                if (lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    Movement.walkTo(worldPoint6);
                    "".length();
                    Time.sleepTicks(lIIIllIIl[0]);
                    "".length();
                }
                if (lllIlIIIlll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    String[] strArr27 = new String[lIIIllIIl[0]];
                    strArr27[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[119]];
                    NPCs.getNearest(strArr27).interact(lIIIllIII[lIIIllIIl[120]]);
                    Time.sleepTicks(lIIIllIIl[0]);
                    "".length();
                }
            }
            if (!lllIlIlIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[121]) || lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[122])) {
                WorldPoint worldPoint7 = new WorldPoint(lIIIllIIl[123], lIIIllIIl[124], lIIIllIIl[1]);
                if (lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIIllIIl[9])) {
                    if (lllIlIIIlll(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aO).interact(lIIIllIII[lIIIllIIl[90]]);
                    }
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[125]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    Time.sleepTicks(lIIIllIIl[0]);
                    "".length();
                }
                if (lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIIllIIl[9])) {
                    String[] strArr28 = new String[lIIIllIIl[0]];
                    strArr28[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[126]];
                    NPC nearest3 = NPCs.getNearest(strArr28);
                    if (lllIlIIllII(nearest3)) {
                        if (lllIlIIIlll(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            C0006g.a(lIIIllIII[lIIIllIIl[95]], bR);
                        }
                        if (lllIlIIlIIl(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            Movement.walkTo(nearest3);
                            "".length();
                            Time.sleepTicks(lIIIllIIl[0]);
                            "".length();
                        }
                    }
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[127])) {
                String[] strArr29 = new String[lIIIllIIl[0]];
                strArr29[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[128]];
                if (lllIlIIlIIl(Inventory.contains(strArr29) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(lIIIllIIl[117], lIIIllIIl[118], lIIIllIIl[1]);
                    if (lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        Movement.walkTo(worldPoint8);
                        "".length();
                        Time.sleepTicks(lIIIllIIl[0]);
                        "".length();
                    }
                    if (lllIlIIIlll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        String[] strArr30 = new String[lIIIllIIl[0]];
                        strArr30[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[129]];
                        NPCs.getNearest(strArr30).interact(lIIIllIII[lIIIllIIl[130]]);
                        Time.sleepTicks(lIIIllIIl[0]);
                        "".length();
                    }
                }
                String[] strArr31 = new String[lIIIllIIl[0]];
                strArr31[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[97]];
                if (lllIlIIIlll(Inventory.contains(strArr31) ? 1 : 0)) {
                    aJ();
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[131])) {
                aJ();
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[132])) {
                if (lllIlIIIlll(Widgets.get(lIIIllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] strArr32 = new String[lIIIllIIl[0]];
                    strArr32[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[134]];
                    Inventory.getFirst(strArr32).interact(lIIIllIII[lIIIllIIl[135]]);
                    Time.sleepTicks(lIIIllIIl[13]);
                    "".length();
                }
                if (lllIlIIlIIl(Widgets.get(lIIIllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click(Widgets.get(lIIIllIIl[133], lIIIllIIl[55]).getClickPoint().getX(), Widgets.get(lIIIllIIl[133], lIIIllIIl[55]).getClickPoint().getY(), (boolean) lIIIllIIl[0]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIllIIl[133], lIIIllIIl[65]).getClickPoint().getX(), Widgets.get(lIIIllIIl[133], lIIIllIIl[65]).getClickPoint().getY(), (boolean) lIIIllIIl[0]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIllIIl[133], lIIIllIIl[67]).getClickPoint().getX(), Widgets.get(lIIIllIIl[133], lIIIllIIl[67]).getClickPoint().getY(), (boolean) lIIIllIIl[0]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIllIIl[133], lIIIllIIl[22]).getClickPoint().getX(), Widgets.get(lIIIllIIl[133], lIIIllIIl[22]).getClickPoint().getY(), (boolean) lIIIllIIl[0]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIllIIl[133], lIIIllIIl[76]).getClickPoint().getX(), Widgets.get(lIIIllIIl[133], lIIIllIIl[76]).getClickPoint().getY(), (boolean) lIIIllIIl[0]);
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIllIIl[133], lIIIllIIl[79]).getClickPoint().getX(), Widgets.get(lIIIllIIl[133], lIIIllIIl[79]).getClickPoint().getY(), (boolean) lIIIllIIl[0]);
                    Time.sleepTicks(lIIIllIIl[8]);
                    "".length();
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[136])) {
                aJ();
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[137])) {
                String[] strArr33 = new String[lIIIllIIl[0]];
                strArr33[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[138]];
                if (lllIlIIIlll(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lIIIllIIl[0]];
                    strArr34[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[139]];
                    Item first3 = Inventory.getFirst(strArr34);
                    String[] strArr35 = new String[lIIIllIIl[0]];
                    strArr35[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[140]];
                    first3.useOn(Inventory.getFirst(strArr35));
                    Time.sleepTicks(lIIIllIIl[9]);
                    "".length();
                }
            }
            if (lllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[141])) {
                if (lllIlIIlIII(cl, lIIIllIIl[0])) {
                    an.oL += lIIIllIIl[0];
                    an.o(AccBuilderEasyClues.m);
                    cl += lIIIllIIl[0];
                    an.oL = lIIIllIIl[1];
                    cm = lIIIllIIl[1];
                }
                aJ();
            }
            C0006g.a(bR);
        }
    }

    static {
        lllIlIIIlIl();
        lllIlIIIlII();
        bv = new ArrayList();
        co = new WorldArea(lIIIllIIl[163], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]);
        cp = new WorldArea(lIIIllIIl[164], lIIIllIIl[165], lIIIllIIl[166], lIIIllIIl[142], lIIIllIIl[1]);
        cq = new WorldArea(lIIIllIIl[164], lIIIllIIl[165], lIIIllIIl[166], lIIIllIIl[142], lIIIllIIl[0]);
        bX = new WorldPoint(lIIIllIIl[167], lIIIllIIl[168], lIIIllIIl[1]);
        cr = new WorldPoint(lIIIllIIl[169], lIIIllIIl[170], lIIIllIIl[1]);
        cs = new WorldPoint(lIIIllIIl[171], lIIIllIIl[172], lIIIllIIl[1]);
        String[] strArr = new String[lIIIllIIl[21]];
        strArr[lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[173]];
        strArr[lIIIllIIl[0]] = lIIIllIII[lIIIllIIl[174]];
        strArr[lIIIllIIl[9]] = lIIIllIII[lIIIllIIl[175]];
        strArr[lIIIllIIl[11]] = lIIIllIII[lIIIllIIl[176]];
        strArr[lIIIllIIl[13]] = lIIIllIII[lIIIllIIl[100]];
        strArr[lIIIllIIl[8]] = lIIIllIII[lIIIllIIl[177]];
        strArr[lIIIllIIl[16]] = lIIIllIII[lIIIllIIl[178]];
        strArr[lIIIllIIl[20]] = lIIIllIII[lIIIllIIl[179]];
        bR = strArr;
        ct = lIIIllIIl[1];
        cu = lIIIllIII[lIIIllIIl[180]];
    }

    private static String lllIlIIIIIl(String lIIIllIllllIlIl, String lIIIllIllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIllllIlII.getBytes(StandardCharsets.UTF_8)), lIIIllIIl[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIl[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIllIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIllllIllI) {
            lIIIllIllllIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIllIIl[1];
    }

    private static void lllIlIIIlIl() {
        lIIIllIIl = new int[182];
        lIIIllIIl[0] = " ".length();
        lIIIllIIl[1] = (36 ^ 14) & ((107 ^ 65) ^ (-1));
        lIIIllIIl[2] = (("   ".length() + (((1 + 101) - (-13)) + 96)) - (98 ^ 45)) + (12 ^ 101);
        lIIIllIIl[3] = (115 ^ 118) ^ (49 ^ 117);
        lIIIllIIl[4] = (41 ^ 61) ^ (189 ^ 163);
        lIIIllIIl[5] = (-((-441) & 8186)) & (-24577) & 32623;
        lIIIllIIl[6] = (77 ^ 17) ^ (245 ^ 149);
        lIIIllIIl[7] = (-28745) & 29051;
        lIIIllIIl[8] = (26 ^ 85) ^ (203 ^ 129);
        lIIIllIIl[9] = "  ".length();
        lIIIllIIl[10] = 186 ^ 154;
        lIIIllIIl[11] = "   ".length();
        lIIIllIIl[12] = (((160 + 114) - 268) + 203) ^ (((33 + 48) - (-25)) + 88);
        lIIIllIIl[13] = (33 ^ 125) ^ (70 ^ 30);
        lIIIllIIl[14] = (((3 + 75) - (-48)) + 41) ^ (((107 + 42) - 118) + 101);
        lIIIllIIl[15] = (8 ^ 34) ^ (46 ^ 54);
        lIIIllIIl[16] = 172 ^ 170;
        lIIIllIIl[17] = (-11273) & 12282;
        lIIIllIIl[18] = (-((-3093) & 28023)) & (-1154) & 28159;
        lIIIllIIl[19] = (73 ^ 33) ^ (242 ^ 147);
        lIIIllIIl[20] = (227 ^ 155) ^ (((95 + 31) - 81) + 82);
        lIIIllIIl[21] = (91 ^ 11) ^ (3 ^ 91);
        lIIIllIIl[22] = 36 ^ 12;
        lIIIllIIl[23] = (144 ^ 181) ^ (188 ^ 146);
        lIIIllIIl[24] = 153 ^ 149;
        lIIIllIIl[25] = (10 ^ 37) ^ (62 ^ 28);
        lIIIllIIl[26] = (152 ^ 140) ^ (78 ^ 84);
        lIIIllIIl[27] = (-((-17227) & 27487)) & (-16452) & 31711;
        lIIIllIIl[28] = (81 ^ 44) ^ (247 ^ 133);
        lIIIllIIl[29] = (-20549) & 22479;
        lIIIllIIl[30] = (-8481) & 28095;
        lIIIllIIl[31] = (-((-20229) & 32591)) & (-769) & 32751;
        lIIIllIIl[32] = (-3250) & 3775;
        lIIIllIIl[33] = (-((-10549) & 15285)) & (-25665) & 32751;
        lIIIllIIl[34] = (-2085) & 14709;
        lIIIllIIl[35] = (156 ^ 183) ^ (128 ^ 187);
        lIIIllIIl[36] = (-((-9539) & 26051)) & (-49) & 24567;
        lIIIllIIl[37] = (-14897) & 16251;
        lIIIllIIl[38] = (-((-18057) & 30429)) & (-17537) & 32255;
        lIIIllIIl[39] = (-((-9973) & 32757)) & (-33) & 24559;
        lIIIllIIl[40] = (-((-4343) & 31231)) & (-4161) & 32766;
        lIIIllIIl[41] = (-16997) & 27492;
        lIIIllIIl[42] = 151 ^ 134;
        lIIIllIIl[43] = (-((-7954) & 24503)) & (-17) & 24575;
        lIIIllIIl[44] = (-26948) & 27499;
        lIIIllIIl[45] = (-10241) & 11235;
        lIIIllIIl[46] = 150 ^ 132;
        lIIIllIIl[47] = (((76 + 129) - 99) + 39) ^ (((21 + 38) - (-10)) + 68);
        lIIIllIIl[48] = (((179 + 93) - 139) + 49) ^ (((130 + 29) - 42) + 45);
        lIIIllIIl[49] = "  ".length() ^ (54 ^ 33);
        lIIIllIIl[50] = (((13 + 23) - (-76)) + 65) ^ (((110 + 103) - 133) + 87);
        lIIIllIIl[51] = 214 ^ 193;
        lIIIllIIl[52] = (-25283) & 28379;
        lIIIllIIl[53] = (-8388) & 11747;
        lIIIllIIl[54] = (116 ^ 123) ^ (136 ^ 158);
        lIIIllIIl[55] = 3 ^ 25;
        lIIIllIIl[56] = (-12801) & 16154;
        lIIIllIIl[57] = (((37 + 135) - 96) + 83) ^ (((57 + 11) - 54) + 118);
        lIIIllIIl[58] = 176 ^ 172;
        lIIIllIIl[59] = 144 ^ 141;
        lIIIllIIl[60] = (-((-14506) & 32235)) & (-10753) & 32759;
        lIIIllIIl[61] = (-((-1105) & 21585)) & (-259) & 24403;
        lIIIllIIl[62] = (-((-2051) & 14851)) & (-16385) & 32703;
        lIIIllIIl[63] = (-20225) & 24510;
        lIIIllIIl[64] = (((106 + 72) - 101) + 61) ^ (((92 + 145) - 101) + 12);
        lIIIllIIl[65] = 52 ^ 43;
        lIIIllIIl[66] = (((133 + 29) - 88) + 105) ^ (((28 + 12) - (-91)) + 15);
        lIIIllIIl[67] = (73 ^ 86) ^ (12 ^ 49);
        lIIIllIIl[68] = (((89 + 21) - 91) + 112) ^ (((101 + 133) - 198) + 131);
        lIIIllIIl[69] = 67 ^ 102;
        lIIIllIIl[70] = (((121 + 101) - 128) + 47) ^ (((145 + 48) - 42) + 20);
        lIIIllIIl[71] = 76 ^ 107;
        lIIIllIIl[72] = 186 ^ 147;
        lIIIllIIl[73] = (-7004) & 65503;
        lIIIllIIl[74] = (-2218) & 65517;
        lIIIllIIl[75] = 127 ^ 85;
        lIIIllIIl[76] = (199 ^ 192) ^ (154 ^ 182);
        lIIIllIIl[77] = 178 ^ 158;
        lIIIllIIl[78] = (100 ^ 17) ^ (84 ^ 12);
        lIIIllIIl[79] = (219 ^ 163) ^ (252 ^ 170);
        lIIIllIIl[80] = (167 ^ 184) ^ (178 ^ 130);
        lIIIllIIl[81] = (44 ^ 99) ^ (((18 + 72) - 29) + 66);
        lIIIllIIl[82] = (246 ^ 180) ^ (228 ^ 151);
        lIIIllIIl[83] = (-4169) & 6093;
        lIIIllIIl[84] = (134 ^ 155) ^ (171 ^ 133);
        lIIIllIIl[85] = 243 ^ 199;
        lIIIllIIl[86] = 66 ^ 119;
        lIIIllIIl[87] = 130 ^ 180;
        lIIIllIIl[88] = (254 ^ 191) ^ (207 ^ 185);
        lIIIllIIl[89] = 87 ^ 17;
        lIIIllIIl[90] = (((198 + 102) - 144) + 50) ^ (((64 + 96) - 85) + 60);
        lIIIllIIl[91] = (-8225) & 11686;
        lIIIllIIl[92] = (-16905) & 20463;
        lIIIllIIl[93] = (8 ^ 114) ^ (116 ^ 54);
        lIIIllIIl[94] = (((55 + 146) - 198) + 159) ^ (((150 + 78) - 192) + 119);
        lIIIllIIl[95] = (139 ^ 154) ^ (227 ^ 190);
        lIIIllIIl[96] = 191 ^ 133;
        lIIIllIIl[97] = 6 ^ 86;
        lIIIllIIl[98] = 119 ^ 76;
        lIIIllIIl[99] = 108 ^ 54;
        lIIIllIIl[100] = 71 ^ 35;
        lIIIllIIl[101] = 17 ^ 44;
        lIIIllIIl[102] = 139 ^ 181;
        lIIIllIIl[103] = (-((-19081) & 23179)) & (-24705) & 32655;
        lIIIllIIl[104] = (221 ^ 142) ^ (44 ^ 64);
        lIIIllIIl[105] = 24 ^ 96;
        lIIIllIIl[106] = (((59 ^ 77) + (163 ^ 174)) - (96 ^ 5)) + (92 ^ 56);
        lIIIllIIl[107] = (20 ^ 10) ^ (195 ^ 157);
        lIIIllIIl[108] = (((59 ^ 17) + (101 ^ 124)) - (-(95 ^ 84))) + (140 ^ 178);
        lIIIllIIl[109] = 43 ^ 105;
        lIIIllIIl[110] = (-((-2721) & 24239)) & (-81) & 24575;
        lIIIllIIl[111] = (-12801) & 16039;
        lIIIllIIl[112] = (-20755) & 23994;
        lIIIllIIl[113] = (((150 + 139) - 107) + 25) ^ (((17 + 20) - (-98)) + 5);
        lIIIllIIl[114] = (198 ^ 131) ^ " ".length();
        lIIIllIIl[115] = 37 ^ 96;
        lIIIllIIl[116] = (((138 ^ 134) + (24 ^ 58)) - (-(199 ^ 152))) + (191 ^ 182);
        lIIIllIIl[117] = (-((-3457) & 32219)) & (-769) & 32639;
        lIIIllIIl[118] = (-29346) & 32691;
        lIIIllIIl[119] = (((7 + 160) - 145) + 192) ^ (((29 + 86) - 11) + 41);
        lIIIllIIl[120] = 209 ^ 153;
        lIIIllIIl[121] = ((129 + 12) - 102) + 121;
        lIIIllIIl[122] = ((130 + 29) - 76) + 87;
        lIIIllIIl[123] = (-((-3071) & 31743)) & (-1153) & 32755;
        lIIIllIIl[124] = (-((-11321) & 15935)) & (-16394) & 24543;
        lIIIllIIl[125] = 90 ^ 16;
        lIIIllIIl[126] = (134 ^ 187) ^ (45 ^ 91);
        lIIIllIIl[127] = (((((165 + 51) - 95) + 50) + (((100 + 113) - 104) + 44)) - ((-514) & 791)) + ((18 + 86) - 13) + 43;
        lIIIllIIl[128] = (((23 + 36) - (-5)) + 187) ^ (((82 + 54) - 105) + 151);
        lIIIllIIl[129] = (136 ^ 182) ^ (220 ^ 172);
        lIIIllIIl[130] = 30 ^ 81;
        lIIIllIIl[131] = (((105 ^ 99) + (113 ^ 11)) - (-(89 ^ 65))) + (144 ^ 178);
        lIIIllIIl[132] = ((142 + 148) - 243) + 153;
        lIIIllIIl[133] = (-((-17617) & 24286)) & (-16385) & 23533;
        lIIIllIIl[134] = 216 ^ 137;
        lIIIllIIl[135] = (((17 + 95) - 73) + 181) ^ (((132 + 85) - 76) + 1);
        lIIIllIIl[136] = (((((130 + 27) - 25) + 21) + (((17 + 17) - (-78)) + 24)) - (((117 + 56) - 50) + 21)) + (86 ^ 23);
        lIIIllIIl[137] = ((163 + 104) - 121) + 74;
        lIIIllIIl[138] = (44 ^ 21) ^ (241 ^ 155);
        lIIIllIIl[139] = (((206 + 224) - 229) + 29) ^ (((40 + 49) - 49) + 138);
        lIIIllIIl[140] = 69 ^ 16;
        lIIIllIIl[141] = ((22 + 185) - 59) + 82;
        lIIIllIIl[142] = 4 ^ 82;
        lIIIllIIl[143] = 110 ^ 57;
        lIIIllIIl[144] = 73 ^ 17;
        lIIIllIIl[145] = 99 ^ 58;
        lIIIllIIl[146] = 116 ^ 47;
        lIIIllIIl[147] = (-((-16867) & 25575)) & (-4228) & 14335;
        lIIIllIIl[148] = (-12586) & 14185;
        lIIIllIIl[149] = (-((-8265) & 29534)) & (-2051) & 32639;
        lIIIllIIl[150] = (-((-1795) & 26502)) & (-33) & 31739;
        lIIIllIIl[151] = (-20496) & 22495;
        lIIIllIIl[152] = (-16449) & 21998;
        lIIIllIIl[153] = (-2057) & 28616;
        lIIIllIIl[154] = (-((-641) & 32386)) & (-19) & 32763;
        lIIIllIIl[155] = (-12417) & 15871;
        lIIIllIIl[156] = (-((-10009) & 26395)) & (-4097) & 32462;
        lIIIllIIl[157] = (-((-25337) & 31487)) & (-1602) & 32751;
        lIIIllIIl[158] = (-((-17419) & 31950)) & (-16393) & 32223;
        lIIIllIIl[159] = (235 ^ 143) ^ (109 ^ 85);
        lIIIllIIl[160] = (46 ^ 108) ^ (145 ^ 142);
        lIIIllIIl[161] = 114 ^ 44;
        lIIIllIIl[162] = 200 ^ 151;
        lIIIllIIl[163] = (-4525) & 7615;
        lIIIllIIl[164] = (-20625) & 24061;
        lIIIllIIl[165] = (-((-6189) & 14383)) & (-513) & 12207;
        lIIIllIIl[166] = (((18 ^ 6) + (131 ^ 139)) - (-(17 ^ 120))) + (104 ^ 18);
        lIIIllIIl[167] = (-5001) & 8093;
        lIIIllIIl[168] = (-20642) & 23999;
        lIIIllIIl[169] = (-((-29389) & 30413)) & (-16403) & 20223;
        lIIIllIIl[170] = (-((-5177) & 13497)) & (-16906) & 28639;
        lIIIllIIl[171] = (-28684) & 32303;
        lIIIllIIl[172] = (-4617) & 8143;
        lIIIllIIl[173] = (46 ^ 97) ^ (170 ^ 133);
        lIIIllIIl[174] = (((116 + 109) - 146) + 133) ^ (((158 + 66) - 105) + 62);
        lIIIllIIl[175] = 98 ^ 0;
        lIIIllIIl[176] = (130 ^ 173) ^ (11 ^ 71);
        lIIIllIIl[177] = 238 ^ 139;
        lIIIllIIl[178] = 79 ^ 41;
        lIIIllIIl[179] = (95 ^ 61) ^ (153 ^ 156);
        lIIIllIIl[180] = (2 ^ 8) ^ (161 ^ 195);
        lIIIllIIl[181] = 46 ^ 71;
    }

    private static boolean lllIlIIlllI(int i) {
        return i < 0;
    }

    private static boolean lllIlIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIlIIIl(int i, int i2) {
        return i != i2;
    }

    private static String lllIlIIIIll(String lIIIlllIIIIIIlI, String lIIIlllIIIIIIIl) {
        try {
            SecretKeySpec lIIIlllIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIIl[9], lIIIlllIIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlllIIIIIIll) {
            lIIIlllIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlII() {
        lIIIllIII = new String[lIIIllIIl[181]];
        lIIIllIII[lIIIllIIl[1]] = lllIlIIIIIl("68kxOthWA0smAFRy5TfUiPsdZnUoeF0tU4gMyljkolESIN9jYcKaSBxDp2SsDHVB", "YVTDD");
        lIIIllIII[lIIIllIIl[0]] = lllIlIIIIIl("7nswVvBYvyDfTfIEzGHc7A==", "wlKqP");
        lIIIllIII[lIIIllIIl[9]] = lllIlIIIIIl("mCUSQpoblANq35xoXxYx0w==", "fKWiO");
        lIIIllIII[lIIIllIIl[11]] = lllIlIIIIIl("tweSbes8NTfDnPS+OPY8DUke7PkitCnk", "lOJKW");
        lIIIllIII[lIIIllIIl[13]] = lllIlIIIIlI("JjAqHhgMLCw=", "eBKxl");
        lIIIllIII[lIIIllIIl[8]] = lllIlIIIIIl("2lRcd2YmciS7nJOhHbO5rg==", "UomLs");
        lIIIllIII[lIIIllIIl[16]] = lllIlIIIIll("kI6ds9F030Yih5Dav41nZw==", "jobTI");
        lIIIllIII[lIIIllIIl[20]] = lllIlIIIIlI("Gg4WNzkvBEQUIyUV", "LodEV");
        lIIIllIII[lIIIllIIl[21]] = lllIlIIIIIl("1p9/0CAxyqle7MN//QZiig==", "qKbjo");
        lIIIllIII[lIIIllIIl[19]] = lllIlIIIIIl("cyiCLyY4b8nplZPVRkGhWw==", "naooz");
        lIIIllIII[lIIIllIIl[4]] = lllIlIIIIlI("LzckCwcbPHAOFwMp", "nYPbv");
        lIIIllIII[lIIIllIIl[23]] = lllIlIIIIIl("qSn/I5LU165uXDh8hdXAH3S8D0VEVAOq", "Xlnuw");
        lIIIllIII[lIIIllIIl[24]] = lllIlIIIIll("/fAOwrF28zH1CMJm9e7p2w==", "IzHAB");
        lIIIllIII[lIIIllIIl[25]] = lllIlIIIIIl("4YTVTmkWUxg=", "zaQIY");
        lIIIllIII[lIIIllIIl[26]] = lllIlIIIIIl("vl0L4ZYJPD8qj4aOv/cWWA==", "dQGVP");
        lIIIllIII[lIIIllIIl[28]] = lllIlIIIIlI("ISYGESgAKQ9VJggpAxwqDg==", "iGhuD");
        lIIIllIII[lIIIllIIl[35]] = lllIlIIIIlI("BhB2DRk0VTsFGCIcOAtLIAAzHx9xBiMcGz0cMx9HcQYhBR8yHT8CDHEBOUwpBCwfIiw=", "QuVlk");
        lIIIllIII[lIIIllIIl[42]] = lllIlIIIIlI("MT9sFBgDeiEcGRUzIhJKFy8pBh5GKTkFGgozKQZGRik7HB4FMiUbDUYuI1UoMwMFOy0=", "fZLuj");
        lIIIllIII[lIIIllIIl[46]] = lllIlIIIIll("K9bFzRKxP1w=", "RZkPo");
        lIIIllIII[lIIIllIIl[12]] = lllIlIIIIll("m3ujVHtzKnc=", "fDKru");
        lIIIllIII[lIIIllIIl[48]] = lllIlIIIIll("ovtfCCWBErA=", "YTFKS");
        lIIIllIII[lIIIllIIl[49]] = lllIlIIIIll("4sdlQrDOW5M=", "QajEe");
        lIIIllIII[lIIIllIIl[50]] = lllIlIIIIIl("a4+EzUb0ZJ8=", "xbcya");
        lIIIllIII[lIIIllIIl[51]] = lllIlIIIIIl("tyTAifbhPvjLpdQs/G7AFA==", "oLbwL");
        lIIIllIII[lIIIllIIl[47]] = lllIlIIIIlI("KQYr", "hpJyu");
        lIIIllIII[lIIIllIIl[54]] = lllIlIIIIlI("FRofPys2BhU=", "WupTH");
        lIIIllIII[lIIIllIIl[55]] = lllIlIIIIll("peLb9dB2738=", "eEPMg");
        lIIIllIII[lIIIllIIl[57]] = lllIlIIIIll("PjU5a+kgTcEsg7wz7ZJ+qA==", "CaNld");
        lIIIllIII[lIIIllIIl[58]] = lllIlIIIIll("n59VpzSMP8s=", "rpEni");
        lIIIllIII[lIIIllIIl[59]] = lllIlIIIIll("TEoB24kUsTg=", "BMKol");
        lIIIllIII[lIIIllIIl[64]] = lllIlIIIIlI("Gy8EcTc6bhE5Iic6FyM=", "UNrQC");
        lIIIllIII[lIIIllIIl[65]] = lllIlIIIIll("ZJzYjYMZpffWhjXdE4jxyTBfNd7vvMGn", "PzhvQ");
        lIIIllIII[lIIIllIIl[10]] = lllIlIIIIlI("HDoWIwg=", "HHwGm");
        lIIIllIII[lIIIllIIl[66]] = lllIlIIIIIl("D+805116j0c=", "hhCWH");
        lIIIllIII[lIIIllIIl[67]] = lllIlIIIIIl("keXvXeuvQnooeA3xzciv1Q==", "SRSFP");
        lIIIllIII[lIIIllIIl[14]] = lllIlIIIIIl("xrjdDvPoZ2g=", "HouGX");
        lIIIllIII[lIIIllIIl[68]] = lllIlIIIIll("BvKiTNP7gbWULPitWWlWhw==", "yKJwy");
        lIIIllIII[lIIIllIIl[69]] = lllIlIIIIIl("6wTXDaf14a2Awu8yg5CGZw==", "sBfyU");
        lIIIllIII[lIIIllIIl[70]] = lllIlIIIIIl("Lc3+qF8Sugk=", "xlGVc");
        lIIIllIII[lIIIllIIl[71]] = lllIlIIIIlI("ATUANhY=", "CZnSe");
        lIIIllIII[lIIIllIIl[22]] = lllIlIIIIlI("ESsMPTw=", "SDbXO");
        lIIIllIII[lIIIllIIl[72]] = lllIlIIIIll("QePvyDxYZRY=", "QqjoG");
        lIIIllIII[lIIIllIIl[75]] = lllIlIIIIIl("a5/MVyHsSZo=", "JuWiG");
        lIIIllIII[lIIIllIIl[76]] = lllIlIIIIIl("BSiRyR44qIXipOUkY1OAKg==", "twGtz");
        lIIIllIII[lIIIllIIl[77]] = lllIlIIIIlI("KAY/FSZGDjkPKg==", "kjVxD");
        lIIIllIII[lIIIllIIl[78]] = lllIlIIIIlI("GA4fHwA/AB0=", "Zaqzm");
        lIIIllIII[lIIIllIIl[79]] = lllIlIIIIIl("7dvFiEYNPN9TRdRQ+exXag==", "ZMKzs");
        lIIIllIII[lIIIllIIl[80]] = lllIlIIIIlI("NisFAAIINA==", "aDwsj");
        lIIIllIII[lIIIllIIl[81]] = lllIlIIIIlI("MQE6ID0WDzg=", "snTEP");
        lIIIllIII[lIIIllIIl[82]] = lllIlIIIIIl("jz3wm/+3lRE2RiKucKBvsQ==", "dwufN");
        lIIIllIII[lIIIllIIl[15]] = lllIlIIIIIl("qAKBb3sZyUk=", "nnoOH");
        lIIIllIII[lIIIllIIl[84]] = lllIlIIIIIl("3PbaOzRgfCg=", "zosuz");
        lIIIllIII[lIIIllIIl[85]] = lllIlIIIIIl("W5ZFHJ3XA1I=", "YarNa");
        lIIIllIII[lIIIllIIl[86]] = lllIlIIIIlI("OxY9BDI=", "zzTgW");
        lIIIllIII[lIIIllIIl[87]] = lllIlIIIIIl("2qhHBP1Z2xw=", "SDiNW");
        lIIIllIII[lIIIllIIl[88]] = lllIlIIIIll("dmXt3kOMTKI=", "cunXB");
        lIIIllIII[lIIIllIIl[93]] = lllIlIIIIlI("OhQkayQbVTE5PxoQ", "tuRKP");
        lIIIllIII[lIIIllIIl[94]] = lllIlIIIIlI("PxY8RzECFTYC", "pzXgR");
        lIIIllIII[lIIIllIIl[96]] = lllIlIIIIlI("GxYiESo6Gg==", "VwNrE");
        lIIIllIII[lIIIllIIl[98]] = lllIlIIIIIl("5mCuuR0odoc=", "yyeKW");
        lIIIllIII[lIIIllIIl[6]] = lllIlIIIIlI("PCU5CB8dKQ==", "qDUkp");
        lIIIllIII[lIIIllIIl[101]] = lllIlIIIIIl("OMLNH118Npv6gmfJFHI62A==", "fqsTY");
        lIIIllIII[lIIIllIIl[102]] = lllIlIIIIIl("XwNYEUZCR0KQFUsWs5SFKQ==", "yEkIl");
        lIIIllIII[lIIIllIIl[104]] = lllIlIIIIll("XdEzWVtQzIUPnqTavVRbjA==", "JsDEt");
        lIIIllIII[lIIIllIIl[107]] = lllIlIIIIlI("HCQzIA0=", "KMGCe");
        lIIIllIII[lIIIllIIl[3]] = lllIlIIIIlI("BhsRCgs=", "Qreic");
        lIIIllIII[lIIIllIIl[109]] = lllIlIIIIlI("JQg/RAQGDiMBHQ==", "giMdi");
        lIIIllIII[lIIIllIIl[113]] = lllIlIIIIll("FgUNmz6PDpRH2iWqCsR/qQ==", "pVRdB");
        lIIIllIII[lIIIllIIl[114]] = lllIlIIIIll("Rl21B7cPDp0=", "grDBy");
        lIIIllIII[lIIIllIIl[115]] = lllIlIIIIIl("pF1MXSykATRNFRoo5wKecg==", "nrMgK");
        lIIIllIII[lIIIllIIl[89]] = lllIlIIIIll("XPojP3L4ciODuBcAP2z/OA==", "fFEml");
        lIIIllIII[lIIIllIIl[119]] = lllIlIIIIlI("Fy0sCScmYzweIyc=", "BCHlF");
        lIIIllIII[lIIIllIIl[120]] = lllIlIIIIlI("OgAaPQ==", "yhuMi");
        lIIIllIII[lIIIllIIl[90]] = lllIlIIIIlI("EBEJIA==", "GthRM");
        lIIIllIII[lIIIllIIl[125]] = lllIlIIIIIl("8Tlrd5pT25UiSTO5KUit1Q==", "tdBtU");
        lIIIllIII[lIIIllIIl[126]] = lllIlIIIIll("cNcCV7eJzcs=", "EBliq");
        lIIIllIII[lIIIllIIl[95]] = lllIlIIIIll("wHysexvZJhw=", "jGZQR");
        lIIIllIII[lIIIllIIl[128]] = lllIlIIIIll("IF6Y+3BjaV9r/pwse7QYCg==", "SwLTh");
        lIIIllIII[lIIIllIIl[129]] = lllIlIIIIlI("OzcpIg0KeTk1CQs=", "nYMGl");
        lIIIllIII[lIIIllIIl[130]] = lllIlIIIIIl("q8pu68665jQ=", "IgsDR");
        lIIIllIII[lIIIllIIl[97]] = lllIlIIIIll("PFxap7EO2/GND+jwe1A4hQ==", "qHxPO");
        lIIIllIII[lIIIllIIl[134]] = lllIlIIIIlI("JykGPCwHLx15Ixo4ECo=", "uLuYM");
        lIIIllIII[lIIIllIIl[135]] = lllIlIIIIIl("xncXskMZ1T067V9eGkjCnQ==", "WCZiJ");
        lIIIllIII[lIIIllIIl[138]] = lllIlIIIIlI("JGcXNTYRIhU6", "eGgTB");
        lIIIllIII[lIIIllIIl[139]] = lllIlIIIIIl("ofSKIpuWTrQ7WazLwWxiyQ==", "zQusg");
        lIIIllIII[lIIIllIIl[140]] = lllIlIIIIlI("MQAfMXQVBAwhPBwT", "yamUT");
        lIIIllIII[lIIIllIIl[142]] = lllIlIIIIIl("HHPzYxTTPV1r+G6mFkrHDg==", "hdjDX");
        lIIIllIII[lIIIllIIl[143]] = lllIlIIIIll("pnG7qJxZUm8=", "ziRfL");
        lIIIllIII[lIIIllIIl[144]] = lllIlIIIIll("ZOeLHaY8fEluQioDoO/g0g==", "TJRXi");
        lIIIllIII[lIIIllIIl[145]] = lllIlIIIIIl("srCTacjZ5x8=", "KSopf");
        lIIIllIII[lIIIllIIl[99]] = lllIlIIIIIl("UC1tNanRgTQh1LPk2o2ODw==", "eYXsE");
        lIIIllIII[lIIIllIIl[146]] = lllIlIIIIlI("KygEHigQ", "xMelK");
        lIIIllIII[lIIIllIIl[159]] = lllIlIIIIlI("", "UTGfR");
        lIIIllIII[lIIIllIIl[160]] = lllIlIIIIlI("Cz8iNComcQY4LCQ0PzA4Jw==", "JQKYK");
        lIIIllIII[lIIIllIIl[161]] = lllIlIIIIlI("GTwYC0IEM1YbBwo5AgRCQw==", "kUvlb");
        lIIIllIII[lIIIllIIl[162]] = lllIlIIIIlI("MxgcKg==", "wjsZW");
        lIIIllIII[lIIIllIIl[173]] = lllIlIIIIIl("8R7arJx5zbI=", "hZVxI");
        lIIIllIII[lIIIllIIl[174]] = lllIlIIIIll("7/TLbDWJjZwDNN7KzTeKcmJBTnAKNdl1", "YxHGn");
        lIIIllIII[lIIIllIIl[175]] = lllIlIIIIll("gIiCaKz/oyx7OGYMSd9uCM2Mscr3yXE+yzAZakQp2yg87rqWhWFefnb1FnaTt0VW", "UAeVw");
        lIIIllIII[lIIIllIIl[176]] = lllIlIIIIIl("KROpCav6fBSqvhLqeCbs294lNoUI24p6sEaicIkLVr47NqdEgEugvg==", "fGRHI");
        lIIIllIII[lIIIllIIl[100]] = lllIlIIIIlI("JwY3GD5EIGIWLx1JcFQ5DAAhHz8KGn0=", "diBtZ");
        lIIIllIII[lIIIllIIl[177]] = lllIlIIIIlI("JnUsZB0KICRkFA09NDBVDnIwMRAcJm8=", "oRADu");
        lIIIllIII[lIIIllIIl[178]] = lllIlIIIIll("PTXqe53gj5u6RlhN9+mQJyi/eSpr0jefkcBva7X4vX6rjLHw0DqRiL/elgRw17TB", "pNsrE");
        lIIIllIII[lIIIllIIl[179]] = lllIlIIIIlI("DlcUbQ4oBhVtDSkVXG0WLxEeJhFp", "GppMb");
        lIIIllIII[lIIIllIIl[180]] = lllIlIIIIll("a8J2HZxc2Ac=", "rgoAl");
    }

    private static boolean lllIlIIllII(Object obj) {
        return obj != null;
    }
}
