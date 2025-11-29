package gg.squire.basics.combat.AgroReset;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.E;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.F;
import java.time.Instant;
import java.util.Comparator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.npcunaggroarea.NpcAggroAreaPlugin;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.scene.Tiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@PluginDependency(NpcAggroAreaPlugin.class)
@PluginDescriptor(name = "Squire Aggro Resetter", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/AgroReset/ResetPlugin.class */
public class ResetPlugin extends SquirePlugin {
    @Inject
    private /* synthetic */ Client v;
    @Inject
    private /* synthetic */ F br;
    private static final /* synthetic */ Logger bn;
    private /* synthetic */ long[] by;
    private static /* synthetic */ int[] lIllllllI;
    private /* synthetic */ WorldPoint bx;
    protected static final /* synthetic */ int bo;
    @Inject
    private /* synthetic */ NpcAggroAreaPlugin bp;
    private /* synthetic */ Instant bt;
    private /* synthetic */ WorldPoint bw;
    @Inject
    private /* synthetic */ ScheduledExecutorService bs;
    @Inject
    private /* synthetic */ OverlayManager bq;
    private /* synthetic */ long bu = -1;
    private /* synthetic */ boolean bv = lIllllllI[0];

    private static boolean lIlIIlIlIIl(int i2) {
        return i2 != 0;
    }

    private static void lIlIIlIIlIl() {
        lIllllllI = new int[5];
        lIllllllI[0] = " ".length();
        lIllllllI[1] = (4 ^ 43) & ((233 ^ 198) ^ (-1));
        lIllllllI[2] = "  ".length();
        lIllllllI[3] = (((112 + 49) - 160) + 152) ^ (((121 + 22) - 41) + 33);
        lIllllllI[4] = (((12 + 156) - 101) + 98) ^ (((51 + 88) - (-26)) + 4);
    }

    public boolean ah() {
        return this.bv;
    }

    private long[] ad() {
        double[] dArr = new double[lIllllllI[2]];
        ThreadLocalRandom current = ThreadLocalRandom.current();
        int i2 = lIllllllI[1];
        while (lIlIIlIllIl(i2, dArr.length)) {
            dArr[i2] = (Math.pow(current.nextGaussian(), 2.0d) * 15.0d) + 30.0d;
            while (true) {
                if (!lIlIIlIlllI(lIlIIlIlIll(dArr[i2], 0.0d)) || lIlIIlIllll(lIlIIlIllII(dArr[i2], 65.0d))) {
                    dArr[i2] = (Math.pow(current.nextGaussian(), 2.0d) * 15.0d) + ((lIllllllI[0] - i2) * lIllllllI[3]);
                    "".length();
                    if (" ".length() <= (-" ".length())) {
                        return null;
                    }
                } else {
                    i2++;
                    "".length();
                    if (" ".length() <= (((((204 + 110) - 102) + 38) ^ (((149 + 28) - 81) + 73)) & (((((134 + 239) - 174) + 52) ^ (((94 + 108) - 95) + 61)) ^ (-" ".length())))) {
                        return null;
                    }
                }
            }
        }
        long[] jArr = new long[lIllllllI[2]];
        jArr[lIllllllI[1]] = (long) (dArr[lIllllllI[1]] * 1000.0d);
        jArr[lIllllllI[0]] = (long) (dArr[lIllllllI[0]] * 100.0d);
        return jArr;
    }

    private WorldPoint ab() {
        WorldPoint[] safeCenters = this.bp.getSafeCenters();
        if (lIlIIlIIllI(safeCenters.length)) {
            return null;
        }
        Player localPlayer = this.v.getLocalPlayer();
        if (lIlIIlIIlll(localPlayer)) {
            return null;
        }
        return (WorldPoint) Tiles.getAll(tile -> {
            if (lIlIIlIIllI(Reachable.isObstacle(tile.getWorldLocation()) ? 1 : 0) && lIlIIlIlIIl(Stream.of((Object[]) safeCenters).noneMatch(worldPoint -> {
                if (lIlIIlIlIlI(worldPoint) && lIlIIllIIIl(worldPoint.distanceTo(tile.getWorldLocation()), lIllllllI[4])) {
                    ?? r0 = lIllllllI[0];
                    "".length();
                    return 0 != 0 ? ((((122 + 86) - 205) + 129) ^ (((34 + 102) - 31) + 23)) & (((16 ^ 22) ^ "  ".length()) ^ (-" ".length())) : r0;
                }
                return lIllllllI[1];
            }) ? 1 : 0)) {
                ?? r0 = lIllllllI[0];
                "".length();
                return " ".length() <= 0 ? ((44 ^ 22) ^ (136 ^ 141)) & (((((160 + 140) - 201) + 64) ^ (((64 + 143) - 113) + 62)) ^ (-" ".length())) : r0;
            }
            return lIllllllI[1];
        }).stream().map((v0) -> {
            return v0.getWorldLocation();
        }).min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceToPath(this.v, localPlayer.getWorldLocation());
        })).orElse(null);
    }

    public WorldPoint aj() {
        return this.bx;
    }

    private static int lIlIIllIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static int lIlIIlIlIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIlIIlIIllI(int i2) {
        return i2 == 0;
    }

    public void ac() {
        this.bu = -1L;
        this.bt = null;
    }

    private static int lIlIIlIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIlIIlll(Object obj) {
        return obj == null;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllllllI[0]];
        clsArr[lIllllllI[1]] = E.class;
        return clsArr;
    }

    protected void onStop() {
        this.bu = -1L;
        this.bt = null;
        this.bq.remove(this.br);
        "".length();
        getEventBus().unregister(this.br);
    }

    private static boolean lIlIIllIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIlIllIl(int i2, int i3) {
        return i2 < i3;
    }

    public long ag() {
        return this.bu;
    }

    public long[] ak() {
        return this.by;
    }

    protected void onStart() {
        this.bq.add(this.br);
        "".length();
        getEventBus().register(this.br);
        this.bs.submit(() -> {
            this.br.aa();
        });
        "".length();
        long[] jArr = new long[lIllllllI[2]];
        jArr[lIllllllI[1]] = 7500;
        jArr[lIllllllI[0]] = 3500;
        this.by = jArr;
        this.bt = this.bp.getEndTime();
        this.bw = Players.getLocal().getWorldLocation();
    }

    public WorldPoint ai() {
        return this.bw;
    }

    private static boolean lIlIIlIlIlI(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIlIIlIlIIl(lIlIIlIlIII(this.bu, -1L))) {
            return;
        }
        if (!lIlIIlIlIlI(this.bt)) {
            this.bt = this.bp.getEndTime();
        } else if (lIlIIlIlIIl(Instant.now().isAfter(this.bt) ? 1 : 0)) {
            this.bt = null;
            this.bu = System.currentTimeMillis();
            this.bx = ab();
            this.by = ad();
        }
    }

    private static boolean lIlIIlIllll(int i2) {
        return i2 > 0;
    }

    private static int lIlIIlIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIlIIlIIlIl();
        bo = lIllllllI[4];
        bn = LoggerFactory.getLogger(ResetPlugin.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean ae() {
        if (lIlIIlIlIIl(lIlIIllIIII(this.bu, -1L))) {
            ?? r0 = lIllllllI[0];
            "".length();
            return (((((49 + 103) - 91) + 83) ^ (((143 + 36) - 148) + 152)) & (((245 ^ 189) ^ (236 ^ 131)) ^ (-" ".length()))) > 0 ? ((82 ^ 110) ^ (115 ^ 8)) & (((178 ^ 144) ^ (162 ^ 199)) ^ (-" ".length())) : r0;
        }
        return lIllllllI[1];
    }

    private static boolean lIlIIlIlllI(int i2) {
        return i2 >= 0;
    }

    public Instant af() {
        return this.bt;
    }
}
