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
import gg.squire.driftnet.AHelper;
import gg.squire.driftnet.BankingTask;
import gg.squire.driftnet.ChasingFishTask;
import gg.squire.driftnet.EnterInstanceTask;
import gg.squire.driftnet.StartBankingTask;
import gg.squire.driftnet.FiguringOutWhatHarpoonWeAreUsingTask;
import gg.squire.driftnet.PlacingNetTask;
import gg.squire.driftnet.RemovingNetTask;
import gg.squire.driftnet.StopDivingTask;
import gg.squire.driftnet.RemovingNetTask;

@PluginDescriptor(name="Squire Drift Net Fisher", enabledByDefault=false)
public class SquireDriftNet
extends SquirePlugin {
    private  InventorySetup i;
    private  String b;
    @Inject
    private  a d;
    private  boolean c;
    
    @Inject
    private  EventBus f;
    private  boolean a;
    @Inject
    private  OverlayManager e;
    
    @Inject
    private  DriftNetInfoBox h;
    @Inject
    private  SquireDriftNetConfig g;

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
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[0]] = SquireDriftNet.llIlIIlllIIIlI("DrH9jPhCkGs=", "YjmTE");
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[2]] = SquireDriftNet.llIlIIlllIlIIl("", "FDYpY");
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[3]] = "You prod at the shoal of fish to scare it";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[4]] = "The fish look at you strangely and";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[5]] = SquireDriftNet.llIlIIlllIlIIl("", "RuNvp");
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[6]] = "trident";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[7]] = "harpoon";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[8]] = "trident";
        SquireDriftNet.lIlIIIIIllll[SquireDriftNet.lIlIIIIlIIII[9]] = "harpoon";
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!SquireDriftNet.llIlIIlllIllll(string.contains(lIlIIIIIllll[lIlIIIIlIIII[3]]) ? 1 : 0) || SquireDriftNet.llIlIIlllIlllI(string.contains(lIlIIIIIllll[lIlIIIIlIIII[4]]) ? 1 : 0)) {
            var1.c = lIlIIIIlIIII[2];
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
        classArray[SquireDriftNet.lIlIIIIlIIII[0]] = StartBankingTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[2]] = FiguringOutWhatHarpoonWeAreUsingTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[3]] = StopDivingTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[4]] = BankingTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[5]] = EnterInstanceTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[6]] = RemovingNetTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[7]] = PlacingNetTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[8]] = RemovingNetTask.class;
        classArray[SquireDriftNet.lIlIIIIlIIII[9]] = ChasingFishTask.class;
        return classArray;
    }

    public SquireDriftNet() {
        this.b = lIlIIIIIllll[lIlIIIIlIIII[0]];
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
            SquireDriftNet var2;
            if (SquireDriftNet.llIlIIlllIlllI(this.g.stamina())) {
                this.g().add(item -> {
                    int n;
                    if (SquireDriftNet.llIlIIllllIIIl(item.getId(), lIlIIIIlIIII[11]) && SquireDriftNet.llIlIIllllIIlI(item.getId(), lIlIIIIlIIII[12])) {
                        n = lIlIIIIlIIII[2];

                        }
                    } else {
                        n = lIlIIIIlIIII[0];
                    }
                    return n != 0;
                }, this.g.stamina());

            }
            var2.g().add(var2.b, lIlIIIIlIIII[2]);

            var2.g().add(lIlIIIIlIIII[10]);

        }
    }

        return String.valueOf(var3);
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
        Item var4 = Inventory.getFirst(item -> {
            int n;
            if (!SquireDriftNet.llIlIIlllIllll(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[6]]) ? 1 : 0) || SquireDriftNet.llIlIIlllIlllI(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[7]]) ? 1 : 0)) {
                n = lIlIIIIlIIII[2];

                if (3 <= 0) {
                    return ((0x5A ^ 0x78 ^ (0xE8 ^ 0x9F)) & (125 + 52 - 117 + 90 ^ 35 + 104 - 113 + 169 ^ -1)) != 0;
                }
            } else {
                n = lIlIIIIlIIII[0];
            }
            return n != 0;
        });
        if (SquireDriftNet.llIlIIllllIIII(var4)) {
            return var4.getName();
        }
        return lIlIIIIIllll[lIlIIIIlIIII[5]];
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

