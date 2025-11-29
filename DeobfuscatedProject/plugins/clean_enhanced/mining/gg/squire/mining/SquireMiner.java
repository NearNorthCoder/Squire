/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.overlay.MiningInfoBox;
import java.time.Instant;
import gg.squire.mining.HoppingWorldsTask;
import gg.squire.mining.MiningOreVeinTask;
import gg.squire.mining.RepairingStrutsTask;
import gg.squire.mining.WalkingToHopperTask;
import gg.squire.mining.WalkingToVeinsTask;
import gg.squire.mining.DepositingOresTask;
import gg.squire.mining.WithdrawingOresTask;
import gg.squire.mining.DepositingIntoGrinderTask;
import gg.squire.mining.MiningSandstoneTask;
import gg.squire.mining.BankingSuperheatTask;
import gg.squire.mining.MiningSuperheatTask;
import gg.squire.mining.HoppingToAvoidNearbyPlayerTask;
import gg.squire.mining.MiningVolcanicAshTask;
import gg.squire.mining.BuyingWaterskinsTask;
import gg.squire.mining.GoingBackThroughPassTask;
import gg.squire.mining.CastingHumidifyTask;
import gg.squire.mining.MovingTowardsShantayTask;
import gg.squire.mining.MiningManager;
import gg.squire.mining.MiningManager;
import gg.squire.mining.LoggingOutTask;
import gg.squire.mining.UsingSpecialAttackTask;
import gg.squire.mining.MiningBoneShardsTask;
import gg.squire.mining.MiningDaeyaltEssenceTask;
import gg.squire.mining.HandlingBankingTask;
import gg.squire.mining.LeavingEssenceMineTask;
import gg.squire.mining.MiningEsseneceTask;
import gg.squire.mining.BankingGemRocksTask;
import gg.squire.mining.DoingGemRocksTask;
import gg.squire.mining.MiningTask;
import gg.squire.mining.BankingAtGuildTask;
import gg.squire.mining.MiningGuildIronTask;
import gg.squire.mining.ChiselingAmethystTask;
import gg.squire.mining.MiningAmethystTask;
import gg.squire.mining.DoingArdyRocksTask;
import gg.squire.mining.DepositingInHopperTask;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Miner", enabledByDefault=false, description="Mining done easy.")
public class SquireMiner
extends SquirePlugin {
    private final  int[] a;
    private final  int[] b;
    private  Instant i;
    
    @Inject
    private  OverlayManager g;
    @Inject
    private  EventBus c;
    private  int j;
    
    @Inject
    private  SquireMinerConfig f;
    @Inject
    private  T d;
    @Inject
    private  U e;
    @Inject
    private  MiningInfoBox h;

    @Provides
    SquireMinerConfig a(ConfigManager configManager) {
        return (SquireMinerConfig)configManager.getConfig(SquireMinerConfig.class);
    }

    private static void var3() {
        var1 = new String[var2[21]];
        SquireMiner.var1[SquireMiner.var2[1]] = "Drop";
        SquireMiner.var1[SquireMiner.var2[3]] = "Clean";
        SquireMiner.var1[SquireMiner.var2[5]] = "Drop";
        SquireMiner.var1[SquireMiner.var2[7]] = "Drop";
        SquireMiner.var1[SquireMiner.var2[0]] = "quarry some";
        SquireMiner.var1[SquireMiner.var2[14]] = "additional ore";
        SquireMiner.var1[SquireMiner.var2[15]] = "Sandstone";
        SquireMiner.var1[SquireMiner.var2[16]] = "Sandstone";
        SquireMiner.var1[SquireMiner.var2[17]] = "Granite";
        SquireMiner.var1[SquireMiner.var2[18]] = "Granite";
        SquireMiner.var1[SquireMiner.var2[19]] = "geode";
        SquireMiner.var1[SquireMiner.var2[20]] = "geode";
    }

    public int b() {
        return this.j;
    }

    protected void onStop() {
        this.g.remove((Overlay)this.h);
        0;
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
    }

    public SquireMiner() {
        int[] nArray = new int[var2[0]];
        nArray[SquireMiner.var2[1]] = var2[2];
        nArray[SquireMiner.var2[3]] = var2[4];
        nArray[SquireMiner.var2[5]] = var2[6];
        nArray[SquireMiner.var2[7]] = var2[8];
        this.a = nArray;
        int[] nArray2 = new int[var2[0]];
        nArray2[SquireMiner.var2[1]] = var2[9];
        nArray2[SquireMiner.var2[3]] = var2[10];
        nArray2[SquireMiner.var2[5]] = var2[11];
        nArray2[SquireMiner.var2[7]] = var2[12];
        this.b = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        String string = chatMessage.getMessage();
        if (SquireMiner.var5(string.contains(var1[var2[0]]) ? 1 : 0)) {
            this.j += var2[3];
        }
        if (SquireMiner.var5(var4.contains(var1[var2[14]]) ? 1 : 0)) {
            var6.j += var2[5];
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[13]];
        classArray[SquireMiner.var2[1]] = DepositingIntoGrinderTask.class;
        classArray[SquireMiner.var2[3]] = MiningSandstoneTask.class;
        classArray[SquireMiner.var2[5]] = UsingSpecialAttackTask.class;
        classArray[SquireMiner.var2[7]] = WalkingToVeinsTask.class;
        classArray[SquireMiner.var2[0]] = MiningOreVeinTask.class;
        classArray[SquireMiner.var2[14]] = WalkingToHopperTask.class;
        classArray[SquireMiner.var2[15]] = DepositingInHopperTask.class;
        classArray[SquireMiner.var2[16]] = WithdrawingOresTask.class;
        classArray[SquireMiner.var2[17]] = DepositingOresTask.class;
        classArray[SquireMiner.var2[18]] = RepairingStrutsTask.class;
        classArray[SquireMiner.var2[19]] = HoppingWorldsTask.class;
        classArray[SquireMiner.var2[20]] = MiningTask.class;
        classArray[SquireMiner.var2[21]] = LoggingOutTask.class;
        classArray[SquireMiner.var2[22]] = MiningAmethystTask.class;
        classArray[SquireMiner.var2[23]] = BankingAtGuildTask.class;
        classArray[SquireMiner.var2[24]] = ChiselingAmethystTask.class;
        classArray[SquireMiner.var2[25]] = MiningEsseneceTask.class;
        classArray[SquireMiner.var2[26]] = LeavingEssenceMineTask.class;
        classArray[SquireMiner.var2[27]] = HandlingBankingTask.class;
        classArray[SquireMiner.var2[28]] = BuyingWaterskinsTask.class;
        classArray[SquireMiner.var2[29]] = GoingBackThroughPassTask.class;
        classArray[SquireMiner.var2[30]] = MovingTowardsShantayTask.class;
        classArray[SquireMiner.var2[31]] = CastingHumidifyTask.class;
        classArray[SquireMiner.var2[32]] = MiningGuildIronTask.class;
        classArray[SquireMiner.var2[33]] = MiningSuperheatTask.class;
        classArray[SquireMiner.var2[34]] = BankingSuperheatTask.class;
        classArray[SquireMiner.var2[35]] = MiningVolcanicAshTask.class;
        classArray[SquireMiner.var2[36]] = HoppingToAvoidNearbyPlayerTask.class;
        classArray[SquireMiner.var2[37]] = DoingArdyRocksTask.class;
        classArray[SquireMiner.var2[38]] = DoingGemRocksTask.class;
        classArray[SquireMiner.var2[39]] = BankingGemRocksTask.class;
        classArray[SquireMiner.var2[40]] = MiningBoneShardsTask.class;
        classArray[SquireMiner.var2[41]] = MiningDaeyaltEssenceTask.class;
        return classArray;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    public Instant getStarted() {
        return this.i;
    }

    private static void var13() {
        var2 = new int[46];
        SquireMiner.var2[0] = 0x42 ^ 0x4E ^ (0x3C ^ 0x34);
        SquireMiner.var2[1] = (0x37 ^ 0x6B) & ~(0xD0 ^ 0x8C);
        SquireMiner.var2[2] = 169 + 104 - 176 + 120 + (12 + 93 - 79 + 197) - (0xFFFFE7FE & 0x1933) + (0x2E ^ 0x5D);
        SquireMiner.var2[3] = 1;
        SquireMiner.var2[4] = 170 + 64 - 210 + 227;
        SquireMiner.var2[5] = 2;
        SquireMiner.var2[6] = 231 + 149 - 324 + 197;
        SquireMiner.var2[7] = 3;
        SquireMiner.var2[8] = (0xA ^ 0x32) + (0xEA ^ 0x89) - (22 + 91 - -8 + 20) + (136 + 88 - 147 + 164);
        SquireMiner.var2[9] = 41 + 98 - 83 + 143;
        SquireMiner.var2[10] = 87 + 20 - 82 + 131 + (0xFF ^ 0x89) - (0x2A ^ 0x4E) + (0xAB ^ 0xB0);
        SquireMiner.var2[11] = 74 + 29 - 67 + 106 + (0xD4 ^ 0x9B) - (94 + 70 - 27 + 28) + (29 + 133 - 146 + 131);
        SquireMiner.var2[12] = 98 + 179 - 213 + 141;
        SquireMiner.var2[13] = 0x5A ^ 0x54 ^ (0x52 ^ 0x7D);
        SquireMiner.var2[14] = 0x9D ^ 0x98;
        SquireMiner.var2[15] = 0xCE ^ 0xBD ^ (0xC ^ 0x79);
        SquireMiner.var2[16] = 108 + 57 - 77 + 44 ^ 113 + 90 - 132 + 60;
        SquireMiner.var2[17] = 0x91 ^ 0x99;
        SquireMiner.var2[18] = 0x52 ^ 0x5B;
        SquireMiner.var2[19] = 0x2B ^ 0x21;
        SquireMiner.var2[20] = 0xB ^ 0;
        SquireMiner.var2[21] = 0x16 ^ 0x28 ^ (0x2D ^ 0x1F);
        SquireMiner.var2[22] = 0x25 ^ 0x18 ^ (0x4E ^ 0x7E);
        SquireMiner.var2[23] = 128 + 86 - 78 + 18 ^ 119 + 18 - 116 + 127;
        SquireMiner.var2[24] = 0x47 ^ 0x48;
        SquireMiner.var2[25] = 0x54 ^ 0x7A ^ (0x20 ^ 0x1E);
        SquireMiner.var2[26] = 0x5D ^ 0x4C;
        SquireMiner.var2[27] = 6 ^ 0xA ^ (0x52 ^ 0x4C);
        SquireMiner.var2[28] = 0x39 ^ 0x2A;
        SquireMiner.var2[29] = 0x23 ^ 0x1F ^ (0x4C ^ 0x64);
        SquireMiner.var2[30] = 0xB5 ^ 0xA0;
        SquireMiner.var2[31] = 3 ^ (0x29 ^ 0x3C);
        SquireMiner.var2[32] = 142 + 57 - 25 + 14 ^ 17 + 157 - 47 + 44;
        SquireMiner.var2[33] = 0x62 ^ 0x7A;
        SquireMiner.var2[34] = 49 + 19 - 67 + 174 ^ 13 + 28 - 24 + 165;
        SquireMiner.var2[35] = 0x5F ^ 0x45;
        SquireMiner.var2[36] = 0x58 ^ 0x43;
        SquireMiner.var2[37] = 0x25 ^ 0x39;
        SquireMiner.var2[38] = 0x7B ^ 0x66;
        SquireMiner.var2[39] = 0xD9 ^ 0xC7;
        SquireMiner.var2[40] = 0xF0 ^ 0xA7 ^ (0xF ^ 0x47);
        SquireMiner.var2[41] = 0x7E ^ 0x5E;
        SquireMiner.var2[42] = -(0xFFFFE9EF & 0x5635) & (0xFFFFCFB7 & 0x77FF);
        SquireMiner.var2[43] = -(0xFFFFE6CF & 0x7979) & (0xFFFFEFFE & 0x73FB);
        SquireMiner.var2[44] = 0xFFFFFDFF & 0x1ABD;
        SquireMiner.var2[45] = 0xFFFFDDBF & 0x3AFC;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    protected void onStart() {
        this.i = Instant.now();
        this.g.add((Overlay)this.h);
        0;
        this.d.A();
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.j = var2[1];
    }

    static {
        SquireMiner.var13();
        SquireMiner.var3();
    }

    public void a() {
        SquireMiner var22;
        if (SquireMiner.var5(Inventory.contains(item -> item.getName().contains(var1[var2[20]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(var1[var2[19]])).interact(var1[var2[1]]);
        }
        if (SquireMiner.var21(Inventory.contains((int[])var22.a) ? 1 : 0) && SquireMiner.var5(Inventory.contains((int[])var22.b) ? 1 : 0)) {
            Inventory.getFirst((int[])var22.b).interact(var1[var2[3]]);
        }
        if (SquireMiner.var5(Inventory.contains(item -> item.getName().contains(var1[var2[18]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(var1[var2[17]])).interact(var1[var2[5]]);
        }
        if (SquireMiner.var21(var22.f.deposit() ? 1 : 0) && SquireMiner.var5(Inventory.contains(item -> item.getName().contains(var1[var2[16]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(var1[var2[15]])).interact(var1[var2[7]]);
        }
        if (SquireMiner.var5(Inventory.contains((int[])var22.a) ? 1 : 0)) {
            int[] nArray = new int[var2[3]];
            nArray[SquireMiner.var2[1]] = var2[42];
            Inventory.getFirst((int[])var22.a).useOn(Inventory.getFirst((int[])nArray));
        }
        int[] nArray = new int[var2[3]];
        nArray[SquireMiner.var2[1]] = var2[43];
        if (SquireMiner.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[3]];
            nArray2[SquireMiner.var2[1]] = var2[44];
            if (SquireMiner.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[var2[3]];
                nArray3[SquireMiner.var2[1]] = var2[43];
                int[] nArray4 = new int[var2[3]];
                nArray4[SquireMiner.var2[1]] = var2[44];
                Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                0;
                if (-2 > 0) {
                    return;
                }
            } else {
                int[] nArray5 = new int[var2[3]];
                nArray5[SquireMiner.var2[1]] = var2[45];
                if (SquireMiner.var5(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[var2[3]];
                    nArray6[SquireMiner.var2[1]] = var2[43];
                    int[] nArray7 = new int[var2[3]];
                    nArray7[SquireMiner.var2[1]] = var2[45];
                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                }
            }
        }
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var2[1];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var2[1];
        while (SquireMiner.var20(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }
}

