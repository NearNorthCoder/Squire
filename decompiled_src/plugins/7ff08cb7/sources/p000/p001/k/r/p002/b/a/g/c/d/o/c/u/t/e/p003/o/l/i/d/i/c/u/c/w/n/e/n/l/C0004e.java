package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/e.class */
public class C0004e {
    private static final /* synthetic */ int aa;
    public static final /* synthetic */ String S;
    public static /* synthetic */ WorldPoint af;
    private static final /* synthetic */ int ad;
    static final /* synthetic */ WorldArea V;
    static final /* synthetic */ WorldArea U;
    private static final /* synthetic */ int ab;
    private static /* synthetic */ String[] lllIIlllI;
    private static /* synthetic */ int[] lllIIllll;
    public static /* synthetic */ int[] ag;
    private static final /* synthetic */ int[] ae;
    private static final /* synthetic */ long W;
    private static final /* synthetic */ long X;
    public static final /* synthetic */ ThreadLocalRandom T;
    private static final /* synthetic */ int ac;
    private static final /* synthetic */ int Z;
    static /* synthetic */ WorldArea ai;
    private static final /* synthetic */ Map<Integer, Integer> Y;
    static /* synthetic */ WorldPoint ah;

    private static boolean llIIIlIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIIlIIIIll(String lllIIllIIIlIl, String lllIIllIIIlII) {
        try {
            SecretKeySpec lllIIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIIlII.getBytes(StandardCharsets.UTF_8)), lllIIllll[14]), "DES");
            Cipher lllIIllIIIlll = Cipher.getInstance("DES");
            lllIIllIIIlll.init(lllIIllll[9], lllIIllIIlIII);
            return new String(lllIIllIIIlll.doFinal(Base64.getDecoder().decode(lllIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIIIllI) {
            lllIIllIIIllI.printStackTrace();
            return null;
        }
    }

    public static int c(int lllIlIlIIIIlI, int i) {
        int i2 = i - lllIlIlIIIIlI;
        if (llIIIlIIlIlI(i2)) {
            return lllIlIlIIIIlI;
        }
        if (llIIIlIIlllI(Math.abs(i2), lllIIllll[1])) {
            if (llIIIlIIllII(T.nextBoolean() ? 1 : 0)) {
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (26 ^ 13) & ((37 ^ 50) ^ (-1)) : lllIlIlIIIIlI;
            }
            return i;
        }
        if (llIIIlIIllll(i2)) {
            lllIlIlIIIIlI = i;
            i = lllIlIlIIIIlI;
        }
        return lllIlIlIIIIlI + T.nextInt((i - lllIlIlIIIIlI) + lllIIllll[1]);
    }

    public static void a(WorldPoint worldPoint) {
        if (llIIIlIIlIlI(C0014o.cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(C0014o.cD), lllIIllll[5])) {
                AccBuilderGWD.c = lllIIlllI[lllIIllll[9]];
                Movement.walkTo(C0014o.cD);
                "".length();
                Time.sleepTicks(lllIIllll[1]);
                "".length();
            }
            if (llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(C0014o.cD), lllIIllll[5])) {
                AccBuilderGWD.c = lllIIlllI[lllIIllll[5]];
                if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lllIIllll[1]];
                    strArr[lllIIllll[2]] = lllIIlllI[lllIIllll[28]];
                    return npc.hasAction(strArr);
                });
                if (llIIIlIIlIll(nearest)) {
                    String[] strArr = new String[lllIIllll[1]];
                    strArr[lllIIllll[2]] = lllIIlllI[lllIIllll[10]];
                    if (llIIIlIIllII(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(lllIIlllI[lllIIllll[11]]);
                        Time.sleepTicks(lllIIllll[5]);
                        "".length();
                    }
                    String[] strArr2 = new String[lllIIllll[1]];
                    strArr2[lllIIllll[2]] = lllIIlllI[lllIIllll[12]];
                    if (llIIIlIIlIlI(nearest.hasAction(strArr2) ? 1 : 0)) {
                        C0006g.b(lllIIlllI[lllIIllll[13]], C0014o.cG);
                        Time.sleepTicks(lllIIllll[1]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lllIIllll[1]];
                strArr3[lllIIllll[2]] = lllIIlllI[lllIIllll[14]];
                NPC nearest2 = NPCs.getNearest(strArr3);
                if (llIIIlIIlIll(nearest2)) {
                    String[] strArr4 = new String[lllIIllll[1]];
                    strArr4[lllIIllll[2]] = lllIIlllI[lllIIllll[15]];
                    if (llIIIlIIllII(nearest2.hasAction(strArr4) ? 1 : 0)) {
                        nearest2.interact(lllIIlllI[lllIIllll[16]]);
                        Time.sleepTicks(lllIIllll[5]);
                        "".length();
                    }
                    String[] strArr5 = new String[lllIIllll[1]];
                    strArr5[lllIIllll[2]] = lllIIlllI[lllIIllll[17]];
                    if (llIIIlIIlIlI(nearest2.hasAction(strArr5) ? 1 : 0)) {
                        C0006g.b(lllIIlllI[lllIIllll[18]], C0014o.cG);
                        Time.sleepTicks(lllIIllll[1]);
                        "".length();
                    }
                }
            }
        }
        if (llIIIlIIllII(C0014o.cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllIIllll[1]);
            "".length();
        }
    }

    public static void b(int[] iArr) {
        int i = lllIIllll[2];
        while (llIIIlIIlIIl(i, iArr.length)) {
            AccBuilderGWD.c = lllIIlllI[lllIIllll[2]];
            if (llIIIlIIlIlI(iArr[i])) {
                "".length();
                if (!((true ^ true) ^ (true ^ true))) {
                    return;
                }
            } else {
                Time.sleepTicks(lllIIllll[1]);
                "".length();
                l(iArr[i]);
                Time.sleep(c(lllIIllll[3], lllIIllll[4]));
                "".length();
            }
            i++;
            "".length();
            if ((-((((21 + 190) - 147) + 130) ^ (((147 + 35) - 114) + 130))) >= 0) {
                return;
            }
        }
        Time.sleepTicks(c(lllIIllll[1], lllIIllll[5]));
        "".length();
    }

    private static String llIIIlIIIlIl(String lllIIllIlIIlI, String lllIIllIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllll[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIlIIll) {
            lllIIllIlIIll.printStackTrace();
            return null;
        }
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    private static boolean llIIIlIIlIlI(int i) {
        return i == 0;
    }

    public static void C() {
        Widget widget = Widgets.get(lllIIllll[41], lllIIllll[42]);
        if (llIIIlIIlIll(widget)) {
            widget.interact(lllIIlllI[lllIIllll[43]]);
            Time.sleepTicks(lllIIllll[1]);
            "".length();
        }
    }

    public static void t() {
        Widgets.getAll(lllIIllll[6], widget -> {
            return widget.getText().contains(lllIIlllI[lllIIllll[101]]);
        });
        Widgets.getAll(lllIIllll[7], widget2 -> {
            return widget2.getText().contains(lllIIlllI[lllIIllll[100]]);
        });
        Widgets.getAll(lllIIllll[8], widget3 -> {
            return widget3.getText().contains(lllIIlllI[lllIIllll[99]]);
        });
        int i = lllIIllll[2];
        while (llIIIlIIlIIl(i, ae.length)) {
            if (llIIIlIIlIll(Widgets.get(ae[i], widget4 -> {
                return widget4.getText().contains(lllIIlllI[lllIIllll[98]]);
            }))) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ae[i]);
            }
            i++;
            "".length();
            if ((86 ^ 83) <= 0) {
                return;
            }
        }
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lllIIllll[51], lllIIllll[52], lllIIllll[2]);
        WorldArea worldArea = new WorldArea(lllIIllll[53], lllIIllll[54], lllIIllll[15], lllIIllll[55], lllIIllll[2]);
        WorldArea worldArea2 = new WorldArea(lllIIllll[56], lllIIllll[57], lllIIllll[58], lllIIllll[59], lllIIllll[2]);
        if (llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIllll[12]) && llIIIlIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIllll[60], lllIIllll[61], lllIIllll[1])), lllIIllll[35])) {
            AccBuilderGWD.c = lllIIlllI[lllIIllll[42]];
            if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lllIIllll[1]);
            "".length();
        }
        if (llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIllll[12]) && llIIIlIlIIIl(Players.getLocal().getWorldLocation().getY(), lllIIllll[52])) {
            if (llIIIlIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lllIIllll[1]];
                strArr[lllIIllll[2]] = lllIIlllI[lllIIllll[62]];
                TileObjects.getNearest(strArr).interact(lllIIlllI[lllIIllll[63]]);
                Time.sleepTicks(lllIIllll[9]);
                "".length();
            }
            if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lllIIllll[1]];
                strArr2[lllIIllll[2]] = lllIIlllI[lllIIllll[55]];
                C0006g.a(strArr2);
            }
        }
        if (llIIIlIlIIII(Players.getLocal().getWorldLocation().getY(), lllIIllll[52])) {
            if (llIIIlIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIllll[60], lllIIllll[61], lllIIllll[1])), lllIIllll[35])) {
                return;
            }
            AccBuilderGWD.c = lllIIlllI[lllIIllll[64]];
            if (llIIIlIIllII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllIIllll[51], lllIIllll[65], lllIIllll[2])) ? 1 : 0)) {
                c(new WorldPoint(lllIIllll[51], lllIIllll[66], lllIIllll[2]));
                Time.sleepTicks(lllIIllll[12]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllIIllll[1]);
            "".length();
        }
    }

    public static boolean i(int i) {
        int[] iArr = new int[lllIIllll[1]];
        iArr[lllIIllll[2]] = i;
        return Bank.contains(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean d(int[] iArr) {
        int i = lllIIllll[2];
        while (llIIIlIIlIIl(i, iArr.length)) {
            if (llIIIlIIlIlI(i(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return lllIIllll[2];
            }
            i++;
            "".length();
            if (" ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean B() {
        if (llIIIlIIlIll(Widgets.get(lllIIllll[33], lllIIllll[1]))) {
            ?? r0 = lllIIllll[1];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIllll[2];
    }

    public static void y() {
        Widget widget = Widgets.get(lllIIllll[22], lllIIllll[23], lllIIllll[2]);
        if (llIIIlIIlIll(widget)) {
            widget.interact(lllIIlllI[lllIIllll[24]]);
            Time.sleepTicks(lllIIllll[5]);
            "".length();
        }
    }

    private static void llIIIlIIIllI() {
        lllIIlllI = new String[lllIIllll[180]];
        lllIIlllI[lllIIllll[2]] = llIIIlIIIIll("fzcY5TqjuMQVTt7SYEA/mQ==", "vDVuu");
        lllIIlllI[lllIIllll[1]] = llIIIlIIIlII("bGRaaGpsZA==", "AIwEG");
        lllIIlllI[lllIIllll[9]] = llIIIlIIIlII("KRQUYhsIVRQnABQ=", "gubBo");
        lllIIlllI[lllIIllll[5]] = llIIIlIIIIll("O9oaGNTkuo/68QqpbFXV9arJfV64cAjv", "cFfAM");
        lllIIlllI[lllIIllll[10]] = llIIIlIIIlII("BzklEEEHPyQHACU/Ow0UJA==", "WVWda");
        lllIIlllI[lllIIllll[11]] = llIIIlIIIlIl("3HETnOQfrha7IZnF4l8QzFaBsVRUefj0", "hRFXS");
        lllIIlllI[lllIIllll[12]] = llIIIlIIIlII("Cj0QB2wKOxEQLSg7Dho5KQ==", "ZRbsL");
        lllIIlllI[lllIIllll[13]] = llIIIlIIIlIl("bA7NNpSuJbs=", "fSAjZ");
        lllIIlllI[lllIIllll[14]] = llIIIlIIIIll("kMRl48mypr9uHHIJ1pt+pXQSjKhafWQu", "UEIJm");
        lllIIlllI[lllIIllll[15]] = llIIIlIIIlII("PyUxG08/IzAMDh0jLwYaHA==", "oJCoo");
        lllIIlllI[lllIIllll[16]] = llIIIlIIIlII("FAgTO0kUDhIsCDYODSYcNw==", "DgaOi");
        lllIIlllI[lllIIllll[17]] = llIIIlIIIlII("CQQdPUIJAhwqAysCAyAXKg==", "YkoIb");
        lllIIlllI[lllIIllll[18]] = llIIIlIIIlIl("eB55/W5G6/9MMpdV4PZL9lmrW+Mj6NBD", "cXQiy");
        lllIIlllI[lllIIllll[19]] = llIIIlIIIIll("CPaoGUvrQuo=", "XAYED");
        lllIIlllI[lllIIllll[20]] = llIIIlIIIlII("BkwzDxQgBBwGKSwVBAYmNQYrOxMkKj01BigfAT07awIdMwUqAjMdCCEFIi8LICoCLwsgWBsiEw==", "EvoZg");
        lllIIlllI[lllIIllll[21]] = llIIIlIIIlIl("6tSiq6B0tgl54+PEiz2M+Q==", "lozYe");
        lllIIlllI[lllIIllll[24]] = llIIIlIIIIll("GCe/thifVUM=", "ItaXC");
        lllIIlllI[lllIIllll[25]] = llIIIlIIIlII("ODAAcCEZcSAxJwQ+FTt1IXEUMTsd", "vQvPU");
        lllIIlllI[lllIIllll[31]] = llIIIlIIIlIl("8Vx0gQMsqMs=", "JOWVH");
        lllIIlllI[lllIIllll[32]] = llIIIlIIIlII("GywFJRk6IwxhFzIjACgbNA==", "SMkAu");
        lllIIlllI[lllIIllll[35]] = llIIIlIIIlII("HzANIRk4dTYlCCI8DyMJ", "LUaDz");
        lllIIlllI[lllIIllll[37]] = llIIIlIIIlIl("XjK9VkClICY=", "tzbrF");
        lllIIlllI[lllIIllll[40]] = llIIIlIIIlIl("3LxtZf4RpkU=", "JEEOr");
        lllIIlllI[lllIIllll[34]] = llIIIlIIIlIl("88ep49Yp19k=", "tpEas");
        lllIIlllI[lllIIllll[43]] = llIIIlIIIIll("LKSppR5eZPfD3HkIymNNlA==", "rcUoM");
        lllIIlllI[lllIIllll[44]] = llIIIlIIIIll("J2QPysAw5Fc=", "orUYS");
        lllIIlllI[lllIIllll[45]] = llIIIlIIIIll("cEbr1dQpYI0=", "qRTaV");
        lllIIlllI[lllIIllll[46]] = llIIIlIIIIll("r6MvoLN7sM0=", "EKziH");
        lllIIlllI[lllIIllll[47]] = llIIIlIIIlII("BRA3BC4=", "RyRhJ");
        lllIIlllI[lllIIllll[23]] = llIIIlIIIlII("DjAyOBk=", "KAGQi");
        lllIIlllI[lllIIllll[48]] = llIIIlIIIlII("LicQJwA=", "kVeNp");
        lllIIlllI[lllIIllll[50]] = llIIIlIIIIll("U8jY3tYPhPgzqhyv/J6VVcvSO1zsfRJr", "bWoYJ");
        lllIIlllI[lllIIllll[42]] = llIIIlIIIIll("GhjxCglDOaijPKYYlamTlsvMendTQgo0", "nNfVd");
        lllIIlllI[lllIIllll[62]] = llIIIlIIIIll("0pnoGO5+GEA=", "XyuJr");
        lllIIlllI[lllIIllll[63]] = llIIIlIIIIll("KT/UsRG0XOw=", "GQkeX");
        lllIIlllI[lllIIllll[55]] = llIIIlIIIIll("GCQMiMmhTC2r4ngH75S4n9IeJ4fTTTEV", "MzCbO");
        lllIIlllI[lllIIllll[64]] = llIIIlIIIIll("nlcnylxwob/I6PVI+93TsqS5mWJAvPHc", "pztqS");
        lllIIlllI[lllIIllll[67]] = llIIIlIIIlII("GxcKLA==", "KXYxw");
        lllIIlllI[lllIIllll[68]] = llIIIlIIIIll("TtYfZYfIPIJL7P9bptPaRg==", "BPEys");
        lllIIlllI[lllIIllll[69]] = llIIIlIIIIll("VwsZwPvxtsXP7zOvvoFd5dun1viVI2PO", "hfigV");
        lllIIlllI[lllIIllll[29]] = llIIIlIIIlIl("JUVFc+WZPs0sDJc2RBp73Q==", "fKdky");
        lllIIlllI[lllIIllll[39]] = llIIIlIIIlII("BBocKWo3ChwnJiwOHCM=", "EohFJ");
        lllIIlllI[lllIIllll[73]] = llIIIlIIIlIl("Y618Ps+N65evSBcw9fwm8w==", "ygSYh");
        lllIIlllI[lllIIllll[74]] = llIIIlIIIlIl("FZrXqdgQCfGWaNINr5czew==", "tbMwe");
        lllIIlllI[lllIIllll[75]] = llIIIlIIIIll("ag6RA25nln4=", "tTjjL");
        lllIIlllI[lllIIllll[76]] = llIIIlIIIlIl("ctYzZKV/8TQ=", "XydMA");
        lllIIlllI[lllIIllll[77]] = llIIIlIIIIll("vnc/Abx7OLg=", "QIRki");
        lllIIlllI[lllIIllll[78]] = llIIIlIIIlIl("4r9b6bd8WAM=", "bkeds");
        lllIIlllI[lllIIllll[82]] = llIIIlIIIlII("VjkCMHQ=", "jJvBJ");
        lllIIlllI[lllIIllll[84]] = llIIIlIIIIll("DrVZP5aiSqY=", "piFkm");
        lllIIlllI[lllIIllll[79]] = llIIIlIIIlIl("8Nw+YmZTvII=", "GdbUQ");
        lllIIlllI[lllIIllll[85]] = llIIIlIIIIll("4AlFSs0Xru0=", "WgqcE");
        lllIIlllI[lllIIllll[86]] = llIIIlIIIlIl("Ira8NHwpjRM=", "ROQlw");
        lllIIlllI[lllIIllll[89]] = llIIIlIIIlII("KjUPDh0DIw==", "fPnih");
        lllIIlllI[lllIIllll[90]] = llIIIlIIIlIl("vtDXbM2jYZY=", "AVyfB");
        lllIIlllI[lllIIllll[91]] = llIIIlIIIlIl("xIS8UXUmJ6I=", "GjOvt");
        lllIIlllI[lllIIllll[92]] = llIIIlIIIlIl("XTAtwlLiPpY=", "aclqy");
        lllIIlllI[lllIIllll[93]] = llIIIlIIIlII("NwQHDxQSDw==", "safky");
        lllIIlllI[lllIIllll[94]] = llIIIlIIIIll("6A+kfz0qyO7J0QlSLxE53w==", "oMpDq");
        lllIIlllI[lllIIllll[95]] = llIIIlIIIlII("IwcHCwY=", "Whsjj");
        lllIIlllI[lllIIllll[96]] = llIIIlIIIlII("KgAnNw==", "heSVt");
        lllIIlllI[lllIIllll[28]] = llIIIlIIIlIl("aQYsj3kb15lCGygyB+ZrKvpko3zGHFdG", "OENwh");
        lllIIlllI[lllIIllll[98]] = llIIIlIIIIll("xyQ14sLkfgmzYwo2gdMOCg==", "zSmuq");
        lllIIlllI[lllIIllll[99]] = llIIIlIIIIll("OcBFUv856Gp1/7ViL+M77g==", "lHygB");
        lllIIlllI[lllIIllll[100]] = llIIIlIIIlIl("LFp19ZNyyznRekZneaMMVw==", "UKGIN");
        lllIIlllI[lllIIllll[101]] = llIIIlIIIIll("nD9C6rSTyjLA1B3jYQCkKA==", "GjMlS");
        lllIIlllI[lllIIllll[104]] = llIIIlIIIIll("+ap3dJzMcwfPpCc5IrIzL89kl+QItyoW+pXi7P5A4yy9eVmYYj2q6wEYyGmHCa0fhvipUf5HABk=", "gZnjG");
    }

    private static boolean llIIIlIlIIIl(int i, int i2) {
        return i <= i2;
    }

    public static void c(int[] iArr) {
        int i = lllIIllll[2];
        int length = iArr.length;
        int lllIlIlIIlIII = lllIIllll[2];
        while (llIIIlIIlIIl(lllIlIlIIlIII, length)) {
            int i2 = iArr[lllIlIlIIlIII];
            int bit = Vars.getBit(i2);
            if (!llIIIlIIllII(Y.containsKey(Integer.valueOf(i2)) ? 1 : 0) || llIIIlIIllIl(Y.get(Integer.valueOf(i2)).intValue(), bit)) {
                if (llIIIlIIllII(Y.containsKey(Integer.valueOf(i2)) ? 1 : 0)) {
                    System.out.println(i2 + " - Old Value: " + String.valueOf(Y.get(Integer.valueOf(i2))) + ", Current Value: " + bit);
                    "".length();
                    if (" ".length() >= ((119 ^ 102) ^ (20 ^ 1))) {
                        return;
                    }
                } else {
                    System.out.println(i2 + ": " + bit);
                }
                Y.put(Integer.valueOf(i2), Integer.valueOf(bit));
                "".length();
                i = lllIIllll[1];
            }
            lllIlIlIIlIII++;
            "".length();
            if (((((39 + 23) - (-14)) + 65) ^ (((1 + 83) - (-46)) + 6)) <= 0) {
                return;
            }
        }
        if (llIIIlIIllII(i)) {
            System.out.println(lllIIlllI[lllIIllll[1]]);
        }
    }

    private static boolean llIIIlIIlIll(Object obj) {
        return obj != null;
    }

    private static void llIIIlIIIlll() {
        lllIIllll = new int[260];
        lllIIllll[0] = (211 ^ 164) ^ (214 ^ 199);
        lllIIllll[1] = " ".length();
        lllIIllll[2] = (21 ^ 60) & ((35 ^ 10) ^ (-1));
        lllIIllll[3] = (((((146 + 28) - 46) + 36) + (((136 + 149) - 52) + 4)) - (((118 + 154) - 107) + 7)) + (57 ^ 35);
        lllIIllll[4] = (-8201) & 8621;
        lllIIllll[5] = "   ".length();
        lllIIllll[6] = ((118 + 130) - 54) + 35;
        lllIIllll[7] = (((29 ^ 126) + (58 ^ 89)) - (((6 + 109) - 1) + 50)) + ((109 + 51) - 103) + 71;
        lllIIllll[8] = ((67 + 6) - 7) + 165;
        lllIIllll[9] = "  ".length();
        lllIIllll[10] = 56 ^ 60;
        lllIIllll[11] = 67 ^ 70;
        lllIIllll[12] = (((136 + 8) - 27) + 28) ^ (((7 + 147) - 75) + 72);
        lllIIllll[13] = 183 ^ 176;
        lllIIllll[14] = 191 ^ 183;
        lllIIllll[15] = 114 ^ 123;
        lllIIllll[16] = (168 ^ 149) ^ (87 ^ 96);
        lllIIllll[17] = (81 ^ 89) ^ "   ".length();
        lllIIllll[18] = 105 ^ 101;
        lllIIllll[19] = 42 ^ 39;
        lllIIllll[20] = (17 ^ 22) ^ (13 ^ 4);
        lllIIllll[21] = (((33 + 10) - 27) + 127) ^ (((51 + 102) - 35) + 10);
        lllIIllll[22] = (-3169) & 3832;
        lllIIllll[23] = (242 ^ 184) ^ (118 ^ 33);
        lllIIllll[24] = 77 ^ 93;
        lllIIllll[25] = 0 ^ 17;
        lllIIllll[26] = (-28808) & 31975;
        lllIIllll[27] = (-20994) & 24407;
        lllIIllll[28] = (((118 + 104) - 158) + 73) ^ (((29 + 5) - 24) + 170);
        lllIIllll[29] = (200 ^ 148) ^ (72 ^ 60);
        lllIIllll[30] = (-((-2759) & 27351)) & (-33) & 32631;
        lllIIllll[31] = (13 ^ 27) ^ (27 ^ 31);
        lllIIllll[32] = (183 ^ 161) ^ (50 ^ 55);
        lllIIllll[33] = ((65 + 29) - 16) + 56;
        lllIIllll[34] = 129 ^ 150;
        lllIIllll[35] = (((11 + 49) - (-3)) + 90) ^ (((42 + 2) - 27) + 124);
        lllIIllll[36] = (-" ".length()) & (-1684) & 16383;
        lllIIllll[37] = 52 ^ 33;
        lllIIllll[38] = (-((-4685) & 21213)) & (-1025) & 32253;
        lllIIllll[39] = (((130 + 133) - 170) + 86) ^ (((14 + 71) - (-19)) + 50);
        lllIIllll[40] = (((109 + 155) - 164) + 63) ^ (((96 + 173) - 98) + 10);
        lllIIllll[41] = 65 ^ 53;
        lllIIllll[42] = (136 ^ 180) ^ (161 ^ 189);
        lllIIllll[43] = (47 ^ 79) ^ (211 ^ 171);
        lllIIllll[44] = (220 ^ 187) ^ (5 ^ 123);
        lllIIllll[45] = (68 ^ 67) ^ (17 ^ 12);
        lllIIllll[46] = (39 ^ 76) ^ (233 ^ 153);
        lllIIllll[47] = (((73 + 105) - 116) + 65) ^ (250 ^ 153);
        lllIIllll[48] = (((76 + 95) - 97) + 68) ^ (((96 + 35) - 43) + 56);
        lllIIllll[49] = (-8195) & 30751;
        lllIIllll[50] = 74 ^ 85;
        lllIIllll[51] = (-((-1253) & 26343)) & (-1057) & 28607;
        lllIIllll[52] = (-((-6423) & 23007)) & (-12801) & 32767;
        lllIIllll[53] = (-4163) & 6619;
        lllIIllll[54] = (-12294) & 15677;
        lllIIllll[55] = 131 ^ 160;
        lllIIllll[56] = (-((-2481) & 32177)) & (-9) & 32127;
        lllIIllll[57] = (-((-5651) & 14035)) & (-20993) & 32767;
        lllIIllll[58] = (((175 + 133) - 199) + 111) ^ (((46 + 84) - 25) + 50);
        lllIIllll[59] = (((8 ^ 1) + (16 ^ 75)) - (4 ^ 88)) + ((106 + 93) - 123) + 59;
        lllIIllll[60] = (-29251) & 31710;
        lllIIllll[61] = (-((-4477) & 29695)) & (-1) & 28635;
        lllIIllll[62] = (((93 + 133) - 193) + 118) ^ (((167 + 172) - 317) + 160);
        lllIIllll[63] = 135 ^ 165;
        lllIIllll[64] = (196 ^ 176) ^ (31 ^ 79);
        lllIIllll[65] = (-((-8251) & 29307)) & (-8195) & 32635;
        lllIIllll[66] = (-8833) & 12229;
        lllIIllll[67] = (((96 + 45) - 71) + 112) ^ (((131 + 19) - 144) + 141);
        lllIIllll[68] = (202 ^ 184) ^ (235 ^ 191);
        lllIIllll[69] = "   ".length() ^ (225 ^ 197);
        lllIIllll[70] = -" ".length();
        lllIIllll[71] = (((79 ^ 115) + (26 ^ 39)) - (60 ^ 116)) + (184 ^ 195);
        lllIIllll[72] = (-167) & 759;
        lllIIllll[73] = 16 ^ 58;
        lllIIllll[74] = 19 ^ 56;
        lllIIllll[75] = (124 ^ 1) ^ (10 ^ 91);
        lllIIllll[76] = 154 ^ 183;
        lllIIllll[77] = 83 ^ 125;
        lllIIllll[78] = (37 ^ 69) ^ (79 ^ 0);
        lllIIllll[79] = (253 ^ 191) ^ (209 ^ 161);
        lllIIllll[80] = ((73 + 25) - (-42)) + 13;
        lllIIllll[81] = 226 ^ 135;
        lllIIllll[82] = 55 ^ 7;
        lllIIllll[83] = (-24673) & 26622;
        lllIIllll[84] = (((96 + 119) - 108) + 25) ^ (((99 + 0) - (-80)) + 2);
        lllIIllll[85] = 123 ^ 72;
        lllIIllll[86] = (((75 + 63) - 67) + 71) ^ (((32 + 105) - 51) + 100);
        lllIIllll[87] = (-29698) & 30171;
        lllIIllll[88] = (-8545) & 9077;
        lllIIllll[89] = 92 ^ 105;
        lllIIllll[90] = (((8 + 15) - (-101)) + 5) ^ (((1 + 26) - (-43)) + 113);
        lllIIllll[91] = (149 ^ 193) ^ (215 ^ 180);
        lllIIllll[92] = (((73 + 154) - 132) + 74) ^ (((135 + 35) - 125) + 100);
        lllIIllll[93] = 52 ^ 13;
        lllIIllll[94] = (219 ^ 152) ^ (67 ^ 58);
        lllIIllll[95] = (157 ^ 129) ^ (50 ^ 21);
        lllIIllll[96] = 51 ^ 15;
        lllIIllll[97] = (62 ^ 74) ^ (85 ^ 69);
        lllIIllll[98] = (153 ^ 160) ^ (145 ^ 150);
        lllIIllll[99] = (31 ^ 17) ^ (48 ^ 1);
        lllIIllll[100] = (50 ^ 61) ^ (78 ^ 1);
        lllIIllll[101] = (55 ^ 73) ^ (115 ^ 76);
        lllIIllll[102] = ((212 + 91) - 268) + 184;
        lllIIllll[103] = ((91 + 38) - (-11)) + 53;
        lllIIllll[104] = 17 ^ 83;
        lllIIllll[105] = (((((146 + 35) - 109) + 123) + (204 ^ 150)) - (((14 + 150) - (-8)) + 74)) + ((95 + 157) - 166) + 92;
        lllIIllll[106] = (-28674) & 31863;
        lllIIllll[107] = (-((-1657) & 26363)) & (-1) & 27903;
        lllIIllll[108] = (-4994) & 8191;
        lllIIllll[109] = (-((-4483) & 5022)) & (-4161) & 7903;
        lllIIllll[110] = (-((-2081) & 11183)) & (-16386) & 28671;
        lllIIllll[111] = (-((-1537) & 26259)) & (-4609) & 32767;
        lllIIllll[112] = 88 ^ 51;
        lllIIllll[113] = (-((-20619) & 23215)) & (-1) & 2942;
        lllIIllll[114] = (-7758) & 8063;
        lllIIllll[115] = (-28234) & 28543;
        lllIIllll[116] = (-29847) & 30198;
        lllIIllll[117] = (-6297) & 6651;
        lllIIllll[118] = (-29715) & 30070;
        lllIIllll[119] = (-((-4173) & 30943)) & (-9) & 27135;
        lllIIllll[120] = (-11290) & 11647;
        lllIIllll[121] = (-((-20874) & 24571)) & (-12289) & 16371;
        lllIIllll[122] = (-((-4371) & 8055)) & (-4097) & 8175;
        lllIIllll[123] = (-26670) & 27135;
        lllIIllll[124] = (-((-25522) & 29619)) & (-529) & 5119;
        lllIIllll[125] = (-7169) & 7663;
        lllIIllll[126] = (-((-8609) & 32162)) & (-8193) & 32241;
        lllIIllll[127] = (-5345) & 5880;
        lllIIllll[128] = (-((-3329) & 7642)) & (-16419) & 21247;
        lllIIllll[129] = (-25733) & 26046;
        lllIIllll[130] = (-((-3655) & 20039)) & (-13825) & 30699;
        lllIIllll[131] = (-21122) & 21455;
        lllIIllll[132] = (-17942) & 18295;
        lllIIllll[133] = (-31779) & 32255;
        lllIIllll[134] = (-((-9) & 31390)) & (-1065) & 32767;
        lllIIllll[135] = (-6727) & 7031;
        lllIIllll[136] = (-((-16393) & 23113)) & (-8193) & 15227;
        lllIIllll[137] = (-((-14050) & 32495)) & (-8193) & 27007;
        lllIIllll[138] = (-17465) & 17788;
        lllIIllll[139] = (-31763) & 32087;
        lllIIllll[140] = (-((-1102) & 20223)) & (-9217) & 28665;
        lllIIllll[141] = (-12803) & 13247;
        lllIIllll[142] = (-26149) & 26612;
        lllIIllll[143] = (-((-4613) & 32293)) & (-514) & 28671;
        lllIIllll[144] = (-((-1979) & 32703)) & (-1538) & 32751;
        lllIIllll[145] = (-((-274) & 789)) & (-10257) & 11263;
        lllIIllll[146] = (-((-11577) & 15677)) & (-19457) & 24063;
        lllIIllll[147] = (-162) & 683;
        lllIIllll[148] = (-((-4175) & 13055)) & (-3077) & 12286;
        lllIIllll[149] = (-((-337) & 30587)) & (-5) & 30719;
        lllIIllll[150] = (-18655) & 19166;
        lllIIllll[151] = (-20945) & 21503;
        lllIIllll[152] = (-((-17221) & 22469)) & (-18945) & 24569;
        lllIIllll[153] = (-25124) & 25455;
        lllIIllll[154] = (-23041) & 23545;
        lllIIllll[155] = (-((-24643) & 29775)) & (-161) & 5629;
        lllIIllll[156] = (-((-3137) & 27989)) & (-233) & 25598;
        lllIIllll[157] = (-((-22075) & 32443)) & (-5641) & 16335;
        lllIIllll[158] = (-6659) & 7138;
        lllIIllll[159] = (-((-4167) & 31463)) & (-4103) & 31742;
        lllIIllll[160] = (-19489) & 19967;
        lllIIllll[161] = (-15875) & 16367;
        lllIIllll[162] = (-12457) & 12798;
        lllIIllll[163] = (-22082) & 22527;
        lllIIllll[164] = (-((-26689) & 32477)) & (-16387) & 22494;
        lllIIllll[165] = (-3202) & 3551;
        lllIIllll[166] = (-8883) & 9203;
        lllIIllll[167] = (-13321) & 13661;
        lllIIllll[168] = (-6657) & 7078;
        lllIIllll[169] = (-((-9515) & 32571)) & (-1) & 23519;
        lllIIllll[170] = (-5634) & 6007;
        lllIIllll[171] = (-25603) & 25978;
        lllIIllll[172] = (-642) & 977;
        lllIIllll[173] = (-7861) & 8189;
        lllIIllll[174] = (-((-18753) & 32757)) & (-1) & 14335;
        lllIIllll[175] = (-3121) & 3453;
        lllIIllll[176] = (-25295) & 25598;
        lllIIllll[177] = (-20113) & 20474;
        lllIIllll[178] = (-((-9379) & 9919)) & (-25601) & 26463;
        lllIIllll[179] = (-((-4845) & 31469)) & (-1733) & 28663;
        lllIIllll[180] = " ".length() ^ (245 ^ 183);
        lllIIllll[181] = (-23243) & 23551;
        lllIIllll[182] = 121 ^ 61;
        lllIIllll[183] = (-((-21881) & 32249)) & (-4617) & 15295;
        lllIIllll[184] = (((190 + 191) - 242) + 86) ^ (((57 + 39) - 73) + 141);
        lllIIllll[185] = (-26633) & 27007;
        lllIIllll[186] = 84 ^ 18;
        lllIIllll[187] = (-((-1) & 4742)) & (-9217) & 14335;
        lllIIllll[188] = (-((-713) & 8175)) & (-137) & 8111;
        lllIIllll[189] = (48 ^ 119) ^ (109 ^ 98);
        lllIIllll[190] = (-14993) & 15295;
        lllIIllll[191] = 114 ^ 59;
        lllIIllll[192] = (-26309) & 26620;
        lllIIllll[193] = 79 ^ 5;
        lllIIllll[194] = (-17093) & 17405;
        lllIIllll[195] = 25 ^ 82;
        lllIIllll[196] = (-11905) & 12221;
        lllIIllll[197] = (165 ^ 185) ^ (96 ^ 48);
        lllIIllll[198] = (-23593) & 23931;
        lllIIllll[199] = 247 ^ 186;
        lllIIllll[200] = (-((-18901) & 19453)) & (-17411) & 18302;
        lllIIllll[201] = 217 ^ 151;
        lllIIllll[202] = (-((-2465) & 7585)) & (-10785) & 16247;
        lllIIllll[203] = (153 ^ 144) ^ (133 ^ 195);
        lllIIllll[204] = (-((-20737) & 29445)) & (-23681) & 32735;
        lllIIllll[205] = (4 ^ 22) ^ (34 ^ 96);
        lllIIllll[206] = (-13987) & 14334;
        lllIIllll[207] = (37 ^ 32) ^ (49 ^ 101);
        lllIIllll[208] = (-((-1743) & 32495)) & (-641) & 31743;
        lllIIllll[209] = 208 ^ 130;
        lllIIllll[210] = (-14345) & 14703;
        lllIIllll[211] = (((159 + 184) - 185) + 53) ^ (((93 + 49) - 114) + 100);
        lllIIllll[212] = (-8728) & 9087;
        lllIIllll[213] = 57 ^ 109;
        lllIIllll[214] = (-((-353) & 16369)) & (-1) & 16383;
        lllIIllll[215] = 8 ^ 93;
        lllIIllll[216] = (-13450) & 13817;
        lllIIllll[217] = (((29 + 108) - 105) + 185) ^ (((121 + 97) - 146) + 71);
        lllIIllll[218] = (-1567) & 2047;
        lllIIllll[219] = 127 ^ 40;
        lllIIllll[220] = (-((-9637) & 32181)) & (-1542) & 24567;
        lllIIllll[221] = 222 ^ 134;
        lllIIllll[222] = (-24076) & 24559;
        lllIIllll[223] = (203 ^ 186) ^ (118 ^ 94);
        lllIIllll[224] = (-16401) & 16885;
        lllIIllll[225] = 237 ^ 183;
        lllIIllll[226] = (-5649) & 6134;
        lllIIllll[227] = 118 ^ 45;
        lllIIllll[228] = (-12817) & 13303;
        lllIIllll[229] = (100 ^ 127) ^ (4 ^ 67);
        lllIIllll[230] = (-31766) & 32253;
        lllIIllll[231] = (28 ^ 62) ^ (((1 + 110) - 57) + 73);
        lllIIllll[232] = (-30215) & 30703;
        lllIIllll[233] = 198 ^ 152;
        lllIIllll[234] = (-24582) & 25087;
        lllIIllll[235] = 89 ^ 6;
        lllIIllll[236] = (-((-829) & 23359)) & (-8194) & 31231;
        lllIIllll[237] = 4 ^ 100;
        lllIIllll[238] = (-((-2315) & 3339)) & (-4611) & 6143;
        lllIIllll[239] = 122 ^ 27;
        lllIIllll[240] = (-12801) & 13310;
        lllIIllll[241] = 4 ^ 102;
        lllIIllll[242] = (-12289) & 12799;
        lllIIllll[243] = 63 ^ 92;
        lllIIllll[244] = (-14691) & 15207;
        lllIIllll[245] = (-((-11297) & 28002)) & (-12329) & 29551;
        lllIIllll[246] = (-11289) & 11807;
        lllIIllll[247] = (-((-20786) & 31159)) & (-21761) & 32653;
        lllIIllll[248] = (255 ^ 153) ^ " ".length();
        lllIIllll[249] = (-9381) & 9901;
        lllIIllll[250] = (166 ^ 142) ^ (62 ^ 126);
        lllIIllll[251] = (-((-20133) & 28645)) & (-1157) & 10191;
        lllIIllll[252] = (((52 + 153) - 163) + 126) ^ (((141 + 161) - 238) + 129);
        lllIIllll[253] = (-((-1674) & 12253)) & (-129) & 11231;
        lllIIllll[254] = 200 ^ 162;
        lllIIllll[255] = (-23857) & 24381;
        lllIIllll[256] = (-21282) & 24489;
        lllIIllll[257] = (-((-17783) & 30583)) & (-301) & 16319;
        lllIIllll[258] = (-((-11497) & 15611)) & (-24609) & 31679;
        lllIIllll[259] = (-106) & 3437;
    }

    public static long a(long j) {
        return u() - j;
    }

    public static void x() {
        if (llIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lllIIllll[10]);
            "".length();
        }
        if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
            D();
        }
    }

    private static boolean llIIIlIlIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void I() {
        if (llIIIlIIlIlI(Widgets.get(lllIIllll[80]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lllIIllll[80], lllIIllll[24]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lllIIllll[1]);
            Time.sleepTicks(lllIIllll[5]);
            "".length();
        }
    }

    public static int J() {
        return j(lllIIllll[81]);
    }

    public static String b(long j) {
        String str = lllIIlllI[lllIIllll[19]];
        Object[] objArr = new Object[lllIIllll[1]];
        objArr[lllIIllll[2]] = Integer.valueOf(lllIIllll[9]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lllIIllll[1]];
        objArr2[lllIIllll[2]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lllIIllll[1]];
        objArr3[lllIIllll[2]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lllIIllll[1]];
        objArr4[lllIIllll[2]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    private static boolean llIIIlIIlIII(int i) {
        return i > 0;
    }

    private static boolean llIIIlIIlllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(lllIIlllI[lllIIllll[67]]);
            httpURLConnection.setRequestProperty(lllIIlllI[lllIIllll[68]], lllIIlllI[lllIIllll[69]]);
            httpURLConnection.setDoOutput(lllIIllll[1]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if (((18 ^ 6) & ((191 ^ 171) ^ (-1))) > " ".length()) {
            }
        } catch (Exception lllIlIIIIIIlI) {
            lllIlIIIIIIlI.printStackTrace();
        }
    }

    public static int v() {
        return ag[c(lllIIllll[2], ag.length - lllIIllll[1])];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    public static void G() {
        int i = lllIIllll[2];
        do {
            String[] strArr = new String[lllIIllll[1]];
            strArr[lllIIllll[2]] = lllIIlllI[lllIIllll[73]];
            if (!llIIIlIIlIll(TileObjects.getNearest(strArr)) || !llIIIlIIlIlI(AccBuilderGWD.d ? 1 : 0)) {
                return;
            }
            AccBuilderGWD.c = lllIIlllI[lllIIllll[74]];
            String[] strArr2 = new String[lllIIllll[1]];
            strArr2[lllIIllll[2]] = lllIIlllI[lllIIllll[75]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (llIIIlIIlIlI(i)) {
                if (llIIIlIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(lllIIlllI[lllIIllll[76]]);
                }
                if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                    if (llIIIlIIlIlI(Dialog.canContinueNPC() ? 1 : 0) && llIIIlIIlIlI(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (llIIIlIIlIlI(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (llIIIlIIlIlI(widget.getText().contains(lllIIlllI[lllIIllll[82]]) ? 1 : 0)) {
                                    ?? r0 = lllIIllll[1];
                                    "".length();
                                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIIllll[2];
                            }).collect(Collectors.toList());
                            if (llIIIlIIlIlI(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lllIIllll[2])).getClickPoint().getX(), ((Widget) list.get(lllIIllll[2])).getClickPoint().getY(), (boolean) lllIIllll[1]);
                                Time.sleepTicks(lllIIllll[5]);
                                "".length();
                            }
                            if (llIIIlIIlllI(list.size(), lllIIllll[1])) {
                                i = lllIIllll[1];
                            }
                        }
                    }
                    if (!llIIIlIIlIlI(Dialog.canContinueNPC() ? 1 : 0) || llIIIlIIllII(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (llIIIlIIllII(i)) {
                String[] strArr3 = new String[lllIIllll[1]];
                strArr3[lllIIllll[2]] = lllIIlllI[lllIIllll[77]];
                TileObjects.getNearest(strArr3).interact(lllIIlllI[lllIIllll[78]]);
                Time.sleepTicks(lllIIllll[11]);
                "".length();
            }
            Time.sleepTicks(lllIIllll[1]);
            "".length();
            "".length();
        } while (0 == 0);
    }

    private static boolean llIIIlIIllIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIlIIllll(int i) {
        return i < 0;
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    public static long u() {
        return W + ((System.nanoTime() - X) / 1000000);
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(lllIIlllI[lllIIllll[20]]));
        bufferedWriter.write(str + System.getProperty(lllIIlllI[lllIIllll[21]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void E() {
        if (llIIIlIIlIlI(j(lllIIllll[71]))) {
            if (llIIIlIIlIlI(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lllIIllll[1]);
                "".length();
            }
            if (llIIIlIIllII(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lllIIllll[72], lllIIllll[48]);
                if (llIIIlIIlIll(widget)) {
                    widget.interact(lllIIlllI[lllIIllll[29]]);
                    Time.sleepTicks(lllIIllll[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean H() {
        if (llIIIlIIlIlI(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIlIlI(V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ah), lllIIllll[79]) && !llIIIlIIllII(ai.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lllIIllll[2];
        }
        ?? r0 = lllIIllll[1];
        "".length();
        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean llIIIlIIllII(int i) {
        return i != 0;
    }

    public static void F() {
        if (llIIIlIIlllI(j(lllIIllll[71]), lllIIllll[1])) {
            if (llIIIlIIlIlI(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lllIIllll[1]);
                "".length();
            }
            if (llIIIlIIllII(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lllIIllll[72], lllIIllll[48]);
                if (llIIIlIIlIll(widget)) {
                    widget.interact(lllIIlllI[lllIIllll[39]]);
                    Time.sleepTicks(lllIIllll[1]);
                    "".length();
                }
            }
        }
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(af), lllIIllll[10])) {
            AccBuilderGWD.c = lllIIlllI[lllIIllll[25]];
            WorldArea worldArea = new WorldArea(lllIIllll[26], lllIIllll[27], lllIIllll[28], lllIIllll[29], lllIIllll[2]);
            int[] iArr = new int[lllIIllll[1]];
            iArr[lllIIllll[2]] = lllIIllll[30];
            boolean contains = Inventory.contains(iArr);
            if (llIIIlIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = lllIIllll[1];
                "".length();
                if ((-" ".length()) >= 0) {
                    return;
                }
            } else {
                i = lllIIllll[2];
            }
            if (llIIIlIIllII((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[lllIIllll[1]];
                iArr2[lllIIllll[2]] = lllIIllll[30];
                Inventory.getFirst(iArr2).interact(lllIIlllI[lllIIllll[31]]);
                Time.sleepTicks(lllIIllll[14]);
                "".length();
            }
            Movement.walkTo(af);
            "".length();
            Time.sleepTicks(lllIIllll[1]);
            "".length();
        }
        if (llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(af), lllIIllll[10])) {
            if (llIIIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            AccBuilderGWD.c = lllIIlllI[lllIIllll[32]];
            if (llIIIlIIllII(z ? 1 : 0) && llIIIlIIlIII(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(lllIIllll[10]);
                "".length();
            }
            if (llIIIlIIllII(z2 ? 1 : 0) && llIIIlIIlIII(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(lllIIllll[9]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                int intValue2 = entry.getValue().intValue();
                System.out.println("Key: " + intValue + ", Value: " + intValue2);
                C0000a.a(intValue, intValue2);
                Time.sleepTicks(lllIIllll[1]);
                "".length();
                "".length();
                if ((-"  ".length()) > 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean z() {
        if (!llIIIlIIllII(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lllIIllll[36]));
        })).intValue()) || llIIIlIIlIlI(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lllIIllll[38]));
        })).intValue())) {
            ?? r0 = lllIIllll[1];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIllll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void A() {
        if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIlIIllII(z() ? 1 : 0)) {
            if (llIIIlIIlIlI(B() ? 1 : 0)) {
                C();
            }
            if (llIIIlIIllII(B() ? 1 : 0)) {
                Widget widget = Widgets.get(lllIIllll[33], lllIIllll[34], lllIIllll[13]);
                if (llIIIlIIlIll(widget)) {
                    widget.interact(lllIIlllI[lllIIllll[35]]);
                    Time.sleepTicks(lllIIllll[1]);
                    "".length();
                }
                if (llIIIlIIlIlI(Vars.getBit(lllIIllll[36]))) {
                    Widget widget2 = Widgets.get(lllIIllll[33], lllIIllll[32], lllIIllll[29]);
                    if (llIIIlIIlIll(widget2)) {
                        if (llIIIlIIlIlI(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(lllIIllll[33], lllIIllll[35], lllIIllll[11]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lllIIllll[1]);
                            Time.sleepTicks(lllIIllll[1]);
                            "".length();
                        }
                        if (llIIIlIIllII(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(lllIIlllI[lllIIllll[37]]);
                            Time.sleepTicks(lllIIllll[1]);
                            "".length();
                        }
                    }
                }
                if (llIIIlIIlIlI(Vars.getBit(lllIIllll[38]))) {
                    Widget widget4 = Widgets.get(lllIIllll[33], lllIIllll[32], lllIIllll[39]);
                    if (llIIIlIIlIll(widget4)) {
                        if (llIIIlIIlIlI(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(lllIIllll[33], lllIIllll[35], lllIIllll[11]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lllIIllll[1]);
                            Time.sleepTicks(lllIIllll[1]);
                            "".length();
                        }
                        if (llIIIlIIllII(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(lllIIlllI[lllIIllll[40]]);
                            Time.sleepTicks(lllIIllll[9]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(lllIIllll[33], lllIIllll[10]);
        if (llIIIlIIlIll(widget6)) {
            widget6.interact(lllIIlllI[lllIIllll[34]]);
            Time.sleepTicks(lllIIllll[1]);
            "".length();
        }
    }

    public static double w() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    static {
        llIIIlIIIlll();
        llIIIlIIIllI();
        ac = lllIIllll[102];
        Z = lllIIllll[103];
        S = lllIIlllI[lllIIllll[104]];
        ab = lllIIllll[105];
        ad = lllIIllll[6];
        aa = lllIIllll[8];
        T = ThreadLocalRandom.current();
        U = new WorldArea(lllIIllll[106], lllIIllll[107], lllIIllll[79], lllIIllll[82], lllIIllll[2]);
        V = new WorldArea(lllIIllll[108], lllIIllll[109], lllIIllll[34], lllIIllll[48], lllIIllll[1]);
        W = System.currentTimeMillis();
        X = System.nanoTime();
        Y = new HashMap();
        int[] iArr = new int[lllIIllll[11]];
        iArr[lllIIllll[2]] = lllIIllll[103];
        iArr[lllIIllll[1]] = lllIIllll[8];
        iArr[lllIIllll[9]] = lllIIllll[105];
        iArr[lllIIllll[5]] = lllIIllll[102];
        iArr[lllIIllll[10]] = lllIIllll[6];
        ae = iArr;
        af = new WorldPoint(lllIIllll[110], lllIIllll[111], lllIIllll[2]);
        int[] iArr2 = new int[lllIIllll[112]];
        iArr2[lllIIllll[2]] = lllIIllll[113];
        iArr2[lllIIllll[1]] = lllIIllll[114];
        iArr2[lllIIllll[9]] = lllIIllll[115];
        iArr2[lllIIllll[5]] = lllIIllll[116];
        iArr2[lllIIllll[10]] = lllIIllll[117];
        iArr2[lllIIllll[11]] = lllIIllll[118];
        iArr2[lllIIllll[12]] = lllIIllll[119];
        iArr2[lllIIllll[13]] = lllIIllll[120];
        iArr2[lllIIllll[14]] = lllIIllll[121];
        iArr2[lllIIllll[15]] = lllIIllll[122];
        iArr2[lllIIllll[16]] = lllIIllll[123];
        iArr2[lllIIllll[17]] = lllIIllll[124];
        iArr2[lllIIllll[18]] = lllIIllll[125];
        iArr2[lllIIllll[19]] = lllIIllll[126];
        iArr2[lllIIllll[20]] = lllIIllll[127];
        iArr2[lllIIllll[21]] = lllIIllll[128];
        iArr2[lllIIllll[24]] = lllIIllll[129];
        iArr2[lllIIllll[25]] = lllIIllll[130];
        iArr2[lllIIllll[31]] = lllIIllll[131];
        iArr2[lllIIllll[32]] = lllIIllll[132];
        iArr2[lllIIllll[35]] = lllIIllll[133];
        iArr2[lllIIllll[37]] = lllIIllll[134];
        iArr2[lllIIllll[40]] = lllIIllll[135];
        iArr2[lllIIllll[34]] = lllIIllll[136];
        iArr2[lllIIllll[43]] = lllIIllll[137];
        iArr2[lllIIllll[44]] = lllIIllll[138];
        iArr2[lllIIllll[45]] = lllIIllll[139];
        iArr2[lllIIllll[46]] = lllIIllll[140];
        iArr2[lllIIllll[47]] = lllIIllll[141];
        iArr2[lllIIllll[23]] = lllIIllll[142];
        iArr2[lllIIllll[48]] = lllIIllll[143];
        iArr2[lllIIllll[50]] = lllIIllll[144];
        iArr2[lllIIllll[42]] = lllIIllll[145];
        iArr2[lllIIllll[62]] = lllIIllll[146];
        iArr2[lllIIllll[63]] = lllIIllll[147];
        iArr2[lllIIllll[55]] = lllIIllll[148];
        iArr2[lllIIllll[64]] = lllIIllll[149];
        iArr2[lllIIllll[67]] = lllIIllll[150];
        iArr2[lllIIllll[68]] = lllIIllll[151];
        iArr2[lllIIllll[69]] = lllIIllll[152];
        iArr2[lllIIllll[29]] = lllIIllll[153];
        iArr2[lllIIllll[39]] = lllIIllll[154];
        iArr2[lllIIllll[73]] = lllIIllll[155];
        iArr2[lllIIllll[74]] = lllIIllll[156];
        iArr2[lllIIllll[75]] = lllIIllll[157];
        iArr2[lllIIllll[76]] = lllIIllll[158];
        iArr2[lllIIllll[77]] = lllIIllll[159];
        iArr2[lllIIllll[78]] = lllIIllll[160];
        iArr2[lllIIllll[82]] = lllIIllll[161];
        iArr2[lllIIllll[84]] = lllIIllll[162];
        iArr2[lllIIllll[79]] = lllIIllll[163];
        iArr2[lllIIllll[85]] = lllIIllll[164];
        iArr2[lllIIllll[86]] = lllIIllll[165];
        iArr2[lllIIllll[89]] = lllIIllll[166];
        iArr2[lllIIllll[90]] = lllIIllll[167];
        iArr2[lllIIllll[91]] = lllIIllll[168];
        iArr2[lllIIllll[92]] = lllIIllll[169];
        iArr2[lllIIllll[93]] = lllIIllll[170];
        iArr2[lllIIllll[94]] = lllIIllll[171];
        iArr2[lllIIllll[95]] = lllIIllll[172];
        iArr2[lllIIllll[96]] = lllIIllll[173];
        iArr2[lllIIllll[28]] = lllIIllll[174];
        iArr2[lllIIllll[98]] = lllIIllll[175];
        iArr2[lllIIllll[99]] = lllIIllll[176];
        iArr2[lllIIllll[100]] = lllIIllll[177];
        iArr2[lllIIllll[101]] = lllIIllll[178];
        iArr2[lllIIllll[104]] = lllIIllll[179];
        iArr2[lllIIllll[180]] = lllIIllll[181];
        iArr2[lllIIllll[182]] = lllIIllll[183];
        iArr2[lllIIllll[184]] = lllIIllll[185];
        iArr2[lllIIllll[186]] = lllIIllll[187];
        iArr2[lllIIllll[58]] = lllIIllll[188];
        iArr2[lllIIllll[189]] = lllIIllll[190];
        iArr2[lllIIllll[191]] = lllIIllll[192];
        iArr2[lllIIllll[193]] = lllIIllll[194];
        iArr2[lllIIllll[195]] = lllIIllll[196];
        iArr2[lllIIllll[197]] = lllIIllll[198];
        iArr2[lllIIllll[199]] = lllIIllll[200];
        iArr2[lllIIllll[201]] = lllIIllll[202];
        iArr2[lllIIllll[203]] = lllIIllll[204];
        iArr2[lllIIllll[205]] = lllIIllll[206];
        iArr2[lllIIllll[207]] = lllIIllll[208];
        iArr2[lllIIllll[209]] = lllIIllll[210];
        iArr2[lllIIllll[211]] = lllIIllll[212];
        iArr2[lllIIllll[213]] = lllIIllll[214];
        iArr2[lllIIllll[215]] = lllIIllll[216];
        iArr2[lllIIllll[217]] = lllIIllll[218];
        iArr2[lllIIllll[219]] = lllIIllll[220];
        iArr2[lllIIllll[221]] = lllIIllll[222];
        iArr2[lllIIllll[223]] = lllIIllll[224];
        iArr2[lllIIllll[225]] = lllIIllll[226];
        iArr2[lllIIllll[227]] = lllIIllll[228];
        iArr2[lllIIllll[229]] = lllIIllll[230];
        iArr2[lllIIllll[231]] = lllIIllll[232];
        iArr2[lllIIllll[233]] = lllIIllll[234];
        iArr2[lllIIllll[235]] = lllIIllll[236];
        iArr2[lllIIllll[237]] = lllIIllll[238];
        iArr2[lllIIllll[239]] = lllIIllll[240];
        iArr2[lllIIllll[241]] = lllIIllll[242];
        iArr2[lllIIllll[243]] = lllIIllll[244];
        iArr2[lllIIllll[97]] = lllIIllll[245];
        iArr2[lllIIllll[81]] = lllIIllll[246];
        iArr2[lllIIllll[0]] = lllIIllll[247];
        iArr2[lllIIllll[248]] = lllIIllll[249];
        iArr2[lllIIllll[250]] = lllIIllll[251];
        iArr2[lllIIllll[252]] = lllIIllll[253];
        iArr2[lllIIllll[254]] = lllIIllll[255];
        ag = iArr2;
        ah = new WorldPoint(lllIIllll[256], lllIIllll[257], lllIIllll[9]);
        ai = new WorldArea(lllIIllll[258], lllIIllll[259], lllIIllll[62], lllIIllll[40], lllIIllll[2]);
    }

    public static void D() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIIIlIIllII(world.isMembers() ? 1 : 0) && llIIIlIlIIIl(world.getPlayerCount(), lllIIllll[83]) && llIIIlIIllIl(world.getId(), Worlds.getCurrentId()) && llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[84]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[79]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[85]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[86]]) ? 1 : 0) && llIIIlIIllIl(world.getId(), lllIIllll[87]) && llIIIlIIllIl(world.getId(), lllIIllll[88]) && llIIIlIIllIl(world.getId(), lllIIllll[88]) && llIIIlIIlIlI(world.getActivity().contains(lllIIlllI[lllIIllll[89]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().contains(lllIIlllI[lllIIllll[90]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().contains(lllIIlllI[lllIIllll[91]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[92]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[93]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[94]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[95]]) ? 1 : 0) && llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[96]]) ? 1 : 0) && llIIIlIlIIII(world.getPlayerCount(), lllIIllll[97])) {
                ?? r0 = lllIIllll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIllll[2];
        }));
    }

    private static String llIIIlIIIlII(String lllIIlIllIlIl, String lllIIlIllIlII) {
        String lllIIlIllIlIl2 = new String(Base64.getDecoder().decode(lllIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIllIIll = new StringBuilder();
        char[] charArray = lllIIlIllIlII.toCharArray();
        int lllIIlIllIIIl = lllIIllll[2];
        char[] charArray2 = lllIIlIllIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIIllll[2];
        while (llIIIlIIlIIl(i, length)) {
            char lllIIlIllIllI = charArray2[i];
            lllIIlIllIIll.append((char) (lllIIlIllIllI ^ charArray[lllIIlIllIIIl % charArray.length]));
            "".length();
            lllIIlIllIIIl++;
            i++;
            "".length();
            if (((191 ^ 129) ^ (109 ^ 87)) > ((107 ^ 28) ^ (61 ^ 78))) {
                return null;
            }
        }
        return String.valueOf(lllIIlIllIIll);
    }

    private static boolean llIIIlIlIIII(int i, int i2) {
        return i > i2;
    }

    public static void k(int i) {
        if (llIIIlIIllIl(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (llIIIlIlIIlI(findWorld)) {
                return;
            }
            if (llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World createWorld = Static.getClient().createWorld();
            createWorld.setActivity(findWorld.getActivity());
            createWorld.setAddress(findWorld.getAddress());
            createWorld.setId(findWorld.getId());
            createWorld.setPlayerCount(findWorld.getPlayers());
            createWorld.setLocation(findWorld.getLocation());
            createWorld.setTypes(WorldUtil.toWorldTypes(findWorld.getTypes()));
            Worlds.hopTo(createWorld);
        }
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (llIIIlIlIIlI(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (llIIIlIIlIll(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            i = lllIIllll[70];
        }
        int i3 = i;
        if (llIIIlIIlIll(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        } else {
            i2 = lllIIllll[70];
        }
        client.interact(lllIIllll[2], MenuAction.WALK.getId(), x, y, i3, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean s() {
        if (llIIIlIIlIII(j(lllIIllll[0]))) {
            ?? r0 = lllIIllll[1];
            "".length();
            return ((216 ^ 149) & ((51 ^ 126) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIllll[2];
    }

    public static void l(int i) {
        int[] iArr = new int[lllIIllll[1]];
        iArr[lllIIllll[2]] = i;
        if (llIIIlIIllII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIIllll[1]];
            iArr2[lllIIllll[2]] = i;
            if (llIIIlIIlIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIIllll[1]];
                iArr3[lllIIllll[2]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lllIIllll[1]];
                strArr[lllIIllll[2]] = lllIIlllI[lllIIllll[44]];
                if (llIIIlIIllII(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lllIIllll[1]];
                    iArr4[lllIIllll[2]] = i;
                    Inventory.getFirst(iArr4).interact(lllIIlllI[lllIIllll[45]]);
                }
                int[] iArr5 = new int[lllIIllll[1]];
                iArr5[lllIIllll[2]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lllIIllll[1]];
                strArr2[lllIIllll[2]] = lllIIlllI[lllIIllll[46]];
                if (llIIIlIIllII(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIIllll[1]];
                    iArr6[lllIIllll[2]] = i;
                    Inventory.getFirst(iArr6).interact(lllIIlllI[lllIIllll[47]]);
                }
                int[] iArr7 = new int[lllIIllll[1]];
                iArr7[lllIIllll[2]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lllIIllll[1]];
                strArr3[lllIIllll[2]] = lllIIlllI[lllIIllll[23]];
                if (llIIIlIIllII(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lllIIllll[1]];
                    iArr8[lllIIllll[2]] = i;
                    Inventory.getFirst(iArr8).interact(lllIIlllI[lllIIllll[48]]);
                }
                if (llIIIlIIlllI(i, lllIIllll[49])) {
                    Time.sleepTicks(lllIIllll[5]);
                    "".length();
                    String[] strArr4 = new String[lllIIllll[1]];
                    strArr4[lllIIllll[2]] = lllIIlllI[lllIIllll[50]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(lllIIllll[1]);
                    "".length();
                }
            }
        }
    }
}
