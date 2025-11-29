package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.pf4j.Extension;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.B;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0004e;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0014o;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.O;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.Q;
import p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.t;
@Extension
@SquireUtil
@PluginDescriptor(name = "Squire Barrows Builder", enabledByDefault = false)
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:gg/squire/account/AccBuilderBarrows.class */
public class AccBuilderBarrows extends Script {
    public static /* synthetic */ String h;
    public static /* synthetic */ long b;
    @Inject
    public /* synthetic */ BuilderConfig q;
    public static /* synthetic */ String c;
    private static /* synthetic */ int[] llIIlIlI;
    @Inject
    private /* synthetic */ BuilderInfoBox w;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ String j;
    public static /* synthetic */ List<F> a;
    @Inject
    private /* synthetic */ OverlayManager v;
    public static /* synthetic */ boolean d;
    static /* synthetic */ String o;
    public static /* synthetic */ String m;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ String k;
    public static /* synthetic */ String l;
    private static /* synthetic */ F[] p;
    static /* synthetic */ int n;
    private static /* synthetic */ String[] llIIlIIl;
    /* synthetic */ boolean t;
    public static /* synthetic */ long g;
    @Inject
    private /* synthetic */ Client u;
    public static /* synthetic */ int f;
    /* synthetic */ WorldArea r = new WorldArea(llIIlIlI[0], llIIlIlI[1], llIIlIlI[2], llIIlIlI[3], llIIlIlI[4]);
    /* synthetic */ String s = llIIlIIl[llIIlIlI[4]];

