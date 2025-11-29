/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.MenuActionProcessed
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.quest;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.overlay.QuesterInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.items.Equipment;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.A;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.B;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.C;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.D;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.n;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.o;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.p;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.q;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.r;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.s;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.t;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.v;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.w;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.x;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.y;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.z;

@PluginDescriptor(name="Squire Quester", enabledByDefault=false)
public class SquireQuester
extends SquirePlugin {
    @Inject
    private /* synthetic */ ConfigManager d;
    @Inject
    private /* synthetic */ OverlayManager a;
    private /* synthetic */ String f;
    private static /* synthetic */ String[] lIIIllIIIIlIl;
    private static /* synthetic */ int[] lIIIllIIIIllI;
    @Inject
    private /* synthetic */ QuesterInfoBox b;
    @Inject
    private /* synthetic */ EventBus c;
    private /* synthetic */ boolean e;

    private static void lIlIIIIllIIIlll() {
        lIIIllIIIIllI = new int[17];
        SquireQuester.lIIIllIIIIllI[0] = 0x5C ^ 0x4C;
        SquireQuester.lIIIllIIIIllI[1] = (0x5D ^ 0xB) & ~(0xD0 ^ 0x86);
        SquireQuester.lIIIllIIIIllI[2] = " ".length();
        SquireQuester.lIIIllIIIIllI[3] = "  ".length();
        SquireQuester.lIIIllIIIIllI[4] = "   ".length();
        SquireQuester.lIIIllIIIIllI[5] = 0x63 ^ 0x67;
        SquireQuester.lIIIllIIIIllI[6] = 0x4E ^ 0x4B;
        SquireQuester.lIIIllIIIIllI[7] = 128 + 104 - 64 + 9 ^ 22 + 182 - 159 + 138;
        SquireQuester.lIIIllIIIIllI[8] = 0xCA ^ 0xAB ^ (0xA5 ^ 0xC3);
        SquireQuester.lIIIllIIIIllI[9] = 75 + 3 - 4 + 61 ^ 136 + 61 - 106 + 52;
        SquireQuester.lIIIllIIIIllI[10] = 0x29 ^ 0x6D ^ (0x8D ^ 0xC0);
        SquireQuester.lIIIllIIIIllI[11] = 6 ^ 0xC;
        SquireQuester.lIIIllIIIIllI[12] = 0xA3 ^ 0xA8;
        SquireQuester.lIIIllIIIIllI[13] = 0xA0 ^ 0xAC;
        SquireQuester.lIIIllIIIIllI[14] = 0x3D ^ 0x30;
        SquireQuester.lIIIllIIIIllI[15] = 0x5D ^ 0x53;
        SquireQuester.lIIIllIIIIllI[16] = 0x89 ^ 0x86;
    }

    private static boolean lIlIIIIllIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIIllIIIIll(String lllllllllllllllIIIIlIllIllIlIlll, String lllllllllllllllIIIIlIllIllIlIllI) {
        lllllllllllllllIIIIlIllIllIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIllIllIlIlIl = new StringBuilder();
        char[] lllllllllllllllIIIIlIllIllIlIlII = lllllllllllllllIIIIlIllIllIlIllI.toCharArray();
        int lllllllllllllllIIIIlIllIllIlIIll = lIIIllIIIIllI[1];
        char[] lllllllllllllllIIIIlIllIllIIllIl = lllllllllllllllIIIIlIllIllIlIlll.toCharArray();
        int lllllllllllllllIIIIlIllIllIIllII = lllllllllllllllIIIIlIllIllIIllIl.length;
        int lllllllllllllllIIIIlIllIllIIlIll = lIIIllIIIIllI[1];
        while (SquireQuester.lIlIIIIllIIlIlI(lllllllllllllllIIIIlIllIllIIlIll, lllllllllllllllIIIIlIllIllIIllII)) {
            char lllllllllllllllIIIIlIllIllIllIII = lllllllllllllllIIIIlIllIllIIllIl[lllllllllllllllIIIIlIllIllIIlIll];
            lllllllllllllllIIIIlIllIllIlIlIl.append((char)(lllllllllllllllIIIIlIllIllIllIII ^ lllllllllllllllIIIIlIllIllIlIlII[lllllllllllllllIIIIlIllIllIlIIll % lllllllllllllllIIIIlIllIllIlIlII.length]));
            "".length();
            ++lllllllllllllllIIIIlIllIllIlIIll;
            ++lllllllllllllllIIIIlIllIllIIlIll;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIllIllIlIlIl);
    }

    protected void onStop() {
        this.a.remove((Overlay)this.b);
        "".length();
    }

    protected void onStart() {
        this.a.add((Overlay)this.b);
        "".length();
        this.a((String)null);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireQuester.lIlIIIIllIIlIII(configButtonClicked.getGroup().equals(lIIIllIIIIlIl[lIIIllIIIIllI[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(lIIIllIIIIlIl[lIIIllIIIIllI[2]], lIIIllIIIIlIl[lIIIllIIIIllI[3]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.d.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    private static void lIlIIIIllIIIllI() {
        lIIIllIIIIlIl = new String[lIIIllIIIIllI[5]];
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[1]] = SquireQuester.lIlIIIIllIIIIll("MCQjLBcmJCMgFjcwJA==", "CUVEe");
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[2]] = SquireQuester.lIlIIIIllIIIlII("SCHuuzuHe5Y=", "hUSEq");
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[3]] = SquireQuester.lIlIIIIllIIIlIl("jsjexspTX4w=", "oZKkW");
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[4]] = SquireQuester.lIlIIIIllIIIIll("MiIgPA91Iy08BTAjYTEOIj5hIQkwcCI9FCE1bw==", "UPAUa");
    }

    private static boolean lIlIIIIllIIlIIl(int n2) {
        return n2 != 0;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    private static String lIlIIIIllIIIlII(String lllllllllllllllIIIIlIllIllIIIIII, String lllllllllllllllIIIIlIllIllIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIllIIIIllI[9]), "DES");
            Cipher lllllllllllllllIIIIlIllIllIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIllIllIIIlII.init(lIIIllIIIIllI[3], lllllllllllllllIIIIlIllIllIIIlIl);
            return new String(lllllllllllllllIIIIlIllIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIllIllIIIIll) {
            lllllllllllllllIIIIlIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    public boolean a() {
        return this.e;
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    @Provides
    SquireQuesterConfig a(ConfigManager configManager) {
        return (SquireQuesterConfig)configManager.getConfig(SquireQuesterConfig.class);
    }

    private static String lIlIIIIllIIIlIl(String lllllllllllllllIIIIlIllIlllIIlIl, String lllllllllllllllIIIIlIllIlllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIlllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIllIlllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIllIlllIlIIl.init(lIIIllIIIIllI[3], lllllllllllllllIIIIlIllIlllIlIlI);
            return new String(lllllllllllllllIIIIlIllIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIllIlllIlIII) {
            lllllllllllllllIIIIlIllIlllIlIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireQuester.lIlIIIIllIIlIIl(string.contains(lIIIllIIIIlIl[lIIIllIIIIllI[4]]) ? 1 : 0)) {
            this.e = lIIIllIIIIllI[2];
        }
    }

    static {
        SquireQuester.lIlIIIIllIIIlll();
        SquireQuester.lIlIIIIllIIIllI();
    }

    public void a(String string) {
        this.f = string;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIllIIIIllI[0]];
        classArray[SquireQuester.lIIIllIIIIllI[1]] = B.class;
        classArray[SquireQuester.lIIIllIIIIllI[2]] = p.class;
        classArray[SquireQuester.lIIIllIIIIllI[3]] = x.class;
        classArray[SquireQuester.lIIIllIIIIllI[4]] = z.class;
        classArray[SquireQuester.lIIIllIIIIllI[5]] = n.class;
        classArray[SquireQuester.lIIIllIIIIllI[6]] = A.class;
        classArray[SquireQuester.lIIIllIIIIllI[7]] = s.class;
        classArray[SquireQuester.lIIIllIIIIllI[8]] = w.class;
        classArray[SquireQuester.lIIIllIIIIllI[9]] = D.class;
        classArray[SquireQuester.lIIIllIIIIllI[10]] = v.class;
        classArray[SquireQuester.lIIIllIIIIllI[11]] = y.class;
        classArray[SquireQuester.lIIIllIIIIllI[12]] = r.class;
        classArray[SquireQuester.lIIIllIIIIllI[13]] = C.class;
        classArray[SquireQuester.lIIIllIIIIllI[14]] = o.class;
        classArray[SquireQuester.lIIIllIIIIllI[15]] = q.class;
        classArray[SquireQuester.lIIIllIIIIllI[16]] = t.class;
        return classArray;
    }

    public String b() {
        return this.f;
    }
}

