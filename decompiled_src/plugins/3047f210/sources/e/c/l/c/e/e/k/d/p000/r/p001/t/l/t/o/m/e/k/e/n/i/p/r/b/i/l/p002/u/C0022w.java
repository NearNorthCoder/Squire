package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/w.class */
public class C0022w implements S {
    private static final /* synthetic */ WorldPoint fD;
    private static final /* synthetic */ WorldArea fP;
    private static final /* synthetic */ WorldPoint fy;
    private static final /* synthetic */ int fU;
    public static final /* synthetic */ WorldArea fd;
    public static final /* synthetic */ WorldArea fi;
    public static /* synthetic */ int gb;
    public static final /* synthetic */ WorldPoint eZ;
    private static final /* synthetic */ WorldPoint fA;
    public static final /* synthetic */ WorldArea fe;
    private static final /* synthetic */ int fQ;
    private static final /* synthetic */ WorldPoint fz;
    static /* synthetic */ String gc;
    private static /* synthetic */ int[] gd;
    private static final /* synthetic */ WorldPoint fF;
    private static final /* synthetic */ WorldArea fO;
    private static final /* synthetic */ int ft;
    private static final /* synthetic */ int fv;
    private static /* synthetic */ int[] lllIlIlIlI;
    private static final /* synthetic */ WorldPoint fB;
    private static final /* synthetic */ int fq;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint fC;
    public static /* synthetic */ List<C0003d> bu;
    private static final /* synthetic */ int fo;
    private static final /* synthetic */ WorldArea fN;
    public static final /* synthetic */ WorldArea fg;
    private static final /* synthetic */ WorldPoint fE;
    private static final /* synthetic */ WorldPoint fH;
    public static final /* synthetic */ WorldArea fj;
    private static final /* synthetic */ int fV;
    private static final /* synthetic */ int fw;
    private static final /* synthetic */ int fk;
    private static final /* synthetic */ int fl;
    private static final /* synthetic */ int fW;
    static /* synthetic */ String[] eR;
    private static final /* synthetic */ WorldPoint fJ;
    private static final /* synthetic */ WorldPoint fK;
    private static final /* synthetic */ WorldPoint fx;
    public static final /* synthetic */ WorldArea ff;
    private static final /* synthetic */ int fr;
    private static final /* synthetic */ int fX;
    private static final /* synthetic */ int fm;
    public static final /* synthetic */ WorldArea fh;
    private static final /* synthetic */ int fs;
    private static final /* synthetic */ WorldPoint fL;
    private static /* synthetic */ String[] lllIlIlIII;
    private static final /* synthetic */ WorldPoint fM;
    private static final /* synthetic */ int fu;
    private static final /* synthetic */ int fR;
    private static final /* synthetic */ int fn;
    static /* synthetic */ int ck;
    public static final /* synthetic */ WorldPoint fa;
    public static final /* synthetic */ WorldArea fc;
    private static final /* synthetic */ int fY;
    private static final /* synthetic */ int fS;
    private static final /* synthetic */ WorldPoint fI;
    public static final /* synthetic */ WorldPoint fb;
    public static /* synthetic */ int ga;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int fT;
    private static final /* synthetic */ WorldPoint fG;
    private static final /* synthetic */ int fp;
    private static final /* synthetic */ int fZ;

