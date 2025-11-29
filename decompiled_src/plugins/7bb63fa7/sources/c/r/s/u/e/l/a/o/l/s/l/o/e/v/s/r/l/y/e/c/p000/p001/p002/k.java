package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

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
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/k.class */
public class k {
    public static /* synthetic */ WorldArea av;
    static /* synthetic */ boolean aG;
    static /* synthetic */ boolean aC;
    private static final /* synthetic */ long an;
    public static /* synthetic */ WorldPoint au;
    public static /* synthetic */ WorldPoint ax;
    private static final /* synthetic */ long am;
    static /* synthetic */ boolean aD;
    private static final /* synthetic */ int ap;
    public static final /* synthetic */ String ak;
    static /* synthetic */ boolean aE;
    public static /* synthetic */ int aA;
    private static final /* synthetic */ int[] at;
    public static /* synthetic */ int aB;
    private static final /* synthetic */ int aq;
    static /* synthetic */ boolean aF;
    static /* synthetic */ boolean aH;
    static /* synthetic */ long aI;
    public static final /* synthetic */ ThreadLocalRandom al;
    private static /* synthetic */ String[] I;
    public static /* synthetic */ WorldArea ay;
    private static final /* synthetic */ int ao;
    public static /* synthetic */ int[] aw;
    private static final /* synthetic */ int as;
    public static /* synthetic */ int az;
    private static final /* synthetic */ int ar;
    private static /* synthetic */ int[] lI;
    static /* synthetic */ int aJ;
    private static /* synthetic */ Map<Integer, Integer> aK;

