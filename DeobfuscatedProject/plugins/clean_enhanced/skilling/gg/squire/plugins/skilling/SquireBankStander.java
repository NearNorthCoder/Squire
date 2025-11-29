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
import gg.squire.plugins.skilling.GameEnum4;
import gg.squire.plugins.skilling.GameEnum12;
import gg.squire.plugins.skilling.GameEnum9;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public SquireBankStander() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireBankStander.var1[1]] = GlassMakeTask.class;
        classArray[SquireBankStander.var1[2]] = BankingTask.class;
        classArray[SquireBankStander.var1[3]] = PickingUpGlassTask.class;
        classArray[SquireBankStander.var1[4]] = BlowingGlassTask.class;
        classArray[SquireBankStander.var1[5]] = CookingTask.class;
        classArray[SquireBankStander.var1[6]] = CuttingGemsTask.class;
        classArray[SquireBankStander.var1[7]] = CuttingStuffTask.class;
        classArray[SquireBankStander.var1[8]] = StringingBowsTask.class;
        classArray[SquireBankStander.var1[9]] = MakingJewelryTask.class;
        classArray[SquireBankStander.var1[10]] = SmithingTask.class;
        classArray[SquireBankStander.var1[11]] = CannonBallsTask.class;
        classArray[SquireBankStander.var1[12]] = MakingBattlestavesTask.class;
        classArray[SquireBankStander.var1[13]] = MakingWinesTask.class;
        classArray[SquireBankStander.var1[14]] = MakingDartsTask.class;
        classArray[SquireBankStander.var1[15]] = EnchantingTask.class;
        classArray[SquireBankStander.var1[16]] = 0TickingTask.class;
        classArray[SquireBankStander.var1[17]] = MakingArrowsTask.class;
        classArray[SquireBankStander.var1[18]] = MakingArmourTask.class;
        classArray[SquireBankStander.var1[19]] = SmeltingTask.class;
        classArray[SquireBankStander.var1[20]] = AlchingTask.class;
        classArray[SquireBankStander.var1[21]] = EnchantingBoltsTask.class;
        classArray[SquireBankStander.var1[22]] = MakingBoltsTask.class;
        classArray[SquireBankStander.var1[23]] = MoltenGlassFurnaceTask.class;
        classArray[SquireBankStander.var1[24]] = InactivityTrackerTask.class;
        this.a = classArray;
        this.h = var1[1];
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[1];
        while (SquireBankStander.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (((0x4D ^ 0x72) & ~(0x1E ^ 0x21)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (SquireBankStander.var20(inventoryChanged.getItemId(), this.b.cuttingProduct().E())) {
            this.f += var1[2];
        }
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public int b() {
        return this.e;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);
        0;
        this.e = var1[1];
        this.f = var1[1];
        this.g = var1[1];
    }

    public void c(int n2) {
        this.h = n2;
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    public int e() {
        return this.h;
    }

    public InventorySetup a() {
        SquireBankStander var22;
        if (SquireBankStander.var21((Object)this.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GLASS_MAKE)) {
            if (SquireBankStander.var23(this.d() ? 1 : 0)) {
                return null;
            }
            if (SquireBankStander.var23(var22.b.glassMakeRunePouch() ? 1 : 0)) {
                return new InventorySetup().add(item -> item.getName().toLowerCase().contains(var2[var1[5]]), var1[2]).add(var22.b.seaweed().N(), var22.b.seaweed().O()).add(var1[25], var22.b.seaweed().P());
            }
            return new InventorySetup().add(var1[26]).add(var1[27]).add(var22.b.seaweed().N(), var22.b.seaweed().O()).add(var1[25], var22.b.seaweed().P());
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.FURNACE_GLASS)) {
            return new InventorySetup().add(var1[25], var1[15]).add(var1[28], var1[15]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GLASS_BLOWING)) {
            return new InventorySetup().add(var1[29], var1[2]).add(var1[30], var1[31]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.FLETCH_CUTTING)) {
            int n2;
            int var24;
            int n3;
            l var25 = var22.b.fletchingProduct();
            int var26 = var25.G() ? 1 : 0;
            if (SquireBankStander.var23(var26)) {
                n3 = var1[32];
                0;
                if (1 <= 0) {
                    return null;
                }
            } else {
                n3 = var24 = var1[31];
            }
            if (SquireBankStander.var21((Object)var25, (Object)l.CROSSBOW_STOCK)) {
                return new InventorySetup().add(var1[33], var1[2]).add(var25.z(), var24);
            }
            InventorySetup inventorySetup = new InventorySetup().add(var1[33], var1[2]);
            if (SquireBankStander.var21((Object)var25, (Object)l.ARROW_SHAFT)) {
                n2 = var22.b.arrowShaftLogs().M();
                0;
                if (-1 >= 0) {
                    return null;
                }
            } else {
                n2 = var25.z();
            }
            return inventorySetup.add(n2, var24);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.COOKING)) {
            return new InventorySetup().add(var22.b.cookingProduct().A(), var1[34]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.GEM_CUTTING)) {
            return new InventorySetup().add(var1[35], var1[2]).add(var22.b.cuttingProduct().z(), var1[31]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.JEWELRY)) {
            if (SquireBankStander.var20(var22.b.jewelryProduct().H(), var1[36])) {
                return new InventorySetup().add(var22.b.jewelryProduct().I(), var1[2]).add(var22.b.jewelryProduct().z(), var1[31]);
            }
            return new InventorySetup().add(var22.b.jewelryProduct().I(), var1[2]).add(var22.b.jewelryProduct().z(), var1[14]).add(var22.b.jewelryProduct().H(), var1[14]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.SMITHING)) {
            return new InventorySetup().add(var22.b.smithingBar().p(), var1[31]).add(var1[37], var1[2]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.BATTLESTAVES)) {
            return new InventorySetup().add(var22.b.battlestaff().x(), var1[15]).add(var1[38], var1[15]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.WINES)) {
            return new InventorySetup().add(var1[39], var1[15]).add(var1[40], var1[15]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ENCHANTING)) {
            return new InventorySetup().add(var22.b.enchantingProduct().z(), var1[31]).add(var1[41], var1[31]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ZERO_TICK)) {
            if (SquireBankStander.var21((Object)var22.b.zeroTickProduct(), (Object)s.SERUMS)) {
                return new InventorySetup().add(var1[42], var1[15]).add(var1[43], var1[15]);
            }
            if (SquireBankStander.var21((Object)var22.b.zeroTickProduct(), (Object)s.COMPOST)) {
                return new InventorySetup().add(var1[44], var1[15]).add(var1[45], var1[15]);
            }
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ARMOUR)) {
            return new InventorySetup().add(var1[46], var1[2]).add(var1[47], var1[34]).add(var22.b.armourProduct().l(), var22.b.armourProduct().m());
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.DARTS)) {
            return new InventorySetup().add(var22.b.dart().D()).add(var1[48]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.STRING_BOWS)) {
            return new InventorySetup().add(var22.b.stringableBow().z(), var1[15]).add(var1[49], var1[15]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.BOLTS)) {
            return new InventorySetup().add(var22.b.bolt().y()).add(var1[48]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.ARROWS)) {
            if (SquireBankStander.var20(var22.b.arrowProduct().o(), var1[50])) {
                return new InventorySetup().add(var22.b.arrowProduct().o()).add(var1[48]);
            }
            return new InventorySetup().add(var22.b.arrowProduct().o()).add(var1[51]);
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.SMELTING)) {
            if (SquireBankStander.var20(var22.b.smeltingProduct().t(), var1[36])) {
                return new InventorySetup().add(var22.b.smeltingProduct().q(), var22.b.smeltingProduct().s());
            }
            return new InventorySetup().add(var22.b.smeltingProduct().q(), var22.b.smeltingProduct().s()).add(var22.b.smeltingProduct().t(), var22.b.smeltingProduct().v());
        }
        if (SquireBankStander.var21((Object)var22.b.activity(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b.CANNON_BALLS)) {
            return new InventorySetup().add(item -> item.getName().toLowerCase().contains(var2[var1[4]]), var1[2]).add(var1[52], var1[31]);
        }
        return null;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        if (SquireBankStander.var20(itemSpawned.getItem().getId(), var1[30]) && SquireBankStander.var27(itemSpawned.getItem().getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
            this.e += var1[2];
        }
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

    public void a(int n2) {
        this.e = n2;
    }

    static {
        SquireBankStander.var28();
        SquireBankStander.var29();
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (SquireBankStander.var20(itemDespawned.getItem().getId(), var1[30]) && SquireBankStander.var27(itemDespawned.getItem().getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
            if (SquireBankStander.var20(this.e, var1[2])) {
                this.e -= var1[2];
                this.g = var1[1];
                0;
                if (1 == ((0x64 ^ 0x68 ^ (0x3D ^ 0x29)) & (0x56 ^ 0x27 ^ (0 ^ 0x69) ^ -1))) {
                    return;
                }
            } else {
                var30.e -= var1[2];
            }
        }
    }

    public boolean d() {
        return this.g;
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean bl;
        if (SquireBankStander.var21(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            bl = var1[2];
            0;
            if (-1 > 2) {
                return;
            }
        } else {
            bl = var1[1];
        }
        this.setPaused(bl);
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }

    protected void onStart() {
        this.c.add((Overlay)this.d);
        0;
        this.e = var1[1];
        this.f = var1[1];
        this.g = var1[1];
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    public void b(int n2) {
        this.f = n2;
    }

    private static void var28() {
        var1 = new int[53];
        SquireBankStander.var1[0] = 0xF5 ^ 0x88 ^ (0xD5 ^ 0xB0);
        SquireBankStander.var1[1] = (27 + 158 - 184 + 241 ^ 13 + 103 - 6 + 75) & (217 + 121 - 237 + 131 ^ 80 + 86 - 135 + 132 ^ -1);
        SquireBankStander.var1[2] = 1;
        SquireBankStander.var1[3] = 2;
        SquireBankStander.var1[4] = 3;
        SquireBankStander.var1[5] = 0x10 ^ 0x2D ^ (0x9E ^ 0xA7);
        SquireBankStander.var1[6] = 0x74 ^ 0x71;
        SquireBankStander.var1[7] = 0x7A ^ 0x7C;
        SquireBankStander.var1[8] = 0xA0 ^ 0xA7;
        SquireBankStander.var1[9] = 0x21 ^ 0x2D ^ (0xC4 ^ 0xC0);
        SquireBankStander.var1[10] = 0x6B ^ 0x62;
        SquireBankStander.var1[11] = 0x96 ^ 0x9C ^ (1 ^ 0x1A) & ~(0x7D ^ 0x66);
        SquireBankStander.var1[12] = 0x21 ^ 8 ^ (0x22 ^ 0);
        SquireBankStander.var1[13] = 5 ^ 0x39 ^ (0x16 ^ 0x26);
        SquireBankStander.var1[14] = 0x69 ^ 0x64;
        SquireBankStander.var1[15] = 30 + 53 - -44 + 44 ^ 87 + 95 - 87 + 70;
        SquireBankStander.var1[16] = 7 ^ 0xA ^ 2;
        SquireBankStander.var1[17] = 0x63 ^ 0x73;
        SquireBankStander.var1[18] = 0x4D ^ 0x5C;
        SquireBankStander.var1[19] = 0x15 ^ 7;
        SquireBankStander.var1[20] = 1 ^ (0x44 ^ 0x56);
        SquireBankStander.var1[21] = 0x53 ^ 0x47;
        SquireBankStander.var1[22] = 11 + 18 - -62 + 83 ^ 170 + 178 - 287 + 126;
        SquireBankStander.var1[23] = 0x21 ^ 0x37;
        SquireBankStander.var1[24] = 0x17 ^ 0;
        SquireBankStander.var1[25] = 0xFFFFF6F7 & 0xFFF;
        SquireBankStander.var1[26] = 0xFFFFE377 & 0x3FFB;
        SquireBankStander.var1[27] = 0xFFFFCA6E & 0x37BB;
        SquireBankStander.var1[28] = -(0xFFFFB06F & 0x7F99) & (0xFFFFBFFD & 0x76FF);
        SquireBankStander.var1[29] = 0xFFFF97FB & 0x6EFD;
        SquireBankStander.var1[30] = 0xFFFFDEEF & 0x27FF;
        SquireBankStander.var1[31] = 0x70 ^ 0x6B;
        SquireBankStander.var1[32] = 0xBB ^ 0xA8 ^ (0x4B ^ 0x42);
        SquireBankStander.var1[33] = 0xFFFFB7FB & 0x4BB6;
        SquireBankStander.var1[34] = 19 + 80 - 86 + 177 ^ 85 + 70 - 52 + 59;
        SquireBankStander.var1[35] = 0xFFFFAFFB & 0x56DF;
        SquireBankStander.var1[36] = -1;
        SquireBankStander.var1[37] = 0xFFFFABBB & 0x5D6F;
        SquireBankStander.var1[38] = 0xFFFF8D7F & 0x77EF;
        SquireBankStander.var1[39] = 0xFFFFA7B3 & 0x5FDD;
        SquireBankStander.var1[40] = 0xFFFF9FEB & 0x67D7;
        SquireBankStander.var1[41] = 0xFFFFAABC & 0x5777;
        SquireBankStander.var1[42] = 0xFFFFEFF2 & 0x125D;
        SquireBankStander.var1[43] = 0x43 ^ 0x29 ^ (0x8D ^ 0xB8);
        SquireBankStander.var1[44] = -3 & (0xFFFFD7DA & 0x3FB7);
        SquireBankStander.var1[45] = 0xFFFFF66D & 0x3DFF;
        SquireBankStander.var1[46] = -(0xFFFFD9B9 & 0x3F7F) & (0xFFFFDFFF & 0x3FFD);
        SquireBankStander.var1[47] = -(0xFFFFC531 & 0x7AFF) & (0xFFFFCFF7 & 0x76FE);
        SquireBankStander.var1[48] = -(0xFFFFC885 & Short.MAX_VALUE) & (0xFFFFEBFE & 0x5DBF);
        SquireBankStander.var1[49] = 0xFFFF87F3 & 0x7EFD;
        SquireBankStander.var1[50] = 0xA2 ^ 0x96;
        SquireBankStander.var1[51] = 0x2F ^ 0x1A;
        SquireBankStander.var1[52] = -(0xFFFFA3CB & 0x5EB7) & (0xFFFFBBFB & 0x4FB7);
    }

    @Provides
    BankStanderConfig a(ConfigManager configManager) {
        return (BankStanderConfig)configManager.getConfig(BankStanderConfig.class);
    }

    public int c() {
        return this.f;
    }

    private static void var29() {
        var2 = new String[var1[6]];
        SquireBankStander.var2[SquireBankStander.var1[1]] = "make";
        SquireBankStander.var2[SquireBankStander.var1[2]] = "cut the wood";
        SquireBankStander.var2[SquireBankStander.var1[3]] = "add a string";
        SquireBankStander.var2[SquireBankStander.var1[4]] = "ammo mould";
        SquireBankStander.var2[SquireBankStander.var1[5]] = "rune pouch";
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!SquireBankStander.var27(string.contains(var2[var1[1]]) ? 1 : 0) || !SquireBankStander.var27(string.contains(var2[var1[2]]) ? 1 : 0) || SquireBankStander.var23(string.contains(var2[var1[3]]) ? 1 : 0)) {
            var37.f += var1[2];
        }
    }
}