    private static boolean lIlIlIIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIlIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIlIIlllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIlIIIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIlIIlIIl(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIlIlIIlIll(combatLevel, i3 - i2) && lIlIlIIlIIl(combatLevel, i4)) {
            ?? r0 = llIIlIlI[5];
            "".length();
            return 0 != 0 ? ((36 ^ 49) ^ (58 ^ 54)) & (((91 ^ 14) ^ (33 ^ 109)) ^ (-" ".length())) : r0;
        }
        return llIIlIlI[4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIlIlIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0004e.x();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (lIlIlIIIlII(Players.getNearest(player -> {
            if (lIlIlIIllIl(player, local) && lIlIlIIIllI(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = llIIlIlI[5];
                "".length();
                return 0 != 0 ? ((((73 + 56) - (-60)) + 0) ^ (((1 + 167) - 22) + 24)) & (((96 ^ 75) ^ (44 ^ 16)) ^ (-" ".length())) : r0;
            }
            return llIIlIlI[4];
        })) && (!lIlIlIIlIlI(Game.getWildyLevel()) || lIlIlIIlIIl(Players.getLocal().getWorldLocation().distanceTo(O.jc), llIIlIlI[19]))) {
            int[] iArr = new int[llIIlIlI[5]];
            iArr[llIIlIlI[4]] = llIIlIlI[20];
            if (lIlIlIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIlI[5]];
                iArr2[llIIlIlI[4]] = llIIlIlI[21];
            }
            if (lIlIlIIIIll(this.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIlIlIIIllI(Dialog.isOpen() ? 1 : 0) && lIlIlIIIlII(Dialog.getText()) && lIlIlIIIllI(Dialog.getText().contains(llIIlIIl[llIIlIlI[22]]) ? 1 : 0)) {
            t.cV = llIIlIlI[5];
        }
        C0004e.H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIlIIIllI(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[23]]) ? 1 : 0)) {
            System.out.println(llIIlIIl[llIIlIlI[24]]);
            d = llIIlIlI[5];
        }
        if (lIlIlIIIllI(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[25]]) ? 1 : 0)) {
            System.out.println(llIIlIIl[llIIlIlI[26]]);
            if (lIlIlIIIIll(Game.getWildyLevel()) && lIlIlIIIIll(Inventory.contains(item -> {
                return item.getName().contains(llIIlIIl[llIIlIlI[42]]);
            }) ? 1 : 0)) {
                d = llIIlIlI[5];
                System.out.println(llIIlIIl[llIIlIlI[27]]);
            }
            if (!lIlIlIIlIlI(Game.getWildyLevel()) || lIlIlIIIllI(Inventory.contains(item2 -> {
                return item2.getName().contains(llIIlIIl[llIIlIlI[41]]);
            }) ? 1 : 0)) {
                d = llIIlIlI[4];
                System.out.println(llIIlIIl[llIIlIlI[28]]);
            }
        }
        if (lIlIlIIIllI(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[29]]) ? 1 : 0) && lIlIlIIlIIl(Players.getLocal().getWorldLocation().distanceTo(B.hT), llIIlIlI[18])) {
            String[] strArr = new String[llIIlIlI[5]];
            strArr[llIIlIlI[4]] = llIIlIIl[llIIlIlI[30]];
            if (lIlIlIIIlII(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[llIIlIlI[5]];
                strArr2[llIIlIlI[4]] = llIIlIIl[llIIlIlI[19]];
                TileObjects.getNearest(strArr2).interact(llIIlIIl[llIIlIlI[31]]);
                Time.sleepTicks(llIIlIlI[11]);
                "".length();
            }
            String[] strArr3 = new String[llIIlIlI[5]];
            strArr3[llIIlIlI[4]] = llIIlIIl[llIIlIlI[32]];
            if (lIlIlIIIlII(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[llIIlIlI[5]];
                strArr4[llIIlIlI[4]] = llIIlIIl[llIIlIlI[33]];
                TileObjects.getNearest(strArr4).interact(llIIlIIl[llIIlIlI[34]]);
                Time.sleepTicks(llIIlIlI[10]);
                "".length();
            }
        }
        if (lIlIlIIIllI(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[35]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(llIIlIlI[36], llIIlIlI[37], llIIlIlI[4]));
            "".length();
            Time.sleepTicks(llIIlIlI[5]);
            "".length();
        }
        if (lIlIlIIIllI(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[38]]) ? 1 : 0)) {
            int[] iArr = new int[llIIlIlI[5]];
            iArr[llIIlIlI[4]] = llIIlIlI[39];
            if (lIlIlIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIlI[5]];
                iArr2[llIIlIlI[4]] = llIIlIlI[39];
                Inventory.getFirst(iArr2).interact(llIIlIIl[llIIlIlI[40]]);
            }
        }
    }

    private static boolean lIlIlIIIllI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIlIlIIIllI(configChanged.getGroup().equalsIgnoreCase(llIIlIIl[llIIlIlI[16]]) ? 1 : 0) && lIlIlIIIllI(configChanged.getKey().contains(llIIlIIl[llIIlIlI[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (!lIlIlIIIllI(this.t ? 1 : 0)) {
                d = llIIlIlI[5];
                return;
            }
            d = llIIlIlI[4];
            "".length();
            if (0 != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = llIIlIlI[4];
        System.out.print(llIIlIIl[llIIlIlI[13]]);
        this.v.add(this.w);
        "".length();
        a.clear();
        o = llIIlIIl[llIIlIlI[14]];
        System.out.println(llIIlIIl[llIIlIlI[15]]);
        a.clear();
        List<F> list = a;
        C0014o[] c0014oArr = new C0014o[llIIlIlI[5]];
        c0014oArr[llIIlIlI[4]] = new C0014o();
        Collections.addAll(list, c0014oArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIlIlIIllII(loginStateChanged.getIndex(), llIIlIlI[25]) && lIlIlIIIIll(n)) {
            C0004e.a(this.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIlIlI[5];
        }
    }

    private static boolean lIlIlIIlIlI(int i2) {
        return i2 <= 0;
    }

    private static boolean lIlIlIIlIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIlIIlIII(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIlIlIIIIIl();
        lIlIIllIIll();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = llIIlIlI[4];
        g = System.currentTimeMillis();
        h = llIIlIIl[llIIlIlI[43]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        F[] fArr = new F[llIIlIlI[5]];
        fArr[llIIlIlI[4]] = new Q();
        p = fArr;
    }

    private static boolean lIlIlIIllII(int i2, int i3) {
        return i2 != i3;
    }

    protected int loop() {
        if (lIlIlIIIIlI(Game.getState(), GameState.LOGGED_IN)) {
            if (lIlIlIIIIll(a.isEmpty() ? 1 : 0)) {
                if (!lIlIlIIIlII(j) || lIlIlIIIlIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIlIlIIIllI(a.get(llIIlIlI[4]).W() ? 1 : 0)) {
                    if (lIlIlIIIllI(a.get(llIIlIlI[4]).V().contains(llIIlIIl[llIIlIlI[5]]) ? 1 : 0)) {
                        f += llIIlIlI[5];
                    }
                    System.out.println("Achieved " + a.get(llIIlIlI[4]).V() + " goal");
                    a.remove(llIIlIlI[4]);
                    "".length();
                    return llIIlIlI[6];
                } else if (lIlIlIIIIlI(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIlIlIIIllI(C0004e.y() ? 1 : 0) && lIlIlIIIIll(d ? 1 : 0) && lIlIlIIIlll(C0004e.j(llIIlIlI[7]), llIIlIlI[8]) && lIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                        c = llIIlIIl[llIIlIlI[9]];
                        C0004e.z();
                        Time.sleepTicks(llIIlIlI[5]);
                        "".length();
                        "".length();
                        if ((-" ".length()) >= (((150 ^ 131) ^ (104 ^ 30)) & (((108 ^ 43) ^ (51 ^ 23)) ^ (-" ".length())))) {
                            return ((51 ^ 88) ^ (57 ^ 14)) & (((3 ^ 55) ^ (34 ^ 74)) ^ (-" ".length()));
                        }
                    }
                    int i2 = llIIlIlI[4];
                    try {
                        i2 = a.get(llIIlIlI[4]).U();
                        "".length();
                        if (0 != 0) {
                            return ((((119 + 92) - 114) + 41) ^ (((169 + 26) - 67) + 59)) & (((50 ^ 64) ^ (92 ^ 31)) ^ (-" ".length()));
                        }
                    } catch (Exception lIlIlIllIIllllI) {
                        lIlIlIllIIllllI.printStackTrace();
                    }
                    return i2;
                }
            }
            if (lIlIlIIIllI(a.isEmpty() ? 1 : 0)) {
                if (lIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[10]];
                    Movement.walkTo(Q.js);
                    "".length();
                }
                if (lIlIlIIlIIl(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[11]];
                }
            }
        }
        return llIIlIlI[12];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.v.remove(this.w);
        "".length();
        d = llIIlIlI[5];
        p = new F[llIIlIlI[4]];
        n = llIIlIlI[4];
        f = llIIlIlI[4];
        System.out.print(llIIlIIl[llIIlIlI[18]]);
        super.stop();
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    private static String lIlIIllIIIl(String lIlIlIlIlIlIIlI, String lIlIlIlIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlIlIlIIll) {
            lIlIlIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlII(Object obj) {
        return obj != null;
    }

    private static String lIlIIllIIII(String lIlIlIlIllIIlll, String lIlIlIlIllIIllI) {
        String lIlIlIlIllIIlll2 = new String(Base64.getDecoder().decode(lIlIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlIllIIlIl = new StringBuilder();
        char[] lIlIlIlIllIIlII = lIlIlIlIllIIllI.toCharArray();
        int lIlIlIlIllIIIll = llIIlIlI[4];
        char[] charArray = lIlIlIlIllIIlll2.toCharArray();
        int length = charArray.length;
        int lIlIlIlIlIllIll = llIIlIlI[4];
        while (lIlIlIIlllI(lIlIlIlIlIllIll, length)) {
            lIlIlIlIllIIlIl.append((char) (charArray[lIlIlIlIlIllIll] ^ lIlIlIlIllIIlII[lIlIlIlIllIIIll % lIlIlIlIllIIlII.length]));
            "".length();
            lIlIlIlIllIIIll++;
            lIlIlIlIlIllIll++;
            "".length();
            if ((-" ".length()) == (8 ^ 12)) {
                return null;
            }
        }
        return String.valueOf(lIlIlIlIllIIlIl);
    }

    private static void lIlIlIIIIIl() {
        llIIlIlI = new int[45];
        llIIlIlI[0] = (-17289) & 20399;
        llIIlIlI[1] = (-24774) & 28373;
        llIIlIlI[2] = (59 ^ 102) ^ (86 ^ 53);
        llIIlIlI[3] = 139 ^ 190;
        llIIlIlI[4] = ((((65 + 183) - 74) + 29) ^ (((85 + 195) - 200) + 116)) & (((((8 + 3) - (-88)) + 69) ^ (((17 + 138) - 114) + 126)) ^ (-" ".length()));
        llIIlIlI[5] = " ".length();
        llIIlIlI[6] = (144 ^ 160) ^ (241 ^ 165);
        llIIlIlI[7] = (-((-2097) & 32499)) & (-33) & 30715;
        llIIlIlI[8] = (-13329) & 14328;
        llIIlIlI[9] = "  ".length();
        llIIlIlI[10] = "   ".length();
        llIIlIlI[11] = (((121 + 74) - 50) + 13) ^ (((55 + 29) - (-51)) + 19);
        llIIlIlI[12] = (-13314) & 13913;
        llIIlIlI[13] = 68 ^ 65;
        llIIlIlI[14] = (105 ^ 30) ^ (33 ^ 80);
        llIIlIlI[15] = 38 ^ 33;
        llIIlIlI[16] = (120 ^ 118) ^ (27 ^ 29);
        llIIlIlI[17] = (((22 + 121) - 135) + 131) ^ (((96 + 107) - 104) + 31);
        llIIlIlI[18] = 37 ^ 47;
        llIIlIlI[19] = (59 ^ 30) ^ (20 ^ 37);
        llIIlIlI[20] = (-((-4104) & 30191)) & (-4097) & 30719;
        llIIlIlI[21] = (-((-2065) & 32211)) & (-2081) & 32763;
        llIIlIlI[22] = (26 ^ 57) ^ (0 ^ 40);
        llIIlIlI[23] = (((41 + 23) - (-26)) + 95) ^ (((115 + 3) - 19) + 82);
        llIIlIlI[24] = (1 ^ 76) ^ (107 ^ 43);
        llIIlIlI[25] = (((10 + 28) - (-67)) + 37) ^ (((95 + 19) - 113) + 127);
        llIIlIlI[26] = (151 ^ 164) ^ (104 ^ 84);
        llIIlIlI[27] = (37 ^ 125) ^ (247 ^ 191);
        llIIlIlI[28] = 106 ^ 123;
        llIIlIlI[29] = 2 ^ 16;
        llIIlIlI[30] = (56 ^ 1) ^ (166 ^ 140);
        llIIlIlI[31] = (133 ^ 128) ^ (94 ^ 78);
        llIIlIlI[32] = (((21 + 97) - 23) + 43) ^ (((98 + 97) - 157) + 118);
        llIIlIlI[33] = (114 ^ 44) ^ (212 ^ 157);
        llIIlIlI[34] = (((18 + 100) - (-63)) + 5) ^ (((12 + 7) - (-41)) + 102);
        llIIlIlI[35] = (246 ^ 173) ^ (31 ^ 93);
        llIIlIlI[36] = (-29789) & 32765;
        llIIlIlI[37] = (-((-4397) & 20861)) & (-769) & 20471;
        llIIlIlI[38] = 129 ^ 155;
        llIIlIlI[39] = (-24065) & 24495;
        llIIlIlI[40] = 178 ^ 169;
        llIIlIlI[41] = 125 ^ 97;
        llIIlIlI[42] = (((40 + 121) - 84) + 101) ^ (((18 + 118) - 132) + 171);
        llIIlIlI[43] = (62 ^ 2) ^ (84 ^ 118);
        llIIlIlI[44] = 128 ^ 159;
    }

    private static boolean lIlIlIIIlIl(Object obj) {
        return obj == null;
    }

    private static String lIlIIllIIlI(String lIlIlIlIlIIIlIl, String lIlIlIlIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), llIIlIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlIlIIIllI) {
            lIlIlIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIll(int i2) {
        return i2 == 0;
    }

    private static void lIlIIllIIll() {
        llIIlIIl = new String[llIIlIlI[44]];
        llIIlIIl[llIIlIlI[4]] = lIlIIllIIII("BjEnNyZUanwjPB0mPDUxQCY8KnoPNTpoIgsnOyg6BTZ8dmRXdmd1ZFZzZXNgV3Jhcm1dcXwIYRQRAz4TNAg+f2YYCCQsEAA0ZT05HQI3Bi8iF2cGEgcPOy8vXi0VJGUkHyANLyMDAmo8GBZrKDwXMQUOLwkIFw09Iw==", "nESGU");
        llIIlIIl[llIIlIlI[5]] = lIlIIllIIIl("gwGIKABbvfw=", "jBPAx");
        llIIlIIl[llIIlIlI[9]] = lIlIIllIIlI("Df1wwrHNprV8sNizc72C0obLCF7rGXq6", "rEouo");
        llIIlIIl[llIIlIlI[10]] = lIlIIllIIlI("bVAoTcku2tRy2f3Ys3VmdK0PjmjVSOsD", "PVSjw");
        llIIlIIl[llIIlIlI[11]] = lIlIIllIIlI("wmZmDO38Ms5jfYd3bjIZx+bMQjpH69pm", "HVHVX");
        llIIlIIl[llIIlIlI[13]] = lIlIIllIIlI("1qRpUpPHrgahi1vs3M5nxRQvrrsyXF5LPxhKwp2RDHk=", "ADQAu");
        llIIlIIl[llIIlIlI[14]] = lIlIIllIIIl("FV/U/q3/xJg=", "omOXP");
        llIIlIIl[llIIlIlI[15]] = lIlIIllIIIl("/r1pZ/wvc996FNPQ244+nkUGhS9KbaX69ioOJgAX3dfPTcUFktFgNw==", "qxJTW");
        llIIlIIl[llIIlIlI[16]] = lIlIIllIIII("GAwKFQkZBA0VCgI=", "pceao");
        llIIlIIl[llIIlIlI[17]] = lIlIIllIIIl("MZsUPjEHaoM=", "Mgriz");
        llIIlIIl[llIIlIlI[18]] = lIlIIllIIII("bzYhISACBB8QdTUBBCo8C00CJSARTRUiIgtn", "emqMU");
        llIIlIIl[llIIlIlI[22]] = lIlIIllIIlI("RA1vmu3irH6hgqBr4XSsrg==", "epEME");
        llIIlIIl[llIIlIlI[23]] = lIlIIllIIlI("l+eRT2emiwXy39bcW1XyU7JidlSnOyYo", "OHLfV");
        llIIlIIl[llIIlIlI[24]] = lIlIIllIIIl("nZ4GeZXAZ1n5Ql3CRb/6qtUk0PJYTgLaKnJPrgStqRw=", "TTJOy");
        llIIlIIl[llIIlIlI[25]] = lIlIIllIIII("HSN4FQQzOXRRGD0+eBATN2s8FAA2ag==", "RKXqa");
        llIIlIIl[llIIlIlI[26]] = lIlIIllIIII("ByZJNwYVB0hSb2pr", "PCisO");
        llIIlIIl[llIIlIlI[27]] = lIlIIllIIIl("yrUtZuq0lrwanemTajCLMMbSQ0rMh1pYlH7ug4htxRXGOb0+yj2hz+yViGQvklqx6dm7xpgram6+4QuTfbVtE15F5E2PKDSSCaPq3Fy1DkdYINiQTGdTZg==", "ljpga");
        llIIlIIl[llIIlIlI[28]] = lIlIIllIIlI("h+HZzV9ZBARDvf+OuAWuuOgamIu2ClmOz7ORYR3iDiiNypFeqPzbbi4IGdPbu+kOzW4mfdz7efE5muVd5QFSSPH9ljYidYNGzA4YrusGPo81S5EcHQPLcG0qhDuSfvUI8WCIUHP3FuJU3FsQK6J+BrsqOoK/Hzp0dtqGQzPEL8Y=", "lEouI");
        llIIlIIl[llIIlIlI[29]] = lIlIIllIIIl("DeGCrZgGTnSFiP5oivwDN+j96d+v4LTJ", "ldEts");
        llIIlIIl[llIIlIlI[30]] = lIlIIllIIIl("UTNDNA/MX1I=", "ogElC");
        llIIlIIl[llIIlIlI[19]] = lIlIIllIIlI("/5k346RKcQo=", "DXQAN");
        llIIlIIl[llIIlIlI[31]] = lIlIIllIIIl("GZMfFxlLyRk=", "YYWgm");
        llIIlIIl[llIIlIlI[32]] = lIlIIllIIIl("V7u4jXsyXc0tUzvKitqqFg==", "vtEJB");
        llIIlIIl[llIIlIlI[33]] = lIlIIllIIlI("nEKXDvzFNgLFW0e2sI8S1A==", "AdUiJ");
        llIIlIIl[llIIlIlI[34]] = lIlIIllIIlI("g+goEUfptkU=", "zPxaM");
        llIIlIIl[llIIlIlI[35]] = lIlIIllIIlI("bM6gO7bFeKvVA9BMgi3QdX4q+5V7U0Dj", "qpkmW");
        llIIlIIl[llIIlIlI[38]] = lIlIIllIIlI("JhkcuN9IuGjVoJZKGFg4F+dwRjRPTPlk", "cJRfe");
        llIIlIIl[llIIlIlI[40]] = lIlIIllIIlI("aNKH49rpzMo=", "fqcXU");
        llIIlIIl[llIIlIlI[41]] = lIlIIllIIIl("/dt3uPXJN8I=", "qadgc");
        llIIlIIl[llIIlIlI[42]] = lIlIIllIIlI("yYS5YQ2/nEc=", "rurZH");
        llIIlIIl[llIIlIlI[43]] = lIlIIllIIlI("BR50vLs4nP0=", "CVtTJ");
    }
}
