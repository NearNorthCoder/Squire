package gg.squire.minigames;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.minigames.overlay.InfoBox;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.stream.IntStream;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.XpDropEvent;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a.b;
import r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a.c;
import r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a.d;
import r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a.e;
@PluginDescriptor(name = "Squire Sorceress Garden", description = "Easy XP", enabledByDefault = false, hidden = false)
@SquireUtil
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:gg/squire/minigames/SquireSorceressGarden.class */
public class SquireSorceressGarden extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager o;
    /* synthetic */ int b;
    private static /* synthetic */ String[] lIIllIIlIIIII;
    /* synthetic */ int e;
    @Inject
    private /* synthetic */ InfoBox n;
    /* synthetic */ int k;
    /* synthetic */ int f;
    /* synthetic */ int c;
    /* synthetic */ int d;
    private static /* synthetic */ int[] lIIllIIlIIIlI;
    /* synthetic */ int i;
    /* synthetic */ int m;
    /* synthetic */ int a;
    /* synthetic */ int h;
    /* synthetic */ int j;
    /* synthetic */ int l;
    /* synthetic */ int g;

    private static void lIlIlllllIIIIII() {
        lIIllIIlIIIlI = new int[27];
        lIIllIIlIIIlI[0] = 165 ^ 161;
        lIIllIIlIIIlI[1] = ((6 ^ 51) ^ (172 ^ 133)) & (((((26 + 72) - 10) + 43) ^ (((12 + 147) - 122) + 122)) ^ (-" ".length()));
        lIIllIIlIIIlI[2] = " ".length();
        lIIllIIlIIIlI[3] = "  ".length();
        lIIllIIlIIIlI[4] = "   ".length();
        lIIllIIlIIIlI[5] = (-((-7435) & 24382)) & (-4361) & 24575;
        lIIllIIlIIIlI[6] = (-8193) & 11359;
        lIIllIIlIIIlI[7] = (-525) & 10879;
        lIIllIIlIIIlI[8] = 136 ^ 131;
        lIIllIIlIIIlI[9] = (((((37 + 150) - 142) + 166) + (((59 + 54) - (-90)) + 21)) - ((-527) & 879)) + ((159 + 13) - 121) + 116;
        lIIllIIlIIIlI[10] = (((39 ^ 44) + (((141 + 43) - 76) + 58)) - (((54 + 130) - 138) + 117)) + ((172 + 73) - 62) + 54;
        lIIllIIlIIIlI[11] = (((((177 + 173) - 228) + 87) + (87 ^ 2)) - (236 ^ 151)) + (74 ^ 24);
        lIIllIIlIIIlI[12] = (((((7 + 24) - (-97)) + 34) + (((15 + 121) - (-48)) + 29)) - (((144 + 41) - 54) + 76)) + (47 ^ 120);
        lIIllIIlIIIlI[13] = (-((-1539) & 26151)) & (-7681) & 32551;
        lIIllIIlIIIlI[14] = (255 ^ 165) ^ (16 ^ 79);
        lIIllIIlIIIlI[15] = (-31883) & 32143;
        lIIllIIlIIIlI[16] = 189 ^ 187;
        lIIllIIlIIIlI[17] = (-((-1049) & 19643)) & (-9221) & 28071;
        lIIllIIlIIIlI[18] = (((99 + 148) - 166) + 113) ^ (((189 + 178) - 278) + 108);
        lIIllIIlIIIlI[19] = (-(((65 + 23) - 2) + 43)) & (-14377) & 14767;
        lIIllIIlIIIlI[20] = (24 ^ 116) ^ (230 ^ 130);
        lIIllIIlIIIlI[21] = (-((-5133) & 21551)) & (-7813) & 24495;
        lIIllIIlIIIlI[22] = (200 ^ 137) ^ (202 ^ 130);
        lIIllIIlIIIlI[23] = (-5125) & 7605;
        lIIllIIlIIIlI[24] = 0 ^ 10;
        lIIllIIlIIIlI[25] = (-((-19) & 25331)) & (-1029) & 26607;
        lIIllIIlIIIlI[26] = (-((-25345) & 30499)) & (-1) & 15999;
    }

    public void l(int i) {
        this.l = i;
    }

    private static boolean lIlIlllllIIIIlI(int i, int i2) {
        return i == i2;
    }

    public int c() {
        return this.c;
    }

    public void f(int i) {
        this.f = i;
    }

    public int l() {
        return this.l;
    }

    public int i() {
        return this.i;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public void h(int i) {
        this.h = i;
    }

    protected void onStop() {
        this.o.remove(this.n);
        "".length();
        a(lIIllIIlIIIlI[1]);
    }

    public int j() {
        return this.j;
    }

    @Provides
    SquireSorceressGardenConfig a(ConfigManager configManager) {
        return (SquireSorceressGardenConfig) configManager.getConfig(SquireSorceressGardenConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIIlIIIlI[0]];
        clsArr[lIIllIIlIIIlI[1]] = b.class;
        clsArr[lIIllIIlIIIlI[2]] = e.class;
        clsArr[lIIllIIlIIIlI[3]] = d.class;
        clsArr[lIIllIIlIIIlI[4]] = c.class;
        return clsArr;
    }

    private static boolean lIlIlllllIIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public void d(int i) {
        this.d = i;
    }

    public void j(int i) {
        this.j = i;
    }

    public int k() {
        return this.k;
    }

    public void a(int i) {
        this.a = i;
    }

    public int g() {
        return this.g;
    }

    public int f() {
        return this.f;
    }

    public int m() {
        return this.m;
    }

    public void g(int i) {
        this.g = i;
    }

    protected void onStart() {
        this.o.add(this.n);
        "".length();
    }

    private static boolean lIlIlllllIIIIll(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(XpDropEvent xpDropEvent) {
        if (lIlIlllllIIIIIl(xpDropEvent.getSkill(), Skill.THIEVING)) {
            WorldPoint worldPoint = new WorldPoint(lIIllIIlIIIlI[5], lIIllIIlIIIlI[6], lIIllIIlIIIlI[1]);
            int[] iArr = new int[lIIllIIlIIIlI[2]];
            iArr[lIIllIIlIIIlI[1]] = lIIllIIlIIIlI[7];
            ((TileObject) TileObjects.getAt(worldPoint, iArr).get(lIIllIIlIIIlI[1])).interact(lIIllIIlIIIII[lIIllIIlIIIlI[1]]);
        }
    }

    private static void lIlIllllIlllllI() {
        lIIllIIlIIIII = new String[lIIllIIlIIIlI[2]];
        lIIllIIlIIIII[lIIllIIlIIIlI[1]] = lIlIllllIllllIl("Gwg6MQ==", "YiTZU");
    }

    static {
        lIlIlllllIIIIII();
        lIlIllllIlllllI();
    }

    public void m(int i) {
        this.m = i;
    }

    public int h() {
        return this.h;
    }

    private static boolean lIlIlllllIIIlII(int i, int i2) {
        return i < i2;
    }

    public int e() {
        return this.e;
    }

    public void c(int i) {
        this.c = i;
    }

    public void b(int i) {
        this.b = i;
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (lIlIlllllIIIIIl(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            int[] iArr = new int[lIIllIIlIIIlI[8]];
            iArr[lIIllIIlIIIlI[1]] = lIIllIIlIIIlI[9];
            iArr[lIIllIIlIIIlI[2]] = lIIllIIlIIIlI[10];
            iArr[lIIllIIlIIIlI[3]] = lIIllIIlIIIlI[11];
            iArr[lIIllIIlIIIlI[4]] = lIIllIIlIIIlI[12];
            iArr[lIIllIIlIIIlI[0]] = lIIllIIlIIIlI[13];
            iArr[lIIllIIlIIIlI[14]] = lIIllIIlIIIlI[15];
            iArr[lIIllIIlIIIlI[16]] = lIIllIIlIIIlI[17];
            iArr[lIIllIIlIIIlI[18]] = lIIllIIlIIIlI[19];
            iArr[lIIllIIlIIIlI[20]] = lIIllIIlIIIlI[21];
            iArr[lIIllIIlIIIlI[22]] = lIIllIIlIIIlI[23];
            iArr[lIIllIIlIIIlI[24]] = lIIllIIlIIIlI[25];
            int itemId = inventoryChanged.getItemId();
            if (lIlIlllllIIIIlI(itemId, lIIllIIlIIIlI[26])) {
                a(a() + lIIllIIlIIIlI[2]);
            }
            if (lIlIlllllIIIIll(IntStream.of(iArr).anyMatch(i -> {
                if (lIlIlllllIIIIlI(i, itemId)) {
                    ?? r0 = lIIllIIlIIIlI[2];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIIlIIIlI[1];
            }) ? 1 : 0)) {
                b(b() + lIIllIIlIIIlI[2]);
            }
            switch (inventoryChanged.getItemId()) {
                case 249:
                    c(c() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (" ".length() <= (-" ".length())) {
                        return;
                    }
                    return;
                case 251:
                    d(d() + lIIllIIlIIIlI[2]);
                    "".length();
                    if ((-" ".length()) > (20 ^ 16)) {
                        return;
                    }
                    return;
                case 253:
                    e(e() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                case 255:
                    f(f() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (((((74 + 75) - 83) + 85) ^ (((115 + 46) - 99) + 85)) == 0) {
                        return;
                    }
                    return;
                case 257:
                    i(i() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                    return;
                case 259:
                    g(g() + lIIllIIlIIIlI[2]);
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return;
                    }
                    return;
                case 261:
                    h(h() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                    return;
                case 263:
                    j(j() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                case 265:
                    k(k() + lIIllIIlIIIlI[2]);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                case 267:
                    m(m() + lIIllIIlIIIlI[2]);
                    return;
                case 2481:
                    l(l() + lIIllIIlIIIlI[2]);
                    "".length();
                    if ((((108 ^ 82) ^ (37 ^ 73)) & (((((120 + 130) - 39) + 7) ^ (((51 + 106) - 113) + 92)) ^ (-" ".length()))) != 0) {
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public int d() {
        return this.d;
    }

    private static String lIlIllllIllllIl(String llllllllllllllIllllIIIlIIlllIIll, String llllllllllllllIllllIIIlIIlllIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIlIIlllIIIl = new StringBuilder();
        char[] llllllllllllllIllllIIIlIIlllIIII = llllllllllllllIllllIIIlIIlllIIlI.toCharArray();
        int llllllllllllllIllllIIIlIIllIllll = lIIllIIlIIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIIlIIIlI[1];
        while (lIlIlllllIIIlII(i, length)) {
            llllllllllllllIllllIIIlIIlllIIIl.append((char) (charArray[i] ^ llllllllllllllIllllIIIlIIlllIIII[llllllllllllllIllllIIIlIIllIllll % llllllllllllllIllllIIIlIIlllIIII.length]));
            "".length();
            llllllllllllllIllllIIIlIIllIllll++;
            i++;
            "".length();
            if ((-" ".length()) > (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIlIIlllIIIl);
    }

    public void i(int i) {
        this.i = i;
    }

    public void k(int i) {
        this.k = i;
    }

    public void e(int i) {
        this.e = i;
    }
}
