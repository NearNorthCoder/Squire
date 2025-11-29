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
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
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
public class b {
    private static final /* synthetic */ int l;
    private final /* synthetic */ SquireWintertodtConfig q;
    private final /* synthetic */ List<WorldPoint> p;
    private static final /* synthetic */ int k;
    public static final /* synthetic */ int g;
    private /* synthetic */ int s;
    private static /* synthetic */ String[] lIlIllllIlIll;
    private final /* synthetic */ List<LocalPoint> r;
    private static final /* synthetic */ int n;
    private static final /* synthetic */ Pattern m;
    private /* synthetic */ boolean t;
    private static final /* synthetic */ int i;
    private static /* synthetic */ int[] lIlIllllIllII;
    private static final /* synthetic */ int j;
    private final /* synthetic */ WorldArea o;
    private /* synthetic */ a u;
    public static final /* synthetic */ int h;

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
        void llllllllllllllIllIIlllIlllIlIIlI;
        if (b.llIIIIllIIIIlll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIllllIllII[20])) {
            0;
            if (null != null) {
                return;
            }
        } else if (b.llIIIIllIIIIlll(llllllllllllllIllIIlllIlllIlIIlI.getGraphicsObject().getId(), lIlIllllIllII[21])) {
            b llllllllllllllIllIIlllIlllIlIIll;
            llllllllllllllIllIIlllIlllIlIIll.r.add(llllllllllllllIllIIlllIlllIlIIlI.getGraphicsObject().getLocation());
            0;
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
        Widget llllllllllllllIllIIlllIlllllIIIl = Widgets.get((int)lIlIllllIllII[6], (int)lIlIllllIllII[8]);
        if (b.llIIIIllIIIIllI(Widgets.isVisible((Widget)llllllllllllllIllIIlllIlllllIIIl) ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        String llllllllllllllIllIIlllIlllllIIII = llllllllllllllIllIIlllIlllllIIIl.getText();
        if (b.llIIIIllIIIIlII(llllllllllllllIllIIlllIlllllIIII)) {
            return lIlIllllIllII[4];
        }
        return Integer.parseInt(var2_2.split(lIlIllllIlIll[lIlIllllIllII[4]])[lIlIllllIllII[7]].replace(lIlIllllIlIll[lIlIllllIllII[7]], lIlIllllIlIll[lIlIllllIllII[9]]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean i() {
        boolean bl;
        void llllllllllllllIllIIlllIllllIlIII;
        Player player = Players.getLocal();
        if (b.llIIIIllIIIIlII(player)) {
            return lIlIllllIllII[4];
        }
        if (b.llIIIIllIIIIlll(llllllllllllllIllIIlllIllllIlIII.getWorldLocation().getRegionID(), lIlIllllIllII[13])) {
            bl = lIlIllllIllII[7];
            0;
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
        void llllllllllllllIllIIlllIllllllIII;
        Widget widget = Widgets.get((int)lIlIllllIllII[6], (int)lIlIllllIllII[3]);
        if (b.llIIIIllIIIIlII(widget)) {
            return lIlIllllIllII[4];
        }
        String llllllllllllllIllIIlllIlllllIlll = llllllllllllllIllIIlllIllllllIII.getText();
        Matcher llllllllllllllIllIIlllIlllllIllI = m.matcher(llllllllllllllIllIIlllIlllllIlll);
        if (b.llIIIIllIIIIlIl(llllllllllllllIllIIlllIlllllIllI.find() ? 1 : 0)) {
            return Integer.parseInt(llllllllllllllIllIIlllIlllllIllI.group(lIlIllllIllII[7]));
        }
        return lIlIllllIllII[4];
    }

    public boolean u() {
        return this.t;
    }

    private static boolean llIIIIllIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIlIlllllll(String llllllllllllllIllIIlllIlllIIIlII, String llllllllllllllIllIIlllIlllIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlllIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIllllIllII[18]), "DES");
            Cipher llllllllllllllIllIIlllIlllIIIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIlllIlllIIIllI.init(lIlIllllIllII[9], llllllllllllllIllIIlllIlllIIIlll);
            return new String(llllllllllllllIllIIlllIlllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllIlllIIIlIl) {
            llllllllllllllIllIIlllIlllIIIlIl.printStackTrace();
            return null;
        }
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
                0;
                if ((0x1F ^ 0x1B) >= (0x33 ^ 0x37)) return n2 != 0;
                return ((0xB4 ^ 0xBF) & ~(0x62 ^ 0x69)) != 0;
            }
            n2 = lIlIllllIllII[4];
            return n2 != 0;
        });
    }

    private static boolean llIIIIllIIIllII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public b(SquireWintertodtConfig squireWintertodtConfig) {
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
        b llllllllllllllIllIIlllIlllIllIII;
        void llllllllllllllIllIIlllIlllIlIlll;
        if (b.llIIIIllIIIlIIl(chatMessage.getType(), ChatMessageType.SPAM) && b.llIIIIllIIIlIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllIllIIlllIlllIlIllI = llllllllllllllIllIIlllIlllIlIlll.getMessage();
        if (!b.llIIIIllIIIIllI(llllllllllllllIllIIlllIlllIlIllI.contains(lIlIllllIlIll[lIlIllllIllII[17]]) ? 1 : 0) || b.llIIIIllIIIIlIl(llllllllllllllIllIIlllIlllIlIllI.contains(lIlIllllIlIll[lIlIllllIllII[3]]) ? 1 : 0)) {
            llllllllllllllIllIIlllIlllIllIII.s = lIlIllllIllII[4];
        }
        if (b.llIIIIllIIIIlIl(llllllllllllllIllIIlllIlllIlIllI.contains(lIlIllllIlIll[lIlIllllIllII[18]]) ? 1 : 0)) {
            llllllllllllllIllIIlllIlllIllIII.a(lIlIllllIllII[7]);
        }
        if (b.llIIIIllIIIIlIl(llllllllllllllIllIIlllIlllIlIllI.contains(lIlIllllIlIll[lIlIllllIllII[19]]) ? 1 : 0)) {
            llllllllllllllIllIIlllIlllIllIII.a(lIlIllllIllII[4]);
        }
    }

    private static void llIIIIllIIIIIII() {
        lIlIllllIlIll = new String[lIlIllllIllII[25]];
        b.lIlIllllIlIll[b.lIlIllllIllII[4]] = b.": ";
        b.lIlIllllIlIll[b.lIlIllllIllII[7]] = b."%";
        b.lIlIllllIlIll[b.lIlIllllIllII[9]] = b."";
        b.lIlIllllIlIll[b.lIlIllllIllII[11]] = b.": ";
        b.lIlIllllIlIll[b.lIlIllllIllII[12]] = b."%";
        b.lIlIllllIlIll[b.lIlIllllIllII[2]] = b."";
        b.lIlIllllIlIll[b.lIlIllllIllII[17]] = b."seeps into your bones";
        b.lIlIllllIlIll[b.lIlIllllIllII[3]] = b."Congratulations";
        b.lIlIllllIlIll[b.lIlIllllIllII[18]] = b."run out of bruma";
        b.lIlIllllIlIll[b.lIlIllllIllII[19]] = b."too full to";
        b.lIlIllllIlIll[b.lIlIllllIllII[22]] = b."Eat";
        b.lIlIllllIlIll[b.lIlIllllIllII[23]] = b."Drink";
        b.lIlIllllIlIll[b.lIlIllllIllII[24]] = b."(\\d+)";
    }

    private static boolean llIIIIllIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    @Subscribe(priority=10.0f)
    public void a(GameTick gameTick) {
        b llllllllllllllIllIIlllIllllIIIII;
        if (b.llIIIIllIIIlIIl(Static.getClient().getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        Player llllllllllllllIllIIlllIlllIlllll = Players.getLocal();
        if (b.llIIIIllIIIlIlI(llllllllllllllIllIIlllIlllIlllll.getAnimation(), lIlIllllIllII[5])) {
            llllllllllllllIllIIlllIllllIIIII.s = llllllllllllllIllIIlllIllllIIIII.m();
        }
        int llllllllllllllIllIIlllIlllIllllI = Inventory.getFreeSlots();
        int[] nArray = new int[lIlIllllIllII[9]];
        nArray[b.lIlIllllIllII[4]] = lIlIllllIllII[15];
        nArray[b.lIlIllllIllII[7]] = lIlIllllIllII[16];
        int n2 = Inventory.contains((int[])nArray);
        int[] nArray2 = new int[lIlIllllIllII[9]];
        nArray2[b.lIlIllllIllII[4]] = lIlIllllIllII[15];
        nArray2[b.lIlIllllIllII[7]] = lIlIllllIllII[16];
        int llllllllllllllIllIIlllIlllIlllII = Inventory.getCount((int[])nArray2);
        if (b.llIIIIllIIIlIll(llllllllllllllIllIIlllIlllIlllII, llllllllllllllIllIIlllIllllIIIII.g()) && b.llIIIIllIIIIlIl(llllllllllllllIllIIlllIllllIIIII.t ? 1 : 0)) {
            llllllllllllllIllIIlllIllllIIIII.a(lIlIllllIllII[4]);
        }
        if (b.llIIIIllIIIIllI(llllllllllllllIllIIlllIlllIllllI) && b.llIIIIllIIIIlIl(llllllllllllllIllIIlllIllllIIIII.t ? 1 : 0)) {
            llllllllllllllIllIIlllIllllIIIII.a(lIlIllllIllII[4]);
            0;
            if ((0x84 ^ 0x80) < 2) {
                return;
            }
        } else if (b.llIIIIllIIIlIII(llllllllllllllIllIIlllIlllIllllI) && b.llIIIIllIIIIllI(n2) && b.llIIIIllIIIIllI(llllllllllllllIllIIlllIllllIIIII.t ? 1 : 0)) {
            llllllllllllllIllIIlllIllllIIIII.a(lIlIllllIllII[7]);
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
        Widget llllllllllllllIllIIlllIllllIlIll = Widgets.get((int)lIlIllllIllII[6], (int)lIlIllllIllII[10]);
        if (b.llIIIIllIIIIllI(Widgets.isVisible((Widget)llllllllllllllIllIIlllIllllIlIll) ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        String llllllllllllllIllIIlllIllllIlIlI = llllllllllllllIllIIlllIllllIlIll.getText();
        if (b.llIIIIllIIIIlII(llllllllllllllIllIIlllIllllIlIlI)) {
            return lIlIllllIllII[4];
        }
        return Integer.parseInt(var2_2.split(lIlIllllIlIll[lIlIllllIllII[11]])[lIlIllllIllII[7]].replace(lIlIllllIlIll[lIlIllllIllII[12]], lIlIllllIlIll[lIlIllllIllII[2]]));
    }

    private static void llIIIIllIIIIIlI() {
        lIlIllllIllII = new int[26];
        b.lIlIllllIllII[0] = 0xFFFFD6FE & 0x2F5D;
        b.lIlIllllIllII[1] = 0xFFFF9F8B & 0x6FFF;
        b.lIlIllllIllII[2] = 4 ^ 1;
        b.lIlIllllIllII[3] = 17 + 74 - 48 + 153 ^ 87 + 25 - 81 + 164;
        b.lIlIllllIllII[4] = (64 + 131 - 68 + 71 ^ 13 + 120 - 52 + 66) & (0x84 ^ 0xA3 ^ (0xB6 ^ 0xC4) ^ -1);
        b.lIlIllllIllII[5] = -1;
        b.lIlIllllIllII[6] = 0xFFFFCBFC & 0x358F;
        b.lIlIllllIllII[7] = 1;
        b.lIlIllllIllII[8] = 0x44 ^ 0x5E;
        b.lIlIllllIllII[9] = 2;
        b.lIlIllllIllII[10] = 133 + 163 - 174 + 45 ^ 166 + 157 - 209 + 65;
        b.lIlIllllIllII[11] = 3;
        b.lIlIllllIllII[12] = 0x82 ^ 0xC3 ^ (0x2D ^ 0x68);
        b.lIlIllllIllII[13] = 0xFFFF9F3E & 0x79FF;
        b.lIlIllllIllII[14] = 0xFFFFBF3E & 0x5FED;
        b.lIlIllllIllII[15] = -(0xFFFFEC77 & 0x3FA9) & (0xFFFFFFFB & 0x7CFC);
        b.lIlIllllIllII[16] = 0xFFFFD6DF & 0x79F7;
        b.lIlIllllIllII[17] = 0x69 ^ 0x57 ^ (0x33 ^ 0xB);
        b.lIlIllllIllII[18] = 0xB1 ^ 0xBE ^ (0x55 ^ 0x52);
        b.lIlIllllIllII[19] = 74 + 24 - -29 + 22 ^ 24 + 109 - 44 + 67;
        b.lIlIllllIllII[20] = 0xFFFFE3F6 & 0x1DFF;
        b.lIlIllllIllII[21] = -(0xFFFFACE1 & 0x7BDF) & (0xFFFFBDFF & 0x6FDF);
        b.lIlIllllIllII[22] = 74 + 53 - 79 + 107 ^ 57 + 18 - -13 + 57;
        b.lIlIllllIllII[23] = 63 + 7 - 64 + 131 ^ 45 + 49 - 81 + 117;
        b.lIlIllllIllII[24] = 0x17 ^ 0x1B;
        b.lIlIllllIllII[25] = 138 + 140 - 266 + 136 ^ 93 + 3 - 40 + 97;
    }

    private static String llIIIIlIllllllI(String llllllllllllllIllIIlllIllIlIllll, String llllllllllllllIllIIlllIllIllIIll) {
        llllllllllllllIllIIlllIllIlIllll = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllIllIllIIlI = new StringBuilder();
        char[] llllllllllllllIllIIlllIllIllIIIl = llllllllllllllIllIIlllIllIllIIll.toCharArray();
        int llllllllllllllIllIIlllIllIllIIII = lIlIllllIllII[4];
        char[] llllllllllllllIllIIlllIllIlIlIlI = llllllllllllllIllIIlllIllIlIllll.toCharArray();
        int llllllllllllllIllIIlllIllIlIlIIl = llllllllllllllIllIIlllIllIlIlIlI.length;
        int llllllllllllllIllIIlllIllIlIlIII = lIlIllllIllII[4];
        while (b.llIIIIllIIIllIl(llllllllllllllIllIIlllIllIlIlIII, llllllllllllllIllIIlllIllIlIlIIl)) {
            char llllllllllllllIllIIlllIllIllIlIl = llllllllllllllIllIIlllIllIlIlIlI[llllllllllllllIllIIlllIllIlIlIII];
            llllllllllllllIllIIlllIllIllIIlI.append((char)(llllllllllllllIllIIlllIllIllIlIl ^ llllllllllllllIllIIlllIllIllIIIl[llllllllllllllIllIIlllIllIllIIII % llllllllllllllIllIIlllIllIllIIIl.length]));
            0;
            ++llllllllllllllIllIIlllIllIllIIII;
            ++llllllllllllllIllIIlllIllIlIlIII;
            0;
            if ((0x44 ^ 0x40) > 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlllIllIllIIlI);
    }

    public boolean j() {
        boolean bl;
        if (b.llIIIIllIIIlIII(this.k())) {
            bl = lIlIllllIllII[7];
            0;
            if (((0x6E ^ 0x67) & ~(0x4C ^ 0x45)) <= -1) {
                return ((0xBC ^ 0x90) & ~(0xBE ^ 0x92)) != 0;
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
            0;
            if (((0x31 ^ 0x5D ^ (0x19 ^ 0x32)) & (21 + 149 - 15 + 69 ^ 4 + 4 - -126 + 33 ^ -1)) >= 2) {
                return;
            }
        } else {
            a2 = a.WEST;
        }
        this.u = a2;
    }
}

