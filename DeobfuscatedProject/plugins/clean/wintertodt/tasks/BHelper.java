/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@Singleton
public class BHelper {
    private static final  int l;
    private final  SquireWintertodtConfig q;
    private final  List<WorldPoint> p;
    private static final  int k;
    public static final  int g;
    private  int s;
    
    private final  List<LocalPoint> r;
    private static final  int n;
    private static final  Pattern m;
    private  boolean t;
    private static final  int i;
    
    private static final  int j;
    private final  WorldArea o;
    private  a u;
    public static final  int h;

    public boolean d() {
        Player player = Players.getLocal();
        if (b.llIIIIllIIIIlII(player)) {
            return lIlIllllIllII[4];
        }
        return this.p.contains(player.getWorldLocation());
    }

    private static boolean llIIIIllIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIllIIIlIII(int n2) {
        return n2 > 0;
    }

    public a q() {
        return this.u;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        void var1;
        if (b.llIIIIllIIIIlll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIllllIllII[20])) {

            }
        } else if (b.llIIIIllIIIIlll(var1.getGraphicsObject().getId(), lIlIllllIllII[21])) {
            b var2;
            var2.r.add(var1.getGraphicsObject().getLocation());

        }
    }

    public int k() {
        return Vars.getBit((int)lIlIllllIllII[14]);
    }

    private static boolean llIIIIllIIIIllI(int n2) {
        return n2 == 0;
    }

    public int m() {
        return Static.getClient().getTickCount();
    }

    public boolean s() {
        if (b.llIIIIllIIIllII((Object)this.u, (Object)this.q.side())) {
            return lIlIllllIllII[4];
        }
        this.u = this.q.side();
        return lIlIllllIllII[7];
    }

    private static boolean llIIIIllIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public int g() {
        void var2_2;
        if (b.llIIIIllIIIIlIl(this.j() ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        Widget var3 = Widgets.get((int)lIlIllllIllII[6], (int)lIlIllllIllII[8]);
        if (b.llIIIIllIIIIllI(Widgets.isVisible((Widget)var3) ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        String var4 = var3.getText();
        if (b.llIIIIllIIIIlII(var4)) {
            return lIlIllllIllII[4];
        }
        return Integer.parseInt(var2_2.split(lIlIllllIlIll[lIlIllllIllII[4]])[lIlIllllIllII[7]].replace(lIlIllllIlIll[lIlIllllIllII[7]], lIlIllllIlIll[lIlIllllIllII[9]]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean i() {
        boolean bl;
        void var5;
        Player player = Players.getLocal();
        if (b.llIIIIllIIIIlII(player)) {
            return lIlIllllIllII[4];
        }
        if (b.llIIIIllIIIIlll(var5.getWorldLocation().getRegionID(), lIlIllllIllII[13])) {
            bl = lIlIllllIllII[7];

            if (1 == 3) {
                return ((51 + 32 - 70 + 145 ^ 113 + 125 - 122 + 26) & (0x73 ^ 0x11 ^ (6 ^ 0x74) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllllIllII[4];
        }
        return bl;
    }

    private static boolean llIIIIllIIIIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public int f() {
        void var6;
        Widget widget = Widgets.get((int)lIlIllllIllII[6], (int)lIlIllllIllII[3]);
        if (b.llIIIIllIIIIlII(widget)) {
            return lIlIllllIllII[4];
        }
        String var7 = var6.getText();
        Matcher var8 = m.matcher(var7);
        if (b.llIIIIllIIIIlIl(var8.find() ? 1 : 0)) {
            return Integer.parseInt(var8.group(lIlIllllIllII[7]));
        }
        return lIlIllllIllII[4];
    }

    public boolean u() {
        return this.t;
    }

    private static boolean llIIIIllIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    public void n() {
        this.s = this.m();
    }

    public int p() {
        return Inventory.getCount(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[lIlIllllIllII[7]];
                    stringArray[b.lIlIllllIllII[4]] = lIlIllllIlIll[lIlIllllIllII[22]];
                    if (!b.llIIIIllIIIIllI(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIlIllllIllII[7]];
                    stringArray2[b.lIlIllllIllII[4]] = lIlIllllIlIll[lIlIllllIllII[23]];
                    if (!b.llIIIIllIIIIlIl(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = lIlIllllIllII[7];

                if ((0x1F ^ 0x1B) >= (0x33 ^ 0x37)) return n2 != 0;
                return false;
            }
            n2 = lIlIllllIllII[4];
            return n2 != 0;
        });
    }

    private static boolean llIIIIllIIIllII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public BHelper(SquireWintertodtConfig squireWintertodtConfig) {
        this.o = new WorldArea(lIlIllllIllII[0], lIlIllllIllII[1], lIlIllllIllII[2], lIlIllllIllII[3], lIlIllllIllII[4]);
        this.p = this.o.toWorldPointList();
        this.r = new ArrayList<LocalPoint>();
        this.s = lIlIllllIllII[5];
        this.t = lIlIllllIllII[4];
        this.q = squireWintertodtConfig;
        this.u = squireWintertodtConfig.side();
    }

    public WorldPoint e() {
        return this.p.get(new Random().nextInt(this.p.size()));
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        b var9;
        void var10;
        if (b.llIIIIllIIIlIIl(chatMessage.getType(), ChatMessageType.SPAM) && b.llIIIIllIIIlIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var11 = var10.getMessage();
        if (!b.llIIIIllIIIIllI(var11.contains(lIlIllllIlIll[lIlIllllIllII[17]]) ? 1 : 0) || b.llIIIIllIIIIlIl(var11.contains(lIlIllllIlIll[lIlIllllIllII[3]]) ? 1 : 0)) {
            var9.s = lIlIllllIllII[4];
        }
        if (b.llIIIIllIIIIlIl(var11.contains(lIlIllllIlIll[lIlIllllIllII[18]]) ? 1 : 0)) {
            var9.a(lIlIllllIllII[7]);
        }
        if (b.llIIIIllIIIIlIl(var11.contains(lIlIllllIlIll[lIlIllllIllII[19]]) ? 1 : 0)) {
            var9.a(lIlIllllIllII[4]);
        }
    }

    private static void llIIIIllIIIIIII() {
        lIlIllllIlIll = new String[lIlIllllIllII[25]];
        b.lIlIllllIlIll[b.lIlIllllIllII[4]] = ": ";
        b.lIlIllllIlIll[b.lIlIllllIllII[7]] = "%";
        b.lIlIllllIlIll[b.lIlIllllIllII[9]] = b.llIIIIlIlllllll("6hCAAfqC+bk=", "HHorJ");
        b.lIlIllllIlIll[b.lIlIllllIllII[11]] = ": ";
        b.lIlIllllIlIll[b.lIlIllllIllII[12]] = "%";
        b.lIlIllllIlIll[b.lIlIllllIllII[2]] = b.llIIIIlIllllllI("", "CiHZH");
        b.lIlIllllIlIll[b.lIlIllllIllII[17]] = "seeps into your bones";
        b.lIlIllllIlIll[b.lIlIllllIllII[3]] = "Congratulations";
        b.lIlIllllIlIll[b.lIlIllllIllII[18]] = "run out of bruma";
        b.lIlIllllIlIll[b.lIlIllllIllII[19]] = "too full to";
        b.lIlIllllIlIll[b.lIlIllllIllII[22]] = "Eat";
        b.lIlIllllIlIll[b.lIlIllllIllII[23]] = "Drink";
        b.lIlIllllIlIll[b.lIlIllllIllII[24]] = "(\\d+)";
    }

    private static boolean llIIIIllIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    @Subscribe(priority=10.0f)
    public void a(GameTick gameTick) {
        b var12;
        if (b.llIIIIllIIIlIIl(Static.getClient().getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        Player var13 = Players.getLocal();
        if (b.llIIIIllIIIlIlI(var13.getAnimation(), lIlIllllIllII[5])) {
            var12.s = var12.m();
        }
        int var14 = Inventory.getFreeSlots();
        int[] nArray = new int[lIlIllllIllII[9]];
        nArray[b.lIlIllllIllII[4]] = lIlIllllIllII[15];
        nArray[b.lIlIllllIllII[7]] = lIlIllllIllII[16];
        int n2 = Inventory.contains((int[])nArray);
        int[] nArray2 = new int[lIlIllllIllII[9]];
        nArray2[b.lIlIllllIllII[4]] = lIlIllllIllII[15];
        nArray2[b.lIlIllllIllII[7]] = lIlIllllIllII[16];
        int var15 = Inventory.getCount((int[])nArray2);
        if (b.llIIIIllIIIlIll(var15, var12.g()) && b.llIIIIllIIIIlIl(var12.t ? 1 : 0)) {
            var12.a(lIlIllllIllII[4]);
        }
        if (b.llIIIIllIIIIllI(var14) && b.llIIIIllIIIIlIl(var12.t ? 1 : 0)) {
            var12.a(lIlIllllIllII[4]);

            if ((0x84 ^ 0x80) < 2) {
                return;
            }
        } else if (b.llIIIIllIIIlIII(var14) && b.llIIIIllIIIIllI(n2) && b.llIIIIllIIIIllI(var12.t ? 1 : 0)) {
            var12.a(lIlIllllIllII[7]);
        }
    }

    private static boolean llIIIIllIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIIIIlIl(int n2) {
        return n2 != 0;
    }

    public void a(boolean bl) {
        Client client = Static.getClient();
        client.setQueuedMenu(null);
        client.setPendingAutomation(null);
        this.t = bl;
    }

    public void o() {
        this.s = lIlIllllIllII[4];
    }

    public int t() {
        return this.s;
    }

    public int l() {
        return this.m() - this.t();
    }

    /*
     * WARNING - void declaration
     */
    public int h() {
        void var2_2;
        if (b.llIIIIllIIIIlIl(this.j() ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        Widget var16 = Widgets.get((int)lIlIllllIllII[6], (int)lIlIllllIllII[10]);
        if (b.llIIIIllIIIIllI(Widgets.isVisible((Widget)var16) ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        String var17 = var16.getText();
        if (b.llIIIIllIIIIlII(var17)) {
            return lIlIllllIllII[4];
        }
        return Integer.parseInt(var2_2.split(lIlIllllIlIll[lIlIllllIllII[11]])[lIlIllllIllII[7]].replace(lIlIllllIlIll[lIlIllllIllII[12]], lIlIllllIlIll[lIlIllllIllII[2]]));
    }

        return String.valueOf(var18);
    }

    public boolean j() {
        boolean bl;
        if (b.llIIIIllIIIlIII(this.k())) {
            bl = lIlIllllIllII[7];

            if (((0x6E ^ 0x67) & ~(0x4C ^ 0x45)) <= -1) {
                return false;
            }
        } else {
            bl = lIlIllllIllII[4];
        }
        return bl;
    }

    static {
        b.llIIIIllIIIIIlI();
        b.llIIIIllIIIIIII();
        g = lIlIllllIllII[20];
        j = lIlIllllIllII[6];
        l = lIlIllllIllII[10];
        k = lIlIllllIllII[8];
        n = lIlIllllIllII[3];
        h = lIlIllllIllII[21];
        i = lIlIllllIllII[13];
        m = Pattern.compile(lIlIllllIlIll[lIlIllllIllII[24]]);
    }

    public void r() {
        a a2;
        if (b.llIIIIllIIIllII((Object)this.u, (Object)a.WEST)) {
            a2 = a.EAST;

            if (((0x31 ^ 0x5D ^ (0x19 ^ 0x32)) & (21 + 149 - 15 + 69 ^ 4 + 4 - -126 + 33 ^ -1)) >= 2) {
                return;
            }
        } else {
            a2 = a.WEST;
        }
        this.u = a2;
    }
}

