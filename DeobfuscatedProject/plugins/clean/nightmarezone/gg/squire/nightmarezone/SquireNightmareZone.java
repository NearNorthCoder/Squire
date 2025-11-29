/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmarezone;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import gg.squire.nightmarezone.overlay.NMZInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmarezone.AHelper;
import gg.squire.nightmarezone.AttackNpcTask;
import gg.squire.nightmarezone.DrinkAbsorptionTask;
import gg.squire.nightmarezone.DrinkOverloadTask;
import gg.squire.nightmarezone.FlickRapidHealTask;
import gg.squire.nightmarezone.LowerHpTask;
import gg.squire.nightmarezone.PickPowerUpTask;
import gg.squire.nightmarezone.PrayerFlickingTask;
import gg.squire.nightmarezone.SwappingGearTask;
import gg.squire.nightmarezone.SwitchingStyleTask;
import gg.squire.nightmarezone.UsingSpecialAttackTask;
import gg.squire.nightmarezone.BuyHerbBoxesTask;
import gg.squire.nightmarezone.StartDreamTask;
import gg.squire.nightmarezone.EnterDreamTask;
import gg.squire.nightmarezone.GetAbsorptionTask;
import gg.squire.nightmarezone.GetAbsorptionTask;
import gg.squire.nightmarezone.RestockPotionsTask;
import gg.squire.nightmarezone.WaitingForPinTask;

