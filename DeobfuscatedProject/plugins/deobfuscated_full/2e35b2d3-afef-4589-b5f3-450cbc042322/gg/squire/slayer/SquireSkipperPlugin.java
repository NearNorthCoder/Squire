/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Equipment
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.slayer;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.overlay.SkipperOverlay;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.c;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.d;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.e;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.f;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.g;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.h;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.i;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.j;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.k;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.l;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.m;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.n;

@Extension
@SquireUtil
@PluginDescriptor(name="Squire Turael Skipper", tags={"slayer", "task", "hunting"}, enabledByDefault=false)
public class SquireSkipperPlugin
extends SquirePlugin {
    private /* synthetic */ boolean h;
    private /* synthetic */ Instant f;
    private static final /* synthetic */ Pattern b;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ int j;
    private /* synthetic */ boolean o;
    @Inject
    private /* synthetic */ SkipperOverlay c;
    private /* synthetic */ boolean m;
    @Inject
    private /* synthetic */ SquireSkipperConfig d;
    private static /* synthetic */ int[] lIlIIlIIIllIl;
    private /* synthetic */ int n;
    private /* synthetic */ int k;
    @Inject
    private /* synthetic */ OverlayManager e;
    private /* synthetic */ boolean i;
    private static /* synthetic */ String[] lIlIIlIIIllII;
    private /* synthetic */ int l;
    private /* synthetic */ b g;

    public void d(boolean bl) {
        this.o = bl;
    }

    public boolean c() {
        return this.h;
    }

    private static String lIlllIlIIIllIIl(String var1, String var6) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var7 = var6.toCharArray();
        int var21 = lIlIIlIIIllIl[1];
        char[] var23 = var1.toCharArray();
        int var14 = var23.length;
        int var20 = lIlIIlIIIllIl[1];
        while (SquireSkipperPlugin.lIlllIlIIlIIIlI(var20, var14)) {
            char var17 = var23[var20];
            var8.append((char)(var17 ^ var7[var21 % var7.length]));
            0;
            ++var21;
            ++var20;
            0;
            if ((0x15 ^ 0x11) > 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static String a(String string, int n2) {
        return string.substring(lIlIIlIIIllIl[1], string.length() - n2);
    }

    @Provides
    SquireSkipperConfig a(ConfigManager configManager) {
        return (SquireSkipperConfig)configManager.getConfig(SquireSkipperConfig.class);
    }

    public void e(int n2) {
        this.n = n2;
    }

    public void b(int n2) {
        this.j = n2;
    }

    public static String a(String string) {
        return SquireSkipperPlugin.a(string, lIlIIlIIIllIl[0]);
    }

    private static boolean lIlllIlIIIllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlllIlIIlIIIII(Object object) {
        return object == null;
    }

    public void d(int n2) {
        this.l = n2;
    }

    public int i() {
        return this.n;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public boolean d() {
        return this.i;
    }

    public void a(b b2) {
        this.g = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        Matcher var3;
        SquireSkipperPlugin var11;
        void var5;
        if (SquireSkipperPlugin.lIlllIlIIIllllI(chatMessage.getType(), ChatMessageType.SPAM) && SquireSkipperPlugin.lIlllIlIIIllllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var18 = Text.removeTags((String)var5.getMessage());
        if (SquireSkipperPlugin.lIlllIlIIIlllll(var18.contains(lIlIIlIIIllII[lIlIIlIIIllIl[1]]) ? 1 : 0)) {
            var11.a((b)null);
            var11.a(lIlIIlIIIllIl[0]);
            var11.b(lIlIIlIIIllIl[1]);
        }
        if (SquireSkipperPlugin.lIlllIlIIIlllll(var18.contains(lIlIIlIIIllII[lIlIIlIIIllIl[0]]) ? 1 : 0)) {
            var11.a(lIlIIlIIIllIl[0]);
            var11.a((b)null);
            var11.b(lIlIIlIIIllIl[1]);
            var11.k += lIlIIlIIIllIl[0];
        }
        if (SquireSkipperPlugin.lIlllIlIIIlllll((var3 = b.matcher(var18)).find() ? 1 : 0)) {
            String var22 = var3.group(lIlIIlIIIllII[lIlIIlIIIllIl[2]]);
            b var19 = s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b.b(var22);
            if (SquireSkipperPlugin.lIlllIlIIlIIIII((Object)var19)) {
                var11.b(lIlIIlIIIllIl[0]);
                var11.a(lIlIIlIIIllIl[0]);
                var11.a((b)null);
                var11.b(lIlIIlIIIllIl[1]);
                return;
            }
            var11.b(lIlIIlIIIllIl[1]);
            int var13 = Integer.parseInt(var3.group(lIlIIlIIIllII[lIlIIlIIIllIl[3]]));
            var11.b(var13);
            var11.a(var19);
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIlIIIllIl[6]];
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[1]] = h.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[0]] = e.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[2]] = k.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[3]] = d.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[7]] = c.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[8]] = l.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[9]] = f.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[10]] = g.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[11]] = n.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[5]] = j.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[4]] = m.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[12]] = i.class;
        return classArray;
    }

    public boolean h() {
        return this.m;
    }

    private static boolean lIlllIlIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlllIlIIIllIlI(String var12, String var26) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIlIIlIIIllIl[2], var16);
            return new String(var25.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIIIllIll(String var10, String var15) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIllIl[11]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIlIIIllIl[2], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIIlllll(int n2) {
        return n2 != 0;
    }

    public int g() {
        return this.l;
    }

    protected void onStop() {
        this.c(lIlIIlIIIllIl[1]);
        this.c(lIlIIlIIIllIl[1]);
        this.e.remove((Overlay)this.c);
        0;
    }

    public void c(boolean bl) {
        this.m = bl;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    private static void lIlllIlIIIlllIl() {
        lIlIIlIIIllIl = new int[14];
        SquireSkipperPlugin.lIlIIlIIIllIl[0] = 1;
        SquireSkipperPlugin.lIlIIlIIIllIl[1] = (95 + 125 - 47 + 10 ^ 60 + 47 - -8 + 76) & (0xA8 ^ 0x9D ^ (0xA3 ^ 0x9E) ^ -1);
        SquireSkipperPlugin.lIlIIlIIIllIl[2] = 2;
        SquireSkipperPlugin.lIlIIlIIIllIl[3] = 3;
        SquireSkipperPlugin.lIlIIlIIIllIl[4] = 102 + 34 - 66 + 63 ^ 74 + 66 - 139 + 142;
        SquireSkipperPlugin.lIlIIlIIIllIl[5] = 1 ^ 0x59 ^ (0x5F ^ 0xE);
        SquireSkipperPlugin.lIlIIlIIIllIl[6] = 0x2C ^ 0x20;
        SquireSkipperPlugin.lIlIIlIIIllIl[7] = 0x20 ^ 0x24;
        SquireSkipperPlugin.lIlIIlIIIllIl[8] = 3 + 109 - 17 + 84 ^ 128 + 105 - 76 + 25;
        SquireSkipperPlugin.lIlIIlIIIllIl[9] = 53 + 50 - 93 + 119 ^ 105 + 68 - 136 + 98;
        SquireSkipperPlugin.lIlIIlIIIllIl[10] = 89 + 10 - 79 + 175 ^ 161 + 172 - 319 + 182;
        SquireSkipperPlugin.lIlIIlIIIllIl[11] = 76 + 7 - 46 + 104 ^ 4 + 73 - -15 + 41;
        SquireSkipperPlugin.lIlIIlIIIllIl[12] = 0x31 ^ 0x3A;
        SquireSkipperPlugin.lIlIIlIIIllIl[13] = 0xFFFFF98F & 0x7F9;
    }

    private static boolean lIlllIlIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public Instant getStarted() {
        return this.f;
    }

    public int e() {
        return this.j;
    }

    protected void onStart() {
        System.out.println(lIlIIlIIIllII[lIlIIlIIIllIl[7]]);
        this.g = null;
        this.f = Instant.now();
        this.i = lIlIIlIIIllIl[1];
        this.e.add((Overlay)this.c);
        0;
        this.c(lIlIIlIIIllIl[1]);
        this.c(lIlIIlIIIllIl[1]);
        this.d(lIlIIlIIIllIl[1]);
        this.e(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId());
        System.out.println("Current Streak: " + this.a(lIlIIlIIIllIl[13]));
    }

    public b b() {
        return this.g;
    }

    public int f() {
        return this.k;
    }

    private static void lIlllIlIIIlllII() {
        lIlIIlIIIllII = new String[lIlIIlIIIllIl[9]];
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[1]] = SquireSkipperPlugin."something new to hunt";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[0]] = SquireSkipperPlugin."completed your task";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[2]] = SquireSkipperPlugin."name";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[3]] = SquireSkipperPlugin."amount";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[7]] = SquireSkipperPlugin."Skipper has been started";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[8]] = SquireSkipperPlugin."^(?:You're assigned to kill|You have received a new Slayer assignment from .*:) (?:[Tt]he )?(?<name>.+?)(?: (?:in|on|south of) (?:the )?(?<location>[^;]+))?(?:; only | \\()(?<amount>\\d+)(?: more to go\\.|\\))$";
    }

    public boolean a(int n2) {
        boolean bl;
        if (SquireSkipperPlugin.lIlllIlIIlIIIIl(n2 % lIlIIlIIIllIl[4], lIlIIlIIIllIl[5])) {
            bl = lIlIIlIIIllIl[0];
            0;
            if (2 <= 1) {
                return ((0x80 ^ 0x85 ^ (0x2C ^ 0x1D)) & (0x29 ^ 0x78 ^ (0x72 ^ 0x17) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIIllIl[1];
        }
        return bl;
    }

    public SquireSkipperConfig a() {
        return this.d;
    }

    public boolean j() {
        return this.o;
    }

    public void c(int n2) {
        this.k = n2;
    }

    static {
        SquireSkipperPlugin.lIlllIlIIIlllIl();
        SquireSkipperPlugin.lIlllIlIIIlllII();
        a = LoggerFactory.getLogger(SquireSkipperPlugin.class);
        b = Pattern.compile(lIlIIlIIIllII[lIlIIlIIIllIl[8]]);
    }
}

