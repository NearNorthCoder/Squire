package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0004e;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0018s;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0023x;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.F;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.X;
import h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Z;
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
@PluginDescriptor(name = "Squire Shaman Builder", enabledByDefault = false)
@SquireUtil
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:gg/squire/account/AccBuilderShamans.class */
public class AccBuilderShamans extends Script {
    private static /* synthetic */ int[] lIlIlIIIll;

    /* renamed from: h  reason: collision with root package name */
    public static /* synthetic */ String f2h;
    public static /* synthetic */ String j;
    private static /* synthetic */ String[] lIlIlIIIlI;
    public static /* synthetic */ String k;
    public static /* synthetic */ int f;
    public static /* synthetic */ long b;
    public static /* synthetic */ String m;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ String l;
    public static /* synthetic */ String c;
    private static /* synthetic */ K[] o;
    public static /* synthetic */ boolean d;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    static /* synthetic */ int n;
    @Inject
    private /* synthetic */ Client t;
    @Inject
    private /* synthetic */ OverlayManager u;
    /* synthetic */ boolean s;
    public static /* synthetic */ long g;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    public /* synthetic */ BuilderConfig p;
    public static /* synthetic */ List<K> a;
    /* synthetic */ WorldArea q = new WorldArea(lIlIlIIIll[0], lIlIlIIIll[1], lIlIlIIIll[2], lIlIlIIIll[3], lIlIlIIIll[4]);
    /* synthetic */ String r = lIlIlIIIlI[lIlIlIIIll[4]];

    private static boolean lIIIllllllllI(int i2) {
        return i2 <= 0;
    }

