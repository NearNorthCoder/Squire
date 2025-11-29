package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/C.class */
public class C {
    private static final /* synthetic */ int bc;
    private static final /* synthetic */ int bb;
    private static /* synthetic */ int[] llIIllIIIIl;
    private final /* synthetic */ Map<EnumC0056e, Integer> bd = new HashMap();
    private /* synthetic */ int be;
    private /* synthetic */ int bf;
    private static /* synthetic */ String[] llIIllIIIII;

    private static boolean lIlIIIIlllllll(int i) {
        return i == 0;
    }

    private static boolean lIlIIIlIIIIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean j(int llllllllllllllllIIllllIllIlIlIIl) {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int llllllllllllllllIIllllIllIlIIllI = llIIllIIIIl[2];
        while (lIlIIIIlllllIl(llllllllllllllllIIllllIllIlIIllI, length)) {
            if (lIlIIIlIIIIIII(mapRegions[llllllllllllllllIIllllIllIlIIllI], llllllllllllllllIIllllIllIlIlIIl)) {
                return llIIllIIIIl[1];
            }
            llllllllllllllllIIllllIllIlIIllI++;
            "".length();
            if (0 != 0) {
                return ((((81 + 29) - 93) + 113) ^ (((102 + 84) - 110) + 67)) & (((183 ^ 153) ^ (166 ^ 133)) ^ (-" ".length()));
            }
        }
        return llIIllIIIIl[2];
    }

    private static boolean lIlIIIlIIIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean al() {
        if (lIlIIIIllllIll(Static.getClient().getTickCount() - this.be, llIIllIIIIl[0])) {
            ?? r0 = llIIllIIIIl[1];
            "".length();
            return (((51 ^ 117) ^ (4 ^ 125)) & (((242 ^ 176) ^ (116 ^ 9)) ^ (-" ".length()))) < 0 ? ((((60 + 35) - 85) + 133) ^ (((49 + 93) - 98) + 102)) & (((219 ^ 135) ^ (131 ^ 194)) ^ (-" ".length())) : r0;
        }
        return llIIllIIIIl[2];
    }

    private static boolean lIlIIIIlllllIl(int i, int i2) {
        return i < i2;
    }

