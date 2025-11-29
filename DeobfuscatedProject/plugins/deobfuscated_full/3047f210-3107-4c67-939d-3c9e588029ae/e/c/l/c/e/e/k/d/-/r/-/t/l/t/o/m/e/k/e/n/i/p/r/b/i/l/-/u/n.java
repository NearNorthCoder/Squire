/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
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
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.V;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.W;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.X;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Y;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Z;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ab;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.k;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.p;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s;
import gg.squire.account.AccBuilderTempleTrek;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
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
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class n
implements S {
    public static /* synthetic */ WorldPoint cd;
    public static /* synthetic */ WorldPoint bZ;
    public static /* synthetic */ WorldPoint cb;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ int bX;
    private static /* synthetic */ int[] lllllIIlII;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ int ck;
    static /* synthetic */ WorldArea cj;
    public static /* synthetic */ WorldPoint cc;
    static /* synthetic */ WorldArea ci;
    static /* synthetic */ WorldPoint cf;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ WorldPoint bY;
    static /* synthetic */ WorldArea cg;
    public static /* synthetic */ WorldPoint ca;
    public static /* synthetic */ String h;
    private static /* synthetic */ String[] llllIllIlI;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ String cm;
    static /* synthetic */ WorldArea ch;

    private static String llIlIIIIllIIl(String var42, String var72) {
        try {
            SecretKeySpec var111 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var72.getBytes(StandardCharsets.UTF_8)), lllllIIlII[15]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lllllIIlII[4], var111);
            return new String(var11.doFinal(Base64.getDecoder().decode(var42.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    public static void av() {
        block170: {
            block171: {
                WorldPoint var60;
                BankLocation var47;
                block172: {
                    if (n.llIlIIlIIllll(bs ? 1 : 0)) {
                        b.a(bu);
                        if (n.llIlIIlIlIIII(bu.size(), lllllIIlII[0])) {
                            System.out.println(llllIllIlI[lllllIIlII[1]]);
                            bs = lllllIIlII[1];
                        }
                    }
                    if (!n.llIlIIlIlIIIl(bs ? 1 : 0)) break block170;
                    if (n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2])) {
                        cm = llllIllIlI[lllllIIlII[0]];
                        X.dE();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3])) {
                        cm = llllIllIlI[lllllIIlII[4]];
                        Z.es();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5])) {
                        cm = llllIllIlI[lllllIIlII[6]];
                        ab.eD();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7])) {
                        cm = llllIllIlI[lllllIIlII[8]];
                        W.ds();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7]) && n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), lllllIIlII[9])) {
                        cm = llllIllIlI[lllllIIlII[2]];
                        Y.ef();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllllIIlII[9]) && n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lllllIIlII[10])) {
                        cm = llllIllIlI[lllllIIlII[11]];
                        k.X();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllllIIlII[9]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllllIIlII[10]) && n.llIlIIlIlIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllllIIlII[12])) {
                        cm = llllIllIlI[lllllIIlII[13]];
                        V.dz();
                    }
                    if (n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllllIIlII[9]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllllIIlII[10]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllllIIlII[12]) && n.llIlIIlIlIIII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllllIIlII[14])) {
                        cm = llllIllIlI[lllllIIlII[15]];
                        p.aF();
                    }
                    if (n.llIlIIlIlIIIl(n.aa() ? 1 : 0) && n.llIlIIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllllIIlII[9]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllllIIlII[10]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllllIIlII[12]) && n.llIlIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllllIIlII[14])) {
                        cm = llllIllIlI[lllllIIlII[16]];
                        var47 = BankLocation.getNearest();
                        if (n.llIlIIlIlIIll(var47) && n.llIlIIlIlIIIl(var47.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[17]];
                            a.a(var47);
                        }
                        if (n.llIlIIlIlIIll(var47) && n.llIlIIlIIllll(var47.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (n.llIlIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIlII[18]);
                                0;
                            }
                            if (n.llIlIIlIIllll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[19]];
                                if (n.llIlIIlIlIlII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllllIIlII[8]);
                                    0;
                                }
                                if (n.llIlIIlIlIlII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllllIIlII[4]);
                                    0;
                                }
                                int[] nArray = new int[lllllIIlII[20]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[21];
                                nArray[n.lllllIIlII[0]] = lllllIIlII[22];
                                nArray[n.lllllIIlII[4]] = lllllIIlII[23];
                                nArray[n.lllllIIlII[6]] = lllllIIlII[24];
                                nArray[n.lllllIIlII[8]] = lllllIIlII[25];
                                nArray[n.lllllIIlII[2]] = lllllIIlII[26];
                                nArray[n.lllllIIlII[11]] = lllllIIlII[27];
                                nArray[n.lllllIIlII[13]] = lllllIIlII[28];
                                nArray[n.lllllIIlII[15]] = lllllIIlII[29];
                                nArray[n.lllllIIlII[16]] = lllllIIlII[30];
                                nArray[n.lllllIIlII[17]] = lllllIIlII[31];
                                nArray[n.lllllIIlII[19]] = lllllIIlII[32];
                                if (n.llIlIIlIlIIIl(e.b(nArray) ? 1 : 0)) {
                                    n.ae();
                                    System.out.println(llllIllIlI[lllllIIlII[20]]);
                                    bs = lllllIIlII[0];
                                    return;
                                }
                                int[] nArray2 = new int[lllllIIlII[0]];
                                nArray2[n.lllllIIlII[1]] = lllllIIlII[23];
                                if (n.llIlIIlIIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lllllIIlII[0]];
                                    nArray3[n.lllllIIlII[1]] = lllllIIlII[23];
                                    if (n.llIlIIlIlIIII(Bank.getFirst((int[])nArray3).getQuantity(), lllllIIlII[33])) {
                                        n.ae();
                                        System.out.println(llllIllIlI[lllllIIlII[34]]);
                                        bs = lllllIIlII[0];
                                        return;
                                    }
                                }
                                int[] nArray4 = new int[lllllIIlII[20]];
                                nArray4[n.lllllIIlII[1]] = lllllIIlII[21];
                                nArray4[n.lllllIIlII[0]] = lllllIIlII[22];
                                nArray4[n.lllllIIlII[4]] = lllllIIlII[23];
                                nArray4[n.lllllIIlII[6]] = lllllIIlII[24];
                                nArray4[n.lllllIIlII[8]] = lllllIIlII[25];
                                nArray4[n.lllllIIlII[2]] = lllllIIlII[26];
                                nArray4[n.lllllIIlII[11]] = lllllIIlII[27];
                                nArray4[n.lllllIIlII[13]] = lllllIIlII[28];
                                nArray4[n.lllllIIlII[15]] = lllllIIlII[29];
                                nArray4[n.lllllIIlII[16]] = lllllIIlII[30];
                                nArray4[n.lllllIIlII[17]] = lllllIIlII[31];
                                nArray4[n.lllllIIlII[19]] = lllllIIlII[32];
                                if (n.llIlIIlIIllll(e.b(nArray4) ? 1 : 0)) {
                                    a.a(lllllIIlII[21], lllllIIlII[17]);
                                    a.a(lllllIIlII[22], lllllIIlII[35]);
                                    a.a(lllllIIlII[23], lllllIIlII[17]);
                                    a.a(lllllIIlII[24], lllllIIlII[17]);
                                    a.a(lllllIIlII[25], lllllIIlII[4]);
                                    a.a(lllllIIlII[26], lllllIIlII[0]);
                                    a.a(lllllIIlII[27], lllllIIlII[0]);
                                    a.a(lllllIIlII[28], lllllIIlII[0]);
                                    a.a(lllllIIlII[29], lllllIIlII[0]);
                                    a.a(lllllIIlII[30], lllllIIlII[8]);
                                    a.a(lllllIIlII[31], lllllIIlII[0]);
                                    a.a(lllllIIlII[32], lllllIIlII[0]);
                                }
                            }
                        }
                    }
                    if (n.llIlIIlIIllll(Inventory.contains((int[])f.aU) ? 1 : 0) && n.llIlIIlIlIIII(Movement.getRunEnergy(), lllllIIlII[36])) {
                        Inventory.getFirst((int[])f.aU).interact(llllIllIlI[lllllIIlII[37]]);
                        Time.sleepTicks((int)lllllIIlII[0]);
                        0;
                    }
                    if (n.llIlIIlIIllll(n.aa() ? 1 : 0) && n.llIlIIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllllIIlII[2]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MINING), lllllIIlII[3]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlII[5]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllllIIlII[7]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllllIIlII[9]) && n.llIlIIlIlIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllllIIlII[10]) && n.llIlIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllllIIlII[14])) {
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[35]];
                        if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[38]];
                            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                if (n.llIlIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1]));
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                String[] stringArray2 = new String[lllllIIlII[0]];
                                stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[41]];
                                TileObjects.getNearest((String[])stringArray2).interact(llllIllIlI[lllllIIlII[42]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                                String[] stringArray3 = new String[lllllIIlII[0]];
                                stringArray3[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[43]];
                                TileObjects.getNearest((String[])stringArray3).interact(llllIllIlI[lllllIIlII[3]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                            }
                        }
                        String[] stringArray4 = new String[lllllIIlII[0]];
                        stringArray4[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[44]];
                        if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[5]];
                            g.a(llllIllIlI[lllllIIlII[45]], bQ);
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[17])) {
                        AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[46]];
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                            ck = lllllIIlII[1];
                            String[] stringArray = new String[lllllIIlII[0]];
                            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[47]];
                            if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray5 = new String[lllllIIlII[0]];
                                stringArray5[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[7]];
                                TileObjects.getNearest((String[])stringArray5).interact(llllIllIlI[lllllIIlII[48]]);
                                Time.sleepTicks((int)lllllIIlII[8]);
                                0;
                            }
                            String[] stringArray6 = new String[lllllIIlII[0]];
                            stringArray6[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[49]];
                            if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray6))) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[50]];
                                Movement.walkTo((WorldPoint)bY);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[33]];
                            if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                                String[] stringArray = new String[lllllIIlII[0]];
                                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[52]];
                                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[9]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                            }
                            g.a(bQ);
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[3])) {
                        AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[10]];
                        if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                            String[] stringArray = new String[lllllIIlII[0]];
                            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[53]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[54]]);
                            Time.sleepTicks((int)lllllIIlII[4]);
                            0;
                        }
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[33])) {
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[55]];
                        if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                            String[] stringArray7 = new String[lllllIIlII[0]];
                            stringArray7[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[56]];
                            String[] stringArray8 = new String[lllllIIlII[0]];
                            stringArray8[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[57]];
                            if (n.llIlIIlIlIIIl(TileObjects.getNearest((String[])stringArray7).hasAction(stringArray8) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[58]];
                                if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                                    String[] stringArray9 = new String[lllllIIlII[0]];
                                    stringArray9[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[12]];
                                    TileObjects.getNearest((String[])stringArray9).interact(llllIllIlI[lllllIIlII[59]]);
                                    Time.sleepTicks((int)lllllIIlII[4]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray10 = new String[lllllIIlII[0]];
                        stringArray10[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[60]];
                        if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray10))) {
                            String[] stringArray11 = new String[lllllIIlII[0]];
                            stringArray11[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[61]];
                            String[] stringArray12 = new String[lllllIIlII[0]];
                            stringArray12[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[62]];
                            if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray11).hasAction(stringArray12) ? 1 : 0)) {
                                String[] stringArray13 = new String[lllllIIlII[0]];
                                stringArray13[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[63]];
                                TileObjects.getNearest((String[])stringArray13).interact(llllIllIlI[lllllIIlII[64]]);
                                Time.sleepTicks((int)lllllIIlII[8]);
                                0;
                            }
                        }
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[12]) && n.llIlIIlIlIIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[65])) {
                        n.aB();
                        if (n.llIlIIlIIllll(cg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lllllIIlII[0]];
                                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[66]];
                                var47 = NPCs.getNearest((String[])stringArray);
                                if (n.llIlIIlIlIIll(var47)) {
                                    if (n.llIlIIlIIllll(Reachable.isInteractable((Locatable)var47) ? 1 : 0)) {
                                        g.a(llllIllIlI[lllllIIlII[67]], bQ);
                                    }
                                    if (n.llIlIIlIlIIIl(Reachable.isInteractable((Locatable)var47) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)var47.getWorldLocation());
                                        0;
                                        Time.sleepTicks((int)lllllIIlII[0]);
                                        0;
                                    }
                                }
                            }
                            g.a(bQ);
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[65])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(bZ), lllllIIlII[4])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[68]];
                            Movement.walkTo((WorldPoint)bZ);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                            g.a(bQ);
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(bZ), lllllIIlII[4])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[36]];
                            g.a(llllIllIlI[lllllIIlII[69]], bQ);
                        }
                    }
                    if (!n.llIlIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[70]) || n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[71])) {
                        n.aA();
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[72]) && n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[73]];
                            Movement.walkTo((WorldPoint)ca);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[74]];
                            g.a(llllIllIlI[lllllIIlII[75]], bQ);
                        }
                    }
                    if (!n.llIlIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[76]) || n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[77])) {
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[78]];
                            int[] nArray = new int[lllllIIlII[0]];
                            nArray[n.lllllIIlII[1]] = lllllIIlII[22];
                            if (n.llIlIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                                int[] nArray5 = new int[lllllIIlII[0]];
                                nArray5[n.lllllIIlII[1]] = lllllIIlII[22];
                                Inventory.getFirst((int[])nArray5).interact(llllIllIlI[lllllIIlII[79]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                            }
                        }
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
                            String[] stringArray = new String[lllllIIlII[0]];
                            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[80]];
                            if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lllllIIlII[0]];
                                stringArray14[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[81]];
                                if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray14))) {
                                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[82]];
                                    if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                        if (n.llIlIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1]));
                                        0;
                                        Time.sleepTicks((int)lllllIIlII[0]);
                                        0;
                                    }
                                    if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                        String[] stringArray15 = new String[lllllIIlII[0]];
                                        stringArray15[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[65]];
                                        TileObjects.getNearest((String[])stringArray15).interact(llllIllIlI[lllllIIlII[83]]);
                                        Time.sleepTicks((int)lllllIIlII[4]);
                                        0;
                                        String[] stringArray16 = new String[lllllIIlII[0]];
                                        stringArray16[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[84]];
                                        TileObjects.getNearest((String[])stringArray16).interact(llllIllIlI[lllllIIlII[85]]);
                                        Time.sleepTicks((int)lllllIIlII[4]);
                                        0;
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[86]];
                        if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[70]];
                            g.a(llllIllIlI[lllllIIlII[87]], bQ);
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[88])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(s.dp), lllllIIlII[8]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[89]];
                            String[] stringArray = new String[lllllIIlII[0]];
                            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[90]];
                            if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray))) {
                                int[] nArray = new int[lllllIIlII[0]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[23];
                                Inventory.getFirst((int[])nArray).interact(llllIllIlI[lllllIIlII[91]]);
                                Time.sleepTicks((int)lllllIIlII[2]);
                                0;
                            }
                            String[] stringArray17 = new String[lllllIIlII[0]];
                            stringArray17[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[71]];
                            if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray17))) {
                                String[] stringArray18 = new String[lllllIIlII[0]];
                                stringArray18[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[92]];
                                if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray18))) {
                                    String[] stringArray19 = new String[lllllIIlII[0]];
                                    stringArray19[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[93]];
                                    TileObjects.getNearest((String[])stringArray19).interact(llllIllIlI[lllllIIlII[94]]);
                                    Time.sleepTicks((int)lllllIIlII[6]);
                                    0;
                                }
                                Movement.walkTo((WorldPoint)s.dp);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(s.dp), lllllIIlII[17])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[95]];
                            g.a(llllIllIlI[lllllIIlII[96]], bQ);
                        }
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[97])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cb), lllllIIlII[6])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[98]];
                            Movement.walkTo((WorldPoint)cb);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cb), lllllIIlII[6]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[99]];
                            int[] nArray = new int[lllllIIlII[0]];
                            nArray[n.lllllIIlII[1]] = lllllIIlII[100];
                            TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[101]]);
                            Time.sleepTicks((int)lllllIIlII[4]);
                            0;
                        }
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[102])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(s.dp), lllllIIlII[8]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[103]];
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cb), lllllIIlII[17])) {
                                int[] nArray = new int[lllllIIlII[0]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[23];
                                Inventory.getFirst((int[])nArray).interact(llllIllIlI[lllllIIlII[72]]);
                                Time.sleepTicks((int)lllllIIlII[2]);
                                0;
                            }
                            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cb), lllllIIlII[17])) {
                                String[] stringArray = new String[lllllIIlII[0]];
                                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[104]];
                                if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                                    String[] stringArray20 = new String[lllllIIlII[0]];
                                    stringArray20[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[105]];
                                    TileObjects.getNearest((String[])stringArray20).interact(llllIllIlI[lllllIIlII[106]]);
                                    Time.sleepTicks((int)lllllIIlII[6]);
                                    0;
                                }
                                Movement.walkTo((WorldPoint)s.dp);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(s.dp), lllllIIlII[17])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[107]];
                            g.a(llllIllIlI[lllllIIlII[108]], bQ);
                        }
                    }
                    if (n.llIlIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[109]) && n.llIlIIlIlIIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[110])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(s.di), lllllIIlII[6])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[111]];
                            Movement.walkTo((WorldPoint)s.di);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(s.di), lllllIIlII[6])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[112]];
                            g.a(llllIllIlI[lllllIIlII[113]], bQ);
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[110])) {
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[114]];
                        if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[76]];
                            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                if (n.llIlIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1]));
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                String[] stringArray21 = new String[lllllIIlII[0]];
                                stringArray21[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[115]];
                                TileObjects.getNearest((String[])stringArray21).interact(llllIllIlI[lllllIIlII[116]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                                String[] stringArray22 = new String[lllllIIlII[0]];
                                stringArray22[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[117]];
                                TileObjects.getNearest((String[])stringArray22).interact(llllIllIlI[lllllIIlII[118]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                            }
                        }
                        String[] stringArray23 = new String[lllllIIlII[0]];
                        stringArray23[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[119]];
                        if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray23))) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[120]];
                            g.a(llllIllIlI[lllllIIlII[121]], bQ);
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[122])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                            String[] stringArray = new String[lllllIIlII[0]];
                            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[123]];
                            if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray24 = new String[lllllIIlII[0]];
                                stringArray24[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[124]];
                                TileObjects.getNearest((String[])stringArray24).interact(llllIllIlI[lllllIIlII[77]]);
                                Time.sleepTicks((int)lllllIIlII[8]);
                                0;
                            }
                            String[] stringArray25 = new String[lllllIIlII[0]];
                            stringArray25[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[125]];
                            if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray25)) && n.llIlIIlIIllll(ch.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[126]];
                                Movement.walkTo((WorldPoint)bY);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                            if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                                String[] stringArray = new String[lllllIIlII[0]];
                                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[127]];
                                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[128]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                            }
                            g.a(bQ);
                        }
                        if (!n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cf), lllllIIlII[33]) || n.llIlIIlIIllll(new WorldArea(lllllIIlII[129], lllllIIlII[130], lllllIIlII[13], lllllIIlII[20], lllllIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[131]];
                            if (n.llIlIIlIlIIIl(cg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                n.aB();
                            }
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
                            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[132]];
                                Movement.walkTo((WorldPoint)ca);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[133]];
                                g.a(llllIllIlI[lllllIIlII[134]], bQ);
                            }
                        }
                        n.aA();
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[135])) {
                        g.a(bQ);
                        if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            n.ay();
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[136])) {
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[137])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cc), lllllIIlII[6])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[138]];
                            Movement.walkTo((WorldPoint)cc);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cc), lllllIIlII[6])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[88]];
                            int[] nArray = new int[lllllIIlII[0]];
                            nArray[n.lllllIIlII[1]] = lllllIIlII[139];
                            int[] nArray6 = new int[lllllIIlII[0]];
                            nArray6[n.lllllIIlII[1]] = lllllIIlII[140];
                            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray6));
                            Time.sleepTicks((int)lllllIIlII[2]);
                            0;
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[141])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cd), lllllIIlII[6])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[142]];
                            Movement.walkTo((WorldPoint)cd);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cd), lllllIIlII[6]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[143]];
                            int[] nArray = new int[lllllIIlII[0]];
                            nArray[n.lllllIIlII[1]] = lllllIIlII[139];
                            int[] nArray7 = new int[lllllIIlII[0]];
                            nArray7[n.lllllIIlII[1]] = lllllIIlII[140];
                            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray7));
                            Time.sleepTicks((int)lllllIIlII[2]);
                            0;
                        }
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[144])) {
                        if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ce), lllllIIlII[6]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[145]];
                            Movement.walkTo((WorldPoint)ce);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ce), lllllIIlII[6]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            if (n.llIlIIlIlIIII(Prayers.getPoints(), lllllIIlII[47]) && n.llIlIIlIIllll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aR).interact(llllIllIlI[lllllIIlII[146]]);
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (n.llIlIIlIIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[147]];
                                int[] nArray = new int[lllllIIlII[0]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[139];
                                int[] nArray8 = new int[lllllIIlII[0]];
                                nArray8[n.lllllIIlII[1]] = lllllIIlII[140];
                                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray8));
                                Time.sleepTicks((int)lllllIIlII[2]);
                                0;
                            }
                        }
                        g.a(bQ);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[148]) && n.llIlIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[149])) {
                        // empty if block
                    }
                    if (!n.llIlIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[150]) || n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[151])) {
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[152]];
                        if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[33])) {
                            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ce), lllllIIlII[6]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[153]];
                                Movement.walkTo((WorldPoint)ce);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ce), lllllIIlII[6]) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                if (n.llIlIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                if (n.llIlIIlIIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[154]];
                                    int[] nArray = new int[lllllIIlII[0]];
                                    nArray[n.lllllIIlII[1]] = lllllIIlII[139];
                                    int[] nArray9 = new int[lllllIIlII[0]];
                                    nArray9[n.lllllIIlII[1]] = lllllIIlII[140];
                                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray9));
                                    Time.sleepTicks((int)lllllIIlII[2]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray26 = new String[lllllIIlII[0]];
                        stringArray26[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[155]];
                        if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ce), lllllIIlII[35])) {
                                int[] nArray = new int[lllllIIlII[0]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[22];
                                Inventory.getFirst((int[])nArray).interact(llllIllIlI[lllllIIlII[97]]);
                                Time.sleepTicks((int)lllllIIlII[2]);
                                0;
                            }
                            if (n.llIlIIlIIllll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                                if (n.llIlIIlIIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[156]];
                                Movement.walkTo((WorldPoint)bY);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            String[] stringArray27 = new String[lllllIIlII[0]];
                            stringArray27[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[157]];
                            if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray27)) && n.llIlIIlIIllll(ch.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[158]];
                                Movement.walkTo((WorldPoint)bY);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
                                if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                                    String[] stringArray28 = new String[lllllIIlII[0]];
                                    stringArray28[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[159]];
                                    TileObjects.getNearest((String[])stringArray28).interact(llllIllIlI[lllllIIlII[160]]);
                                    Time.sleepTicks((int)lllllIIlII[4]);
                                    0;
                                }
                                g.a(bQ);
                            }
                            if (!n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cf), lllllIIlII[33]) || n.llIlIIlIIllll(new WorldArea(lllllIIlII[129], lllllIIlII[130], lllllIIlII[13], lllllIIlII[20], lllllIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[161]];
                                if (n.llIlIIlIlIIIl(cg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    n.aB();
                                }
                            }
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
                                if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[162]];
                                    Movement.walkTo((WorldPoint)ca);
                                    0;
                                    Time.sleepTicks((int)lllllIIlII[0]);
                                    0;
                                }
                                if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[163]];
                                    g.a(llllIllIlI[lllllIIlII[164]], bQ);
                                }
                            }
                            n.aA();
                        }
                    }
                    if (!n.llIlIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[165]) || !n.llIlIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[166]) || n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[167])) {
                        n.ax();
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[168])) {
                        int[] nArray = new int[lllllIIlII[0]];
                        nArray[n.lllllIIlII[1]] = lllllIIlII[169];
                        if (n.llIlIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            var47 = new WorldArea(lllllIIlII[170], lllllIIlII[171], lllllIIlII[4], lllllIIlII[13], lllllIIlII[1]);
                            if (n.llIlIIlIIllll(var47.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[102]];
                                String[] stringArray = new String[lllllIIlII[0]];
                                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[172]];
                                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[173]]);
                                Time.sleepTicks((int)lllllIIlII[8]);
                                0;
                            }
                            String[] stringArray = new String[lllllIIlII[0]];
                            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[174]];
                            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                                var60 = new WorldPoint(lllllIIlII[175], lllllIIlII[176], lllllIIlII[1]);
                                if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var60), lllllIIlII[4])) {
                                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[177]];
                                    Movement.walkTo((WorldPoint)var60);
                                    0;
                                    Time.sleepTicks((int)lllllIIlII[0]);
                                    0;
                                }
                                if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var60), lllllIIlII[4])) {
                                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[178]];
                                    int[] nArray10 = new int[lllllIIlII[0]];
                                    nArray10[n.lllllIIlII[1]] = lllllIIlII[169];
                                    Magic.cast((Spell)SpellBook.Standard.TELEKINETIC_GRAB, (TileItem)TileItems.getNearest((int[])nArray10));
                                    Time.sleepTicks((int)lllllIIlII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray11 = new int[lllllIIlII[0]];
                        nArray11[n.lllllIIlII[1]] = lllllIIlII[169];
                        if (n.llIlIIlIIllll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                            n.aw();
                            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[13]) && n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[179]];
                                Movement.walkTo((WorldPoint)ca);
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[17])) {
                                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[180]];
                                g.a(llllIllIlI[lllllIIlII[181]], bQ);
                            }
                        }
                    }
                    if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[182])) {
                        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[35])) {
                            int[] nArray = new int[lllllIIlII[0]];
                            nArray[n.lllllIIlII[1]] = lllllIIlII[22];
                            Inventory.getFirst((int[])nArray).interact(llllIllIlI[lllllIIlII[183]]);
                            Time.sleepTicks((int)lllllIIlII[2]);
                            0;
                        }
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[109]];
                        if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray)) && n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[33])) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[184]];
                            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                if (n.llIlIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1]));
                                0;
                                Time.sleepTicks((int)lllllIIlII[0]);
                                0;
                            }
                            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[39], lllllIIlII[40], lllllIIlII[1])) ? 1 : 0)) {
                                String[] stringArray29 = new String[lllllIIlII[0]];
                                stringArray29[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[185]];
                                TileObjects.getNearest((String[])stringArray29).interact(llllIllIlI[lllllIIlII[186]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                                String[] stringArray30 = new String[lllllIIlII[0]];
                                stringArray30[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[187]];
                                TileObjects.getNearest((String[])stringArray30).interact(llllIllIlI[lllllIIlII[188]]);
                                Time.sleepTicks((int)lllllIIlII[4]);
                                0;
                            }
                        }
                        String[] stringArray31 = new String[lllllIIlII[0]];
                        stringArray31[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[189]];
                        if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray31))) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[190]];
                            g.a(llllIllIlI[lllllIIlII[191]], bQ);
                        }
                    }
                    if (!n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[192])) break block171;
                    String[] stringArray = new String[lllllIIlII[0]];
                    stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[193]];
                    if (!n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block172;
                    String[] stringArray32 = new String[lllllIIlII[0]];
                    stringArray32[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[194]];
                    if (!n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray32) ? 1 : 0)) break block172;
                    String[] stringArray33 = new String[lllllIIlII[0]];
                    stringArray33[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[195]];
                    if (!n.llIlIIlIIllll(Inventory.contains((String[])stringArray33) ? 1 : 0)) break block171;
                }
                if (n.llIlIIlIlIIII(ck, lllllIIlII[0])) {
                    ac.lP += lllllIIlII[0];
                    ac.d(AccBuilderTempleTrek.m);
                    ck += lllllIIlII[0];
                    ac.lP = lllllIIlII[1];
                    cl = lllllIIlII[1];
                }
                if (n.llIlIIlIlIIll(Widgets.get((int)lllllIIlII[149]))) {
                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[196]];
                    String[] stringArray = new String[lllllIIlII[0]];
                    stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[197]];
                    if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray34 = new String[lllllIIlII[0]];
                        stringArray34[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[198]];
                        Inventory.getFirst((String[])stringArray34).interact(llllIllIlI[lllllIIlII[199]]);
                        Time.sleepTicks((int)lllllIIlII[8]);
                        0;
                    }
                    String[] stringArray35 = new String[lllllIIlII[0]];
                    stringArray35[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[200]];
                    if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                        String[] stringArray36 = new String[lllllIIlII[0]];
                        stringArray36[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[201]];
                        Inventory.getFirst((String[])stringArray36).interact(llllIllIlI[lllllIIlII[202]]);
                        Time.sleepTicks((int)lllllIIlII[8]);
                        0;
                    }
                    String[] stringArray37 = new String[lllllIIlII[0]];
                    stringArray37[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[203]];
                    if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[lllllIIlII[0]];
                        stringArray38[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[204]];
                        Inventory.getFirst((String[])stringArray38).interact(llllIllIlI[lllllIIlII[205]]);
                        Time.sleepTicks((int)lllllIIlII[8]);
                        0;
                    }
                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[206]];
                    var47 = Widgets.get((int)lllllIIlII[149], (int)lllllIIlII[16]);
                    if (n.llIlIIlIlIIll(var47)) {
                        var47.interact(llllIllIlI[lllllIIlII[207]]);
                        Time.sleepTicks((int)lllllIIlII[0]);
                        0;
                    }
                    if (n.llIlIIlIlIIll(var60 = Widgets.get((int)lllllIIlII[149], (int)lllllIIlII[7]))) {
                        var60.interact(llllIllIlI[lllllIIlII[208]]);
                        Time.sleepTicks((int)lllllIIlII[4]);
                        0;
                    }
                }
                Time.sleepTicks((int)lllllIIlII[4]);
                0;
            }
            if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[192])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[209]];
                if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray39 = new String[lllllIIlII[0]];
                    stringArray39[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[210]];
                    if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        String[] stringArray40 = new String[lllllIIlII[0]];
                        stringArray40[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[211]];
                        if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                            String[] stringArray41 = new String[lllllIIlII[0]];
                            stringArray41[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[212]];
                            if (!n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray41)) || n.llIlIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                if (n.llIlIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                int[] nArray = new int[lllllIIlII[0]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[21];
                                if (n.llIlIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray42 = new String[lllllIIlII[0]];
                                    stringArray42[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[213]];
                                    if (n.llIlIIlIlIIll(NPCs.getNearest((String[])stringArray42))) {
                                        int[] nArray12 = new int[lllllIIlII[0]];
                                        nArray12[n.lllllIIlII[1]] = lllllIIlII[21];
                                        Inventory.getFirst((int[])nArray12).interact(llllIllIlI[lllllIIlII[110]]);
                                        Time.sleepTicks((int)lllllIIlII[11]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            g.a(bQ);
        }
    }

    private static boolean llIlIIlIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIlIIlIIllII() {
        llllIllIlI = new String[lllllIIlII[622]];
        n.llllIllIlI[n.lllllIIlII[1]] = n."Finished buying items, switching back to quest";
        n.llllIllIlI[n.lllllIIlII[0]] = n."- Con";
        n.llllIllIlI[n.lllllIIlII[4]] = n."- Mining";
        n.llllIllIlI[n.lllllIIlII[6]] = n."- Thieving";
        n.llllIllIlI[n.lllllIIlII[8]] = n."- Agility";
        n.llllIllIlI[n.lllllIIlII[2]] = n."- Crafting";
        n.llllIllIlI[n.lllllIIlII[11]] = n."- Magic";
        n.llllIllIlI[n.lllllIIlII[13]] = n."- Str";
        n.llllIllIlI[n.lllllIIlII[15]] = n."- In Aid";
        n.llllIllIlI[n.lllllIIlII[16]] = n."";
        n.llllIllIlI[n.lllllIIlII[17]] = n."Nav to bank";
        n.llllIllIlI[n.lllllIIlII[19]] = n."Handling banking";
        n.llllIllIlI[n.lllllIIlII[20]] = n."We are missing quest supplies, switching to BUYING";
        n.llllIllIlI[n.lllllIIlII[34]] = n."We are missing quest supplies, switching to BUYING";
        n.llllIllIlI[n.lllllIIlII[37]] = n."Drink";
        n.llllIllIlI[n.lllllIIlII[35]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[38]] = n."Nav to pub";
        n.llllIllIlI[n.lllllIIlII[41]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[42]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[43]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[3]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[44]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[5]] = n."Talking to veliaf";
        n.llllIllIlI[n.lllllIIlII[45]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[46]] = n."Leaving base";
        n.llllIllIlI[n.lllllIIlII[47]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[7]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[48]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[49]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[50]] = n."Nav to boat";
        n.llllIllIlI[n.lllllIIlII[33]] = n."Fixing boat";
        n.llllIllIlI[n.lllllIIlII[52]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[9]] = n."Inspect";
        n.llllIllIlI[n.lllllIIlII[10]] = n."Fixing chute";
        n.llllIllIlI[n.lllllIIlII[53]] = n."Boat Chute";
        n.llllIllIlI[n.lllllIIlII[54]] = n."Inspect";
        n.llllIllIlI[n.lllllIIlII[55]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[56]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[57]] = n."Board";
        n.llllIllIlI[n.lllllIIlII[58]] = n."Handling boat";
        n.llllIllIlI[n.lllllIIlII[12]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[59]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[60]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[61]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[62]] = n."Board";
        n.llllIllIlI[n.lllllIIlII[63]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[64]] = n."Board";
        n.llllIllIlI[n.lllllIIlII[66]] = n."Meiyerditch citizen";
        n.llllIllIlI[n.lllllIIlII[67]] = n."Meiyerditch citizen";
        n.llllIllIlI[n.lllllIIlII[68]] = n."Nav to old man ral";
        n.llllIllIlI[n.lllllIIlII[36]] = n."talk npc";
        n.llllIllIlI[n.lllllIIlII[69]] = n."Old Man Ral";
        n.llllIllIlI[n.lllllIIlII[73]] = n."Run to base tile";
        n.llllIllIlI[n.lllllIIlII[74]] = n."Talk";
        n.llllIllIlI[n.lllllIIlII[75]] = n."Vertida Sefalatis";
        n.llllIllIlI[n.lllllIIlII[78]] = n."Tele to barrows";
        n.llllIllIlI[n.lllllIIlII[79]] = n."Break";
        n.llllIllIlI[n.lllllIIlII[80]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[81]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[82]] = n."Nav to pub";
        n.llllIllIlI[n.lllllIIlII[65]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[83]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[84]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[85]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[86]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[70]] = n."Talking to veliaf";
        n.llllIllIlI[n.lllllIIlII[87]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[89]] = n."Nav to Drezel";
        n.llllIllIlI[n.lllllIIlII[90]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[91]] = n."Break";
        n.llllIllIlI[n.lllllIIlII[71]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[92]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[93]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[94]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[95]] = n."Talk to drezel";
        n.llllIllIlI[n.lllllIIlII[96]] = n."Drezel";
        n.llllIllIlI[n.lllllIIlII[98]] = n."Nav to bush";
        n.llllIllIlI[n.lllllIIlII[99]] = n."Hiding";
        n.llllIllIlI[n.lllllIIlII[101]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[103]] = n."Nav to Drezel";
        n.llllIllIlI[n.lllllIIlII[72]] = n."Break";
        n.llllIllIlI[n.lllllIIlII[104]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[105]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[106]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[107]] = n."Talk to drezel";
        n.llllIllIlI[n.lllllIIlII[108]] = n."Drezel";
        n.llllIllIlI[n.lllllIIlII[111]] = n."Nav to king";
        n.llllIllIlI[n.lllllIIlII[112]] = n."talk king";
        n.llllIllIlI[n.lllllIIlII[113]] = n."King Roald";
        n.llllIllIlI[n.lllllIIlII[114]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[76]] = n."Nav to pub";
        n.llllIllIlI[n.lllllIIlII[115]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[116]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[117]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[118]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[119]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[120]] = n."Talking to veliaf";
        n.llllIllIlI[n.lllllIIlII[121]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[123]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[124]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[77]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[125]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[126]] = n."Nav to boat";
        n.llllIllIlI[n.lllllIIlII[127]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[128]] = n."Board";
        n.llllIllIlI[n.lllllIIlII[131]] = n."Nav back into city";
        n.llllIllIlI[n.lllllIIlII[132]] = n."Run to base tile";
        n.llllIllIlI[n.lllllIIlII[133]] = n."Talk";
        n.llllIllIlI[n.lllllIIlII[134]] = n."Vertida Sefalatis";
        n.llllIllIlI[n.lllllIIlII[138]] = n."Run to north side";
        n.llllIllIlI[n.lllllIIlII[88]] = n."Sketching";
        n.llllIllIlI[n.lllllIIlII[142]] = n."Run to west side";
        n.llllIllIlI[n.lllllIIlII[143]] = n."Sketching";
        n.llllIllIlI[n.lllllIIlII[145]] = n."Run to south side";
        n.llllIllIlI[n.lllllIIlII[146]] = n."Drink";
        n.llllIllIlI[n.lllllIIlII[147]] = n."Sketching";
        n.llllIllIlI[n.lllllIIlII[152]] = n."Castle sketch 3";
        n.llllIllIlI[n.lllllIIlII[153]] = n."Run to south side";
        n.llllIllIlI[n.lllllIIlII[154]] = n."Sketching";
        n.llllIllIlI[n.lllllIIlII[155]] = n."Castle sketch 3";
        n.llllIllIlI[n.lllllIIlII[97]] = n."Break";
        n.llllIllIlI[n.lllllIIlII[156]] = n."Nav to boat";
        n.llllIllIlI[n.lllllIIlII[157]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[158]] = n."Nav to boat";
        n.llllIllIlI[n.lllllIIlII[159]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[160]] = n."Board";
        n.llllIllIlI[n.lllllIIlII[161]] = n."Nav back into city";
        n.llllIllIlI[n.lllllIIlII[162]] = n."Run to base tile";
        n.llllIllIlI[n.lllllIIlII[163]] = n."Talk";
        n.llllIllIlI[n.lllllIIlII[164]] = n."Safalaan Hallow";
        n.llllIllIlI[n.lllllIIlII[102]] = n."Go down";
        n.llllIllIlI[n.lllllIIlII[172]] = n."Staircase";
        n.llllIllIlI[n.lllllIIlII[173]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[174]] = n."Lab table";
        n.llllIllIlI[n.lllllIIlII[177]] = n."Nav to grab tile";
        n.llllIllIlI[n.lllllIIlII[178]] = n."Telegrabbing";
        n.llllIllIlI[n.lllllIIlII[179]] = n."Run to base tile";
        n.llllIllIlI[n.lllllIIlII[180]] = n."Talk";
        n.llllIllIlI[n.lllllIIlII[181]] = n."Safalaan Hallow";
        n.llllIllIlI[n.lllllIIlII[183]] = n."Break";
        n.llllIllIlI[n.lllllIIlII[109]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[184]] = n."Nav to pub";
        n.llllIllIlI[n.lllllIIlII[185]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[186]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[187]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[188]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[189]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[190]] = n."Talking to veliaf";
        n.llllIllIlI[n.lllllIIlII[191]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[193]] = n."Tome of experience (3)";
        n.llllIllIlI[n.lllllIIlII[194]] = n."Tome of experience (2)";
        n.llllIllIlI[n.lllllIIlII[195]] = n."Tome of experience (1)";
        n.llllIllIlI[n.lllllIIlII[196]] = n."Rubbing book";
        n.llllIllIlI[n.lllllIIlII[197]] = n."Tome of experience (3)";
        n.llllIllIlI[n.lllllIIlII[198]] = n."Tome of experience (3)";
        n.llllIllIlI[n.lllllIIlII[199]] = n."Read";
        n.llllIllIlI[n.lllllIIlII[200]] = n."Tome of experience (2)";
        n.llllIllIlI[n.lllllIIlII[201]] = n."Tome of experience (2)";
        n.llllIllIlI[n.lllllIIlII[202]] = n."Read";
        n.llllIllIlI[n.lllllIIlII[203]] = n."Tome of experience (1)";
        n.llllIllIlI[n.lllllIIlII[204]] = n."Tome of experience (1)";
        n.llllIllIlI[n.lllllIIlII[205]] = n."Read";
        n.llllIllIlI[n.lllllIIlII[206]] = n."Selecting agility";
        n.llllIllIlI[n.lllllIIlII[207]] = n."Agility";
        n.llllIllIlI[n.lllllIIlII[208]] = n."Confirm";
        n.llllIllIlI[n.lllllIIlII[209]] = n."Tome of experience (3)";
        n.llllIllIlI[n.lllllIIlII[210]] = n."Tome of experience (2)";
        n.llllIllIlI[n.lllllIIlII[211]] = n."Tome of experience (1)";
        n.llllIllIlI[n.lllllIIlII[212]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[213]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[110]] = n."Break";
        n.llllIllIlI[n.lllllIIlII[226]] = n."Lab table";
        n.llllIllIlI[n.lllllIIlII[227]] = n."Go up";
        n.llllIllIlI[n.lllllIIlII[228]] = n."Staircase";
        n.llllIllIlI[n.lllllIIlII[229]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[230]] = n."Leave ladder area";
        n.llllIllIlI[n.lllllIIlII[231]] = n."Door";
        n.llllIllIlI[n.lllllIIlII[232]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[233]] = n."Exiting tape";
        n.llllIllIlI[n.lllllIIlII[234]] = n."Slashed tapestry";
        n.llllIllIlI[n.lllllIIlII[122]] = n."Slashed tapestry";
        n.llllIllIlI[n.lllllIIlII[235]] = n."Walk-through";
        n.llllIllIlI[n.lllllIIlII[236]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[240]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[241]] = n."Go up";
        n.llllIllIlI[n.lllllIIlII[242]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[243]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[244]] = n."Pushing wall";
        n.llllIllIlI[n.lllllIIlII[245]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[246]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[135]] = n."Go up";
        n.llllIllIlI[n.lllllIIlII[247]] = n."Stairs up";
        n.llllIllIlI[n.lllllIIlII[248]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[252]] = n."Walk to tile";
        n.llllIllIlI[n.lllllIIlII[254]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[136]] = n."Go down";
        n.llllIllIlI[n.lllllIIlII[255]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[256]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[257]] = n."Nav to tapestry";
        n.llllIllIlI[n.lllllIIlII[258]] = n."Use knife";
        n.llllIllIlI[n.lllllIIlII[137]] = n."Tapestry";
        n.llllIllIlI[n.lllllIIlII[259]] = n."Slashed tapestry";
        n.llllIllIlI[n.lllllIIlII[260]] = n."Slashed tapestry";
        n.llllIllIlI[n.lllllIIlII[261]] = n."Walk-through";
        n.llllIllIlI[n.lllllIIlII[262]] = n."Unlocking";
        n.llllIllIlI[n.lllllIIlII[263]] = n."Large ornate key";
        n.llllIllIlI[n.lllllIIlII[264]] = n."Vampyre statue";
        n.llllIllIlI[n.lllllIIlII[267]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[268]] = n."Go down";
        n.llllIllIlI[n.lllllIIlII[269]] = n."Staircase";
        n.llllIllIlI[n.lllllIIlII[141]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[270]] = n."Go down";
        n.llllIllIlI[n.lllllIIlII[271]] = n."Staircase";
        n.llllIllIlI[n.lllllIIlII[272]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[275]] = n."Go down";
        n.llllIllIlI[n.lllllIIlII[276]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[277]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[282]] = n."Nav to rubble";
        n.llllIllIlI[n.lllllIIlII[283]] = n."Climb rubble";
        n.llllIllIlI[n.lllllIIlII[284]] = n."Wall rubble";
        n.llllIllIlI[n.lllllIIlII[144]] = n."Climb-over";
        n.llllIllIlI[n.lllllIIlII[285]] = n."Climb up floor";
        n.llllIllIlI[n.lllllIIlII[286]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[287]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[303]] = n."Nav to ladder 1";
        n.llllIllIlI[n.lllllIIlII[304]] = n."Go down ";
        n.llllIllIlI[n.lllllIIlII[305]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[306]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[307]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[308]] = n."Rocky surface";
        n.llllIllIlI[n.lllllIIlII[148]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[309]] = n."Barricade";
        n.llllIllIlI[n.lllllIIlII[310]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[314]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[315]] = n."Go up ";
        n.llllIllIlI[n.lllllIIlII[316]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[317]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[319]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[320]] = n."Go up ";
        n.llllIllIlI[n.lllllIIlII[321]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[149]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[323]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[324]] = n."Go down ";
        n.llllIllIlI[n.lllllIIlII[325]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[326]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[330]] = n."Nav to wall";
        n.llllIllIlI[n.lllllIIlII[331]] = n."Go up ";
        n.llllIllIlI[n.lllllIIlII[332]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[333]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[337]] = n."Nav to npc";
        n.llllIllIlI[n.lllllIIlII[150]] = n."Talk";
        n.llllIllIlI[n.lllllIIlII[338]] = n."Safalaan Hallow";
        n.llllIllIlI[n.lllllIIlII[339]] = n."Veliaf Hurtz";
        n.llllIllIlI[n.lllllIIlII[340]] = n."Nav to boat";
        n.llllIllIlI[n.lllllIIlII[341]] = n."Boat";
        n.llllIllIlI[n.lllllIIlII[342]] = n."Board";
        n.llllIllIlI[n.lllllIIlII[343]] = n."Nav back into city";
        n.llllIllIlI[n.lllllIIlII[376]] = n."nav to ladder 1";
        n.llllIllIlI[n.lllllIIlII[377]] = n."Climb";
        n.llllIllIlI[n.lllllIIlII[378]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[151]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[379]] = n."Handling first floor board";
        n.llllIllIlI[n.lllllIIlII[381]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[382]] = n."Handling second floor board";
        n.llllIllIlI[n.lllllIIlII[384]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[385]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[386]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[387]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[388]] = n."Pushing wall";
        n.llllIllIlI[n.lllllIIlII[389]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[165]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[391]] = n."Walking across;";
        n.llllIllIlI[n.lllllIIlII[392]] = n."Walk-across";
        n.llllIllIlI[n.lllllIIlII[394]] = n."Walking across;";
        n.llllIllIlI[n.lllllIIlII[395]] = n."Walk-across";
        n.llllIllIlI[n.lllllIIlII[396]] = n."crawling under";
        n.llllIllIlI[n.lllllIIlII[397]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[398]] = n."Crawl-under";
        n.llllIllIlI[n.lllllIIlII[399]] = n."Push wall 2";
        n.llllIllIlI[n.lllllIIlII[400]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[166]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[401]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[402]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[403]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[404]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[405]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[406]] = n."Walk-across";
        n.llllIllIlI[n.lllllIIlII[407]] = n."Climbing down ladder";
        n.llllIllIlI[n.lllllIIlII[408]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[409]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[167]] = n."Handling trapdoor table";
        n.llllIllIlI[n.lllllIIlII[411]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[412]] = n."Trapdoor table";
        n.llllIllIlI[n.lllllIIlII[413]] = n."Table";
        n.llllIllIlI[n.lllllIIlII[414]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[415]] = n."Trapdoor table";
        n.llllIllIlI[n.lllllIIlII[416]] = n."Trapdoor table";
        n.llllIllIlI[n.lllllIIlII[417]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[418]] = n."Trapdoor table";
        n.llllIllIlI[n.lllllIIlII[419]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[168]] = n."Trapdoor tunnel";
        n.llllIllIlI[n.lllllIIlII[420]] = n."Trapdoor tunnel";
        n.llllIllIlI[n.lllllIIlII[421]] = n."Climb-into";
        n.llllIllIlI[n.lllllIIlII[422]] = n."Trapdoor tunnel";
        n.llllIllIlI[n.lllllIIlII[423]] = n."Climb-into";
        n.llllIllIlI[n.lllllIIlII[424]] = n."Climbing shelves";
        n.llllIllIlI[n.lllllIIlII[425]] = n."Shelf";
        n.llllIllIlI[n.lllllIIlII[426]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[427]] = n."Crawling under 2";
        n.llllIllIlI[n.lllllIIlII[428]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[182]] = n."Crawl-under";
        n.llllIllIlI[n.lllllIIlII[429]] = n."Cross floorbaord 3";
        n.llllIllIlI[n.lllllIIlII[431]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[432]] = n."Ladder 3";
        n.llllIllIlI[n.lllllIIlII[433]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[434]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[435]] = n."Getting key";
        n.llllIllIlI[n.lllllIIlII[436]] = n."Pots";
        n.llllIllIlI[n.lllllIIlII[437]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[438]] = n."Entering door";
        n.llllIllIlI[n.lllllIIlII[192]] = n."Door";
        n.llllIllIlI[n.lllllIIlII[439]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[440]] = n."Handling ladder";
        n.llllIllIlI[n.lllllIIlII[441]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[442]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[443]] = n."Cross floorbaord 4";
        n.llllIllIlI[n.lllllIIlII[445]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[446]] = n."Shelf 2";
        n.llllIllIlI[n.lllllIIlII[447]] = n."Shelf";
        n.llllIllIlI[n.lllllIIlII[448]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[449]] = n."ladder 5";
        n.llllIllIlI[n.lllllIIlII[450]] = n."Ladder 5";
        n.llllIllIlI[n.lllllIIlII[451]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[452]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[453]] = n."Cross floorbaord 5";
        n.llllIllIlI[n.lllllIIlII[455]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[456]] = n."ladder 6";
        n.llllIllIlI[n.lllllIIlII[457]] = n."Ladder 6";
        n.llllIllIlI[n.lllllIIlII[458]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[459]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[460]] = n."Washing line";
        n.llllIllIlI[n.lllllIIlII[461]] = n."Washing line";
        n.llllIllIlI[n.lllllIIlII[462]] = n."Walk-across";
        n.llllIllIlI[n.lllllIIlII[463]] = n."ladder 7";
        n.llllIllIlI[n.lllllIIlII[464]] = n."Ladder 7";
        n.llllIllIlI[n.lllllIIlII[465]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[466]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[467]] = n."Handling wall/floor";
        n.llllIllIlI[n.lllllIIlII[468]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[469]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[470]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[471]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[472]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[473]] = n."Walk-across";
        n.llllIllIlI[n.lllllIIlII[474]] = n."Shelf 3";
        n.llllIllIlI[n.lllllIIlII[475]] = n."Shelf";
        n.llllIllIlI[n.lllllIIlII[476]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[477]] = n."shelf 4";
        n.llllIllIlI[n.lllllIIlII[478]] = n."Shelf";
        n.llllIllIlI[n.lllllIIlII[479]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[482]] = n."floorboard 6";
        n.llllIllIlI[n.lllllIIlII[484]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[486]] = n."floorboard 7";
        n.llllIllIlI[n.lllllIIlII[488]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[491]] = n."floorboard 8";
        n.llllIllIlI[n.lllllIIlII[493]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[496]] = n."Broken ladder";
        n.llllIllIlI[n.lllllIIlII[497]] = n."Ladder top";
        n.llllIllIlI[n.lllllIIlII[498]] = n."Going up";
        n.llllIllIlI[n.lllllIIlII[499]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[500]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[501]] = n."Broken ladder";
        n.llllIllIlI[n.lllllIIlII[502]] = n."Ladder top";
        n.llllIllIlI[n.lllllIIlII[503]] = n."Fixing ladder";
        n.llllIllIlI[n.lllllIIlII[504]] = n."Broken ladder";
        n.llllIllIlI[n.lllllIIlII[505]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[507]] = n."Climbing down";
        n.llllIllIlI[n.lllllIIlII[508]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[509]] = n."Getting ladder piece";
        n.llllIllIlI[n.lllllIIlII[510]] = n."Ladder top";
        n.llllIllIlI[n.lllllIIlII[511]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[512]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[513]] = n."Ladder top";
        n.llllIllIlI[n.lllllIIlII[514]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[515]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[518]] = n."Large ornate key";
        n.llllIllIlI[n.lllllIIlII[519]] = n."Message";
        n.llllIllIlI[n.lllllIIlII[521]] = n."Nav to fireplace";
        n.llllIllIlI[n.lllllIIlII[522]] = n."Get key";
        n.llllIllIlI[n.lllllIIlII[523]] = n."Message";
        n.llllIllIlI[n.lllllIIlII[524]] = n."Fireplace";
        n.llllIllIlI[n.lllllIIlII[525]] = n."Fireplace";
        n.llllIllIlI[n.lllllIIlII[526]] = n."Large ornate key";
        n.llllIllIlI[n.lllllIIlII[527]] = n."Message";
        n.llllIllIlI[n.lllllIIlII[528]] = n."Portrait";
        n.llllIllIlI[n.lllllIIlII[529]] = n."Nav to ladder";
        n.llllIllIlI[n.lllllIIlII[530]] = n."Climbing up";
        n.llllIllIlI[n.lllllIIlII[531]] = n."Ladder";
        n.llllIllIlI[n.lllllIIlII[532]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[534]] = n."floorboard 9";
        n.llllIllIlI[n.lllllIIlII[536]] = n."Jump-to";
        n.llllIllIlI[n.lllllIIlII[537]] = n."Go down";
        n.llllIllIlI[n.lllllIIlII[538]] = n."Stairs down";
        n.llllIllIlI[n.lllllIIlII[539]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[540]] = n."Pushing wall";
        n.llllIllIlI[n.lllllIIlII[541]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[542]] = n."Wall";
        n.llllIllIlI[n.lllllIIlII[543]] = n."Push";
        n.llllIllIlI[n.lllllIIlII[544]] = n."Entering base";
        n.llllIllIlI[n.lllllIIlII[545]] = n."Lumpy rug";
        n.llllIllIlI[n.lllllIIlII[546]] = n."Decorated wall";
        n.llllIllIlI[n.lllllIIlII[547]] = n."Press";
        n.llllIllIlI[n.lllllIIlII[548]] = n."Lumpy rug";
        n.llllIllIlI[n.lllllIIlII[549]] = n."Lumpy rug";
        n.llllIllIlI[n.lllllIIlII[550]] = n."Open";
        n.llllIllIlI[n.lllllIIlII[551]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[552]] = n."Trapdoor";
        n.llllIllIlI[n.lllllIIlII[553]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[558]] = n."Jumping off boat";
        n.llllIllIlI[n.lllllIIlII[560]] = n."Jump-onto";
        n.llllIllIlI[n.lllllIIlII[561]] = n."Climbing up wall";
        n.llllIllIlI[n.lllllIIlII[563]] = n."Climb-up";
        n.llllIllIlI[n.lllllIIlII[564]] = n."Climbing down floor";
        n.llllIllIlI[n.lllllIIlII[565]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[566]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[567]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[568]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[569]] = n."Search";
        n.llllIllIlI[n.lllllIIlII[570]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[571]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[14]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[572]] = n."Floor";
        n.llllIllIlI[n.lllllIIlII[573]] = n."Climb-down";
        n.llllIllIlI[n.lllllIIlII[574]] = n."Climbing over wall";
        n.llllIllIlI[n.lllllIIlII[575]] = n."Wall rubble";
        n.llllIllIlI[n.lllllIIlII[576]] = n."Climb-over";
        n.llllIllIlI[n.lllllIIlII[590]] = n."Tome of experience (3)";
        n.llllIllIlI[n.lllllIIlII[591]] = n."Tome of experience (2)";
        n.llllIllIlI[n.lllllIIlII[592]] = n."Tome of experience (1)";
        n.llllIllIlI[n.lllllIIlII[593]] = n."ring of wealth (";
        n.llllIllIlI[n.lllllIIlII[579]] = n."Yes.";
        n.llllIllIlI[n.lllllIIlII[610]] = n."Is there something I can do to help out?";
        n.llllIllIlI[n.lllllIIlII[611]] = n."Hey, look over there! (Distract and sneak away).";
        n.llllIllIlI[n.lllllIIlII[612]] = n."(whisper) Do you know about the Myreque?";
        n.llllIllIlI[n.lllllIIlII[613]] = n."(whisper) I really need to meet the Myreque.";
        n.llllIllIlI[n.lllllIIlII[614]] = n."How can Old Man Ral help me?";
        n.llllIllIlI[n.lllllIIlII[615]] = n."Someone said you could help me.";
        n.llllIllIlI[n.lllllIIlII[616]] = n."Old Man Ral, the sage of Sanguinesti.";
        n.llllIllIlI[n.lllllIIlII[617]] = n."Talk to the king about Morytania.";
        n.llllIllIlI[n.lllllIIlII[618]] = n."What should I do now?";
        n.llllIllIlI[n.lllllIIlII[619]] = n."Yes thanks. I'll accept the free teleport.";
        n.llllIllIlI[n.lllllIIlII[620]] = n."Okay, lead the way.";
        n.llllIllIlI[n.lllllIIlII[621]] = n."";
    }

    public static void ay() {
        WorldArea var7;
        WorldArea var39;
        WorldArea worldArea = new WorldArea(lllllIIlII[273], lllllIIlII[274], lllllIIlII[11], lllllIIlII[8], lllllIIlII[0]);
        if (n.llIlIIlIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[275]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[276]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[277]]);
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
        WorldArea var26 = new WorldArea(lllllIIlII[278], lllllIIlII[279], lllllIIlII[42], lllllIIlII[54], lllllIIlII[1]);
        WorldPoint var27 = new WorldPoint(lllllIIlII[280], lllllIIlII[281], lllllIIlII[1]);
        if (n.llIlIIlIIllll(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var27), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[282]];
                Movement.walkTo((WorldPoint)var27);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var27), lllllIIlII[8]) && n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[283]];
                if (n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                    String[] stringArray = new String[lllllIIlII[0]];
                    stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[284]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[144]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
        }
        if (n.llIlIIlIIllll((var39 = new WorldArea(lllllIIlII[129], lllllIIlII[130], lllllIIlII[13], lllllIIlII[20], lllllIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[285]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[286]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[287]]);
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
        WorldArea var31 = new WorldArea(lllllIIlII[288], lllllIIlII[289], lllllIIlII[15], lllllIIlII[62], lllllIIlII[0]);
        WorldPoint var16 = new WorldPoint(lllllIIlII[290], lllllIIlII[291], lllllIIlII[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lllllIIlII[17]];
        worldPointArray[n.lllllIIlII[1]] = new WorldPoint(lllllIIlII[278], lllllIIlII[130], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[0]] = new WorldPoint(lllllIIlII[290], lllllIIlII[292], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[4]] = new WorldPoint(lllllIIlII[293], lllllIIlII[294], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[6]] = new WorldPoint(lllllIIlII[293], lllllIIlII[295], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[8]] = new WorldPoint(lllllIIlII[296], lllllIIlII[297], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[2]] = new WorldPoint(lllllIIlII[296], lllllIIlII[298], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[11]] = new WorldPoint(lllllIIlII[293], lllllIIlII[299], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[13]] = new WorldPoint(lllllIIlII[290], lllllIIlII[300], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[15]] = new WorldPoint(lllllIIlII[290], lllllIIlII[301], lllllIIlII[0]);
        worldPointArray[n.lllllIIlII[16]] = new WorldPoint(lllllIIlII[290], lllllIIlII[302], lllllIIlII[0]);
        WorldPoint[] var82 = worldPointArray;
        if (n.llIlIIlIIllll(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var16), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[303]];
                Walker.walkAlong(Arrays.asList(var82), new HashMap());
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var16), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[304]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[305]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[306]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        if (n.llIlIIlIIllll((var7 = new WorldArea(lllllIIlII[293], lllllIIlII[302], lllllIIlII[2], lllllIIlII[11], lllllIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[307]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[308]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[148]]);
            Time.sleepTicks((int)lllllIIlII[2]);
            0;
            String[] stringArray2 = new String[lllllIIlII[0]];
            stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[309]];
            TileObjects.getNearest((String[])stringArray2).interact(llllIllIlI[lllllIIlII[310]]);
            Time.sleepTicks((int)lllllIIlII[2]);
            0;
        }
        WorldArea var44 = new WorldArea(lllllIIlII[311], lllllIIlII[312], lllllIIlII[16], lllllIIlII[3], lllllIIlII[1]);
        WorldPoint var86 = new WorldPoint(lllllIIlII[280], lllllIIlII[313], lllllIIlII[1]);
        if (n.llIlIIlIIllll(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var86), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[314]];
                Movement.walkTo((WorldPoint)var86);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var86), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[315]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[316]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[317]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        WorldArea var33 = new WorldArea(lllllIIlII[288], lllllIIlII[318], lllllIIlII[19], lllllIIlII[50], lllllIIlII[0]);
        WorldPoint var8 = new WorldPoint(lllllIIlII[290], lllllIIlII[237], lllllIIlII[0]);
        if (n.llIlIIlIIllll(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var8), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[319]];
                Movement.walkTo((WorldPoint)var8);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var8), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[320]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[321]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[149]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        WorldArea var75 = new WorldArea(lllllIIlII[288], lllllIIlII[322], lllllIIlII[11], lllllIIlII[20], lllllIIlII[4]);
        WorldPoint var46 = new WorldPoint(lllllIIlII[293], lllllIIlII[220], lllllIIlII[4]);
        if (n.llIlIIlIIllll(var75.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var46), lllllIIlII[4])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[323]];
                Movement.walkTo((WorldPoint)var46);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var46), lllllIIlII[4])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[324]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[325]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[326]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        WorldArea var5 = new WorldArea(lllllIIlII[129], lllllIIlII[327], lllllIIlII[41], lllllIIlII[80], lllllIIlII[0]);
        WorldPoint var9 = new WorldPoint(lllllIIlII[328], lllllIIlII[329], lllllIIlII[0]);
        if (n.llIlIIlIIllll(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var9), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[330]];
                Movement.walkTo((WorldPoint)var9);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var9), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[331]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[332]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[333]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        WorldArea var17 = new WorldArea(lllllIIlII[334], lllllIIlII[329], lllllIIlII[113], lllllIIlII[103], lllllIIlII[1]);
        WorldPoint var24 = new WorldPoint(lllllIIlII[335], lllllIIlII[336], lllllIIlII[1]);
        if (n.llIlIIlIIllll(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var24), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[337]];
                Movement.walkTo((WorldPoint)var24);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var24), lllllIIlII[8])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[150]];
                g.a(llllIllIlI[lllllIIlII[338]], bQ);
            }
        }
    }

    public static void az() {
        String[] stringArray = new String[lllllIIlII[0]];
        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[339]];
        if (n.llIlIIlIlIlIl(NPCs.getNearest((String[])stringArray)) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35]) && n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cf), lllllIIlII[63])) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[340]];
            Movement.walkTo((WorldPoint)bY);
            0;
            Time.sleepTicks((int)lllllIIlII[0]);
            0;
        }
        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(bY), lllllIIlII[35])) {
            if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray2 = new String[lllllIIlII[0]];
                stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[341]];
                TileObjects.getNearest((String[])stringArray2).interact(llllIllIlI[lllllIIlII[342]]);
                Time.sleepTicks((int)lllllIIlII[4]);
                0;
            }
            g.a(bQ);
        }
        if (!n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(cf), lllllIIlII[33]) || n.llIlIIlIIllll(new WorldArea(lllllIIlII[129], lllllIIlII[130], lllllIIlII[13], lllllIIlII[20], lllllIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[343]];
            if (n.llIlIIlIlIIIl(cg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n.aB();
            }
        }
    }

    private static boolean llIlIIlIlIlII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aB() {
        void var59;
        void var94;
        void var55;
        WorldPoint worldPoint = new WorldPoint(lllllIIlII[554], lllllIIlII[555], lllllIIlII[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllllIIlII[554], lllllIIlII[556], lllllIIlII[0]);
        WorldPoint worldPoint3 = new WorldPoint(lllllIIlII[349], lllllIIlII[556], lllllIIlII[0]);
        WorldArea worldArea = new WorldArea(lllllIIlII[288], lllllIIlII[557], lllllIIlII[43], lllllIIlII[50], lllllIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lllllIIlII[129], lllllIIlII[130], lllllIIlII[13], lllllIIlII[20], lllllIIlII[1]);
        if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[558]];
            int[] nArray = new int[lllllIIlII[0]];
            nArray[n.lllllIIlII[1]] = lllllIIlII[559];
            TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[560]]);
            Time.sleepTicks((int)lllllIIlII[4]);
            0;
        }
        if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var55) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[561]];
            int[] nArray = new int[lllllIIlII[0]];
            nArray[n.lllllIIlII[1]] = lllllIIlII[562];
            TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[563]]);
            Time.sleepTicks((int)lllllIIlII[4]);
            0;
        }
        if (n.llIlIIlIIllll(var94.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[564]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[565]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lllllIIlII[0]];
                stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[566]];
                String[] stringArray3 = new String[lllllIIlII[0]];
                stringArray3[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[567]];
                if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray4 = new String[lllllIIlII[0]];
                    stringArray4[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[568]];
                    TileObjects.getNearest((String[])stringArray4).interact(llllIllIlI[lllllIIlII[569]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
            String[] stringArray5 = new String[lllllIIlII[0]];
            stringArray5[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[570]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray5))) {
                String[] stringArray6 = new String[lllllIIlII[0]];
                stringArray6[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[571]];
                String[] stringArray7 = new String[lllllIIlII[0]];
                stringArray7[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[14]];
                if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray8 = new String[lllllIIlII[0]];
                    stringArray8[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[572]];
                    TileObjects.getNearest((String[])stringArray8).interact(llllIllIlI[lllllIIlII[573]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
            g.a(bQ);
        }
        if (n.llIlIIlIIllll(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[574]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[575]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[576]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ax() {
        TileObject var22;
        WorldArea var58;
        void var30;
        WorldArea worldArea = new WorldArea(lllllIIlII[224], lllllIIlII[237], lllllIIlII[2], lllllIIlII[2], lllllIIlII[1]);
        WorldPoint worldPoint = new WorldPoint(lllllIIlII[238], lllllIIlII[239], lllllIIlII[1]);
        if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ca), lllllIIlII[12])) {
            void var50;
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllIIlII[2])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[240]];
                Movement.walkTo((WorldPoint)worldPoint);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var50), lllllIIlII[2])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[241]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[242]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[243]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[244]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[245]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[246]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        if (n.llIlIIlIIllll((var58 = new WorldArea(lllllIIlII[224], lllllIIlII[225], lllllIIlII[11], lllllIIlII[11], lllllIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[135]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[247]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[248]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        WorldArea var32 = new WorldArea(lllllIIlII[175], lllllIIlII[249], lllllIIlII[11], lllllIIlII[2], lllllIIlII[0]);
        WorldArea var20 = new WorldArea(lllllIIlII[221], lllllIIlII[250], lllllIIlII[2], lllllIIlII[13], lllllIIlII[0]);
        WorldPoint var100 = new WorldPoint(lllllIIlII[224], lllllIIlII[251], lllllIIlII[0]);
        if (n.llIlIIlIIllll(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var100) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[252]];
                Movement.walkTo((WorldPoint)var100);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var100) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[253];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[254]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[136]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[255]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[256]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        WorldArea var113 = new WorldArea(lllllIIlII[214], lllllIIlII[215], lllllIIlII[49], lllllIIlII[65], lllllIIlII[1]);
        WorldArea var92 = new WorldArea(lllllIIlII[216], lllllIIlII[217], lllllIIlII[11], lllllIIlII[8], lllllIIlII[1]);
        WorldPoint var45 = new WorldPoint(lllllIIlII[218], lllllIIlII[171], lllllIIlII[1]);
        WorldArea var65 = new WorldArea(lllllIIlII[221], lllllIIlII[222], lllllIIlII[13], lllllIIlII[11], lllllIIlII[1]);
        WorldArea var61 = new WorldArea(lllllIIlII[223], lllllIIlII[171], lllllIIlII[6], lllllIIlII[8], lllllIIlII[1]);
        WorldArea var101 = new WorldArea(lllllIIlII[170], lllllIIlII[171], lllllIIlII[4], lllllIIlII[13], lllllIIlII[1]);
        if (n.llIlIIlIlIIIl(var92.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIIllll(var113.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var58.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var61.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var101.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[257]];
            Movement.walkTo((WorldPoint)var45);
            0;
            Time.sleepTicks((int)lllllIIlII[0]);
            0;
        }
        if (n.llIlIIlIIllll(var92.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[258]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[137]];
            var22 = TileObjects.getNearest((String[])stringArray);
            if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[165]) && n.llIlIIlIlIIll(var22)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[27];
                Inventory.getFirst((int[])nArray).useOn(var22);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
            if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[166])) {
                String[] stringArray2 = new String[lllllIIlII[0]];
                stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[259]];
                if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray2))) {
                    String[] stringArray3 = new String[lllllIIlII[0]];
                    stringArray3[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[260]];
                    TileObjects.getNearest((String[])stringArray3).interact(llllIllIlI[lllllIIlII[261]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
        }
        if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[166]) && (!n.llIlIIlIlIIIl(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.llIlIIlIIllll(var61.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[262]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[263]];
            String[] stringArray4 = new String[lllllIIlII[0]];
            stringArray4[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[264]];
            Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray4));
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[167])) {
            var22 = new WorldPoint(lllllIIlII[265], lllllIIlII[266], lllllIIlII[1]);
            if (n.llIlIIlIlIIIl(var101.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[267]];
                Movement.walkTo((WorldPoint)var22);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(var101.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[268]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[269]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[141]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[168]) && n.llIlIIlIIllll(var101.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[270]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[271]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[272]]);
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
    }

    @Override
    public String U() {
        return h;
    }

    private static boolean llIlIIlIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean V() {
        int n2;
        if (n.llIlIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[192])) {
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[590]];
            if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllllIIlII[0]];
                stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[591]];
                if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllllIIlII[0]];
                    stringArray3[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[592]];
                    if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        n2 = lllllIIlII[0];
                        0;
                        if ((26 + 2 - -116 + 26 ^ 95 + 113 - 131 + 97) > ((0xA4 ^ 0x94 ^ 1) & (0xBF ^ 0x85 ^ (0xAA ^ 0xA1) ^ -1))) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lllllIIlII[1];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lllllIIlII[1];
    }

    @Override
    public int T() {
        try {
            n.av();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lllllIIlII[77];
    }

    private static boolean llIlIIlIIllll(int n2) {
        return n2 != 0;
    }

    private static void llIlIIlIIlllI() {
        lllllIIlII = new int[623];
        n.lllllIIlII[0] = 1;
        n.lllllIIlII[1] = (0x4D ^ 0x79) & ~(0xAA ^ 0x9E);
        n.lllllIIlII[2] = 94 + 113 - 174 + 124 ^ 143 + 16 - 87 + 80;
        n.lllllIIlII[3] = 0x38 ^ 0x2C;
        n.lllllIIlII[4] = 2;
        n.lllllIIlII[5] = 0x1B ^ 0xD;
        n.lllllIIlII[6] = 3;
        n.lllllIIlII[7] = 46 + 98 - 136 + 144 ^ 91 + 18 - -8 + 13;
        n.lllllIIlII[8] = 0x4C ^ 0x48;
        n.lllllIIlII[9] = 0xD2 ^ 0x82 ^ (0xD5 ^ 0xA5);
        n.lllllIIlII[10] = 153 + 145 - 285 + 146 ^ 111 + 178 - 262 + 163;
        n.lllllIIlII[11] = 0xC5 ^ 0xC3;
        n.lllllIIlII[12] = 0x2F ^ 7;
        n.lllllIIlII[13] = 0xBA ^ 0xB4 ^ (0x1B ^ 0x12);
        n.lllllIIlII[14] = 0xFFFFE9AF & 0x17FE;
        n.lllllIIlII[15] = 0x5A ^ 0x52;
        n.lllllIIlII[16] = 0xB0 ^ 0x98 ^ (0x46 ^ 0x67);
        n.lllllIIlII[17] = 35 + 39 - -18 + 91 ^ 132 + 50 - 51 + 58;
        n.lllllIIlII[18] = -(0xFFFFF95F & 0x6EF6) & (0xFFFFFFFD & 0x7BDF);
        n.lllllIIlII[19] = 57 + 114 - 111 + 88 ^ 54 + 135 - 104 + 74;
        n.lllllIIlII[20] = 34 + 120 - 77 + 86 ^ 2 + 106 - -13 + 54;
        n.lllllIIlII[21] = -(0xFFFFB7F5 & 0x689B) & (0xFFFFBFD7 & Short.MAX_VALUE);
        n.lllllIIlII[22] = 0xFFFFEEBD & 0x5DEF;
        n.lllllIIlII[23] = -(0xFFFFBF7D & 0x739F) & (0xFFFFFFFF & 0x7FBF);
        n.lllllIIlII[24] = -(0xFFFFDDDD & 0x32F3) & (0xFFFFB6D7 & 0x5FFB);
        n.lllllIIlII[25] = -(0xFFFFFC35 & 0x3FEB) & (0xFFFFBFF7 & 0x7FE8);
        n.lllllIIlII[26] = -(0xFFFFAA87 & 0x75F9) & (0xFFFFBBBB & 0x6DEF);
        n.lllllIIlII[27] = -(0xFFFFEEBF & 0x7D4D) & (0xFFFFFFBE & 0x6FFF);
        n.lllllIIlII[28] = 0xFFFFDEFB & 0x2337;
        n.lllllIIlII[29] = 0xFFFFCB3D & 0x36EE;
        n.lllllIIlII[30] = -(0xFFFFE67F & 0x5BAF) & (0xFFFFF77F & 0x7BFF);
        n.lllllIIlII[31] = -(0xFFFFBD5F & 0x76F2) & (0xFFFFBFFF & 0x7DD3);
        n.lllllIIlII[32] = -(0xFFFFFB8B & 0x7E77) & (0xFFFFFEFB & Short.MAX_VALUE);
        n.lllllIIlII[33] = 0x16 ^ 8;
        n.lllllIIlII[34] = 0x80 ^ 0x8D;
        n.lllllIIlII[35] = 0x15 ^ 0x1A;
        n.lllllIIlII[36] = 0x35 ^ 7;
        n.lllllIIlII[37] = 74 + 1 - -17 + 99 ^ 11 + 50 - 46 + 162;
        n.lllllIIlII[38] = 0x53 ^ 0x21 ^ (0x18 ^ 0x7A);
        n.lllllIIlII[39] = -(0xFFFF962F & 0x6BDD) & (0xFFFFFFBF & 0xFEF);
        n.lllllIIlII[40] = 0xFFFFACFC & 0x5FA3;
        n.lllllIIlII[41] = 0xBD ^ 0xAC;
        n.lllllIIlII[42] = 54 + 27 - 26 + 99 ^ 66 + 60 - 56 + 66;
        n.lllllIIlII[43] = 0xA7 ^ 0xC4 ^ (0x3F ^ 0x4F);
        n.lllllIIlII[44] = 0x96 ^ 0x83;
        n.lllllIIlII[45] = 0xF0 ^ 0x8C ^ (0x2A ^ 0x41);
        n.lllllIIlII[46] = 0x74 ^ 0x3E ^ (0x78 ^ 0x2A);
        n.lllllIIlII[47] = 163 + 39 - 145 + 108 ^ 139 + 68 - 113 + 94;
        n.lllllIIlII[48] = 128 + 116 - 146 + 56 ^ 110 + 26 - 128 + 121;
        n.lllllIIlII[49] = 0x86 ^ 0xA0 ^ (0xA0 ^ 0x9A);
        n.lllllIIlII[50] = 0x68 ^ 0x55 ^ (0x8A ^ 0xAA);
        n.lllllIIlII[51] = -1;
        n.lllllIIlII[52] = 0x14 ^ 0xB;
        n.lllllIIlII[53] = 0x37 ^ 0x15;
        n.lllllIIlII[54] = 41 + 137 - 28 + 5 ^ 183 + 73 - 99 + 27;
        n.lllllIIlII[55] = 0x93 ^ 0xB7;
        n.lllllIIlII[56] = 0x36 ^ 0x65 ^ (0x63 ^ 0x15);
        n.lllllIIlII[57] = 0xA3 ^ 0x85;
        n.lllllIIlII[58] = 0x87 ^ 0x9F ^ (0x3C ^ 3);
        n.lllllIIlII[59] = 0xD0 ^ 0x8E ^ (0xEC ^ 0x9B);
        n.lllllIIlII[60] = 0x21 ^ 0x2B ^ (0xB2 ^ 0x92);
        n.lllllIIlII[61] = 4 + 140 - 48 + 67 ^ 41 + 57 - 14 + 52;
        n.lllllIIlII[62] = 0x29 ^ 5;
        n.lllllIIlII[63] = 0x41 ^ 0x26 ^ (0x44 ^ 0xE);
        n.lllllIIlII[64] = 68 + 6 - -53 + 36 ^ 100 + 51 - 78 + 68;
        n.lllllIIlII[65] = 0xCB ^ 0xB6 ^ (0 ^ 0x41);
        n.lllllIIlII[66] = 0x3D ^ 0x12;
        n.lllllIIlII[67] = 0x81 ^ 0xB1;
        n.lllllIIlII[68] = 0x36 ^ 0x5E ^ (0x1C ^ 0x45);
        n.lllllIIlII[69] = (0xE6 ^ 0x86) & ~(0x30 ^ 0x50) ^ (0x5F ^ 0x6C);
        n.lllllIIlII[70] = 0xF0 ^ 0xB1;
        n.lllllIIlII[71] = 0x98 ^ 0x91 ^ (0xC1 ^ 0x8E);
        n.lllllIIlII[72] = 0xC9 ^ 0x99;
        n.lllllIIlII[73] = 0x22 ^ 0x68 ^ (0xDC ^ 0xA2);
        n.lllllIIlII[74] = 0xF4 ^ 0xAF ^ (0xFF ^ 0x91);
        n.lllllIIlII[75] = 116 + 89 - 173 + 154 ^ 101 + 49 - 65 + 55;
        n.lllllIIlII[76] = 0x79 ^ 0x63 ^ (0x29 ^ 0x69);
        n.lllllIIlII[77] = 145 + 137 - 267 + 152 ^ 135 + 130 - 182 + 112;
        n.lllllIIlII[78] = 42 + 30 - -34 + 58 ^ 43 + 62 - 60 + 102;
        n.lllllIIlII[79] = 0xA ^ 0x32;
        n.lllllIIlII[80] = 132 + 21 - 28 + 25 ^ 113 + 16 - 32 + 78;
        n.lllllIIlII[81] = 0x2A ^ 0x10;
        n.lllllIIlII[82] = 0xA7 ^ 0x9C;
        n.lllllIIlII[83] = 0x32 ^ 0x5F ^ (0x4B ^ 0x1B);
        n.lllllIIlII[84] = 0x1B ^ 0x25;
        n.lllllIIlII[85] = 0xA3 ^ 0x9C;
        n.lllllIIlII[86] = 0x8B ^ 0x96 ^ (0x15 ^ 0x48);
        n.lllllIIlII[87] = 0x84 ^ 0xC1 ^ (0xB4 ^ 0xB3);
        n.lllllIIlII[88] = 3 ^ (0xA ^ 0x67);
        n.lllllIIlII[89] = 27 + 143 - 62 + 86 ^ 13 + 127 - 125 + 114;
        n.lllllIIlII[90] = 0xAE ^ 0xA7 ^ (0x72 ^ 0x3F);
        n.lllllIIlII[91] = 28 + 109 - 132 + 207 ^ 125 + 132 - 206 + 94;
        n.lllllIIlII[92] = 4 ^ 0x43;
        n.lllllIIlII[93] = 0x82 ^ 0x92 ^ (0xF5 ^ 0xAD);
        n.lllllIIlII[94] = 0xF8 ^ 0x9A ^ (0x10 ^ 0x3B);
        n.lllllIIlII[95] = 0x43 ^ 9;
        n.lllllIIlII[96] = 87 + 23 - -37 + 106 ^ 176 + 74 - 218 + 150;
        n.lllllIIlII[97] = 0x62 ^ 0x1A;
        n.lllllIIlII[98] = 0x60 ^ 0x2C;
        n.lllllIIlII[99] = 0x43 ^ 0xE;
        n.lllllIIlII[100] = -(0xFFFFBF37 & 0x48DB) & (0xFFFFEFDB & 0x5EFF);
        n.lllllIIlII[101] = 55 + 100 - 56 + 127 ^ 152 + 53 - 34 + 1;
        n.lllllIIlII[102] = 3 + 80 - -8 + 39;
        n.lllllIIlII[103] = 0x48 ^ 7;
        n.lllllIIlII[104] = 0x74 ^ 0x25;
        n.lllllIIlII[105] = 123 + 224 - 164 + 70 ^ 164 + 99 - 221 + 133;
        n.lllllIIlII[106] = 111 + 72 - 84 + 135 ^ 171 + 37 - 131 + 108;
        n.lllllIIlII[107] = 0xF9 ^ 0xAD;
        n.lllllIIlII[108] = 0x72 ^ 7 ^ (6 ^ 0x26);
        n.lllllIIlII[109] = 86 + 37 - 42 + 59;
        n.lllllIIlII[110] = 99 + 18 - 88 + 120 + (0x55 ^ 0x66) - (0x11 ^ 0x38) + (0xBF ^ 0xB4);
        n.lllllIIlII[111] = 0x26 ^ 0x70;
        n.lllllIIlII[112] = 0xCC ^ 0x9B;
        n.lllllIIlII[113] = 0x6C ^ 0x34;
        n.lllllIIlII[114] = 0x25 ^ 0x7C;
        n.lllllIIlII[115] = 0x3C ^ 0x51 ^ (0xA8 ^ 0x9E);
        n.lllllIIlII[116] = 0x47 ^ 0x1B;
        n.lllllIIlII[117] = 0xCE ^ 0x93;
        n.lllllIIlII[118] = 0x69 ^ 0x5C ^ (2 ^ 0x69);
        n.lllllIIlII[119] = 0x26 ^ 0x79;
        n.lllllIIlII[120] = 0x2E ^ 0x33 ^ (0xBE ^ 0xC3);
        n.lllllIIlII[121] = 103 + 146 - 112 + 73 ^ 40 + 52 - -71 + 16;
        n.lllllIIlII[122] = (0x55 ^ 0x5D) + (14 + 13 - -96 + 51) - (0xF2 ^ 0xB7) + (0x50 ^ 0x13);
        n.lllllIIlII[123] = 0x51 ^ 0x33;
        n.lllllIIlII[124] = 0x52 ^ 0x31;
        n.lllllIIlII[125] = 0xB2 ^ 0xC1 ^ (0x13 ^ 5);
        n.lllllIIlII[126] = 0x20 ^ 0x46;
        n.lllllIIlII[127] = 0x43 ^ 0x24;
        n.lllllIIlII[128] = 0xEF ^ 0x8D ^ (0x81 ^ 0x8B);
        n.lllllIIlII[129] = 0xFFFFEE0D & 0x1FF2;
        n.lllllIIlII[130] = -1 & (0xFFFFBE6B & 0x4DF7);
        n.lllllIIlII[131] = 0x98 ^ 0xA3 ^ (0xCA ^ 0x98);
        n.lllllIIlII[132] = 0x74 ^ 0xA ^ (0x2A ^ 0x3E);
        n.lllllIIlII[133] = 0x1E ^ 0x6F ^ (0xC ^ 0x16);
        n.lllllIIlII[134] = 122 + 114 - 43 + 19 ^ 134 + 136 - 94 + 8;
        n.lllllIIlII[135] = 68 + 62 - -17 + 43;
        n.lllllIIlII[136] = 39 + 176 - 108 + 88;
        n.lllllIIlII[137] = 143 + 19 - -3 + 35;
        n.lllllIIlII[138] = 0xE ^ 0x63;
        n.lllllIIlII[139] = 0xFFFFB3EB & 0x4FDE;
        n.lllllIIlII[140] = 0xFFFFA3FF & 0x5FCD;
        n.lllllIIlII[141] = 123 + 35 - 118 + 170;
        n.lllllIIlII[142] = 0x75 ^ 0x1A;
        n.lllllIIlII[143] = 0xB7 ^ 0xC7;
        n.lllllIIlII[144] = 177 + 30 - 107 + 120;
        n.lllllIIlII[145] = 0x9A ^ 0xC0 ^ (7 ^ 0x2C);
        n.lllllIIlII[146] = 0x30 ^ 0x42;
        n.lllllIIlII[147] = 0x7D ^ 0x78 ^ (0x4D ^ 0x3B);
        n.lllllIIlII[148] = 175 + 82 - 38 + 11;
        n.lllllIIlII[149] = 3 + (38 + 15 - -55 + 29) - (0x58 ^ 0x21) + (162 + 178 - 166 + 47);
        n.lllllIIlII[150] = 25 + 121 - -101 + 3;
        n.lllllIIlII[151] = 0xFFFF8F0F & 0x71F4;
        n.lllllIIlII[152] = 0x74 ^ 0x5C ^ (0xD1 ^ 0x8D);
        n.lllllIIlII[153] = 0xC2 ^ 0xB7;
        n.lllllIIlII[154] = 0x2D ^ 0x5B;
        n.lllllIIlII[155] = 0x7A ^ 0xD;
        n.lllllIIlII[156] = 0xD ^ 0x74;
        n.lllllIIlII[157] = 0xF0 ^ 0x8A;
        n.lllllIIlII[158] = 0x2C ^ 0x57;
        n.lllllIIlII[159] = 0x68 ^ 0x14;
        n.lllllIIlII[160] = 0x36 ^ 0x4B;
        n.lllllIIlII[161] = 0x18 ^ 0x71 ^ (0x9D ^ 0x8A);
        n.lllllIIlII[162] = (0x55 ^ 0x6D) + (0xCB ^ 0xA7) - (0x55 ^ 0x63) + (0x19 ^ 8);
        n.lllllIIlII[163] = 37 + 110 - 108 + 89;
        n.lllllIIlII[164] = 7 + 50 - 20 + 92;
        n.lllllIIlII[165] = 0xFFFFA17F & 0x5F8E;
        n.lllllIIlII[166] = -(0xFFFFFCFF & 0x4F66) & (0xFFFFFD7D & 0x4FFF);
        n.lllllIIlII[167] = -(0xFFFFFEC7 & 0x7B3A) & (0xFFFFFFF7 & 0x7B2B);
        n.lllllIIlII[168] = -(0xFFFFFEF7 & 0x7DD9) & (0xFFFFFFFC & 0x7DFF);
        n.lllllIIlII[169] = 0xFFFFBDBE & 0x67F5;
        n.lllllIIlII[170] = 0xFFFF9FFB & 0x6E3E;
        n.lllllIIlII[171] = 0xFFFFECEA & 0x1FFD;
        n.lllllIIlII[172] = 51 + 98 - 28 + 10;
        n.lllllIIlII[173] = (0xE ^ 0x19) + (0x5D ^ 0x2C) - (0xA7 ^ 0xC7) + (0x1B ^ 0x47);
        n.lllllIIlII[174] = 20 + 59 - -45 + 9;
        n.lllllIIlII[175] = 0xFFFFAF2D & 0x5EFE;
        n.lllllIIlII[176] = 0xFFFFBDDA & 0x67FF;
        n.lllllIIlII[177] = 103 + 26 - 60 + 65;
        n.lllllIIlII[178] = (0x5E ^ 0x20) + (0xB5 ^ 0x9F) - (0x34 ^ 0x40) + (0xF4 ^ 0xA7);
        n.lllllIIlII[179] = 68 + 82 - 97 + 83;
        n.lllllIIlII[180] = (0x3A ^ 0x7C) + (0x52 ^ 6) - (0xFB ^ 0xA8) + (0x6F ^ 0x2D);
        n.lllllIIlII[181] = 41 + 49 - -20 + 28;
        n.lllllIIlII[182] = 0xFFFF8737 & 0x79FE;
        n.lllllIIlII[183] = (0xDA ^ 0xC1) + (0x68 ^ 0x72) - -(0x89 ^ 0xAE) + (0x94 ^ 0xBB);
        n.lllllIIlII[184] = 30 + 55 - 44 + 100;
        n.lllllIIlII[185] = (0xDF ^ 0x85) + (0x9F ^ 0xA2) - (0x7E ^ 0x24) + (0x46 ^ 0x17);
        n.lllllIIlII[186] = 107 + 106 - 181 + 111;
        n.lllllIIlII[187] = 31 + 121 - 73 + 65;
        n.lllllIIlII[188] = (0x42 ^ 0x69) + (0x81 ^ 0xBB) - -(0x96 ^ 0x8A) + (0xB0 ^ 0xA0);
        n.lllllIIlII[189] = 21 + 76 - 71 + 105 + (0x8A ^ 0xAF) - (46 + 105 - 64 + 48) + (0x27 ^ 0x56);
        n.lllllIIlII[190] = 66 + 128 - 87 + 40;
        n.lllllIIlII[191] = 133 + 71 - 119 + 63;
        n.lllllIIlII[192] = -(0xFFFFB8DB & 0x6FBF) & (0xFFFFABDF & 0x7DFA);
        n.lllllIIlII[193] = (0xA8 ^ 0x97) + (0x6D ^ 5) - (5 ^ 0x45) + (0x81 ^ 0xAF);
        n.lllllIIlII[194] = (1 ^ 0x14) + (0xB3 ^ 0x85) - (0xCF ^ 0x8F) + (22 + 120 - 73 + 70);
        n.lllllIIlII[195] = (0x34 ^ 0x20) + (0xF ^ 0x5E) - (0x76 ^ 0x38) + (27 + 126 - 66 + 41);
        n.lllllIIlII[196] = 21 + 85 - 75 + 121;
        n.lllllIIlII[197] = 32 + 135 - 63 + 49;
        n.lllllIIlII[198] = (0xEE ^ 0xC5) + (0x20 ^ 0x48) - (0x22 ^ 0x73) + (0xF9 ^ 0xA1);
        n.lllllIIlII[199] = 30 + 0 - -18 + 107;
        n.lllllIIlII[200] = 46 + 83 - 15 + 25 + (0x58 ^ 0x61) - (114 + 29 - 13 + 17) + (0x7A ^ 0x11);
        n.lllllIIlII[201] = (0x59 ^ 0xA) + (0x8E ^ 0x9D) - -(0x66 ^ 0x46) + (0x5F ^ 0x48);
        n.lllllIIlII[202] = (0x17 ^ 0x54) + (0x59 ^ 0xC) - (0x3C ^ 0x31) + (0x7B ^ 0x68);
        n.lllllIIlII[203] = (0x58 ^ 0x38) + (0xA3 ^ 0xB7) - -(0x3F ^ 0x28) + (0x86 ^ 0x92);
        n.lllllIIlII[204] = 156 + 87 - 142 + 59;
        n.lllllIIlII[205] = (4 ^ 0x55) + (132 + 118 - 177 + 74) - (72 + 53 - 16 + 85) + (108 + 23 - 31 + 27);
        n.lllllIIlII[206] = 101 + 66 - 153 + 148;
        n.lllllIIlII[207] = 16 + 75 - 58 + 130;
        n.lllllIIlII[208] = (0x44 ^ 9) + (0xE6 ^ 0xB5) - (154 + 66 - 216 + 152) + (32 + 52 - 30 + 106);
        n.lllllIIlII[209] = 130 + 69 - 43 + 9;
        n.lllllIIlII[210] = (0x7D ^ 0x1D) + (0x32 ^ 0x45) - (0x74 ^ 0x34) + (0x80 ^ 0x8F);
        n.lllllIIlII[211] = 149 + 51 - 182 + 149;
        n.lllllIIlII[212] = 94 + 116 - 198 + 156;
        n.lllllIIlII[213] = 123 + 63 - 74 + 57;
        n.lllllIIlII[214] = 0xFFFFAEE7 & 0x5F39;
        n.lllllIIlII[215] = 0xFFFFDFFF & 0x2CB6;
        n.lllllIIlII[216] = -(0xFFFFDDEE & 0x62D3) & (0xFFFFEEF3 & 0x5FFF);
        n.lllllIIlII[217] = -(0xFFFFD5BB & 0x3B55) & (0xFFFFDFF7 & 0x3DFD);
        n.lllllIIlII[218] = -(0xFFFFF86B & 0x47DE) & (0xFFFFFEFF & 0x4F7F);
        n.lllllIIlII[219] = -(0xFFFFFD5F & 0x53EF) & (0xFFFFFFFE & 0x5F7F);
        n.lllllIIlII[220] = -(0xFFFFDB7E & 0x27C7) & (0xFFFFFFFF & 0xFFF);
        n.lllllIIlII[221] = 0xFFFFBFFB & 0x4E37;
        n.lllllIIlII[222] = 0xFFFFADFB & 0x5EED;
        n.lllllIIlII[223] = -(0xFFFFEDD9 & 0x322F) & (0xFFFFFEBF & 0x2F7F);
        n.lllllIIlII[224] = -(0xFFFFE5FC & 0x3BCF) & (0xFFFFAFFF & Short.MAX_VALUE);
        n.lllllIIlII[225] = 0xFFFFFCF7 & 0xFBD;
        n.lllllIIlII[226] = 112 + 88 - 91 + 30 + (125 + 9 - -8 + 19) - (40 + 171 - 66 + 32) + (0x85 ^ 0xB5);
        n.lllllIIlII[227] = 160 + 122 - 224 + 114;
        n.lllllIIlII[228] = 152 + 74 - 173 + 120;
        n.lllllIIlII[229] = 131 + 60 - 78 + 26 + (0xF8 ^ 0x8B) - (155 + 41 - 114 + 105) + (0x15 ^ 0x7E);
        n.lllllIIlII[230] = 72 + 89 - 84 + 98;
        n.lllllIIlII[231] = (0x2F ^ 0x5F) + (0xAE ^ 0x9B) - (62 + 101 - 51 + 27) + (24 + 125 - 129 + 130);
        n.lllllIIlII[232] = (0x1E ^ 0x72) + (130 + 87 - 193 + 151) - (0xFFFFB5DE & 0x4B33) + (12 + 151 - 69 + 74);
        n.lllllIIlII[233] = 7 + 127 - 55 + 99;
        n.lllllIIlII[234] = 113 + 24 - 75 + 93 + (97 + 153 - 183 + 95) - (157 + 74 - 217 + 155) + (0x12 ^ 0xD);
        n.lllllIIlII[235] = (0x66 ^ 0x73) + (71 + 114 - 44 + 0) - (0x80 ^ 0xBF) + (0x7F ^ 0x2D);
        n.lllllIIlII[236] = 130 + 48 - 28 + 32;
        n.lllllIIlII[237] = 0xFFFFCEF1 & 0x3DBE;
        n.lllllIIlII[238] = 0xFFFFEFAA & 0x1E7F;
        n.lllllIIlII[239] = 0xFFFFB793 & 0x6DFF;
        n.lllllIIlII[240] = (0xD3 ^ 0xA7) + (4 + 43 - -110 + 15) - (2 + 150 - 42 + 80) + (0x57 ^ 2);
        n.lllllIIlII[241] = 91 + 79 - 142 + 156;
        n.lllllIIlII[242] = 112 + 59 - -9 + 5;
        n.lllllIIlII[243] = (0x71 ^ 0x68) + (154 + 96 - 173 + 90) - (0x23 ^ 0x4D) + (0x3A ^ 0x52);
        n.lllllIIlII[244] = 136 + 79 - 120 + 92;
        n.lllllIIlII[245] = (0x45 ^ 0x1E) + (0x90 ^ 0xBF) - (0xD ^ 9) + (0x38 ^ 0xE);
        n.lllllIIlII[246] = 17 + 134 - 31 + 62 + (27 + 64 - -35 + 21) - (79 + 94 - -5 + 7) + (0x17 ^ 0x3A);
        n.lllllIIlII[247] = 67 + 178 - 110 + 56;
        n.lllllIIlII[248] = (0x61 ^ 0x4D) + (0 ^ 0x58) - (0xA ^ 4) + (0x37 ^ 0x7D);
        n.lllllIIlII[249] = -(0xFFFFF7EB & 0x1B1D) & (0xFFFFFFBF & 0x1FFF);
        n.lllllIIlII[250] = 0xFFFFAEFF & 0x5DB4;
        n.lllllIIlII[251] = -(0xFFFFDE77 & 0x738E) & (0xFFFFFEFF & 0x5FBD);
        n.lllllIIlII[252] = 9 + 50 - -127 + 0 + 3 - (0x52 ^ 6) + (0x77 ^ 0x2F);
        n.lllllIIlII[253] = -(0xFFFFBABB & 0x555D) & (0xFFFFDFFF & 0x76DE);
        n.lllllIIlII[254] = 16 + 75 - -38 + 64 + (94 + 105 - 53 + 31) - (89 + 179 - 100 + 53) + (0x66 ^ 0x4B);
        n.lllllIIlII[255] = 133 + 133 - 153 + 83;
        n.lllllIIlII[256] = 151 + 170 - 244 + 120;
        n.lllllIIlII[257] = 66 + 164 - 68 + 8 + (73 + 92 - 148 + 142) - (47 + 14 - 12 + 122) + (0x11 ^ 0x39);
        n.lllllIIlII[258] = (0x3E ^ 0x72) + (0xC7 ^ 0xC1) - (0x72 ^ 0x54) + (27 + 103 - 51 + 76);
        n.lllllIIlII[259] = 155 + 15 - 114 + 145;
        n.lllllIIlII[260] = 127 + 91 - 50 + 31 + (13 + 114 - 22 + 36) - (198 + 21 - 123 + 103) + (0xAC ^ 0x91);
        n.lllllIIlII[261] = 111 + 54 - 145 + 183;
        n.lllllIIlII[262] = 55 + 124 - 105 + 130;
        n.lllllIIlII[263] = 65 + 190 - 251 + 201;
        n.lllllIIlII[264] = (0x7C ^ 0x14) + (127 + 86 - 169 + 85) - (0xA1 ^ 0x98) + (0x95 ^ 0x8B);
        n.lllllIIlII[265] = -(0xFFFFEFE5 & 0x505B) & (0xFFFFCF7B & 0x7EFF);
        n.lllllIIlII[266] = -(0xFFFFBFF7 & 0x431A) & (0xFFFFFFFF & 0xFFB);
        n.lllllIIlII[267] = 182 + 147 - 153 + 31;
        n.lllllIIlII[268] = 55 + 70 - 47 + 130;
        n.lllllIIlII[269] = 68 + 31 - -88 + 22;
        n.lllllIIlII[270] = 149 + 75 - 174 + 115 + (45 + 20 - 41 + 135) - (180 + 75 - 215 + 164) + (0x1D ^ 0x46);
        n.lllllIIlII[271] = 147 + 174 - 182 + 63 + (125 + 107 - 68 + 18) - (0xFFFF85FA & 0x7B7F) + (52 + 31 - -43 + 80);
        n.lllllIIlII[272] = 31 + 206 - 37 + 13;
        n.lllllIIlII[273] = 0xFFFF8F5B & 0x7EAE;
        n.lllllIIlII[274] = -(0xFFFFF1CD & 0x7E3B) & (0xFFFFFF9F & 0x7CEB);
        n.lllllIIlII[275] = (0x2E ^ 0x17) + (149 + 6 - -19 + 13) - (113 + 99 - 167 + 87) + (0xD9 ^ 0xBF);
        n.lllllIIlII[276] = 2 + 18 - -135 + 60;
        n.lllllIIlII[277] = 47 + 205 - 133 + 97;
        n.lllllIIlII[278] = -(0xFFFFB6FE & 0x69A3) & (0xFFFFAFAF & 0x7EF7);
        n.lllllIIlII[279] = -(0xFFFFF0BF & 0x6FDB) & (0xFFFFEFFF & 0x7CFF);
        n.lllllIIlII[280] = 0xFFFF9F67 & 0x6E9F;
        n.lllllIIlII[281] = 0xFFFFEF7D & 0x1CEF;
        n.lllllIIlII[282] = (2 ^ 0x50) + (0x83 ^ 0xB6) - -(0xBB ^ 0x83) + (0x78 ^ 0x62);
        n.lllllIIlII[283] = 97 + 199 - 279 + 201;
        n.lllllIIlII[284] = (0xAE ^ 0xAB) + (65 + 99 - 67 + 43) - (57 + 77 - 59 + 58) + (153 + 198 - 240 + 96);
        n.lllllIIlII[285] = 25 + 114 - -36 + 46;
        n.lllllIIlII[286] = 86 + 20 - -17 + 99;
        n.lllllIIlII[287] = 178 + 175 - 224 + 94;
        n.lllllIIlII[288] = 0xFFFFCF6F & 0x3E91;
        n.lllllIIlII[289] = 0xFFFFAE63 & 0x5DFE;
        n.lllllIIlII[290] = 0xFFFFAE76 & 0x5F8D;
        n.lllllIIlII[291] = -(0xFFFFB9DF & 0x7733) & (0xFFFFFD9F & 0x3FFA);
        n.lllllIIlII[292] = 0xFFFF9E7F & 0x6DE7;
        n.lllllIIlII[293] = 0xFFFFBFBB & 0x4E47;
        n.lllllIIlII[294] = 0xFFFFED7E & 0x1EEB;
        n.lllllIIlII[295] = 0xFFFFDEFE & 0x2D6F;
        n.lllllIIlII[296] = 0xFFFFBFBF & 0x4E45;
        n.lllllIIlII[297] = 0xFFFFED77 & 0x1EFA;
        n.lllllIIlII[298] = -(0xFFFFBBAF & 0x77D1) & (0xFFFFBFFF & 0x7FF7);
        n.lllllIIlII[299] = 0xFFFFFC7B & 0xFFF;
        n.lllllIIlII[300] = 0xFFFFCDE7 & 0x3E99;
        n.lllllIIlII[301] = -(0xFFFFFC29 & 0x33F7) & (0xFFFFBCB5 & 0x7FEF);
        n.lllllIIlII[302] = 0xFFFF8DB9 & 0x7ECF;
        n.lllllIIlII[303] = 32 + 142 - 91 + 141;
        n.lllllIIlII[304] = (0x88 ^ 0xB9) + (112 + 105 - 170 + 101) - (0xB4 ^ 0x9C) + (0xDF ^ 0x9B);
        n.lllllIIlII[305] = 103 + 83 - 94 + 51 + (25 + 141 - 73 + 64) - (0x30 ^ 0x47) + (0x51 ^ 0x7C);
        n.lllllIIlII[306] = 56 + 1 - -112 + 58;
        n.lllllIIlII[307] = 73 + 202 - 164 + 117;
        n.lllllIIlII[308] = 103 + 152 - 97 + 71;
        n.lllllIIlII[309] = 58 + 54 - -36 + 17 + (0x48 ^ 1) - (0x23 ^ 0x76) + (0x64 ^ 0x2A);
        n.lllllIIlII[310] = (0x42 ^ 0x6F) + (0x6F ^ 0x19) - (0x8C ^ 0x99) + (0x31 ^ 0x6B);
        n.lllllIIlII[311] = 0xFFFF9F2E & 0x6ED3;
        n.lllllIIlII[312] = -(0xFFFFD653 & 0x7BBD) & (0xFFFFFEBF & 0x5FDF);
        n.lllllIIlII[313] = -(0xFFFFC3E7 & 0x3F59) & (0xFFFF8FDF & 0x7FFE);
        n.lllllIIlII[314] = 80 + 222 - 253 + 184;
        n.lllllIIlII[315] = ((0x1E ^ 0x3A) & ~(0x8C ^ 0xA8)) + (0x85 ^ 0xB8) - -(0x68 ^ 0x11) + (0 ^ 0x34);
        n.lllllIIlII[316] = 202 + 199 - 233 + 67;
        n.lllllIIlII[317] = 223 + 177 - 373 + 209;
        n.lllllIIlII[318] = -(0xFFFFEFBE & 0x3347) & (0xFFFFAFBF & 0x7FDF);
        n.lllllIIlII[319] = 56 + 158 - -8 + 15;
        n.lllllIIlII[320] = 127 + 28 - 52 + 32 + (0x65 ^ 0x23) - (0x2A ^ 0x7B) + (0xEE ^ 0x9C);
        n.lllllIIlII[321] = 14 + 96 - 101 + 188 + (122 + 26 - 127 + 109) - (0x78 ^ 0x13) + (0x2B ^ 0x38);
        n.lllllIIlII[322] = 0xFFFFCDFE & 0x3EB3;
        n.lllllIIlII[323] = (0x77 ^ 0xC) + (81 + 112 - 183 + 128) - (56 + 155 - 165 + 179) + (156 + 3 - 27 + 73);
        n.lllllIIlII[324] = (0x74 ^ 0x1E) + (0x98 ^ 0xBD) - (79 + 11 - -31 + 13) + (129 + 1 - -7 + 96);
        n.lllllIIlII[325] = 119 + 56 - 80 + 148;
        n.lllllIIlII[326] = 189 + 59 - 41 + 29 + (108 + 141 - 92 + 9) - (0xFFFF99FF & 0x6753) + (106 + 132 - 92 + 35);
        n.lllllIIlII[327] = -(0xFFFFFF77 & 0x72C9) & (0xFFFFFFFD & 0x7EFB);
        n.lllllIIlII[328] = 0xFFFFDFFF & 0x2E0B;
        n.lllllIIlII[329] = 0xFFFF8EEF & 0x7DFD;
        n.lllllIIlII[330] = 187 + 65 - 107 + 100;
        n.lllllIIlII[331] = 162 + 15 - 10 + 79;
        n.lllllIIlII[332] = 105 + 14 - -106 + 22;
        n.lllllIIlII[333] = 38 + 126 - -56 + 28;
        n.lllllIIlII[334] = 0xFFFF8FFF & 0x7DBE;
        n.lllllIIlII[335] = -(0xFFFFD54B & 0x3AB6) & (0xFFFFBDFF & 0x5FFF);
        n.lllllIIlII[336] = -(0xFFFFB24E & 0x5DF5) & (0xFFFF9F67 & 0x7DDF);
        n.lllllIIlII[337] = 208 + 151 - 199 + 89;
        n.lllllIIlII[338] = 206 + 173 - 347 + 219;
        n.lllllIIlII[339] = 59 + 86 - 75 + 60 + (0x2C ^ 0x3E) - (127 + 99 - 211 + 126) + (2 + 236 - 35 + 42);
        n.lllllIIlII[340] = 134 + 76 - 104 + 147;
        n.lllllIIlII[341] = 71 + 114 - 108 + 64 + (0x1C ^ 0x4C) - (121 + 80 - 79 + 9) + (137 + 125 - 185 + 87);
        n.lllllIIlII[342] = 122 + 87 - 200 + 246;
        n.lllllIIlII[343] = -(0xFFFFFF7E & 0x52D1) & (0xFFFFF76F & 0x5BDF);
        n.lllllIIlII[344] = -(0xFFFFBE73 & 0x71FF) & (0xFFFFFE7F & 0x3FFE);
        n.lllllIIlII[345] = -(0xFFFFF55B & 0x2AED) & (0xFFFFADDD & 0x7EEE);
        n.lllllIIlII[346] = -(0xFFFFA3E7 & 0x7D99) & (0xFFFFEF9F & 0x3FEE);
        n.lllllIIlII[347] = 0xFFFF9FEF & 0x6E1F;
        n.lllllIIlII[348] = -(0xFFFFE787 & 0x3B79) & (0xFFFFBFFD & 0x6F82);
        n.lllllIIlII[349] = 0xFFFF9FDE & 0x6E35;
        n.lllllIIlII[350] = 0xFFFF8E8E & 0x7DFF;
        n.lllllIIlII[351] = -(0xFFFFB7CF & 0x687A) & (0xFFFFEDFF & 0x3EDF);
        n.lllllIIlII[352] = -(0xFFFFB3E3 & 0x7E5D) & (0xFFFFBFD3 & 0x7EFF);
        n.lllllIIlII[353] = 0xFFFFDF1F & 0x2EFF;
        n.lllllIIlII[354] = -(0xFFFFAFE5 & 0x715F) & (0xFFFFEFF6 & 0x3DDF);
        n.lllllIIlII[355] = -(0xFFFFFF13 & 0x51EF) & (0xFFFFDFBF & 0x7F5F);
        n.lllllIIlII[356] = 0xFFFFDFEF & 0x2E39;
        n.lllllIIlII[357] = 0xFFFFEED7 & 0x1DBD;
        n.lllllIIlII[358] = 0xFFFFFDEB & 0xE7D;
        n.lllllIIlII[359] = 0xFFFFECFE & 0x1F7F;
        n.lllllIIlII[360] = 0xFFFFBF76 & 0x4E99;
        n.lllllIIlII[361] = 0xFFFFFEF7 & 0xF1B;
        n.lllllIIlII[362] = -(36 + 148 - 166 + 145) & (0xFFFF8EAF & Short.MAX_VALUE);
        n.lllllIIlII[363] = 0xFFFFBD8D & 0x4EFF;
        n.lllllIIlII[364] = 0xFFFFCECD & 0x3F3B;
        n.lllllIIlII[365] = 0xFFFFFF78 & 0xE8F;
        n.lllllIIlII[366] = -(0xFFFFEBFF & 0x7543) & (0xFFFFEFD3 & 0x7F7F);
        n.lllllIIlII[367] = 0xFFFFFE79 & 0xF9F;
        n.lllllIIlII[368] = 0xFFFFAF5B & 0x5EBF;
        n.lllllIIlII[369] = -(0x6C ^ 0x2E) & (0xFFFFBF7D & 0x4EDB);
        n.lllllIIlII[370] = -(0xFFFFFF01 & 0x73FF) & (0xFFFFFFFF & 0x7F7F);
        n.lllllIIlII[371] = -(0xFFFFEDFB & 0x731F) & (0xFFFFEF7F & 0x7FBF);
        n.lllllIIlII[372] = -(0xFFFFF27D & 0x3D93) & (0xFFFFBF3E & 0x7EF7);
        n.lllllIIlII[373] = -(0xFFFFBDE7 & 0x527E) & (0xFFFF9DFF & 0x7EEF);
        n.lllllIIlII[374] = 0xFFFFFF26 & 0xEFD;
        n.lllllIIlII[375] = -(0xFFFFBF6D & 0x71BF) & (0xFFFFFDFD & 0x3FBF);
        n.lllllIIlII[376] = -(0xFFFFFBFF & 0x66AF) & (0xFFFFEFFF & 0x73AF);
        n.lllllIIlII[377] = -(0xFFFFD5DD & 0x3AB3) & (0xFFFFF19F & 0x1FF2);
        n.lllllIIlII[378] = -(0xFFFFC4FB & 0x7F7D) & (0xFFFFCF7F & 0x75FB);
        n.lllllIIlII[379] = 0xFFFFFF9D & 0x167;
        n.lllllIIlII[380] = 0xFFFFFEBE & 0x47D7;
        n.lllllIIlII[381] = 0xFFFFD1B6 & 0x2F4F;
        n.lllllIIlII[382] = 0xFFFFC157 & 0x3FAF;
        n.lllllIIlII[383] = 0xFFFFCF9B & 0x76FC;
        n.lllllIIlII[384] = -(0xFFFFFCB3 & 0x2FDE) & (0xFFFFBF9D & 0x6DFB);
        n.lllllIIlII[385] = 0xFFFFC789 & 0x397F;
        n.lllllIIlII[386] = -(0xFFFFDFDE & 0x6A37) & (0xFFFFEF3F & 0x5BDF);
        n.lllllIIlII[387] = -(0xFFFFE6FD & 0x7F33) & (0xFFFFE7FB & 0x7F3F);
        n.lllllIIlII[388] = -(0xFFFFBCF7 & 0x4FEB) & (0xFFFF9FEE & 0x6DFF);
        n.lllllIIlII[389] = -(0xFFFFFB2F & 0x46F3) & (0xFFFFE7EF & 0x5B3F);
        n.lllllIIlII[390] = 0xFFFFCFD2 & 0x76FD;
        n.lllllIIlII[391] = 0xFFFFB91F & 0x47EF;
        n.lllllIIlII[392] = 0xFFFFC73B & 0x39D4;
        n.lllllIIlII[393] = -(0xFFFFAE4F & 0x79BD) & (0xFFFFFEDD & 0x6FFF);
        n.lllllIIlII[394] = 0xFFFF8973 & 0x779D;
        n.lllllIIlII[395] = 0xFFFFD35A & 0x2DB7;
        n.lllllIIlII[396] = -(0xFFFF9FB1 & 0x76EF) & (0xFFFFF7F7 & 0x1FBB);
        n.lllllIIlII[397] = 0xFFFFE3DF & 0x1D34;
        n.lllllIIlII[398] = 0xFFFFA37F & 0x5D95;
        n.lllllIIlII[399] = 0xFFFFCB36 & 0x35DF;
        n.lllllIIlII[400] = -(0xFFFFFE2B & 0x65DD) & (0xFFFFED3F & 0x77DF);
        n.lllllIIlII[401] = -(0xFFFFB7F3 & 0x5C2D) & (0xFFFFBF7D & 0x55BB);
        n.lllllIIlII[402] = -(0xFFFF9797 & 0x78EE) & (0xFFFFDDBF & 0x33DF);
        n.lllllIIlII[403] = 0xFFFFF5BF & 0xB5B;
        n.lllllIIlII[404] = 0xFFFFB19D & 0x4F7E;
        n.lllllIIlII[405] = 0xFFFFF55F & 0xBBD;
        n.lllllIIlII[406] = 0xFFFFC55F & 0x3BBE;
        n.lllllIIlII[407] = -(0xFFFFBCEF & 0x5F91) & (0xFFFFBF9F & 0x5DFF);
        n.lllllIIlII[408] = 0xFFFFE9B1 & 0x176E;
        n.lllllIIlII[409] = 0xFFFF8DA9 & 0x7377;
        n.lllllIIlII[410] = -(0xFFFFFDC9 & 0x1B3F) & (0xFFFFDFBF & 0x7FEB);
        n.lllllIIlII[411] = 0xFFFF8B63 & 0x75BF;
        n.lllllIIlII[412] = 0xFFFFC53D & 0x3BE6;
        n.lllllIIlII[413] = -(0xFFFFF7B9 & 0x1A4F) & (0xFFFF9FAD & 0x737F);
        n.lllllIIlII[414] = 0xFFFFF926 & 0x7FF;
        n.lllllIIlII[415] = -(0xFFFFEFCF & 0x7EB9) & (0xFFFFEFAF & Short.MAX_VALUE);
        n.lllllIIlII[416] = 0xFFFFD9AA & 0x277D;
        n.lllllIIlII[417] = -(0xFFFFD6B7 & 0x795F) & (0xFFFFD1FF & 0x7F3F);
        n.lllllIIlII[418] = 0xFFFFD12E & 0x2FFB;
        n.lllllIIlII[419] = -(0xFFFFE77F & 0x3C85) & (0xFFFFF5BF & 0x2F6F);
        n.lllllIIlII[420] = 0xFFFFC5AD & 0x3B7F;
        n.lllllIIlII[421] = 0xFFFFE37F & 0x1DAE;
        n.lllllIIlII[422] = -(0xFFFFBED3 & 0x6FAD) & (0xFFFFBFFF & 0x6FAF);
        n.lllllIIlII[423] = -(0xFFFFFF9B & 0x2867) & (0xFFFFEB7F & 0x3DB2);
        n.lllllIIlII[424] = -(0xFFFFFB99 & 0x7EEF) & (0xFFFFFBFF & 0x7FB9);
        n.lllllIIlII[425] = -(0xFFFFED29 & 0x5EDF) & (0xFFFFEDBA & 0x5F7F);
        n.lllllIIlII[426] = -(0xFFFFBAC5 & 0x6FFF) & (0xFFFFAFFF & 0x7BF7);
        n.lllllIIlII[427] = 0xFFFFDFF5 & 0x213E;
        n.lllllIIlII[428] = 0xFFFFD9B5 & 0x277F;
        n.lllllIIlII[429] = -(0xFFFFFE99 & 0x4D6F) & (0xFFFFDFFF & 0x6D3F);
        n.lllllIIlII[430] = 0xFFFFF6AB & 0x4FFD;
        n.lllllIIlII[431] = 0xFFFF977F & 0x69B8;
        n.lllllIIlII[432] = -(0xFFFFFF67 & 0x74DF) & (0xFFFFFF7F & 0x75FF);
        n.lllllIIlII[433] = -(0xFFFFFE66 & 0x77DB) & (0xFFFFF77B & Short.MAX_VALUE);
        n.lllllIIlII[434] = 0xFFFFC7BB & 0x397F;
        n.lllllIIlII[435] = -(0xFFFFF3CF & 0x3EF2) & (0xFFFFF7FD & 0x3BFF);
        n.lllllIIlII[436] = 0xFFFFE1BD & 0x1F7F;
        n.lllllIIlII[437] = 0xFFFFDD7E & 0x23BF;
        n.lllllIIlII[438] = -(0xFFFFF7DB & 0x2EE5) & (0xFFFFE7FF & 0x3FFF);
        n.lllllIIlII[439] = 0xFFFFD5C5 & 0x2B7B;
        n.lllllIIlII[440] = 0xFFFFADE3 & 0x535E;
        n.lllllIIlII[441] = -(0xFFFF84BF & 0x7F7D) & (0xFFFFDF7F & 0x25FF);
        n.lllllIIlII[442] = -(0xFFFFF6FD & 0x7FB3) & (0xFFFFF7FE & 0x7FF5);
        n.lllllIIlII[443] = -(0xFFFFF23B & 0x6DD7) & (0xFFFFF377 & 0x6DDF);
        n.lllllIIlII[444] = -(0xFFFFBFEF & 0x5953) & (0xFFFFFFEF & 0x5FFF);
        n.lllllIIlII[445] = -(0xFFFFF62E & 0x5FDB) & (0xFFFFDF5F & 0x77EF);
        n.lllllIIlII[446] = -(0xFFFFDFC9 & 0x3437) & (0xFFFFD547 & 0x3FFF);
        n.lllllIIlII[447] = 0xFFFF99CF & 0x6778;
        n.lllllIIlII[448] = -(0xFFFFFED7 & 0x7BBF) & (0xFFFFFBDF & Short.MAX_VALUE);
        n.lllllIIlII[449] = -(0xFFFFEBA5 & 0x5EFB) & (0xFFFFFBFA & 0x4FEF);
        n.lllllIIlII[450] = -(0xFFFFFCE5 & 0x3F3F) & (0xFFFFBFFF & 0x7D6F);
        n.lllllIIlII[451] = -(0xFFFFDF73 & 0x7EBD) & (0xFFFFFF7D & 0x5FFE);
        n.lllllIIlII[452] = -(0xFFFFFCB5 & 0x5FFB) & (0xFFFFDFFF & 0x7DFD);
        n.lllllIIlII[453] = 0xFFFFC5DE & 0x3B6F;
        n.lllllIIlII[454] = 0xFFFFFEB9 & 0x47F7;
        n.lllllIIlII[455] = -(0xFFFFD9B7 & 0x2EF9) & (0xFFFFBBFF & 0x4DFF);
        n.lllllIIlII[456] = 0xFFFFEF50 & 0x11FF;
        n.lllllIIlII[457] = -(0xFFFFFEC3 & 0x1FBF) & (0xFFFFBFDB & 0x5FF7);
        n.lllllIIlII[458] = -(0xFFFFFE6E & 0x739B) & (0xFFFFFB5F & 0x77FB);
        n.lllllIIlII[459] = 0xFFFFEDFF & 0x1353;
        n.lllllIIlII[460] = -(0xFFFFFA7F & 0x7FAC) & (0xFFFFFF7F & 0x7BFF);
        n.lllllIIlII[461] = -(0xFFFFBE6B & 0x6FB5) & (0xFFFFFFF7 & 0x2F7D);
        n.lllllIIlII[462] = -(0xFFFFFBC9 & 0x36BF) & (0xFFFFF3FF & 0x3FDE);
        n.lllllIIlII[463] = 0xFFFFE1FF & 0x1F57;
        n.lllllIIlII[464] = 0xFFFF895C & 0x77FB;
        n.lllllIIlII[465] = 0xFFFFD379 & 0x2DDF;
        n.lllllIIlII[466] = 0xFFFF995A & 0x67FF;
        n.lllllIIlII[467] = -(23 + 137 - 18 + 19) & (0xFFFFCBFB & 0x35FF);
        n.lllllIIlII[468] = -(0xFFFFB92F & 0x76D4) & (0xFFFFBD5F & 0x73FF);
        n.lllllIIlII[469] = -(0xFFFFDEDB & 0x33A5) & (0xFFFFB7FD & 0x5BDF);
        n.lllllIIlII[470] = 0xFFFF875F & 0x79FE;
        n.lllllIIlII[471] = -(0xFFFFFFAF & 0x76F1) & (0xFFFFFFFF & 0x77FF);
        n.lllllIIlII[472] = -(0xFFFFD6A8 & 0x39DF) & (0xFFFF9DF7 & 0x73EF);
        n.lllllIIlII[473] = 0xFFFFFD79 & 0x3E7;
        n.lllllIIlII[474] = -(0xFFFFFB5F & 0x76AD) & (0xFFFFFBFE & 0x776F);
        n.lllllIIlII[475] = 0xFFFFD163 & 0x2FFF;
        n.lllllIIlII[476] = 0xFFFFE9E4 & 0x177F;
        n.lllllIIlII[477] = -(0xFFFFFEFF & 0x3713) & (0xFFFFFFFF & 0x3777);
        n.lllllIIlII[478] = 0xFFFF95EF & 0x6B76;
        n.lllllIIlII[479] = -(0xFFFFB7FF & 0x5A11) & (0xFFFFDFFF & 0x3377);
        n.lllllIIlII[480] = 0xFFFF8E37 & 0x7FEF;
        n.lllllIIlII[481] = 0xFFFF9F9F & 0x6CF7;
        n.lllllIIlII[482] = 0xFFFF836D & 0x7DFA;
        n.lllllIIlII[483] = -(0xFFFF8C41 & 0x7BBF) & (0xFFFFCEBD & Short.MAX_VALUE);
        n.lllllIIlII[484] = 0xFFFF9D6B & 0x63FD;
        n.lllllIIlII[485] = 0xFFFFBE73 & 0x4FAF;
        n.lllllIIlII[486] = -(0xFFFFFD9B & 0x52E5) & (0xFFFFD7EB & 0x79FE);
        n.lllllIIlII[487] = -(0xFFFF917B & 0x7FC5) & (0xFFFFDFFF & 0x77FF);
        n.lllllIIlII[488] = -(0xFFFFEEDF & 0x7535) & (0xFFFFEDFF & 0x777F);
        n.lllllIIlII[489] = 0xFFFF9F7D & 0x6EAA;
        n.lllllIIlII[490] = -(0x99 ^ 0x9C) & (0xFFFFCDAE & 0x3EFD);
        n.lllllIIlII[491] = 0xFFFF87ED & 0x797E;
        n.lllllIIlII[492] = -(0xFFFFFDAF & 0x2B5B) & (0xFFFFEFFF & 0x7FCB);
        n.lllllIIlII[493] = -(0xFFFFBEB3 & 0x5FDD) & (0xFFFFBFFD & 0x5FFF);
        n.lllllIIlII[494] = -(0xFFFFFDDE & 0x7373) & (0xFFFFFDFF & 0x7FF7);
        n.lllllIIlII[495] = 0xFFFF8CB7 & 0x7FED;
        n.lllllIIlII[496] = -(0xFFFFFCF3 & 0x7B9E) & (0xFFFFFDFF & 0x7BFF);
        n.lllllIIlII[497] = 0xFFFFF16F & 0xFFF;
        n.lllllIIlII[498] = 0xFFFF97F2 & 0x697D;
        n.lllllIIlII[499] = -(0xFFFFBA4D & 0x4DBB) & (0xFFFFBB7D & 0x4DFB);
        n.lllllIIlII[500] = -(0xFFFFBF1F & 0x7EEA) & (0xFFFFBFFB & 0x7F7F);
        n.lllllIIlII[501] = -(0xFFFFEFF9 & 0x7687) & (0xFFFFEFF3 & 0x77FF);
        n.lllllIIlII[502] = -(0xFFFFBF45 & 0x54BE) & (0xFFFFD5F7 & 0x3F7F);
        n.lllllIIlII[503] = -(0xFFFF86AF & 0x7FD9) & (0xFFFFAFFD & 0x57FF);
        n.lllllIIlII[504] = -(0xFFFFFD67 & 0x5A9A) & (0xFFFFDFFF & 0x7977);
        n.lllllIIlII[505] = 0xFFFFB37F & 0x4DF7;
        n.lllllIIlII[506] = 0xFFFFF6FC & 0x4FC7;
        n.lllllIIlII[507] = 0xFFFFD3FB & 0x2D7C;
        n.lllllIIlII[508] = 0xFFFFBF7F & 0x41F9;
        n.lllllIIlII[509] = 0xFFFFA3FB & 0x5D7E;
        n.lllllIIlII[510] = -(0xFFFFBF05 & 0x7AFF) & (0xFFFFFFFF & 0x3B7F);
        n.lllllIIlII[511] = 0xFFFFF37E & 0xDFD;
        n.lllllIIlII[512] = -(0xFFFFFFC3 & 0x7A3F) & (0xFFFFFBFF & 0x7F7F);
        n.lllllIIlII[513] = -(0xFFFFF613 & 0x5BEE) & (0xFFFFFFFF & 0x537F);
        n.lllllIIlII[514] = -(0xFFFF9B2D & 0x66D3) & (0xFFFFEF7F & 0x13FF);
        n.lllllIIlII[515] = 0xFFFFE1FD & 0x1F82;
        n.lllllIIlII[516] = -(0xFFFFF72B & 0x59D5) & (0xFFFFFDFF & 0x5FA3);
        n.lllllIIlII[517] = 0xFFFFAEFC & 0x5F3B;
        n.lllllIIlII[518] = -(0xFFFF8BDF & 0x7E3F) & (0xFFFFDBBF & 0x2FDF);
        n.lllllIIlII[519] = 0xFFFFA3BF & 0x5DC2;
        n.lllllIIlII[520] = -(0xFFFFF3CB & 0x7DF5) & (0xFFFFFFEF & 0x7FFB);
        n.lllllIIlII[521] = -(0xFFFFC92B & 0x7EF5) & (0xFFFFCBB7 & 0x7DEB);
        n.lllllIIlII[522] = -(0xFFFFFCBD & 0x777E) & (0xFFFFFFFF & 0x75BF);
        n.lllllIIlII[523] = 0xFFFFC5F5 & 0x3B8F;
        n.lllllIIlII[524] = 0xFFFFED9E & 0x13E7;
        n.lllllIIlII[525] = -(0xFFFF99EB & 0x6E3D) & (0xFFFFCDAF & 0x3BFF);
        n.lllllIIlII[526] = -(0xFFFFEFF7 & 0x5E6C) & (0xFFFFDFEB & 0x6FFF);
        n.lllllIIlII[527] = -(0xFFFFFE5D & 0x57B3) & (0xFFFFD7BB & 0x7FDD);
        n.lllllIIlII[528] = 0xFFFFB1BA & 0x4FCF;
        n.lllllIIlII[529] = -(0xFFFFFEFF & 0x7335) & (0xFFFFF3FF & 0x7FBF);
        n.lllllIIlII[530] = 0xFFFFF5BF & 0xBCC;
        n.lllllIIlII[531] = 0xFFFFC78D & 0x39FF;
        n.lllllIIlII[532] = 0xFFFF91FE & 0x6F8F;
        n.lllllIIlII[533] = -(88 + 49 - 16 + 10) & (0xFFFFCFB7 & 0x3EFB);
        n.lllllIIlII[534] = -(0xFFFFFC5B & 0x7BA5) & (0xFFFFFFCF & 0x79BF);
        n.lllllIIlII[535] = 0xFFFFCED5 & 0x77EF;
        n.lllllIIlII[536] = -(0xFFFFDF2C & 0x62DF) & (0xFFFFD3BB & 0x6FDF);
        n.lllllIIlII[537] = 0xFFFFDBB7 & 0x25D9;
        n.lllllIIlII[538] = -(0xFFFFDF77 & 0x30CE) & (0xFFFFF7FF & 0x19D7);
        n.lllllIIlII[539] = -(0xFFFFDF65 & 0x3EBF) & (0xFFFF9FFF & 0x7FB7);
        n.lllllIIlII[540] = 0xFFFF879F & 0x79F4;
        n.lllllIIlII[541] = -(0xFFFFD76B & 0x78FD) & (0xFFFFF3FD & 0x5DFF);
        n.lllllIIlII[542] = -(0xFFFFFDAA & 0x7E7F) & (0xFFFFFDBF & Short.MAX_VALUE);
        n.lllllIIlII[543] = 0xFFFF9197 & 0x6FFF;
        n.lllllIIlII[544] = -(0xFFFFFF7F & 0x20E8) & (0xFFFFE5FF & 0x3BFF);
        n.lllllIIlII[545] = -(0xFFFFFEED & 0x6F73) & (0xFFFFFFFD & 0x6FFB);
        n.lllllIIlII[546] = -(0xFFFFFF75 & 0x6ACF) & (0xFFFFEFFF & 0x7BDE);
        n.lllllIIlII[547] = 0xFFFF89BF & 0x77DB;
        n.lllllIIlII[548] = 0xFFFF8BDC & 0x75BF;
        n.lllllIIlII[549] = 0xFFFF9DFD & 0x639F;
        n.lllllIIlII[550] = -(0xFFFFDF73 & 0x3CCE) & (0xFFFFBFDF & 0x5DFF);
        n.lllllIIlII[551] = -(0xFFFFD6F1 & 0x794F) & (0xFFFFD9FF & 0x77DF);
        n.lllllIIlII[552] = -(0xFFFFBFE7 & 0x581F) & (0xFFFFD9FF & 0x3FA6);
        n.lllllIIlII[553] = 0xFFFFBBF7 & 0x45A9;
        n.lllllIIlII[554] = 0xFFFF9E15 & 0x6FFF;
        n.lllllIIlII[555] = -(0xFFFFEFA3 & 0x737D) & (0xFFFFEFFF & 0x7F79);
        n.lllllIIlII[556] = 0xFFFFFDDF & 0xE7B;
        n.lllllIIlII[557] = -(0xFFFFBF87 & 0x72FD) & (0xFFFFFEFF & 0x3FDE);
        n.lllllIIlII[558] = -(0xFFFFBB47 & 0x66F9) & (0xFFFFEFEA & 0x33F7);
        n.lllllIIlII[559] = -(0xFFFFEBCB & 0x1DFD) & (0xFFFFDFFF & 0x6FEE);
        n.lllllIIlII[560] = -(0xFFFFE6FB & 0x3F5D) & (0xFFFFAFFF & 0x77FB);
        n.lllllIIlII[561] = -(0xFFFFFC4F & 0x67B4) & (0xFFFFE5B7 & 0x7FEF);
        n.lllllIIlII[562] = -(0xFFFFBDDD & 0x636B) & (0xFFFFEF7F & 0x77EF);
        n.lllllIIlII[563] = 0xFFFFDDAD & 0x23F7;
        n.lllllIIlII[564] = -(0xFFFFF295 & 0x6F7B) & (0xFFFFE7B6 & 0x7BFF);
        n.lllllIIlII[565] = 0xFFFF8FAF & 0x71F7;
        n.lllllIIlII[566] = 0xFFFF85FF & 0x7BA8;
        n.lllllIIlII[567] = -(0xFFFFFB57 & 0x56BB) & (0xFFFFD3FF & 0x7FBB);
        n.lllllIIlII[568] = -(0xFFFFBDF6 & 0x5A4B) & (0xFFFF9FEF & 0x79FB);
        n.lllllIIlII[569] = 0xFFFFDBEB & 0x25BF;
        n.lllllIIlII[570] = -(0xFFFFB7DE & 0x7E63) & (0xFFFFFFFF & 0x37ED);
        n.lllllIIlII[571] = -(0xFFFFE5EB & 0x3E57) & (0xFFFFFFFF & 0x25EF);
        n.lllllIIlII[572] = 0xFFFF9FEF & 0x61BF;
        n.lllllIIlII[573] = 0xFFFFE5B5 & 0x1BFA;
        n.lllllIIlII[574] = -(0xFFFFFEE7 & 0x5D5D) & (0xFFFFFDFF & 0x5FF5);
        n.lllllIIlII[575] = 0xFFFF83F6 & 0x7DBB;
        n.lllllIIlII[576] = 0xFFFFF1FB & 0xFB7;
        n.lllllIIlII[577] = 0xFFFFBCD7 & 0x7F78;
        n.lllllIIlII[578] = -(0xFFFFFC47 & 0x63BB) & (0xFFFFF5C3 & 0x7F7E);
        n.lllllIIlII[579] = -(0xFFFFFE1F & 0x61E1) & (0xFFFFEBB9 & 0x75FE);
        n.lllllIIlII[580] = -(0xFFFFADBE & 0x5F77) & (0xFFFFBFFF & 0x7FFD);
        n.lllllIIlII[581] = -(0xFFFF93B7 & 0x7CE9) & (0xFFFF9CFD & 0x7FEA);
        n.lllllIIlII[582] = -(0xFFFFFF4F & 0x7DB2) & (0xFFFFFFFF & 0x7FBD);
        n.lllllIIlII[583] = -(0xFFFFFF36 & 0x20EB) & (0xFFFFB8BD & Short.MAX_VALUE);
        n.lllllIIlII[584] = -(0xFFFFD5E0 & 0x2BFF) & (0xFFFFFFFF & 0x1DFF);
        n.lllllIIlII[585] = 0xFFFFF9BD & 0x2776;
        n.lllllIIlII[586] = 0xFFFFA53E & 0x7FDD;
        n.lllllIIlII[587] = 0xFFFFAFDF & 0x7EEC;
        n.lllllIIlII[588] = 0xFFFFF1EA & 0x6FBD;
        n.lllllIIlII[589] = 0xFFFF8BB7 & 0x77CC;
        n.lllllIIlII[590] = 0xFFFFEFBD & 0x11F6;
        n.lllllIIlII[591] = 0xFFFFDFB7 & 0x21FD;
        n.lllllIIlII[592] = 0xFFFFCDF6 & 0x33BF;
        n.lllllIIlII[593] = 0xFFFFD7B7 & 0x29FF;
        n.lllllIIlII[594] = -(0xFFFFED7F & 0x37B3) & (0xFFFFBF7F & 0x6FBF);
        n.lllllIIlII[595] = -(0xFFFF9FF3 & 0x723F) & (0xFFFFFFF7 & 0x1FFF);
        n.lllllIIlII[596] = 0xFFFF9C7F & 0x6FEC;
        n.lllllIIlII[597] = -(0xFFFFC053 & 0x7FAE) & (0xFFFFFFAF & 0x65FD);
        n.lllllIIlII[598] = 0xFFFF8D3E & Short.MAX_VALUE;
        n.lllllIIlII[599] = -(0xFFFF9679 & 0x79EF) & (0xFFFF9DFF & Short.MAX_VALUE);
        n.lllllIIlII[600] = 0xFFFFEDEF & 0x1FF4;
        n.lllllIIlII[601] = 0xFFFFED77 & 0x1FBB;
        n.lllllIIlII[602] = 0xFFFFCFEE & 0x3DD3;
        n.lllllIIlII[603] = -(0xFFFFEC87 & 0x73FB) & (0xFFFFED9F & Short.MAX_VALUE);
        n.lllllIIlII[604] = -(0xB6 ^ 0xB2) & (0xFFFFFDFF & 0xFF7);
        n.lllllIIlII[605] = 0xFFFF8D83 & 0x7F7F;
        n.lllllIIlII[606] = -(0xFFFFE951 & 0x37BF) & (0xFFFFBD7B & 0x6FFF);
        n.lllllIIlII[607] = 0xFFFFADBF & 0x5FCF;
        n.lllllIIlII[608] = 0xFFFFDF57 & 0x2CFE;
        n.lllllIIlII[609] = -(0xFFFFF336 & 0x7DCD) & (0xFFFFFFFF & 0x7DA7);
        n.lllllIIlII[610] = 0xFFFFA5B9 & 0x5BFF;
        n.lllllIIlII[611] = -(0xFFFFEF17 & 0x32EE) & (0xFFFFBBBF & 0x67FF);
        n.lllllIIlII[612] = -(0xFFFFDF0F & 0x6EF5) & (0xFFFFDFFF & 0x6FBF);
        n.lllllIIlII[613] = -(0xFFFFFA6D & 0x75D3) & (0xFFFFF9FE & 0x77FD);
        n.lllllIIlII[614] = 0xFFFFFDBD & 0x3FF;
        n.lllllIIlII[615] = 0xFFFFF5FF & 0xBBE;
        n.lllllIIlII[616] = -(0xFFFFCC4D & 0x77F3) & (0xFFFFCDFF & 0x77FF);
        n.lllllIIlII[617] = -(0xFFFFFE3E & 0x15ED) & (0xFFFFBDEF & 0x57FB);
        n.lllllIIlII[618] = -(0xFFFFEBFF & 0x3E3F) & (0xFFFFFBFF & 0x2FFF);
        n.lllllIIlII[619] = -(0xFFFFE677 & 0x5DAD) & (0xFFFFC7EF & 0x7DF6);
        n.lllllIIlII[620] = -(0xFFFFDB7F & 0x7E99) & (0xFFFFDFFF & 0x7BDB);
        n.lllllIIlII[621] = -(0xFFFFF47B & 0x2BBE) & (0xFFFFABFF & 0x75FD);
        n.lllllIIlII[622] = -(0xFFFFEFF7 & 0x3E39) & (0xFFFFFFFF & 0x2FF5);
    }

    private static boolean llIlIIlIlIlIl(Object object) {
        return object == null;
    }

    static {
        n.llIlIIlIIlllI();
        n.llIlIIlIIllII();
        bu = new ArrayList<d>();
        bX = lllllIIlII[594];
        bY = new WorldPoint(lllllIIlII[595], lllllIIlII[596], lllllIIlII[1]);
        bZ = new WorldPoint(lllllIIlII[361], lllllIIlII[373], lllllIIlII[1]);
        ca = new WorldPoint(lllllIIlII[520], lllllIIlII[597], lllllIIlII[1]);
        cb = new WorldPoint(lllllIIlII[598], lllllIIlII[599], lllllIIlII[1]);
        cc = new WorldPoint(lllllIIlII[600], lllllIIlII[601], lllllIIlII[1]);
        cd = new WorldPoint(lllllIIlII[602], lllllIIlII[603], lllllIIlII[1]);
        ce = new WorldPoint(lllllIIlII[604], lllllIIlII[605], lllllIIlII[1]);
        cf = new WorldPoint(lllllIIlII[554], lllllIIlII[555], lllllIIlII[0]);
        cg = new WorldArea(lllllIIlII[280], lllllIIlII[606], lllllIIlII[57], lllllIIlII[56], lllllIIlII[1]);
        ch = new WorldArea(lllllIIlII[607], lllllIIlII[608], lllllIIlII[91], lllllIIlII[111], lllllIIlII[1]);
        ci = new WorldArea(lllllIIlII[334], lllllIIlII[329], lllllIIlII[113], lllllIIlII[103], lllllIIlII[1]);
        cj = new WorldArea(lllllIIlII[599], lllllIIlII[609], lllllIIlII[133], lllllIIlII[112], lllllIIlII[1]);
        String[] stringArray = new String[lllllIIlII[20]];
        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[579]];
        stringArray[n.lllllIIlII[0]] = llllIllIlI[lllllIIlII[610]];
        stringArray[n.lllllIIlII[4]] = llllIllIlI[lllllIIlII[611]];
        stringArray[n.lllllIIlII[6]] = llllIllIlI[lllllIIlII[612]];
        stringArray[n.lllllIIlII[8]] = llllIllIlI[lllllIIlII[613]];
        stringArray[n.lllllIIlII[2]] = llllIllIlI[lllllIIlII[614]];
        stringArray[n.lllllIIlII[11]] = llllIllIlI[lllllIIlII[615]];
        stringArray[n.lllllIIlII[13]] = llllIllIlI[lllllIIlII[616]];
        stringArray[n.lllllIIlII[15]] = llllIllIlI[lllllIIlII[617]];
        stringArray[n.lllllIIlII[16]] = llllIllIlI[lllllIIlII[618]];
        stringArray[n.lllllIIlII[17]] = llllIllIlI[lllllIIlII[619]];
        stringArray[n.lllllIIlII[19]] = llllIllIlI[lllllIIlII[620]];
        bQ = stringArray;
        cm = llllIllIlI[lllllIIlII[621]];
        h = "Darkness of Hallowvale " + cm;
    }

    /*
     * WARNING - void declaration
     */
    public static void aA() {
        WorldArea var34;
        WorldPoint var66;
        WorldArea var110;
        void var103;
        void var78;
        void var12;
        void var18;
        void var98;
        void var81;
        void var105;
        void var6;
        void var104;
        void var56;
        void var21;
        void var25;
        void var36;
        void var35;
        void var19;
        void var73;
        void var15;
        void var62;
        void var14;
        void var2;
        void var4;
        void var51;
        void var3;
        void var28;
        WorldPoint worldPoint = new WorldPoint(lllllIIlII[344], lllllIIlII[345], lllllIIlII[1]);
        WorldPoint worldPoint2 = new WorldPoint(lllllIIlII[346], lllllIIlII[274], lllllIIlII[0]);
        WorldPoint worldPoint3 = new WorldPoint(lllllIIlII[347], lllllIIlII[348], lllllIIlII[0]);
        WorldPoint worldPoint4 = new WorldPoint(lllllIIlII[349], lllllIIlII[350], lllllIIlII[0]);
        WorldPoint worldPoint5 = new WorldPoint(lllllIIlII[346], lllllIIlII[351], lllllIIlII[0]);
        WorldPoint worldPoint6 = new WorldPoint(lllllIIlII[214], lllllIIlII[352], lllllIIlII[1]);
        WorldPoint worldPoint7 = new WorldPoint(lllllIIlII[353], lllllIIlII[354], lllllIIlII[0]);
        WorldPoint worldPoint8 = new WorldPoint(lllllIIlII[355], lllllIIlII[291], lllllIIlII[6]);
        WorldPoint worldPoint9 = new WorldPoint(lllllIIlII[356], lllllIIlII[357], lllllIIlII[4]);
        WorldArea worldArea = new WorldArea(lllllIIlII[278], lllllIIlII[358], lllllIIlII[3], lllllIIlII[53], lllllIIlII[1]);
        WorldArea worldArea2 = new WorldArea(lllllIIlII[273], lllllIIlII[274], lllllIIlII[11], lllllIIlII[6], lllllIIlII[1]);
        WorldArea worldArea3 = new WorldArea(lllllIIlII[273], lllllIIlII[274], lllllIIlII[11], lllllIIlII[8], lllllIIlII[0]);
        WorldArea worldArea4 = new WorldArea(lllllIIlII[344], lllllIIlII[359], lllllIIlII[8], lllllIIlII[8], lllllIIlII[0]);
        WorldArea worldArea5 = new WorldArea(lllllIIlII[360], lllllIIlII[359], lllllIIlII[11], lllllIIlII[11], lllllIIlII[0]);
        WorldArea worldArea6 = new WorldArea(lllllIIlII[349], lllllIIlII[301], lllllIIlII[8], lllllIIlII[6], lllllIIlII[0]);
        WorldArea worldArea7 = new WorldArea(lllllIIlII[361], lllllIIlII[291], lllllIIlII[11], lllllIIlII[16], lllllIIlII[0]);
        WorldArea worldArea8 = new WorldArea(lllllIIlII[346], lllllIIlII[350], lllllIIlII[2], lllllIIlII[6], lllllIIlII[0]);
        WorldArea worldArea9 = new WorldArea(lllllIIlII[362], lllllIIlII[363], lllllIIlII[11], lllllIIlII[2], lllllIIlII[1]);
        WorldArea worldArea10 = new WorldArea(lllllIIlII[364], lllllIIlII[352], lllllIIlII[11], lllllIIlII[2], lllllIIlII[1]);
        WorldArea worldArea11 = new WorldArea(lllllIIlII[365], lllllIIlII[352], lllllIIlII[2], lllllIIlII[2], lllllIIlII[0]);
        WorldArea worldArea12 = new WorldArea(lllllIIlII[362], lllllIIlII[352], lllllIIlII[4], lllllIIlII[2], lllllIIlII[0]);
        WorldArea worldArea13 = new WorldArea(lllllIIlII[360], lllllIIlII[354], lllllIIlII[8], lllllIIlII[11], lllllIIlII[0]);
        WorldArea worldArea14 = new WorldArea(lllllIIlII[366], lllllIIlII[354], lllllIIlII[15], lllllIIlII[11], lllllIIlII[1]);
        WorldArea worldArea15 = new WorldArea(lllllIIlII[367], lllllIIlII[354], lllllIIlII[19], lllllIIlII[11], lllllIIlII[1]);
        WorldArea worldArea16 = new WorldArea(lllllIIlII[368], lllllIIlII[354], lllllIIlII[16], lllllIIlII[13], lllllIIlII[0]);
        WorldArea worldArea17 = new WorldArea(lllllIIlII[355], lllllIIlII[291], lllllIIlII[13], lllllIIlII[16], lllllIIlII[0]);
        WorldArea worldArea18 = new WorldArea(lllllIIlII[367], lllllIIlII[291], lllllIIlII[16], lllllIIlII[16], lllllIIlII[4]);
        WorldArea worldArea19 = new WorldArea(lllllIIlII[369], lllllIIlII[291], lllllIIlII[15], lllllIIlII[8], lllllIIlII[6]);
        WorldArea worldArea20 = new WorldArea(lllllIIlII[367], lllllIIlII[300], lllllIIlII[13], lllllIIlII[2], lllllIIlII[6]);
        WorldArea worldArea21 = new WorldArea(lllllIIlII[369], lllllIIlII[370], lllllIIlII[17], lllllIIlII[11], lllllIIlII[4]);
        WorldArea worldArea22 = new WorldArea(lllllIIlII[371], lllllIIlII[348], lllllIIlII[11], lllllIIlII[15], lllllIIlII[4]);
        WorldArea worldArea23 = new WorldArea(lllllIIlII[371], lllllIIlII[300], lllllIIlII[2], lllllIIlII[13], lllllIIlII[0]);
        WorldArea worldArea24 = new WorldArea(lllllIIlII[372], lllllIIlII[373], lllllIIlII[8], lllllIIlII[15], lllllIIlII[0]);
        WorldArea worldArea25 = new WorldArea(lllllIIlII[374], lllllIIlII[375], lllllIIlII[11], lllllIIlII[2], lllllIIlII[4]);
        WorldArea worldArea26 = new WorldArea(lllllIIlII[224], lllllIIlII[237], lllllIIlII[2], lllllIIlII[2], lllllIIlII[1]);
        if (n.llIlIIlIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
            void var1;
            if (n.llIlIIlIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[376]];
                Movement.walkTo((WorldPoint)worldPoint);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[377]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[378]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[151]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var102;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[379]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var102) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var102);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var102) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[380];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[381]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var41;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[382]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var41) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var41);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var41) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[383];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[384]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[385]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lllllIIlII[0]];
                stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[386]];
                String[] stringArray3 = new String[lllllIIlII[0]];
                stringArray3[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[387]];
                if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[388]];
                    String[] stringArray4 = new String[lllllIIlII[0]];
                    stringArray4[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[389]];
                    TileObjects.getNearest((String[])stringArray4).interact(llllIllIlI[lllllIIlII[165]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
            int[] nArray = new int[lllllIIlII[0]];
            nArray[n.lllllIIlII[1]] = lllllIIlII[390];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((int[])nArray))) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[391]];
                int[] nArray2 = new int[lllllIIlII[0]];
                nArray2[n.lllllIIlII[1]] = lllllIIlII[390];
                TileObjects.getNearest((int[])nArray2).interact(llllIllIlI[lllllIIlII[392]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
            int[] nArray3 = new int[lllllIIlII[0]];
            nArray3[n.lllllIIlII[1]] = lllllIIlII[393];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((int[])nArray3))) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[394]];
                int[] nArray4 = new int[lllllIIlII[0]];
                nArray4[n.lllllIIlII[1]] = lllllIIlII[393];
                TileObjects.getNearest((int[])nArray4).interact(llllIllIlI[lllllIIlII[395]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[396]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[397]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[398]]);
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
        if (n.llIlIIlIIllll(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var90;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[399]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var90) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var90);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var90) ? 1 : 0)) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[400]];
                if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray5 = new String[lllllIIlII[0]];
                    stringArray5[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[166]];
                    String[] stringArray6 = new String[lllllIIlII[0]];
                    stringArray6[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[401]];
                    if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray5).hasAction(stringArray6) ? 1 : 0)) {
                        String[] stringArray7 = new String[lllllIIlII[0]];
                        stringArray7[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[402]];
                        TileObjects.getNearest((String[])stringArray7).interact(llllIllIlI[lllllIIlII[403]]);
                        Time.sleepTicks((int)lllllIIlII[4]);
                        0;
                    }
                }
                String[] stringArray8 = new String[lllllIIlII[0]];
                stringArray8[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[404]];
                if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray8))) {
                    String[] stringArray9 = new String[lllllIIlII[0]];
                    stringArray9[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[405]];
                    TileObjects.getNearest((String[])stringArray9).interact(llllIllIlI[lllllIIlII[406]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
        }
        if (n.llIlIIlIIllll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[407]];
            Time.sleepTicks((int)lllllIIlII[4]);
            0;
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[408]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[409]]);
            Time.sleepTicks((int)lllllIIlII[2]);
            0;
        }
        if (n.llIlIIlIIllll(var62.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[167]];
            int[] nArray = new int[lllllIIlII[0]];
            nArray[n.lllllIIlII[1]] = lllllIIlII[410];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((int[])nArray))) {
                int[] nArray5 = new int[lllllIIlII[0]];
                nArray5[n.lllllIIlII[1]] = lllllIIlII[410];
                TileObjects.getNearest((int[])nArray5).interact(llllIllIlI[lllllIIlII[411]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[412]];
            if (n.llIlIIlIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray10 = new String[lllllIIlII[0]];
                stringArray10[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[413]];
                TileObjects.getNearest((String[])stringArray10).interact(llllIllIlI[lllllIIlII[414]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
            String[] stringArray11 = new String[lllllIIlII[0]];
            stringArray11[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[415]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray11))) {
                String[] stringArray12 = new String[lllllIIlII[0]];
                stringArray12[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[416]];
                String[] stringArray13 = new String[lllllIIlII[0]];
                stringArray13[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[417]];
                if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray12).hasAction(stringArray13) ? 1 : 0)) {
                    String[] stringArray14 = new String[lllllIIlII[0]];
                    stringArray14[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[418]];
                    TileObjects.getNearest((String[])stringArray14).interact(llllIllIlI[lllllIIlII[419]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
            String[] stringArray15 = new String[lllllIIlII[0]];
            stringArray15[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[168]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray15))) {
                String[] stringArray16 = new String[lllllIIlII[0]];
                stringArray16[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[420]];
                String[] stringArray17 = new String[lllllIIlII[0]];
                stringArray17[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[421]];
                if (n.llIlIIlIIllll(TileObjects.getNearest((String[])stringArray16).hasAction(stringArray17) ? 1 : 0)) {
                    String[] stringArray18 = new String[lllllIIlII[0]];
                    stringArray18[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[422]];
                    TileObjects.getNearest((String[])stringArray18).interact(llllIllIlI[lllllIIlII[423]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
        }
        if (n.llIlIIlIIllll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[424]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[425]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[426]]);
            Time.sleepTicks((int)lllllIIlII[2]);
            0;
        }
        if (n.llIlIIlIIllll(var73.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[427]];
            if (n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[428]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[182]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var49;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[429]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var49) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var49);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var49) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[430];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[431]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[432]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[433]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[434]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        if (n.llIlIIlIIllll(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[367], lllllIIlII[357], lllllIIlII[1])) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[435]];
            if (n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[436]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[437]]);
                Time.sleepTicks((int)lllllIIlII[13]);
                0;
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[438]];
                String[] stringArray19 = new String[lllllIIlII[0]];
                stringArray19[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[192]];
                TileObjects.getNearest((String[])stringArray19).interact(llllIllIlI[lllllIIlII[439]]);
                Time.sleepTicks((int)lllllIIlII[4]);
                0;
            }
        }
        if (!n.llIlIIlIlIIIl(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIIlII[367], lllllIIlII[357], lllllIIlII[1])) ? 1 : 0)) {
            void var108;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[440]];
            if (n.llIlIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var108), lllllIIlII[6])) {
                Movement.walkTo((WorldPoint)var108);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var108), lllllIIlII[6])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[441]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[442]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var91;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[443]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var91) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var91);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var91) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[444];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[445]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var56.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[446]];
            if (n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[447]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[448]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var104.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[449]];
            if (n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[450]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[451]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[452]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var80;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[453]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var80) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var80);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var80) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[454];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[455]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var105.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[456]];
            if (n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[457]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[458]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[459]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var81.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[460]];
            if (n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[461]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[462]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var98.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[463]];
            if (n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[464]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[465]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[466]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[467]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[468]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray20 = new String[lllllIIlII[0]];
                stringArray20[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[469]];
                TileObjects.getNearest((String[])stringArray20).interact(llllIllIlI[lllllIIlII[470]]);
                Time.sleepTicks((int)lllllIIlII[8]);
                0;
            }
            String[] stringArray21 = new String[lllllIIlII[0]];
            stringArray21[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[471]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray21))) {
                String[] stringArray22 = new String[lllllIIlII[0]];
                stringArray22[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[472]];
                TileObjects.getNearest((String[])stringArray22).interact(llllIllIlI[lllllIIlII[473]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[474]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[475]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[476]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        if (n.llIlIIlIIllll(var78.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var64;
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[477]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var64) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var64);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var64) ? 1 : 0) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[478]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[479]]);
                Time.sleepTicks((int)lllllIIlII[4]);
                0;
            }
        }
        WorldArea var23 = new WorldArea(lllllIIlII[371], lllllIIlII[351], lllllIIlII[15], lllllIIlII[6], lllllIIlII[0]);
        WorldArea var88 = new WorldArea(lllllIIlII[356], lllllIIlII[354], lllllIIlII[8], lllllIIlII[13], lllllIIlII[0]);
        WorldPoint var96 = new WorldPoint(lllllIIlII[480], lllllIIlII[481], lllllIIlII[0]);
        if (!n.llIlIIlIlIIIl(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.llIlIIlIIllll(var88.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[482]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var96) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var96);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var96) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[483];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[484]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        WorldArea var13 = new WorldArea(lllllIIlII[485], lllllIIlII[318], lllllIIlII[2], lllllIIlII[2], lllllIIlII[0]);
        WorldPoint var97 = new WorldPoint(lllllIIlII[372], lllllIIlII[313], lllllIIlII[0]);
        if (n.llIlIIlIIllll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[486]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var97) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var97);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var97) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[487];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[488]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        WorldArea var63 = new WorldArea(lllllIIlII[485], lllllIIlII[40], lllllIIlII[11], lllllIIlII[17], lllllIIlII[0]);
        WorldPoint var95 = new WorldPoint(lllllIIlII[489], lllllIIlII[490], lllllIIlII[0]);
        if (n.llIlIIlIIllll(var63.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[491]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var95) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var95);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var95) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[492];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[493]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        WorldArea var38 = new WorldArea(lllllIIlII[356], lllllIIlII[494], lllllIIlII[15], lllllIIlII[8], lllllIIlII[0]);
        WorldArea var54 = new WorldArea(lllllIIlII[489], lllllIIlII[495], lllllIIlII[16], lllllIIlII[11], lllllIIlII[4]);
        if (n.llIlIIlIIllll(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[496]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray23 = new String[lllllIIlII[0]];
                stringArray23[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[497]];
                if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray23) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[498]];
                    Time.sleepTicks((int)lllllIIlII[4]);
                    0;
                    String[] stringArray24 = new String[lllllIIlII[0]];
                    stringArray24[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[499]];
                    TileObjects.getNearest((String[])stringArray24).interact(llllIllIlI[lllllIIlII[500]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
            String[] stringArray25 = new String[lllllIIlII[0]];
            stringArray25[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[501]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray25))) {
                String[] stringArray26 = new String[lllllIIlII[0]];
                stringArray26[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[502]];
                if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[503]];
                    String[] stringArray27 = new String[lllllIIlII[0]];
                    stringArray27[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[504]];
                    TileObjects.getNearest((String[])stringArray27).interact(llllIllIlI[lllllIIlII[505]]);
                    Time.sleepTicks((int)lllllIIlII[6]);
                    0;
                }
            }
            int[] nArray = new int[lllllIIlII[0]];
            nArray[n.lllllIIlII[1]] = lllllIIlII[506];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((int[])nArray))) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[507]];
                int[] nArray6 = new int[lllllIIlII[0]];
                nArray6[n.lllllIIlII[1]] = lllllIIlII[506];
                TileObjects.getNearest((int[])nArray6).interact(llllIllIlI[lllllIIlII[508]]);
            }
        }
        if (n.llIlIIlIIllll(var54.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[509]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[510]];
            if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray28 = new String[lllllIIlII[0]];
                stringArray28[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[511]];
                TileObjects.getNearest((String[])stringArray28).interact(llllIllIlI[lllllIIlII[512]]);
                Time.sleepTicks((int)lllllIIlII[2]);
                0;
            }
            String[] stringArray29 = new String[lllllIIlII[0]];
            stringArray29[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[513]];
            if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                String[] stringArray30 = new String[lllllIIlII[0]];
                stringArray30[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[514]];
                TileObjects.getNearest((String[])stringArray30).interact(llllIllIlI[lllllIIlII[515]]);
            }
        }
        WorldArea var71 = new WorldArea(lllllIIlII[224], lllllIIlII[225], lllllIIlII[11], lllllIIlII[11], lllllIIlII[1]);
        WorldArea var99 = new WorldArea(lllllIIlII[485], lllllIIlII[516], lllllIIlII[45], lllllIIlII[33], lllllIIlII[1]);
        WorldPoint lllllllllllllllllIlIIllIlIIllIll = new WorldPoint(lllllIIlII[517], lllllIIlII[215], lllllIIlII[1]);
        WorldPoint var53 = new WorldPoint(lllllIIlII[219], lllllIIlII[220], lllllIIlII[1]);
        if (n.llIlIIlIIllll(var99.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var103.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            block106: {
                if (!n.llIlIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[150]) || n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[151])) {
                    do {
                        String[] stringArray = new String[lllllIIlII[0]];
                        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[518]];
                        if (!n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block106;
                        String[] stringArray31 = new String[lllllIIlII[0]];
                        stringArray31[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[519]];
                        if (!n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray31) ? 1 : 0)) break block106;
                        var110 = new WorldPoint(lllllIIlII[520], lllllIIlII[250], lllllIIlII[1]);
                        var66 = new WorldArea(lllllIIlII[356], lllllIIlII[237], lllllIIlII[8], lllllIIlII[11], lllllIIlII[1]);
                        if (n.llIlIIlIlIIIl(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[521]];
                            Movement.walkTo((WorldPoint)var110);
                            0;
                            Time.sleepTicks((int)lllllIIlII[0]);
                            0;
                        }
                        if (n.llIlIIlIIllll(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[522]];
                            String[] stringArray32 = new String[lllllIIlII[0]];
                            stringArray32[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[523]];
                            if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray32) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray33 = new String[lllllIIlII[0]];
                                stringArray33[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[524]];
                                if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray33))) {
                                    int[] nArray = new int[lllllIIlII[0]];
                                    nArray[n.lllllIIlII[1]] = lllllIIlII[27];
                                    String[] stringArray34 = new String[lllllIIlII[0]];
                                    stringArray34[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[525]];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray34));
                                    Time.sleepTicks((int)lllllIIlII[8]);
                                    0;
                                }
                            }
                            String[] stringArray35 = new String[lllllIIlII[0]];
                            stringArray35[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[526]];
                            if (n.llIlIIlIlIIIl(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                String[] stringArray36 = new String[lllllIIlII[0]];
                                stringArray36[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[527]];
                                if (n.llIlIIlIIllll(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                    int[] nArray = new int[lllllIIlII[0]];
                                    nArray[n.lllllIIlII[1]] = lllllIIlII[27];
                                    String[] stringArray37 = new String[lllllIIlII[0]];
                                    stringArray37[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[528]];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray37));
                                    Time.sleepTicks((int)lllllIIlII[6]);
                                    0;
                                }
                            }
                        }
                        if (n.llIlIIlIIllll(AccBuilderTempleTrek.d ? 1 : 0)) {
                            0;
                            if (-1 > 0) {
                                return;
                            }
                            break block106;
                        }
                        g.a(bQ);
                        Time.sleepTicks((int)lllllIIlII[0]);
                        0;
                        0;
                    } while (1 >= 0);
                    return;
                }
            }
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var53) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[529]];
                Movement.walkTo((WorldPoint)var53);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var53) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[530]];
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[531]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[532]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        var110 = new WorldArea(lllllIIlII[175], lllllIIlII[249], lllllIIlII[11], lllllIIlII[2], lllllIIlII[0]);
        var66 = new WorldPoint(lllllIIlII[533], lllllIIlII[251], lllllIIlII[0]);
        if (n.llIlIIlIIllll(var110.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[534]];
            if (n.llIlIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var66) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var66);
                0;
                Time.sleepTicks((int)lllllIIlII[0]);
                0;
            }
            if (n.llIlIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)var66) ? 1 : 0)) {
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[535];
                TileObjects.getNearest((int[])nArray).interact(llllIllIlI[lllllIIlII[536]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if (n.llIlIIlIIllll((var34 = new WorldArea(lllllIIlII[221], lllllIIlII[250], lllllIIlII[2], lllllIIlII[13], lllllIIlII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[537]];
            if (n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0) && n.llIlIIlIlIllI(Players.getLocal().getAnimation(), lllllIIlII[51])) {
                String[] stringArray = new String[lllllIIlII[0]];
                stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[538]];
                TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[539]]);
                Time.sleepTicks((int)lllllIIlII[4]);
                0;
            }
        }
        if (n.llIlIIlIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[70]) && n.llIlIIlIIllll(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var103.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[540]];
            int[] nArray = new int[lllllIIlII[0]];
            nArray[n.lllllIIlII[1]] = lllllIIlII[27];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[541]];
            Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray));
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
        if (n.llIlIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllllIIlII[71]) && n.llIlIIlIIllll(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[542]];
            TileObjects.getNearest((String[])stringArray).interact(llllIllIlI[lllllIIlII[543]]);
            Time.sleepTicks((int)lllllIIlII[6]);
            0;
        }
        if (n.llIlIIlIIllll(var103.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[544]];
            String[] stringArray = new String[lllllIIlII[0]];
            stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[545]];
            if (n.llIlIIlIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray38 = new String[lllllIIlII[0]];
                stringArray38[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[546]];
                TileObjects.getNearest((String[])stringArray38).interact(llllIllIlI[lllllIIlII[547]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
            String[] stringArray39 = new String[lllllIIlII[0]];
            stringArray39[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[548]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray39))) {
                String[] stringArray40 = new String[lllllIIlII[0]];
                stringArray40[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[549]];
                TileObjects.getNearest((String[])stringArray40).interact(llllIllIlI[lllllIIlII[550]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
            String[] stringArray41 = new String[lllllIIlII[0]];
            stringArray41[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[551]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray41))) {
                String[] stringArray42 = new String[lllllIIlII[0]];
                stringArray42[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[552]];
                TileObjects.getNearest((String[])stringArray42).interact(llllIllIlI[lllllIIlII[553]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
            g.a(bQ);
        }
        g.a(bQ);
    }

    private static void ae() {
        d var85;
        block49: {
            block48: {
                Object var48;
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block40: {
                                                block39: {
                                                    block38: {
                                                        block37: {
                                                            block36: {
                                                                block35: {
                                                                    block34: {
                                                                        block33: {
                                                                            block32: {
                                                                                int[] nArray = new int[lllllIIlII[0]];
                                                                                nArray[n.lllllIIlII[1]] = lllllIIlII[32];
                                                                                if (n.llIlIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                    d d2 = new d(lllllIIlII[32], lllllIIlII[0], lllllIIlII[577]);
                                                                                    bu.add(d2);
                                                                                    0;
                                                                                }
                                                                                int[] nArray2 = new int[lllllIIlII[0]];
                                                                                nArray2[n.lllllIIlII[1]] = lllllIIlII[26];
                                                                                if (n.llIlIIlIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                                    var48 = new d(lllllIIlII[26], lllllIIlII[0], lllllIIlII[578]);
                                                                                    bu.add((d)var48);
                                                                                    0;
                                                                                }
                                                                                int[] nArray3 = new int[lllllIIlII[0]];
                                                                                nArray3[n.lllllIIlII[1]] = lllllIIlII[27];
                                                                                if (n.llIlIIlIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                                    var48 = new d(lllllIIlII[27], lllllIIlII[0], lllllIIlII[578]);
                                                                                    bu.add((d)var48);
                                                                                    0;
                                                                                }
                                                                                int[] nArray4 = new int[lllllIIlII[0]];
                                                                                nArray4[n.lllllIIlII[1]] = lllllIIlII[28];
                                                                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block32;
                                                                                int[] nArray5 = new int[lllllIIlII[0]];
                                                                                nArray5[n.lllllIIlII[1]] = lllllIIlII[28];
                                                                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block33;
                                                                                int[] nArray6 = new int[lllllIIlII[0]];
                                                                                nArray6[n.lllllIIlII[1]] = lllllIIlII[28];
                                                                                if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray6).getQuantity(), lllllIIlII[17])) break block33;
                                                                            }
                                                                            var48 = new d(lllllIIlII[28], lllllIIlII[17], lllllIIlII[579]);
                                                                            bu.add((d)var48);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[lllllIIlII[0]];
                                                                        nArray[n.lllllIIlII[1]] = lllllIIlII[29];
                                                                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                                                        int[] nArray7 = new int[lllllIIlII[0]];
                                                                        nArray7[n.lllllIIlII[1]] = lllllIIlII[29];
                                                                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block35;
                                                                        int[] nArray8 = new int[lllllIIlII[0]];
                                                                        nArray8[n.lllllIIlII[1]] = lllllIIlII[29];
                                                                        if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray8).getQuantity(), lllllIIlII[17])) break block35;
                                                                    }
                                                                    var48 = new d(lllllIIlII[29], lllllIIlII[17], lllllIIlII[579]);
                                                                    bu.add((d)var48);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lllllIIlII[0]];
                                                                nArray[n.lllllIIlII[1]] = lllllIIlII[31];
                                                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                int[] nArray9 = new int[lllllIIlII[0]];
                                                                nArray9[n.lllllIIlII[1]] = lllllIIlII[31];
                                                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                                int[] nArray10 = new int[lllllIIlII[0]];
                                                                nArray10[n.lllllIIlII[1]] = lllllIIlII[31];
                                                                if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray10).getQuantity(), lllllIIlII[6])) break block37;
                                                            }
                                                            var48 = new d(lllllIIlII[31], lllllIIlII[6], lllllIIlII[580]);
                                                            bu.add((d)var48);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lllllIIlII[0]];
                                                        nArray[n.lllllIIlII[1]] = lllllIIlII[581];
                                                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                                        int[] nArray11 = new int[lllllIIlII[0]];
                                                        nArray11[n.lllllIIlII[1]] = lllllIIlII[581];
                                                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray11) ? 1 : 0)) break block39;
                                                        int[] nArray12 = new int[lllllIIlII[0]];
                                                        nArray12[n.lllllIIlII[1]] = lllllIIlII[581];
                                                        if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray12).getQuantity(), lllllIIlII[168])) break block39;
                                                    }
                                                    var48 = new d(lllllIIlII[581], lllllIIlII[168], lllllIIlII[582]);
                                                    bu.add((d)var48);
                                                    0;
                                                }
                                                int[] nArray = new int[lllllIIlII[0]];
                                                nArray[n.lllllIIlII[1]] = lllllIIlII[25];
                                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                                int[] nArray13 = new int[lllllIIlII[0]];
                                                nArray13[n.lllllIIlII[1]] = lllllIIlII[25];
                                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray13) ? 1 : 0)) break block41;
                                                int[] nArray14 = new int[lllllIIlII[0]];
                                                nArray14[n.lllllIIlII[1]] = lllllIIlII[25];
                                                if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray14).getQuantity(), lllllIIlII[20])) break block41;
                                            }
                                            var48 = new d(lllllIIlII[25], lllllIIlII[20], lllllIIlII[18]);
                                            bu.add((d)var48);
                                            0;
                                        }
                                        int[] nArray = new int[lllllIIlII[0]];
                                        nArray[n.lllllIIlII[1]] = lllllIIlII[23];
                                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray15 = new int[lllllIIlII[0]];
                                        nArray15[n.lllllIIlII[1]] = lllllIIlII[23];
                                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray15) ? 1 : 0)) break block43;
                                        int[] nArray16 = new int[lllllIIlII[0]];
                                        nArray16[n.lllllIIlII[1]] = lllllIIlII[23];
                                        if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray16).getQuantity(), lllllIIlII[33])) break block43;
                                    }
                                    var48 = new d(lllllIIlII[23], lllllIIlII[33], e.c(lllllIIlII[583], lllllIIlII[584]));
                                    bu.add((d)var48);
                                    0;
                                }
                                int[] nArray = new int[lllllIIlII[0]];
                                nArray[n.lllllIIlII[1]] = lllllIIlII[22];
                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray17 = new int[lllllIIlII[0]];
                                nArray17[n.lllllIIlII[1]] = lllllIIlII[22];
                                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray17) ? 1 : 0)) break block45;
                                int[] nArray18 = new int[lllllIIlII[0]];
                                nArray18[n.lllllIIlII[1]] = lllllIIlII[22];
                                if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray18).getQuantity(), lllllIIlII[35])) break block45;
                            }
                            var48 = new d(lllllIIlII[22], lllllIIlII[35], e.c(lllllIIlII[585], lllllIIlII[586]));
                            bu.add((d)var48);
                            0;
                        }
                        int[] nArray = new int[lllllIIlII[0]];
                        nArray[n.lllllIIlII[1]] = lllllIIlII[24];
                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray19 = new int[lllllIIlII[0]];
                        nArray19[n.lllllIIlII[1]] = lllllIIlII[24];
                        if (!n.llIlIIlIIllll(Bank.contains((int[])nArray19) ? 1 : 0)) break block47;
                        int[] nArray20 = new int[lllllIIlII[0]];
                        nArray20[n.lllllIIlII[1]] = lllllIIlII[24];
                        if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray20).getQuantity(), lllllIIlII[36])) break block47;
                    }
                    var48 = new d(lllllIIlII[24], lllllIIlII[36], lllllIIlII[137]);
                    bu.add((d)var48);
                    0;
                }
                if (n.llIlIIlIlIIIl(Bank.contains((Predicate)(var48 = item -> item.getName().toLowerCase().contains(llllIllIlI[lllllIIlII[593]]))) ? 1 : 0)) {
                    var85 = new d(lllllIIlII[587], lllllIIlII[2], lllllIIlII[588]);
                    bu.add(var85);
                    0;
                }
                int[] nArray = new int[lllllIIlII[0]];
                nArray[n.lllllIIlII[1]] = lllllIIlII[30];
                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray21 = new int[lllllIIlII[0]];
                nArray21[n.lllllIIlII[1]] = lllllIIlII[30];
                if (!n.llIlIIlIIllll(Bank.contains((int[])nArray21) ? 1 : 0)) break block49;
                int[] nArray22 = new int[lllllIIlII[0]];
                nArray22[n.lllllIIlII[1]] = lllllIIlII[30];
                if (!n.llIlIIlIlIIII(Bank.getFirst((int[])nArray22).getQuantity(), lllllIIlII[11])) break block49;
            }
            var85 = new d(lllllIIlII[30], lllllIIlII[11], i.bp);
            bu.add(var85);
            0;
        }
        int[] nArray = new int[lllllIIlII[0]];
        nArray[n.lllllIIlII[1]] = lllllIIlII[21];
        if (n.llIlIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var85 = new d(lllllIIlII[21], lllllIIlII[12], lllllIIlII[589]);
            bu.add(var85);
            0;
        }
    }

    private static boolean llIlIIlIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIlIlIIll(Object object) {
        return object != null;
    }

    private static String llIlIIIIlIlll(String var79, String var76) {
        var79 = new String(Base64.getDecoder().decode(var79.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var74 = new StringBuilder();
        char[] var87 = var76.toCharArray();
        int var83 = lllllIIlII[1];
        char[] var106 = var79.toCharArray();
        int var89 = var106.length;
        int var69 = lllllIIlII[1];
        while (n.llIlIIlIlIIII(var69, var89)) {
            char var107 = var106[var69];
            var74.append((char)(var107 ^ var87[var83 % var87.length]));
            0;
            ++var83;
            ++var69;
            0;
            if (1 < 3) continue;
            return null;
        }
        return String.valueOf(var74);
    }

    private static boolean llIlIIlIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var29;
        int[] nArray = new int[lllllIIlII[20]];
        nArray[n.lllllIIlII[1]] = lllllIIlII[21];
        nArray[n.lllllIIlII[0]] = lllllIIlII[22];
        nArray[n.lllllIIlII[4]] = lllllIIlII[23];
        nArray[n.lllllIIlII[6]] = lllllIIlII[24];
        nArray[n.lllllIIlII[8]] = lllllIIlII[25];
        nArray[n.lllllIIlII[2]] = lllllIIlII[26];
        nArray[n.lllllIIlII[11]] = lllllIIlII[27];
        nArray[n.lllllIIlII[13]] = lllllIIlII[28];
        nArray[n.lllllIIlII[15]] = lllllIIlII[29];
        nArray[n.lllllIIlII[16]] = lllllIIlII[30];
        nArray[n.lllllIIlII[17]] = lllllIIlII[31];
        nArray[n.lllllIIlII[19]] = lllllIIlII[32];
        int[] nArray2 = nArray;
        int var109 = lllllIIlII[1];
        while (n.llIlIIlIlIIII(var109, ((void)var29).length)) {
            int[] nArray3 = new int[lllllIIlII[0]];
            nArray3[n.lllllIIlII[1]] = var29[var109];
            if (n.llIlIIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllllIIlII[1];
            }
            ++var109;
            0;
            if (((0x78 ^ 0x42) & ~(0x32 ^ 8)) == 0) continue;
            return false;
        }
        return lllllIIlII[0];
    }

    private static boolean llIlIIlIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void aw() {
        WorldArea var43 = new WorldArea(lllllIIlII[214], lllllIIlII[215], lllllIIlII[49], lllllIIlII[65], lllllIIlII[1]);
        WorldArea var68 = new WorldArea(lllllIIlII[216], lllllIIlII[217], lllllIIlII[11], lllllIIlII[8], lllllIIlII[1]);
        WorldPoint lllllllllllllllllIlIIlllIlIIIIII = new WorldPoint(lllllIIlII[218], lllllIIlII[171], lllllIIlII[1]);
        WorldPoint var112 = new WorldPoint(lllllIIlII[219], lllllIIlII[220], lllllIIlII[1]);
        WorldArea var93 = new WorldArea(lllllIIlII[221], lllllIIlII[222], lllllIIlII[13], lllllIIlII[11], lllllIIlII[1]);
        WorldArea var37 = new WorldArea(lllllIIlII[223], lllllIIlII[171], lllllIIlII[6], lllllIIlII[8], lllllIIlII[1]);
        WorldArea var57 = new WorldArea(lllllIIlII[170], lllllIIlII[171], lllllIIlII[4], lllllIIlII[13], lllllIIlII[1]);
        WorldArea var77 = new WorldArea(lllllIIlII[224], lllllIIlII[225], lllllIIlII[11], lllllIIlII[11], lllllIIlII[1]);
        String[] stringArray = new String[lllllIIlII[0]];
        stringArray[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[226]];
        if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray)) && n.llIlIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[227]];
            String[] stringArray2 = new String[lllllIIlII[0]];
            stringArray2[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[228]];
            TileObjects.getNearest((String[])stringArray2).interact(llllIllIlI[lllllIIlII[229]]);
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
        if (n.llIlIIlIIllll(var57.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[230]];
            String[] stringArray3 = new String[lllllIIlII[0]];
            stringArray3[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[231]];
            TileObjects.getNearest((String[])stringArray3).interact(llllIllIlI[lllllIIlII[232]]);
            Time.sleepTicks((int)lllllIIlII[8]);
            0;
        }
        if (!n.llIlIIlIlIIIl(var93.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.llIlIIlIIllll(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[233]];
            String[] stringArray4 = new String[lllllIIlII[0]];
            stringArray4[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[234]];
            if (n.llIlIIlIlIIll(TileObjects.getNearest((String[])stringArray4))) {
                String[] stringArray5 = new String[lllllIIlII[0]];
                stringArray5[n.lllllIIlII[1]] = llllIllIlI[lllllIIlII[122]];
                TileObjects.getNearest((String[])stringArray5).interact(llllIllIlI[lllllIIlII[235]]);
                Time.sleepTicks((int)lllllIIlII[6]);
                0;
            }
        }
        if ((!n.llIlIIlIlIIIl(var68.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.llIlIIlIIllll(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && n.llIlIIlIlIIIl(var77.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var93.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.llIlIIlIlIIIl(var57.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIllIlI[lllllIIlII[236]];
            Movement.walkTo((WorldPoint)var112);
            0;
            Time.sleepTicks((int)lllllIIlII[0]);
            0;
        }
        n.aA();
    }

    private static String llIlIIIIllIII(String var10, String var67) {
        try {
            SecretKeySpec var84 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var67.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var52 = Cipher.getInstance("Blowfish");
            var52.init(lllllIIlII[4], var84);
            return new String(var52.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var70) {
            var70.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIlIIIl(int n2) {
        return n2 == 0;
    }
}

