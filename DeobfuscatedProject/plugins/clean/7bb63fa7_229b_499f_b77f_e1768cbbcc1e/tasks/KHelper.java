/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.util.WorldUtil
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.unethicalite.api.account.GameAccount
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.GHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.MHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.NHelper;
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
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
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
import net.runelite.http.api.worlds.WorldResult;
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

public class KHelper {
    public static  WorldArea av;
    static  boolean aG;
    static  boolean aC;
    private static final  long an;
    public static  WorldPoint au;
    public static  WorldPoint ax;
    private static final  long am;
    static  boolean aD;
    private static final  int ap;
    public static final  String ak;
    static  boolean aE;
    public static  int aA;
    private static final  int[] at;
    public static  int aB;
    private static final  int aq;
    static  boolean aF;
    static  boolean aH;
    static  long aI;
    public static final  ThreadLocalRandom al;
    
    public static  WorldArea ay;
    private static final  int ao;
    public static  int[] aw;
    private static final  int as;
    public static  int az;
    private static final  int ar;
    
    static  int aJ;
    private static  Map<Integer, Integer> aK;

    public static void av() {
        List list = Widgets.getAll((int)lI[102], widget -> widget.getText().contains(I[lI[128]]));
        List list2 = Widgets.getAll((int)lI[103], widget -> widget.getText().contains(I[lI[152]]));
        List list3 = Widgets.getAll((int)lI[104], widget -> widget.getText().contains(I[lI[151]]));
        int lllllllIlIlllll = lI[1];
        while (k.llIl(lllllllIlIlllll, at.length)) {
            Widget lllllllIlIllllI = Widgets.get((int)at[lllllllIlIlllll], widget -> widget.getText().contains(I[lI[150]]));
            if (k.lIIII(lllllllIlIllllI)) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + at[lllllllIlIlllll]);
            }
            ++lllllllIlIlllll;

