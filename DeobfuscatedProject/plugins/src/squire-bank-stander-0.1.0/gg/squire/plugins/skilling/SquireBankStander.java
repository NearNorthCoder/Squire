/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.GameState
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.events.InventoryChanged
 */
package gg.squire.plugins.skilling;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.overlay.InfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.A;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.B;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.C;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.D;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.E;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.F;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.G;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.H;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.I;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.J;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.K;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.L;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.M;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.N;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.O;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.P;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.Q;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.l;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.s;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.t;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.u;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.v;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.w;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.x;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.y;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.z;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.InventoryChanged;

@PluginDescriptor(name="Squire Bankstander", description="Does bank skilling", tags={"fletching", "cooking", "crafting", "smithing", "magic", "skilling", "cannon"}, enabledByDefault=false)
public class SquireBankStander
extends SquirePlugin {
    private static /* synthetic */ int[] lllIlIlIIII;
    private static /* synthetic */ String[] lllIlIIllll;
    @Inject
    private /* synthetic */ InfoBox d;
    private /* synthetic */ int h;
    private /* synthetic */ int f;
    private /* synthetic */ int e;
    @Inject
    private /* synthetic */ BankStanderConfig b;
    private /* synthetic */ boolean g;
    private final /* synthetic */ Class<?>[] a;
    @Inject
    private /* synthetic */ OverlayManager c;

    private static String lIlIlllllIIIll(String llllllllllllllllIIlIIlIlIllIlIII, String llllllllllllllllIIlIIlIlIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIIII[9]), "DES");
            Cipher llllllllllllllllIIlIIlIlIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIlIllIlIlI.init(lllIlIlIIII[3], llllllllllllllllIIlIIlIlIllIlIll);
            return new String(llllllllllllllllIIlIIlIlIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIlIllIlIIl) {
            llllllllllllllllIIlIIlIlIllIlIIl.printStackTrace();
            return null;
        }
    }

    public SquireBankStander() {
        Class[] classArray = new Class[lllIlIlIIII[0]];
        classArray[SquireBankStander.lllIlIlIIII[1]] = B.class;
        classArray[SquireBankStander.lllIlIlIIII[2]] = t.class;
        classArray[SquireBankStander.lllIlIlIIII[3]] = E.class;
        classArray[SquireBankStander.lllIlIlIIII[4]] = A.class;
        classArray[SquireBankStander.lllIlIlIIII[5]] = v.class;
        classArray[SquireBankStander.lllIlIlIIII[6]] = y.class;
        classArray[SquireBankStander.lllIlIlIIII[7]] = H.class;
        classArray[SquireBankStander.lllIlIlIIII[8]] = J.class;
        classArray[SquireBankStander.lllIlIlIIII[9]] = C.class;
        classArray[SquireBankStander.lllIlIlIIII[10]] = Q.class;
        classArray[SquireBankStander.lllIlIlIIII[11]] = O.class;
        classArray[SquireBankStander.lllIlIlIIII[12]] = x.class;
        classArray[SquireBankStander.lllIlIlIIII[13]] = w.class;
        classArray[SquireBankStander.lllIlIlIIII[14]] = I.class;
        classArray[SquireBankStander.lllIlIlIIII[15]] = M.class;
        classArray[SquireBankStander.lllIlIlIIII[16]] = N.class;
        classArray[SquireBankStander.lllIlIlIIII[17]] = F.class;
        classArray[SquireBankStander.lllIlIlIIII[18]] = D.class;
        classArray[SquireBankStander.lllIlIlIIII[19]] = P.class;
        classArray[SquireBankStander.lllIlIlIIII[20]] = K.class;
        classArray[SquireBankStander.lllIlIlIIII[21]] = L.class;
        classArray[SquireBankStander.lllIlIlIIII[22]] = G.class;
        classArray[SquireBankStander.lllIlIlIIII[23]] = z.class;
        classArray[SquireBankStander.lllIlIlIIII[24]] = u.class;
        this.a = classArray;
        this.h = lllIlIlIIII[1];
    }

    private static String lIlIlllllIIlII(String llllllllllllllllIIlIIlIlIlIlIIll, String llllllllllllllllIIlIIlIlIlIlIIlI) {
        llllllllllllllllIIlIIlIlIlIlIIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIlIlIlIllI = new StringBuilder();
        char[] llllllllllllllllIIlIIlIlIlIlIlIl = llllllllllllllllIIlIIlIlIlIlIIlI.toCharArray();
        int llllllllllllllllIIlIIlIlIlIlIlII = lllIlIlIIII[1];
        char[] llllllllllllllllIIlIIlIlIlIIlllI = llllllllllllllllIIlIIlIlIlIlIIll.toCharArray();
        int llllllllllllllllIIlIIlIlIlIIllIl = llllllllllllllllIIlIIlIlIlIIlllI.length;
        int llllllllllllllllIIlIIlIlIlIIllII = lllIlIlIIII[1];
        while (SquireBankStander.lIlIlllllIllII(llllllllllllllllIIlIIlIlIlIIllII, llllllllllllllllIIlIIlIlIlIIllIl)) {
            char llllllllllllllllIIlIIlIlIlIllIIl = llllllllllllllllIIlIIlIlIlIIlllI[llllllllllllllllIIlIIlIlIlIIllII];
            llllllllllllllllIIlIIlIlIlIlIllI.append((char)(llllllllllllllllIIlIIlIlIlIllIIl ^ llllllllllllllllIIlIIlIlIlIlIlIl[llllllllllllllllIIlIIlIlIlIlIlII % llllllllllllllllIIlIIlIlIlIlIlIl.length]));
            "".length();
            ++llllllllllllllllIIlIIlIlIlIlIlII;
            ++llllllllllllllllIIlIIlIlIlIIllII;
            "".length();
            if (((0x4D ^ 0x72) & ~(0x1E ^ 0x21)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIlIlIlIllI);
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (SquireBankStander.lIlIlllllIlIlI(inventoryChanged.getItemId(), this.b.cuttingProduct().E())) {
            this.f += lllIlIlIIII[2];
        }
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public int b() {
        return this.e;
    }

    private static boolean lIlIlllllIllII(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);
        "".length();
        this.e = lllIlIlIIII[1];
        this.f = lllIlIlIIII[1];
        this.g = lllIlIlIIII[1];
    }

    public void c(int n2) {
        this.h = n2;
    }

    private static boolean lIlIlllllIlIII(Object object, Object object2) {
        return object == object2;
    }

    public int e() {
        return this.h;
    }

    public InventorySetup a() {
        SquireBankStander llllllllllllllllIIlIIlIllIIIlIIl;
        if (SquireBankStander.lIlIlllllIlIII((Object)this.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GLASS_MAKE)) {
            if (SquireBankStander.lIlIlllllIlIIl(this.d() ? 1 : 0)) {
                return null;
            }
            if (SquireBankStander.lIlIlllllIlIIl(llllllllllllllllIIlIIlIllIIIlIIl.b.glassMakeRunePouch() ? 1 : 0)) {
                return new InventorySetup().add(item -> item.getName().toLowerCase().contains(lllIlIIllll[lllIlIlIIII[5]]), lllIlIlIIII[2]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.seaweed().N(), llllllllllllllllIIlIIlIllIIIlIIl.b.seaweed().O()).add(lllIlIlIIII[25], llllllllllllllllIIlIIlIllIIIlIIl.b.seaweed().P());
            }
            return new InventorySetup().add(lllIlIlIIII[26]).add(lllIlIlIIII[27]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.seaweed().N(), llllllllllllllllIIlIIlIllIIIlIIl.b.seaweed().O()).add(lllIlIlIIII[25], llllllllllllllllIIlIIlIllIIIlIIl.b.seaweed().P());
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.FURNACE_GLASS)) {
            return new InventorySetup().add(lllIlIlIIII[25], lllIlIlIIII[15]).add(lllIlIlIIII[28], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GLASS_BLOWING)) {
            return new InventorySetup().add(lllIlIlIIII[29], lllIlIlIIII[2]).add(lllIlIlIIII[30], lllIlIlIIII[31]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.FLETCH_CUTTING)) {
            int n2;
            int llllllllllllllllIIlIIlIllIIIIllI;
            int n3;
            l llllllllllllllllIIlIIlIllIIIlIII = llllllllllllllllIIlIIlIllIIIlIIl.b.fletchingProduct();
            int llllllllllllllllIIlIIlIllIIIIlll = llllllllllllllllIIlIIlIllIIIlIII.G() ? 1 : 0;
            if (SquireBankStander.lIlIlllllIlIIl(llllllllllllllllIIlIIlIllIIIIlll)) {
                n3 = lllIlIlIIII[32];
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            } else {
                n3 = llllllllllllllllIIlIIlIllIIIIllI = lllIlIlIIII[31];
            }
            if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIII, (Object)l.CROSSBOW_STOCK)) {
                return new InventorySetup().add(lllIlIlIIII[33], lllIlIlIIII[2]).add(llllllllllllllllIIlIIlIllIIIlIII.z(), llllllllllllllllIIlIIlIllIIIIllI);
            }
            InventorySetup inventorySetup = new InventorySetup().add(lllIlIlIIII[33], lllIlIlIIII[2]);
            if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIII, (Object)l.ARROW_SHAFT)) {
                n2 = llllllllllllllllIIlIIlIllIIIlIIl.b.arrowShaftLogs().M();
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            } else {
                n2 = llllllllllllllllIIlIIlIllIIIlIII.z();
            }
            return inventorySetup.add(n2, llllllllllllllllIIlIIlIllIIIIllI);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.COOKING)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.cookingProduct().A(), lllIlIlIIII[34]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GEM_CUTTING)) {
            return new InventorySetup().add(lllIlIlIIII[35], lllIlIlIIII[2]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.cuttingProduct().z(), lllIlIlIIII[31]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.JEWELRY)) {
            if (SquireBankStander.lIlIlllllIlIlI(llllllllllllllllIIlIIlIllIIIlIIl.b.jewelryProduct().H(), lllIlIlIIII[36])) {
                return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.jewelryProduct().I(), lllIlIlIIII[2]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.jewelryProduct().z(), lllIlIlIIII[31]);
            }
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.jewelryProduct().I(), lllIlIlIIII[2]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.jewelryProduct().z(), lllIlIlIIII[14]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.jewelryProduct().H(), lllIlIlIIII[14]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.SMITHING)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.smithingBar().p(), lllIlIlIIII[31]).add(lllIlIlIIII[37], lllIlIlIIII[2]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.BATTLESTAVES)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.battlestaff().x(), lllIlIlIIII[15]).add(lllIlIlIIII[38], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.WINES)) {
            return new InventorySetup().add(lllIlIlIIII[39], lllIlIlIIII[15]).add(lllIlIlIIII[40], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ENCHANTING)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.enchantingProduct().z(), lllIlIlIIII[31]).add(lllIlIlIIII[41], lllIlIlIIII[31]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ZERO_TICK)) {
            if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.zeroTickProduct(), (Object)s.SERUMS)) {
                return new InventorySetup().add(lllIlIlIIII[42], lllIlIlIIII[15]).add(lllIlIlIIII[43], lllIlIlIIII[15]);
            }
            if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.zeroTickProduct(), (Object)s.COMPOST)) {
                return new InventorySetup().add(lllIlIlIIII[44], lllIlIlIIII[15]).add(lllIlIlIIII[45], lllIlIlIIII[15]);
            }
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ARMOUR)) {
            return new InventorySetup().add(lllIlIlIIII[46], lllIlIlIIII[2]).add(lllIlIlIIII[47], lllIlIlIIII[34]).add(llllllllllllllllIIlIIlIllIIIlIIl.b.armourProduct().l(), llllllllllllllllIIlIIlIllIIIlIIl.b.armourProduct().m());
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.DARTS)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.dart().D()).add(lllIlIlIIII[48]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.STRING_BOWS)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.stringableBow().z(), lllIlIlIIII[15]).add(lllIlIlIIII[49], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.BOLTS)) {
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.bolt().y()).add(lllIlIlIIII[48]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ARROWS)) {
            if (SquireBankStander.lIlIlllllIlIlI(llllllllllllllllIIlIIlIllIIIlIIl.b.arrowProduct().o(), lllIlIlIIII[50])) {
                return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.arrowProduct().o()).add(lllIlIlIIII[48]);
            }
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.arrowProduct().o()).add(lllIlIlIIII[51]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.SMELTING)) {
            if (SquireBankStander.lIlIlllllIlIlI(llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().t(), lllIlIlIIII[36])) {
                return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().q(), llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().s());
            }
            return new InventorySetup().add(llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().q(), llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().s()).add(llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().t(), llllllllllllllllIIlIIlIllIIIlIIl.b.smeltingProduct().v());
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)llllllllllllllllIIlIIlIllIIIlIIl.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.CANNON_BALLS)) {
            return new InventorySetup().add(item -> item.getName().toLowerCase().contains(lllIlIIllll[lllIlIlIIII[4]]), lllIlIlIIII[2]).add(lllIlIlIIII[52], lllIlIlIIII[31]);
        }
        return null;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        if (SquireBankStander.lIlIlllllIlIlI(itemSpawned.getItem().getId(), lllIlIlIIII[30]) && SquireBankStander.lIlIlllllIlIll(itemSpawned.getItem().getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
            this.e += lllIlIlIIII[2];
        }
    }

    private static boolean lIlIlllllIlIll(int n2) {
        return n2 == 0;
    }

    public void a(int n2) {
        this.e = n2;
    }

    static {
        SquireBankStander.lIlIlllllIIlll();
        SquireBankStander.lIlIlllllIIllI();
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (SquireBankStander.lIlIlllllIlIlI(itemDespawned.getItem().getId(), lllIlIlIIII[30]) && SquireBankStander.lIlIlllllIlIll(itemDespawned.getItem().getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
            if (SquireBankStander.lIlIlllllIlIlI(this.e, lllIlIlIIII[2])) {
                this.e -= lllIlIlIIII[2];
                this.g = lllIlIlIIII[1];
                "".length();
                if (" ".length() == ((0x64 ^ 0x68 ^ (0x3D ^ 0x29)) & (0x56 ^ 0x27 ^ (0 ^ 0x69) ^ -" ".length()))) {
                    return;
                }
            } else {
                llllllllllllllllIIlIIlIlIllllIll.e -= lllIlIlIIII[2];
            }
        }
    }

    public boolean d() {
        return this.g;
    }

    private static boolean lIlIlllllIlIIl(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean bl;
        if (SquireBankStander.lIlIlllllIlIII(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            bl = lllIlIlIIII[2];
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        } else {
            bl = lllIlIlIIII[1];
        }
        this.setPaused(bl);
    }

    private static boolean lIlIlllllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    protected void onStart() {
        this.c.add((Overlay)this.d);
        "".length();
        this.e = lllIlIlIIII[1];
        this.f = lllIlIlIIII[1];
        this.g = lllIlIlIIII[1];
    }

    private static String lIlIlllllIIlIl(String llllllllllllllllIIlIIlIlIlIIIIll, String llllllllllllllllIIlIIlIlIlIIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIlIlIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIlIlIIIlIl.init(lllIlIlIIII[3], llllllllllllllllIIlIIlIlIlIIIllI);
            return new String(llllllllllllllllIIlIIlIlIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIlIlIIIlII) {
            llllllllllllllllIIlIIlIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    public void b(int n2) {
        this.f = n2;
    }

    private static void lIlIlllllIIlll() {
        lllIlIlIIII = new int[53];
        SquireBankStander.lllIlIlIIII[0] = 0xF5 ^ 0x88 ^ (0xD5 ^ 0xB0);
        SquireBankStander.lllIlIlIIII[1] = (27 + 158 - 184 + 241 ^ 13 + 103 - 6 + 75) & (217 + 121 - 237 + 131 ^ 80 + 86 - 135 + 132 ^ -" ".length());
        SquireBankStander.lllIlIlIIII[2] = " ".length();
        SquireBankStander.lllIlIlIIII[3] = "  ".length();
        SquireBankStander.lllIlIlIIII[4] = "   ".length();
        SquireBankStander.lllIlIlIIII[5] = 0x10 ^ 0x2D ^ (0x9E ^ 0xA7);
        SquireBankStander.lllIlIlIIII[6] = 0x74 ^ 0x71;
        SquireBankStander.lllIlIlIIII[7] = 0x7A ^ 0x7C;
        SquireBankStander.lllIlIlIIII[8] = 0xA0 ^ 0xA7;
        SquireBankStander.lllIlIlIIII[9] = 0x21 ^ 0x2D ^ (0xC4 ^ 0xC0);
        SquireBankStander.lllIlIlIIII[10] = 0x6B ^ 0x62;
        SquireBankStander.lllIlIlIIII[11] = 0x96 ^ 0x9C ^ (1 ^ 0x1A) & ~(0x7D ^ 0x66);
        SquireBankStander.lllIlIlIIII[12] = 0x21 ^ 8 ^ (0x22 ^ 0);
        SquireBankStander.lllIlIlIIII[13] = 5 ^ 0x39 ^ (0x16 ^ 0x26);
        SquireBankStander.lllIlIlIIII[14] = 0x69 ^ 0x64;
        SquireBankStander.lllIlIlIIII[15] = 30 + 53 - -44 + 44 ^ 87 + 95 - 87 + 70;
        SquireBankStander.lllIlIlIIII[16] = 7 ^ 0xA ^ "  ".length();
        SquireBankStander.lllIlIlIIII[17] = 0x63 ^ 0x73;
        SquireBankStander.lllIlIlIIII[18] = 0x4D ^ 0x5C;
        SquireBankStander.lllIlIlIIII[19] = 0x15 ^ 7;
        SquireBankStander.lllIlIlIIII[20] = " ".length() ^ (0x44 ^ 0x56);
        SquireBankStander.lllIlIlIIII[21] = 0x53 ^ 0x47;
        SquireBankStander.lllIlIlIIII[22] = 11 + 18 - -62 + 83 ^ 170 + 178 - 287 + 126;
        SquireBankStander.lllIlIlIIII[23] = 0x21 ^ 0x37;
        SquireBankStander.lllIlIlIIII[24] = 0x17 ^ 0;
        SquireBankStander.lllIlIlIIII[25] = 0xFFFFF6F7 & 0xFFF;
        SquireBankStander.lllIlIlIIII[26] = 0xFFFFE377 & 0x3FFB;
        SquireBankStander.lllIlIlIIII[27] = 0xFFFFCA6E & 0x37BB;
        SquireBankStander.lllIlIlIIII[28] = -(0xFFFFB06F & 0x7F99) & (0xFFFFBFFD & 0x76FF);
        SquireBankStander.lllIlIlIIII[29] = 0xFFFF97FB & 0x6EFD;
        SquireBankStander.lllIlIlIIII[30] = 0xFFFFDEEF & 0x27FF;
        SquireBankStander.lllIlIlIIII[31] = 0x70 ^ 0x6B;
        SquireBankStander.lllIlIlIIII[32] = 0xBB ^ 0xA8 ^ (0x4B ^ 0x42);
        SquireBankStander.lllIlIlIIII[33] = 0xFFFFB7FB & 0x4BB6;
        SquireBankStander.lllIlIlIIII[34] = 19 + 80 - 86 + 177 ^ 85 + 70 - 52 + 59;
        SquireBankStander.lllIlIlIIII[35] = 0xFFFFAFFB & 0x56DF;
        SquireBankStander.lllIlIlIIII[36] = -" ".length();
        SquireBankStander.lllIlIlIIII[37] = 0xFFFFABBB & 0x5D6F;
        SquireBankStander.lllIlIlIIII[38] = 0xFFFF8D7F & 0x77EF;
        SquireBankStander.lllIlIlIIII[39] = 0xFFFFA7B3 & 0x5FDD;
        SquireBankStander.lllIlIlIIII[40] = 0xFFFF9FEB & 0x67D7;
        SquireBankStander.lllIlIlIIII[41] = 0xFFFFAABC & 0x5777;
        SquireBankStander.lllIlIlIIII[42] = 0xFFFFEFF2 & 0x125D;
        SquireBankStander.lllIlIlIIII[43] = 0x43 ^ 0x29 ^ (0x8D ^ 0xB8);
        SquireBankStander.lllIlIlIIII[44] = -"   ".length() & (0xFFFFD7DA & 0x3FB7);
        SquireBankStander.lllIlIlIIII[45] = 0xFFFFF66D & 0x3DFF;
        SquireBankStander.lllIlIlIIII[46] = -(0xFFFFD9B9 & 0x3F7F) & (0xFFFFDFFF & 0x3FFD);
        SquireBankStander.lllIlIlIIII[47] = -(0xFFFFC531 & 0x7AFF) & (0xFFFFCFF7 & 0x76FE);
        SquireBankStander.lllIlIlIIII[48] = -(0xFFFFC885 & Short.MAX_VALUE) & (0xFFFFEBFE & 0x5DBF);
        SquireBankStander.lllIlIlIIII[49] = 0xFFFF87F3 & 0x7EFD;
        SquireBankStander.lllIlIlIIII[50] = 0xA2 ^ 0x96;
        SquireBankStander.lllIlIlIIII[51] = 0x2F ^ 0x1A;
        SquireBankStander.lllIlIlIIII[52] = -(0xFFFFA3CB & 0x5EB7) & (0xFFFFBBFB & 0x4FB7);
    }

    @Provides
    BankStanderConfig a(ConfigManager configManager) {
        return (BankStanderConfig)configManager.getConfig(BankStanderConfig.class);
    }

    public int c() {
        return this.f;
    }

    private static void lIlIlllllIIllI() {
        lllIlIIllll = new String[lllIlIlIIII[6]];
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[1]] = SquireBankStander.lIlIlllllIIIll("ICWtqTr93fg=", "TdXNo");
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[2]] = SquireBankStander.lIlIlllllIIlII("NzYabxo8Jk44ATsn", "TCnOn");
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[3]] = SquireBankStander.lIlIlllllIIlIl("jYY8+0aI9We5zG6GoFFj9A==", "YQgvL");
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[4]] = SquireBankStander.lIlIlllllIIlII("DgAoGVQCAjAaEA==", "omEvt");
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[5]] = SquireBankStander.lIlIlllllIIlIl("DiAwasmISEqc4UF9tOVYvw==", "erWUd");
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!SquireBankStander.lIlIlllllIlIll(string.contains(lllIlIIllll[lllIlIlIIII[1]]) ? 1 : 0) || !SquireBankStander.lIlIlllllIlIll(string.contains(lllIlIIllll[lllIlIlIIII[2]]) ? 1 : 0) || SquireBankStander.lIlIlllllIlIIl(string.contains(lllIlIIllll[lllIlIlIIII[3]]) ? 1 : 0)) {
            llllllllllllllllIIlIIlIlIlllIllI.f += lllIlIlIIII[2];
        }
    }
}

