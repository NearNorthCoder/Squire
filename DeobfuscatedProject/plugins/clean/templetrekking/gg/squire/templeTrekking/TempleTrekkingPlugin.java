/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.templeTrekking;

import com.google.inject.Provides;
import gg.squire.templeTrekking.BHelper;
import gg.squire.templeTrekking.BankingTask;
import gg.squire.templeTrekking.LoggingOutTask;
import gg.squire.templeTrekking.RewardhandlertaskTask;
import gg.squire.templeTrekking.StaminaHandlerTask;
import gg.squire.templeTrekking.StartingRouteTask;
import gg.squire.templeTrekking.StartTrekTask;
import gg.squire.templeTrekking.BankingTask;
import gg.squire.templeTrekking.HandlingBogTask;
import gg.squire.templeTrekking.HandlingBridgeTask;
import gg.squire.templeTrekking.HandlingEvadeTask;
import gg.squire.templeTrekking.HandlingRopeSwingTask;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.overlay.TempleTrekkingInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Temple Trekking", description="Zooming through temple trekking for rewards", enabledByDefault=false, tags={"temple", "trekking", "tt"})
public class TempleTrekkingPlugin
extends SquirePlugin {
    private  boolean m;
    public  int a;
    public  boolean d;
    
    @Inject
    private  TempleTrekkingConfig g;
    @Inject
    private  EventBus n;
    @Inject
    private  OverlayManager h;
    public  WorldArea f;
    @Inject
    private  b i;
    private  InventorySetup k;
    @Inject
    private  TempleTrekkingInfoBox j;
    public  int b;
    public  boolean c;
    private  int l;
    public  WorldArea e;

    public TempleTrekkingPlugin() {
        this.d = lIIllIllIIIIl[0];
        this.e = new WorldArea(new WorldPoint(lIIllIllIIIIl[1], lIIllIllIIIIl[2], lIIllIllIIIIl[3]), new WorldPoint(lIIllIllIIIIl[4], lIIllIllIIIIl[5], lIIllIllIIIIl[3]));
        this.f = new WorldArea(new WorldPoint(lIIllIllIIIIl[6], lIIllIllIIIIl[7], lIIllIllIIIIl[3]), new WorldPoint(lIIllIllIIIIl[8], lIIllIllIIIIl[9], lIIllIllIIIIl[3]));
    }

    public void a(int n2) {
        this.a = n2;
    }

    public int j() {
        return this.l;
    }

    public void b(int n2) {
        this.b = n2;
    }

    protected void onStart() {
        TempleTrekkingPlugin var1;
        block4: {
            block5: {
                if (!TempleTrekkingPlugin.lIllIIIlIIIIlII(this.g.claimBankTomes() ? 1 : 0)) break block4;
                if (!TempleTrekkingPlugin.lIllIIIlIIIIlIl(Equipment.contains(item -> item.getName().contains(lIIllIlIlIIll[lIIllIllIIIIl[18]])) ? 1 : 0)) break block5;
                String[] stringArray = new String[lIIllIllIIIIl[0]];
                stringArray[TempleTrekkingPlugin.lIIllIllIIIIl[3]] = lIIllIlIlIIll[lIIllIllIIIIl[3]];
                if (!TempleTrekkingPlugin.lIllIIIlIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block4;
            }
            var1.forceStop();
            Log.error((String)lIIllIlIlIIll[lIIllIllIIIIl[0]]);
            return;
        }
        System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[11]]);
        var1.c = lIIllIllIIIIl[0];
        var1.a(new InventorySetup());
        if (TempleTrekkingPlugin.lIllIIIlIIIIllI(Players.getLocal())) {
            var1.a();
        }
        this.d = lIIllIllIIIIl[3];
        this.l = lIIllIllIIIIl[3];
        this.h.add((Overlay)this.j);

        this.i.l();
        this.n.register((Object)this.i);
    }

    private static void lIllIIIlIIIIIlI() {
        lIIllIlIlIIll = new String[lIIllIllIIIIl[19]];
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[3]] = "Knife";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[0]] = "Stopping because we are missing equipped axe or knife in inventory!";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[11]] = "i";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[12]] = "Welcome to Old School RuneScape";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[13]] = "Sucessfully relogged";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[14]] = "You will be logged out";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[15]] = "Mandatory relog coming up!";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[16]] = "slow route through";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[17]] = "You reach your destination.";
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[18]] = "axe";
    }

    static {
        TempleTrekkingPlugin.lIllIIIlIIIIIll();
        TempleTrekkingPlugin.lIllIIIlIIIIIlI();
    }

    public void a(InventorySetup inventorySetup) {
        this.k = inventorySetup;
    }

    private static boolean lIllIIIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    private void a() {
        this.i().add(lIIllIllIIIIl[20], this.g.stamina());

        this.i().add(lIIllIllIIIIl[21], lIIllIllIIIIl[0]);

    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public void c(boolean bl) {
        this.m = bl;
    }

    public boolean d() {
        return this.c;
    }

    public void a(WorldArea worldArea) {
        this.e = worldArea;
    }

        return String.valueOf(var2);
    }

    public TempleTrekkingConfig h() {
        return this.g;
    }

    public WorldArea g() {
        return this.f;
    }

    private static boolean lIllIIIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public void b(WorldArea worldArea) {
        this.f = worldArea;
    }

    private static boolean lIllIIIlIIIIllI(Object object) {
        return object != null;
    }

    public boolean e() {
        return this.d;
    }

    protected void onStop() {
        this.h.remove((Overlay)this.j);

        this.n.unregister((Object)this.i);
    }

    public void c(int n2) {
        this.l = n2;
    }

    public int c() {
        return this.b;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    @Provides
    TempleTrekkingConfig a(ConfigManager configManager) {
        return (TempleTrekkingConfig)configManager.getConfig(TempleTrekkingConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        TempleTrekkingPlugin var3;
        void var4;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (TempleTrekkingPlugin.lIllIIIlIIIIlll(chatMessageType, ChatMessageType.GAMEMESSAGE) && TempleTrekkingPlugin.lIllIIIlIIIIlll(chatMessageType, ChatMessageType.WELCOME) && TempleTrekkingPlugin.lIllIIIlIIIIlll(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(var4.contains(lIIllIlIlIIll[lIIllIllIIIIl[12]]) ? 1 : 0)) {
            System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[13]]);
            var3.m = lIIllIllIIIIl[3];
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(var4.contains(lIIllIlIlIIll[lIIllIllIIIIl[14]]) ? 1 : 0)) {
            System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[15]]);
            var3.m = lIIllIllIIIIl[0];
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(var4.contains(lIIllIlIlIIll[lIIllIllIIIIl[16]]) ? 1 : 0)) {
            var3.a(lIIllIllIIIIl[3]);
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(var4.contains(lIIllIlIlIIll[lIIllIllIIIIl[17]]) ? 1 : 0)) {
            var3.l += lIIllIllIIIIl[0];
            var3.a(lIIllIllIIIIl[0]);
        }
    }

    private static boolean lIllIIIlIIIIlII(int n2) {
        return n2 == 0;
    }

    public boolean k() {
        return this.m;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIllIIIIl[10]];
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[3]] = BankingTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[0]] = LoggingOutTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[11]] = HandlingBogTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[12]] = HandlingBridgeTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[13]] = HandlingEvadeTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[14]] = HandlingRopeSwingTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[15]] = StartingRouteTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[16]] = StartTrekTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[17]] = RewardhandlertaskTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[18]] = BankingTask.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[19]] = StaminaHandlerTask.class;
        return classArray;
    }

    public int b() {
        return this.a;
    }

    public WorldArea f() {
        return this.e;
    }

    public InventorySetup i() {
        return this.k;
    }

    private static boolean lIllIIIlIIIIlll(Object object, Object object2) {
        return object != object2;
    }
}

