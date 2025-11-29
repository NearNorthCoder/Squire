/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aq;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class L
implements ab {
    public static /* synthetic */ WorldArea gb;
    public static /* synthetic */ WorldArea gd;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint dg;
    static /* synthetic */ int dL;
    public static /* synthetic */ WorldArea gc;
    static /* synthetic */ int[] ge;
    private static /* synthetic */ String[] cG;
    private static /* synthetic */ int[] llIlIIlII;
    static /* synthetic */ int dk;
    public static /* synthetic */ WorldArea ga;
    static /* synthetic */ String h;
    static /* synthetic */ String dc;
    private static /* synthetic */ String[] llIIllIll;

    private static boolean lIllIIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIllIllIIl(String lIIlIlIIIllIlI, String lIIlIlIIIllIIl) {
        try {
            SecretKeySpec lIIlIlIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), llIlIIlII[26]), "DES");
            Cipher lIIlIlIIIlllII = Cipher.getInstance("DES");
            lIIlIlIIIlllII.init(llIlIIlII[5], lIIlIlIIIlllIl);
            return new String(lIIlIlIIIlllII.doFinal(Base64.getDecoder().decode(lIIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIIIllIll) {
            lIIlIlIIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static void cl() {
        block91: {
            WorldPoint lIIlIlllIlllII;
            WorldPoint[] lIIlIlllIlllIl;
            WorldArea lIIlIlllIllllI;
            BankLocation lIIlIlllIlllll;
            block100: {
                block102: {
                    block101: {
                        block92: {
                            block99: {
                                block94: {
                                    block98: {
                                        block97: {
                                            block96: {
                                                block95: {
                                                    block93: {
                                                        if (L.lIllIIllIllI(bv ? 1 : 0)) {
                                                            b.a(bx);
                                                            if (L.lIllIIllIlll(bx.size(), llIlIIlII[0])) {
                                                                System.out.println(llIIllIll[llIlIIlII[1]]);
                                                                bv = llIlIIlII[1];
                                                            }
                                                        }
                                                        if (!L.lIllIIlllIII(bv ? 1 : 0)) break block91;
                                                        if (L.lIllIIllIlll(Skills.getLevel((Skill)Skill.PRAYER), llIlIIlII[2])) {
                                                            dc = llIIllIll[llIlIIlII[0]];
                                                            aq.ea();
                                                        }
                                                        if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.PRAYER), llIlIIlII[2]) && L.lIllIIllIlll(e.j(llIlIIlII[3]), llIlIIlII[4])) {
                                                            dc = llIIllIll[llIlIIlII[5]];
                                                            x.bf();
                                                        }
                                                        if (!L.lIllIIlllIII(L.an() ? 1 : 0) || !L.lIllIIllIlll(e.j(dL), llIlIIlII[0]) || !L.lIllIIlllIIl(e.j(llIlIIlII[3]), llIlIIlII[4]) || !L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.PRAYER), llIlIIlII[2])) break block92;
                                                        dc = llIIllIll[llIlIIlII[6]];
                                                        lIIlIlllIlllll = BankLocation.getNearest();
                                                        if (L.lIllIIlllIlI(lIIlIlllIlllll) && L.lIllIIlllIII(lIIlIlllIlllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                            AccBuilderGWD.c = llIIllIll[llIlIIlII[7]];
                                                            a.a(lIIlIlllIlllll);
                                                        }
                                                        if (!L.lIllIIlllIlI(lIIlIlllIlllll) || !L.lIllIIllIllI(lIIlIlllIlllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block92;
                                                        if (L.lIllIIlllIII(Bank.isOpen() ? 1 : 0)) {
                                                            a.a();
                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlII[8]);
                                                            0;
                                                        }
                                                        if (!L.lIllIIllIllI(Bank.isOpen() ? 1 : 0)) break block92;
                                                        AccBuilderGWD.c = llIIllIll[llIlIIlII[9]];
                                                        if (L.lIllIIlllIll(Inventory.getAll().size())) {
                                                            Bank.depositInventory();
                                                            Time.sleepTicks((int)llIlIIlII[7]);
                                                            0;
                                                        }
                                                        if (L.lIllIIlllIll(Equipment.getAll().size())) {
                                                            Bank.depositEquipment();
                                                            Time.sleepTicks((int)llIlIIlII[5]);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIlIIlII[0]];
                                                        nArray[L.llIlIIlII[1]] = llIlIIlII[10];
                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block93;
                                                        int[] nArray2 = new int[llIlIIlII[0]];
                                                        nArray2[L.llIlIIlII[1]] = llIlIIlII[10];
                                                        if (!L.lIllIIlllIIl(Bank.getFirst((int[])nArray2).getQuantity(), llIlIIlII[11])) break block94;
                                                    }
                                                    int[] nArray = new int[llIlIIlII[0]];
                                                    nArray[L.llIlIIlII[1]] = llIlIIlII[12];
                                                    if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block95;
                                                    int[] nArray3 = new int[llIlIIlII[0]];
                                                    nArray3[L.llIlIIlII[1]] = llIlIIlII[12];
                                                    if (!L.lIllIIlllIIl(Bank.getFirst((int[])nArray3).getQuantity(), llIlIIlII[11])) break block94;
                                                }
                                                int[] nArray = new int[llIlIIlII[0]];
                                                nArray[L.llIlIIlII[1]] = llIlIIlII[13];
                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block96;
                                                int[] nArray4 = new int[llIlIIlII[0]];
                                                nArray4[L.llIlIIlII[1]] = llIlIIlII[13];
                                                if (!L.lIllIIlllIIl(Bank.getFirst((int[])nArray4).getQuantity(), llIlIIlII[11])) break block94;
                                            }
                                            int[] nArray = new int[llIlIIlII[0]];
                                            nArray[L.llIlIIlII[1]] = llIlIIlII[14];
                                            if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block97;
                                            int[] nArray5 = new int[llIlIIlII[0]];
                                            nArray5[L.llIlIIlII[1]] = llIlIIlII[14];
                                            if (!L.lIllIIlllIIl(Bank.getFirst((int[])nArray5).getQuantity(), llIlIIlII[11])) break block94;
                                        }
                                        int[] nArray = new int[llIlIIlII[0]];
                                        nArray[L.llIlIIlII[1]] = llIlIIlII[15];
                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block98;
                                        int[] nArray6 = new int[llIlIIlII[0]];
                                        nArray6[L.llIlIIlII[1]] = llIlIIlII[15];
                                        if (!L.lIllIIlllIIl(Bank.getFirst((int[])nArray6).getQuantity(), llIlIIlII[16])) break block94;
                                    }
                                    int[] nArray = new int[llIlIIlII[0]];
                                    nArray[L.llIlIIlII[1]] = llIlIIlII[17];
                                    if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block99;
                                    int[] nArray7 = new int[llIlIIlII[0]];
                                    nArray7[L.llIlIIlII[1]] = llIlIIlII[17];
                                    if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray7).getQuantity(), llIlIIlII[11])) break block99;
                                }
                                L.Q();
                                System.out.println(llIIllIll[llIlIIlII[18]]);
                                bv = llIlIIlII[0];
                                return;
                            }
                            int[] nArray = new int[llIlIIlII[19]];
                            nArray[L.llIlIIlII[1]] = llIlIIlII[20];
                            nArray[L.llIlIIlII[0]] = llIlIIlII[21];
                            nArray[L.llIlIIlII[5]] = llIlIIlII[22];
                            nArray[L.llIlIIlII[6]] = llIlIIlII[23];
                            nArray[L.llIlIIlII[7]] = llIlIIlII[24];
                            nArray[L.llIlIIlII[9]] = llIlIIlII[15];
                            nArray[L.llIlIIlII[18]] = llIlIIlII[14];
                            nArray[L.llIlIIlII[25]] = llIlIIlII[13];
                            nArray[L.llIlIIlII[26]] = llIlIIlII[17];
                            nArray[L.llIlIIlII[27]] = llIlIIlII[12];
                            if (L.lIllIIlllIII(e.d(nArray) ? 1 : 0)) {
                                L.Q();
                                System.out.println(llIIllIll[llIlIIlII[25]]);
                                bv = llIlIIlII[0];
                                return;
                            }
                            while (L.lIllIIlllIII(H.bT() ? 1 : 0)) {
                                H.bR();
                                Time.sleepTicks((int)llIlIIlII[0]);
                                0;
                                0;
                                
                                return;
                            }
                            if (L.lIllIIlllIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)llIlIIlII[18]);
                                0;
                            }
                            if (L.lIllIIllIllI(Bank.isOpen() ? 1 : 0)) {
                                int[] nArray8 = new int[llIlIIlII[19]];
                                nArray8[L.llIlIIlII[1]] = llIlIIlII[20];
                                nArray8[L.llIlIIlII[0]] = llIlIIlII[21];
                                nArray8[L.llIlIIlII[5]] = llIlIIlII[22];
                                nArray8[L.llIlIIlII[6]] = llIlIIlII[23];
                                nArray8[L.llIlIIlII[7]] = llIlIIlII[24];
                                nArray8[L.llIlIIlII[9]] = llIlIIlII[15];
                                nArray8[L.llIlIIlII[18]] = llIlIIlII[14];
                                nArray8[L.llIlIIlII[25]] = llIlIIlII[13];
                                nArray8[L.llIlIIlII[26]] = llIlIIlII[17];
                                nArray8[L.llIlIIlII[27]] = llIlIIlII[12];
                                if (L.lIllIIllIllI(e.d(nArray8) ? 1 : 0)) {
                                    a.a(llIlIIlII[20], llIlIIlII[19]);
                                    a.a(llIlIIlII[28], llIlIIlII[6]);
                                    a.a(llIlIIlII[21], llIlIIlII[6]);
                                    a.a(llIlIIlII[22], llIlIIlII[0]);
                                    a.a(llIlIIlII[23], llIlIIlII[0]);
                                    a.a(llIlIIlII[24], llIlIIlII[9]);
                                    a.a(llIlIIlII[12], llIlIIlII[11]);
                                    a.a(llIlIIlII[17], llIlIIlII[11]);
                                    a.a(llIlIIlII[14], llIlIIlII[11]);
                                    a.a(llIlIIlII[13], llIlIIlII[11]);
                                    a.a(llIlIIlII[15], llIlIIlII[11]);
                                    a.a(llIlIIlII[10], llIlIIlII[11]);
                                }
                            }
                        }
                        if (L.lIllIIllIllI(Inventory.contains((int[])f.bc) ? 1 : 0) && L.lIllIIllIlll(Movement.getRunEnergy(), llIlIIlII[29])) {
                            Inventory.getFirst((int[])f.bc).interact(llIIllIll[llIlIIlII[26]]);
                            Time.sleepTicks((int)llIlIIlII[0]);
                            0;
                        }
                        if (L.lIllIIllIllI(Inventory.contains((int[])f.aZ) ? 1 : 0) && L.lIllIIllIlll(Prayers.getPoints(), llIlIIlII[30])) {
                            Inventory.getFirst((int[])f.aZ).interact(llIIllIll[llIlIIlII[27]]);
                        }
                        if (L.lIllIIllllII(L.lIllIIllIlIl(e.w(), 60.0))) {
                            String[] stringArray = new String[llIlIIlII[0]];
                            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[19]];
                            if (L.lIllIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                String[] stringArray2 = new String[llIlIIlII[0]];
                                stringArray2[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[31]];
                                Inventory.getFirst((String[])stringArray2).interact(llIIllIll[llIlIIlII[32]]);
                                Time.sleepTicks((int)llIlIIlII[5]);
                                0;
                            }
                        }
                        if (L.lIllIIllIllI(L.an() ? 1 : 0) && L.lIllIIlllIII(e.j(dL))) {
                            String[] stringArray = new String[llIlIIlII[0]];
                            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[33]];
                            if (L.lIllIIllllIl(NPCs.getNearest((String[])stringArray))) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[34]];
                                if (L.lIllIIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                e.l(llIlIIlII[22]);
                                Movement.walkTo((WorldPoint)dg);
                                0;
                                Time.sleepTicks((int)llIlIIlII[0]);
                                0;
                            }
                            String[] stringArray3 = new String[llIlIIlII[0]];
                            stringArray3[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[35]];
                            if (L.lIllIIlllIlI(NPCs.getNearest((String[])stringArray3))) {
                                g.a(llIIllIll[llIlIIlII[36]], cG, llIlIIlII[0]);
                            }
                        }
                        if (!L.lIllIIlllllI(e.j(dL), llIlIIlII[19])) break block100;
                        e.l(llIlIIlII[23]);
                        lIIlIlllIlllll = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
                        if (L.lIllIIlllIII(lIIlIlllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIIlIlllIllllI = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                            if (L.lIllIIlllIII(lIIlIlllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIIlIlllIlllIl = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                                if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIlllIl), llIlIIlII[9])) {
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[46]];
                                    Movement.walkTo((WorldPoint)lIIlIlllIlllIl);
                                    0;
                                    Time.sleepTicks((int)llIlIIlII[0]);
                                    0;
                                }
                                if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIlllIl), llIlIIlII[9])) {
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[43]];
                                    String[] stringArray = new String[llIlIIlII[0]];
                                    stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[47]];
                                    TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[48]]);
                                    Time.sleepTicks((int)llIlIIlII[7]);
                                    0;
                                }
                            }
                            if (L.lIllIIllIllI(lIIlIlllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint lIIlIlllIllIIl;
                                TileObject lIIlIlllIllIII;
                                lIIlIlllIlllIl = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                                lIIlIlllIlllII = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                                WorldPoint lIIlIlllIllIll = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                                TileObject lIIlIlllIllIlI = TileObjects.getNearest(arg_0 -> L.m((WorldPoint)lIIlIlllIlllIl, arg_0));
                                if (L.lIllIIlllIlI(lIIlIlllIllIlI) && L.lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[54]];
                                    lIIlIlllIllIlI.interact(llIIllIll[llIlIIlII[55]]);
                                    Time.sleepTicks((int)llIlIIlII[6]);
                                    0;
                                }
                                if ((!L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlllIlllII) ? 1 : 0) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlllIllIll) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) && (L.lIllIIlllIlI(lIIlIlllIllIII = TileObjects.getNearest(arg_0 -> L.l(lIIlIlllIllIIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0))) && L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58]) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0))) {
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[60]];
                                    lIIlIlllIllIII.interact(llIIllIll[llIlIIlII[30]]);
                                    Time.sleepTicks((int)llIlIIlII[6]);
                                    0;
                                }
                                if (L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                                    if (L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) && L.lIllIIlllIlI(lIIlIlllIllIII = TileObjects.getNearest(arg_0 -> L.k(lIIlIlllIllIIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0)))) {
                                        AccBuilderGWD.c = llIIllIll[llIlIIlII[62]];
                                        lIIlIlllIllIII.interact(llIIllIll[llIlIIlII[40]]);
                                        Time.sleepTicks((int)llIlIIlII[6]);
                                        0;
                                    }
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[63]];
                                    String[] stringArray = new String[llIlIIlII[0]];
                                    stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[64]];
                                    TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[65]]);
                                    Time.sleepTicks((int)llIlIIlII[6]);
                                    0;
                                }
                            }
                        }
                        if (!L.lIllIIllIllI(lIIlIlllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !L.lIllIIlllllI(Vars.getBit((int)llIlIIlII[7]), llIlIIlII[0])) break block100;
                        if (L.lIllIIlllIII(Vars.getBit((int)llIlIIlII[6]))) {
                            g.a(llIIllIll[llIlIIlII[39]], cG);
                        }
                        if (!L.lIllIIlllllI(Vars.getBit((int)llIlIIlII[6]), llIlIIlII[0])) break block100;
                        lIIlIlllIllllI = new WorldPoint(llIlIIlII[37], llIlIIlII[66], llIlIIlII[1]);
                        if (L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlllIllllI) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[67]];
                            e.c((WorldPoint)lIIlIlllIllllI);
                            Time.sleepTicks((int)llIlIIlII[0]);
                            0;
                        }
                        if (!L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)lIIlIlllIllllI) ? 1 : 0)) break block100;
                        if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[33]) && !L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[46])) break block101;
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[68]];
                        if (!L.lIllIIlllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block102;
                    }
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)NPCs.getNearest(nPC -> {
                        int n2;
                        if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[325]]) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                            n2 = llIlIIlII[0];
                            0;
                            if (-(0x14 ^ 0x11) >= 0) {
                                return false;
                            }
                        } else {
                            n2 = llIlIIlII[1];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)llIlIIlII[5]);
                    0;
                }
                String[] stringArray = new String[llIlIIlII[0]];
                stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[69]];
                if (L.lIllIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[46]) && L.lIllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[60])) {
                        Magic.cast((Spell)SpellBook.Standard.WIND_BOLT, (NPC)NPCs.getNearest(nPC -> {
                            int n2;
                            if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[324]]) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                                n2 = llIlIIlII[0];
                                0;
                                if (((0x16 ^ 0x61 ^ (0x1E ^ 0x5D)) & (0x8E ^ 0x94 ^ (0x5E ^ 0x70) ^ -1)) != 0) {
                                    return ((154 + 151 - 247 + 112 ^ 111 + 94 - 135 + 91) & (0xEA ^ 0x93 ^ (0xC7 ^ 0xB5) ^ -1)) != 0;
                                }
                            } else {
                                n2 = llIlIIlII[1];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)llIlIIlII[5]);
                        0;
                    }
                    if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[60]) && L.lIllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[65])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_BOLT, (NPC)NPCs.getNearest(nPC -> {
                            int n2;
                            if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[323]]) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                                n2 = llIlIIlII[0];
                                0;
                                if (-3 >= 0) {
                                    return false;
                                }
                            } else {
                                n2 = llIlIIlII[1];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)llIlIIlII[5]);
                        0;
                    }
                    if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[65]) && L.lIllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[70])) {
                        Magic.cast((Spell)SpellBook.Standard.EARTH_BOLT, (NPC)NPCs.getNearest(nPC -> {
                            int n2;
                            if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[322]]) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                                n2 = llIlIIlII[0];
                                0;
                                if (3 < -1) {
                                    return false;
                                }
                            } else {
                                n2 = llIlIIlII[1];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)llIlIIlII[5]);
                        0;
                    }
                    if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[70])) {
                        Magic.cast((Spell)SpellBook.Standard.FIRE_BOLT, (NPC)NPCs.getNearest(nPC -> {
                            int n2;
                            if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[321]]) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                                n2 = llIlIIlII[0];
                                0;
                                if (3 <= 2) {
                                    return false;
                                }
                            } else {
                                n2 = llIlIIlII[1];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)llIlIIlII[5]);
                        0;
                    }
                }
            }
            if (L.lIllIIlllllI(e.j(dL), llIlIIlII[48])) {
                if (L.lIllIIllIllI(Dialog.isOpen() ? 1 : 0)) {
                    g.a(cG);
                }
                if (L.lIllIIllIllI((lIIlIlllIlllll = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[71]];
                    String[] stringArray = new String[llIlIIlII[0]];
                    stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[70]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[72]]);
                    Time.sleepTicks((int)llIlIIlII[6]);
                    0;
                }
                if (L.lIllIIlllIII(lIIlIlllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lIIlIlllIllllI = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
                    String[] stringArray = new String[llIlIIlII[0]];
                    stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[74]];
                    if (L.lIllIIlllIlI(TileObjects.getNearest((String[])stringArray)) && L.lIllIIllIllI(lIIlIlllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[75]];
                        String[] stringArray4 = new String[llIlIIlII[0]];
                        stringArray4[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[76]];
                        TileObjects.getNearest((String[])stringArray4).interact(llIIllIll[llIlIIlII[77]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                }
                if (L.lIllIIllIllI((lIIlIlllIllllI = new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[80]];
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[320]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                            n2 = llIlIIlII[0];
                            0;
                            if (((0xD4 ^ 0x81 ^ (1 ^ 0x5B)) & (0xC9 ^ 0x98 ^ (0xCD ^ 0x93) ^ -1)) >= 2) {
                                return false;
                            }
                        } else {
                            n2 = llIlIIlII[1];
                        }
                        return n2 != 0;
                    }).interact(llIIllIll[llIlIIlII[81]]);
                    Time.sleepTicks((int)llIlIIlII[6]);
                    0;
                }
                WorldPoint[] worldPointArray = new WorldPoint[llIlIIlII[67]];
                worldPointArray[L.llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[0]] = new WorldPoint(llIlIIlII[84], llIlIIlII[85], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[5]] = new WorldPoint(llIlIIlII[86], llIlIIlII[87], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[6]] = new WorldPoint(llIlIIlII[88], llIlIIlII[89], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[7]] = new WorldPoint(llIlIIlII[90], llIlIIlII[91], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[9]] = new WorldPoint(llIlIIlII[90], llIlIIlII[92], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[18]] = new WorldPoint(llIlIIlII[86], llIlIIlII[93], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[25]] = new WorldPoint(llIlIIlII[94], llIlIIlII[95], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[26]] = new WorldPoint(llIlIIlII[96], llIlIIlII[97], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[27]] = new WorldPoint(llIlIIlII[98], llIlIIlII[99], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[19]] = new WorldPoint(llIlIIlII[100], llIlIIlII[101], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[31]] = new WorldPoint(llIlIIlII[102], llIlIIlII[99], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[32]] = new WorldPoint(llIlIIlII[103], llIlIIlII[104], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[33]] = new WorldPoint(llIlIIlII[58], llIlIIlII[95], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[34]] = new WorldPoint(llIlIIlII[105], llIlIIlII[93], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[35]] = new WorldPoint(llIlIIlII[106], llIlIIlII[107], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[36]] = new WorldPoint(llIlIIlII[108], llIlIIlII[109], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[46]] = new WorldPoint(llIlIIlII[110], llIlIIlII[111], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[43]] = new WorldPoint(llIlIIlII[110], llIlIIlII[89], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[47]] = new WorldPoint(llIlIIlII[112], llIlIIlII[87], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[48]] = new WorldPoint(llIlIIlII[51], llIlIIlII[113], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[54]] = new WorldPoint(llIlIIlII[44], llIlIIlII[87], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[55]] = new WorldPoint(llIlIIlII[114], llIlIIlII[115], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[60]] = new WorldPoint(llIlIIlII[116], llIlIIlII[117], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[30]] = new WorldPoint(llIlIIlII[116], llIlIIlII[118], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[62]] = new WorldPoint(llIlIIlII[119], llIlIIlII[120], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[40]] = new WorldPoint(llIlIIlII[121], llIlIIlII[122], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[63]] = new WorldPoint(llIlIIlII[49], llIlIIlII[123], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[64]] = new WorldPoint(llIlIIlII[124], llIlIIlII[95], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[65]] = new WorldPoint(llIlIIlII[125], llIlIIlII[126], llIlIIlII[1]);
                worldPointArray[L.llIlIIlII[39]] = new WorldPoint(llIlIIlII[127], llIlIIlII[93], llIlIIlII[1]);
                lIIlIlllIlllIl = worldPointArray;
                if (L.lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lIIlIlllIlllII = new WorldPoint(llIlIIlII[128], llIlIIlII[129], llIlIIlII[1]);
                    if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIlllII), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[2]];
                        if (L.lIllIIlllIlI(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[319]]))) && L.lIllIIlllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                        }
                        if (L.lIllIIllllIl(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[318]]))) && L.lIllIIllIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                        }
                        Walker.walkAlong(Arrays.asList(lIIlIlllIlllIl), new HashMap());
                        0;
                        Time.sleepTicks((int)llIlIIlII[0]);
                        0;
                    }
                    if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIlllII), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[130]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[131]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[132]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                }
                if (L.lIllIIllIllI(L.cq() ? 1 : 0)) {
                    int[] nArray = new int[llIlIIlII[0]];
                    nArray[L.llIlIIlII[1]] = llIlIIlII[133];
                    if (L.lIllIIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        lIIlIlllIlllII = new WorldPoint(llIlIIlII[134], llIlIIlII[135], llIlIIlII[5]);
                        if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIlllII), llIlIIlII[25])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[136]];
                            Movement.walkTo((WorldPoint)lIIlIlllIlllII);
                            0;
                            Time.sleepTicks((int)llIlIIlII[0]);
                            0;
                        }
                        if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIlllII), llIlIIlII[25])) {
                            int[] nArray9 = new int[llIlIIlII[0]];
                            nArray9[L.llIlIIlII[1]] = llIlIIlII[133];
                            if (L.lIllIIlllIlI(TileItems.getNearest((int[])nArray9))) {
                                int[] nArray10 = new int[llIlIIlII[0]];
                                nArray10[L.llIlIIlII[1]] = llIlIIlII[133];
                                TileItems.getNearest((int[])nArray10).interact(llIIllIll[llIlIIlII[137]]);
                                Time.sleepTicks((int)llIlIIlII[5]);
                                0;
                            }
                            int[] nArray11 = new int[llIlIIlII[0]];
                            nArray11[L.llIlIIlII[1]] = llIlIIlII[133];
                            if (L.lIllIIllllIl(TileItems.getNearest((int[])nArray11))) {
                                L.t(llIIllIll[llIlIIlII[138]]);
                                Time.sleepTicks((int)llIlIIlII[0]);
                                0;
                            }
                        }
                    }
                    int[] nArray12 = new int[llIlIIlII[0]];
                    nArray12[L.llIlIIlII[1]] = llIlIIlII[133];
                    if (L.lIllIIllIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                        if (L.lIllIIllIllI(gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIIlIlllIlllII = new WorldPoint(llIlIIlII[139], llIlIIlII[140], llIlIIlII[5]);
                            if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIlllII), llIlIIlII[7])) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[29]];
                                Movement.walkTo((WorldPoint)lIIlIlllIlllII);
                                0;
                                Time.sleepTicks((int)llIlIIlII[0]);
                                0;
                            }
                            if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIlllII), llIlIIlII[7])) {
                                String[] stringArray = new String[llIlIIlII[0]];
                                stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[141]];
                                TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[142]]);
                                Time.sleepTicks((int)llIlIIlII[6]);
                                0;
                            }
                        }
                        if (L.lIllIIllIllI(gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIllIIlllIlI(lIIlIlllIlllII = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[316]]) ? 1 : 0)) {
                                String[] stringArray = new String[llIlIIlII[0]];
                                stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[317]];
                                if (L.lIllIIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llIlIIlII[0];
                                    0;
                                    if (((0x64 ^ 0x38) & ~(0x1F ^ 0x43)) == 0) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = llIlIIlII[1];
                            return n2 != 0;
                        }))) {
                            if (L.lIllIIlllIII(Reachable.isInteractable((Locatable)lIIlIlllIlllII) ? 1 : 0)) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[143]];
                                Movement.walkTo((WorldPoint)lIIlIlllIlllII.getWorldLocation());
                                0;
                                Time.sleepTicks((int)llIlIIlII[0]);
                                0;
                            }
                            if (L.lIllIIllIllI(Reachable.isInteractable((Locatable)lIIlIlllIlllII) ? 1 : 0)) {
                                lIIlIlllIlllII.interact(llIIllIll[llIlIIlII[144]]);
                                Time.sleepTicks((int)llIlIIlII[5]);
                                0;
                            }
                        }
                    }
                }
            }
            if (L.lIllIIlllllI(e.j(dL), llIlIIlII[39])) {
                if (L.lIllIIllIllI(gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIllIIlllIlI(lIIlIlllIlllll = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[314]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[315]];
                        if (L.lIllIIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIlIIlII[0];
                            0;
                            if ((0x1E ^ 0x1A) != 1) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIlIIlII[1];
                    return n2 != 0;
                }))) {
                    if (L.lIllIIlllIII(Reachable.isInteractable((Locatable)lIIlIlllIlllll) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[145]];
                        Movement.walkTo((WorldPoint)lIIlIlllIlllll.getWorldLocation());
                        0;
                        Time.sleepTicks((int)llIlIIlII[0]);
                        0;
                    }
                    if (L.lIllIIllIllI(Reachable.isInteractable((Locatable)lIIlIlllIlllll) ? 1 : 0)) {
                        lIIlIlllIlllll.interact(llIIllIll[llIlIIlII[146]]);
                        Time.sleepTicks((int)llIlIIlII[5]);
                        0;
                    }
                }
                if (L.lIllIIllIllI(gd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lIIlIlllIlllll = new WorldPoint(llIlIIlII[147], llIlIIlII[148], llIlIIlII[1]);
                    if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIlllll), llIlIIlII[19])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[149]];
                        Movement.walkTo((WorldPoint)lIIlIlllIlllll);
                        0;
                        Time.sleepTicks((int)llIlIIlII[0]);
                        0;
                    }
                    if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIlllll), llIlIIlII[19])) {
                        if (L.lIllIIlllIII(Vars.getBit((int)llIlIIlII[1]))) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[150]];
                            int[] nArray = new int[llIlIIlII[0]];
                            nArray[L.llIlIIlII[1]] = llIlIIlII[151];
                            if (L.lIllIIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                if (L.lIllIIlllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] nArray13 = new int[llIlIIlII[0]];
                                nArray13[L.llIlIIlII[1]] = llIlIIlII[151];
                                if (L.lIllIIllllIl(TileItems.getNearest((int[])nArray13))) {
                                    L.t(llIIllIll[llIlIIlII[152]]);
                                    Time.sleepTicks((int)llIlIIlII[0]);
                                    0;
                                }
                                int[] nArray14 = new int[llIlIIlII[0]];
                                nArray14[L.llIlIIlII[1]] = llIlIIlII[151];
                                if (L.lIllIIlllIlI(TileItems.getNearest((int[])nArray14))) {
                                    int[] nArray15 = new int[llIlIIlII[0]];
                                    nArray15[L.llIlIIlII[1]] = llIlIIlII[151];
                                    TileItems.getNearest((int[])nArray15).interact(llIIllIll[llIlIIlII[153]]);
                                    Time.sleepTicks((int)llIlIIlII[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[llIlIIlII[0]];
                            nArray16[L.llIlIIlII[1]] = llIlIIlII[151];
                            if (L.lIllIIllIllI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                                lIIlIlllIllllI = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[313]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[206], llIlIIlII[148], llIlIIlII[1])), llIlIIlII[6])) {
                                        n2 = llIlIIlII[0];
                                        0;
                                        if (-1 > ((0x5B ^ 0x7C) & ~(0x5F ^ 0x78))) {
                                            return false;
                                        }
                                    } else {
                                        n2 = llIlIIlII[1];
                                    }
                                    return n2 != 0;
                                });
                                int[] nArray17 = new int[llIlIIlII[0]];
                                nArray17[L.llIlIIlII[1]] = llIlIIlII[151];
                                Inventory.getFirst((int[])nArray17).useOn((TileObject)lIIlIlllIllllI);
                                Time.sleepTicks((int)llIlIIlII[5]);
                                0;
                            }
                        }
                        if (L.lIllIIlllllI(Vars.getBit((int)llIlIIlII[1]), llIlIIlII[0])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[154]];
                            int[] nArray = new int[llIlIIlII[0]];
                            nArray[L.llIlIIlII[1]] = llIlIIlII[155];
                            if (L.lIllIIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                if (L.lIllIIlllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] nArray18 = new int[llIlIIlII[0]];
                                nArray18[L.llIlIIlII[1]] = llIlIIlII[155];
                                if (L.lIllIIllllIl(TileItems.getNearest((int[])nArray18))) {
                                    L.t(llIIllIll[llIlIIlII[156]]);
                                    Time.sleepTicks((int)llIlIIlII[0]);
                                    0;
                                }
                                int[] nArray19 = new int[llIlIIlII[0]];
                                nArray19[L.llIlIIlII[1]] = llIlIIlII[155];
                                if (L.lIllIIlllIlI(TileItems.getNearest((int[])nArray19))) {
                                    int[] nArray20 = new int[llIlIIlII[0]];
                                    nArray20[L.llIlIIlII[1]] = llIlIIlII[155];
                                    TileItems.getNearest((int[])nArray20).interact(llIIllIll[llIlIIlII[157]]);
                                    Time.sleepTicks((int)llIlIIlII[5]);
                                    0;
                                }
                            }
                            int[] nArray21 = new int[llIlIIlII[0]];
                            nArray21[L.llIlIIlII[1]] = llIlIIlII[155];
                            if (L.lIllIIllIllI(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                                lIIlIlllIllllI = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[311]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[312], llIlIIlII[135], llIlIIlII[1])), llIlIIlII[6])) {
                                        n2 = llIlIIlII[0];
                                        0;
                                        if (3 == 1) {
                                            return ((0x51 ^ 0x38 ^ (0xF ^ 0x46)) & (4 ^ 0xF ^ (0x3A ^ 0x11) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llIlIIlII[1];
                                    }
                                    return n2 != 0;
                                });
                                int[] nArray22 = new int[llIlIIlII[0]];
                                nArray22[L.llIlIIlII[1]] = llIlIIlII[155];
                                Inventory.getFirst((int[])nArray22).useOn((TileObject)lIIlIlllIllllI);
                                Time.sleepTicks((int)llIlIIlII[5]);
                                0;
                            }
                        }
                    }
                }
            }
            if (L.lIllIIlllllI(e.j(dL), llIlIIlII[77])) {
                if (L.lIllIIllIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                lIIlIlllIlllll = new WorldPoint(llIlIIlII[158], llIlIIlII[159], llIlIIlII[1]);
                if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIlllll), llIlIIlII[9])) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[160]];
                    Movement.walkTo((WorldPoint)lIIlIlllIlllll);
                    0;
                    Time.sleepTicks((int)llIlIIlII[0]);
                    0;
                }
                if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIlllll), llIlIIlII[9])) {
                    if (L.lIllIIllIlll(dk, llIlIIlII[0])) {
                        as.nE += llIlIIlII[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIlIIlII[0];
                        as.nE = llIlIIlII[1];
                    }
                    g.a(llIIllIll[llIlIIlII[161]], cG, llIlIIlII[0]);
                }
            }
            e.c(ge);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIIlIllIIlllll;
        int[] nArray = new int[llIlIIlII[7]];
        nArray[L.llIlIIlII[1]] = llIlIIlII[20];
        nArray[L.llIlIIlII[0]] = llIlIIlII[28];
        nArray[L.llIlIIlII[5]] = llIlIIlII[21];
        nArray[L.llIlIIlII[6]] = llIlIIlII[23];
        int[] nArray2 = nArray;
        int lIIlIllIIllllI = llIlIIlII[1];
        while (L.lIllIIllIlll(lIIlIllIIllllI, ((void)lIIlIllIIlllll).length)) {
            int[] nArray3 = new int[llIlIIlII[0]];
            nArray3[L.llIlIIlII[1]] = lIIlIllIIlllll[lIIlIllIIllllI];
            if (L.lIllIIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIlIIlII[1];
            }
            ++lIIlIllIIllllI;
            0;
            
            return ((0x98 ^ 0x93 ^ (0x87 ^ 0x93)) & (0xD5 ^ 0x9D ^ (0x6F ^ 0x38) ^ -1)) != 0;
        }
        return llIlIIlII[0];
    }

    private static /* synthetic */ boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[297]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean i(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[309]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (((2 ^ 0x5A) & ~(0x19 ^ 0x41)) != ((0xDE ^ 0xC7) & ~(0xB9 ^ 0xA0))) {
                return false;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIlllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlllIlI(Object object) {
        return object != null;
    }

    private static /* synthetic */ boolean h(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[308]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean d(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[298]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if ((0x64 ^ 0x61) == 0) {
                return false;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean k(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[326]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (2 > (0x7D ^ 0x79)) {
                return false;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static /* synthetic */ boolean j(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[310]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (((0x3D ^ 0x10) & ~(0x61 ^ 0x4C)) > 0) {
                return false;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static void lIllIIIllIIl() {
        llIIllIll = new String[llIlIIlII[344]];
        L.llIIllIll[L.llIlIIlII[1]] = L."Finished buying items, switching back to quest";
        L.llIIllIll[L.llIlIIlII[0]] = L."- Prayer";
        L.llIIllIll[L.llIlIIlII[5]] = L."- Death Plateau";
        L.llIIllIll[L.llIlIIlII[6]] = L."";
        L.llIIllIll[L.llIlIIlII[7]] = L."Nav to bank";
        L.llIIllIll[L.llIlIIlII[9]] = L."Handling banking";
        L.llIIllIll[L.llIlIIlII[18]] = L."We are missing quest supplies, switching to BUYING";
        L.llIIllIll[L.llIlIIlII[25]] = L."We are missing quest supplies, switching to BUYING";
        L.llIIllIll[L.llIlIIlII[26]] = L."Drink";
        L.llIIllIll[L.llIlIIlII[27]] = L."Drink";
        L.llIIllIll[L.llIlIIlII[19]] = L."Shark";
        L.llIIllIll[L.llIlIIlII[31]] = L."Shark";
        L.llIIllIll[L.llIlIIlII[32]] = L."Eat";
        L.llIIllIll[L.llIlIIlII[33]] = L."Denulth";
        L.llIIllIll[L.llIlIIlII[34]] = L."Nav to start";
        L.llIIllIll[L.llIlIIlII[35]] = L."Denulth";
        L.llIIllIll[L.llIlIIlII[36]] = L."Denulth";
        L.llIIllIll[L.llIlIIlII[46]] = L."Nav to rocks";
        L.llIIllIll[L.llIlIIlII[43]] = L."Climb first rocks";
        L.llIIllIll[L.llIlIIlII[47]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[48]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[54]] = L."Climbing second rocks";
        L.llIIllIll[L.llIlIIlII[55]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[60]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[30]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[62]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[40]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[63]] = L."Entering arena";
        L.llIIllIll[L.llIlIIlII[64]] = L."Arena Entrance";
        L.llIIllIll[L.llIlIIlII[65]] = L."Open";
        L.llIIllIll[L.llIlIIlII[39]] = L."Dad";
        L.llIIllIll[L.llIlIIlII[67]] = L."Nav to safespot";
        L.llIIllIll[L.llIlIIlII[68]] = L."Chaos rune";
        L.llIIllIll[L.llIlIIlII[69]] = L."Chaos rune";
        L.llIIllIll[L.llIlIIlII[71]] = L."Exiting arena";
        L.llIIllIll[L.llIlIIlII[70]] = L."Arena Exit";
        L.llIIllIll[L.llIlIIlII[72]] = L."Open";
        L.llIIllIll[L.llIlIIlII[74]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[75]] = L."Entering cave";
        L.llIIllIll[L.llIlIIlII[76]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[77]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[80]] = L."Exiting cave";
        L.llIIllIll[L.llIlIIlII[81]] = L."Exit";
        L.llIIllIll[L.llIlIIlII[2]] = L."Nav to stronghold entrance";
        L.llIIllIll[L.llIlIIlII[130]] = L."Entering stronghold";
        L.llIIllIll[L.llIlIIlII[131]] = L."Stronghold";
        L.llIIllIll[L.llIlIIlII[132]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[136]] = L."Nav to general";
        L.llIIllIll[L.llIlIIlII[137]] = L."Take";
        L.llIIllIll[L.llIlIIlII[138]] = L."Troll general";
        L.llIIllIll[L.llIlIIlII[29]] = L."Nav to stairs";
        L.llIIllIll[L.llIlIIlII[141]] = L."Stone Staircase";
        L.llIIllIll[L.llIlIIlII[142]] = L."Climb-down";
        L.llIIllIll[L.llIlIIlII[143]] = L."Nav to stair";
        L.llIIllIll[L.llIlIIlII[144]] = L."Climb-down";
        L.llIIllIll[L.llIlIIlII[145]] = L."Nav to stair";
        L.llIIllIll[L.llIlIIlII[146]] = L."Climb-down";
        L.llIIllIll[L.llIlIIlII[149]] = L."Nav to cell";
        L.llIIllIll[L.llIlIIlII[150]] = L."Free Eadgar";
        L.llIIllIll[L.llIlIIlII[152]] = L."Berry";
        L.llIIllIll[L.llIlIIlII[153]] = L."Take";
        L.llIIllIll[L.llIlIIlII[154]] = L."Free Godric";
        L.llIIllIll[L.llIlIIlII[156]] = L."Twig";
        L.llIIllIll[L.llIlIIlII[157]] = L."Take";
        L.llIIllIll[L.llIlIIlII[160]] = L."Nav to smith";
        L.llIIllIll[L.llIlIIlII[161]] = L."Dunstan";
        L.llIIllIll[L.llIlIIlII[169]] = L."Nav to rocks";
        L.llIIllIll[L.llIlIIlII[170]] = L."Climb first rocks";
        L.llIIllIll[L.llIlIIlII[171]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[172]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[173]] = L."Climbing second rocks";
        L.llIIllIll[L.llIlIIlII[174]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[175]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[176]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[177]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[178]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[179]] = L."Entering arena";
        L.llIIllIll[L.llIlIIlII[180]] = L."Arena Entrance";
        L.llIIllIll[L.llIlIIlII[181]] = L."Open";
        L.llIIllIll[L.llIlIIlII[182]] = L."Exiting arena";
        L.llIIllIll[L.llIlIIlII[4]] = L."Arena Exit";
        L.llIIllIll[L.llIlIIlII[183]] = L."Open";
        L.llIIllIll[L.llIlIIlII[184]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[185]] = L."Entering cave";
        L.llIIllIll[L.llIlIIlII[186]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[187]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[164]] = L."Exiting cave";
        L.llIIllIll[L.llIlIIlII[188]] = L."Exit";
        L.llIIllIll[L.llIlIIlII[212]] = L."Nav to troll child";
        L.llIIllIll[L.llIlIIlII[213]] = L."Nav to rocks";
        L.llIIllIll[L.llIlIIlII[214]] = L."Climb first rocks";
        L.llIIllIll[L.llIlIIlII[215]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[216]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[217]] = L."Climbing second rocks";
        L.llIIllIll[L.llIlIIlII[165]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[218]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[219]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[220]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[221]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[222]] = L."Entering arena";
        L.llIIllIll[L.llIlIIlII[223]] = L."Arena Entrance";
        L.llIIllIll[L.llIlIIlII[224]] = L."Open";
        L.llIIllIll[L.llIlIIlII[225]] = L."Exiting arena";
        L.llIIllIll[L.llIlIIlII[226]] = L."Arena Exit";
        L.llIIllIll[L.llIlIIlII[227]] = L."Open";
        L.llIIllIll[L.llIlIIlII[228]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[229]] = L."Entering cave";
        L.llIIllIll[L.llIlIIlII[230]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[231]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[232]] = L."Exiting cave";
        L.llIIllIll[L.llIlIIlII[233]] = L."Exit";
        L.llIIllIll[L.llIlIIlII[234]] = L."Nav to stronghold entrance";
        L.llIIllIll[L.llIlIIlII[235]] = L."Entering stronghold";
        L.llIIllIll[L.llIlIIlII[236]] = L."Stronghold";
        L.llIIllIll[L.llIlIIlII[237]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[238]] = L."Nav to rocks";
        L.llIIllIll[L.llIlIIlII[239]] = L."Climb first rocks";
        L.llIIllIll[L.llIlIIlII[240]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[168]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[241]] = L."Climbing second rocks";
        L.llIIllIll[L.llIlIIlII[242]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[243]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[244]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[245]] = L."Climbing third rocks";
        L.llIIllIll[L.llIlIIlII[246]] = L."Climb";
        L.llIIllIll[L.llIlIIlII[247]] = L."Entering arena";
        L.llIIllIll[L.llIlIIlII[248]] = L."Arena Entrance";
        L.llIIllIll[L.llIlIIlII[249]] = L."Open";
        L.llIIllIll[L.llIlIIlII[250]] = L."Exiting arena";
        L.llIIllIll[L.llIlIIlII[251]] = L."Arena Exit";
        L.llIIllIll[L.llIlIIlII[252]] = L."Open";
        L.llIIllIll[L.llIlIIlII[253]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[254]] = L."Entering cave";
        L.llIIllIll[L.llIlIIlII[255]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[256]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[257]] = L."Exiting cave";
        L.llIIllIll[L.llIlIIlII[258]] = L."Exit";
        L.llIIllIll[L.llIlIIlII[273]] = L."Nav to Eadgars cave";
        L.llIIllIll[L.llIlIIlII[274]] = L."Entering cave";
        L.llIIllIll[L.llIlIIlII[275]] = L."Cave Entrance";
        L.llIIllIll[L.llIlIIlII[276]] = L."Enter";
        L.llIIllIll[L.llIlIIlII[277]] = L."Chaos rune";
        L.llIIllIll[L.llIlIIlII[278]] = L."Chaos rune";
        L.llIIllIll[L.llIlIIlII[291]] = L."ring of wealth (";
        L.llIIllIll[L.llIlIIlII[292]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[293]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[294]] = L."Cave Exit";
        L.llIIllIll[L.llIlIIlII[296]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[297]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[298]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[299]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[300]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[301]] = L."Cave Exit";
        L.llIIllIll[L.llIlIIlII[302]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[303]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[304]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[305]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[306]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[307]] = L."Cave Exit";
        L.llIIllIll[L.llIlIIlII[308]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[309]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[310]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[311]] = L."Cell Door";
        L.llIIllIll[L.llIlIIlII[313]] = L."Cell Door";
        L.llIIllIll[L.llIlIIlII[314]] = L."Staircase";
        L.llIIllIll[L.llIlIIlII[315]] = L."Climb-down";
        L.llIIllIll[L.llIlIIlII[316]] = L."Staircase";
        L.llIIllIll[L.llIlIIlII[317]] = L."Climb-down";
        L.llIIllIll[L.llIlIIlII[318]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[319]] = L."Thrower";
        L.llIIllIll[L.llIlIIlII[320]] = L."Cave Exit";
        L.llIIllIll[L.llIlIIlII[321]] = L."Dad";
        L.llIIllIll[L.llIlIIlII[322]] = L."Dad";
        L.llIIllIll[L.llIlIIlII[323]] = L."Dad";
        L.llIIllIll[L.llIlIIlII[324]] = L."Dad";
        L.llIIllIll[L.llIlIIlII[325]] = L."Dad";
        L.llIIllIll[L.llIlIIlII[326]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[327]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[328]] = L."Rocks";
        L.llIIllIll[L.llIlIIlII[339]] = L."";
        L.llIIllIll[L.llIlIIlII[283]] = L."Troll Stronghold ";
        L.llIIllIll[L.llIlIIlII[340]] = L."Yes.";
        L.llIIllIll[L.llIlIIlII[341]] = L."How goes your fight with the trolls?";
        L.llIIllIll[L.llIlIIlII[342]] = L."I accept your challenge!";
        L.llIIllIll[L.llIlIIlII[343]] = L."I'll be going now.";
    }

    private static boolean lIllIlIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean cm() {
        boolean bl;
        WorldArea worldArea = new WorldArea(llIlIIlII[162], llIlIIlII[163], llIlIIlII[164], llIlIIlII[165], llIlIIlII[1]);
        WorldArea worldArea2 = new WorldArea(llIlIIlII[166], llIlIIlII[167], llIlIIlII[168], llIlIIlII[161], llIlIIlII[1]);
        if (!L.lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || L.lIllIIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = llIlIIlII[0];
            0;
            if (2 != 2) {
                return ((161 + 92 - 174 + 161 ^ 145 + 107 - 182 + 109) & (0x63 ^ 1 ^ (0xE2 ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIlII[1];
        }
        return bl;
    }

    static {
        L.lIllIIllIlII();
        L.lIllIIIllIIl();
        bx = new ArrayList<d>();
        ga = new WorldArea(llIlIIlII[329], llIlIIlII[330], llIlIIlII[183], llIlIIlII[146], llIlIIlII[1]);
        gb = new WorldArea(llIlIIlII[331], llIlIIlII[332], llIlIIlII[138], llIlIIlII[170], llIlIIlII[5]);
        gc = new WorldArea(llIlIIlII[333], llIlIIlII[334], llIlIIlII[136], llIlIIlII[161], llIlIIlII[0]);
        gd = new WorldArea(llIlIIlII[331], llIlIIlII[335], llIlIIlII[149], llIlIIlII[171], llIlIIlII[1]);
        dg = new WorldPoint(llIlIIlII[336], llIlIIlII[337], llIlIIlII[1]);
        dL = llIlIIlII[338];
        dk = llIlIIlII[1];
        ge = new int[llIlIIlII[1]];
        dc = llIIllIll[llIlIIlII[339]];
        h = llIIllIll[llIlIIlII[283]];
        String[] stringArray = new String[llIlIIlII[7]];
        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[340]];
        stringArray[L.llIlIIlII[0]] = llIIllIll[llIlIIlII[341]];
        stringArray[L.llIlIIlII[5]] = llIIllIll[llIlIIlII[342]];
        stringArray[L.llIlIIlII[6]] = llIIllIll[llIlIIlII[343]];
        cG = stringArray;
    }

    @Override
    public int af() {
        try {
            L.cl();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 >= (0x55 ^ 0x71 ^ (0x53 ^ 0x73))) {
            return (0x61 ^ 0x2B ^ (0x41 ^ 4)) & (0xA4 ^ 0xB3 ^ (0x57 ^ 0x4F) ^ -1);
        }
        return llIlIIlII[223];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (L.lIllIIlllIIl(e.j(dL), llIlIIlII[29])) {
            bl = llIlIIlII[0];
            0;
            if (1 < -1) {
                return ((0xF7 ^ 0x83 ^ (0xAD ^ 0x97)) & (0x6B ^ 0x65 ^ (0x18 ^ 0x58) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIlII[1];
        }
        return bl;
    }

    private static void t(String string) {
        String lIIlIllIlIIIlI;
        block9: {
            block8: {
                if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[33]) && !L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[46])) break block8;
                String[] stringArray = new String[llIlIIlII[0]];
                stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[277]];
                if (!L.lIllIIlllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block9;
            }
            Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)NPCs.getNearest(nPC -> {
                int n2;
                if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(lIIlIllIlIIIlI) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlIIlII[0];
                    0;
                    if (1 != 1) {
                        return ((0x9B ^ 0x84 ^ (0x55 ^ 0x75)) & (0xE9 ^ 0x94 ^ (0xE5 ^ 0xA7) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIIlII[1];
                }
                return n2 != 0;
            }));
            Time.sleepTicks((int)llIlIIlII[5]);
            0;
        }
        String[] stringArray = new String[llIlIIlII[0]];
        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[278]];
        if (L.lIllIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[46]) && L.lIllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[60])) {
                Magic.cast((Spell)SpellBook.Standard.WIND_BOLT, (NPC)NPCs.getNearest(nPC -> {
                    int n2;
                    if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(lIIlIllIlIIIlI) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                        n2 = llIlIIlII[0];
                        0;
                        if (-1 > ((0xB0 ^ 0x90) & ~(0xBA ^ 0x9A))) {
                            return false;
                        }
                    } else {
                        n2 = llIlIIlII[1];
                    }
                    return n2 != 0;
                }));
                Time.sleepTicks((int)llIlIIlII[5]);
                0;
            }
            if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[60]) && L.lIllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[65])) {
                Magic.cast((Spell)SpellBook.Standard.WATER_BOLT, (NPC)NPCs.getNearest(nPC -> {
                    int n2;
                    if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(lIIlIllIlIIIlI) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                        n2 = llIlIIlII[0];
                        0;
                        
                        }
                    } else {
                        n2 = llIlIIlII[1];
                    }
                    return n2 != 0;
                }));
                Time.sleepTicks((int)llIlIIlII[5]);
                0;
            }
            if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[65]) && L.lIllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[70])) {
                Magic.cast((Spell)SpellBook.Standard.EARTH_BOLT, (NPC)NPCs.getNearest(nPC -> {
                    int n2;
                    if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(lIIlIllIlIIIlI) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                        n2 = llIlIIlII[0];
                        0;
                        
                        }
                    } else {
                        n2 = llIlIIlII[1];
                    }
                    return n2 != 0;
                }));
                Time.sleepTicks((int)llIlIIlII[5]);
                0;
            }
            if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIIlII[70])) {
                Magic.cast((Spell)SpellBook.Standard.FIRE_BOLT, (NPC)NPCs.getNearest(nPC -> {
                    int n2;
                    if (L.lIllIIllIllI(nPC.getName().equalsIgnoreCase(lIIlIllIlIIIlI) ? 1 : 0) && L.lIllIIlllIII(nPC.isDead() ? 1 : 0)) {
                        n2 = llIlIIlII[0];
                        0;
                        if (((0x3E ^ 0x6F ^ (0xF6 ^ 0x85)) & (0x27 ^ 0x39 ^ (0xA2 ^ 0x9E) ^ -1)) != 0) {
                            return ((0x1E ^ 0x27 ^ (0x42 ^ 0x69)) & (0x50 ^ 0xE ^ (0xF3 ^ 0xBF) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIlIIlII[1];
                    }
                    return n2 != 0;
                }));
                Time.sleepTicks((int)llIlIIlII[5]);
                0;
            }
        }
    }

    private static String lIlIllIllIII(String lIIlIlIIIIlIll, String lIIlIlIIIIllII) {
        try {
            SecretKeySpec lIIlIlIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlIIIIllll = Cipher.getInstance("Blowfish");
            lIIlIlIIIIllll.init(llIlIIlII[5], lIIlIlIIIlIIII);
            return new String(lIIlIlIIIIllll.doFinal(Base64.getDecoder().decode(lIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIIIIlllI) {
            lIIlIlIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllllIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIllllII(int n2) {
        return n2 < 0;
    }

    private static int lIllIIllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String ag() {
        return h + dc;
    }

    private static boolean lIllIIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static void Q() {
        block63: {
            d lIIlIllIIllIlI;
            block62: {
                block61: {
                    block60: {
                        block59: {
                            block58: {
                                block57: {
                                    block56: {
                                        Object lIIlIllIIllIll;
                                        block55: {
                                            block54: {
                                                block53: {
                                                    block52: {
                                                        block51: {
                                                            block50: {
                                                                block49: {
                                                                    block48: {
                                                                        block47: {
                                                                            block46: {
                                                                                block45: {
                                                                                    block44: {
                                                                                        block43: {
                                                                                            block42: {
                                                                                                block41: {
                                                                                                    block40: {
                                                                                                        int[] nArray = new int[llIlIIlII[0]];
                                                                                                        nArray[L.llIlIIlII[1]] = llIlIIlII[279];
                                                                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                                                                                        int[] nArray2 = new int[llIlIIlII[0]];
                                                                                                        nArray2[L.llIlIIlII[1]] = llIlIIlII[279];
                                                                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block41;
                                                                                                        int[] nArray3 = new int[llIlIIlII[0]];
                                                                                                        nArray3[L.llIlIIlII[1]] = llIlIIlII[279];
                                                                                                        if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray3).getQuantity(), llIlIIlII[19])) break block41;
                                                                                                    }
                                                                                                    lIIlIllIIllIll = new d(llIlIIlII[279], llIlIIlII[19], e.c(llIlIIlII[280], llIlIIlII[281]));
                                                                                                    bx.add((d)lIIlIllIIllIll);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray = new int[llIlIIlII[0]];
                                                                                                nArray[L.llIlIIlII[1]] = llIlIIlII[22];
                                                                                                if (L.lIllIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                    lIIlIllIIllIll = new d(llIlIIlII[22], llIlIIlII[5], llIlIIlII[282]);
                                                                                                    bx.add((d)lIIlIllIIllIll);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray4 = new int[llIlIIlII[0]];
                                                                                                nArray4[L.llIlIIlII[1]] = llIlIIlII[23];
                                                                                                if (L.lIllIIlllIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                                                                                    lIIlIllIIllIll = new d(llIlIIlII[23], llIlIIlII[0], llIlIIlII[282]);
                                                                                                    bx.add((d)lIIlIllIIllIll);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray5 = new int[llIlIIlII[0]];
                                                                                                nArray5[L.llIlIIlII[1]] = llIlIIlII[10];
                                                                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block42;
                                                                                                int[] nArray6 = new int[llIlIIlII[0]];
                                                                                                nArray6[L.llIlIIlII[1]] = llIlIIlII[10];
                                                                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block43;
                                                                                                int[] nArray7 = new int[llIlIIlII[0]];
                                                                                                nArray7[L.llIlIIlII[1]] = llIlIIlII[10];
                                                                                                if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray7).getQuantity(), llIlIIlII[11])) break block43;
                                                                                            }
                                                                                            lIIlIllIIllIll = new d(llIlIIlII[10], llIlIIlII[11], llIlIIlII[19]);
                                                                                            bx.add((d)lIIlIllIIllIll);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray = new int[llIlIIlII[0]];
                                                                                        nArray[L.llIlIIlII[1]] = llIlIIlII[17];
                                                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block44;
                                                                                        int[] nArray8 = new int[llIlIIlII[0]];
                                                                                        nArray8[L.llIlIIlII[1]] = llIlIIlII[17];
                                                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block45;
                                                                                        int[] nArray9 = new int[llIlIIlII[0]];
                                                                                        nArray9[L.llIlIIlII[1]] = llIlIIlII[17];
                                                                                        if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray9).getQuantity(), llIlIIlII[11])) break block45;
                                                                                    }
                                                                                    lIIlIllIIllIll = new d(llIlIIlII[17], llIlIIlII[11], llIlIIlII[19]);
                                                                                    bx.add((d)lIIlIllIIllIll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[llIlIIlII[0]];
                                                                                nArray[L.llIlIIlII[1]] = llIlIIlII[14];
                                                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block46;
                                                                                int[] nArray10 = new int[llIlIIlII[0]];
                                                                                nArray10[L.llIlIIlII[1]] = llIlIIlII[14];
                                                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block47;
                                                                                int[] nArray11 = new int[llIlIIlII[0]];
                                                                                nArray11[L.llIlIIlII[1]] = llIlIIlII[14];
                                                                                if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray11).getQuantity(), llIlIIlII[11])) break block47;
                                                                            }
                                                                            lIIlIllIIllIll = new d(llIlIIlII[14], llIlIIlII[11], llIlIIlII[19]);
                                                                            bx.add((d)lIIlIllIIllIll);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[llIlIIlII[0]];
                                                                        nArray[L.llIlIIlII[1]] = llIlIIlII[13];
                                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block48;
                                                                        int[] nArray12 = new int[llIlIIlII[0]];
                                                                        nArray12[L.llIlIIlII[1]] = llIlIIlII[13];
                                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block49;
                                                                        int[] nArray13 = new int[llIlIIlII[0]];
                                                                        nArray13[L.llIlIIlII[1]] = llIlIIlII[13];
                                                                        if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray13).getQuantity(), llIlIIlII[11])) break block49;
                                                                    }
                                                                    lIIlIllIIllIll = new d(llIlIIlII[13], llIlIIlII[11], llIlIIlII[19]);
                                                                    bx.add((d)lIIlIllIIllIll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llIlIIlII[0]];
                                                                nArray[L.llIlIIlII[1]] = llIlIIlII[15];
                                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block50;
                                                                int[] nArray14 = new int[llIlIIlII[0]];
                                                                nArray14[L.llIlIIlII[1]] = llIlIIlII[15];
                                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block51;
                                                                int[] nArray15 = new int[llIlIIlII[0]];
                                                                nArray15[L.llIlIIlII[1]] = llIlIIlII[15];
                                                                if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray15).getQuantity(), llIlIIlII[16])) break block51;
                                                            }
                                                            lIIlIllIIllIll = new d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]);
                                                            bx.add((d)lIIlIllIIllIll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIlIIlII[0]];
                                                        nArray[L.llIlIIlII[1]] = llIlIIlII[12];
                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                                        int[] nArray16 = new int[llIlIIlII[0]];
                                                        nArray16[L.llIlIIlII[1]] = llIlIIlII[12];
                                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray16) ? 1 : 0)) break block53;
                                                        int[] nArray17 = new int[llIlIIlII[0]];
                                                        nArray17[L.llIlIIlII[1]] = llIlIIlII[12];
                                                        if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray17).getQuantity(), llIlIIlII[11])) break block53;
                                                    }
                                                    lIIlIllIIllIll = new d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]);
                                                    bx.add((d)lIIlIllIIllIll);
                                                    0;
                                                }
                                                int[] nArray = new int[llIlIIlII[0]];
                                                nArray[L.llIlIIlII[1]] = llIlIIlII[12];
                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                                int[] nArray18 = new int[llIlIIlII[0]];
                                                nArray18[L.llIlIIlII[1]] = llIlIIlII[12];
                                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray18) ? 1 : 0)) break block55;
                                                int[] nArray19 = new int[llIlIIlII[0]];
                                                nArray19[L.llIlIIlII[1]] = llIlIIlII[12];
                                                if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray19).getQuantity(), llIlIIlII[11])) break block55;
                                            }
                                            lIIlIllIIllIll = new d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]);
                                            bx.add((d)lIIlIllIIllIll);
                                            0;
                                        }
                                        if (L.lIllIIlllIII(Bank.contains((Predicate)(lIIlIllIIllIll = item -> item.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]))) ? 1 : 0)) {
                                            lIIlIllIIllIlI = new d(llIlIIlII[284], llIlIIlII[9], llIlIIlII[285]);
                                            bx.add(lIIlIllIIllIlI);
                                            0;
                                        }
                                        int[] nArray = new int[llIlIIlII[0]];
                                        nArray[L.llIlIIlII[1]] = llIlIIlII[286];
                                        if (L.lIllIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            lIIlIllIIllIlI = new d(llIlIIlII[286], llIlIIlII[0], llIlIIlII[287]);
                                            bx.add(lIIlIllIIllIlI);
                                            0;
                                        }
                                        int[] nArray20 = new int[llIlIIlII[0]];
                                        nArray20[L.llIlIIlII[1]] = llIlIIlII[21];
                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray20) ? 1 : 0)) break block56;
                                        int[] nArray21 = new int[llIlIIlII[0]];
                                        nArray21[L.llIlIIlII[1]] = llIlIIlII[21];
                                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray21) ? 1 : 0)) break block57;
                                        int[] nArray22 = new int[llIlIIlII[0]];
                                        nArray22[L.llIlIIlII[1]] = llIlIIlII[21];
                                        if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray22).getQuantity(), llIlIIlII[7])) break block57;
                                    }
                                    lIIlIllIIllIlI = new d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]);
                                    bx.add(lIIlIllIIllIlI);
                                    0;
                                }
                                int[] nArray = new int[llIlIIlII[0]];
                                nArray[L.llIlIIlII[1]] = llIlIIlII[28];
                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block58;
                                int[] nArray23 = new int[llIlIIlII[0]];
                                nArray23[L.llIlIIlII[1]] = llIlIIlII[28];
                                if (!L.lIllIIllIllI(Bank.contains((int[])nArray23) ? 1 : 0)) break block59;
                                int[] nArray24 = new int[llIlIIlII[0]];
                                nArray24[L.llIlIIlII[1]] = llIlIIlII[28];
                                if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray24).getQuantity(), llIlIIlII[7])) break block59;
                            }
                            lIIlIllIIllIlI = new d(llIlIIlII[28], llIlIIlII[7], j.ch);
                            bx.add(lIIlIllIIllIlI);
                            0;
                        }
                        int[] nArray = new int[llIlIIlII[0]];
                        nArray[L.llIlIIlII[1]] = llIlIIlII[24];
                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block60;
                        int[] nArray25 = new int[llIlIIlII[0]];
                        nArray25[L.llIlIIlII[1]] = llIlIIlII[24];
                        if (!L.lIllIIllIllI(Bank.contains((int[])nArray25) ? 1 : 0)) break block61;
                        int[] nArray26 = new int[llIlIIlII[0]];
                        nArray26[L.llIlIIlII[1]] = llIlIIlII[24];
                        if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray26).getQuantity(), llIlIIlII[48])) break block61;
                    }
                    lIIlIllIIllIlI = new d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]);
                    bx.add(lIIlIllIIllIlI);
                    0;
                }
                int[] nArray = new int[llIlIIlII[0]];
                nArray[L.llIlIIlII[1]] = llIlIIlII[20];
                if (!L.lIllIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block62;
                int[] nArray27 = new int[llIlIIlII[0]];
                nArray27[L.llIlIIlII[1]] = llIlIIlII[20];
                if (!L.lIllIIllIllI(Bank.contains((int[])nArray27) ? 1 : 0)) break block63;
                int[] nArray28 = new int[llIlIIlII[0]];
                nArray28[L.llIlIIlII[1]] = llIlIIlII[20];
                if (!L.lIllIIllIlll(Bank.getFirst((int[])nArray28).getQuantity(), llIlIIlII[35])) break block63;
            }
            lIIlIllIIllIlI = new d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]);
            bx.add(lIIlIllIIllIlI);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cp() {
        void lIIlIllIlIlIll;
        WorldPoint lIIlIllIlIlIII;
        WorldArea lIIlIllIlIlIlI;
        WorldPoint[] lIIlIllIlIlIIl;
        WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
        if (L.lIllIIllIllI(L.cm() ? 1 : 0)) {
            e.l(llIlIIlII[23]);
            if (L.lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                if (L.lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                    if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[238]];
                        Movement.walkTo((WorldPoint)worldPoint);
                        0;
                        Time.sleepTicks((int)llIlIIlII[0]);
                        0;
                    }
                    if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIllIlIlIIl), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[239]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[240]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[168]]);
                        Time.sleepTicks((int)llIlIIlII[7]);
                        0;
                    }
                }
                if (L.lIllIIllIllI(lIIlIllIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint lIIlIllIlIIlIl;
                    TileObject lIIlIllIlIIlII;
                    lIIlIllIlIlIIl = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                    lIIlIllIlIlIII = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint lIIlIllIlIIlll = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                    TileObject lIIlIllIlIIllI = TileObjects.getNearest(arg_0 -> L.d((WorldPoint)lIIlIllIlIlIIl, arg_0));
                    if (L.lIllIIlllIlI(lIIlIllIlIIllI) && L.lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[241]];
                        lIIlIllIlIIllI.interact(llIIllIll[llIlIIlII[242]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                    if ((!L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIllIlIlIII) ? 1 : 0) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIllIlIIlll) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) && (L.lIllIIlllIlI(lIIlIllIlIIlII = TileObjects.getNearest(arg_0 -> L.c(lIIlIllIlIIlIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0))) && L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58]) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0))) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[243]];
                        lIIlIllIlIIlII.interact(llIIllIll[llIlIIlII[244]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                    if (L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                        if (L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) && L.lIllIIlllIlI(lIIlIllIlIIlII = TileObjects.getNearest(arg_0 -> L.b(lIIlIllIlIIlIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0)))) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[245]];
                            lIIlIllIlIIlII.interact(llIIllIll[llIlIIlII[246]]);
                            Time.sleepTicks((int)llIlIIlII[6]);
                            0;
                        }
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[247]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[248]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[249]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                }
            }
        }
        if (L.lIllIIllIllI(lIIlIllIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[250]];
            String[] stringArray = new String[llIlIIlII[0]];
            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[251]];
            TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[252]]);
            Time.sleepTicks((int)llIlIIlII[6]);
            0;
        }
        if (L.lIllIIlllIII(lIIlIllIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIllIIlllIII(L.cm() ? 1 : 0)) {
            lIIlIllIlIlIlI = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
            String[] stringArray = new String[llIlIIlII[0]];
            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[253]];
            if (L.lIllIIlllIlI(TileObjects.getNearest((String[])stringArray)) && L.lIllIIllIllI(lIIlIllIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[254]];
                String[] stringArray2 = new String[llIlIIlII[0]];
                stringArray2[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[255]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIllIll[llIlIIlII[256]]);
                Time.sleepTicks((int)llIlIIlII[6]);
                0;
            }
        }
        if (L.lIllIIllIllI((lIIlIllIlIlIlI = new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[257]];
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[294]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                    n2 = llIlIIlII[0];
                    0;
                    if (-1 >= 2) {
                        return false;
                    }
                } else {
                    n2 = llIlIIlII[1];
                }
                return n2 != 0;
            }).interact(llIIllIll[llIlIIlII[258]]);
            Time.sleepTicks((int)llIlIIlII[6]);
            0;
        }
        WorldPoint[] worldPointArray = new WorldPoint[llIlIIlII[46]];
        worldPointArray[L.llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[0]] = new WorldPoint(llIlIIlII[259], llIlIIlII[113], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[5]] = new WorldPoint(llIlIIlII[88], llIlIIlII[89], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[6]] = new WorldPoint(llIlIIlII[90], llIlIIlII[118], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[7]] = new WorldPoint(llIlIIlII[86], llIlIIlII[191], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[9]] = new WorldPoint(llIlIIlII[260], llIlIIlII[199], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[18]] = new WorldPoint(llIlIIlII[261], llIlIIlII[197], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[25]] = new WorldPoint(llIlIIlII[262], llIlIIlII[195], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[26]] = new WorldPoint(llIlIIlII[263], llIlIIlII[97], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[27]] = new WorldPoint(llIlIIlII[264], llIlIIlII[123], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[19]] = new WorldPoint(llIlIIlII[265], llIlIIlII[266], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[31]] = new WorldPoint(llIlIIlII[200], llIlIIlII[267], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[32]] = new WorldPoint(llIlIIlII[268], llIlIIlII[109], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[33]] = new WorldPoint(llIlIIlII[58], llIlIIlII[269], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[34]] = new WorldPoint(llIlIIlII[270], llIlIIlII[87], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[35]] = new WorldPoint(llIlIIlII[262], llIlIIlII[271], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[36]] = new WorldPoint(llIlIIlII[272], llIlIIlII[89], llIlIIlII[1]);
        lIIlIllIlIlIIl = worldPointArray;
        if (L.lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lIIlIllIlIlIII = new WorldPoint(llIlIIlII[128], llIlIIlII[129], llIlIIlII[1]);
            if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(lIIlIllIlIlIII), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[273]];
                if (L.lIllIIlllIlI(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[293]]))) && L.lIllIIlllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                }
                if (L.lIllIIllllIl(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[292]]))) && L.lIllIIllIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                }
                if (L.lIllIIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), llIlIIlII[136])) {
                    Walker.walkAlong(Arrays.asList(lIIlIllIlIlIIl), new HashMap());
                    0;
                    Time.sleepTicks((int)llIlIIlII[0]);
                    0;
                }
                if (L.lIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), llIlIIlII[136])) {
                    Walker.walkAlong(Arrays.asList(lIIlIllIlIlIIl), new HashMap());
                    0;
                    Time.sleepTicks((int)llIlIIlII[0]);
                    0;
                }
            }
            if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[272], llIlIIlII[89], llIlIIlII[1])), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[274]];
                String[] stringArray = new String[llIlIIlII[0]];
                stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[275]];
                TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[276]]);
                Time.sleepTicks((int)llIlIIlII[6]);
                0;
            }
        }
    }

    private static boolean lIllIIllIllI(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean l(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[327]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (3 > (0x29 ^ 0x3B ^ (0x37 ^ 0x21))) {
                return false;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static String lIlIllIllIlI(String lIIlIlIIlIlIlI, String lIIlIlIIlIlIIl) {
        lIIlIlIIlIlIlI = new String(Base64.getDecoder().decode(lIIlIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIlIIlIllIl = new StringBuilder();
        char[] lIIlIlIIlIllII = lIIlIlIIlIlIIl.toCharArray();
        int lIIlIlIIlIlIll = llIlIIlII[1];
        char[] lIIlIlIIlIIlIl = lIIlIlIIlIlIlI.toCharArray();
        int lIIlIlIIlIIlII = lIIlIlIIlIIlIl.length;
        int lIIlIlIIlIIIll = llIlIIlII[1];
        while (L.lIllIIllIlll(lIIlIlIIlIIIll, lIIlIlIIlIIlII)) {
            char lIIlIlIIllIIII = lIIlIlIIlIIlIl[lIIlIlIIlIIIll];
            lIIlIlIIlIllIl.append((char)(lIIlIlIIllIIII ^ lIIlIlIIlIllII[lIIlIlIIlIlIll % lIIlIlIIlIllII.length]));
            0;
            ++lIIlIlIIlIlIll;
            ++lIIlIlIIlIIIll;
            0;
            if (((0xF2 ^ 0x91) & ~(0xFB ^ 0x98)) == 0) continue;
            return null;
        }
        return String.valueOf(lIIlIlIIlIllIl);
    }

    private static /* synthetic */ boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[296]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean m(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[328]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (2 < 0) {
                return ((0x71 ^ 0x75 ^ (0xD ^ 1)) & (0x50 ^ 0x4F ^ (0xD3 ^ 0xC4) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    public static boolean cq() {
        boolean bl;
        if (!L.lIllIIlllIII(gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !L.lIllIIlllIII(gd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || L.lIllIIllIllI(gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = llIlIIlII[0];
            0;
            if ((2 & ~2) != 0) {
                return false;
            }
        } else {
            bl = llIlIIlII[1];
        }
        return bl;
    }

    private static void lIllIIllIlII() {
        llIlIIlII = new int[345];
        L.llIlIIlII[0] = 1;
        L.llIlIIlII[1] = (0x89 ^ 0xAA) & ~(0x8E ^ 0xAD);
        L.llIlIIlII[2] = 0x14 ^ 0x77 ^ (0x8D ^ 0xC5);
        L.llIlIIlII[3] = 0xFFFFA1FE & 0x5F3B;
        L.llIlIIlII[4] = 0xDF ^ 0x8F;
        L.llIlIIlII[5] = 2;
        L.llIlIIlII[6] = 3;
        L.llIlIIlII[7] = 0x4E ^ 0x38 ^ (0x73 ^ 1);
        L.llIlIIlII[8] = 0xFFFF93BD & 0x7FCA;
        L.llIlIIlII[9] = 0xA1 ^ 0xB6 ^ (8 ^ 0x1A);
        L.llIlIIlII[10] = 0xFFFF9EBE & 0x636D;
        L.llIlIIlII[11] = -(0xFFFFF116 & 0x6EEF) & (0xFFFFE3ED & Short.MAX_VALUE);
        L.llIlIIlII[12] = 0xFFFFB73E & 0x4AEF;
        L.llIlIIlII[13] = 0xFFFF933B & 0x6EEF;
        L.llIlIIlII[14] = 0xFFFF8A2F & 0x77FD;
        L.llIlIIlII[15] = 0xFFFFDBB7 & 0x267A;
        L.llIlIIlII[16] = (0x9E ^ 0x9B) + 2 - -(0x5D ^ 0x21) + (0x42 ^ 7);
        L.llIlIIlII[17] = -(0xFFFFBC56 & 0x47FB) & (0xFFFFD67F & 0x2FFB);
        L.llIlIIlII[18] = 0x93 ^ 0x95;
        L.llIlIIlII[19] = 0xA4 ^ 0xAE;
        L.llIlIIlII[20] = 0xFFFF9FEF & 0x7F57;
        L.llIlIIlII[21] = -(0xFFFFF67E & 0x4FF3) & (0xFFFFCFF3 & Short.MAX_VALUE);
        L.llIlIIlII[22] = 0xFFFFCF0F & 0x3FFD;
        L.llIlIIlII[23] = -(0xFFFFDFFB & 0x73DF) & (0xFFFFFFFF & 0x5FFB);
        L.llIlIIlII[24] = 0xFFFFB193 & 0x4FED;
        L.llIlIIlII[25] = 0xBB ^ 0xBC;
        L.llIlIIlII[26] = 111 + 113 - 193 + 143 ^ 110 + 25 - 92 + 123;
        L.llIlIIlII[27] = 0x66 ^ 0x6F;
        L.llIlIIlII[28] = -(0xFFFFF3E7 & 0x4E39) & (0xFFFFFBFF & 0x7771);
        L.llIlIIlII[29] = 0x8B ^ 0xB9;
        L.llIlIIlII[30] = 106 + 132 - 188 + 115 ^ 31 + 78 - 13 + 93;
        L.llIlIIlII[31] = 0xBA ^ 0xB1;
        L.llIlIIlII[32] = 0x84 ^ 0x88;
        L.llIlIIlII[33] = 0xCE ^ 0xC3;
        L.llIlIIlII[34] = 0x9D ^ 0x93;
        L.llIlIIlII[35] = 0xAF ^ 0x86 ^ (0x8B ^ 0xAD);
        L.llIlIIlII[36] = 0x5A ^ 0x4A;
        L.llIlIIlII[37] = -(0xFFFFF9FF & 0x16AB) & (0xFFFFDBFB & 0x3FFF);
        L.llIlIIlII[38] = 0xFFFF9E1B & 0x6FF5;
        L.llIlIIlII[39] = 0x52 ^ 0x2F ^ (0xCA ^ 0xA9);
        L.llIlIIlII[40] = 178 + 95 - 233 + 150 ^ 145 + 64 - 158 + 113;
        L.llIlIIlII[41] = -(0xFFFF91FD & 0x7E83) & (0xFFFF9FBF & 0x7BDF);
        L.llIlIIlII[42] = -(0xFFFFDFE5 & 0x313B) & (0xFFFFDFFE & 0x3F3D);
        L.llIlIIlII[43] = 98 + 63 - 138 + 140 ^ 66 + 64 - -43 + 4;
        L.llIlIIlII[44] = 0xFFFFAFFF & 0x5B28;
        L.llIlIIlII[45] = 0xFFFFCFFB & 0x3E1D;
        L.llIlIIlII[46] = 0x9F ^ 0x8E;
        L.llIlIIlII[47] = 59 + 81 - 34 + 31 ^ 102 + 38 - 94 + 108;
        L.llIlIIlII[48] = 2 ^ 0x16;
        L.llIlIIlII[49] = -(0xFFFFDED5 & 0x256F) & (0xFFFFDF6D & 0x2FFF);
        L.llIlIIlII[50] = -(0xFFFFA5D1 & 0x7B2F) & (0xFFFFBF3F & 0x6FEB);
        L.llIlIIlII[51] = -(0xFFFFBD93 & 0x56FF) & (0xFFFF9FFF & 0x7FBF);
        L.llIlIIlII[52] = 0xFFFF8E7F & 0x7FAA;
        L.llIlIIlII[53] = -(0xFFFFF69F & 0x7DE1) & (0xFFFFFFEE & 0x7FBD);
        L.llIlIIlII[54] = 0x3A ^ 0x2F;
        L.llIlIIlII[55] = 0xDB ^ 0xAE ^ (0xA4 ^ 0xC7);
        L.llIlIIlII[56] = 0xFFFFBB3D & 0x4FFF;
        L.llIlIIlII[57] = 0xFFFF9EE7 & 0x6F3F;
        L.llIlIIlII[58] = 0xFFFFBF7F & 0x4BBE;
        L.llIlIIlII[59] = 0xFFFFAF6F & 0x5EB6;
        L.llIlIIlII[60] = 0x7F ^ 0x68;
        L.llIlIIlII[61] = -(0xFFFFEC15 & 0x53EB) & (0xFFFFEB7F & 0x5FBF);
        L.llIlIIlII[62] = 0x30 ^ 0x29;
        L.llIlIIlII[63] = 0x73 ^ 0x68;
        L.llIlIIlII[64] = 0xD6 ^ 0x9B ^ (0xE2 ^ 0xB3);
        L.llIlIIlII[65] = 0xAB ^ 0xAC ^ (0x28 ^ 0x32);
        L.llIlIIlII[66] = -(0xFFFFF907 & 0x37F9) & (0xFFFFFFE7 & 0x3F3B);
        L.llIlIIlII[67] = 169 + 66 - 233 + 184 ^ 103 + 1 - 72 + 133;
        L.llIlIIlII[68] = 0x11 ^ 0x31;
        L.llIlIIlII[69] = 136 + 36 - 154 + 149 ^ 95 + 124 - 212 + 127;
        L.llIlIIlII[70] = 0x2B ^ 0x1B ^ (1 ^ 0x12);
        L.llIlIIlII[71] = 0x45 ^ 0x67;
        L.llIlIIlII[72] = 0x74 ^ 0x3C ^ (0xF9 ^ 0x95);
        L.llIlIIlII[73] = 0xFFFF9E3F & 0x6FED;
        L.llIlIIlII[74] = 38 + 24 - 59 + 149 ^ 119 + 156 - 92 + 6;
        L.llIlIIlII[75] = 0x61 ^ 0x47;
        L.llIlIIlII[76] = 0x24 ^ 3;
        L.llIlIIlII[77] = 0xBA ^ 0x92;
        L.llIlIIlII[78] = -(0xFFFFC72F & 0x3CF5) & (0xFFFFDFF7 & 0x2F7F);
        L.llIlIIlII[79] = -(0xFFFFCD0F & 0x7AFD) & (0xFFFFFF6F & 0x6FBE);
        L.llIlIIlII[80] = 0x9D ^ 0xB4;
        L.llIlIIlII[81] = 0xAE ^ 0x84;
        L.llIlIIlII[82] = 0xFFFF8F5F & 0x7BFC;
        L.llIlIIlII[83] = -(0xFFFFE987 & 0x77F9) & (0xFFFFFFFF & 0x6FC7);
        L.llIlIIlII[84] = -(0xFFFFD06A & 0x6F97) & (0xFFFFDBFF & 0x6F5F);
        L.llIlIIlII[85] = -(0xFFFFF9FB & 0x3785) & (0xFFFFBFEE & 0x7FDD);
        L.llIlIIlII[86] = -(0xFFFFB6FF & 0x6D16) & (0xFFFFEFF5 & 0x3F7F);
        L.llIlIIlII[87] = 0xFFFF8FF7 & 0x7E59;
        L.llIlIIlII[88] = 0xFFFFBF61 & 0x4BFF;
        L.llIlIIlII[89] = -(0xFFFFF16E & 0x3EBB) & (0xFFFFBFFF & 0x7E7F);
        L.llIlIIlII[90] = 0xFFFFEB7F & 0x1FE2;
        L.llIlIIlII[91] = -(0xFFFFB3EB & 0x6C15) & (0xFFFFBE7D & 0x6FDF);
        L.llIlIIlII[92] = -(0xFFFFC3DB & 0x7D3D) & (0xFFFFEF7B & 0x5FFF);
        L.llIlIIlII[93] = -(0xFFFFF49A & 0x5BF7) & (0xFFFFFFFF & 0x5EFB);
        L.llIlIIlII[94] = 0xFFFFAFFF & 0x5B5B;
        L.llIlIIlII[95] = -(0xFFFFE793 & 0x386D) & (0xFFFFEFFF & 0x3E6F);
        L.llIlIIlII[96] = 0xFFFFAFFD & 0x5B5B;
        L.llIlIIlII[97] = 0xFFFF8EFB & 0x7F77;
        L.llIlIIlII[98] = -(0xFFFFC57F & 0x7EAC) & (0xFFFFCF7F & Short.MAX_VALUE);
        L.llIlIIlII[99] = 0xFFFF9EF6 & 0x6F7F;
        L.llIlIIlII[100] = 0xFFFF8BFF & 0x7F4D;
        L.llIlIIlII[101] = 0xFFFFCF79 & 0x3EFE;
        L.llIlIIlII[102] = 0xFFFFEBE7 & 0x1F5F;
        L.llIlIIlII[103] = 0xFFFFCB43 & 0x3FFE;
        L.llIlIIlII[104] = 0xFFFFBF74 & 0x4EFF;
        L.llIlIIlII[105] = 0xFFFFCF3B & 0x3BFD;
        L.llIlIIlII[106] = -(0xFFFFFFDA & 0x6467) & (0xFFFFEF75 & Short.MAX_VALUE);
        L.llIlIIlII[107] = 0xFFFFAFFF & 0x5E66;
        L.llIlIIlII[108] = 0xFFFFEB33 & 0x1FFF;
        L.llIlIIlII[109] = -(0xFFFFB0EF & 0x7F1D) & (0xFFFFFE6D & 0x3FFF);
        L.llIlIIlII[110] = -(94 + 78 - 68 + 33) & (0xFFFFEBFB & 0x1FBE);
        L.llIlIIlII[111] = -(0xFFFFF5FD & 0x4B27) & (0xFFFFFFFF & 0x4F7F);
        L.llIlIIlII[112] = 0xFFFF9F3B & 0x6BF5;
        L.llIlIIlII[113] = -(0xFFFFC113 & 0x7FED) & (0xFFFFCF7F & 0x7FCE);
        L.llIlIIlII[114] = 0xFFFF8F7D & 0x7BA7;
        L.llIlIIlII[115] = -(0xFFFFED77 & 0x53AB) & (0xFFFFFF7F & 0x4FF7);
        L.llIlIIlII[116] = -(0xFFFFE5D3 & 0x1E7E) & (0xFFFFCFF7 & 0x3F7D);
        L.llIlIIlII[117] = 0xFFFFCF7F & 0x3EDA;
        L.llIlIIlII[118] = -(0xFFFF978E & 0x79FF) & (0xFFFFFFED & 0x1FFF);
        L.llIlIIlII[119] = -(0xFFFFBCFD & 0x63CB) & (0xFFFFBBFF & 0x6FEF);
        L.llIlIIlII[120] = 0xFFFFBEE7 & 0x4F7C;
        L.llIlIIlII[121] = -(0xFFFFF5DF & 0x4E71) & (0xFFFFCFFB & 0x7F7E);
        L.llIlIIlII[122] = -(0xFFFFF4CE & 0x6B33) & (0xFFFFFFFD & 0x6E6B);
        L.llIlIIlII[123] = -(0xFFFFEC54 & 0x53BF) & (0xFFFFCFFF & 0x7E7F);
        L.llIlIIlII[124] = -(0xFFFFFCFD & 0x37DF) & (0xFFFFFFFF & 0x3FFF);
        L.llIlIIlII[125] = -(0xFFFFFCCB & 0x1375) & (0xFFFF9F5E & 0x7BFF);
        L.llIlIIlII[126] = -(0xFFFFBFBB & 0x60D6) & (0xFFFFEEFF & 0x3FFF);
        L.llIlIIlII[127] = 0xFFFFBBFD & 0x4F1B;
        L.llIlIIlII[128] = -(0xFFFFD647 & 0x3DFA) & (0xFFFFBF5B & 0x5FFF);
        L.llIlIIlII[129] = 0xFFFFAEFF & 0x5F6B;
        L.llIlIIlII[130] = 18 + 63 - 45 + 199 ^ 134 + 88 - 133 + 110;
        L.llIlIIlII[131] = 7 ^ 0x27 ^ (0x68 ^ 0x65);
        L.llIlIIlII[132] = 0x58 ^ 0x76;
        L.llIlIIlII[133] = -(0xFFFF835D & 0x7FA3) & (0xFFFF8FFF & 0x7F3F);
        L.llIlIIlII[134] = 0xFFFFBB6F & 0x4F98;
        L.llIlIIlII[135] = 0xFFFFBFFE & 0x675F;
        L.llIlIIlII[136] = 0x94 ^ 0xBB;
        L.llIlIIlII[137] = 0x1C ^ 0x2C;
        L.llIlIIlII[138] = 0x30 ^ 1;
        L.llIlIIlII[139] = 0xFFFF9FBD & 0x6B5F;
        L.llIlIIlII[140] = 0xFFFFA7FB & 0x7F7F;
        L.llIlIIlII[141] = 14 + 102 - 21 + 36 ^ 63 + 156 - 43 + 0;
        L.llIlIIlII[142] = 125 + 86 - 158 + 102 ^ 137 + 172 - 172 + 38;
        L.llIlIIlII[143] = 0x4F ^ 0x7A;
        L.llIlIIlII[144] = 0x6A ^ 0x51 ^ (0xB8 ^ 0xB5);
        L.llIlIIlII[145] = 134 + 109 - 106 + 14 ^ 31 + 74 - -44 + 11;
        L.llIlIIlII[146] = 0x1D ^ 0x25;
        L.llIlIIlII[147] = 0xFFFF8F56 & 0x7BBB;
        L.llIlIIlII[148] = 0xFFFFA77B & 0x7FE6;
        L.llIlIIlII[149] = 0x88 ^ 0xB1;
        L.llIlIIlII[150] = 0xE ^ 0x1E ^ (0x1F ^ 0x35);
        L.llIlIIlII[151] = -(0xFFFFE7BF & 0x5BFD) & (0xFFFFFFFF & 0x4FFD);
        L.llIlIIlII[152] = 118 + 51 - 91 + 104 ^ 63 + 21 - -37 + 20;
        L.llIlIIlII[153] = 0x38 ^ 4;
        L.llIlIIlII[154] = 0x62 ^ 0x5F;
        L.llIlIIlII[155] = 0xFFFFFDC7 & 0xE78;
        L.llIlIIlII[156] = 0x76 ^ 0x2E ^ (0x4D ^ 0x2B);
        L.llIlIIlII[157] = 0x67 ^ 0x58;
        L.llIlIIlII[158] = -(0xFFFFF5AE & 0x7ED9) & (0xFFFFFFFF & 0x7FEF);
        L.llIlIIlII[159] = 0xFFFFCDFF & 0x3FF5;
        L.llIlIIlII[160] = 0x47 ^ 0x52 ^ (0xEC ^ 0xB9);
        L.llIlIIlII[161] = 0x16 ^ 0x30 ^ (0xD7 ^ 0xB0);
        L.llIlIIlII[162] = 0xFFFF9BFF & 0x6EFB;
        L.llIlIIlII[163] = 0xFFFFAFFD & 0x5DD6;
        L.llIlIIlII[164] = 0x48 ^ 0x1E;
        L.llIlIIlII[165] = 0x77 ^ 0x25 ^ (0x8F ^ 0x83);
        L.llIlIIlII[166] = -(0xFFFFDEF7 & 0x35AA) & (0xFFFFFFBF & 0x1FF9);
        L.llIlIIlII[167] = 0xFFFFEDDA & 0x1FF5;
        L.llIlIIlII[168] = 0x30 ^ 0x46;
        L.llIlIIlII[169] = 0xF1 ^ 0xC4 ^ (0x73 ^ 4);
        L.llIlIIlII[170] = 0x6D ^ 0x2E;
        L.llIlIIlII[171] = 0x2F ^ 0x6B;
        L.llIlIIlII[172] = 0xB7 ^ 0xBE ^ (0xD9 ^ 0x95);
        L.llIlIIlII[173] = 0x28 ^ 0x6E;
        L.llIlIIlII[174] = 0x74 ^ 0x27 ^ (0x47 ^ 0x53);
        L.llIlIIlII[175] = 0xFD ^ 0xB5;
        L.llIlIIlII[176] = 114 + 157 - 145 + 109 ^ 140 + 96 - 122 + 48;
        L.llIlIIlII[177] = 0xBF ^ 0xB1 ^ (5 ^ 0x41);
        L.llIlIIlII[178] = 200 + 111 - 231 + 133 ^ 153 + 50 - 137 + 92;
        L.llIlIIlII[179] = 0xEF ^ 0xA3;
        L.llIlIIlII[180] = 0x8F ^ 0xC2;
        L.llIlIIlII[181] = 97 + 121 - 114 + 132 ^ 59 + 120 - 69 + 52;
        L.llIlIIlII[182] = 0x4D ^ 6 ^ (0x9A ^ 0x9E);
        L.llIlIIlII[183] = 0x4F ^ 0x1E;
        L.llIlIIlII[184] = 177 + 65 - 118 + 93 ^ 71 + 120 - 156 + 104;
        L.llIlIIlII[185] = 0xBC ^ 0xA5 ^ (0x5C ^ 0x16);
        L.llIlIIlII[186] = 0x36 ^ 0x5C ^ (0xF ^ 0x31);
        L.llIlIIlII[187] = 118 + 177 - 249 + 171 ^ 52 + 58 - 89 + 119;
        L.llIlIIlII[188] = 0xC8 ^ 0x9F;
        L.llIlIIlII[189] = -(0xFFFFD0AD & 0x7FF7) & (0xFFFFDEFF & 0x7FF6);
        L.llIlIIlII[190] = 0xFFFFFFF3 & 0xB6F;
        L.llIlIIlII[191] = 0xFFFF9F7D & 0x6EEB;
        L.llIlIIlII[192] = 0xFFFFAF7D & 0x5EF2;
        L.llIlIIlII[193] = -(0xFFFFF127 & 0x5EF9) & (0xFFFFFBF7 & 0x5F7F);
        L.llIlIIlII[194] = 0xFFFFEBCB & 0x1F7F;
        L.llIlIIlII[195] = -(0xFFFF896F & 0x7799) & (0xFFFFBF7F & 0x4FFF);
        L.llIlIIlII[196] = -(0xFFFFF5CD & 0x3ABB) & (0xFFFFBBEC & 0x7FDF);
        L.llIlIIlII[197] = -(0xFFFFFFCB & 0x503F) & (0xFFFFDFFF & 0x7E7F);
        L.llIlIIlII[198] = 0xFFFFAFFE & 0x5B3B;
        L.llIlIIlII[199] = -(0xFFFFEBCF & 0x74B7) & (0xFFFFFFF7 & 0x6EFF);
        L.llIlIIlII[200] = -(0xFFFFE4E1 & 0x7FDF) & (0xFFFFEFF7 & Short.MAX_VALUE);
        L.llIlIIlII[201] = 0xFFFFFEFF & 0xF7B;
        L.llIlIIlII[202] = 0xFFFF8F7A & 0x7EFF;
        L.llIlIIlII[203] = -(0xFFFFF359 & 0x1CA7) & (0xFFFFFFFF & 0x1E7C);
        L.llIlIIlII[204] = 0xFFFFBBDF & 0x4F36;
        L.llIlIIlII[205] = 0xFFFF9F7D & 0x6EFF;
        L.llIlIIlII[206] = 0xFFFFAFB7 & 0x5B59;
        L.llIlIIlII[207] = -(0xFFFFECD3 & 0x533F) & (0xFFFFFFBB & 0x4ED7);
        L.llIlIIlII[208] = 0xFFFFAFAB & 0x5EDD;
        L.llIlIIlII[209] = 0xFFFFAFB7 & 0x5ED9;
        L.llIlIIlII[210] = 0xFFFF8FBB & 0x7EDE;
        L.llIlIIlII[211] = 0xFFFFAFDB & 0x5B37;
        L.llIlIIlII[212] = 0x44 ^ 0x1C;
        L.llIlIIlII[213] = 0x79 ^ 0x20;
        L.llIlIIlII[214] = 0x4E ^ 0x14;
        L.llIlIIlII[215] = 0xF8 ^ 0xBD ^ (9 ^ 0x17);
        L.llIlIIlII[216] = 135 + 185 - 173 + 57 ^ 87 + 70 - 14 + 1;
        L.llIlIIlII[217] = 0x11 ^ 0x4C;
        L.llIlIIlII[218] = 0x54 ^ 0xB;
        L.llIlIIlII[219] = 0xA0 ^ 0xC0;
        L.llIlIIlII[220] = 0xF9 ^ 0x98;
        L.llIlIIlII[221] = 0x39 ^ 0x74 ^ (0x40 ^ 0x6F);
        L.llIlIIlII[222] = 0x4E ^ 0x2D;
        L.llIlIIlII[223] = 0x4E ^ 0x60 ^ (0x47 ^ 0xD);
        L.llIlIIlII[224] = 0x3A ^ 0x5F;
        L.llIlIIlII[225] = 0xC7 ^ 0xC3 ^ (0x61 ^ 3);
        L.llIlIIlII[226] = 0x90 ^ 0x83 ^ (0xF6 ^ 0x82);
        L.llIlIIlII[227] = 0x99 ^ 0xC3 ^ (0x67 ^ 0x55);
        L.llIlIIlII[228] = 197 + 116 - 235 + 169 ^ 77 + 120 - 115 + 76;
        L.llIlIIlII[229] = 1 ^ 0x6B;
        L.llIlIIlII[230] = 0xC7 ^ 0xAC;
        L.llIlIIlII[231] = 0xF3 ^ 0x9F;
        L.llIlIIlII[232] = 0x94 ^ 0xA9 ^ (0x19 ^ 0x49);
        L.llIlIIlII[233] = 189 + 55 - 215 + 205 ^ 10 + 105 - 4 + 21;
        L.llIlIIlII[234] = 0x3A ^ 0x28 ^ (0x12 ^ 0x6F);
        L.llIlIIlII[235] = 0xF1 ^ 0x81;
        L.llIlIIlII[236] = 0xF6 ^ 0x86 ^ 1;
        L.llIlIIlII[237] = 58 + 186 - 23 + 19 ^ 91 + 84 - 100 + 55;
        L.llIlIIlII[238] = 0x6B ^ 0x18;
        L.llIlIIlII[239] = 0xDC ^ 0xA8;
        L.llIlIIlII[240] = 172 + 195 - 269 + 114 ^ 53 + 24 - -51 + 33;
        L.llIlIIlII[241] = 3 ^ 0x27 ^ (0xDB ^ 0x88);
        L.llIlIIlII[242] = 0x7D ^ 5;
        L.llIlIIlII[243] = 0x3E ^ 0x47;
        L.llIlIIlII[244] = 0x81 ^ 0xA2 ^ (0x47 ^ 0x1E);
        L.llIlIIlII[245] = 0xB6 ^ 0x9E ^ (0xFE ^ 0xAD);
        L.llIlIIlII[246] = 0x2C ^ 0x7B ^ (0xA9 ^ 0x82);
        L.llIlIIlII[247] = 0x71 ^ 0xC;
        L.llIlIIlII[248] = 0xD2 ^ 0xAC;
        L.llIlIIlII[249] = (0x10 ^ 0x61) + (0x7E ^ 0x63) - (0xFF ^ 0x8C) + (0xD8 ^ 0xBC);
        L.llIlIIlII[250] = (0x6C ^ 0x37) + (0xB4 ^ 0xA0) - (0xC1 ^ 0x9A) + (0x13 ^ 0x7F);
        L.llIlIIlII[251] = (0xFC ^ 0x95) + (0x7F ^ 0x2B) - (161 + 152 - 235 + 96) + (0xC1 ^ 0xB3);
        L.llIlIIlII[252] = (0xD5 ^ 0x87) + (0x21 ^ 0x47) - (0x12 ^ 0x4B) + (0x60 ^ 0x43);
        L.llIlIIlII[253] = (0x69 ^ 0x10) + (0x36 ^ 0x52) - (109 + 79 - 39 + 17) + (0x3A ^ 0x76);
        L.llIlIIlII[254] = 93 + 31 - 91 + 99;
        L.llIlIIlII[255] = (0xB5 ^ 0xA1) + (0x3A ^ 0xE) - -(0x20 ^ 0x14) + (0x80 ^ 0x89);
        L.llIlIIlII[256] = 97 + 29 - 89 + 97;
        L.llIlIIlII[257] = (0x35 ^ 0x5D) + (0x6A ^ 0x63) - (0x8F ^ 0x84) + (0x4E ^ 0x6F);
        L.llIlIIlII[258] = (0xC8 ^ 0xB1) + (0x76 ^ 0x14) - (148 + 118 - 201 + 101) + (0xC4 ^ 0x97);
        L.llIlIIlII[259] = 0xFFFFDBDF & 0x2F7F;
        L.llIlIIlII[260] = 0xFFFFFFFE & 0xB5B;
        L.llIlIIlII[261] = -(0xFFFFF6EF & 0x29BD) & (0xFFFFBBFF & 0x6FFE);
        L.llIlIIlII[262] = 0xFFFFEB6B & 0x1FDD;
        L.llIlIIlII[263] = 0xFFFFFFDD & 0xB63;
        L.llIlIIlII[264] = -(0xFFFFF46D & 0x4BD7) & (0xFFFFFBFF & 0x4F7F);
        L.llIlIIlII[265] = -(0xFFFFDEB3 & 0x75CD) & (0xFFFFFFFF & 0x5FB6);
        L.llIlIIlII[266] = -(0xFFFFEDBF & 0x73DB) & (0xFFFFEFFF & Short.MAX_VALUE);
        L.llIlIIlII[267] = -(0xFFFFB7FF & 0x68A1) & (0xFFFFFFFD & 0x2EFB);
        L.llIlIIlII[268] = -(0x58 ^ 0x5C) & (0xFFFFFBBF & 0xF7F);
        L.llIlIIlII[269] = 0xFFFFCE5F & 0x3FFC;
        L.llIlIIlII[270] = -(0xFFFFF3BF & 0x7CED) & (0xFFFFFFEF & 0x7BFF);
        L.llIlIIlII[271] = 0xFFFFBF5E & 0x4EF5;
        L.llIlIIlII[272] = -(0xFFFFF6A3 & 0x3DFD) & (0xFFFFFFEE & 0x3FFD);
        L.llIlIIlII[273] = 75 + 99 - 96 + 59;
        L.llIlIIlII[274] = (0xE2 ^ 0xAD) + (0x74 ^ 0x72) - -(0x5F ^ 0x79) + (0x4E ^ 0x41);
        L.llIlIIlII[275] = 106 + 62 - 151 + 122;
        L.llIlIIlII[276] = (0x72 ^ 0x22) + (0xC0 ^ 0xA3) - (71 + 42 - 88 + 141) + (31 + 24 - -10 + 62);
        L.llIlIIlII[277] = 4 + 36 - -3 + 98;
        L.llIlIIlII[278] = 71 + 21 - 13 + 63;
        L.llIlIIlII[279] = 0xFFFFFF7B & 0x1FCE;
        L.llIlIIlII[280] = -(0xFFFFFE8D & 0x6B77) & (0xFFFFEF7D & 0x7FFE);
        L.llIlIIlII[281] = 0xFFFFAEC4 & 0x577B;
        L.llIlIIlII[282] = 0xFFFFB66C & 0x5DF7;
        L.llIlIIlII[283] = 147 + 113 - 102 + 22;
        L.llIlIIlII[284] = -(0xFFFF93FC & 0x7C17) & (0xFFFFBEDF & Short.MAX_VALUE);
        L.llIlIIlII[285] = -(0xFFFF96DD & 0x7F3A) & (0xFFFFFFBF & 0x77FF);
        L.llIlIIlII[286] = -(0xFFFFB56F & 0x7ED7) & (0xFFFFFDFF & 0x3FD6);
        L.llIlIIlII[287] = -(0xFFFFF7DF & 0x2F6B) & (0xFFFFBFFA & Short.MAX_VALUE);
        L.llIlIIlII[288] = 0xFFFFBCAD & 0x7FDE;
        L.llIlIIlII[289] = -3 & (0xFFFFE3FE & 0x1FFF);
        L.llIlIIlII[290] = 0xFFFFA7FD & 0x5B86;
        L.llIlIIlII[291] = (0x53 ^ 0x66) + (0x17 ^ 0x6A) - (0x74 ^ 0x4C) + (0x78 ^ 0x6D);
        L.llIlIIlII[292] = (3 ^ 0x2E) + (49 + 117 - 75 + 51) - (7 ^ 0x4C) + (0x93 ^ 0xB3);
        L.llIlIIlII[293] = (0xDB ^ 0xBA) + (102 + 18 - -14 + 1) - (171 + 59 - 190 + 155) + (0xDA ^ 0xB6);
        L.llIlIIlII[294] = ((0x4D ^ 0x41) & ~(0xBA ^ 0xB6)) + (0x38 ^ 0x43) - (0x52 ^ 0x43) + (0x2A ^ 2);
        L.llIlIIlII[295] = -(0xFFFFFBBE & 0x5C43) & (0xFFFFFFBF & 0x7F73);
        L.llIlIIlII[296] = 92 + 90 - 112 + 77;
        L.llIlIIlII[297] = 32 + 38 - -60 + 18;
        L.llIlIIlII[298] = (0x19 ^ 0x6E) + (0x63 ^ 0x30) - (0x65 ^ 0x31) + (0xBB ^ 0xA4);
        L.llIlIIlII[299] = (0xE3 ^ 0x9A) + (0x26 ^ 3) - (0x5E ^ 0x70) + (0xAD ^ 0x8B);
        L.llIlIIlII[300] = 27 + 51 - 77 + 150;
        L.llIlIIlII[301] = (0x5D ^ 0x34) + (21 + 147 - 64 + 47) - (0xF1 ^ 0x83) + (0x40 ^ 0x4A);
        L.llIlIIlII[302] = 115 + 66 - 62 + 34;
        L.llIlIIlII[303] = 125 + 68 - 166 + 127;
        L.llIlIIlII[304] = 48 + 83 - 100 + 124;
        L.llIlIIlII[305] = (0x5E ^ 0x41) + (0xA2 ^ 0xB6) - -(0x6E ^ 0x4D) + (0xF3 ^ 0xB5);
        L.llIlIIlII[306] = (0xF9 ^ 0xB8) + (0xFA ^ 0xAF) - (0x6F ^ 0x63) + (0x9C ^ 0x8F);
        L.llIlIIlII[307] = 29 + 126 - 102 + 105;
        L.llIlIIlII[308] = 55 + 151 - 120 + 73;
        L.llIlIIlII[309] = 111 + 31 - 86 + 92 + (0x71 ^ 0x47) - (19 + 61 - -51 + 45) + (62 + 57 - 9 + 24);
        L.llIlIIlII[310] = 143 + 26 - 153 + 145;
        L.llIlIIlII[311] = 118 + 73 - 182 + 145 + (0x79 ^ 0x27) - (194 + 101 - 125 + 59) + (36 + 61 - -46 + 0);
        L.llIlIIlII[312] = 0xFFFFCB9E & 0x3F71;
        L.llIlIIlII[313] = 49 + 15 - -18 + 81;
        L.llIlIIlII[314] = 77 + 44 - 58 + 101;
        L.llIlIIlII[315] = (0x15 ^ 0x54) + (0x1F ^ 0x40) - (0x3C ^ 7) + (0x11 ^ 0x51);
        L.llIlIIlII[316] = 76 + 88 - 36 + 38;
        L.llIlIIlII[317] = (0x36 ^ 0x3E) + (0x98 ^ 0xA4) - (0x59 ^ 0x72) + (1 + 49 - -8 + 84);
        L.llIlIIlII[318] = (0xD2 ^ 0xB4) + (80 + 97 - 129 + 87) - (48 + 103 - -52 + 32) + (136 + 91 - 179 + 118);
        L.llIlIIlII[319] = 130 + 97 - 215 + 157;
        L.llIlIIlII[320] = (0xBC ^ 0x92) + (0 + 88 - -54 + 23) - (55 + 64 - -12 + 49) + (6 + 6 - -120 + 7);
        L.llIlIIlII[321] = (0x11 ^ 0x49) + (81 + 109 - 138 + 78) - (108 + 84 - 30 + 12) + (15 + 2 - -43 + 67);
        L.llIlIIlII[322] = 55 + 0 - -38 + 79;
        L.llIlIIlII[323] = 16 + 56 - 70 + 171;
        L.llIlIIlII[324] = 106 + 81 - 117 + 104;
        L.llIlIIlII[325] = 128 + 125 - 144 + 66;
        L.llIlIIlII[326] = 32 + 118 - 39 + 65;
        L.llIlIIlII[327] = 71 + 150 - 115 + 71;
        L.llIlIIlII[328] = (0x4D ^ 0x6B) + (0x5B ^ 0x14) - (0xE ^ 0x12) + (0xE1 ^ 0xB8);
        L.llIlIIlII[329] = -(0xFFFFF6B9 & 0x1DCF) & (0xFFFF9FDF & 0x7FBF);
        L.llIlIIlII[330] = -(0xFFFFD7B3 & 0x68FD) & (0xFFFFFEF7 & 0x4FFB);
        L.llIlIIlII[331] = 0xFFFFCB6E & 0x3F93;
        L.llIlIIlII[332] = -(0xFFFFFABF & 0x4D41) & (0xFFFFEF3F & Short.MAX_VALUE);
        L.llIlIIlII[333] = 0xFFFF8FCF & 0x7B33;
        L.llIlIIlII[334] = -(0xFFFFD0B7 & 0x7FFD) & (0xFFFFFFFD & 0x77F6);
        L.llIlIIlII[335] = -(0xFFFFD941 & 0x66FF) & (0xFFFFFFFF & 0x677E);
        L.llIlIIlII[336] = -(0xFFFFEECF & 0x7533) & (0xFFFFEF7F & 0x7FD2);
        L.llIlIIlII[337] = 0xFFFF8FFA & 0x7DCD;
        L.llIlIIlII[338] = 0xFFFFD93F & 0x27FD;
        L.llIlIIlII[339] = 56 + 36 - -74 + 13;
        L.llIlIIlII[340] = 95 + 180 - 194 + 100;
        L.llIlIIlII[341] = (7 ^ 0x4A) + (0x7E ^ 0x2A) - (83 + 55 - 13 + 11) + (0 + 99 - 32 + 90);
        L.llIlIIlII[342] = (6 ^ 0x1C) + (22 + 5 - 1 + 109) - (117 + 23 - 83 + 87) + (144 + 163 - 236 + 95);
        L.llIlIIlII[343] = 147 + 166 - 134 + 5;
        L.llIlIIlII[344] = (0x8A ^ 0x8D) + (0x72 ^ 0x46) - -(0xA8 ^ 0x90) + (0x1E ^ 0x58);
    }

    /*
     * WARNING - void declaration
     */
    public static void cn() {
        void lIIlIlllIIlIll;
        WorldPoint lIIlIlllIIlIII;
        WorldArea lIIlIlllIIlIlI;
        WorldPoint[] lIIlIlllIIlIIl;
        WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
        if (L.lIllIIllIllI(L.cm() ? 1 : 0)) {
            e.l(llIlIIlII[23]);
            if (L.lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                if (L.lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                    if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[169]];
                        Movement.walkTo((WorldPoint)worldPoint);
                        0;
                        Time.sleepTicks((int)llIlIIlII[0]);
                        0;
                    }
                    if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlllIIlIIl), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[170]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[171]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[172]]);
                        Time.sleepTicks((int)llIlIIlII[7]);
                        0;
                    }
                }
                if (L.lIllIIllIllI(lIIlIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint lIIlIlllIIIlIl;
                    TileObject lIIlIlllIIIlII;
                    lIIlIlllIIlIIl = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                    lIIlIlllIIlIII = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint lIIlIlllIIIlll = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                    TileObject lIIlIlllIIIllI = TileObjects.getNearest(arg_0 -> L.j((WorldPoint)lIIlIlllIIlIIl, arg_0));
                    if (L.lIllIIlllIlI(lIIlIlllIIIllI) && L.lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[173]];
                        lIIlIlllIIIllI.interact(llIIllIll[llIlIIlII[174]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                    if ((!L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlllIIlIII) ? 1 : 0) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlllIIIlll) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) && (L.lIllIIlllIlI(lIIlIlllIIIlII = TileObjects.getNearest(arg_0 -> L.i(lIIlIlllIIIlIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0))) && L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58]) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0))) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[175]];
                        lIIlIlllIIIlII.interact(llIIllIll[llIlIIlII[176]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                    if (L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                        if (L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) && L.lIllIIlllIlI(lIIlIlllIIIlII = TileObjects.getNearest(arg_0 -> L.h(lIIlIlllIIIlIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0)))) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[177]];
                            lIIlIlllIIIlII.interact(llIIllIll[llIlIIlII[178]]);
                            Time.sleepTicks((int)llIlIIlII[6]);
                            0;
                        }
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[179]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[180]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[181]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                }
            }
        }
        if (L.lIllIIllIllI(lIIlIlllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[182]];
            String[] stringArray = new String[llIlIIlII[0]];
            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[4]];
            TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[183]]);
            Time.sleepTicks((int)llIlIIlII[6]);
            0;
        }
        if (L.lIllIIlllIII(lIIlIlllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIllIIlllIII(L.cm() ? 1 : 0)) {
            lIIlIlllIIlIlI = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
            String[] stringArray = new String[llIlIIlII[0]];
            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[184]];
            if (L.lIllIIlllIlI(TileObjects.getNearest((String[])stringArray)) && L.lIllIIllIllI(lIIlIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[185]];
                String[] stringArray2 = new String[llIlIIlII[0]];
                stringArray2[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[186]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIllIll[llIlIIlII[187]]);
                Time.sleepTicks((int)llIlIIlII[6]);
                0;
            }
        }
        if (L.lIllIIllIllI((lIIlIlllIIlIlI = new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[164]];
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[307]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                    n2 = llIlIIlII[0];
                    0;
                    if (((0xC7 ^ 0x9C) & ~(0x13 ^ 0x48)) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIlIIlII[1];
                }
                return n2 != 0;
            }).interact(llIIllIll[llIlIIlII[188]]);
            Time.sleepTicks((int)llIlIIlII[6]);
            0;
        }
        WorldPoint[] worldPointArray = new WorldPoint[llIlIIlII[30]];
        worldPointArray[L.llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[0]] = new WorldPoint(llIlIIlII[84], llIlIIlII[85], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[5]] = new WorldPoint(llIlIIlII[86], llIlIIlII[189], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[6]] = new WorldPoint(llIlIIlII[88], llIlIIlII[117], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[7]] = new WorldPoint(llIlIIlII[190], llIlIIlII[118], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[9]] = new WorldPoint(llIlIIlII[86], llIlIIlII[191], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[18]] = new WorldPoint(llIlIIlII[82], llIlIIlII[192], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[25]] = new WorldPoint(llIlIIlII[193], llIlIIlII[104], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[26]] = new WorldPoint(llIlIIlII[37], llIlIIlII[99], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[27]] = new WorldPoint(llIlIIlII[194], llIlIIlII[195], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[19]] = new WorldPoint(llIlIIlII[196], llIlIIlII[197], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[31]] = new WorldPoint(llIlIIlII[61], llIlIIlII[95], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[32]] = new WorldPoint(llIlIIlII[198], llIlIIlII[123], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[33]] = new WorldPoint(llIlIIlII[105], llIlIIlII[199], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[34]] = new WorldPoint(llIlIIlII[200], llIlIIlII[195], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[35]] = new WorldPoint(llIlIIlII[110], llIlIIlII[201], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[36]] = new WorldPoint(llIlIIlII[53], llIlIIlII[202], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[46]] = new WorldPoint(llIlIIlII[114], llIlIIlII[201], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[43]] = new WorldPoint(llIlIIlII[125], llIlIIlII[203], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[47]] = new WorldPoint(llIlIIlII[204], llIlIIlII[205], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[48]] = new WorldPoint(llIlIIlII[206], llIlIIlII[207], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[54]] = new WorldPoint(llIlIIlII[206], llIlIIlII[208], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[55]] = new WorldPoint(llIlIIlII[206], llIlIIlII[209], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[60]] = new WorldPoint(llIlIIlII[147], llIlIIlII[210], llIlIIlII[1]);
        lIIlIlllIIlIIl = worldPointArray;
        if (L.lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lIIlIlllIIlIII = new WorldPoint(llIlIIlII[211], llIlIIlII[210], llIlIIlII[1]);
            if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(lIIlIlllIIlIII), llIlIIlII[26])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[212]];
                if (L.lIllIIlllIlI(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[306]]))) && L.lIllIIlllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                }
                if (L.lIllIIllllIl(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[305]]))) && L.lIllIIllIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                }
                Walker.walkAlong(Arrays.asList(lIIlIlllIIlIIl), new HashMap());
                0;
                Time.sleepTicks((int)llIlIIlII[0]);
                0;
            }
        }
    }

    private static /* synthetic */ boolean f(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[303]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if ((91 + 103 - 53 + 12 ^ 65 + 81 - 86 + 97) < 3) {
                return ((138 + 86 - 135 + 82 ^ 99 + 108 - 182 + 123) & (0x73 ^ 0x5B ^ (0x4A ^ 0x5D) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean g(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[304]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            if (-(1 + 65 - -28 + 34 ^ 124 + 126 - 181 + 63) > 0) {
                return ((0x54 ^ 0x12 ^ (0x45 ^ 0x3B)) & (0xA2 ^ 0xB5 ^ (0x66 ^ 0x49) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void co() {
        void lIIlIllIlllIll;
        WorldPoint lIIlIllIlllIII;
        WorldArea lIIlIllIlllIlI;
        WorldPoint[] lIIlIllIlllIIl;
        WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
        if (L.lIllIIllIllI(L.cm() ? 1 : 0)) {
            e.l(llIlIIlII[23]);
            if (L.lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                if (L.lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                    if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[213]];
                        Movement.walkTo((WorldPoint)worldPoint);
                        0;
                        Time.sleepTicks((int)llIlIIlII[0]);
                        0;
                    }
                    if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIllIlllIIl), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[214]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[215]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[216]]);
                        Time.sleepTicks((int)llIlIIlII[7]);
                        0;
                    }
                }
                if (L.lIllIIllIllI(lIIlIllIlllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint lIIlIllIllIlIl;
                    TileObject lIIlIllIllIlII;
                    lIIlIllIlllIIl = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                    lIIlIllIlllIII = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint lIIlIllIllIlll = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                    TileObject lIIlIllIllIllI = TileObjects.getNearest(arg_0 -> L.g((WorldPoint)lIIlIllIlllIIl, arg_0));
                    if (L.lIllIIlllIlI(lIIlIllIllIllI) && L.lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[217]];
                        lIIlIllIllIllI.interact(llIIllIll[llIlIIlII[165]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                    if ((!L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIllIlllIII) ? 1 : 0) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)lIIlIllIllIlll) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) && (L.lIllIIlllIlI(lIIlIllIllIlII = TileObjects.getNearest(arg_0 -> L.f(lIIlIllIllIlIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0))) && L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58]) || !L.lIllIIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0))) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[218]];
                        lIIlIllIllIlII.interact(llIIllIll[llIlIIlII[219]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                    if (L.lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                        if (L.lIllIIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) && L.lIllIIlllIlI(lIIlIllIllIlII = TileObjects.getNearest(arg_0 -> L.e(lIIlIllIllIlIl = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]), arg_0)))) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[220]];
                            lIIlIllIllIlII.interact(llIIllIll[llIlIIlII[221]]);
                            Time.sleepTicks((int)llIlIIlII[6]);
                            0;
                        }
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[222]];
                        String[] stringArray = new String[llIlIIlII[0]];
                        stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[223]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[224]]);
                        Time.sleepTicks((int)llIlIIlII[6]);
                        0;
                    }
                }
            }
        }
        if (L.lIllIIllIllI(lIIlIllIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[225]];
            String[] stringArray = new String[llIlIIlII[0]];
            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[226]];
            TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[227]]);
            Time.sleepTicks((int)llIlIIlII[6]);
            0;
        }
        if (L.lIllIIlllIII(lIIlIllIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIllIIlllIII(L.cm() ? 1 : 0)) {
            lIIlIllIlllIlI = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
            String[] stringArray = new String[llIlIIlII[0]];
            stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[228]];
            if (L.lIllIIlllIlI(TileObjects.getNearest((String[])stringArray)) && L.lIllIIllIllI(lIIlIllIlllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[229]];
                String[] stringArray2 = new String[llIlIIlII[0]];
                stringArray2[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[230]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIllIll[llIlIIlII[231]]);
                Time.sleepTicks((int)llIlIIlII[6]);
                0;
            }
        }
        if (L.lIllIIllIllI((lIIlIllIlllIlI = new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[232]];
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[301]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                    n2 = llIlIIlII[0];
                    0;
                    if ((0x27 ^ 0x65 ^ (0xC9 ^ 0x8F)) > (0xF8 ^ 0x8F ^ (0x5C ^ 0x2F))) {
                        return ((57 + 73 - -78 + 1 ^ 5 + 66 - 44 + 121) & (0x1C ^ 0x56 ^ (0xCC ^ 0xC3) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIIlII[1];
                }
                return n2 != 0;
            }).interact(llIIllIll[llIlIIlII[233]]);
            Time.sleepTicks((int)llIlIIlII[6]);
            0;
        }
        WorldPoint[] worldPointArray = new WorldPoint[llIlIIlII[67]];
        worldPointArray[L.llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[0]] = new WorldPoint(llIlIIlII[84], llIlIIlII[85], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[5]] = new WorldPoint(llIlIIlII[86], llIlIIlII[87], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[6]] = new WorldPoint(llIlIIlII[88], llIlIIlII[89], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[7]] = new WorldPoint(llIlIIlII[90], llIlIIlII[91], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[9]] = new WorldPoint(llIlIIlII[90], llIlIIlII[92], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[18]] = new WorldPoint(llIlIIlII[86], llIlIIlII[93], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[25]] = new WorldPoint(llIlIIlII[94], llIlIIlII[95], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[26]] = new WorldPoint(llIlIIlII[96], llIlIIlII[97], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[27]] = new WorldPoint(llIlIIlII[98], llIlIIlII[99], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[19]] = new WorldPoint(llIlIIlII[100], llIlIIlII[101], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[31]] = new WorldPoint(llIlIIlII[102], llIlIIlII[99], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[32]] = new WorldPoint(llIlIIlII[103], llIlIIlII[104], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[33]] = new WorldPoint(llIlIIlII[58], llIlIIlII[95], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[34]] = new WorldPoint(llIlIIlII[105], llIlIIlII[93], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[35]] = new WorldPoint(llIlIIlII[106], llIlIIlII[107], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[36]] = new WorldPoint(llIlIIlII[108], llIlIIlII[109], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[46]] = new WorldPoint(llIlIIlII[110], llIlIIlII[111], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[43]] = new WorldPoint(llIlIIlII[110], llIlIIlII[89], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[47]] = new WorldPoint(llIlIIlII[112], llIlIIlII[87], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[48]] = new WorldPoint(llIlIIlII[51], llIlIIlII[113], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[54]] = new WorldPoint(llIlIIlII[44], llIlIIlII[87], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[55]] = new WorldPoint(llIlIIlII[114], llIlIIlII[115], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[60]] = new WorldPoint(llIlIIlII[116], llIlIIlII[117], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[30]] = new WorldPoint(llIlIIlII[116], llIlIIlII[118], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[62]] = new WorldPoint(llIlIIlII[119], llIlIIlII[120], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[40]] = new WorldPoint(llIlIIlII[121], llIlIIlII[122], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[63]] = new WorldPoint(llIlIIlII[49], llIlIIlII[123], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[64]] = new WorldPoint(llIlIIlII[124], llIlIIlII[95], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[65]] = new WorldPoint(llIlIIlII[125], llIlIIlII[126], llIlIIlII[1]);
        worldPointArray[L.llIlIIlII[39]] = new WorldPoint(llIlIIlII[127], llIlIIlII[93], llIlIIlII[1]);
        lIIlIllIlllIIl = worldPointArray;
        if (L.lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lIIlIllIlllIII = new WorldPoint(llIlIIlII[128], llIlIIlII[129], llIlIIlII[1]);
            if (L.lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(lIIlIllIlllIII), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[234]];
                if (L.lIllIIlllIlI(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[300]]))) && L.lIllIIlllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                }
                if (L.lIllIIllllIl(NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIll[llIlIIlII[299]]))) && L.lIllIIllIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MISSILES);
                }
                Walker.walkAlong(Arrays.asList(lIIlIllIlllIIl), new HashMap());
                0;
                Time.sleepTicks((int)llIlIIlII[0]);
                0;
            }
            if (L.lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(lIIlIllIlllIII), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[235]];
                String[] stringArray = new String[llIlIIlII[0]];
                stringArray[L.llIlIIlII[1]] = llIIllIll[llIlIIlII[236]];
                TileObjects.getNearest((String[])stringArray).interact(llIIllIll[llIlIIlII[237]]);
                Time.sleepTicks((int)llIlIIlII[6]);
                0;
            }
        }
    }

    private static /* synthetic */ boolean e(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (L.lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[302]]) ? 1 : 0) && L.lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
            n2 = llIlIIlII[0];
            0;
            
            }
        } else {
            n2 = llIlIIlII[1];
        }
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return llIlIIlII[1];
    }
}

