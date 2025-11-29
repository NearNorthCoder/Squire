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
import gg.squire.minigames.BankingTask;
import gg.squire.minigames.TurningInJuiceTask;
import gg.squire.minigames.MakingJuiceTask;
import gg.squire.minigames.CompletingMinigameTask;

@PluginDescriptor(name="Squire Sorceress Garden", description="Easy XP", enabledByDefault=false, hidden=false)
@SquireUtil
public class SquireSorceressGarden
extends SquirePlugin {
    @Inject
    private  OverlayManager o;
     int b;
    
     int e;
    @Inject
    private  InfoBox n;
     int k;
     int f;
     int c;
     int d;
    
     int i;
     int m;
     int a;
     int h;
     int j;
     int l;
     int g;

    private static void var3() {
        var2 = new int[27];
        SquireSorceressGarden.var2[0] = 0xA5 ^ 0xA1;
        SquireSorceressGarden.var2[1] = (6 ^ 0x33 ^ (0xAC ^ 0x85)) & (26 + 72 - 10 + 43 ^ 12 + 147 - 122 + 122 ^ -1);
        SquireSorceressGarden.var2[2] = 1;
        SquireSorceressGarden.var2[3] = 2;
        SquireSorceressGarden.var2[4] = 3;
        SquireSorceressGarden.var2[5] = -(0xFFFFE2F5 & 0x5F3E) & (0xFFFFEEF7 & 0x5FFF);
        SquireSorceressGarden.var2[6] = 0xFFFFDFFF & 0x2C5F;
        SquireSorceressGarden.var2[7] = 0xFFFFFDF3 & 0x2A7F;
        SquireSorceressGarden.var2[8] = 0x88 ^ 0x83;
        SquireSorceressGarden.var2[9] = 37 + 150 - 142 + 166 + (59 + 54 - -90 + 21) - (0xFFFFFDF1 & 0x36F) + (159 + 13 - 121 + 116);
        SquireSorceressGarden.var2[10] = (0x27 ^ 0x2C) + (141 + 43 - 76 + 58) - (54 + 130 - 138 + 117) + (172 + 73 - 62 + 54);
        SquireSorceressGarden.var2[11] = 177 + 173 - 228 + 87 + (0x57 ^ 2) - (0xEC ^ 0x97) + (0x4A ^ 0x18);
        SquireSorceressGarden.var2[12] = 7 + 24 - -97 + 34 + (15 + 121 - -48 + 29) - (144 + 41 - 54 + 76) + (0x2F ^ 0x78);
        SquireSorceressGarden.var2[13] = -(0xFFFFF9FD & 0x6627) & (0xFFFFE1FF & 0x7F27);
        SquireSorceressGarden.var2[14] = 0xFF ^ 0xA5 ^ (0x10 ^ 0x4F);
        SquireSorceressGarden.var2[15] = 0xFFFF8375 & 0x7D8F;
        SquireSorceressGarden.var2[16] = 0xBD ^ 0xBB;
        SquireSorceressGarden.var2[17] = -(0xFFFFFBE7 & 0x4CBB) & (0xFFFFDBFB & 0x6DA7);
        SquireSorceressGarden.var2[18] = 99 + 148 - 166 + 113 ^ 189 + 178 - 278 + 108;
        SquireSorceressGarden.var2[19] = -(65 + 23 - 2 + 43) & (0xFFFFC7D7 & 0x39AF);
        SquireSorceressGarden.var2[20] = 0x18 ^ 0x74 ^ (0xE6 ^ 0x82);
        SquireSorceressGarden.var2[21] = -(0xFFFFEBF3 & 0x542F) & (0xFFFFE17B & 0x5FAF);
        SquireSorceressGarden.var2[22] = 0xC8 ^ 0x89 ^ (0xCA ^ 0x82);
        SquireSorceressGarden.var2[23] = 0xFFFFEBFB & 0x1DB5;
        SquireSorceressGarden.var2[24] = 0 ^ 0xA;
        SquireSorceressGarden.var2[25] = -(0xFFFFFFED & 0x62F3) & (0xFFFFFBFB & 0x67EF);
        SquireSorceressGarden.var2[26] = -(0xFFFF9CFF & 0x7723) & (0xFFFFFFFF & 0x3E7F);
    }

    public void l(int n) {
        this.l = n;
    }

    private static boolean var4(int n, int n2) {
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
        this.a(var2[1]);
    }

    public int j() {
        return this.j;
    }

    @Provides
    SquireSorceressGardenConfig a(ConfigManager configManager) {
        return (SquireSorceressGardenConfig)configManager.getConfig(SquireSorceressGardenConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[0]];
        classArray[SquireSorceressGarden.var2[1]] = BankingTask.class;
        classArray[SquireSorceressGarden.var2[2]] = CompletingMinigameTask.class;
        classArray[SquireSorceressGarden.var2[3]] = MakingJuiceTask.class;
        classArray[SquireSorceressGarden.var2[4]] = TurningInJuiceTask.class;
        return classArray;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    private static  boolean a(int n, int n2) {
        boolean bl;
        if (SquireSorceressGarden.var4(n2, n)) {
            bl = var2[2];
            0;
            if (2 <= 0) {
                return ((0xC9 ^ 0x91) & ~(0xA ^ 0x52)) != 0;
            }
        } else {
            bl = var2[1];
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

    private static boolean var6(int n) {
        return n != 0;
    }

    @Subscribe
    public void a(XpDropEvent xpDropEvent) {
        if (SquireSorceressGarden.var5(xpDropEvent.getSkill(), Skill.THIEVING)) {
            int[] nArray = new int[var2[2]];
            nArray[SquireSorceressGarden.var2[1]] = var2[7];
            ((TileObject)TileObjects.getAt((WorldPoint)new WorldPoint(var2[5], var2[6], var2[1]), (int[])nArray).get(var2[1])).interact(var1[var2[1]]);
        }
    }

    private static void var7() {
        var1 = new String[var2[2]];
        SquireSorceressGarden.var1[SquireSorceressGarden.var2[1]] = "Bank";
    }

    static {
        SquireSorceressGarden.var3();
        SquireSorceressGarden.var7();
    }

    public void m(int n) {
        this.m = n;
    }

    public int h() {
        return this.h;
    }

    private static boolean var8(int n, int n2) {
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
        if (SquireSorceressGarden.var5(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            void var9;
            SquireSorceressGarden var10;
            void var11;
            void var12;
            int[] nArray = new int[var2[8]];
            nArray[SquireSorceressGarden.var2[1]] = var2[9];
            nArray[SquireSorceressGarden.var2[2]] = var2[10];
            nArray[SquireSorceressGarden.var2[3]] = var2[11];
            nArray[SquireSorceressGarden.var2[4]] = var2[12];
            nArray[SquireSorceressGarden.var2[0]] = var2[13];
            nArray[SquireSorceressGarden.var2[14]] = var2[15];
            nArray[SquireSorceressGarden.var2[16]] = var2[17];
            nArray[SquireSorceressGarden.var2[18]] = var2[19];
            nArray[SquireSorceressGarden.var2[20]] = var2[21];
            nArray[SquireSorceressGarden.var2[22]] = var2[23];
            nArray[SquireSorceressGarden.var2[24]] = var2[25];
            int[] nArray2 = nArray;
            int n = inventoryChanged.getItemId();
            if (SquireSorceressGarden.var4(n, var2[26])) {
                this.a(this.a() + var2[2]);
            }
            if (SquireSorceressGarden.var6(IntStream.of((int[])var12).anyMatch(arg_0 -> SquireSorceressGarden.a((int)var11, arg_0)) ? 1 : 0)) {
                var10.b(var10.b() + var2[2]);
            }
            switch (var9.getItemId()) {
                case 249: {
                    var10.c(var10.c() + var2[2]);
                    0;
                    if (1 > -1) break;
                    return;
                }
                case 251: {
                    var10.d(var10.d() + var2[2]);
                    0;
                    if (-1 <= (0x14 ^ 0x10)) break;
                    return;
                }
                case 253: {
                    var10.e(var10.e() + var2[2]);
                    0;
                    if null == null break;
                    return;
                }
                case 255: {
                    var10.f(var10.f() + var2[2]);
                    0;
                    if ((74 + 75 - 83 + 85 ^ 115 + 46 - 99 + 85) != 0) break;
                    return;
                }
                case 259: {
                    var10.g(var10.g() + var2[2]);
                    0;
                    if (2 >= 2) break;
                    return;
                }
                case 261: {
                    var10.h(var10.h() + var2[2]);
                    0;
                    if (1 < 3) break;
                    return;
                }
                case 257: {
                    var10.i(var10.i() + var2[2]);
                    0;
                    if (1 != 0) break;
                    return;
                }
                case 263: {
                    var10.j(var10.j() + var2[2]);
                    0;
                    if null == null break;
                    return;
                }
                case 265: {
                    var10.k(var10.k() + var2[2]);
                    0;
                    if null == null break;
                    return;
                }
                case 2481: {
                    var10.l(var10.l() + var2[2]);
                    0;
                    if (((0x6C ^ 0x52 ^ (0x25 ^ 0x49)) & (120 + 130 - 39 + 7 ^ 51 + 106 - 113 + 92 ^ -1)) == 0) break;
                    return;
                }
                case 267: {
                    var10.m(var10.m() + var2[2]);
                }
            }
        }
    }

    public int d() {
        return this.d;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (SquireSorceressGarden.var8(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return String.valueOf(var16);
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

