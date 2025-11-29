/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.items.Inventory
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.woodcutting;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.overlay.WCGInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Inventory;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.woodcutting.GameEnum6;
import gg.squire.woodcutting.BankingTask;
import gg.squire.woodcutting.ChoppingTask;
import gg.squire.woodcutting.DroppingLogsTask;
import gg.squire.woodcutting.FletchingLogsTask;
import gg.squire.woodcutting.PickingUpNestTask;
import gg.squire.woodcutting.UsingSpecialAttackTask;
import gg.squire.woodcutting.CheckingStateTask;
import gg.squire.woodcutting.MovingToNextTreeTask;
import gg.squire.woodcutting.ChoppingFastTask;
import gg.squire.woodcutting.TrackingTheTreeTask;
import gg.squire.woodcutting.WalkingToNextTileTask;

@PluginDescriptor(name="Squire Woodcutter", enabledByDefault=false)
@Extension
public class SquireWoodcutterPlugin
extends SquirePlugin {
    private  WorldArea l;
    private final  int[] o;
    private  boolean m;
    private final  int[] e;
    @Inject
    private  OverlayManager i;
    public static  int b;
    
    private  Instant k;
    @Inject
    private  SquireWoodcutterConfig h;
    @Inject
    private  WCGInfoBox j;
    private final  List<Integer> f;
    private final  int g = 4;
    
    private  int n;
    private static final  Logger a;
    public static  int c;
    private final  WorldArea d;

    public void a(boolean bl) {
        this.m = bl;
    }

    private static boolean llIIIIlllllIlIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIllllllIll(Object object, Object object2) {
        return object == object2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIIIIIllI[26]];
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = UsingSpecialAttackTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = CheckingStateTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = MovingToNextTreeTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = WalkingToNextTileTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[5]] = ChoppingFastTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[23]] = TrackingTheTreeTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[24]] = ChoppingTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[25]] = BankingTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[17]] = PickingUpNestTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[27]] = FletchingLogsTask.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[28]] = DroppingLogsTask.class;
        return classArray;
    }

    private static void llIIIIllllIllIl() {
        lIllIIIIIIlIl = new String[lIllIIIIIIllI[25]];
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = "Squire Woodcutting has been started.";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = "[SQUIRE] - Woodcutting has been stopped.";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = "nest";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = "get some";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[5]] = "nest";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[23]] = "stock";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[24]] = "nest";
    }

    public List<Integer> l() {
        return this.f;
    }

    static {
        SquireWoodcutterPlugin.llIIIIlllllIlII();
        SquireWoodcutterPlugin.llIIIIllllIllIl();
        a = LoggerFactory.getLogger(SquireWoodcutterPlugin.class);
    }

    public void a(int n) {
        this.n = n;
    }

    /*
     * WARNING - void declaration
     */
    public int[] i() {
        SquireWoodcutterPlugin var1;
        int[] nArray = this.o;
        if (SquireWoodcutterPlugin.llIIIIllllllIll((Object)this.h.tree(), (Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.TEAK)) {
            return Arrays.stream(nArray).filter(n -> {
                boolean bl;
                if (SquireWoodcutterPlugin.llIIIIllllllIII(n, lIllIIIIIIllI[19])) {
                    bl = lIllIIIIIIllI[7];

                    }
                } else {
                    bl = lIllIIIIIIllI[4];
                }
                return bl;
            }).toArray();
        }
        if (SquireWoodcutterPlugin.llIIIIllllllIll((Object)var1.h.tree(), (Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.MAHOGANY)) {
            void var2;
            return Arrays.stream((int[])var2).filter(n -> {
                boolean bl;
                if (SquireWoodcutterPlugin.llIIIIllllllIII(n, lIllIIIIIIllI[20])) {
                    bl = lIllIIIIIIllI[7];

                    if (2 == 0) {
                        return false;
                    }
                } else {
                    bl = lIllIIIIIIllI[4];
                }
                return bl;
            }).toArray();
        }
        return nArray;
    }

    public int m() {
        Objects.requireNonNull(this);

        return lIllIIIIIIllI[5];
    }

    protected void onStop() {
        this.i.remove((Overlay)this.j);

        b = lIllIIIIIIllI[4];
        c = lIllIIIIIIllI[4];
        a.info(lIllIIIIIIlIl[lIllIIIIIIllI[7]]);
    }

    private static boolean llIIIIllllllIIl(int n, int n2) {
        return n == n2;
    }

    public boolean p() {
        return this.m;
    }

    public void a(WorldArea worldArea) {
        this.l = worldArea;
    }

    private static boolean llIIIIllllllIII(int n, int n2) {
        return n != n2;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.n += lIllIIIIIIllI[7];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f() {
        int n;
        block2: {
            block3: {
                int[] nArray = new int[lIllIIIIIIllI[7]];
                nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[21];
                if (!SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIIIIllI[7]];
                nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[22];
                if (!SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIIIIllI[7]];
                nArray3[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[6];
                if (!SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIllIIIIIIllI[7]];
                nArray4[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[8];
                if (!SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block3;
                int[] nArray5 = new int[lIllIIIIIIllI[7]];
                nArray5[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[12];
                if (!SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block2;
            }
            n = lIllIIIIIIllI[7];

            if (null == null) return n != 0;
            return ((0xAD ^ 0x97 ^ (0x2E ^ 0x3A)) & (9 ^ 0 ^ (0x9D ^ 0xBA) ^ -1)) != 0;
        }
        n = lIllIIIIIIllI[4];
        return n != 0;
    }

        return String.valueOf(var3);
    }

    public boolean c() {
        boolean bl;
        if (!SquireWoodcutterPlugin.llIIIIllllllIlI(this.h.fastTickChop() ? 1 : 0) || SquireWoodcutterPlugin.llIIIIlllllIlll(this.h.tickChop() ? 1 : 0)) {
            bl = lIllIIIIIIllI[7];

            if (((0xA0 ^ 0xB6) & ~(0x64 ^ 0x72)) != 0) {
                return false;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    private static boolean llIIIIlllllIlll(int n) {
        return n != 0;
    }

    public int q() {
        return this.n;
    }

    public WorldArea o() {
        return this.l;
    }

    private static boolean llIIIIlllllIllI(Object object, Object object2) {
        return object != object2;
    }

    public boolean g() {
        int n;
        int[] nArray = new int[lIllIIIIIIllI[7]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = this.h.tree().s();
        if (SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[23]])) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[5]])) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIlllllIlll(this.c() ? 1 : 0) && SquireWoodcutterPlugin.llIIIIlllllIlll(this.d() ? 1 : 0)) {
            n = lIllIIIIIIllI[7];

            }
        } else {
            n = lIllIIIIIIllI[4];
        }
        return n != 0;
    }

    public WorldArea j() {
        return this.d;
    }

    public void h() {
        int n;
        SquireWoodcutterPlugin var4;
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])this.e) ? 1 : 0)) {
            int[] nArray = new int[lIllIIIIIIllI[7]];
            nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[22];
            Inventory.getFirst((int[])this.e).useOn(Inventory.getFirst((int[])nArray));
        }
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(var4.h.tree().equals((Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.MAHOGANY) ? 1 : 0)) {
            n = lIllIIIIIIllI[19];

            if (-(28 + 99 - 66 + 135 ^ 110 + 55 - 157 + 184) > 0) {
                return;
            }
        } else {
            n = lIllIIIIIIllI[20];
        }
        int var5 = n;
        int[] nArray = new int[lIllIIIIIIllI[7]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIIIIIllI[7]];
            nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
            int[] nArray3 = new int[lIllIIIIIIllI[7]];
            nArray3[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = var5;
            Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
        }
    }

    public Instant getStarted() {
        return this.k;
    }

    public SquireWoodcutterPlugin() {
        this.d = new WorldArea(lIllIIIIIIllI[0], lIllIIIIIIllI[1], lIllIIIIIIllI[2], lIllIIIIIIllI[3], lIllIIIIIIllI[4]);
        int[] nArray = new int[lIllIIIIIIllI[5]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[6];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = lIllIIIIIIllI[8];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = lIllIIIIIIllI[10];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = lIllIIIIIIllI[12];
        this.e = nArray;
        this.f = List.of(Integer.valueOf(lIllIIIIIIllI[13]), Integer.valueOf(lIllIIIIIIllI[14]), Integer.valueOf(lIllIIIIIIllI[15]), Integer.valueOf(lIllIIIIIIllI[16]));
        this.g = lIllIIIIIIllI[5];
        this.m = lIllIIIIIIllI[4];
        this.n = lIllIIIIIIllI[4];
        int[] nArray2 = new int[lIllIIIIIIllI[17]];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = lIllIIIIIIllI[19];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = lIllIIIIIIllI[20];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = lIllIIIIIIllI[21];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[5]] = lIllIIIIIIllI[22];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[23]] = lIllIIIIIIllI[6];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[24]] = lIllIIIIIIllI[8];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[25]] = lIllIIIIIIllI[12];
        this.o = nArray2;
    }

    public boolean b() {
        boolean bl;
        if (!SquireWoodcutterPlugin.llIIIIllllllIII(Players.getLocal().getAnimation(), lIllIIIIIIllI[29]) || SquireWoodcutterPlugin.llIIIIllllllIIl(Players.getLocal().getAnimation(), lIllIIIIIIllI[30])) {
            bl = lIllIIIIIIllI[7];

            if (((0x2D ^ 0x1E) & ~(0xB4 ^ 0x87)) != 0) {
                return false;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    @Provides
    SquireWoodcutterConfig a(ConfigManager configManager) {
        return (SquireWoodcutterConfig)configManager.getConfig(SquireWoodcutterConfig.class);
    }

    public boolean d() {
        boolean bl;
        if (!SquireWoodcutterPlugin.llIIIIllllllIlI(this.e() ? 1 : 0) || SquireWoodcutterPlugin.llIIIIlllllIlll(this.f() ? 1 : 0)) {
            bl = lIllIIIIIIllI[7];

            if (3 <= -1) {
                return false;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    public int[] k() {
        return this.e;
    }

    private boolean e() {
        boolean bl;
        a a2 = this.h.tree();
        int[] nArray = new int[lIllIIIIIIllI[7]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIllllllIll((Object)a2, (Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.TEAK)) {
            int[] nArray2 = new int[lIllIIIIIIllI[7]];
            nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[20];
            bl = Inventory.contains((int[])nArray2);

            if (2 < -1) {
                return ((0 + 44 - -55 + 71 ^ 152 + 158 - 189 + 62) & (0x20 ^ 0x37 ^ (0x6C ^ 0x66) ^ -1)) != 0;
            }
        } else {
            int[] nArray3 = new int[lIllIIIIIIllI[7]];
            nArray3[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[19];
            bl = Inventory.contains((int[])nArray3);
        }
        return bl;
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (SquireWoodcutterPlugin.llIIIIllllllIll(experienceGained.getSkill(), Skill.WOODCUTTING)) {
            this.n = lIllIIIIIIllI[4];
        }
    }

    protected void onStart() {
        this.i.add((Overlay)this.j);

        this.k = Instant.now();
        a.info(lIllIIIIIIlIl[lIllIIIIIIllI[4]]);
        if (SquireWoodcutterPlugin.llIIIIlllllIlIl(Players.getLocal())) {
            this.a(Players.getLocal().getWorldArea());
        }
    }

    public boolean a() {
        boolean bl;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[24]]));
        if (SquireWoodcutterPlugin.llIIIIlllllIlIl(tileItem2)) {
            bl = lIllIIIIIIllI[7];

        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var6;
        if (SquireWoodcutterPlugin.llIIIIlllllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireWoodcutterPlugin.llIIIIlllllIllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(var6.getMessage().contains(lIllIIIIIIlIl[lIllIIIIIIllI[9]]) ? 1 : 0)) {
            c += lIllIIIIIIllI[7];
        }
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(var6.getMessage().contains(lIllIIIIIIlIl[lIllIIIIIIllI[11]]) ? 1 : 0)) {
            b += lIllIIIIIIllI[7];
        }
    }

    private static boolean llIIIIllllllIlI(int n) {
        return n == 0;
    }

    public SquireWoodcutterConfig n() {
        return this.h;
    }

    private static boolean llIIIIlllllllII(int n, int n2) {
        return n < n2;
    }
}