    private static String llIIIlIllllIl(String lllllllllllllllllIllIllIIIIIllII, String lllllllllllllllllIllIllIIIIlIIII) {
        String lllllllllllllllllIllIllIIIIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllIllIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIllIIIIlIIII.toCharArray();
        int lllllllllllllllllIllIllIIIIIllIl = lllIlIlIlI[4];
        char[] charArray2 = lllllllllllllllllIllIllIIIIIllII2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIlI[4];
        while (llIIIllIIIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIllIllIIIIIllIl % charArray.length]));
            "".length();
            lllllllllllllllllIllIllIIIIIllIl++;
            i++;
            "".length();
            if (((((163 + 54) - 156) + 128) ^ (((97 + 183) - 189) + 94)) == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b24, code lost:
        if (llIIIllIIIlll(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.fL), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d90, code lost:
        if (llIIIllIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0dba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARN: Type inference failed for: r0v654, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bF() {
        if (llIIIllIIIIll(C0004e.j(lllIlIlIlI[0]), lllIlIlIlI[1])) {
            try {
                G.ct();
                "".length();
                if ((-((((33 + 100) - 53) + 102) ^ (((60 + 79) - 60) + 100))) >= 0) {
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (llIIIllIIIlII(C0004e.j(lllIlIlIlI[0]), lllIlIlIlI[1]) && llIIIllIIIIll(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[3])) {
            if (llIIIllIIIlIl(bs ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[4]];
                C0001b.a(bu);
                if (llIIIllIIIIll(bu.size(), lllIlIlIlI[3])) {
                    System.out.println(lllIlIlIII[lllIlIlIlI[3]]);
                    bs = lllIlIlIlI[4];
                }
            }
            do {
                if (llIIIllIIIlIl(C0019t.bl() ? 1 : 0)) {
                    int[] iArr = new int[lllIlIlIlI[3]];
                    iArr[lllIlIlIlI[4]] = lllIlIlIlI[5];
                    if (llIIIllIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lllIlIlIlI[3]];
                        iArr2[lllIlIlIlI[4]] = lllIlIlIlI[6];
                        if (llIIIllIIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lllIlIlIlI[3]];
                            iArr3[lllIlIlIlI[4]] = lllIlIlIlI[7];
                            if (llIIIllIIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lllIlIlIlI[3]];
                                iArr4[lllIlIlIlI[4]] = lllIlIlIlI[8];
                                if (llIIIllIIIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lllIlIlIlI[3]];
                                    iArr5[lllIlIlIlI[4]] = lllIlIlIlI[9];
                                    if (llIIIllIIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[lllIlIlIlI[3]];
                                        iArr6[lllIlIlIlI[4]] = lllIlIlIlI[10];
                                        if (!llIIIllIIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (llIIIllIIIllI(bs ? 1 : 0)) {
                                                if (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[11])) {
                                                    int[] iArr7 = new int[lllIlIlIlI[3]];
                                                    iArr7[lllIlIlIlI[4]] = lllIlIlIlI[10];
                                                    if (llIIIllIIIlIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[1]];
                                                        int[] iArr8 = new int[lllIlIlIlI[3]];
                                                        iArr8[lllIlIlIlI[4]] = lllIlIlIlI[10];
                                                        Inventory.getFirst(iArr8).interact(lllIlIlIII[lllIlIlIlI[12]]);
                                                        Time.sleepTicks(lllIlIlIlI[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (llIIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[11]) && llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[14])) {
                                                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[15]];
                                                    if (llIIIllIIIlIl(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIIllIIIIll(Movement.getRunEnergy(), lllIlIlIlI[16])) {
                                                        Inventory.getFirst(C0005f.aU).interact(lllIlIlIII[lllIlIlIlI[13]]);
                                                        Time.sleepTicks(lllIlIlIlI[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(fy);
                                                    "".length();
                                                    Time.sleepTicks(lllIlIlIlI[3]);
                                                    "".length();
                                                }
                                                if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[14])) {
                                                    C0006g.a(lllIlIlIII[lllIlIlIlI[14]], eR);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    bH();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                } else if (llIIIllIIIllI(bs ? 1 : 0)) {
                }
            } while (((106 ^ 63) ^ (19 ^ 66)) >= "  ".length());
            return;
        }
        if (llIIIllIIIlII(C0004e.j(lllIlIlIlI[0]), lllIlIlIlI[1]) && llIIIllIIIlII(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[3])) {
            if (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[15]) && llIIIllIIIllI(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[lllIlIlIlI[3]];
                iArr9[lllIlIlIlI[4]] = lllIlIlIlI[17];
                if (llIIIllIIIllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[18]];
                    Movement.walkTo(fB);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
            }
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[15]) && llIIIllIIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[lllIlIlIlI[3]];
                iArr10[lllIlIlIlI[4]] = lllIlIlIlI[17];
                if (llIIIllIIIllI(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lllIlIlIlI[3]];
                    iArr11[lllIlIlIlI[4]] = lllIlIlIlI[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (llIIIllIIIlIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[lllIlIlIlI[3]];
                        iArr12[lllIlIlIlI[4]] = lllIlIlIlI[8];
                        Inventory.getFirst(iArr12).interact(lllIlIlIII[lllIlIlIlI[20]]);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                    }
                    if (llIIIllIIIllI(Inventory.isFull() ? 1 : 0)) {
                        if (llIIIllIIlIIl(nearest) && llIIIllIIIllI(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[21]];
                            nearest.interact(lllIlIlIII[lllIlIlIlI[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(lllIlIlIlI[23], lllIlIlIlI[3]);
                        if (llIIIllIIlIIl(widget)) {
                            widget.interact(lllIlIlIII[lllIlIlIlI[24]]);
                            widget.interact(lllIlIlIlI[4]);
                            widget.interact(lllIlIlIII[lllIlIlIlI[25]]);
                            Keyboard.type(lllIlIlIII[lllIlIlIlI[26]]);
                        }
                    }
                }
            }
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[15])) {
                int[] iArr13 = new int[lllIlIlIlI[3]];
                iArr13[lllIlIlIlI[4]] = lllIlIlIlI[17];
                if (llIIIllIIIlIl(Inventory.contains(iArr13) ? 1 : 0) && llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[27]];
                    Movement.walkTo(fF);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
            }
            if (llIIIllIIIlIl(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[28]];
                if (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                    Movement.walkTo(fF);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
                if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                    String[] strArr = new String[lllIlIlIlI[3]];
                    strArr[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[30]];
                    if (llIIIllIIIlIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[lllIlIlIlI[3]];
                        iArr14[lllIlIlIlI[4]] = lllIlIlIlI[8];
                        Inventory.getFirst(iArr14).interact(lllIlIlIII[lllIlIlIlI[31]]);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                    }
                    if (llIIIllIIlIIl(nearest2)) {
                        String[] strArr2 = new String[lllIlIlIlI[3]];
                        strArr2[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[32]];
                        if (llIIIllIIIlIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lllIlIlIII[lllIlIlIlI[33]]);
                            Time.sleepTicks(lllIlIlIlI[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[lllIlIlIlI[3]];
                        strArr3[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[34]];
                        if (llIIIllIIIlIl(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(lllIlIlIII[lllIlIlIlI[35]]);
                            Time.sleepTicks(lllIlIlIlI[1]);
                            "".length();
                            Widget widget2 = Widgets.get(lllIlIlIlI[23], lllIlIlIlI[3]);
                            if (llIIIllIIlIIl(widget2)) {
                                widget2.interact(lllIlIlIII[lllIlIlIlI[36]]);
                                widget2.interact(lllIlIlIlI[4]);
                                widget2.interact(lllIlIlIII[lllIlIlIlI[37]]);
                                Keyboard.type(lllIlIlIII[lllIlIlIlI[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (llIIIllIIIlII(C0004e.j(lllIlIlIlI[0]), lllIlIlIlI[1]) && llIIIllIIIlII(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[1])) {
            ck = lllIlIlIlI[4];
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[22])) {
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[1]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    Movement.walkTo(fB);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[lllIlIlIlI[3]];
            iArr15[lllIlIlIlI[4]] = lllIlIlIlI[39];
            if (llIIIllIIIllI(Inventory.contains(iArr15) ? 1 : 0) && llIIIllIIIlIl(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[40]];
                if (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                    Movement.walkTo(fF);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
                if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                    String[] strArr4 = new String[lllIlIlIlI[3]];
                    strArr4[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[42]];
                    if (llIIIllIIlIIl(nearest3)) {
                        String[] strArr5 = new String[lllIlIlIlI[3]];
                        strArr5[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[43]];
                        if (llIIIllIIIlIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(lllIlIlIII[lllIlIlIlI[44]]);
                            Time.sleepTicks(lllIlIlIlI[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[lllIlIlIlI[3]];
                        strArr6[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[45]];
                        if (llIIIllIIIlIl(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(lllIlIlIII[lllIlIlIlI[46]]);
                            Time.sleepTicks(lllIlIlIlI[1]);
                            "".length();
                            Widget widget3 = Widgets.get(lllIlIlIlI[23], lllIlIlIlI[3]);
                            if (llIIIllIIlIIl(widget3)) {
                                widget3.interact(lllIlIlIII[lllIlIlIlI[47]]);
                                widget3.interact(lllIlIlIlI[4]);
                                widget3.interact(lllIlIlIII[lllIlIlIlI[48]]);
                                Keyboard.type(lllIlIlIII[lllIlIlIlI[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[lllIlIlIlI[3]];
            iArr16[lllIlIlIlI[4]] = lllIlIlIlI[39];
            if (llIIIllIIIlIl(Inventory.contains(iArr16) ? 1 : 0) && llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[3])) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[50]];
                Movement.walkTo(fC);
                "".length();
                Time.sleepTicks(lllIlIlIlI[3]);
                "".length();
            }
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[1])) {
                String[] strArr7 = new String[lllIlIlIlI[3]];
                strArr7[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[lllIlIlIlI[3]];
                strArr8[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (llIIIllIIlIIl(nearest4) && llIIIllIIlIlI(nearest5)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[53]];
                    String[] strArr9 = new String[lllIlIlIlI[3]];
                    strArr9[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[54]];
                    if (llIIIllIIIlIl(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lllIlIlIlI[3]];
                        strArr10[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
                if (llIIIllIIlIIl(nearest5)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[56]];
                    int[] iArr17 = new int[lllIlIlIlI[3]];
                    iArr17[lllIlIlIlI[4]] = lllIlIlIlI[39];
                    if (llIIIllIIIlIl(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lllIlIlIlI[3]];
                        iArr18[lllIlIlIlI[4]] = lllIlIlIlI[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
            }
        }
        if (llIIIllIIIlIl(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIIlII(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[12])) {
            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[57]];
            Movement.walkTo(new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[59], lllIlIlIlI[4]));
            "".length();
            Time.sleepTicks(lllIlIlIlI[3]);
            "".length();
        }
        if (llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIIlII(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[12])) {
            int[] iArr19 = new int[lllIlIlIlI[3]];
            iArr19[lllIlIlIlI[4]] = lllIlIlIlI[60];
            if (llIIIllIIIlIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lllIlIlIlI[3]];
                iArr20[lllIlIlIlI[4]] = lllIlIlIlI[60];
                if (llIIIllIIIlIl(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[61]];
            if (llIIIllIIlIll(Movement.getRunEnergy(), lllIlIlIlI[33])) {
                bG();
            }
        }
        if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fL), lllIlIlIlI[12])) {
            int[] iArr21 = new int[lllIlIlIlI[3]];
            iArr21[lllIlIlIlI[4]] = lllIlIlIlI[60];
            if (llIIIllIIIlIl(Inventory.contains(iArr21) ? 1 : 0) && llIIIllIIIlII(Players.getLocal().getWorldLocation().getX(), lllIlIlIlI[62])) {
                String[] strArr11 = new String[lllIlIlIlI[3]];
                strArr11[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (llIIIllIIlIIl(nearest6)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[64]];
                    int[] iArr22 = new int[lllIlIlIlI[3]];
                    iArr22[lllIlIlIlI[4]] = lllIlIlIlI[60];
                    if (llIIIllIIIlIl(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[lllIlIlIlI[3]];
                        iArr23[lllIlIlIlI[4]] = lllIlIlIlI[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(lllIlIlIlI[1]);
                        "".length();
                    }
                }
            }
        }
        if (llIIIllIIIlIl(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[lllIlIlIlI[3]];
            iArr24[lllIlIlIlI[4]] = lllIlIlIlI[60];
            if (llIIIllIIIlIl(Inventory.contains(iArr24) ? 1 : 0)) {
                if (llIIIllIIIllI(Players.getLocal().getWorldLocation().equals(fz) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[65]];
                    Movement.walkTo(fz);
                    "".length();
                }
                if (llIIIllIIlIII(Skills.getBoostedLevel(Skill.HITPOINTS), lllIlIlIlI[13])) {
                    int[] iArr25 = new int[lllIlIlIlI[3]];
                    iArr25[lllIlIlIlI[4]] = lllIlIlIlI[8];
                    if (llIIIllIIIlIl(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lllIlIlIlI[3]];
                        iArr26[lllIlIlIlI[4]] = lllIlIlIlI[8];
                        Inventory.getFirst(iArr26).interact(lllIlIlIII[lllIlIlIlI[66]]);
                    }
                }
                if (llIIIllIIIlIl(Players.getLocal().getWorldLocation().equals(fz) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(gd);
                    if (llIIIllIIlIIl(nearest7) && llIIIllIIIllI(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[67]];
                        if (llIIIllIIIIll(Skills.getLevel(Skill.MAGIC), lllIlIlIlI[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(lllIlIlIlI[3]);
                            "".length();
                        }
                        if (!llIIIllIIIIll(Skills.getLevel(Skill.MAGIC), lllIlIlIlI[26]) || llIIIllIIIIll(Skills.getLevel(Skill.MAGIC), lllIlIlIlI[21])) {
                            if (llIIIllIIlIll(Skills.getLevel(Skill.MAGIC), lllIlIlIlI[21])) {
                                int[] iArr27 = new int[lllIlIlIlI[3]];
                                iArr27[lllIlIlIlI[4]] = lllIlIlIlI[6];
                                if (llIIIllIIIlIl(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[lllIlIlIlI[3]];
                                    strArr12[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[68]];
                                }
                            }
                            if (llIIIllIIlIll(Skills.getLevel(Skill.MAGIC), lllIlIlIlI[26])) {
                                String[] strArr13 = new String[lllIlIlIlI[3]];
                                strArr13[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[69]];
                                if (llIIIllIIIlIl(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(lllIlIlIlI[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        if (llIIIllIIlIll(Skills.getLevel(Skill.MAGIC), lllIlIlIlI[26])) {
                        }
                    }
                }
            }
        }
        if (llIIIllIIIlII(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[14])) {
            String[] strArr14 = new String[lllIlIlIlI[3]];
            strArr14[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[70]];
            if (llIIIllIIIllI(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[lllIlIlIlI[3]];
                strArr15[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (llIIIllIIlIIl(nearest8)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[72]];
                    nearest8.interact(lllIlIlIII[lllIlIlIlI[73]]);
                    Time.sleepTicks(lllIlIlIlI[1]);
                    "".length();
                }
            }
        }
        if (llIIIllIIIlII(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[14])) {
            String[] strArr16 = new String[lllIlIlIlI[3]];
            strArr16[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[74]];
            if (llIIIllIIIlIl(Inventory.contains(strArr16) ? 1 : 0)) {
                if (llIIIllIIIlIl(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[lllIlIlIlI[3]];
                    iArr28[lllIlIlIlI[4]] = lllIlIlIlI[10];
                    if (llIIIllIIIlIl(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[75]];
                        int[] iArr29 = new int[lllIlIlIlI[3]];
                        iArr29[lllIlIlIlI[4]] = lllIlIlIlI[10];
                        Inventory.getFirst(iArr29).interact(lllIlIlIII[lllIlIlIlI[76]]);
                        Time.sleepTicks(lllIlIlIlI[13]);
                        "".length();
                    }
                }
                if (llIIIllIIIllI(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[15])) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[77]];
                    Movement.walkTo(fy);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                }
                if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[13])) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[78]];
                    if (llIIIllIIIIll(ck, lllIlIlIlI[3])) {
                        ac.jU += lllIlIlIlI[3];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllIlIlIlI[3];
                        ac.jU = lllIlIlIlI[4];
                        cl = lllIlIlIlI[4];
                    }
                    C0006g.a(lllIlIlIII[lllIlIlIlI[79]], eR);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIIllIIlIll(C0004e.j(lllIlIlIlI[2]), lllIlIlIlI[18])) {
            ?? r0 = lllIlIlIlI[3];
            "".length();
            return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIlI[4];
    }

    static {
        llIIIllIIIIlI();
        llIIIllIIIIIl();
        ft = lllIlIlIlI[17];
        fr = lllIlIlIlI[18];
        fn = lllIlIlIlI[3];
        fu = lllIlIlIlI[60];
        fl = lllIlIlIlI[1];
        fZ = lllIlIlIlI[9];
        fR = lllIlIlIlI[118];
        fw = lllIlIlIlI[19];
        fS = lllIlIlIlI[119];
        fk = lllIlIlIlI[0];
        fU = lllIlIlIlI[7];
        fW = lllIlIlIlI[6];
        fm = lllIlIlIlI[2];
        fv = lllIlIlIlI[39];
        fq = lllIlIlIlI[14];
        fT = lllIlIlIlI[120];
        fX = lllIlIlIlI[121];
        fs = lllIlIlIlI[82];
        fQ = lllIlIlIlI[122];
        fV = lllIlIlIlI[5];
        fp = lllIlIlIlI[12];
        fY = lllIlIlIlI[8];
        fo = lllIlIlIlI[1];
        eZ = new WorldPoint(lllIlIlIlI[123], lllIlIlIlI[59], lllIlIlIlI[4]);
        fa = new WorldPoint(lllIlIlIlI[62], lllIlIlIlI[124], lllIlIlIlI[4]);
        fb = new WorldPoint(lllIlIlIlI[125], lllIlIlIlI[94], lllIlIlIlI[4]);
        fc = new WorldArea(lllIlIlIlI[126], lllIlIlIlI[127], lllIlIlIlI[31], lllIlIlIlI[14], lllIlIlIlI[4]);
        fd = new WorldArea(lllIlIlIlI[128], lllIlIlIlI[127], lllIlIlIlI[30], lllIlIlIlI[14], lllIlIlIlI[4]);
        fe = new WorldArea(lllIlIlIlI[129], lllIlIlIlI[130], lllIlIlIlI[15], lllIlIlIlI[22], lllIlIlIlI[4]);
        ff = new WorldArea(lllIlIlIlI[131], lllIlIlIlI[132], lllIlIlIlI[24], lllIlIlIlI[15], lllIlIlIlI[4]);
        fg = new WorldArea(lllIlIlIlI[133], lllIlIlIlI[132], lllIlIlIlI[18], lllIlIlIlI[13], lllIlIlIlI[4]);
        fh = new WorldArea(lllIlIlIlI[134], lllIlIlIlI[135], lllIlIlIlI[21], lllIlIlIlI[18], lllIlIlIlI[4]);
        fi = new WorldArea(lllIlIlIlI[136], lllIlIlIlI[132], lllIlIlIlI[15], lllIlIlIlI[15], lllIlIlIlI[4]);
        fj = new WorldArea(lllIlIlIlI[137], lllIlIlIlI[132], lllIlIlIlI[15], lllIlIlIlI[13], lllIlIlIlI[4]);
        fx = new WorldPoint(lllIlIlIlI[138], lllIlIlIlI[139], lllIlIlIlI[1]);
        fy = new WorldPoint(lllIlIlIlI[140], lllIlIlIlI[141], lllIlIlIlI[4]);
        fz = new WorldPoint(lllIlIlIlI[142], lllIlIlIlI[127], lllIlIlIlI[4]);
        fA = new WorldPoint(lllIlIlIlI[143], lllIlIlIlI[144], lllIlIlIlI[4]);
        fB = new WorldPoint(lllIlIlIlI[145], lllIlIlIlI[146], lllIlIlIlI[4]);
        fC = new WorldPoint(lllIlIlIlI[131], lllIlIlIlI[94], lllIlIlIlI[4]);
        fD = new WorldPoint(lllIlIlIlI[147], lllIlIlIlI[148], lllIlIlIlI[4]);
        fE = new WorldPoint(lllIlIlIlI[149], lllIlIlIlI[150], lllIlIlIlI[4]);
        fF = new WorldPoint(lllIlIlIlI[145], lllIlIlIlI[151], lllIlIlIlI[4]);
        fG = new WorldPoint(lllIlIlIlI[131], lllIlIlIlI[151], lllIlIlIlI[4]);
        fH = new WorldPoint(lllIlIlIlI[131], lllIlIlIlI[152], lllIlIlIlI[4]);
        fI = new WorldPoint(lllIlIlIlI[136], lllIlIlIlI[151], lllIlIlIlI[4]);
        fJ = new WorldPoint(lllIlIlIlI[136], lllIlIlIlI[152], lllIlIlIlI[4]);
        fK = new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[153], lllIlIlIlI[4]);
        fL = new WorldPoint(lllIlIlIlI[62], lllIlIlIlI[135], lllIlIlIlI[4]);
        fM = new WorldPoint(lllIlIlIlI[154], lllIlIlIlI[155], lllIlIlIlI[4]);
        fN = new WorldArea(new WorldPoint(lllIlIlIlI[156], lllIlIlIlI[157], lllIlIlIlI[4]), new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[94], lllIlIlIlI[4]));
        fO = new WorldArea(new WorldPoint(lllIlIlIlI[145], lllIlIlIlI[158], lllIlIlIlI[4]), new WorldPoint(lllIlIlIlI[159], lllIlIlIlI[160], lllIlIlIlI[4]));
        fP = new WorldArea(lllIlIlIlI[62], lllIlIlIlI[130], lllIlIlIlI[14], lllIlIlIlI[22], lllIlIlIlI[4]);
        bu = new ArrayList();
        ga = lllIlIlIlI[161];
        gb = lllIlIlIlI[162];
        gc = lllIlIlIII[lllIlIlIlI[163]];
        String[] strArr = new String[lllIlIlIlI[14]];
        strArr[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[164]];
        strArr[lllIlIlIlI[3]] = lllIlIlIII[lllIlIlIlI[165]];
        strArr[lllIlIlIlI[1]] = lllIlIlIII[lllIlIlIlI[166]];
        strArr[lllIlIlIlI[12]] = lllIlIlIII[lllIlIlIlI[167]];
        strArr[lllIlIlIlI[15]] = lllIlIlIII[lllIlIlIlI[168]];
        strArr[lllIlIlIlI[13]] = lllIlIlIII[lllIlIlIlI[169]];
        eR = strArr;
        int[] iArr = new int[lllIlIlIlI[15]];
        iArr[lllIlIlIlI[4]] = lllIlIlIlI[170];
        iArr[lllIlIlIlI[3]] = lllIlIlIlI[171];
        iArr[lllIlIlIlI[1]] = lllIlIlIlI[172];
        iArr[lllIlIlIlI[12]] = lllIlIlIlI[173];
        gd = iArr;
    }

    private static String llIIIlIlllIll(String lllllllllllllllllIllIllIIIlIIIIl, String lllllllllllllllllIllIllIIIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIllIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lllIlIlIlI[20]), "DES");
            Cipher lllllllllllllllllIllIllIIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllllIllIllIIIlIIIll.init(lllIlIlIlI[1], secretKeySpec);
            return new String(lllllllllllllllllIllIllIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIllIIIlIIIlI) {
            lllllllllllllllllIllIllIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIIIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x025d, code lost:
        if (llIIIllIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a0, code lost:
        if (llIIIllIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e3, code lost:
        if (llIIIllIIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e6, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIII[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[104(0x68, float:1.46E-43)]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0301, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v232, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void bH() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIIllIIlIIl(nearest) && llIIIllIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[97]];
            C0000a.a(nearest);
        }
        if (llIIIllIIlIIl(nearest) && llIIIllIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllIlIlIlI[99]);
                "".length();
            }
            if (llIIIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[100]];
                if (llIIIllIIllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllIlIlIlI[12]);
                    "".length();
                }
                if (llIIIllIIllII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lllIlIlIlI[1]);
                    "".length();
                }
                while (llIIIllIIIllI(C0019t.bl() ? 1 : 0) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    C0019t.bj();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                int[] iArr = new int[lllIlIlIlI[3]];
                iArr[lllIlIlIlI[4]] = lllIlIlIlI[7];
                if (llIIIllIIIlIl(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlIlIlI[3]];
                    iArr2[lllIlIlIlI[4]] = lllIlIlIlI[7];
                    if (llIIIllIIIIll(Bank.getFirst(iArr2).getQuantity(), lllIlIlIlI[101])) {
                        ae();
                        System.out.println(lllIlIlIII[lllIlIlIlI[102]]);
                        bs = lllIlIlIlI[3];
                        return;
                    }
                }
                int[] iArr3 = new int[lllIlIlIlI[3]];
                iArr3[lllIlIlIlI[4]] = lllIlIlIlI[6];
                if (llIIIllIIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lllIlIlIlI[3]];
                    iArr4[lllIlIlIlI[4]] = lllIlIlIlI[6];
                    if (llIIIllIIIIll(Bank.getFirst(iArr4).getQuantity(), lllIlIlIlI[101])) {
                        ae();
                        System.out.println(lllIlIlIII[lllIlIlIlI[16]]);
                        bs = lllIlIlIlI[3];
                        return;
                    }
                }
                int[] iArr5 = new int[lllIlIlIlI[3]];
                iArr5[lllIlIlIlI[4]] = lllIlIlIlI[5];
                if (llIIIllIIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIlIlIlI[3]];
                    iArr6[lllIlIlIlI[4]] = lllIlIlIlI[5];
                    if (llIIIllIIIIll(Bank.getFirst(iArr6).getQuantity(), lllIlIlIlI[101])) {
                        ae();
                        System.out.println(lllIlIlIII[lllIlIlIlI[103]]);
                        bs = lllIlIlIlI[3];
                        return;
                    }
                }
                int[] iArr7 = new int[lllIlIlIlI[3]];
                iArr7[lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (llIIIllIIIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lllIlIlIlI[3]];
                    iArr8[lllIlIlIlI[4]] = lllIlIlIlI[10];
                }
                int[] iArr9 = new int[lllIlIlIlI[3]];
                iArr9[lllIlIlIlI[4]] = lllIlIlIlI[9];
                if (llIIIllIIIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlIlIlI[3]];
                    iArr10[lllIlIlIlI[4]] = lllIlIlIlI[9];
                }
                int[] iArr11 = new int[lllIlIlIlI[3]];
                iArr11[lllIlIlIlI[4]] = lllIlIlIlI[8];
                if (llIIIllIIIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIlIlIlI[3]];
                    iArr12[lllIlIlIlI[4]] = lllIlIlIlI[8];
                }
                int[] iArr13 = new int[lllIlIlIlI[18]];
                iArr13[lllIlIlIlI[4]] = lllIlIlIlI[105];
                iArr13[lllIlIlIlI[3]] = lllIlIlIlI[10];
                iArr13[lllIlIlIlI[1]] = lllIlIlIlI[9];
                iArr13[lllIlIlIlI[12]] = lllIlIlIlI[8];
                iArr13[lllIlIlIlI[15]] = lllIlIlIlI[7];
                iArr13[lllIlIlIlI[13]] = lllIlIlIlI[5];
                iArr13[lllIlIlIlI[14]] = lllIlIlIlI[6];
                if (llIIIllIIIllI(C0004e.b(iArr13) ? 1 : 0)) {
                    ae();
                    System.out.println(lllIlIlIII[lllIlIlIlI[106]]);
                    bs = lllIlIlIlI[3];
                    return;
                }
                if (llIIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lllIlIlIlI[15]);
                    "".length();
                }
                int[] iArr14 = new int[lllIlIlIlI[3]];
                iArr14[lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (llIIIllIIIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIlIlIlI[3]];
                    iArr15[lllIlIlIlI[4]] = lllIlIlIlI[10];
                    if (llIIIllIIIIll(Inventory.getCount(iArr15), lllIlIlIlI[3])) {
                        Bank.withdraw(lllIlIlIlI[10], lllIlIlIlI[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lllIlIlIlI[3]];
                            iArr16[lllIlIlIlI[4]] = lllIlIlIlI[10];
                            if (llIIIllIIllII(Inventory.getCount(iArr16))) {
                                ?? r0 = lllIlIlIlI[3];
                                "".length();
                                return (-" ".length()) == (((193 ^ 170) ^ (201 ^ 172)) & (((((15 + 51) - (-6)) + 66) ^ (((103 + 119) - 115) + 25)) ^ (-" ".length()))) ? ((142 ^ 181) ^ (153 ^ 170)) & (((189 ^ 128) ^ (152 ^ 173)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIlI[4];
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lllIlIlIlI[3]];
                iArr16[lllIlIlIlI[4]] = lllIlIlIlI[9];
                if (llIIIllIIIlIl(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lllIlIlIlI[3]];
                    iArr17[lllIlIlIlI[4]] = lllIlIlIlI[9];
                    if (llIIIllIIIIll(Inventory.getCount(iArr17), lllIlIlIlI[3])) {
                        Bank.withdraw(lllIlIlIlI[9], lllIlIlIlI[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lllIlIlIlI[3]];
                            iArr18[lllIlIlIlI[4]] = lllIlIlIlI[9];
                            if (llIIIllIIllII(Inventory.getCount(iArr18))) {
                                ?? r0 = lllIlIlIlI[3];
                                "".length();
                                return (-" ".length()) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIlI[4];
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lllIlIlIlI[3]];
                iArr18[lllIlIlIlI[4]] = lllIlIlIlI[7];
                if (llIIIllIIIlIl(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lllIlIlIlI[3]];
                    iArr19[lllIlIlIlI[4]] = lllIlIlIlI[7];
                    if (llIIIllIIIIll(Inventory.getCount(iArr19), lllIlIlIlI[3])) {
                        Bank.withdraw(lllIlIlIlI[7], lllIlIlIlI[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lllIlIlIlI[3]];
                            iArr20[lllIlIlIlI[4]] = lllIlIlIlI[7];
                            if (llIIIllIIllII(Inventory.getCount(iArr20))) {
                                ?? r0 = lllIlIlIlI[3];
                                "".length();
                                return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIlI[4];
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lllIlIlIlI[3]];
                iArr20[lllIlIlIlI[4]] = lllIlIlIlI[5];
                if (llIIIllIIIlIl(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lllIlIlIlI[3]];
                    iArr21[lllIlIlIlI[4]] = lllIlIlIlI[5];
                    if (llIIIllIIIIll(Inventory.getCount(iArr21), lllIlIlIlI[3])) {
                        Bank.withdraw(lllIlIlIlI[5], lllIlIlIlI[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lllIlIlIlI[3]];
                            iArr22[lllIlIlIlI[4]] = lllIlIlIlI[5];
                            if (llIIIllIIllII(Inventory.getCount(iArr22))) {
                                ?? r0 = lllIlIlIlI[3];
                                "".length();
                                return " ".length() != " ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIlI[4];
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lllIlIlIlI[3]];
                iArr22[lllIlIlIlI[4]] = lllIlIlIlI[6];
                if (llIIIllIIIlIl(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lllIlIlIlI[3]];
                    iArr23[lllIlIlIlI[4]] = lllIlIlIlI[6];
                    if (llIIIllIIIIll(Inventory.getCount(iArr23), lllIlIlIlI[3])) {
                        Bank.withdraw(lllIlIlIlI[6], lllIlIlIlI[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lllIlIlIlI[3]];
                            iArr24[lllIlIlIlI[4]] = lllIlIlIlI[6];
                            if (llIIIllIIllII(Inventory.getCount(iArr24))) {
                                ?? r0 = lllIlIlIlI[3];
                                "".length();
                                return ((((44 + 31) - (-18)) + 73) ^ (((36 + 134) - 74) + 66)) < 0 ? ((106 ^ 29) ^ (45 ^ 71)) & (((58 ^ 24) ^ (49 ^ 14)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIlI[4];
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[lllIlIlIlI[3]];
                iArr24[lllIlIlIlI[4]] = lllIlIlIlI[108];
                if (llIIIllIIIlIl(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lllIlIlIlI[3]];
                    iArr25[lllIlIlIlI[4]] = lllIlIlIlI[108];
                    if (llIIIllIIIllI(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(lllIlIlIlI[108], lllIlIlIlI[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[lllIlIlIlI[3]];
                            iArr26[lllIlIlIlI[4]] = lllIlIlIlI[108];
                            return Inventory.contains(iArr26);
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[lllIlIlIlI[3]];
                iArr26[lllIlIlIlI[4]] = lllIlIlIlI[8];
                if (llIIIllIIIlIl(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lllIlIlIlI[3]];
                    iArr27[lllIlIlIlI[4]] = lllIlIlIlI[8];
                    if (llIIIllIIIIll(Inventory.getCount(iArr27), lllIlIlIlI[3])) {
                        Bank.withdrawAll(lllIlIlIlI[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[lllIlIlIlI[3]];
                            iArr28[lllIlIlIlI[4]] = lllIlIlIlI[8];
                            if (llIIIllIIllII(Inventory.getCount(iArr28))) {
                                ?? r0 = lllIlIlIlI[3];
                                "".length();
                                return "  ".length() > (108 ^ 104) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIlI[4];
                        }, lllIlIlIlI[99]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean llIIIllIIIlll(int i, int i2) {
        return i > i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIlIlIII[lllIlIlIlI[116]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIlIlIlI[4];
    }

    private static boolean llIIIllIIlIll(int i, int i2) {
        return i >= i2;
    }

    public static void bG() {
        if (llIIIllIIIlIl(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIIllIIIIll(Movement.getRunEnergy(), lllIlIlIlI[68])) {
            Inventory.getFirst(C0005f.aU).interact(lllIlIlIII[lllIlIlIlI[80]]);
            Time.sleepTicks(lllIlIlIlI[3]);
            "".length();
        }
        if (llIIIllIIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[1])) {
            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[81]];
            Movement.walkTo(new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[59], lllIlIlIlI[4]));
            "".length();
            Time.sleepTicks(lllIlIlIlI[3]);
            "".length();
        }
        int[] iArr = new int[lllIlIlIlI[3]];
        iArr[lllIlIlIlI[4]] = lllIlIlIlI[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lllIlIlIlI[3]];
        iArr2[lllIlIlIlI[4]] = lllIlIlIlI[60];
        if (llIIIllIIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
            if (llIIIllIIIlIl(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIlIIl(nearest) && llIIIllIIIlIl(fi.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lllIlIlIlI[24]);
                "".length();
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(eZ), lllIlIlIlI[3]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[83]];
                    Movement.walkTo(eZ);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                }
            }
            if (llIIIllIIIlIl(fd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIlIIl(nearest) && llIIIllIIIlIl(ff.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fa), lllIlIlIlI[3]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[84]];
                    Movement.walkTo(fa);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                }
            }
            if (llIIIllIIIlIl(fe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIlIIl(nearest) && llIIIllIIIlIl(fj.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lllIlIlIlI[18]);
                "".length();
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fb), lllIlIlIlI[3]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[85]];
                    Movement.walkTo(fb);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if (((((111 + 45) - 81) + 66) ^ (((107 + 76) - 114) + 68)) == 0) {
                        return;
                    }
                }
            }
            if (llIIIllIIIlIl(fh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIllIIlIIl(nearest) && llIIIllIIIlIl(fj.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[1]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[86]];
                    Movement.walkTo(fM);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[12])) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[87]];
                String[] strArr = new String[lllIlIlIlI[3]];
                strArr[lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (llIIIllIIlIIl(nearest2)) {
                    nearest2.interact(lllIlIlIII[lllIlIlIlI[89]]);
                    Time.sleepTicks(lllIlIlIlI[1]);
                    "".length();
                    Widget widget = Widgets.get(lllIlIlIlI[23], lllIlIlIlI[3]);
                    if (llIIIllIIlIIl(widget)) {
                        widget.interact(lllIlIlIII[lllIlIlIlI[90]]);
                        widget.interact(lllIlIlIlI[4]);
                        widget.interact(lllIlIlIII[lllIlIlIlI[91]]);
                        Keyboard.type(lllIlIlIII[lllIlIlIlI[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[lllIlIlIlI[3]];
        iArr3[lllIlIlIlI[4]] = lllIlIlIlI[60];
        if (llIIIllIIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[12])) {
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4])), lllIlIlIlI[3]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[95]];
                    Movement.walkTo(new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4]));
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if (((66 ^ 105) & ((174 ^ 133) ^ (-1))) > "  ".length()) {
                        return;
                    }
                }
            }
            if (llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4])), lllIlIlIlI[1]) && llIIIllIIlIIl(nearest) && llIIIllIIIlIl(fi.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fa), lllIlIlIlI[3]) && llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[96]];
                    Movement.walkTo(fa);
                    "".length();
                    Time.sleepTicks(lllIlIlIlI[3]);
                    "".length();
                    "".length();
                    if ((((((70 + 136) - 117) + 50) ^ (((87 + 56) - 103) + 103)) & (((94 ^ 36) ^ (2 ^ 124)) ^ (-" ".length()))) < (((((96 + 58) - 94) + 73) ^ (((133 + 99) - 75) + 2)) & (((153 ^ 180) ^ (13 ^ 58)) ^ (-" ".length())))) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean llIIIllIIIlIl(int i) {
        return i != 0;
    }

    private static boolean llIIIllIIIllI(int i) {
        return i == 0;
    }

    private static boolean llIIIllIIlIlI(Object obj) {
        return obj == null;
    }

    private static String llIIIlIllllII(String lllllllllllllllllIllIllIIIlIlllI, String lllllllllllllllllIllIllIIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllllIllIllIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIllIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIlI[1], lllllllllllllllllIllIllIIIllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIllIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIllIIIlIllll) {
            lllllllllllllllllIllIllIIIlIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
        if (llIIIllIIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[13]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0217, code lost:
        if (llIIIllIIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0022w.lllIlIlIlI[22]) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lllIlIlIlI[3]];
        iArr7[lllIlIlIlI[4]] = lllIlIlIlI[8];
        if (llIIIllIIIllI(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(lllIlIlIlI[8], lllIlIlIlI[109], lllIlIlIlI[110]));
            "".length();
        }
        int[] iArr8 = new int[lllIlIlIlI[3]];
        iArr8[lllIlIlIlI[4]] = lllIlIlIlI[8];
        if (llIIIllIIIlIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lllIlIlIlI[3]];
            iArr9[lllIlIlIlI[4]] = lllIlIlIlI[8];
            if (llIIIllIIIIll(Bank.getFirst(iArr9).getQuantity(), lllIlIlIlI[33])) {
                bu.add(new C0003d(lllIlIlIlI[8], lllIlIlIlI[54], lllIlIlIlI[110]));
                "".length();
            }
        }
        int[] iArr10 = new int[lllIlIlIlI[3]];
        iArr10[lllIlIlIlI[4]] = lllIlIlIlI[9];
        if (llIIIllIIIlIl(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lllIlIlIlI[3]];
            iArr11[lllIlIlIlI[4]] = lllIlIlIlI[9];
            if (llIIIllIIIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIlIlIlI[3]];
                iArr12[lllIlIlIlI[4]] = lllIlIlIlI[9];
            }
            if (llIIIllIIIllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIlIlIII[lllIlIlIlI[117]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lllIlIlIlI[112], lllIlIlIlI[31], lllIlIlIlI[113]));
                "".length();
            }
            iArr = new int[lllIlIlIlI[3]];
            iArr[lllIlIlIlI[4]] = lllIlIlIlI[105];
            if (llIIIllIIIllI(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(lllIlIlIlI[105], lllIlIlIlI[54], lllIlIlIlI[114]));
                "".length();
            }
            iArr2 = new int[lllIlIlIlI[3]];
            iArr2[lllIlIlIlI[4]] = lllIlIlIlI[10];
            if (llIIIllIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lllIlIlIlI[3]];
                iArr13[lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (llIIIllIIIlIl(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lllIlIlIlI[3]];
                    iArr14[lllIlIlIlI[4]] = lllIlIlIlI[10];
                }
                iArr3 = new int[lllIlIlIlI[3]];
                iArr3[lllIlIlIlI[4]] = lllIlIlIlI[108];
                if (llIIIllIIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                    bu.add(new C0003d(lllIlIlIlI[108], lllIlIlIlI[13], C0008i.bp));
                    "".length();
                }
                iArr4 = new int[lllIlIlIlI[3]];
                iArr4[lllIlIlIlI[4]] = lllIlIlIlI[7];
                if (llIIIllIIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIlIlIlI[3]];
                    iArr15[lllIlIlIlI[4]] = lllIlIlIlI[7];
                    if (llIIIllIIIIll(Bank.getFirst(iArr15).getQuantity(), lllIlIlIlI[101])) {
                        bu.add(new C0003d(lllIlIlIlI[7], lllIlIlIlI[115], lllIlIlIlI[18]));
                        "".length();
                    }
                }
                iArr5 = new int[lllIlIlIlI[3]];
                iArr5[lllIlIlIlI[4]] = lllIlIlIlI[5];
                if (llIIIllIIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr16 = new int[lllIlIlIlI[3]];
                    iArr16[lllIlIlIlI[4]] = lllIlIlIlI[5];
                    if (llIIIllIIIIll(Bank.getFirst(iArr16).getQuantity(), lllIlIlIlI[101])) {
                        bu.add(new C0003d(lllIlIlIlI[5], lllIlIlIlI[115], lllIlIlIlI[18]));
                        "".length();
                    }
                }
                iArr6 = new int[lllIlIlIlI[3]];
                iArr6[lllIlIlIlI[4]] = lllIlIlIlI[6];
                if (llIIIllIIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lllIlIlIlI[3]];
                    iArr17[lllIlIlIlI[4]] = lllIlIlIlI[6];
                    if (llIIIllIIIIll(Bank.getFirst(iArr17).getQuantity(), lllIlIlIlI[101])) {
                        bu.add(new C0003d(lllIlIlIlI[6], lllIlIlIlI[115], lllIlIlIlI[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bu.add(new C0003d(lllIlIlIlI[10], lllIlIlIlI[33], lllIlIlIlI[114]));
            "".length();
            iArr3 = new int[lllIlIlIlI[3]];
            iArr3[lllIlIlIlI[4]] = lllIlIlIlI[108];
            if (llIIIllIIIllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lllIlIlIlI[3]];
            iArr4[lllIlIlIlI[4]] = lllIlIlIlI[7];
            if (llIIIllIIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lllIlIlIlI[3]];
            iArr5[lllIlIlIlI[4]] = lllIlIlIlI[5];
            if (llIIIllIIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lllIlIlIlI[3]];
            iArr6[lllIlIlIlI[4]] = lllIlIlIlI[6];
            if (llIIIllIIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bu.add(new C0003d(lllIlIlIlI[9], lllIlIlIlI[13], lllIlIlIlI[111]));
        "".length();
        if (llIIIllIIIllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllIlIlIII[lllIlIlIlI[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lllIlIlIlI[3]];
        iArr[lllIlIlIlI[4]] = lllIlIlIlI[105];
        if (llIIIllIIIllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lllIlIlIlI[3]];
        iArr2[lllIlIlIlI[4]] = lllIlIlIlI[10];
        if (llIIIllIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllIlIlIlI[10], lllIlIlIlI[33], lllIlIlIlI[114]));
        "".length();
        iArr3 = new int[lllIlIlIlI[3]];
        iArr3[lllIlIlIlI[4]] = lllIlIlIlI[108];
        if (llIIIllIIIllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lllIlIlIlI[3]];
        iArr4[lllIlIlIlI[4]] = lllIlIlIlI[7];
        if (llIIIllIIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lllIlIlIlI[3]];
        iArr5[lllIlIlIlI[4]] = lllIlIlIlI[5];
        if (llIIIllIIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lllIlIlIlI[3]];
        iArr6[lllIlIlIlI[4]] = lllIlIlIlI[6];
        if (llIIIllIIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static boolean llIIIllIIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIllIIllII(int i) {
        return i > 0;
    }

    private static void llIIIllIIIIIl() {
        lllIlIlIII = new String[lllIlIlIlI[174]];
        lllIlIlIII[lllIlIlIlI[4]] = llIIIlIlllIll("Qr9WUPT0lisF68kNLA6UTA==", "TkHVV");
        lllIlIlIII[lllIlIlIlI[3]] = llIIIlIllllII("D+gMgEuGFV+7lNMtOfxOYvQAMm8DUBIcRLvcQJkf470M6OxXK3/0HYcrikHqaJz2ZMC+r+ji/YI=", "VqUjL");
        lllIlIlIII[lllIlIlIlI[1]] = llIIIlIllllIl("Dh4OFR0lAgxUAi0O", "Llktv");
        lllIlIlIII[lllIlIlIlI[12]] = llIIIlIlllIll("kOZ4KsMhme0=", "Zscam");
        lllIlIlIII[lllIlIlIlI[15]] = llIIIlIllllIl("OyoicDkaayckLAc/", "uKTPM");
        lllIlIlIII[lllIlIlIlI[13]] = llIIIlIllllII("/goP4Y+7JzY=", "iwnzg");
        lllIlIlIII[lllIlIlIlI[14]] = llIIIlIllllIl("MR0w", "srImm");
        lllIlIlIII[lllIlIlIlI[18]] = llIIIlIllllIl("Nw0uOi4YGDE9LlkYN3MmDBgrOi0cTDw8Jgs=", "ylXSI");
        lllIlIlIII[lllIlIlIlI[20]] = llIIIlIllllII("3Y/XMvKBBn4=", "yPGzA");
        lllIlIlIII[lllIlIlIlI[21]] = llIIIlIllllIl("BDAQBz0+KhJGOjI9", "WDufQ");
        lllIlIlIII[lllIlIlIlI[22]] = llIIIlIlllIll("zdWyhZbYitxh8r5Vx1loDQ==", "EjsGT");
        lllIlIlIII[lllIlIlIlI[24]] = llIIIlIlllIll("o+zm2YC3sL0hg1e/+QOSaQ==", "FOKHL");
        lllIlIlIII[lllIlIlIlI[25]] = llIIIlIllllIl("NiEuHA==", "XTBpX");
        lllIlIlIII[lllIlIlIlI[26]] = llIIIlIllllIl("Qw==", "cnJMY");
        lllIlIlIII[lllIlIlIlI[27]] = llIIIlIllllIl("OQkgTBwYSDsNDxkNIkwKGBA=", "whVlh");
        lllIlIlIII[lllIlIlIlI[28]] = llIIIlIllllIl("AjAPWRAjcRQYAyI0DVkGIyk=", "LQyyd");
        lllIlIlIII[lllIlIlIlI[29]] = llIIIlIllllIl("DiIDICYsJRc=", "MWsBI");
        lllIlIlIII[lllIlIlIlI[30]] = llIIIlIlllIll("CDo/+7RJWvKoO/U2hEeq3w==", "SkeGO");
        lllIlIlIII[lllIlIlIlI[31]] = llIIIlIllllII("IGcO0eB7Po4=", "WFMwP");
        lllIlIlIII[lllIlIlIlI[32]] = llIIIlIlllIll("01h96UIY3BI=", "OdqlF");
        lllIlIlIII[lllIlIlIlI[33]] = llIIIlIllllIl("JgMkBw==", "isAij");
        lllIlIlIII[lllIlIlIlI[34]] = llIIIlIlllIll("BIx5xW2PFSQ=", "bCrkd");
        lllIlIlIII[lllIlIlIlI[35]] = llIIIlIlllIll("F4XC9ok7aww=", "tOhJd");
        lllIlIlIII[lllIlIlIlI[36]] = llIIIlIllllIl("CAMfMhElGRQ=", "KlqFx");
        lllIlIlIII[lllIlIlIlI[37]] = llIIIlIllllII("fJ4JX2dekpQ=", "kAODk");
        lllIlIlIII[lllIlIlIlI[38]] = llIIIlIlllIll("dOPejUEtsB0=", "TTXuY");
        lllIlIlIII[lllIlIlIlI[40]] = llIIIlIlllIll("U0uFdydUh7ZZg28CTUqttQAkdLbM3W1z", "lRLqD");
        lllIlIlIII[lllIlIlIlI[41]] = llIIIlIlllIll("rILyZI0XlgAi6JMlQyr19g==", "wNmrp");
        lllIlIlIII[lllIlIlIlI[42]] = llIIIlIllllIl("MCgvCi0DaSkCJAosMA==", "dIDcC");
        lllIlIlIII[lllIlIlIlI[43]] = llIIIlIllllII("a7NYsl7i5RA=", "XmkXv");
        lllIlIlIII[lllIlIlIlI[44]] = llIIIlIllllIl("OiApIA==", "uPLNv");
        lllIlIlIII[lllIlIlIlI[45]] = llIIIlIllllIl("AzIHGQw4", "PWfko");
        lllIlIlIII[lllIlIlIlI[46]] = llIIIlIlllIll("/nVIp6T5grw=", "ZuPCj");
        lllIlIlIII[lllIlIlIlI[47]] = llIIIlIllllII("BxltqPtce+ehSBAti30dZw==", "OAjmG");
        lllIlIlIII[lllIlIlIlI[48]] = llIIIlIlllIll("tgH+zTEG9SY=", "qnZaY");
        lllIlIlIII[lllIlIlIlI[49]] = llIIIlIllllIl("Sw==", "kUqmZ");
        lllIlIlIII[lllIlIlIlI[50]] = llIIIlIlllIll("cbrfm7ieVUZkvN6owgXWRK1+6IGrR9R4", "WQwDo");
        lllIlIlIII[lllIlIlIlI[51]] = llIIIlIllllIl("Cz0eCiBmOgQVIA==", "FRkyE");
        lllIlIlIII[lllIlIlIlI[52]] = llIIIlIllllII("r5/kEtf8L0s=", "WIfcT");
        lllIlIlIII[lllIlIlIlI[53]] = llIIIlIlllIll("Rqh5vS59hRJ/xlUn7040nQ==", "ZixLO");
        lllIlIlIII[lllIlIlIlI[54]] = llIIIlIllllII("g1d7ftQ1LR0=", "jvDMV");
        lllIlIlIII[lllIlIlIlI[55]] = llIIIlIlllIll("MpcKeNxbRcs=", "rsCyf");
        lllIlIlIII[lllIlIlIlI[56]] = llIIIlIlllIll("xn/sFO036GFVDCbbt5jazQ==", "yHqZu");
        lllIlIlIII[lllIlIlIlI[57]] = llIIIlIlllIll("vS8wKbXXSe43AyjLNa9raw==", "GqwUq");
        lllIlIlIII[lllIlIlIlI[61]] = llIIIlIllllII("+TawvORNIPijDyx9q6uNsUCWrcGtQiPe", "oLKoL");
        lllIlIlIII[lllIlIlIlI[63]] = llIIIlIlllIll("Z49uM+XFDac=", "acbIG");
        lllIlIlIII[lllIlIlIlI[64]] = llIIIlIlllIll("DCu23BcXXC96Vr6gVCMRTw==", "smIxc");
        lllIlIlIII[lllIlIlIlI[65]] = llIIIlIllllIl("KTIveRAIcyo4AgJzKikLEw==", "gSYYd");
        lllIlIlIII[lllIlIlIlI[66]] = llIIIlIlllIll("zWUxH3xgdxo=", "JHaRr");
        lllIlIlIII[lllIlIlIlI[67]] = llIIIlIllllIl("OSwmEBgUKnUXAR8hOQ==", "zMUdq");
        lllIlIlIII[lllIlIlIlI[68]] = llIIIlIlllIll("YDgrbzAuI5uPtZf1VTuqrw==", "zJQXm");
        lllIlIlIII[lllIlIlIlI[69]] = llIIIlIlllIll("JyHSTikCJ6teV5H05xv8Bg==", "oBojG");
        lllIlIlIII[lllIlIlIlI[70]] = llIIIlIlllIll("r4GYvgKukwY=", "FaQzk");
        lllIlIlIII[lllIlIlIlI[71]] = llIIIlIllllII("ncUF9Wq1CHw=", "cvMWZ");
        lllIlIlIII[lllIlIlIlI[72]] = llIIIlIlllIll("LwTxNMt1nRz41pcIxEhvMg==", "rSQEB");
        lllIlIlIII[lllIlIlIlI[73]] = llIIIlIllllII("ebsfc+c2dIw=", "MVRmc");
        lllIlIlIII[lllIlIlIlI[74]] = llIIIlIllllIl("KCkDPw==", "jHoSS");
        lllIlIlIII[lllIlIlIlI[75]] = llIIIlIllllIl("KREXJRMCDRVkDAoB", "kcrDx");
        lllIlIlIII[lllIlIlIlI[76]] = llIIIlIlllIll("zLxEbQhy1aM=", "AoJoS");
        lllIlIlIII[lllIlIlIlI[77]] = llIIIlIlllIll("EE6mFaXOfOWmtd9nj437uAVjbOI9oGE/", "sHkxi");
        lllIlIlIII[lllIlIlIlI[78]] = llIIIlIllllII("utvizOCbDSqT2tXr2/Wi5gTubnLfe1b4", "ycFAg");
        lllIlIlIII[lllIlIlIlI[79]] = llIIIlIllllIl("KAMI", "jlqQE");
        lllIlIlIII[lllIlIlIlI[80]] = llIIIlIllllIl("LDoZFzo=", "hHpyQ");
        lllIlIlIII[lllIlIlIlI[81]] = llIIIlIllllII("/qvfA/8vIFAycySJCjIuvQ==", "zxzEy");
        lllIlIlIII[lllIlIlIlI[83]] = llIIIlIllllIl("IykAVyUCaBAeIx48VgQhAjw=", "mHvwQ");
        lllIlIlIII[lllIlIlIlI[84]] = llIIIlIlllIll("1hHx4AwnSZkYm5ThttayOFBnE8A7A1Dz", "igLYK");
        lllIlIlIII[lllIlIlIlI[85]] = llIIIlIllllII("/HpewZQ5GeL5g3OgS6WIY3/2kBGoeqrs", "hFowl");
        lllIlIlIII[lllIlIlIlI[86]] = llIIIlIllllII("I4hscNFs863q587vs18xNA==", "OjreT");
        lllIlIlIII[lllIlIlIlI[87]] = llIIIlIllllII("QvHNxD4HyWvYxpn2heVIUw==", "WLSdm");
        lllIlIlIII[lllIlIlIlI[88]] = llIIIlIllllII("Ma6zpA5zMA2fFgf797x1fg==", "yavDQ");
        lllIlIlIII[lllIlIlIlI[89]] = llIIIlIllllIl("EiEAEiY=", "QIeqM");
        lllIlIlIII[lllIlIlIlI[90]] = llIIIlIllllII("sa17Ce/APu3fWn/2XVPxEg==", "vmdLr");
        lllIlIlIII[lllIlIlIlI[91]] = llIIIlIllllII("nVmoV/5GDNU=", "gxXuh");
        lllIlIlIII[lllIlIlIlI[92]] = llIIIlIllllII("TISYvCswx2U=", "pjvie");
        lllIlIlIII[lllIlIlIlI[95]] = llIIIlIllllIl("LRgYVTECGgVVJwwODwc3QxQPDzY=", "cynuS");
        lllIlIlIII[lllIlIlIlI[96]] = llIIIlIlllIll("isOQygcdL7pUJ4NnP3cok20ZRO5F3cTY", "MNkFK");
        lllIlIlIII[lllIlIlIlI[97]] = llIIIlIllllIl("GDYsOio3IzM9KnYjNXMvNzkx", "VWZSM");
        lllIlIlIII[lllIlIlIlI[98]] = llIIIlIllllII("8p6bZzxwX44DZKePgnNRIA==", "nHwPE");
        lllIlIlIII[lllIlIlIlI[100]] = llIIIlIllllIl("ODQiIRYZOytlGBE7JywUFw==", "pULEz");
        lllIlIlIII[lllIlIlIlI[102]] = llIIIlIlllIll("qx2JGWZbTC/stNvpLP+j1sc6+laaUqES9yn9lUmMPx/25HKoDmw2+n/EpRjBLAEu", "jNMMx");
        lllIlIlIII[lllIlIlIlI[16]] = llIIIlIllllIl("HBRiDDQuUS8ENTgYLApmOAQyHSoiFDFBZjgGKxklIxgsCmY/HmIvExI4DCo=", "KqBmF");
        lllIlIlIII[lllIlIlIlI[103]] = llIIIlIlllIll("XX/mywGrgx6vPOU1QhF6JOnHChW2NQ92U4gSmRKxmDs7yjpJuGP83FfAkHIbTA40", "ormuz");
        lllIlIlIII[lllIlIlIlI[104]] = llIIIlIllllIl("Ni1uGREEaCMREBIhIB9DEj0+CA8ILT1UQxI/JwwACSEgH0MVJ246NjgBAD8=", "aHNxc");
        lllIlIlIII[lllIlIlIlI[106]] = llIIIlIllllII("mOHDG3wwgju/01o21x1Qu1IdKxLsDimmVFoxQ/X5ANgMUIYdlZAes8aPBJHeTgg7", "MdSSW");
        lllIlIlIII[lllIlIlIlI[116]] = llIIIlIllllIl("OT0yGwoLJ2YwDRsnI1gTGzE1DA==", "nTFxb");
        lllIlIlIII[lllIlIlIlI[117]] = llIIIlIllllIl("IQM+CFo8DHAYHzIGJAdaew==", "SjPoz");
        lllIlIlIII[lllIlIlIlI[163]] = llIIIlIllllII("9llU5Ot2PpGpdT8WzsU3Rg==", "bBIOX");
        lllIlIlIII[lllIlIlIlI[164]] = llIIIlIllllIl("ND08JE8eMWogTwIhLzIbUyQmJA4AMWQ=", "sTJAo");
        lllIlIlIII[lllIlIlIlI[165]] = llIIIlIllllII("mYUbMESjy6K/oGc+hZW3dg==", "TAwXO");
        lllIlIlIII[lllIlIlIlI[166]] = llIIIlIlllIll("zUVC+ELqJ/Y2abx+nJ0tNv5cXtevIAwNFL2fRWnM6Y5y01ITS+LuBXrispbY3sED", "cGeFB");
        lllIlIlIII[lllIlIlIlI[167]] = llIIIlIlllIll("apk09PVxews=", "IPMSG");
        lllIlIlIII[lllIlIlIlI[168]] = llIIIlIllllII("ivf1e6QyMVkz1R4ICv3E1p+YlWDRllZU", "yizxZ");
        lllIlIlIII[lllIlIlIlI[169]] = llIIIlIlllIll("7+A7NuhaUrXuDiGimkZtFr6qjYpyf10iQIDpdZvlehA=", "QVMgQ");
    }

    private static void llIIIllIIIIlI() {
        lllIlIlIlI = new int[175];
        lllIlIlIlI[0] = (((50 ^ 38) + (31 ^ 87)) - (-(26 ^ 22))) + (123 ^ 67);
        lllIlIlIlI[1] = "  ".length();
        lllIlIlIlI[2] = ((106 + 133) - 62) + 49;
        lllIlIlIlI[3] = " ".length();
        lllIlIlIlI[4] = ((((53 + 126) - 99) + 109) ^ (((29 + 36) - 42) + 109)) & (((206 ^ 163) ^ (37 ^ 113)) ^ (-" ".length()));
        lllIlIlIlI[5] = (-((-12809) & 30237)) & (-10497) & 28479;
        lllIlIlIlI[6] = (-((-16969) & 31577)) & (-17539) & 32703;
        lllIlIlIlI[7] = (-23937) & 24494;
        lllIlIlIlI[8] = (-((-9541) & 28485)) & (-5125) & 24447;
        lllIlIlIlI[9] = (-10283) & 12267;
        lllIlIlIlI[10] = (-16417) & 24425;
        lllIlIlIlI[11] = ((135 + 90) - 181) + 106;
        lllIlIlIlI[12] = "   ".length();
        lllIlIlIlI[13] = 174 ^ 171;
        lllIlIlIlI[14] = 155 ^ 157;
        lllIlIlIlI[15] = (((35 + 12) - 42) + 188) ^ (((135 + 171) - 144) + 35);
        lllIlIlIlI[16] = (61 ^ 14) ^ (207 ^ 172);
        lllIlIlIlI[17] = (-((-13145) & 29661)) & (-12291) & 31215;
        lllIlIlIlI[18] = (4 ^ 90) ^ (63 ^ 102);
        lllIlIlIlI[19] = (-((-4743) & 30351)) & (-65) & 28539;
        lllIlIlIlI[20] = 45 ^ 37;
        lllIlIlIlI[21] = "   ".length() ^ (139 ^ 129);
        lllIlIlIlI[22] = (73 ^ 124) ^ (34 ^ 29);
        lllIlIlIlI[23] = ((2 + 136) - (-41)) + 50;
        lllIlIlIlI[24] = 76 ^ 71;
        lllIlIlIlI[25] = 173 ^ 161;
        lllIlIlIlI[26] = 43 ^ 38;
        lllIlIlIlI[27] = (((96 + 58) - 133) + 121) ^ (((108 + 114) - 214) + 120);
        lllIlIlIlI[28] = 9 ^ 6;
        lllIlIlIlI[29] = 208 ^ 192;
        lllIlIlIlI[30] = 63 ^ 46;
        lllIlIlIlI[31] = 92 ^ 78;
        lllIlIlIlI[32] = 64 ^ 83;
        lllIlIlIlI[33] = (((36 + 86) - 97) + 130) ^ (((108 + 56) - 71) + 50);
        lllIlIlIlI[34] = (((86 + 54) - 50) + 78) ^ (((90 + 80) - 63) + 82);
        lllIlIlIlI[35] = (156 ^ 173) ^ (102 ^ 65);
        lllIlIlIlI[36] = 21 ^ 2;
        lllIlIlIlI[37] = (103 ^ 89) ^ (39 ^ 1);
        lllIlIlIlI[38] = (126 ^ 41) ^ (218 ^ 148);
        lllIlIlIlI[39] = (-13457) & 15866;
        lllIlIlIlI[40] = 71 ^ 93;
        lllIlIlIlI[41] = 148 ^ 143;
        lllIlIlIlI[42] = 146 ^ 142;
        lllIlIlIlI[43] = 181 ^ 168;
        lllIlIlIlI[44] = (109 ^ 21) ^ (201 ^ 175);
        lllIlIlIlI[45] = (228 ^ 156) ^ (115 ^ 20);
        lllIlIlIlI[46] = 7 ^ 39;
        lllIlIlIlI[47] = 176 ^ 145;
        lllIlIlIlI[48] = (((33 + 111) - (-36)) + 6) ^ (((110 + 108) - 79) + 13);
        lllIlIlIlI[49] = (206 ^ 184) ^ (54 ^ 99);
        lllIlIlIlI[50] = 153 ^ 189;
        lllIlIlIlI[51] = 153 ^ 188;
        lllIlIlIlI[52] = (97 ^ 52) ^ (195 ^ 176);
        lllIlIlIlI[53] = 138 ^ 173;
        lllIlIlIlI[54] = (14 ^ 95) ^ (0 ^ 121);
        lllIlIlIlI[55] = 105 ^ 64;
        lllIlIlIlI[56] = 112 ^ 90;
        lllIlIlIlI[57] = 108 ^ 71;
        lllIlIlIlI[58] = (-((-19721) & 32011)) & (-17577) & 32767;
        lllIlIlIlI[59] = (-4619) & 8078;
        lllIlIlIlI[60] = (-((-263) & 30615)) & (-1) & 32763;
        lllIlIlIlI[61] = (36 ^ 57) ^ (139 ^ 186);
        lllIlIlIlI[62] = (-((-525) & 30351)) & (-1) & 32759;
        lllIlIlIlI[63] = (((138 + 43) - 121) + 93) ^ (((143 + 130) - 173) + 80);
        lllIlIlIlI[64] = 82 ^ 124;
        lllIlIlIlI[65] = 98 ^ 77;
        lllIlIlIlI[66] = (((138 + 140) - 199) + 104) ^ (((9 + 115) - (-9)) + 2);
        lllIlIlIlI[67] = 22 ^ 39;
        lllIlIlIlI[68] = 82 ^ 96;
        lllIlIlIlI[69] = (((129 + 55) - 169) + 164) ^ (((101 + 58) - 131) + 100);
        lllIlIlIlI[70] = (((115 + 108) - 154) + 172) ^ (((112 + 195) - 204) + 94);
        lllIlIlIlI[71] = (51 ^ 117) ^ (63 ^ 76);
        lllIlIlIlI[72] = 179 ^ 133;
        lllIlIlIlI[73] = (146 ^ 162) ^ (107 ^ 108);
        lllIlIlIlI[74] = 88 ^ 96;
        lllIlIlIlI[75] = 3 ^ 58;
        lllIlIlIlI[76] = 152 ^ 162;
        lllIlIlIlI[77] = (67 ^ 20) ^ (87 ^ 59);
        lllIlIlIlI[78] = (((144 + 48) - 105) + 86) ^ (((62 + 120) - 94) + 57);
        lllIlIlIlI[79] = 111 ^ 82;
        lllIlIlIlI[80] = (((39 + 102) - 19) + 9) ^ (((76 + 23) - (-32)) + 58);
        lllIlIlIlI[81] = (26 ^ 80) ^ (85 ^ 32);
        lllIlIlIlI[82] = (-20549) & 24543;
        lllIlIlIlI[83] = 36 ^ 100;
        lllIlIlIlI[84] = (121 ^ 39) ^ (110 ^ 113);
        lllIlIlIlI[85] = 18 ^ 80;
        lllIlIlIlI[86] = (((168 + 12) - 11) + 54) ^ (((38 + 30) - 60) + 148);
        lllIlIlIlI[87] = 35 ^ 103;
        lllIlIlIlI[88] = (((99 + 144) - 84) + 48) ^ (((129 + 122) - 205) + 92);
        lllIlIlIlI[89] = 67 ^ 5;
        lllIlIlIlI[90] = (((41 + 150) - 173) + 225) ^ (((12 + 147) - 81) + 102);
        lllIlIlIlI[91] = 123 ^ 51;
        lllIlIlIlI[92] = (1 ^ 99) ^ (188 ^ 151);
        lllIlIlIlI[93] = (-24729) & 27641;
        lllIlIlIlI[94] = (-((-3787) & 16123)) & (-16902) & 32703;
        lllIlIlIlI[95] = 210 ^ 152;
        lllIlIlIlI[96] = (((53 + 132) - 124) + 77) ^ (((8 + 160) - 111) + 136);
        lllIlIlIlI[97] = (242 ^ 173) ^ (63 ^ 44);
        lllIlIlIlI[98] = (91 ^ 44) ^ (25 ^ 35);
        lllIlIlIlI[99] = (-((-21765) & 30053)) & (-18438) & 31725;
        lllIlIlIlI[100] = (207 ^ 182) ^ (1 ^ 54);
        lllIlIlIlI[101] = (-24583) & 25582;
        lllIlIlIlI[102] = 32 ^ 111;
        lllIlIlIlI[103] = (78 ^ 91) ^ (93 ^ 25);
        lllIlIlIlI[104] = (143 ^ 161) ^ (2 ^ 126);
        lllIlIlIlI[105] = (-33) & 8039;
        lllIlIlIlI[106] = 88 ^ 11;
        lllIlIlIlI[107] = (-((-8745) & 25130)) & (-11273) & 28157;
        lllIlIlIlI[108] = (-1583) & 14207;
        lllIlIlIlI[109] = 197 ^ 161;
        lllIlIlIlI[110] = (-4617) & 5016;
        lllIlIlIlI[111] = (-((-13569) & 32009)) & (-9217) & 32766;
        lllIlIlIlI[112] = (-((-27361) & 31475)) & (-16642) & 32735;
        lllIlIlIlI[113] = (-10500) & 27499;
        lllIlIlIlI[114] = (-((-5455) & 30047)) & (-6275) & 32766;
        lllIlIlIlI[115] = (-20488) & 22487;
        lllIlIlIlI[116] = 45 ^ 121;
        lllIlIlIlI[117] = (54 ^ 96) ^ "   ".length();
        lllIlIlIlI[118] = (-((-1845) & 12092)) & (-20537) & 32255;
        lllIlIlIlI[119] = (-6709) & 8182;
        lllIlIlIlI[120] = (-18969) & 20444;
        lllIlIlIlI[121] = (-18709) & 19262;
        lllIlIlIlI[122] = (-21058) & 22527;
        lllIlIlIlI[123] = (-17409) & 20324;
        lllIlIlIlI[124] = (-((-3202) & 23749)) & (-8229) & 32239;
        lllIlIlIlI[125] = (-((-481) & 5609)) & (-16513) & 24559;
        lllIlIlIlI[126] = (-((-3905) & 32611)) & (-1034) & 32639;
        lllIlIlIlI[127] = (-21065) & 24523;
        lllIlIlIlI[128] = (-((-6691) & 32315)) & (-1) & 28539;
        lllIlIlIlI[129] = (-9222) & 12151;
        lllIlIlIlI[130] = (-((-6273) & 23270)) & (-4105) & 24559;
        lllIlIlIlI[131] = (-9225) & 12126;
        lllIlIlIlI[132] = (-8801) & 12261;
        lllIlIlIlI[133] = (-29705) & 32621;
        lllIlIlIlI[134] = (-((-14459) & 15615)) & (-28699) & 32766;
        lllIlIlIlI[135] = (-((-319) & 895)) & (-20505) & 24543;
        lllIlIlIlI[136] = (-29737) & 32639;
        lllIlIlIlI[137] = (-12301) & 15229;
        lllIlIlIlI[138] = (-17372) & 20475;
        lllIlIlIlI[139] = (-20865) & 24027;
        lllIlIlIlI[140] = (-1) & 2927;
        lllIlIlIlI[141] = (-29185) & 32639;
        lllIlIlIlI[142] = (-9346) & 12281;
        lllIlIlIlI[143] = (-16386) & 19351;
        lllIlIlIlI[144] = (-8835) & 12215;
        lllIlIlIlI[145] = (-28685) & 31583;
        lllIlIlIlI[146] = (-((-11525) & 16239)) & (-5) & 8191;
        lllIlIlIlI[147] = (-(((23 + 86) - (-3)) + 51)) & (-5121) & 8187;
        lllIlIlIlI[148] = (-29289) & 32763;
        lllIlIlIlI[149] = (-20486) & 23391;
        lllIlIlIlI[150] = (-18443) & 28318;
        lllIlIlIlI[151] = (-((-9250) & 30059)) & (-2049) & 32731;
        lllIlIlIlI[152] = (-((-1305) & 19839)) & (-4361) & 32767;
        lllIlIlIlI[153] = (-((-8329) & 24735)) & (-8193) & 28063;
        lllIlIlIlI[154] = (-((-19231) & 24383)) & (-24705) & 32767;
        lllIlIlIlI[155] = (-24611) & 28079;
        lllIlIlIlI[156] = (-17541) & 20447;
        lllIlIlIlI[157] = (-((-18785) & 31595)) & (-2) & 16287;
        lllIlIlIlI[158] = (-18465) & 28334;
        lllIlIlIlI[159] = (-((-2067) & 3251)) & (-24577) & 28669;
        lllIlIlIlI[160] = (-16673) & 26549;
        lllIlIlIlI[161] = (-16653) & 32015;
        lllIlIlIlI[162] = (-((-1169) & 11485)) & (-16417) & 31855;
        lllIlIlIlI[163] = (28 ^ 16) ^ (26 ^ 64);
        lllIlIlIlI[164] = (((3 + 200) - 129) + 140) ^ (((109 + 82) - 159) + 97);
        lllIlIlIlI[165] = (53 ^ 28) ^ (6 ^ 119);
        lllIlIlIlI[166] = 24 ^ 65;
        lllIlIlIlI[167] = 232 ^ 178;
        lllIlIlIlI[168] = 122 ^ 33;
        lllIlIlIlI[169] = 126 ^ 34;
        lllIlIlIlI[170] = (-((-38) & 4199)) & (-1) & 8157;
        lllIlIlIlI[171] = (-16449) & 20445;
        lllIlIlIlI[172] = (-28673) & 32670;
        lllIlIlIlI[173] = (-(123 ^ 58)) & (-16385) & 20447;
        lllIlIlIlI[174] = 72 ^ 21;
    }

    private static boolean llIIIllIIlIIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIllIIIIll(int i, int i2) {
        return i < i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        bF();
        return lllIlIlIlI[109];
    }
}