    public static void av() {
        Widgets.getAll(lI[102], widget -> {
            return widget.getText().contains(I[lI[128]]);
        });
        Widgets.getAll(lI[103], widget2 -> {
            return widget2.getText().contains(I[lI[152]]);
        });
        Widgets.getAll(lI[104], widget3 -> {
            return widget3.getText().contains(I[lI[151]]);
        });
        int lllllllIlIlllll = lI[1];
        while (llIl(lllllllIlIlllll, at.length)) {
            if (lIIII(Widgets.get(at[lllllllIlIlllll], widget4 -> {
                return widget4.getText().contains(I[lI[150]]);
            }))) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + at[lllllllIlIlllll]);
            }
            lllllllIlIlllll++;
            "".length();
            if ((-(34 ^ 38)) > 0) {
                return;
            }
        }
    }

    private static boolean llIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlI(int i, int i2) {
        return i == i2;
    }

    public static void j(int i) {
        int[] iArr = new int[lI[0]];
        iArr[lI[1]] = i;
        if (lIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lI[0]];
            iArr2[lI[1]] = i;
            if (lIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                Clues.f0c = I[lI[54]];
                int[] iArr3 = new int[lI[0]];
                iArr3[lI[1]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lI[0]];
                strArr[lI[1]] = I[lI[55]];
                if (lIll(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lI[0]];
                    iArr4[lI[1]] = i;
                    Inventory.getFirst(iArr4).interact(I[lI[56]]);
                }
                int[] iArr5 = new int[lI[0]];
                iArr5[lI[1]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lI[0]];
                strArr2[lI[1]] = I[lI[57]];
                if (lIll(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lI[0]];
                    iArr6[lI[1]] = i;
                    Inventory.getFirst(iArr6).interact(I[lI[58]]);
                }
                int[] iArr7 = new int[lI[0]];
                iArr7[lI[1]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lI[0]];
                strArr3[lI[1]] = I[lI[59]];
                if (lIll(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lI[0]];
                    iArr8[lI[1]] = i;
                    Inventory.getFirst(iArr8).interact(I[lI[60]]);
                }
                if (lIlI(i, lI[61])) {
                    Time.sleepTicks(lI[6]);
                    "".length();
                    String[] strArr4 = new String[lI[0]];
                    strArr4[lI[1]] = I[lI[62]];
                    n.c(strArr4);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
            }
        }
    }

    public static double ae() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static long ac() {
        return am + ((System.nanoTime() - an) / 1000000);
    }

    public static int ad() {
        return aw[c(lI[1], aw.length - lI[0])];
    }

    public static int au() {
        return h(lI[101]);
    }

    public int aA() {
        Client client = Static.getClient();
        int lllllllIlIIlIIl = client.getLoginIndex();
        GameAccount gameAccount = Game.getGameAccount();
        if (llll(gameAccount)) {
            return lI[142];
        }
        switch (lllllllIlIIlIIl) {
            case 0:
            case 12:
            case 24:
                client.setLoginIndex(lI[2]);
                return lI[7];
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                return lI[7];
            case 2:
                if (llIII(Game.getState(), GameState.LOGGING_IN)) {
                    return lI[7];
                }
                client.setUsername(gameAccount.getUsername());
                client.setPassword(gameAccount.getPassword());
                Keyboard.sendEnter();
                Keyboard.sendEnter();
                return lI[7];
            case 3:
            case 14:
                return lI[143];
            case 4:
                if (lIIII(gameAccount.getAuth())) {
                    "".length();
                    if ((-" ".length()) > 0) {
                        return " ".length() & (" ".length() ^ (-1));
                    }
                    Keyboard.sendEnter();
                    return lI[7];
                }
                return lI[142];
        }
    }

    public static void i(int i) {
        if (lllI(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (llll(findWorld)) {
                return;
            }
            if (lIll(Dialog.isOpen() ? 1 : 0)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(I[lI[35]]);
            httpURLConnection.setRequestProperty(I[lI[82]], I[lI[83]]);
            httpURLConnection.setDoOutput(lI[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if ("  ".length() < 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (llll(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (lIIII(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if (((25 ^ 47) & ((188 ^ 138) ^ (-1))) > ((88 ^ 125) & ((186 ^ 159) ^ (-1)))) {
                return;
            }
        } else {
            i = lI[84];
        }
        int llllllllIlIIIll = i;
        if (lIIII(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        } else {
            i2 = lI[84];
        }
        client.interact(lI[1], MenuAction.WALK.getId(), x, y, llllllllIlIIIll, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean ay() {
        int i = lI[1];
        while (llIl(i, Quest.values().length)) {
            if (llIII(Quests.getState(Quest.values()[i]), QuestState.IN_PROGRESS) && ((!lIll(Quest.values()[i].getName().contains(I[lI[136]]) ? 1 : 0) || lIIIl(h(lI[137]), lI[13])) && lIIl(Quest.values()[i].getName().equals(I[lI[138]]) ? 1 : 0))) {
                if (!lIll(Quest.values()[i].getName().equals(I[lI[139]]) ? 1 : 0)) {
                    System.out.println("In progress: " + Quest.values()[i].getName());
                    return lI[0];
                }
                "".length();
                if (((9 ^ 88) ^ (125 ^ 40)) <= "  ".length()) {
                    return ((119 ^ 31) ^ (47 ^ 96)) & (((70 ^ 110) ^ (45 ^ 34)) ^ (-" ".length()));
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((92 ^ 1) ^ (223 ^ 170)) & (((205 ^ 173) ^ (254 ^ 182)) ^ (-" ".length()));
            }
        }
        return lI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    public static void aj() {
        if (!lIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[172]));
        })).intValue()) || lIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[171]));
        })).intValue())) {
            if (lIIl(al() ? 1 : 0)) {
                am();
            }
            if (lIll(al() ? 1 : 0)) {
                Widget widget = Widgets.get(lI[10], lI[11], lI[12]);
                if (lIIII(widget)) {
                    widget.interact(I[lI[16]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
                if (lIIl(((Integer) GameThread.invokeLater(() -> {
                    return Integer.valueOf(Static.getClient().getVarbitValue(lI[172]));
                })).intValue())) {
                    Widget widget2 = Widgets.get(lI[10], lI[14], lI[30]);
                    if (lIIII(widget2)) {
                        Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) lI[0]);
                        Time.sleepTicks(lI[0]);
                        "".length();
                    }
                }
                if (lIIl(((Integer) GameThread.invokeLater(() -> {
                    return Integer.valueOf(Static.getClient().getVarbitValue(lI[171]));
                })).intValue())) {
                    Widget widget3 = Widgets.get(lI[10], lI[14], lI[31]);
                    if (lIIII(widget3)) {
                        Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lI[0]);
                        Time.sleepTicks(lI[0]);
                        "".length();
                    }
                }
            }
        }
        if (lIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[170]));
        })).intValue())) {
            if (lIIl(al() ? 1 : 0)) {
                am();
            }
            if (lIll(al() ? 1 : 0)) {
                Widget widget4 = Widgets.get(lI[10], lI[11], lI[2]);
                if (lIIII(widget4)) {
                    widget4.interact(I[lI[32]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
                Widget widget5 = Widgets.get(lI[10], lI[21], lI[18]);
                if (lIIII(widget5)) {
                    Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lI[0]);
                    Time.sleepTicks(lI[6]);
                    "".length();
                    if (lllI(((Integer) GameThread.invokeLater(() -> {
                        return Integer.valueOf(Static.getClient().getVarbitValue(lI[169]));
                    })).intValue(), lI[33])) {
                        Keyboard.type(I[lI[34]], (boolean) lI[0]);
                    }
                }
            }
        }
        if (lIll(ak() ? 1 : 0)) {
            if (lIIl(al() ? 1 : 0)) {
                am();
            }
            if (lIll(al() ? 1 : 0)) {
                Widget widget6 = Widgets.get(lI[10], lI[11], lI[3]);
                if (lIIII(widget6)) {
                    widget6.interact(I[lI[11]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
                Widget widget7 = Widgets.get(lI[10], lI[21], lI[35]);
                if (lIIII(widget7)) {
                    Mouse.click(widget7.getClickPoint().getX(), widget7.getClickPoint().getY(), (boolean) lI[0]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
            }
        }
        if (lIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[168]));
        })).intValue())) {
            if (lIIl(al() ? 1 : 0)) {
                am();
            }
            if (lIll(al() ? 1 : 0)) {
                Widget widget8 = Widgets.get(lI[10], lI[11], lI[17]);
                if (lIIII(widget8)) {
                    widget8.interact(I[lI[36]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
                Widget widget9 = Widgets.get(lI[10], lI[14], lI[14]);
                if (lIIII(widget9)) {
                    widget9.interact(I[lI[37]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIl(int i, int i2) {
        return i > i2;
    }

    public static void aq() {
        if (lIIl(h(lI[93]))) {
            if (lIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lI[0]);
                "".length();
            }
            if (lIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lI[94], lI[43]);
                if (lIIII(widget)) {
                    widget.interact(I[lI[89]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
            }
        }
    }

    private static String lII(String lllllllIIlIllll, String lllllllIIlIlllI) {
        try {
            SecretKeySpec lllllllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllIIlIlllI.getBytes(StandardCharsets.UTF_8)), lI[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lI[2], lllllllIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllIIllIIII) {
            lllllllIIllIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean] */
    public static void ai() {
        Widget widget = Widgets.get(lI[8], lI[9]);
        if (lIIII(widget)) {
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lI[0]);
            Time.sleepTicks(lI[0]);
            "".length();
        }
        if (lIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIll(ah() ? 1 : 0)) {
            if (lIIl(al() ? 1 : 0)) {
                am();
            }
            if (lIll(al() ? 1 : 0)) {
                Widget widget2 = Widgets.get(lI[10], lI[11], lI[12]);
                if (lIIII(widget2)) {
                    widget2.interact(I[lI[3]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
                if (lIIl(((Integer) GameThread.invokeLater(() -> {
                    return Integer.valueOf(Static.getClient().getVarbitValue(lI[172]));
                })).intValue())) {
                    Clues.f0c = I[lI[13]];
                    Widget widget3 = Widgets.get(lI[10], lI[14], lI[15]);
                    if (lIIII(widget3)) {
                        if (lIIl(widget3.isVisible() ? 1 : 0)) {
                            Widget widget4 = Widgets.get(lI[10], lI[16], lI[13]);
                            Mouse.click(widget4.getClickPoint().getX(), widget4.getClickPoint().getY(), (boolean) lI[0]);
                            Time.sleepTicks(lI[0]);
                            "".length();
                        }
                        if (lIll(widget3.isVisible() ? 1 : 0)) {
                            widget3.interact(I[lI[17]]);
                            Time.sleepTicks(lI[0]);
                            "".length();
                        }
                    }
                }
                if (lIIl(((Integer) GameThread.invokeLater(() -> {
                    return Integer.valueOf(Static.getClient().getVarbitValue(lI[171]));
                })).intValue())) {
                    Clues.f0c = I[lI[12]];
                    Widget widget5 = Widgets.get(lI[10], lI[14], lI[18]);
                    if (lIIII(widget5)) {
                        if (lIIl(widget5.isVisible() ? 1 : 0)) {
                            Widget widget6 = Widgets.get(lI[10], lI[16], lI[13]);
                            Mouse.click(widget6.getClickPoint().getX(), widget6.getClickPoint().getY(), (boolean) lI[0]);
                            Time.sleepTicks(lI[0]);
                            "".length();
                        }
                        if (lIll(widget5.isVisible() ? 1 : 0)) {
                            widget5.interact(I[lI[19]]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                }
                if (lllI(((Integer) GameThread.invokeLater(() -> {
                    return Integer.valueOf(Static.getClient().getVarbitValue(lI[169]));
                })).intValue(), lI[7])) {
                    Clues.f0c = I[lI[20]];
                    Widget widget7 = Widgets.get(lI[10], lI[21]);
                    if (lIIII(widget7) && lIIII(widget7.getChildren())) {
                        if (lIIl(widget7.getChild(lI[0]).getText().contains(I[lI[22]]) ? 1 : 0)) {
                            Widget widget8 = Widgets.get(lI[10], lI[22]);
                            if (lIIII(widget8)) {
                                Mouse.click(widget8.getClickPoint().getX(), widget8.getClickPoint().getY(), (boolean) lI[0]);
                                Time.sleepTicks(lI[6]);
                                "".length();
                                Keyboard.type(I[lI[23]]);
                                Time.sleepTicks(lI[13]);
                                "".length();
                            }
                        }
                        if (lIll(widget7.getChild(lI[0]).getText().contains(I[lI[24]]) ? 1 : 0)) {
                            Time.sleepTicks(lI[2]);
                            "".length();
                            Mouse.click(widget7.getChild(lI[0]).getClickPoint().getX(), widget7.getChild(lI[0]).getClickPoint().getY(), (boolean) lI[0]);
                            Time.sleepTicks(lI[13]);
                            "".length();
                            Keyboard.type(I[lI[25]]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                            Keyboard.sendEnter();
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                }
                if (lIIl(((Integer) GameThread.invokeLater(() -> {
                    return Integer.valueOf(Static.getClient().getVarbitValue(lI[168]));
                })).intValue())) {
                    Clues.f0c = I[lI[26]];
                    Widget widget9 = Widgets.get(lI[10], lI[3]);
                    if (lIIII(widget9)) {
                        widget9.interact(I[lI[27]]);
                        Time.sleepTicks(lI[6]);
                        "".length();
                    }
                    if (lIIl(al() ? 1 : 0)) {
                        am();
                        Time.sleepTicks(lI[2]);
                        "".length();
                    }
                    if (lIll(al() ? 1 : 0)) {
                        Widget widget10 = Widgets.get(lI[10], lI[21]);
                        if (lIIII(widget10) && lIIII(widget10.getChildren())) {
                            if (lIIl(widget10.getChild(lI[0]).getText().contains(I[lI[28]]) ? 1 : 0)) {
                                Widget widget11 = Widgets.get(lI[10], lI[22]);
                                if (lIIII(widget11)) {
                                    Mouse.click(widget11.getClickPoint().getX(), widget11.getClickPoint().getY(), (boolean) lI[0]);
                                    Time.sleepTicks(lI[6]);
                                    "".length();
                                    Keyboard.type(I[lI[29]]);
                                    Time.sleepTicks(lI[13]);
                                    "".length();
                                }
                            }
                            if (lIll(widget10.getChild(lI[0]).getText().contains(I[lI[21]]) ? 1 : 0)) {
                                Time.sleepTicks(lI[0]);
                                "".length();
                                Mouse.click(widget10.getChild(lI[0]).getClickPoint().getX(), widget10.getChild(lI[0]).getClickPoint().getY(), (boolean) lI[0]);
                                Time.sleepTicks(lI[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
        if (lIlI(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[172]));
        })).intValue(), lI[0]) && lIlI(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[171]));
        })).intValue(), lI[0]) && lIlI(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[168]));
        })).intValue(), lI[0]) && lIlI(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[169]));
        })).intValue(), lI[7])) {
            Widget widget12 = Widgets.get(lI[10], lI[3]);
            if (lIIII(widget12)) {
                widget12.interact(I[lI[14]]);
                Time.sleepTicks(lI[0]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public static void a(String str, boolean z) {
        Plugin plugin = (Plugin) Static.getPluginManager().getPlugins().stream().filter(plugin2 -> {
            return plugin2.getName().equalsIgnoreCase(str);
        }).findFirst().orElse(null);
        if (lIIII(plugin)) {
            try {
                if (lIIl(Static.getPluginManager().isPluginEnabled(plugin) ? 1 : 0) && lIIl(z ? 1 : 0)) {
                    System.out.println(I[lI[105]]);
                    Static.getPluginManager().setPluginEnabled(plugin, (boolean) lI[0]);
                }
                if (lIll(Static.getPluginManager().isPluginEnabled(plugin) ? 1 : 0) && lIll(z ? 1 : 0)) {
                    System.out.println(I[lI[106]]);
                    Static.getPluginManager().setPluginEnabled(plugin, (boolean) lI[1]);
                }
                "".length();
                if (((62 ^ 117) & ((246 ^ 189) ^ (-1))) > 0) {
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void llI() {
        I = new String[lI[294]];
        I[lI[1]] = I("QmF8TDcD", "gDLiS");
        I[lI[0]] = l("mc/Zbn1mjd6dkyHUHt5zdcSqEq+uQ34+3zIPJZZfn++EFuw3dTMn3M0LrRNn0HxZedxy6Xdq1zo=", "ktJdh");
        I[lI[2]] = lII("YsjMssp+w3tDIw3v+2oYSQ==", "YFYNi");
        I[lI[6]] = I("NiYfFC8=", "uJpgJ");
        I[lI[3]] = I("KwEFNgYMRD4yFxYNBzQW", "xdiSe");
        I[lI[13]] = lII("PDXUoOB/3QOpJ87eSQbuEgKXT+CZXlVB", "MAUdJ");
        I[lI[17]] = I("HiggNjgv", "JGGQT");
        I[lI[12]] = I("GxY6HQYhBGgcCSlDLxZPLg8tARs8Q3o=", "OcHso");
        I[lI[19]] = I("ARoWCy8w", "UuqlC");
        I[lI[20]] = I("KwIkLQwWAHA1ChcTcDcKDA42MAYZEzk2Cws=", "xgPYe");
        I[lI[22]] = lII("UCYIPFbgoDULu8rMHZBJJg==", "hakZx");
        I[lI[23]] = I("Phs4Mw==", "RtWGf");
        I[lI[24]] = lII("FtUqdCS/17AaKz8YU8jBHw==", "qGtKv");
        I[lI[25]] = lII("zkl28lW62ww=", "GTadu");
        I[lI[26]] = lII("W5s5ONvULsEI+glCdPZ2Lm6BiOLWitE7", "EOcwf");
        I[lI[27]] = l("tpNawIoSidY=", "zbdjv");
        I[lI[28]] = l("7TmPWxGloL8/pNpbjSkxRg==", "dBZlj");
        I[lI[29]] = lII("KZqvJgFnDlemtH0TOmYe8w==", "UWwvZ");
        I[lI[21]] = l("cyJQHR/qYWoz+m0fTXvk9Q==", "aGcqd");
        I[lI[14]] = l("Q6V3tc9Cb/E=", "yonle");
        I[lI[16]] = I("PQ4pIjkaSxImKAACKyAp", "nkEGZ");
        I[lI[32]] = l("RB0dDQd6RU/+yITn0Ap56A==", "uenTW");
        I[lI[34]] = I("d2l0WA==", "EYDhR");
        I[lI[11]] = lII("fVMJ8LhVeNT30VofCuxY+Q==", "TysmJ");
        I[lI[36]] = lII("oU0mxyCtnTYttEbUvnd46CUbacHQSwqj", "DPqsX");
        I[lI[37]] = l("Cbe8r1SjRuE=", "GLaoT");
        I[lI[40]] = l("ELo/lmAX9UljLislMMNbPg==", "UKgDg");
        I[lI[41]] = lII("lGBoeAwvqhwtoKopcfWkug==", "fmlId");
        I[lI[42]] = lII("xKHHtFSVCik7qFtOdX0jKA==", "qMRAG");
        I[lI[5]] = lII("OxtBRsIVorE=", "elTFm");
        I[lI[43]] = lII("P4m0xEKiVzc=", "wyKgS");
        I[lI[44]] = lII("09AhQpNWFdc=", "VfQcS");
        I[lI[39]] = lII("eEf1XEWuaMI=", "jHJfe");
        I[lI[45]] = lII("RZ+S3/mOM2aFdlwgVDo5sw==", "weuYB");
        I[lI[46]] = I("OSYPNisUZxc3KAJnAjomBQ==", "qGaRG");
        I[lI[47]] = lII("1jgKRosY5SCLFrTt6gsvY0ygjxu2BIhr", "FTkqk");
        I[lI[48]] = I("JQ4wGVklCDEOGAcILgQMBg==", "uaBmy");
        I[lI[49]] = I("MyQxIGMzIjA3IhEiLz02EA==", "cKCTC");
        I[lI[30]] = l("crHD3LwQb+k=", "XKdDQ");
        I[lI[31]] = l("wGtsFkbJWDSAKYCoNhyYq5/hT3qRFyirR+eVkzgkfGGxt0jN/0D7SrYKSUKwbHHN", "WqJJM");
        I[lI[15]] = I("Mig+ajEePHA+KRoscCctUT0/ag8DLDE+aDomJTgtHy1v", "qIPJH");
        I[lI[18]] = I("AToEFjs/MEU=", "FUkrY");
        I[lI[54]] = I("FTIUHwkgKg8RWTcmAAQ=", "PCavy");
        I[lI[55]] = l("tU1Q4M98WCo=", "GhCwj");
        I[lI[56]] = lII("SX6Gc0z4GxI=", "tNrZC");
        I[lI[57]] = lII("PyoewXqQ/oA=", "ZahYr");
        I[lI[58]] = l("9a1ljN3k/tk=", "VqfKq");
        I[lI[59]] = l("0R1P4zuPtR4=", "pbsIg");
        I[lI[60]] = lII("hZET5WtkZ7s=", "KwnvW");
        I[lI[62]] = l("iPbW4biEu/WS2slGrfZQwRBEBHWLf7PM", "HuTdq");
        I[lI[75]] = l("832rsym84iK2cnLEqTWbCEr7NcnaBdzW", "Nwkob");
        I[lI[76]] = l("DAvgJZJH4wE=", "DMBFm");
        I[lI[77]] = lII("oxQ/+KngsHg=", "DPawm");
        I[lI[78]] = lII("1UZbdE7nUQbGMLmQQwGerAMngUI2Vyii", "YuQaN");
        I[lI[79]] = l("rrOUrbk5XOjjsCwRQNaa4/2vREPBTbMy", "mFFuJ");
        I[lI[35]] = I("MhsDGg==", "bTPNO");
        I[lI[82]] = l("oRSJOd+0MCumgb5lTAFNPw==", "RQieU");
        I[lI[83]] = I("Ah8kJQUADiAgAw1APjoDDQ==", "coTIl");
        I[lI[86]] = I("PgsOcQcfSi4wAQIFGzpTJ0oaMB0b", "pjxQs");
        I[lI[91]] = I("JhUmLBM=", "dgCMx");
        I[lI[92]] = lII("suhru8venU9ybCfnyqJ/ArMgk61aI6kX", "UtCer");
        I[lI[89]] = I("Mj0gCWgBLSAHJBopIAM=", "sHTfH");
        I[lI[95]] = I("GBcVBWwrBxULIDADFQ8=", "YbajL");
        I[lI[98]] = l("Lw9eqCS+PO4DQRYKIuKg+RQqkeemNZy/", "PFApf");
        I[lI[100]] = l("AHnG8yduQFM=", "SbpuR");
        I[lI[105]] = I("JQsEFzwbRxgDdREOAhE3GQIVXHUBEgMePBsAUR87", "ugqpU");
        I[lI[106]] = lII("Wm7kn3254nlUFZFKSbl1l8LNkChH81QWV5bTZIJRoCs=", "VQkHd");
        I[lI[107]] = l("rfCPfUu33sxqWgDuFtppIA==", "IZnza");
        I[lI[111]] = lII("S8tfHkJNleDKY160eiBjbQ==", "DRJRz");
        I[lI[113]] = lII("eyf52oV0SvU=", "pjdPF");
        I[lI[115]] = l("kj9msYfCuNquPWyzGiKPpw==", "uglou");
        I[lI[71]] = lII("FAsbSeLitxUAZXEonoZhQA==", "mBQXO");
        I[lI[9]] = lII("052EHfidPCjOD7B0Xkcpig==", "qmeSk");
        I[lI[119]] = l("bxxmesmWEKrvAXxLtbDaIA==", "RjcNm");
        I[lI[122]] = l("c+SVVXiVJOgqOKHgE0Ck3KHNoMDQYJ2j", "JraiL");
        I[lI[123]] = lII("r56N47C1BP1dqEuVLLnFLw==", "ZloKa");
        I[lI[124]] = I("BQsYOgQ=", "ByyYa");
        I[lI[125]] = I("BRYmHT8=", "QdGyZ");
        I[lI[126]] = l("ul02JIoq3yutbYQzKGqJdQ==", "gjuoE");
        I[lI[127]] = l("A2wW5Vg5WzQZDdDU542p4Q==", "obxOP");
        I[lI[130]] = lII("3FtVp6IYv/nZZEB1JtvjwA==", "lSItO");
        I[lI[136]] = I("NiI8JBgd", "xCHQj");
        I[lI[138]] = l("qVHvGtM0ntGvOlN4ET3GI4GiaHEbTTa0", "BlHdr");
        I[lI[139]] = lII("wkz5y7fYgJ27RsmtUB38o6bfPGiGn4fh", "qSPVg");
        I[lI[140]] = l("vZ8WB/TWbm4=", "CvXrG");
        I[lI[141]] = I("BRIYCw==", "RwyyZ");
        I[lI[144]] = l("CZOrg08+OSk=", "OEatl");
        I[lI[145]] = I("PxQ+HTw=", "xuSxO");
        I[lI[146]] = l("y5teGfwyqAU=", "UCvDQ");
        I[lI[147]] = lII("d34WsiTzlXE=", "UpAoP");
        I[lI[148]] = lII("Jj4sLUtKYss=", "tDskn");
        I[lI[149]] = lII("tXy0biW8Xvc=", "igsjA");
        I[lI[150]] = lII("V8ddQX5RArsbrcHSy0RzXA==", "hfSZG");
        I[lI[151]] = I("KgAJLS4nGgI=", "IogYG");
        I[lI[152]] = I("BQM6JxkIGTE=", "flTSp");
        I[lI[128]] = l("+v/sqjiA70dRzCSG+9Vy8g==", "wneLQ");
        I[lI[154]] = lII("hJG2e0hyRws=", "wdrZu");
        I[lI[155]] = I("ARcG", "QaVKt");
        I[lI[156]] = l("UcbOEJYJoYE=", "tICSf");
        I[lI[157]] = I("OSgsHw==", "qAKwF");
        I[lI[135]] = lII("Ar60moDJgxc=", "Pnxow");
        I[lI[101]] = lII("HQa8w2wp370=", "QVKJP");
        I[lI[85]] = l("KwGE+pRvJzI=", "ViwUV");
        I[lI[160]] = I("NgMOBhsTCA==", "rfobv");
        I[lI[161]] = I("LiAOJQ8LKw==", "jEoAb");
        I[lI[162]] = lII("mF5ABKoEMPmxpBUvcMehLg==", "udiLy");
        I[lI[163]] = lII("onJGulgoDRE=", "QOaPd");
        I[lI[164]] = I("OjYRCg==", "xSekG");
        I[lI[165]] = lII("r/TXF4KDKKsmV6Ng4Djo6OWWFgb3xjfs", "vchhr");
        I[lI[166]] = l("9N6uNIZ9lzU=", "LAHZO");
        I[lI[176]] = l("j1yGV1he4O6kzEXqon9MEa6zrLhnsuRga09Sniay8KF4XkcL1MzboScLSGK5yLjwXG/1O2zeBrk=", "DnElh");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean al() {
        if (lIIII(Widgets.get(lI[10], lI[0]))) {
            ?? r0 = lI[0];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lI[1];
    }

    private static void lIII() {
        lI = new int[295];
        lI[0] = " ".length();
        lI[1] = ((((152 + 163) - 236) + 138) ^ (((135 + 57) - 147) + 91)) & (((226 ^ 196) ^ (29 ^ 106)) ^ (-" ".length()));
        lI[2] = "  ".length();
        lI[3] = (((60 + 148) - 64) + 47) ^ (((174 + 45) - 32) + 0);
        lI[4] = (-((-145) & 27063)) & (-1025) & 28606;
        lI[5] = 179 ^ 174;
        lI[6] = "   ".length();
        lI[7] = (-((-8329) & 31898)) & (-1) & 24569;
        lI[8] = (-((-10289) & 11954)) & (-20481) & 22523;
        lI[9] = 32 ^ 104;
        lI[10] = ((35 + 67) - 2) + 34;
        lI[11] = (16 ^ 114) ^ (47 ^ 90);
        lI[12] = (30 ^ 124) ^ (235 ^ 142);
        lI[13] = 88 ^ 93;
        lI[14] = (65 ^ 14) ^ (61 ^ 97);
        lI[15] = 157 ^ 181;
        lI[16] = 121 ^ 109;
        lI[17] = 150 ^ 144;
        lI[18] = (92 ^ 75) ^ (29 ^ 35);
        lI[19] = (80 ^ 23) ^ (11 ^ 68);
        lI[20] = (((99 + 103) - 62) + 5) ^ (((64 + 119) - 149) + 118);
        lI[21] = 9 ^ 27;
        lI[22] = 63 ^ 53;
        lI[23] = 45 ^ 38;
        lI[24] = (((170 + 111) - 126) + 25) ^ (((43 + 13) - (-86)) + 42);
        lI[25] = 96 ^ 109;
        lI[26] = 128 ^ 142;
        lI[27] = "  ".length() ^ (67 ^ 78);
        lI[28] = (157 ^ 194) ^ (17 ^ 94);
        lI[29] = 19 ^ 2;
        lI[30] = (209 ^ 136) ^ (((72 + 36) - 95) + 114);
        lI[31] = 90 ^ 125;
        lI[32] = (((136 + 72) - 39) + 2) ^ (((144 + 83) - 37) + 0);
        lI[33] = (-((-4245) & 30910)) & (-1) & 28665;
        lI[34] = (((113 + 93) - 47) + 19) ^ (((80 + 114) - 73) + 43);
        lI[35] = (206 ^ 193) ^ (89 ^ 97);
        lI[36] = 139 ^ 147;
        lI[37] = (203 ^ 197) ^ (18 ^ 5);
        lI[38] = (((150 + 123) - 214) + 145) ^ (((104 + 75) - 73) + 78);
        lI[39] = 77 ^ 109;
        lI[40] = (52 ^ 12) ^ (57 ^ 27);
        lI[41] = (193 ^ 184) ^ (218 ^ 184);
        lI[42] = (202 ^ 184) ^ (63 ^ 81);
        lI[43] = 23 ^ 9;
        lI[44] = (10 ^ 66) ^ (6 ^ 81);
        lI[45] = 43 ^ 10;
        lI[46] = 121 ^ 91;
        lI[47] = (18 ^ 57) ^ (144 ^ 152);
        lI[48] = (((53 + 52) - 89) + 125) ^ (((11 + 84) - 80) + 154);
        lI[49] = 160 ^ 133;
        lI[50] = (-20637) & 22460;
        lI[51] = (-20737) & 24427;
        lI[52] = (-14441) & 16255;
        lI[53] = (-16535) & 20223;
        lI[54] = (77 ^ 82) ^ (116 ^ 65);
        lI[55] = 111 ^ 68;
        lI[56] = (73 ^ 18) ^ (21 ^ 98);
        lI[57] = (((23 + 54) - (-63)) + 97) ^ (((186 + 81) - 142) + 67);
        lI[58] = 0 ^ 46;
        lI[59] = (25 ^ 80) ^ (36 ^ 66);
        lI[60] = 53 ^ 5;
        lI[61] = (-((-8539) & 10203)) & (-65) & 24285;
        lI[62] = (((14 + 166) - (-38)) + 28) ^ (((159 + 143) - 282) + 179);
        lI[63] = ((156 + 238) - 272) + 133;
        lI[64] = (-((-2989) & 27629)) & (-6675) & 31735;
        lI[65] = (-((-257) & 21347)) & (-1025) & 24575;
        lI[66] = (-((-12623) & 29519)) & (-4169) & 24447;
        lI[67] = (-((-26937) & 28025)) & (-21025) & 24569;
        lI[68] = (-20611) & 23994;
        lI[69] = (-20481) & 22903;
        lI[70] = (-((-3509) & 32181)) & (-1) & 32063;
        lI[71] = 112 ^ 55;
        lI[72] = ((45 + 132) - 147) + 113;
        lI[73] = (-((-18907) & 24574)) & (-24577) & 32703;
        lI[74] = (-29319) & 32735;
        lI[75] = 157 ^ 175;
        lI[76] = (((173 + 124) - 205) + 82) ^ (((147 + 52) - 153) + 111);
        lI[77] = (18 ^ 38) ^ (((6 ^ 31) & ((87 ^ 78) ^ (-1))) & (((125 ^ 33) & ((216 ^ 132) ^ (-1))) ^ (-1)));
        lI[78] = (91 ^ 53) ^ (106 ^ 49);
        lI[79] = (((133 + 96) - 145) + 58) ^ (((18 + 169) - 15) + 12);
        lI[80] = (-((-1433) & 22489)) & (-5) & 24445;
        lI[81] = (-529) & 3925;
        lI[82] = (((66 + 27) - 31) + 84) ^ (((103 + 20) - (-47)) + 0);
        lI[83] = (((210 + 6) - 214) + 250) ^ (((175 + 68) - 242) + 196);
        lI[84] = -" ".length();
        lI[85] = 81 ^ 55;
        lI[86] = (214 ^ 151) ^ (107 ^ 16);
        lI[87] = (-16919) & 20086;
        lI[88] = (-8201) & 11614;
        lI[89] = 83 ^ 110;
        lI[90] = (-((-1805) & 26397)) & (-129) & 32727;
        lI[91] = 60 ^ 7;
        lI[92] = (45 ^ 12) ^ (81 ^ 76);
        lI[93] = (((((98 + 19) - 12) + 62) + (65 ^ 73)) - (27 ^ 106)) + (169 ^ 199);
        lI[94] = (-16527) & 17119;
        lI[95] = 71 ^ 121;
        lI[96] = (-((-16645) & 29989)) & (-2113) & 15855;
        lI[97] = (-6849) & 908237;
        lI[98] = 106 ^ 85;
        lI[99] = ((53 + 2) - 18) + 116;
        lI[100] = (12 ^ 67) ^ (129 ^ 142);
        lI[101] = 62 ^ 91;
        lI[102] = ((105 + 155) - 224) + 193;
        lI[103] = ((144 + 161) - 217) + 74;
        lI[104] = ((" ".length() + (((67 + 62) - (-32)) + 31)) - (-(167 ^ 184))) + (55 ^ 48);
        lI[105] = (((122 + 193) - 268) + 149) ^ (((60 + 96) - 67) + 44);
        lI[106] = (2 ^ 10) ^ (33 ^ 107);
        lI[107] = (((172 + 153) - 165) + 58) ^ (((110 + 61) - 69) + 51);
        lI[108] = (-((-11325) & 27967)) & (-129) & 28619;
        lI[109] = (-19457) & 32081;
        lI[110] = (-4225) & 16074;
        lI[111] = (((161 + 142) - 275) + 167) ^ (((45 + 15) - (-16)) + 59);
        lI[112] = (-((-15365) & 32166)) & (-4113) & 32767;
        lI[113] = 23 ^ 82;
        lI[114] = (-393) & 12248;
        lI[115] = 57 ^ 127;
        lI[116] = (-16684) & 28543;
        lI[117] = (-4393) & 16250;
        lI[118] = (-((-9093) & 29623)) & (-130) & 32511;
        lI[119] = 18 ^ 91;
        lI[120] = (-((-525) & 30223)) & (-21) & 32767;
        lI[121] = (-3077) & 8038;
        lI[122] = (91 ^ 111) ^ (245 ^ 139);
        lI[123] = 62 ^ 117;
        lI[124] = 57 ^ 117;
        lI[125] = 68 ^ 9;
        lI[126] = 55 ^ 121;
        lI[127] = 247 ^ 184;
        lI[128] = (45 ^ 60) ^ (39 ^ 105);
        lI[129] = (((160 ^ 140) + (39 ^ 10)) - (56 ^ 44)) + (4 ^ 72);
        lI[130] = 214 ^ 134;
        lI[131] = (((58 ^ 83) + (((73 + 73) - (-1)) + 0)) - (80 ^ 45)) + (75 ^ 0);
        lI[132] = (-31265) & 31609;
        lI[133] = (-17423) & 917422;
        lI[134] = (-((-2305) & 7562)) & (-7) & 1505263;
        lI[135] = (((127 + 134) - 195) + 126) ^ (((82 + 73) - 69) + 78);
        lI[136] = 59 ^ 106;
        lI[137] = (-((-12481) & 29893)) & (-12361) & 30079;
        lI[138] = (15 ^ 98) ^ (255 ^ 192);
        lI[139] = (49 ^ 95) ^ (46 ^ 19);
        lI[140] = (((77 + 45) - 39) + 66) ^ (((154 + 110) - 99) + 28);
        lI[141] = 16 ^ 69;
        lI[142] = -((-((-807) & 24359)) & (-8215) & 32766);
        lI[143] = (-((-18442) & 27659)) & (-2051) & 16267;
        lI[144] = (245 ^ 194) ^ (94 ^ 63);
        lI[145] = 111 ^ 56;
        lI[146] = (59 ^ 10) ^ (89 ^ 48);
        lI[147] = 67 ^ 26;
        lI[148] = 38 ^ 124;
        lI[149] = 101 ^ 62;
        lI[150] = (((8 + 58) - (-64)) + 65) ^ (((123 + 88) - 58) + 6);
        lI[151] = 7 ^ 90;
        lI[152] = (((75 + 25) - (-42)) + 12) ^ (((23 + 151) - 160) + 182);
        lI[153] = (-((-22545) & 30770)) & (-65) & 10239;
        lI[154] = 253 ^ 157;
        lI[155] = 72 ^ 41;
        lI[156] = 13 ^ 111;
        lI[157] = 196 ^ 167;
        lI[158] = (-3073) & 3546;
        lI[159] = (-((-21129) & 31689)) & (-1) & 11093;
        lI[160] = 61 ^ 90;
        lI[161] = 57 ^ 81;
        lI[162] = 2 ^ 107;
        lI[163] = (((179 + 67) - 140) + 100) ^ (((153 + 57) - 141) + 95);
        lI[164] = 239 ^ 132;
        lI[165] = 108 ^ 0;
        lI[166] = (109 ^ 22) ^ (24 ^ 14);
        lI[167] = (-17830) & 30207;
        lI[168] = (-1205) & 14334;
        lI[169] = (-((-1097) & 28399)) & (-1) & 32702;
        lI[170] = (-((-14279) & 32719)) & (-8833) & 32671;
        lI[171] = (-((-8545) & 9715)) & (-513) & 16383;
        lI[172] = (-1667) & 16366;
        lI[173] = ((136 + 141) - 113) + 29;
        lI[174] = ((213 + 45) - 161) + 120;
        lI[175] = (((((35 + 130) - 28) + 14) + (((142 + 86) - 133) + 62)) - (((38 + 154) - 179) + 225)) + ((132 + 117) - 244) + 144;
        lI[176] = (((93 + 77) - (-38)) + 2) ^ (((42 + 98) - 29) + 77);
        lI[177] = (-4483) & 7666;
        lI[178] = (-((-2637) & 31455)) & (-1) & 32255;
        lI[179] = (-66) & 3199;
        lI[180] = (-28689) & 32062;
        lI[181] = (((125 ^ 74) + (((24 + 120) - 34) + 19)) - (((32 + 80) - 64) + 108)) + ((105 + 51) - 42) + 17;
        lI[182] = (((((98 + 117) - 89) + 3) + (122 ^ 36)) - (208 ^ 140)) + (35 ^ 46);
        lI[183] = (-2178) & 2523;
        lI[184] = (-((-16754) & 28543)) & (-16449) & 28543;
        lI[185] = (-((-30) & 16031)) & (-73) & 16383;
        lI[186] = (-((-4097) & 13468)) & (-23045) & 32767;
        lI[187] = (-21657) & 22011;
        lI[188] = (-((-29487) & 31551)) & (-1537) & 3956;
        lI[189] = (-((-289) & 30123)) & (-1) & 30191;
        lI[190] = (-((-2578) & 27283)) & (-6153) & 31215;
        lI[191] = (-((-139) & 4799)) & (-11274) & 16319;
        lI[192] = (-29793) & 30187;
        lI[193] = (-29709) & 30174;
        lI[194] = (-((-525) & 2574)) & (-8209) & 10751;
        lI[195] = (-((-8325) & 26261)) & (-4097) & 22527;
        lI[196] = (-((-1505) & 15855)) & (-1537) & 16382;
        lI[197] = (-23016) & 23551;
        lI[198] = (-((-1215) & 5375)) & (-24842) & 29517;
        lI[199] = (-((-17219) & 28487)) & (-20993) & 32574;
        lI[200] = (-((-7275) & 15999)) & (-1025) & 10239;
        lI[201] = (-13825) & 14158;
        lI[202] = (-((-18535) & 31479)) & (-16397) & 29694;
        lI[203] = (-((-5229) & 32367)) & (-1025) & 28639;
        lI[204] = (-17433) & 17754;
        lI[205] = (-((-4371) & 7003)) & (-4101) & 7037;
        lI[206] = (-((-23451) & 24543)) & (-16385) & 17791;
        lI[207] = (-12302) & 12671;
        lI[208] = (-21514) & 21837;
        lI[209] = (-24707) & 25031;
        lI[210] = (-21682) & 22009;
        lI[211] = (-((-4611) & 31299)) & (-1027) & 28159;
        lI[212] = (-554) & 1017;
        lI[213] = (-26114) & 26591;
        lI[214] = (-15873) & 16362;
        lI[215] = (-9732) & 10223;
        lI[216] = (-2565) & 3071;
        lI[217] = (-29013) & 29534;
        lI[218] = (-((-2465) & 27061)) & (-6305) & 31230;
        lI[219] = (-((-353) & 15211)) & (-1025) & 16347;
        lI[220] = (-((-16394) & 17535)) & (-8329) & 9981;
        lI[221] = (-1025) & 1583;
        lI[222] = (-13959) & 14335;
        lI[223] = (-((-18433) & 28306)) & (-6147) & 16351;
        lI[224] = (-19463) & 19967;
        lI[225] = (-((-16721) & 30199)) & (-16897) & 30711;
        lI[226] = (-1250) & 1763;
        lI[227] = (-((-447) & 24511)) & (-8201) & 32591;
        lI[228] = (-12316) & 12795;
        lI[229] = (-7202) & 7545;
        lI[230] = (-((-4061) & 32765)) & (-2561) & 31743;
        lI[231] = (-((-1227) & 18139)) & (-11265) & 28669;
        lI[232] = (-22538) & 22879;
        lI[233] = (-((-475) & 22491)) & (-10242) & 32703;
        lI[234] = (-13485) & 13804;
        lI[235] = (-10913) & 11262;
        lI[236] = (-18465) & 18785;
        lI[237] = (-30729) & 31069;
        lI[238] = (-((-16787) & 23003)) & (-26130) & 32767;
        lI[239] = (-((-467) & 23027)) & (-17) & 23039;
        lI[240] = (-((-258) & 6019)) & (-8193) & 14327;
        lI[241] = (-10247) & 10622;
        lI[242] = (-28808) & 29143;
        lI[243] = (-((-12769) & 15861)) & (-17027) & 20447;
        lI[244] = (-27681) & 28011;
        lI[245] = (-12819) & 13151;
        lI[246] = (-((-17473) & 32326)) & (-1217) & 16373;
        lI[247] = (-8209) & 8570;
        lI[248] = (-9749) & 10071;
        lI[249] = (-((-2449) & 32155)) & (-2561) & 32575;
        lI[250] = (-((-13315) & 29835)) & (-7233) & 24063;
        lI[251] = (-((-1029) & 25741)) & (-1) & 25087;
        lI[252] = (-((-4357) & 29119)) & (-1285) & 26559;
        lI[253] = (-25617) & 25919;
        lI[254] = (-(229 ^ 162)) & (-20098) & 20479;
        lI[255] = (-((-57) & 22139)) & (-2181) & 24575;
        lI[256] = (-18049) & 18365;
        lI[257] = (-4621) & 4959;
        lI[258] = (-1699) & 2038;
        lI[259] = (-((-8259) & 31339)) & (-9217) & 32639;
        lI[260] = (-3745) & 4091;
        lI[261] = (-((-5517) & 15758)) & (-5281) & 15869;
        lI[262] = (-24097) & 24447;
        lI[263] = (-12929) & 13287;
        lI[264] = (-((-20481) & 23063)) & (-17538) & 20479;
        lI[265] = (-((-265) & 24473)) & (-8193) & 32767;
        lI[266] = (-12935) & 13302;
        lI[267] = (-31247) & 31727;
        lI[268] = (-16390) & 16871;
        lI[269] = (-4628) & 5111;
        lI[270] = (-((-309) & 16191)) & (-17) & 16383;
        lI[271] = (-8714) & 9199;
        lI[272] = (-((-9285) & 15957)) & (-25609) & 32767;
        lI[273] = (-25603) & 26090;
        lI[274] = (-((-16385) & 29207)) & (-18433) & 31743;
        lI[275] = (-((-2421) & 28534)) & (-4097) & 30715;
        lI[276] = (-4611) & 5118;
        lI[277] = (-((-20675) & 31939)) & (-16897) & 28669;
        lI[278] = (-13313) & 13822;
        lI[279] = (-3073) & 3583;
        lI[280] = (-11419) & 11935;
        lI[281] = (-3170) & 3687;
        lI[282] = (-((-39) & 9463)) & (-4353) & 14295;
        lI[283] = (-13585) & 14104;
        lI[284] = (-((-1225) & 24031)) & (-9377) & 32703;
        lI[285] = (-19717) & 20239;
        lI[286] = (-23892) & 24415;
        lI[287] = (-((-65) & 25843)) & (-321) & 26623;
        lI[288] = (-8210) & 11263;
        lI[289] = (-((-2218) & 23531)) & (-1) & 24559;
        lI[290] = (-10545) & 11710;
        lI[291] = (-12461) & 13247;
        lI[292] = (-((-2867) & 20275)) & (-12553) & 30655;
        lI[293] = ((127 + 101) - 169) + 91;
        lI[294] = (((24 + 38) - (-67)) + 94) ^ (((12 + 66) - (-92)) + 6);
    }

    private static boolean llll(Object obj) {
        return obj == null;
    }

    private static boolean lIlll(int i) {
        return i >= 0;
    }

    private static boolean lIIlI(int i, int i2) {
        return i <= i2;
    }

    public static void d(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(I[lI[0]]));
        bufferedWriter.write(str + System.getProperty(I[lI[2]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static long a(long j) {
        return ac() - j;
    }

    private static boolean llII(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean ap() {
        if (lIIll(h(lI[85]))) {
            ?? r0 = lI[0];
            "".length();
            return (((((205 + 43) - 45) + 13) ^ (((4 + 29) - 30) + 140)) & (((99 ^ 123) ^ (217 ^ 150)) ^ (-" ".length()))) < 0 ? ((((65 + 57) - (-8)) + 82) ^ (((64 + 46) - 4) + 52)) & ((((116 ^ 126) & ((68 ^ 78) ^ (-1))) ^ (64 ^ 10)) ^ (-" ".length())) : r0;
        }
        return lI[1];
    }

    private static int lIllI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public static void ag() {
        Widget widget = Widgets.get(lI[4], lI[5], lI[1]);
        if (lIIII(widget)) {
            widget.interact(I[lI[6]]);
            Time.sleepTicks(lI[6]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(String[] strArr) {
        int i = lI[1];
        while (llIl(i, strArr.length)) {
            String[] strArr2 = new String[lI[0]];
            strArr2[lI[1]] = strArr[i];
            if (lIIII(TileItems.getNearest(strArr2))) {
                return lI[0];
            }
            i++;
            "".length();
            if ("  ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lI[1];
    }

    public static void ar() {
        if (lIlI(h(lI[93]), lI[0])) {
            if (lIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lI[0]);
                "".length();
            }
            if (lIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lI[94], lI[43]);
                if (lIIII(widget)) {
                    widget.interact(I[lI[95]]);
                    Time.sleepTicks(lI[0]);
                    "".length();
                }
            }
        }
    }

    public static int c(int i, int i2) {
        int i3 = i2 - i;
        if (lIIl(i3)) {
            return i;
        }
        if (lIlI(Math.abs(i3), lI[0])) {
            if (lIll(al.nextBoolean() ? 1 : 0)) {
                "".length();
                return (-(7 ^ 2)) >= 0 ? (101 ^ 73) & ((36 ^ 8) ^ (-1)) : i;
            }
            return i2;
        }
        if (llII(i3)) {
            i = i2;
            i2 = i;
        }
        return i + al.nextInt((i2 - i) + lI[0]);
    }

    private static boolean lllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean ak() {
        if (lIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[167]));
        })).intValue())) {
            ?? r0 = lI[0];
            "".length();
            return 0 != 0 ? (true ^ true) & (true ^ true) : r0;
        }
        return lI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v196, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v202, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v205, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v208, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v211, types: [boolean] */
    public static void aw() {
        Clues.f0c = I[lI[107]];
        if (lIll(Bank.isOpen() ? 1 : 0)) {
            int[] iArr = new int[lI[0]];
            iArr[lI[1]] = lI[108];
            if (lIIl(Inventory.contains(iArr) ? 1 : 0)) {
                Bank.depositEquipment();
                Time.sleepTicks(lI[6]);
                "".length();
                Bank.withdrawAll(lI[108], Bank.WithdrawMode.ITEM);
                Time.sleepTicks(lI[2]);
                "".length();
                g.b(m.bF, lI[0]);
                g.a(lI[90], lI[13]);
                g.a(lI[109], lI[0]);
                int[] iArr2 = new int[lI[0]];
                iArr2[lI[1]] = lI[110];
                if (lIll(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(I[lI[111]]);
                    aC = lI[0];
                }
                int[] iArr3 = new int[lI[0]];
                iArr3[lI[1]] = lI[112];
                if (lIll(Bank.contains(iArr3) ? 1 : 0)) {
                    System.out.println(I[lI[113]]);
                    aD = lI[0];
                }
                int[] iArr4 = new int[lI[0]];
                iArr4[lI[1]] = lI[114];
                if (lIll(Bank.contains(iArr4) ? 1 : 0)) {
                    System.out.println(I[lI[115]]);
                    aE = lI[0];
                }
                int[] iArr5 = new int[lI[0]];
                iArr5[lI[1]] = lI[116];
                if (lIll(Bank.contains(iArr5) ? 1 : 0)) {
                    System.out.println(I[lI[71]]);
                    aF = lI[0];
                }
                int[] iArr6 = new int[lI[0]];
                iArr6[lI[1]] = lI[117];
                if (lIll(Bank.contains(iArr6) ? 1 : 0)) {
                    System.out.println(I[lI[9]]);
                    aG = lI[0];
                }
                int[] iArr7 = new int[lI[0]];
                iArr7[lI[1]] = lI[118];
                if (lIll(Bank.contains(iArr7) ? 1 : 0)) {
                    System.out.println(I[lI[119]]);
                    aH = lI[0];
                }
            }
        }
        int[] iArr8 = new int[lI[0]];
        iArr8[lI[1]] = lI[108];
        if (lIll(Inventory.contains(iArr8) ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lI[120], lI[121], lI[0]);
            if (lIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lI[12])) {
                Clues.f0c = I[lI[122]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lI[0]);
                "".length();
            }
            if (lIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lI[12])) {
                if (lIIl(Shop.isOpen() ? 1 : 0)) {
                    Clues.f0c = I[lI[123]];
                    String[] strArr = new String[lI[0]];
                    strArr[lI[1]] = I[lI[124]];
                    NPCs.getNearest(strArr).interact(I[lI[125]]);
                    Time.sleepTicks(lI[6]);
                    "".length();
                }
                if (lIll(Shop.isOpen() ? 1 : 0)) {
                    int[] iArr9 = new int[lI[0]];
                    iArr9[lI[1]] = lI[108];
                    if (lIll(Inventory.contains(iArr9) ? 1 : 0)) {
                        int[] iArr10 = new int[lI[0]];
                        iArr10[lI[1]] = lI[108];
                        if (lIlIl(Inventory.getFirst(iArr10).getQuantity(), lI[43]) && lIIl(aG ? 1 : 0)) {
                            Shop.buyOne(lI[117]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                    int[] iArr11 = new int[lI[0]];
                    iArr11[lI[1]] = lI[108];
                    if (lIll(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lI[0]];
                        iArr12[lI[1]] = lI[108];
                        if (lIlIl(Inventory.getFirst(iArr12).getQuantity(), lI[35]) && lIIl(aD ? 1 : 0)) {
                            Shop.buyOne(lI[112]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                    int[] iArr13 = new int[lI[0]];
                    iArr13[lI[1]] = lI[108];
                    if (lIll(Inventory.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[lI[0]];
                        iArr14[lI[1]] = lI[108];
                        if (lIlIl(Inventory.getFirst(iArr14).getQuantity(), lI[92]) && lIIl(aE ? 1 : 0)) {
                            Shop.buyOne(lI[114]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                    int[] iArr15 = new int[lI[0]];
                    iArr15[lI[1]] = lI[108];
                    if (lIll(Inventory.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lI[0]];
                        iArr16[lI[1]] = lI[108];
                        if (lIlIl(Inventory.getFirst(iArr16).getQuantity(), lI[15]) && lIIl(aH ? 1 : 0)) {
                            Shop.buyOne(lI[118]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                    int[] iArr17 = new int[lI[0]];
                    iArr17[lI[1]] = lI[108];
                    if (lIll(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lI[0]];
                        iArr18[lI[1]] = lI[108];
                        if (lIlIl(Inventory.getFirst(iArr18).getQuantity(), lI[47]) && lIIl(aC ? 1 : 0)) {
                            Shop.buyOne(lI[110]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                    int[] iArr19 = new int[lI[0]];
                    iArr19[lI[1]] = lI[108];
                    if (lIll(Inventory.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lI[0]];
                        iArr20[lI[1]] = lI[108];
                        if (lIlIl(Inventory.getFirst(iArr20).getQuantity(), lI[15]) && lIIl(aF ? 1 : 0)) {
                            Shop.buyOne(lI[116]);
                            Time.sleepTicks(lI[2]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    public static int h(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    public static void d(WorldPoint worldPoint) {
        if (lIll(Inventory.contains(item -> {
            return item.getName().contains(I[lI[149]]);
        }) ? 1 : 0) && lIIl(Equipment.contains(item2 -> {
            return item2.getName().contains(I[lI[148]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item3 -> {
                return item3.getName().contains(I[lI[147]]);
            }).interact(I[lI[140]]);
        }
        if (lIll(Inventory.contains(item4 -> {
            return item4.getName().contains(I[lI[146]]);
        }) ? 1 : 0) && lIIl(Equipment.contains(item5 -> {
            return item5.getName().contains(I[lI[145]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item6 -> {
                return item6.getName().contains(I[lI[144]]);
            }).interact(I[lI[141]]);
        }
        Movement.walkTo(worldPoint);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(int[] iArr) {
        int i = lI[1];
        int length = iArr.length;
        int lllllllIllIlIlI = lI[1];
        while (llIl(lllllllIllIlIlI, length)) {
            int i2 = iArr[lllllllIllIlIlI];
            int bit = Vars.getBit(i2);
            if (!lIll(aK.containsKey(Integer.valueOf(i2)) ? 1 : 0) || lllI(aK.get(Integer.valueOf(i2)).intValue(), bit)) {
                if (lIll(aK.containsKey(Integer.valueOf(i2)) ? 1 : 0)) {
                    System.out.println(i2 + " - Old Value: " + String.valueOf(aK.get(Integer.valueOf(i2))) + ", Current Value: " + bit);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    System.out.println(i2 + ": " + bit);
                }
                aK.put(Integer.valueOf(i2), Integer.valueOf(bit));
                "".length();
                i = lI[0];
            }
            lllllllIllIlIlI++;
            "".length();
            if (((136 ^ 144) & ((141 ^ 149) ^ (-1))) < 0) {
                return;
            }
        }
        if (lIll(i)) {
            System.out.println(I[lI[100]]);
        }
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (lIIIl(Players.getLocal().getWorldLocation().distanceTo(au), lI[3])) {
            Clues.f0c = I[lI[86]];
            WorldArea worldArea = new WorldArea(lI[87], lI[88], lI[89], lI[15], lI[1]);
            int[] iArr = new int[lI[0]];
            iArr[lI[1]] = lI[90];
            boolean contains = Inventory.contains(iArr);
            if (lIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = lI[0];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            } else {
                i = lI[1];
            }
            if (lIll((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[lI[0]];
                iArr2[lI[1]] = lI[90];
                Inventory.getFirst(iArr2).interact(I[lI[91]]);
                Time.sleepTicks(lI[19]);
                "".length();
            }
            Movement.walkTo(au);
            "".length();
            Time.sleepTicks(lI[0]);
            "".length();
        }
        if (lIIlI(Players.getLocal().getWorldLocation().distanceTo(au), lI[3])) {
            if (lIIl(Bank.isOpen() ? 1 : 0)) {
                g.G();
            }
            Clues.f0c = I[lI[92]];
            int llllllllIIIllll = z ? 1 : 0;
            if (lIll(llllllllIIIllll) && lIIll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(lI[3]);
                "".length();
            }
            int llllllllIIIlllI = z2 ? 1 : 0;
            if (lIll(llllllllIIIlllI) && lIIll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(lI[2]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                int llllllllIIIlIlI = entry.getValue().intValue();
                System.out.println("Key: " + intValue + ", Value: " + llllllllIIIlIlI);
                g.a(intValue, llllllllIIIlIlI);
                Time.sleepTicks(lI[0]);
                "".length();
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIll(int i) {
        return i != 0;
    }

    public static String b(long j) {
        String str = I[lI[1]];
        Object[] objArr = new Object[lI[0]];
        objArr[lI[1]] = Integer.valueOf(lI[2]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lI[0]];
        objArr2[lI[1]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lI[0]];
        objArr3[lI[1]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lI[0]];
        objArr4[lI[1]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    public static void an() {
        int i = lI[1];
        do {
            String[] strArr = new String[lI[0]];
            strArr[lI[1]] = I[lI[41]];
            if (!lIIII(TileObjects.getNearest(strArr)) || !lIIl(Clues.d ? 1 : 0)) {
                return;
            }
            Clues.f0c = I[lI[42]];
            String[] strArr2 = new String[lI[0]];
            strArr2[lI[1]] = I[lI[5]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (lIIl(i)) {
                if (lIIl(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(I[lI[43]]);
                }
                if (lIll(Dialog.isOpen() ? 1 : 0)) {
                    if (lIIl(Dialog.canContinueNPC() ? 1 : 0) && lIIl(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (lIIl(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (lIIl(widget.getText().contains(I[lI[166]]) ? 1 : 0)) {
                                    ?? r0 = lI[0];
                                    "".length();
                                    return (-" ".length()) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lI[1];
                            }).collect(Collectors.toList());
                            if (lIIl(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lI[1])).getClickPoint().getX(), ((Widget) list.get(lI[1])).getClickPoint().getY(), (boolean) lI[0]);
                                Time.sleepTicks(lI[6]);
                                "".length();
                            }
                            if (lIlI(list.size(), lI[0])) {
                                i = lI[0];
                            }
                        }
                    }
                    if (!lIIl(Dialog.canContinueNPC() ? 1 : 0) || lIll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (lIll(i)) {
                String[] strArr3 = new String[lI[0]];
                strArr3[lI[1]] = I[lI[44]];
                TileObjects.getNearest(strArr3).interact(I[lI[39]]);
                Time.sleepTicks(lI[13]);
                "".length();
            }
            Time.sleepTicks(lI[0]);
            "".length();
            "".length();
        } while ("  ".length() >= "  ".length());
    }

    public static void a(LocalPoint localPoint) {
        Client client = Static.getClient();
        if (llll(client.getLocalPlayer())) {
            return;
        }
        Movement.walkTo(WorldPoint.fromLocal(client, localPoint));
        "".length();
        Time.sleepTicks(lI[0]);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean c(int[] iArr) {
        int i = lI[1];
        while (llIl(i, iArr.length)) {
            if (lIIl(iArr[i])) {
                "".length();
                if (((99 ^ 1) & ((107 ^ 9) ^ (-1))) >= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIIl(g(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return lI[1];
            }
            i++;
            "".length();
            if (((145 ^ 186) ^ (190 ^ 145)) < 0) {
                return ((81 ^ 73) ^ (94 ^ 12)) & (((111 ^ 93) ^ (57 ^ 65)) ^ (-" ".length()));
            }
        }
        return lI[0];
    }

    private static boolean lIlIl(int i, int i2) {
        return i >= i2;
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lI[65], lI[66], lI[1]);
        WorldArea worldArea = new WorldArea(lI[67], lI[68], lI[20], lI[47], lI[1]);
        WorldArea worldArea2 = new WorldArea(lI[69], lI[70], lI[71], lI[72], lI[1]);
        if (lIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lI[17]) && lIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lI[73], lI[74], lI[0])), lI[16])) {
            Clues.f0c = I[lI[75]];
            if (lIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lI[0]);
            "".length();
        }
        if (lIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lI[17]) && lIIlI(Players.getLocal().getWorldLocation().getY(), lI[66])) {
            if (lIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lI[0]];
                strArr[lI[1]] = I[lI[76]];
                TileObjects.getNearest(strArr).interact(I[lI[77]]);
                Time.sleepTicks(lI[2]);
                "".length();
            }
            if (lIll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lI[0]];
                strArr2[lI[1]] = I[lI[78]];
                n.c(strArr2);
            }
        }
        if (lIIIl(Players.getLocal().getWorldLocation().getY(), lI[66])) {
            if (lIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lI[73], lI[74], lI[0])), lI[16])) {
                return;
            }
            Clues.f0c = I[lI[79]];
            if (lIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lI[65], lI[80], lI[1])) ? 1 : 0)) {
                c(new WorldPoint(lI[65], lI[81], lI[1]));
                Time.sleepTicks(lI[17]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lI[0]);
            "".length();
        }
    }

    private static String l(String lllllllIIllllII, String lllllllIIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllIIlllllI = Cipher.getInstance("Blowfish");
            lllllllIIlllllI.init(lI[2], secretKeySpec);
            return new String(lllllllIIlllllI.doFinal(Base64.getDecoder().decode(lllllllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllIIlllIII) {
            lllllllIIlllIII.printStackTrace();
            return null;
        }
    }

    public static void af() {
        if (lIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lI[3]);
            "".length();
        }
        if (lIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIl(Bank.isOpen() ? 1 : 0)) {
            i(ad());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
        if (lIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String[] strArr) {
        int length = strArr.length;
        int i = lI[1];
        int i2 = lI[1];
        while (llIl(i2, strArr.length)) {
            String[] strArr2 = new String[lI[0]];
            strArr2[lI[1]] = strArr[i2];
            if (lIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lI[0]];
                strArr3[lI[1]] = strArr[i2];
            }
            i++;
            if (lIlI(i, length)) {
                return lI[0];
            }
            i2++;
            "".length();
            if ((-" ".length()) > 0) {
                return ((161 ^ 171) ^ "   ".length()) & (((15 ^ 75) ^ (25 ^ 84)) ^ (-" ".length()));
            }
        }
        return lI[1];
    }

    private static boolean llIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static void a(WorldPoint worldPoint) {
        if (lIIl(ay.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIl(Players.getLocal().getWorldLocation().distanceTo(ax), lI[6])) {
                Clues.f0c = I[lI[45]];
                Movement.walkTo(ax);
                "".length();
                Time.sleepTicks(lI[0]);
                "".length();
            }
            if (lIIlI(Players.getLocal().getWorldLocation().distanceTo(ax), lI[6])) {
                Clues.f0c = I[lI[46]];
                if (lIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lI[0]];
                    strArr[lI[1]] = I[lI[165]];
                    return npc.hasAction(strArr);
                });
                if (lIIII(nearest)) {
                    String[] strArr = new String[lI[0]];
                    strArr[lI[1]] = I[lI[47]];
                    if (lIll(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(I[lI[48]]);
                        Time.sleepTicks(lI[6]);
                        "".length();
                    }
                    String[] strArr2 = new String[lI[0]];
                    strArr2[lI[1]] = I[lI[49]];
                    if (lIIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                        String str = I[lI[30]];
                        String[] strArr3 = new String[lI[6]];
                        strArr3[lI[1]] = I[lI[31]];
                        strArr3[lI[0]] = I[lI[15]];
                        strArr3[lI[2]] = I[lI[18]];
                        n.b(str, strArr3);
                        Time.sleepTicks(lI[0]);
                        "".length();
                    }
                }
            }
        }
        if (lIll(ay.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lI[50], lI[51], lI[1])) ? 1 : 0)) {
                c(new WorldPoint(lI[52], lI[53], lI[1]));
                Time.sleepTicks(c(lI[13], lI[17]));
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lI[0]);
            "".length();
        }
    }

    public static void d(int[] iArr) {
        int i = lI[1];
        while (llIl(i, iArr.length)) {
            if (lIIl(iArr[i])) {
                "".length();
                if ((-"  ".length()) >= 0) {
                    return;
                }
            } else {
                Time.sleepTicks(lI[0]);
                "".length();
                j(iArr[i]);
                Time.sleep(c(lI[63], lI[64]));
                "".length();
            }
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        Time.sleepTicks(c(lI[0], lI[6]));
        "".length();
    }

    public static void ao() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIll(world.isMembers() ? 1 : 0) && lIIlI(world.getPlayerCount(), lI[153]) && lllI(world.getId(), Worlds.getCurrentId()) && lIIl(world.getActivity().endsWith(I[lI[154]]) ? 1 : 0) && lIIl(world.getActivity().endsWith(I[lI[155]]) ? 1 : 0) && lIIl(world.getActivity().startsWith(I[lI[156]]) ? 1 : 0) && lIIl(world.getActivity().startsWith(I[lI[157]]) ? 1 : 0) && lllI(world.getId(), lI[158]) && lllI(world.getId(), lI[159]) && lllI(world.getId(), lI[159]) && lIIl(world.getActivity().contains(I[lI[135]]) ? 1 : 0) && lIIl(world.getActivity().contains(I[lI[101]]) ? 1 : 0) && lIIl(world.getActivity().contains(I[lI[85]]) ? 1 : 0) && lIIl(world.getActivity().startsWith(I[lI[160]]) ? 1 : 0) && lIIl(world.getActivity().endsWith(I[lI[161]]) ? 1 : 0) && lIIl(world.getActivity().endsWith(I[lI[162]]) ? 1 : 0) && lIIl(world.getActivity().endsWith(I[lI[163]]) ? 1 : 0) && lIIl(world.getActivity().startsWith(I[lI[164]]) ? 1 : 0) && lIIIl(world.getPlayerCount(), lI[135])) {
                ?? r0 = lI[0];
                "".length();
                return 0 != 0 ? ((90 ^ 104) ^ (97 ^ 24)) & (((177 ^ 185) ^ (84 ^ 23)) ^ (-" ".length())) : r0;
            }
            return lI[1];
        }));
    }

    static {
        lIII();
        llI();
        ao = lI[173];
        aq = lI[174];
        ar = lI[175];
        ak = I[lI[176]];
        as = lI[102];
        ap = lI[104];
        al = ThreadLocalRandom.current();
        am = System.currentTimeMillis();
        an = System.nanoTime();
        int[] iArr = new int[lI[13]];
        iArr[lI[1]] = lI[173];
        iArr[lI[0]] = lI[104];
        iArr[lI[2]] = lI[174];
        iArr[lI[6]] = lI[175];
        iArr[lI[3]] = lI[102];
        at = iArr;
        au = new WorldPoint(lI[177], lI[178], lI[1]);
        av = new WorldArea(lI[179], lI[180], lI[181], lI[182], lI[1]);
        int[] iArr2 = new int[lI[164]];
        iArr2[lI[1]] = lI[183];
        iArr2[lI[0]] = lI[184];
        iArr2[lI[2]] = lI[185];
        iArr2[lI[6]] = lI[186];
        iArr2[lI[3]] = lI[187];
        iArr2[lI[13]] = lI[188];
        iArr2[lI[17]] = lI[189];
        iArr2[lI[12]] = lI[190];
        iArr2[lI[19]] = lI[191];
        iArr2[lI[20]] = lI[192];
        iArr2[lI[22]] = lI[193];
        iArr2[lI[23]] = lI[194];
        iArr2[lI[24]] = lI[195];
        iArr2[lI[25]] = lI[196];
        iArr2[lI[26]] = lI[197];
        iArr2[lI[27]] = lI[198];
        iArr2[lI[28]] = lI[199];
        iArr2[lI[29]] = lI[200];
        iArr2[lI[21]] = lI[201];
        iArr2[lI[14]] = lI[202];
        iArr2[lI[16]] = lI[203];
        iArr2[lI[32]] = lI[204];
        iArr2[lI[34]] = lI[205];
        iArr2[lI[11]] = lI[206];
        iArr2[lI[36]] = lI[207];
        iArr2[lI[37]] = lI[208];
        iArr2[lI[40]] = lI[209];
        iArr2[lI[41]] = lI[210];
        iArr2[lI[42]] = lI[211];
        iArr2[lI[5]] = lI[212];
        iArr2[lI[43]] = lI[213];
        iArr2[lI[44]] = lI[214];
        iArr2[lI[39]] = lI[215];
        iArr2[lI[45]] = lI[216];
        iArr2[lI[46]] = lI[217];
        iArr2[lI[47]] = lI[218];
        iArr2[lI[48]] = lI[219];
        iArr2[lI[49]] = lI[220];
        iArr2[lI[30]] = lI[221];
        iArr2[lI[31]] = lI[222];
        iArr2[lI[15]] = lI[223];
        iArr2[lI[18]] = lI[224];
        iArr2[lI[54]] = lI[225];
        iArr2[lI[55]] = lI[226];
        iArr2[lI[56]] = lI[227];
        iArr2[lI[57]] = lI[228];
        iArr2[lI[58]] = lI[229];
        iArr2[lI[59]] = lI[230];
        iArr2[lI[60]] = lI[231];
        iArr2[lI[62]] = lI[232];
        iArr2[lI[75]] = lI[233];
        iArr2[lI[76]] = lI[234];
        iArr2[lI[77]] = lI[235];
        iArr2[lI[78]] = lI[236];
        iArr2[lI[79]] = lI[237];
        iArr2[lI[35]] = lI[238];
        iArr2[lI[82]] = lI[239];
        iArr2[lI[83]] = lI[240];
        iArr2[lI[86]] = lI[241];
        iArr2[lI[91]] = lI[242];
        iArr2[lI[92]] = lI[243];
        iArr2[lI[89]] = lI[244];
        iArr2[lI[95]] = lI[245];
        iArr2[lI[98]] = lI[246];
        iArr2[lI[100]] = lI[247];
        iArr2[lI[105]] = lI[248];
        iArr2[lI[106]] = lI[137];
        iArr2[lI[107]] = lI[249];
        iArr2[lI[111]] = lI[250];
        iArr2[lI[113]] = lI[251];
        iArr2[lI[115]] = lI[8];
        iArr2[lI[71]] = lI[252];
        iArr2[lI[9]] = lI[253];
        iArr2[lI[119]] = lI[254];
        iArr2[lI[122]] = lI[255];
        iArr2[lI[123]] = lI[256];
        iArr2[lI[124]] = lI[257];
        iArr2[lI[125]] = lI[258];
        iArr2[lI[126]] = lI[259];
        iArr2[lI[127]] = lI[260];
        iArr2[lI[130]] = lI[261];
        iArr2[lI[136]] = lI[262];
        iArr2[lI[138]] = lI[263];
        iArr2[lI[139]] = lI[264];
        iArr2[lI[140]] = lI[265];
        iArr2[lI[141]] = lI[266];
        iArr2[lI[144]] = lI[267];
        iArr2[lI[145]] = lI[268];
        iArr2[lI[146]] = lI[269];
        iArr2[lI[147]] = lI[270];
        iArr2[lI[148]] = lI[271];
        iArr2[lI[149]] = lI[272];
        iArr2[lI[150]] = lI[273];
        iArr2[lI[151]] = lI[274];
        iArr2[lI[152]] = lI[275];
        iArr2[lI[128]] = lI[276];
        iArr2[lI[154]] = lI[277];
        iArr2[lI[155]] = lI[278];
        iArr2[lI[156]] = lI[279];
        iArr2[lI[157]] = lI[280];
        iArr2[lI[135]] = lI[281];
        iArr2[lI[101]] = lI[282];
        iArr2[lI[85]] = lI[283];
        iArr2[lI[160]] = lI[284];
        iArr2[lI[161]] = lI[285];
        iArr2[lI[162]] = lI[286];
        iArr2[lI[163]] = lI[287];
        aw = iArr2;
        ax = new WorldPoint(lI[288], lI[289], lI[1]);
        ay = new WorldArea(lI[290], lI[68], lI[291], lI[292], lI[1]);
        aA = c(lI[133], lI[134]);
        aB = c(lI[123], lI[293]);
        aI = System.currentTimeMillis();
        aJ = c(lI[0], lI[135]);
        aK = new HashMap();
    }

    private static boolean lIIl(int i) {
        return i == 0;
    }

    public static void ax() {
        if (lIlll(lIllI(System.currentTimeMillis(), aI + aA)) && lIIl(ay() ? 1 : 0)) {
            int c2 = c(lI[0], lI[6]);
            if (lIlI(c2, lI[0])) {
                aB = c(lI[46], lI[76]);
                Clues.f0c = I[lI[126]];
                Time.sleepTicks(aB);
                "".length();
            }
            if (lIlI(c2, lI[2])) {
                Clues.f0c = I[lI[127]];
                aB = c(lI[128], lI[129]);
                Time.sleepTicks(aB);
                "".length();
            }
            if (lIlI(c2, lI[6])) {
                Clues.f0c = I[lI[130]];
                aB = c(lI[131], lI[132]);
                Time.sleepTicks(aB);
                "".length();
            }
            aI = System.currentTimeMillis();
            aA = c(lI[133], lI[134]);
            aJ = c(lI[0], lI[135]);
        }
    }

    private static boolean lIIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ah() {
        if (lIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[172]));
        })).intValue()) && lIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[171]));
        })).intValue()) && lIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[168]));
        })).intValue()) && !lllI(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lI[169]));
        })).intValue(), lI[7])) {
            return lI[1];
        }
        ?? r0 = lI[0];
        "".length();
        return " ".length() >= ((((10 + 16) - (-52)) + 98) ^ (((119 + 118) - 132) + 75)) ? ((((15 + 97) - (-21)) + 49) ^ (((26 + 155) - 132) + 122)) & (((((102 + 38) - 135) + 131) ^ (((125 + 39) - 123) + 108)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void at() {
        if (lIIl(Widgets.get(lI[99]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lI[99], lI[28]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lI[0]);
            Time.sleepTicks(lI[6]);
            "".length();
        }
    }

    private static String I(String lllllllIIIlllll, String lllllllIIIllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllIIIllllI.toCharArray();
        int lllllllIIIllIll = lI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lI[1];
        while (llIl(i, length)) {
            char lllllllIIlIIIII = charArray2[i];
            sb.append((char) (lllllllIIlIIIII ^ charArray[lllllllIIIllIll % charArray.length]));
            "".length();
            lllllllIIIllIll++;
            i++;
            "".length();
            if ((150 ^ 146) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean az() {
        return llIII(Quests.getState(Quest.ALFRED_GRIMHANDS_BARCRAWL), QuestState.FINISHED) ? lI[0] : lI[1];
    }

    public static void am() {
        Widget widget = Widgets.get(lI[38], lI[39]);
        if (lIIII(widget)) {
            widget.interact(I[lI[40]]);
            Time.sleepTicks(lI[0]);
            "".length();
        }
    }

    public static String f(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    public static boolean g(int i) {
        int[] iArr = new int[lI[0]];
        iArr[lI[1]] = i;
        return Bank.contains(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public static boolean as() {
        Time.sleepTicks(lI[3]);
        "".length();
        if (lIIl(Tabs.isOpen(Tab.QUESTS) ? 1 : 0)) {
            Tabs.open(Tab.QUESTS);
            Time.sleepTicks(lI[6]);
            "".length();
        }
        if (lIll(Tabs.isOpen(Tab.QUESTS) ? 1 : 0)) {
            Time.sleepTicks(lI[2]);
            "".length();
            Widget child = Widgets.get(lI[96], lI[12]).getChild(lI[11]);
            if (lIIII(child) && lIlI(child.getTextColor(), lI[97])) {
                System.out.println(I[lI[98]]);
                return lI[0];
            }
        }
        return lI[1];
    }
}
