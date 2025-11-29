/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.overlay.ShamanInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.A;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.B;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.i;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.k;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.l;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.m;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.n;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.o;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.p;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.q;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.r;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.s;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.t;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.u;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.v;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.w;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.x;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.y;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.z;

@PluginDescriptor(name="Squire Shamans")
@Extension
public class SquireShamansPlugin
extends SquirePlugin {
    private /* synthetic */ boolean j;
    @Inject
    private /* synthetic */ i f;
    private static /* synthetic */ int[] lIIllIIIlIlIl;
    private /* synthetic */ boolean p;
    @Inject
    private /* synthetic */ ShamanInfoBox e;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ int h;
    private /* synthetic */ boolean l;
    private /* synthetic */ boolean m;
    private /* synthetic */ boolean n;
    @Inject
    private /* synthetic */ OverlayManager d;
    private /* synthetic */ int i;
    private /* synthetic */ Instant g;
    private /* synthetic */ int b;
    private /* synthetic */ boolean o;
    @Inject
    private /* synthetic */ SquireShamanConfig c;
    private /* synthetic */ boolean k;
    private static /* synthetic */ String[] lIIllIIIlIIlI;

    public void b(int n2) {
        this.i = n2;
    }

    private static void lIlIllllIIIIllI() {
        lIIllIIIlIlIl = new int[20];
        SquireShamansPlugin.lIIllIIIlIlIl[0] = 0x20 ^ 0x19 ^ (0x66 ^ 0x4D);
        SquireShamansPlugin.lIIllIIIlIlIl[1] = 1 & (1 ^ -1);
        SquireShamansPlugin.lIIllIIIlIlIl[2] = 1;
        SquireShamansPlugin.lIIllIIIlIlIl[3] = 2;
        SquireShamansPlugin.lIIllIIIlIlIl[4] = 3;
        SquireShamansPlugin.lIIllIIIlIlIl[5] = 0xDF ^ 0xC4 ^ (0x30 ^ 0x2F);
        SquireShamansPlugin.lIIllIIIlIlIl[6] = 0x8C ^ 0x89;
        SquireShamansPlugin.lIIllIIIlIlIl[7] = 0x2D ^ 0x59 ^ (0xB1 ^ 0xC3);
        SquireShamansPlugin.lIIllIIIlIlIl[8] = 0x66 ^ 0x48 ^ (0xA7 ^ 0x8E);
        SquireShamansPlugin.lIIllIIIlIlIl[9] = 117 + 2 - 57 + 68 ^ 23 + 7 - -71 + 37;
        SquireShamansPlugin.lIIllIIIlIlIl[10] = 32 + 49 - -31 + 30 ^ 51 + 120 - 82 + 46;
        SquireShamansPlugin.lIIllIIIlIlIl[11] = 120 + 204 - 135 + 18 ^ 141 + 146 - 160 + 70;
        SquireShamansPlugin.lIIllIIIlIlIl[12] = 111 + 116 - 97 + 34 ^ 122 + 160 - 164 + 57;
        SquireShamansPlugin.lIIllIIIlIlIl[13] = 69 + 53 - -46 + 14 ^ 110 + 12 - 119 + 183;
        SquireShamansPlugin.lIIllIIIlIlIl[14] = 0x7A ^ 0x69 ^ (0x67 ^ 0x79);
        SquireShamansPlugin.lIIllIIIlIlIl[15] = 0x10 ^ 0x1E;
        SquireShamansPlugin.lIIllIIIlIlIl[16] = 69 + 122 - 28 + 41 ^ 39 + 108 - 137 + 185;
        SquireShamansPlugin.lIIllIIIlIlIl[17] = 0x77 ^ 0x38 ^ (0xF3 ^ 0xAC);
        SquireShamansPlugin.lIIllIIIlIlIl[18] = 65 + 147 - 62 + 40 ^ 94 + 135 - 111 + 57;
        SquireShamansPlugin.lIIllIIIlIlIl[19] = -1;
    }

    public int d() {
        return this.i;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireShamansPlugin.lIlIllllIIIIlll(chatMessage.getMessage().contains(lIIllIIIlIIlI[lIIllIIIlIlIl[2]]) ? 1 : 0)) {
            this.p = lIIllIIIlIlIl[2];
            Log.info((String)lIIllIIIlIIlI[lIIllIIIlIlIl[3]]);
            this.forceStop();
        }
    }

    public boolean i() {
        return this.n;
    }

    public boolean j() {
        return this.o;
    }

    public void f(boolean bl) {
        this.o = bl;
    }

    public Instant getStarted() {
        return this.g;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIIIlIlIl[0]];
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[1]] = t.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[2]] = v.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[3]] = r.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[4]] = p.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[5]] = m.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[6]] = x.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[7]] = q.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[8]] = z.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[9]] = A.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[10]] = B.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[11]] = k.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[12]] = l.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[13]] = n.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[14]] = o.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[15]] = u.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[16]] = w.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[17]] = y.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[18]] = s.class;
        return classArray;
    }

    public boolean h() {
        return this.m;
    }

    public int c() {
        return this.h;
    }

    public void c(boolean bl) {
        this.l = bl;
    }

    private static void lIlIllllIIIIlII() {
        lIIllIIIlIIlI = new String[lIIllIIIlIlIl[4]];
        SquireShamansPlugin.lIIllIIIlIIlI[SquireShamansPlugin.lIIllIIIlIlIl[1]] = SquireShamansPlugin."Lizardman shaman";
        SquireShamansPlugin.lIIllIIIlIIlI[SquireShamansPlugin.lIIllIIIlIlIl[2]] = SquireShamansPlugin."Oh dear, you are dead";
        SquireShamansPlugin.lIIllIIIlIIlI[SquireShamansPlugin.lIIllIIIlIlIl[3]] = SquireShamansPlugin."Died and no death handler just yet, so just stopping for now";
    }

    private static String lIlIllllIIIIIlI(String var22, String var21) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var1 = var21.toCharArray();
        int var8 = lIIllIIIlIlIl[1];
        char[] var11 = var22.toCharArray();
        int var5 = var11.length;
        int var10 = lIIllIIIlIlIl[1];
        while (SquireShamansPlugin.lIlIllllIIIlIII(var10, var5)) {
            char var18 = var11[var10];
            var19.append((char)(var18 ^ var1[var8 % var1.length]));
            0;
            ++var8;
            ++var10;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public SquireShamanConfig b() {
        return this.c;
    }

    protected void onStop() {
        this.d.remove((Overlay)this.e);
        0;
        this.d.remove((Overlay)this.f);
        0;
        this.b = lIIllIIIlIlIl[1];
        this.i = lIIllIIIlIlIl[19];
    }

    public boolean g() {
        return this.l;
    }

    @Provides
    SquireShamanConfig a(ConfigManager configManager) {
        return (SquireShamanConfig)configManager.getConfig(SquireShamanConfig.class);
    }

    public int a() {
        return this.b;
    }

    private static String lIlIllllIIIIIll(String var20, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlIl[9]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIllIIIlIlIl[3], var3);
            return new String(var9.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIlllllII(String var4, String var16) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIIllIIIlIlIl[3], var7);
            return new String(var15.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public boolean f() {
        return this.k;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    static {
        SquireShamansPlugin.lIlIllllIIIIllI();
        SquireShamansPlugin.lIlIllllIIIIlII();
        a = LoggerFactory.getLogger(SquireShamansPlugin.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        SquireShamansPlugin var2;
        void var13;
        NPC var14;
        if (SquireShamansPlugin.lIlIllllIIIIlll(this.p ? 1 : 0)) {
            this.forceStop();
        }
        if (SquireShamansPlugin.lIlIllllIIIIlll(lIIllIIIlIIlI[lIIllIIIlIlIl[1]].equals((var14 = var13.getNpc()).getName()) ? 1 : 0) && SquireShamansPlugin.lIlIllllIIIIlll(var2.c.room().x().contains(var13.getNpc().getWorldLocation()) ? 1 : 0) && SquireShamansPlugin.lIlIllllIIIIlll(var2.c.room().x().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            var2.b += lIIllIIIlIlIl[2];
        }
    }

    private static boolean lIlIllllIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        this.a(lIIllIIIlIlIl[19]);
        this.d.add((Overlay)this.e);
        0;
        this.d.add((Overlay)this.f);
        0;
        this.g = Instant.now();
        this.i = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
    }

    public void d(boolean bl) {
        this.m = bl;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public void a(int n2) {
        this.h = n2;
    }

    private static boolean lIlIllllIIIIlll(int n2) {
        return n2 != 0;
    }

    public boolean e() {
        return this.j;
    }
}