    public void a(EnumC0056e enumC0056e) {
        Widget at = at();
        if (!lIlIIIIlllllII(at) || lIlIIIlIIIIIll(at.getChildren())) {
            return;
        }
        Widget[] children = at.getChildren();
        int length = children.length;
        int i = llIIllIIIIl[2];
        while (lIlIIIIlllllIl(i, length)) {
            Widget widget = children[i];
            if (lIlIIIIllllllI(enumC0056e.p().contains(Integer.valueOf(widget.getItemId())) ? 1 : 0)) {
                if (!lIlIIIlIIIIIII(widget.getItemId(), llIIllIIIIl[10])) {
                    this.bd.put(enumC0056e, Integer.valueOf(this.bd.getOrDefault(enumC0056e, Integer.valueOf(llIIllIIIIl[2])).intValue() - llIIllIIIIl[1]));
                    "".length();
                    if (lIlIIIlIIIIlII(this.bd.get(enumC0056e).intValue())) {
                        this.bd.remove(enumC0056e);
                        "".length();
                    }
                    widget.interact(llIIllIIIII[llIIllIIIIl[2]]);
                    return;
                }
                "".length();
                if ("  ".length() == " ".length()) {
                    return;
                }
            }
            i++;
            "".length();
            if (" ".length() == ((((7 + 67) - 17) + 130) ^ (((120 + 15) - 35) + 91))) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean am() {
        if (lIlIIIIllllIll(Static.getClient().getTickCount() - this.bf, llIIllIIIIl[0]) && lIlIIIIllllIll(Static.getClient().getTickCount() - this.be, llIIllIIIIl[0])) {
            ?? r0 = llIIllIIIIl[1];
            "".length();
            return (-(11 ^ 15)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIIIIl[2];
    }

    public Widget at() {
        return Widgets.get(llIIllIIIIl[11], llIIllIIIIl[12]);
    }

    public boolean au() {
        return Widgets.isVisible(at());
    }

    private static void lIlIIIIllllIIl() {
        llIIllIIIII = new String[llIIllIIIIl[13]];
        llIIllIIIII[llIIllIIIIl[2]] = lIlIIIIlllIlll("gI72WNGTclhJ/K8ySjpUGA==", "DkGom");
        llIIllIIIII[llIIllIIIIl[1]] = lIlIIIIllllIII("2P5VOt5urLY=", "VULsz");
    }

    public Map<EnumC0056e, Integer> av() {
        return this.bd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean ap() {
        int i;
        List all = NPCs.getAll(npc -> {
            if (lIlIIIlIIIIlIl(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIllIIIIl[1];
                "".length();
                return " ".length() < " ".length() ? ((127 ^ 89) ^ (72 ^ 12)) & (((((42 + 189) - 182) + 151) ^ (((144 + 80) - 202) + 148)) ^ (-" ".length())) : r0;
            }
            return llIIllIIIIl[2];
        });
        if (lIlIIIIlllllII(NPCs.getNearest(npc2 -> {
            return npc2.getName().contains(llIIllIIIII[llIIllIIIIl[1]]);
        }))) {
            if (lIlIIIIlllllIl(Combat.getCurrentHealth(), llIIllIIIIl[3])) {
                ?? r0 = llIIllIIIIl[1];
                "".length();
                return "  ".length() != "  ".length() ? ((217 ^ 161) ^ (10 ^ 34)) & (((115 ^ 117) ^ (98 ^ 52)) ^ (-" ".length())) : r0;
            }
            return llIIllIIIIl[2];
        } else if (lIlIIIIllllllI(aq() ? 1 : 0)) {
            if (lIlIIIIlllllIl(Combat.getCurrentHealth(), llIIllIIIIl[4])) {
                ?? r02 = llIIllIIIIl[1];
                "".length();
                return (-"  ".length()) > 0 ? ((73 ^ 89) ^ (16 ^ 77)) & (((((220 + 73) - 194) + 127) ^ (((30 + 128) - 155) + 172)) ^ (-" ".length())) : r02;
            }
            return llIIllIIIIl[2];
        } else {
            if (lIlIIIIllllllI(all.isEmpty() ? 1 : 0)) {
                i = llIIllIIIIl[5];
                "".length();
                if ((-" ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = llIIllIIIIl[6];
            }
            if (lIlIIIIlllllIl(Combat.getCurrentHealth(), i)) {
                ?? r03 = llIIllIIIIl[1];
                "".length();
                return " ".length() <= ((124 ^ 101) & ((126 ^ 103) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r03;
            }
            return llIIllIIIIl[2];
        }
    }

    public void ao() {
        this.bf = Static.getClient().getTickCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean as() {
        if (lIlIIIlIIIIIlI(Static.getClient().getTickCount() - this.bf)) {
            ?? r0 = llIIllIIIIl[1];
            "".length();
            return (-(26 ^ 30)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIIIIl[2];
    }

    private static String lIlIIIIlllIlll(String llllllllllllllllIIllllIlIlIlIllI, String llllllllllllllllIIllllIlIlIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIIIIl[13], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIlIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIlIlIlIlll) {
            llllllllllllllllIIllllIlIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIllllllI(int i) {
        return i != 0;
    }

    public void an() {
        this.be = Static.getClient().getTickCount();
    }

    static {
        lIlIIIIllllIlI();
        lIlIIIIllllIIl();
        bb = llIIllIIIIl[11];
        bc = llIIllIIIIl[12];
    }

    private static boolean lIlIIIIllllIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIIlllllII(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIlIIIlIIIIlIl(gameStateChanged.getGameState(), GameState.LOGGED_IN) && lIlIIIIlllllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.bd.clear();
        }
    }

    private static void lIlIIIIllllIlI() {
        llIIllIIIIl = new int[15];
        llIIllIIIIl[0] = 183 ^ 179;
        llIIllIIIIl[1] = " ".length();
        llIIllIIIIl[2] = ((((46 + 9) - (-191)) + 0) ^ (((105 + 166) - 259) + 172)) & (((((192 + 203) - 169) + 15) ^ (((112 + 49) - 60) + 90)) ^ (-" ".length()));
        llIIllIIIIl[3] = (13 ^ 64) ^ (((77 + 84) - 89) + 55);
        llIIllIIIIl[4] = 59 ^ 125;
        llIIllIIIIl[5] = 187 ^ 165;
        llIIllIIIIl[6] = 66 ^ 106;
        llIIllIIIIl[7] = (-16390) & 32085;
        llIIllIIIIl[8] = (-1196) & 16379;
        llIIllIIIIl[9] = 182 ^ 149;
        llIIllIIIIl[10] = -" ".length();
        llIIllIIIIl[11] = (-((-12117) & 32725)) & (-10261) & 31646;
        llIIllIIIIl[12] = (((167 + 123) - 108) + 1) ^ (((134 + 61) - 87) + 70);
        llIIllIIIIl[13] = "  ".length();
        llIIllIIIIl[14] = 101 ^ 109;
    }

    private static String lIlIIIIllllIII(String llllllllllllllllIIllllIlIllIIIll, String llllllllllllllllIIllllIlIllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIllllIlIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), llIIllIIIIl[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIIIIl[13], llllllllllllllllIIllllIlIllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIlIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIlIllIIlII) {
            llllllllllllllllIIllllIlIllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean aq() {
        if (!lIlIIIIlllllll(j(llIIllIIIIl[7]) ? 1 : 0) || lIlIIIIllllllI(j(llIIllIIIIl[8]) ? 1 : 0)) {
            ?? r0 = llIIllIIIIl[1];
            "".length();
            return (142 ^ 138) < 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
        }
        return llIIllIIIIl[2];
    }

    public void a(Widget widget) {
        if (!lIlIIIIlllllII(widget) || lIlIIIlIIIIIll(widget.getChildren())) {
            return;
        }
        Widget[] children = widget.getChildren();
        int length = children.length;
        int i = llIIllIIIIl[2];
        while (lIlIIIIlllllIl(i, length)) {
            Widget widget2 = children[i];
            int itemId = widget2.getItemId();
            if (lIlIIIlIIIIIII(itemId, llIIllIIIIl[10])) {
                "".length();
                if ((-"  ".length()) > 0) {
                    return;
                }
            } else {
                EnumC0056e c = EnumC0056e.c(itemId);
                this.bd.put(c, Integer.valueOf(this.bd.getOrDefault(c, Integer.valueOf(llIIllIIIIl[2])).intValue() + widget2.getItemQuantity()));
                "".length();
            }
            i++;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
    }

    private static boolean lIlIIIlIIIIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean ar() {
        if (lIlIIIlIIIIIIl(Combat.getCurrentHealth(), llIIllIIIIl[9])) {
            ?? r0 = llIIllIIIIl[1];
            "".length();
            return (((103 ^ 82) ^ (139 ^ 185)) & (((((102 + 75) - 165) + 119) ^ (((108 + 95) - 180) + 109)) ^ (-" ".length()))) > " ".length() ? ((((96 + 88) - 152) + 114) ^ (((62 + 38) - 56) + 87)) & (((77 ^ 2) ^ (250 ^ 164)) ^ (-" ".length())) : r0;
        }
        return llIIllIIIIl[2];
    }

    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        if (lIlIIIlIIIIIII(widgetLoaded.getGroupId(), llIIllIIIIl[11])) {
            Widget at = at();
            if (!lIlIIIIlllllII(at) || lIlIIIlIIIIIll(at.getChildren())) {
                return;
            }
            this.bd.clear();
            Widget[] children = at.getChildren();
            int length = children.length;
            int i = llIIllIIIIl[2];
            while (lIlIIIIlllllIl(i, length)) {
                Widget widget = children[i];
                if (lIlIIIlIIIIIII(widget.getItemId(), llIIllIIIIl[10])) {
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else {
                    EnumC0056e c = EnumC0056e.c(widget.getItemId());
                    this.bd.put(c, Integer.valueOf(this.bd.getOrDefault(c, Integer.valueOf(llIIllIIIIl[2])).intValue() + widget.getItemQuantity()));
                    "".length();
                }
                i++;
                "".length();
                if ((((201 ^ 165) ^ (35 ^ 83)) & (((185 ^ 195) ^ (51 ^ 85)) ^ (-" ".length()))) != 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIlIIIlIIIIlII(int i) {
        return i <= 0;
    }

    private static boolean lIlIIIlIIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIlIIIIIII(int i, int i2) {
        return i == i2;
    }
}
