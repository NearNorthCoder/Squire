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
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[1]] = BankingTask.class;
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[2]] = CompletingMinigameTask.class;
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[3]] = MakingJuiceTask.class;
        classArray[SquireSorceressGarden.lIIllIIlIIIlI[4]] = TurningInJuiceTask.class;
        return classArray;
    }

    private static boolean lIlIlllllIIIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static  boolean a(int n, int n2) {
        boolean bl;
        if (SquireSorceressGarden.lIlIlllllIIIIlI(n2, n)) {
            bl = lIIllIIlIIIlI[2];

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
        SquireSorceressGarden.lIIllIIlIIIII[SquireSorceressGarden.lIIllIIlIIIlI[1]] = "Bank";
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
            void var1;
            SquireSorceressGarden var2;
            void var3;
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
            if (SquireSorceressGarden.lIlIlllllIIIIll(IntStream.of((int[])var4).anyMatch(arg_0 -> SquireSorceressGarden.a((int)var3, arg_0)) ? 1 : 0)) {
                var2.b(var2.b() + lIIllIIlIIIlI[2]);
            }
            switch (var1.getItemId()) {
                case 249: {
                    var2.c(var2.c() + lIIllIIlIIIlI[2]);

                    if (1 > -1) break;
                    return;
                }
                case 251: {
                    var2.d(var2.d() + lIIllIIlIIIlI[2]);

                    if (-1 <= (0x14 ^ 0x10)) break;
                    return;
                }
                case 253: {
                    var2.e(var2.e() + lIIllIIlIIIlI[2]);

                    if (null == null) break;
                    return;
                }
                case 255: {
                    var2.f(var2.f() + lIIllIIlIIIlI[2]);

                    if ((74 + 75 - 83 + 85 ^ 115 + 46 - 99 + 85) != 0) break;
                    return;
                }
                case 259: {
                    var2.g(var2.g() + lIIllIIlIIIlI[2]);

                    if (2 >= 2) break;
                    return;
                }
                case 261: {
                    var2.h(var2.h() + lIIllIIlIIIlI[2]);

                    if (1 < 3) break;
                    return;
                }
                case 257: {
                    var2.i(var2.i() + lIIllIIlIIIlI[2]);

                    if (1 != 0) break;
                    return;
                }
                case 263: {
                    var2.j(var2.j() + lIIllIIlIIIlI[2]);

                    if (null == null) break;
                    return;
                }
                case 265: {
                    var2.k(var2.k() + lIIllIIlIIIlI[2]);

                    if (null == null) break;
                    return;
                }
                case 2481: {
                    var2.l(var2.l() + lIIllIIlIIIlI[2]);

                    if (((0x6C ^ 0x52 ^ (0x25 ^ 0x49)) & (120 + 130 - 39 + 7 ^ 51 + 106 - 113 + 92 ^ -1)) == 0) break;
                    return;
                }
                case 267: {
                    var2.m(var2.m() + lIIllIIlIIIlI[2]);
                }
            }
        }
    }

    public int d() {
        return this.d;
    }

        return String.valueOf(var5);
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

