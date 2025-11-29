/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Hitsplat
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.WorldType
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.FakeXpDrop
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Totem", priority=2, register=true)
public class AttackingTotemTask
extends al {

    private static final  Logger dZ;

    static {
        aj.var3();
        aj.var4();
        dZ = LoggerFactory.getLogger(AttackingTotemTask.class);
    }

    private static void var3() {
        var2 = new int[10];
        aj.var2[0] = (0x3A ^ 0x18) & ~(0x71 ^ 0x53);
        aj.var2[1] = -(0xFFFFDEEE & 0x3BD5) & (0xFFFF9BEF & Short.MAX_VALUE);
        aj.var2[2] = 149 + 183 - 133 + 1;
        aj.var2[3] = 1;
        aj.var2[4] = 2 ^ 0x7E ^ (0x11 ^ 0x64);
        aj.var2[5] = 2;
        aj.var2[6] = 0x30 ^ 0x29;
        aj.var2[7] = 3;
        aj.var2[8] = 0x43 ^ 0x2A ^ (0xA ^ 0x67);
        aj.var2[9] = 0xBD ^ 0xA2 ^ (0x1E ^ 9);
    }

    private static boolean var5(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public AttackingTotemTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean var6(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        int var9;
        void var10;
        void var11;
        void var12;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        Map<Integer, Integer> map = this.cM.aa();
        if (aj.var7(hitsplatApplied.getActor())) {
            return;
        }
        Actor var13 = var12.getActor();
        if (aj.var14(SquireNightmarePlugin.q.contains(var13.getId()) ? 1 : 0)) {
            return;
        }
        if (aj.var14(var11.isMine() ? 1 : 0) && aj.var15(SquireNightmarePlugin.q.contains(var12.getActor().getId()) ? 1 : 0) && aj.var8(var12.getHitsplat().getHitsplatType(), var2[6]) && aj.var15(var10.containsKey(var9 = var12.getActor().getId()) ? 1 : 0)) {
            Integer var16 = (Integer)var10.get(var9);
            if (aj.var17(var16 = Integer.valueOf(var16 - var11.getAmount()))) {
                var16 = var2[0];
            }
            var10.put(var9, var16);
            0;
        }
    }

    private static void var4() {
        var1 = new String[var2[8]];
        aj.var1[aj.var2[0]] = "[AttackTotem]: We're not inside flower area, skipping totem attack to move inside.";
        aj.var1[aj.var2[3]] = "[AttackTotem]: We are not safe from shadow, skipping totem attack to avoid.";
        aj.var1[aj.var2[5]] = "totem";
        aj.var1[aj.var2[7]] = "Charge";
    }

    private static boolean var18(Object object) {
        return object != null;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var5_5;
        int var19;
        int n2;
        int var20;
        int n3;
        int var21;
        int n4;
        int n5;
        aj var22;
        if (aj.var15(this.cK.assistantMode() ? 1 : 0)) {
            return var2[0];
        }
        Player var23 = Players.getLocal();
        int[] var24 = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC var25 = NPCs.getAll((int[])var24).stream().filter(nPC -> {
            boolean bl;
            if (aj.var14(nPC.isDead() ? 1 : 0)) {
                bl = var2[3];
                0;
                if (((0x16 ^ 0x13 ^ (0xBF ^ 0x84)) & (0x50 ^ 0xB ^ (0x7E ^ 0x1B) ^ -1)) != 0) {
                    return ((0xDA ^ 0x99 ^ (0xBB ^ 0xBC)) & (0x7C ^ 0x75 ^ (0x19 ^ 0x54) ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (aj.var7(var25)) {
            var22.cM.a(new ak(var22));
            return var2[0];
        }
        if (aj.var18(var22.cM.ai()) && aj.var15(var22.cM.ai().getTypes().contains(WorldType.SEASONAL) ? 1 : 0)) {
            n5 = var2[1];
            0;
            if ((0x51 ^ 0x5A ^ (0xCF ^ 0xC0)) < ((0x42 ^ 0x6F ^ (0x13 ^ 0x61)) & (21 + 77 - -52 + 76 ^ 45 + 98 - -21 + 25 ^ -1))) {
                return ((0x6D ^ 0x68 ^ (0x42 ^ 0x7A) & ~(0x30 ^ 8)) & (0x6E ^ 0x1F ^ (0xCE ^ 0xBA) ^ -1)) != 0;
            }
        } else {
            n5 = var2[2];
        }
        int var26 = n5;
        NPC var27 = NPCs.getAll((int[])var24).stream().filter(nPC -> {
            boolean bl;
            if (aj.var28(this.cM.ag.get(nPC.getId()), var26)) {
                bl = var2[3];
                0;
                if (1 != 1) {
                    return ((0xC ^ 0x5D) & ~(0x68 ^ 0x39)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).filter(nPC -> {
            int n2;
            if (aj.var15(this.t((NPC)nPC) ? 1 : 0) && aj.var15(this.r((NPC)nPC) ? 1 : 0) && aj.var15(this.s((NPC)nPC) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if ((0x61 ^ 0x65) == 0) {
                    return ((0x25 ^ 0x3D) & ~(6 ^ 0x1E)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).filter(nPC -> {
            int n2;
            if (aj.var14(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[var2[3]];
                stringArray[aj.var2[0]] = var1[var2[7]];
                if (aj.var15(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[3];
                    0;
                    if (3 > 0) return n2 != 0;
                    return ((0x42 ^ 0xA ^ (0x70 ^ 0x2C)) & (121 + 0 - 81 + 98 ^ 95 + 74 - 14 + 3 ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo(var23.getWorldLocation()))).orElse(null);
        if (aj.var18(var22.cJ.aX())) {
            n4 = var2[3];
            0;
            if ((0x55 ^ 1 ^ (0x75 ^ 0x25)) <= 0) {
                return ((0x1D ^ 0x51 ^ (0xB9 ^ 0xA1)) & (6 + 136 - 64 + 148 ^ 168 + 47 - 117 + 84 ^ -1)) != 0;
            }
        } else {
            n4 = var2[0];
        }
        if (aj.var15(var21 = n4)) {
            return var2[0];
        }
        if (aj.var18(var22.cJ.aY())) {
            n3 = var2[3];
            0;
            if null != null {
                return ((0x58 ^ 0x3B) & ~(0xC0 ^ 0xA3)) != 0;
            }
        } else {
            n3 = var2[0];
        }
        if (!aj.var14(var20 = n3) || aj.var15(var22.cM.T() ? 1 : 0)) {
            return var2[0];
        }
        if (aj.var18(var22.cJ.aZ())) {
            n2 = var2[3];
            0;
            if (((0x6C ^ 0xB ^ (0x5A ^ 0x34)) & (0x77 ^ 7 ^ (0xE5 ^ 0x9C) ^ -1)) < 0) {
                return ((0x21 ^ 0x58 ^ 25 + 112 - 52 + 42) & (0x77 ^ 0x3D ^ (0xC5 ^ 0x89) ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        if (aj.var15(var19 = n2)) {
            return var2[0];
        }
        RectangularArea var29 = e.ay();
        if (aj.var18(var29) && aj.var14(var29.contains(var23.getWorldLocation()) ? 1 : 0)) {
            dZ.debug(var1[var2[0]]);
            return var2[0];
        }
        if (aj.var14(var22.cu() ? 1 : 0)) {
            dZ.debug(var1[var2[3]]);
            return var2[0];
        }
        if (aj.var18(var22.cM.AttackingTotemTask()) && aj.var15(var22.cM.AttackingTotemTask().contains(var23.getWorldLocation()) ? 1 : 0)) {
            return var2[0];
        }
        if (!aj.var18(var27) || aj.var14(SquireNightmarePlugin.q.contains(var27.getId()) ? 1 : 0)) {
            return var2[0];
        }
        return this.x((NPC)var5_5);
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    private static String var36(String var37, String var38) {
        var37 = new String(Base64.getDecoder().decode(var37.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var39 = new StringBuilder();
        char[] var40 = var38.toCharArray();
        int var41 = var2[0];
        char[] var42 = var37.toCharArray();
        int var43 = var42.length;
        int var44 = var2[0];
        while (aj.var28(var44, var43)) {
            char var45 = var42[var44];
            var39.append((char)(var45 ^ var40[var41 % var40.length]));
            0;
            ++var41;
            ++var44;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var39);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        void var46;
        Actor actor = Players.getLocal().getInteracting();
        if (aj.var15(actor instanceof NPC) && aj.var18(actor.getName()) && aj.var15(actor.getName().toLowerCase().contains(var1[var2[5]]) ? 1 : 0)) {
            NPC nPC = (NPC)actor;
            0;
            if (-1 < -1) {
                return;
            }
        } else {
            return;
        }
        if (aj.var6(var46.getSkill(), Skill.HITPOINTS)) {
            void var47;
            aj var48;
            long var49 = Math.round(Math.ceil((double)var46.getXp() * 0.75) * 2.0);
            long var50 = Math.max(var49, 1L);
            Map<Integer, Integer> var51 = var48.cM.aa();
            Integer var52 = var51.getOrDefault(var47.getId(), var2[0]);
            int var53 = (int)((long)var52.intValue() + var50);
            var51.put(var47.getId(), var53);
            0;
        }
    }

    private static boolean var17(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean r(NPC nPC) {
        void var3_3;
        void var4_4;
        void var54;
        void var55;
        List<WorldArea> list = e.ax();
        if (aj.var15(list.isEmpty() ? 1 : 0)) {
            return var2[3];
        }
        WorldPoint var56 = var55.getWorldLocation();
        WorldPoint var57 = Players.getLocal().getWorldLocation();
        if (aj.var15(var54.stream().anyMatch(worldArea -> worldArea.contains(var57)) ? 1 : 0)) {
            return var2[0];
        }
        if (aj.var5(var57.distanceTo(var56), var2[4])) {
            return var2[3];
        }
        List<WorldPoint> list2 = this.a((WorldPoint)var4_4, (WorldPoint)var3_3);
        return list2.stream().noneMatch(worldPoint -> list.stream().anyMatch(worldArea -> worldArea.contains(worldPoint)));
    }

    /*
     * WARNING - void declaration
     */
    private boolean t(NPC nPC) {
        void var5_5;
        aj var58;
        void var59;
        if (aj.var14(this.cM.at())) {
            return var2[3];
        }
        Player var60 = Players.getLocal();
        WorldPoint var61 = var59.getWorldLocation();
        WorldPoint var62 = var60.getWorldLocation();
        WorldArea var63 = var58.cM.AttackingTotemTask();
        if (aj.var5(var62.distanceTo(var61), var2[4])) {
            return var2[3];
        }
        if (aj.var7(var63)) {
            return var2[0];
        }
        Stream stream = this.a(Players.getLocal().getWorldLocation(), nPC.getWorldLocation()).stream();
        void v1 = var5_5;
        Objects.requireNonNull(v1);
        0;
        boolean bl = stream.noneMatch(arg_0 -> ((WorldArea)v1).contains(arg_0));
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private boolean s(NPC nPC) {
        void var4_4;
        void var3_3;
        void var64;
        void var65;
        List<WorldPoint> list = this.cM.Y();
        if (aj.var15(list.isEmpty() ? 1 : 0)) {
            return var2[3];
        }
        WorldPoint var66 = Players.getLocal().getWorldLocation();
        if (aj.var15(var65.stream().anyMatch(worldPoint2 -> worldPoint2.equals((Object)var66)) ? 1 : 0)) {
            return var2[0];
        }
        WorldPoint var67 = var64.getWorldLocation();
        if (aj.var5(var66.distanceTo(var67), var2[4])) {
            return var2[3];
        }
        List<WorldPoint> list2 = this.a((WorldPoint)var3_3, (WorldPoint)var4_4);
        return list2.stream().noneMatch(worldPoint -> list.stream().anyMatch(worldPoint2 -> worldPoint2.equals(worldPoint)));
    }
}