            if (-(0x22 ^ 0x26) <= 0) continue;
            return;
        }
    }

    private static boolean llIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static void j(int n2) {
        int[] nArray = new int[lI[0]];
        nArray[k.lI[1]] = n2;
        if (k.lIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lI[0]];
            nArray2[k.lI[1]] = n2;
            if (k.lIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int lllllllllIIlllI;
                Clues.c = I[lI[54]];
                int[] nArray3 = new int[lI[0]];
                nArray3[k.lI[1]] = n2;
                String[] stringArray = new String[lI[0]];
                stringArray[k.lI[1]] = I[lI[55]];
                if (k.lIll(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lI[0]];
                    nArray4[k.lI[1]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(I[lI[56]]);
                }
                int[] nArray5 = new int[lI[0]];
                nArray5[k.lI[1]] = lllllllllIIlllI;
                String[] stringArray2 = new String[lI[0]];
                stringArray2[k.lI[1]] = I[lI[57]];
                if (k.lIll(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[lI[0]];
                    nArray6[k.lI[1]] = lllllllllIIlllI;
                    Inventory.getFirst((int[])nArray6).interact(I[lI[58]]);
                }
                int[] nArray7 = new int[lI[0]];
                nArray7[k.lI[1]] = lllllllllIIlllI;
                String[] stringArray3 = new String[lI[0]];
                stringArray3[k.lI[1]] = I[lI[59]];
                if (k.lIll(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[lI[0]];
                    nArray8[k.lI[1]] = lllllllllIIlllI;
                    Inventory.getFirst((int[])nArray8).interact(I[lI[60]]);
                }
                if (k.lIlI(lllllllllIIlllI, lI[61])) {
                    Time.sleepTicks((int)lI[6]);

                    String[] stringArray4 = new String[lI[0]];
                    stringArray4[k.lI[1]] = I[lI[62]];
                    n.c(stringArray4);
                    Time.sleepTicks((int)lI[0]);

                }
            }
        }
    }

    public static double ae() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    public static long ac() {
        return am + (System.nanoTime() - an) / 1000000L;
    }

    public static int ad() {
        int n2 = k.c(lI[1], aw.length - lI[0]);
        return aw[n2];
    }

    public static int au() {
        return k.h(lI[101]);
    }

    /*
     * WARNING - void declaration
     */
    public int aA() {
        void lllllllIlIIlIIl;
        Client client = Static.getClient();
        int n2 = client.getLoginIndex();
        GameAccount gameAccount = Game.getGameAccount();
        if (k.llll(gameAccount)) {
            return lI[142];
        }
        switch (lllllllIlIIlIIl) {
            case 4: {
                void lllllllIlIIlIII;
                if (k.lIIII(lllllllIlIIlIII.getAuth())) {

                } else {
                    return lI[142];
                }
                Keyboard.sendEnter();
                return lI[7];
            }
            case 2: {
                void lllllllIlIIlIlI;
                void lllllllIlIIlIII;
                if (k.llIII(Game.getState(), GameState.LOGGING_IN)) {
                    return lI[7];
                }
                lllllllIlIIlIlI.setUsername(lllllllIlIIlIII.getUsername());
                lllllllIlIIlIlI.setPassword(lllllllIlIIlIII.getPassword());
                Keyboard.sendEnter();
                Keyboard.sendEnter();
                return lI[7];
            }
            case 0: 
            case 12: 
            case 24: {
                void lllllllIlIIlIlI;
                lllllllIlIIlIlI.setLoginIndex(lI[2]);
                return lI[7];
            }
            case 3: 
            case 14: {
                return lI[143];
            }
        }
        return lI[7];
    }

    /*
     * WARNING - void declaration
     */
    public static void i(int n2) {
        if (k.lllI(Static.getClient().getWorld(), n2)) {
            void llllllllllIllll;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            World world = worldResult.findWorld(n2);
            if (k.llll(world)) {
                return;
            }
            if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World llllllllllIlllI = Static.getClient().createWorld();
            llllllllllIlllI.setActivity(llllllllllIllll.getActivity());
            llllllllllIlllI.setAddress(llllllllllIllll.getAddress());
            llllllllllIlllI.setId(llllllllllIllll.getId());
            llllllllllIlllI.setPlayerCount(llllllllllIllll.getPlayers());
            llllllllllIlllI.setLocation(llllllllllIllll.getLocation());
            llllllllllIlllI.setTypes(WorldUtil.toWorldTypes((EnumSet)llllllllllIllll.getTypes()));
            Worlds.hopTo((net.runelite.api.World)llllllllllIlllI);
        }
    }

    public static void a(String llllllllIlllIlI, String llllllllIlllIIl) {
        try {
            URL llllllllIlllIII = new URL(llllllllIlllIlI);
            HttpURLConnection llllllllIllIlll = (HttpURLConnection)llllllllIlllIII.openConnection();
            llllllllIllIlll.setRequestMethod(I[lI[35]]);
            llllllllIllIlll.setRequestProperty(I[lI[82]], I[lI[83]]);
            llllllllIllIlll.setDoOutput(lI[0]);
            String llllllllIllIllI = "{\"content\": \"" + llllllllIlllIIl + "\"}";
            DataOutputStream llllllllIllIlIl = new DataOutputStream(llllllllIllIlll.getOutputStream());
            llllllllIllIlIl.writeBytes(llllllllIllIllI);
            llllllllIllIlIl.flush();
            llllllllIllIlIl.close();
            int llllllllIllIlII = llllllllIllIlll.getResponseCode();
            System.out.println("Response Code: " + llllllllIllIlII);
            llllllllIllIlll.disconnect();

        }
        catch (Exception llllllllIlllIII) {
            llllllllIlllIII.printStackTrace();
        }
        if (2 < 0) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void c(WorldPoint worldPoint) {
        void var7_7;
        void var5_5;
        void var4_4;
        int n2;
        int n3;
        int llllllllIlIIlIl;
        void llllllllIlIlIIl;
        WorldPoint llllllllIlIlIlI;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (k.llll(player)) {
            return;
        }
        WorldPoint llllllllIlIIlll = llllllllIlIlIlI;
        int llllllllIlIIllI = llllllllIlIIlll.getX() - llllllllIlIlIIl.getBaseX();
        Point llllllllIlIIlII = Perspective.localToCanvas((Client)llllllllIlIlIIl, (LocalPoint)LocalPoint.fromScene((int)llllllllIlIIllI, (int)(llllllllIlIIlIl = llllllllIlIIlll.getY() - llllllllIlIlIIl.getBaseY())), (int)llllllllIlIlIIl.getPlane());
        if (k.lIIII(llllllllIlIIlII)) {
            n3 = llllllllIlIIlII.getX();

            if (((0x19 ^ 0x2F) & ~(0xBC ^ 0x8A)) > ((0x58 ^ 0x7D) & ~(0xBA ^ 0x9F))) {
                return;
            }
        } else {
            int llllllllIlIIIll;
            n3 = llllllllIlIIIll = lI[84];
        }
        if (k.lIIII(llllllllIlIIlII)) {
            n2 = llllllllIlIIlII.getY();

            if (1 <= 0) {
                return;
            }
        } else {
            n2 = lI[84];
        }
        int n4 = n2;
        client.interact(lI[1], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    public static boolean ay() {
        int lllllllIlIlIIII = lI[1];
        while (k.llIl(lllllllIlIlIIII, Quest.values().length)) {
            if (k.llIII(Quests.getState((Quest)Quest.values()[lllllllIlIlIIII]), QuestState.IN_PROGRESS) && (!k.lIll(Quest.values()[lllllllIlIlIIII].getName().contains(I[lI[136]]) ? 1 : 0) || k.lIIIl(k.h(lI[137]), lI[13])) && k.lIIl(Quest.values()[lllllllIlIlIIII].getName().equals(I[lI[138]]) ? 1 : 0)) {
                if (k.lIll(Quest.values()[lllllllIlIlIIII].getName().equals(I[lI[139]]) ? 1 : 0)) {

                    if ((9 ^ 0x58 ^ (0x7D ^ 0x28)) <= 2) {
                        return ((0x77 ^ 0x1F ^ (0x2F ^ 0x60)) & (0x46 ^ 0x6E ^ (0x2D ^ 0x22) ^ -1)) != 0;
                    }
                } else {
                    System.out.println("In progress: " + Quest.values()[lllllllIlIlIIII].getName());
                    return lI[0];
                }
            }
            ++lllllllIlIlIIII;

            return ((0x5C ^ 1 ^ (0xDF ^ 0xAA)) & (0xCD ^ 0xAD ^ (0xFE ^ 0xB6) ^ -1)) != 0;
        }
        return lI[1];
    }

    public static void aj() {
        Widget lllllllllIllllI;
        Widget lllllllllIlllll;
        if (!k.lIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[172]))) || k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[171])))) {
            if (k.lIIl(k.al() ? 1 : 0)) {
                k.am();
            }
            if (k.lIll(k.al() ? 1 : 0)) {
                lllllllllIlllll = Widgets.get((int)lI[10], (int)lI[11], (int)lI[12]);
                if (k.lIIII(lllllllllIlllll)) {
                    lllllllllIlllll.interact(I[lI[16]]);
                    Time.sleepTicks((int)lI[0]);

                }
                if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[172]))) && k.lIIII(lllllllllIllllI = Widgets.get((int)lI[10], (int)lI[14], (int)lI[30]))) {
                    Mouse.click((int)lllllllllIllllI.getClickPoint().getX(), (int)lllllllllIllllI.getClickPoint().getY(), (boolean)lI[0]);
                    Time.sleepTicks((int)lI[0]);

                }
                if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[171]))) && k.lIIII(lllllllllIllllI = Widgets.get((int)lI[10], (int)lI[14], (int)lI[31]))) {
                    Mouse.click((int)lllllllllIllllI.getClickPoint().getX(), (int)lllllllllIllllI.getClickPoint().getY(), (boolean)lI[0]);
                    Time.sleepTicks((int)lI[0]);

                }
            }
        }
        if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[170])))) {
            if (k.lIIl(k.al() ? 1 : 0)) {
                k.am();
            }
            if (k.lIll(k.al() ? 1 : 0)) {
                lllllllllIlllll = Widgets.get((int)lI[10], (int)lI[11], (int)lI[2]);
                if (k.lIIII(lllllllllIlllll)) {
                    lllllllllIlllll.interact(I[lI[32]]);
                    Time.sleepTicks((int)lI[0]);

                }
                if (k.lIIII(lllllllllIllllI = Widgets.get((int)lI[10], (int)lI[21], (int)lI[18]))) {
                    Mouse.click((int)lllllllllIllllI.getClickPoint().getX(), (int)lllllllllIllllI.getClickPoint().getY(), (boolean)lI[0]);
                    Time.sleepTicks((int)lI[6]);

                    if (k.lllI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[169])), lI[33])) {
                        Keyboard.type((String)I[lI[34]], (boolean)lI[0]);
                    }
                }
            }
        }
        if (k.lIll(k.ak() ? 1 : 0)) {
            if (k.lIIl(k.al() ? 1 : 0)) {
                k.am();
            }
            if (k.lIll(k.al() ? 1 : 0)) {
                lllllllllIlllll = Widgets.get((int)lI[10], (int)lI[11], (int)lI[3]);
                if (k.lIIII(lllllllllIlllll)) {
                    lllllllllIlllll.interact(I[lI[11]]);
                    Time.sleepTicks((int)lI[0]);

                }
                if (k.lIIII(lllllllllIllllI = Widgets.get((int)lI[10], (int)lI[21], (int)lI[35]))) {
                    Mouse.click((int)lllllllllIllllI.getClickPoint().getX(), (int)lllllllllIllllI.getClickPoint().getY(), (boolean)lI[0]);
                    Time.sleepTicks((int)lI[0]);

                }
            }
        }
        if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[168])))) {
            if (k.lIIl(k.al() ? 1 : 0)) {
                k.am();
            }
            if (k.lIll(k.al() ? 1 : 0)) {
                lllllllllIlllll = Widgets.get((int)lI[10], (int)lI[11], (int)lI[17]);
                if (k.lIIII(lllllllllIlllll)) {
                    lllllllllIlllll.interact(I[lI[36]]);
                    Time.sleepTicks((int)lI[0]);

                }
                if (k.lIIII(lllllllllIllllI = Widgets.get((int)lI[10], (int)lI[14], (int)lI[14]))) {
                    lllllllllIllllI.interact(I[lI[37]]);
                    Time.sleepTicks((int)lI[0]);

                }
            }
        }
    }

    private static boolean lIIIl(int n2, int n3) {
        return n2 > n3;
    }

    public static void aq() {
        if (k.lIIl(k.h(lI[93]))) {
            Widget llllllllIIIlIII;
            if (k.lIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lI[0]);

            }
            if (k.lIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && k.lIIII(llllllllIIIlIII = Widgets.get((int)lI[94], (int)lI[43]))) {
                llllllllIIIlIII.interact(I[lI[89]]);
                Time.sleepTicks((int)lI[0]);

            }
        }
    }

    public static void ai() {
        Widget llllllllllIIlIl;
        Widget widget = Widgets.get((int)lI[8], (int)lI[9]);
        if (k.lIIII(widget)) {
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lI[0]);
            Time.sleepTicks((int)lI[0]);

        }
        if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (k.lIll(k.ah() ? 1 : 0)) {
            if (k.lIIl(k.al() ? 1 : 0)) {
                k.am();
            }
            if (k.lIll(k.al() ? 1 : 0)) {
                Widget llllllllllIIIll;
                Widget llllllllllIIlII;
                llllllllllIIlIl = Widgets.get((int)lI[10], (int)lI[11], (int)lI[12]);
                if (k.lIIII(llllllllllIIlIl)) {
                    llllllllllIIlIl.interact(I[lI[3]]);
                    Time.sleepTicks((int)lI[0]);

                }
                if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[172])))) {
                    Clues.c = I[lI[13]];
                    llllllllllIIlII = Widgets.get((int)lI[10], (int)lI[14], (int)lI[15]);
                    if (k.lIIII(llllllllllIIlII)) {
                        if (k.lIIl(llllllllllIIlII.isVisible() ? 1 : 0)) {
                            llllllllllIIIll = Widgets.get((int)lI[10], (int)lI[16], (int)lI[13]);
                            Mouse.click((int)llllllllllIIIll.getClickPoint().getX(), (int)llllllllllIIIll.getClickPoint().getY(), (boolean)lI[0]);
                            Time.sleepTicks((int)lI[0]);

                        }
                        if (k.lIll(llllllllllIIlII.isVisible() ? 1 : 0)) {
                            llllllllllIIlII.interact(I[lI[17]]);
                            Time.sleepTicks((int)lI[0]);

                        }
                    }
                }
                if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[171])))) {
                    Clues.c = I[lI[12]];
                    llllllllllIIlII = Widgets.get((int)lI[10], (int)lI[14], (int)lI[18]);
                    if (k.lIIII(llllllllllIIlII)) {
                        if (k.lIIl(llllllllllIIlII.isVisible() ? 1 : 0)) {
                            llllllllllIIIll = Widgets.get((int)lI[10], (int)lI[16], (int)lI[13]);
                            Mouse.click((int)llllllllllIIIll.getClickPoint().getX(), (int)llllllllllIIIll.getClickPoint().getY(), (boolean)lI[0]);
                            Time.sleepTicks((int)lI[0]);

                        }
                        if (k.lIll(llllllllllIIlII.isVisible() ? 1 : 0)) {
                            llllllllllIIlII.interact(I[lI[19]]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                }
                if (k.lllI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[169])), lI[7])) {
                    Clues.c = I[lI[20]];
                    llllllllllIIlII = Widgets.get((int)lI[10], (int)lI[21]);
                    if (k.lIIII(llllllllllIIlII) && k.lIIII(llllllllllIIlII.getChildren())) {
                        if (k.lIIl(llllllllllIIlII.getChild(lI[0]).getText().contains(I[lI[22]]) ? 1 : 0) && k.lIIII(llllllllllIIIll = Widgets.get((int)lI[10], (int)lI[22]))) {
                            Mouse.click((int)llllllllllIIIll.getClickPoint().getX(), (int)llllllllllIIIll.getClickPoint().getY(), (boolean)lI[0]);
                            Time.sleepTicks((int)lI[6]);

                            Keyboard.type((String)I[lI[23]]);
                            Time.sleepTicks((int)lI[13]);

                        }
                        if (k.lIll(llllllllllIIlII.getChild(lI[0]).getText().contains(I[lI[24]]) ? 1 : 0)) {
                            Time.sleepTicks((int)lI[2]);

                            Mouse.click((int)llllllllllIIlII.getChild(lI[0]).getClickPoint().getX(), (int)llllllllllIIlII.getChild(lI[0]).getClickPoint().getY(), (boolean)lI[0]);
                            Time.sleepTicks((int)lI[13]);

                            Keyboard.type((String)I[lI[25]]);
                            Time.sleepTicks((int)lI[2]);

                            Keyboard.sendEnter();
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                }
                if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[168])))) {
                    Clues.c = I[lI[26]];
                    llllllllllIIlII = Widgets.get((int)lI[10], (int)lI[3]);
                    if (k.lIIII(llllllllllIIlII)) {
                        llllllllllIIlII.interact(I[lI[27]]);
                        Time.sleepTicks((int)lI[6]);

                    }
                    if (k.lIIl(k.al() ? 1 : 0)) {
                        k.am();
                        Time.sleepTicks((int)lI[2]);

                    }
                    if (k.lIll(k.al() ? 1 : 0) && k.lIIII(llllllllllIIIll = Widgets.get((int)lI[10], (int)lI[21])) && k.lIIII(llllllllllIIIll.getChildren())) {
                        Widget llllllllllIIIlI;
                        if (k.lIIl(llllllllllIIIll.getChild(lI[0]).getText().contains(I[lI[28]]) ? 1 : 0) && k.lIIII(llllllllllIIIlI = Widgets.get((int)lI[10], (int)lI[22]))) {
                            Mouse.click((int)llllllllllIIIlI.getClickPoint().getX(), (int)llllllllllIIIlI.getClickPoint().getY(), (boolean)lI[0]);
                            Time.sleepTicks((int)lI[6]);

                            Keyboard.type((String)I[lI[29]]);
                            Time.sleepTicks((int)lI[13]);

                        }
                        if (k.lIll(llllllllllIIIll.getChild(lI[0]).getText().contains(I[lI[21]]) ? 1 : 0)) {
                            Time.sleepTicks((int)lI[0]);

                            Mouse.click((int)llllllllllIIIll.getChild(lI[0]).getClickPoint().getX(), (int)llllllllllIIIll.getChild(lI[0]).getClickPoint().getY(), (boolean)lI[0]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                }
            }
        }
        if (k.lIlI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[172])), lI[0]) && k.lIlI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[171])), lI[0]) && k.lIlI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[168])), lI[0]) && k.lIlI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[169])), lI[7]) && k.lIIII(llllllllllIIlIl = Widgets.get((int)lI[10], (int)lI[3]))) {
            llllllllllIIlIl.interact(I[lI[14]]);
            Time.sleepTicks((int)lI[0]);

        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, boolean bl) {
        Plugin plugin2 = Static.getPluginManager().getPlugins().stream().filter(plugin -> plugin.getName().equalsIgnoreCase(string)).findFirst().orElse(null);
        if (k.lIIII(plugin2)) {
            try {
                void lllllllIlIllIII;
                void lllllllIlIlIlll;
                if (k.lIIl(Static.getPluginManager().isPluginEnabled((Plugin)lllllllIlIlIlll) ? 1 : 0) && k.lIIl((int)lllllllIlIllIII)) {
                    System.out.println(I[lI[105]]);
                    Static.getPluginManager().setPluginEnabled((Plugin)lllllllIlIlIlll, lI[0]);
                }
                if (k.lIll(Static.getPluginManager().isPluginEnabled((Plugin)lllllllIlIlIlll) ? 1 : 0) && k.lIll((int)lllllllIlIllIII)) {
                    System.out.println(I[lI[106]]);
                    Static.getPluginManager().setPluginEnabled((Plugin)lllllllIlIlIlll, lI[1]);
                }

            }
            catch (Exception lllllllIlIlIllI) {
                throw new RuntimeException(lllllllIlIlIllI);
            }
            if (((0x3E ^ 0x75) & ~(0xF6 ^ 0xBD)) > 0) {
                return;
            }
        }
    }

    private static void llI() {
        I = new String[lI[294]];
        k.I[k.lI[1]] = k.I("QmF8TDcD", "gDLiS");
        k.I[k.lI[0]] = k.l("mc/Zbn1mjd6dkyHUHt5zdcSqEq+uQ34+3zIPJZZfn++EFuw3dTMn3M0LrRNn0HxZedxy6Xdq1zo=", "ktJdh");
        k.I[k.lI[2]] = "line.separator";
        k.I[k.lI[6]] = k.I("NiYfFC8=", "uJpgJ");
        k.I[k.lI[3]] = k.I("KwEFNgYMRD4yFxYNBzQW", "xdiSe");
        k.I[k.lI[13]] = "Turning off ge alerts 1";
        k.I[k.lI[17]] = k.I("HiggNjgv", "JGGQT");
        k.I[k.lI[12]] = k.I("GxY6HQYhBGgcCSlDLxZPLg8tARs8Q3o=", "OcHso");
        k.I[k.lI[19]] = k.I("ARoWCy8w", "UuqlC");
        k.I[k.lI[20]] = k.I("KwIkLQwWAHA1ChcTcDcKDA42MAYZEzk2Cws=", "xgPYe");
        k.I[k.lI[22]] = "Loot drop";
        k.I[k.lI[23]] = k.I("Phs4Mw==", "RtWGf");
        k.I[k.lI[24]] = "Loot drop";
        k.I[k.lI[25]] = "1000";
        k.I[k.lI[26]] = "Turning off trade delay";
        k.I[k.lI[27]] = k.l("tpNawIoSidY=", "zbdjv");
        k.I[k.lI[28]] = k.l("7TmPWxGloL8/pNpbjSkxRg==", "dBZlj");
        k.I[k.lI[29]] = "trade delay";
        k.I[k.lI[21]] = k.l("cyJQHR/qYWoz+m0fTXvk9Q==", "aGcqd");
        k.I[k.lI[14]] = k.l("Q6V3tc9Cb/E=", "yonle");
        k.I[k.lI[16]] = k.I("PQ4pIjkaSxImKAACKyAp", "nkEGZ");
        k.I[k.lI[32]] = k.l("RB0dDQd6RU/+yITn0Ap56A==", "uenTW");
        k.I[k.lI[34]] = k.I("d2l0WA==", "EYDhR");
        k.I[k.lI[11]] = "Select Display";
        k.I[k.lI[36]] = "Select Interfaces";
        k.I[k.lI[37]] = k.l("Cbe8r1SjRuE=", "GLaoT");
        k.I[k.lI[40]] = k.l("ELo/lmAX9UljLislMMNbPg==", "UKgDg");
        k.I[k.lI[41]] = "Death's Coffer";
        k.I[k.lI[42]] = "Handling death";
        k.I[k.lI[5]] = "Death";
        k.I[k.lI[43]] = "Talk-to";
        k.I[k.lI[44]] = "Portal";
        k.I[k.lI[39]] = "Use";
        k.I[k.lI[45]] = "Nav to veos";
        k.I[k.lI[46]] = k.I("OSYPNisUZxc3KAJnAjomBQ==", "qGaRG");
        k.I[k.lI[47]] = "Port Piscarilius";
        k.I[k.lI[48]] = k.I("JQ4wGVklCDEOGAcILgQMBg==", "uaBmy");
        k.I[k.lI[49]] = k.I("MyQxIGMzIjA3IhEiLz02EA==", "cKCTC");
        k.I[k.lI[30]] = k.l("crHD3LwQb+k=", "XKdDQ");
        k.I[k.lI[31]] = k.l("wGtsFkbJWDSAKYCoNhyYq5/hT3qRFyirR+eVkzgkfGGxt0jN/0D7SrYKSUKwbHHN", "WqJJM");
        k.I[k.lI[15]] = k.I("Mig+ajEePHA+KRoscCctUT0/ag8DLDE+aDomJTgtHy1v", "qIPJH");
        k.I[k.lI[18]] = k.I("AToEFjs/MEU=", "FUkrY");
        k.I[k.lI[54]] = k.I("FTIUHwkgKg8RWTcmAAQ=", "PCavy");
        k.I[k.lI[55]] = k.l("tU1Q4M98WCo=", "GhCwj");
        k.I[k.lI[56]] = "Wear";
        k.I[k.lI[57]] = "Wield";
        k.I[k.lI[58]] = k.l("9a1ljN3k/tk=", "VqfKq");
        k.I[k.lI[59]] = k.l("0R1P4zuPtR4=", "pbsIg");
        k.I[k.lI[60]] = "Equip";
        k.I[k.lI[62]] = k.l("iPbW4biEu/WS2slGrfZQwRBEBHWLf7PM", "HuTdq");
        k.I[k.lI[75]] = k.l("832rsym84iK2cnLEqTWbCEr7NcnaBdzW", "Nwkob");
        k.I[k.lI[76]] = k.l("DAvgJZJH4wE=", "DMBFm");
        k.I[k.lI[77]] = "Open";
        k.I[k.lI[78]] = "Sorry, I'm a bit busy.";
        k.I[k.lI[79]] = k.l("rrOUrbk5XOjjsCwRQNaa4/2vREPBTbMy", "mFFuJ");
        k.I[k.lI[35]] = k.I("MhsDGg==", "bTPNO");
        k.I[k.lI[82]] = k.l("oRSJOd+0MCumgb5lTAFNPw==", "RQieU");
        k.I[k.lI[83]] = k.I("Ah8kJQUADiAgAw1APjoDDQ==", "coTIl");
        k.I[k.lI[86]] = k.I("PgsOcQcfSi4wAQIFGzpTJ0oaMB0b", "pjxQs");
        k.I[k.lI[91]] = k.I("JhUmLBM=", "dgCMx");
        k.I[k.lI[92]] = "Handling banking";
        k.I[k.lI[89]] = k.I("Mj0gCWgBLSAHJBopIAM=", "sHTfH");
        k.I[k.lI[95]] = k.I("GBcVBWwrBxULIDADFQ8=", "YbajL");
        k.I[k.lI[98]] = k.l("Lw9eqCS+PO4DQRYKIuKg+RQqkeemNZy/", "PFApf");
        k.I[k.lI[100]] = k.l("AHnG8yduQFM=", "SbpuR");
        k.I[k.lI[105]] = k.I("JQsEFzwbRxgDdREOAhE3GQIVXHUBEgMePBsAUR87", "ugqpU");
        k.I[k.lI[106]] = "Plugin is enabled, turning off";
        k.I[k.lI[107]] = k.l("rfCPfUu33sxqWgDuFtppIA==", "IZnza");
        k.I[k.lI[111]] = "Has hood";
        k.I[k.lI[113]] = "Has top";
        k.I[k.lI[115]] = k.l("kj9msYfCuNquPWyzGiKPpw==", "uglou");
        k.I[k.lI[71]] = "Has boots";
        k.I[k.lI[9]] = "Has gloves";
        k.I[k.lI[119]] = k.l("bxxmesmWEKrvAXxLtbDaIA==", "RjcNm");
        k.I[k.lI[122]] = k.l("c+SVVXiVJOgqOKHgE0Ck3KHNoMDQYJ2j", "JraiL");
        k.I[k.lI[123]] = "Opening shop";
        k.I[k.lI[124]] = k.I("BQsYOgQ=", "ByyYa");
        k.I[k.lI[125]] = k.I("BRYmHT8=", "QdGyZ");
        k.I[k.lI[126]] = k.l("ul02JIoq3yutbYQzKGqJdQ==", "gjuoE");
        k.I[k.lI[127]] = k.l("A2wW5Vg5WzQZDdDU542p4Q==", "obxOP");
        k.I[k.lI[130]] = "Breaking long";
        k.I[k.lI[136]] = k.I("NiI8JBgd", "xCHQj");
        k.I[k.lI[138]] = k.l("qVHvGtM0ntGvOlN4ET3GI4GiaHEbTTa0", "BlHdr");
        k.I[k.lI[139]] = "The Enchanted Key";
        k.I[k.lI[140]] = k.l("vZ8WB/TWbm4=", "CvXrG");
        k.I[k.lI[141]] = k.I("BRIYCw==", "RwyyZ");
        k.I[k.lI[144]] = k.l("CZOrg08+OSk=", "OEatl");
        k.I[k.lI[145]] = k.I("PxQ+HTw=", "xuSxO");
        k.I[k.lI[146]] = k.l("y5teGfwyqAU=", "UCvDQ");
        k.I[k.lI[147]] = "dueling";
        k.I[k.lI[148]] = "dueling";
        k.I[k.lI[149]] = "dueling";
        k.I[k.lI[150]] = "continue";
        k.I[k.lI[151]] = k.I("KgAJLS4nGgI=", "IogYG");
        k.I[k.lI[152]] = k.I("BQM6JxkIGTE=", "flTSp");
        k.I[k.lI[128]] = k.l("+v/sqjiA70dRzCSG+9Vy8g==", "wneLQ");
        k.I[k.lI[154]] = "total";
        k.I[k.lI[155]] = k.I("ARcG", "QaVKt");
        k.I[k.lI[156]] = k.l("UcbOEJYJoYE=", "tICSf");
        k.I[k.lI[157]] = k.I("OSgsHw==", "qAKwF");
        k.I[k.lI[135]] = "Leagues";
        k.I[k.lI[101]] = "Beta";
        k.I[k.lI[85]] = k.l("KwGE+pRvJzI=", "ViwUV");
        k.I[k.lI[160]] = k.I("NgMOBhsTCA==", "rfobv");
        k.I[k.lI[161]] = k.I("LiAOJQ8LKw==", "jEoAb");
        k.I[k.lI[162]] = "Speedrunning";
        k.I[k.lI[163]] = "total";
        k.I[k.lI[164]] = k.I("OjYRCg==", "xSekG");
        k.I[k.lI[165]] = "Port Piscarilius";
        k.I[k.lI[166]] = k.l("9N6uNIZ9lzU=", "LAHZO");
        k.I[k.lI[176]] = k.l("j1yGV1he4O6kzEXqon9MEa6zrLhnsuRga09Sniay8KF4XkcL1MzboScLSGK5yLjwXG/1O2zeBrk=", "DnElh");
    }

    public static boolean al() {
        boolean bl;
        if (k.lIIII(Widgets.get((int)lI[10], (int)lI[0]))) {
            bl = lI[0];

            if (1 <= 0) {
                return false;
            }
        } else {
            bl = lI[1];
        }
        return bl;
    }

    private static boolean llll(Object object) {
        return object == null;
    }

    private static boolean lIlll(int n2) {
        return n2 >= 0;
    }

    private static boolean lIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void d(String string) {
        FileWriter fileWriter = new FileWriter(I[lI[0]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(I[lI[2]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static long a(long l2) {
        return k.ac() - l2;
    }

    private static boolean llII(int n2) {
        return n2 < 0;
    }

    public static boolean ap() {
        boolean bl;
        if (k.lIIll(k.h(lI[85]))) {
            bl = lI[0];

            if (((205 + 43 - 45 + 13 ^ 4 + 29 - 30 + 140) & (0x63 ^ 0x7B ^ (0xD9 ^ 0x96) ^ -1)) < 0) {
                return ((65 + 57 - -8 + 82 ^ 64 + 46 - 4 + 52) & ((0x74 ^ 0x7E) & ~(0x44 ^ 0x4E) ^ (0x40 ^ 0xA) ^ -1)) != 0;
            }
        } else {
            bl = lI[1];
        }
        return bl;
    }

    private static int lIllI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public static void ag() {
        Widget widget = Widgets.get((int)lI[4], (int)lI[5], (int)lI[1]);
        if (k.lIIII(widget)) {
            widget.interact(I[lI[6]]);
            Time.sleepTicks((int)lI[6]);

        }
    }

    public static boolean b(String[] stringArray) {
        String[] lllllllIllllIIl;
        int lllllllIllllIII = lI[1];
        while (k.llIl(lllllllIllllIII, lllllllIllllIIl.length)) {
            String[] stringArray2 = new String[lI[0]];
            stringArray2[k.lI[1]] = lllllllIllllIIl[lllllllIllllIII];
            if (k.lIIII(TileItems.getNearest((String[])stringArray2))) {
                return lI[0];
            }
            ++lllllllIllllIII;

            if (2 >= 0) continue;
            return false;
        }
        return lI[1];
    }

    public static void ar() {
        if (k.lIlI(k.h(lI[93]), lI[0])) {
            Widget llllllllIIIIllI;
            if (k.lIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lI[0]);

            }
            if (k.lIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && k.lIIII(llllllllIIIIllI = Widgets.get((int)lI[94], (int)lI[43]))) {
                llllllllIIIIllI.interact(I[lI[95]]);
                Time.sleepTicks((int)lI[0]);

            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void llllllllllllIll;
        int llllllllllllIlI;
        int lllllllllllllII;
        int n4 = n3 - n2;
        if (k.lIIl(n4)) {
            return lllllllllllllII;
        }
        if (k.lIlI(Math.abs(llllllllllllIlI), lI[0])) {
            int n5;
            if (k.lIll(al.nextBoolean() ? 1 : 0)) {
                n5 = lllllllllllllII;

                if (-(7 ^ 2) >= 0) {
                    return (0x65 ^ 0x49) & ~(0x24 ^ 8);
                }
            } else {
                n5 = llllllllllllIll;
            }
            return n5;
        }
        if (k.llII(llllllllllllIlI)) {
            llllllllllllIlI = lllllllllllllII;
            lllllllllllllII = llllllllllllIll;
            n3 = llllllllllllIlI;
        }
        return n2 + al.nextInt(n3 - n2 + lI[0]);
    }

    private static boolean lllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIII(Object object) {
        return object != null;
    }

    public static boolean ak() {
        boolean bl;
        if (k.lIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[167])))) {
            bl = lI[0];

            }
        } else {
            bl = lI[1];
        }
        return bl;
    }

    public static void aw() {
        Clues.c = I[lI[107]];
        if (k.lIll(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lI[0]];
            nArray[k.lI[1]] = lI[108];
            if (k.lIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Bank.depositEquipment();
                Time.sleepTicks((int)lI[6]);

                Bank.withdrawAll((int)lI[108], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Time.sleepTicks((int)lI[2]);

                g.b(m.bF, lI[0]);
                g.a(lI[90], lI[13]);
                g.a(lI[109], lI[0]);
                int[] nArray2 = new int[lI[0]];
                nArray2[k.lI[1]] = lI[110];
                if (k.lIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println(I[lI[111]]);
                    aC = lI[0];
                }
                int[] nArray3 = new int[lI[0]];
                nArray3[k.lI[1]] = lI[112];
                if (k.lIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    System.out.println(I[lI[113]]);
                    aD = lI[0];
                }
                int[] nArray4 = new int[lI[0]];
                nArray4[k.lI[1]] = lI[114];
                if (k.lIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    System.out.println(I[lI[115]]);
                    aE = lI[0];
                }
                int[] nArray5 = new int[lI[0]];
                nArray5[k.lI[1]] = lI[116];
                if (k.lIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    System.out.println(I[lI[71]]);
                    aF = lI[0];
                }
                int[] nArray6 = new int[lI[0]];
                nArray6[k.lI[1]] = lI[117];
                if (k.lIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    System.out.println(I[lI[9]]);
                    aG = lI[0];
                }
                int[] nArray7 = new int[lI[0]];
                nArray7[k.lI[1]] = lI[118];
                if (k.lIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    System.out.println(I[lI[119]]);
                    aH = lI[0];
                }
            }
        }
        int[] nArray = new int[lI[0]];
        nArray[k.lI[1]] = lI[108];
        if (k.lIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            WorldPoint lllllllIlIlIlII = new WorldPoint(lI[120], lI[121], lI[0]);
            if (k.lIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllIlIlIlII), lI[12])) {
                Clues.c = I[lI[122]];
                Movement.walkTo((WorldPoint)lllllllIlIlIlII);

                Time.sleepTicks((int)lI[0]);

            }
            if (k.lIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllIlIlIlII), lI[12])) {
                if (k.lIIl(Shop.isOpen() ? 1 : 0)) {
                    Clues.c = I[lI[123]];
                    String[] stringArray = new String[lI[0]];
                    stringArray[k.lI[1]] = I[lI[124]];
                    NPCs.getNearest((String[])stringArray).interact(I[lI[125]]);
                    Time.sleepTicks((int)lI[6]);

                }
                if (k.lIll(Shop.isOpen() ? 1 : 0)) {
                    int[] nArray8 = new int[lI[0]];
                    nArray8[k.lI[1]] = lI[108];
                    if (k.lIll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                        int[] nArray9 = new int[lI[0]];
                        nArray9[k.lI[1]] = lI[108];
                        if (k.lIlIl(Inventory.getFirst((int[])nArray9).getQuantity(), lI[43]) && k.lIIl(aG ? 1 : 0)) {
                            Shop.buyOne((int)lI[117]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                    int[] nArray10 = new int[lI[0]];
                    nArray10[k.lI[1]] = lI[108];
                    if (k.lIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                        int[] nArray11 = new int[lI[0]];
                        nArray11[k.lI[1]] = lI[108];
                        if (k.lIlIl(Inventory.getFirst((int[])nArray11).getQuantity(), lI[35]) && k.lIIl(aD ? 1 : 0)) {
                            Shop.buyOne((int)lI[112]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                    int[] nArray12 = new int[lI[0]];
                    nArray12[k.lI[1]] = lI[108];
                    if (k.lIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                        int[] nArray13 = new int[lI[0]];
                        nArray13[k.lI[1]] = lI[108];
                        if (k.lIlIl(Inventory.getFirst((int[])nArray13).getQuantity(), lI[92]) && k.lIIl(aE ? 1 : 0)) {
                            Shop.buyOne((int)lI[114]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                    int[] nArray14 = new int[lI[0]];
                    nArray14[k.lI[1]] = lI[108];
                    if (k.lIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                        int[] nArray15 = new int[lI[0]];
                        nArray15[k.lI[1]] = lI[108];
                        if (k.lIlIl(Inventory.getFirst((int[])nArray15).getQuantity(), lI[15]) && k.lIIl(aH ? 1 : 0)) {
                            Shop.buyOne((int)lI[118]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                    int[] nArray16 = new int[lI[0]];
                    nArray16[k.lI[1]] = lI[108];
                    if (k.lIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                        int[] nArray17 = new int[lI[0]];
                        nArray17[k.lI[1]] = lI[108];
                        if (k.lIlIl(Inventory.getFirst((int[])nArray17).getQuantity(), lI[47]) && k.lIIl(aC ? 1 : 0)) {
                            Shop.buyOne((int)lI[110]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                    int[] nArray18 = new int[lI[0]];
                    nArray18[k.lI[1]] = lI[108];
                    if (k.lIll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                        int[] nArray19 = new int[lI[0]];
                        nArray19[k.lI[1]] = lI[108];
                        if (k.lIlIl(Inventory.getFirst((int[])nArray19).getQuantity(), lI[15]) && k.lIIl(aF ? 1 : 0)) {
                            Shop.buyOne((int)lI[116]);
                            Time.sleepTicks((int)lI[2]);

                        }
                    }
                }
            }
        }
    }

    public static int h(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    public static void d(WorldPoint worldPoint) {
        if (k.lIll(Inventory.contains(item -> item.getName().contains(I[lI[149]])) ? 1 : 0) && k.lIIl(Equipment.contains(item -> item.getName().contains(I[lI[148]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(I[lI[147]])).interact(I[lI[140]]);
        }
        if (k.lIll(Inventory.contains(item -> item.getName().contains(I[lI[146]])) ? 1 : 0) && k.lIIl(Equipment.contains(item -> item.getName().contains(I[lI[145]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(I[lI[144]])).interact(I[lI[141]]);
        }
        Movement.walkTo((WorldPoint)worldPoint);

    }

    /*
     * WARNING - void declaration
     */
    public static void e(int[] nArray) {
        int lllllllIllIllIl;
        void lllllllIllIlIll;
        int n2 = lI[1];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int lllllllIllIlIlI = lI[1];
        while (k.llIl(lllllllIllIlIlI, (int)lllllllIllIlIll)) {
            void lllllllIllIllII;
            void lllllllIllIlIIl = lllllllIllIllII[lllllllIllIlIlI];
            int lllllllIllIlIII = Vars.getBit((int)lllllllIllIlIIl);
            if (!k.lIll(aK.containsKey((int)lllllllIllIlIIl) ? 1 : 0) || k.lllI(aK.get((int)lllllllIllIlIIl), lllllllIllIlIII)) {
                if (k.lIll(aK.containsKey((int)lllllllIllIlIIl) ? 1 : 0)) {
                    System.out.println((int)lllllllIllIlIIl + " - Old Value: " + String.valueOf(aK.get((int)lllllllIllIlIIl)) + ", Current Value: " + lllllllIllIlIII);

                    }
                } else {
                    System.out.println((int)lllllllIllIlIIl + ": " + lllllllIllIlIII);
                }
                aK.put((int)lllllllIllIlIIl, lllllllIllIlIII);

                lllllllIllIllIl = lI[0];
            }
            ++lllllllIllIlIlI;

            if (((0x88 ^ 0x90) & ~(0x8D ^ 0x95)) >= 0) continue;
            return;
        }
        if (k.lIll(lllllllIllIllIl)) {
            System.out.println(I[lI[100]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(HashMap<Integer, Integer> hashMap, boolean bl, boolean bl2) {
        if (k.lIIIl(Players.getLocal().getWorldLocation().distanceTo(au), lI[3])) {
            int n2;
            Clues.c = I[lI[86]];
            WorldArea worldArea = new WorldArea(lI[87], lI[88], lI[89], lI[15], lI[1]);
            int[] nArray = new int[lI[0]];
            nArray[k.lI[1]] = lI[90];
            int n3 = Inventory.contains((int[])nArray);
            if (k.lIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n2 = lI[0];

                if (3 > 3) {
                    return;
                }
            } else {
                n2 = lI[1];
            }
            if (k.lIll(n3 & n2)) {
                int[] nArray2 = new int[lI[0]];
                nArray2[k.lI[1]] = lI[90];
                Inventory.getFirst((int[])nArray2).interact(I[lI[91]]);
                Time.sleepTicks((int)lI[19]);

            }
            Movement.walkTo((WorldPoint)au);

            Time.sleepTicks((int)lI[0]);

        }
        if (k.lIIlI(Players.getLocal().getWorldLocation().distanceTo(au), lI[3])) {
            HashMap<Integer, Integer> llllllllIIlIIII;
            void llllllllIIIlllI;
            void llllllllIIIllll;
            if (k.lIIl(Bank.isOpen() ? 1 : 0)) {
                g.G();
            }
            Clues.c = I[lI[92]];
            if (k.lIll((int)llllllllIIIllll) && k.lIIll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks((int)lI[3]);

            }
            if (k.lIll((int)llllllllIIIlllI) && k.lIIll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks((int)lI[2]);

            }
            Iterator<Map.Entry<Integer, Integer>> llllllllIIIllIl = llllllllIIlIIII.entrySet().iterator();
            while (k.lIll(llllllllIIIllIl.hasNext() ? 1 : 0)) {
                Map.Entry<Integer, Integer> llllllllIIIllII = llllllllIIIllIl.next();
                int llllllllIIIlIll = llllllllIIIllII.getKey();
                int llllllllIIIlIlI = llllllllIIIllII.getValue();
                System.out.println("Key: " + llllllllIIIlIll + ", Value: " + llllllllIIIlIlI);
                g.a(llllllllIIIlIll, llllllllIIIlIlI);
                Time.sleepTicks((int)lI[0]);

                return;
            }
        }
    }

    private static boolean lIll(int n2) {
        return n2 != 0;
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[lI[0]];
        objectArray[k.lI[1]] = lI[2];
        String string = String.format(I[lI[1]], objectArray);
        Object[] objectArray2 = new Object[lI[0]];
        objectArray2[k.lI[1]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[lI[0]];
        objectArray3[k.lI[1]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[lI[0]];
        objectArray4[k.lI[1]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    public static void an() {
        block9: {
            int lllllllllIlIlll = lI[1];
            do {
                String[] stringArray = new String[lI[0]];
                stringArray[k.lI[1]] = I[lI[41]];
                if (!k.lIIII(TileObjects.getNearest((String[])stringArray)) || !k.lIIl(Clues.d ? 1 : 0)) break block9;
                Clues.c = I[lI[42]];
                String[] stringArray2 = new String[lI[0]];
                stringArray2[k.lI[1]] = I[lI[5]];
                NPC lllllllllIlIllI = NPCs.getNearest((String[])stringArray2);
                if (k.lIIl(lllllllllIlIlll)) {
                    if (k.lIIl(Dialog.isOpen() ? 1 : 0)) {
                        lllllllllIlIllI.interact(I[lI[43]]);
                    }
                    if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
                        List lllllllllIlIlIl;
                        if (k.lIIl(Dialog.canContinueNPC() ? 1 : 0) && k.lIIl(Dialog.canContinue() ? 1 : 0) && k.lIIl((lllllllllIlIlIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List lllllllllIlIlII = lllllllllIlIlIl.stream().filter(widget -> {
                                boolean bl;
                                if (k.lIIl(widget.getText().contains(I[lI[166]]) ? 1 : 0)) {
                                    bl = lI[0];

                                    if (-1 < -1) {
                                        return false;
                                    }
                                } else {
                                    bl = lI[1];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (k.lIIl(lllllllllIlIlII.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllIlIlII.get(lI[1])).getClickPoint().getX(), (int)((Widget)lllllllllIlIlII.get(lI[1])).getClickPoint().getY(), (boolean)lI[0]);
                                Time.sleepTicks((int)lI[6]);

                            }
                            if (k.lIlI(lllllllllIlIlII.size(), lI[0])) {
                                lllllllllIlIlll = lI[0];
                            }
                        }
                        if (!k.lIIl(Dialog.canContinueNPC() ? 1 : 0) || k.lIll(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (k.lIll(lllllllllIlIlll)) {
                    String[] stringArray3 = new String[lI[0]];
                    stringArray3[k.lI[1]] = I[lI[44]];
                    TileObjects.getNearest((String[])stringArray3).interact(I[lI[39]]);
                    Time.sleepTicks((int)lI[13]);

                }
                Time.sleepTicks((int)lI[0]);

            } while (2 >= 2);
            return;
        }
    }

    public static void a(LocalPoint localPoint) {
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (k.llll(player)) {
            return;
        }
        LocalPoint localPoint2 = localPoint;
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)client, (LocalPoint)localPoint2);
        Movement.walkTo((WorldPoint)worldPoint);

        Time.sleepTicks((int)lI[0]);

    }

    public static boolean c(int[] nArray) {
        int[] lllllllllllIlll;
        int lllllllllllIllI = lI[1];
        while (k.llIl(lllllllllllIllI, lllllllllllIlll.length)) {
            if (k.lIIl(lllllllllllIlll[lllllllllllIllI])) {

                if (((0x63 ^ 1) & ~(0x6B ^ 9)) >= 1) {
                    return false;
                }
            } else if (k.lIIl(k.g(lllllllllllIlll[lllllllllllIllI]) ? 1 : 0)) {
                System.out.println("Missing ID: " + lllllllllllIlll[lllllllllllIllI]);
                return lI[1];
            }
            ++lllllllllllIllI;

            if ((0x91 ^ 0xBA ^ (0xBE ^ 0x91)) >= 0) continue;
            return ((0x51 ^ 0x49 ^ (0x5E ^ 0xC)) & (0x6F ^ 0x5D ^ (0x39 ^ 0x41) ^ -1)) != 0;
        }
        return lI[0];
    }

    private static boolean lIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void lllllllllIIIIlI;
        void lllllllllIIIIll;
        void lllllllllIIIlII;
        WorldPoint worldPoint2 = new WorldPoint(lI[65], lI[66], lI[1]);
        WorldArea worldArea = new WorldArea(lI[67], lI[68], lI[20], lI[47], lI[1]);
        WorldArea worldArea2 = new WorldArea(lI[69], lI[70], lI[71], lI[72], lI[1]);
        if (k.lIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lI[17]) && k.lIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lI[73], lI[74], lI[0])), lI[16])) {
            Clues.c = I[lI[75]];
            if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)lllllllllIIIlII);

            Time.sleepTicks((int)lI[0]);

        }
        if (k.lIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllIIIlII), lI[17]) && k.lIIlI(Players.getLocal().getWorldLocation().getY(), lI[66])) {
            if (k.lIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lI[0]];
                stringArray[k.lI[1]] = I[lI[76]];
                TileObjects.getNearest((String[])stringArray).interact(I[lI[77]]);
                Time.sleepTicks((int)lI[2]);

            }
            if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lI[0]];
                stringArray[k.lI[1]] = I[lI[78]];
                n.c(stringArray);
            }
        }
        if (k.lIIIl(Players.getLocal().getWorldLocation().getY(), lI[66]) && (!k.lIIl(lllllllllIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.lIIl(lllllllllIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || k.lIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lI[73], lI[74], lI[0])), lI[16]))) {
            WorldPoint lllllllllIIIlIl;
            Clues.c = I[lI[79]];
            if (k.lIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lI[65], lI[80], lI[1])) ? 1 : 0)) {
                k.c(new WorldPoint(lI[65], lI[81], lI[1]));
                Time.sleepTicks((int)lI[17]);

            }
            Movement.walkTo((WorldPoint)lllllllllIIIlIl);

            Time.sleepTicks((int)lI[0]);

        }
    }

    public static void af() {
        if (k.lIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)lI[3]);

        }
        if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (k.lIIl(Bank.isOpen() ? 1 : 0)) {
            k.i(k.ad());
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String[] stringArray) {
        String[] lllllllIlllllll;
        int n2 = stringArray.length;
        int n3 = lI[1];
        int lllllllIlllllII = lI[1];
        while (k.llIl(lllllllIlllllII, lllllllIlllllll.length)) {
            void lllllllIllllllI;
            void lllllllIlllllIl;
            block6: {
                block5: {
                    String[] stringArray2 = new String[lI[0]];
                    stringArray2[k.lI[1]] = lllllllIlllllll[lllllllIlllllII];
                    if (!k.lIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block5;
                    String[] stringArray3 = new String[lI[0]];
                    stringArray3[k.lI[1]] = lllllllIlllllll[lllllllIlllllII];
                    if (!k.lIll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block6;
                }
                ++lllllllIlllllIl;
            }
            if (k.lIlI((int)lllllllIlllllIl, (int)lllllllIllllllI)) {
                return lI[0];
            }
            ++lllllllIlllllII;

            if (-1 <= 0) continue;
            return ((0xA1 ^ 0xAB ^ 3) & (0xF ^ 0x4B ^ (0x19 ^ 0x54) ^ -1)) != 0;
        }
        return lI[1];
    }

    private static boolean llIII(Object object, Object object2) {
        return object == object2;
    }

    public static void a(WorldPoint worldPoint) {
        WorldPoint lllllllllIlIIII;
        if (k.lIIl(ay.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIIIl(Players.getLocal().getWorldLocation().distanceTo(ax), lI[6])) {
                Clues.c = I[lI[45]];
                Movement.walkTo((WorldPoint)ax);

                Time.sleepTicks((int)lI[0]);

            }
            if (k.lIIlI(Players.getLocal().getWorldLocation().distanceTo(ax), lI[6])) {
                Clues.c = I[lI[46]];
                if (k.lIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (k.lIIII(lllllllllIlIIII = NPCs.getNearest(nPC -> {
                    String[] stringArray = new String[lI[0]];
                    stringArray[k.lI[1]] = I[lI[165]];
                    return nPC.hasAction(stringArray);
                }))) {
                    String[] stringArray = new String[lI[0]];
                    stringArray[k.lI[1]] = I[lI[47]];
                    if (k.lIll(lllllllllIlIIII.hasAction(stringArray) ? 1 : 0)) {
                        lllllllllIlIIII.interact(I[lI[48]]);
                        Time.sleepTicks((int)lI[6]);

                    }
                    String[] stringArray2 = new String[lI[0]];
                    stringArray2[k.lI[1]] = I[lI[49]];
                    if (k.lIIl(lllllllllIlIIII.hasAction(stringArray2) ? 1 : 0)) {
                        String[] stringArray3 = new String[lI[6]];
                        stringArray3[k.lI[1]] = I[lI[31]];
                        stringArray3[k.lI[0]] = I[lI[15]];
                        stringArray3[k.lI[2]] = I[lI[18]];
                        n.b(I[lI[30]], stringArray3);
                        Time.sleepTicks((int)lI[0]);

                    }
                }
            }
        }
        if (k.lIll(ay.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllllllIlIIIl;
            lllllllllIlIIII = new WorldPoint(lI[50], lI[51], lI[1]);
            if (k.lIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllIlIIII) ? 1 : 0)) {
                k.c(new WorldPoint(lI[52], lI[53], lI[1]));
                Time.sleepTicks((int)k.c(lI[13], lI[17]));

            }
            Movement.walkTo((WorldPoint)lllllllllIlIIIl);

            Time.sleepTicks((int)lI[0]);

        }
    }

    public static void d(int[] nArray) {
        int[] lllllllllIIlIll;
        int lllllllllIIlIlI = lI[1];
        while (k.llIl(lllllllllIIlIlI, lllllllllIIlIll.length)) {
            if (k.lIIl(lllllllllIIlIll[lllllllllIIlIlI])) {

            } else {
                Time.sleepTicks((int)lI[0]);

                k.j(lllllllllIIlIll[lllllllllIIlIlI]);
                Time.sleep((long)k.c(lI[63], lI[64]));

            }
            ++lllllllllIIlIlI;

            if (1 == 1) continue;
            return;
        }
        Time.sleepTicks((int)k.c(lI[0], lI[6]));

    }

    public static void ao() {
        net.runelite.api.World world2 = Worlds.getRandom(world -> {
            int n2;
            if (k.lIll(world.isMembers() ? 1 : 0) && k.lIIlI(world.getPlayerCount(), lI[153]) && k.lllI(world.getId(), Worlds.getCurrentId()) && k.lIIl(world.getActivity().endsWith(I[lI[154]]) ? 1 : 0) && k.lIIl(world.getActivity().endsWith(I[lI[155]]) ? 1 : 0) && k.lIIl(world.getActivity().startsWith(I[lI[156]]) ? 1 : 0) && k.lIIl(world.getActivity().startsWith(I[lI[157]]) ? 1 : 0) && k.lllI(world.getId(), lI[158]) && k.lllI(world.getId(), lI[159]) && k.lllI(world.getId(), lI[159]) && k.lIIl(world.getActivity().contains(I[lI[135]]) ? 1 : 0) && k.lIIl(world.getActivity().contains(I[lI[101]]) ? 1 : 0) && k.lIIl(world.getActivity().contains(I[lI[85]]) ? 1 : 0) && k.lIIl(world.getActivity().startsWith(I[lI[160]]) ? 1 : 0) && k.lIIl(world.getActivity().endsWith(I[lI[161]]) ? 1 : 0) && k.lIIl(world.getActivity().endsWith(I[lI[162]]) ? 1 : 0) && k.lIIl(world.getActivity().endsWith(I[lI[163]]) ? 1 : 0) && k.lIIl(world.getActivity().startsWith(I[lI[164]]) ? 1 : 0) && k.lIIIl(world.getPlayerCount(), lI[135])) {
                n2 = lI[0];

                }
            } else {
                n2 = lI[1];
            }
            return n2 != 0;
        });
        Worlds.hopTo((net.runelite.api.World)world2);
    }

    static {
        k.lIII();
        k.llI();
        ao = lI[173];
        aq = lI[174];
        ar = lI[175];
        ak = I[lI[176]];
        as = lI[102];
        ap = lI[104];
        al = ThreadLocalRandom.current();
        am = System.currentTimeMillis();
        an = System.nanoTime();
        int[] nArray = new int[lI[13]];
        nArray[k.lI[1]] = lI[173];
        nArray[k.lI[0]] = lI[104];
        nArray[k.lI[2]] = lI[174];
        nArray[k.lI[6]] = lI[175];
        nArray[k.lI[3]] = lI[102];
        at = nArray;
        au = new WorldPoint(lI[177], lI[178], lI[1]);
        av = new WorldArea(lI[179], lI[180], lI[181], lI[182], lI[1]);
        int[] nArray2 = new int[lI[164]];
        nArray2[k.lI[1]] = lI[183];
        nArray2[k.lI[0]] = lI[184];
        nArray2[k.lI[2]] = lI[185];
        nArray2[k.lI[6]] = lI[186];
        nArray2[k.lI[3]] = lI[187];
        nArray2[k.lI[13]] = lI[188];
        nArray2[k.lI[17]] = lI[189];
        nArray2[k.lI[12]] = lI[190];
        nArray2[k.lI[19]] = lI[191];
        nArray2[k.lI[20]] = lI[192];
        nArray2[k.lI[22]] = lI[193];
        nArray2[k.lI[23]] = lI[194];
        nArray2[k.lI[24]] = lI[195];
        nArray2[k.lI[25]] = lI[196];
        nArray2[k.lI[26]] = lI[197];
        nArray2[k.lI[27]] = lI[198];
        nArray2[k.lI[28]] = lI[199];
        nArray2[k.lI[29]] = lI[200];
        nArray2[k.lI[21]] = lI[201];
        nArray2[k.lI[14]] = lI[202];
        nArray2[k.lI[16]] = lI[203];
        nArray2[k.lI[32]] = lI[204];
        nArray2[k.lI[34]] = lI[205];
        nArray2[k.lI[11]] = lI[206];
        nArray2[k.lI[36]] = lI[207];
        nArray2[k.lI[37]] = lI[208];
        nArray2[k.lI[40]] = lI[209];
        nArray2[k.lI[41]] = lI[210];
        nArray2[k.lI[42]] = lI[211];
        nArray2[k.lI[5]] = lI[212];
        nArray2[k.lI[43]] = lI[213];
        nArray2[k.lI[44]] = lI[214];
        nArray2[k.lI[39]] = lI[215];
        nArray2[k.lI[45]] = lI[216];
        nArray2[k.lI[46]] = lI[217];
        nArray2[k.lI[47]] = lI[218];
        nArray2[k.lI[48]] = lI[219];
        nArray2[k.lI[49]] = lI[220];
        nArray2[k.lI[30]] = lI[221];
        nArray2[k.lI[31]] = lI[222];
        nArray2[k.lI[15]] = lI[223];
        nArray2[k.lI[18]] = lI[224];
        nArray2[k.lI[54]] = lI[225];
        nArray2[k.lI[55]] = lI[226];
        nArray2[k.lI[56]] = lI[227];
        nArray2[k.lI[57]] = lI[228];
        nArray2[k.lI[58]] = lI[229];
        nArray2[k.lI[59]] = lI[230];
        nArray2[k.lI[60]] = lI[231];
        nArray2[k.lI[62]] = lI[232];
        nArray2[k.lI[75]] = lI[233];
        nArray2[k.lI[76]] = lI[234];
        nArray2[k.lI[77]] = lI[235];
        nArray2[k.lI[78]] = lI[236];
        nArray2[k.lI[79]] = lI[237];
        nArray2[k.lI[35]] = lI[238];
        nArray2[k.lI[82]] = lI[239];
        nArray2[k.lI[83]] = lI[240];
        nArray2[k.lI[86]] = lI[241];
        nArray2[k.lI[91]] = lI[242];
        nArray2[k.lI[92]] = lI[243];
        nArray2[k.lI[89]] = lI[244];
        nArray2[k.lI[95]] = lI[245];
        nArray2[k.lI[98]] = lI[246];
        nArray2[k.lI[100]] = lI[247];
        nArray2[k.lI[105]] = lI[248];
        nArray2[k.lI[106]] = lI[137];
        nArray2[k.lI[107]] = lI[249];
        nArray2[k.lI[111]] = lI[250];
        nArray2[k.lI[113]] = lI[251];
        nArray2[k.lI[115]] = lI[8];
        nArray2[k.lI[71]] = lI[252];
        nArray2[k.lI[9]] = lI[253];
        nArray2[k.lI[119]] = lI[254];
        nArray2[k.lI[122]] = lI[255];
        nArray2[k.lI[123]] = lI[256];
        nArray2[k.lI[124]] = lI[257];
        nArray2[k.lI[125]] = lI[258];
        nArray2[k.lI[126]] = lI[259];
        nArray2[k.lI[127]] = lI[260];
        nArray2[k.lI[130]] = lI[261];
        nArray2[k.lI[136]] = lI[262];
        nArray2[k.lI[138]] = lI[263];
        nArray2[k.lI[139]] = lI[264];
        nArray2[k.lI[140]] = lI[265];
        nArray2[k.lI[141]] = lI[266];
        nArray2[k.lI[144]] = lI[267];
        nArray2[k.lI[145]] = lI[268];
        nArray2[k.lI[146]] = lI[269];
        nArray2[k.lI[147]] = lI[270];
        nArray2[k.lI[148]] = lI[271];
        nArray2[k.lI[149]] = lI[272];
        nArray2[k.lI[150]] = lI[273];
        nArray2[k.lI[151]] = lI[274];
        nArray2[k.lI[152]] = lI[275];
        nArray2[k.lI[128]] = lI[276];
        nArray2[k.lI[154]] = lI[277];
        nArray2[k.lI[155]] = lI[278];
        nArray2[k.lI[156]] = lI[279];
        nArray2[k.lI[157]] = lI[280];
        nArray2[k.lI[135]] = lI[281];
        nArray2[k.lI[101]] = lI[282];
        nArray2[k.lI[85]] = lI[283];
        nArray2[k.lI[160]] = lI[284];
        nArray2[k.lI[161]] = lI[285];
        nArray2[k.lI[162]] = lI[286];
        nArray2[k.lI[163]] = lI[287];
        aw = nArray2;
        ax = new WorldPoint(lI[288], lI[289], lI[1]);
        ay = new WorldArea(lI[290], lI[68], lI[291], lI[292], lI[1]);
        aA = k.c(lI[133], lI[134]);
        aB = k.c(lI[123], lI[293]);
        aI = System.currentTimeMillis();
        aJ = k.c(lI[0], lI[135]);
        aK = new HashMap<Integer, Integer>();
    }

    private static boolean lIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void ax() {
        if (k.lIlll(k.lIllI(System.currentTimeMillis(), aI + (long)aA)) && k.lIIl(k.ay() ? 1 : 0)) {
            void lllllllIlIlIIlI;
            int n2 = k.c(lI[0], lI[6]);
            if (k.lIlI(n2, lI[0])) {
                aB = k.c(lI[46], lI[76]);
                Clues.c = I[lI[126]];
                Time.sleepTicks((int)aB);

            }
            if (k.lIlI((int)lllllllIlIlIIlI, lI[2])) {
                Clues.c = I[lI[127]];
                aB = k.c(lI[128], lI[129]);
                Time.sleepTicks((int)aB);

            }
            if (k.lIlI((int)lllllllIlIlIIlI, lI[6])) {
                Clues.c = I[lI[130]];
                aB = k.c(lI[131], lI[132]);
                Time.sleepTicks((int)aB);

            }
            aI = System.currentTimeMillis();
            aA = k.c(lI[133], lI[134]);
            aJ = k.c(lI[0], lI[135]);
        }
    }

    private static boolean lIIll(int n2) {
        return n2 > 0;
    }

    public static boolean ah() {
        boolean bl;
        if (!k.lIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[172]))) || !k.lIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[171]))) || !k.lIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[168]))) || k.lllI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lI[169])), lI[7])) {
            bl = lI[0];

            if (1 >= (10 + 16 - -52 + 98 ^ 119 + 118 - 132 + 75)) {
                return false;
            }
        } else {
            bl = lI[1];
        }
        return bl;
    }

    public static void at() {
        if (k.lIIl(Widgets.get((int)lI[99]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)lI[99], (int)lI[28]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lI[0]);
            Time.sleepTicks((int)lI[6]);

        }
    }

        return String.valueOf(lllllllIIIlllIl);
    }

    public static boolean az() {
        if (k.llIII(Quests.getState((Quest)Quest.ALFRED_GRIMHANDS_BARCRAWL), QuestState.FINISHED)) {
            return lI[0];
        }
        return lI[1];
    }

    public static void am() {
        Widget widget = Widgets.get((int)lI[38], (int)lI[39]);
        if (k.lIIII(widget)) {
            widget.interact(I[lI[40]]);
            Time.sleepTicks((int)lI[0]);

        }
    }

    public static String f(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    public static boolean g(int n2) {
        int[] nArray = new int[lI[0]];
        nArray[k.lI[1]] = n2;
        return Bank.contains((int[])nArray);
    }

    public static boolean as() {
        Time.sleepTicks((int)lI[3]);

        if (k.lIIl(Tabs.isOpen((Tab)Tab.QUESTS) ? 1 : 0)) {
            Tabs.open((Tab)Tab.QUESTS);
            Time.sleepTicks((int)lI[6]);

        }
        if (k.lIll(Tabs.isOpen((Tab)Tab.QUESTS) ? 1 : 0)) {
            Time.sleepTicks((int)lI[2]);

            Widget llllllllIIIIlII = Widgets.get((int)lI[96], (int)lI[12]).getChild(lI[11]);
            if (k.lIIII(llllllllIIIIlII) && k.lIlI(llllllllIIIIlII.getTextColor(), lI[97])) {
                System.out.println(I[lI[98]]);
                return lI[0];
            }
        }
        return lI[1];
    }
}

