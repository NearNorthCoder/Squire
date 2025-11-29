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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.mining.UHelper;
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

    private static void lIIlIlIlIIIlIlI() {
        llllllIlllll = new String[lllllllIIlII[21]];
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[1]] = "Drop";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[3]] = "Clean";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[5]] = "Drop";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[7]] = "Drop";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[0]] = "quarry some";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[14]] = "additional ore";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[15]] = "Sandstone";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[16]] = "Sandstone";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[17]] = "Granite";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[18]] = "Granite";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[19]] = "geode";
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[20]] = "geode";
    }

    public int b() {
        return this.j;
    }

    protected void onStop() {
        this.g.remove((Overlay)this.h);

        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
    }

    public SquireMiner() {
        int[] nArray = new int[lllllllIIlII[0]];
        nArray[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[2];
        nArray[SquireMiner.lllllllIIlII[3]] = lllllllIIlII[4];
        nArray[SquireMiner.lllllllIIlII[5]] = lllllllIIlII[6];
        nArray[SquireMiner.lllllllIIlII[7]] = lllllllIIlII[8];
        this.a = nArray;
        int[] nArray2 = new int[lllllllIIlII[0]];
        nArray2[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[9];
        nArray2[SquireMiner.lllllllIIlII[3]] = lllllllIIlII[10];
        nArray2[SquireMiner.lllllllIIlII[5]] = lllllllIIlII[11];
        nArray2[SquireMiner.lllllllIIlII[7]] = lllllllIIlII[12];
        this.b = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        String string = chatMessage.getMessage();
        if (SquireMiner.lIIlIlIlIIIllII(string.contains(llllllIlllll[lllllllIIlII[0]]) ? 1 : 0)) {
            this.j += lllllllIIlII[3];
        }
        if (SquireMiner.lIIlIlIlIIIllII(var1.contains(llllllIlllll[lllllllIIlII[14]]) ? 1 : 0)) {
            var2.j += lllllllIIlII[5];
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllllllIIlII[13]];
        classArray[SquireMiner.lllllllIIlII[1]] = DepositingIntoGrinderTask.class;
        classArray[SquireMiner.lllllllIIlII[3]] = MiningSandstoneTask.class;
        classArray[SquireMiner.lllllllIIlII[5]] = UsingSpecialAttackTask.class;
        classArray[SquireMiner.lllllllIIlII[7]] = WalkingToVeinsTask.class;
        classArray[SquireMiner.lllllllIIlII[0]] = MiningOreVeinTask.class;
        classArray[SquireMiner.lllllllIIlII[14]] = WalkingToHopperTask.class;
        classArray[SquireMiner.lllllllIIlII[15]] = DepositingInHopperTask.class;
        classArray[SquireMiner.lllllllIIlII[16]] = WithdrawingOresTask.class;
        classArray[SquireMiner.lllllllIIlII[17]] = DepositingOresTask.class;
        classArray[SquireMiner.lllllllIIlII[18]] = RepairingStrutsTask.class;
        classArray[SquireMiner.lllllllIIlII[19]] = HoppingWorldsTask.class;
        classArray[SquireMiner.lllllllIIlII[20]] = MiningTask.class;
        classArray[SquireMiner.lllllllIIlII[21]] = LoggingOutTask.class;
        classArray[SquireMiner.lllllllIIlII[22]] = MiningAmethystTask.class;
        classArray[SquireMiner.lllllllIIlII[23]] = BankingAtGuildTask.class;
        classArray[SquireMiner.lllllllIIlII[24]] = ChiselingAmethystTask.class;
        classArray[SquireMiner.lllllllIIlII[25]] = MiningEsseneceTask.class;
        classArray[SquireMiner.lllllllIIlII[26]] = LeavingEssenceMineTask.class;
        classArray[SquireMiner.lllllllIIlII[27]] = HandlingBankingTask.class;
        classArray[SquireMiner.lllllllIIlII[28]] = BuyingWaterskinsTask.class;
        classArray[SquireMiner.lllllllIIlII[29]] = GoingBackThroughPassTask.class;
        classArray[SquireMiner.lllllllIIlII[30]] = MovingTowardsShantayTask.class;
        classArray[SquireMiner.lllllllIIlII[31]] = CastingHumidifyTask.class;
        classArray[SquireMiner.lllllllIIlII[32]] = MiningGuildIronTask.class;
        classArray[SquireMiner.lllllllIIlII[33]] = MiningSuperheatTask.class;
        classArray[SquireMiner.lllllllIIlII[34]] = BankingSuperheatTask.class;
        classArray[SquireMiner.lllllllIIlII[35]] = MiningVolcanicAshTask.class;
        classArray[SquireMiner.lllllllIIlII[36]] = HoppingToAvoidNearbyPlayerTask.class;
        classArray[SquireMiner.lllllllIIlII[37]] = DoingArdyRocksTask.class;
        classArray[SquireMiner.lllllllIIlII[38]] = DoingGemRocksTask.class;
        classArray[SquireMiner.lllllllIIlII[39]] = BankingGemRocksTask.class;
        classArray[SquireMiner.lllllllIIlII[40]] = MiningBoneShardsTask.class;
        classArray[SquireMiner.lllllllIIlII[41]] = MiningDaeyaltEssenceTask.class;
        return classArray;
    }

    private static boolean lIIlIlIlIIIllII(int n2) {
        return n2 != 0;
    }

    public Instant getStarted() {
        return this.i;
    }

    private static boolean lIIlIlIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIlIIIllIl(int n2) {
        return n2 == 0;
    }

    protected void onStart() {
        this.i = Instant.now();
        this.g.add((Overlay)this.h);

        this.d.A();
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.j = lllllllIIlII[1];
    }

    static {
        SquireMiner.lIIlIlIlIIIlIll();
        SquireMiner.lIIlIlIlIIIlIlI();
    }

    public void a() {
        SquireMiner var3;
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains(item -> item.getName().contains(llllllIlllll[lllllllIIlII[20]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(llllllIlllll[lllllllIIlII[19]])).interact(llllllIlllll[lllllllIIlII[1]]);
        }
        if (SquireMiner.lIIlIlIlIIIllIl(Inventory.contains((int[])var3.a) ? 1 : 0) && SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])var3.b) ? 1 : 0)) {
            Inventory.getFirst((int[])var3.b).interact(llllllIlllll[lllllllIIlII[3]]);
        }
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains(item -> item.getName().contains(llllllIlllll[lllllllIIlII[18]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(llllllIlllll[lllllllIIlII[17]])).interact(llllllIlllll[lllllllIIlII[5]]);
        }
        if (SquireMiner.lIIlIlIlIIIllIl(var3.f.deposit() ? 1 : 0) && SquireMiner.lIIlIlIlIIIllII(Inventory.contains(item -> item.getName().contains(llllllIlllll[lllllllIIlII[16]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(llllllIlllll[lllllllIIlII[15]])).interact(llllllIlllll[lllllllIIlII[7]]);
        }
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])var3.a) ? 1 : 0)) {
            int[] nArray = new int[lllllllIIlII[3]];
            nArray[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[42];
            Inventory.getFirst((int[])var3.a).useOn(Inventory.getFirst((int[])nArray));
        }
        int[] nArray = new int[lllllllIIlII[3]];
        nArray[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[43];
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllllllIIlII[3]];
            nArray2[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[44];
            if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllllllIIlII[3]];
                nArray3[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[43];
                int[] nArray4 = new int[lllllllIIlII[3]];
                nArray4[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[44];
                Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));

            } else {
                int[] nArray5 = new int[lllllllIIlII[3]];
                nArray5[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[45];
                if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lllllllIIlII[3]];
                    nArray6[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[43];
                    int[] nArray7 = new int[lllllllIIlII[3]];
                    nArray7[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[45];
                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                }
            }
        }
    }

        return String.valueOf(var4);
    }
}

