/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.XpDropEvent
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 */
package gg.squire.minigames;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.minigames.SquireSorceressGardenConfig;
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
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.BankingTask;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.TurningInJuiceTask;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.MakingJuiceTask;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.CompletingMinigameTask;

@PluginDescriptor(name="Squire Sorceress Garden", description="Easy XP", enabledByDefault=false, hidden=false)
@SquireUtil
public class SquireSorceressGarden
extends SquirePlugin {
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
        SquireSorceressGarden.lIIllIIlIIIlI[0] = 0xA5 ^ 0xA1;
        SquireSorceressGarden.lIIllIIlIIIlI[1] = (6 ^ 0x33 ^ (0xAC ^ 0x85)) & (26 + 72 - 10 + 43 ^ 12 + 147 - 122 + 122 ^ -1);
        SquireSorceressGarden.lIIllIIlIIIlI[2] = 1;
        SquireSorceressGarden.lIIllIIlIIIlI[3] = 2;
        SquireSorceressGarden.lIIllIIlIIIlI[4] = 3;
        SquireSorceressGarden.lIIllIIlIIIlI[5] = -(0xFFFFE2F5 & 0x5F3E) & (0xFFFFEEF7 & 0x5FFF);
        SquireSorceressGarden.lIIllIIlIIIlI[6] = 0xFFFFDFFF & 0x2C5F;
        SquireSorceressGarden.lIIllIIlIIIlI[7] = 0xFFFFFDF3 & 0x2A7F;
        SquireSorceressGarden.lIIllIIlIIIlI[8] = 0x88 ^ 0x83;
        SquireSorceressGarden.lIIllIIlIIIlI[9] = 37 + 150 - 142 + 166 + (59 + 54 - -90 + 21) - (0xFFFFFDF1 & 0x36F) + (159 + 13 - 121 + 116);
        SquireSorceressGarden.lIIllIIlIIIlI[10] = (0x27 ^ 0x2C) + (141 + 43 - 76 + 58) - (54 + 130 - 138 + 117) + (172 + 73 - 62 + 54);
        SquireSorceressGarden.lIIllIIlIIIlI[11] = 177 + 173 - 228 + 87 + (0x57 ^ 2) - (0xEC ^ 0x97) + (0x4A ^ 0x18);
        SquireSorceressGarden.lIIllIIlIIIlI[12] = 7 + 24 - -97 + 34 + (15 + 121 - -48 + 29) - (144 + 41 - 54 + 76) + (0x2F ^ 0x78);
        SquireSorceressGarden.lIIllIIlIIIlI[13] = -(0xFFFFF9FD & 0x6627) & (0xFFFFE1FF & 0x7F27);
        SquireSorceressGarden.lIIllIIlIIIlI[14] = 0xFF ^ 0xA5 ^ (0x10 ^ 0x4F);
        SquireSorceressGarden.lIIllIIlIIIlI[15] = 0xFFFF8375 & 0x7D8F;
        SquireSorceressGarden.lIIllIIlIIIlI[16] = 0xBD ^ 0xBB;
        SquireSorceressGarden.lIIllIIlIIIlI[17] = -(0xFFFFFBE7 & 0x4CBB) & (0xFFFFDBFB & 0x6DA7);
        SquireSorceressGarden.lIIllIIlIIIlI[18] = 99 + 148 - 166 + 113 ^ 189 + 178 - 278 + 108;
        SquireSorceressGarden.lIIllIIlIIIlI[19] = -(65 + 23 - 2 + 43) & (0xFFFFC7D7 & 0x39AF);
        SquireSorceressGarden.lIIllIIlIIIlI[20] = 0x18 ^ 0x74 ^ (0xE6 ^ 0x82);
        SquireSorceressGarden.lIIllIIlIIIlI[21] = -(0xFFFFEBF3 & 0x542F) & (0xFFFFE17B & 0x5FAF);
        SquireSorceressGarden.lIIllIIlIIIlI[22] = 0xC8 ^ 0x89 ^ (0xCA ^ 0x82);
        SquireSorceressGarden.lIIllIIlIIIlI[23] = 0xFFFFEBFB & 0x1DB5;
        SquireSorceressGarden.lIIllIIlIIIlI[24] = 0 ^ 0xA;
        SquireSorceressGarden.lIIllIIlIIIlI[25] = -(0xFFFFFFED & 0x62F3) & (0xFFFFFBFB & 0x67EF);
        SquireSorceressGarden.lIIllIIlIIIlI[26] = -(0xFFFF9CFF & 0x7723) & (0xFFFFFFFF & 0x3E7F);
    }

    public void l(int n) {
        this.l = n;
    }

    private static boolean lIlIlllllIIIIlI(int n, int n2) {
        return n == n2;
    }

    public int c() {
        return this.c;
    }

    public void f(int n) {
        this.f = n;
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

    public void h(int n) {
        this.h = n;
    }

    protected void onStop() {
        this.o.remove((Overlay)this.n);
        0;
        this.a(lIIllIIlIIIlI[1]);
    }

    public int j() {
        return this.j;
    }

    @Provides
    SquireSorceressGardenConfig a(ConfigManager configManager) {
        return (SquireSorceressGardenConfig)configManager.getConfig(SquireSorceressGardenConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIIlIIIlI[0]];
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[1]] = b.class;
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[2]] = e.class;
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[3]] = d.class;
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[4]] = c.class;
        return classArray;
    }

    private static boolean lIlIlllllIIIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static /* synthetic */ boolean a(int n, int n2) {
        boolean bl;
        if (SquireSorceressGarden.lIlIlllllIIIIlI(n2, n)) {
            bl = lIIllIIlIIIlI[2];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIIllIIlIIIlI[1];
        }
        return bl;
    }

    public void d(int n) {
        this.d = n;
    }

    public void j(int n) {
        this.j = n;
    }

    public int k() {
        return this.k;
    }

    public void a(int n) {
        this.a = n;
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

    public void g(int n) {
        this.g = n;
    }

    protected void onStart() {
        this.o.add((Overlay)this.n);
        0;
    }

    private static boolean lIlIlllllIIIIll(int n) {
        return n != 0;
    }

    @Subscribe
    public void a(XpDropEvent xpDropEvent) {
        if (SquireSorceressGarden.lIlIlllllIIIIIl(xpDropEvent.getSkill(), Skill.THIEVING)) {
            int[] nArray = new int[lIIllIIlIIIlI[2]];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[1]] = lIIllIIlIIIlI[7];
            ((TileObject)TileObjects.getAt((WorldPoint)new WorldPoint(lIIllIIlIIIlI[5], lIIllIIlIIIlI[6], lIIllIIlIIIlI[1]), (int[])nArray).get(lIIllIIlIIIlI[1])).interact(lIIllIIlIIIII[lIIllIIlIIIlI[1]]);
        }
    }

    private static void lIlIllllIlllllI() {
        lIIllIIlIIIII = new String[lIIllIIlIIIlI[2]];
        SquireSorceressGarden.lIIllIIlIIIII[SquireSorceressGarden.lIIllIIlIIIlI[1]] = SquireSorceressGarden."Bank";
    }

    static {
        SquireSorceressGarden.lIlIlllllIIIIII();
        SquireSorceressGarden.lIlIllllIlllllI();
    }

    public void m(int n) {
        this.m = n;
    }

    public int h() {
        return this.h;
    }

    private static boolean lIlIlllllIIIlII(int n, int n2) {
        return n < n2;
    }

    public int e() {
        return this.e;
    }

    public void c(int n) {
        this.c = n;
    }

    public void b(int n) {
        this.b = n;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (SquireSorceressGarden.lIlIlllllIIIIIl(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            void var10;
            SquireSorceressGarden var9;
            void var5;
            void var4;
            int[] nArray = new int[lIIllIIlIIIlI[8]];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[1]] = lIIllIIlIIIlI[9];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[2]] = lIIllIIlIIIlI[10];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[3]] = lIIllIIlIIIlI[11];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[4]] = lIIllIIlIIIlI[12];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[0]] = lIIllIIlIIIlI[13];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[14]] = lIIllIIlIIIlI[15];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[16]] = lIIllIIlIIIlI[17];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[18]] = lIIllIIlIIIlI[19];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[20]] = lIIllIIlIIIlI[21];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[22]] = lIIllIIlIIIlI[23];
            nArray[SquireSorceressGarden.lIIllIIlIIIlI[24]] = lIIllIIlIIIlI[25];
            int[] nArray2 = nArray;
            int n = inventoryChanged.getItemId();
            if (SquireSorceressGarden.lIlIlllllIIIIlI(n, lIIllIIlIIIlI[26])) {
                this.a(this.a() + lIIllIIlIIIlI[2]);
            }
            if (SquireSorceressGarden.lIlIlllllIIIIll(IntStream.of((int[])var4).anyMatch(arg_0 -> SquireSorceressGarden.a((int)var5, arg_0)) ? 1 : 0)) {
                var9.b(var9.b() + lIIllIIlIIIlI[2]);
            }
            switch (var10.getItemId()) {
                case 249: {
                    var9.c(var9.c() + lIIllIIlIIIlI[2]);
                    0;
                    if (1 > -1) break;
                    return;
                }
                case 251: {
                    var9.d(var9.d() + lIIllIIlIIIlI[2]);
                    0;
                    if (-1 <= (0x14 ^ 0x10)) break;
                    return;
                }
                case 253: {
                    var9.e(var9.e() + lIIllIIlIIIlI[2]);
                    0;
                    if (null == null) break;
                    return;
                }
                case 255: {
                    var9.f(var9.f() + lIIllIIlIIIlI[2]);
                    0;
                    if ((74 + 75 - 83 + 85 ^ 115 + 46 - 99 + 85) != 0) break;
                    return;
                }
                case 259: {
                    var9.g(var9.g() + lIIllIIlIIIlI[2]);
                    0;
                    if (2 >= 2) break;
                    return;
                }
                case 261: {
                    var9.h(var9.h() + lIIllIIlIIIlI[2]);
                    0;
                    if (1 < 3) break;
                    return;
                }
                case 257: {
                    var9.i(var9.i() + lIIllIIlIIIlI[2]);
                    0;
                    if (1 != 0) break;
                    return;
                }
                case 263: {
                    var9.j(var9.j() + lIIllIIlIIIlI[2]);
                    0;
                    if (null == null) break;
                    return;
                }
                case 265: {
                    var9.k(var9.k() + lIIllIIlIIIlI[2]);
                    0;
                    if (null == null) break;
                    return;
                }
                case 2481: {
                    var9.l(var9.l() + lIIllIIlIIIlI[2]);
                    0;
                    if (((0x6C ^ 0x52 ^ (0x25 ^ 0x49)) & (120 + 130 - 39 + 7 ^ 51 + 106 - 113 + 92 ^ -1)) == 0) break;
                    return;
                }
                case 267: {
                    var9.m(var9.m() + lIIllIIlIIIlI[2]);
                }
            }
        }
    }

    public int d() {
        return this.d;
    }

    private static String lIlIllllIllllIl(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var1.toCharArray();
        int var3 = lIIllIIlIIIlI[1];
        char[] var2 = var7.toCharArray();
        int var11 = var2.length;
        int var6 = lIIllIIlIIIlI[1];
        while (SquireSorceressGarden.lIlIlllllIIIlII(var6, var11)) {
            char var8 = var2[var6];
            var12.append((char)(var8 ^ var13[var3 % var13.length]));
            0;
            ++var3;
            ++var6;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public void i(int n) {
        this.i = n;
    }

    public void k(int n) {
        this.k = n;
    }

    public void e(int n) {
        this.e = n;
    }
}

