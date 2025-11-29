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
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.l;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.n;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.o;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.p;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.q;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.r;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.s;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.t;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.v;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.w;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.y;
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
    private /* synthetic */ boolean m;
    public /* synthetic */ int a;
    public /* synthetic */ boolean d;
    private static /* synthetic */ int[] lIIllIllIIIIl;
    @Inject
    private /* synthetic */ TempleTrekkingConfig g;
    @Inject
    private /* synthetic */ EventBus n;
    @Inject
    private /* synthetic */ OverlayManager h;
    public /* synthetic */ WorldArea f;
    @Inject
    private /* synthetic */ b i;
    private /* synthetic */ InventorySetup k;
    @Inject
    private /* synthetic */ TempleTrekkingInfoBox j;
    public /* synthetic */ int b;
    public /* synthetic */ boolean c;
    private /* synthetic */ int l;
    public /* synthetic */ WorldArea e;
    private static /* synthetic */ String[] lIIllIlIlIIll;

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
        TempleTrekkingPlugin llllllllllllllIlllIlllIllIlllIIl;
        block4: {
            block5: {
                if (!TempleTrekkingPlugin.lIllIIIlIIIIlII(this.g.claimBankTomes() ? 1 : 0)) break block4;
                if (!TempleTrekkingPlugin.lIllIIIlIIIIlIl(Equipment.contains(item -> item.getName().contains(lIIllIlIlIIll[lIIllIllIIIIl[18]])) ? 1 : 0)) break block5;
                String[] stringArray = new String[lIIllIllIIIIl[0]];
                stringArray[TempleTrekkingPlugin.lIIllIllIIIIl[3]] = lIIllIlIlIIll[lIIllIllIIIIl[3]];
                if (!TempleTrekkingPlugin.lIllIIIlIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block4;
            }
            llllllllllllllIlllIlllIllIlllIIl.forceStop();
            Log.error((String)lIIllIlIlIIll[lIIllIllIIIIl[0]]);
            return;
        }
        System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[11]]);
        llllllllllllllIlllIlllIllIlllIIl.c = lIIllIllIIIIl[0];
        llllllllllllllIlllIlllIllIlllIIl.a(new InventorySetup());
        if (TempleTrekkingPlugin.lIllIIIlIIIIllI(Players.getLocal())) {
            llllllllllllllIlllIlllIllIlllIIl.a();
        }
        this.d = lIIllIllIIIIl[3];
        this.l = lIIllIllIIIIl[3];
        this.h.add((Overlay)this.j);
        "".length();
        this.i.l();
        this.n.register((Object)this.i);
    }

    private static void lIllIIIlIIIIIlI() {
        lIIllIlIlIIll = new String[lIIllIllIIIIl[19]];
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[3]] = TempleTrekkingPlugin.lIllIIIIllIIIII("N8l+F0d5M8k=", "KwMJx");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[0]] = TempleTrekkingPlugin.lIllIIIIllIIIII("RcYGA5TJtMdP2LauZE3HctCyIaLKTIFd3KnCvoB11rivFGj1K5lPv9qUo9uwDGubiVhm+D76Hl+Ev3w6WFD7wORWACuqk//e", "azOEG");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[11]] = TempleTrekkingPlugin.lIllIIIIllIIIIl("PTkvPgwHIyk=", "nMNLx");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[12]] = TempleTrekkingPlugin.lIllIIIIllIIIIl("OC41Nh4CLnkhHk8ENTFRPCgxOh4DawsgHwoYOjQBCg==", "oKYUq");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[13]] = TempleTrekkingPlugin.lIllIIIIllIIIlI("hXrUi69wxbHBex+WrIlefUlEDAnkKato", "Ejzyx");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[14]] = TempleTrekkingPlugin.lIllIIIIllIIIII("iqU/ejVmN1KDDNjlyxfR9HTwWyESNSH0", "KTgxh");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[15]] = TempleTrekkingPlugin.lIllIIIIllIIIIl("OjQfDzADOgMScQUwHQQ2VzYeBjgZMlEeIVY=", "wUqkQ");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[16]] = TempleTrekkingPlugin.lIllIIIIllIIIIl("ETgrEHIQOzETN0IgLBU9FzMs", "bTDgR");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[17]] = TempleTrekkingPlugin.lIllIIIIllIIIII("n0Y9bcQlwNpdVcypLI8FQUlI0FpzHO25mYjBWbSU0yU=", "LYagn");
        TempleTrekkingPlugin.lIIllIlIlIIll[TempleTrekkingPlugin.lIIllIllIIIIl[18]] = TempleTrekkingPlugin.lIllIIIIllIIIlI("ETXdaQut6O4=", "ZkReY");
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

    private static String lIllIIIIllIIIII(String llllllllllllllIlllIlllIllIlIIlll, String llllllllllllllIlllIlllIllIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIllIllIIIIl[17]), "DES");
            Cipher llllllllllllllIlllIlllIllIlIlIll = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIllIlIlIll.init(lIIllIllIIIIl[11], llllllllllllllIlllIlllIllIlIllII);
            return new String(llllllllllllllIlllIlllIllIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIllIlIlIlI) {
            llllllllllllllIlllIlllIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private void a() {
        this.i().add(lIIllIllIIIIl[20], this.g.stamina());
        "".length();
        this.i().add(lIIllIllIIIIl[21], lIIllIllIIIIl[0]);
        "".length();
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

    private static String lIllIIIIllIIIIl(String llllllllllllllIlllIlllIllIIIIlll, String llllllllllllllIlllIlllIllIIIIllI) {
        llllllllllllllIlllIlllIllIIIIlll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIllIIIlIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIllIIIlIIl = llllllllllllllIlllIlllIllIIIIllI.toCharArray();
        int llllllllllllllIlllIlllIllIIIlIII = lIIllIllIIIIl[3];
        char[] llllllllllllllIlllIlllIllIIIIIlI = llllllllllllllIlllIlllIllIIIIlll.toCharArray();
        int llllllllllllllIlllIlllIllIIIIIIl = llllllllllllllIlllIlllIllIIIIIlI.length;
        int llllllllllllllIlllIlllIllIIIIIII = lIIllIllIIIIl[3];
        while (TempleTrekkingPlugin.lIllIIIlIIIlIII(llllllllllllllIlllIlllIllIIIIIII, llllllllllllllIlllIlllIllIIIIIIl)) {
            char llllllllllllllIlllIlllIllIIIllIl = llllllllllllllIlllIlllIllIIIIIlI[llllllllllllllIlllIlllIllIIIIIII];
            llllllllllllllIlllIlllIllIIIlIlI.append((char)(llllllllllllllIlllIlllIllIIIllIl ^ llllllllllllllIlllIlllIllIIIlIIl[llllllllllllllIlllIlllIllIIIlIII % llllllllllllllIlllIlllIllIIIlIIl.length]));
            "".length();
            ++llllllllllllllIlllIlllIllIIIlIII;
            ++llllllllllllllIlllIlllIllIIIIIII;
            "".length();
            if ("   ".length() < (0xED ^ 0x8E ^ (0x4C ^ 0x2B))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIllIIIlIlI);
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
        "".length();
        this.n.unregister((Object)this.i);
    }

    public void c(int n2) {
        this.l = n2;
    }

    private static String lIllIIIIllIIIlI(String llllllllllllllIlllIlllIllIIllIlI, String llllllllllllllIlllIlllIllIIllIll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIllIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIllIIllllI.init(lIIllIllIIIIl[11], llllllllllllllIlllIlllIllIIlllll);
            return new String(llllllllllllllIlllIlllIllIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIllIIlllIl) {
            llllllllllllllIlllIlllIllIIlllIl.printStackTrace();
            return null;
        }
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
        TempleTrekkingPlugin llllllllllllllIlllIlllIllIllIlII;
        void llllllllllllllIlllIlllIllIllIIIl;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (TempleTrekkingPlugin.lIllIIIlIIIIlll(chatMessageType, ChatMessageType.GAMEMESSAGE) && TempleTrekkingPlugin.lIllIIIlIIIIlll(chatMessageType, ChatMessageType.WELCOME) && TempleTrekkingPlugin.lIllIIIlIIIIlll(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(llllllllllllllIlllIlllIllIllIIIl.contains(lIIllIlIlIIll[lIIllIllIIIIl[12]]) ? 1 : 0)) {
            System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[13]]);
            llllllllllllllIlllIlllIllIllIlII.m = lIIllIllIIIIl[3];
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(llllllllllllllIlllIlllIllIllIIIl.contains(lIIllIlIlIIll[lIIllIllIIIIl[14]]) ? 1 : 0)) {
            System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[15]]);
            llllllllllllllIlllIlllIllIllIlII.m = lIIllIllIIIIl[0];
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(llllllllllllllIlllIlllIllIllIIIl.contains(lIIllIlIlIIll[lIIllIllIIIIl[16]]) ? 1 : 0)) {
            llllllllllllllIlllIlllIllIllIlII.a(lIIllIllIIIIl[3]);
        }
        if (TempleTrekkingPlugin.lIllIIIlIIIIlIl(llllllllllllllIlllIlllIllIllIIIl.contains(lIIllIlIlIIll[lIIllIllIIIIl[17]]) ? 1 : 0)) {
            llllllllllllllIlllIlllIllIllIlII.l += lIIllIllIIIIl[0];
            llllllllllllllIlllIlllIllIllIlII.a(lIIllIllIIIIl[0]);
        }
    }

    private static void lIllIIIlIIIIIll() {
        lIIllIllIIIIl = new int[22];
        TempleTrekkingPlugin.lIIllIllIIIIl[0] = " ".length();
        TempleTrekkingPlugin.lIIllIllIIIIl[1] = -(0xFFFF976F & 0x7ADF) & (0xFFFFFFFF & 0x1FDE);
        TempleTrekkingPlugin.lIIllIllIIIIl[2] = 0xFFFF8CB9 & 0x7FE6;
        TempleTrekkingPlugin.lIIllIllIIIIl[3] = (0xEE ^ 0x89 ^ (0x6F ^ 0x4B)) & (8 + 54 - 57 + 213 ^ 42 + 27 - 12 + 96 ^ -" ".length());
        TempleTrekkingPlugin.lIIllIllIIIIl[4] = -(0xFFFFFB6E & 0x649B) & (0xFFFFEFAD & 0x7DFB);
        TempleTrekkingPlugin.lIIllIllIIIIl[5] = -(0xFFFFBDD7 & 0x7379) & (0xFFFFBDFF & 0x7FFD);
        TempleTrekkingPlugin.lIIllIllIIIIl[6] = 0xFFFFBF6F & 0x4DF7;
        TempleTrekkingPlugin.lIIllIllIIIIl[7] = 0xFFFFAD9F & 0x5FF6;
        TempleTrekkingPlugin.lIIllIllIIIIl[8] = -(0xFFFF8B1B & 0x76ED) & (0xFFFF9F7B & 0x6FFE);
        TempleTrekkingPlugin.lIIllIllIIIIl[9] = 0xFFFF8FFE & 0x7DA3;
        TempleTrekkingPlugin.lIIllIllIIIIl[10] = 22 + 134 - 45 + 33 ^ 22 + 37 - 8 + 104;
        TempleTrekkingPlugin.lIIllIllIIIIl[11] = "  ".length();
        TempleTrekkingPlugin.lIIllIllIIIIl[12] = "   ".length();
        TempleTrekkingPlugin.lIIllIllIIIIl[13] = 0xA1 ^ 0xA5;
        TempleTrekkingPlugin.lIIllIllIIIIl[14] = 0x54 ^ 0x27 ^ (0x1C ^ 0x6A);
        TempleTrekkingPlugin.lIIllIllIIIIl[15] = 0x4F ^ 0x5B ^ (0x97 ^ 0x85);
        TempleTrekkingPlugin.lIIllIllIIIIl[16] = 0xBF ^ 0xAD ^ (0x8A ^ 0x9F);
        TempleTrekkingPlugin.lIIllIllIIIIl[17] = 50 + 39 - 71 + 132 ^ 76 + 70 - 45 + 57;
        TempleTrekkingPlugin.lIIllIllIIIIl[18] = 0x8D ^ 0x84;
        TempleTrekkingPlugin.lIIllIllIIIIl[19] = 87 + 37 - 6 + 22 ^ 121 + 82 - 161 + 92;
        TempleTrekkingPlugin.lIIllIllIIIIl[20] = 0xFFFFB5D7 & 0x7B79;
        TempleTrekkingPlugin.lIIllIllIIIIl[21] = -(0xFFFFDE4E & 0x39BF) & (0xFFFFFFBF & 0x1BFF);
    }

    private static boolean lIllIIIlIIIIlII(int n2) {
        return n2 == 0;
    }

    public boolean k() {
        return this.m;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIllIIIIl[10]];
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[3]] = s.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[0]] = n.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[11]] = t.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[12]] = v.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[13]] = w.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[14]] = y.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[15]] = q.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[16]] = r.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[17]] = o.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[18]] = l.class;
        classArray[TempleTrekkingPlugin.lIIllIllIIIIl[19]] = p.class;
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

