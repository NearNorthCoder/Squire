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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ak;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Totem", priority=2, register=true)
public class AttackingTotemTask
extends NightmareTaskBase {

    private static final  Logger dZ;

    static {
        aj.lIIIllIlIIlIIII();
        aj.lIIIllIlIIIllll();
        dZ = LoggerFactory.getLogger(AttackingTotemTask.class);
    }

    private static boolean lIIIllIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public AttackingTotemTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIIllIlIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllIlIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIIllIlIIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        int var1;
        void var2;
        void var3;
        void var4;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        Map<Integer, Integer> map = this.cM.aa();
        if (aj.lIIIllIlIIlIIlI(hitsplatApplied.getActor())) {
            return;
        }
        Actor var5 = var4.getActor();
        if (aj.lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(var5.getId()) ? 1 : 0)) {
            return;
        }
        if (aj.lIIIllIlIIlIlII(var3.isMine() ? 1 : 0) && aj.lIIIllIlIIlIIIl(SquireNightmarePlugin.q.contains(var4.getActor().getId()) ? 1 : 0) && aj.lIIIllIlIIlIlll(var4.getHitsplat().getHitsplatType(), lllIllIlIIlI[6]) && aj.lIIIllIlIIlIIIl(var2.containsKey(var1 = var4.getActor().getId()) ? 1 : 0)) {
            Integer var6 = (Integer)var2.get(var1);
            if (aj.lIIIllIlIIllIII(var6 = Integer.valueOf(var6 - var3.getAmount()))) {
                var6 = lllIllIlIIlI[0];
            }
            var2.put(var1, var6);

        }
    }

    private static void lIIIllIlIIIllll() {
        lllIllIlIIIl = new String[lllIllIlIIlI[8]];
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[0]] = "[AttackTotem]: We're not inside flower area, skipping totem attack to move inside.";
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[3]] = "[AttackTotem]: We are not safe from shadow, skipping totem attack to avoid.";
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[5]] = "totem";
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[7]] = "Charge";
    }

    private static boolean lIIIllIlIIlIIll(Object object) {
        return object != null;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIIllIlIIlIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var5_5;
        int var7;
        int n2;
        int var8;
        int n3;
        int var9;
        int n4;
        int n5;
        aj var10;
        if (aj.lIIIllIlIIlIIIl(this.cK.assistantMode() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        Player var11 = Players.getLocal();
        int[] var12 = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC var13 = NPCs.getAll((int[])var12).stream().filter(nPC -> {
            boolean bl;
            if (aj.lIIIllIlIIlIlII(nPC.isDead() ? 1 : 0)) {
                bl = lllIllIlIIlI[3];

                if (((0x16 ^ 0x13 ^ (0xBF ^ 0x84)) & (0x50 ^ 0xB ^ (0x7E ^ 0x1B) ^ -1)) != 0) {
                    return ((0xDA ^ 0x99 ^ (0xBB ^ 0xBC)) & (0x7C ^ 0x75 ^ (0x19 ^ 0x54) ^ -1)) != 0;
                }
            } else {
                bl = lllIllIlIIlI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (aj.lIIIllIlIIlIIlI(var13)) {
            var10.cM.a(new ak(var10));
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var10.cM.ai()) && aj.lIIIllIlIIlIIIl(var10.cM.ai().getTypes().contains(WorldType.SEASONAL) ? 1 : 0)) {
            n5 = lllIllIlIIlI[1];

            if ((0x51 ^ 0x5A ^ (0xCF ^ 0xC0)) < ((0x42 ^ 0x6F ^ (0x13 ^ 0x61)) & (21 + 77 - -52 + 76 ^ 45 + 98 - -21 + 25 ^ -1))) {
                return ((0x6D ^ 0x68 ^ (0x42 ^ 0x7A) & ~(0x30 ^ 8)) & (0x6E ^ 0x1F ^ (0xCE ^ 0xBA) ^ -1)) != 0;
            }
        } else {
            n5 = lllIllIlIIlI[2];
        }
        int var14 = n5;
        NPC var15 = NPCs.getAll((int[])var12).stream().filter(nPC -> {
            boolean bl;
            if (aj.lIIIllIlIIllIIl(this.cM.ag.get(nPC.getId()), var14)) {
                bl = lllIllIlIIlI[3];

                if (1 != 1) {
                    return false;
                }
            } else {
                bl = lllIllIlIIlI[0];
            }
            return bl;
        }).filter(nPC -> {
            int n2;
            if (aj.lIIIllIlIIlIIIl(this.t((NPC)nPC) ? 1 : 0) && aj.lIIIllIlIIlIIIl(this.r((NPC)nPC) ? 1 : 0) && aj.lIIIllIlIIlIIIl(this.s((NPC)nPC) ? 1 : 0)) {
                n2 = lllIllIlIIlI[3];

                if ((0x61 ^ 0x65) == 0) {
                    return false;
                }
            } else {
                n2 = lllIllIlIIlI[0];
            }
            return n2 != 0;
        }).filter(nPC -> {
            int n2;
            if (aj.lIIIllIlIIlIlII(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[lllIllIlIIlI[3]];
                stringArray[aj.lllIllIlIIlI[0]] = lllIllIlIIIl[lllIllIlIIlI[7]];
                if (aj.lIIIllIlIIlIIIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllIlIIlI[3];

                    if (3 > 0) return n2 != 0;
                    return ((0x42 ^ 0xA ^ (0x70 ^ 0x2C)) & (121 + 0 - 81 + 98 ^ 95 + 74 - 14 + 3 ^ -1)) != 0;
                }
            }
            n2 = lllIllIlIIlI[0];
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo(var11.getWorldLocation()))).orElse(null);
        if (aj.lIIIllIlIIlIIll(var10.cJ.aX())) {
            n4 = lllIllIlIIlI[3];

            if ((0x55 ^ 1 ^ (0x75 ^ 0x25)) <= 0) {
                return ((0x1D ^ 0x51 ^ (0xB9 ^ 0xA1)) & (6 + 136 - 64 + 148 ^ 168 + 47 - 117 + 84 ^ -1)) != 0;
            }
        } else {
            n4 = lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIIl(var9 = n4)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var10.cJ.aY())) {
            n3 = lllIllIlIIlI[3];

            }
        } else {
            n3 = lllIllIlIIlI[0];
        }
        if (!aj.lIIIllIlIIlIlII(var8 = n3) || aj.lIIIllIlIIlIIIl(var10.cM.T() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var10.cJ.aZ())) {
            n2 = lllIllIlIIlI[3];

            if (((0x6C ^ 0xB ^ (0x5A ^ 0x34)) & (0x77 ^ 7 ^ (0xE5 ^ 0x9C) ^ -1)) < 0) {
                return ((0x21 ^ 0x58 ^ 25 + 112 - 52 + 42) & (0x77 ^ 0x3D ^ (0xC5 ^ 0x89) ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIIl(var7 = n2)) {
            return lllIllIlIIlI[0];
        }
        RectangularArea var16 = e.ay();
        if (aj.lIIIllIlIIlIIll(var16) && aj.lIIIllIlIIlIlII(var16.contains(var11.getWorldLocation()) ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[0]]);
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIlII(var10.cu() ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[3]]);
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var10.cM.AttackingTotemTask()) && aj.lIIIllIlIIlIIIl(var10.cM.AttackingTotemTask().contains(var11.getWorldLocation()) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (!aj.lIIIllIlIIlIIll(var15) || aj.lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(var15.getId()) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        return this.x((NPC)var5_5);
    }

    private static boolean lIIIllIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIIlIIIl(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        void var18;
        Actor actor = Players.getLocal().getInteracting();
        if (aj.lIIIllIlIIlIIIl(actor instanceof NPC) && aj.lIIIllIlIIlIIll(actor.getName()) && aj.lIIIllIlIIlIIIl(actor.getName().toLowerCase().contains(lllIllIlIIIl[lllIllIlIIlI[5]]) ? 1 : 0)) {
            NPC nPC = (NPC)actor;

            if (-1 < -1) {
                return;
            }
        } else {
            return;
        }
        if (aj.lIIIllIlIIlIllI(var18.getSkill(), Skill.HITPOINTS)) {
            void var19;
            aj var20;
            long var21 = Math.round(Math.ceil((double)var18.getXp() * 0.75) * 2.0);
            long var22 = Math.max(var21, 1L);
            Map<Integer, Integer> var23 = var20.cM.aa();
            Integer var24 = var23.getOrDefault(var19.getId(), lllIllIlIIlI[0]);
            int var25 = (int)((long)var24.intValue() + var22);
            var23.put(var19.getId(), var25);

        }
    }

    private static boolean lIIIllIlIIllIII(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean r(NPC nPC) {
        void var3_3;
        void var4_4;
        void var26;
        void var27;
        List<WorldArea> list = e.ax();
        if (aj.lIIIllIlIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint var28 = var27.getWorldLocation();
        WorldPoint var29 = Players.getLocal().getWorldLocation();
        if (aj.lIIIllIlIIlIIIl(var26.stream().anyMatch(worldArea -> worldArea.contains(var29)) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIlIl(var29.distanceTo(var28), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        List<WorldPoint> list2 = this.a((WorldPoint)var4_4, (WorldPoint)var3_3);
        return list2.stream().noneMatch(worldPoint -> list.stream().anyMatch(worldArea -> worldArea.contains(worldPoint)));
    }

    /*
     * WARNING - void declaration
     */
    private boolean t(NPC nPC) {
        void var5_5;
        aj var30;
        void var31;
        if (aj.lIIIllIlIIlIlII(this.cM.at())) {
            return lllIllIlIIlI[3];
        }
        Player var32 = Players.getLocal();
        WorldPoint var33 = var31.getWorldLocation();
        WorldPoint var34 = var32.getWorldLocation();
        WorldArea var35 = var30.cM.AttackingTotemTask();
        if (aj.lIIIllIlIIlIlIl(var34.distanceTo(var33), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        if (aj.lIIIllIlIIlIIlI(var35)) {
            return lllIllIlIIlI[0];
        }
        Stream stream = this.a(Players.getLocal().getWorldLocation(), nPC.getWorldLocation()).stream();
        void v1 = var5_5;
        Objects.requireNonNull(v1);

        boolean bl = stream.noneMatch(arg_0 -> ((WorldArea)v1).contains(arg_0));
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private boolean s(NPC nPC) {
        void var4_4;
        void var3_3;
        void var36;
        void var37;
        List<WorldPoint> list = this.cM.Y();
        if (aj.lIIIllIlIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint var38 = Players.getLocal().getWorldLocation();
        if (aj.lIIIllIlIIlIIIl(var37.stream().anyMatch(worldPoint2 -> worldPoint2.equals((Object)var38)) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        WorldPoint var39 = var36.getWorldLocation();
        if (aj.lIIIllIlIIlIlIl(var38.distanceTo(var39), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        List<WorldPoint> list2 = this.a((WorldPoint)var3_3, (WorldPoint)var4_4);
        return list2.stream().noneMatch(worldPoint -> list.stream().anyMatch(worldPoint2 -> worldPoint2.equals(worldPoint)));
    }
}

