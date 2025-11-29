package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/e.class */
public class C0004e {
    private static final /* synthetic */ long V;
    private static final /* synthetic */ Map<Integer, Integer> W;
    static /* synthetic */ WorldArea aa;
    public static final /* synthetic */ String Q;
    public static /* synthetic */ int[] Y;
    private static /* synthetic */ int[] llllIIIIIl;
    static /* synthetic */ WorldPoint Z;
    public static /* synthetic */ WorldPoint X;
    private static final /* synthetic */ long U;
    static final /* synthetic */ WorldArea T;
    static final /* synthetic */ WorldArea S;
    public static final /* synthetic */ ThreadLocalRandom R;
    private static /* synthetic */ String[] lllIllllll;

    private static boolean llIIlIllIllII(int i, int i2) {
        return i != i2;
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    private static String llIIlIlIllIII(String lllllllllllllllllIllIIIlllllllII, String lllllllllllllllllIllIIIllllllIll) {
        try {
            SecretKeySpec lllllllllllllllllIllIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIIllllllIll.getBytes(StandardCharsets.UTF_8)), llllIIIIIl[20]), "DES");
            Cipher lllllllllllllllllIllIIIllllllllI = Cipher.getInstance("DES");
            lllllllllllllllllIllIIIllllllllI.init(llllIIIIIl[2], lllllllllllllllllIllIIIlllllllll);
            return new String(lllllllllllllllllIllIIIllllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIIlllllllIl) {
            lllllllllllllllllIllIIIlllllllIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlIllIIlIl() {
        lllIllllll = new String[llllIIIIIl[128]];
        lllIllllll[llllIIIIIl[1]] = llIIlIlIlIllI("LePO6wGIsFk=", "ClfmW");
        lllIllllll[llllIIIIIl[0]] = llIIlIlIlIlll("LFE/BB8KGRANIgYICA0tHxsnMBgONzE+DQICDTYwQR8ROA4AHz8WAwsYLiQACjcOJAAKRRcpGA==", "okcQl");
        lllIllllll[llllIIIIIl[2]] = llIIlIlIlIlll("GC0ZH1cHIQcbCxUwGAg=", "tDwzy");
        lllIllllll[llllIIIIIl[6]] = llIIlIlIllIII("ZqDXv61SiS4=", "RvibQ");
        lllIllllll[llllIIIIIl[3]] = llIIlIlIllIII("lI4sKuePWQXSfHcYP5VpUA==", "KBToE");
        lllIllllll[llllIIIIIl[14]] = llIIlIlIlIllI("wDy3mA/bkk0=", "WGvAN");
        lllIllllll[llllIIIIIl[17]] = llIIlIlIllIII("yFRRLqsSA9c=", "ATiWG");
        lllIllllll[llllIIIIIl[9]] = llIIlIlIllIII("9DSM+v7VDB4=", "oSbLE");
        lllIllllll[llllIIIIIl[20]] = llIIlIlIlIllI("XVjwNVDy8MVLOd+xUTsjqQ==", "muUxK");
        lllIllllll[llllIIIIIl[21]] = llIIlIlIllIII("hpfoz42rZBU=", "AoXob");
        lllIllllll[llllIIIIIl[22]] = llIIlIlIllIII("8axIkVH8Dyw=", "vTHGi");
        lllIllllll[llllIIIIIl[23]] = llIIlIlIlIllI("2PAbmLQY7G0=", "ZjLHt");
        lllIllllll[llllIIIIIl[24]] = llIIlIlIlIllI("YKqGLgl6Dak=", "rwUgS");
        lllIllllll[llllIIIIIl[25]] = llIIlIlIlIllI("O0M6gqvIQWY=", "mKoZO");
        lllIllllll[llllIIIIIl[26]] = llIIlIlIlIlll("HQsyIwA=", "XzGJp");
        lllIllllll[llllIIIIIl[28]] = llIIlIlIllIII("hGOaBA/12CN2KDlW2qJrdk6a3M2VkgvO", "MhFgZ");
        lllIllllll[llllIIIIIl[40]] = llIIlIlIlIllI("Chcem4xeikzPJ/EYhgKE8RDQV7W6oWV2", "VUrve");
        lllIllllll[llllIIIIIl[41]] = llIIlIlIlIlll("NzA1Ng==", "pQASZ");
        lllIllllll[llllIIIIIl[42]] = llIIlIlIlIllI("H9uAS+KupyU=", "trLRq");
        lllIllllll[llllIIIIIl[11]] = llIIlIlIllIII("Af6HtcWA7gbEHeFb3kMpnepNDN7Nglq2", "nGZVV");
        lllIllllll[llllIIIIIl[13]] = llIIlIlIlIllI("NWEQ1fGxGwlxoyFas2cp16iihE9GjdeR", "uymwv");
        lllIllllll[llllIIIIIl[45]] = llIIlIlIlIllI("S1EVRgnfQic=", "lNvJQ");
        lllIllllll[llllIIIIIl[46]] = llIIlIlIllIII("cDfy8DJ8NBNlDCzR50QwJA==", "NqEKb");
        lllIllllll[llllIIIIIl[8]] = llIIlIlIlIllI("9V7oBsP19rGFxH98QKJkxVFJyZLQX1hb", "zzHYs");
        lllIllllll[llllIIIIIl[51]] = llIIlIlIllIII("f50qHQrbGpoF6cygD8RSuA==", "SCIBh");
        lllIllllll[llllIIIIIl[52]] = llIIlIlIlIlll("DiQCOEs9NAI2ByYwAjI=", "OQvWk");
        lllIllllll[llllIIIIIl[53]] = llIIlIlIllIII("f8L7Va/Bct6Ue5Ix0JRu+g==", "HMSnl");
        lllIllllll[llllIIIIIl[54]] = llIIlIlIlIllI("vn72DeX4D1zljy2OwJo/Ag==", "Pxvtx");
        lllIllllll[llllIIIIIl[55]] = llIIlIlIllIII("AdRIlmA4t7U=", "tsteK");
        lllIllllll[llllIIIIIl[5]] = llIIlIlIllIII("AMIJDfNTwc8=", "LICUP");
        lllIllllll[llllIIIIIl[50]] = llIIlIlIlIlll("ASIVNwk9", "QMgCh");
        lllIllllll[llllIIIIIl[56]] = llIIlIlIlIlll("DDY9", "YEXnM");
        lllIllllll[llllIIIIIl[19]] = llIIlIlIllIII("N73kike0jsU=", "yMEJh");
        lllIllllll[llllIIIIIl[61]] = llIIlIlIlIlll("MTgADQo=", "EWtlf");
        lllIllllll[llllIIIIIl[62]] = llIIlIlIllIII("dhUboBRREpk=", "INBuv");
        lllIllllll[llllIIIIIl[33]] = llIIlIlIlIllI("Q5kEb4Ho8uk=", "aeWZF");
        lllIllllll[llllIIIIIl[63]] = llIIlIlIlIllI("Tb40UCZINt0=", "armvW");
        lllIllllll[llllIIIIIl[66]] = llIIlIlIlIllI("e5MiNmT2/pI=", "xMDdb");
        lllIllllll[llllIIIIIl[67]] = llIIlIlIlIlll("Og8aMA==", "xjnQH");
        lllIllllll[llllIIIIIl[68]] = llIIlIlIllIII("/iGaju+zbQ4=", "nPmQk");
        lllIllllll[llllIIIIIl[12]] = llIIlIlIlIlll("MT0DAzgUNg==", "uXbgU");
        lllIllllll[llllIIIIIl[16]] = llIIlIlIlIllI("+P+jFEiIpcI=", "WccJE");
        lllIllllll[llllIIIIIl[69]] = llIIlIlIllIII("+mGa4lpgrjMiCVvVZ5BC1A==", "nDcJc");
        lllIllllll[llllIIIIIl[70]] = llIIlIlIllIII("XpBYw8E6G/Q=", "PokYH");
        lllIllllll[llllIIIIIl[71]] = llIIlIlIlIllI("0cZlnShu8js=", "okkOx");
        lllIllllll[llllIIIIIl[73]] = llIIlIlIllIII("xEk3OAt7cKa6ST2ldcV1/WkJWNKPSzs6T60HNy9FeAzIY+QWfOno5YQxTe3n1f5ZSE56yvo1xqI=", "kpicd");
    }

    public static void C() {
        if (llIIlIllIIlll(j(llllIIIIIl[48]))) {
            if (llIIlIllIIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(llllIIIIIl[0]);
                "".length();
            }
            if (llIIlIllIlIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(llllIIIIIl[49], llllIIIIIl[50]);
                if (llIIlIllIlllI(widget)) {
                    widget.interact(lllIllllll[llllIIIIIl[51]]);
                    Time.sleepTicks(llllIIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIIlIllIlIlI(int i) {
        return i < 0;
    }

    private static boolean llIIlIllIlIll(int i, int i2) {
        return i < i2;
    }

    public static void A() {
        Widget widget = Widgets.get(llllIIIIIl[18], llllIIIIIl[19]);
        if (llIIlIllIlllI(widget)) {
            widget.interact(lllIllllll[llllIIIIIl[20]]);
            Time.sleepTicks(llllIIIIIl[0]);
            "".length();
        }
    }

    public static void B() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIIlIllIlIIl(world.isMembers() ? 1 : 0) && llIIlIlllIIII(world.getPlayerCount(), llllIIIIIl[60]) && llIIlIllIllII(world.getId(), Worlds.getCurrentId()) && llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[61]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[62]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[33]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[63]]) ? 1 : 0) && llIIlIllIllII(world.getId(), llllIIIIIl[64]) && llIIlIllIllII(world.getId(), llllIIIIIl[65]) && llIIlIllIllII(world.getId(), llllIIIIIl[65]) && llIIlIllIIlll(world.getActivity().contains(lllIllllll[llllIIIIIl[66]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().contains(lllIllllll[llllIIIIIl[67]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().contains(lllIllllll[llllIIIIIl[68]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[12]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[16]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[69]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[70]]) ? 1 : 0) && llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[71]]) ? 1 : 0) && llIIlIllIllll(world.getPlayerCount(), llllIIIIIl[72])) {
                ?? r0 = llllIIIIIl[0];
                "".length();
                return (-(191 ^ 186)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIIIl[1];
        }));
    }

    private static boolean llIIlIllIIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    public static void E() {
        int i = llllIIIIIl[1];
        do {
            String[] strArr = new String[llllIIIIIl[0]];
            strArr[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[53]];
            if (!llIIlIllIlllI(TileObjects.getNearest(strArr)) || !llIIlIllIIlll(AccBuilderTempleTrek.d ? 1 : 0)) {
                return;
            }
            AccBuilderTempleTrek.c = lllIllllll[llllIIIIIl[54]];
            String[] strArr2 = new String[llllIIIIIl[0]];
            strArr2[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[55]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (llIIlIllIIlll(i)) {
                if (llIIlIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(lllIllllll[llllIIIIIl[5]]);
                }
                if (llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    if (llIIlIllIIlll(Dialog.canContinueNPC() ? 1 : 0) && llIIlIllIIlll(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (llIIlIllIIlll(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (llIIlIllIIlll(widget.getText().contains(lllIllllll[llllIIIIIl[19]]) ? 1 : 0)) {
                                    ?? r0 = llllIIIIIl[0];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIIIIIl[1];
                            }).collect(Collectors.toList());
                            if (llIIlIllIIlll(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(llllIIIIIl[1])).getClickPoint().getX(), ((Widget) list.get(llllIIIIIl[1])).getClickPoint().getY(), (boolean) llllIIIIIl[0]);
                                Time.sleepTicks(llllIIIIIl[6]);
                                "".length();
                            }
                            if (llIIlIllIlIII(list.size(), llllIIIIIl[0])) {
                                i = llllIIIIIl[0];
                            }
                        }
                    }
                    if (!llIIlIllIIlll(Dialog.canContinueNPC() ? 1 : 0) || llIIlIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (llIIlIllIlIIl(i)) {
                String[] strArr3 = new String[llllIIIIIl[0]];
                strArr3[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[50]];
                TileObjects.getNearest(strArr3).interact(lllIllllll[llllIIIIIl[56]]);
                Time.sleepTicks(llllIIIIIl[14]);
                "".length();
            }
            Time.sleepTicks(llllIIIIIl[0]);
            "".length();
            "".length();
        } while (" ".length() > 0);
    }

    private static boolean llIIlIlllIIII(int i, int i2) {
        return i <= i2;
    }

    public static void v() {
        if (llIIlIllIlIIl(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(llllIIIIIl[3]);
            "".length();
        }
        if (llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlIllIIlll(Bank.isOpen() ? 1 : 0)) {
            B();
        }
    }

    private static boolean llIIlIllIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean z() {
        if (llIIlIllIlllI(Widgets.get(llllIIIIIl[7], llllIIIIIl[0]))) {
            ?? r0 = llllIIIIIl[0];
            "".length();
            return (((13 ^ 47) & ((100 ^ 70) ^ (-1))) & (((201 ^ 159) & ((104 ^ 62) ^ (-1))) ^ (-1))) >= (20 ^ 16) ? " ".length() & (" ".length() ^ (-1)) : r0;
        }
        return llllIIIIIl[1];
    }

    private static boolean llIIlIllIlIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void y() {
        if (llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlIllIlIIl(x() ? 1 : 0)) {
            if (llIIlIllIIlll(z() ? 1 : 0)) {
                A();
            }
            if (llIIlIllIlIIl(z() ? 1 : 0)) {
                Widget widget = Widgets.get(llllIIIIIl[7], llllIIIIIl[8], llllIIIIIl[9]);
                if (llIIlIllIlllI(widget)) {
                    widget.interact(lllIllllll[llllIIIIIl[3]]);
                    Time.sleepTicks(llllIIIIIl[0]);
                    "".length();
                }
                if (llIIlIllIIlll(Vars.getBit(llllIIIIIl[10]))) {
                    Widget widget2 = Widgets.get(llllIIIIIl[7], llllIIIIIl[11], llllIIIIIl[12]);
                    if (llIIlIllIlllI(widget2)) {
                        if (llIIlIllIIlll(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(llllIIIIIl[7], llllIIIIIl[13], llllIIIIIl[14]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) llllIIIIIl[0]);
                            Time.sleepTicks(llllIIIIIl[0]);
                            "".length();
                        }
                        if (llIIlIllIlIIl(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(lllIllllll[llllIIIIIl[14]]);
                            Time.sleepTicks(llllIIIIIl[0]);
                            "".length();
                        }
                    }
                }
                if (llIIlIllIIlll(Vars.getBit(llllIIIIIl[15]))) {
                    Widget widget4 = Widgets.get(llllIIIIIl[7], llllIIIIIl[11], llllIIIIIl[16]);
                    if (llIIlIllIlllI(widget4)) {
                        if (llIIlIllIIlll(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(llllIIIIIl[7], llllIIIIIl[13], llllIIIIIl[14]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) llllIIIIIl[0]);
                            Time.sleepTicks(llllIIIIIl[0]);
                            "".length();
                        }
                        if (llIIlIllIlIIl(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(lllIllllll[llllIIIIIl[17]]);
                            Time.sleepTicks(llllIIIIIl[2]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(llllIIIIIl[7], llllIIIIIl[3]);
        if (llIIlIllIlllI(widget6)) {
            widget6.interact(lllIllllll[llllIIIIIl[9]]);
            Time.sleepTicks(llllIIIIIl[0]);
            "".length();
        }
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    public static int t() {
        return Y[c(llllIIIIIl[1], Y.length - llllIIIIIl[0])];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(lllIllllll[llllIIIIIl[45]]);
            httpURLConnection.setRequestProperty(lllIllllll[llllIIIIIl[46]], lllIllllll[llllIIIIIl[8]]);
            httpURLConnection.setDoOutput(llllIIIIIl[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if ("   ".length() == 0) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static String llIIlIlIlIllI(String lllllllllllllllllIllIIIlllIlIlll, String lllllllllllllllllIllIIIlllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIIlllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIIIlllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIIIlllIllIIl.init(llllIIIIIl[2], secretKeySpec);
            return new String(lllllllllllllllllIllIIIlllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIIlllIllIII) {
            lllllllllllllllllIllIIIlllIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIllIllIl(Object obj) {
        return obj == null;
    }

    public static int c(int i, int lllllllllllllllllIllIIlIIlIlIlll) {
        int i2 = lllllllllllllllllIllIIlIIlIlIlll - i;
        if (llIIlIllIIlll(i2)) {
            return i;
        }
        if (llIIlIllIlIII(Math.abs(i2), llllIIIIIl[0])) {
            if (llIIlIllIlIIl(R.nextBoolean() ? 1 : 0)) {
                "".length();
                return !(true ^ true) ? (45 ^ 50) & ((29 ^ 2) ^ (-1)) : i;
            }
            return lllllllllllllllllIllIIlIIlIlIlll;
        }
        if (llIIlIllIlIlI(i2)) {
            i = lllllllllllllllllIllIIlIIlIlIlll;
            lllllllllllllllllIllIIlIIlIlIlll = i;
        }
        return i + R.nextInt((lllllllllllllllllIllIIlIIlIlIlll - i) + llllIIIIIl[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean x() {
        if (!llIIlIllIlIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(llllIIIIIl[10]));
        })).intValue()) || llIIlIllIIlll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(llllIIIIIl[15]));
        })).intValue())) {
            ?? r0 = llllIIIIIl[0];
            "".length();
            return (-" ".length()) == "   ".length() ? ((146 ^ 138) ^ (3 ^ 40)) & (((95 ^ 56) ^ (253 ^ 169)) ^ (-" ".length())) : r0;
        }
        return llllIIIIIl[1];
    }

    public static void D() {
        if (llIIlIllIlIII(j(llllIIIIIl[48]), llllIIIIIl[0])) {
            if (llIIlIllIIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(llllIIIIIl[0]);
                "".length();
            }
            if (llIIlIllIlIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(llllIIIIIl[49], llllIIIIIl[50]);
                if (llIIlIllIlllI(widget)) {
                    widget.interact(lllIllllll[llllIIIIIl[52]]);
                    Time.sleepTicks(llllIIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    public static void w() {
        Widget widget = Widgets.get(llllIIIIIl[4], llllIIIIIl[5], llllIIIIIl[1]);
        if (llIIlIllIlllI(widget)) {
            widget.interact(lllIllllll[llllIIIIIl[6]]);
            Time.sleepTicks(llllIIIIIl[6]);
            "".length();
        }
    }

    public static double u() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static int H() {
        return j(llllIIIIIl[59]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void G() {
        if (llIIlIllIIlll(Widgets.get(llllIIIIIl[58]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(llllIIIIIl[58], llllIIIIIl[40]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llllIIIIIl[0]);
            Time.sleepTicks(llllIIIIIl[6]);
            "".length();
        }
    }

    public static long s() {
        return U + ((System.nanoTime() - V) / 1000000);
    }

    private static String llIIlIlIlIlll(String lllllllllllllllllIllIIIllllIllII, String lllllllllllllllllIllIIIllllIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIIIllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIIIllllIlIll.toCharArray();
        int lllllllllllllllllIllIIIllllIlIII = llllIIIIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIIl[1];
        while (llIIlIllIlIll(i, length)) {
            char lllllllllllllllllIllIIIllllIllIl = charArray2[i];
            sb.append((char) (lllllllllllllllllIllIIIllllIllIl ^ charArray[lllllllllllllllllIllIIIllllIlIII % charArray.length]));
            "".length();
            lllllllllllllllllIllIIIllllIlIII++;
            i++;
            "".length();
            if ((((((123 + 35) - 35) + 77) ^ (((100 + 86) - 182) + 151)) & (((255 ^ 192) ^ (230 ^ 138)) ^ (-" ".length()))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static boolean i(int i) {
        int[] iArr = new int[llllIIIIIl[0]];
        iArr[llllIIIIIl[1]] = i;
        return Bank.contains(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int lllllllllllllllllIllIIlIIlIlIIlI = llllIIIIIl[1];
        while (llIIlIllIlIll(lllllllllllllllllIllIIlIIlIlIIlI, iArr.length)) {
            if (llIIlIllIIlll(i(iArr[lllllllllllllllllIllIIlIIlIlIIlI]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[lllllllllllllllllIllIIlIIlIlIIlI]);
                return llllIIIIIl[1];
            }
            lllllllllllllllllIllIIlIIlIlIIlI++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((96 ^ 73) ^ (39 ^ 0)) & (((120 ^ 69) ^ (176 ^ 131)) ^ (-" ".length()));
            }
        }
        return llllIIIIIl[0];
    }

    private static boolean llIIlIllIlIIl(int i) {
        return i != 0;
    }

    static {
        llIIlIllIIllI();
        llIIlIllIIlIl();
        Q = lllIllllll[llllIIIIIl[73]];
        R = ThreadLocalRandom.current();
        S = new WorldArea(llllIIIIIl[74], llllIIIIIl[75], llllIIIIIl[57], llllIIIIIl[76], llllIIIIIl[1]);
        T = new WorldArea(llllIIIIIl[77], llllIIIIIl[78], llllIIIIIl[8], llllIIIIIl[50], llllIIIIIl[0]);
        U = System.currentTimeMillis();
        V = System.nanoTime();
        W = new HashMap();
        X = new WorldPoint(llllIIIIIl[79], llllIIIIIl[80], llllIIIIIl[1]);
        int[] iArr = new int[llllIIIIIl[81]];
        iArr[llllIIIIIl[1]] = llllIIIIIl[82];
        iArr[llllIIIIIl[0]] = llllIIIIIl[83];
        iArr[llllIIIIIl[2]] = llllIIIIIl[84];
        iArr[llllIIIIIl[6]] = llllIIIIIl[85];
        iArr[llllIIIIIl[3]] = llllIIIIIl[86];
        iArr[llllIIIIIl[14]] = llllIIIIIl[87];
        iArr[llllIIIIIl[17]] = llllIIIIIl[88];
        iArr[llllIIIIIl[9]] = llllIIIIIl[89];
        iArr[llllIIIIIl[20]] = llllIIIIIl[90];
        iArr[llllIIIIIl[21]] = llllIIIIIl[91];
        iArr[llllIIIIIl[22]] = llllIIIIIl[92];
        iArr[llllIIIIIl[23]] = llllIIIIIl[93];
        iArr[llllIIIIIl[24]] = llllIIIIIl[94];
        iArr[llllIIIIIl[25]] = llllIIIIIl[95];
        iArr[llllIIIIIl[26]] = llllIIIIIl[96];
        iArr[llllIIIIIl[28]] = llllIIIIIl[97];
        iArr[llllIIIIIl[40]] = llllIIIIIl[98];
        iArr[llllIIIIIl[41]] = llllIIIIIl[99];
        iArr[llllIIIIIl[42]] = llllIIIIIl[100];
        iArr[llllIIIIIl[11]] = llllIIIIIl[101];
        iArr[llllIIIIIl[13]] = llllIIIIIl[102];
        iArr[llllIIIIIl[45]] = llllIIIIIl[103];
        iArr[llllIIIIIl[46]] = llllIIIIIl[104];
        iArr[llllIIIIIl[8]] = llllIIIIIl[105];
        iArr[llllIIIIIl[51]] = llllIIIIIl[106];
        iArr[llllIIIIIl[52]] = llllIIIIIl[107];
        iArr[llllIIIIIl[53]] = llllIIIIIl[108];
        iArr[llllIIIIIl[54]] = llllIIIIIl[109];
        iArr[llllIIIIIl[55]] = llllIIIIIl[110];
        iArr[llllIIIIIl[5]] = llllIIIIIl[111];
        iArr[llllIIIIIl[50]] = llllIIIIIl[112];
        iArr[llllIIIIIl[56]] = llllIIIIIl[113];
        iArr[llllIIIIIl[19]] = llllIIIIIl[114];
        iArr[llllIIIIIl[61]] = llllIIIIIl[115];
        iArr[llllIIIIIl[62]] = llllIIIIIl[116];
        iArr[llllIIIIIl[33]] = llllIIIIIl[117];
        iArr[llllIIIIIl[63]] = llllIIIIIl[118];
        iArr[llllIIIIIl[66]] = llllIIIIIl[119];
        iArr[llllIIIIIl[67]] = llllIIIIIl[120];
        iArr[llllIIIIIl[68]] = llllIIIIIl[121];
        iArr[llllIIIIIl[12]] = llllIIIIIl[122];
        iArr[llllIIIIIl[16]] = llllIIIIIl[123];
        iArr[llllIIIIIl[69]] = llllIIIIIl[124];
        iArr[llllIIIIIl[70]] = llllIIIIIl[125];
        iArr[llllIIIIIl[71]] = llllIIIIIl[126];
        iArr[llllIIIIIl[73]] = llllIIIIIl[127];
        iArr[llllIIIIIl[128]] = llllIIIIIl[129];
        iArr[llllIIIIIl[130]] = llllIIIIIl[131];
        iArr[llllIIIIIl[76]] = llllIIIIIl[132];
        iArr[llllIIIIIl[133]] = llllIIIIIl[134];
        iArr[llllIIIIIl[57]] = llllIIIIIl[135];
        iArr[llllIIIIIl[136]] = llllIIIIIl[137];
        iArr[llllIIIIIl[138]] = llllIIIIIl[139];
        iArr[llllIIIIIl[140]] = llllIIIIIl[141];
        iArr[llllIIIIIl[142]] = llllIIIIIl[143];
        iArr[llllIIIIIl[144]] = llllIIIIIl[145];
        iArr[llllIIIIIl[146]] = llllIIIIIl[147];
        iArr[llllIIIIIl[148]] = llllIIIIIl[149];
        iArr[llllIIIIIl[150]] = llllIIIIIl[151];
        iArr[llllIIIIIl[152]] = llllIIIIIl[153];
        iArr[llllIIIIIl[154]] = llllIIIIIl[155];
        iArr[llllIIIIIl[156]] = llllIIIIIl[157];
        iArr[llllIIIIIl[158]] = llllIIIIIl[159];
        iArr[llllIIIIIl[160]] = llllIIIIIl[161];
        iArr[llllIIIIIl[162]] = llllIIIIIl[163];
        iArr[llllIIIIIl[164]] = llllIIIIIl[165];
        iArr[llllIIIIIl[166]] = llllIIIIIl[167];
        iArr[llllIIIIIl[168]] = llllIIIIIl[169];
        iArr[llllIIIIIl[170]] = llllIIIIIl[171];
        iArr[llllIIIIIl[172]] = llllIIIIIl[173];
        iArr[llllIIIIIl[174]] = llllIIIIIl[175];
        iArr[llllIIIIIl[36]] = llllIIIIIl[176];
        iArr[llllIIIIIl[177]] = llllIIIIIl[178];
        iArr[llllIIIIIl[179]] = llllIIIIIl[180];
        iArr[llllIIIIIl[181]] = llllIIIIIl[182];
        iArr[llllIIIIIl[183]] = llllIIIIIl[184];
        iArr[llllIIIIIl[185]] = llllIIIIIl[186];
        iArr[llllIIIIIl[187]] = llllIIIIIl[188];
        iArr[llllIIIIIl[189]] = llllIIIIIl[190];
        iArr[llllIIIIIl[191]] = llllIIIIIl[192];
        iArr[llllIIIIIl[193]] = llllIIIIIl[194];
        iArr[llllIIIIIl[195]] = llllIIIIIl[196];
        iArr[llllIIIIIl[197]] = llllIIIIIl[198];
        iArr[llllIIIIIl[199]] = llllIIIIIl[200];
        iArr[llllIIIIIl[201]] = llllIIIIIl[202];
        iArr[llllIIIIIl[203]] = llllIIIIIl[204];
        iArr[llllIIIIIl[205]] = llllIIIIIl[206];
        iArr[llllIIIIIl[207]] = llllIIIIIl[208];
        iArr[llllIIIIIl[209]] = llllIIIIIl[210];
        iArr[llllIIIIIl[211]] = llllIIIIIl[212];
        iArr[llllIIIIIl[213]] = llllIIIIIl[214];
        iArr[llllIIIIIl[215]] = llllIIIIIl[216];
        iArr[llllIIIIIl[217]] = llllIIIIIl[218];
        iArr[llllIIIIIl[219]] = llllIIIIIl[220];
        iArr[llllIIIIIl[221]] = llllIIIIIl[222];
        iArr[llllIIIIIl[223]] = llllIIIIIl[224];
        iArr[llllIIIIIl[225]] = llllIIIIIl[226];
        iArr[llllIIIIIl[227]] = llllIIIIIl[228];
        iArr[llllIIIIIl[229]] = llllIIIIIl[230];
        iArr[llllIIIIIl[231]] = llllIIIIIl[232];
        iArr[llllIIIIIl[72]] = llllIIIIIl[233];
        iArr[llllIIIIIl[59]] = llllIIIIIl[234];
        iArr[llllIIIIIl[235]] = llllIIIIIl[236];
        iArr[llllIIIIIl[237]] = llllIIIIIl[238];
        iArr[llllIIIIIl[239]] = llllIIIIIl[240];
        iArr[llllIIIIIl[241]] = llllIIIIIl[242];
        iArr[llllIIIIIl[243]] = llllIIIIIl[244];
        Y = iArr;
        Z = new WorldPoint(llllIIIIIl[245], llllIIIIIl[246], llllIIIIIl[2]);
        aa = new WorldArea(llllIIIIIl[247], llllIIIIIl[248], llllIIIIIl[61], llllIIIIIl[46], llllIIIIIl[1]);
    }

    private static void llIIlIllIIllI() {
        llllIIIIIl = new int[249];
        llllIIIIIl[0] = " ".length();
        llllIIIIIl[1] = ((89 ^ 68) ^ (132 ^ 192)) & (((124 ^ 111) ^ (2 ^ 72)) ^ (-" ".length()));
        llllIIIIIl[2] = "  ".length();
        llllIIIIIl[3] = 33 ^ 37;
        llllIIIIIl[4] = (-((-29329) & 32723)) & (-28677) & 32734;
        llllIIIIIl[5] = 127 ^ 98;
        llllIIIIIl[6] = "   ".length();
        llllIIIIIl[7] = (((126 ^ 47) + (13 ^ 82)) - (((46 + 39) - (-52)) + 18)) + (226 ^ 147);
        llllIIIIIl[8] = 127 ^ 104;
        llllIIIIIl[9] = (250 ^ 187) ^ (100 ^ 34);
        llllIIIIIl[10] = (-17411) & 32110;
        llllIIIIIl[11] = (31 ^ 105) ^ (11 ^ 110);
        llllIIIIIl[12] = 48 ^ 24;
        llllIIIIIl[13] = (((35 + 39) - (-27)) + 70) ^ (((16 + 48) - (-21)) + 106);
        llllIIIIIl[14] = (159 ^ 162) ^ (141 ^ 181);
        llllIIIIIl[15] = (-((-3477) & 20375)) & (-1153) & 32751;
        llllIIIIIl[16] = (91 ^ 0) ^ (195 ^ 177);
        llllIIIIIl[17] = 125 ^ 123;
        llllIIIIIl[18] = 78 ^ 58;
        llllIIIIIl[19] = 29 ^ 61;
        llllIIIIIl[20] = (((160 + 121) - 253) + 136) ^ (((9 + 50) - (-85)) + 28);
        llllIIIIIl[21] = (11 ^ 109) ^ (100 ^ 11);
        llllIIIIIl[22] = 164 ^ 174;
        llllIIIIIl[23] = (58 ^ 77) ^ (10 ^ 118);
        llllIIIIIl[24] = (206 ^ 130) ^ (246 ^ 182);
        llllIIIIIl[25] = 80 ^ 93;
        llllIIIIIl[26] = (36 ^ 101) ^ (47 ^ 96);
        llllIIIIIl[27] = (-481) & 23037;
        llllIIIIIl[28] = (65 ^ 17) ^ (62 ^ 97);
        llllIIIIIl[29] = (-30209) & 32669;
        llllIIIIIl[30] = (-28873) & 32255;
        llllIIIIIl[31] = (-((-7057) & 31669)) & (-1027) & 28095;
        llllIIIIIl[32] = (-12419) & 15802;
        llllIIIIIl[33] = (((63 + 76) - 123) + 131) ^ (((160 + 86) - 84) + 14);
        llllIIIIIl[34] = (-((-325) & 9037)) & (-17537) & 28671;
        llllIIIIIl[35] = (-4673) & 8063;
        llllIIIIIl[36] = (((26 + 64) - (-63)) + 44) ^ (((121 + 128) - 185) + 66);
        llllIIIIIl[37] = (((76 ^ 37) + (49 ^ 10)) - (69 ^ 116)) + (187 ^ 167);
        llllIIIIIl[38] = (-21571) & 24030;
        llllIIIIIl[39] = (-((-2241) & 30951)) & (-1) & 32127;
        llllIIIIIl[40] = (20 ^ 122) ^ (90 ^ 36);
        llllIIIIIl[41] = 173 ^ 188;
        llllIIIIIl[42] = (((105 + 69) - 110) + 93) ^ (((130 + 101) - 115) + 27);
        llllIIIIIl[43] = (-((-5409) & 29989)) & (-4227) & 32191;
        llllIIIIIl[44] = (-21051) & 24447;
        llllIIIIIl[45] = (215 ^ 143) ^ (224 ^ 173);
        llllIIIIIl[46] = 89 ^ 79;
        llllIIIIIl[47] = -" ".length();
        llllIIIIIl[48] = ((20 + 101) - (-40)) + 11;
        llllIIIIIl[49] = (-((-17553) & 32149)) & (-16395) & 31583;
        llllIIIIIl[50] = 127 ^ 97;
        llllIIIIIl[51] = 50 ^ 42;
        llllIIIIIl[52] = 107 ^ 114;
        llllIIIIIl[53] = (226 ^ 130) ^ (55 ^ 77);
        llllIIIIIl[54] = (((106 + 24) - 77) + 137) ^ (((98 + 135) - 112) + 44);
        llllIIIIIl[55] = 89 ^ 69;
        llllIIIIIl[56] = 172 ^ 179;
        llllIIIIIl[57] = 136 ^ 186;
        llllIIIIIl[58] = ((68 + 94) - 95) + 86;
        llllIIIIIl[59] = 243 ^ 150;
        llllIIIIIl[60] = (-((-3714) & 20163)) & (-4097) & 22495;
        llllIIIIIl[61] = 8 ^ 41;
        llllIIIIIl[62] = 101 ^ 71;
        llllIIIIIl[63] = 182 ^ 146;
        llllIIIIIl[64] = (-((-16459) & 31343)) & (-1025) & 16382;
        llllIIIIIl[65] = (-((-21017) & 29691)) & (-20481) & 29687;
        llllIIIIIl[66] = 19 ^ 54;
        llllIIIIIl[67] = 12 ^ 42;
        llllIIIIIl[68] = 145 ^ 182;
        llllIIIIIl[69] = 46 ^ 4;
        llllIIIIIl[70] = 116 ^ 95;
        llllIIIIIl[71] = "   ".length() ^ (98 ^ 77);
        llllIIIIIl[72] = (192 ^ 147) ^ (55 ^ 0);
        llllIIIIIl[73] = 122 ^ 87;
        llllIIIIIl[74] = (-12297) & 15486;
        llllIIIIIl[75] = (-((-3685) & 32357)) & (-385) & 32253;
        llllIIIIIl[76] = 22 ^ 38;
        llllIIIIIl[77] = (-8193) & 11390;
        llllIIIIIl[78] = (-((-2177) & 15348)) & (-16385) & 32759;
        llllIIIIIl[79] = (-((-2067) & 22931)) & (-8719) & 32766;
        llllIIIIIl[80] = (-((-25929) & 30681)) & (-8195) & 16383;
        llllIIIIIl[81] = 105 ^ 2;
        llllIIIIIl[82] = (-15521) & 15866;
        llllIIIIIl[83] = (-((-6977) & 23493)) & (-9225) & 26046;
        llllIIIIIl[84] = (-((-785) & 24466)) & (-8705) & 32695;
        llllIIIIIl[85] = (-19104) & 19455;
        llllIIIIIl[86] = (-3221) & 3575;
        llllIIIIIl[87] = (-5657) & 6012;
        llllIIIIIl[88] = (-30745) & 31101;
        llllIIIIIl[89] = (-((-397) & 28574)) & (-137) & 28671;
        llllIIIIIl[90] = (-((-4581) & 30717)) & (-6178) & 32699;
        llllIIIIIl[91] = (-((-2451) & 4087)) & (-2065) & 4095;
        llllIIIIIl[92] = (-((-389) & 30093)) & (-34) & 30203;
        llllIIIIIl[93] = (-((-25831) & 30455)) & (-16386) & 21503;
        llllIIIIIl[94] = (-((-1917) & 24445)) & (-9233) & 32255;
        llllIIIIIl[95] = (-12303) & 12798;
        llllIIIIIl[96] = (-((-1649) & 28279)) & (-5601) & 32766;
        llllIIIIIl[97] = (-((-9745) & 16052)) & (-17473) & 24295;
        llllIIIIIl[98] = (-20997) & 21310;
        llllIIIIIl[99] = (-27157) & 27647;
        llllIIIIIl[100] = (-((-8513) & 14290)) & (-18465) & 24575;
        llllIIIIIl[101] = (-28813) & 29166;
        llllIIIIIl[102] = (-((-8833) & 25251)) & (-4097) & 20991;
        llllIIIIIl[103] = (-((-19777) & 28498)) & (-4101) & 13143;
        llllIIIIIl[104] = (-((-2049) & 15567)) & (-16385) & 30207;
        llllIIIIIl[105] = (-1733) & 2047;
        llllIIIIIl[106] = (-((-16802) & 31655)) & (-9) & 15231;
        llllIIIIIl[107] = (-1665) & 1988;
        llllIIIIIl[108] = (-13873) & 14197;
        llllIIIIIl[109] = (-11429) & 11756;
        llllIIIIIl[110] = (-28739) & 29183;
        llllIIIIIl[111] = (-27658) & 28121;
        llllIIIIIl[112] = (-4097) & 4574;
        llllIIIIIl[113] = (-((-427) & 11711)) & (-20993) & 32766;
        llllIIIIIl[114] = (-15875) & 16366;
        llllIIIIIl[115] = (-9729) & 10235;
        llllIIIIIl[116] = (-20737) & 21258;
        llllIIIIIl[117] = (-18581) & 18910;
        llllIIIIIl[118] = (-((-5169) & 32307)) & (-4097) & 31699;
        llllIIIIIl[119] = (-((-3310) & 7917)) & (-8193) & 13311;
        llllIIIIIl[120] = (-17473) & 18031;
        llllIIIIIl[121] = (-((-11345) & 16083)) & (-1) & 5115;
        llllIIIIIl[122] = (-6708) & 7039;
        llllIIIIIl[123] = (-31233) & 31737;
        llllIIIIIl[124] = (-22053) & 22389;
        llllIIIIIl[125] = (-2238) & 2751;
        llllIIIIIl[126] = (-32425) & 32751;
        llllIIIIIl[127] = (-((-745) & 16120)) & (-16385) & 32239;
        llllIIIIIl[128] = 72 ^ 102;
        llllIIIIIl[129] = (-((-6409) & 32686)) & (-4099) & 30719;
        llllIIIIIl[130] = 53 ^ 26;
        llllIIIIIl[131] = (-((-3) & 16419)) & (-7681) & 24575;
        llllIIIIIl[132] = (-((-2925) & 32639)) & (-513) & 30719;
        llllIIIIIl[133] = (111 ^ 77) ^ (51 ^ 32);
        llllIIIIIl[134] = (-((-3619) & 32427)) & (-3618) & 32767;
        llllIIIIIl[135] = (-3585) & 4030;
        llllIIIIIl[136] = 81 ^ 98;
        llllIIIIIl[137] = (-14390) & 14709;
        llllIIIIIl[138] = (193 ^ 175) ^ (67 ^ 25);
        llllIIIIIl[139] = (-((-9430) & 31991)) & (-8321) & 31231;
        llllIIIIIl[140] = 93 ^ 104;
        llllIIIIIl[141] = (-2227) & 2547;
        llllIIIIIl[142] = (((76 + 24) - (-42)) + 30) ^ (((0 + 77) - 19) + 96);
        llllIIIIIl[143] = (-15529) & 15869;
        llllIIIIIl[144] = (124 ^ 12) ^ (245 ^ 178);
        llllIIIIIl[145] = (-((-1698) & 11939)) & (-5657) & 16319;
        llllIIIIIl[146] = 178 ^ 138;
        llllIIIIIl[147] = (-((-2247) & 16103)) & (-16401) & 30719;
        llllIIIIIl[148] = 115 ^ 74;
        llllIIIIIl[149] = (-((-4197) & 24301)) & (-8193) & 28670;
        llllIIIIIl[150] = 124 ^ 70;
        llllIIIIIl[151] = (-((-1275) & 26367)) & (-6147) & 31614;
        llllIIIIIl[152] = 110 ^ 85;
        llllIIIIIl[153] = (-((-1364) & 32767)) & (-1025) & 32763;
        llllIIIIIl[154] = (((163 + 168) - 301) + 141) ^ (((19 + 47) - (-36)) + 49);
        llllIIIIIl[155] = (-((-4145) & 29367)) & (-7169) & 32719;
        llllIIIIIl[156] = (253 ^ 168) ^ (201 ^ 161);
        llllIIIIIl[157] = (-((-105) & 21245)) & (-8225) & 29695;
        llllIIIIIl[158] = (18 ^ 47) ^ "   ".length();
        llllIIIIIl[159] = (-((-6161) & 6835)) & (-2065) & 3071;
        llllIIIIIl[160] = 46 ^ 17;
        llllIIIIIl[161] = (-12865) & 13168;
        llllIIIIIl[162] = (((124 + 122) - 133) + 19) ^ (((177 + 148) - 234) + 105);
        llllIIIIIl[163] = (-((-2259) & 32471)) & (-146) & 30719;
        llllIIIIIl[164] = (((91 + 71) - 115) + 150) ^ (((21 + 9) - 20) + 122);
        llllIIIIIl[165] = (-27801) & 28123;
        llllIIIIIl[166] = 218 ^ 152;
        llllIIIIIl[167] = (-28745) & 29051;
        llllIIIIIl[168] = 236 ^ 175;
        llllIIIIIl[169] = (-((-289) & 30689)) & (-2049) & 32757;
        llllIIIIIl[170] = 113 ^ 53;
        llllIIIIIl[171] = (-((-16551) & 29935)) & (-16385) & 30079;
        llllIIIIIl[172] = 220 ^ 153;
        llllIIIIIl[173] = (-((-4341) & 31997)) & (-513) & 28543;
        llllIIIIIl[174] = (((135 + 63) - 52) + 56) ^ (((89 + 61) - 26) + 16);
        llllIIIIIl[175] = (-((-4546) & 31683)) & (-1157) & 28671;
        llllIIIIIl[176] = (-((-8913) & 16127)) & (-16513) & 24239;
        llllIIIIIl[177] = (60 ^ 83) ^ (119 ^ 80);
        llllIIIIIl[178] = (-8193) & 8495;
        llllIIIIIl[179] = (((170 + 143) - 165) + 45) ^ (((86 + 33) - 27) + 44);
        llllIIIIIl[180] = (-((-20754) & 22359)) & (-12417) & 14333;
        llllIIIIIl[181] = (72 ^ 113) ^ (24 ^ 107);
        llllIIIIIl[182] = (-((-345) & 24415)) & (-65) & 24447;
        llllIIIIIl[183] = (123 ^ 22) ^ (148 ^ 178);
        llllIIIIIl[184] = (-24579) & 24895;
        llllIIIIIl[185] = (((22 + 133) - 78) + 156) ^ (((69 + 13) - (-15)) + 68);
        llllIIIIIl[186] = (-13993) & 14331;
        llllIIIIIl[187] = 214 ^ 155;
        llllIIIIIl[188] = (-((-7253) & 7902)) & (-18433) & 19421;
        llllIIIIIl[189] = 49 ^ 127;
        llllIIIIIl[190] = (-(75 ^ 106)) & (-7169) & 7543;
        llllIIIIIl[191] = 121 ^ 54;
        llllIIIIIl[192] = (-((-3347) & 15795)) & (-2565) & 15359;
        llllIIIIIl[193] = 66 ^ 18;
        llllIIIIIl[194] = (-((-10513) & 16308)) & (-8193) & 14335;
        llllIIIIIl[195] = 201 ^ 152;
        llllIIIIIl[196] = (-27649) & 27999;
        llllIIIIIl[197] = 113 ^ 35;
        llllIIIIIl[198] = (-((-8205) & 15517)) & (-521) & 8191;
        llllIIIIIl[199] = (((50 + 85) - 23) + 107) ^ (((97 + 81) - 162) + 120);
        llllIIIIIl[200] = (-((-868) & 21371)) & (-10369) & 31231;
        llllIIIIIl[201] = (225 ^ 160) ^ (66 ^ 87);
        llllIIIIIl[202] = (-((-1635) & 11891)) & (-1537) & 12159;
        llllIIIIIl[203] = (((138 + 192) - 289) + 209) ^ (((147 + 140) - 183) + 71);
        llllIIIIIl[204] = (-29318) & 29685;
        llllIIIIIl[205] = 222 ^ 136;
        llllIIIIIl[206] = (-18433) & 18913;
        llllIIIIIl[207] = (55 ^ 115) ^ (52 ^ 39);
        llllIIIIIl[208] = (-13) & 494;
        llllIIIIIl[209] = (((119 + 113) - 191) + 152) ^ (((112 + 1) - (-21)) + 19);
        llllIIIIIl[210] = (-((-2261) & 6359)) & (-10761) & 15342;
        llllIIIIIl[211] = 75 ^ 18;
        llllIIIIIl[212] = (-((-22919) & 32159)) & (-18947) & 28671;
        llllIIIIIl[213] = (((230 + 163) - 282) + 142) ^ (((0 + 61) - 21) + 127);
        llllIIIIIl[214] = (-((-8785) & 28250)) & (-12801) & 32751;
        llllIIIIIl[215] = 63 ^ 100;
        llllIIIIIl[216] = (-14361) & 14847;
        llllIIIIIl[217] = 240 ^ 172;
        llllIIIIIl[218] = (-((-8674) & 32759)) & (-3) & 24575;
        llllIIIIIl[219] = (175 ^ 168) ^ (240 ^ 170);
        llllIIIIIl[220] = (-5) & 493;
        llllIIIIIl[221] = (((51 + 63) - 24) + 134) ^ (((126 + 161) - 248) + 151);
        llllIIIIIl[222] = (-((-12641) & 31585)) & (-9218) & 28667;
        llllIIIIIl[223] = (((18 + 83) - (-90)) + 55) ^ (((49 + 72) - 97) + 145);
        llllIIIIIl[224] = (-10242) & 10749;
        llllIIIIIl[225] = 212 ^ 180;
        llllIIIIIl[226] = (-((-4565) & 7125)) & (-1027) & 4095;
        llllIIIIIl[227] = (131 ^ 154) ^ (225 ^ 153);
        llllIIIIIl[228] = (-16385) & 16894;
        llllIIIIIl[229] = (((46 + 5) - 43) + 237) ^ (((102 + 34) - 77) + 92);
        llllIIIIIl[230] = (-((-437) & 19893)) & (-4097) & 24063;
        llllIIIIIl[231] = (((54 + 104) - 12) + 84) ^ (((15 + 21) - (-3)) + 94);
        llllIIIIIl[232] = (-2275) & 2791;
        llllIIIIIl[233] = (-11337) & 11854;
        llllIIIIIl[234] = (-((-1093) & 11349)) & (-321) & 11095;
        llllIIIIIl[235] = 218 ^ 188;
        llllIIIIIl[236] = (-((-8265) & 13694)) & (-16449) & 22397;
        llllIIIIIl[237] = 239 ^ 136;
        llllIIIIIl[238] = (-((-16385) & 27873)) & (-16389) & 28397;
        llllIIIIIl[239] = 174 ^ 198;
        llllIIIIIl[240] = (-((-23073) & 32309)) & (-225) & 9983;
        llllIIIIIl[241] = (162 ^ 197) ^ (173 ^ 163);
        llllIIIIIl[242] = (-((-17921) & 28641)) & (-21524) & 32767;
        llllIIIIIl[243] = (15 ^ 111) ^ (186 ^ 176);
        llllIIIIIl[244] = (-21937) & 22461;
        llllIIIIIl[245] = (-16977) & 20184;
        llllIIIIIl[246] = (-4165) & 7383;
        llllIIIIIl[247] = (-4115) & 7071;
        llllIIIIIl[248] = (-((-15433) & 32473)) & (-12395) & 32766;
    }

    public static void l(int i) {
        int[] iArr = new int[llllIIIIIl[0]];
        iArr[llllIIIIIl[1]] = i;
        if (llIIlIllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllIIIIIl[0]];
            iArr2[llllIIIIIl[1]] = i;
            if (llIIlIllIIlll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llllIIIIIl[0]];
                iArr3[llllIIIIIl[1]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[llllIIIIIl[0]];
                strArr[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[21]];
                if (llIIlIllIlIIl(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[llllIIIIIl[0]];
                    iArr4[llllIIIIIl[1]] = i;
                    Inventory.getFirst(iArr4).interact(lllIllllll[llllIIIIIl[22]]);
                }
                int[] iArr5 = new int[llllIIIIIl[0]];
                iArr5[llllIIIIIl[1]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[llllIIIIIl[0]];
                strArr2[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[23]];
                if (llIIlIllIlIIl(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[llllIIIIIl[0]];
                    iArr6[llllIIIIIl[1]] = i;
                    Inventory.getFirst(iArr6).interact(lllIllllll[llllIIIIIl[24]]);
                }
                int[] iArr7 = new int[llllIIIIIl[0]];
                iArr7[llllIIIIIl[1]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[llllIIIIIl[0]];
                strArr3[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[25]];
                if (llIIlIllIlIIl(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[llllIIIIIl[0]];
                    iArr8[llllIIIIIl[1]] = i;
                    Inventory.getFirst(iArr8).interact(lllIllllll[llllIIIIIl[26]]);
                }
                if (llIIlIllIlIII(i, llllIIIIIl[27])) {
                    Time.sleepTicks(llllIIIIIl[6]);
                    "".length();
                    String[] strArr4 = new String[llllIIIIIl[0]];
                    strArr4[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[28]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(llllIIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    public static String b(long j) {
        String str = lllIllllll[llllIIIIIl[1]];
        Object[] objArr = new Object[llllIIIIIl[0]];
        objArr[llllIIIIIl[1]] = Integer.valueOf(llllIIIIIl[2]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[llllIIIIIl[0]];
        objArr2[llllIIIIIl[1]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[llllIIIIIl[0]];
        objArr3[llllIIIIIl[1]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[llllIIIIIl[0]];
        objArr4[llllIIIIIl[1]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    public static void b(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (llIIlIllIllIl(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (llIIlIllIlllI(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        } else {
            i = llllIIIIIl[47];
        }
        int i3 = i;
        if (llIIlIllIlllI(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        } else {
            i2 = llllIIIIIl[47];
        }
        client.interact(llllIIIIIl[1], MenuAction.WALK.getId(), x, y, i3, i2);
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(lllIllllll[llllIIIIIl[0]]));
        bufferedWriter.write(str + System.getProperty(lllIllllll[llllIIIIIl[2]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void a(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(llllIIIIIl[29], llllIIIIIl[30], llllIIIIIl[1]);
        WorldArea worldArea = new WorldArea(llllIIIIIl[31], llllIIIIIl[32], llllIIIIIl[21], llllIIIIIl[33], llllIIIIIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIIIIIl[34], llllIIIIIl[35], llllIIIIIl[36], llllIIIIIl[37], llllIIIIIl[1]);
        if (llIIlIllIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIIIIIl[17]) && llIIlIllIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIllIIlll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIllIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIIIIl[38], llllIIIIIl[39], llllIIIIIl[0])), llllIIIIIl[13])) {
            AccBuilderTempleTrek.c = lllIllllll[llllIIIIIl[40]];
            if (llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(llllIIIIIl[0]);
            "".length();
        }
        if (llIIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIIIIIl[17]) && llIIlIlllIIII(Players.getLocal().getWorldLocation().getY(), llllIIIIIl[30])) {
            if (llIIlIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[llllIIIIIl[0]];
                strArr[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[41]];
                TileObjects.getNearest(strArr).interact(lllIllllll[llllIIIIIl[42]]);
                Time.sleepTicks(llllIIIIIl[2]);
                "".length();
            }
            if (llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[llllIIIIIl[0]];
                strArr2[llllIIIIIl[1]] = lllIllllll[llllIIIIIl[11]];
                C0006g.a(strArr2);
            }
        }
        if (llIIlIllIllll(Players.getLocal().getWorldLocation().getY(), llllIIIIIl[30])) {
            if (llIIlIllIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIllIIlll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIIIIl[38], llllIIIIIl[39], llllIIIIIl[0])), llllIIIIIl[13])) {
                return;
            }
            AccBuilderTempleTrek.c = lllIllllll[llllIIIIIl[13]];
            if (llIIlIllIlIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllIIIIIl[29], llllIIIIIl[43], llllIIIIIl[1])) ? 1 : 0)) {
                b(new WorldPoint(llllIIIIIl[29], llllIIIIIl[44], llllIIIIIl[1]));
                Time.sleepTicks(llllIIIIIl[17]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llllIIIIIl[0]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean F() {
        if (llIIlIllIIlll(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIllIIlll(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIllIllll(Players.getLocal().getWorldLocation().distanceTo(Z), llllIIIIIl[57]) && !llIIlIllIlIIl(aa.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return llllIIIIIl[1];
        }
        ?? r0 = llllIIIIIl[0];
        "".length();
        return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean llIIlIllIllll(int i, int i2) {
        return i > i2;
    }

    public static long a(long j) {
        return s() - j;
    }

    public static void k(int i) {
        if (llIIlIllIllII(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (llIIlIllIllIl(findWorld)) {
                return;
            }
            if (llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
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
}
