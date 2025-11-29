/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.i;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;

public abstract class aR
extends Task {
    private static /* synthetic */ int[] lIlIlIllIlIl;
    protected /* synthetic */ Player bS;
    protected final /* synthetic */ SquireChambersConfig eb;
    protected final /* synthetic */ i ed;
    protected final /* synthetic */ Client ec;
    protected final /* synthetic */ SquireChambersPlugin ea;
    private static /* synthetic */ String[] lIlIlIlIllII;

    @Inject
    protected aR(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        this.ea = squireChambersPlugin;
        this.eb = squireChambersConfig;
        this.ec = client;
        this.ed = squireChambersPlugin.y();
    }

    protected WorldArea dC() {
        return new WorldArea(this.dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[2]), lIlIlIllIlIl[10], lIlIlIllIlIl[10]);
    }

    protected List<WorldPoint> m(String string) {
        return this.l(string);
    }

    public abstract boolean cg();

    /*
     * WARNING - void declaration
     */
    protected void cm() {
        void lllllllllllllllIllIIlllIllIllllI;
        EquipmentSetup equipmentSetup = this.cj();
        if (aR.llIllllIllIIIl(equipmentSetup)) {
            return;
        }
        if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIllIllllI.isEquipped() ? 1 : 0)) {
            return;
        }
        Gear.swapTo((EquipmentSetup)equipmentSetup);
        0;
    }

    protected boolean dt() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aR.llIllllIlIllll(nPC.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[27]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlIl[2]];
                stringArray[aR.lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[28]];
                if (aR.llIllllIlIllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIllIlIl[2];
                    0;
                    if (1 < 2) return n2 != 0;
                    return ((148 + 146 - 201 + 105 ^ 83 + 85 - 40 + 1) & (0x30 ^ 0x3B ^ (0xB ^ 0x47) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIllIlIl[0];
            return n2 != 0;
        });
        if (aR.llIllllIllIIIl(nPC2)) {
            System.out.println(lIlIlIlIllII[lIlIlIllIlIl[4]]);
            return lIlIlIllIlIl[0];
        }
        nPC2.interact(lIlIlIlIllII[lIlIlIllIlIl[5]]);
        return lIlIlIllIlIl[2];
    }

    private static boolean llIllllIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    protected List<WorldPoint> l(String string) {
        void lllllllllllllllIllIIlllIlIllllll;
        aR lllllllllllllllIllIIlllIllIIIIII;
        if (aR.llIllllIllIIIl(this.ed.ax())) {
            return null;
        }
        int n2 = lllllllllllllllIllIIlllIllIIIIII.dG();
        void lllllllllllllllIllIIlllIlIllllIl = lllllllllllllllIllIIlllIlIllllll;
        int lllllllllllllllIllIIlllIlIllllII = lIlIlIllIlIl[3];
        switch (lllllllllllllllIllIIlllIlIllllIl.hashCode()) {
            case -2021012075: {
                if (!aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIllllIl.equals(lIlIlIlIllII[lIlIlIllIlIl[13]]) ? 1 : 0)) break;
                lllllllllllllllIllIIlllIlIllllII = lIlIlIllIlIl[0];
                0;
                if (1 > 0) break;
                return null;
            }
            case 2332679: {
                if (!aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIllllIl.equals(lIlIlIlIllII[lIlIlIllIlIl[14]]) ? 1 : 0)) break;
                lllllllllllllllIllIIlllIlIllllII = lIlIlIllIlIl[2];
                0;
                if (1 == 1) break;
                return null;
            }
            case -1691410980: {
                if (!aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIllllIl.equals(lIlIlIlIllII[lIlIlIllIlIl[15]]) ? 1 : 0)) break;
                lllllllllllllllIllIIlllIlIllllII = lIlIlIllIlIl[4];
                0;
                if (null == null) break;
                return null;
            }
            case 77974012: {
                if (!aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIllllIl.equals(lIlIlIlIllII[lIlIlIllIlIl[10]]) ? 1 : 0)) break;
                lllllllllllllllIllIIlllIlIllllII = lIlIlIllIlIl[5];
            }
        }
        switch (lllllllllllllllIllIIlllIlIllllII) {
            case 0: {
                if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIllIIIIII.dC().contains((Locatable)lllllllllllllllIllIIlllIllIIIIII.bS) ? 1 : 0)) {
                    return lllllllllllllllIllIIlllIllIIIIII.dB().toWorldPointList();
                }
                List lllllllllllllllIllIIlllIlIlllIll = lllllllllllllllIllIIlllIllIIIIII.dD().toWorldPointList();
                List lllllllllllllllIllIIlllIlIlllIlI = lllllllllllllllIllIIlllIllIIIIII.dB().toWorldPointList();
                lllllllllllllllIllIIlllIlIlllIll.addAll(lllllllllllllllIllIIlllIlIlllIlI);
                0;
                return lllllllllllllllIllIIlllIlIlllIll;
            }
            case 1: {
                if (aR.llIllllIlIllll(n2)) {
                    return lllllllllllllllIllIIlllIllIIIIII.dC().toWorldPointList();
                }
                return lllllllllllllllIllIIlllIllIIIIII.dE().toWorldPointList();
            }
            case 2: {
                if (aR.llIllllIllIIII(n2)) {
                    return lllllllllllllllIllIIlllIllIIIIII.dB().toWorldPointList();
                }
                return lllllllllllllllIllIIlllIllIIIIII.dD().toWorldPointList();
            }
            case 3: {
                if (aR.llIllllIllIIII(n2)) {
                    return lllllllllllllllIllIIlllIllIIIIII.dC().toWorldPointList();
                }
                return lllllllllllllllIllIIlllIllIIIIII.dE().toWorldPointList();
            }
        }
        System.out.println("Direction:" + string);
        System.out.println(lIlIlIlIllII[lIlIlIllIlIl[16]]);
        return null;
    }

    private static boolean llIllllIllIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllllIllIIII(int n2) {
        return n2 == 0;
    }

    protected boolean dv() {
        boolean bl2;
        if ((!aR.llIllllIllIIII(this.ed.at() ? 1 : 0) || aR.llIllllIlIllll(this.ea.z().aL() ? 1 : 0)) && aR.llIllllIllIIlI(Combat.getSpecEnergy(), lIlIlIllIlIl[6])) {
            bl2 = lIlIlIllIlIl[2];
            0;
            if (3 <= 1) {
                return ((25 + 125 - 75 + 69 ^ 4 + 41 - -131 + 18) & (218 + 183 - 225 + 44 ^ 86 + 95 - 66 + 27 ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIlIllIlIl[0];
        }
        return bl2;
    }

    protected WorldPoint dO() {
        return this.dx().dx(lIlIlIllIlIl[22]).dy(lIlIlIllIlIl[18]);
    }

    private static boolean llIllllIlIllll(int n2) {
        return n2 != 0;
    }

    public abstract List<Prayer> ci();

    protected boolean ds() {
        aR lllllllllllllllIllIIlllIllIlIIll;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aR.llIllllIlIllll(nPC.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[29]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlIl[2]];
                stringArray[aR.lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[30]];
                if (aR.llIllllIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && aR.llIllllIllIIII(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlIlIllIlIl[2];
                    0;
                    if (-3 < 0) return n2 != 0;
                    return ((0x52 ^ 6) & ~(0xE7 ^ 0xB3)) != 0;
                }
            }
            n2 = lIlIlIllIlIl[0];
            return n2 != 0;
        });
        if (aR.llIllllIllIIIl(nPC2)) {
            return lIlIlIllIlIl[0];
        }
        if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIllIlIIll.ed.at() ? 1 : 0)) {
            boolean bl2;
            if (!aR.llIllllIllIlIl(lllllllllllllllIllIIlllIllIlIIll.ed.aG(), lllllllllllllllIllIIlllIllIlIIll.dV()) || !aR.llIllllIllIllI(lllllllllllllllIllIIlllIllIlIIll.ed.aG(), lIlIlIllIlIl[3]) || aR.llIllllIllIlll(lllllllllllllllIllIIlllIllIlIIll.ed.aH(), lllllllllllllllIllIIlllIllIlIIll.dU()) && aR.llIllllIllIllI(lllllllllllllllIllIIlllIllIlIIll.ed.aH(), lIlIlIllIlIl[3])) {
                bl2 = lIlIlIllIlIl[2];
                0;
                if (((0x40 ^ 1) & ~(0x1F ^ 0x5E)) >= (0x1F ^ 0x1B)) {
                    return ((0xFE ^ 0xB3) & ~(0x34 ^ 0x79)) != 0;
                }
            } else {
                bl2 = lIlIlIllIlIl[0];
            }
            return bl2;
        }
        return lIlIlIllIlIl[2];
    }

    /*
     * WARNING - void declaration
     */
    protected WorldPoint dK() {
        void var1_1;
        aR lllllllllllllllIllIIlllIlIlIIlll;
        int lllllllllllllllIllIIlllIlIlIIllI;
        int n2;
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            n2 = lIlIlIllIlIl[2];
            0;
            if (((0x43 ^ 0x52 ^ (0x88 ^ 0xA6)) & (0 ^ 0x2D ^ (0xB4 ^ 0xA6) ^ -1)) != 0) {
                return null;
            }
        } else {
            n2 = lllllllllllllllIllIIlllIlIlIIllI = lIlIlIllIlIl[3];
        }
        if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIlIIlll.dG() ? 1 : 0)) {
            return lllllllllllllllIllIIlllIlIlIIlll.dJ().dx(lllllllllllllllIllIIlllIlIlIIllI * lIlIlIllIlIl[0]).dy(lllllllllllllllIllIIlllIlIlIIllI * lIlIlIllIlIl[1]);
        }
        return this.dJ().dx((int)(var1_1 * lIlIlIllIlIl[0])).dy((int)(var1_1 * lIlIlIllIlIl[7]));
    }

    /*
     * WARNING - void declaration
     */
    protected String k(boolean bl2) {
        void lllllllllllllllIllIIlllIlIlIllIl;
        aR lllllllllllllllIllIIlllIlIlIlllI;
        if (aR.llIllllIllIIIl(this.ed.ax())) {
            return null;
        }
        int n2 = lllllllllllllllIllIIlllIlIlIlllI.dG();
        if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIlIlllI.dB().contains((Locatable)lllllllllllllllIllIIlllIlIlIlllI.bS) ? 1 : 0)) {
            if (aR.llIllllIlIllll(n2)) {
                return lIlIlIlIllII[lIlIlIllIlIl[12]];
            }
            return lIlIlIlIllII[lIlIlIllIlIl[17]];
        }
        if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIlIlllI.dD().contains((Locatable)lllllllllllllllIllIIlllIlIlIlllI.bS) ? 1 : 0)) {
            if (aR.llIllllIllIIII(n2)) {
                return lIlIlIlIllII[lIlIlIllIlIl[18]];
            }
            return lIlIlIlIllII[lIlIlIllIlIl[19]];
        }
        if (aR.llIllllIlIllll((int)lllllllllllllllIllIIlllIlIlIllIl)) {
            if (aR.llIllllIlIllll(n2) && aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIlIlllI.dC().contains((Locatable)lllllllllllllllIllIIlllIlIlIlllI.bS) ? 1 : 0)) {
                return lIlIlIlIllII[lIlIlIllIlIl[20]];
            }
            if (aR.llIllllIllIIII(n2) && aR.llIllllIlIllll(lllllllllllllllIllIIlllIlIlIlllI.dE().contains((Locatable)lllllllllllllllIllIIlllIlIlIlllI.bS) ? 1 : 0)) {
                return lIlIlIlIllII[lIlIlIllIlIl[11]];
            }
        }
        return lIlIlIlIllII[lIlIlIllIlIl[21]];
    }

    private static boolean llIllllIllIIll(Object object, Object object2) {
        return object == object2;
    }

    protected boolean ct() {
        boolean bl2;
        aR lllllllllllllllIllIIlllIllIllIlI;
        if (aR.llIllllIllIIll((Object)u.bh(), (Object)w.GET_OUT)) {
            return lIlIlIllIlIl[0];
        }
        TileObject lllllllllllllllIllIIlllIllIllIIl = lllllllllllllllIllIIlllIllIllIlI.dq();
        if (aR.llIllllIllIIIl(lllllllllllllllIllIIlllIllIllIIl)) {
            return lIlIlIllIlIl[0];
        }
        Player lllllllllllllllIllIIlllIllIllIII = Players.getLocal();
        if (aR.llIllllIllIIIl(lllllllllllllllIllIIlllIllIllIII)) {
            return lIlIlIllIlIl[0];
        }
        if (aR.llIllllIllIlII(lllllllllllllllIllIIlllIllIllIII.getWorldY(), lllllllllllllllIllIIlllIllIllIIl.getWorldY())) {
            bl2 = lIlIlIllIlIl[2];
            0;
            if (null != null) {
                return ((0xF6 ^ 0xBC ^ (0xAC ^ 0xB0)) & (0x20 ^ 0x1F ^ (0xD9 ^ 0xB0) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIlIllIlIl[0];
        }
        return bl2;
    }

    protected WorldArea dF() {
        return new WorldArea(this.dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[10]), lIlIlIllIlIl[10], lIlIlIllIlIl[4]);
    }

    protected WorldPoint dJ() {
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            return this.dO();
        }
        return this.dM();
    }

    protected WorldPoint dM() {
        return this.dx().dx(lIlIlIllIlIl[1]).dy(lIlIlIllIlIl[14]);
    }

    protected boolean du() {
        aR lllllllllllllllIllIIlllIllIIllIl;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aR.llIllllIlIllll(nPC.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[25]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlIl[2]];
                stringArray[aR.lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[26]];
                if (aR.llIllllIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && aR.llIllllIllIIII(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlIlIllIlIl[2];
                    0;
                    if (1 <= 2) return n2 != 0;
                    return ((100 + 59 - 123 + 163 ^ 40 + 156 - 22 + 18) & (0xF4 ^ 0xAF ^ (0x19 ^ 0x45) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIllIlIl[0];
            return n2 != 0;
        });
        if (aR.llIllllIllIIIl(nPC2)) {
            return lIlIlIllIlIl[0];
        }
        if (aR.llIllllIlIllll(lllllllllllllllIllIIlllIllIIllIl.ed.at() ? 1 : 0)) {
            int n2;
            if (aR.llIllllIllIlll(lllllllllllllllIllIIlllIllIIllIl.ed.aH(), lllllllllllllllIllIIlllIllIIllIl.dU()) && aR.llIllllIllIllI(lllllllllllllllIllIIlllIllIIllIl.ed.aH(), lIlIlIllIlIl[3])) {
                boolean bl2;
                if (aR.llIllllIllIIII(lllllllllllllllIllIIlllIllIIllIl.ed.aG())) {
                    bl2 = lIlIlIllIlIl[2];
                    0;
                    if ((0x82 ^ 0xBE ^ (0xB6 ^ 0x8E)) < ((149 + 4 - 68 + 163 ^ 80 + 21 - 41 + 121) & (0x55 ^ 0x1B ^ 3 ^ -1))) {
                        return ((0x48 ^ 0x3C ^ (7 ^ 0x6E)) & (18 + 113 - 13 + 48 ^ 63 + 5 - 56 + 175 ^ -1)) != 0;
                    }
                } else {
                    bl2 = lIlIlIllIlIl[0];
                }
                return bl2;
            }
            if (aR.llIllllIllIllI(lllllllllllllllIllIIlllIllIIllIl.ed.aG(), lIlIlIllIlIl[3]) && aR.llIllllIllIlIl(lllllllllllllllIllIIlllIllIIllIl.ed.aG(), lllllllllllllllIllIIlllIllIIllIl.dV())) {
                n2 = lIlIlIllIlIl[2];
                0;
                if (-1 == 1) {
                    return ((0x1E ^ 0x24 ^ (0x47 ^ 0x66)) & (0x3E ^ 1 ^ (0xA8 ^ 0x8C) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIllIlIl[0];
            }
            return n2 != 0;
        }
        return lIlIlIllIlIl[2];
    }

    protected WorldPoint dN() {
        return this.dx().dx(lIlIlIllIlIl[1]).dy(lIlIlIllIlIl[7]);
    }

    protected boolean dI() {
        if (aR.llIllllIlIllll(this.dH().contains(this.bS.getWorldLocation()) ? 1 : 0) && aR.llIllllIlllIII(this.ed.az(), lIlIlIllIlIl[2])) {
            return lIlIlIllIlIl[2];
        }
        return lIlIlIllIlIl[0];
    }

    private static boolean llIllllIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    protected WorldArea dR() {
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            return this.dB();
        }
        return this.dD();
    }

    protected WorldPoint dz() {
        return this.dx().dx(lIlIlIllIlIl[8]);
    }

    protected WorldArea dQ() {
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            return this.dC();
        }
        return this.dE();
    }

    protected WorldArea dT() {
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            return this.dD();
        }
        return this.dB();
    }

    private static void llIllllIlIllIl() {
        lIlIlIlIllII = new String[lIlIlIllIlIl[35]];
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[0]] = aR."cant find desired npc";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[2]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[4]] = aR."cant find desired npc";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[5]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[1]] = aR."cant find desired npc";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[7]] = aR."Attacking right claw";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[8]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[13]] = aR."MIDDLE";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[14]] = aR."LEFT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[15]] = aR."MIDDLE_MAGE";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[10]] = aR."RIGHT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[16]] = aR."SOMETHING WENT WRONG!!!";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[12]] = aR."RIGHT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[17]] = aR."LEFT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[18]] = aR."RIGHT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[19]] = aR."LEFT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[20]] = aR."RIGHT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[11]] = aR."RIGHT";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[21]] = aR."MIDDLE";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[23]] = aR."Right claw";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[24]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[25]] = aR."Right claw";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[26]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[27]] = aR."Left claw";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[28]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[29]] = aR."Left claw";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[30]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[31]] = aR."Great Olm";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[32]] = aR."Attack";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[33]] = aR."Mystical barrier";
        aR.lIlIlIlIllII[aR.lIlIlIllIlIl[34]] = aR."Quick-pass";
    }

    protected WorldArea dD() {
        return new WorldArea(this.dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[11]), lIlIlIllIlIl[10], lIlIlIllIlIl[7]);
    }

    private static boolean llIllllIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        aR lllllllllllllllIllIIlllIlllIIIlI;
        if (aR.llIllllIlIllll(this.eb.pause() ? 1 : 0)) {
            return lIlIlIllIlIl[0];
        }
        if (aR.llIllllIllIIII(lllllllllllllllIllIIlllIlllIIIlI.ec.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIllIlIl[0];
        }
        lllllllllllllllIllIIlllIlllIIIlI.bS = Players.getLocal();
        if (aR.llIllllIllIIIl(lllllllllllllllIllIIlllIlllIIIlI.bS)) {
            return lIlIlIllIlIl[0];
        }
        if (!aR.llIllllIllIIlI(u.bg(), lIlIlIllIlIl[1]) || aR.llIllllIlIllll(lllllllllllllllIllIIlllIlllIIIlI.bS.getPlane())) {
            return lIlIlIllIlIl[0];
        }
        return this.cg();
    }

    protected int dU() {
        return this.eb.mageThreshold();
    }

    protected boolean dw() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aR.llIllllIlIllll(nPC.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[23]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlIl[2]];
                stringArray[aR.lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[24]];
                if (aR.llIllllIlIllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIllIlIl[2];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x36 ^ 0x25 ^ (0x6E ^ 0x61)) & (88 + 71 - 34 + 9 ^ 108 + 136 - 194 + 104 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIllIlIl[0];
            return n2 != 0;
        });
        if (aR.llIllllIllIIIl(nPC2)) {
            System.out.println(lIlIlIlIllII[lIlIlIllIlIl[1]]);
            return lIlIlIllIlIl[0];
        }
        System.out.println(lIlIlIlIllII[lIlIlIllIlIl[7]]);
        nPC2.interact(lIlIlIlIllII[lIlIlIllIlIl[8]]);
        return lIlIlIllIlIl[2];
    }

    protected WorldPoint dy() {
        return this.dx().dx(lIlIlIllIlIl[8]);
    }

    static {
        aR.llIllllIlIlllI();
        aR.llIllllIlIllIl();
    }

    protected WorldArea dB() {
        return new WorldArea(this.dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[2]), lIlIlIllIlIl[10], lIlIlIllIlIl[7]);
    }

    public abstract EquipmentSetup cj();

    private static void llIllllIlIlllI() {
        lIlIlIllIlIl = new int[36];
        aR.lIlIlIllIlIl[0] = (0x71 ^ 0x64 ^ (0xB2 ^ 0xBC)) & (197 + 170 - 152 + 7 ^ 39 + 19 - 2 + 141 ^ -1);
        aR.lIlIlIllIlIl[1] = 51 + 53 - 4 + 30 ^ 29 + 66 - -14 + 25;
        aR.lIlIlIllIlIl[2] = 1;
        aR.lIlIlIllIlIl[3] = -1;
        aR.lIlIlIllIlIl[4] = 2;
        aR.lIlIlIllIlIl[5] = 3;
        aR.lIlIlIllIlIl[6] = 132 + 7 - 27 + 32 ^ 126 + 156 - 225 + 105;
        aR.lIlIlIllIlIl[7] = 0xB ^ 0xE;
        aR.lIlIlIllIlIl[8] = 121 + 167 - 120 + 29 ^ 191 + 17 - 44 + 31;
        aR.lIlIlIllIlIl[9] = -(0x11 ^ 0x15);
        aR.lIlIlIllIlIl[10] = (0x8A ^ 0x83) & ~(0x61 ^ 0x68) ^ (0x8D ^ 0x87);
        aR.lIlIlIllIlIl[11] = 0xA4 ^ 0xB5;
        aR.lIlIlIllIlIl[12] = 4 ^ 8;
        aR.lIlIlIllIlIl[13] = 0x72 ^ 0x75;
        aR.lIlIlIllIlIl[14] = 0x5C ^ 0x54;
        aR.lIlIlIllIlIl[15] = 75 + 50 - 101 + 183 ^ 112 + 197 - 151 + 40;
        aR.lIlIlIllIlIl[16] = 0xA6 ^ 0xAD;
        aR.lIlIlIllIlIl[17] = 0x75 ^ 0x78;
        aR.lIlIlIllIlIl[18] = 0x74 ^ 0x7A;
        aR.lIlIlIllIlIl[19] = 0xC9 ^ 0xAD ^ (0x69 ^ 2);
        aR.lIlIlIllIlIl[20] = 0x6B ^ 0x7B;
        aR.lIlIlIllIlIl[21] = 9 + 7 - -114 + 28 ^ 105 + 53 - 126 + 108;
        aR.lIlIlIllIlIl[22] = -3;
        aR.lIlIlIllIlIl[23] = 0x8B ^ 0x98;
        aR.lIlIlIllIlIl[24] = 0x5D ^ 0x49;
        aR.lIlIlIllIlIl[25] = 0xB5 ^ 0xA0;
        aR.lIlIlIllIlIl[26] = 0x9B ^ 0x8D;
        aR.lIlIlIllIlIl[27] = 0x6C ^ 0x7B;
        aR.lIlIlIllIlIl[28] = 0x1C ^ 4;
        aR.lIlIlIllIlIl[29] = 0xDF ^ 0xA1 ^ (0x42 ^ 0x25);
        aR.lIlIlIllIlIl[30] = 0x93 ^ 0x89;
        aR.lIlIlIllIlIl[31] = 0xB0 ^ 0xAB;
        aR.lIlIlIllIlIl[32] = 0xB7 ^ 0xAB;
        aR.lIlIlIllIlIl[33] = 0x6F ^ 0x72;
        aR.lIlIlIllIlIl[34] = 0xC3 ^ 0x9C ^ (0xF6 ^ 0xB7);
        aR.lIlIlIllIlIl[35] = 0xE ^ 0x11;
    }

    private static String llIllllIIlIlIl(String lllllllllllllllIllIIlllIIllllllI, String lllllllllllllllIllIIlllIlIIIIIlI) {
        lllllllllllllllIllIIlllIIllllllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlllIlIIIIIIl = new StringBuilder();
        char[] lllllllllllllllIllIIlllIlIIIIIII = lllllllllllllllIllIIlllIlIIIIIlI.toCharArray();
        int lllllllllllllllIllIIlllIIlllllll = lIlIlIllIlIl[0];
        char[] lllllllllllllllIllIIlllIIllllIIl = lllllllllllllllIllIIlllIIllllllI.toCharArray();
        int lllllllllllllllIllIIlllIIllllIII = lllllllllllllllIllIIlllIIllllIIl.length;
        int lllllllllllllllIllIIlllIIlllIlll = lIlIlIllIlIl[0];
        while (aR.llIllllIllIlll(lllllllllllllllIllIIlllIIlllIlll, lllllllllllllllIllIIlllIIllllIII)) {
            char lllllllllllllllIllIIlllIlIIIIlII = lllllllllllllllIllIIlllIIllllIIl[lllllllllllllllIllIIlllIIlllIlll];
            lllllllllllllllIllIIlllIlIIIIIIl.append((char)(lllllllllllllllIllIIlllIlIIIIlII ^ lllllllllllllllIllIIlllIlIIIIIII[lllllllllllllllIllIIlllIIlllllll % lllllllllllllllIllIIlllIlIIIIIII.length]));
            0;
            ++lllllllllllllllIllIIlllIIlllllll;
            ++lllllllllllllllIllIIlllIIlllIlll;
            0;
            if (3 != ((0x1C ^ 0x4A ^ (0xF7 ^ 0xC0)) & (107 + 118 - 152 + 164 ^ 126 + 125 - 206 + 95 ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIlllIlIIIIIIl);
    }

    protected TileObject dq() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aR.llIllllIlIllll(tileObject.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[33]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlIl[2]];
                stringArray[aR.lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[34]];
                if (aR.llIllllIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIllIlIl[2];
                    0;
                    if (-1 >= -1) return n2 != 0;
                    return ((156 + 2 - -36 + 55 ^ 123 + 33 - 39 + 64) & (0x19 ^ 0x5F ^ (0xAD ^ 0xA7) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIllIlIl[0];
            return n2 != 0;
        });
    }

    protected boolean dr() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aR.llIllllIlIllll(nPC.getName().equals(lIlIlIlIllII[lIlIlIllIlIl[31]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlIl[2]];
                stringArray[aR.lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[32]];
                if (aR.llIllllIlIllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIllIlIl[2];
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return ((0xE1 ^ 0xAB ^ (1 ^ 0x18)) & (0x6B ^ 0x29 ^ (0x63 ^ 0x72) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIllIlIl[0];
            return n2 != 0;
        });
        if (aR.llIllllIllIIIl(nPC2)) {
            System.out.println(lIlIlIlIllII[lIlIlIllIlIl[0]]);
            return lIlIlIllIlIl[0];
        }
        nPC2.interact(lIlIlIlIllII[lIlIlIllIlIl[2]]);
        return lIlIlIllIlIl[2];
    }

    protected WorldPoint dx() {
        return this.dq().getWorldLocation();
    }

    protected WorldPoint dA() {
        return this.dx().dx(lIlIlIllIlIl[8]);
    }

    protected WorldArea dE() {
        return new WorldArea(this.dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[12]), lIlIlIllIlIl[10], lIlIlIllIlIl[10]);
    }

    private static String llIllllIIlIllI(String lllllllllllllllIllIIlllIIlIlllll, String lllllllllllllllIllIIlllIIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIllIlIl[14]), "DES");
            Cipher lllllllllllllllIllIIlllIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIlllIIllIIIll.init(lIlIlIllIlIl[4], lllllllllllllllIllIIlllIIllIIlII);
            return new String(lllllllllllllllIllIIlllIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlllIIllIIIlI) {
            lllllllllllllllIllIIlllIIllIIIlI.printStackTrace();
            return null;
        }
    }

    protected WorldPoint dL() {
        int n2;
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            n2 = lIlIlIllIlIl[2];
            0;
            if (3 < 0) {
                return null;
            }
        } else {
            n2 = lIlIlIllIlIl[3];
        }
        int n3 = n2;
        return this.dJ().dx(n3 * lIlIlIllIlIl[0]).dy(n3 * lIlIlIllIlIl[5]);
    }

    protected WorldArea dS() {
        if (aR.llIllllIlIllll(this.dG() ? 1 : 0)) {
            return this.dE();
        }
        return this.dC();
    }

    private static boolean llIllllIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIllllIIlIlII(String lllllllllllllllIllIIlllIIllIlllI, String lllllllllllllllIllIIlllIIllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlllIIlllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlllIIlllIIII.init(lIlIlIllIlIl[4], lllllllllllllllIllIIlllIIlllIIIl);
            return new String(lllllllllllllllIllIIlllIIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlllIIllIllll) {
            lllllllllllllllIllIIlllIIllIllll.printStackTrace();
            return null;
        }
    }

    protected int dV() {
        return this.eb.meleeThreshold();
    }

    protected boolean dG() {
        boolean bl2;
        if (aR.llIllllIllIlll(this.ed.ax().getWorldX(), this.bS.getWorldX())) {
            bl2 = lIlIlIllIlIl[2];
            0;
            if ((0x17 ^ 0xC ^ (0x94 ^ 0x8B)) < (0xDF ^ 0xB5 ^ (0x38 ^ 0x56))) {
                return ((0x8C ^ 0x9E ^ (0x89 ^ 0xA9)) & (118 + 68 - 56 + 60 ^ 124 + 121 - 162 + 57 ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIlIllIlIl[0];
        }
        return bl2;
    }

    protected List<WorldPoint> dH() {
        if (aR.llIllllIllIIIl(this.ed.ax())) {
            return null;
        }
        String string = this.ed.am();
        return this.l(string);
    }

    protected WorldPoint dP() {
        return this.dx().dx(lIlIlIllIlIl[22]).dy(lIlIlIllIlIl[11]);
    }

    private static boolean llIllllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean llIllllIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }
}