    private static boolean lIIlIIIIIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[22]]) ? 1 : 0)) {
            System.out.println(lIlIlIIIlI[lIlIlIIIll[23]]);
            d = lIlIlIIIll[5];
        }
        if (lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[24]]) ? 1 : 0)) {
            System.out.println(lIlIlIIIlI[lIlIlIIIll[25]]);
            if (lIIIlllllIlll(Game.getWildyLevel()) && lIIIlllllIlll(Inventory.contains(item -> {
                return item.getName().contains(lIlIlIIIlI[lIlIlIIIll[41]]);
            }) ? 1 : 0)) {
                d = lIlIlIIIll[5];
                System.out.println(lIlIlIIIlI[lIlIlIIIll[26]]);
            }
            if (!lIIIllllllllI(Game.getWildyLevel()) || lIIIllllllIlI(Inventory.contains(item2 -> {
                return item2.getName().contains(lIlIlIIIlI[lIlIlIIIll[40]]);
            }) ? 1 : 0)) {
                d = lIlIlIIIll[4];
                System.out.println(lIlIlIIIlI[lIlIlIIIll[27]]);
            }
        }
        if (lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[28]]) ? 1 : 0) && lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(F.iJ), lIlIlIIIll[21])) {
            String[] strArr = new String[lIlIlIIIll[5]];
            strArr[lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[29]];
            if (lIIIllllllIII(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[lIlIlIIIll[5]];
                strArr2[lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[30]];
                TileObjects.getNearest(strArr2).interact(lIlIlIIIlI[lIlIlIIIll[18]]);
                Time.sleepTicks(lIlIlIIIll[11]);
                "".length();
            }
            String[] strArr3 = new String[lIlIlIIIll[5]];
            strArr3[lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[31]];
            if (lIIIllllllIII(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[lIlIlIIIll[5]];
                strArr4[lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[32]];
                TileObjects.getNearest(strArr4).interact(lIlIlIIIlI[lIlIlIIIll[33]]);
                Time.sleepTicks(lIlIlIIIll[10]);
                "".length();
            }
        }
        if (lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[34]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(lIlIlIIIll[35], lIlIlIIIll[36], lIlIlIIIll[4]));
            "".length();
            Time.sleepTicks(lIlIlIIIll[5]);
            "".length();
        }
        if (lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[37]]) ? 1 : 0)) {
            int[] iArr = new int[lIlIlIIIll[5]];
            iArr[lIlIlIIIll[4]] = lIlIlIIIll[38];
            if (lIIIllllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIIIll[5]];
                iArr2[lIlIlIIIll[4]] = lIlIlIIIll[38];
                Inventory.getFirst(iArr2).interact(lIlIlIIIlI[lIlIlIIIll[39]]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIIIlllllllll(combatLevel, i3 - i2) && lIIIlllllllIl(combatLevel, i4)) {
            ?? r0 = lIlIlIIIll[5];
            "".length();
            return (-(168 ^ 173)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIIIll[4];
    }

    private static boolean lIIIllllllIll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIlllllllII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIIIllllllIIl(Object obj) {
        return obj == null;
    }

    private static void lIIIlllllIlIl() {
        lIlIlIIIll = new int[44];
        lIlIlIIIll[0] = (-((-3943) & 12263)) & (-21009) & 32439;
        lIlIlIIIll[1] = (-4175) & 7774;
        lIlIlIIIll[2] = (113 ^ 119) ^ (146 ^ 170);
        lIlIlIIIll[3] = 4 ^ 49;
        lIlIlIIIll[4] = ((121 ^ 16) ^ (192 ^ 184)) & (((67 ^ 117) ^ (136 ^ 175)) ^ (-" ".length()));
        lIlIlIIIll[5] = " ".length();
        lIlIlIIIll[6] = (((21 + 13) - (-111)) + 75) ^ (((120 + 9) - 121) + 176);
        lIlIlIIIll[7] = (-((-569) & 5887)) & (-2593) & 8191;
        lIlIlIIIll[8] = (-((-6697) & 32315)) & (-6149) & 32766;
        lIlIlIIIll[9] = "  ".length();
        lIlIlIIIll[10] = "   ".length();
        lIlIlIIIll[11] = 82 ^ 86;
        lIlIlIIIll[12] = (-20899) & 21498;
        lIlIlIIIll[13] = (99 ^ 39) ^ (241 ^ 176);
        lIlIlIIIll[14] = 116 ^ 114;
        lIlIlIIIll[15] = (119 ^ 69) ^ (38 ^ 19);
        lIlIlIIIll[16] = 180 ^ 188;
        lIlIlIIIll[17] = (18 ^ 39) ^ (134 ^ 186);
        lIlIlIIIll[18] = 153 ^ 141;
        lIlIlIIIll[19] = (-17448) & 17983;
        lIlIlIIIll[20] = (-4163) & 4699;
        lIlIlIIIll[21] = 166 ^ 172;
        lIlIlIIIll[22] = 75 ^ 64;
        lIlIlIIIll[23] = (83 ^ 118) ^ (74 ^ 99);
        lIlIlIIIll[24] = 80 ^ 93;
        lIlIlIIIll[25] = (111 ^ 88) ^ (128 ^ 185);
        lIlIlIIIll[26] = (250 ^ 186) ^ (26 ^ 85);
        lIlIlIIIll[27] = (135 ^ 137) ^ (145 ^ 143);
        lIlIlIIIll[28] = 144 ^ 129;
        lIlIlIIIll[29] = 3 ^ 17;
        lIlIlIIIll[30] = (97 ^ 87) ^ (186 ^ 159);
        lIlIlIIIll[31] = 144 ^ 133;
        lIlIlIIIll[32] = (((50 + 48) - 44) + 135) ^ (((46 + 143) - 81) + 63);
        lIlIlIIIll[33] = 208 ^ 199;
        lIlIlIIIll[34] = 111 ^ 119;
        lIlIlIIIll[35] = (-((-6841) & 32509)) & (-27) & 28671;
        lIlIlIIIll[36] = (-65) & 3303;
        lIlIlIIIll[37] = 3 ^ 26;
        lIlIlIIIll[38] = (-((-12971) & 32443)) & (-12865) & 32767;
        lIlIlIIIll[39] = 11 ^ 17;
        lIlIlIIIll[40] = 23 ^ 12;
        lIlIlIIIll[41] = 52 ^ 40;
        lIlIlIIIll[42] = 159 ^ 130;
        lIlIlIIIll[43] = (23 ^ 121) ^ (7 ^ 119);
    }

    private static boolean lIIIlllllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIIlllllIlII() {
        lIlIlIIIlI = new String[lIlIlIIIll[43]];
        lIlIlIIIlI[lIlIlIIIll[4]] = lIIIlllllIIIl("GC05OBVKdmIsDwM6IjoCXjoiJUkRKSRnERU7JScJGypieVRBbHl5XkBteHhXQWx0eVRDYGI8AgoeBC4AI2h8DSc/OAx6IAITDgEAFD8FACwKGhhxDwkbdSIEKR05ehc/bRo7DAppOAUDGmsVKgwxAHsJKikGHHgRXQ==", "pYMHf");
        lIlIlIIIlI[lIlIlIIIll[5]] = lIIIlllllIIlI("44nnxqfBKUE=", "FLFAy");
        lIlIlIIIlI[lIlIlIIIll[9]] = lIIIlllllIIIl("Ai0/NTEqLSIzcwEBbCMyNColOjQ=", "FDLTS");
        lIlIlIIIlI[lIlIlIIIll[10]] = lIIIlllllIIll("P+nGqhilqRcgrGkouDnr5iSdK0k7JcNt", "QJurI");
        lIlIlIIIlI[lIlIlIIIll[11]] = lIIIlllllIIll("YZy+WpCRF0seCIWP+4pej4QCYEC/rk2u", "NDDez");
        lIlIlIIIlI[lIlIlIIIll[13]] = lIIIlllllIIIl("WzcjBzw2BR02aQEABgwgP0wAHygjGBoFLnEZA2E=", "QlskI");
        lIlIlIIIlI[lIlIlIIIll[14]] = lIIIlllllIIlI("ptHkYXySXb900pTf12zoAIHgKKeHwRbjP/0g+p7jq9me366tKQ3bVQ==", "TfknP");
        lIlIlIIIlI[lIlIlIIIll[15]] = lIIIlllllIIIl("CwA8IwQKCDsjBxE=", "coSWb");
        lIlIlIIIlI[lIlIlIIIll[16]] = lIIIlllllIIIl("Bx4bAzUHFA==", "bpzaY");
        lIlIlIIIlI[lIlIlIIIll[17]] = lIIIlllllIIll("LsjWqeYY/2TNDfC8cad4V8UbsxwfOXlOhh8gJC53HEs=", "gFGfc");
        lIlIlIIIlI[lIlIlIIIll[21]] = lIIIlllllIIlI("Tmt21FVWwv6geH+nVp6zJA==", "JkFHH");
        lIlIlIIIlI[lIlIlIIIll[22]] = lIIIlllllIIlI("19mdTkWSrfSTf3xYoOm8Bw/KB0WGfMMw", "TKOYQ");
        lIlIlIIIlI[lIlIlIIIll[23]] = lIIIlllllIIIl("OCodRzAYKhwAPVYiBgsxViMGFXUUMBAOOxE=", "vEigU");
        lIlIlIIIlI[lIlIlIIIll[24]] = lIIIlllllIIlI("+U+2Xoj1e6f8LlrXKZbmWBFEBzMCfiRF", "IwSMi");
        lIlIlIIIlI[lIlIlIIIll[25]] = lIIIlllllIIIl("EiFwLi4AAHFLR39s", "EDPjg");
        lIlIlIIIlI[lIlIlIIIll[26]] = lIIIlllllIIlI("tBCU0V+ze8rVDxeKjoMGbPYsfzzDPtv+iPucruLx2g92W6CKFPcWF99Ns2RHk5WNCYpO0snHWZgQFB/o2BeGyouvLK3hsdBDqmeBgCoajVGZAFM402GQJQ==", "qqdpS");
        lIlIlIIIlI[lIlIlIIIll[27]] = lIIIlllllIIlI("W4txHUBOy6nyGYpndKRM2mtJLWg/PCB4RplSugov2cE1EFEzoylvudlxhJvrnoUD03VyafSjg6kyYyotkfXgnzxRpnV6GWHT+PLa0rLwHgRPylJu5kQZ8/87nojRUyB45c7tk5R5V4hCg1kDoE29NWTd2T8BuXE9YFeymPNYGp4=", "HdXsL");
        lIlIlIIIlI[lIlIlIIIll[28]] = lIIIlllllIIIl("CRkrZQRKCiAjEwJYMSoRHg==", "jxEBp");
        lIlIlIIIlI[lIlIlIIIll[29]] = lIIIlllllIIIl("ER0ICA==", "UrgzY");
        lIlIlIIIlI[lIlIlIIIll[30]] = lIIIlllllIIIl("BgY3Ng==", "BiXDd");
        lIlIlIIIlI[lIlIlIIIll[18]] = lIIIlllllIIlI("DWa+/FtE3Xo=", "FsnFe");
        lIlIlIIIlI[lIlIlIIIll[31]] = lIIIlllllIIlI("pthmIElP9JdMjd/jGUieDg==", "gvZIi");
        lIlIlIIIlI[lIlIlIIIll[32]] = lIIIlllllIIIl("ISgxF0oxNTsA", "uZTrj");
        lIlIlIIIlI[lIlIlIIIll[33]] = lIIIlllllIIll("LPFNxsmNWu0=", "LXEpY");
        lIlIlIIIlI[lIlIlIIIll[34]] = lIIIlllllIIll("esc+4RaLTRy25nYdxbq09Z3kgdkn/BoR", "pKPzY");
        lIlIlIIIlI[lIlIlIIIll[37]] = lIIIlllllIIIl("FCYEChYRM1YcGBgvVh0CGA==", "uJvow");
        lIlIlIIIlI[lIlIlIIIll[39]] = lIIIlllllIIlI("ouqspOEeNaE=", "zRUJu");
        lIlIlIIIlI[lIlIlIIIll[40]] = lIIIlllllIIlI("2VR3483AQ7w=", "hToob");
        lIlIlIIIlI[lIlIlIIIll[41]] = lIIIlllllIIIl("LBwANjMADg==", "nirXZ");
        lIlIlIIIlI[lIlIlIIIll[42]] = lIIIlllllIIlI("b6woG/CNpSg=", "kAKQG");
    }

    private static boolean lIIIllllllIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = lIlIlIIIll[4];
        System.out.print(lIlIlIIIlI[lIlIlIIIll[13]]);
        this.u.add(this.v);
        "".length();
        a.clear();
        System.out.println(lIlIlIIIlI[lIlIlIIIll[14]]);
        a.clear();
        List<K> list = a;
        C0018s[] c0018sArr = new C0018s[lIlIlIIIll[5]];
        c0018sArr[lIlIlIIIll[4]] = new C0018s();
        Collections.addAll(list, c0018sArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    protected int loop() {
        if (lIIIlllllIllI(Game.getState(), GameState.LOGGED_IN)) {
            if (lIIIlllllIlll(a.isEmpty() ? 1 : 0)) {
                if (!lIIIllllllIII(j) || lIIIllllllIIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIIIllllllIlI(a.get(lIlIlIIIll[4]).af() ? 1 : 0)) {
                    if (lIIIllllllIlI(a.get(lIlIlIIIll[4]).ae().contains(lIlIlIIIlI[lIlIlIIIll[5]]) ? 1 : 0)) {
                        f += lIlIlIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(lIlIlIIIll[4]).ae() + " goal");
                    a.remove(lIlIlIIIll[4]);
                    "".length();
                    return lIlIlIIIll[6];
                } else if (lIIIlllllIllI(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIIIllllllIlI(C0004e.x() ? 1 : 0) && lIIIlllllIlll(d ? 1 : 0) && lIIIllllllIll(C0004e.j(lIlIlIIIll[7]), lIlIlIIIll[8]) && lIIIlllllIlll(Dialog.isOpen() ? 1 : 0)) {
                        c = lIlIlIIIlI[lIlIlIIIll[9]];
                        C0004e.y();
                        Time.sleepTicks(lIlIlIIIll[5]);
                        "".length();
                        "".length();
                        if (((true ^ true) & ((true ^ true) ^ true)) == (true ^ true)) {
                            return (132 ^ 130) & ((63 ^ 57) ^ (-1));
                        }
                    }
                    int i2 = lIlIlIIIll[4];
                    try {
                        i2 = a.get(lIlIlIIIll[4]).ad();
                        "".length();
                        if (" ".length() == 0) {
                            return (146 ^ 139) & ((217 ^ 192) ^ (-1));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return i2;
                }
            }
            if (lIIIllllllIlI(a.isEmpty() ? 1 : 0)) {
                if (lIIIlllllllII(Players.getLocal().getWorldLocation().distanceTo(Z.ld), lIlIlIIIll[10])) {
                    c = lIlIlIIIlI[lIlIlIIIll[10]];
                    Movement.walkTo(Z.ld);
                    "".length();
                }
                if (lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(Z.ld), lIlIlIIIll[10])) {
                    c = lIlIlIIIlI[lIlIlIIIll[11]];
                }
            }
        }
        return lIlIlIIIll[12];
    }

    private static boolean lIIIlllllllll(int i2, int i3) {
        return i2 >= i3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIIlIIIIIIIII(loginStateChanged.getIndex(), lIlIlIIIll[25]) && lIIIlllllIlll(n)) {
            C0004e.a(this.r, "rsn: " + k + " account has been banned? - Acc builder SHAMANS");
            n += lIlIlIIIll[5];
        }
    }

    private static String lIIIlllllIIIl(String lllllllllllllllllllIllllIIIIIIII, String lllllllllllllllllllIlllIllllllll) {
        String lllllllllllllllllllIllllIIIIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllIlllllllI = new StringBuilder();
        char[] lllllllllllllllllllIlllIllllllIl = lllllllllllllllllllIlllIllllllll.toCharArray();
        int lllllllllllllllllllIlllIllllllII = lIlIlIIIll[4];
        char[] charArray = lllllllllllllllllllIllllIIIIIIII2.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlIIIll[4];
        while (lIIlIIIIIIIlI(i2, length)) {
            char lllllllllllllllllllIllllIIIIIIIl = charArray[i2];
            lllllllllllllllllllIlllIlllllllI.append((char) (lllllllllllllllllllIllllIIIIIIIl ^ lllllllllllllllllllIlllIllllllIl[lllllllllllllllllllIlllIllllllII % lllllllllllllllllllIlllIllllllIl.length]));
            "".length();
            lllllllllllllllllllIlllIllllllII++;
            i2++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIlllIlllllllI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIIIllllllIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0004e.w();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (lIIIllllllIII(Players.getNearest(player -> {
            if (lIIlIIIIIIIIl(player, local) && lIIIllllllIlI(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = lIlIlIIIll[5];
                "".length();
                return (((26 ^ 126) ^ (241 ^ 140)) & (((102 ^ 111) ^ (41 ^ 57)) ^ (-" ".length()))) != 0 ? ((((36 + 74) - 17) + 162) ^ (((160 + 116) - 272) + 183)) & (((72 ^ 28) ^ (148 ^ 132)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIll[4];
        })) && (!lIIIllllllllI(Game.getWildyLevel()) || lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(X.kN), lIlIlIIIll[18]))) {
            int[] iArr = new int[lIlIlIIIll[5]];
            iArr[lIlIlIIIll[4]] = lIlIlIIIll[19];
            if (lIIIlllllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIIIll[5]];
                iArr2[lIlIlIIIll[4]] = lIlIlIIIll[20];
            }
            if (lIIIlllllIlll(this.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIIIllllllIlI(Dialog.isOpen() ? 1 : 0) && lIIIllllllIII(Dialog.getText()) && lIIIllllllIlI(Dialog.getText().contains(lIlIlIIIlI[lIlIlIIIll[21]]) ? 1 : 0)) {
            C0023x.dP = lIlIlIIIll[5];
        }
        C0004e.G();
    }

    private static boolean lIIlIIIIIIIII(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIIIlllllIlIl();
        lIIIlllllIlII();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = lIlIlIIIll[4];
        g = System.currentTimeMillis();
        f2h = lIlIlIIIlI[lIlIlIIIll[42]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        K[] kArr = new K[lIlIlIIIll[5]];
        kArr[lIlIlIIIll[4]] = new Z();
        o = kArr;
    }

    private static String lIIIlllllIIlI(String lllllllllllllllllllIllllIIIlIIII, String lllllllllllllllllllIllllIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIllllIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIllllIIIlIIlI.init(lIlIlIIIll[9], secretKeySpec);
            return new String(lllllllllllllllllllIllllIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllllIIIlIIIl) {
            lllllllllllllllllllIllllIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllllIIll(String lllllllllllllllllllIllllIIIlllIl, String lllllllllllllllllllIllllIIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllIIIlllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIll[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllllIIIllllI) {
            lllllllllllllllllllIllllIIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIIlllllIlll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.u.remove(this.v);
        "".length();
        d = lIlIlIIIll[5];
        o = new K[lIlIlIIIll[4]];
        n = lIlIlIIIll[4];
        f = lIlIlIIIll[4];
        System.out.print(lIlIlIIIlI[lIlIlIIIll[17]]);
        super.stop();
    }

    private static boolean lIIIllllllIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIIIllllllIlI(configChanged.getGroup().equalsIgnoreCase(lIlIlIIIlI[lIlIlIIIll[15]]) ? 1 : 0) && lIIIllllllIlI(configChanged.getKey().contains(lIlIlIIIlI[lIlIlIIIll[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (!lIIIllllllIlI(this.s ? 1 : 0)) {
                d = lIlIlIIIll[5];
                return;
            }
            d = lIlIlIIIll[4];
            "".length();
            if ("  ".length() > (101 ^ 97)) {
            }
        }
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    private static boolean lIIIlllllllIl(int i2, int i3) {
        return i2 <= i3;
    }
}
