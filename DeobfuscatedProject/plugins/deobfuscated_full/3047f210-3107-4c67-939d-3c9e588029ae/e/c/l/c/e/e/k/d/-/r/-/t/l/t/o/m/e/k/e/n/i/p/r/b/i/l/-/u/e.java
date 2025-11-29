/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.util.WorldUtil
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
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
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.World;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.WorldResult;
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

public class e {
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

    private static boolean llIIlIllIllII(int n2, int n3) {
        return n2 != n3;
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    private static String llIIlIlIllIII(String var53, String var9) {
        try {
            SecretKeySpec var37 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), llllIIIIIl[20]), "DES");
            Cipher var42 = Cipher.getInstance("DES");
            var42.init(llllIIIIIl[2], var37);
            return new String(var42.doFinal(Base64.getDecoder().decode(var53.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var54) {
            var54.printStackTrace();
            return null;
        }
    }

    private static void llIIlIllIIlIl() {
        lllIllllll = new String[llllIIIIIl[128]];
        e.lllIllllll[e.llllIIIIIl[1]] = e."%%0%dd";
        e.lllIllllll[e.llllIIIIIl[0]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
        e.lllIllllll[e.llllIIIIIl[2]] = e."line.separator";
        e.lllIllllll[e.llllIIIIIl[6]] = e."Close";
        e.lllIllllll[e.llllIIIIIl[3]] = e."Select Warnings";
        e.lllIllllll[e.llllIIIIIl[14]] = e."Toggle";
        e.lllIllllll[e.llllIIIIIl[17]] = e."Toggle";
        e.lllIllllll[e.llllIIIIIl[9]] = e."Close";
        e.lllIllllll[e.llllIIIIIl[20]] = e."All Settings";
        e.lllIllllll[e.llllIIIIIl[21]] = e."Wear";
        e.lllIllllll[e.llllIIIIIl[22]] = e."Wear";
        e.lllIllllll[e.llllIIIIIl[23]] = e."Wield";
        e.lllIllllll[e.llllIIIIIl[24]] = e."Wield";
        e.lllIllllll[e.llllIIIIIl[25]] = e."Equip";
        e.lllIllllll[e.llllIIIIIl[26]] = e."Equip";
        e.lllIllllll[e.llllIIIIIl[28]] = e."Give me a PK skull.";
        e.lllIllllll[e.llllIIIIIl[40]] = e."Nav to outside gate";
        e.lllIllllll[e.llllIIIIIl[41]] = e."Gate";
        e.lllIllllll[e.llllIIIIIl[42]] = e."Open";
        e.lllIllllll[e.llllIIIIIl[11]] = e."Sorry, I'm a bit busy.";
        e.lllIllllll[e.llllIIIIIl[13]] = e."Nav to stronghold tile";
        e.lllIllllll[e.llllIIIIIl[45]] = e."POST";
        e.lllIllllll[e.llllIIIIIl[46]] = e."Content-Type";
        e.lllIllllll[e.llllIIIIIl[8]] = e."application/json";
        e.lllIllllll[e.llllIIIIIl[51]] = e."Auto retaliate";
        e.lllIllllll[e.llllIIIIIl[52]] = e."Auto retaliate";
        e.lllIllllll[e.llllIIIIIl[53]] = e."Death's Coffer";
        e.lllIllllll[e.llllIIIIIl[54]] = e."Handling death";
        e.lllIllllll[e.llllIIIIIl[55]] = e."Death";
        e.lllIllllll[e.llllIIIIIl[5]] = e."Talk-to";
        e.lllIllllll[e.llllIIIIIl[50]] = e."Portal";
        e.lllIllllll[e.llllIIIIIl[56]] = e."Use";
        e.lllIllllll[e.llllIIIIIl[19]] = e."<str>";
        e.lllIllllll[e.llllIIIIIl[61]] = e."total";
        e.lllIllllll[e.llllIIIIIl[62]] = e."PvP";
        e.lllIllllll[e.llllIIIIIl[33]] = e."PvP";
        e.lllIllllll[e.llllIIIIIl[63]] = e."High";
        e.lllIllllll[e.llllIIIIIl[66]] = e."Leagues";
        e.lllIllllll[e.llllIIIIIl[67]] = e."Beta";
        e.lllIllllll[e.llllIIIIIl[68]] = e."beta";
        e.lllIllllll[e.llllIIIIIl[12]] = e."Deadman";
        e.lllIllllll[e.llllIIIIIl[16]] = e."Deadman";
        e.lllIllllll[e.llllIIIIIl[69]] = e."Speedrunning";
        e.lllIllllll[e.llllIIIIIl[70]] = e."total";
        e.lllIllllll[e.llllIIIIIl[71]] = e."Beta";
        e.lllIllllll[e.llllIIIIIl[73]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    }

    public static void C() {
        if (e.llIIlIllIIlll(e.j(llllIIIIIl[48]))) {
            Widget var27;
            if (e.llIIlIllIIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)llllIIIIIl[0]);
                0;
            }
            if (e.llIIlIllIlIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIIlIllIlllI(var27 = Widgets.get((int)llllIIIIIl[49], (int)llllIIIIIl[50]))) {
                var27.interact(lllIllllll[llllIIIIIl[51]]);
                Time.sleepTicks((int)llllIIIIIl[0]);
                0;
            }
        }
    }

    private static boolean llIIlIllIlIlI(int n2) {
        return n2 < 0;
    }

    private static boolean llIIlIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public static void A() {
        Widget widget = Widgets.get((int)llllIIIIIl[18], (int)llllIIIIIl[19]);
        if (e.llIIlIllIlllI(widget)) {
            widget.interact(lllIllllll[llllIIIIIl[20]]);
            Time.sleepTicks((int)llllIIIIIl[0]);
            0;
        }
    }

    public static void B() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.llIIlIllIlIIl(world.isMembers() ? 1 : 0) && e.llIIlIlllIIII(world.getPlayerCount(), llllIIIIIl[60]) && e.llIIlIllIllII(world.getId(), Worlds.getCurrentId()) && e.llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[61]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[62]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[33]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[63]]) ? 1 : 0) && e.llIIlIllIllII(world.getId(), llllIIIIIl[64]) && e.llIIlIllIllII(world.getId(), llllIIIIIl[65]) && e.llIIlIllIllII(world.getId(), llllIIIIIl[65]) && e.llIIlIllIIlll(world.getActivity().contains(lllIllllll[llllIIIIIl[66]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().contains(lllIllllll[llllIIIIIl[67]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().contains(lllIllllll[llllIIIIIl[68]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[12]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[16]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[69]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().endsWith(lllIllllll[llllIIIIIl[70]]) ? 1 : 0) && e.llIIlIllIIlll(world.getActivity().startsWith(lllIllllll[llllIIIIIl[71]]) ? 1 : 0) && e.llIIlIllIllll(world.getPlayerCount(), llllIIIIIl[72])) {
                n2 = llllIIIIIl[0];
                0;
                if (-(0xBF ^ 0xBA) >= 0) {
                    return false;
                }
            } else {
                n2 = llllIIIIIl[1];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }

    private static boolean llIIlIllIIlll(int n2) {
        return n2 == 0;
    }

    public static void E() {
        block9: {
            int var10 = llllIIIIIl[1];
            do {
                String[] stringArray = new String[llllIIIIIl[0]];
                stringArray[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[53]];
                if (!e.llIIlIllIlllI(TileObjects.getNearest((String[])stringArray)) || !e.llIIlIllIIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block9;
                AccBuilderTempleTrek.c = lllIllllll[llllIIIIIl[54]];
                String[] stringArray2 = new String[llllIIIIIl[0]];
                stringArray2[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[55]];
                NPC var51 = NPCs.getNearest((String[])stringArray2);
                if (e.llIIlIllIIlll(var10)) {
                    if (e.llIIlIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                        var51.interact(lllIllllll[llllIIIIIl[5]]);
                    }
                    if (e.llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        List var11;
                        if (e.llIIlIllIIlll(Dialog.canContinueNPC() ? 1 : 0) && e.llIIlIllIIlll(Dialog.canContinue() ? 1 : 0) && e.llIIlIllIIlll((var11 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List var34 = var11.stream().filter(widget -> {
                                boolean bl;
                                if (e.llIIlIllIIlll(widget.getText().contains(lllIllllll[llllIIIIIl[19]]) ? 1 : 0)) {
                                    bl = llllIIIIIl[0];
                                    0;
                                    if (((0xAE ^ 0xA8) & ~(0xA5 ^ 0xA3)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIIIIl[1];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.llIIlIllIIlll(var34.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)var34.get(llllIIIIIl[1])).getClickPoint().getX(), (int)((Widget)var34.get(llllIIIIIl[1])).getClickPoint().getY(), (boolean)llllIIIIIl[0]);
                                Time.sleepTicks((int)llllIIIIIl[6]);
                                0;
                            }
                            if (e.llIIlIllIlIII(var34.size(), llllIIIIIl[0])) {
                                var10 = llllIIIIIl[0];
                            }
                        }
                        if (!e.llIIlIllIIlll(Dialog.canContinueNPC() ? 1 : 0) || e.llIIlIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.llIIlIllIlIIl(var10)) {
                    String[] stringArray3 = new String[llllIIIIIl[0]];
                    stringArray3[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[50]];
                    TileObjects.getNearest((String[])stringArray3).interact(lllIllllll[llllIIIIIl[56]]);
                    Time.sleepTicks((int)llllIIIIIl[14]);
                    0;
                }
                Time.sleepTicks((int)llllIIIIIl[0]);
                0;
                0;
            } while (1 > 0);
            return;
        }
    }

    private static boolean llIIlIlllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void v() {
        if (e.llIIlIllIlIIl(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)llllIIIIIl[3]);
            0;
        }
        if (e.llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIIlIllIIlll(Bank.isOpen() ? 1 : 0)) {
            e.B();
        }
    }

    private static boolean llIIlIllIlllI(Object object) {
        return object != null;
    }

    public static boolean z() {
        boolean bl;
        if (e.llIIlIllIlllI(Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[0]))) {
            bl = llllIIIIIl[0];
            0;
            if (((0xD ^ 0x2F) & ~(0x64 ^ 0x46) & ~((0xC9 ^ 0x9F) & ~(0x68 ^ 0x3E))) >= (0x14 ^ 0x10)) {
                return (1 & ~1) != 0;
            }
        } else {
            bl = llllIIIIIl[1];
        }
        return bl;
    }

    private static boolean llIIlIllIlIII(int n2, int n3) {
        return n2 == n3;
    }

    public static void y() {
        Widget var31;
        if (e.llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIIlIllIlIIl(e.x() ? 1 : 0)) {
            if (e.llIIlIllIIlll(e.z() ? 1 : 0)) {
                e.A();
            }
            if (e.llIIlIllIlIIl(e.z() ? 1 : 0)) {
                Widget var12;
                Widget var14;
                var31 = Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[8], (int)llllIIIIIl[9]);
                if (e.llIIlIllIlllI(var31)) {
                    var31.interact(lllIllllll[llllIIIIIl[3]]);
                    Time.sleepTicks((int)llllIIIIIl[0]);
                    0;
                }
                if (e.llIIlIllIIlll(Vars.getBit((int)llllIIIIIl[10])) && e.llIIlIllIlllI(var14 = Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[11], (int)llllIIIIIl[12]))) {
                    if (e.llIIlIllIIlll(var14.isVisible() ? 1 : 0)) {
                        var12 = Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[13], (int)llllIIIIIl[14]);
                        Mouse.click((int)var12.getClickPoint().getX(), (int)var12.getClickPoint().getY(), (boolean)llllIIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIIl[0]);
                        0;
                    }
                    if (e.llIIlIllIlIIl(var14.isVisible() ? 1 : 0)) {
                        var14.interact(lllIllllll[llllIIIIIl[14]]);
                        Time.sleepTicks((int)llllIIIIIl[0]);
                        0;
                    }
                }
                if (e.llIIlIllIIlll(Vars.getBit((int)llllIIIIIl[15])) && e.llIIlIllIlllI(var14 = Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[11], (int)llllIIIIIl[16]))) {
                    if (e.llIIlIllIIlll(var14.isVisible() ? 1 : 0)) {
                        var12 = Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[13], (int)llllIIIIIl[14]);
                        Mouse.click((int)var12.getClickPoint().getX(), (int)var12.getClickPoint().getY(), (boolean)llllIIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIIl[0]);
                        0;
                    }
                    if (e.llIIlIllIlIIl(var14.isVisible() ? 1 : 0)) {
                        var14.interact(lllIllllll[llllIIIIIl[17]]);
                        Time.sleepTicks((int)llllIIIIIl[2]);
                        0;
                    }
                }
            }
        }
        if (e.llIIlIllIlllI(var31 = Widgets.get((int)llllIIIIIl[7], (int)llllIIIIIl[3]))) {
            var31.interact(lllIllllll[llllIIIIIl[9]]);
            Time.sleepTicks((int)llllIIIIIl[0]);
            0;
        }
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    public static int t() {
        int n2 = e.c(llllIIIIIl[1], Y.length - llllIIIIIl[0]);
        return Y[n2];
    }

    public static void a(String var47, String var48) {
        try {
            URL var41 = new URL(var47);
            HttpURLConnection var8 = (HttpURLConnection)var41.openConnection();
            var8.setRequestMethod(lllIllllll[llllIIIIIl[45]]);
            var8.setRequestProperty(lllIllllll[llllIIIIIl[46]], lllIllllll[llllIIIIIl[8]]);
            var8.setDoOutput(llllIIIIIl[0]);
            String var38 = "{\"content\": \"" + var48 + "\"}";
            DataOutputStream var1 = new DataOutputStream(var8.getOutputStream());
            var1.writeBytes(var38);
            var1.flush();
            var1.close();
            int var36 = var8.getResponseCode();
            System.out.println("Response Code: " + var36);
            var8.disconnect();
            0;
        }
        catch (Exception var41) {
            var41.printStackTrace();
        }
        if (3 == 0) {
            return;
        }
    }

    private static String llIIlIlIlIllI(String var28, String var3) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var39 = Cipher.getInstance("Blowfish");
            var39.init(llllIIIIIl[2], var15);
            return new String(var39.doFinal(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIllIllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void var43;
        int var30;
        int var23;
        int n4 = n3 - n2;
        if (e.llIIlIllIIlll(n4)) {
            return var23;
        }
        if (e.llIIlIllIlIII(Math.abs(var30), llllIIIIIl[0])) {
            int n5;
            if (e.llIIlIllIlIIl(R.nextBoolean() ? 1 : 0)) {
                n5 = var23;
                0;
                if ((0x6D ^ 0x68) == 0) {
                    return (0x2D ^ 0x32) & ~(0x1D ^ 2);
                }
            } else {
                n5 = var43;
            }
            return n5;
        }
        if (e.llIIlIllIlIlI(var30)) {
            var30 = var23;
            var23 = var43;
            n3 = var30;
        }
        return n2 + R.nextInt(n3 - n2 + llllIIIIIl[0]);
    }

    public static boolean x() {
        boolean bl;
        if (!e.llIIlIllIlIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(llllIIIIIl[10]))) || e.llIIlIllIIlll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(llllIIIIIl[15])))) {
            bl = llllIIIIIl[0];
            0;
            if (-1 == 3) {
                return ((0x92 ^ 0x8A ^ (3 ^ 0x28)) & (0x5F ^ 0x38 ^ (0xFD ^ 0xA9) ^ -1)) != 0;
            }
        } else {
            bl = llllIIIIIl[1];
        }
        return bl;
    }

    public static void D() {
        if (e.llIIlIllIlIII(e.j(llllIIIIIl[48]), llllIIIIIl[0])) {
            Widget var24;
            if (e.llIIlIllIIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)llllIIIIIl[0]);
                0;
            }
            if (e.llIIlIllIlIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIIlIllIlllI(var24 = Widgets.get((int)llllIIIIIl[49], (int)llllIIIIIl[50]))) {
                var24.interact(lllIllllll[llllIIIIIl[52]]);
                Time.sleepTicks((int)llllIIIIIl[0]);
                0;
            }
        }
    }

    public static void w() {
        Widget widget = Widgets.get((int)llllIIIIIl[4], (int)llllIIIIIl[5], (int)llllIIIIIl[1]);
        if (e.llIIlIllIlllI(widget)) {
            widget.interact(lllIllllll[llllIIIIIl[6]]);
            Time.sleepTicks((int)llllIIIIIl[6]);
            0;
        }
    }

    public static double u() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    public static int H() {
        return e.j(llllIIIIIl[59]);
    }

    public static void G() {
        if (e.llIIlIllIIlll(Widgets.get((int)llllIIIIIl[58]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)llllIIIIIl[58], (int)llllIIIIIl[40]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)llllIIIIIl[0]);
            Time.sleepTicks((int)llllIIIIIl[6]);
            0;
        }
    }

    public static long s() {
        return U + (System.nanoTime() - V) / 1000000L;
    }

    private static String llIIlIlIlIlll(String var40, String var32) {
        var40 = new String(Base64.getDecoder().decode(var40.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var35 = var32.toCharArray();
        int var44 = llllIIIIIl[1];
        char[] var19 = var40.toCharArray();
        int var17 = var19.length;
        int var26 = llllIIIIIl[1];
        while (e.llIIlIllIlIll(var26, var17)) {
            char var49 = var19[var26];
            var20.append((char)(var49 ^ var35[var44 % var35.length]));
            0;
            ++var44;
            ++var26;
            0;
            if (((123 + 35 - 35 + 77 ^ 100 + 86 - 182 + 151) & (0xFF ^ 0xC0 ^ (0xE6 ^ 0x8A) ^ -1)) < 1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public static boolean i(int n2) {
        int[] nArray = new int[llllIIIIIl[0]];
        nArray[e.llllIIIIIl[1]] = n2;
        return Bank.contains((int[])nArray);
    }

    public static boolean b(int[] nArray) {
        int[] var21;
        int var29 = llllIIIIIl[1];
        while (e.llIIlIllIlIll(var29, var21.length)) {
            if (e.llIIlIllIIlll(e.i(var21[var29]) ? 1 : 0)) {
                System.out.println("Missing ID: " + var21[var29]);
                return llllIIIIIl[1];
            }
            ++var29;
            0;
            if ((0xFB ^ 0xBE ^ (0x3E ^ 0x7F)) != 0) continue;
            return ((0x60 ^ 0x49 ^ (0x27 ^ 0)) & (0x78 ^ 0x45 ^ (0xB0 ^ 0x83) ^ -1)) != 0;
        }
        return llllIIIIIl[0];
    }

    private static boolean llIIlIllIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        e.llIIlIllIIllI();
        e.llIIlIllIIlIl();
        Q = lllIllllll[llllIIIIIl[73]];
        R = ThreadLocalRandom.current();
        S = new WorldArea(llllIIIIIl[74], llllIIIIIl[75], llllIIIIIl[57], llllIIIIIl[76], llllIIIIIl[1]);
        T = new WorldArea(llllIIIIIl[77], llllIIIIIl[78], llllIIIIIl[8], llllIIIIIl[50], llllIIIIIl[0]);
        U = System.currentTimeMillis();
        V = System.nanoTime();
        W = new HashMap<Integer, Integer>();
        X = new WorldPoint(llllIIIIIl[79], llllIIIIIl[80], llllIIIIIl[1]);
        int[] nArray = new int[llllIIIIIl[81]];
        nArray[e.llllIIIIIl[1]] = llllIIIIIl[82];
        nArray[e.llllIIIIIl[0]] = llllIIIIIl[83];
        nArray[e.llllIIIIIl[2]] = llllIIIIIl[84];
        nArray[e.llllIIIIIl[6]] = llllIIIIIl[85];
        nArray[e.llllIIIIIl[3]] = llllIIIIIl[86];
        nArray[e.llllIIIIIl[14]] = llllIIIIIl[87];
        nArray[e.llllIIIIIl[17]] = llllIIIIIl[88];
        nArray[e.llllIIIIIl[9]] = llllIIIIIl[89];
        nArray[e.llllIIIIIl[20]] = llllIIIIIl[90];
        nArray[e.llllIIIIIl[21]] = llllIIIIIl[91];
        nArray[e.llllIIIIIl[22]] = llllIIIIIl[92];
        nArray[e.llllIIIIIl[23]] = llllIIIIIl[93];
        nArray[e.llllIIIIIl[24]] = llllIIIIIl[94];
        nArray[e.llllIIIIIl[25]] = llllIIIIIl[95];
        nArray[e.llllIIIIIl[26]] = llllIIIIIl[96];
        nArray[e.llllIIIIIl[28]] = llllIIIIIl[97];
        nArray[e.llllIIIIIl[40]] = llllIIIIIl[98];
        nArray[e.llllIIIIIl[41]] = llllIIIIIl[99];
        nArray[e.llllIIIIIl[42]] = llllIIIIIl[100];
        nArray[e.llllIIIIIl[11]] = llllIIIIIl[101];
        nArray[e.llllIIIIIl[13]] = llllIIIIIl[102];
        nArray[e.llllIIIIIl[45]] = llllIIIIIl[103];
        nArray[e.llllIIIIIl[46]] = llllIIIIIl[104];
        nArray[e.llllIIIIIl[8]] = llllIIIIIl[105];
        nArray[e.llllIIIIIl[51]] = llllIIIIIl[106];
        nArray[e.llllIIIIIl[52]] = llllIIIIIl[107];
        nArray[e.llllIIIIIl[53]] = llllIIIIIl[108];
        nArray[e.llllIIIIIl[54]] = llllIIIIIl[109];
        nArray[e.llllIIIIIl[55]] = llllIIIIIl[110];
        nArray[e.llllIIIIIl[5]] = llllIIIIIl[111];
        nArray[e.llllIIIIIl[50]] = llllIIIIIl[112];
        nArray[e.llllIIIIIl[56]] = llllIIIIIl[113];
        nArray[e.llllIIIIIl[19]] = llllIIIIIl[114];
        nArray[e.llllIIIIIl[61]] = llllIIIIIl[115];
        nArray[e.llllIIIIIl[62]] = llllIIIIIl[116];
        nArray[e.llllIIIIIl[33]] = llllIIIIIl[117];
        nArray[e.llllIIIIIl[63]] = llllIIIIIl[118];
        nArray[e.llllIIIIIl[66]] = llllIIIIIl[119];
        nArray[e.llllIIIIIl[67]] = llllIIIIIl[120];
        nArray[e.llllIIIIIl[68]] = llllIIIIIl[121];
        nArray[e.llllIIIIIl[12]] = llllIIIIIl[122];
        nArray[e.llllIIIIIl[16]] = llllIIIIIl[123];
        nArray[e.llllIIIIIl[69]] = llllIIIIIl[124];
        nArray[e.llllIIIIIl[70]] = llllIIIIIl[125];
        nArray[e.llllIIIIIl[71]] = llllIIIIIl[126];
        nArray[e.llllIIIIIl[73]] = llllIIIIIl[127];
        nArray[e.llllIIIIIl[128]] = llllIIIIIl[129];
        nArray[e.llllIIIIIl[130]] = llllIIIIIl[131];
        nArray[e.llllIIIIIl[76]] = llllIIIIIl[132];
        nArray[e.llllIIIIIl[133]] = llllIIIIIl[134];
        nArray[e.llllIIIIIl[57]] = llllIIIIIl[135];
        nArray[e.llllIIIIIl[136]] = llllIIIIIl[137];
        nArray[e.llllIIIIIl[138]] = llllIIIIIl[139];
        nArray[e.llllIIIIIl[140]] = llllIIIIIl[141];
        nArray[e.llllIIIIIl[142]] = llllIIIIIl[143];
        nArray[e.llllIIIIIl[144]] = llllIIIIIl[145];
        nArray[e.llllIIIIIl[146]] = llllIIIIIl[147];
        nArray[e.llllIIIIIl[148]] = llllIIIIIl[149];
        nArray[e.llllIIIIIl[150]] = llllIIIIIl[151];
        nArray[e.llllIIIIIl[152]] = llllIIIIIl[153];
        nArray[e.llllIIIIIl[154]] = llllIIIIIl[155];
        nArray[e.llllIIIIIl[156]] = llllIIIIIl[157];
        nArray[e.llllIIIIIl[158]] = llllIIIIIl[159];
        nArray[e.llllIIIIIl[160]] = llllIIIIIl[161];
        nArray[e.llllIIIIIl[162]] = llllIIIIIl[163];
        nArray[e.llllIIIIIl[164]] = llllIIIIIl[165];
        nArray[e.llllIIIIIl[166]] = llllIIIIIl[167];
        nArray[e.llllIIIIIl[168]] = llllIIIIIl[169];
        nArray[e.llllIIIIIl[170]] = llllIIIIIl[171];
        nArray[e.llllIIIIIl[172]] = llllIIIIIl[173];
        nArray[e.llllIIIIIl[174]] = llllIIIIIl[175];
        nArray[e.llllIIIIIl[36]] = llllIIIIIl[176];
        nArray[e.llllIIIIIl[177]] = llllIIIIIl[178];
        nArray[e.llllIIIIIl[179]] = llllIIIIIl[180];
        nArray[e.llllIIIIIl[181]] = llllIIIIIl[182];
        nArray[e.llllIIIIIl[183]] = llllIIIIIl[184];
        nArray[e.llllIIIIIl[185]] = llllIIIIIl[186];
        nArray[e.llllIIIIIl[187]] = llllIIIIIl[188];
        nArray[e.llllIIIIIl[189]] = llllIIIIIl[190];
        nArray[e.llllIIIIIl[191]] = llllIIIIIl[192];
        nArray[e.llllIIIIIl[193]] = llllIIIIIl[194];
        nArray[e.llllIIIIIl[195]] = llllIIIIIl[196];
        nArray[e.llllIIIIIl[197]] = llllIIIIIl[198];
        nArray[e.llllIIIIIl[199]] = llllIIIIIl[200];
        nArray[e.llllIIIIIl[201]] = llllIIIIIl[202];
        nArray[e.llllIIIIIl[203]] = llllIIIIIl[204];
        nArray[e.llllIIIIIl[205]] = llllIIIIIl[206];
        nArray[e.llllIIIIIl[207]] = llllIIIIIl[208];
        nArray[e.llllIIIIIl[209]] = llllIIIIIl[210];
        nArray[e.llllIIIIIl[211]] = llllIIIIIl[212];
        nArray[e.llllIIIIIl[213]] = llllIIIIIl[214];
        nArray[e.llllIIIIIl[215]] = llllIIIIIl[216];
        nArray[e.llllIIIIIl[217]] = llllIIIIIl[218];
        nArray[e.llllIIIIIl[219]] = llllIIIIIl[220];
        nArray[e.llllIIIIIl[221]] = llllIIIIIl[222];
        nArray[e.llllIIIIIl[223]] = llllIIIIIl[224];
        nArray[e.llllIIIIIl[225]] = llllIIIIIl[226];
        nArray[e.llllIIIIIl[227]] = llllIIIIIl[228];
        nArray[e.llllIIIIIl[229]] = llllIIIIIl[230];
        nArray[e.llllIIIIIl[231]] = llllIIIIIl[232];
        nArray[e.llllIIIIIl[72]] = llllIIIIIl[233];
        nArray[e.llllIIIIIl[59]] = llllIIIIIl[234];
        nArray[e.llllIIIIIl[235]] = llllIIIIIl[236];
        nArray[e.llllIIIIIl[237]] = llllIIIIIl[238];
        nArray[e.llllIIIIIl[239]] = llllIIIIIl[240];
        nArray[e.llllIIIIIl[241]] = llllIIIIIl[242];
        nArray[e.llllIIIIIl[243]] = llllIIIIIl[244];
        Y = nArray;
        Z = new WorldPoint(llllIIIIIl[245], llllIIIIIl[246], llllIIIIIl[2]);
        aa = new WorldArea(llllIIIIIl[247], llllIIIIIl[248], llllIIIIIl[61], llllIIIIIl[46], llllIIIIIl[1]);
    }

    private static void llIIlIllIIllI() {
        llllIIIIIl = new int[249];
        e.llllIIIIIl[0] = 1;
        e.llllIIIIIl[1] = (0x59 ^ 0x44 ^ (0x84 ^ 0xC0)) & (0x7C ^ 0x6F ^ (2 ^ 0x48) ^ -1);
        e.llllIIIIIl[2] = 2;
        e.llllIIIIIl[3] = 0x21 ^ 0x25;
        e.llllIIIIIl[4] = -(0xFFFF8D6F & 0x7FD3) & (0xFFFF8FFB & 0x7FDE);
        e.llllIIIIIl[5] = 0x7F ^ 0x62;
        e.llllIIIIIl[6] = 3;
        e.llllIIIIIl[7] = (0x7E ^ 0x2F) + (0xD ^ 0x52) - (46 + 39 - -52 + 18) + (0xE2 ^ 0x93);
        e.llllIIIIIl[8] = 0x7F ^ 0x68;
        e.llllIIIIIl[9] = 0xFA ^ 0xBB ^ (0x64 ^ 0x22);
        e.llllIIIIIl[10] = 0xFFFFBBFD & 0x7D6E;
        e.llllIIIIIl[11] = 0x1F ^ 0x69 ^ (0xB ^ 0x6E);
        e.llllIIIIIl[12] = 0x30 ^ 0x18;
        e.llllIIIIIl[13] = 35 + 39 - -27 + 70 ^ 16 + 48 - -21 + 106;
        e.llllIIIIIl[14] = 0x9F ^ 0xA2 ^ (0x8D ^ 0xB5);
        e.llllIIIIIl[15] = -(0xFFFFF26B & 0x4F97) & (0xFFFFFB7F & 0x7FEF);
        e.llllIIIIIl[16] = 0x5B ^ 0 ^ (0xC3 ^ 0xB1);
        e.llllIIIIIl[17] = 0x7D ^ 0x7B;
        e.llllIIIIIl[18] = 0x4E ^ 0x3A;
        e.llllIIIIIl[19] = 0x1D ^ 0x3D;
        e.llllIIIIIl[20] = 160 + 121 - 253 + 136 ^ 9 + 50 - -85 + 28;
        e.llllIIIIIl[21] = 0xB ^ 0x6D ^ (0x64 ^ 0xB);
        e.llllIIIIIl[22] = 0xA4 ^ 0xAE;
        e.llllIIIIIl[23] = 0x3A ^ 0x4D ^ (0xA ^ 0x76);
        e.llllIIIIIl[24] = 0xCE ^ 0x82 ^ (0xF6 ^ 0xB6);
        e.llllIIIIIl[25] = 0x50 ^ 0x5D;
        e.llllIIIIIl[26] = 0x24 ^ 0x65 ^ (0x2F ^ 0x60);
        e.llllIIIIIl[27] = 0xFFFFFE1F & 0x59FD;
        e.llllIIIIIl[28] = 0x41 ^ 0x11 ^ (0x3E ^ 0x61);
        e.llllIIIIIl[29] = 0xFFFF89FF & 0x7F9D;
        e.llllIIIIIl[30] = 0xFFFF8F37 & 0x7DFF;
        e.llllIIIIIl[31] = -(0xFFFFE46F & 0x7BB5) & (0xFFFFFBFD & 0x6DBF);
        e.llllIIIIIl[32] = 0xFFFFCF7D & 0x3DBA;
        e.llllIIIIIl[33] = 63 + 76 - 123 + 131 ^ 160 + 86 - 84 + 14;
        e.llllIIIIIl[34] = -(0xFFFFFEBB & 0x234D) & (0xFFFFBB7F & 0x6FFF);
        e.llllIIIIIl[35] = 0xFFFFEDBF & 0x1F7F;
        e.llllIIIIIl[36] = 26 + 64 - -63 + 44 ^ 121 + 128 - 185 + 66;
        e.llllIIIIIl[37] = (0x4C ^ 0x25) + (0x31 ^ 0xA) - (0x45 ^ 0x74) + (0xBB ^ 0xA7);
        e.llllIIIIIl[38] = 0xFFFFABBD & 0x5DDE;
        e.llllIIIIIl[39] = -(0xFFFFF73F & 0x78E7) & (0xFFFFFFFF & 0x7D7F);
        e.llllIIIIIl[40] = 0x14 ^ 0x7A ^ (0x5A ^ 0x24);
        e.llllIIIIIl[41] = 0xAD ^ 0xBC;
        e.llllIIIIIl[42] = 105 + 69 - 110 + 93 ^ 130 + 101 - 115 + 27;
        e.llllIIIIIl[43] = -(0xFFFFEADF & 0x7525) & (0xFFFFEF7D & 0x7DBF);
        e.llllIIIIIl[44] = 0xFFFFADC5 & 0x5F7F;
        e.llllIIIIIl[45] = 0xD7 ^ 0x8F ^ (0xE0 ^ 0xAD);
        e.llllIIIIIl[46] = 0x59 ^ 0x4F;
        e.llllIIIIIl[47] = -1;
        e.llllIIIIIl[48] = 20 + 101 - -40 + 11;
        e.llllIIIIIl[49] = -(0xFFFFBB6F & 0x7D95) & (0xFFFFBFF5 & 0x7B5F);
        e.llllIIIIIl[50] = 0x7F ^ 0x61;
        e.llllIIIIIl[51] = 0x32 ^ 0x2A;
        e.llllIIIIIl[52] = 0x6B ^ 0x72;
        e.llllIIIIIl[53] = 0xE2 ^ 0x82 ^ (0x37 ^ 0x4D);
        e.llllIIIIIl[54] = 106 + 24 - 77 + 137 ^ 98 + 135 - 112 + 44;
        e.llllIIIIIl[55] = 0x59 ^ 0x45;
        e.llllIIIIIl[56] = 0xAC ^ 0xB3;
        e.llllIIIIIl[57] = 0x88 ^ 0xBA;
        e.llllIIIIIl[58] = 68 + 94 - 95 + 86;
        e.llllIIIIIl[59] = 0xF3 ^ 0x96;
        e.llllIIIIIl[60] = -(0xFFFFF17E & 0x4EC3) & (0xFFFFEFFF & 0x57DF);
        e.llllIIIIIl[61] = 8 ^ 0x29;
        e.llllIIIIIl[62] = 0x65 ^ 0x47;
        e.llllIIIIIl[63] = 0xB6 ^ 0x92;
        e.llllIIIIIl[64] = -(0xFFFFBFB5 & 0x7A6F) & (0xFFFFFBFF & 0x3FFE);
        e.llllIIIIIl[65] = -(0xFFFFADE7 & 0x73FB) & (0xFFFFAFFF & 0x73F7);
        e.llllIIIIIl[66] = 0x13 ^ 0x36;
        e.llllIIIIIl[67] = 0xC ^ 0x2A;
        e.llllIIIIIl[68] = 0x91 ^ 0xB6;
        e.llllIIIIIl[69] = 0x2E ^ 4;
        e.llllIIIIIl[70] = 0x74 ^ 0x5F;
        e.llllIIIIIl[71] = 3 ^ (0x62 ^ 0x4D);
        e.llllIIIIIl[72] = 0xC0 ^ 0x93 ^ (0x37 ^ 0);
        e.llllIIIIIl[73] = 0x7A ^ 0x57;
        e.llllIIIIIl[74] = 0xFFFFCFF7 & 0x3C7E;
        e.llllIIIIIl[75] = -(0xFFFFF19B & 0x7E65) & (0xFFFFFE7F & 0x7DFD);
        e.llllIIIIIl[76] = 0x16 ^ 0x26;
        e.llllIIIIIl[77] = 0xFFFFDFFF & 0x2C7E;
        e.llllIIIIIl[78] = -(0xFFFFF77F & 0x3BF4) & (0xFFFFBFFF & 0x7FF7);
        e.llllIIIIIl[79] = -(0xFFFFF7ED & 0x5993) & (0xFFFFDDF1 & 0x7FFE);
        e.llllIIIIIl[80] = -(0xFFFF9AB7 & 0x77D9) & (0xFFFFDFFD & 0x3FFF);
        e.llllIIIIIl[81] = 0x69 ^ 2;
        e.llllIIIIIl[82] = 0xFFFFC35F & 0x3DFA;
        e.llllIIIIIl[83] = -(0xFFFFE4BF & 0x5BC5) & (0xFFFFDBF7 & 0x65BE);
        e.llllIIIIIl[84] = -(0xFFFFFCEF & 0x5F92) & (0xFFFFDDFF & 0x7FB7);
        e.llllIIIIIl[85] = 0xFFFFB560 & 0x4BFF;
        e.llllIIIIIl[86] = 0xFFFFF36B & 0xDF7;
        e.llllIIIIIl[87] = 0xFFFFE9E7 & 0x177C;
        e.llllIIIIIl[88] = 0xFFFF87E7 & 0x797D;
        e.llllIIIIIl[89] = -(0xFFFFFE73 & 0x6F9E) & (0xFFFFFF77 & 0x6FFF);
        e.llllIIIIIl[90] = -(0xFFFFEE1B & 0x77FD) & (0xFFFFE7DE & 0x7FBB);
        e.llllIIIIIl[91] = -(0xFFFFF66D & 0xFF7) & (0xFFFFF7EF & 0xFFF);
        e.llllIIIIIl[92] = -(0xFFFFFE7B & 0x758D) & (0xFFFFFFDE & 0x75FB);
        e.llllIIIIIl[93] = -(0xFFFF9B19 & 0x76F7) & (0xFFFFBFFE & 0x53FF);
        e.llllIIIIIl[94] = -(0xFFFFF883 & 0x5F7D) & (0xFFFFDBEF & 0x7DFF);
        e.llllIIIIIl[95] = 0xFFFFCFF1 & 0x31FE;
        e.llllIIIIIl[96] = -(0xFFFFF98F & 0x6E77) & (0xFFFFEA1F & 0x7FFE);
        e.llllIIIIIl[97] = -(0xFFFFD9EF & 0x3EB4) & (0xFFFFBBBF & 0x5EE7);
        e.llllIIIIIl[98] = 0xFFFFADFB & 0x533E;
        e.llllIIIIIl[99] = 0xFFFF95EB & 0x6BFF;
        e.llllIIIIIl[100] = -(0xFFFFDEBF & 0x37D2) & (0xFFFFB7DF & 0x5FFF);
        e.llllIIIIIl[101] = 0xFFFF8F73 & 0x71EE;
        e.llllIIIIIl[102] = -(0xFFFFDD7F & 0x62A3) & (0xFFFFEFFF & 0x51FF);
        e.llllIIIIIl[103] = -(0xFFFFB2BF & 0x6F52) & (0xFFFFEFFB & 0x3357);
        e.llllIIIIIl[104] = -(0xFFFFF7FF & 0x3CCF) & (0xFFFFBFFF & 0x75FF);
        e.llllIIIIIl[105] = 0xFFFFF93B & 0x7FF;
        e.llllIIIIIl[106] = -(0xFFFFBE5E & 0x7BA7) & (0xFFFFFFF7 & 0x3B7F);
        e.llllIIIIIl[107] = 0xFFFFF97F & 0x7C4;
        e.llllIIIIIl[108] = 0xFFFFC9CF & 0x3775;
        e.llllIIIIIl[109] = 0xFFFFD35B & 0x2DEC;
        e.llllIIIIIl[110] = 0xFFFF8FBD & 0x71FF;
        e.llllIIIIIl[111] = 0xFFFF93F6 & 0x6DD9;
        e.llllIIIIIl[112] = 0xFFFFEFFF & 0x11DE;
        e.llllIIIIIl[113] = -(0xFFFFFE55 & 0x2DBF) & (0xFFFFADFF & 0x7FFE);
        e.llllIIIIIl[114] = 0xFFFFC1FD & 0x3FEE;
        e.llllIIIIIl[115] = 0xFFFFD9FF & 0x27FB;
        e.llllIIIIIl[116] = 0xFFFFAEFF & 0x530A;
        e.llllIIIIIl[117] = 0xFFFFB76B & 0x49DE;
        e.llllIIIIIl[118] = -(0xFFFFEBCF & 0x7E33) & (0xFFFFEFFF & 0x7BD3);
        e.llllIIIIIl[119] = -(0xFFFFF312 & 0x1EED) & (0xFFFFDFFF & 0x33FF);
        e.llllIIIIIl[120] = 0xFFFFBBBF & 0x466F;
        e.llllIIIIIl[121] = -(0xFFFFD3AF & 0x3ED3) & (0xFFFFFFFF & 0x13FB);
        e.llllIIIIIl[122] = 0xFFFFE5CC & 0x1B7F;
        e.llllIIIIIl[123] = 0xFFFF85FF & 0x7BF9;
        e.llllIIIIIl[124] = 0xFFFFA9DB & 0x5775;
        e.llllIIIIIl[125] = 0xFFFFF742 & 0xABF;
        e.llllIIIIIl[126] = 0xFFFF8157 & 0x7FEF;
        e.llllIIIIIl[127] = -(0xFFFFFD17 & 0x3EF8) & (0xFFFFBFFF & 0x7DEF);
        e.llllIIIIIl[128] = 0x48 ^ 0x66;
        e.llllIIIIIl[129] = -(0xFFFFE6F7 & 0x7FAE) & (0xFFFFEFFD & 0x77FF);
        e.llllIIIIIl[130] = 0x35 ^ 0x1A;
        e.llllIIIIIl[131] = -(0xFFFFFFFD & 0x4023) & (0xFFFFE1FF & 0x5FFF);
        e.llllIIIIIl[132] = -(0xFFFFF493 & 0x7F7F) & (0xFFFFFDFF & 0x77FF);
        e.llllIIIIIl[133] = 0x6F ^ 0x4D ^ (0x33 ^ 0x20);
        e.llllIIIIIl[134] = -(0xFFFFF1DD & 0x7EAB) & (0xFFFFF1DE & Short.MAX_VALUE);
        e.llllIIIIIl[135] = 0xFFFFF1FF & 0xFBE;
        e.llllIIIIIl[136] = 0x51 ^ 0x62;
        e.llllIIIIIl[137] = 0xFFFFC7CA & 0x3975;
        e.llllIIIIIl[138] = 0xC1 ^ 0xAF ^ (0x43 ^ 0x19);
        e.llllIIIIIl[139] = -(0xFFFFDB2A & 0x7CF7) & (0xFFFFDF7F & 0x79FF);
        e.llllIIIIIl[140] = 0x5D ^ 0x68;
        e.llllIIIIIl[141] = 0xFFFFF74D & 0x9F3;
        e.llllIIIIIl[142] = 76 + 24 - -42 + 30 ^ 0 + 77 - 19 + 96;
        e.llllIIIIIl[143] = 0xFFFFC357 & 0x3DFD;
        e.llllIIIIIl[144] = 0x7C ^ 0xC ^ (0xF5 ^ 0xB2);
        e.llllIIIIIl[145] = -(0xFFFFF95E & 0x2EA3) & (0xFFFFE9E7 & 0x3FBF);
        e.llllIIIIIl[146] = 0xB2 ^ 0x8A;
        e.llllIIIIIl[147] = -(0xFFFFF739 & 0x3EE7) & (0xFFFFBFEF & 0x77FF);
        e.llllIIIIIl[148] = 0x73 ^ 0x4A;
        e.llllIIIIIl[149] = -(0xFFFFEF9B & 0x5EED) & (0xFFFFDFFF & 0x6FFE);
        e.llllIIIIIl[150] = 0x7C ^ 0x46;
        e.llllIIIIIl[151] = -(0xFFFFFB05 & 0x66FF) & (0xFFFFE7FD & 0x7B7E);
        e.llllIIIIIl[152] = 0x6E ^ 0x55;
        e.llllIIIIIl[153] = -(0xFFFFFAAC & Short.MAX_VALUE) & (0xFFFFFBFF & 0x7FFB);
        e.llllIIIIIl[154] = 163 + 168 - 301 + 141 ^ 19 + 47 - -36 + 49;
        e.llllIIIIIl[155] = -(0xFFFFEFCF & 0x72B7) & (0xFFFFE3FF & 0x7FCF);
        e.llllIIIIIl[156] = 0xFD ^ 0xA8 ^ (0xC9 ^ 0xA1);
        e.llllIIIIIl[157] = -(0xFFFFFF97 & 0x52FD) & (0xFFFFDFDF & 0x73FF);
        e.llllIIIIIl[158] = 0x12 ^ 0x2F ^ 3;
        e.llllIIIIIl[159] = -(0xFFFFE7EF & 0x1AB3) & (0xFFFFF7EF & 0xBFF);
        e.llllIIIIIl[160] = 0x2E ^ 0x11;
        e.llllIIIIIl[161] = 0xFFFFCDBF & 0x3370;
        e.llllIIIIIl[162] = 124 + 122 - 133 + 19 ^ 177 + 148 - 234 + 105;
        e.llllIIIIIl[163] = -(0xFFFFF72D & 0x7ED7) & (0xFFFFFF6E & 0x77FF);
        e.llllIIIIIl[164] = 91 + 71 - 115 + 150 ^ 21 + 9 - 20 + 122;
        e.llllIIIIIl[165] = 0xFFFF9367 & 0x6DDB;
        e.llllIIIIIl[166] = 0xDA ^ 0x98;
        e.llllIIIIIl[167] = 0xFFFF8FB7 & 0x717B;
        e.llllIIIIIl[168] = 0xEC ^ 0xAF;
        e.llllIIIIIl[169] = -(0xFFFFFEDF & 0x77E1) & (0xFFFFF7FF & 0x7FF5);
        e.llllIIIIIl[170] = 0x71 ^ 0x35;
        e.llllIIIIIl[171] = -(0xFFFFBF59 & 0x74EF) & (0xFFFFBFFF & 0x757F);
        e.llllIIIIIl[172] = 0xDC ^ 0x99;
        e.llllIIIIIl[173] = -(0xFFFFEF0B & 0x7CFD) & (0xFFFFFDFF & 0x6F7F);
        e.llllIIIIIl[174] = 135 + 63 - 52 + 56 ^ 89 + 61 - 26 + 16;
        e.llllIIIIIl[175] = -(0xFFFFEE3E & 0x7BC3) & (0xFFFFFB7B & 0x6FFF);
        e.llllIIIIIl[176] = -(0xFFFFDD2F & 0x3EFF) & (0xFFFFBF7F & 0x5EAF);
        e.llllIIIIIl[177] = 0x3C ^ 0x53 ^ (0x77 ^ 0x50);
        e.llllIIIIIl[178] = 0xFFFFDFFF & 0x212F;
        e.llllIIIIIl[179] = 170 + 143 - 165 + 45 ^ 86 + 33 - 27 + 44;
        e.llllIIIIIl[180] = -(0xFFFFAEEE & 0x5757) & (0xFFFFCF7F & 0x37FD);
        e.llllIIIIIl[181] = 0x48 ^ 0x71 ^ (0x18 ^ 0x6B);
        e.llllIIIIIl[182] = -(0xFFFFFEA7 & 0x5F5F) & (0xFFFFFFBF & 0x5F7F);
        e.llllIIIIIl[183] = 0x7B ^ 0x16 ^ (0x94 ^ 0xB2);
        e.llllIIIIIl[184] = 0xFFFF9FFD & 0x613F;
        e.llllIIIIIl[185] = 22 + 133 - 78 + 156 ^ 69 + 13 - -15 + 68;
        e.llllIIIIIl[186] = 0xFFFFC957 & 0x37FB;
        e.llllIIIIIl[187] = 0xD6 ^ 0x9B;
        e.llllIIIIIl[188] = -(0xFFFFE3AB & 0x1EDE) & (0xFFFFB7FF & 0x4BDD);
        e.llllIIIIIl[189] = 0x31 ^ 0x7F;
        e.llllIIIIIl[190] = -(0x4B ^ 0x6A) & (0xFFFFE3FF & 0x1D77);
        e.llllIIIIIl[191] = 0x79 ^ 0x36;
        e.llllIIIIIl[192] = -(0xFFFFF2ED & 0x3DB3) & (0xFFFFF5FB & 0x3BFF);
        e.llllIIIIIl[193] = 0x42 ^ 0x12;
        e.llllIIIIIl[194] = -(0xFFFFD6EF & 0x3FB4) & (0xFFFFDFFF & 0x37FF);
        e.llllIIIIIl[195] = 0xC9 ^ 0x98;
        e.llllIIIIIl[196] = 0xFFFF93FF & 0x6D5F;
        e.llllIIIIIl[197] = 0x71 ^ 0x23;
        e.llllIIIIIl[198] = -(0xFFFFDFF3 & 0x3C9D) & (0xFFFFFDF7 & 0x1FFF);
        e.llllIIIIIl[199] = 50 + 85 - 23 + 107 ^ 97 + 81 - 162 + 120;
        e.llllIIIIIl[200] = -(0xFFFFFC9C & 0x537B) & (0xFFFFD77F & 0x79FF);
        e.llllIIIIIl[201] = 0xE1 ^ 0xA0 ^ (0x42 ^ 0x57);
        e.llllIIIIIl[202] = -(0xFFFFF99D & 0x2E73) & (0xFFFFF9FF & 0x2F7F);
        e.llllIIIIIl[203] = 138 + 192 - 289 + 209 ^ 147 + 140 - 183 + 71;
        e.llllIIIIIl[204] = 0xFFFF8D7A & 0x73F5;
        e.llllIIIIIl[205] = 0xDE ^ 0x88;
        e.llllIIIIIl[206] = 0xFFFFB7FF & 0x49E1;
        e.llllIIIIIl[207] = 0x37 ^ 0x73 ^ (0x34 ^ 0x27);
        e.llllIIIIIl[208] = 0xFFFFFFF3 & 0x1EE;
        e.llllIIIIIl[209] = 119 + 113 - 191 + 152 ^ 112 + 1 - -21 + 19;
        e.llllIIIIIl[210] = -(0xFFFFF72B & 0x18D7) & (0xFFFFD5F7 & 0x3BEE);
        e.llllIIIIIl[211] = 0x4B ^ 0x12;
        e.llllIIIIIl[212] = -(0xFFFFA679 & 0x7D9F) & (0xFFFFB5FD & 0x6FFF);
        e.llllIIIIIl[213] = 230 + 163 - 282 + 142 ^ 0 + 61 - 21 + 127;
        e.llllIIIIIl[214] = -(0xFFFFDDAF & 0x6E5A) & (0xFFFFCDFF & 0x7FEF);
        e.llllIIIIIl[215] = 0x3F ^ 0x64;
        e.llllIIIIIl[216] = 0xFFFFC7E7 & 0x39FF;
        e.llllIIIIIl[217] = 0xF0 ^ 0xAC;
        e.llllIIIIIl[218] = -(0xFFFFDE1E & 0x7FF7) & (0xFFFFFFFD & 0x5FFF);
        e.llllIIIIIl[219] = 0xAF ^ 0xA8 ^ (0xF0 ^ 0xAA);
        e.llllIIIIIl[220] = 0xFFFFFFFB & 0x1ED;
        e.llllIIIIIl[221] = 51 + 63 - 24 + 134 ^ 126 + 161 - 248 + 151;
        e.llllIIIIIl[222] = -(0xFFFFCE9F & 0x7B61) & (0xFFFFDBFE & 0x6FFB);
        e.llllIIIIIl[223] = 18 + 83 - -90 + 55 ^ 49 + 72 - 97 + 145;
        e.llllIIIIIl[224] = 0xFFFFD7FE & 0x29FD;
        e.llllIIIIIl[225] = 0xD4 ^ 0xB4;
        e.llllIIIIIl[226] = -(0xFFFFEE2B & 0x1BD5) & (0xFFFFFBFD & 0xFFF);
        e.llllIIIIIl[227] = 0x83 ^ 0x9A ^ (0xE1 ^ 0x99);
        e.llllIIIIIl[228] = 0xFFFFBFFF & 0x41FE;
        e.llllIIIIIl[229] = 46 + 5 - 43 + 237 ^ 102 + 34 - 77 + 92;
        e.llllIIIIIl[230] = -(0xFFFFFE4B & 0x4DB5) & (0xFFFFEFFF & 0x5DFF);
        e.llllIIIIIl[231] = 54 + 104 - 12 + 84 ^ 15 + 21 - -3 + 94;
        e.llllIIIIIl[232] = 0xFFFFF71D & 0xAE7;
        e.llllIIIIIl[233] = 0xFFFFD3B7 & 0x2E4E;
        e.llllIIIIIl[234] = -(0xFFFFFBBB & 0x2C55) & (0xFFFFFEBF & 0x2B57);
        e.llllIIIIIl[235] = 0xDA ^ 0xBC;
        e.llllIIIIIl[236] = -(0xFFFFDFB7 & 0x357E) & (0xFFFFBFBF & 0x577D);
        e.llllIIIIIl[237] = 0xEF ^ 0x88;
        e.llllIIIIIl[238] = -(0xFFFFBFFF & 0x6CE1) & (0xFFFFBFFB & 0x6EED);
        e.llllIIIIIl[239] = 0xAE ^ 0xC6;
        e.llllIIIIIl[240] = -(0xFFFFA5DF & 0x7E35) & (0xFFFFFF1F & 0x26FF);
        e.llllIIIIIl[241] = 0xA2 ^ 0xC5 ^ (0xAD ^ 0xA3);
        e.llllIIIIIl[242] = -(0xFFFFB9FF & 0x6FE1) & (0xFFFFABEC & Short.MAX_VALUE);
        e.llllIIIIIl[243] = 0xF ^ 0x6F ^ (0xBA ^ 0xB0);
        e.llllIIIIIl[244] = 0xFFFFAA4F & 0x57BD;
        e.llllIIIIIl[245] = 0xFFFFBDAF & 0x4ED8;
        e.llllIIIIIl[246] = 0xFFFFEFBB & 0x1CD7;
        e.llllIIIIIl[247] = 0xFFFFEFED & 0x1B9F;
        e.llllIIIIIl[248] = -(0xFFFFC3B7 & 0x7ED9) & (0xFFFFCF95 & 0x7FFE);
    }

    public static void l(int n2) {
        int[] nArray = new int[llllIIIIIl[0]];
        nArray[e.llllIIIIIl[1]] = n2;
        if (e.llIIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllIIIIIl[0]];
            nArray2[e.llllIIIIIl[1]] = n2;
            if (e.llIIlIllIIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int var7;
                int[] nArray3 = new int[llllIIIIIl[0]];
                nArray3[e.llllIIIIIl[1]] = n2;
                String[] stringArray = new String[llllIIIIIl[0]];
                stringArray[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[21]];
                if (e.llIIlIllIlIIl(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llllIIIIIl[0]];
                    nArray4[e.llllIIIIIl[1]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(lllIllllll[llllIIIIIl[22]]);
                }
                int[] nArray5 = new int[llllIIIIIl[0]];
                nArray5[e.llllIIIIIl[1]] = var7;
                String[] stringArray2 = new String[llllIIIIIl[0]];
                stringArray2[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[23]];
                if (e.llIIlIllIlIIl(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[llllIIIIIl[0]];
                    nArray6[e.llllIIIIIl[1]] = var7;
                    Inventory.getFirst((int[])nArray6).interact(lllIllllll[llllIIIIIl[24]]);
                }
                int[] nArray7 = new int[llllIIIIIl[0]];
                nArray7[e.llllIIIIIl[1]] = var7;
                String[] stringArray3 = new String[llllIIIIIl[0]];
                stringArray3[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[25]];
                if (e.llIIlIllIlIIl(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[llllIIIIIl[0]];
                    nArray8[e.llllIIIIIl[1]] = var7;
                    Inventory.getFirst((int[])nArray8).interact(lllIllllll[llllIIIIIl[26]]);
                }
                if (e.llIIlIllIlIII(var7, llllIIIIIl[27])) {
                    Time.sleepTicks((int)llllIIIIIl[6]);
                    0;
                    String[] stringArray4 = new String[llllIIIIIl[0]];
                    stringArray4[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[28]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)llllIIIIIl[0]);
                    0;
                }
            }
        }
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[llllIIIIIl[0]];
        objectArray[e.llllIIIIIl[1]] = llllIIIIIl[2];
        String string = String.format(lllIllllll[llllIIIIIl[1]], objectArray);
        Object[] objectArray2 = new Object[llllIIIIIl[0]];
        objectArray2[e.llllIIIIIl[1]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[llllIIIIIl[0]];
        objectArray3[e.llllIIIIIl[1]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[llllIIIIIl[0]];
        objectArray4[e.llllIIIIIl[1]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void var7_7;
        void var5_5;
        void var4_4;
        int n2;
        int n3;
        int var45;
        void var4;
        WorldPoint var50;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.llIIlIllIllIl(player)) {
            return;
        }
        WorldPoint var22 = var50;
        int var33 = var22.getX() - var4.getBaseX();
        Point var18 = Perspective.localToCanvas((Client)var4, (LocalPoint)LocalPoint.fromScene((int)var33, (int)(var45 = var22.getY() - var4.getBaseY())), (int)var4.getPlane());
        if (e.llIIlIllIlllI(var18)) {
            n3 = var18.getX();
            0;
            if (3 == 0) {
                return;
            }
        } else {
            int var16;
            n3 = var16 = llllIIIIIl[47];
        }
        if (e.llIIlIllIlllI(var18)) {
            n2 = var18.getY();
            0;
            if (1 >= 2) {
                return;
            }
        } else {
            n2 = llllIIIIIl[47];
        }
        int n4 = n2;
        client.interact(llllIIIIIl[1], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(lllIllllll[llllIIIIIl[0]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(lllIllllll[llllIIIIIl[2]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    /*
     * WARNING - void declaration
     */
    public static void a(WorldPoint worldPoint) {
        void var2;
        void var6;
        void var13;
        WorldPoint worldPoint2 = new WorldPoint(llllIIIIIl[29], llllIIIIIl[30], llllIIIIIl[1]);
        WorldArea worldArea = new WorldArea(llllIIIIIl[31], llllIIIIIl[32], llllIIIIIl[21], llllIIIIIl[33], llllIIIIIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIIIIIl[34], llllIIIIIl[35], llllIIIIIl[36], llllIIIIIl[37], llllIIIIIl[1]);
        if (e.llIIlIllIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIIIIIl[17]) && e.llIIlIllIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIIlIllIIlll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIIlIllIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIIIIl[38], llllIIIIIl[39], llllIIIIIl[0])), llllIIIIIl[13])) {
            AccBuilderTempleTrek.c = lllIllllll[llllIIIIIl[40]];
            if (e.llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)var13);
            0;
            Time.sleepTicks((int)llllIIIIIl[0]);
            0;
        }
        if (e.llIIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var13), llllIIIIIl[17]) && e.llIIlIlllIIII(Players.getLocal().getWorldLocation().getY(), llllIIIIIl[30])) {
            if (e.llIIlIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[llllIIIIIl[0]];
                stringArray[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[41]];
                TileObjects.getNearest((String[])stringArray).interact(lllIllllll[llllIIIIIl[42]]);
                Time.sleepTicks((int)llllIIIIIl[2]);
                0;
            }
            if (e.llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[llllIIIIIl[0]];
                stringArray[e.llllIIIIIl[1]] = lllIllllll[llllIIIIIl[11]];
                g.a(stringArray);
            }
        }
        if (e.llIIlIllIllll(Players.getLocal().getWorldLocation().getY(), llllIIIIIl[30]) && (!e.llIIlIllIIlll(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIlIllIIlll(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.llIIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIIIIl[38], llllIIIIIl[39], llllIIIIIl[0])), llllIIIIIl[13]))) {
            WorldPoint var46;
            AccBuilderTempleTrek.c = lllIllllll[llllIIIIIl[13]];
            if (e.llIIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllIIIIIl[29], llllIIIIIl[43], llllIIIIIl[1])) ? 1 : 0)) {
                e.b(new WorldPoint(llllIIIIIl[29], llllIIIIIl[44], llllIIIIIl[1]));
                Time.sleepTicks((int)llllIIIIIl[17]);
                0;
            }
            Movement.walkTo((WorldPoint)var46);
            0;
            Time.sleepTicks((int)llllIIIIIl[0]);
            0;
        }
    }

    public static boolean F() {
        int n2;
        if (!e.llIIlIllIIlll(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIlIllIIlll(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIlIllIllll(Players.getLocal().getWorldLocation().distanceTo(Z), llllIIIIIl[57]) || e.llIIlIllIlIIl(aa.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = llllIIIIIl[0];
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            n2 = llllIIIIIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIlIllIllll(int n2, int n3) {
        return n2 > n3;
    }

    public static long a(long l2) {
        return e.s() - l2;
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.llIIlIllIllII(Static.getClient().getWorld(), n2)) {
            void var5;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            net.runelite.http.api.worlds.World world = worldResult.findWorld(n2);
            if (e.llIIlIllIllIl(world)) {
                return;
            }
            if (e.llIIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            World var52 = Static.getClient().createWorld();
            var52.setActivity(var5.getActivity());
            var52.setAddress(var5.getAddress());
            var52.setId(var5.getId());
            var52.setPlayerCount(var5.getPlayers());
            var52.setLocation(var5.getLocation());
            var52.setTypes(WorldUtil.toWorldTypes((EnumSet)var5.getTypes()));
            Worlds.hopTo((World)var52);
        }
    }
}

