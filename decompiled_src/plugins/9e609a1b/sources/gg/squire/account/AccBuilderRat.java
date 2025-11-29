package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.A;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0004e;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0010k;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.H;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.O;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.x;
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
@Extension
@SquireUtil
@PluginDescriptor(name = "Squire Rat King Builder", enabledByDefault = false)
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:gg/squire/account/AccBuilderRat.class */
public class AccBuilderRat extends Script {
    public static /* synthetic */ String c;
    public static /* synthetic */ String h;
    private static /* synthetic */ M[] o;

    /* renamed from: i  reason: collision with root package name */
    public static /* synthetic */ HashMap<WorldPoint, Integer> f2i;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    public static /* synthetic */ String k;
    /* synthetic */ boolean s;
    public static /* synthetic */ boolean e;
    @Inject
    public /* synthetic */ BuilderConfig p;
    public static /* synthetic */ long g;
    @Inject
    private /* synthetic */ OverlayManager u;
    public static /* synthetic */ List<M> a;
    static /* synthetic */ int n;
    public static /* synthetic */ String j;
    public static /* synthetic */ int f;
    public static /* synthetic */ boolean d;
    @Inject
    private /* synthetic */ Client t;
    private static /* synthetic */ String[] lIIIlllIIIlll;
    public static /* synthetic */ String l;
    private static /* synthetic */ int[] lIIIlllIIlIll;
    public static /* synthetic */ String m;
    public static /* synthetic */ long b;
    /* synthetic */ WorldArea q = new WorldArea(lIIIlllIIlIll[0], lIIIlllIIlIll[1], lIIIlllIIlIll[2], lIIIlllIIlIll[3], lIIIlllIIlIll[4]);
    /* synthetic */ String r = lIIIlllIIIlll[lIIIlllIIlIll[4]];

    private static boolean lIlIIlIIIIIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIIIllllllIII(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIIIIIIIll(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIlIIlIIIIIIIII(combatLevel, i3 - i2) && lIlIIIllllllllI(combatLevel, i4)) {
            ?? r0 = lIIIlllIIlIll[5];
            "".length();
            return ((75 ^ 13) ^ (51 ^ 113)) == " ".length() ? ((((214 + 120) - 250) + 146) ^ (((119 + 50) - 22) + 27)) & (((((233 + 74) - 294) + 232) ^ (((165 + 40) - 181) + 165)) ^ (-" ".length())) : r0;
        }
        return lIIIlllIIlIll[4];
    }

