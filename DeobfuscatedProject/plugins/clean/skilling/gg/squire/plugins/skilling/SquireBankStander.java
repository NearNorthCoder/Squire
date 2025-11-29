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
import gg.squire.plugins.skilling.BlowingGlassTask;
import gg.squire.plugins.skilling.GlassMakeTask;
import gg.squire.plugins.skilling.MakingJewelryTask;
import gg.squire.plugins.skilling.MakingArmourTask;
import gg.squire.plugins.skilling.PickingUpGlassTask;
import gg.squire.plugins.skilling.MakingArrowsTask;
import gg.squire.plugins.skilling.MakingBoltsTask;
import gg.squire.plugins.skilling.CuttingStuffTask;
import gg.squire.plugins.skilling.MakingDartsTask;
import gg.squire.plugins.skilling.StringingBowsTask;
import gg.squire.plugins.skilling.AlchingTask;
import gg.squire.plugins.skilling.EnchantingBoltsTask;
import gg.squire.plugins.skilling.EnchantingTask;
import gg.squire.plugins.skilling.0TickingTask;
import gg.squire.plugins.skilling.CannonBallsTask;
import gg.squire.plugins.skilling.SmeltingTask;
import gg.squire.plugins.skilling.SmithingTask;
import gg.squire.plugins.skilling.GameEnum9;
import gg.squire.plugins.skilling.GameEnum30;
import gg.squire.plugins.skilling.GameEnum22;
import gg.squire.plugins.skilling.BankingTask;
import gg.squire.plugins.skilling.InactivityTrackerTask;
import gg.squire.plugins.skilling.CookingTask;
import gg.squire.plugins.skilling.MakingWinesTask;
import gg.squire.plugins.skilling.MakingBattlestavesTask;
import gg.squire.plugins.skilling.CuttingGemsTask;
import gg.squire.plugins.skilling.MoltenGlassFurnaceTask;
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

    @Inject
    private  InfoBox d;
    private  int h;
    private  int f;
    private  int e;
    @Inject
    private  BankStanderConfig b;
    private  boolean g;
    private final  Class<?>[] a;
    @Inject
    private  OverlayManager c;

    public SquireBankStander() {
        Class[] classArray = new Class[lllIlIlIIII[0]];
        classArray[SquireBankStander.lllIlIlIIII[1]] = GlassMakeTask.class;
        classArray[SquireBankStander.lllIlIlIIII[2]] = BankingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[3]] = PickingUpGlassTask.class;
        classArray[SquireBankStander.lllIlIlIIII[4]] = BlowingGlassTask.class;
        classArray[SquireBankStander.lllIlIlIIII[5]] = CookingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[6]] = CuttingGemsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[7]] = CuttingStuffTask.class;
        classArray[SquireBankStander.lllIlIlIIII[8]] = StringingBowsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[9]] = MakingJewelryTask.class;
        classArray[SquireBankStander.lllIlIlIIII[10]] = SmithingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[11]] = CannonBallsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[12]] = MakingBattlestavesTask.class;
        classArray[SquireBankStander.lllIlIlIIII[13]] = MakingWinesTask.class;
        classArray[SquireBankStander.lllIlIlIIII[14]] = MakingDartsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[15]] = EnchantingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[16]] = 0TickingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[17]] = MakingArrowsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[18]] = MakingArmourTask.class;
        classArray[SquireBankStander.lllIlIlIIII[19]] = SmeltingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[20]] = AlchingTask.class;
        classArray[SquireBankStander.lllIlIlIIII[21]] = EnchantingBoltsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[22]] = MakingBoltsTask.class;
        classArray[SquireBankStander.lllIlIlIIII[23]] = MoltenGlassFurnaceTask.class;
        classArray[SquireBankStander.lllIlIlIIII[24]] = InactivityTrackerTask.class;
        this.a = classArray;
        this.h = lllIlIlIIII[1];
    }

        return String.valueOf(var1);
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
        SquireBankStander var2;
        if (SquireBankStander.lIlIlllllIlIII((Object)this.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GLASS_MAKE)) {
            if (SquireBankStander.lIlIlllllIlIIl(this.d() ? 1 : 0)) {
                return null;
            }
            if (SquireBankStander.lIlIlllllIlIIl(var2.b.glassMakeRunePouch() ? 1 : 0)) {
                return new InventorySetup().add(item -> item.getName().toLowerCase().contains(lllIlIIllll[lllIlIlIIII[5]]), lllIlIlIIII[2]).add(var2.b.seaweed().N(), var2.b.seaweed().O()).add(lllIlIlIIII[25], var2.b.seaweed().P());
            }
            return new InventorySetup().add(lllIlIlIIII[26]).add(lllIlIlIIII[27]).add(var2.b.seaweed().N(), var2.b.seaweed().O()).add(lllIlIlIIII[25], var2.b.seaweed().P());
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.FURNACE_GLASS)) {
            return new InventorySetup().add(lllIlIlIIII[25], lllIlIlIIII[15]).add(lllIlIlIIII[28], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GLASS_BLOWING)) {
            return new InventorySetup().add(lllIlIlIIII[29], lllIlIlIIII[2]).add(lllIlIlIIII[30], lllIlIlIIII[31]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.FLETCH_CUTTING)) {
            int n2;
            int var3;
            int n3;
            l var4 = var2.b.fletchingProduct();
            int var5 = var4.G() ? 1 : 0;
            if (SquireBankStander.lIlIlllllIlIIl(var5)) {
                n3 = lllIlIlIIII[32];

                if (1 <= 0) {
                    return null;
                }
            } else {
                n3 = var3 = lllIlIlIIII[31];
            }
            if (SquireBankStander.lIlIlllllIlIII((Object)var4, (Object)l.CROSSBOW_STOCK)) {
                return new InventorySetup().add(lllIlIlIIII[33], lllIlIlIIII[2]).add(var4.z(), var3);
            }
            InventorySetup inventorySetup = new InventorySetup().add(lllIlIlIIII[33], lllIlIlIIII[2]);
            if (SquireBankStander.lIlIlllllIlIII((Object)var4, (Object)l.ARROW_SHAFT)) {
                n2 = var2.b.arrowShaftLogs().M();

            } else {
                n2 = var4.z();
            }
            return inventorySetup.add(n2, var3);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.COOKING)) {
            return new InventorySetup().add(var2.b.cookingProduct().A(), lllIlIlIIII[34]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GEM_CUTTING)) {
            return new InventorySetup().add(lllIlIlIIII[35], lllIlIlIIII[2]).add(var2.b.cuttingProduct().z(), lllIlIlIIII[31]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.JEWELRY)) {
            if (SquireBankStander.lIlIlllllIlIlI(var2.b.jewelryProduct().H(), lllIlIlIIII[36])) {
                return new InventorySetup().add(var2.b.jewelryProduct().I(), lllIlIlIIII[2]).add(var2.b.jewelryProduct().z(), lllIlIlIIII[31]);
            }
            return new InventorySetup().add(var2.b.jewelryProduct().I(), lllIlIlIIII[2]).add(var2.b.jewelryProduct().z(), lllIlIlIIII[14]).add(var2.b.jewelryProduct().H(), lllIlIlIIII[14]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.SMITHING)) {
            return new InventorySetup().add(var2.b.smithingBar().p(), lllIlIlIIII[31]).add(lllIlIlIIII[37], lllIlIlIIII[2]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.BATTLESTAVES)) {
            return new InventorySetup().add(var2.b.battlestaff().x(), lllIlIlIIII[15]).add(lllIlIlIIII[38], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.WINES)) {
            return new InventorySetup().add(lllIlIlIIII[39], lllIlIlIIII[15]).add(lllIlIlIIII[40], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ENCHANTING)) {
            return new InventorySetup().add(var2.b.enchantingProduct().z(), lllIlIlIIII[31]).add(lllIlIlIIII[41], lllIlIlIIII[31]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ZERO_TICK)) {
            if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.zeroTickProduct(), (Object)s.SERUMS)) {
                return new InventorySetup().add(lllIlIlIIII[42], lllIlIlIIII[15]).add(lllIlIlIIII[43], lllIlIlIIII[15]);
            }
            if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.zeroTickProduct(), (Object)s.COMPOST)) {
                return new InventorySetup().add(lllIlIlIIII[44], lllIlIlIIII[15]).add(lllIlIlIIII[45], lllIlIlIIII[15]);
            }
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ARMOUR)) {
            return new InventorySetup().add(lllIlIlIIII[46], lllIlIlIIII[2]).add(lllIlIlIIII[47], lllIlIlIIII[34]).add(var2.b.armourProduct().l(), var2.b.armourProduct().m());
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.DARTS)) {
            return new InventorySetup().add(var2.b.dart().D()).add(lllIlIlIIII[48]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.STRING_BOWS)) {
            return new InventorySetup().add(var2.b.stringableBow().z(), lllIlIlIIII[15]).add(lllIlIlIIII[49], lllIlIlIIII[15]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.BOLTS)) {
            return new InventorySetup().add(var2.b.bolt().y()).add(lllIlIlIIII[48]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ARROWS)) {
            if (SquireBankStander.lIlIlllllIlIlI(var2.b.arrowProduct().o(), lllIlIlIIII[50])) {
                return new InventorySetup().add(var2.b.arrowProduct().o()).add(lllIlIlIIII[48]);
            }
            return new InventorySetup().add(var2.b.arrowProduct().o()).add(lllIlIlIIII[51]);
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.SMELTING)) {
            if (SquireBankStander.lIlIlllllIlIlI(var2.b.smeltingProduct().t(), lllIlIlIIII[36])) {
                return new InventorySetup().add(var2.b.smeltingProduct().q(), var2.b.smeltingProduct().s());
            }
            return new InventorySetup().add(var2.b.smeltingProduct().q(), var2.b.smeltingProduct().s()).add(var2.b.smeltingProduct().t(), var2.b.smeltingProduct().v());
        }
        if (SquireBankStander.lIlIlllllIlIII((Object)var2.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.CANNON_BALLS)) {
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

                if (1 == ((0x64 ^ 0x68 ^ (0x3D ^ 0x29)) & (0x56 ^ 0x27 ^ (0 ^ 0x69) ^ -1))) {
                    return;
                }
            } else {
                var6.e -= lllIlIlIIII[2];
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

            if (-1 > 2) {
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

        this.e = lllIlIlIIII[1];
        this.f = lllIlIlIIII[1];
        this.g = lllIlIlIIII[1];
    }

    public void b(int n2) {
        this.f = n2;
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
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[1]] = "make";
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[2]] = "cut the wood";
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[3]] = "add a string";
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[4]] = "ammo mould";
        SquireBankStander.lllIlIIllll[SquireBankStander.lllIlIlIIII[5]] = "rune pouch";
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!SquireBankStander.lIlIlllllIlIll(string.contains(lllIlIIllll[lllIlIlIIII[1]]) ? 1 : 0) || !SquireBankStander.lIlIlllllIlIll(string.contains(lllIlIIllll[lllIlIlIIII[2]]) ? 1 : 0) || SquireBankStander.lIlIlllllIlIIl(string.contains(lllIlIIllll[lllIlIlIIII[3]]) ? 1 : 0)) {
            var7.f += lllIlIlIIII[2];
        }
    }
}

