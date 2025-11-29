/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.H;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Vespula", priority=10000, blocking=true)
public class aH
extends U {
    private /* synthetic */ n al;
    private /* synthetic */ n ak;
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIIIllllll;
    private /* synthetic */ int dX;
    private final /* synthetic */ int dY = 5417;
    private static /* synthetic */ String[] lIlIIIlllllI;

    private boolean dm() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aH.llIlIllllIlIIl(tileObject.getName().toLowerCase().contains(lIlIIIlllllI[lIlIIIllllll[11]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllllll[2]];
                stringArray[aH.lIlIIIllllll[4]] = lIlIIIlllllI[lIlIIIllllll[12]];
                if (aH.llIlIllllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIllllll[2];
                    0;
                    if (-(0x67 ^ 0x57 ^ (0x47 ^ 0x73)) <= 0) return n2 != 0;
                    return ((0x17 ^ 0xA ^ (0x76 ^ 0x2D)) & (7 ^ 0x1A ^ (0x79 ^ 0x22) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIllllll[4];
            return n2 != 0;
        });
        if (aH.llIlIllllIlIII(tileObject2)) {
            System.out.println(lIlIIIlllllI[lIlIIIllllll[8]]);
            return lIlIIIllllll[4];
        }
        if (aH.llIlIllllIlIIl(Dialog.isViewingOptions() ? 1 : 0) && aH.llIlIllllIlIIl(Dialog.getName().contains(lIlIIIlllllI[lIlIIIllllll[9]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIllllll[2]];
            stringArray[aH.lIlIIIllllll[4]] = lIlIIIlllllI[lIlIIIllllll[10]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIlIIIllllll[2];
        }
        Game.logout();
        return lIlIIIllllll[2];
    }

    @Inject
    protected aH(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIllllll[0];
        this.dX = lIlIIIllllll[0];
        this.dY = lIlIIIllllll[1];
    }

    static {
        aH.llIlIllllIIlll();
        aH.llIlIllllIIllI();
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aH.llIlIllllIllII((Object)this.ak.bw, (Object)N.VESPULA)) {
            bl2 = lIlIIIllllll[2];
            0;
            if ((0x4D ^ 0x49) == ((0xBF ^ 0x98) & ~(0x1A ^ 0x3D))) {
                return (3 & ~3) != 0;
            }
        } else {
            bl2 = lIlIIIllllll[4];
        }
        return bl2;
    }

    public void db() {
        if (aH.llIlIllllIlIIl(this.cj().isFullyEquipped() ? 1 : 0) && aH.llIlIllllIllll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH) && aH.llIlIllllIlIIl(Equipment.contains(item -> {
            int n2;
            if (!aH.llIlIllllIlllI(item.getName().toLowerCase().contains(lIlIIIlllllI[lIlIIIllllll[17]]) ? 1 : 0) || aH.llIlIllllIlIIl(item.getName().toLowerCase().contains(lIlIIIlllllI[lIlIIIllllll[18]]) ? 1 : 0)) {
                n2 = lIlIIIllllll[2];
                0;
                if (2 < 1) {
                    return ((0x57 ^ 0x4F) & ~(0xAC ^ 0xB4)) != 0;
                }
            } else {
                n2 = lIlIIIllllll[4];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean llIlIllllIlIII(Object object) {
        return object == null;
    }

    private static void llIlIllllIIlll() {
        lIlIIIllllll = new int[24];
        aH.lIlIIIllllll[0] = -1;
        aH.lIlIIIllllll[1] = -(0xFFFFDBFB & 0x6C17) & (0xFFFFDF3F & 0x7DFB);
        aH.lIlIIIllllll[2] = 1;
        aH.lIlIIIllllll[3] = 2;
        aH.lIlIIIllllll[4] = (0x73 ^ 0x3D ^ (0x6C ^ 0x62)) & (0xF7 ^ 0xAC ^ (0xDE ^ 0xC5) ^ -1);
        aH.lIlIIIllllll[5] = 0x7B ^ 0x6B;
        aH.lIlIIIllllll[6] = 3;
        aH.lIlIIIllllll[7] = 0xA ^ 0x24 ^ (0x41 ^ 0x6B);
        aH.lIlIIIllllll[8] = 0x3B ^ 0x3E;
        aH.lIlIIIllllll[9] = 0x58 ^ 0x7A ^ (0xBA ^ 0x9E);
        aH.lIlIIIllllll[10] = 103 + 110 - 198 + 145 ^ 89 + 158 - 96 + 16;
        aH.lIlIIIllllll[11] = 0x29 ^ 0x4E ^ (0xDC ^ 0xB3);
        aH.lIlIIIllllll[12] = 0x10 ^ 0x19;
        aH.lIlIIIllllll[13] = 0x5F ^ 0x55;
        aH.lIlIIIllllll[14] = 5 + 184 - 151 + 165 ^ 121 + 126 - 182 + 127;
        aH.lIlIIIllllll[15] = 133 + 5 - 54 + 60 ^ 27 + 125 - 42 + 46;
        aH.lIlIIIllllll[16] = 64 + 37 - -18 + 65 ^ 11 + 1 - -150 + 19;
        aH.lIlIIIllllll[17] = 0x1F ^ 0x38 ^ (0x34 ^ 0x1D);
        aH.lIlIIIllllll[18] = 7 + 71 - -61 + 51 ^ 54 + 27 - 77 + 173;
        aH.lIlIIIllllll[19] = 0xA2 ^ 0xB3;
        aH.lIlIIIllllll[20] = 0x72 ^ 0x60;
        aH.lIlIIIllllll[21] = 8 ^ 0x1B;
        aH.lIlIIIllllll[22] = 0xB9 ^ 0xAD;
        aH.lIlIIIllllll[23] = 0x3F ^ 0x2A;
    }

    private static void llIlIllllIIllI() {
        lIlIIIlllllI = new String[lIlIIIllllll[23]];
        aH.lIlIIIlllllI[aH.lIlIIIllllll[4]] = aH."Attack";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[2]] = aH."updating last safe!";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[3]] = aH."Enter";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[6]] = aH."Drink";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[7]] = aH."Take";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[8]] = aH."tendrils is null";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[9]] = aH."Are you sure you wish to log out?";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[10]] = aH."Yes.";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[11]] = aH."tendrils";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[12]] = aH."Pass";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[13]] = aH."Revitalisation";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[14]] = aH."Revitalisation";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[15]] = aH."Xeric's";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[16]] = aH."Prayer enhance";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[17]] = aH."trident";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[18]] = aH."sanguinesti";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[5]] = aH."Passage";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[19]] = aH."Enter";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[20]] = aH."Vespula";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[21]] = aH."Abyssal portal";
        aH.lIlIIIlllllI[aH.lIlIIIllllll[22]] = aH."Vespula";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_3;
        aH lllllllllllllllIllIllllIIIIIIlII;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aH.llIlIllllIlIIl(nPC.getName().contains(lIlIIIlllllI[lIlIIIllllll[22]]) ? 1 : 0) && aH.llIlIllllIlIIl(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIIllllll[2];
                0;
                if (1 == ((0xF ^ 0x53) & ~(0x1A ^ 0x46))) {
                    return ((0xB9 ^ 0x8F) & ~(0xF6 ^ 0xC0)) != 0;
                }
            } else {
                n2 = lIlIIIllllll[4];
            }
            return n2 != 0;
        });
        NPC nPC3 = NPCs.getNearest(nPC -> {
            int n2;
            if (aH.llIlIllllIlIIl(nPC.getName().contains(lIlIIIlllllI[lIlIIIllllll[21]]) ? 1 : 0) && aH.llIlIllllIlIIl(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIIllllll[2];
                0;
                if (null != null) {
                    return ((0x3E ^ 0x15) & ~(0xBB ^ 0x90)) != 0;
                }
            } else {
                n2 = lIlIIIllllll[4];
            }
            return n2 != 0;
        });
        if (aH.llIlIllllIlIII(nPC3) && aH.llIlIllllIlIII(nPC2)) {
            if (aH.llIlIllllIlIIl(this.cU() ? 1 : 0)) {
                return lIlIIIllllll[2];
            }
            return lllllllllllllllIllIllllIIIIIIlII.cS();
        }
        if (aH.llIlIllllIlIlI(lllllllllllllllIllIllllIIIIIIlII.bS.distanceTo(lllllllllllllllIllIllllIIIIIIlII.ak.bs), lIlIIIllllll[2]) && aH.llIlIllllIlIIl(lllllllllllllllIllIllllIIIIIIlII.dm() ? 1 : 0)) {
            return lIlIIIllllll[2];
        }
        lllllllllllllllIllIllllIIIIIIlII.dl();
        0;
        lllllllllllllllIllIllllIIIIIIlII.db();
        if (aH.llIlIllllIlIlI(lllllllllllllllIllIllllIIIIIIlII.cq.getTickCount() - lllllllllllllllIllIllllIIIIIIlII.dX, lIlIIIllllll[3]) && aH.llIlIllllIlIll(Prayers.getPoints())) {
            void lllllllllllllllIllIllllIIIIIIIlI;
            if (aH.llIlIllllIlIII(lllllllllllllllIllIllllIIIIIIIlI)) {
                return lIlIIIllllll[4];
            }
            lllllllllllllllIllIllllIIIIIIIlI.interact(lIlIIIlllllI[lIlIIIllllll[4]]);
            return lIlIIIllllll[2];
        }
        WorldPoint lllllllllllllllIllIllllIIIIIIIIl = H.VESPULA_ATTACK_POINT.c(lllllllllllllllIllIllllIIIIIIlII.ak);
        if (aH.llIlIllllIlIIl(lllllllllllllllIllIllllIIIIIIlII.bS.getWorldLocation().equals((Object)lllllllllllllllIllIllllIIIIIIIIl) ? 1 : 0)) {
            System.out.println(lIlIIIlllllI[lIlIIIllllll[2]]);
            lllllllllllllllIllIllllIIIIIIlII.dX = lllllllllllllllIllIllllIIIIIIlII.cq.getTickCount();
            return lIlIIIllllll[2];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return lIlIIIllllll[2];
    }

    private static boolean llIlIllllIlllI(int n2) {
        return n2 == 0;
    }

    @Override
    public List<Prayer> ci() {
        aH lllllllllllllllIllIlllIllllllIIl;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIlllllI[lIlIIIllllll[20]]));
        if (aH.llIlIllllIlIII(nPC2)) {
            return null;
        }
        if (aH.llIlIllllIlIlI(lllllllllllllllIllIlllIllllllIIl.bS.distanceTo(lllllllllllllllIllIlllIllllllIIl.ak.bs), lIlIIIllllll[2])) {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.REDEMPTION;
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private static String llIlIllllIIlII(String lllllllllllllllIllIlllIllIlIlIII, String lllllllllllllllIllIlllIllIlIIlll) {
        lllllllllllllllIllIlllIllIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllIllIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllIllIlIIllI = new StringBuilder();
        char[] lllllllllllllllIllIlllIllIlIIlIl = lllllllllllllllIllIlllIllIlIIlll.toCharArray();
        int lllllllllllllllIllIlllIllIlIIlII = lIlIIIllllll[4];
        char[] lllllllllllllllIllIlllIllIIllllI = lllllllllllllllIllIlllIllIlIlIII.toCharArray();
        int lllllllllllllllIllIlllIllIIlllIl = lllllllllllllllIllIlllIllIIllllI.length;
        int lllllllllllllllIllIlllIllIIlllII = lIlIIIllllll[4];
        while (aH.llIlIlllllIIII(lllllllllllllllIllIlllIllIIlllII, lllllllllllllllIllIlllIllIIlllIl)) {
            char lllllllllllllllIllIlllIllIlIlIIl = lllllllllllllllIllIlllIllIIllllI[lllllllllllllllIllIlllIllIIlllII];
            lllllllllllllllIllIlllIllIlIIllI.append((char)(lllllllllllllllIllIlllIllIlIlIIl ^ lllllllllllllllIllIlllIllIlIIlIl[lllllllllllllllIllIlllIllIlIIlII % lllllllllllllllIllIlllIllIlIIlIl.length]));
            0;
            ++lllllllllllllllIllIlllIllIlIIlII;
            ++lllllllllllllllIllIlllIllIIlllII;
            0;
            if (3 > ((0xE4 ^ 0xBF) & ~(0xEE ^ 0xB5))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlllIllIlIIllI);
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aH lllllllllllllllIllIlllIlllllIIlI;
        if (aH.llIlIllllIlIIl(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aH.llIlIllllIllIl(Movement.getDestination()) && aH.llIlIllllIlIIl(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIllllll[4];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIlllllIIlI.al.bs);
            return lIlIIIllllll[2];
        }
        TileObject lllllllllllllllIllIlllIlllllIIIl = lllllllllllllllIllIlllIlllllIIlI.cR();
        if (aH.llIlIllllIlIII(lllllllllllllllIllIlllIlllllIIIl)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIlllllIIlI.ak.bq.dx(lIlIIIllllll[5]).dy(lIlIIIllllll[5]));
            return lIlIIIllllll[2];
        }
        if (!aH.llIlIllllIlllI(lllllllllllllllIllIlllIlllllIIlI.bS.isMoving() ? 1 : 0) || aH.llIlIllllIlIIl(lllllllllllllllIllIlllIlllllIIlI.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIllllll[4];
        }
        var1_1.interact(lIlIIIlllllI[lIlIIIllllll[3]]);
        return lIlIIIllllll[2];
    }

    private static boolean llIlIllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllllIlIll(int n2) {
        return n2 > 0;
    }

    private boolean dl() {
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[16]]));
        if (aH.llIlIllllIlIII(item2)) {
            return lIlIIIllllll[4];
        }
        int lllllllllllllllIllIlllIllllIlIll = Static.getClient().getVarbitValue(lIlIIIllllll[1]);
        if (aH.llIlIllllIlIll(lllllllllllllllIllIlllIllllIlIll)) {
            return lIlIIIllllll[4];
        }
        item2.interact(lIlIIIlllllI[lIlIIIllllll[6]]);
        return lIlIIIllllll[2];
    }

    private static boolean llIlIllllIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.VESPULA));
    }

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aH lllllllllllllllIllIlllIllllIlIII;
        if (aH.llIlIllllIlIIl(Inventory.isFull() ? 1 : 0)) {
            return lIlIIIllllll[4];
        }
        TileItem lllllllllllllllIllIlllIllllIIlll = TileItems.getNearest(tileItem -> {
            int n2;
            if (aH.llIlIllllIlIIl(tileItem.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[15]]) ? 1 : 0) && aH.llIlIllllIlIIl(this.ak.a((Locatable)tileItem) ? 1 : 0) && aH.llIlIllllIlIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIIllllll[2];
                0;
                if (3 <= 0) {
                    return ((0x6B ^ 0x4B ^ 3) & (0x77 ^ 0x68 ^ (0x88 ^ 0xB4) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIllllll[4];
            }
            return n2 != 0;
        });
        if (aH.llIlIllllIlllI(Inventory.contains(item -> item.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[14]])) ? 1 : 0)) {
            lllllllllllllllIllIlllIllllIIlll = TileItems.getNearest(tileItem -> {
                int n2;
                if (aH.llIlIllllIlIIl(tileItem.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[13]]) ? 1 : 0) && aH.llIlIllllIlIIl(this.ak.a((Locatable)tileItem) ? 1 : 0) && aH.llIlIllllIlIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    n2 = lIlIIIllllll[2];
                    0;
                    if (((0x49 ^ 0x1D) & ~(0x3F ^ 0x6B)) <= -1) {
                        return ((0x5B ^ 0x55) & ~(0xCB ^ 0xC5)) != 0;
                    }
                } else {
                    n2 = lIlIIIllllll[4];
                }
                return n2 != 0;
            });
        }
        if (aH.llIlIllllIlIII(lllllllllllllllIllIlllIllllIIlll)) {
            return lIlIIIllllll[4];
        }
        var1_1.interact(lIlIIIlllllI[lIlIIIllllll[7]]);
        return lIlIIIllllll[2];
    }

    private static boolean llIlIllllIllII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIllllIIlIl(String lllllllllllllllIllIlllIllIlllIII, String lllllllllllllllIllIlllIllIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIllIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIllllll[11]), "DES");
            Cipher lllllllllllllllIllIlllIllIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIlllIllIlllIlI.init(lIlIIIllllll[3], lllllllllllllllIllIlllIllIlllIll);
            return new String(lllllllllllllllIllIlllIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllIllIlllIIl) {
            lllllllllllllllIllIlllIllIlllIIl.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aH.llIlIllllIlIIl(tileObject.getName().equals(lIlIIIlllllI[lIlIIIllllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllllll[2]];
                stringArray[aH.lIlIIIllllll[4]] = lIlIIIlllllI[lIlIIIllllll[19]];
                if (aH.llIlIllllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aH.llIlIllllIlIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIllllll[2];
                    0;
                    if (((0x16 ^ 0x26) & ~(0x5A ^ 0x6A)) >= 0) return n2 != 0;
                    return ((0x79 ^ 0x51) & ~(0x34 ^ 0x1C)) != 0;
                }
            }
            n2 = lIlIIIllllll[4];
            return n2 != 0;
        });
    }

    private static boolean llIlIllllIllIl(Object object) {
        return object != null;
    }

    private static boolean llIlIllllIllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIllllIIIll(String lllllllllllllllIllIlllIlllIIIIll, String lllllllllllllllIllIlllIlllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIlllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllIlllIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllIlllIIIlll.init(lIlIIIllllll[3], lllllllllllllllIllIlllIlllIIlIII);
            return new String(lllllllllllllllIllIlllIlllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllIlllIIIllI) {
            lllllllllllllllIllIlllIlllIIIllI.printStackTrace();
            return null;
        }
    }
}

