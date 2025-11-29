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
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.a_Unknown;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.AttackNpcTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.DrinkAbsorptionTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.DrinkOverloadTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.FlickRapidHealTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.LowerHpTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.PickPowerUpTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.PrayerFlickingTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.SwappingGearTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.SwitchingStyleTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.UsingSpecialAttackTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.BuyHerbBoxesTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.StartDreamTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.EnterDreamTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.GetAbsorptionTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.GetAbsorptionTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.RestockPotionsTask;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.WaitingForPinTask;

@PluginDescriptor(name="Squire Nightmare Zone", enabledByDefault=false)
public class SquireNightmareZone
extends SquirePlugin {
    @Inject
    private /* synthetic */ NMZInfoBox d;
    private /* synthetic */ boolean f;
    @Inject
    private /* synthetic */ EventBus h;
    @Inject
    private /* synthetic */ OverlayManager b;
    private static /* synthetic */ int[] lIIIlIIllIlll;
    private final /* synthetic */ HashSet<Prayer> a;
    @Inject
    private /* synthetic */ SquireNightmareZoneConfig c;
    private /* synthetic */ int[] g;
    private static /* synthetic */ String[] lIIIlIIllIlIl;
    @Inject
    private /* synthetic */ a i;
    private /* synthetic */ InventorySetup e;

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
        void var15;
        int[] nArray = EquipmentSetup.get().getIds();
        int n2 = lIIIlIIllIlll[0];
        int var3 = lIIIlIIllIlll[0];
        while (SquireNightmareZone.lIIlllllIllIIlI(var3, ((void)var15).length)) {
            if (SquireNightmareZone.lIIlllllIllIIll((int)var15[var3])) {
                var15[++lllllllllllllllIIIIllllIIlIllllI] = var15[var3];
            }
            ++var3;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return Arrays.copyOf(nArray, n2);
    }

    private static String lIIlllllIlIIlIl(String var5, String var26) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIIlIIllIlll[3], var31);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIlIIllIlll[1]];
        classArray[SquireNightmareZone.lIIIlIIllIlll[0]] = j.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[2]] = k.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[3]] = m.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[4]] = i.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[5]] = e.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[6]] = f.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[7]] = h.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[8]] = d.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[9]] = g.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[10]] = s.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[11]] = n.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[12]] = r.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[13]] = q.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[14]] = o.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[15]] = p.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[16]] = t.class;
        classArray[SquireNightmareZone.lIIIlIIllIlll[17]] = l.class;
        return classArray;
    }

    protected void onStart() {
        this.f = lIIIlIIllIlll[0];
        this.b.add((Overlay)this.d);
        0;
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
        Iterator var6 = list.iterator();
        while (SquireNightmareZone.lIIlllllIllIIIl(var6.hasNext() ? 1 : 0)) {
            Item var28 = (Item)var6.next();
            String var2 = var28.getName();
            int var19 = Integer.parseInt(var2.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[3]], lIIIlIIllIlIl[lIIIlIIllIlll[4]]));
            lllllllllllllllIIIIllllIIllIIlll += var19;
            0;
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

    private static void lIIlllllIllIIII() {
        lIIIlIIllIlll = new int[18];
        SquireNightmareZone.lIIIlIIllIlll[0] = (0x91 ^ 0xC2) & ~(0x2A ^ 0x79);
        SquireNightmareZone.lIIIlIIllIlll[1] = 0x6E ^ 0x7F;
        SquireNightmareZone.lIIIlIIllIlll[2] = 1;
        SquireNightmareZone.lIIIlIIllIlll[3] = 2;
        SquireNightmareZone.lIIIlIIllIlll[4] = 3;
        SquireNightmareZone.lIIIlIIllIlll[5] = 37 + 47 - 24 + 104 ^ 79 + 69 - 4 + 16;
        SquireNightmareZone.lIIIlIIllIlll[6] = 0xC ^ 9;
        SquireNightmareZone.lIIIlIIllIlll[7] = 0x9D ^ 0x9B;
        SquireNightmareZone.lIIIlIIllIlll[8] = 0x24 ^ 0x60 ^ (0x11 ^ 0x52);
        SquireNightmareZone.lIIIlIIllIlll[9] = 0xAD ^ 0xA5;
        SquireNightmareZone.lIIIlIIllIlll[10] = 0x98 ^ 0x91;
        SquireNightmareZone.lIIIlIIllIlll[11] = 0x20 ^ 0x2A;
        SquireNightmareZone.lIIIlIIllIlll[12] = 22 + 157 - 61 + 64 ^ 156 + 71 - 185 + 147;
        SquireNightmareZone.lIIIlIIllIlll[13] = 0x71 ^ 0x7D;
        SquireNightmareZone.lIIIlIIllIlll[14] = 0x2D ^ 0x20;
        SquireNightmareZone.lIIIlIIllIlll[15] = 0x1B ^ 0x15;
        SquireNightmareZone.lIIIlIIllIlll[16] = 0x54 ^ 0x5B;
        SquireNightmareZone.lIIIlIIllIlll[17] = 0x6F ^ 0x21 ^ (0xDC ^ 0x82);
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
        0;
        this.h.unregister((Object)this.i);
    }

    static {
        SquireNightmareZone.lIIlllllIllIIII();
        SquireNightmareZone.lIIlllllIlIllll();
    }

    public int a() {
        List list = Inventory.getAll(item -> item.getName().contains(lIIIlIIllIlIl[lIIIlIIllIlll[9]]));
        int n2 = lIIIlIIllIlll[0];
        Iterator var29 = list.iterator();
        while (SquireNightmareZone.lIIlllllIllIIIl(var29.hasNext() ? 1 : 0)) {
            Item var10 = (Item)var29.next();
            String var8 = var10.getName();
            int var27 = Integer.parseInt(var8.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[0]], lIIIlIIllIlIl[lIIIlIIllIlll[2]]));
            lllllllllllllllIIIIllllIIlllIIll += var27;
            0;
            if (3 != 0) continue;
            return (0x42 ^ 0x1C) & ~(0xF ^ 0x51);
        }
        return n2;
    }

    private static String lIIlllllIlIlllI(String var9, String var11) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var25 = var11.toCharArray();
        int var16 = lIIIlIIllIlll[0];
        char[] var17 = var9.toCharArray();
        int var7 = var17.length;
        int var23 = lIIIlIIllIlll[0];
        while (SquireNightmareZone.lIIlllllIllIIlI(var23, var7)) {
            char var1 = var17[var23];
            var30.append((char)(var1 ^ var25[var16 % var25.length]));
            0;
            ++var16;
            ++var23;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var30);
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
        void var24;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.GAMEMESSAGE) && SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.SPAM) && SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.WELCOME)) {
            return;
        }
        if (SquireNightmareZone.lIIlllllIllIIIl(var24.contains(lIIIlIIllIlIl[lIIIlIIllIlll[5]]) ? 1 : 0)) {
            SquireNightmareZone var21;
            var21.f = lIIIlIIllIlll[2];
            var21.g = var21.c();
        }
        if (!SquireNightmareZone.lIIlllllIllIlIl(var24.contains(lIIIlIIllIlIl[lIIIlIIllIlll[6]]) ? 1 : 0) || SquireNightmareZone.lIIlllllIllIIIl(var24.contains(lIIIlIIllIlIl[lIIIlIIllIlll[7]]) ? 1 : 0)) {
            var21.f = lIIIlIIllIlll[0];
        }
    }

    private static boolean lIIlllllIllIlII(Object object, Object object2) {
        return object != object2;
    }

    public HashSet<Prayer> d() {
        return this.a;
    }

    private static String lIIlllllIlIIlII(String var22, String var14) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIlll[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIIlIIllIlll[3], var13);
            return new String(var18.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public InventorySetup f() {
        return this.e;
    }

    public int[] h() {
        return this.g;
    }

    private static void lIIlllllIlIllll() {
        lIIIlIIllIlIl = new String[lIIIlIIllIlll[10]];
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[0]] = SquireNightmareZone."[^0-9]";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[2]] = SquireNightmareZone."";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[3]] = SquireNightmareZone."[^0-9]";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[4]] = SquireNightmareZone."";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[5]] = SquireNightmareZone."You feel a surge of special";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[6]] = SquireNightmareZone."Your surge of special";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[7]] = SquireNightmareZone."Welcome to Old School RuneScape";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[8]] = SquireNightmareZone."Absorption (";
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[9]] = SquireNightmareZone."Overload (";
    }

    private static boolean lIIlllllIllIIIl(int n2) {
        return n2 != 0;
    }
}