@PluginDescriptor(name="Squire Nightmare Zone", enabledByDefault=false)
public class SquireNightmareZone
extends SquirePlugin {
    @Inject
    private  NMZInfoBox d;
    private  boolean f;
    @Inject
    private  EventBus h;
    @Inject
    private  OverlayManager b;
    
    private final  HashSet<Prayer> a;
    @Inject
    private  SquireNightmareZoneConfig c;
    private  int[] g;
    
    @Inject
    private  a i;
    private  InventorySetup e;

    private static boolean lIIlllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public SquireNightmareZoneConfig e() {
        return this.c;
    }

    /*
     * WARNING - void declaration
     */
    public int[] c() {
        void var1;
        int[] nArray = EquipmentSetup.get().getIds();
        int n2 = lIIIlIIllIlll[0];
        int var2 = lIIIlIIllIlll[0];
        while (SquireNightmareZone.lIIlllllIllIIlI(var2, ((void)var1).length)) {
            if (SquireNightmareZone.lIIlllllIllIIll((int)var1[var2])) {
                var1[++var3] = var1[var2];
            }
            ++var2;

            if (-1 <= -1) continue;
            return null;
        }
        return Arrays.copyOf(nArray, n2);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIlIIllIlll[1]];
        classArray[SquireNightmareZone.lIIIlIIllIlll[0]] = PrayerFlickingTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[2]] = SwappingGearTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[3]] = UsingSpecialAttackTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[4]] = PickPowerUpTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[5]] = DrinkAbsorptionTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[6]] = DrinkOverloadTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[7]] = LowerHpTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[8]] = AttackNpcTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[9]] = FlickRapidHealTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[10]] = RestockPotionsTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[11]] = BuyHerbBoxesTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[12]] = GetAbsorptionTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[13]] = GetAbsorptionTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[14]] = StartDreamTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[15]] = EnterDreamTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[16]] = WaitingForPinTask.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[17]] = SwitchingStyleTask.class;
        return classArray;
    }

    protected void onStart() {
        this.f = lIIIlIIllIlll[0];
        this.b.add((Overlay)this.d);

        this.a(new InventorySetup());
        this.h.register((Object)this.i);
        this.g = this.c();
        System.out.println("AfkGear: " + Arrays.toString(this.g));
    }

    @Provides
    SquireNightmareZoneConfig a(ConfigManager configManager) {
        return (SquireNightmareZoneConfig)configManager.getConfig(SquireNightmareZoneConfig.class);
    }

    public int b() {
        List list = Inventory.getAll(item -> item.getName().contains(lIIIlIIllIlIl[lIIIlIIllIlll[8]]));
        int n2 = lIIIlIIllIlll[0];
        Iterator var4 = list.iterator();
        while (SquireNightmareZone.lIIlllllIllIIIl(var4.hasNext() ? 1 : 0)) {
            Item var5 = (Item)var4.next();
            String var6 = var5.getName();
            int var7 = Integer.parseInt(var6.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[3]], lIIIlIIllIlIl[lIIIlIIllIlll[4]]));
            var8 += var7;

            if ((0x4E ^ 0x4B) > 0) continue;
            return (0x21 ^ 0x16) & ~(0x2F ^ 0x18);
        }
        return n2;
    }

    public boolean g() {
        return this.f;
    }

    public SquireNightmareZone() {
        this.a = new HashSet();
        this.f = lIIIlIIllIlll[0];
        this.g = new int[lIIIlIIllIlll[0]];
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a.clear();
    }

    private static boolean lIIlllllIllIlIl(int n2) {
        return n2 == 0;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.d);

        this.h.unregister((Object)this.i);
    }

    static {
        SquireNightmareZone.lIIlllllIllIIII();
        SquireNightmareZone.lIIlllllIlIllll();
    }

    public int a() {
        List list = Inventory.getAll(item -> item.getName().contains(lIIIlIIllIlIl[lIIIlIIllIlll[9]]));
        int n2 = lIIIlIIllIlll[0];
        Iterator var9 = list.iterator();
        while (SquireNightmareZone.lIIlllllIllIIIl(var9.hasNext() ? 1 : 0)) {
            Item var10 = (Item)var9.next();
            String var11 = var10.getName();
            int var12 = Integer.parseInt(var11.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[0]], lIIIlIIllIlIl[lIIIlIIllIlll[2]]));
            var13 += var12;

            if (3 != 0) continue;
            return (0x42 ^ 0x1C) & ~(0xF ^ 0x51);
        }
        return n2;
    }

        return String.valueOf(var14);
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private static boolean lIIlllllIllIIll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var15;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.GAMEMESSAGE) && SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.SPAM) && SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.WELCOME)) {
            return;
        }
        if (SquireNightmareZone.lIIlllllIllIIIl(var15.contains(lIIIlIIllIlIl[lIIIlIIllIlll[5]]) ? 1 : 0)) {
            SquireNightmareZone var16;
            var16.f = lIIIlIIllIlll[2];
            var16.g = var16.c();
        }
        if (!SquireNightmareZone.lIIlllllIllIlIl(var15.contains(lIIIlIIllIlIl[lIIIlIIllIlll[6]]) ? 1 : 0) || SquireNightmareZone.lIIlllllIllIIIl(var15.contains(lIIIlIIllIlIl[lIIIlIIllIlll[7]]) ? 1 : 0)) {
            var16.f = lIIIlIIllIlll[0];
        }
    }

    private static boolean lIIlllllIllIlII(Object object, Object object2) {
        return object != object2;
    }

    public HashSet<Prayer> d() {
        return this.a;
    }

    public InventorySetup f() {
        return this.e;
    }

    public int[] h() {
        return this.g;
    }

    private static void lIIlllllIlIllll() {
        lIIIlIIllIlIl = new String[lIIIlIIllIlll[10]];
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[0]] = "[^0-9]";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[2]] = SquireNightmareZone.lIIlllllIlIIlIl("HdTEYsr3y5w=", "glmYK");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[3]] = "[^0-9]";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[4]] = SquireNightmareZone.lIIlllllIlIIlIl("f2jtYtKuMv8=", "HUQUw");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[5]] = "You feel a surge of special";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[6]] = "Your surge of special";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[7]] = "Welcome to Old School RuneScape";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[8]] = "Absorption (";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[9]] = "Overload (";
    }

    private static boolean lIIlllllIllIIIl(int n2) {
        return n2 != 0;
    }
}

