/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.fishing;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.overlay.FishingInfoBox;
import i.i.-.h.u.s.e.r.q.r.s.f.e.a;
import i.i.-.h.u.s.e.r.q.r.s.f.e.b;
import i.i.-.h.u.s.e.r.q.r.s.f.e.c;
import i.i.-.h.u.s.e.r.q.r.s.f.e.d;
import i.i.-.h.u.s.e.r.q.r.s.f.e.e;
import i.i.-.h.u.s.e.r.q.r.s.f.e.g;
import i.i.-.h.u.s.e.r.q.r.s.f.e.h;
import i.i.-.h.u.s.e.r.q.r.s.f.e.i;
import i.i.-.h.u.s.e.r.q.r.s.f.e.j;
import i.i.-.h.u.s.e.r.q.r.s.f.e.k;
import i.i.-.h.u.s.e.r.q.r.s.f.e.l;
import i.i.-.h.u.s.e.r.q.r.s.f.e.m;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Extension
@PluginDescriptor(name="Squire Fishing")
public class SquireFisherPlugin
extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager i;
    private /* synthetic */ InventorySetup n;
    public static /* synthetic */ int c;
    public static /* synthetic */ int d;
    private /* synthetic */ Instant k;
    private static /* synthetic */ int e;
    private static /* synthetic */ int[] lIlllIllIIll;
    private static /* synthetic */ long f;
    public static /* synthetic */ int b;
    private static /* synthetic */ String[] lIlllIllIIlI;
    @Inject
    private /* synthetic */ FishingInfoBox j;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ WorldArea m;
    @Inject
    private /* synthetic */ SquireFisherConfig h;
    private /* synthetic */ boolean l;
    private final /* synthetic */ List<Integer> g;

    @Provides
    SquireFisherConfig a(ConfigManager configManager) {
        return (SquireFisherConfig)configManager.getConfig(SquireFisherConfig.class);
    }

    public boolean e() {
        return this.l;
    }

    private static String lllIlIlllIlIIl(String var23, String var9) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIlllIllIIll[13]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlllIllIIll[7], var5);
            return new String(var13.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var24;
        String string = chatMessage.getMessage();
        if (SquireFisherPlugin.lllIlIlllIllIl(string.contains(lIlllIllIIlI[lIlllIllIIll[5]]) ? 1 : 0)) {
            c += lIlllIllIIll[6];
            this.l = lIlllIllIIll[6];
        }
        if (SquireFisherPlugin.lllIlIlllIllIl(var24.contains(lIlllIllIIlI[lIlllIllIIll[6]]) ? 1 : 0)) {
            b += lIlllIllIIll[6];
        }
        if (SquireFisherPlugin.lllIlIlllIllIl(var24.contains(lIlllIllIIlI[lIlllIllIIll[7]]) ? 1 : 0)) {
            SquireFisherPlugin var14;
            if (SquireFisherPlugin.lllIlIlllIllIl(var14.h.fish().h().equals(lIlllIllIIlI[lIlllIllIIll[8]]) ? 1 : 0) && SquireFisherPlugin.lllIlIlllIllIl(var24.contains(lIlllIllIIlI[lIlllIllIIll[9]]) ? 1 : 0)) {
                int[] nArray = new int[lIlllIllIIll[10]];
                nArray[SquireFisherPlugin.lIlllIllIIll[5]] = lIlllIllIIll[21];
                nArray[SquireFisherPlugin.lIlllIllIIll[6]] = lIlllIllIIll[22];
                nArray[SquireFisherPlugin.lIlllIllIIll[7]] = lIlllIllIIll[23];
                nArray[SquireFisherPlugin.lIlllIllIIll[8]] = lIlllIllIIll[24];
                nArray[SquireFisherPlugin.lIlllIllIIll[9]] = lIlllIllIIll[25];
                if (SquireFisherPlugin.lllIlIlllIllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    d += lIlllIllIIll[26];
                    0;
                    if (-1 != -1) {
                        return;
                    }
                }
            } else if (SquireFisherPlugin.lllIlIlllIllIl(var24.contains(lIlllIllIIlI[lIlllIllIIll[10]]) ? 1 : 0)) {
                d += lIlllIllIIll[6];
            }
        }
    }

    public static long c() {
        return f;
    }

    private static boolean lllIlIlllIlllI(int n) {
        return n == 0;
    }

    public void a(WorldArea worldArea) {
        this.m = worldArea;
    }

    public void a(InventorySetup inventorySetup) {
        this.n = inventorySetup;
    }

    private static String lllIlIlllIlIII(String var10, String var1) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIlllIllIIll[7], var15);
            return new String(var18.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlllIlIlI() {
        lIlllIllIIlI = new String[lIlllIllIIll[13]];
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[5]] = SquireFisherPlugin."have contributed enough";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[6]] = SquireFisherPlugin."luck of the sea";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[7]] = SquireFisherPlugin."catch";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[8]] = SquireFisherPlugin."Karambwanji";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[9]] = SquireFisherPlugin."Karambwanji";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[10]] = SquireFisherPlugin."You catch a";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[11]] = SquireFisherPlugin."ish barrel";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[12]] = SquireFisherPlugin."Knife";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlllIllIIll[4]];
        classArray[SquireFisherPlugin.lIlllIllIIll[5]] = m.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[6]] = j.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[7]] = g.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[8]] = i.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[9]] = h.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[10]] = l.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[11]] = e.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[12]] = a.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[13]] = b.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[14]] = c.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[15]] = d.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[16]] = k.class;
        return classArray;
    }

    public Instant getStarted() {
        return this.k;
    }

    public static void a(int n) {
        e = n;
    }

    private void a() {
        SquireFisherPlugin var3;
        if (SquireFisherPlugin.lllIlIlllIllIl(this.g().matchesInventory() ? 1 : 0)) {
            return;
        }
        Item var6 = Inventory.getFirst(item -> item.getName().contains(lIlllIllIIlI[lIlllIllIIll[12]]));
        Item var16 = Inventory.getFirst(item -> this.g.contains(item.getId()));
        int[] nArray = new int[lIlllIllIIll[6]];
        nArray[SquireFisherPlugin.lIlllIllIIll[5]] = lIlllIllIIll[17];
        Item var8 = Inventory.getFirst((int[])nArray);
        if (SquireFisherPlugin.lllIlIlllIlllI(Equipment.contains(var3.h.fish().k()) ? 1 : 0)) {
            var3.g().add(var3.h.fish().k(), lIlllIllIIll[6]);
            0;
        }
        if (SquireFisherPlugin.lllIlIlllIllII(var3.h.fish().l())) {
            var3.g().add(var3.h.fish().l());
            0;
        }
        if (SquireFisherPlugin.lllIlIlllIllII(var8)) {
            var3.g().add(lIlllIllIIll[17]);
            0;
        }
        if (SquireFisherPlugin.lllIlIlllIllII(var6)) {
            var3.g().add(var6.getId(), lIlllIllIIll[6]);
            0;
            var3.g().add(lIlllIllIIll[18], lIlllIllIIll[6]);
            0;
        }
        if (SquireFisherPlugin.lllIlIlllIllII(var16)) {
            var3.g().add(var16.getId(), lIlllIllIIll[6]);
            0;
            var3.g().add(lIlllIllIIll[19], lIlllIllIIll[6]);
            0;
            var3.g().add(lIlllIllIIll[20]);
            0;
        }
        if (SquireFisherPlugin.lllIlIlllIllIl(var3.h.fishBarrel() ? 1 : 0)) {
            var3.g().add(item -> item.getName().contains(lIlllIllIIlI[lIlllIllIIll[11]]), lIlllIllIIll[6]);
            0;
        }
    }

    private static void lllIlIlllIlIll() {
        lIlllIllIIll = new int[27];
        SquireFisherPlugin.lIlllIllIIll[0] = 164 + 84 - 232 + 191 + (0x8C ^ 0x9D) - (0xC7 ^ 0x8C) + (0x6C ^ 8);
        SquireFisherPlugin.lIlllIllIIll[1] = 80 + 34 - 74 + 211;
        SquireFisherPlugin.lIlllIllIIll[2] = 13 + 168 - -39 + 33;
        SquireFisherPlugin.lIlllIllIIll[3] = 61 + 54 - -60 + 80;
        SquireFisherPlugin.lIlllIllIIll[4] = 0x59 ^ 0x55;
        SquireFisherPlugin.lIlllIllIIll[5] = (0x90 ^ 0x9B) & ~(0x69 ^ 0x62);
        SquireFisherPlugin.lIlllIllIIll[6] = 1;
        SquireFisherPlugin.lIlllIllIIll[7] = 2;
        SquireFisherPlugin.lIlllIllIIll[8] = 3;
        SquireFisherPlugin.lIlllIllIIll[9] = 0x77 ^ 0x35 ^ (0xF9 ^ 0xBF);
        SquireFisherPlugin.lIlllIllIIll[10] = 0x5D ^ 0x58;
        SquireFisherPlugin.lIlllIllIIll[11] = 8 ^ 0x17 ^ (0x5E ^ 0x47);
        SquireFisherPlugin.lIlllIllIIll[12] = 0xE7 ^ 0x8B ^ (0x54 ^ 0x3F);
        SquireFisherPlugin.lIlllIllIIll[13] = 0x7E ^ 0x76;
        SquireFisherPlugin.lIlllIllIIll[14] = 0x18 ^ 8 ^ (0xB ^ 0x12);
        SquireFisherPlugin.lIlllIllIIll[15] = 0x62 ^ 0x68;
        SquireFisherPlugin.lIlllIllIIll[16] = 49 + 157 - 150 + 115 ^ 3 + 79 - 11 + 89;
        SquireFisherPlugin.lIlllIllIIll[17] = 0xFFFFFFFD & 0x63F6;
        SquireFisherPlugin.lIlllIllIIll[18] = 0xFFFFBBFF & 0x5CBD;
        SquireFisherPlugin.lIlllIllIIll[19] = 0 + 7 - 2 + 228;
        SquireFisherPlugin.lIlllIllIIll[20] = -(0xFFFFEFCF & 0x7835) & (0xFFFFFFBF & 0x6FD7);
        SquireFisherPlugin.lIlllIllIIll[21] = -(0xFFFFA675 & 0x7DEF) & (0xFFFFFD77 & Short.MAX_VALUE);
        SquireFisherPlugin.lIlllIllIIll[22] = -(0xFFFF9A6B & 0x67F7) & (0xFFFFDBFF & Short.MAX_VALUE);
        SquireFisherPlugin.lIlllIllIIll[23] = 0xFFFFDB9F & 0x7DFF;
        SquireFisherPlugin.lIlllIllIIll[24] = -(0xFFFF8CFF & 0x775F) & (0xFFFFFFFF & 0x5DFF);
        SquireFisherPlugin.lIlllIllIIll[25] = 0xFFFFFBA3 & 0x5DFF;
        SquireFisherPlugin.lIlllIllIIll[26] = 93 + 4 - 24 + 99 ^ 154 + 91 - 149 + 66;
    }

    private static boolean lllIlIlllIllIl(int n) {
        return n != 0;
    }

    private static boolean lllIlIlllIllll(int n, int n2) {
        return n < n2;
    }

    protected void onStop() {
        this.i.remove((Overlay)this.j);
        0;
        e = lIlllIllIIll[5];
        d = lIlllIllIIll[5];
        this.a((WorldArea)null);
        this.a((InventorySetup)null);
    }

    public static int b() {
        return e;
    }

    private static String lllIlIlllIIlll(String var25, String var4) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var17 = var4.toCharArray();
        int var20 = lIlllIllIIll[5];
        char[] var11 = var25.toCharArray();
        int var7 = var11.length;
        int var19 = lIlllIllIIll[5];
        while (SquireFisherPlugin.lllIlIlllIllll(var19, var7)) {
            char var22 = var11[var19];
            var21.append((char)(var22 ^ var17[var20 % var17.length]));
            0;
            ++var20;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var21);
    }

    public SquireFisherConfig d() {
        return this.h;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public InventorySetup g() {
        return this.n;
    }

    protected void onStart() {
        this.l = lIlllIllIIll[5];
        this.i.add((Overlay)this.j);
        0;
        this.k = Instant.now();
        e = lIlllIllIIll[5];
        this.a(new InventorySetup());
        if (SquireFisherPlugin.lllIlIlllIllII(Players.getLocal())) {
            this.a(Players.getLocal().getWorldArea());
            this.a();
        }
    }

    public WorldArea f() {
        return this.m;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    private static boolean lllIlIlllIllII(Object object) {
        return object != null;
    }

    static {
        SquireFisherPlugin.lllIlIlllIlIll();
        SquireFisherPlugin.lllIlIlllIlIlI();
        a = LoggerFactory.getLogger(SquireFisherPlugin.class);
    }

    public SquireFisherPlugin() {
        this.g = List.of(Integer.valueOf(lIlllIllIIll[0]), Integer.valueOf(lIlllIllIIll[1]), Integer.valueOf(lIlllIllIIll[2]), Integer.valueOf(lIlllIllIIll[3]));
    }
}

