/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Item
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.driftnet;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.driftnet.SquireDriftNetConfig;
import gg.squire.driftnet.overlay.DriftNetInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.a;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.c;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.d;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.e;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.f;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.g;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.h;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.i;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.j;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.k;

@PluginDescriptor(name="Squire Drift Net Fisher", enabledByDefault=false)
public class SquireDriftNet
extends SquirePlugin {
    private /* synthetic */ InventorySetup i;
    private /* synthetic */ String b;
    @Inject
    private /* synthetic */ a d;
    private /* synthetic */ boolean c;
    private static /* synthetic */ int[] lIlIIIIlIIII;
    @Inject
    private /* synthetic */ EventBus f;
    private /* synthetic */ boolean a;
    @Inject
    private /* synthetic */ OverlayManager e;
    private static /* synthetic */ String[] lIlIIIIIllll;
    @Inject
    private /* synthetic */ DriftNetInfoBox h;
    @Inject
    private /* synthetic */ SquireDriftNetConfig g;

    private static String llIlIIlllIlIlI(String lllllllllllllllIlllIIllllIlIlIlI, String lllllllllllllllIlllIIllllIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllllIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIllllIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIllllIlIllII.init(lIlIIIIlIIII[3], lllllllllllllllIlllIIllllIlIllIl);
            return new String(lllllllllllllllIlllIIllllIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllllIlIlIll) {
            lllllllllllllllIlllIIllllIlIlIll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.b();
    }

    static {
        SquireDriftNet.llIlIIlllIllIl();
        SquireDriftNet.llIlIIlllIlIll();
    }

    public void a(String string) {
        this.b = string;
    }

    protected void onStop() {
        this.f.unregister((Object)this.d);
        this.e.remove((Overlay)this.h);
        0;
    }

    private static boolean llIlIIllllIIII(Object object) {
        return object != null;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    private static boolean llIlIIlllIlllI(int n) {
        return n != 0;
    }

    protected void onStart() {
        this.a = lIlIIIIlIIII[2];
        this.d.h();
        this.f.register((Object)this.d);
        this.e.add((Overlay)this.h);
        0;
        this.b = lIlIIIIIllll[lIlIIIIlIIII[2]];
        this.a(new InventorySetup());
        if (SquireDriftNet.llIlIIlllIlllI(this.b.isEmpty() ? 1 : 0)) {
            this.b = this.a();
        }
        this.b();
    }

    private static boolean llIlIIlllIllll(int n) {
        return n == 0;
    }

    public void a(InventorySetup inventorySetup) {
        this.i = inventorySetup;
    }

    private static void llIlIIlllIlIll() {
        lIlIIIIIllll = new String[lIlIIIIlIIII[1]];
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[0]] = SquireDriftNet."";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[2]] = SquireDriftNet."";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[3]] = SquireDriftNet."You prod at the shoal of fish to scare it";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[4]] = SquireDriftNet."The fish look at you strangely and";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[5]] = SquireDriftNet."";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[6]] = SquireDriftNet."trident";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[7]] = SquireDriftNet."harpoon";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[8]] = SquireDriftNet."trident";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[9]] = SquireDriftNet."harpoon";
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!SquireDriftNet.llIlIIlllIllll(string.contains(lIlIIIIIllll[lIlIIIIlIIII[3]]) ? 1 : 0) || SquireDriftNet.llIlIIlllIlllI(string.contains(lIlIIIIIllll[lIlIIIIlIIII[4]]) ? 1 : 0)) {
            lllllllllllllllIlllIIllllIlllllI.c = lIlIIIIlIIII[2];
        }
    }

    public InventorySetup g() {
        return this.i;
    }

    private static boolean llIlIIllllIIIl(int n, int n2) {
        return n >= n2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIIIlIIII[1]];
        classArray[SquireDriftNet.lIlIIIIlIIII[0]] = f.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[2]] = g.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[3]] = j.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[4]] = c.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[5]] = e.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[6]] = k.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[7]] = h.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[8]] = i.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[9]] = d.class;
        return classArray;
    }

    public SquireDriftNet() {
        this.b = lIlIIIIIllll[lIlIIIIlIIII[0]];
    }

    private static void llIlIIlllIllIl() {
        lIlIIIIlIIII = new int[13];
        SquireDriftNet.lIlIIIIlIIII[0] = (0xE9 ^ 0xC5) & ~(0x82 ^ 0xAE);
        SquireDriftNet.lIlIIIIlIIII[1] = 0x3F ^ 0x42 ^ (0x5D ^ 0x29);
        SquireDriftNet.lIlIIIIlIIII[2] = 1;
        SquireDriftNet.lIlIIIIlIIII[3] = 2;
        SquireDriftNet.lIlIIIIlIIII[4] = 3;
        SquireDriftNet.lIlIIIIlIIII[5] = 0x38 ^ 0x3C;
        SquireDriftNet.lIlIIIIlIIII[6] = 4 ^ 1;
        SquireDriftNet.lIlIIIIlIIII[7] = 0x8D ^ 0x8B;
        SquireDriftNet.lIlIIIIlIIII[8] = 0x3C ^ 0x3B;
        SquireDriftNet.lIlIIIIlIIII[9] = 122 + 97 - 147 + 102 ^ 67 + 81 - 72 + 90;
        SquireDriftNet.lIlIIIIlIIII[10] = 0xFFFFF777 & 0x5CBB;
        SquireDriftNet.lIlIIIIlIIII[11] = 0xFFFFF55D & 0x3BF3;
        SquireDriftNet.lIlIIIIlIIII[12] = -(0xFFFFC3AF & 0x7CF9) & (0xFFFFFDFF & 0x73FB);
    }

    public boolean c() {
        return this.a;
    }

    @Provides
    SquireDriftNetConfig a(ConfigManager configManager) {
        return (SquireDriftNetConfig)configManager.getConfig(SquireDriftNetConfig.class);
    }

    public void b() {
        if (SquireDriftNet.llIlIIlllIllll(this.b.isEmpty() ? 1 : 0)) {
            SquireDriftNet lllllllllllllllIlllIIllllIlllIII;
            if (SquireDriftNet.llIlIIlllIlllI(this.g.stamina())) {
                this.g().add(item -> {
                    int n;
                    if (SquireDriftNet.llIlIIllllIIIl(item.getId(), lIlIIIIlIIII[11]) && SquireDriftNet.llIlIIllllIIlI(item.getId(), lIlIIIIlIIII[12])) {
                        n = lIlIIIIlIIII[2];
                        0;
                        if (null != null) {
                            return ((0x30 ^ 0xD) & ~(0x91 ^ 0xAC)) != 0;
                        }
                    } else {
                        n = lIlIIIIlIIII[0];
                    }
                    return n != 0;
                }, this.g.stamina());
                0;
            }
            lllllllllllllllIlllIIllllIlllIII.g().add(lllllllllllllllIlllIIllllIlllIII.b, lIlIIIIlIIII[2]);
            0;
            lllllllllllllllIlllIIllllIlllIII.g().add(lIlIIIIlIIII[10]);
            0;
        }
    }

    private static String llIlIIlllIlIIl(String lllllllllllllllIlllIIllllIIlIlIl, String lllllllllllllllIlllIIllllIIllIIl) {
        lllllllllllllllIlllIIllllIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIllllIIllIII = new StringBuilder();
        char[] lllllllllllllllIlllIIllllIIlIlll = lllllllllllllllIlllIIllllIIllIIl.toCharArray();
        int lllllllllllllllIlllIIllllIIlIllI = lIlIIIIlIIII[0];
        char[] lllllllllllllllIlllIIllllIIlIIII = lllllllllllllllIlllIIllllIIlIlIl.toCharArray();
        int lllllllllllllllIlllIIllllIIIllll = lllllllllllllllIlllIIllllIIlIIII.length;
        int lllllllllllllllIlllIIllllIIIlllI = lIlIIIIlIIII[0];
        while (SquireDriftNet.llIlIIllllIlII(lllllllllllllllIlllIIllllIIIlllI, lllllllllllllllIlllIIllllIIIllll)) {
            char lllllllllllllllIlllIIllllIIllIll = lllllllllllllllIlllIIllllIIlIIII[lllllllllllllllIlllIIllllIIIlllI];
            lllllllllllllllIlllIIllllIIllIII.append((char)(lllllllllllllllIlllIIllllIIllIll ^ lllllllllllllllIlllIIllllIIlIlll[lllllllllllllllIlllIIllllIIlIllI % lllllllllllllllIlllIIllllIIlIlll.length]));
            0;
            ++lllllllllllllllIlllIIllllIIlIllI;
            ++lllllllllllllllIlllIIllllIIIlllI;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIllllIIllIII);
    }

    public SquireDriftNetConfig f() {
        return this.g;
    }

    private static boolean llIlIIllllIIlI(int n, int n2) {
        return n <= n2;
    }

    public String a() {
        Item item2 = Equipment.getFirst(item -> {
            boolean bl;
            if (!SquireDriftNet.llIlIIlllIllll(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[8]]) ? 1 : 0) || SquireDriftNet.llIlIIlllIlllI(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[9]]) ? 1 : 0)) {
                bl = lIlIIIIlIIII[2];
                0;
                if (((1 ^ 0x1C ^ (0x58 ^ 0x51)) & (103 + 28 - 25 + 75 ^ 86 + 115 - 184 + 144 ^ -1)) != 0) {
                    return ((9 ^ 3 ^ (0x11 ^ 2)) & (0x11 ^ 0x1B ^ (0x3D ^ 0x2E) ^ -1)) != 0;
                }
            } else {
                bl = lIlIIIIlIIII[0];
            }
            return bl;
        });
        if (SquireDriftNet.llIlIIllllIIII(item2)) {
            return item2.getName();
        }
        Item lllllllllllllllIlllIIllllIlllIlI = Inventory.getFirst(item -> {
            int n;
            if (!SquireDriftNet.llIlIIlllIllll(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[6]]) ? 1 : 0) || SquireDriftNet.llIlIIlllIlllI(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[7]]) ? 1 : 0)) {
                n = lIlIIIIlIIII[2];
                0;
                if (3 <= 0) {
                    return ((0x5A ^ 0x78 ^ (0xE8 ^ 0x9F)) & (125 + 52 - 117 + 90 ^ 35 + 104 - 113 + 169 ^ -1)) != 0;
                }
            } else {
                n = lIlIIIIlIIII[0];
            }
            return n != 0;
        });
        if (SquireDriftNet.llIlIIllllIIII(lllllllllllllllIlllIIllllIlllIlI)) {
            return lllllllllllllllIlllIIllllIlllIlI.getName();
        }
        return lIlIIIIIllll[lIlIIIIlIIII[5]];
    }

    private static String llIlIIlllIIIlI(String lllllllllllllllIlllIIllllIIIIIll, String lllllllllllllllIlllIIllllIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllllIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIII[9]), "DES");
            Cipher lllllllllllllllIlllIIllllIIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIllllIIIIlll.init(lIlIIIIlIIII[3], lllllllllllllllIlllIIllllIIIlIII);
            return new String(lllllllllllllllIlllIIllllIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllllIIIIllI) {
            lllllllllllllllIlllIIllllIIIIllI.printStackTrace();
            return null;
        }
    }

    public boolean e() {
        return this.c;
    }

    private static boolean llIlIIllllIlII(int n, int n2) {
        return n < n2;
    }

    public String d() {
        return this.b;
    }
}

