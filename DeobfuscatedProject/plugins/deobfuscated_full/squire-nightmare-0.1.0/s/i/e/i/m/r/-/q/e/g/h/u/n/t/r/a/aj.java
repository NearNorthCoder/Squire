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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

/* TASK: Attacking Totem -> AttackingtotemTask */
@TaskDesc(name="Attacking Totem", priority=2, register=true)
public class aj
extends al {
    private static /* synthetic */ String[] lllIllIlIIIl;
    private static /* synthetic */ int[] lllIllIlIIlI;
    private static final /* synthetic */ Logger dZ;

    static {
        aj.lIIIllIlIIlIIII();
        aj.lIIIllIlIIIllll();
        dZ = LoggerFactory.getLogger(aj.class);
    }

    private static void lIIIllIlIIlIIII() {
        lllIllIlIIlI = new int[10];
        aj.lllIllIlIIlI[0] = (0x3A ^ 0x18) & ~(0x71 ^ 0x53);
        aj.lllIllIlIIlI[1] = -(0xFFFFDEEE & 0x3BD5) & (0xFFFF9BEF & Short.MAX_VALUE);
        aj.lllIllIlIIlI[2] = 149 + 183 - 133 + 1;
        aj.lllIllIlIIlI[3] = 1;
        aj.lllIllIlIIlI[4] = 2 ^ 0x7E ^ (0x11 ^ 0x64);
        aj.lllIllIlIIlI[5] = 2;
        aj.lllIllIlIIlI[6] = 0x30 ^ 0x29;
        aj.lllIllIlIIlI[7] = 3;
        aj.lllIllIlIIlI[8] = 0x43 ^ 0x2A ^ (0xA ^ 0x67);
        aj.lllIllIlIIlI[9] = 0xBD ^ 0xA2 ^ (0x1E ^ 9);
    }

    private static boolean lIIIllIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public aj(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
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
        int var2;
        void var5;
        void var28;
        void var50;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        Map<Integer, Integer> map = this.cM.aa();
        if (aj.lIIIllIlIIlIIlI(hitsplatApplied.getActor())) {
            return;
        }
        Actor var37 = var50.getActor();
        if (aj.lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(var37.getId()) ? 1 : 0)) {
            return;
        }
        if (aj.lIIIllIlIIlIlII(var28.isMine() ? 1 : 0) && aj.lIIIllIlIIlIIIl(SquireNightmarePlugin.q.contains(var50.getActor().getId()) ? 1 : 0) && aj.lIIIllIlIIlIlll(var50.getHitsplat().getHitsplatType(), lllIllIlIIlI[6]) && aj.lIIIllIlIIlIIIl(var5.containsKey(var2 = var50.getActor().getId()) ? 1 : 0)) {
            Integer var25 = (Integer)var5.get(var2);
            if (aj.lIIIllIlIIllIII(var25 = Integer.valueOf(var25 - var28.getAmount()))) {
                var25 = lllIllIlIIlI[0];
            }
            var5.put(var2, var25);
            0;
        }
    }

    private static void lIIIllIlIIIllll() {
        lllIllIlIIIl = new String[lllIllIlIIlI[8]];
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[0]] = aj."[AttackTotem]: We're not inside flower area, skipping totem attack to move inside.";
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[3]] = aj."[AttackTotem]: We are not safe from shadow, skipping totem attack to avoid.";
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[5]] = aj."totem";
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[7]] = aj."Charge";
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
        int var14;
        int n2;
        int var4;
        int n3;
        int var40;
        int n4;
        int n5;
        aj var44;
        if (aj.lIIIllIlIIlIIIl(this.cK.assistantMode() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        Player var17 = Players.getLocal();
        int[] var34 = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC var52 = NPCs.getAll((int[])var34).stream().filter(nPC -> {
            boolean bl;
            if (aj.lIIIllIlIIlIlII(nPC.isDead() ? 1 : 0)) {
                bl = lllIllIlIIlI[3];
                0;
                if (((0x16 ^ 0x13 ^ (0xBF ^ 0x84)) & (0x50 ^ 0xB ^ (0x7E ^ 0x1B) ^ -1)) != 0) {
                    return ((0xDA ^ 0x99 ^ (0xBB ^ 0xBC)) & (0x7C ^ 0x75 ^ (0x19 ^ 0x54) ^ -1)) != 0;
                }
            } else {
                bl = lllIllIlIIlI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (aj.lIIIllIlIIlIIlI(var52)) {
            var44.cM.a(new ak(var44));
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var44.cM.ai()) && aj.lIIIllIlIIlIIIl(var44.cM.ai().getTypes().contains(WorldType.SEASONAL) ? 1 : 0)) {
            n5 = lllIllIlIIlI[1];
            0;
            if ((0x51 ^ 0x5A ^ (0xCF ^ 0xC0)) < ((0x42 ^ 0x6F ^ (0x13 ^ 0x61)) & (21 + 77 - -52 + 76 ^ 45 + 98 - -21 + 25 ^ -1))) {
                return ((0x6D ^ 0x68 ^ (0x42 ^ 0x7A) & ~(0x30 ^ 8)) & (0x6E ^ 0x1F ^ (0xCE ^ 0xBA) ^ -1)) != 0;
            }
        } else {
            n5 = lllIllIlIIlI[2];
        }
        int var19 = n5;
        NPC var31 = NPCs.getAll((int[])var34).stream().filter(nPC -> {
            boolean bl;
            if (aj.lIIIllIlIIllIIl(this.cM.ag.get(nPC.getId()), var19)) {
                bl = lllIllIlIIlI[3];
                0;
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
                0;
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
                    0;
                    if (3 > 0) return n2 != 0;
                    return ((0x42 ^ 0xA ^ (0x70 ^ 0x2C)) & (121 + 0 - 81 + 98 ^ 95 + 74 - 14 + 3 ^ -1)) != 0;
                }
            }
            n2 = lllIllIlIIlI[0];
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo(var17.getWorldLocation()))).orElse(null);
        if (aj.lIIIllIlIIlIIll(var44.cJ.aX())) {
            n4 = lllIllIlIIlI[3];
            0;
            if ((0x55 ^ 1 ^ (0x75 ^ 0x25)) <= 0) {
                return ((0x1D ^ 0x51 ^ (0xB9 ^ 0xA1)) & (6 + 136 - 64 + 148 ^ 168 + 47 - 117 + 84 ^ -1)) != 0;
            }
        } else {
            n4 = lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIIl(var40 = n4)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var44.cJ.aY())) {
            n3 = lllIllIlIIlI[3];
            0;
            
            }
        } else {
            n3 = lllIllIlIIlI[0];
        }
        if (!aj.lIIIllIlIIlIlII(var4 = n3) || aj.lIIIllIlIIlIIIl(var44.cM.T() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var44.cJ.aZ())) {
            n2 = lllIllIlIIlI[3];
            0;
            if (((0x6C ^ 0xB ^ (0x5A ^ 0x34)) & (0x77 ^ 7 ^ (0xE5 ^ 0x9C) ^ -1)) < 0) {
                return ((0x21 ^ 0x58 ^ 25 + 112 - 52 + 42) & (0x77 ^ 0x3D ^ (0xC5 ^ 0x89) ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIIl(var14 = n2)) {
            return lllIllIlIIlI[0];
        }
        RectangularArea var21 = e.ay();
        if (aj.lIIIllIlIIlIIll(var21) && aj.lIIIllIlIIlIlII(var21.contains(var17.getWorldLocation()) ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[0]]);
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIlII(var44.cu() ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[3]]);
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(var44.cM.aj()) && aj.lIIIllIlIIlIIIl(var44.cM.aj().contains(var17.getWorldLocation()) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (!aj.lIIIllIlIIlIIll(var31) || aj.lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(var31.getId()) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        return this.x((NPC)var5_5);
    }

    private static boolean lIIIllIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIlIIIllIl(String var38, String var32) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), lllIllIlIIlI[9]), "DES");
            Cipher var41 = Cipher.getInstance("DES");
            var41.init(lllIllIlIIlI[5], var3);
            return new String(var41.doFinal(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static String lIIIllIlIIIlllI(String var1, String var51) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var35 = var51.toCharArray();
        int var23 = lllIllIlIIlI[0];
        char[] var20 = var1.toCharArray();
        int var42 = var20.length;
        int var22 = lllIllIlIIlI[0];
        while (aj.lIIIllIlIIllIIl(var22, var42)) {
            char var27 = var20[var22];
            var16.append((char)(var27 ^ var35[var23 % var35.length]));
            0;
            ++var23;
            ++var22;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        void var45;
        Actor actor = Players.getLocal().getInteracting();
        if (aj.lIIIllIlIIlIIIl(actor instanceof NPC) && aj.lIIIllIlIIlIIll(actor.getName()) && aj.lIIIllIlIIlIIIl(actor.getName().toLowerCase().contains(lllIllIlIIIl[lllIllIlIIlI[5]]) ? 1 : 0)) {
            NPC nPC = (NPC)actor;
            0;
            if (-1 < -1) {
                return;
            }
        } else {
            return;
        }
        if (aj.lIIIllIlIIlIllI(var45.getSkill(), Skill.HITPOINTS)) {
            void var18;
            aj var33;
            long var48 = Math.round(Math.ceil((double)var45.getXp() * 0.75) * 2.0);
            long var43 = Math.max(var48, 1L);
            Map<Integer, Integer> var46 = var33.cM.aa();
            Integer var39 = var46.getOrDefault(var18.getId(), lllIllIlIIlI[0]);
            int var11 = (int)((long)var39.intValue() + var43);
            var46.put(var18.getId(), var11);
            0;
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
        void var13;
        void var30;
        List<WorldArea> list = e.ax();
        if (aj.lIIIllIlIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint var9 = var30.getWorldLocation();
        WorldPoint var26 = Players.getLocal().getWorldLocation();
        if (aj.lIIIllIlIIlIIIl(var13.stream().anyMatch(worldArea -> worldArea.contains(var26)) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIlIl(var26.distanceTo(var9), lllIllIlIIlI[4])) {
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
        aj var47;
        void var10;
        if (aj.lIIIllIlIIlIlII(this.cM.at())) {
            return lllIllIlIIlI[3];
        }
        Player var29 = Players.getLocal();
        WorldPoint var49 = var10.getWorldLocation();
        WorldPoint var12 = var29.getWorldLocation();
        WorldArea var7 = var47.cM.aj();
        if (aj.lIIIllIlIIlIlIl(var12.distanceTo(var49), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        if (aj.lIIIllIlIIlIIlI(var7)) {
            return lllIllIlIIlI[0];
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
        void var36;
        void var6;
        List<WorldPoint> list = this.cM.Y();
        if (aj.lIIIllIlIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint var24 = Players.getLocal().getWorldLocation();
        if (aj.lIIIllIlIIlIIIl(var6.stream().anyMatch(worldPoint2 -> worldPoint2.equals((Object)var24)) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        WorldPoint var8 = var36.getWorldLocation();
        if (aj.lIIIllIlIIlIlIl(var24.distanceTo(var8), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        List<WorldPoint> list2 = this.a((WorldPoint)var3_3, (WorldPoint)var4_4);
        return list2.stream().noneMatch(worldPoint -> list.stream().anyMatch(worldPoint2 -> worldPoint2.equals(worldPoint)));
    }
}