    private static boolean lIlIIlIIIIIIIIl(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIlIIIIIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    protected int loop() {
        if (lIlIIIlllllIlll(Game.getState(), GameState.LOGGED_IN)) {
            if (lIlIIIllllllIII(a.isEmpty() ? 1 : 0)) {
                if (!lIlIIIllllllIIl(j) || lIlIIIllllllIlI(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIlIIIllllllIll(a.get(lIIIlllIIlIll[4]).aa() ? 1 : 0)) {
                    if (lIlIIIllllllIll(a.get(lIIIlllIIlIll[4]).Z().contains(lIIIlllIIIlll[lIIIlllIIlIll[5]]) ? 1 : 0)) {
                        f += lIIIlllIIlIll[5];
                    }
                    System.out.println("Achieved " + a.get(lIIIlllIIlIll[4]).Z() + " goal");
                    a.remove(lIIIlllIIlIll[4]);
                    "".length();
                    return lIIIlllIIlIll[6];
                } else if (lIlIIIlllllIlll(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIlIIIllllllIll(C0004e.y() ? 1 : 0) && lIlIIIllllllIII(d ? 1 : 0) && lIlIIIlllllllII(C0004e.j(lIIIlllIIlIll[7]), lIIIlllIIlIll[8]) && lIlIIIllllllIII(Dialog.isOpen() ? 1 : 0)) {
                        c = lIIIlllIIIlll[lIIIlllIIlIll[9]];
                        C0004e.z();
                        Time.sleepTicks(lIIIlllIIlIll[5]);
                        "".length();
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return (28 ^ 67) & ((234 ^ 181) ^ (-1));
                        }
                    }
                    int i2 = lIIIlllIIlIll[4];
                    try {
                        i2 = a.get(lIIIlllIIlIll[4]).Y();
                        "".length();
                        if (" ".length() < ((84 ^ 111) & ((68 ^ 127) ^ (-1)))) {
                            return (28 ^ 77) & ((37 ^ 116) ^ (-1));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return i2;
                }
            }
            if (lIlIIIllllllIll(a.isEmpty() ? 1 : 0)) {
                if (lIlIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(P.it), lIIIlllIIlIll[10])) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[10]];
                    Movement.walkTo(P.it);
                    "".length();
                }
                if (lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(P.it), lIIIlllIIlIll[10])) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[11]];
                }
            }
        }
        return lIIIlllIIlIll[12];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIlIIIllllllIll(configChanged.getGroup().equalsIgnoreCase(lIIIlllIIIlll[lIIIlllIIlIll[15]]) ? 1 : 0) && lIlIIIllllllIll(configChanged.getKey().contains(lIIIlllIIIlll[lIIIlllIIlIll[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (!lIlIIIllllllIll(this.s ? 1 : 0)) {
                d = lIIIlllIIlIll[5];
                return;
            }
            d = lIIIlllIIlIll[4];
            "".length();
            if (0 != 0) {
            }
        }
    }

    private static String lIlIIIllllIIIlI(String lllllllllllllllIIIIIllIIlIIlIllI, String lllllllllllllllIIIIIllIIlIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIIlIll[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIIlIIlIIlI) {
            lllllllllllllllIIIIIllIIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllllllll(int i2) {
        return i2 <= 0;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIlIIlIIIIIIIIl(loginStateChanged.getIndex(), lIIIlllIIlIll[25]) && lIlIIIllllllIII(n)) {
            C0004e.a(this.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += lIIIlllIIlIll[5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.u.remove(this.v);
        "".length();
        d = lIIIlllIIlIll[5];
        o = new M[lIIIlllIIlIll[4]];
        n = lIIIlllIIlIll[4];
        f = lIIIlllIIlIll[4];
        System.out.print(lIIIlllIIIlll[lIIIlllIIlIll[17]]);
        super.stop();
    }

    private static String lIlIIIllllIIIll(String lllllllllllllllIIIIIllIIlIIIlIIl, String lllllllllllllllIIIIIllIIlIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIIlIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIIlIll[9], lllllllllllllllIIIIIllIIlIIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIIlIIIlIlI) {
            lllllllllllllllIIIIIllIIlIIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[21]]) ? 1 : 0)) {
            System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[22]]);
            d = lIIIlllIIlIll[5];
        }
        if (lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[23]]) ? 1 : 0)) {
            System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[24]]);
            if (lIlIIIllllllIII(Game.getWildyLevel()) && lIlIIIllllllIII(Inventory.contains(item -> {
                return item.getName().contains(lIIIlllIIIlll[lIIIlllIIlIll[41]]);
            }) ? 1 : 0)) {
                d = lIIIlllIIlIll[5];
                System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[25]]);
            }
            if (!lIlIIIlllllllll(Game.getWildyLevel()) || lIlIIIllllllIll(Inventory.contains(item2 -> {
                return item2.getName().contains(lIIIlllIIIlll[lIIIlllIIlIll[40]]);
            }) ? 1 : 0)) {
                d = lIIIlllIIlIll[4];
                System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[26]]);
            }
        }
        if (lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[27]]) ? 1 : 0) && lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(H.hs), lIIIlllIIlIll[21])) {
            C0004e.w();
        }
        if (lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[28]]) ? 1 : 0) && (!lIlIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(A.gr), lIIIlllIIlIll[15]) || lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(x.fW), lIIIlllIIlIll[21]))) {
            String[] strArr = new String[lIIIlllIIlIll[5]];
            strArr[lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[29]];
            if (lIlIIIllllllIIl(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[lIIIlllIIlIll[5]];
                strArr2[lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[30]];
                TileObjects.getNearest(strArr2).interact(lIIIlllIIIlll[lIIIlllIIlIll[18]]);
                Time.sleepTicks(lIIIlllIIlIll[11]);
                "".length();
            }
            String[] strArr3 = new String[lIIIlllIIlIll[5]];
            strArr3[lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[31]];
            if (lIlIIIllllllIIl(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[lIIIlllIIlIll[5]];
                strArr4[lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[32]];
                TileObjects.getNearest(strArr4).interact(lIIIlllIIIlll[lIIIlllIIlIll[33]]);
                Time.sleepTicks(lIIIlllIIlIll[10]);
                "".length();
            }
        }
        if (lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[34]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(lIIIlllIIlIll[35], lIIIlllIIlIll[36], lIIIlllIIlIll[4]));
            "".length();
            Time.sleepTicks(lIIIlllIIlIll[5]);
            "".length();
        }
        if (lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[37]]) ? 1 : 0)) {
            int[] iArr = new int[lIIIlllIIlIll[5]];
            iArr[lIIIlllIIlIll[4]] = lIIIlllIIlIll[38];
            if (lIlIIIllllllIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllIIlIll[5]];
                iArr2[lIIIlllIIlIll[4]] = lIIIlllIIlIll[38];
                Inventory.getFirst(iArr2).interact(lIIIlllIIIlll[lIIIlllIIlIll[39]]);
            }
        }
    }

    private static void lIlIIIlllllIlIl() {
        lIIIlllIIIlll = new String[lIIIlllIIlIll[43]];
        lIIIlllIIIlll[lIIIlllIIlIll[4]] = lIlIIIllllIIIIl("DyMzBwVdeGgTHxQ0KAUSSTQoGlkGJy5YAQI1LxgZDCRoRkdeZHNFR19hcUNDXmB1Qk5UY2g4Qh0DFw4wPRoqT0URGjAcMwkmcQ0aFBAjNgwrBXM2MQ4dLx8MVz8BFEYtDTQ9DCoRFlofEQR/GB8eIxE+DAAaAz0eKg==", "gWGwv");
        lIIIlllIIIlll[lIIIlllIIlIll[5]] = lIlIIIllllIIIlI("pdigk5KPliE=", "nmZlF");
        lIIIlllIIIlll[lIIIlllIIlIll[9]] = lIlIIIllllIIIll("goh/VzLgFLgZ/jyNobMNoJy6+Chn2dhg", "GiQST");
        lIIIlllIIIlll[lIIIlllIIlIll[10]] = lIlIIIllllIIIlI("+rgQTx1bS9Ys7aojL4sYAp+BOBm5ajDK", "jZNWh");
        lIIIlllIIIlll[lIIIlllIIlIll[11]] = lIlIIIllllIIIlI("dIpYMsNyuq9f589w1BXY1qRNOgWnc9vL", "pcXGh");
        lIIIlllIIIlll[lIIIlllIIlIll[13]] = lIlIIIllllIIIll("zvXo/BD8D7oE3HV5R0F7UAFT+mWCrec9dDOV6j5W23A=", "rzZTw");
        lIIIlllIIIlll[lIIIlllIIlIll[14]] = lIlIIIllllIIIll("Pn4UWWT3JGTrduP6HRtSaNIX8C+N8Pz2tp7P6yucops=", "rrQli");
        lIIIlllIIIlll[lIIIlllIIlIll[15]] = lIlIIIllllIIIIl("HTcNBi4cPwoGLQc=", "uXbrH");
        lIIIlllIIIlll[lIIIlllIIlIll[16]] = lIlIIIllllIIIlI("PCBxGedazwQ=", "MnYfT");
        lIIIlllIIIlll[lIIIlllIIlIll[17]] = lIlIIIllllIIIIl("fRc/NCYQJQEFcycgGj86GWwcMCYDbAs3JBlG", "wLoXS");
        lIIIlllIIIlll[lIIIlllIIlIll[21]] = lIlIIIllllIIIlI("NuQAqoKySK/J9Vqh3BkzfKwKUprsDy4P", "mayjo");
        lIIIlllIIIlll[lIIIlllIIlIll[22]] = lIlIIIllllIIIlI("Wyv4iEB1MaStcF3cvszTJVD2PF3aeq+sZT5fZKvoPvQ=", "CyjQd");
        lIIIlllIIIlll[lIIIlllIIlIll[23]] = lIlIIIllllIIIll("2Cs1Ml4R0qyiWf3VWUOe4cPflkFzwnnN", "RqQIp");
        lIIIlllIIIlll[lIIIlllIIlIll[24]] = lIlIIIllllIIIIl("ED9QCi8CHlFvRn1y", "GZpNf");
        lIIIlllIIIlll[lIIIlllIIlIll[25]] = lIlIIIllllIIIll("+7KG65yEjuM02IlzCY2OSu5A5MFp3/1hTV5GnUOA2oi2Qziy+R/BhzOtYMj29QX2oRuBHp8IuQYzUYsWmAltXxACUdS39QIlo/yRIwHQShbwCDniVnSlug==", "xewWC");
        lIIIlllIIIlll[lIIIlllIIlIll[26]] = lIlIIIllllIIIll("Y86WQj5XvXHFeMihlF7/fEYIyptp86WXAmT6IFp9iGZ4dXUmBJOkIYzka6o7wMh9Gk+BpEg299hPO1YisftogO5F52Ihez0MouALeiz1YzociWpTXA2lVuzIi94tIdprijrXS3FePmxY/KoRVSuzneCfw3w0zwxjsIPNGRk4jlI=", "KXRBX");
        lIIIlllIIIlll[lIIIlllIIlIll[27]] = lIlIIIllllIIIll("uVcejJIP6qCvvSbCPR6/igdkHmnaI/RD", "bxjXH");
        lIIIlllIIIlll[lIIIlllIIlIll[28]] = lIlIIIllllIIIIl("CSMnSTpKMCwPLQJiPQYvHg==", "jBInN");
        lIIIlllIIIlll[lIIIlllIIlIll[29]] = lIlIIIllllIIIIl("ECsaFQ==", "TDugU");
        lIIIlllIIIlll[lIIIlllIIlIll[30]] = lIlIIIllllIIIlI("CJtV79P0kww=", "rongC");
        lIIIlllIIIlll[lIIIlllIIlIll[18]] = lIlIIIllllIIIIl("DQIPKw==", "BrjEj");
        lIIIlllIIIlll[lIIIlllIIlIll[31]] = lIlIIIllllIIIIl("LhM1AEQ+Dj8X", "zaPed");
        lIIIlllIIIlll[lIIIlllIIlIll[32]] = lIlIIIllllIIIll("BalUm4oZGrztgFSbq+DGlA==", "AOrer");
        lIIIlllIIIlll[lIIIlllIIlIll[33]] = lIlIIIllllIIIIl("DhUnLA==", "AeBBO");
        lIIIlllIIIlll[lIIIlllIIlIll[34]] = lIlIIIllllIIIll("Z6SfqynvrXX5+HHoZ4nJg6oRpSK4bqFB", "ZSdmP");
        lIIIlllIIIlll[lIIIlllIIlIll[37]] = lIlIIIllllIIIIl("MgIUIjM3F0Y0PT4LRjUnPg==", "SnfGR");
        lIIIlllIIIlll[lIIIlllIIlIll[39]] = lIlIIIllllIIIlI("0s4HD5WJf98=", "JsWtl");
        lIIIlllIIIlll[lIIIlllIIlIll[40]] = lIlIIIllllIIIlI("1t1tGneyPc0=", "YSeYw");
        lIIIlllIIIlll[lIIIlllIIlIll[41]] = lIlIIIllllIIIll("Zb8dCSprxSk=", "oWoZA");
        lIIIlllIIIlll[lIIIlllIIlIll[42]] = lIlIIIllllIIIIl("", "uqmOE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIlIIIlllllIllI();
        lIlIIIlllllIlIl();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = lIIIlllIIlIll[4];
        g = System.currentTimeMillis();
        h = lIIIlllIIIlll[lIIIlllIIlIll[42]];
        f2i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        M[] mArr = new M[lIIIlllIIlIll[5]];
        mArr[lIIIlllIIlIll[4]] = new P();
        o = mArr;
    }

    private static boolean lIlIIIllllllIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIlIIIllllllIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0004e.x();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (lIlIIIllllllIIl(Players.getNearest(player -> {
            if (lIlIIlIIIIIIIlI(player, local) && lIlIIIllllllIll(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = lIIIlllIIlIll[5];
                "".length();
                return ((((133 + 72) - 121) + 65) ^ (((39 + 96) - 47) + 57)) != ((238 ^ 187) ^ (77 ^ 28)) ? ((((85 + 198) - 206) + 135) ^ (((174 + 149) - 210) + 80)) & (((((140 + 148) - 275) + 161) ^ (((25 + 39) - (-50)) + 73)) ^ (-" ".length())) : r0;
            }
            return lIIIlllIIlIll[4];
        })) && (!lIlIIIlllllllll(Game.getWildyLevel()) || lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(O.in), lIIIlllIIlIll[18]))) {
            int[] iArr = new int[lIIIlllIIlIll[5]];
            iArr[lIIIlllIIlIll[4]] = lIIIlllIIlIll[19];
            if (lIlIIIllllllIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllIIlIll[5]];
                iArr2[lIIIlllIIlIll[4]] = lIIIlllIIlIll[20];
            }
            if (lIlIIIllllllIII(this.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIlIIIllllllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        C0004e.H();
    }

    private static boolean lIlIIIlllllllIl(int i2, int i3) {
        return i2 > i3;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    private static boolean lIlIIIlllllllII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIIllllllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIlllllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIllllllIll(int i2) {
        return i2 != 0;
    }

    private static String lIlIIIllllIIIIl(String lllllllllllllllIIIIIllIIIllllIIl, String lllllllllllllllIIIIIllIIIllllIII) {
        String lllllllllllllllIIIIIllIIIllllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIllIIIllllIII.toCharArray();
        int lllllllllllllllIIIIIllIIIlllIlIl = lIIIlllIIlIll[4];
        char[] charArray2 = lllllllllllllllIIIIIllIIIllllIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllIIlIll[4];
        while (lIlIIlIIIIIIIll(i2, length)) {
            char lllllllllllllllIIIIIllIIIllllIlI = charArray2[i2];
            sb.append((char) (lllllllllllllllIIIIIllIIIllllIlI ^ charArray[lllllllllllllllIIIIIllIIIlllIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIIllIIIlllIlIl++;
            i2++;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIllllllllI(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = lIIIlllIIlIll[4];
        System.out.print(lIIIlllIIIlll[lIIIlllIIlIll[13]]);
        this.u.add(this.v);
        "".length();
        a.clear();
        System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[14]]);
        a.clear();
        List<M> list = a;
        C0010k[] c0010kArr = new C0010k[lIIIlllIIlIll[5]];
        c0010kArr[lIIIlllIIlIll[4]] = new C0010k();
        Collections.addAll(list, c0010kArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static void lIlIIIlllllIllI() {
        lIIIlllIIlIll = new int[44];
        lIIIlllIIlIll[0] = (-((-29733) & 30181)) & (-28697) & 32255;
        lIIIlllIIlIll[1] = (-4137) & 7736;
        lIIIlllIIlIll[2] = 107 ^ 85;
        lIIIlllIIlIll[3] = (35 ^ 6) ^ (129 ^ 145);
        lIIIlllIIlIll[4] = ((((86 + 59) - (-43)) + 39) ^ (((10 + 122) - 8) + 62)) & (((((159 + 132) - 125) + 33) ^ (((134 + 41) - 111) + 94)) ^ (-" ".length()));
        lIIIlllIIlIll[5] = " ".length();
        lIIIlllIIlIll[6] = 249 ^ 157;
        lIIIlllIIlIll[7] = (-((-2065) & 32469)) & (-2049) & 32733;
        lIIIlllIIlIll[8] = (-((-1017) & 32767)) & (-18) & 32767;
        lIIIlllIIlIll[9] = "  ".length();
        lIIIlllIIlIll[10] = "   ".length();
        lIIIlllIIlIll[11] = (218 ^ 155) ^ (37 ^ 96);
        lIIIlllIIlIll[12] = (-((-201) & 18924)) & (-4229) & 23551;
        lIIIlllIIlIll[13] = 161 ^ 164;
        lIIIlllIIlIll[14] = (46 ^ 6) ^ (30 ^ 48);
        lIIIlllIIlIll[15] = 30 ^ 25;
        lIIIlllIIlIll[16] = 120 ^ 112;
        lIIIlllIIlIll[17] = (36 ^ 73) ^ (196 ^ 160);
        lIIIlllIIlIll[18] = 136 ^ 156;
        lIIIlllIIlIll[19] = (-((-3655) & 12238)) & (-18497) & 27615;
        lIIIlllIIlIll[20] = (-((-2601) & 31535)) & (-3137) & 32607;
        lIIIlllIIlIll[21] = (107 ^ 88) ^ (180 ^ 141);
        lIIIlllIIlIll[22] = (((68 + 7) - 63) + 130) ^ (((69 + 46) - 102) + 120);
        lIIIlllIIlIll[23] = 46 ^ 34;
        lIIIlllIIlIll[24] = (((62 + 60) - 14) + 61) ^ (((82 + 19) - (-17)) + 46);
        lIIIlllIIlIll[25] = 180 ^ 186;
        lIIIlllIIlIll[26] = 204 ^ 195;
        lIIIlllIIlIll[27] = 75 ^ 91;
        lIIIlllIIlIll[28] = (((49 + 3) - 29) + 108) ^ (((106 + 39) - 105) + 106);
        lIIIlllIIlIll[29] = (135 ^ 143) ^ (115 ^ 105);
        lIIIlllIIlIll[30] = (91 ^ 118) ^ (117 ^ 75);
        lIIIlllIIlIll[31] = (8 ^ 79) ^ (126 ^ 44);
        lIIIlllIIlIll[32] = (247 ^ 170) ^ (77 ^ 6);
        lIIIlllIIlIll[33] = 40 ^ 63;
        lIIIlllIIlIll[34] = (((100 + 66) - 48) + 10) ^ (((127 + 94) - 162) + 93);
        lIIIlllIIlIll[35] = (-((-3617) & 7807)) & (-8193) & 15359;
        lIIIlllIIlIll[36] = (-20825) & 24063;
        lIIIlllIIlIll[37] = (47 ^ 5) ^ (172 ^ 159);
        lIIIlllIIlIll[38] = (-((-16555) & 23291)) & (-25601) & 32767;
        lIIIlllIIlIll[39] = 86 ^ 76;
        lIIIlllIIlIll[40] = 168 ^ 179;
        lIIIlllIIlIll[41] = (1 ^ 110) ^ (31 ^ 108);
        lIIIlllIIlIll[42] = 119 ^ 106;
        lIIIlllIIlIll[43] = (126 ^ 60) ^ (93 ^ 1);
    }
}
