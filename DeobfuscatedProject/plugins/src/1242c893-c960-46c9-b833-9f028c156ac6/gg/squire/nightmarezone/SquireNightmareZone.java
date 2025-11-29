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
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.a;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.d;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.e;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.f;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.g;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.h;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.i;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.j;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.k;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.l;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.m;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.n;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.o;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.p;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.q;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.r;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.s;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.t;

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
        void lllllllllllllllIIIIllllIIlIlllll;
        int[] nArray = EquipmentSetup.get().getIds();
        int n2 = lIIIlIIllIlll[0];
        int lllllllllllllllIIIIllllIIlIlllIl = lIIIlIIllIlll[0];
        while (SquireNightmareZone.lIIlllllIllIIlI(lllllllllllllllIIIIllllIIlIlllIl, ((void)lllllllllllllllIIIIllllIIlIlllll).length)) {
            if (SquireNightmareZone.lIIlllllIllIIll((int)lllllllllllllllIIIIllllIIlIlllll[lllllllllllllllIIIIllllIIlIlllIl])) {
                lllllllllllllllIIIIllllIIlIlllll[++lllllllllllllllIIIIllllIIlIllllI] = lllllllllllllllIIIIllllIIlIlllll[lllllllllllllllIIIIllllIIlIlllIl];
            }
            ++lllllllllllllllIIIIllllIIlIlllIl;
            "".length();
            if (-" ".length() <= -" ".length()) continue;
            return null;
        }
        return Arrays.copyOf(nArray, n2);
    }

    private static String lIIlllllIlIIlIl(String lllllllllllllllIIIIllllIIIllIIll, String lllllllllllllllIIIIllllIIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIllllIIIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIllllIIIllIlll.init(lIIIlIIllIlll[3], lllllllllllllllIIIIllllIIIlllIII);
            return new String(lllllllllllllllIIIIllllIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIllllIIIllIllI) {
            lllllllllllllllIIIIllllIIIllIllI.printStackTrace();
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
        "".length();
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
        Iterator lllllllllllllllIIIIllllIIllIIllI = list.iterator();
        while (SquireNightmareZone.lIIlllllIllIIIl(lllllllllllllllIIIIllllIIllIIllI.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIIIIllllIIllIIlIl = (Item)lllllllllllllllIIIIllllIIllIIllI.next();
            String lllllllllllllllIIIIllllIIllIIlII = lllllllllllllllIIIIllllIIllIIlIl.getName();
            int lllllllllllllllIIIIllllIIllIIIll = Integer.parseInt(lllllllllllllllIIIIllllIIllIIlII.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[3]], lIIIlIIllIlIl[lIIIlIIllIlll[4]]));
            lllllllllllllllIIIIllllIIllIIlll += lllllllllllllllIIIIllllIIllIIIll;
            "".length();
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
        SquireNightmareZone.lIIIlIIllIlll[2] = " ".length();
        SquireNightmareZone.lIIIlIIllIlll[3] = "  ".length();
        SquireNightmareZone.lIIIlIIllIlll[4] = "   ".length();
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
        "".length();
        this.h.unregister((Object)this.i);
    }

    static {
        SquireNightmareZone.lIIlllllIllIIII();
        SquireNightmareZone.lIIlllllIlIllll();
    }

    public int a() {
        List list = Inventory.getAll(item -> item.getName().contains(lIIIlIIllIlIl[lIIIlIIllIlll[9]]));
        int n2 = lIIIlIIllIlll[0];
        Iterator lllllllllllllllIIIIllllIIlllIIlI = list.iterator();
        while (SquireNightmareZone.lIIlllllIllIIIl(lllllllllllllllIIIIllllIIlllIIlI.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIIIIllllIIlllIIIl = (Item)lllllllllllllllIIIIllllIIlllIIlI.next();
            String lllllllllllllllIIIIllllIIlllIIII = lllllllllllllllIIIIllllIIlllIIIl.getName();
            int lllllllllllllllIIIIllllIIllIllll = Integer.parseInt(lllllllllllllllIIIIllllIIlllIIII.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[0]], lIIIlIIllIlIl[lIIIlIIllIlll[2]]));
            lllllllllllllllIIIIllllIIlllIIll += lllllllllllllllIIIIllllIIllIllll;
            "".length();
            if ("   ".length() != 0) continue;
            return (0x42 ^ 0x1C) & ~(0xF ^ 0x51);
        }
        return n2;
    }

    private static String lIIlllllIlIlllI(String lllllllllllllllIIIIllllIIlIIlIlI, String lllllllllllllllIIIIllllIIlIIIlII) {
        lllllllllllllllIIIIllllIIlIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllIIlIIlIII = new StringBuilder();
        char[] lllllllllllllllIIIIllllIIlIIIlll = lllllllllllllllIIIIllllIIlIIIlII.toCharArray();
        int lllllllllllllllIIIIllllIIlIIIllI = lIIIlIIllIlll[0];
        char[] lllllllllllllllIIIIllllIIlIIIIII = lllllllllllllllIIIIllllIIlIIlIlI.toCharArray();
        int lllllllllllllllIIIIllllIIIllllll = lllllllllllllllIIIIllllIIlIIIIII.length;
        int lllllllllllllllIIIIllllIIIlllllI = lIIIlIIllIlll[0];
        while (SquireNightmareZone.lIIlllllIllIIlI(lllllllllllllllIIIIllllIIIlllllI, lllllllllllllllIIIIllllIIIllllll)) {
            char lllllllllllllllIIIIllllIIlIIlIll = lllllllllllllllIIIIllllIIlIIIIII[lllllllllllllllIIIIllllIIIlllllI];
            lllllllllllllllIIIIllllIIlIIlIII.append((char)(lllllllllllllllIIIIllllIIlIIlIll ^ lllllllllllllllIIIIllllIIlIIIlll[lllllllllllllllIIIIllllIIlIIIllI % lllllllllllllllIIIIllllIIlIIIlll.length]));
            "".length();
            ++lllllllllllllllIIIIllllIIlIIIllI;
            ++lllllllllllllllIIIIllllIIIlllllI;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIllllIIlIIlIII);
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
        void lllllllllllllllIIIIllllIIlIlIlIl;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.GAMEMESSAGE) && SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.SPAM) && SquireNightmareZone.lIIlllllIllIlII(chatMessageType, ChatMessageType.WELCOME)) {
            return;
        }
        if (SquireNightmareZone.lIIlllllIllIIIl(lllllllllllllllIIIIllllIIlIlIlIl.contains(lIIIlIIllIlIl[lIIIlIIllIlll[5]]) ? 1 : 0)) {
            SquireNightmareZone lllllllllllllllIIIIllllIIlIllIII;
            lllllllllllllllIIIIllllIIlIllIII.f = lIIIlIIllIlll[2];
            lllllllllllllllIIIIllllIIlIllIII.g = lllllllllllllllIIIIllllIIlIllIII.c();
        }
        if (!SquireNightmareZone.lIIlllllIllIlIl(lllllllllllllllIIIIllllIIlIlIlIl.contains(lIIIlIIllIlIl[lIIIlIIllIlll[6]]) ? 1 : 0) || SquireNightmareZone.lIIlllllIllIIIl(lllllllllllllllIIIIllllIIlIlIlIl.contains(lIIIlIIllIlIl[lIIIlIIllIlll[7]]) ? 1 : 0)) {
            lllllllllllllllIIIIllllIIlIllIII.f = lIIIlIIllIlll[0];
        }
    }

    private static boolean lIIlllllIllIlII(Object object, Object object2) {
        return object != object2;
    }

    public HashSet<Prayer> d() {
        return this.a;
    }

    private static String lIIlllllIlIIlII(String lllllllllllllllIIIIllllIIIlIIllI, String lllllllllllllllIIIIllllIIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIlll[9]), "DES");
            Cipher lllllllllllllllIIIIllllIIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIIIIllllIIIlIlIlI.init(lIIIlIIllIlll[3], lllllllllllllllIIIIllllIIIlIlIll);
            return new String(lllllllllllllllIIIIllllIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIllllIIIlIlIIl) {
            lllllllllllllllIIIIllllIIIlIlIIl.printStackTrace();
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
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[0]] = SquireNightmareZone.lIIlllllIlIIlII("2k9JmKUJXRU=", "tbpOH");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[2]] = SquireNightmareZone.lIIlllllIlIIlIl("HdTEYsr3y5w=", "glmYK");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[3]] = SquireNightmareZone.lIIlllllIlIIlIl("GAAjA+3LRqA=", "FYLju");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[4]] = SquireNightmareZone.lIIlllllIlIIlIl("f2jtYtKuMv8=", "HUQUw");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[5]] = SquireNightmareZone.lIIlllllIlIIlII("KwlNfhNP6NTNAAbdbnF9BmzntSAddosx8NR1PksjAos=", "Ouhvz");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[6]] = SquireNightmareZone.lIIlllllIlIIlIl("s+yTO62o3W21y/Ouq20TvTmO58HZ8LMg", "KfiPy");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[7]] = SquireNightmareZone.lIIlllllIlIIlIl("1hal2qc6CakGrMJrciRQpDYae66B+Viyg+bbm9gJTyA=", "XKhKR");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[8]] = SquireNightmareZone.lIIlllllIlIlllI("JS85ChoUOSMKBkRl", "dMJeh");
        SquireNightmareZone.lIIIlIIllIlIl[SquireNightmareZone.lIIIlIIllIlll[9]] = SquireNightmareZone.lIIlllllIlIIlII("npNI0fWjfC0kOmMDNTFqyA==", "prowX");
    }

    private static boolean lIIlllllIllIIIl(int n2) {
        return n2 != 0;
    }
}

