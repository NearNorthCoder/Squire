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
import java.time.Instant;
import java.util.List;
import java.util.Objects;
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
import gg.squire.woodcutting.GameEnum2;
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

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[26]];
        classArray[4] = UsingSpecialAttackTask.class;
        classArray[7] = CheckingStateTask.class;
        classArray[9] = MovingToNextTreeTask.class;
        classArray[SquireWoodcutterPlugin.var1[11]] = WalkingToNextTileTask.class;
        classArray[5] = ChoppingFastTask.class;
        classArray[SquireWoodcutterPlugin.var1[23]] = TrackingTheTreeTask.class;
        classArray[SquireWoodcutterPlugin.var1[24]] = ChoppingTask.class;
        classArray[SquireWoodcutterPlugin.var1[25]] = BankingTask.class;
        classArray[SquireWoodcutterPlugin.var1[17]] = PickingUpNestTask.class;
        classArray[SquireWoodcutterPlugin.var1[27]] = FletchingLogsTask.class;
        classArray[SquireWoodcutterPlugin.var1[28]] = DroppingLogsTask.class;
        return classArray;
    }

    public List<Integer> l() {
        return this.f;
    }

    static {
        SquireWoodcutterPlugin.var3();
        SquireWoodcutterPlugin.var4();
        a = LoggerFactory.getLogger(SquireWoodcutterPlugin.class);
    }

    public void a(int n) {
        this.n = n;
    }

    /*
     * WARNING - void declaration
     */
    public int[] i() {
        SquireWoodcutterPlugin var5;
        int[] nArray = this.o;
        if (((Object)this.h.tree() == (Object)this.h.tree()2)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.TEAK)) {
            return Arrays.stream(nArray).filter(n -> {
                boolean bl;
                if (n != var1[19]) {
                    bl = 7;
                    0;
                    if null != null {
                        return ((0x56 ^ 0x68) & ~(0x9B ^ 0xA5)) != 0;
                    }
                } else {
                    bl = 4;
                }
                return bl;
            }).toArray();
        }
        if (((Object)var5.h.tree() == (Object)var5.h.tree()2)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.MAHOGANY)) {
            void var6;
            return Arrays.stream((int[])var6).filter(n -> {
                boolean bl;
                if (n != var1[20]) {
                    bl = 7;
                    0;
                    
                } else {
                    bl = 4;
                }
                return bl;
            }).toArray();
        }
        return nArray;
    }

    public int m() {
        Objects.requireNonNull(this);
        0;
        return 5;
    }

    protected void onStop() {
        this.i.remove((Overlay)this.j);
        0;
        b = 4;
        c = 4;
        a.info(var2[7]);
    }

    public boolean p() {
        return this.m;
    }

    public void a(WorldArea worldArea) {
        this.l = worldArea;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.n += 7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f() {
        int n;
        block2: {
            block3: {
                int[] nArray = new int[7];
                nArray[4] = var1[21];
                if (!(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[7];
                nArray2[4] = var1[22];
                if (!(Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[7];
                nArray3[4] = 6;
                if (!(Inventory.contains((int[] == 0)nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[7];
                nArray4[4] = 8;
                if (!(Inventory.contains((int[] == 0)nArray4) ? 1 : 0)) break block3;
                int[] nArray5 = new int[7];
                nArray5[4] = var1[12];
                if (!(Inventory.contains((int[] != 0)nArray5) ? 1 : 0)) break block2;
            }
            n = 7;
            0;
            if null == null return n != 0;
            return ((0xAD ^ 0x97 ^ (0x2E ^ 0x3A)) & (9 ^ 0 ^ (0x9D ^ 0xBA) ^ -1)) != 0;
        }
        n = 4;
        return n != 0;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 4;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 4;
        while (var15 < llllllllllllllIllIIllIlIllIIIllI2) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public boolean c() {
        boolean bl;
        if (!(this.h.fastTickChop( == 0) ? 1 : 0) || (this.h.tickChop( != 0) ? 1 : 0)) {
            bl = 7;
            0;
            if (((0xA0 ^ 0xB6) & ~(0x64 ^ 0x72)) != 0) {
                return ((0xF ^ 0x4A) & ~(0xE4 ^ 0xA1)) != 0;
            }
        } else {
            bl = 4;
        }
        return bl;
    }

    public int q() {
        return this.n;
    }

    public WorldArea o() {
        return this.l;
    }

    public boolean g() {
        int n;
        int[] nArray = new int[7];
        nArray[4] = this.h.tree().s();
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0) && (Inventory.contains(item -> item.getName( == 0).toLowerCase().contains(var2[var1[23]])) ? 1 : 0) && (Inventory.contains(item -> item.getName( == 0).toLowerCase().contains(var2[5])) ? 1 : 0) && (this.c( != 0) ? 1 : 0) && (this.d( != 0) ? 1 : 0)) {
            n = 7;
            0;
            if null != null {
                return ((0x96 ^ 0x82 ^ (0xC3 ^ 0xB7)) & (0x18 ^ 0x38 ^ (0x6B ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            n = 4;
        }
        return n != 0;
    }

    public WorldArea j() {
        return this.d;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    public void h() {
        int n;
        SquireWoodcutterPlugin var29;
        if ((Inventory.contains((int[] != 0)this.e) ? 1 : 0)) {
            int[] nArray = new int[7];
            nArray[4] = var1[22];
            Inventory.getFirst((int[])this.e).useOn(Inventory.getFirst((int[])nArray));
        }
        if ((var29.h.tree( != 0).equals((Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.MAHOGANY) ? 1 : 0)) {
            n = var1[19];
            0;
            if (-(28 + 99 - 66 + 135 ^ 110 + 55 - 157 + 184) > 0) {
                return;
            }
        } else {
            n = var1[20];
        }
        int var30 = n;
        int[] nArray = new int[7];
        nArray[4] = var1[18];
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            int[] nArray2 = new int[7];
            nArray2[4] = var1[18];
            int[] nArray3 = new int[7];
            nArray3[4] = var30;
            Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
        }
    }

    public Instant getStarted() {
        return this.k;
    }

    public SquireWoodcutterPlugin() {
        this.d = new WorldArea(0, 1, 2, 3, 4);
        int[] nArray = new int[5];
        nArray[4] = 6;
        nArray[7] = 8;
        nArray[9] = var1[10];
        nArray[SquireWoodcutterPlugin.var1[11]] = var1[12];
        this.e = nArray;
        this.f = List.of(Integer.valueOf(var1[13]), Integer.valueOf(var1[14]), Integer.valueOf(var1[15]), Integer.valueOf(var1[16]));
        this.g = 5;
        this.m = 4;
        this.n = 4;
        int[] nArray2 = new int[var1[17]];
        nArray2[4] = var1[18];
        nArray2[7] = var1[19];
        nArray2[9] = var1[20];
        nArray2[SquireWoodcutterPlugin.var1[11]] = var1[21];
        nArray2[5] = var1[22];
        nArray2[SquireWoodcutterPlugin.var1[23]] = 6;
        nArray2[SquireWoodcutterPlugin.var1[24]] = 8;
        nArray2[SquireWoodcutterPlugin.var1[25]] = var1[12];
        this.o = nArray2;
    }

    public boolean b() {
        boolean bl;
        if (!(Players.getLocal().getAnimation() != Players.getLocal().getAnimation()2) || (Players.getLocal().getAnimation() == Players.getLocal().getAnimation()2)) {
            bl = 7;
            0;
            if (((0x2D ^ 0x1E) & ~(0xB4 ^ 0x87)) != 0) {
                return ((0x10 ^ 0x49) & ~(0x42 ^ 0x1B)) != 0;
            }
        } else {
            bl = 4;
        }
        return bl;
    }

    @Provides
    SquireWoodcutterConfig a(ConfigManager configManager) {
        return (SquireWoodcutterConfig)configManager.getConfig(SquireWoodcutterConfig.class);
    }

    public boolean d() {
        boolean bl;
        if (!(this.e( == 0) ? 1 : 0) || (this.f( != 0) ? 1 : 0)) {
            bl = 7;
            0;
            if (3 <= -1) {
                return ((4 ^ 0x3A) & ~(0x2F ^ 0x11)) != 0;
            }
        } else {
            bl = 4;
        }
        return bl;
    }

    public int[] k() {
        return this.e;
    }

    private boolean e() {
        boolean bl;
        a a2 = this.h.tree();
        int[] nArray = new int[7];
        nArray[4] = var1[18];
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0) && ((Object)a2 == (Object)a22)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a.TEAK)) {
            int[] nArray2 = new int[7];
            nArray2[4] = var1[20];
            bl = Inventory.contains((int[])nArray2);
            0;
            if (2 < -1) {
                return ((0 + 44 - -55 + 71 ^ 152 + 158 - 189 + 62) & (0x20 ^ 0x37 ^ (0x6C ^ 0x66) ^ -1)) != 0;
            }
        } else {
            int[] nArray3 = new int[7];
            nArray3[4] = var1[19];
            bl = Inventory.contains((int[])nArray3);
        }
        return bl;
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if ((experienceGained.getSkill() == experienceGained.getSkill()2)) {
            this.n = 4;
        }
    }

    protected void onStart() {
        this.i.add((Overlay)this.j);
        0;
        this.k = Instant.now();
        a.info(var2[4]);
        if ((Players.getLocal( != null))) {
            this.a(Players.getLocal().getWorldArea());
        }
    }

    public boolean a() {
        boolean bl;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(var2[var1[24]]));
        if tileItem2 != null {
            bl = 7;
            0;
            if (-3 > 0) {
                return ((163 + 15 - -22 + 27 ^ 128 + 53 - 12 + 22) & (0xFF ^ 0x8D ^ (0xB9 ^ 0x97) ^ -1)) != 0;
            }
        } else {
            bl = 4;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var31;
        if ((chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var31.getMessage( != 0).contains(var2[9]) ? 1 : 0)) {
            c += 7;
        }
        if ((var31.getMessage( != 0).contains(var2[var1[11]]) ? 1 : 0)) {
            b += 7;
        }
    }

    public SquireWoodcutterConfig n() {
        return this.h;
    }

}

