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
        aj.lllIllIlIIlI[3] = " ".length();
        aj.lllIllIlIIlI[4] = 2 ^ 0x7E ^ (0x11 ^ 0x64);
        aj.lllIllIlIIlI[5] = "  ".length();
        aj.lllIllIlIIlI[6] = 0x30 ^ 0x29;
        aj.lllIllIlIIlI[7] = "   ".length();
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
        int lllllllllllllllIIllIIlllIlIlIlII;
        void lllllllllllllllIIllIIlllIlIlIllI;
        void lllllllllllllllIIllIIlllIlIlIlll;
        void lllllllllllllllIIllIIlllIlIllIII;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        Map<Integer, Integer> map = this.cM.aa();
        if (aj.lIIIllIlIIlIIlI(hitsplatApplied.getActor())) {
            return;
        }
        Actor lllllllllllllllIIllIIlllIlIlIlIl = lllllllllllllllIIllIIlllIlIllIII.getActor();
        if (aj.lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(lllllllllllllllIIllIIlllIlIlIlIl.getId()) ? 1 : 0)) {
            return;
        }
        if (aj.lIIIllIlIIlIlII(lllllllllllllllIIllIIlllIlIlIlll.isMine() ? 1 : 0) && aj.lIIIllIlIIlIIIl(SquireNightmarePlugin.q.contains(lllllllllllllllIIllIIlllIlIllIII.getActor().getId()) ? 1 : 0) && aj.lIIIllIlIIlIlll(lllllllllllllllIIllIIlllIlIllIII.getHitsplat().getHitsplatType(), lllIllIlIIlI[6]) && aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIlllIlIlIllI.containsKey(lllllllllllllllIIllIIlllIlIlIlII = lllllllllllllllIIllIIlllIlIllIII.getActor().getId()) ? 1 : 0)) {
            Integer lllllllllllllllIIllIIlllIlIlIIll = (Integer)lllllllllllllllIIllIIlllIlIlIllI.get(lllllllllllllllIIllIIlllIlIlIlII);
            if (aj.lIIIllIlIIllIII(lllllllllllllllIIllIIlllIlIlIIll = Integer.valueOf(lllllllllllllllIIllIIlllIlIlIIll - lllllllllllllllIIllIIlllIlIlIlll.getAmount()))) {
                lllllllllllllllIIllIIlllIlIlIIll = lllIllIlIIlI[0];
            }
            lllllllllllllllIIllIIlllIlIlIllI.put(lllllllllllllllIIllIIlllIlIlIlII, lllllllllllllllIIllIIlllIlIlIIll);
            "".length();
        }
    }

    private static void lIIIllIlIIIllll() {
        lllIllIlIIIl = new String[lllIllIlIIlI[8]];
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[0]] = aj.lIIIllIlIIIllIl("XTLjZVvIynyVE523dm6qnsQOpiKsjt1dadjIAWTdYX8XWliG1B7PtYydG2CPeAK5K4MDN/Gz1fTAsGqZZKYlgYQdkMTtMfEX8XHnTLYGqzc/zGXicXvA9A==", "gcbkN");
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[3]] = aj.lIIIllIlIIIlllI("Hww1PwknJhUkHCEgHHFIEyhhKhohbS8kHGQ+IC0NZCszJAVkPikqDCs6bWsbLyQxOwEqKmE/BzAoLGsJMDkgKANkOS5rCTIiKC9G", "DMAKh");
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[5]] = aj.lIIIllIlIIIllIl("sL25G+bN0yw=", "QAByg");
        aj.lllIllIlIIIl[aj.lllIllIlIIlI[7]] = aj.lIIIllIlIIIllIl("v6tr1rP3yTM=", "ReLpO");
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
        int lllllllllllllllIIllIIllllIIllIlI;
        int n2;
        int lllllllllllllllIIllIIllllIIllIll;
        int n3;
        int lllllllllllllllIIllIIllllIIlllII;
        int n4;
        int n5;
        aj lllllllllllllllIIllIIllllIlIIIlI;
        if (aj.lIIIllIlIIlIIIl(this.cK.assistantMode() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        Player lllllllllllllllIIllIIllllIlIIIIl = Players.getLocal();
        int[] lllllllllllllllIIllIIllllIlIIIII = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC lllllllllllllllIIllIIllllIIlllll = NPCs.getAll((int[])lllllllllllllllIIllIIllllIlIIIII).stream().filter(nPC -> {
            boolean bl;
            if (aj.lIIIllIlIIlIlII(nPC.isDead() ? 1 : 0)) {
                bl = lllIllIlIIlI[3];
                "".length();
                if (((0x16 ^ 0x13 ^ (0xBF ^ 0x84)) & (0x50 ^ 0xB ^ (0x7E ^ 0x1B) ^ -" ".length())) != 0) {
                    return ((0xDA ^ 0x99 ^ (0xBB ^ 0xBC)) & (0x7C ^ 0x75 ^ (0x19 ^ 0x54) ^ -" ".length())) != 0;
                }
            } else {
                bl = lllIllIlIIlI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (aj.lIIIllIlIIlIIlI(lllllllllllllllIIllIIllllIIlllll)) {
            lllllllllllllllIIllIIllllIlIIIlI.cM.a(new ak(lllllllllllllllIIllIIllllIlIIIlI));
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIlIIIlI.cM.ai()) && aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIlIIIlI.cM.ai().getTypes().contains(WorldType.SEASONAL) ? 1 : 0)) {
            n5 = lllIllIlIIlI[1];
            "".length();
            if ((0x51 ^ 0x5A ^ (0xCF ^ 0xC0)) < ((0x42 ^ 0x6F ^ (0x13 ^ 0x61)) & (21 + 77 - -52 + 76 ^ 45 + 98 - -21 + 25 ^ -" ".length()))) {
                return ((0x6D ^ 0x68 ^ (0x42 ^ 0x7A) & ~(0x30 ^ 8)) & (0x6E ^ 0x1F ^ (0xCE ^ 0xBA) ^ -" ".length())) != 0;
            }
        } else {
            n5 = lllIllIlIIlI[2];
        }
        int lllllllllllllllIIllIIllllIIllllI = n5;
        NPC lllllllllllllllIIllIIllllIIlllIl = NPCs.getAll((int[])lllllllllllllllIIllIIllllIlIIIII).stream().filter(nPC -> {
            boolean bl;
            if (aj.lIIIllIlIIllIIl(this.cM.ag.get(nPC.getId()), lllllllllllllllIIllIIllllIIllllI)) {
                bl = lllIllIlIIlI[3];
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0xC ^ 0x5D) & ~(0x68 ^ 0x39)) != 0;
                }
            } else {
                bl = lllIllIlIIlI[0];
            }
            return bl;
        }).filter(nPC -> {
            int n2;
            if (aj.lIIIllIlIIlIIIl(this.t((NPC)nPC) ? 1 : 0) && aj.lIIIllIlIIlIIIl(this.r((NPC)nPC) ? 1 : 0) && aj.lIIIllIlIIlIIIl(this.s((NPC)nPC) ? 1 : 0)) {
                n2 = lllIllIlIIlI[3];
                "".length();
                if ((0x61 ^ 0x65) == 0) {
                    return ((0x25 ^ 0x3D) & ~(6 ^ 0x1E)) != 0;
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
                    "".length();
                    if ("   ".length() > 0) return n2 != 0;
                    return ((0x42 ^ 0xA ^ (0x70 ^ 0x2C)) & (121 + 0 - 81 + 98 ^ 95 + 74 - 14 + 3 ^ -" ".length())) != 0;
                }
            }
            n2 = lllIllIlIIlI[0];
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceTo(lllllllllllllllIIllIIllllIlIIIIl.getWorldLocation()))).orElse(null);
        if (aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIlIIIlI.cJ.aX())) {
            n4 = lllIllIlIIlI[3];
            "".length();
            if ((0x55 ^ 1 ^ (0x75 ^ 0x25)) <= 0) {
                return ((0x1D ^ 0x51 ^ (0xB9 ^ 0xA1)) & (6 + 136 - 64 + 148 ^ 168 + 47 - 117 + 84 ^ -" ".length())) != 0;
            }
        } else {
            n4 = lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIIlllII = n4)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIlIIIlI.cJ.aY())) {
            n3 = lllIllIlIIlI[3];
            "".length();
            if (null != null) {
                return ((0x58 ^ 0x3B) & ~(0xC0 ^ 0xA3)) != 0;
            }
        } else {
            n3 = lllIllIlIIlI[0];
        }
        if (!aj.lIIIllIlIIlIlII(lllllllllllllllIIllIIllllIIllIll = n3) || aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIlIIIlI.cM.T() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIlIIIlI.cJ.aZ())) {
            n2 = lllIllIlIIlI[3];
            "".length();
            if (((0x6C ^ 0xB ^ (0x5A ^ 0x34)) & (0x77 ^ 7 ^ (0xE5 ^ 0x9C) ^ -" ".length())) < 0) {
                return ((0x21 ^ 0x58 ^ 25 + 112 - 52 + 42) & (0x77 ^ 0x3D ^ (0xC5 ^ 0x89) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIIllIlI = n2)) {
            return lllIllIlIIlI[0];
        }
        RectangularArea lllllllllllllllIIllIIllllIIllIIl = e.ay();
        if (aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIIllIIl) && aj.lIIIllIlIIlIlII(lllllllllllllllIIllIIllllIIllIIl.contains(lllllllllllllllIIllIIllllIlIIIIl.getWorldLocation()) ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[0]]);
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIlII(lllllllllllllllIIllIIllllIlIIIlI.cu() ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[3]]);
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIlIIIlI.cM.aj()) && aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIlIIIlI.cM.aj().contains(lllllllllllllllIIllIIllllIlIIIIl.getWorldLocation()) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (!aj.lIIIllIlIIlIIll(lllllllllllllllIIllIIllllIIlllIl) || aj.lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(lllllllllllllllIIllIIllllIIlllIl.getId()) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        return this.x((NPC)var5_5);
    }

    private static boolean lIIIllIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIlIIIllIl(String lllllllllllllllIIllIIlllIIlIIIll, String lllllllllllllllIIllIIlllIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lllIllIlIIlI[9]), "DES");
            Cipher lllllllllllllllIIllIIlllIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlllIIlIIlll.init(lllIllIlIIlI[5], lllllllllllllllIIllIIlllIIlIlIII);
            return new String(lllllllllllllllIIllIIlllIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlllIIlIIllI) {
            lllllllllllllllIIllIIlllIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static String lIIIllIlIIIlllI(String lllllllllllllllIIllIIlllIIllIlIl, String lllllllllllllllIIllIIlllIIllIlII) {
        lllllllllllllllIIllIIlllIIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlllIIlllIII = new StringBuilder();
        char[] lllllllllllllllIIllIIlllIIllIlll = lllllllllllllllIIllIIlllIIllIlII.toCharArray();
        int lllllllllllllllIIllIIlllIIllIllI = lllIllIlIIlI[0];
        char[] lllllllllllllllIIllIIlllIIllIIII = lllllllllllllllIIllIIlllIIllIlIl.toCharArray();
        int lllllllllllllllIIllIIlllIIlIllll = lllllllllllllllIIllIIlllIIllIIII.length;
        int lllllllllllllllIIllIIlllIIlIlllI = lllIllIlIIlI[0];
        while (aj.lIIIllIlIIllIIl(lllllllllllllllIIllIIlllIIlIlllI, lllllllllllllllIIllIIlllIIlIllll)) {
            char lllllllllllllllIIllIIlllIIlllIll = lllllllllllllllIIllIIlllIIllIIII[lllllllllllllllIIllIIlllIIlIlllI];
            lllllllllllllllIIllIIlllIIlllIII.append((char)(lllllllllllllllIIllIIlllIIlllIll ^ lllllllllllllllIIllIIlllIIllIlll[lllllllllllllllIIllIIlllIIllIllI % lllllllllllllllIIllIIlllIIllIlll.length]));
            "".length();
            ++lllllllllllllllIIllIIlllIIllIllI;
            ++lllllllllllllllIIllIIlllIIlIlllI;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlllIIlllIII);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        void lllllllllllllllIIllIIlllIllIlIII;
        Actor actor = Players.getLocal().getInteracting();
        if (aj.lIIIllIlIIlIIIl(actor instanceof NPC) && aj.lIIIllIlIIlIIll(actor.getName()) && aj.lIIIllIlIIlIIIl(actor.getName().toLowerCase().contains(lllIllIlIIIl[lllIllIlIIlI[5]]) ? 1 : 0)) {
            NPC nPC = (NPC)actor;
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        } else {
            return;
        }
        if (aj.lIIIllIlIIlIllI(lllllllllllllllIIllIIlllIllIlIII.getSkill(), Skill.HITPOINTS)) {
            void lllllllllllllllIIllIIlllIllIIllI;
            aj lllllllllllllllIIllIIlllIllIlIIl;
            long lllllllllllllllIIllIIlllIllIIlIl = Math.round(Math.ceil((double)lllllllllllllllIIllIIlllIllIlIII.getXp() * 0.75) * 2.0);
            long lllllllllllllllIIllIIlllIllIIlII = Math.max(lllllllllllllllIIllIIlllIllIIlIl, 1L);
            Map<Integer, Integer> lllllllllllllllIIllIIlllIllIIIll = lllllllllllllllIIllIIlllIllIlIIl.cM.aa();
            Integer lllllllllllllllIIllIIlllIllIIIlI = lllllllllllllllIIllIIlllIllIIIll.getOrDefault(lllllllllllllllIIllIIlllIllIIllI.getId(), lllIllIlIIlI[0]);
            int lllllllllllllllIIllIIlllIllIIIIl = (int)((long)lllllllllllllllIIllIIlllIllIIIlI.intValue() + lllllllllllllllIIllIIlllIllIIlII);
            lllllllllllllllIIllIIlllIllIIIll.put(lllllllllllllllIIllIIlllIllIIllI.getId(), lllllllllllllllIIllIIlllIllIIIIl);
            "".length();
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
        void lllllllllllllllIIllIIllllIIlIIII;
        void lllllllllllllllIIllIIllllIIlIIIl;
        List<WorldArea> list = e.ax();
        if (aj.lIIIllIlIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint lllllllllllllllIIllIIllllIIIllll = lllllllllllllllIIllIIllllIIlIIIl.getWorldLocation();
        WorldPoint lllllllllllllllIIllIIllllIIIlllI = Players.getLocal().getWorldLocation();
        if (aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIIlIIII.stream().anyMatch(worldArea -> worldArea.contains(lllllllllllllllIIllIIllllIIIlllI)) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (aj.lIIIllIlIIlIlIl(lllllllllllllllIIllIIllllIIIlllI.distanceTo(lllllllllllllllIIllIIllllIIIllll), lllIllIlIIlI[4])) {
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
        aj lllllllllllllllIIllIIlllIllllIIl;
        void lllllllllllllllIIllIIlllIllllIII;
        if (aj.lIIIllIlIIlIlII(this.cM.at())) {
            return lllIllIlIIlI[3];
        }
        Player lllllllllllllllIIllIIlllIlllIlll = Players.getLocal();
        WorldPoint lllllllllllllllIIllIIlllIlllIllI = lllllllllllllllIIllIIlllIllllIII.getWorldLocation();
        WorldPoint lllllllllllllllIIllIIlllIlllIlIl = lllllllllllllllIIllIIlllIlllIlll.getWorldLocation();
        WorldArea lllllllllllllllIIllIIlllIlllIlII = lllllllllllllllIIllIIlllIllllIIl.cM.aj();
        if (aj.lIIIllIlIIlIlIl(lllllllllllllllIIllIIlllIlllIlIl.distanceTo(lllllllllllllllIIllIIlllIlllIllI), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        if (aj.lIIIllIlIIlIIlI(lllllllllllllllIIllIIlllIlllIlII)) {
            return lllIllIlIIlI[0];
        }
        Stream stream = this.a(Players.getLocal().getWorldLocation(), nPC.getWorldLocation()).stream();
        void v1 = var5_5;
        Objects.requireNonNull(v1);
        "".length();
        boolean bl = stream.noneMatch(arg_0 -> ((WorldArea)v1).contains(arg_0));
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private boolean s(NPC nPC) {
        void var4_4;
        void var3_3;
        void lllllllllllllllIIllIIllllIIIIlIl;
        void lllllllllllllllIIllIIllllIIIIlII;
        List<WorldPoint> list = this.cM.Y();
        if (aj.lIIIllIlIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint lllllllllllllllIIllIIllllIIIIIll = Players.getLocal().getWorldLocation();
        if (aj.lIIIllIlIIlIIIl(lllllllllllllllIIllIIllllIIIIlII.stream().anyMatch(worldPoint2 -> worldPoint2.equals((Object)lllllllllllllllIIllIIllllIIIIIll)) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        WorldPoint lllllllllllllllIIllIIllllIIIIIlI = lllllllllllllllIIllIIllllIIIIlIl.getWorldLocation();
        if (aj.lIIIllIlIIlIlIl(lllllllllllllllIIllIIllllIIIIIll.distanceTo(lllllllllllllllIIllIIllllIIIIIlI), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        List<WorldPoint> list2 = this.a((WorldPoint)var3_3, (WorldPoint)var4_4);
        return list2.stream().noneMatch(worldPoint -> list.stream().anyMatch(worldPoint2 -> worldPoint2.equals(worldPoint)));
    }
}

