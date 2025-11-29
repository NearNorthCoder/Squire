package gg.squire.plugins.skilling;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.skilling.overlay.InfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.A;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.B;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.C;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.D;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.E;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0001b;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0011l;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.F;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.G;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.H;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.I;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.J;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.K;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.L;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.M;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.N;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.O;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.P;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.Q;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.s;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.t;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.u;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.v;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.w;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.x;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.y;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.z;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.InventoryChanged;
@PluginDescriptor(name = "Squire Bankstander", description = "Does bank skilling", tags = {"fletching", "cooking", "crafting", "smithing", "magic", "skilling", "cannon"}, enabledByDefault = false)
/* loaded from: squire-bank-stander-0.1.0.jar:gg/squire/plugins/skilling/SquireBankStander.class */
public class SquireBankStander extends SquirePlugin {
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

    private static String lIlIlllllIIIll(String llllllllllllllllIIlIIlIlIllIlIII, String llllllllllllllllIIlIIlIlIllIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), lllIlIlIIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlIIII[3], llllllllllllllllIIlIIlIlIllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIlIllIlIIl) {
            llllllllllllllllIIlIIlIlIllIlIIl.printStackTrace();
            return null;
        }
    }

    public SquireBankStander() {
        Class<?>[] clsArr = new Class[lllIlIlIIII[0]];
        clsArr[lllIlIlIIII[1]] = B.class;
        clsArr[lllIlIlIIII[2]] = t.class;
        clsArr[lllIlIlIIII[3]] = E.class;
        clsArr[lllIlIlIIII[4]] = A.class;
        clsArr[lllIlIlIIII[5]] = v.class;
        clsArr[lllIlIlIIII[6]] = y.class;
        clsArr[lllIlIlIIII[7]] = H.class;
        clsArr[lllIlIlIIII[8]] = J.class;
        clsArr[lllIlIlIIII[9]] = C.class;
        clsArr[lllIlIlIIII[10]] = Q.class;
        clsArr[lllIlIlIIII[11]] = O.class;
        clsArr[lllIlIlIIII[12]] = x.class;
        clsArr[lllIlIlIIII[13]] = w.class;
        clsArr[lllIlIlIIII[14]] = I.class;
        clsArr[lllIlIlIIII[15]] = M.class;
        clsArr[lllIlIlIIII[16]] = N.class;
        clsArr[lllIlIlIIII[17]] = F.class;
        clsArr[lllIlIlIIII[18]] = D.class;
        clsArr[lllIlIlIIII[19]] = P.class;
        clsArr[lllIlIlIIII[20]] = K.class;
        clsArr[lllIlIlIIII[21]] = L.class;
        clsArr[lllIlIlIIII[22]] = G.class;
        clsArr[lllIlIlIIII[23]] = z.class;
        clsArr[lllIlIlIIII[24]] = u.class;
        this.a = clsArr;
        this.h = lllIlIlIIII[1];
    }

    private static String lIlIlllllIIlII(String llllllllllllllllIIlIIlIlIlIllIII, String llllllllllllllllIIlIIlIlIlIlIlll) {
        String llllllllllllllllIIlIIlIlIlIllIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIlIlIlIllI = new StringBuilder();
        char[] llllllllllllllllIIlIIlIlIlIlIlIl = llllllllllllllllIIlIIlIlIlIlIlll.toCharArray();
        int llllllllllllllllIIlIIlIlIlIlIlII = lllIlIlIIII[1];
        char[] charArray = llllllllllllllllIIlIIlIlIlIllIII2.toCharArray();
        int length = charArray.length;
        int i = lllIlIlIIII[1];
        while (lIlIlllllIllII(i, length)) {
            char llllllllllllllllIIlIIlIlIlIllIIl = charArray[i];
            llllllllllllllllIIlIIlIlIlIlIllI.append((char) (llllllllllllllllIIlIIlIlIlIllIIl ^ llllllllllllllllIIlIIlIlIlIlIlIl[llllllllllllllllIIlIIlIlIlIlIlII % llllllllllllllllIIlIIlIlIlIlIlIl.length]));
            "".length();
            llllllllllllllllIIlIIlIlIlIlIlII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIlIlIlIllI);
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (lIlIlllllIlIlI(inventoryChanged.getItemId(), this.b.cuttingProduct().E())) {
            this.f += lllIlIlIIII[2];
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public int b() {
        return this.e;
    }

    private static boolean lIlIlllllIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    protected void onStop() {
        this.c.remove(this.d);
        "".length();
        this.e = lllIlIlIIII[1];
        this.f = lllIlIlIIII[1];
        this.g = lllIlIlIIII[1];
    }

    public void c(int i) {
        this.h = i;
    }

    private static boolean lIlIlllllIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int e() {
        return this.h;
    }

    public InventorySetup a() {
        int i;
        int z;
        if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.GLASS_MAKE)) {
            if (lIlIlllllIlIIl(d() ? 1 : 0)) {
                return null;
            }
            return lIlIlllllIlIIl(this.b.glassMakeRunePouch() ? 1 : 0) ? new InventorySetup().add(item -> {
                return item.getName().toLowerCase().contains(lllIlIIllll[lllIlIlIIII[5]]);
            }, lllIlIlIIII[2]).add(this.b.seaweed().N(), this.b.seaweed().O()).add(lllIlIlIIII[25], this.b.seaweed().P()) : new InventorySetup().add(lllIlIlIIII[26]).add(lllIlIlIIII[27]).add(this.b.seaweed().N(), this.b.seaweed().O()).add(lllIlIlIIII[25], this.b.seaweed().P());
        } else if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.FURNACE_GLASS)) {
            return new InventorySetup().add(lllIlIlIIII[25], lllIlIlIIII[15]).add(lllIlIlIIII[28], lllIlIlIIII[15]);
        } else {
            if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.GLASS_BLOWING)) {
                return new InventorySetup().add(lllIlIlIIII[29], lllIlIlIIII[2]).add(lllIlIlIIII[30], lllIlIlIIII[31]);
            }
            if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.FLETCH_CUTTING)) {
                EnumC0011l fletchingProduct = this.b.fletchingProduct();
                if (lIlIlllllIlIIl(fletchingProduct.G() ? 1 : 0)) {
                    i = lllIlIlIIII[32];
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                } else {
                    i = lllIlIlIIII[31];
                }
                int i2 = i;
                if (lIlIlllllIlIII(fletchingProduct, EnumC0011l.CROSSBOW_STOCK)) {
                    return new InventorySetup().add(lllIlIlIIII[33], lllIlIlIIII[2]).add(fletchingProduct.z(), i2);
                }
                InventorySetup add = new InventorySetup().add(lllIlIlIIII[33], lllIlIlIIII[2]);
                if (lIlIlllllIlIII(fletchingProduct, EnumC0011l.ARROW_SHAFT)) {
                    z = this.b.arrowShaftLogs().M();
                    "".length();
                    if ((-" ".length()) >= 0) {
                        return null;
                    }
                } else {
                    z = fletchingProduct.z();
                }
                return add.add(z, i2);
            } else if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.COOKING)) {
                return new InventorySetup().add(this.b.cookingProduct().A(), lllIlIlIIII[34]);
            } else {
                if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.GEM_CUTTING)) {
                    return new InventorySetup().add(lllIlIlIIII[35], lllIlIlIIII[2]).add(this.b.cuttingProduct().z(), lllIlIlIIII[31]);
                }
                if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.JEWELRY)) {
                    return lIlIlllllIlIlI(this.b.jewelryProduct().H(), lllIlIlIIII[36]) ? new InventorySetup().add(this.b.jewelryProduct().I(), lllIlIlIIII[2]).add(this.b.jewelryProduct().z(), lllIlIlIIII[31]) : new InventorySetup().add(this.b.jewelryProduct().I(), lllIlIlIIII[2]).add(this.b.jewelryProduct().z(), lllIlIlIIII[14]).add(this.b.jewelryProduct().H(), lllIlIlIIII[14]);
                } else if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.SMITHING)) {
                    return new InventorySetup().add(this.b.smithingBar().p(), lllIlIlIIII[31]).add(lllIlIlIIII[37], lllIlIlIIII[2]);
                } else {
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.BATTLESTAVES)) {
                        return new InventorySetup().add(this.b.battlestaff().x(), lllIlIlIIII[15]).add(lllIlIlIIII[38], lllIlIlIIII[15]);
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.WINES)) {
                        return new InventorySetup().add(lllIlIlIIII[39], lllIlIlIIII[15]).add(lllIlIlIIII[40], lllIlIlIIII[15]);
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.ENCHANTING)) {
                        return new InventorySetup().add(this.b.enchantingProduct().z(), lllIlIlIIII[31]).add(lllIlIlIIII[41], lllIlIlIIII[31]);
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.ZERO_TICK)) {
                        if (lIlIlllllIlIII(this.b.zeroTickProduct(), s.SERUMS)) {
                            return new InventorySetup().add(lllIlIlIIII[42], lllIlIlIIII[15]).add(lllIlIlIIII[43], lllIlIlIIII[15]);
                        }
                        if (lIlIlllllIlIII(this.b.zeroTickProduct(), s.COMPOST)) {
                            return new InventorySetup().add(lllIlIlIIII[44], lllIlIlIIII[15]).add(lllIlIlIIII[45], lllIlIlIIII[15]);
                        }
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.ARMOUR)) {
                        return new InventorySetup().add(lllIlIlIIII[46], lllIlIlIIII[2]).add(lllIlIlIIII[47], lllIlIlIIII[34]).add(this.b.armourProduct().l(), this.b.armourProduct().m());
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.DARTS)) {
                        return new InventorySetup().add(this.b.dart().D()).add(lllIlIlIIII[48]);
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.STRING_BOWS)) {
                        return new InventorySetup().add(this.b.stringableBow().z(), lllIlIlIIII[15]).add(lllIlIlIIII[49], lllIlIlIIII[15]);
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.BOLTS)) {
                        return new InventorySetup().add(this.b.bolt().y()).add(lllIlIlIIII[48]);
                    }
                    if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.ARROWS)) {
                        return lIlIlllllIlIlI(this.b.arrowProduct().o(), lllIlIlIIII[50]) ? new InventorySetup().add(this.b.arrowProduct().o()).add(lllIlIlIIII[48]) : new InventorySetup().add(this.b.arrowProduct().o()).add(lllIlIlIIII[51]);
                    } else if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.SMELTING)) {
                        return lIlIlllllIlIlI(this.b.smeltingProduct().t(), lllIlIlIIII[36]) ? new InventorySetup().add(this.b.smeltingProduct().q(), this.b.smeltingProduct().s()) : new InventorySetup().add(this.b.smeltingProduct().q(), this.b.smeltingProduct().s()).add(this.b.smeltingProduct().t(), this.b.smeltingProduct().v());
                    } else if (lIlIlllllIlIII(this.b.activity(), EnumC0001b.CANNON_BALLS)) {
                        return new InventorySetup().add(item2 -> {
                            return item2.getName().toLowerCase().contains(lllIlIIllll[lllIlIlIIII[4]]);
                        }, lllIlIlIIII[2]).add(lllIlIlIIII[52], lllIlIlIIII[31]);
                    } else {
                        return null;
                    }
                }
            }
        }
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        if (lIlIlllllIlIlI(itemSpawned.getItem().getId(), lllIlIlIIII[30]) && lIlIlllllIlIll(itemSpawned.getItem().getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
            this.e += lllIlIlIIII[2];
        }
    }

    private static boolean lIlIlllllIlIll(int i) {
        return i == 0;
    }

    public void a(int i) {
        this.e = i;
    }

    static {
        lIlIlllllIIlll();
        lIlIlllllIIllI();
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (lIlIlllllIlIlI(itemDespawned.getItem().getId(), lllIlIlIIII[30]) && lIlIlllllIlIll(itemDespawned.getItem().getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
            if (!lIlIlllllIlIlI(this.e, lllIlIlIIII[2])) {
                this.e -= lllIlIlIIII[2];
                return;
            }
            this.e -= lllIlIlIIII[2];
            this.g = lllIlIlIIII[1];
            "".length();
            if (" ".length() == (((100 ^ 104) ^ (61 ^ 41)) & (((86 ^ 39) ^ (0 ^ 105)) ^ (-" ".length())))) {
            }
        }
    }

    public boolean d() {
        return this.g;
    }

    private static boolean lIlIlllllIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean z;
        if (lIlIlllllIlIII(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            ?? r1 = lllIlIlIIII[2];
            "".length();
            z = r1;
            if ((-" ".length()) > "  ".length()) {
                return;
            }
        } else {
            z = lllIlIlIIII[1];
        }
        setPaused(z);
    }

    private static boolean lIlIlllllIlIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    protected void onStart() {
        this.c.add(this.d);
        "".length();
        this.e = lllIlIlIIII[1];
        this.f = lllIlIlIIII[1];
        this.g = lllIlIlIIII[1];
    }

    private static String lIlIlllllIIlIl(String llllllllllllllllIIlIIlIlIlIIIIll, String llllllllllllllllIIlIIlIlIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIlIlIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIlIlIIIlIl.init(lllIlIlIIII[3], secretKeySpec);
            return new String(llllllllllllllllIIlIIlIlIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIlIlIIIlII) {
            llllllllllllllllIIlIIlIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    public void b(int i) {
        this.f = i;
    }

    private static void lIlIlllllIIlll() {
        lllIlIlIIII = new int[53];
        lllIlIlIIII[0] = (245 ^ 136) ^ (213 ^ 176);
        lllIlIlIIII[1] = ((((27 + 158) - 184) + 241) ^ (((13 + 103) - 6) + 75)) & (((((217 + 121) - 237) + 131) ^ (((80 + 86) - 135) + 132)) ^ (-" ".length()));
        lllIlIlIIII[2] = " ".length();
        lllIlIlIIII[3] = "  ".length();
        lllIlIlIIII[4] = "   ".length();
        lllIlIlIIII[5] = (16 ^ 45) ^ (158 ^ 167);
        lllIlIlIIII[6] = 116 ^ 113;
        lllIlIlIIII[7] = 122 ^ 124;
        lllIlIlIIII[8] = 160 ^ 167;
        lllIlIlIIII[9] = (33 ^ 45) ^ (196 ^ 192);
        lllIlIlIIII[10] = 107 ^ 98;
        lllIlIlIIII[11] = (150 ^ 156) ^ ((1 ^ 26) & ((125 ^ 102) ^ (-1)));
        lllIlIlIIII[12] = (33 ^ 8) ^ (34 ^ 0);
        lllIlIlIIII[13] = (5 ^ 57) ^ (22 ^ 38);
        lllIlIlIIII[14] = 105 ^ 100;
        lllIlIlIIII[15] = (((30 + 53) - (-44)) + 44) ^ (((87 + 95) - 87) + 70);
        lllIlIlIIII[16] = (7 ^ 10) ^ "  ".length();
        lllIlIlIIII[17] = 99 ^ 115;
        lllIlIlIIII[18] = 77 ^ 92;
        lllIlIlIIII[19] = 21 ^ 7;
        lllIlIlIIII[20] = " ".length() ^ (68 ^ 86);
        lllIlIlIIII[21] = 83 ^ 71;
        lllIlIlIIII[22] = (((11 + 18) - (-62)) + 83) ^ (((170 + 178) - 287) + 126);
        lllIlIlIIII[23] = 33 ^ 55;
        lllIlIlIIII[24] = 23 ^ 0;
        lllIlIlIIII[25] = (-2313) & 4095;
        lllIlIlIIII[26] = (-7305) & 16379;
        lllIlIlIIII[27] = (-13714) & 14267;
        lllIlIlIIII[28] = (-((-20369) & 32665)) & (-16387) & 30463;
        lllIlIlIIII[29] = (-26629) & 28413;
        lllIlIlIIII[30] = (-8465) & 10239;
        lllIlIlIIII[31] = 112 ^ 107;
        lllIlIlIIII[32] = (187 ^ 168) ^ (75 ^ 66);
        lllIlIlIIII[33] = (-18437) & 19382;
        lllIlIlIIII[34] = (((19 + 80) - 86) + 177) ^ (((85 + 70) - 52) + 59);
        lllIlIlIIII[35] = (-20485) & 22239;
        lllIlIlIIII[36] = -" ".length();
        lllIlIlIIII[37] = (-21573) & 23919;
        lllIlIlIIII[38] = (-29313) & 30703;
        lllIlIlIIII[39] = (-22605) & 24541;
        lllIlIlIIII[40] = (-24597) & 26583;
        lllIlIlIIII[41] = (-21828) & 22391;
        lllIlIlIIII[42] = (-4110) & 4701;
        lllIlIlIIII[43] = (67 ^ 41) ^ (141 ^ 184);
        lllIlIlIIII[44] = (-"   ".length()) & (-10278) & 16311;
        lllIlIlIIII[45] = (-2451) & 15871;
        lllIlIlIIII[46] = (-((-9799) & 16255)) & (-8193) & 16381;
        lllIlIlIIII[47] = (-((-15055) & 31487)) & (-12297) & 30462;
        lllIlIlIIII[48] = (-((-14203) & 32767)) & (-5122) & 23999;
        lllIlIlIIII[49] = (-30733) & 32509;
        lllIlIlIIII[50] = 162 ^ 150;
        lllIlIlIIII[51] = 47 ^ 26;
        lllIlIlIIII[52] = (-((-23605) & 24247)) & (-17413) & 20407;
    }

    @Provides
    BankStanderConfig a(ConfigManager configManager) {
        return (BankStanderConfig) configManager.getConfig(BankStanderConfig.class);
    }

    public int c() {
        return this.f;
    }

    private static void lIlIlllllIIllI() {
        lllIlIIllll = new String[lllIlIlIIII[6]];
        lllIlIIllll[lllIlIlIIII[1]] = lIlIlllllIIIll("ICWtqTr93fg=", "TdXNo");
        lllIlIIllll[lllIlIlIIII[2]] = lIlIlllllIIlII("NzYabxo8Jk44ATsn", "TCnOn");
        lllIlIIllll[lllIlIlIIII[3]] = lIlIlllllIIlIl("jYY8+0aI9We5zG6GoFFj9A==", "YQgvL");
        lllIlIIllll[lllIlIlIIII[4]] = lIlIlllllIIlII("DgAoGVQCAjAaEA==", "omEvt");
        lllIlIIllll[lllIlIlIIII[5]] = lIlIlllllIIlIl("DiAwasmISEqc4UF9tOVYvw==", "erWUd");
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIlIlllllIlIll(message.contains(lllIlIIllll[lllIlIlIIII[1]]) ? 1 : 0) && lIlIlllllIlIll(message.contains(lllIlIIllll[lllIlIlIIII[2]]) ? 1 : 0) && !lIlIlllllIlIIl(message.contains(lllIlIIllll[lllIlIlIIII[3]]) ? 1 : 0)) {
            return;
        }
        this.f += lllIlIlIIII[2];
    }
}
