/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDependency
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.npcunaggroarea.NpcAggroAreaPlugin
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.scene.Tiles
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.basics.combat.AgroReset;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.combat.AgroReset.ResettingAggroTask;
import gg.squire.basics.combat.AgroReset.ConstructionEventHandler;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.npcunaggroarea.NpcAggroAreaPlugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.scene.Tiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Aggro Resetter", enabledByDefault=false)
@SquireUtil
@PluginDependency(value=NpcAggroAreaPlugin.class)
public class ResetPlugin
extends SquirePlugin {
    private  boolean bv;
    @Inject
    private  Client v;
    @Inject
    private  F br;
    private static final  Logger bn;
    private  long[] by;
    private static  int[] lIllllllI;
    private  long bu;
    private  WorldPoint bx;
    protected static final  int bo;
    @Inject
    private  NpcAggroAreaPlugin bp;
    private  Instant bt;
    private  WorldPoint bw;
    @Inject
    private  ScheduledExecutorService bs;
    @Inject
    private  OverlayManager bq;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    private static void var2() {
        lIllllllI = new int[5];
        ResetPlugin.lIllllllI[0] = 1;
        ResetPlugin.lIllllllI[1] = (4 ^ 0x2B) & ~(0xE9 ^ 0xC6);
        ResetPlugin.lIllllllI[2] = 2;
        ResetPlugin.lIllllllI[3] = 112 + 49 - 160 + 152 ^ 121 + 22 - 41 + 33;
        ResetPlugin.lIllllllI[4] = 12 + 156 - 101 + 98 ^ 51 + 88 - -26 + 4;
    }

    public boolean ah() {
        return this.bv;
    }

    /*
     * WARNING - void declaration
     */
    private long[] ad() {
        void var3;
        double[] dArray = new double[lIllllllI[2]];
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int var4 = lIllllllI[1];
        while (ResetPlugin.var5(var4, ((void)var3).length)) {
            void var6;
            var3[var4] = Math.pow(var6.nextGaussian(), 2.0) * 15.0 + 30.0;
            while (!ResetPlugin.var7(ResetPlugin.var8((double)var3[var4], 0.0)) || ResetPlugin.var9(ResetPlugin.var10((double)var3[var4], 65.0))) {
                var3[var4] = Math.pow(var6.nextGaussian(), 2.0) * 15.0 + (double)((lIllllllI[0] - var4) * lIllllllI[3]);
                0;
                if (1 > -1) continue;
                return null;
            }
            ++var4;
            0;
            if (1 > ((204 + 110 - 102 + 38 ^ 149 + 28 - 81 + 73) & (134 + 239 - 174 + 52 ^ 94 + 108 - 95 + 61 ^ -1))) continue;
            return null;
        }
        long[] lArray = new long[lIllllllI[2]];
        lArray[ResetPlugin.lIllllllI[1]] = (long)(dArray[lIllllllI[1]] * 1000.0);
        lArray[ResetPlugin.lIllllllI[0]] = (long)(dArray[lIllllllI[0]] * 100.0);
        return lArray;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint ab() {
        void var2_2;
        ResetPlugin var11;
        WorldPoint[] worldPointArray = this.bp.getSafeCenters();
        if (ResetPlugin.var12(worldPointArray.length)) {
            return null;
        }
        Player var13 = var11.v.getLocalPlayer();
        if (ResetPlugin.var14(var13)) {
            return null;
        }
        List list = Tiles.getAll(tile -> {
            int n2;
            if (ResetPlugin.var12(Reachable.isObstacle((WorldPoint)tile.getWorldLocation()) ? 1 : 0) && ResetPlugin.var1(Stream.of(worldPointArray).noneMatch(worldPoint -> {
                int n2;
                if (ResetPlugin.var15(worldPoint) && ResetPlugin.var16(worldPoint.distanceTo(tile.getWorldLocation()), lIllllllI[4])) {
                    n2 = lIllllllI[0];
                    0;
                    if null != null {
                        return ((122 + 86 - 205 + 129 ^ 34 + 102 - 31 + 23) & (0x10 ^ 0x16 ^ 2 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllllllI[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = lIllllllI[0];
                0;
                if (1 <= 0) {
                    return ((0x2C ^ 0x16 ^ (0x88 ^ 0x8D)) & (160 + 140 - 201 + 64 ^ 64 + 143 - 113 + 62 ^ -1)) != 0;
                }
            } else {
                n2 = lIllllllI[1];
            }
            return n2 != 0;
        });
        return list.stream().map(Locatable::getWorldLocation).min(Comparator.comparingInt(arg_0 -> this.a((Player)var2_2, arg_0))).orElse(null);
    }

    public WorldPoint aj() {
        return this.bx;
    }

    private static int var17(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static int var18(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    public void ac() {
        this.bu = -1L;
        this.bt = null;
    }

    private static int var10(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllllllI[0]];
        classArray[ResetPlugin.lIllllllI[1]] = ResettingAggroTask.class;
        return classArray;
    }

    protected void onStop() {
        this.bu = -1L;
        this.bt = null;
        this.bq.remove((Overlay)this.br);
        0;
        this.getEventBus().unregister((Object)this.br);
    }

    private static boolean var16(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    public long ag() {
        return this.bu;
    }

    public long[] ak() {
        return this.by;
    }

    public ResetPlugin() {
        this.bu = -1L;
        this.bv = lIllllllI[0];
    }

    protected void onStart() {
        this.bq.add((Overlay)this.br);
        0;
        this.getEventBus().register((Object)this.br);
        this.bs.submit(() -> this.br.aa());
        0;
        long[] lArray = new long[lIllllllI[2]];
        lArray[ResetPlugin.lIllllllI[1]] = 7500L;
        lArray[ResetPlugin.lIllllllI[0]] = 3500L;
        this.by = lArray;
        this.bt = this.bp.getEndTime();
        this.bw = Players.getLocal().getWorldLocation();
    }

    public WorldPoint ai() {
        return this.bw;
    }

    private  int a(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceToPath(this.v, player.getWorldLocation());
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        ResetPlugin var19;
        if (ResetPlugin.var1(ResetPlugin.var18(this.bu, -1L))) {
            return;
        }
        if (ResetPlugin.var15(var19.bt)) {
            if (ResetPlugin.var1(Instant.now().isAfter(var19.bt) ? 1 : 0)) {
                var19.bt = null;
                var19.bu = System.currentTimeMillis();
                var19.bx = var19.ab();
                var19.by = var19.ad();
            }
            return;
        }
        this.bt = this.bp.getEndTime();
    }

    private static boolean var9(int n2) {
        return n2 > 0;
    }

    private static int var8(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        ResetPlugin.var2();
        bo = lIllllllI[4];
        bn = LoggerFactory.getLogger(ResetPlugin.class);
    }

    public boolean ae() {
        boolean bl2;
        if (ResetPlugin.var1(ResetPlugin.var17(this.bu, -1L))) {
            bl2 = lIllllllI[0];
            0;
            if (((49 + 103 - 91 + 83 ^ 143 + 36 - 148 + 152) & (0xF5 ^ 0xBD ^ (0xEC ^ 0x83) ^ -1)) > 0) {
                return ((0x52 ^ 0x6E ^ (0x73 ^ 8)) & (0xB2 ^ 0x90 ^ (0xA2 ^ 0xC7) ^ -1)) != 0;
            }
        } else {
            bl2 = lIllllllI[1];
        }
        return bl2;
    }

    private static boolean var7(int n2) {
        return n2 >= 0;
    }

    public Instant af() {
        return this.bt;
    }
}

