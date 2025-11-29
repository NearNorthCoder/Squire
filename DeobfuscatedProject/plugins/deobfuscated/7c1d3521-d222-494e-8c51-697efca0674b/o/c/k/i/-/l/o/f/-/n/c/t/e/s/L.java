/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
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
 *  net.unethicalite.client.Static
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
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
import net.unethicalite.client.Static;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.D;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.G;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aA;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aF;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aG;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aK;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aL;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aa;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.av;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.v;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.y;

public class L
implements ac {
    static /* synthetic */ WorldArea gK;
    private static /* synthetic */ String[] lllIlIIllI;
    static /* synthetic */ WorldArea gu;
    static /* synthetic */ String da;
    static /* synthetic */ boolean gz;
    static /* synthetic */ WorldPoint gq;
    static /* synthetic */ boolean dj;
    static /* synthetic */ WorldPoint gD;
    static /* synthetic */ WorldPoint gC;
    static /* synthetic */ WorldPoint gE;
    static /* synthetic */ String h;
    static /* synthetic */ boolean gA;
    static /* synthetic */ boolean gM;
    static /* synthetic */ WorldPoint gJ;
    static /* synthetic */ WorldPoint gp;
    static /* synthetic */ WorldPoint go;
    static /* synthetic */ int gx;
    static /* synthetic */ int di;
    static /* synthetic */ WorldPoint gt;
    static /* synthetic */ int gy;
    public static /* synthetic */ boolean gm;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ boolean gL;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ boolean gB;
    static /* synthetic */ WorldArea gv;
    public static /* synthetic */ WorldPoint gn;
    private static /* synthetic */ int[] lllIlIIlll;
    private static /* synthetic */ String[] cE;
    static /* synthetic */ WorldArea gw;
    static /* synthetic */ WorldPoint gs;
    static /* synthetic */ WorldPoint gG;
    static /* synthetic */ WorldPoint gI;
    static /* synthetic */ WorldPoint gH;
    static /* synthetic */ WorldPoint gr;
    static /* synthetic */ WorldPoint gF;
    public static /* synthetic */ boolean bt;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cF() {
        int n2;
        block4: {
            block7: {
                block6: {
                    block5: {
                        int[] nArray = new int[lllIlIIlll[0]];
                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[301];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                        int[] nArray2 = new int[lllIlIIlll[0]];
                        nArray2[L.lllIlIIlll[1]] = lllIlIIlll[30];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block4;
                        int[] nArray3 = new int[lllIlIIlll[0]];
                        nArray3[L.lllIlIIlll[1]] = lllIlIIlll[69];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block4;
                        int[] nArray4 = new int[lllIlIIlll[0]];
                        nArray4[L.lllIlIIlll[1]] = lllIlIIlll[49];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
                        int[] nArray5 = new int[lllIlIIlll[0]];
                        nArray5[L.lllIlIIlll[1]] = lllIlIIlll[252];
                        if (!L.llIIIlIlIlIll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block5;
                        int[] nArray6 = new int[lllIlIIlll[0]];
                        nArray6[L.lllIlIIlll[1]] = lllIlIIlll[252];
                        if (!L.llIIIlIlIlIIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block4;
                    }
                    int[] nArray = new int[lllIlIIlll[0]];
                    nArray[L.lllIlIIlll[1]] = lllIlIIlll[254];
                    if (!L.llIIIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                    int[] nArray7 = new int[lllIlIIlll[0]];
                    nArray7[L.lllIlIIlll[1]] = lllIlIIlll[254];
                    if (!L.llIIIlIlIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block4;
                }
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[256];
                if (!L.llIIIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray8 = new int[lllIlIIlll[0]];
                nArray8[L.lllIlIIlll[1]] = lllIlIIlll[256];
                if (!L.llIIIlIlIlIIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[lllIlIIlll[0]];
            nArray[L.lllIlIIlll[1]] = lllIlIIlll[403];
            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIlIIlll[0];
                0;
                if (-(0xE0 ^ 0xB3 ^ (0x1F ^ 0x48)) < 0) return n2 != 0;
                return (((0xD0 ^ 0x85) & ~(0x16 ^ 0x43) ^ (0xA3 ^ 0x8A)) & (0x5B ^ 0x75 ^ (0x78 ^ 0x7F) ^ -1)) != 0;
            }
        }
        n2 = lllIlIIlll[1];
        return n2 != 0;
    }

    private static boolean llIIIlIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void cC() {
        int[] nArray = new int[lllIlIIlll[0]];
        nArray[L.lllIlIIlll[1]] = lllIlIIlll[350];
        if (L.llIIIlIllIlII(NPCs.getNearest((int[])nArray))) {
            if (L.llIIIlIllIIIl(Skills.getLevel((Skill)Skill.HITPOINTS), lllIlIIlll[99])) {
                if (!L.llIIIlIlIllII(Prayers.getPoints(), lllIlIIlll[59]) || !L.llIIIlIllIIIl(Skills.getLevel((Skill)Skill.STRENGTH) - lllIlIIlll[28], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) || L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.ATTACK) - lllIlIIlll[28], Skills.getBoostedLevel((Skill)Skill.ATTACK))) {
                    if (L.llIIIlIllIllI(L.llIIIlIllIlIl(e.w(), 87.0)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.bd) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bd).interact(lllIlIIllI[lllIlIIlll[392]]);
                    }
                    Inventory.getFirst((int[])f.be).interact(lllIlIIllI[lllIlIIlll[393]]);
                }
                if (L.llIIIlIllIIll(L.llIIIlIllIlIl(e.w(), 76.0)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.bd) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.bd).interact(lllIlIIllI[lllIlIIlll[394]]);
                }
            }
            if (L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.HITPOINTS), lllIlIIlll[99])) {
                if (!L.llIIIlIlIllII(Prayers.getPoints(), lllIlIIlll[59]) || !L.llIIIlIllIIIl(Skills.getLevel((Skill)Skill.STRENGTH) - lllIlIIlll[28], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) || L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.ATTACK) - lllIlIIlll[28], Skills.getBoostedLevel((Skill)Skill.ATTACK))) {
                    if (L.llIIIlIllIllI(L.llIIIlIllIlIl(e.w(), 75.0)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.bd) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bd).interact(lllIlIIllI[lllIlIIlll[395]]);
                    }
                    Inventory.getFirst((int[])f.be).interact(lllIlIIllI[lllIlIIlll[396]]);
                }
                if (L.llIIIlIllIIll(L.llIIIlIllIlIl(e.w(), 67.0)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.bd) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.bd).interact(lllIlIIllI[lllIlIIlll[397]]);
                }
            }
            if (L.llIIIlIlIlIIl(gm ? 1 : 0) && L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[398]];
                NPCs.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[399]]);
            }
        }
    }

    private static boolean llIIIlIllIllI(int n2) {
        return n2 <= 0;
    }

    private static void Q() {
        block80: {
            d lllllllllllllllllIllIllIlIlIlllI;
            block79: {
                block78: {
                    block77: {
                        block76: {
                            block75: {
                                block74: {
                                    block73: {
                                        block72: {
                                            block71: {
                                                Object lllllllllllllllllIllIllIlIlIllll;
                                                block70: {
                                                    block69: {
                                                        block68: {
                                                            block67: {
                                                                block66: {
                                                                    block65: {
                                                                        block64: {
                                                                            block63: {
                                                                                block62: {
                                                                                    block61: {
                                                                                        block60: {
                                                                                            block59: {
                                                                                                int[] nArray = new int[lllIlIIlll[0]];
                                                                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[352];
                                                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block59;
                                                                                                int[] nArray2 = new int[lllIlIIlll[0]];
                                                                                                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[352];
                                                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block60;
                                                                                                int[] nArray3 = new int[lllIlIIlll[0]];
                                                                                                nArray3[L.lllIlIIlll[1]] = lllIlIIlll[352];
                                                                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIlIIlll[668])) break block60;
                                                                                            }
                                                                                            lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[352], lllIlIIlll[803], e.c(lllIlIIlll[293], lllIlIIlll[328]));
                                                                                            bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray = new int[lllIlIIlll[0]];
                                                                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block61;
                                                                                        int[] nArray4 = new int[lllIlIIlll[0]];
                                                                                        nArray4[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block62;
                                                                                        int[] nArray5 = new int[lllIlIIlll[0]];
                                                                                        nArray5[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                                                                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIlIIlll[11])) break block62;
                                                                                    }
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[33], lllIlIIlll[11], e.c(lllIlIIlll[21], lllIlIIlll[29]));
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[lllIlIIlll[0]];
                                                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[54];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[54], lllIlIIlll[0], lllIlIIlll[756]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray6 = new int[lllIlIIlll[0]];
                                                                                nArray6[L.lllIlIIlll[1]] = lllIlIIlll[53];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[53], lllIlIIlll[0], lllIlIIlll[756]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray7 = new int[lllIlIIlll[0]];
                                                                                nArray7[L.lllIlIIlll[1]] = lllIlIIlll[51];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[51], lllIlIIlll[0], e.c(lllIlIIlll[804], lllIlIIlll[805]));
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray8 = new int[lllIlIIlll[0]];
                                                                                nArray8[L.lllIlIIlll[1]] = lllIlIIlll[759];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[759], lllIlIIlll[0], lllIlIIlll[756]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray9 = new int[lllIlIIlll[0]];
                                                                                nArray9[L.lllIlIIlll[1]] = lllIlIIlll[758];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[758], lllIlIIlll[0], lllIlIIlll[756]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.RANGED), lllIlIIlll[105]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlll[105])) {
                                                                                    int[] nArray10 = new int[lllIlIIlll[0]];
                                                                                    nArray10[L.lllIlIIlll[1]] = lllIlIIlll[760];
                                                                                    if (L.llIIIlIlIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                                                        lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[760], lllIlIIlll[0], lllIlIIlll[806]);
                                                                                        bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray11 = new int[lllIlIIlll[0]];
                                                                                    nArray11[L.lllIlIIlll[1]] = lllIlIIlll[762];
                                                                                    if (L.llIIIlIlIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                                                                        lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[762], lllIlIIlll[0], lllIlIIlll[807]);
                                                                                        bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                        0;
                                                                                    }
                                                                                }
                                                                                int[] nArray12 = new int[lllIlIIlll[0]];
                                                                                nArray12[L.lllIlIIlll[1]] = lllIlIIlll[61];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[61], lllIlIIlll[0], lllIlIIlll[808]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray13 = new int[lllIlIIlll[0]];
                                                                                nArray13[L.lllIlIIlll[1]] = lllIlIIlll[50];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[50], lllIlIIlll[0], e.c(lllIlIIlll[809], lllIlIIlll[810]));
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray14 = new int[lllIlIIlll[0]];
                                                                                nArray14[L.lllIlIIlll[1]] = lllIlIIlll[49];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[49], lllIlIIlll[0], e.c(lllIlIIlll[809], lllIlIIlll[810]));
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray15 = new int[lllIlIIlll[0]];
                                                                                nArray15[L.lllIlIIlll[1]] = lllIlIIlll[61];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[61], lllIlIIlll[0], lllIlIIlll[808]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray16 = new int[lllIlIIlll[0]];
                                                                                nArray16[L.lllIlIIlll[1]] = lllIlIIlll[44];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[44], lllIlIIlll[0], lllIlIIlll[808]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray17 = new int[lllIlIIlll[0]];
                                                                                nArray17[L.lllIlIIlll[1]] = lllIlIIlll[45];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[45], lllIlIIlll[0], lllIlIIlll[811]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray18 = new int[lllIlIIlll[0]];
                                                                                nArray18[L.lllIlIIlll[1]] = lllIlIIlll[46];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[46], lllIlIIlll[0], lllIlIIlll[811]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray19 = new int[lllIlIIlll[0]];
                                                                                nArray19[L.lllIlIIlll[1]] = lllIlIIlll[56];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[56], lllIlIIlll[0], lllIlIIlll[811]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray20 = new int[lllIlIIlll[0]];
                                                                                nArray20[L.lllIlIIlll[1]] = lllIlIIlll[48];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[48], lllIlIIlll[0], lllIlIIlll[812]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray21 = new int[lllIlIIlll[0]];
                                                                                nArray21[L.lllIlIIlll[1]] = lllIlIIlll[58];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[58], lllIlIIlll[0], lllIlIIlll[813]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray22 = new int[lllIlIIlll[0]];
                                                                                nArray22[L.lllIlIIlll[1]] = lllIlIIlll[47];
                                                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[47], lllIlIIlll[0], lllIlIIlll[814]);
                                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray23 = new int[lllIlIIlll[0]];
                                                                                nArray23[L.lllIlIIlll[1]] = lllIlIIlll[35];
                                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray23) ? 1 : 0)) break block63;
                                                                                int[] nArray24 = new int[lllIlIIlll[0]];
                                                                                nArray24[L.lllIlIIlll[1]] = lllIlIIlll[35];
                                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block64;
                                                                                int[] nArray25 = new int[lllIlIIlll[0]];
                                                                                nArray25[L.lllIlIIlll[1]] = lllIlIIlll[35];
                                                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray25).getQuantity(), lllIlIIlll[12])) break block64;
                                                                            }
                                                                            lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[35], lllIlIIlll[12], lllIlIIlll[815]);
                                                                            bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[lllIlIIlll[0]];
                                                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[22];
                                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block65;
                                                                        int[] nArray26 = new int[lllIlIIlll[0]];
                                                                        nArray26[L.lllIlIIlll[1]] = lllIlIIlll[22];
                                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block66;
                                                                        int[] nArray27 = new int[lllIlIIlll[0]];
                                                                        nArray27[L.lllIlIIlll[1]] = lllIlIIlll[22];
                                                                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray27).getQuantity(), lllIlIIlll[216])) break block66;
                                                                    }
                                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[22], lllIlIIlll[216], lllIlIIlll[816]);
                                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lllIlIIlll[0]];
                                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[24];
                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block67;
                                                                int[] nArray28 = new int[lllIlIIlll[0]];
                                                                nArray28[L.lllIlIIlll[1]] = lllIlIIlll[24];
                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block68;
                                                                int[] nArray29 = new int[lllIlIIlll[0]];
                                                                nArray29[L.lllIlIIlll[1]] = lllIlIIlll[24];
                                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray29).getQuantity(), lllIlIIlll[25])) break block68;
                                                            }
                                                            lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[24], lllIlIIlll[25], lllIlIIlll[817]);
                                                            bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lllIlIIlll[0]];
                                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[27];
                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block69;
                                                        int[] nArray30 = new int[lllIlIIlll[0]];
                                                        nArray30[L.lllIlIIlll[1]] = lllIlIIlll[27];
                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block70;
                                                        int[] nArray31 = new int[lllIlIIlll[0]];
                                                        nArray31[L.lllIlIIlll[1]] = lllIlIIlll[27];
                                                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray31).getQuantity(), lllIlIIlll[99])) break block70;
                                                    }
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[27], lllIlIIlll[99], lllIlIIlll[818]);
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                int[] nArray = new int[lllIlIIlll[0]];
                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[38];
                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[38], lllIlIIlll[0], lllIlIIlll[819]);
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                int[] nArray32 = new int[lllIlIIlll[0]];
                                                nArray32[L.lllIlIIlll[1]] = lllIlIIlll[39];
                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[39], lllIlIIlll[0], e.c(lllIlIIlll[820], lllIlIIlll[821]));
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                int[] nArray33 = new int[lllIlIIlll[0]];
                                                nArray33[L.lllIlIIlll[1]] = lllIlIIlll[41];
                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray33) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[41], lllIlIIlll[0], e.c(lllIlIIlll[820], lllIlIIlll[821]));
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                int[] nArray34 = new int[lllIlIIlll[0]];
                                                nArray34[L.lllIlIIlll[1]] = lllIlIIlll[60];
                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray34) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[60], lllIlIIlll[0], e.c(lllIlIIlll[820], lllIlIIlll[821]));
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                int[] nArray35 = new int[lllIlIIlll[0]];
                                                nArray35[L.lllIlIIlll[1]] = lllIlIIlll[43];
                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray35) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[43], lllIlIIlll[6], lllIlIIlll[822]);
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                int[] nArray36 = new int[lllIlIIlll[0]];
                                                nArray36[L.lllIlIIlll[1]] = lllIlIIlll[42];
                                                if (L.llIIIlIlIlIll(Bank.contains((int[])nArray36) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIllll = new d(lllIlIIlll[42], lllIlIIlll[0], lllIlIIlll[823]);
                                                    bv.add((d)lllllllllllllllllIllIllIlIlIllll);
                                                    0;
                                                }
                                                if (L.llIIIlIlIlIll(Bank.contains((Predicate)(lllllllllllllllllIllIllIlIlIllll = item -> item.getName().toLowerCase().contains(lllIlIIllI[lllIlIIlll[829]]))) ? 1 : 0)) {
                                                    lllllllllllllllllIllIllIlIlIlllI = new d(lllIlIIlll[824], lllIlIIlll[11], lllIlIIlll[756]);
                                                    bv.add(lllllllllllllllllIllIllIlIlIlllI);
                                                    0;
                                                }
                                                int[] nArray37 = new int[lllIlIIlll[0]];
                                                nArray37[L.lllIlIIlll[1]] = lllIlIIlll[68];
                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray37) ? 1 : 0)) break block71;
                                                int[] nArray38 = new int[lllIlIIlll[0]];
                                                nArray38[L.lllIlIIlll[1]] = lllIlIIlll[68];
                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray38) ? 1 : 0)) break block72;
                                                int[] nArray39 = new int[lllIlIIlll[0]];
                                                nArray39[L.lllIlIIlll[1]] = lllIlIIlll[68];
                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray39).getQuantity(), lllIlIIlll[59])) break block72;
                                            }
                                            lllllllllllllllllIllIllIlIlIlllI = new d(lllIlIIlll[68], lllIlIIlll[59], lllIlIIlll[825]);
                                            bv.add(lllllllllllllllllIllIllIlIlIlllI);
                                            0;
                                        }
                                        int[] nArray = new int[lllIlIIlll[0]];
                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block73;
                                        int[] nArray40 = new int[lllIlIIlll[0]];
                                        nArray40[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray40) ? 1 : 0)) break block74;
                                        int[] nArray41 = new int[lllIlIIlll[0]];
                                        nArray41[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray41).getQuantity(), lllIlIIlll[59])) break block74;
                                    }
                                    lllllllllllllllllIllIllIlIlIlllI = new d(lllIlIIlll[40], lllIlIIlll[59], lllIlIIlll[826]);
                                    bv.add(lllllllllllllllllIllIllIlIlIlllI);
                                    0;
                                }
                                int[] nArray = new int[lllIlIIlll[0]];
                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[301];
                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block75;
                                int[] nArray42 = new int[lllIlIIlll[0]];
                                nArray42[L.lllIlIIlll[1]] = lllIlIIlll[301];
                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray42) ? 1 : 0)) break block76;
                                int[] nArray43 = new int[lllIlIIlll[0]];
                                nArray43[L.lllIlIIlll[1]] = lllIlIIlll[301];
                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray43).getQuantity(), lllIlIIlll[59])) break block76;
                            }
                            lllllllllllllllllIllIllIlIlIlllI = new d(lllIlIIlll[301], lllIlIIlll[59], e.c(lllIlIIlll[820], lllIlIIlll[827]));
                            bv.add(lllllllllllllllllIllIllIlIlIlllI);
                            0;
                        }
                        int[] nArray = new int[lllIlIIlll[0]];
                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[30];
                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block77;
                        int[] nArray44 = new int[lllIlIIlll[0]];
                        nArray44[L.lllIlIIlll[1]] = lllIlIIlll[30];
                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray44) ? 1 : 0)) break block78;
                        int[] nArray45 = new int[lllIlIIlll[0]];
                        nArray45[L.lllIlIIlll[1]] = lllIlIIlll[30];
                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray45).getQuantity(), lllIlIIlll[31])) break block78;
                    }
                    lllllllllllllllllIllIllIlIlIlllI = new d(lllIlIIlll[30], lllIlIIlll[28], j.cf);
                    bv.add(lllllllllllllllllIllIllIlIlIlllI);
                    0;
                }
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[37];
                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                int[] nArray46 = new int[lllIlIIlll[0]];
                nArray46[L.lllIlIIlll[1]] = lllIlIIlll[37];
                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray46) ? 1 : 0)) break block80;
                int[] nArray47 = new int[lllIlIIlll[0]];
                nArray47[L.lllIlIIlll[1]] = lllIlIIlll[37];
                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray47).getQuantity(), lllIlIIlll[29])) break block80;
            }
            lllllllllllllllllIllIllIlIlIlllI = new d(lllIlIIlll[37], lllIlIIlll[25], lllIlIIlll[828]);
            bv.add(lllllllllllllllllIllIllIlIlIlllI);
            0;
        }
    }

    private static boolean llIIIlIllIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIlIllIIll(int n2) {
        return n2 < 0;
    }

    private static void cK() {
        if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(v.dl), lllIlIIlll[13])) {
            if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            }
            if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
            }
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[754]];
            Movement.walkTo((WorldPoint)v.dl);
            0;
            Time.sleepTicks((int)lllIlIIlll[0]);
            0;
        }
        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(v.dl), lllIlIIlll[13])) {
            if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            if (L.llIIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                if (L.llIIIlIllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIlIIlll[9]);
                    0;
                }
                if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[28]) || !L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[72]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[74])) {
                    a.a(lllIlIIlll[40], lllIlIIlll[18]);
                    a.a(lllIlIIlll[30], lllIlIIlll[6]);
                    a.a(lllIlIIlll[69], lllIlIIlll[0]);
                    a.a(lllIlIIlll[35], lllIlIIlll[19]);
                    a.a(lllIlIIlll[68], lllIlIIlll[9]);
                    a.a(lllIlIIlll[41], lllIlIIlll[0]);
                    a.a(lllIlIIlll[49], lllIlIIlll[0]);
                    a.a(lllIlIIlll[51], lllIlIIlll[0]);
                    a.a(lllIlIIlll[217], lllIlIIlll[0]);
                    a.a(lllIlIIlll[24], lllIlIIlll[0]);
                }
                if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[105])) {
                    a.a(lllIlIIlll[301], lllIlIIlll[18]);
                    a.a(lllIlIIlll[30], lllIlIIlll[3]);
                    a.a(lllIlIIlll[69], lllIlIIlll[0]);
                    a.a(lllIlIIlll[68], lllIlIIlll[3]);
                    a.a(lllIlIIlll[217], lllIlIIlll[0]);
                    a.a(lllIlIIlll[24], lllIlIIlll[0]);
                    a.a(lllIlIIlll[43], lllIlIIlll[0]);
                    a.a(lllIlIIlll[403], lllIlIIlll[755]);
                    a.a(lllIlIIlll[35], lllIlIIlll[21]);
                }
                if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[125])) {
                    Bank.depositEquipment();
                    a.a(lllIlIIlll[301], lllIlIIlll[18]);
                    a.a(lllIlIIlll[30], lllIlIIlll[9]);
                    a.a(lllIlIIlll[69], lllIlIIlll[0]);
                    a.a(lllIlIIlll[49], lllIlIIlll[0]);
                    a.a(lllIlIIlll[252], lllIlIIlll[0]);
                    a.a(lllIlIIlll[254], lllIlIIlll[0]);
                    a.a(lllIlIIlll[256], lllIlIIlll[0]);
                    a.a(lllIlIIlll[403], lllIlIIlll[756]);
                }
                if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[167])) {
                    a.a(lllIlIIlll[301], lllIlIIlll[18]);
                    a.a(lllIlIIlll[30], lllIlIIlll[9]);
                    a.a(lllIlIIlll[69], lllIlIIlll[0]);
                    a.a(lllIlIIlll[41], lllIlIIlll[0]);
                    a.a(lllIlIIlll[39], lllIlIIlll[0]);
                    a.a(lllIlIIlll[38], lllIlIIlll[0]);
                    a.a(lllIlIIlll[217], lllIlIIlll[0]);
                    a.a(lllIlIIlll[403], lllIlIIlll[757]);
                    a.a(lllIlIIlll[42], lllIlIIlll[0]);
                    a.a(lllIlIIlll[33], lllIlIIlll[11]);
                    a.a(lllIlIIlll[294], lllIlIIlll[16]);
                }
                if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[173]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[184])) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllIlIIlll[9]);
                    0;
                    int[] nArray = new int[lllIlIIlll[0]];
                    nArray[L.lllIlIIlll[1]] = lllIlIIlll[46];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lllIlIIlll[46], lllIlIIlll[0]);
                    }
                    if (L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIlll[105])) {
                        int[] nArray2 = new int[lllIlIIlll[0]];
                        nArray2[L.lllIlIIlll[1]] = lllIlIIlll[54];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lllIlIIlll[54], lllIlIIlll[0]);
                        }
                        int[] nArray3 = new int[lllIlIIlll[0]];
                        nArray3[L.lllIlIIlll[1]] = lllIlIIlll[53];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            a.a(lllIlIIlll[53], lllIlIIlll[0]);
                        }
                    }
                    if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.RANGED), lllIlIIlll[105]) && L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlll[105])) {
                        int[] nArray4 = new int[lllIlIIlll[0]];
                        nArray4[L.lllIlIIlll[1]] = lllIlIIlll[758];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            a.a(lllIlIIlll[758], lllIlIIlll[0]);
                        }
                        int[] nArray5 = new int[lllIlIIlll[0]];
                        nArray5[L.lllIlIIlll[1]] = lllIlIIlll[759];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            a.a(lllIlIIlll[759], lllIlIIlll[0]);
                        }
                    }
                    if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.RANGED), lllIlIIlll[105]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlll[105])) {
                        int[] nArray6 = new int[lllIlIIlll[0]];
                        nArray6[L.lllIlIIlll[1]] = lllIlIIlll[760];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            a.a(lllIlIIlll[760], lllIlIIlll[0]);
                        }
                        int[] nArray7 = new int[lllIlIIlll[0]];
                        nArray7[L.lllIlIIlll[1]] = lllIlIIlll[761];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            a.a(lllIlIIlll[761], lllIlIIlll[0]);
                        }
                        int[] nArray8 = new int[lllIlIIlll[0]];
                        nArray8[L.lllIlIIlll[1]] = lllIlIIlll[762];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(lllIlIIlll[762], lllIlIIlll[0]);
                        }
                        int[] nArray9 = new int[lllIlIIlll[0]];
                        nArray9[L.lllIlIIlll[1]] = lllIlIIlll[763];
                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            a.a(lllIlIIlll[763], lllIlIIlll[0]);
                        }
                    }
                    int[] nArray10 = new int[lllIlIIlll[0]];
                    nArray10[L.lllIlIIlll[1]] = lllIlIIlll[48];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        a.a(lllIlIIlll[48], lllIlIIlll[0]);
                    }
                    int[] nArray11 = new int[lllIlIIlll[0]];
                    nArray11[L.lllIlIIlll[1]] = lllIlIIlll[47];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        a.a(lllIlIIlll[47], lllIlIIlll[0]);
                    }
                    int[] nArray12 = new int[lllIlIIlll[0]];
                    nArray12[L.lllIlIIlll[1]] = lllIlIIlll[45];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        a.a(lllIlIIlll[45], lllIlIIlll[0]);
                    }
                    int[] nArray13 = new int[lllIlIIlll[0]];
                    nArray13[L.lllIlIIlll[1]] = lllIlIIlll[56];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        a.a(lllIlIIlll[56], lllIlIIlll[0]);
                    }
                    int[] nArray14 = new int[lllIlIIlll[0]];
                    nArray14[L.lllIlIIlll[1]] = lllIlIIlll[61];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        a.a(lllIlIIlll[61], lllIlIIlll[0]);
                    }
                    int[] nArray15 = new int[lllIlIIlll[0]];
                    nArray15[L.lllIlIIlll[1]] = lllIlIIlll[44];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                        a.a(lllIlIIlll[44], lllIlIIlll[0]);
                    }
                    int[] nArray16 = new int[lllIlIIlll[0]];
                    nArray16[L.lllIlIIlll[1]] = lllIlIIlll[358];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                        a.a(lllIlIIlll[358], lllIlIIlll[0]);
                    }
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])f.ba) ? 1 : 0)) {
                        a.b(f.ba, lllIlIIlll[0]);
                    }
                    int[] nArray17 = new int[lllIlIIlll[0]];
                    nArray17[L.lllIlIIlll[1]] = lllIlIIlll[58];
                    if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                        a.a(lllIlIIlll[58], lllIlIIlll[0]);
                    }
                    if (L.llIIIlIllIIll(L.llIIIlIlllIIl(e.w(), 100.0))) {
                        a.a(lllIlIIlll[35], lllIlIIlll[3]);
                    }
                    if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[83])) {
                        a.a(lllIlIIlll[27], lllIlIIlll[0]);
                    }
                    int[] nArray18 = new int[lllIlIIlll[0]];
                    nArray18[L.lllIlIIlll[1]] = lllIlIIlll[358];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                        int[] nArray19 = new int[lllIlIIlll[0]];
                        nArray19[L.lllIlIIlll[1]] = lllIlIIlll[358];
                        Inventory.getFirst((int[])nArray19).interact(lllIlIIllI[lllIlIIlll[764]]);
                    }
                    int[] nArray20 = new int[lllIlIIlll[0]];
                    nArray20[L.lllIlIIlll[1]] = lllIlIIlll[58];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray20) ? 1 : 0)) {
                        int[] nArray21 = new int[lllIlIIlll[0]];
                        nArray21[L.lllIlIIlll[1]] = lllIlIIlll[58];
                        Inventory.getFirst((int[])nArray21).interact(lllIlIIllI[lllIlIIlll[765]]);
                    }
                    int[] nArray22 = new int[lllIlIIlll[0]];
                    nArray22[L.lllIlIIlll[1]] = lllIlIIlll[48];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                        int[] nArray23 = new int[lllIlIIlll[0]];
                        nArray23[L.lllIlIIlll[1]] = lllIlIIlll[48];
                        Inventory.getFirst((int[])nArray23).interact(lllIlIIllI[lllIlIIlll[766]]);
                    }
                    int[] nArray24 = new int[lllIlIIlll[0]];
                    nArray24[L.lllIlIIlll[1]] = lllIlIIlll[47];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                        int[] nArray25 = new int[lllIlIIlll[0]];
                        nArray25[L.lllIlIIlll[1]] = lllIlIIlll[47];
                        Inventory.getFirst((int[])nArray25).interact(lllIlIIllI[lllIlIIlll[767]]);
                    }
                    Time.sleepTicks((int)lllIlIIlll[0]);
                    0;
                    int[] nArray26 = new int[lllIlIIlll[0]];
                    nArray26[L.lllIlIIlll[1]] = lllIlIIlll[46];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                        int[] nArray27 = new int[lllIlIIlll[0]];
                        nArray27[L.lllIlIIlll[1]] = lllIlIIlll[46];
                        Inventory.getFirst((int[])nArray27).interact(lllIlIIllI[lllIlIIlll[768]]);
                    }
                    int[] nArray28 = new int[lllIlIIlll[0]];
                    nArray28[L.lllIlIIlll[1]] = lllIlIIlll[54];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[lllIlIIlll[0]];
                        nArray29[L.lllIlIIlll[1]] = lllIlIIlll[54];
                        Inventory.getFirst((int[])nArray29).interact(lllIlIIllI[lllIlIIlll[769]]);
                    }
                    int[] nArray30 = new int[lllIlIIlll[0]];
                    nArray30[L.lllIlIIlll[1]] = lllIlIIlll[53];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                        int[] nArray31 = new int[lllIlIIlll[0]];
                        nArray31[L.lllIlIIlll[1]] = lllIlIIlll[53];
                        Inventory.getFirst((int[])nArray31).interact(lllIlIIllI[lllIlIIlll[770]]);
                    }
                    int[] nArray32 = new int[lllIlIIlll[0]];
                    nArray32[L.lllIlIIlll[1]] = lllIlIIlll[759];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray32) ? 1 : 0)) {
                        int[] nArray33 = new int[lllIlIIlll[0]];
                        nArray33[L.lllIlIIlll[1]] = lllIlIIlll[759];
                        Inventory.getFirst((int[])nArray33).interact(lllIlIIllI[lllIlIIlll[771]]);
                    }
                    int[] nArray34 = new int[lllIlIIlll[0]];
                    nArray34[L.lllIlIIlll[1]] = lllIlIIlll[758];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                        int[] nArray35 = new int[lllIlIIlll[0]];
                        nArray35[L.lllIlIIlll[1]] = lllIlIIlll[758];
                        Inventory.getFirst((int[])nArray35).interact(lllIlIIllI[lllIlIIlll[772]]);
                    }
                    int[] nArray36 = new int[lllIlIIlll[0]];
                    nArray36[L.lllIlIIlll[1]] = lllIlIIlll[762];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                        int[] nArray37 = new int[lllIlIIlll[0]];
                        nArray37[L.lllIlIIlll[1]] = lllIlIIlll[762];
                        Inventory.getFirst((int[])nArray37).interact(lllIlIIllI[lllIlIIlll[773]]);
                    }
                    int[] nArray38 = new int[lllIlIIlll[0]];
                    nArray38[L.lllIlIIlll[1]] = lllIlIIlll[763];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray38) ? 1 : 0)) {
                        int[] nArray39 = new int[lllIlIIlll[0]];
                        nArray39[L.lllIlIIlll[1]] = lllIlIIlll[763];
                        Inventory.getFirst((int[])nArray39).interact(lllIlIIllI[lllIlIIlll[774]]);
                    }
                    int[] nArray40 = new int[lllIlIIlll[0]];
                    nArray40[L.lllIlIIlll[1]] = lllIlIIlll[760];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray40) ? 1 : 0)) {
                        int[] nArray41 = new int[lllIlIIlll[0]];
                        nArray41[L.lllIlIIlll[1]] = lllIlIIlll[760];
                        Inventory.getFirst((int[])nArray41).interact(lllIlIIllI[lllIlIIlll[775]]);
                    }
                    int[] nArray42 = new int[lllIlIIlll[0]];
                    nArray42[L.lllIlIIlll[1]] = lllIlIIlll[761];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray42) ? 1 : 0)) {
                        int[] nArray43 = new int[lllIlIIlll[0]];
                        nArray43[L.lllIlIIlll[1]] = lllIlIIlll[761];
                        Inventory.getFirst((int[])nArray43).interact(lllIlIIllI[lllIlIIlll[776]]);
                    }
                    Time.sleepTicks((int)lllIlIIlll[0]);
                    0;
                    int[] nArray44 = new int[lllIlIIlll[0]];
                    nArray44[L.lllIlIIlll[1]] = lllIlIIlll[45];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                        int[] nArray45 = new int[lllIlIIlll[0]];
                        nArray45[L.lllIlIIlll[1]] = lllIlIIlll[45];
                        Inventory.getFirst((int[])nArray45).interact(lllIlIIllI[lllIlIIlll[777]]);
                    }
                    int[] nArray46 = new int[lllIlIIlll[0]];
                    nArray46[L.lllIlIIlll[1]] = lllIlIIlll[56];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray46) ? 1 : 0)) {
                        int[] nArray47 = new int[lllIlIIlll[0]];
                        nArray47[L.lllIlIIlll[1]] = lllIlIIlll[56];
                        Inventory.getFirst((int[])nArray47).interact(lllIlIIllI[lllIlIIlll[778]]);
                    }
                    int[] nArray48 = new int[lllIlIIlll[0]];
                    nArray48[L.lllIlIIlll[1]] = lllIlIIlll[61];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray48) ? 1 : 0)) {
                        int[] nArray49 = new int[lllIlIIlll[0]];
                        nArray49[L.lllIlIIlll[1]] = lllIlIIlll[61];
                        Inventory.getFirst((int[])nArray49).interact(lllIlIIllI[lllIlIIlll[779]]);
                    }
                    Time.sleepTicks((int)lllIlIIlll[0]);
                    0;
                    int[] nArray50 = new int[lllIlIIlll[0]];
                    nArray50[L.lllIlIIlll[1]] = lllIlIIlll[44];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                        int[] nArray51 = new int[lllIlIIlll[0]];
                        nArray51[L.lllIlIIlll[1]] = lllIlIIlll[44];
                        Inventory.getFirst((int[])nArray51).interact(lllIlIIllI[lllIlIIlll[780]]);
                    }
                    while (L.llIIIlIllIIll(L.llIIIlIlllIIl(e.w(), 100.0)) && L.llIIIlIlIlIll(AccBuilderSotf.d ? 1 : 0)) {
                        String[] stringArray = new String[lllIlIIlll[0]];
                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[781]];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break;
                        String[] stringArray2 = new String[lllIlIIlll[0]];
                        stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[782]];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) continue;
                        String[] stringArray3 = new String[lllIlIIlll[0]];
                        stringArray3[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[783]];
                        Inventory.getFirst((String[])stringArray3).interact(lllIlIIllI[lllIlIIlll[784]]);
                        Time.sleepTicks((int)lllIlIIlll[3]);
                        0;
                        0;
                        if ((63 + 8 - -54 + 20 ^ 144 + 42 - 159 + 122) > 2) continue;
                        return;
                    }
                    while (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[83]) && L.llIIIlIlIlIll(AccBuilderSotf.d ? 1 : 0) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.be) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.be).interact(lllIlIIllI[lllIlIIlll[785]]);
                        Time.sleepTicks((int)lllIlIIlll[6]);
                        0;
                        0;
                        if (2 >= 0) continue;
                        return;
                    }
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                        Time.sleepTicks((int)lllIlIIlll[6]);
                        0;
                        Inventory.getFirst((int[])f.ba).interact(lllIlIIllI[lllIlIIlll[786]]);
                    }
                    if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lllIlIIlll[11]);
                        0;
                    }
                    Bank.depositInventory();
                    a.a(lllIlIIlll[24], lllIlIIlll[11]);
                    if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlll[105]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.RANGED), lllIlIIlll[105])) {
                        a.a(lllIlIIlll[27], lllIlIIlll[13]);
                    }
                    if (!L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlll[105]) || L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIlll[105])) {
                        a.a(lllIlIIlll[27], lllIlIIlll[13]);
                    }
                    a.a(lllIlIIlll[352], lllIlIIlll[538]);
                    a.a(lllIlIIlll[69], lllIlIIlll[0]);
                    a.a(lllIlIIlll[22], lllIlIIlll[12]);
                }
                if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
            }
        }
    }

    @Override
    public boolean ae() {
        return lllIlIIlll[1];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(Widget widget, int n2) {
        void lllllllllllllllllIllIlllIIlllllI;
        boolean bl = lllIlIIlll[1];
        Widget[] widgetArray = widget.getChildren();
        int n3 = widgetArray.length;
        int lllllllllllllllllIllIlllIIllllIl = lllIlIIlll[1];
        while (L.llIIIlIlIlIlI(lllllllllllllllllIllIlllIIllllIl, (int)lllllllllllllllllIllIlllIIlllllI)) {
            void lllllllllllllllllIllIlllIlIIIIIl;
            void lllllllllllllllllIllIlllIIllllll;
            void lllllllllllllllllIllIlllIIllllII = lllllllllllllllllIllIlllIIllllll[lllllllllllllllllIllIlllIIllllIl];
            if (L.llIIIlIlIlIIl(lllllllllllllllllIllIlllIIllllII.getText().equals((int)lllllllllllllllllIllIlllIlIIIIIl + " (current)") ? 1 : 0)) {
                int lllllllllllllllllIllIlllIlIIIIII = lllIlIIlll[0];
            }
            ++lllllllllllllllllIllIlllIIllllIl;
            0;
            if (null == null) continue;
            return ((183 + 187 - 245 + 91 ^ 24 + 28 - 47 + 145) & (53 + 104 - 48 + 33 ^ 42 + 61 - -12 + 77 ^ -1)) != 0;
        }
        return bl;
    }

    private static void llIIIlIlIIllI() {
        lllIlIIllI = new String[lllIlIIlll[877]];
        L.lllIlIIllI[L.lllIlIIlll[1]] = L."Finished buying items, switching back to quest";
        L.lllIlIIllI[L.lllIlIIlll[0]] = L."- Vamp Slayer";
        L.lllIlIIllI[L.lllIlIIlll[6]] = L."- WC";
        L.lllIlIIllI[L.lllIlIIlll[3]] = L."- Fletching";
        L.lllIlIIllI[L.lllIlIIlll[9]] = L."- Crafting";
        L.lllIlIIllI[L.lllIlIIlll[11]] = L."- Agility";
        L.lllIlIIllI[L.lllIlIIlll[13]] = L."- Magic";
        L.lllIlIIllI[L.lllIlIIlll[15]] = L."Tome of experience";
        L.lllIlIIllI[L.lllIlIIlll[16]] = L."- A Taste of Hope";
        L.lllIlIIllI[L.lllIlIIlll[17]] = L."Tome of experience";
        L.lllIlIIllI[L.lllIlIIlll[18]] = L."";
        L.lllIlIIllI[L.lllIlIIlll[19]] = L."Nav to bank";
        L.lllIlIIllI[L.lllIlIIlll[21]] = L."Handling banking";
        L.lllIlIIllI[L.lllIlIIlll[23]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[26]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[29]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[32]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[34]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[31]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[52]] = L."We are missing quest supplies, switching to BUYING";
        L.lllIlIIllI[L.lllIlIIlll[28]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[55]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[57]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[59]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[36]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[62]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[63]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[64]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[65]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[66]] = L."Equip";
        L.lllIlIIllI[L.lllIlIIlll[4]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[67]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[70]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[71]] = L."Tele to tob";
        L.lllIlIIllI[L.lllIlIIlll[72]] = L."Ver Sinhaza";
        L.lllIlIIllI[L.lllIlIIlll[73]] = L."Nav to start";
        L.lllIlIIllI[L.lllIlIIlll[74]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[75]] = L."Hameln the Jester";
        L.lllIlIIllI[L.lllIlIIlll[76]] = L."Nav to carl";
        L.lllIlIIllI[L.lllIlIIlll[77]] = L."Carl";
        L.lllIlIIllI[L.lllIlIIlll[25]] = L."Entering barrel";
        L.lllIlIIllI[L.lllIlIIlll[79]] = L."Inspect";
        L.lllIlIIllI[L.lllIlIIlll[80]] = L."Boss fight";
        L.lllIlIIllI[L.lllIlIIlll[81]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[82]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[83]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[84]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[85]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[86]] = L."Kroy";
        L.lllIlIIllI[L.lllIlIIlll[87]] = L."Kroy";
        L.lllIlIIllI[L.lllIlIIlll[12]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[88]] = L."Kroy";
        L.lllIlIIllI[L.lllIlIIlll[10]] = L."Destroying tables";
        L.lllIlIIllI[L.lllIlIIlll[90]] = L."Destroy";
        L.lllIlIIllI[L.lllIlIIlll[91]] = L."Destroy";
        L.lllIlIIllI[L.lllIlIIlll[93]] = L."Destroy";
        L.lllIlIIllI[L.lllIlIIlll[8]] = L."Destroy";
        L.lllIlIIllI[L.lllIlIIlll[94]] = L."Destroy";
        L.lllIlIIllI[L.lllIlIIlll[95]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[96]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[7]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[97]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[5]] = L."Tele to tob";
        L.lllIlIIllI[L.lllIlIIlll[98]] = L."Ver Sinhaza";
        L.lllIlIIllI[L.lllIlIIlll[99]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[100]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[101]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[102]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[103]] = L."Nav to start";
        L.lllIlIIllI[L.lllIlIIlll[104]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[105]] = L."Breaking tab";
        L.lllIlIIllI[L.lllIlIIlll[107]] = L."Break";
        L.lllIlIIllI[L.lllIlIIlll[108]] = L."Nav to priest";
        L.lllIlIIllI[L.lllIlIIlll[109]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[110]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[111]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[112]] = L."Interact priest";
        L.lllIlIIllI[L.lllIlIIlll[113]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[114]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[115]] = L."Nav to ivan";
        L.lllIlIIllI[L.lllIlIIlll[116]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[117]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[118]] = L."Nav to ivan for trek";
        L.lllIlIIllI[L.lllIlIIlll[119]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[120]] = L."Nav to burgh bank";
        L.lllIlIIllI[L.lllIlIIlll[122]] = L."Bank";
        L.lllIlIIllI[L.lllIlIIlll[123]] = L."Vial";
        L.lllIlIIllI[L.lllIlIIlll[124]] = L."Hammer";
        L.lllIlIIllI[L.lllIlIIlll[125]] = L."Bronze axe";
        L.lllIlIIllI[L.lllIlIIlll[126]] = L."Knife";
        L.lllIlIIllI[L.lllIlIIlll[127]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[130]] = L."Nav to boat";
        L.lllIlIIllI[L.lllIlIIlll[131]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[132]] = L."Boat";
        L.lllIlIIllI[L.lllIlIIlll[133]] = L."Board";
        L.lllIlIIllI[L.lllIlIIlll[134]] = L."Icyene Graveyard.";
        L.lllIlIIllI[L.lllIlIIlll[136]] = L."Mausoleum door";
        L.lllIlIIllI[L.lllIlIIlll[137]] = L."Unlock";
        L.lllIlIIllI[L.lllIlIIlll[138]] = L."Toggle";
        L.lllIlIIllI[L.lllIlIIlll[140]] = L."Vertida Sefalatis";
        L.lllIlIIllI[L.lllIlIIlll[142]] = L."Kael Forshaw";
        L.lllIlIIllI[L.lllIlIIlll[144]] = L."Radigad Ponfit";
        L.lllIlIIllI[L.lllIlIIlll[146]] = L."Polmafi Ferdygris";
        L.lllIlIIllI[L.lllIlIIlll[148]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[149]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[152]] = L."Ver Sinhaza";
        L.lllIlIIllI[L.lllIlIIlll[159]] = L."nav to ladder 1";
        L.lllIlIIllI[L.lllIlIIlll[160]] = L."Lab table";
        L.lllIlIIllI[L.lllIlIIlll[161]] = L."Safalaan Hallow";
        L.lllIlIIllI[L.lllIlIIlll[162]] = L."Safalaan Hallow";
        L.lllIlIIllI[L.lllIlIIlll[163]] = L."Mutated Bloodveld";
        L.lllIlIIllI[L.lllIlIIlll[164]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[165]] = L."Dragon sword";
        L.lllIlIIllI[L.lllIlIIlll[166]] = L."Dragon sword";
        L.lllIlIIllI[L.lllIlIIlll[167]] = L."Dragon sword";
        L.lllIlIIllI[L.lllIlIIlll[168]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[169]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[170]] = L."Mutated Bloodveld";
        L.lllIlIIllI[L.lllIlIIlll[171]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[172]] = L."Nav to bookcase";
        L.lllIlIIllI[L.lllIlIIlll[173]] = L."get book";
        L.lllIlIIllI[L.lllIlIIlll[174]] = L."Bookshelf";
        L.lllIlIIllI[L.lllIlIIlll[175]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[176]] = L."Nav to guy";
        L.lllIlIIllI[L.lllIlIIlll[177]] = L."talk";
        L.lllIlIIllI[L.lllIlIIlll[178]] = L."Safalaan Hallow";
        L.lllIlIIllI[L.lllIlIIlll[179]] = L."Ver Sinhaza";
        L.lllIlIIllI[L.lllIlIIlll[181]] = L."Nav to grave tile";
        L.lllIlIIllI[L.lllIlIIlll[182]] = L."Vanescula Drakan";
        L.lllIlIIllI[L.lllIlIIlll[183]] = L."Vyrewatch top";
        L.lllIlIIllI[L.lllIlIIlll[184]] = L."Vyrewatch legs";
        L.lllIlIIllI[L.lllIlIIlll[185]] = L."Vyrewatch shoes";
        L.lllIlIIllI[L.lllIlIIlll[187]] = L."Nav to buy clothes";
        L.lllIlIIllI[L.lllIlIIlll[189]] = L."Trader Sven";
        L.lllIlIIllI[L.lllIlIIlll[190]] = L."Trade";
        L.lllIlIIllI[L.lllIlIIlll[191]] = L."Vyrewatch top";
        L.lllIlIIllI[L.lllIlIIlll[192]] = L."Buy 1";
        L.lllIlIIllI[L.lllIlIIlll[193]] = L."Vyrewatch legs";
        L.lllIlIIllI[L.lllIlIIlll[194]] = L."Buy 1";
        L.lllIlIIllI[L.lllIlIIlll[195]] = L."Vyrewatch shoes";
        L.lllIlIIllI[L.lllIlIIlll[196]] = L."Buy 1";
        L.lllIlIIllI[L.lllIlIIlll[197]] = L."Vyrewatch top";
        L.lllIlIIllI[L.lllIlIIlll[198]] = L."Vyrewatch legs";
        L.lllIlIIllI[L.lllIlIIlll[199]] = L."Vyrewatch shoes";
        L.lllIlIIllI[L.lllIlIIlll[200]] = L."nav to oldman";
        L.lllIlIIllI[L.lllIlIIlll[201]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[202]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[203]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[204]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[205]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[206]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[207]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[208]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[209]] = L."Polmafi Ferdygris";
        L.lllIlIIllI[L.lllIlIIlll[210]] = L."Polmafi Ferdygris";
        L.lllIlIIllI[L.lllIlIIlll[211]] = L."Nav to boat";
        L.lllIlIIllI[L.lllIlIIlll[212]] = L."Boat";
        L.lllIlIIllI[L.lllIlIIlll[213]] = L."Board";
        L.lllIlIIllI[L.lllIlIIlll[214]] = L."Icyene Graveyard.";
        L.lllIlIIllI[L.lllIlIIlll[215]] = L."Nav to grave tile";
        L.lllIlIIllI[L.lllIlIIlll[216]] = L."Vanescula Drakan";
        L.lllIlIIllI[L.lllIlIIlll[218]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[219]] = L."Nav to start";
        L.lllIlIIllI[L.lllIlIIlll[220]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[221]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[14]] = L."Damien Leucurte";
        L.lllIlIIllI[L.lllIlIIlll[222]] = L."Boss fight!!";
        L.lllIlIIllI[L.lllIlIIlll[223]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[224]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[225]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[226]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[227]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[228]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[229]] = L."Stamp-out";
        L.lllIlIIllI[L.lllIlIIlll[230]] = L."Damien Leucurte";
        L.lllIlIIllI[L.lllIlIIlll[231]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[232]] = L."Damien Leucurte";
        L.lllIlIIllI[L.lllIlIIlll[233]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[2]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[236]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[237]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[238]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[239]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[240]] = L."Nav to grave tile";
        L.lllIlIIllI[L.lllIlIIlll[241]] = L."Vanescula Drakan";
        L.lllIlIIllI[L.lllIlIIlll[244]] = L."Nav to boat";
        L.lllIlIIllI[L.lllIlIIlll[245]] = L."Boat";
        L.lllIlIIllI[L.lllIlIIlll[246]] = L."Board";
        L.lllIlIIllI[L.lllIlIIlll[247]] = L."Meiyerditch.";
        L.lllIlIIllI[L.lllIlIIlll[248]] = L."Vyrewatch";
        L.lllIlIIllI[L.lllIlIIlll[249]] = L."Talk-to";
        L.lllIlIIllI[L.lllIlIIlll[250]] = L."Send me to the mines.";
        L.lllIlIIllI[L.lllIlIIlll[251]] = L."Daeyalt rocks";
        L.lllIlIIllI[L.lllIlIIlll[253]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[255]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[257]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[258]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[261]] = L."Entering darkmeyer";
        L.lllIlIIllI[L.lllIlIIlll[262]] = L."Cracked wall";
        L.lllIlIIllI[L.lllIlIIlll[263]] = L."Enter";
        L.lllIlIIllI[L.lllIlIIlll[264]] = L."Nav to blisterwood";
        L.lllIlIIllI[L.lllIlIIlll[265]] = L."Desmodus Lasiurus";
        L.lllIlIIllI[L.lllIlIIlll[268]] = L."Nav to guy";
        L.lllIlIIllI[L.lllIlIIlll[269]] = L."Mordan Nikazsi";
        L.lllIlIIllI[L.lllIlIIlll[273]] = L."Nav to jail";
        L.lllIlIIllI[L.lllIlIIlll[274]] = L."Maria Gadderanks";
        L.lllIlIIllI[L.lllIlIIlll[275]] = L."Nav to blisterwood";
        L.lllIlIIllI[L.lllIlIIlll[276]] = L."Desmodus Lasiurus";
        L.lllIlIIllI[L.lllIlIIlll[279]] = L."Large door";
        L.lllIlIIllI[L.lllIlIIlll[280]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[282]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[283]] = L."Finding turns";
        L.lllIlIIllI[L.lllIlIIlll[285]] = L."Old note";
        L.lllIlIIllI[L.lllIlIIlll[286]] = L."Read";
        L.lllIlIIllI[L.lllIlIIlll[289]] = L."Solving south valve";
        L.lllIlIIllI[L.lllIlIIlll[290]] = L."Turn";
        L.lllIlIIllI[L.lllIlIIlll[291]] = L."Solving north valve";
        L.lllIlIIllI[L.lllIlIIlll[292]] = L."Turn";
        L.lllIlIIllI[L.lllIlIIlll[293]] = L."Chopping";
        L.lllIlIIllI[L.lllIlIIlll[295]] = L."Blisterwood tree";
        L.lllIlIIllI[L.lllIlIIlll[296]] = L."Chop";
        L.lllIlIIllI[L.lllIlIIlll[297]] = L."Chopping";
        L.lllIlIIllI[L.lllIlIIlll[298]] = L."Blisterwood tree";
        L.lllIlIIllI[L.lllIlIIlll[299]] = L."Chop";
        L.lllIlIIllI[L.lllIlIIlll[300]] = L."Blisterwood tree";
        L.lllIlIIllI[L.lllIlIIlll[302]] = L."Break";
        L.lllIlIIllI[L.lllIlIIlll[303]] = L."Nav to boat";
        L.lllIlIIllI[L.lllIlIIlll[304]] = L."Boat";
        L.lllIlIIllI[L.lllIlIIlll[305]] = L."Board";
        L.lllIlIIllI[L.lllIlIIlll[306]] = L."Icyene Graveyard.";
        L.lllIlIIllI[L.lllIlIIlll[307]] = L."Nav to grave tile";
        L.lllIlIIllI[L.lllIlIIlll[308]] = L."Vanescula Drakan";
        L.lllIlIIllI[L.lllIlIIlll[309]] = L."Remove";
        L.lllIlIIllI[L.lllIlIIlll[310]] = L."nav to oldman";
        L.lllIlIIllI[L.lllIlIIlll[311]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[312]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[313]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[314]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[315]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[316]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[317]] = L."Trapdoor";
        L.lllIlIIllI[L.lllIlIIlll[318]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[319]] = L."Vertida Sefalatis";
        L.lllIlIIllI[L.lllIlIIlll[320]] = L."Silver sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[321]] = L."Ruby sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[322]] = L."Enchanted ruby sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[323]] = L."Blisterwood sickle";
        L.lllIlIIllI[L.lllIlIIlll[325]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[326]] = L."Silver sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[327]] = L."Ruby";
        L.lllIlIIllI[L.lllIlIIlll[328]] = L."Silver sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[329]] = L."Ruby sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[330]] = L."Ruby sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[331]] = L."Enchanted ruby sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[332]] = L."Enchanted ruby sickle (b)";
        L.lllIlIIllI[L.lllIlIIlll[333]] = L."Blisterwood sickle";
        L.lllIlIIllI[L.lllIlIIlll[334]] = L."Blisterwood sickle";
        L.lllIlIIllI[L.lllIlIIlll[335]] = L."Nav to guy";
        L.lllIlIIllI[L.lllIlIIlll[338]] = L."Safalaan Hallow";
        L.lllIlIIllI[L.lllIlIIlll[339]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[340]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[341]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[342]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[343]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[344]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[345]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[346]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[347]] = L."Safalaan Hallow";
        L.lllIlIIllI[L.lllIlIIlll[348]] = L."Tele to tob";
        L.lllIlIIllI[L.lllIlIIlll[349]] = L."Ver Sinhaza";
        L.lllIlIIllI[L.lllIlIIlll[351]] = L."Handle bloodveld";
        L.lllIlIIllI[L.lllIlIIlll[353]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[354]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[355]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[356]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[359]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[360]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[361]] = L."Attack cycle";
        L.lllIlIIllI[L.lllIlIIlll[362]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[363]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[364]] = L."darkness";
        L.lllIlIIllI[L.lllIlIIlll[365]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[366]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[367]] = L."darkness";
        L.lllIlIIllI[L.lllIlIIlll[368]] = L."Avoiding darkness";
        L.lllIlIIllI[L.lllIlIIlll[369]] = L."pos3";
        L.lllIlIIllI[L.lllIlIIlll[372]] = L."pos3";
        L.lllIlIIllI[L.lllIlIIlll[373]] = L."pos1";
        L.lllIlIIllI[L.lllIlIIlll[374]] = L."pos2";
        L.lllIlIIllI[L.lllIlIIlll[376]] = L."Final fight cycle";
        L.lllIlIIllI[L.lllIlIIlll[377]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[378]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[379]] = L."Resetting pos";
        L.lllIlIIllI[L.lllIlIIlll[380]] = L."Handle blood orb";
        L.lllIlIIllI[L.lllIlIIlll[381]] = L."Walk to anchor";
        L.lllIlIIllI[L.lllIlIIlll[382]] = L."second pos";
        L.lllIlIIllI[L.lllIlIIlll[383]] = L."End quest dialogue";
        L.lllIlIIllI[L.lllIlIIlll[386]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[389]] = L."Nav to bank";
        L.lllIlIIllI[L.lllIlIIlll[390]] = L."Getting varrock tab";
        L.lllIlIIllI[L.lllIlIIlll[188]] = L."Breaking tab";
        L.lllIlIIllI[L.lllIlIIlll[391]] = L."Break";
        L.lllIlIIllI[L.lllIlIIlll[392]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[393]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[394]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[395]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[396]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[397]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[398]] = L."Vanstrom Klause";
        L.lllIlIIllI[L.lllIlIIlll[399]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[400]] = L."Knife";
        L.lllIlIIllI[L.lllIlIIlll[401]] = L."Chisel";
        L.lllIlIIllI[L.lllIlIIlll[402]] = L."Ruby";
        L.lllIlIIllI[L.lllIlIIlll[404]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[409]] = L."Nav to wall";
        L.lllIlIIllI[L.lllIlIIlll[410]] = L."Climb over";
        L.lllIlIIllI[L.lllIlIIlll[411]] = L."Wall rubble";
        L.lllIlIIllI[L.lllIlIIlll[412]] = L."Climb-over";
        L.lllIlIIllI[L.lllIlIIlll[415]] = L."Climb up floor";
        L.lllIlIIllI[L.lllIlIIlll[416]] = L."Floor";
        L.lllIlIIllI[L.lllIlIIlll[417]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[422]] = L."climb down rock";
        L.lllIlIIllI[L.lllIlIIlll[423]] = L."Rock";
        L.lllIlIIllI[L.lllIlIIlll[424]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[425]] = L."Boat";
        L.lllIlIIllI[L.lllIlIIlll[426]] = L."Board";
        L.lllIlIIllI[L.lllIlIIlll[427]] = L."Icyene Graveyard.";
        L.lllIlIIllI[L.lllIlIIlll[428]] = L."Nav to grave tile";
        L.lllIlIIllI[L.lllIlIIlll[429]] = L."Vanescula Drakan";
        L.lllIlIIllI[L.lllIlIIlll[430]] = L."Veliaf Hurtz";
        L.lllIlIIllI[L.lllIlIIlll[463]] = L."nav to ladder 1";
        L.lllIlIIllI[L.lllIlIIlll[464]] = L."Climb";
        L.lllIlIIllI[L.lllIlIIlll[465]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[466]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[467]] = L."Handling first floor board";
        L.lllIlIIllI[L.lllIlIIlll[468]] = L."floorboard1";
        L.lllIlIIllI[L.lllIlIIlll[470]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[471]] = L."Handling second floor board";
        L.lllIlIIllI[L.lllIlIIlll[472]] = L."floorboard2";
        L.lllIlIIllI[L.lllIlIIlll[474]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[475]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[476]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[477]] = L."Push";
        L.lllIlIIllI[L.lllIlIIlll[478]] = L."Pushing wall";
        L.lllIlIIllI[L.lllIlIIlll[479]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[480]] = L."Push";
        L.lllIlIIllI[L.lllIlIIlll[482]] = L."Walking across;";
        L.lllIlIIllI[L.lllIlIIlll[483]] = L."Walk-across";
        L.lllIlIIllI[L.lllIlIIlll[485]] = L."Walking across;";
        L.lllIlIIllI[L.lllIlIIlll[486]] = L."Walk-across";
        L.lllIlIIllI[L.lllIlIIlll[487]] = L."crawling under";
        L.lllIlIIllI[L.lllIlIIlll[488]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[489]] = L."Crawl-under";
        L.lllIlIIllI[L.lllIlIIlll[490]] = L."Push wall 2";
        L.lllIlIIllI[L.lllIlIIlll[491]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[492]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[493]] = L."Push";
        L.lllIlIIllI[L.lllIlIIlll[494]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[495]] = L."Push";
        L.lllIlIIllI[L.lllIlIIlll[496]] = L."Floor";
        L.lllIlIIllI[L.lllIlIIlll[497]] = L."Floor";
        L.lllIlIIllI[L.lllIlIIlll[498]] = L."Walk-across";
        L.lllIlIIllI[L.lllIlIIlll[499]] = L."Climbing down ladder";
        L.lllIlIIllI[L.lllIlIIlll[500]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[501]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[502]] = L."Handling trapdoor table";
        L.lllIlIIllI[L.lllIlIIlll[504]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[505]] = L."Trapdoor table";
        L.lllIlIIllI[L.lllIlIIlll[506]] = L."Table";
        L.lllIlIIllI[L.lllIlIIlll[507]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[508]] = L."Trapdoor table";
        L.lllIlIIllI[L.lllIlIIlll[509]] = L."Trapdoor table";
        L.lllIlIIllI[L.lllIlIIlll[510]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[511]] = L."Trapdoor table";
        L.lllIlIIllI[L.lllIlIIlll[512]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[513]] = L."Trapdoor tunnel";
        L.lllIlIIllI[L.lllIlIIlll[514]] = L."Trapdoor tunnel";
        L.lllIlIIllI[L.lllIlIIlll[515]] = L."Climb-into";
        L.lllIlIIllI[L.lllIlIIlll[516]] = L."Trapdoor tunnel";
        L.lllIlIIllI[L.lllIlIIlll[517]] = L."Climb-into";
        L.lllIlIIllI[L.lllIlIIlll[518]] = L."Climbing shelves";
        L.lllIlIIllI[L.lllIlIIlll[519]] = L."Shelf";
        L.lllIlIIllI[L.lllIlIIlll[520]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[521]] = L."Crawling under 2";
        L.lllIlIIllI[L.lllIlIIlll[522]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[35]] = L."Crawl-under";
        L.lllIlIIllI[L.lllIlIIlll[523]] = L."Cross floorbaord 3";
        L.lllIlIIllI[L.lllIlIIlll[525]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[526]] = L."Ladder 3";
        L.lllIlIIllI[L.lllIlIIlll[527]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[528]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[529]] = L."Getting key";
        L.lllIlIIllI[L.lllIlIIlll[530]] = L."Pots";
        L.lllIlIIllI[L.lllIlIIlll[531]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[532]] = L."Entering door";
        L.lllIlIIllI[L.lllIlIIlll[533]] = L."Door";
        L.lllIlIIllI[L.lllIlIIlll[534]] = L."Open";
        L.lllIlIIllI[L.lllIlIIlll[535]] = L."Handling ladder";
        L.lllIlIIllI[L.lllIlIIlll[536]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[537]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[538]] = L."Cross floorbaord 4";
        L.lllIlIIllI[L.lllIlIIlll[540]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[541]] = L."Shelf 2";
        L.lllIlIIllI[L.lllIlIIlll[542]] = L."Shelf";
        L.lllIlIIllI[L.lllIlIIlll[543]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[544]] = L."ladder 5";
        L.lllIlIIllI[L.lllIlIIlll[545]] = L."Ladder 5";
        L.lllIlIIllI[L.lllIlIIlll[546]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[547]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[548]] = L."Cross floorbaord 5";
        L.lllIlIIllI[L.lllIlIIlll[550]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[551]] = L."ladder 6";
        L.lllIlIIllI[L.lllIlIIlll[552]] = L."Ladder 6";
        L.lllIlIIllI[L.lllIlIIlll[553]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[554]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[555]] = L."Washing line";
        L.lllIlIIllI[L.lllIlIIlll[556]] = L."Washing line";
        L.lllIlIIllI[L.lllIlIIlll[557]] = L."Walk-across";
        L.lllIlIIllI[L.lllIlIIlll[558]] = L."ladder 7";
        L.lllIlIIllI[L.lllIlIIlll[559]] = L."Ladder 7";
        L.lllIlIIllI[L.lllIlIIlll[560]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[561]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[562]] = L."Handling wall/floor";
        L.lllIlIIllI[L.lllIlIIlll[563]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[564]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[565]] = L."Push";
        L.lllIlIIllI[L.lllIlIIlll[566]] = L."Floor";
        L.lllIlIIllI[L.lllIlIIlll[567]] = L."Floor";
        L.lllIlIIllI[L.lllIlIIlll[568]] = L."Walk-across";
        L.lllIlIIllI[L.lllIlIIlll[569]] = L."Shelf 3";
        L.lllIlIIllI[L.lllIlIIlll[570]] = L."Shelf";
        L.lllIlIIllI[L.lllIlIIlll[571]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[572]] = L."shelf 4";
        L.lllIlIIllI[L.lllIlIIlll[573]] = L."Shelf";
        L.lllIlIIllI[L.lllIlIIlll[574]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[577]] = L."floorboard 6";
        L.lllIlIIllI[L.lllIlIIlll[579]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[583]] = L."floorboard 7";
        L.lllIlIIllI[L.lllIlIIlll[585]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[589]] = L."floorboard 8";
        L.lllIlIIllI[L.lllIlIIlll[591]] = L."Jump-to";
        L.lllIlIIllI[L.lllIlIIlll[594]] = L."Broken ladder";
        L.lllIlIIllI[L.lllIlIIlll[595]] = L."Ladder top";
        L.lllIlIIllI[L.lllIlIIlll[596]] = L."Going up";
        L.lllIlIIllI[L.lllIlIIlll[597]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[598]] = L."Climb-up";
        L.lllIlIIllI[L.lllIlIIlll[599]] = L."Broken ladder";
        L.lllIlIIllI[L.lllIlIIlll[600]] = L."Ladder top";
        L.lllIlIIllI[L.lllIlIIlll[601]] = L."Fixing ladder";
        L.lllIlIIllI[L.lllIlIIlll[602]] = L."Broken ladder";
        L.lllIlIIllI[L.lllIlIIlll[603]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[605]] = L."Climbing down";
        L.lllIlIIllI[L.lllIlIIlll[606]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[607]] = L."Getting ladder piece";
        L.lllIlIIllI[L.lllIlIIlll[608]] = L."Ladder top";
        L.lllIlIIllI[L.lllIlIIlll[609]] = L."Wall";
        L.lllIlIIllI[L.lllIlIIlll[610]] = L."Search";
        L.lllIlIIllI[L.lllIlIIlll[611]] = L."Ladder top";
        L.lllIlIIllI[L.lllIlIIlll[612]] = L."Ladder";
        L.lllIlIIllI[L.lllIlIIlll[613]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[626]] = L."Nav to ladder near poster";
        L.lllIlIIllI[L.lllIlIIlll[627]] = L."Nav to tapestry";
        L.lllIlIIllI[L.lllIlIIlll[628]] = L."Use knife";
        L.lllIlIIllI[L.lllIlIIlll[629]] = L."Slashed tapestry";
        L.lllIlIIllI[L.lllIlIIlll[630]] = L."Slashed tapestry";
        L.lllIlIIllI[L.lllIlIIlll[631]] = L."Walk-through";
        L.lllIlIIllI[L.lllIlIIlll[634]] = L."Nav to ladder";
        L.lllIlIIllI[L.lllIlIIlll[635]] = L."Go down";
        L.lllIlIIllI[L.lllIlIIlll[636]] = L."Staircase";
        L.lllIlIIllI[L.lllIlIIlll[637]] = L."Climb-down";
        L.lllIlIIllI[L.lllIlIIlll[638]] = L."Yes.";
        L.lllIlIIllI[L.lllIlIIlll[639]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[640]] = L."Nail beast";
        L.lllIlIIllI[L.lllIlIIlll[641]] = L."handling combat event";
        L.lllIlIIllI[L.lllIlIIlll[642]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[643]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[644]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[645]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[646]] = L."Ivan Strom";
        L.lllIlIIllI[L.lllIlIIlll[647]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[648]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[649]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[650]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[651]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[652]] = L."Nail beast";
        L.lllIlIIllI[L.lllIlIIlll[653]] = L."Dragon sword";
        L.lllIlIIllI[L.lllIlIIlll[654]] = L."Dragon sword";
        L.lllIlIIllI[L.lllIlIIlll[655]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[656]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[657]] = L."Nail beast";
        L.lllIlIIllI[L.lllIlIIlll[658]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[659]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[660]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[661]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[662]] = L."ivan strom";
        L.lllIlIIllI[L.lllIlIIlll[663]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[664]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[665]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[666]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[667]] = L."Nail beast";
        L.lllIlIIllI[L.lllIlIIlll[668]] = L."Continue";
        L.lllIlIIllI[L.lllIlIIlll[670]] = L."Vampyre Juvinate";
        L.lllIlIIllI[L.lllIlIIlll[671]] = L."Nail beast";
        L.lllIlIIllI[L.lllIlIIlll[672]] = L."Continue";
        L.lllIlIIllI[L.lllIlIIlll[673]] = L."Ghast";
        L.lllIlIIllI[L.lllIlIIlll[674]] = L."Evading ghast event";
        L.lllIlIIllI[L.lllIlIIlll[675]] = L."Evade-event";
        L.lllIlIIllI[L.lllIlIIlll[676]] = L."Broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[677]] = L."broken bridge event";
        L.lllIlIIllI[L.lllIlIIlll[678]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[679]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[680]] = L."Take";
        L.lllIlIIllI[L.lllIlIIlll[681]] = L."Take";
        L.lllIlIIllI[L.lllIlIIlll[682]] = L."Undead Lumberjack";
        L.lllIlIIllI[L.lllIlIIlll[683]] = L."Attack";
        L.lllIlIIllI[L.lllIlIIlll[684]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[685]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[686]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[687]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[688]] = L."Chop down";
        L.lllIlIIllI[L.lllIlIIlll[689]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[690]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[691]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[692]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[693]] = L."Broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[694]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[695]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[696]] = L."Broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[697]] = L."Yes.";
        L.lllIlIIllI[L.lllIlIIlll[698]] = L."Partially broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[699]] = L."partial bridge event";
        L.lllIlIIllI[L.lllIlIIlll[700]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[701]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[702]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[703]] = L."Chop down";
        L.lllIlIIllI[L.lllIlIIlll[704]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[705]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[706]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[707]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[708]] = L."Partially broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[709]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[710]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[711]] = L."Partially broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[712]] = L."Partially broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[713]] = L."Inspect";
        L.lllIlIIllI[L.lllIlIIlll[714]] = L."Yes.";
        L.lllIlIIllI[L.lllIlIIlll[715]] = L."Slightly broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[716]] = L."slightly bridge event";
        L.lllIlIIllI[L.lllIlIIlll[717]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[718]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[719]] = L."Dead tree";
        L.lllIlIIllI[L.lllIlIIlll[720]] = L."Chop down";
        L.lllIlIIllI[L.lllIlIIlll[721]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[722]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[33]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[723]] = L."Plank";
        L.lllIlIIllI[L.lllIlIIlll[724]] = L."Slightly broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[725]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[726]] = L."Logs";
        L.lllIlIIllI[L.lllIlIIlll[727]] = L."Slightly broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[728]] = L."Slightly broken bridge";
        L.lllIlIIllI[L.lllIlIIlll[729]] = L."Inspect";
        L.lllIlIIllI[L.lllIlIIlll[730]] = L."Yes.";
        L.lllIlIIllI[L.lllIlIIlll[731]] = L."Fixed bridge";
        L.lllIlIIllI[L.lllIlIIlll[42]] = L."Path";
        L.lllIlIIllI[L.lllIlIIlll[732]] = L."Continuing trek";
        L.lllIlIIllI[L.lllIlIIlll[733]] = L."Continue-trek";
        L.lllIlIIllI[L.lllIlIIlll[734]] = L."Crossing bridge";
        L.lllIlIIllI[L.lllIlIIlll[735]] = L."Cross";
        L.lllIlIIllI[L.lllIlIIlll[736]] = L."Swamp tree";
        L.lllIlIIllI[L.lllIlIIlll[737]] = L."Path";
        L.lllIlIIllI[L.lllIlIIlll[738]] = L."Short vine";
        L.lllIlIIllI[L.lllIlIIlll[739]] = L."Short vine";
        L.lllIlIIllI[L.lllIlIIlll[740]] = L."Cutting vines";
        L.lllIlIIllI[L.lllIlIIlll[741]] = L."Swamp tree";
        L.lllIlIIllI[L.lllIlIIlll[742]] = L."Cut-vine";
        L.lllIlIIllI[L.lllIlIIlll[743]] = L."Short vine";
        L.lllIlIIllI[L.lllIlIIlll[744]] = L."Short vine";
        L.lllIlIIllI[L.lllIlIIlll[745]] = L."Short vine";
        L.lllIlIIllI[L.lllIlIIlll[746]] = L."Short vine";
        L.lllIlIIllI[L.lllIlIIlll[747]] = L."Long vine";
        L.lllIlIIllI[L.lllIlIIlll[748]] = L."Long vine";
        L.lllIlIIllI[L.lllIlIIlll[750]] = L."Swamp tree branch";
        L.lllIlIIllI[L.lllIlIIlll[751]] = L."Swing-from";
        L.lllIlIIllI[L.lllIlIIlll[752]] = L."Continuing trek";
        L.lllIlIIllI[L.lllIlIIlll[753]] = L."Continue";
        L.lllIlIIllI[L.lllIlIIlll[754]] = L."Nav to tob bank";
        L.lllIlIIllI[L.lllIlIIlll[764]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[765]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[766]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[767]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[768]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[769]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[770]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[771]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[772]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[773]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[774]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[775]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[776]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[777]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[778]] = L."Wield";
        L.lllIlIIllI[L.lllIlIIlll[779]] = L."Equip";
        L.lllIlIIllI[L.lllIlIIlll[780]] = L."Wear";
        L.lllIlIIllI[L.lllIlIIlll[781]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[782]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[783]] = L."Shark";
        L.lllIlIIllI[L.lllIlIIlll[784]] = L."Eat";
        L.lllIlIIllI[L.lllIlIIlll[785]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[786]] = L."Drink";
        L.lllIlIIllI[L.lllIlIIlll[787]] = L."Carl";
        L.lllIlIIllI[L.lllIlIIlll[788]] = L."Nav to first hide";
        L.lllIlIIllI[L.lllIlIIlll[789]] = L."Nav to second hide";
        L.lllIlIIllI[L.lllIlIIlll[790]] = L."Nav to third hide";
        L.lllIlIIllI[L.lllIlIIlll[791]] = L."Carl";
        L.lllIlIIllI[L.lllIlIIlll[793]] = L."Nav to fourth hide";
        L.lllIlIIllI[L.lllIlIIlll[794]] = L."Carl";
        L.lllIlIIllI[L.lllIlIIlll[795]] = L."Nav to fifth hide";
        L.lllIlIIllI[L.lllIlIIlll[796]] = L."Carl";
        L.lllIlIIllI[L.lllIlIIlll[797]] = L."Turned in 4th hide";
        L.lllIlIIllI[L.lllIlIIlll[798]] = L."Carl";
        L.lllIlIIllI[L.lllIlIIlll[799]] = L."Turned, waiting to walk";
        L.lllIlIIllI[L.lllIlIIlll[800]] = L."Walking";
        L.lllIlIIllI[L.lllIlIIlll[801]] = L."Waiting for Carl to turn around";
        L.lllIlIIllI[L.lllIlIIlll[802]] = L."Nav to sixth hide";
        L.lllIlIIllI[L.lllIlIIlll[284]] = L."Nav to 7th hide";
        L.lllIlIIllI[L.lllIlIIlll[829]] = L."ring of wealth (";
        L.lllIlIIllI[L.lllIlIIlll[830]] = L."Swing-from";
        L.lllIlIIllI[L.lllIlIIlll[831]] = L."Cut-vine";
        L.lllIlIIllI[L.lllIlIIlll[832]] = L."Continue";
        L.lllIlIIllI[L.lllIlIIlll[833]] = L."Continue-trek";
        L.lllIlIIllI[L.lllIlIIlll[834]] = L."Cross";
        L.lllIlIIllI[L.lllIlIIlll[835]] = L."Fixed bridge";
        L.lllIlIIllI[L.lllIlIIlll[836]] = L."Continue-trek";
        L.lllIlIIllI[L.lllIlIIlll[837]] = L."Lumberjack";
        L.lllIlIIllI[L.lllIlIIlll[838]] = L."Evade-event";
        L.lllIlIIllI[L.lllIlIIlll[839]] = L."Continue";
        L.lllIlIIllI[L.lllIlIIlll[840]] = L."Continue";
        L.lllIlIIllI[L.lllIlIIlll[841]] = L."nail";
        L.lllIlIIllI[L.lllIlIIlll[842]] = L."ivan";
        L.lllIlIIllI[L.lllIlIIlll[843]] = L."Magical Fire";
        L.lllIlIIllI[L.lllIlIIlll[844]] = L."Stamp-out";
        L.lllIlIIllI[L.lllIlIIlll[845]] = L."poison";
        L.lllIlIIllI[L.lllIlIIlll[864]] = L."Yes.";
        L.lllIlIIllI[L.lllIlIIlll[865]] = L."Do you know how he fell ill?";
        L.lllIlIIllI[L.lllIlIIlll[866]] = L."Where do you get your Bloody Bracers from?";
        L.lllIlIIllI[L.lllIlIIlll[867]] = L."Fair enough, so what now?";
        L.lllIlIIllI[L.lllIlIIlll[868]] = L."I see. So that's why you want to keep him safe, Veliaf?";
        L.lllIlIIllI[L.lllIlIIlll[869]] = L."I'm ready.";
        L.lllIlIIllI[L.lllIlIIlll[870]] = L."Shall we get going then?";
        L.lllIlIIllI[L.lllIlIIlll[871]] = L."Sure. Here you go.";
        L.lllIlIIllI[L.lllIlIIlll[872]] = L."Here you go.";
        L.lllIlIIllI[L.lllIlIIlll[873]] = L."Let's do this.";
        L.lllIlIIllI[L.lllIlIIlll[874]] = L."Let's go.";
        L.lllIlIIllI[L.lllIlIIlll[875]] = L."I'd better get going.";
        L.lllIlIIllI[L.lllIlIIlll[876]] = L."";
    }

    @Override
    public String ag() {
        return h;
    }

    /*
     * WARNING - void declaration
     */
    public static void bq() {
        void lllllllllllllllllIllIllIllIllIII;
        void lllllllllllllllllIllIllIllIllIIl;
        void lllllllllllllllllIllIllIllIllIlI;
        void lllllllllllllllllIllIllIllIllIll;
        void lllllllllllllllllIllIllIllIlllII;
        void lllllllllllllllllIllIllIllIlllIl;
        void lllllllllllllllllIllIllIllIllllI;
        void lllllllllllllllllIllIllIllIlllll;
        void lllllllllllllllllIllIllIlllIIIII;
        void lllllllllllllllllIllIllIlllIIIIl;
        void lllllllllllllllllIllIllIlllIIIlI;
        void lllllllllllllllllIllIllIlllIIIll;
        void lllllllllllllllllIllIllIlllIIlII;
        void lllllllllllllllllIllIllIlllIIlIl;
        void lllllllllllllllllIllIllIlllIIllI;
        void lllllllllllllllllIllIllIlllIIlll;
        void lllllllllllllllllIllIllIlllIlIII;
        void lllllllllllllllllIllIllIlllIlIIl;
        void lllllllllllllllllIllIllIlllIlIlI;
        void lllllllllllllllllIllIllIlllIlIll;
        void lllllllllllllllllIllIllIlllIllII;
        void lllllllllllllllllIllIllIlllIllIl;
        void lllllllllllllllllIllIllIlllIlllI;
        WorldPoint worldPoint = new WorldPoint(lllIlIIlll[157], lllIlIIlll[158], lllIlIIlll[1]);
        WorldPoint worldPoint2 = new WorldPoint(lllIlIIlll[431], lllIlIIlll[156], lllIlIIlll[0]);
        WorldPoint worldPoint3 = new WorldPoint(lllIlIIlll[432], lllIlIIlll[154], lllIlIIlll[0]);
        WorldPoint worldPoint4 = new WorldPoint(lllIlIIlll[433], lllIlIIlll[434], lllIlIIlll[0]);
        WorldPoint worldPoint5 = new WorldPoint(lllIlIIlll[431], lllIlIIlll[435], lllIlIIlll[0]);
        WorldPoint worldPoint6 = new WorldPoint(lllIlIIlll[436], lllIlIIlll[437], lllIlIIlll[1]);
        WorldPoint worldPoint7 = new WorldPoint(lllIlIIlll[277], lllIlIIlll[438], lllIlIIlll[0]);
        WorldPoint worldPoint8 = new WorldPoint(lllIlIIlll[439], lllIlIIlll[440], lllIlIIlll[3]);
        WorldPoint worldPoint9 = new WorldPoint(lllIlIIlll[441], lllIlIIlll[442], lllIlIIlll[6]);
        WorldArea worldArea = new WorldArea(lllIlIIlll[443], lllIlIIlll[385], lllIlIIlll[28], lllIlIIlll[72], lllIlIIlll[1]);
        WorldArea worldArea2 = new WorldArea(lllIlIIlll[155], lllIlIIlll[156], lllIlIIlll[13], lllIlIIlll[3], lllIlIIlll[1]);
        WorldArea worldArea3 = new WorldArea(lllIlIIlll[155], lllIlIIlll[156], lllIlIIlll[13], lllIlIIlll[9], lllIlIIlll[0]);
        WorldArea worldArea4 = new WorldArea(lllIlIIlll[157], lllIlIIlll[444], lllIlIIlll[9], lllIlIIlll[9], lllIlIIlll[0]);
        WorldArea worldArea5 = new WorldArea(lllIlIIlll[445], lllIlIIlll[444], lllIlIIlll[13], lllIlIIlll[13], lllIlIIlll[0]);
        WorldArea worldArea6 = new WorldArea(lllIlIIlll[433], lllIlIIlll[446], lllIlIIlll[9], lllIlIIlll[3], lllIlIIlll[0]);
        WorldArea worldArea7 = new WorldArea(lllIlIIlll[186], lllIlIIlll[440], lllIlIIlll[13], lllIlIIlll[17], lllIlIIlll[0]);
        WorldArea worldArea8 = new WorldArea(lllIlIIlll[431], lllIlIIlll[434], lllIlIIlll[11], lllIlIIlll[3], lllIlIIlll[0]);
        WorldArea worldArea9 = new WorldArea(lllIlIIlll[447], lllIlIIlll[448], lllIlIIlll[13], lllIlIIlll[11], lllIlIIlll[1]);
        WorldArea worldArea10 = new WorldArea(lllIlIIlll[449], lllIlIIlll[437], lllIlIIlll[13], lllIlIIlll[11], lllIlIIlll[1]);
        WorldArea worldArea11 = new WorldArea(lllIlIIlll[407], lllIlIIlll[437], lllIlIIlll[11], lllIlIIlll[11], lllIlIIlll[0]);
        WorldArea worldArea12 = new WorldArea(lllIlIIlll[447], lllIlIIlll[437], lllIlIIlll[6], lllIlIIlll[11], lllIlIIlll[0]);
        WorldArea worldArea13 = new WorldArea(lllIlIIlll[445], lllIlIIlll[438], lllIlIIlll[9], lllIlIIlll[13], lllIlIIlll[0]);
        WorldArea worldArea14 = new WorldArea(lllIlIIlll[450], lllIlIIlll[438], lllIlIIlll[16], lllIlIIlll[13], lllIlIIlll[1]);
        WorldArea worldArea15 = new WorldArea(lllIlIIlll[451], lllIlIIlll[438], lllIlIIlll[19], lllIlIIlll[13], lllIlIIlll[1]);
        WorldArea worldArea16 = new WorldArea(lllIlIIlll[452], lllIlIIlll[438], lllIlIIlll[17], lllIlIIlll[15], lllIlIIlll[0]);
        WorldArea worldArea17 = new WorldArea(lllIlIIlll[439], lllIlIIlll[440], lllIlIIlll[15], lllIlIIlll[17], lllIlIIlll[0]);
        WorldArea worldArea18 = new WorldArea(lllIlIIlll[451], lllIlIIlll[440], lllIlIIlll[17], lllIlIIlll[17], lllIlIIlll[6]);
        WorldArea worldArea19 = new WorldArea(lllIlIIlll[453], lllIlIIlll[440], lllIlIIlll[16], lllIlIIlll[9], lllIlIIlll[3]);
        WorldArea worldArea20 = new WorldArea(lllIlIIlll[451], lllIlIIlll[454], lllIlIIlll[15], lllIlIIlll[11], lllIlIIlll[3]);
        WorldArea worldArea21 = new WorldArea(lllIlIIlll[453], lllIlIIlll[455], lllIlIIlll[18], lllIlIIlll[13], lllIlIIlll[6]);
        WorldArea worldArea22 = new WorldArea(lllIlIIlll[456], lllIlIIlll[154], lllIlIIlll[13], lllIlIIlll[16], lllIlIIlll[6]);
        WorldArea worldArea23 = new WorldArea(lllIlIIlll[456], lllIlIIlll[454], lllIlIIlll[11], lllIlIIlll[15], lllIlIIlll[0]);
        WorldArea worldArea24 = new WorldArea(lllIlIIlll[457], lllIlIIlll[458], lllIlIIlll[9], lllIlIIlll[16], lllIlIIlll[0]);
        WorldArea worldArea25 = new WorldArea(lllIlIIlll[459], lllIlIIlll[460], lllIlIIlll[13], lllIlIIlll[11], lllIlIIlll[6]);
        WorldArea worldArea26 = new WorldArea(lllIlIIlll[461], lllIlIIlll[462], lllIlIIlll[11], lllIlIIlll[11], lllIlIIlll[1]);
        if (L.llIIIlIlIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().getPlane())) {
            void lllllllllllllllllIllIllIlllIllll;
            if (L.llIIIlIlIlIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[463]];
                Movement.walkTo((WorldPoint)worldPoint);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[464]];
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[465]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[466]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIlllllIII;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[467]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIlllllIII) ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[468]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIlllllIII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIlllllIII) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[469];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[470]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIlll;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[471]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIlll) ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[472]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIlll);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIlll) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[473];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[474]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[475]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lllIlIIlll[0]];
                stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[476]];
                String[] stringArray3 = new String[lllIlIIlll[0]];
                stringArray3[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[477]];
                if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[478]];
                    String[] stringArray4 = new String[lllIlIIlll[0]];
                    stringArray4[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[479]];
                    TileObjects.getNearest((String[])stringArray4).interact(lllIlIIllI[lllIlIIlll[480]]);
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                }
            }
            int[] nArray = new int[lllIlIIlll[0]];
            nArray[L.lllIlIIlll[1]] = lllIlIIlll[481];
            if (L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[482]];
                int[] nArray2 = new int[lllIlIIlll[0]];
                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[481];
                TileObjects.getNearest((int[])nArray2).interact(lllIlIIllI[lllIlIIlll[483]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
            int[] nArray3 = new int[lllIlIIlll[0]];
            nArray3[L.lllIlIIlll[1]] = lllIlIIlll[484];
            if (L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray3))) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[485]];
                int[] nArray4 = new int[lllIlIIlll[0]];
                nArray4[L.lllIlIIlll[1]] = lllIlIIlll[484];
                TileObjects.getNearest((int[])nArray4).interact(lllIlIIllI[lllIlIIlll[486]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[487]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[488]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[489]]);
            Time.sleepTicks((int)lllIlIIlll[9]);
            0;
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIllI;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[490]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIllI) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIllI);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIllI) ? 1 : 0)) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[491]];
                if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray5 = new String[lllIlIIlll[0]];
                    stringArray5[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[492]];
                    String[] stringArray6 = new String[lllIlIIlll[0]];
                    stringArray6[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[493]];
                    if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray5).hasAction(stringArray6) ? 1 : 0)) {
                        String[] stringArray7 = new String[lllIlIIlll[0]];
                        stringArray7[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[494]];
                        TileObjects.getNearest((String[])stringArray7).interact(lllIlIIllI[lllIlIIlll[495]]);
                        Time.sleepTicks((int)lllIlIIlll[6]);
                        0;
                    }
                }
                String[] stringArray8 = new String[lllIlIIlll[0]];
                stringArray8[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[496]];
                if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray8))) {
                    String[] stringArray9 = new String[lllIlIIlll[0]];
                    stringArray9[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[497]];
                    TileObjects.getNearest((String[])stringArray9).interact(lllIlIIllI[lllIlIIlll[498]]);
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                }
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[499]];
            Time.sleepTicks((int)lllIlIIlll[6]);
            0;
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[500]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[501]]);
            Time.sleepTicks((int)lllIlIIlll[11]);
            0;
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[502]];
            int[] nArray = new int[lllIlIIlll[0]];
            nArray[L.lllIlIIlll[1]] = lllIlIIlll[503];
            if (L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray))) {
                int[] nArray5 = new int[lllIlIIlll[0]];
                nArray5[L.lllIlIIlll[1]] = lllIlIIlll[503];
                TileObjects.getNearest((int[])nArray5).interact(lllIlIIllI[lllIlIIlll[504]]);
                Time.sleepTicks((int)lllIlIIlll[9]);
                0;
            }
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[505]];
            if (L.llIIIlIllIlII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray10 = new String[lllIlIIlll[0]];
                stringArray10[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[506]];
                TileObjects.getNearest((String[])stringArray10).interact(lllIlIIllI[lllIlIIlll[507]]);
                Time.sleepTicks((int)lllIlIIlll[9]);
                0;
            }
            String[] stringArray11 = new String[lllIlIIlll[0]];
            stringArray11[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[508]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray11))) {
                String[] stringArray12 = new String[lllIlIIlll[0]];
                stringArray12[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[509]];
                String[] stringArray13 = new String[lllIlIIlll[0]];
                stringArray13[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[510]];
                if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray12).hasAction(stringArray13) ? 1 : 0)) {
                    String[] stringArray14 = new String[lllIlIIlll[0]];
                    stringArray14[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[511]];
                    TileObjects.getNearest((String[])stringArray14).interact(lllIlIIllI[lllIlIIlll[512]]);
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                }
            }
            String[] stringArray15 = new String[lllIlIIlll[0]];
            stringArray15[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[513]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray15))) {
                String[] stringArray16 = new String[lllIlIIlll[0]];
                stringArray16[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[514]];
                String[] stringArray17 = new String[lllIlIIlll[0]];
                stringArray17[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[515]];
                if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray16).hasAction(stringArray17) ? 1 : 0)) {
                    String[] stringArray18 = new String[lllIlIIlll[0]];
                    stringArray18[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[516]];
                    TileObjects.getNearest((String[])stringArray18).interact(lllIlIIllI[lllIlIIlll[517]]);
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                }
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[518]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[519]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[520]]);
            Time.sleepTicks((int)lllIlIIlll[11]);
            0;
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[521]];
            if (L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[522]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[35]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIlIl;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[523]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIlIl) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIlIl);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIlIl) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[524];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[525]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[526]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[527]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[528]]);
            Time.sleepTicks((int)lllIlIIlll[3]);
            0;
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIlIIlll[451], lllIlIIlll[442], lllIlIIlll[1])) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[529]];
            if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[530]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[531]]);
                Time.sleepTicks((int)lllIlIIlll[15]);
                0;
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[532]];
                String[] stringArray19 = new String[lllIlIIlll[0]];
                stringArray19[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[533]];
                TileObjects.getNearest((String[])stringArray19).interact(lllIlIIllI[lllIlIIlll[534]]);
                Time.sleepTicks((int)lllIlIIlll[6]);
                0;
            }
        }
        if (!L.llIIIlIlIlIll(lllllllllllllllllIllIllIlllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIlIIlll[451], lllIlIIlll[442], lllIlIIlll[1])) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIlII;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[535]];
            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIllIllllIlII), lllIlIIlll[3])) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIlII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIllIllllIlII), lllIlIIlll[3])) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[536]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[537]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIIll;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[538]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIIll) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIIll);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIIll) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[539];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[540]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[541]];
            if (L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[542]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[543]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[544]];
            if (L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[545]];
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[546]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[547]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIIlI;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[548]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIIlI) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIIlI);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIIlI) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[549];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[550]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[551]];
            if (L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[552]];
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[553]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[554]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[555]];
            if (L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[556]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[557]]);
                Time.sleepTicks((int)lllIlIIlll[9]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[558]];
            if (L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[559]];
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[560]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[561]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[562]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[563]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray20 = new String[lllIlIIlll[0]];
                stringArray20[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[564]];
                TileObjects.getNearest((String[])stringArray20).interact(lllIlIIllI[lllIlIIlll[565]]);
                Time.sleepTicks((int)lllIlIIlll[9]);
                0;
            }
            String[] stringArray21 = new String[lllIlIIlll[0]];
            stringArray21[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[566]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray21))) {
                String[] stringArray22 = new String[lllIlIIlll[0]];
                stringArray22[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[567]];
                TileObjects.getNearest((String[])stringArray22).interact(lllIlIIllI[lllIlIIlll[568]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[569]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[570]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[571]]);
            Time.sleepTicks((int)lllIlIIlll[3]);
            0;
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllIllIllllIIIl;
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[572]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIIIl) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllllIIIl);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllllIIIl) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[573]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[574]]);
                Time.sleepTicks((int)lllIlIIlll[6]);
                0;
            }
        }
        WorldArea lllllllllllllllllIllIllIllIlIllI = new WorldArea(lllIlIIlll[456], lllIlIIlll[435], lllIlIIlll[16], lllIlIIlll[3], lllIlIIlll[0]);
        WorldArea lllllllllllllllllIllIllIllIlIlIl = new WorldArea(lllIlIIlll[441], lllIlIIlll[438], lllIlIIlll[9], lllIlIIlll[15], lllIlIIlll[0]);
        WorldPoint lllllllllllllllllIllIllIllIlIlII = new WorldPoint(lllIlIIlll[575], lllIlIIlll[576], lllIlIIlll[0]);
        if (!L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[577]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllIlIlII) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllIlIlII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllIlIlII) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[578];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[579]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        WorldArea lllllllllllllllllIllIllIllIlIIll = new WorldArea(lllIlIIlll[580], lllIlIIlll[581], lllIlIIlll[11], lllIlIIlll[11], lllIlIIlll[0]);
        WorldPoint lllllllllllllllllIllIllIllIlIIlI = new WorldPoint(lllIlIIlll[457], lllIlIIlll[582], lllIlIIlll[0]);
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[583]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllIlIIlI) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllIlIIlI);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllIlIIlI) ? 1 : 0) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[584];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[585]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        WorldArea lllllllllllllllllIllIllIllIlIIIl = new WorldArea(lllIlIIlll[580], lllIlIIlll[586], lllIlIIlll[13], lllIlIIlll[18], lllIlIIlll[0]);
        WorldPoint lllllllllllllllllIllIllIllIlIIII = new WorldPoint(lllIlIIlll[587], lllIlIIlll[588], lllIlIIlll[0]);
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[589]];
            if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllIlIIII) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllIlIIII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIllIllIlIIII) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[590];
                TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[591]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        WorldArea lllllllllllllllllIllIllIllIIllll = new WorldArea(lllIlIIlll[441], lllIlIIlll[592], lllIlIIlll[16], lllIlIIlll[9], lllIlIIlll[0]);
        WorldArea lllllllllllllllllIllIllIllIIlllI = new WorldArea(lllIlIIlll[587], lllIlIIlll[593], lllIlIIlll[17], lllIlIIlll[13], lllIlIIlll[6]);
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[594]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray23 = new String[lllIlIIlll[0]];
                stringArray23[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[595]];
                if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray23) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[596]];
                    Time.sleepTicks((int)lllIlIIlll[6]);
                    0;
                    String[] stringArray24 = new String[lllIlIIlll[0]];
                    stringArray24[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[597]];
                    TileObjects.getNearest((String[])stringArray24).interact(lllIlIIllI[lllIlIIlll[598]]);
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                }
            }
            String[] stringArray25 = new String[lllIlIIlll[0]];
            stringArray25[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[599]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray25))) {
                String[] stringArray26 = new String[lllIlIIlll[0]];
                stringArray26[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[600]];
                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[601]];
                    String[] stringArray27 = new String[lllIlIIlll[0]];
                    stringArray27[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[602]];
                    TileObjects.getNearest((String[])stringArray27).interact(lllIlIIllI[lllIlIIlll[603]]);
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                }
            }
            int[] nArray = new int[lllIlIIlll[0]];
            nArray[L.lllIlIIlll[1]] = lllIlIIlll[604];
            if (L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[605]];
                int[] nArray6 = new int[lllIlIIlll[0]];
                nArray6[L.lllIlIIlll[1]] = lllIlIIlll[604];
                TileObjects.getNearest((int[])nArray6).interact(lllIlIIllI[lllIlIIlll[606]]);
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[607]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[608]];
            if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray28 = new String[lllIlIIlll[0]];
                stringArray28[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[609]];
                TileObjects.getNearest((String[])stringArray28).interact(lllIlIIllI[lllIlIIlll[610]]);
                Time.sleepTicks((int)lllIlIIlll[11]);
                0;
            }
            String[] stringArray29 = new String[lllIlIIlll[0]];
            stringArray29[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[611]];
            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                String[] stringArray30 = new String[lllIlIIlll[0]];
                stringArray30[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[612]];
                TileObjects.getNearest((String[])stringArray30).interact(lllIlIIllI[lllIlIIlll[613]]);
            }
        }
        WorldArea lllllllllllllllllIllIllIllIIllIl = new WorldArea(lllIlIIlll[436], lllIlIIlll[614], lllIlIIlll[65], lllIlIIlll[7], lllIlIIlll[1]);
        WorldArea lllllllllllllllllIllIllIllIIllII = new WorldArea(lllIlIIlll[575], lllIlIIlll[593], lllIlIIlll[26], lllIlIIlll[64], lllIlIIlll[1]);
        WorldArea lllllllllllllllllIllIllIllIIlIll = new WorldArea(lllIlIIlll[615], lllIlIIlll[616], lllIlIIlll[13], lllIlIIlll[9], lllIlIIlll[1]);
        WorldPoint lllllllllllllllllIllIllIllIIlIlI = new WorldPoint(lllIlIIlll[617], lllIlIIlll[618], lllIlIIlll[1]);
        WorldArea lllllllllllllllllIllIllIllIIlIIl = new WorldArea(lllIlIIlll[619], lllIlIIlll[620], lllIlIIlll[15], lllIlIIlll[13], lllIlIIlll[1]);
        WorldArea lllllllllllllllllIllIllIllIIlIII = new WorldArea(lllIlIIlll[621], lllIlIIlll[618], lllIlIIlll[3], lllIlIIlll[9], lllIlIIlll[1]);
        WorldArea lllllllllllllllllIllIllIllIIIlll = new WorldArea(lllIlIIlll[622], lllIlIIlll[618], lllIlIIlll[6], lllIlIIlll[15], lllIlIIlll[1]);
        WorldPoint lllllllllllllllllIllIllIllIIIllI = new WorldPoint(lllIlIIlll[623], lllIlIIlll[614], lllIlIIlll[1]);
        WorldPoint lllllllllllllllllIllIllIllIIIlIl = new WorldPoint(lllIlIIlll[624], lllIlIIlll[625], lllIlIIlll[1]);
        if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[626]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllIIIlIl);
            0;
            Time.sleepTicks((int)lllIlIIlll[0]);
            0;
        }
        if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[627]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllIIlIlI);
            0;
            Time.sleepTicks((int)lllIlIIlll[0]);
            0;
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[628]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[629]];
            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray31 = new String[lllIlIIlll[0]];
                stringArray31[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[630]];
                TileObjects.getNearest((String[])stringArray31).interact(lllIlIIllI[lllIlIIlll[631]]);
                Time.sleepTicks((int)lllIlIIlll[3]);
                0;
            }
        }
        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIllIllIllIIlIlI), lllIlIIlll[18])) {
            WorldPoint lllllllllllllllllIllIllIllIIIlII = new WorldPoint(lllIlIIlll[632], lllIlIIlll[633], lllIlIIlll[1]);
            if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[634]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIllIllIIIlII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[635]];
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[636]];
                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[637]]);
                Time.sleepTicks((int)lllIlIIlll[9]);
                0;
            }
        }
        g.a(v.cE);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cH() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[40];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) || !L.llIIIlIlIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lllIlIIlll[0]];
                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[69];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[404]];
                if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lllIlIIlll[0]];
                nArray3[L.lllIlIIlll[1]] = lllIlIIlll[49];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0) || !L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) break block2;
                int[] nArray4 = new int[lllIlIIlll[0]];
                nArray4[L.lllIlIIlll[1]] = lllIlIIlll[41];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
                int[] nArray5 = new int[lllIlIIlll[0]];
                nArray5[L.lllIlIIlll[1]] = lllIlIIlll[51];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0) || !L.llIIIlIlIlIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) break block2;
                int[] nArray6 = new int[lllIlIIlll[0]];
                nArray6[L.lllIlIIlll[1]] = lllIlIIlll[217];
                if (!L.llIIIlIlIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block3;
                int[] nArray7 = new int[lllIlIIlll[0]];
                nArray7[L.lllIlIIlll[1]] = lllIlIIlll[217];
                if (!L.llIIIlIlIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block2;
            }
            n2 = lllIlIIlll[0];
            0;
            if (2 == 2) return n2 != 0;
            return ((0x36 ^ 0x6C) & ~(0xD2 ^ 0x88)) != 0;
        }
        n2 = lllIlIIlll[1];
        return n2 != 0;
    }

    private static boolean llIIIlIlIllll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIlIllII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ah() {
        int n2;
        if (L.llIIIlIlIllII(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[194]) && L.llIIIlIlIlIll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lllIlIIlll[0];
            0;
            if (3 <= 0) {
                return (1 & ~1) != 0;
            }
        } else {
            n2 = lllIlIIlll[1];
        }
        return n2 != 0;
    }

    static {
        L.llIIIlIlIIlll();
        L.llIIIlIlIIllI();
        bv = new ArrayList<d>();
        gn = null;
        de = new WorldPoint(lllIlIIlll[846], lllIlIIlll[847], lllIlIIlll[1]);
        go = new WorldPoint(lllIlIIlll[848], lllIlIIlll[849], lllIlIIlll[1]);
        gp = new WorldPoint(lllIlIIlll[850], lllIlIIlll[851], lllIlIIlll[1]);
        gq = new WorldPoint(lllIlIIlll[852], lllIlIIlll[853], lllIlIIlll[1]);
        gr = new WorldPoint(lllIlIIlll[443], lllIlIIlll[854], lllIlIIlll[1]);
        gs = new WorldPoint(lllIlIIlll[855], lllIlIIlll[856], lllIlIIlll[1]);
        gt = new WorldPoint(lllIlIIlll[452], lllIlIIlll[857], lllIlIIlll[1]);
        gu = new WorldArea(lllIlIIlll[153], lllIlIIlll[858], lllIlIIlll[189], lllIlIIlll[318], lllIlIIlll[1]);
        gv = new WorldArea(lllIlIIlll[859], lllIlIIlll[860], lllIlIIlll[80], lllIlIIlll[66], lllIlIIlll[1]);
        gw = new WorldArea(lllIlIIlll[861], lllIlIIlll[862], lllIlIIlll[124], lllIlIIlll[105], lllIlIIlll[1]);
        gC = null;
        gD = null;
        gE = null;
        gF = null;
        gG = null;
        gH = null;
        gI = null;
        gJ = null;
        gK = new WorldArea(lllIlIIlll[405], lllIlIIlll[863], lllIlIIlll[111], lllIlIIlll[12], lllIlIIlll[1]);
        String[] stringArray = new String[lllIlIIlll[21]];
        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[864]];
        stringArray[L.lllIlIIlll[0]] = lllIlIIllI[lllIlIIlll[865]];
        stringArray[L.lllIlIIlll[6]] = lllIlIIllI[lllIlIIlll[866]];
        stringArray[L.lllIlIIlll[3]] = lllIlIIllI[lllIlIIlll[867]];
        stringArray[L.lllIlIIlll[9]] = lllIlIIllI[lllIlIIlll[868]];
        stringArray[L.lllIlIIlll[11]] = lllIlIIllI[lllIlIIlll[869]];
        stringArray[L.lllIlIIlll[13]] = lllIlIIllI[lllIlIIlll[870]];
        stringArray[L.lllIlIIlll[15]] = lllIlIIllI[lllIlIIlll[871]];
        stringArray[L.lllIlIIlll[16]] = lllIlIIllI[lllIlIIlll[872]];
        stringArray[L.lllIlIIlll[17]] = lllIlIIllI[lllIlIIlll[873]];
        stringArray[L.lllIlIIlll[18]] = lllIlIIllI[lllIlIIlll[874]];
        stringArray[L.lllIlIIlll[19]] = lllIlIIllI[lllIlIIlll[875]];
        cE = stringArray;
        da = lllIlIIllI[lllIlIIlll[876]];
        h = "Sins of the Father " + da;
    }

    private static int llIIIlIllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String llIIIlIlIIlII(String lllllllllllllllllIllIllIlIIllllI, String lllllllllllllllllIllIllIlIIllIll) {
        try {
            SecretKeySpec lllllllllllllllllIllIllIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIllIlIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIllIlIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIllIlIlIIIII.init(lllIlIIlll[6], lllllllllllllllllIllIllIlIlIIIIl);
            return new String(lllllllllllllllllIllIllIlIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIllIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllIllIlIIlllll) {
            lllllllllllllllllIllIllIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static int llIIIlIlllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIlIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIlIlIlIll(int n2) {
        return n2 == 0;
    }

    public static void cB() {
        block402: {
            Object lllllllllllllllllIllIlllIlIlIIIl;
            block419: {
                WorldPoint lllllllllllllllllIllIlllIlIIlIll;
                WorldPoint lllllllllllllllllIllIlllIlIIllII;
                WorldPoint lllllllllllllllllIllIlllIlIIllIl;
                block421: {
                    WorldPoint lllllllllllllllllIllIlllIlIlIIII2;
                    Widget lllllllllllllllllIllIlllIlIIlllI;
                    WorldPoint lllllllllllllllllIllIlllIlIIllll;
                    block420: {
                        block416: {
                            block418: {
                                block417: {
                                    Object lllllllllllllllllIllIlllIlIlIIlI;
                                    block405: {
                                        block415: {
                                            block414: {
                                                block413: {
                                                    block412: {
                                                        block411: {
                                                            block410: {
                                                                block409: {
                                                                    block408: {
                                                                        block407: {
                                                                            block406: {
                                                                                block404: {
                                                                                    block403: {
                                                                                        if (L.llIIIlIlIlIIl(bt ? 1 : 0)) {
                                                                                            b.a(bv);
                                                                                            if (L.llIIIlIlIlIlI(bv.size(), lllIlIIlll[0])) {
                                                                                                System.out.println(lllIlIIllI[lllIlIIlll[1]]);
                                                                                                bt = lllIlIIlll[1];
                                                                                            }
                                                                                        }
                                                                                        if (!L.llIIIlIlIlIll(bt ? 1 : 0)) break block402;
                                                                                        if (!L.llIIIlIlIllII(e.j(lllIlIIlll[2]), lllIlIIlll[3]) || L.llIIIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4])) {
                                                                                            da = lllIlIIllI[lllIlIIlll[0]];
                                                                                            aa.ev();
                                                                                        }
                                                                                        if (L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) && L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4])) {
                                                                                            da = lllIlIIllI[lllIlIIlll[6]];
                                                                                            aF.gs();
                                                                                        }
                                                                                        if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) && L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4]) && L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.FLETCHING), lllIlIIlll[7])) {
                                                                                            da = lllIlIIllI[lllIlIIlll[3]];
                                                                                            aA.fv();
                                                                                        }
                                                                                        if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.FLETCHING), lllIlIIlll[7]) && L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4]) && L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIlIIlll[8])) {
                                                                                            da = lllIlIIllI[lllIlIIlll[9]];
                                                                                            ay.fi();
                                                                                        }
                                                                                        if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.FLETCHING), lllIlIIlll[7]) && L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.CRAFTING), lllIlIIlll[8]) && L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.AGILITY), lllIlIIlll[10])) {
                                                                                            da = lllIlIIllI[lllIlIIlll[11]];
                                                                                            av.eA();
                                                                                        }
                                                                                        if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.FLETCHING), lllIlIIlll[7]) && L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.CRAFTING), lllIlIIlll[8]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.AGILITY), lllIlIIlll[10]) && L.llIIIlIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIIlll[12])) {
                                                                                            da = lllIlIIllI[lllIlIIlll[13]];
                                                                                            m.ak();
                                                                                        }
                                                                                        if (L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.FLETCHING), lllIlIIlll[7]) && L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.CRAFTING), lllIlIIlll[8]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.AGILITY), lllIlIIlll[10]) && L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.MAGIC), lllIlIIlll[12]) && !L.llIIIlIlIllII(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIlIIlll[14])) break block403;
                                                                                        String[] stringArray = new String[lllIlIIlll[0]];
                                                                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[15]];
                                                                                        if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block404;
                                                                                    }
                                                                                    da = lllIlIIllI[lllIlIIlll[16]];
                                                                                    v.aZ();
                                                                                }
                                                                                if (!L.llIIIlIlIlIll(L.an() ? 1 : 0) || !L.llIIIlIlIlIll(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId())) || !L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.SLAYER), lllIlIIlll[12]) || !L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIlIIlll[5]) || !L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.FLETCHING), lllIlIIlll[7]) || !L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.CRAFTING), lllIlIIlll[8]) || !L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.AGILITY), lllIlIIlll[10]) || !L.llIIIlIlIllIl(e.j(lllIlIIlll[2]), lllIlIIlll[3]) || !L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aa.mK), lllIlIIlll[4]) || !L.llIIIlIlIllII(Skills.getLevel((Skill)Skill.MAGIC), lllIlIIlll[12]) || !L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIlIIlll[14])) break block405;
                                                                                String[] stringArray = new String[lllIlIIlll[0]];
                                                                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[17]];
                                                                                if (!L.llIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block405;
                                                                                da = lllIlIIllI[lllIlIIlll[18]];
                                                                                lllllllllllllllllIllIlllIlIlIIlI = BankLocation.getNearest();
                                                                                if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIlIIlI) && L.llIIIlIlIlIll(lllllllllllllllllIllIlllIlIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[19]];
                                                                                    a.a((BankLocation)lllllllllllllllllIllIlllIlIlIIlI);
                                                                                }
                                                                                if (!L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIlIIlI) || !L.llIIIlIlIlIIl(lllllllllllllllllIllIlllIlIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block405;
                                                                                if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                                                                    a.a();
                                                                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIlll[20]);
                                                                                    0;
                                                                                }
                                                                                if (!L.llIIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) break block405;
                                                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[21]];
                                                                                if (L.llIIIlIllIIII(Inventory.getAll().size())) {
                                                                                    Bank.depositInventory();
                                                                                    Time.sleepTicks((int)lllIlIIlll[9]);
                                                                                    0;
                                                                                }
                                                                                if (L.llIIIlIllIIII(Equipment.getAll().size())) {
                                                                                    Bank.depositEquipment();
                                                                                    Time.sleepTicks((int)lllIlIIlll[6]);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[lllIlIIlll[0]];
                                                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[22];
                                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block406;
                                                                                int[] nArray2 = new int[lllIlIIlll[0]];
                                                                                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[22];
                                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block407;
                                                                                int[] nArray3 = new int[lllIlIIlll[0]];
                                                                                nArray3[L.lllIlIIlll[1]] = lllIlIIlll[22];
                                                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIlIIlll[12])) break block407;
                                                                            }
                                                                            L.Q();
                                                                            System.out.println(lllIlIIllI[lllIlIIlll[23]]);
                                                                            bt = lllIlIIlll[0];
                                                                            return;
                                                                        }
                                                                        int[] nArray = new int[lllIlIIlll[0]];
                                                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[24];
                                                                        if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                            int[] nArray4 = new int[lllIlIIlll[0]];
                                                                            nArray4[L.lllIlIIlll[1]] = lllIlIIlll[24];
                                                                            if (L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), lllIlIIlll[25])) {
                                                                                L.Q();
                                                                                System.out.println(lllIlIIllI[lllIlIIlll[26]]);
                                                                                bt = lllIlIIlll[0];
                                                                                return;
                                                                            }
                                                                        }
                                                                        int[] nArray5 = new int[lllIlIIlll[0]];
                                                                        nArray5[L.lllIlIIlll[1]] = lllIlIIlll[27];
                                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block408;
                                                                        int[] nArray6 = new int[lllIlIIlll[0]];
                                                                        nArray6[L.lllIlIIlll[1]] = lllIlIIlll[27];
                                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block409;
                                                                        int[] nArray7 = new int[lllIlIIlll[0]];
                                                                        nArray7[L.lllIlIIlll[1]] = lllIlIIlll[27];
                                                                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lllIlIIlll[28])) break block409;
                                                                    }
                                                                    L.Q();
                                                                    System.out.println(lllIlIIllI[lllIlIIlll[29]]);
                                                                    bt = lllIlIIlll[0];
                                                                    return;
                                                                }
                                                                int[] nArray = new int[lllIlIIlll[0]];
                                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[30];
                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block410;
                                                                int[] nArray8 = new int[lllIlIIlll[0]];
                                                                nArray8[L.lllIlIIlll[1]] = lllIlIIlll[30];
                                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block411;
                                                                int[] nArray9 = new int[lllIlIIlll[0]];
                                                                nArray9[L.lllIlIIlll[1]] = lllIlIIlll[30];
                                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lllIlIIlll[31])) break block411;
                                                            }
                                                            L.Q();
                                                            System.out.println(lllIlIIllI[lllIlIIlll[32]]);
                                                            bt = lllIlIIlll[0];
                                                            return;
                                                        }
                                                        int[] nArray = new int[lllIlIIlll[0]];
                                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block412;
                                                        int[] nArray10 = new int[lllIlIIlll[0]];
                                                        nArray10[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                                        if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block413;
                                                        int[] nArray11 = new int[lllIlIIlll[0]];
                                                        nArray11[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                                        if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lllIlIIlll[11])) break block413;
                                                    }
                                                    L.Q();
                                                    System.out.println(lllIlIIllI[lllIlIIlll[34]]);
                                                    bt = lllIlIIlll[0];
                                                    return;
                                                }
                                                int[] nArray = new int[lllIlIIlll[0]];
                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[35];
                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block414;
                                                int[] nArray12 = new int[lllIlIIlll[0]];
                                                nArray12[L.lllIlIIlll[1]] = lllIlIIlll[35];
                                                if (!L.llIIIlIlIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block415;
                                                int[] nArray13 = new int[lllIlIIlll[0]];
                                                nArray13[L.lllIlIIlll[1]] = lllIlIIlll[35];
                                                if (!L.llIIIlIlIlIlI(Bank.getFirst((int[])nArray13).getQuantity(), lllIlIIlll[12])) break block415;
                                            }
                                            L.Q();
                                            System.out.println(lllIlIIllI[lllIlIIlll[31]]);
                                            bt = lllIlIIlll[0];
                                            return;
                                        }
                                        int[] nArray = new int[lllIlIIlll[36]];
                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[37];
                                        nArray[L.lllIlIIlll[0]] = lllIlIIlll[35];
                                        nArray[L.lllIlIIlll[6]] = lllIlIIlll[38];
                                        nArray[L.lllIlIIlll[3]] = lllIlIIlll[39];
                                        nArray[L.lllIlIIlll[9]] = lllIlIIlll[40];
                                        nArray[L.lllIlIIlll[11]] = lllIlIIlll[41];
                                        nArray[L.lllIlIIlll[13]] = lllIlIIlll[42];
                                        nArray[L.lllIlIIlll[15]] = lllIlIIlll[43];
                                        nArray[L.lllIlIIlll[16]] = lllIlIIlll[30];
                                        nArray[L.lllIlIIlll[17]] = lllIlIIlll[44];
                                        nArray[L.lllIlIIlll[18]] = lllIlIIlll[45];
                                        nArray[L.lllIlIIlll[19]] = lllIlIIlll[46];
                                        nArray[L.lllIlIIlll[21]] = lllIlIIlll[47];
                                        nArray[L.lllIlIIlll[23]] = lllIlIIlll[48];
                                        nArray[L.lllIlIIlll[26]] = lllIlIIlll[22];
                                        nArray[L.lllIlIIlll[29]] = lllIlIIlll[27];
                                        nArray[L.lllIlIIlll[32]] = lllIlIIlll[49];
                                        nArray[L.lllIlIIlll[34]] = lllIlIIlll[50];
                                        nArray[L.lllIlIIlll[31]] = lllIlIIlll[51];
                                        nArray[L.lllIlIIlll[52]] = lllIlIIlll[53];
                                        nArray[L.lllIlIIlll[28]] = lllIlIIlll[54];
                                        nArray[L.lllIlIIlll[55]] = lllIlIIlll[56];
                                        nArray[L.lllIlIIlll[57]] = lllIlIIlll[58];
                                        nArray[L.lllIlIIlll[59]] = lllIlIIlll[60];
                                        if (L.llIIIlIlIlIll(e.c(nArray) ? 1 : 0)) {
                                            L.Q();
                                            System.out.println(lllIlIIllI[lllIlIIlll[52]]);
                                            bt = lllIlIIlll[0];
                                            return;
                                        }
                                        int[] nArray14 = new int[lllIlIIlll[36]];
                                        nArray14[L.lllIlIIlll[1]] = lllIlIIlll[37];
                                        nArray14[L.lllIlIIlll[0]] = lllIlIIlll[35];
                                        nArray14[L.lllIlIIlll[6]] = lllIlIIlll[38];
                                        nArray14[L.lllIlIIlll[3]] = lllIlIIlll[39];
                                        nArray14[L.lllIlIIlll[9]] = lllIlIIlll[40];
                                        nArray14[L.lllIlIIlll[11]] = lllIlIIlll[41];
                                        nArray14[L.lllIlIIlll[13]] = lllIlIIlll[42];
                                        nArray14[L.lllIlIIlll[15]] = lllIlIIlll[43];
                                        nArray14[L.lllIlIIlll[16]] = lllIlIIlll[30];
                                        nArray14[L.lllIlIIlll[17]] = lllIlIIlll[44];
                                        nArray14[L.lllIlIIlll[18]] = lllIlIIlll[45];
                                        nArray14[L.lllIlIIlll[19]] = lllIlIIlll[46];
                                        nArray14[L.lllIlIIlll[21]] = lllIlIIlll[47];
                                        nArray14[L.lllIlIIlll[23]] = lllIlIIlll[48];
                                        nArray14[L.lllIlIIlll[26]] = lllIlIIlll[22];
                                        nArray14[L.lllIlIIlll[29]] = lllIlIIlll[27];
                                        nArray14[L.lllIlIIlll[32]] = lllIlIIlll[49];
                                        nArray14[L.lllIlIIlll[34]] = lllIlIIlll[50];
                                        nArray14[L.lllIlIIlll[31]] = lllIlIIlll[51];
                                        nArray14[L.lllIlIIlll[52]] = lllIlIIlll[53];
                                        nArray14[L.lllIlIIlll[28]] = lllIlIIlll[54];
                                        nArray14[L.lllIlIIlll[55]] = lllIlIIlll[56];
                                        nArray14[L.lllIlIIlll[57]] = lllIlIIlll[58];
                                        nArray14[L.lllIlIIlll[59]] = lllIlIIlll[60];
                                        if (L.llIIIlIlIlIIl(e.c(nArray14) ? 1 : 0)) {
                                            int[] nArray15 = new int[lllIlIIlll[0]];
                                            nArray15[L.lllIlIIlll[1]] = lllIlIIlll[46];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                a.a(lllIlIIlll[46], lllIlIIlll[0]);
                                            }
                                            int[] nArray16 = new int[lllIlIIlll[0]];
                                            nArray16[L.lllIlIIlll[1]] = lllIlIIlll[50];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                a.a(lllIlIIlll[50], lllIlIIlll[0]);
                                            }
                                            int[] nArray17 = new int[lllIlIIlll[0]];
                                            nArray17[L.lllIlIIlll[1]] = lllIlIIlll[54];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                                                a.a(lllIlIIlll[54], lllIlIIlll[0]);
                                            }
                                            int[] nArray18 = new int[lllIlIIlll[0]];
                                            nArray18[L.lllIlIIlll[1]] = lllIlIIlll[53];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                                a.a(lllIlIIlll[53], lllIlIIlll[0]);
                                            }
                                            int[] nArray19 = new int[lllIlIIlll[0]];
                                            nArray19[L.lllIlIIlll[1]] = lllIlIIlll[45];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                                a.a(lllIlIIlll[45], lllIlIIlll[0]);
                                            }
                                            int[] nArray20 = new int[lllIlIIlll[0]];
                                            nArray20[L.lllIlIIlll[1]] = lllIlIIlll[56];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                                a.a(lllIlIIlll[56], lllIlIIlll[0]);
                                            }
                                            int[] nArray21 = new int[lllIlIIlll[0]];
                                            nArray21[L.lllIlIIlll[1]] = lllIlIIlll[61];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
                                                a.a(lllIlIIlll[61], lllIlIIlll[0]);
                                            }
                                            int[] nArray22 = new int[lllIlIIlll[0]];
                                            nArray22[L.lllIlIIlll[1]] = lllIlIIlll[44];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                                a.a(lllIlIIlll[44], lllIlIIlll[0]);
                                            }
                                            int[] nArray23 = new int[lllIlIIlll[0]];
                                            nArray23[L.lllIlIIlll[1]] = lllIlIIlll[48];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                                                a.a(lllIlIIlll[48], lllIlIIlll[0]);
                                            }
                                            int[] nArray24 = new int[lllIlIIlll[0]];
                                            nArray24[L.lllIlIIlll[1]] = lllIlIIlll[47];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                                a.a(lllIlIIlll[47], lllIlIIlll[0]);
                                            }
                                            int[] nArray25 = new int[lllIlIIlll[0]];
                                            nArray25[L.lllIlIIlll[1]] = lllIlIIlll[58];
                                            if (L.llIIIlIlIlIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
                                                a.a(lllIlIIlll[58], lllIlIIlll[0]);
                                            }
                                            int[] nArray26 = new int[lllIlIIlll[0]];
                                            nArray26[L.lllIlIIlll[1]] = lllIlIIlll[58];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                                                int[] nArray27 = new int[lllIlIIlll[0]];
                                                nArray27[L.lllIlIIlll[1]] = lllIlIIlll[58];
                                                Inventory.getFirst((int[])nArray27).interact(lllIlIIllI[lllIlIIlll[28]]);
                                            }
                                            int[] nArray28 = new int[lllIlIIlll[0]];
                                            nArray28[L.lllIlIIlll[1]] = lllIlIIlll[47];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                                                int[] nArray29 = new int[lllIlIIlll[0]];
                                                nArray29[L.lllIlIIlll[1]] = lllIlIIlll[47];
                                                Inventory.getFirst((int[])nArray29).interact(lllIlIIllI[lllIlIIlll[55]]);
                                            }
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                                                Inventory.getFirst((int[])f.bk).interact(lllIlIIllI[lllIlIIlll[57]]);
                                            }
                                            int[] nArray30 = new int[lllIlIIlll[0]];
                                            nArray30[L.lllIlIIlll[1]] = lllIlIIlll[46];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                                                int[] nArray31 = new int[lllIlIIlll[0]];
                                                nArray31[L.lllIlIIlll[1]] = lllIlIIlll[46];
                                                Inventory.getFirst((int[])nArray31).interact(lllIlIIllI[lllIlIIlll[59]]);
                                            }
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                            int[] nArray32 = new int[lllIlIIlll[0]];
                                            nArray32[L.lllIlIIlll[1]] = lllIlIIlll[54];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray32) ? 1 : 0)) {
                                                int[] nArray33 = new int[lllIlIIlll[0]];
                                                nArray33[L.lllIlIIlll[1]] = lllIlIIlll[54];
                                                Inventory.getFirst((int[])nArray33).interact(lllIlIIllI[lllIlIIlll[36]]);
                                            }
                                            int[] nArray34 = new int[lllIlIIlll[0]];
                                            nArray34[L.lllIlIIlll[1]] = lllIlIIlll[53];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                int[] nArray35 = new int[lllIlIIlll[0]];
                                                nArray35[L.lllIlIIlll[1]] = lllIlIIlll[53];
                                                Inventory.getFirst((int[])nArray35).interact(lllIlIIllI[lllIlIIlll[62]]);
                                            }
                                            int[] nArray36 = new int[lllIlIIlll[0]];
                                            nArray36[L.lllIlIIlll[1]] = lllIlIIlll[45];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                int[] nArray37 = new int[lllIlIIlll[0]];
                                                nArray37[L.lllIlIIlll[1]] = lllIlIIlll[45];
                                                Inventory.getFirst((int[])nArray37).interact(lllIlIIllI[lllIlIIlll[63]]);
                                            }
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                            int[] nArray38 = new int[lllIlIIlll[0]];
                                            nArray38[L.lllIlIIlll[1]] = lllIlIIlll[56];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray38) ? 1 : 0)) {
                                                int[] nArray39 = new int[lllIlIIlll[0]];
                                                nArray39[L.lllIlIIlll[1]] = lllIlIIlll[56];
                                                Inventory.getFirst((int[])nArray39).interact(lllIlIIllI[lllIlIIlll[64]]);
                                            }
                                            int[] nArray40 = new int[lllIlIIlll[0]];
                                            nArray40[L.lllIlIIlll[1]] = lllIlIIlll[50];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray40) ? 1 : 0)) {
                                                int[] nArray41 = new int[lllIlIIlll[0]];
                                                nArray41[L.lllIlIIlll[1]] = lllIlIIlll[50];
                                                Inventory.getFirst((int[])nArray41).interact(lllIlIIllI[lllIlIIlll[65]]);
                                            }
                                            int[] nArray42 = new int[lllIlIIlll[0]];
                                            nArray42[L.lllIlIIlll[1]] = lllIlIIlll[61];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray42) ? 1 : 0)) {
                                                int[] nArray43 = new int[lllIlIIlll[0]];
                                                nArray43[L.lllIlIIlll[1]] = lllIlIIlll[61];
                                                Inventory.getFirst((int[])nArray43).interact(lllIlIIllI[lllIlIIlll[66]]);
                                            }
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                            int[] nArray44 = new int[lllIlIIlll[0]];
                                            nArray44[L.lllIlIIlll[1]] = lllIlIIlll[44];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                                int[] nArray45 = new int[lllIlIIlll[0]];
                                                nArray45[L.lllIlIIlll[1]] = lllIlIIlll[44];
                                                Inventory.getFirst((int[])nArray45).interact(lllIlIIllI[lllIlIIlll[4]]);
                                            }
                                            int[] nArray46 = new int[lllIlIIlll[0]];
                                            nArray46[L.lllIlIIlll[1]] = lllIlIIlll[48];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray46) ? 1 : 0)) {
                                                int[] nArray47 = new int[lllIlIIlll[0]];
                                                nArray47[L.lllIlIIlll[1]] = lllIlIIlll[48];
                                                Inventory.getFirst((int[])nArray47).interact(lllIlIIllI[lllIlIIlll[67]]);
                                            }
                                            if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepTicks((int)lllIlIIlll[11]);
                                                0;
                                            }
                                            a.a(lllIlIIlll[30], lllIlIIlll[9]);
                                            a.a(lllIlIIlll[68], lllIlIIlll[3]);
                                            a.a(lllIlIIlll[40], lllIlIIlll[18]);
                                            a.a(lllIlIIlll[35], lllIlIIlll[16]);
                                            a.a(lllIlIIlll[69], lllIlIIlll[0]);
                                            a.a(lllIlIIlll[24], lllIlIIlll[0]);
                                        }
                                    }
                                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && L.llIIIlIlIlIlI(Movement.getRunEnergy(), lllIlIIlll[12])) {
                                        Inventory.getFirst((int[])f.ba).interact(lllIlIIllI[lllIlIIlll[70]]);
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    if (L.llIIIlIlIlIIl(L.an() ? 1 : 0) && L.llIIIlIlIlIll(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()))) {
                                        if (L.llIIIlIlIlIll(gu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[71]];
                                            int[] nArray = new int[lllIlIIlll[0]];
                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[69];
                                            Inventory.getFirst((int[])nArray).interact(lllIlIIllI[lllIlIIlll[72]]);
                                            Time.sleepTicks((int)lllIlIIlll[11]);
                                            0;
                                        }
                                        if (L.llIIIlIlIlIIl(gu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[15])) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[73]];
                                                Movement.walkTo((WorldPoint)de);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[15])) {
                                                g.a(lllIlIIllI[lllIlIIlll[74]], cE);
                                            }
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[9])) {
                                        g.a(lllIlIIllI[lllIlIIlll[75]], cE);
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[13])) {
                                        if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(go), lllIlIIlll[3])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[76]];
                                            Movement.walkTo((WorldPoint)go);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(go), lllIlIIlll[3])) {
                                            g.a(lllIlIIllI[lllIlIIlll[77]], cE);
                                        }
                                    }
                                    if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[16]) || !L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[18]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[21])) {
                                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[25]];
                                            int[] nArray = new int[lllIlIIlll[0]];
                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[78];
                                            TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[79]]);
                                            Time.sleepTicks((int)lllIlIIlll[3]);
                                            0;
                                            gC = null;
                                        }
                                        if (L.llIIIlIlIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            L.cL();
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[26])) {
                                        // empty if block
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[32])) {
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[80]];
                                        if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                                        }
                                        if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                        }
                                        if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                        }
                                        if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[65])) {
                                            Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[81]]);
                                        }
                                        if (L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 63.0))) {
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[82]];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray2 = new String[lllIlIIlll[0]];
                                                stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[83]];
                                                Inventory.getFirst((String[])stringArray2).interact(lllIlIIllI[lllIlIIlll[84]]);
                                            }
                                        }
                                        if (L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.STRENGTH) + lllIlIIlll[21], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aY).interact(lllIlIIllI[lllIlIIlll[85]]);
                                        }
                                        if (L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[86]];
                                            if (L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray))) {
                                                String[] stringArray3 = new String[lllIlIIlll[0]];
                                                stringArray3[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[87]];
                                                NPCs.getNearest((String[])stringArray3).interact(lllIlIIllI[lllIlIIlll[12]]);
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                        }
                                        if (L.llIIIlIlIlIIl(AccBuilderSotf.i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[88]];
                                            lllllllllllllllllIllIlllIlIlIIlI = NPCs.getNearest((String[])stringArray).getWorldLocation();
                                            Movement.walkTo((WorldPoint)new WorldPoint(lllllllllllllllllIllIlllIlIlIIlI.getX() + lllIlIIlll[0], lllllllllllllllllIllIlllIlIlIIlI.getWorldY() + lllIlIIlll[0], lllIlIIlll[1]));
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                            0;
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[31])) {
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[10]];
                                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                                        }
                                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                        }
                                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                        }
                                        int[] nArray = new int[lllIlIIlll[0]];
                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[89];
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[90]];
                                        if (L.llIIIlIlIlIIl(TileObjects.getNearest((int[])nArray).hasAction(stringArray) ? 1 : 0)) {
                                            int[] nArray48 = new int[lllIlIIlll[0]];
                                            nArray48[L.lllIlIIlll[1]] = lllIlIIlll[89];
                                            TileObjects.getNearest((int[])nArray48).interact(lllIlIIllI[lllIlIIlll[91]]);
                                            Time.sleepTicks((int)lllIlIIlll[3]);
                                            0;
                                        }
                                        int[] nArray49 = new int[lllIlIIlll[0]];
                                        nArray49[L.lllIlIIlll[1]] = lllIlIIlll[92];
                                        String[] stringArray4 = new String[lllIlIIlll[0]];
                                        stringArray4[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[93]];
                                        if (L.llIIIlIlIlIIl(TileObjects.getNearest((int[])nArray49).hasAction(stringArray4) ? 1 : 0)) {
                                            int[] nArray50 = new int[lllIlIIlll[0]];
                                            nArray50[L.lllIlIIlll[1]] = lllIlIIlll[89];
                                            String[] stringArray5 = new String[lllIlIIlll[0]];
                                            stringArray5[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[8]];
                                            if (L.llIIIlIlIlIll(TileObjects.getNearest((int[])nArray50).hasAction(stringArray5) ? 1 : 0)) {
                                                int[] nArray51 = new int[lllIlIIlll[0]];
                                                nArray51[L.lllIlIIlll[1]] = lllIlIIlll[92];
                                                TileObjects.getNearest((int[])nArray51).interact(lllIlIIllI[lllIlIIlll[94]]);
                                                Time.sleepTicks((int)lllIlIIlll[3]);
                                                0;
                                            }
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[28])) {
                                        int[] nArray = new int[lllIlIIlll[0]];
                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                        if (L.llIIIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[95]];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 100.0))) {
                                                String[] stringArray6 = new String[lllIlIIlll[0]];
                                                stringArray6[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[96]];
                                                Inventory.getFirst((String[])stringArray6).interact(lllIlIIllI[lllIlIIlll[7]]);
                                            }
                                            if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[83]) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                                Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[97]]);
                                            }
                                            if (L.llIIIlIlIlIll(gu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[5]];
                                                int[] nArray52 = new int[lllIlIIlll[0]];
                                                nArray52[L.lllIlIIlll[1]] = lllIlIIlll[69];
                                                Inventory.getFirst((int[])nArray52).interact(lllIlIIllI[lllIlIIlll[98]]);
                                                Time.sleepTicks((int)lllIlIIlll[11]);
                                                0;
                                            }
                                            if (L.llIIIlIlIlIIl(gu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                L.cK();
                                            }
                                        }
                                        int[] nArray53 = new int[lllIlIIlll[0]];
                                        nArray53[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                        if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray53) ? 1 : 0)) {
                                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[15])) {
                                                String[] stringArray = new String[lllIlIIlll[0]];
                                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[99]];
                                                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 100.0))) {
                                                    String[] stringArray7 = new String[lllIlIIlll[0]];
                                                    stringArray7[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[100]];
                                                    Inventory.getFirst((String[])stringArray7).interact(lllIlIIllI[lllIlIIlll[101]]);
                                                }
                                                if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[83]) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                                    Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[102]]);
                                                }
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[103]];
                                                if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                                    Dialog.close();
                                                }
                                                Movement.walkTo((WorldPoint)de);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[15])) {
                                                g.a(lllIlIIllI[lllIlIIlll[104]], cE);
                                            }
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[57])) {
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[13])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[105]];
                                            int[] nArray = new int[lllIlIIlll[0]];
                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                int[] nArray54 = new int[lllIlIIlll[0]];
                                                nArray54[L.lllIlIIlll[1]] = lllIlIIlll[40];
                                                Inventory.getFirst((int[])nArray54).interact(lllIlIIllI[lllIlIIlll[107]]);
                                                Time.sleepTicks((int)lllIlIIlll[6]);
                                                0;
                                            }
                                        }
                                        if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[13]) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(G.fQ), lllIlIIlll[13])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[108]];
                                            Movement.walkTo((WorldPoint)G.fQ);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[109]];
                                        if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                                            String[] stringArray8 = new String[lllIlIIlll[0]];
                                            stringArray8[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[110]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lllIlIIllI[lllIlIIlll[111]]);
                                            Time.sleepTicks((int)lllIlIIlll[3]);
                                            0;
                                        }
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(G.fQ), lllIlIIlll[29])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[112]];
                                            g.a(lllIlIIllI[lllIlIIlll[113]], cE);
                                        }
                                    }
                                    if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[36]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[63])) {
                                        g.a(lllIlIIllI[lllIlIIlll[114]], cE);
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[65])) {
                                        if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gp), lllIlIIlll[15])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[115]];
                                            Movement.walkTo((WorldPoint)gp);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gp), lllIlIIlll[15])) {
                                            g.a(lllIlIIllI[lllIlIIlll[116]], cE);
                                        }
                                    }
                                    if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[4]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[70])) {
                                        if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                            g.a(lllIlIIllI[lllIlIIlll[117]], cE);
                                        }
                                        g.a(cE);
                                    }
                                    if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[72]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[74])) {
                                        if (L.llIIIlIlIlIll(L.cH() ? 1 : 0)) {
                                            L.cK();
                                        }
                                        if (L.llIIIlIlIlIIl(L.cH() ? 1 : 0) && L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gq), lllIlIIlll[13])) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[118]];
                                                if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                                    Dialog.close();
                                                }
                                                Movement.walkTo((WorldPoint)gq);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gq), lllIlIIlll[13])) {
                                                g.a(lllIlIIllI[lllIlIIlll[119]], cE);
                                            }
                                        }
                                        L.cJ();
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[76])) {
                                        g.a(cE);
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[25])) {
                                        int[] nArray = new int[lllIlIIlll[0]];
                                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[60];
                                        if (L.llIIIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIlIIlll[11])) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[120]];
                                                Movement.walkTo((WorldPoint)D.fa);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIlIIlll[11])) {
                                                if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                                    int[] nArray55 = new int[lllIlIIlll[0]];
                                                    nArray55[L.lllIlIIlll[1]] = lllIlIIlll[121];
                                                    TileObjects.getNearest((int[])nArray55).interact(lllIlIIllI[lllIlIIlll[122]]);
                                                    Time.sleepTicks((int)lllIlIIlll[6]);
                                                    0;
                                                }
                                                if (L.llIIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                    String[] stringArray = new String[lllIlIIlll[0]];
                                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[123]];
                                                    Bank.depositAll((String[])stringArray);
                                                    String[] stringArray9 = new String[lllIlIIlll[0]];
                                                    stringArray9[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[124]];
                                                    Bank.depositAll((String[])stringArray9);
                                                    String[] stringArray10 = new String[lllIlIIlll[0]];
                                                    stringArray10[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[125]];
                                                    Bank.depositAll((String[])stringArray10);
                                                    String[] stringArray11 = new String[lllIlIIlll[0]];
                                                    stringArray11[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[126]];
                                                    Bank.depositAll((String[])stringArray11);
                                                    a.a(lllIlIIlll[60], lllIlIIlll[0]);
                                                    a.a(lllIlIIlll[30], lllIlIIlll[6]);
                                                    a.a(lllIlIIlll[68], lllIlIIlll[6]);
                                                    String[] stringArray12 = new String[lllIlIIlll[0]];
                                                    stringArray12[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[127]];
                                                    if (L.llIIIlIlIlIlI(Inventory.getAll((String[])stringArray12).size(), lllIlIIlll[11])) {
                                                        a.a(lllIlIIlll[35], lllIlIIlll[13]);
                                                    }
                                                }
                                            }
                                        }
                                        int[] nArray56 = new int[lllIlIIlll[0]];
                                        nArray56[L.lllIlIIlll[1]] = lllIlIIlll[60];
                                        if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray56) ? 1 : 0)) {
                                            lllllllllllllllllIllIlllIlIlIIlI = new WorldPoint(lllIlIIlll[128], lllIlIIlll[129], lllIlIIlll[1]);
                                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIlI), lllIlIIlll[18])) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[130]];
                                                Movement.walkTo((WorldPoint)y.dO);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIlI), lllIlIIlll[18])) {
                                                g.a(lllIlIIllI[lllIlIIlll[131]], cE);
                                            }
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[80])) {
                                        if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[132]];
                                            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[133]]);
                                            Time.sleepTicks((int)lllIlIIlll[3]);
                                            0;
                                        }
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[134]];
                                        g.a(stringArray);
                                    }
                                    if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[82]) || !L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[84]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[86])) {
                                        g.a(cE);
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[12])) {
                                        if (L.llIIIlIlIlIIl(Widgets.get((int)lllIlIIlll[135]).isEmpty() ? 1 : 0)) {
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[136]];
                                            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[137]]);
                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                            0;
                                        }
                                        if (L.llIIIlIlIlIll(Widgets.get((int)lllIlIIlll[135]).isEmpty() ? 1 : 0)) {
                                            lllllllllllllllllIllIlllIlIlIIlI = new aG();
                                            ((aG)lllllllllllllllllIllIlllIlIlIIlI).gV();
                                            lllllllllllllllllIllIlllIlIlIIIl = ((aG)lllllllllllllllllIllIlllIlIlIIlI).gU();
                                            if (L.llIIIlIlIlIll(lllllllllllllllllIllIlllIlIlIIIl.isEmpty() ? 1 : 0)) {
                                                int lllllllllllllllllIllIlllIlIlIIII2 = lllIlIIlll[1];
                                                while (L.llIIIlIlIlIlI(lllllllllllllllllIllIlllIlIlIIII2, lllllllllllllllllIllIlllIlIlIIIl.size())) {
                                                    lllllllllllllllllIllIlllIlIlIIIl.get(lllllllllllllllllIllIlllIlIlIIII2).interact(lllIlIIllI[lllIlIIlll[138]]);
                                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                                    0;
                                                    ++lllllllllllllllllIllIlllIlIlIIII2;
                                                    0;
                                                    if (1 != 0) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[10])) {
                                        g.a(cE);
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[91])) {
                                        if (L.llIIIlIlIlIlI(Vars.getBit((int)lllIlIIlll[139]), lllIlIIlll[0])) {
                                            g.a(lllIlIIllI[lllIlIIlll[140]], cE);
                                        }
                                        if (L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[139]), lllIlIIlll[0]) && L.llIIIlIlIlIll(Vars.getBit((int)lllIlIIlll[141]))) {
                                            g.a(lllIlIIllI[lllIlIIlll[142]], cE);
                                        }
                                        if (L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[139]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[141]), lllIlIIlll[0]) && L.llIIIlIlIlIll(Vars.getBit((int)lllIlIIlll[143]))) {
                                            g.a(lllIlIIllI[lllIlIIlll[144]], cE);
                                        }
                                        if (L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[139]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[141]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[143]), lllIlIIlll[0]) && L.llIIIlIlIlIll(Vars.getBit((int)lllIlIIlll[145]))) {
                                            g.a(lllIlIIllI[lllIlIIlll[146]], cE);
                                        }
                                        if (L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[139]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[141]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[143]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[145]), lllIlIIlll[6]) && L.llIIIlIlIlIll(Vars.getBit((int)lllIlIIlll[147]))) {
                                            g.a(lllIlIIllI[lllIlIIlll[148]], cE);
                                        }
                                        if (L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[139]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[141]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[143]), lllIlIIlll[0]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[145]), lllIlIIlll[6]) && L.llIIIlIlIllIl(Vars.getBit((int)lllIlIIlll[147]), lllIlIIlll[0])) {
                                            g.a(lllIlIIllI[lllIlIIlll[149]], cE);
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[8])) {
                                        g.a(cE);
                                    }
                                    lllllllllllllllllIllIlllIlIlIIlI = new WorldPoint(lllIlIIlll[150], lllIlIIlll[151], lllIlIIlll[1]);
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[95])) {
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIlI), lllIlIIlll[4])) {
                                            int[] nArray = new int[lllIlIIlll[0]];
                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[69];
                                            Inventory.getFirst((int[])nArray).interact(lllIlIIllI[lllIlIIlll[152]]);
                                            Time.sleepTicks((int)lllIlIIlll[11]);
                                            0;
                                        }
                                        if (L.llIIIlIlIlIIl((lllllllllllllllllIllIlllIlIlIIIl = new WorldArea(lllIlIIlll[153], lllIlIIlll[154], lllIlIIlll[81], lllIlIIlll[77], lllIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            WorldArea lllllllllllllllllIllIlllIlIlIIII2 = new WorldArea(lllIlIIlll[155], lllIlIIlll[156], lllIlIIlll[13], lllIlIIlll[3], lllIlIIlll[1]);
                                            lllllllllllllllllIllIlllIlIIllll = new WorldPoint(lllIlIIlll[157], lllIlIIlll[158], lllIlIIlll[1]);
                                            while (L.llIIIlIlIlIll(lllllllllllllllllIllIlllIlIlIIII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[159]];
                                                Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIIllll);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                                if (!L.llIIIlIlIlIIl(AccBuilderSotf.d ? 1 : 0)) continue;
                                                0;
                                                if ((0xF1 ^ 0xAC ^ (0xF4 ^ 0xAD)) > 3) break;
                                                return;
                                            }
                                        }
                                        L.bq();
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[160]];
                                        if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                                            g.a(lllIlIIllI[lllIlIIlll[161]], cE);
                                        }
                                    }
                                    if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[7]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[5])) {
                                        g.a(lllIlIIllI[lllIlIIlll[162]], cE);
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[163]];
                                        if (L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray))) {
                                            if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[28]) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                                Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[164]]);
                                            }
                                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && L.llIIIlIllIIII(Prayers.getPoints())) {
                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                            }
                                            String[] stringArray13 = new String[lllIlIIlll[0]];
                                            stringArray13[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[165]];
                                            if (L.llIIIlIlIlIll(Equipment.contains((String[])stringArray13) ? 1 : 0)) {
                                                String[] stringArray14 = new String[lllIlIIlll[0]];
                                                stringArray14[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[166]];
                                                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                                                    String[] stringArray15 = new String[lllIlIIlll[0]];
                                                    stringArray15[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[167]];
                                                    Inventory.getFirst((String[])stringArray15).interact(lllIlIIllI[lllIlIIlll[168]]);
                                                }
                                            }
                                            if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[62]) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                                Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[169]]);
                                            }
                                            if (L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                                                String[] stringArray16 = new String[lllIlIIlll[0]];
                                                stringArray16[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[170]];
                                                NPCs.getNearest((String[])stringArray16).interact(lllIlIIllI[lllIlIIlll[171]]);
                                            }
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[101])) {
                                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gr), lllIlIIlll[9])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[172]];
                                            Movement.walkTo((WorldPoint)gr);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gr), lllIlIIlll[9])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[173]];
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[174]];
                                            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[175]]);
                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                            0;
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[103])) {
                                        if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gs), lllIlIIlll[9])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[176]];
                                            Movement.walkTo((WorldPoint)gs);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gs), lllIlIIlll[9])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[177]];
                                            g.a(lllIlIIllI[lllIlIIlll[178]], cE);
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                    }
                                    if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[105])) {
                                        if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gs), lllIlIIlll[4])) {
                                            int[] nArray = new int[lllIlIIlll[0]];
                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[69];
                                            Inventory.getFirst((int[])nArray).interact(lllIlIIllI[lllIlIIlll[179]]);
                                            Time.sleepTicks((int)lllIlIIlll[11]);
                                            0;
                                        }
                                        if (L.llIIIlIlIlIll(L.cG() ? 1 : 0)) {
                                            L.cK();
                                        }
                                        if (L.llIIIlIlIlIIl(L.cG() ? 1 : 0)) {
                                            L.cI();
                                            if (L.llIIIlIlIlIIl(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[180], lllIlIIlll[151], lllIlIIlll[1]);
                                                if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[181]];
                                                    Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                                    0;
                                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                                    0;
                                                }
                                                if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                                    g.a(lllIlIIllI[lllIlIIlll[182]], cE);
                                                }
                                            }
                                        }
                                    }
                                    if (!L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[108])) break block416;
                                    String[] stringArray = new String[lllIlIIlll[0]];
                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[183]];
                                    if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block417;
                                    String[] stringArray17 = new String[lllIlIIlll[0]];
                                    stringArray17[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[184]];
                                    if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray17) ? 1 : 0)) break block417;
                                    String[] stringArray18 = new String[lllIlIIlll[0]];
                                    stringArray18[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[185]];
                                    if (!L.llIIIlIlIlIll(Inventory.contains((String[])stringArray18) ? 1 : 0)) break block418;
                                }
                                lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[186], lllIlIIlll[154], lllIlIIlll[1]);
                                if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[9])) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[187]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                                if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[9])) {
                                    if (L.llIIIlIlIlIIl(Widgets.get((int)lllIlIIlll[188]).isEmpty() ? 1 : 0)) {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[189]];
                                        NPCs.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[190]]);
                                        Time.sleepTicks((int)lllIlIIlll[9]);
                                        0;
                                    }
                                    if (L.llIIIlIlIlIll(Widgets.get((int)lllIlIIlll[188]).isEmpty() ? 1 : 0)) {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[191]];
                                        if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                            Widgets.get((int)lllIlIIlll[188], (int)lllIlIIlll[32]).getChild(lllIlIIlll[9]).interact(lllIlIIllI[lllIlIIlll[192]]);
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        String[] stringArray19 = new String[lllIlIIlll[0]];
                                        stringArray19[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[193]];
                                        if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                                            Widgets.get((int)lllIlIIlll[188], (int)lllIlIIlll[32]).getChild(lllIlIIlll[11]).interact(lllIlIIllI[lllIlIIlll[194]]);
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        String[] stringArray20 = new String[lllIlIIlll[0]];
                                        stringArray20[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[195]];
                                        if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                            Widgets.get((int)lllIlIIlll[188], (int)lllIlIIlll[32]).getChild(lllIlIIlll[13]).interact(lllIlIIllI[lllIlIIlll[196]]);
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                    }
                                }
                            }
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[197]];
                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                String[] stringArray21 = new String[lllIlIIlll[0]];
                                stringArray21[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[198]];
                                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                    String[] stringArray22 = new String[lllIlIIlll[0]];
                                    stringArray22[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[199]];
                                    if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                        if (L.llIIIlIlIlIll(v.dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(v.dn), lllIlIIlll[11])) {
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[200]];
                                                Movement.walkTo((WorldPoint)v.dn);
                                                0;
                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                0;
                                            }
                                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(v.dn), lllIlIIlll[11])) {
                                                String[] stringArray23 = new String[lllIlIIlll[0]];
                                                stringArray23[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[201]];
                                                String[] stringArray24 = new String[lllIlIIlll[0]];
                                                stringArray24[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[202]];
                                                if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray23).hasAction(stringArray24) ? 1 : 0)) {
                                                    String[] stringArray25 = new String[lllIlIIlll[0]];
                                                    stringArray25[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[203]];
                                                    TileObjects.getNearest((String[])stringArray25).interact(lllIlIIllI[lllIlIIlll[204]]);
                                                    Time.sleepTicks((int)lllIlIIlll[9]);
                                                    0;
                                                }
                                                String[] stringArray26 = new String[lllIlIIlll[0]];
                                                stringArray26[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[205]];
                                                String[] stringArray27 = new String[lllIlIIlll[0]];
                                                stringArray27[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[206]];
                                                if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray26).hasAction(stringArray27) ? 1 : 0)) {
                                                    String[] stringArray28 = new String[lllIlIIlll[0]];
                                                    stringArray28[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[207]];
                                                    TileObjects.getNearest((String[])stringArray28).interact(lllIlIIllI[lllIlIIlll[208]]);
                                                    Time.sleepTicks((int)lllIlIIlll[9]);
                                                    0;
                                                }
                                            }
                                        }
                                        if (L.llIIIlIlIlIIl(v.dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lllIlIIllI[lllIlIIlll[209]], cE);
                                        }
                                    }
                                }
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[110])) {
                            g.a(lllIlIIllI[lllIlIIlll[210]], cE);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[114])) {
                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(y.dO), lllIlIIlll[18]) && L.llIIIlIlIlIll(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[211]];
                                if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)y.dO);
                                0;
                                Time.sleepTicks((int)lllIlIIlll[0]);
                                0;
                            }
                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(y.dO), lllIlIIlll[18])) {
                                if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIlIIlll[0]];
                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[212]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[213]]);
                                    Time.sleepTicks((int)lllIlIIlll[3]);
                                    0;
                                }
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[214]];
                                g.a(stringArray);
                            }
                            if (L.llIIIlIlIlIIl(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[180], lllIlIIlll[151], lllIlIIlll[1]);
                                if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[215]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                                if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                    g.a(lllIlIIllI[lllIlIIlll[216]], cE);
                                }
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[116])) {
                            int[] nArray = new int[lllIlIIlll[0]];
                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[217];
                            if (L.llIIIlIlIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray57 = new int[lllIlIIlll[0]];
                                nArray57[L.lllIlIIlll[1]] = lllIlIIlll[217];
                                Inventory.getFirst((int[])nArray57).interact(lllIlIIllI[lllIlIIlll[218]]);
                            }
                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[15])) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[219]];
                                Movement.walkTo((WorldPoint)de);
                                0;
                                Time.sleepTicks((int)lllIlIIlll[0]);
                                0;
                            }
                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlll[15])) {
                                g.a(lllIlIIllI[lllIlIIlll[220]], cE);
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[118])) {
                            g.a(lllIlIIllI[lllIlIIlll[221]], cE);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[120])) {
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[14]];
                            if (L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray))) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[222]];
                                if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                                }
                                if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                }
                                if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                }
                                if (L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.STRENGTH) + lllIlIIlll[21], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aY).interact(lllIlIIllI[lllIlIIlll[223]]);
                                }
                                if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[65])) {
                                    Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[224]]);
                                }
                                if (L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 63.0))) {
                                    String[] stringArray29 = new String[lllIlIIlll[0]];
                                    stringArray29[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[225]];
                                    if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                        String[] stringArray30 = new String[lllIlIIlll[0]];
                                        stringArray30[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[226]];
                                        Inventory.getFirst((String[])stringArray30).interact(lllIlIIllI[lllIlIIlll[227]]);
                                    }
                                }
                                if (L.llIIIlIlIlIIl(e.s() ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(lllIlIIllI[lllIlIIlll[845]])).interact(lllIlIIllI[lllIlIIlll[228]]);
                                }
                                if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIlIIIl = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (L.llIIIlIlIlIIl(tileObject.getName().equalsIgnoreCase(lllIlIIllI[lllIlIIlll[843]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[844]];
                                        if (L.llIIIlIlIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lllIlIIlll[0];
                                            0;
                                            if (3 > 1) return n2 != 0;
                                            return ((0x40 ^ 7) & ~(0xF9 ^ 0xBE)) != 0;
                                        }
                                    }
                                    n2 = lllIlIIlll[1];
                                    return n2 != 0;
                                }))) {
                                    lllllllllllllllllIllIlllIlIlIIIl.interact(lllIlIIllI[lllIlIIlll[229]]);
                                    Time.sleepTicks((int)lllIlIIlll[9]);
                                    0;
                                }
                                if (L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                                    String[] stringArray31 = new String[lllIlIIlll[0]];
                                    stringArray31[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[230]];
                                    NPCs.getNearest((String[])stringArray31).interact(lllIlIIllI[lllIlIIlll[231]]);
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                            }
                            String[] stringArray32 = new String[lllIlIIlll[0]];
                            stringArray32[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[232]];
                            if (L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray32))) {
                                g.a(lllIlIIllI[lllIlIIlll[233]], cE);
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[123]) && L.llIIIlIlIlIll((lllllllllllllllllIllIlllIlIlIIIl = new WorldArea(lllIlIIlll[234], lllIlIIlll[235], lllIlIIlll[88], lllIlIIlll[70], lllIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            g.a(lllIlIIllI[lllIlIIlll[2]], cE);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[125])) {
                            while (L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 100.0))) {
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[236]];
                                if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break;
                                String[] stringArray33 = new String[lllIlIIlll[0]];
                                stringArray33[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[237]];
                                Inventory.getFirst((String[])stringArray33).interact(lllIlIIllI[lllIlIIlll[238]]);
                                Time.sleepTicks((int)lllIlIIlll[6]);
                                0;
                                0;
                                if ((131 + 49 - 89 + 90 ^ 146 + 112 - 109 + 28) != 3) continue;
                                return;
                            }
                            while (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[83]) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[239]]);
                                Time.sleepTicks((int)lllIlIIlll[6]);
                                0;
                                0;
                                if (null == null) continue;
                                return;
                            }
                            if (L.llIIIlIlIlIll(L.cF() ? 1 : 0)) {
                                L.cK();
                            }
                            if (L.llIIIlIlIlIIl(L.cF() ? 1 : 0)) {
                                L.cI();
                                if (L.llIIIlIlIlIIl(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[180], lllIlIIlll[151], lllIlIIlll[1]);
                                    if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[240]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                        g.a(lllIlIIllI[lllIlIIlll[241]], cE);
                                    }
                                }
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[127])) {
                            if (L.llIIIlIlIlIIl(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[242], lllIlIIlll[243], lllIlIIlll[1]);
                                if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[244]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                                if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                    if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[245]];
                                        TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[246]]);
                                        Time.sleepTicks((int)lllIlIIlll[3]);
                                        0;
                                    }
                                    String[] stringArray = new String[lllIlIIlll[0]];
                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[247]];
                                    g.a(stringArray);
                                }
                            }
                            if (L.llIIIlIlIlIll(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                y.br();
                            }
                            if (L.llIIIlIlIlIIl(y.dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIlIIlll[0]];
                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[248]];
                                    NPCs.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[249]]);
                                }
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[250]];
                                g.a(stringArray);
                            }
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[251]];
                            if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                                int[] nArray = new int[lllIlIIlll[0]];
                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[252];
                                if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray58 = new int[lllIlIIlll[0]];
                                    nArray58[L.lllIlIIlll[1]] = lllIlIIlll[252];
                                    Inventory.getFirst((int[])nArray58).interact(lllIlIIllI[lllIlIIlll[253]]);
                                }
                                int[] nArray59 = new int[lllIlIIlll[0]];
                                nArray59[L.lllIlIIlll[1]] = lllIlIIlll[254];
                                if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray59) ? 1 : 0)) {
                                    int[] nArray60 = new int[lllIlIIlll[0]];
                                    nArray60[L.lllIlIIlll[1]] = lllIlIIlll[254];
                                    Inventory.getFirst((int[])nArray60).interact(lllIlIIllI[lllIlIIlll[255]]);
                                }
                                int[] nArray61 = new int[lllIlIIlll[0]];
                                nArray61[L.lllIlIIlll[1]] = lllIlIIlll[256];
                                if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray61) ? 1 : 0)) {
                                    int[] nArray62 = new int[lllIlIIlll[0]];
                                    nArray62[L.lllIlIIlll[1]] = lllIlIIlll[256];
                                    Inventory.getFirst((int[])nArray62).interact(lllIlIIllI[lllIlIIlll[257]]);
                                }
                                g.a(lllIlIIllI[lllIlIIlll[258]], cE);
                            }
                            if (L.llIIIlIlIlIIl((lllllllllllllllllIllIlllIlIlIIIl = new WorldArea(lllIlIIlll[259], lllIlIIlll[260], lllIlIIlll[31], lllIlIIlll[21], lllIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[261]];
                                String[] stringArray34 = new String[lllIlIIlll[0]];
                                stringArray34[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[262]];
                                TileObjects.getNearest((String[])stringArray34).interact(lllIlIIllI[lllIlIIlll[263]]);
                                Time.sleepTicks((int)lllIlIIlll[9]);
                                0;
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[131]) && L.llIIIlIlIlIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gt), lllIlIIlll[13])) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[264]];
                                Movement.walkTo((WorldPoint)gt);
                                0;
                                Time.sleepTicks((int)lllIlIIlll[0]);
                                0;
                            }
                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gt), lllIlIIlll[13])) {
                                g.a(lllIlIIllI[lllIlIIlll[265]], cE);
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[133]) && L.llIIIlIlIlIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[266], lllIlIIlll[267], lllIlIIlll[1]);
                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[11])) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[268]];
                                Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                0;
                                Time.sleepTicks((int)lllIlIIlll[0]);
                                0;
                            }
                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[11])) {
                                g.a(lllIlIIllI[lllIlIIlll[269]], cE);
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[136])) {
                            lllllllllllllllllIllIlllIlIlIIIl = new WorldArea(lllIlIIlll[270], lllIlIIlll[271], lllIlIIlll[9], lllIlIIlll[9], lllIlIIlll[1]);
                            if (L.llIIIlIlIlIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint lllllllllllllllllIllIlllIlIlIIII2 = new WorldPoint(lllIlIIlll[259], lllIlIIlll[272], lllIlIIlll[1]);
                                if (L.llIIIlIlIlIll(lllllllllllllllllIllIlllIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[273]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIII2);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                                if (L.llIIIlIlIlIIl(lllllllllllllllllIllIlllIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    g.a(lllIlIIllI[lllIlIIlll[274]], cE);
                                }
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[138])) {
                            g.a(cE);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[142]) && L.llIIIlIlIlIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gt), lllIlIIlll[13])) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[275]];
                                Movement.walkTo((WorldPoint)gt);
                                0;
                                Time.sleepTicks((int)lllIlIIlll[0]);
                                0;
                            }
                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(gt), lllIlIIlll[13])) {
                                g.a(lllIlIIllI[lllIlIIlll[276]], cE);
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[146]) && L.llIIIlIlIlIll((lllllllllllllllllIllIlllIlIlIIIl = new WorldArea(lllIlIIlll[277], lllIlIIlll[278], lllIlIIlll[59], lllIlIIlll[31], lllIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[279]];
                            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[280]]);
                            Time.sleepTicks((int)lllIlIIlll[3]);
                            0;
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[149])) {
                            int[] nArray = new int[lllIlIIlll[0]];
                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[281];
                            TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[282]]);
                            Time.sleepTicks((int)lllIlIIlll[6]);
                            0;
                        }
                        if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[161]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[163])) {
                            lllllllllllllllllIllIlllIlIlIIIl = new aK();
                            if (L.llIIIlIlIlIll(gz ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[283]];
                                if (L.llIIIlIlIlIIl(Widgets.get((int)lllIlIIlll[284]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIlIIlll[0]];
                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[285]];
                                    Inventory.getFirst((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[286]]);
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                                if (L.llIIIlIlIlIll(Widgets.get((int)lllIlIIlll[284]).isEmpty() ? 1 : 0)) {
                                    ((aK)lllllllllllllllllIllIlllIlIlIIIl).gV();
                                    gx = ((aK)lllllllllllllllllIllIlllIlIlIIIl).ha();
                                    gy = ((aK)lllllllllllllllllIllIlllIlIlIIIl).hb();
                                    gz = lllIlIIlll[0];
                                }
                            }
                            if (L.llIIIlIlIlIIl(gz ? 1 : 0)) {
                                int[] nArray = new int[lllIlIIlll[0]];
                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[287];
                                TileObject lllllllllllllllllIllIlllIlIlIIII2 = TileObjects.getNearest((int[])nArray);
                                int[] nArray63 = new int[lllIlIIlll[0]];
                                nArray63[L.lllIlIIlll[1]] = lllIlIIlll[288];
                                lllllllllllllllllIllIlllIlIIllll = TileObjects.getNearest((int[])nArray63);
                                if (L.llIIIlIlIlIll(gA ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[289]];
                                    if (L.llIIIlIlIlIIl(Widgets.get((int)lllIlIIlll[246]).isEmpty() ? 1 : 0) && L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIlIIII2)) {
                                        lllllllllllllllllIllIlllIlIlIIII2.interact(lllIlIIllI[lllIlIIlll[290]]);
                                        Time.sleepTicks((int)lllIlIIlll[6]);
                                        0;
                                    }
                                    if (L.llIIIlIlIlIll(Widgets.get((int)lllIlIIlll[246]).isEmpty() ? 1 : 0)) {
                                        Time.sleepTicks((int)lllIlIIlll[3]);
                                        0;
                                        if (L.llIIIlIlIlIll(gy)) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[1]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[1]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gy, lllIlIIlll[0])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[0]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[0]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gy, lllIlIIlll[6])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[6]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[6]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gy, lllIlIIlll[3])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[3]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[3]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gy, lllIlIIlll[9])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[9]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[9]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gy, lllIlIIlll[11])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[11]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[11]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIIlllI = Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]))) {
                                            gA = L.a(lllllllllllllllllIllIlllIlIIlllI, gy);
                                        }
                                        gA = lllIlIIlll[0];
                                        Time.sleepTicks((int)lllIlIIlll[11]);
                                        0;
                                    }
                                }
                                if (L.llIIIlIlIlIIl(gA ? 1 : 0) && L.llIIIlIlIlIll(gB ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[291]];
                                    if (L.llIIIlIlIlIIl(Widgets.get((int)lllIlIIlll[246]).isEmpty() ? 1 : 0) && L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIIllll)) {
                                        lllllllllllllllllIllIlllIlIIllll.interact(lllIlIIllI[lllIlIIlll[292]]);
                                        Time.sleepTicks((int)lllIlIIlll[6]);
                                        0;
                                    }
                                    if (L.llIIIlIlIlIll(Widgets.get((int)lllIlIIlll[246]).isEmpty() ? 1 : 0)) {
                                        Time.sleepTicks((int)lllIlIIlll[3]);
                                        0;
                                        if (L.llIIIlIlIlIll(gx)) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[1]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[1]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gx, lllIlIIlll[0])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[0]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[0]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gx, lllIlIIlll[6])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[6]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[6]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gx, lllIlIIlll[3])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[3]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[3]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gx, lllIlIIlll[9])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[9]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[9]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllIl(gx, lllIlIIlll[11])) {
                                            Mouse.click((int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[11]).getClickPoint().getX(), (int)Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]).getChild(lllIlIIlll[11]).getClickPoint().getY(), (boolean)lllIlIIlll[0]);
                                        }
                                        if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIIlllI = Widgets.get((int)lllIlIIlll[246], (int)lllIlIIlll[3]))) {
                                            gB = L.a(lllllllllllllllllIllIlllIlIIlllI, gx);
                                        }
                                        gB = lllIlIIlll[0];
                                        Time.sleepTicks((int)lllIlIIlll[11]);
                                        0;
                                    }
                                }
                                if (L.llIIIlIlIlIIl(gB ? 1 : 0) && L.llIIIlIlIlIIl(gA ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[293]];
                                    int[] nArray64 = new int[lllIlIIlll[0]];
                                    nArray64[L.lllIlIIlll[1]] = lllIlIIlll[294];
                                    if (L.llIIIlIlIlIlI(Inventory.getAll((int[])nArray64).size(), lllIlIIlll[16]) && L.llIIIlIlIlIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[295]];
                                        TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[296]]);
                                        Time.sleepTicks((int)lllIlIIlll[6]);
                                        0;
                                    }
                                }
                            }
                            System.out.println("north: " + gx);
                            System.out.println("south: " + gy);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[165])) {
                            int[] nArray = new int[lllIlIIlll[0]];
                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[294];
                            if (L.llIIIlIlIlIlI(Inventory.getAll((int[])nArray).size(), lllIlIIlll[16]) && L.llIIIlIlIlIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[297]];
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[298]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[299]]);
                                Time.sleepTicks((int)lllIlIIlll[6]);
                                0;
                            }
                            int[] nArray65 = new int[lllIlIIlll[0]];
                            nArray65[L.lllIlIIlll[1]] = lllIlIIlll[294];
                            if (L.llIIIlIlIllII(Inventory.getAll((int[])nArray65).size(), lllIlIIlll[16])) {
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[300]];
                                if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                                    if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    int[] nArray66 = new int[lllIlIIlll[0]];
                                    nArray66[L.lllIlIIlll[1]] = lllIlIIlll[301];
                                    Inventory.getFirst((int[])nArray66).interact(lllIlIIllI[lllIlIIlll[302]]);
                                    Time.sleepTicks((int)lllIlIIlll[9]);
                                    0;
                                }
                                if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(y.dO), lllIlIIlll[18]) && L.llIIIlIlIlIll(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[303]];
                                    if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)y.dO);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlll[0]);
                                    0;
                                }
                                if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(y.dO), lllIlIIlll[18])) {
                                    if (L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray35 = new String[lllIlIIlll[0]];
                                        stringArray35[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[304]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lllIlIIllI[lllIlIIlll[305]]);
                                        Time.sleepTicks((int)lllIlIIlll[3]);
                                        0;
                                    }
                                    String[] stringArray36 = new String[lllIlIIlll[0]];
                                    stringArray36[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[306]];
                                    g.a(stringArray36);
                                }
                                if (L.llIIIlIlIlIIl(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[180], lllIlIIlll[151], lllIlIIlll[1]);
                                    if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[307]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[13])) {
                                        g.a(lllIlIIllI[lllIlIIlll[308]], cE);
                                    }
                                }
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[167])) {
                            if (L.llIIIlIlIlIll(L.cE() ? 1 : 0)) {
                                int[] nArray = new int[lllIlIIlll[0]];
                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[217];
                                if (L.llIIIlIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray67 = new int[lllIlIIlll[0]];
                                    nArray67[L.lllIlIIlll[1]] = lllIlIIlll[217];
                                    Equipment.getFirst((int[])nArray67).interact(lllIlIIllI[lllIlIIlll[309]]);
                                }
                                L.cK();
                            }
                            if (L.llIIIlIlIlIIl(L.cE() ? 1 : 0)) {
                                if (L.llIIIlIlIlIll(v.dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(v.dn), lllIlIIlll[11])) {
                                        if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[310]];
                                        Movement.walkTo((WorldPoint)v.dn);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(v.dn), lllIlIIlll[11])) {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[311]];
                                        String[] stringArray37 = new String[lllIlIIlll[0]];
                                        stringArray37[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[312]];
                                        if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray37) ? 1 : 0)) {
                                            String[] stringArray38 = new String[lllIlIIlll[0]];
                                            stringArray38[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[313]];
                                            TileObjects.getNearest((String[])stringArray38).interact(lllIlIIllI[lllIlIIlll[314]]);
                                            Time.sleepTicks((int)lllIlIIlll[9]);
                                            0;
                                        }
                                        String[] stringArray39 = new String[lllIlIIlll[0]];
                                        stringArray39[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[315]];
                                        String[] stringArray40 = new String[lllIlIIlll[0]];
                                        stringArray40[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[316]];
                                        if (L.llIIIlIlIlIIl(TileObjects.getNearest((String[])stringArray39).hasAction(stringArray40) ? 1 : 0)) {
                                            String[] stringArray41 = new String[lllIlIIlll[0]];
                                            stringArray41[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[317]];
                                            TileObjects.getNearest((String[])stringArray41).interact(lllIlIIllI[lllIlIIlll[318]]);
                                            Time.sleepTicks((int)lllIlIIlll[9]);
                                            0;
                                        }
                                    }
                                }
                                if (L.llIIIlIlIlIIl(v.dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    g.a(lllIlIIllI[lllIlIIlll[319]], cE);
                                }
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[169])) {
                            g.a(cE);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[171])) {
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[320]];
                            if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                String[] stringArray42 = new String[lllIlIIlll[0]];
                                stringArray42[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[321]];
                                if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray42) ? 1 : 0)) {
                                    String[] stringArray43 = new String[lllIlIIlll[0]];
                                    stringArray43[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[322]];
                                    if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                                        String[] stringArray44 = new String[lllIlIIlll[0]];
                                        stringArray44[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[323]];
                                        if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                            int[] nArray = new int[lllIlIIlll[0]];
                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[324];
                                            TileObjects.getNearest((int[])nArray).interact(lllIlIIllI[lllIlIIlll[325]]);
                                        }
                                    }
                                }
                            }
                            String[] stringArray45 = new String[lllIlIIlll[0]];
                            stringArray45[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[326]];
                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray45) ? 1 : 0)) {
                                String[] stringArray46 = new String[lllIlIIlll[0]];
                                stringArray46[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[327]];
                                String[] stringArray47 = new String[lllIlIIlll[0]];
                                stringArray47[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[328]];
                                Inventory.getFirst((String[])stringArray46).useOn(Inventory.getFirst((String[])stringArray47));
                            }
                            String[] stringArray48 = new String[lllIlIIlll[0]];
                            stringArray48[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[329]];
                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                String[] stringArray49 = new String[lllIlIIlll[0]];
                                stringArray49[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[330]];
                                Magic.cast((Spell)SpellBook.Standard.LVL_3_ENCHANT, (Item)Inventory.getFirst((String[])stringArray49));
                            }
                            String[] stringArray50 = new String[lllIlIIlll[0]];
                            stringArray50[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[331]];
                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray50) ? 1 : 0)) {
                                int[] nArray = new int[lllIlIIlll[0]];
                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[294];
                                String[] stringArray51 = new String[lllIlIIlll[0]];
                                stringArray51[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[332]];
                                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray51));
                            }
                            String[] stringArray52 = new String[lllIlIIlll[0]];
                            stringArray52[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[333]];
                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray52) ? 1 : 0)) {
                                int[] nArray = new int[lllIlIIlll[0]];
                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[217];
                                String[] stringArray53 = new String[lllIlIIlll[0]];
                                stringArray53[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[334]];
                                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray53));
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[173])) {
                            if (L.llIIIlIlIlIll(L.cD() ? 1 : 0)) {
                                L.cK();
                            }
                            if (L.llIIIlIlIlIIl(L.cD() ? 1 : 0)) {
                                L.cI();
                            }
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[175])) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[335]];
                            lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[336], lllIlIIlll[337], lllIlIIlll[1]);
                            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[15])) {
                                Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                                0;
                                Time.sleepTicks((int)lllIlIIlll[0]);
                                0;
                            }
                            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[15])) {
                                g.a(lllIlIIllI[lllIlIIlll[338]], cE);
                            }
                        }
                        if (!L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[177]) || !L.llIIIlIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[179]) || L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[182])) {
                            g.a(cE);
                        }
                        if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[184])) {
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[339]];
                            if (L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray)) && L.llIIIlIllIlII(gn)) {
                                if (L.llIIIlIlIlIIl(L.cD() ? 1 : 0)) {
                                    if (L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 100.0))) {
                                        String[] stringArray54 = new String[lllIlIIlll[0]];
                                        stringArray54[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[340]];
                                        if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray54) ? 1 : 0)) {
                                            String[] stringArray55 = new String[lllIlIIlll[0]];
                                            stringArray55[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[341]];
                                            Inventory.getFirst((String[])stringArray55).interact(lllIlIIllI[lllIlIIlll[342]]);
                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                            0;
                                        }
                                    }
                                    if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[83]) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[343]]);
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    L.cI();
                                }
                                if (L.llIIIlIlIlIll(L.cD() ? 1 : 0)) {
                                    gm = lllIlIIlll[1];
                                    if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                                    }
                                    if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                    }
                                    if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                    }
                                    if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.MYSTIC_MIGHT) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.MYSTIC_MIGHT);
                                    }
                                    L.cK();
                                }
                            }
                        }
                        String[] stringArray = new String[lllIlIIlll[0]];
                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[344]];
                        if (!L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray))) break block419;
                        String[] stringArray56 = new String[lllIlIIlll[0]];
                        stringArray56[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[345]];
                        String[] stringArray57 = new String[lllIlIIlll[0]];
                        stringArray57[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[346]];
                        if (!L.llIIIlIlIlIIl(NPCs.getNearest((String[])stringArray56).hasAction(stringArray57) ? 1 : 0)) break block419;
                        e.E();
                        if (L.llIIIlIllIlII(gn)) {
                            String[] stringArray58 = new String[lllIlIIlll[0]];
                            stringArray58[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[347]];
                            gn = NPCs.getNearest((String[])stringArray58).getWorldLocation();
                        }
                        if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        if ((L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[11]) && !L.llIIIlIlIlIIl(Inventory.contains((int[])f.be) ? 1 : 0) || L.llIIIlIlIlIll(Inventory.contains((int[])f.bd) ? 1 : 0) && L.llIIIlIllIIll(L.llIIIlIlIlIII(e.w(), 55.0))) && L.llIIIlIlIlIll(gu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[348]];
                            int[] nArray = new int[lllIlIIlll[0]];
                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[69];
                            Inventory.getFirst((int[])nArray).interact(lllIlIIllI[lllIlIIlll[349]]);
                            Time.sleepTicks((int)lllIlIIlll[11]);
                            0;
                            gn = null;
                        }
                        int[] nArray = new int[lllIlIIlll[0]];
                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[350];
                        if (L.llIIIlIlIllll(NPCs.getNearest((int[])nArray))) {
                            if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                            }
                            if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                            }
                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.MYSTIC_MIGHT) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.MYSTIC_MIGHT);
                            }
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[351]];
                            int[] nArray68 = new int[lllIlIIlll[0]];
                            nArray68[L.lllIlIIlll[1]] = lllIlIIlll[352];
                            if (L.llIIIlIlIlIll(Equipment.contains((int[])nArray68) ? 1 : 0)) {
                                int[] nArray69 = new int[lllIlIIlll[0]];
                                nArray69[L.lllIlIIlll[1]] = lllIlIIlll[352];
                                Inventory.getFirst((int[])nArray69).interact(lllIlIIllI[lllIlIIlll[353]]);
                            }
                            int[] nArray70 = new int[lllIlIIlll[0]];
                            nArray70[L.lllIlIIlll[1]] = lllIlIIlll[352];
                            if (L.llIIIlIlIlIIl(Equipment.contains((int[])nArray70) ? 1 : 0)) {
                                int[] nArray71 = new int[lllIlIIlll[0]];
                                nArray71[L.lllIlIIlll[1]] = lllIlIIlll[350];
                                NPCs.getNearest((int[])nArray71).interact(lllIlIIllI[lllIlIIlll[354]]);
                            }
                        }
                        if ((!L.llIIIlIllIIIl(Skills.getLevel((Skill)Skill.STRENGTH) - lllIlIIlll[3], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) || L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.ATTACK) - lllIlIIlll[3], Skills.getBoostedLevel((Skill)Skill.ATTACK))) && L.llIIIlIlIllII(Prayers.getPoints(), lllIlIIlll[65])) {
                            int[] nArray72 = new int[lllIlIIlll[0]];
                            nArray72[L.lllIlIIlll[1]] = lllIlIIlll[350];
                            if (L.llIIIlIllIlII(NPCs.getNearest((int[])nArray72)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aY).interact(lllIlIIllI[lllIlIIlll[355]]);
                            }
                        }
                        L.cC();
                        String[] stringArray59 = new String[lllIlIIlll[0]];
                        stringArray59[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[356]];
                        lllllllllllllllllIllIlllIlIlIIIl = NPCs.getNearest((String[])stringArray59).getWorldLocation();
                        lllllllllllllllllIllIlllIlIlIIII2 = new WorldPoint(lllllllllllllllllIllIlllIlIlIIIl.getX() + lllIlIIlll[0], lllllllllllllllllIllIlllIlIlIIIl.getY() + lllIlIIlll[0], lllIlIIlll[1]);
                        lllllllllllllllllIllIlllIlIIllll = new WorldPoint(lllllllllllllllllIllIlllIlIlIIIl.getX() + lllIlIIlll[6], lllllllllllllllllIllIlllIlIlIIIl.getY(), lllIlIIlll[1]);
                        lllllllllllllllllIllIlllIlIIlllI = new WorldPoint(lllllllllllllllllIllIlllIlIlIIIl.getX(), lllllllllllllllllIllIlllIlIlIIIl.getY() + lllIlIIlll[6], lllIlIIlll[1]);
                        int[] nArray73 = new int[lllIlIIlll[0]];
                        nArray73[L.lllIlIIlll[1]] = lllIlIIlll[350];
                        if (!L.llIIIlIlIllll(NPCs.getNearest((int[])nArray73))) break block420;
                        int[] nArray74 = new int[lllIlIIlll[0]];
                        nArray74[L.lllIlIIlll[1]] = lllIlIIlll[350];
                        if (!L.llIIIlIlIllll(NPCs.getNearest((int[])nArray74))) break block421;
                        int[] nArray75 = new int[lllIlIIlll[0]];
                        nArray75[L.lllIlIIlll[1]] = lllIlIIlll[350];
                        if (!L.llIIIlIlIlIIl(NPCs.getNearest((int[])nArray75).isDead() ? 1 : 0)) break block421;
                    }
                    if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIlIIIl)) {
                        int[] nArray = new int[lllIlIIlll[0]];
                        nArray[L.lllIlIIlll[1]] = lllIlIIlll[357];
                        if (L.llIIIlIllIlII(TileObjects.getNearest((int[])nArray))) {
                            gL = lllIlIIlll[1];
                            gM = lllIlIIlll[1];
                            int[] nArray76 = new int[lllIlIIlll[0]];
                            nArray76[L.lllIlIIlll[1]] = lllIlIIlll[358];
                            if (L.llIIIlIlIlIll(Equipment.contains((int[])nArray76) ? 1 : 0)) {
                                int[] nArray77 = new int[lllIlIIlll[0]];
                                nArray77[L.lllIlIIlll[1]] = lllIlIIlll[358];
                                Inventory.getFirst((int[])nArray77).interact(lllIlIIllI[lllIlIIlll[359]]);
                            }
                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                            }
                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                            }
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[360]];
                            lllllllllllllllllIllIlllIlIIllIl = NPCs.getNearest((String[])stringArray);
                            if (L.llIIIlIlIlIll(gm ? 1 : 0)) {
                                lllllllllllllllllIllIlllIlIIllII = new WorldPoint(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getX() + lllIlIIlll[0], lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getY(), lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getPlane());
                                lllllllllllllllllIllIlllIlIIlIll = new WorldPoint(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getX(), lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getY() + lllIlIIlll[0], lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getPlane());
                                if (L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIIllII) ? 1 : 0) && L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIIlIll) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[361]];
                                    String lllllllllllllllllIllIlllIlIIlIlI = lllllllllllllllllIllIlllIlIIllIl.getOverheadText();
                                    if (L.llIIIlIllIlII(lllllllllllllllllIllIlllIlIIlIlI)) {
                                        String[] stringArray60 = new String[lllIlIIlll[0]];
                                        stringArray60[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[362]];
                                        NPCs.getNearest((String[])stringArray60).interact(lllIlIIllI[lllIlIIlll[363]]);
                                    }
                                    if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIIlIlI) && L.llIIIlIlIlIll(lllllllllllllllllIllIlllIlIIlIlI.contains(lllIlIIllI[lllIlIIlll[364]]) ? 1 : 0)) {
                                        String[] stringArray61 = new String[lllIlIIlll[0]];
                                        stringArray61[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[365]];
                                        NPCs.getNearest((String[])stringArray61).interact(lllIlIIllI[lllIlIIlll[366]]);
                                    }
                                    if (L.llIIIlIlIllll(lllllllllllllllllIllIlllIlIIlIlI) && L.llIIIlIlIlIIl(lllllllllllllllllIllIlllIlIIlIlI.contains(lllIlIIllI[lllIlIIlll[367]]) ? 1 : 0)) {
                                        System.out.println(lllIlIIllI[lllIlIIlll[368]]);
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[369]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIIlllI);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    Time.sleepUntil(() -> {
                                        int n2;
                                        block3: {
                                            block2: {
                                                if (!L.llIIIlIllIIlI(Players.getLocal().getAnimation(), lllIlIIlll[371])) break block2;
                                                int[] nArray = new int[lllIlIIlll[0]];
                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[350];
                                                if (!L.llIIIlIllIlII(NPCs.getNearest((int[])nArray))) break block2;
                                                int[] nArray2 = new int[lllIlIIlll[0]];
                                                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[357];
                                                if (!L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray2))) break block3;
                                            }
                                            n2 = lllIlIIlll[0];
                                            0;
                                            if (-1 <= 0) return n2 != 0;
                                            return ((4 ^ 0x5C) & ~(0xCE ^ 0x96)) != 0;
                                        }
                                        n2 = lllIlIIlll[1];
                                        return n2 != 0;
                                    }, (int)lllIlIIlll[370]);
                                    0;
                                    if (L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[371])) {
                                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                        }
                                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                        }
                                        if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.MYSTIC_MIGHT) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.MYSTIC_MIGHT);
                                        }
                                        L.cC();
                                        if (L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIIlllI) ? 1 : 0) && L.llIIIlIlIlIIl(Reachable.isWalkable((WorldPoint)lllllllllllllllllIllIlllIlIIlllI) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIllll) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIlIIII2) ? 1 : 0) && L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation()), lllIlIIlll[0])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[372]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIIlllI);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        if (L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIlIIII2) ? 1 : 0) && L.llIIIlIlIlIIl(Reachable.isWalkable((WorldPoint)lllllllllllllllllIllIlllIlIlIIII2) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIllll) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIlllI) ? 1 : 0) && L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation()), lllIlIIlll[0])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[373]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIII2);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        if (L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIIllll) ? 1 : 0) && L.llIIIlIlIlIIl(Reachable.isWalkable((WorldPoint)lllllllllllllllllIllIlllIlIIllll) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIlIIII2) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIlllI) ? 1 : 0) && L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation()), lllIlIIlll[0])) {
                                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[374]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIIllll);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                            0;
                                        }
                                        Time.sleepUntil(() -> {
                                            int n2;
                                            block3: {
                                                block2: {
                                                    if (!L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block2;
                                                    int[] nArray = new int[lllIlIIlll[0]];
                                                    nArray[L.lllIlIIlll[1]] = lllIlIIlll[350];
                                                    if (!L.llIIIlIllIlII(NPCs.getNearest((int[])nArray))) break block2;
                                                    int[] nArray2 = new int[lllIlIIlll[0]];
                                                    nArray2[L.lllIlIIlll[1]] = lllIlIIlll[357];
                                                    if (!L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray2))) break block3;
                                                }
                                                n2 = lllIlIIlll[0];
                                                0;
                                                if (((0x94 ^ 0x9E) & ~(0x18 ^ 0x12)) == 0) return n2 != 0;
                                                return ((0x16 ^ 0x12) & ~(0x23 ^ 0x27)) != 0;
                                            }
                                            n2 = lllIlIIlll[1];
                                            return n2 != 0;
                                        }, (int)lllIlIIlll[375]);
                                        0;
                                    }
                                }
                            }
                            if (L.llIIIlIlIlIIl(gm ? 1 : 0)) {
                                lllllllllllllllllIllIlllIlIIllII = new WorldPoint(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getX() + lllIlIIlll[0], lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getY(), lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getPlane());
                                lllllllllllllllllIllIlllIlIIlIll = new WorldPoint(lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getX(), lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getY() + lllIlIIlll[0], lllllllllllllllllIllIlllIlIIllIl.getWorldLocation().getPlane());
                                if (L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIIllII) ? 1 : 0) && L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIllIlllIlIIlIll) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[376]];
                                    if (L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                                        String[] stringArray62 = new String[lllIlIIlll[0]];
                                        stringArray62[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[377]];
                                        NPCs.getNearest((String[])stringArray62).interact(lllIlIIllI[lllIlIIlll[378]]);
                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                        0;
                                    }
                                    if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                    }
                                    if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                    }
                                    L.cC();
                                    Time.sleepUntil(() -> {
                                        int n2;
                                        block3: {
                                            block2: {
                                                if (!L.llIIIlIlIlIll(AccBuilderSotf.i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block2;
                                                int[] nArray = new int[lllIlIIlll[0]];
                                                nArray[L.lllIlIIlll[1]] = lllIlIIlll[350];
                                                if (!L.llIIIlIllIlII(NPCs.getNearest((int[])nArray))) break block2;
                                                int[] nArray2 = new int[lllIlIIlll[0]];
                                                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[357];
                                                if (!L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray2))) break block3;
                                            }
                                            n2 = lllIlIIlll[0];
                                            0;
                                            if (1 < (9 + 152 - 126 + 131 ^ 46 + 104 - 48 + 60)) return n2 != 0;
                                            return ((0x23 ^ 0x62 ^ 3) & (4 ^ 0x40 ^ (0xA0 ^ 0xA6) ^ -1)) != 0;
                                        }
                                        n2 = lllIlIIlll[1];
                                        return n2 != 0;
                                    }, (int)lllIlIIlll[375]);
                                    0;
                                }
                            }
                        }
                    }
                }
                lllllllllllllllllIllIlllIlIIllIl = new WorldPoint(gn.getX() - lllIlIIlll[16], gn.getY(), lllIlIIlll[1]);
                lllllllllllllllllIllIlllIlIIllII = new WorldPoint(gn.getX(), gn.getY() - lllIlIIlll[0], lllIlIIlll[1]);
                lllllllllllllllllIllIlllIlIIlIll = new WorldPoint(lllllllllllllllllIllIlllIlIIllIl.getX() + lllIlIIlll[9], lllllllllllllllllIllIlllIlIIllIl.getWorldY() - lllIlIIlll[17], lllIlIIlll[1]);
                if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().getY(), gn.getY() - lllIlIIlll[0])) {
                    int[] nArray = new int[lllIlIIlll[0]];
                    nArray[L.lllIlIIlll[1]] = lllIlIIlll[357];
                    if (L.llIIIlIllIlII(TileObjects.getNearest((int[])nArray)) && L.llIIIlIlIlIll(gm ? 1 : 0)) {
                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                        }
                        if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                        }
                        if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.MYSTIC_MIGHT) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.MYSTIC_MIGHT);
                        }
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[379]];
                        while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(gn.getX() - lllIlIIlll[9], gn.getY() + lllIlIIlll[13], lllIlIIlll[1])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(gn.getX() - lllIlIIlll[9], gn.getY() + lllIlIIlll[13], lllIlIIlll[1]));
                            0;
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                            0;
                            if ((0x46 ^ 0x5C ^ (0x98 ^ 0x86)) != 0) continue;
                            return;
                        }
                        Time.sleepTicks((int)lllIlIIlll[9]);
                        0;
                    }
                }
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[357];
                if (L.llIIIlIlIllll(TileObjects.getNearest((int[])nArray))) {
                    if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (L.llIIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                    }
                    if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.MYSTIC_MIGHT) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.MYSTIC_MIGHT);
                    }
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[380]];
                    if (L.llIIIlIlIlIll(gL ? 1 : 0)) {
                        if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIllII) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[381]];
                            Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIIllII);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIllII) ? 1 : 0)) {
                            gL = lllIlIIlll[0];
                        }
                    }
                    if (L.llIIIlIlIlIIl(gL ? 1 : 0) && L.llIIIlIlIlIll(gM ? 1 : 0)) {
                        if (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIlIll) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[382]];
                            Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIIlIll);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIlIIlIll) ? 1 : 0)) {
                            gM = lllIlIIlll[0];
                        }
                    }
                }
            }
            if (L.llIIIlIlIllII(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[187]) && L.llIIIlIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[194])) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[383]];
                if (L.llIIIlIlIlIlI(di, lllIlIIlll[0])) {
                    aN.sA += lllIlIIlll[0];
                    aN.u(AccBuilderSotf.m);
                    di += lllIlIIlll[0];
                    aN.sA = lllIlIIlll[1];
                    dj = lllIlIIlll[1];
                }
                if (L.llIIIlIlIlIIl((lllllllllllllllllIllIlllIlIlIIIl = new WorldArea(lllIlIIlll[384], lllIlIIlll[385], lllIlIIlll[59], lllIlIIlll[34], lllIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllIlIIllI[lllIlIIlll[386]], cE);
                }
                g.a(cE);
            }
            if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[194]) && L.llIIIlIlIlIIl(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[37];
                if (L.llIIIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    lllllllllllllllllIllIlllIlIlIIIl = new WorldPoint(lllIlIIlll[387], lllIlIIlll[388], lllIlIIlll[1]);
                    if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[16])) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[389]];
                        Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl);
                        0;
                        Time.sleepTicks((int)lllIlIIlll[0]);
                        0;
                    }
                    if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIlIlIIIl), lllIlIIlll[16])) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[390]];
                        if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lllIlIIlll[13]);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                            if (L.llIIIlIllIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIlIIlll[3]);
                                0;
                            }
                            a.a(lllIlIIlll[37], lllIlIIlll[0]);
                        }
                    }
                }
                int[] nArray78 = new int[lllIlIIlll[0]];
                nArray78[L.lllIlIIlll[1]] = lllIlIIlll[37];
                if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray78) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[188]];
                    if (L.llIIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lllIlIIlll[9]);
                        0;
                    }
                    if (L.llIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        int[] nArray79 = new int[lllIlIIlll[0]];
                        nArray79[L.lllIlIIlll[1]] = lllIlIIlll[37];
                        Inventory.getFirst((int[])nArray79).interact(lllIlIIllI[lllIlIIlll[391]]);
                        Time.sleepTicks((int)lllIlIIlll[13]);
                        0;
                    }
                }
            }
            g.a(cE);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cL() {
        void lllllllllllllllllIllIllIlIlllIII;
        String[] stringArray = new String[lllIlIIlll[0]];
        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[787]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (L.llIIIlIllIlII(gC)) {
            Time.sleepTicks((int)lllIlIIlll[9]);
            0;
            gC = Players.getLocal().getWorldLocation();
        }
        if (L.llIIIlIlIllll(gC)) {
            gD = new WorldPoint(gC.getX() - lllIlIIlll[3], gC.getY() + lllIlIIlll[16], lllIlIIlll[1]);
            gE = new WorldPoint(gD.getX() - lllIlIIlll[19], gD.getY() + lllIlIIlll[17], lllIlIIlll[1]);
            gF = new WorldPoint(gE.getX() - lllIlIIlll[57], gE.getY() + lllIlIIlll[0], lllIlIIlll[1]);
            gG = new WorldPoint(gF.getX() - lllIlIIlll[31], gF.getY() - lllIlIIlll[6], lllIlIIlll[1]);
            gH = new WorldPoint(gG.getX() + lllIlIIlll[11], gG.getY() - lllIlIIlll[31], lllIlIIlll[1]);
            gI = new WorldPoint(gH.getX() + lllIlIIlll[26], gH.getY() + lllIlIIlll[15], lllIlIIlll[1]);
            gJ = new WorldPoint(gI.getX() + lllIlIIlll[21], gI.getY() + lllIlIIlll[13], lllIlIIlll[1]);
        }
        if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIlllIII)) {
            if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                Time.sleepTicks((int)lllIlIIlll[11]);
                0;
            }
            if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                List<WorldPoint> lllllllllllllllllIllIllIlIllIllI;
                List<WorldPoint> lllllllllllllllllIllIllIlIllIlll2;
                if (L.llIIIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gC), lllIlIIlll[18]) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gD) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[788]];
                    lllllllllllllllllIllIllIlIllIlll2 = List.of(gD);
                    Walker.walkAlong(lllllllllllllllllIllIllIlIllIlll2, new HashMap());
                    0;
                    Time.sleepTicks((int)lllIlIIlll[0]);
                    0;
                }
                if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)gD) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                    while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gE) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[789]];
                        lllllllllllllllllIllIllIlIllIlll2 = List.of(gE);
                        Walker.walkAlong(lllllllllllllllllIllIllIlIllIlll2, new HashMap());
                        0;
                        Time.sleepTicks((int)lllIlIIlll[0]);
                        0;
                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                            0;
                            if (2 != 1) break;
                            return;
                        }
                        0;
                        if (null == null) continue;
                        return;
                    }
                }
                if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)gE) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                    int lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[1];
                    while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gF) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[790]];
                        lllllllllllllllllIllIllIlIllIllI = List.of(gF);
                        if (L.llIIIlIlIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                            0;
                            if (3 > 1) break;
                            return;
                        }
                        String[] stringArray2 = new String[lllIlIIlll[0]];
                        stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[791]];
                        if (L.llIIIlIlIllIl(NPCs.getNearest((String[])stringArray2).getAnimation(), lllIlIIlll[792])) {
                            lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[0];
                            Time.sleepTicks((int)lllIlIIlll[23]);
                            0;
                            Time.sleep((long)300L);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIllIlll2)) {
                            Walker.walkAlong(lllllllllllllllllIllIllIlIllIllI, new HashMap());
                            0;
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllIlll2)) {
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        0;
                        if ((0x94 ^ 0x90) != 2) continue;
                        return;
                    }
                }
                if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)gF) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                    int lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[1];
                    while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gG) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[793]];
                        lllllllllllllllllIllIllIlIllIllI = List.of(gG);
                        if (L.llIIIlIlIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                            0;
                            if (1 < 2) break;
                            return;
                        }
                        String[] stringArray3 = new String[lllIlIIlll[0]];
                        stringArray3[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[794]];
                        if (L.llIIIlIlIllIl(NPCs.getNearest((String[])stringArray3).getAnimation(), lllIlIIlll[792])) {
                            lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[0];
                            Time.sleepTicks((int)lllIlIIlll[23]);
                            0;
                            Time.sleep((long)300L);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIllIlll2)) {
                            Walker.walkAlong(lllllllllllllllllIllIllIlIllIllI, new HashMap());
                            0;
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllIlll2)) {
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        0;
                        if (null == null) continue;
                        return;
                    }
                }
                if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)gG) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                    int lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[1];
                    while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gH) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[795]];
                        lllllllllllllllllIllIllIlIllIllI = List.of(gH);
                        if (L.llIIIlIlIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                            0;
                            if (-1 <= 2) break;
                            return;
                        }
                        String[] stringArray4 = new String[lllIlIIlll[0]];
                        stringArray4[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[796]];
                        if (L.llIIIlIllIIIl(NPCs.getNearest((String[])stringArray4).getWorldLocation().getY(), gC.getY() + lllIlIIlll[18])) {
                            System.out.println(lllIlIIllI[lllIlIIlll[797]]);
                            lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[0];
                        }
                        String[] stringArray5 = new String[lllIlIIlll[0]];
                        stringArray5[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[798]];
                        if (L.llIIIlIlIllIl(NPCs.getNearest((String[])stringArray5).getAnimation(), lllIlIIlll[792])) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[799]];
                            lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[0];
                            Time.sleepTicks((int)lllIlIIlll[23]);
                            0;
                            Time.sleep((long)300L);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIllIlll2)) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[800]];
                            Walker.walkAlong(lllllllllllllllllIllIllIlIllIllI, new HashMap());
                            0;
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllIlll2)) {
                            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[801]];
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        0;
                        if (3 > -1) continue;
                        return;
                    }
                }
                if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)gH) ? 1 : 0) && L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIlllIII.isMoving() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIIlll[3]);
                    0;
                    int lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[1];
                    while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gI) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[802]];
                        lllllllllllllllllIllIllIlIllIllI = List.of(gI);
                        if (L.llIIIlIlIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                            0;
                            if (-(0x15 ^ 0x10) < 0) break;
                            return;
                        }
                        if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllIlll2)) {
                            lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[0];
                            Time.sleepTicks((int)lllIlIIlll[3]);
                            0;
                        }
                        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIllIlll2)) {
                            Walker.walkAlong(lllllllllllllllllIllIllIlIllIllI, new HashMap());
                            0;
                            Time.sleepTicks((int)lllIlIIlll[0]);
                            0;
                        }
                        0;
                        if ((0x94 ^ 0x90) > 2) continue;
                        return;
                    }
                }
                if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)gI) ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIIlll[26]);
                    0;
                    int lllllllllllllllllIllIllIlIllIlll2 = lllIlIIlll[1];
                    while (L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)gJ) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[284]];
                        lllllllllllllllllIllIllIlIllIllI = List.of(gJ);
                        if (L.llIIIlIlIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        if (L.llIIIlIlIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                            0;
                            if ((0x1B ^ 0x1F) >= 0) break;
                            return;
                        }
                        Walker.walkAlong(lllllllllllllllllIllIllIlIllIllI, new HashMap());
                        0;
                        Time.sleepTicks((int)lllIlIIlll[0]);
                        0;
                        0;
                        if (-1 <= (0x61 ^ 0x19 ^ (0x7F ^ 3))) continue;
                        return;
                    }
                }
            }
        }
    }

    private static boolean llIIIlIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public static void cI() {
        WorldArea lllllllllllllllllIllIlllIIllIIll;
        void lllllllllllllllllIllIlllIIllIlIl;
        WorldArea worldArea = new WorldArea(lllIlIIlll[405], lllIlIIlll[406], lllIlIIlll[9], lllIlIIlll[16], lllIlIIlll[1]);
        WorldPoint worldPoint = new WorldPoint(lllIlIIlll[407], lllIlIIlll[408], lllIlIIlll[1]);
        if (L.llIIIlIlIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(v.dl), lllIlIIlll[18])) {
            void lllllllllllllllllIllIlllIIllIlII;
            while (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllIlllIIllIlII), lllIlIIlll[3])) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[409]];
                if (L.llIIIlIlIlIIl(AccBuilderSotf.d ? 1 : 0)) {
                    0;
                    if (-2 <= 0) break;
                    return;
                }
                if (L.llIIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIIllIlII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
                0;
                if (-1 <= 0) continue;
                return;
            }
        }
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIlllIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[410]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[411]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[412]]);
            Time.sleepTicks((int)lllIlIIlll[13]);
            0;
        }
        if (L.llIIIlIlIlIIl((lllllllllllllllllIllIlllIIllIIll = new WorldArea(lllIlIIlll[413], lllIlIIlll[414], lllIlIIlll[3], lllIlIIlll[21], lllIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[415]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[416]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[417]]);
            Time.sleepTicks((int)lllIlIIlll[9]);
            0;
        }
        WorldArea lllllllllllllllllIllIlllIIllIIlI = new WorldArea(lllIlIIlll[418], lllIlIIlll[419], lllIlIIlll[59], lllIlIIlll[31], lllIlIIlll[0]);
        WorldPoint lllllllllllllllllIllIlllIIllIIIl = new WorldPoint(lllIlIIlll[420], lllIlIIlll[421], lllIlIIlll[0]);
        if (L.llIIIlIlIlIIl(lllllllllllllllllIllIlllIIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIIllIIIl) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[422]];
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[423]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[424]]);
            Time.sleepTicks((int)lllIlIIlll[9]);
            0;
        }
        if (L.llIIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllIlllIIllIIIl) ? 1 : 0) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[425]];
            TileObjects.getNearest((String[])stringArray).interact(lllIlIIllI[lllIlIIlll[426]]);
            Time.sleepTicks((int)lllIlIIlll[3]);
            0;
            String[] stringArray2 = new String[lllIlIIlll[0]];
            stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[427]];
            g.a(stringArray2);
        }
        if (L.llIIIlIlIlIIl(gv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllllllllllllllIllIlllIIllIIII = new WorldPoint(lllIlIIlll[180], lllIlIIlll[151], lllIlIIlll[1]);
            if (L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIllIlllIIllIIII), lllIlIIlll[13])) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[428]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIllIlllIIllIIII);
                0;
                Time.sleepTicks((int)lllIlIIlll[0]);
                0;
            }
            if (L.llIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIllIlllIIllIIII), lllIlIIlll[13])) {
                if (L.llIIIlIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[184])) {
                    g.a(lllIlIIllI[lllIlIIlll[429]], cE);
                }
                if (L.llIIIlIlIllIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), lllIlIIlll[184])) {
                    g.a(lllIlIIllI[lllIlIIlll[430]], cE);
                }
            }
        }
    }

    private static boolean llIIIlIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlIlIIlll() {
        lllIlIIlll = new int[878];
        L.lllIlIIlll[0] = 1;
        L.lllIlIIlll[1] = (0x17 ^ 0x42) & ~(0xD5 ^ 0x80);
        L.lllIlIIlll[2] = 65 + 36 - 27 + 104;
        L.lllIlIIlll[3] = 3;
        L.lllIlIIlll[4] = 0x45 ^ 0x5B;
        L.lllIlIIlll[5] = 0x80 ^ 0xBE;
        L.lllIlIIlll[6] = 2;
        L.lllIlIIlll[7] = 0x4E ^ 0x72;
        L.lllIlIIlll[8] = 94 + 147 - 231 + 181 ^ 6 + 99 - 86 + 116;
        L.lllIlIIlll[9] = 0x8C ^ 0x88;
        L.lllIlIIlll[10] = 0x19 ^ 0x2D;
        L.lllIlIIlll[11] = 143 + 0 - 34 + 60 ^ 129 + 29 - 117 + 131;
        L.lllIlIIlll[12] = 0x24 ^ 0x16;
        L.lllIlIIlll[13] = 0xC1 ^ 0xC7;
        L.lllIlIIlll[14] = 68 + 49 - 47 + 95;
        L.lllIlIIlll[15] = 0x68 ^ 8 ^ (0xF8 ^ 0x9F);
        L.lllIlIIlll[16] = 0x6C ^ 0x15 ^ (0x16 ^ 0x67);
        L.lllIlIIlll[17] = 0x2B ^ 0x22;
        L.lllIlIIlll[18] = 0x7B ^ 0x56 ^ (0x63 ^ 0x44);
        L.lllIlIIlll[19] = 5 ^ 0xE;
        L.lllIlIIlll[20] = 0xFFFFD7BF & 0x3BC8;
        L.lllIlIIlll[21] = 4 ^ 0x26 ^ (0x34 ^ 0x1A);
        L.lllIlIIlll[22] = 0xFFFF9E7D & 0x7B9F;
        L.lllIlIIlll[23] = 0x6F ^ 0x62;
        L.lllIlIIlll[24] = 0xFFFFF59F & 0x3BF7;
        L.lllIlIIlll[25] = 0x39 ^ 0x11;
        L.lllIlIIlll[26] = 175 + 36 - 124 + 117 ^ 137 + 149 - 232 + 140;
        L.lllIlIIlll[27] = -(0xFFFFF66B & 0x2D9E) & (0xFFFFBFFD & 0x6FDB);
        L.lllIlIIlll[28] = 96 + 60 - 106 + 100 ^ 61 + 44 - 43 + 68;
        L.lllIlIIlll[29] = 57 + 74 - 126 + 176 ^ 105 + 80 - 166 + 167;
        L.lllIlIIlll[30] = 0xFFFFF7DF & 0x3971;
        L.lllIlIIlll[31] = 0x3C ^ 0x30 ^ (0x69 ^ 0x77);
        L.lllIlIIlll[32] = 0x4B ^ 0x5B;
        L.lllIlIIlll[33] = 0xFFFF937F & 0x6EAA;
        L.lllIlIIlll[34] = 0x24 ^ 0x35;
        L.lllIlIIlll[35] = -(0xFFFFF6BF & 0xD6F) & (0xFFFFC5BF & 0x3FEF);
        L.lllIlIIlll[36] = 0x43 ^ 0x5B;
        L.lllIlIIlll[37] = -(0xFFFFF1AF & 0x6EF1) & (0xFFFFFFFF & 0x7FE7);
        L.lllIlIIlll[38] = 0xFFFF8EC7 & 0x777B;
        L.lllIlIIlll[39] = 0xFFFFF6FB & 0xFDF;
        L.lllIlIIlll[40] = -(0xFFFFCB2F & 0x37D1) & (0xFFFFCFBB & 0x7FE7);
        L.lllIlIIlll[41] = 0xFFFFBBF7 & 0x47BA;
        L.lllIlIIlll[42] = 0xFFFF9BFF & 0x6634;
        L.lllIlIIlll[43] = -(0xFFFFAD35 & 0x76EB) & (0xFFFFAFAF & 0x7DFE);
        L.lllIlIIlll[44] = -(110 + 93 - 110 + 67) & (0xFFFFFEDF & 0x2FFF);
        L.lllIlIIlll[45] = 0xFFFFD9EF & 0x3FB8;
        L.lllIlIIlll[46] = -(4 ^ 1) & (0xFFFFF37E & 0x5FB7);
        L.lllIlIIlll[47] = -(0xFFFFEEF3 & 0x550F) & (0xFFFFEFFF & 0x7F7F);
        L.lllIlIIlll[48] = 0xFFFFFBFD & 0x1DBB;
        L.lllIlIIlll[49] = 0xFFFFDDDF & 0x276F;
        L.lllIlIIlll[50] = -(0xFFFFB9CF & 0x67FD) & (0xFFFFFFFF & 0x73DD);
        L.lllIlIIlll[51] = -(0xFFFFF79B & 0x7EE5) & (0xFFFFFFBB & 0x7FEF);
        L.lllIlIIlll[52] = 0xAF ^ 0xBC;
        L.lllIlIIlll[53] = 0xFFFFCDFD & 0x3BBF;
        L.lllIlIIlll[54] = 0xFFFFA9FB & 0x5FC7;
        L.lllIlIIlll[55] = 0x26 ^ 0x5C ^ (0xD4 ^ 0xBB);
        L.lllIlIIlll[56] = 0xFFFFDBFE & 0x3D7D;
        L.lllIlIIlll[57] = 0x5D ^ 0x4B;
        L.lllIlIIlll[58] = -(0xFFFFE7C1 & 0x3C7F) & (0xFFFFFFFF & 0x7DFF);
        L.lllIlIIlll[59] = 0xF7 ^ 0xBD ^ (0xEB ^ 0xB6);
        L.lllIlIIlll[60] = 0xFFFFEDFD & 0x16F3;
        L.lllIlIIlll[61] = -(156 + 144 - 181 + 106) & (0xFFFFDFEF & 0x6FFB);
        L.lllIlIIlll[62] = 0x2B ^ 0x77 ^ (0xEB ^ 0xAE);
        L.lllIlIIlll[63] = 13 + 107 - 15 + 114 ^ 105 + 0 - -24 + 64;
        L.lllIlIIlll[64] = 0x2C ^ 0x6A ^ (0x2A ^ 0x77);
        L.lllIlIIlll[65] = 0 ^ 0x39 ^ (0xE7 ^ 0xC2);
        L.lllIlIIlll[66] = 0x3A ^ 0x27;
        L.lllIlIIlll[67] = 0x34 ^ 0x2B;
        L.lllIlIIlll[68] = -(0xFFFFAEDF & 0x5779) & (0xFFFFAFFA & 0x5FDF);
        L.lllIlIIlll[69] = -(0xEE ^ 0xAF) & (0xFFFFFFFE & 0x57C1);
        L.lllIlIIlll[70] = 8 ^ 0x28;
        L.lllIlIIlll[71] = 0x80 ^ 0xA1;
        L.lllIlIIlll[72] = 0x2C ^ 0x17 ^ (0x93 ^ 0x8A);
        L.lllIlIIlll[73] = 0x99 ^ 0xBA;
        L.lllIlIIlll[74] = 0x1E ^ 0x3A;
        L.lllIlIIlll[75] = 0x36 ^ 0x13;
        L.lllIlIIlll[76] = 0 ^ 0x60 ^ (0xD1 ^ 0x97);
        L.lllIlIIlll[77] = 0xC6 ^ 0x9E ^ 124 + 120 - 179 + 62;
        L.lllIlIIlll[78] = 0xFFFFDA5B & 0xBFFF;
        L.lllIlIIlll[79] = 0x7C ^ 0x55;
        L.lllIlIIlll[80] = 0x6F ^ 0x45;
        L.lllIlIIlll[81] = 0xBE ^ 0x87 ^ (0x81 ^ 0x93);
        L.lllIlIIlll[82] = 0x57 ^ 1 ^ (0x5F ^ 0x25);
        L.lllIlIIlll[83] = 0x28 ^ 2 ^ (0x3B ^ 0x3C);
        L.lllIlIIlll[84] = 0x30 ^ 0x1E;
        L.lllIlIIlll[85] = 0x90 ^ 0xBF;
        L.lllIlIIlll[86] = 0xA1 ^ 0xA5 ^ (0x78 ^ 0x4C);
        L.lllIlIIlll[87] = 0x3D ^ 0xC;
        L.lllIlIIlll[88] = 116 + 138 - 237 + 161 ^ 122 + 24 - 52 + 35;
        L.lllIlIIlll[89] = 0xFFFFFEFC & 0x9B5F;
        L.lllIlIIlll[90] = 0x2C ^ 0x19;
        L.lllIlIIlll[91] = 0xC8 ^ 0xC4 ^ (0xAE ^ 0x94);
        L.lllIlIIlll[92] = -(0xFFFFE4FD & 0x5F83) & (0xFFFFDEDD & 0xFFFF);
        L.lllIlIIlll[93] = 0x64 ^ 0x53;
        L.lllIlIIlll[94] = 0xA5 ^ 0x9C;
        L.lllIlIIlll[95] = 0x37 ^ 0xD;
        L.lllIlIIlll[96] = 0x8E ^ 0xB5;
        L.lllIlIIlll[97] = 0x1C ^ 0xE ^ (0xBA ^ 0x95);
        L.lllIlIIlll[98] = 0xBF ^ 0x80;
        L.lllIlIIlll[99] = 135 + 139 - 100 + 53 ^ 42 + 86 - 68 + 103;
        L.lllIlIIlll[100] = 114 + 30 - 140 + 248 ^ 173 + 7 - 171 + 180;
        L.lllIlIIlll[101] = 0x98 ^ 0xB1 ^ (0x77 ^ 0x1C);
        L.lllIlIIlll[102] = 0x42 ^ 1;
        L.lllIlIIlll[103] = 68 + 91 - 59 + 129 ^ 142 + 76 - 164 + 107;
        L.lllIlIIlll[104] = 0xF5 ^ 0x96 ^ (0x8F ^ 0xA9);
        L.lllIlIIlll[105] = 4 ^ 0x42;
        L.lllIlIIlll[106] = -1;
        L.lllIlIIlll[107] = 86 + 64 - 136 + 190 ^ 26 + 93 - 103 + 123;
        L.lllIlIIlll[108] = 0x7B ^ 0x33;
        L.lllIlIIlll[109] = 56 + 94 - -45 + 3 ^ 139 + 48 - 79 + 35;
        L.lllIlIIlll[110] = 0x6E ^ 0x24;
        L.lllIlIIlll[111] = 0xA ^ 0x38 ^ (0xC9 ^ 0xB0);
        L.lllIlIIlll[112] = 0x5E ^ 0x12;
        L.lllIlIIlll[113] = 0x69 ^ 0x24;
        L.lllIlIIlll[114] = 0xCD ^ 0xC0 ^ (0x43 ^ 0);
        L.lllIlIIlll[115] = 0x1B ^ 0x66 ^ (0x82 ^ 0xB0);
        L.lllIlIIlll[116] = 0x47 ^ 0x17;
        L.lllIlIIlll[117] = 0x61 ^ 0x7C ^ (0xFD ^ 0xB1);
        L.lllIlIIlll[118] = 25 + 179 - 44 + 70 ^ 46 + 42 - 68 + 160;
        L.lllIlIIlll[119] = 0x2D ^ 0x7E;
        L.lllIlIIlll[120] = 0x5D ^ 0x3E ^ (0x4F ^ 0x78);
        L.lllIlIIlll[121] = 0xFFFFBFFF & 0x71D7;
        L.lllIlIIlll[122] = 140 + 186 - 223 + 97 ^ 134 + 45 - 41 + 19;
        L.lllIlIIlll[123] = 0xEA ^ 0xBC;
        L.lllIlIIlll[124] = 0xD3 ^ 0x84;
        L.lllIlIIlll[125] = 0x4C ^ 0x14;
        L.lllIlIIlll[126] = 0x21 ^ 0x6F ^ (0xD1 ^ 0xC6);
        L.lllIlIIlll[127] = 0xD3 ^ 0x84 ^ (0x78 ^ 0x75);
        L.lllIlIIlll[128] = -(0xFFFFDE43 & 0x73BD) & (0xFFFFDFC9 & Short.MAX_VALUE);
        L.lllIlIIlll[129] = 0xFFFFFFFE & 0xC6D;
        L.lllIlIIlll[130] = 0x1E ^ 0x45;
        L.lllIlIIlll[131] = 0xE ^ 0x10 ^ (0x77 ^ 0x35);
        L.lllIlIIlll[132] = 0x35 ^ 0x68;
        L.lllIlIIlll[133] = 92 + 184 - 98 + 34 ^ 114 + 12 - -11 + 1;
        L.lllIlIIlll[134] = 38 + 115 - 61 + 64 ^ 59 + 87 - 131 + 180;
        L.lllIlIIlll[135] = 0xFFFFEAFF & 0x1799;
        L.lllIlIIlll[136] = 0x2A ^ 0x5A ^ (0x4B ^ 0x5B);
        L.lllIlIIlll[137] = 0xC6 ^ 0xA7;
        L.lllIlIIlll[138] = 0xD1 ^ 0xA0 ^ (0x5C ^ 0x4F);
        L.lllIlIIlll[139] = 0xFFFFEE6D & 0x39FE;
        L.lllIlIIlll[140] = 0xB4 ^ 0xA5 ^ (0xF0 ^ 0x82);
        L.lllIlIIlll[141] = 0xFFFFF9FF & 0x2E6B;
        L.lllIlIIlll[142] = 0x51 ^ 0x21 ^ (0x1B ^ 0xF);
        L.lllIlIIlll[143] = -(95 + 131 - 163 + 82) & (0xFFFFACFF & 0x7BFF);
        L.lllIlIIlll[144] = 0x73 ^ 0x16;
        L.lllIlIIlll[145] = -(0xFFFFD5DE & 0x7EB3) & (0xFFFFFCFF & Short.MAX_VALUE);
        L.lllIlIIlll[146] = 0x69 ^ 0xF;
        L.lllIlIIlll[147] = 0xFFFFEBFF & 0x3C6D;
        L.lllIlIIlll[148] = 0x62 ^ 5;
        L.lllIlIIlll[149] = 0x38 ^ 0x6D ^ (0x56 ^ 0x6B);
        L.lllIlIIlll[150] = 0xFFFFDEFF & 0x2F76;
        L.lllIlIIlll[151] = 0xFFFF8EFE & 0x7D73;
        L.lllIlIIlll[152] = 0x5C ^ 0x35;
        L.lllIlIIlll[153] = -(0xFFFFBD9F & 0x5362) & (0xFFFFBFFD & 0x5F3F);
        L.lllIlIIlll[154] = 0xFFFFFEAE & 0xDD1;
        L.lllIlIIlll[155] = 0xFFFFEF8F & 0x1E7A;
        L.lllIlIIlll[156] = 0xFFFF8DC3 & 0x7EBF;
        L.lllIlIIlll[157] = -(0xFFFFC8BA & 0x7777) & (0xFFFFDF3D & 0x6EFF);
        L.lllIlIIlll[158] = 0xFFFF8CF5 & 0x7F8E;
        L.lllIlIIlll[159] = 0x5B ^ 0x31;
        L.lllIlIIlll[160] = 0x9F ^ 0x84 ^ (0xC0 ^ 0xB0);
        L.lllIlIIlll[161] = 208 + 139 - 143 + 33 ^ 71 + 32 - 19 + 45;
        L.lllIlIIlll[162] = 0xF3 ^ 0x9E;
        L.lllIlIIlll[163] = 0x84 ^ 0x8F ^ (0x71 ^ 0x14);
        L.lllIlIIlll[164] = 0x5D ^ 0x3D ^ (0xCE ^ 0xC1);
        L.lllIlIIlll[165] = 0xBD ^ 0x97 ^ (0xD6 ^ 0x8C);
        L.lllIlIIlll[166] = 0x3D ^ 9 ^ (0x5B ^ 0x1E);
        L.lllIlIIlll[167] = 0x9C ^ 0xB3 ^ (0x7F ^ 0x22);
        L.lllIlIIlll[168] = 0xC4 ^ 0xA0 ^ (0x7B ^ 0x6C);
        L.lllIlIIlll[169] = 226 + 183 - 347 + 171 ^ 110 + 113 - 139 + 73;
        L.lllIlIIlll[170] = 3 ^ 0x76;
        L.lllIlIIlll[171] = 0x88 ^ 0x81 ^ 124 + 63 - 112 + 52;
        L.lllIlIIlll[172] = 0x29 ^ 0x24 ^ (0xF1 ^ 0x8B);
        L.lllIlIIlll[173] = 0x56 ^ 0x2E;
        L.lllIlIIlll[174] = 0x31 ^ 0x48;
        L.lllIlIIlll[175] = 0xCE ^ 0x83 ^ (0xC ^ 0x3B);
        L.lllIlIIlll[176] = 8 ^ 0x24 ^ (0xA ^ 0x5D);
        L.lllIlIIlll[177] = 0x3F ^ 0x4E ^ (0xCE ^ 0xC3);
        L.lllIlIIlll[178] = 27 + 115 - -14 + 67 ^ 44 + 54 - 16 + 80;
        L.lllIlIIlll[179] = 0x22 ^ 0x5C;
        L.lllIlIIlll[180] = -(0xFFFFF455 & 0x7BAB) & (0xFFFFFFFF & 0x7E79);
        L.lllIlIIlll[181] = (9 ^ 6) + (0x69 ^ 0x6D) - -(0x5D ^ 0x63) + (0x35 ^ 0x1B);
        L.lllIlIIlll[182] = 91 + 40 - 90 + 87;
        L.lllIlIIlll[183] = 26 + 4 - -13 + 86;
        L.lllIlIIlll[184] = (0x77 ^ 0x15) + (0xC2 ^ 0x86) - (0x1C ^ 0x76) + (5 ^ 0x43);
        L.lllIlIIlll[185] = (0xC ^ 1) + (0x1B ^ 0x46) - (0xD ^ 0x2F) + (0x76 ^ 0x4D);
        L.lllIlIIlll[186] = 0xFFFF8FB7 & 0x7E5B;
        L.lllIlIIlll[187] = (0xE6 ^ 0x8D) + (0x42 ^ 0x66) - (0xCF ^ 0x81) + (0x83 ^ 0xC0);
        L.lllIlIIlll[188] = -(0xFFFFFEDB & 0x67B7) & (0xFFFFEFBF & 0x77FE);
        L.lllIlIIlll[189] = 82 + 132 - 102 + 21;
        L.lllIlIIlll[190] = (0x36 ^ 8) + (0x47 ^ 0x79) - (0x15 ^ 0x56) + (0x77 ^ 0x3A);
        L.lllIlIIlll[191] = 76 + 129 - 131 + 61;
        L.lllIlIIlll[192] = (0xBC ^ 0xAC) + (0x3F ^ 0x17) - -(0x83 ^ 0xAC) + (0x7C ^ 0x5D);
        L.lllIlIIlll[193] = 118 + 39 - 75 + 55;
        L.lllIlIIlll[194] = 78 + 84 - 67 + 43;
        L.lllIlIIlll[195] = 101 + 135 - 181 + 84;
        L.lllIlIIlll[196] = 139 + 44 - 161 + 118;
        L.lllIlIIlll[197] = (0x2F ^ 0x5C) + (0x78 ^ 0x28) - (0x16 ^ 0x70) + (0xF2 ^ 0xC2);
        L.lllIlIIlll[198] = (0x58 ^ 0x6C) + (0x56 ^ 0x3F) - (0x5E ^ 0x37) + (0xD4 ^ 0x8E);
        L.lllIlIIlll[199] = 12 + 94 - -7 + 30;
        L.lllIlIIlll[200] = 93 + 107 - 103 + 30 + (0xA3 ^ 0xC3) - (62 + 51 - 48 + 64) + (0xAD ^ 0x9F);
        L.lllIlIIlll[201] = 83 + 91 - 72 + 43;
        L.lllIlIIlll[202] = 91 + 22 - -3 + 30;
        L.lllIlIIlll[203] = 110 + 34 - 142 + 145;
        L.lllIlIIlll[204] = (0xFA ^ 0x8C) + (0x43 ^ 0x2A) - (107 + 8 - 26 + 57) + (0x41 ^ 6);
        L.lllIlIIlll[205] = (0x4C ^ 0x3F) + (0xAB ^ 0x8F) - (0xFB ^ 0xAD) + (0xF ^ 0x5B);
        L.lllIlIIlll[206] = (0x29 ^ 0x1F) + (0x4C ^ 0x25) - (0x1D ^ 0x43) + (0x69 ^ 0x3C);
        L.lllIlIIlll[207] = 80 + 77 - 46 + 40;
        L.lllIlIIlll[208] = (5 ^ 0x61) + (93 + 92 - 39 + 5) - (161 + 37 - 152 + 182) + (11 + 13 - -84 + 21);
        L.lllIlIIlll[209] = (0x98 ^ 0xA6) + (0xF ^ 0x47) - (0x1F ^ 0x21) + (0x67 ^ 0x36);
        L.lllIlIIlll[210] = 55 + 86 - 36 + 49;
        L.lllIlIIlll[211] = 83 + 10 - -4 + 58;
        L.lllIlIIlll[212] = (0xEB ^ 0x92) + (0x1D ^ 0x34) - (0x23 ^ 0) + (0x7F ^ 0x62);
        L.lllIlIIlll[213] = (0x92 ^ 0xC5) + (95 + 9 - 101 + 126) - (150 + 104 - 112 + 13) + (0x46 ^ 0x26);
        L.lllIlIIlll[214] = 122 + 122 - 125 + 14 + (0x99 ^ 0x85) - (0x59 ^ 0x4B) + (0xAD ^ 0xA2);
        L.lllIlIIlll[215] = (0x10 ^ 0x57) + (0x76 ^ 0x47) - (0x5A ^ 0x7F) + (0xF6 ^ 0xBA);
        L.lllIlIIlll[216] = (0xF8 ^ 0xBB) + (0x6F ^ 0x47) - (0x8E ^ 0xA7) + (0xFE ^ 0xA0);
        L.lllIlIIlll[217] = 0xFFFFF7FF & 0x5F7E;
        L.lllIlIIlll[218] = 54 + 31 - 72 + 120 + (0x4F ^ 0x35) - (75 + 57 - 46 + 80) + (0x6B ^ 0x23);
        L.lllIlIIlll[219] = 60 + 65 - 4 + 41;
        L.lllIlIIlll[220] = (0xCB ^ 0x89) + (82 + 95 - 165 + 115) - (0x9E ^ 0xC2) + (0x12 ^ 0x2C);
        L.lllIlIIlll[221] = 153 + 147 - 238 + 102;
        L.lllIlIIlll[222] = (0x35 ^ 0x5F) + (0xB4 ^ 0xA3) - (0x40 ^ 3) + (0xF ^ 0x67);
        L.lllIlIIlll[223] = (0 ^ 0x63) + ((0x8B ^ 0xBC) & ~(0xA4 ^ 0x93)) - (0x82 ^ 0xA9) + (0xDB ^ 0xB4);
        L.lllIlIIlll[224] = (0x4A ^ 5) + (0x9E ^ 0xAA) - (0xB0 ^ 0xA3) + (0x4C ^ 0x74);
        L.lllIlIIlll[225] = 115 + 49 - 145 + 150;
        L.lllIlIIlll[226] = 25 + 77 - 6 + 74;
        L.lllIlIIlll[227] = 138 + 7 - 7 + 33;
        L.lllIlIIlll[228] = 130 + 39 - 132 + 97 + (0x2C ^ 0x32) - (0xA9 ^ 0xB9) + (0x46 ^ 0x5E);
        L.lllIlIIlll[229] = 167 + 149 - 179 + 36;
        L.lllIlIIlll[230] = (0x21 ^ 0x2C) + (0x7B ^ 0x6D) - -(0xE7 ^ 0x9B) + (0x11 ^ 0x1E);
        L.lllIlIIlll[231] = 111 + 25 - 63 + 102;
        L.lllIlIIlll[232] = (0x34 ^ 0xF) + (7 + 109 - 60 + 118) - (170 + 101 - 236 + 170) + (50 + 3 - 23 + 118);
        L.lllIlIIlll[233] = (0x7A ^ 0x37) + (0xE9 ^ 0xBA) - (0x44 ^ 0x79) + (0x51 ^ 0x1F);
        L.lllIlIIlll[234] = 0xFFFF9FFF & 0x6E57;
        L.lllIlIIlll[235] = -(0xFFFFF7FF & 0x791B) & (0xFFFFFF7F & 0x7DFB);
        L.lllIlIIlll[236] = (0xF8 ^ 0xAA) + (0x54 ^ 0x6E) - (0xC6 ^ 0xC3) + (0x6E ^ 0x42);
        L.lllIlIIlll[237] = (0xD4 ^ 0xA2) + (0xA3 ^ 0xB2) - (0x58 ^ 0x48) + (0xB9 ^ 0x84);
        L.lllIlIIlll[238] = 56 + 88 - 66 + 103;
        L.lllIlIIlll[239] = 60 + 80 - 38 + 80;
        L.lllIlIIlll[240] = 108 + 153 - 216 + 138;
        L.lllIlIIlll[241] = 114 + 52 - 14 + 32;
        L.lllIlIIlll[242] = -(0xFFFFA429 & 0x7BDF) & (0xFFFFFE7F & 0x2FED);
        L.lllIlIIlll[243] = 0xFFFFBC7B & 0x4FEC;
        L.lllIlIIlll[244] = 3 + (0x7D ^ 0xD) - (0x1D ^ 0x15) + (0xE4 ^ 0xAA);
        L.lllIlIIlll[245] = 56 + 123 - 97 + 104;
        L.lllIlIIlll[246] = 52 + 75 - -58 + 2;
        L.lllIlIIlll[247] = 61 + 76 - 91 + 142;
        L.lllIlIIlll[248] = (0x49 ^ 0x4F) + (0x4B ^ 0x33) - (0x1B ^ 0xC) + (0x5C ^ 0xA);
        L.lllIlIIlll[249] = 32 + 155 - 37 + 40;
        L.lllIlIIlll[250] = (0x5C ^ 0x60) + (0xD9 ^ 0xC7) - (0x7D ^ 0x6E) + (0x1C ^ 0x64);
        L.lllIlIIlll[251] = 85 + 77 - 84 + 65 + (0x4E ^ 4) - (44 + 100 - 72 + 97) + (86 + 31 - 90 + 117);
        L.lllIlIIlll[252] = -(0xFFFF9F4B & 0x61BF) & (0xFFFFE17E & 0x7FEF);
        L.lllIlIIlll[253] = 30 + 176 - 49 + 36;
        L.lllIlIIlll[254] = -(0xFFFFDFF3 & 0x351D) & (0xFFFFFD77 & 0x77FE);
        L.lllIlIIlll[255] = 50 + 27 - -34 + 66 + (80 + 62 - 113 + 136) - (0xFFFFABBD & 0x5577) + (6 + 39 - 42 + 158);
        L.lllIlIIlll[256] = -(0xFFFFDF97 & 0x297F) & (0xFFFFE9FF & 0x7F7E);
        L.lllIlIIlll[257] = 102 + 154 - 144 + 83;
        L.lllIlIIlll[258] = 30 + 156 - 127 + 137;
        L.lllIlIIlll[259] = 0xFFFF8F2E & 0x7EF3;
        L.lllIlIIlll[260] = 0xFFFFCFFF & 0x3CF4;
        L.lllIlIIlll[261] = 142 + 87 - 158 + 126;
        L.lllIlIIlll[262] = 86 + 90 - 102 + 124;
        L.lllIlIIlll[263] = 8 + 145 - 14 + 60;
        L.lllIlIIlll[264] = (0x49 ^ 0x78) + (0xA6 ^ 0x9B) - (0x76 ^ 0x4B) + (21 + 21 - -24 + 85);
        L.lllIlIIlll[265] = (0x53 ^ 0x17) + (0x29 ^ 0x39) - (0xAC ^ 0xA6) + (11 + 12 - -30 + 74);
        L.lllIlIIlll[266] = -(0xFFFFB82B & 0x67D5) & (0xFFFFEE6F & 0x3FDF);
        L.lllIlIIlll[267] = 0xFFFFCD7B & 0x3F96;
        L.lllIlIIlll[268] = 38 + 15 - -5 + 144;
        L.lllIlIIlll[269] = 156 + 0 - 52 + 99;
        L.lllIlIIlll[270] = -(0xFFFFF57F & 0x5B97) & (0xFFFFDFF6 & 0x7F3F);
        L.lllIlIIlll[271] = 0xFFFF8DB3 & 0x7F7E;
        L.lllIlIIlll[272] = 0xFFFFCF77 & 0x3DBB;
        L.lllIlIIlll[273] = 83 + 52 - 87 + 149 + (139 + 119 - 130 + 20) - (0xFFFF957A & 0x6BCF) + (49 + 53 - 49 + 136);
        L.lllIlIIlll[274] = 129 + 131 - 157 + 102;
        L.lllIlIIlll[275] = 188 + 166 - 227 + 79;
        L.lllIlIIlll[276] = (0x36 ^ 0) + (54 + 18 - 65 + 155) - (207 + 165 - 162 + 0) + (88 + 141 - 114 + 86);
        L.lllIlIIlll[277] = -(0xFFFFFBFD & 0x35C3) & (0xFFFFBFFF & 0x7FDF);
        L.lllIlIIlll[278] = -(185 + 175 - 307 + 142) & (0xFFFFCDDF & 0x3FFB);
        L.lllIlIIlll[279] = 178 + 151 - 159 + 38;
        L.lllIlIIlll[280] = 173 + 4 - -7 + 25;
        L.lllIlIIlll[281] = 0xFFFFBF6F & 0xD4FF;
        L.lllIlIIlll[282] = (0x41 ^ 0x19) + (14 + 122 - 125 + 125) - (84 + 41 - 52 + 95) + (84 + 34 - 61 + 97);
        L.lllIlIIlll[283] = (0xB ^ 0x55) + (24 + 43 - -77 + 61) - (16 + 14 - -141 + 71) + (136 + 6 - 136 + 148);
        L.lllIlIIlll[284] = -(0xFFFFFFFF & 0x5D87) & (0xFFFFFFF7 & 0x5FFF);
        L.lllIlIIlll[285] = (0x83 ^ 0x95) + (0x9D ^ 0xC6) - (0x79 ^ 0x43) + (122 + 118 - 153 + 70);
        L.lllIlIIlll[286] = (0xE4 ^ 0x8D) + (2 + 122 - 115 + 121) - (0x76 ^ 0x31) + (0xA3 ^ 0x92);
        L.lllIlIIlll[287] = -(0xFFFFE0E3 & 0x3F9E) & (0xFFFFFCFF & 0xB7EF);
        L.lllIlIIlll[288] = 0xFFFFB46D & 0xDFFF;
        L.lllIlIIlll[289] = 50 + 96 - 95 + 163;
        L.lllIlIIlll[290] = 178 + 90 - 90 + 2 + (110 + 125 - 97 + 64) - (0xFFFFF135 & 0xFCA) + (0x1D ^ 0x44);
        L.lllIlIIlll[291] = 98 + 75 - 55 + 45 + (0x3E ^ 0xB) - (0x7C ^ 0x62) + (0x29 ^ 0x37);
        L.lllIlIIlll[292] = (0xCF ^ 0xB7) + (0xC7 ^ 0x90) - (0xEA ^ 0xB4) + (0x72 ^ 0x1A);
        L.lllIlIIlll[293] = 85 + 22 - 48 + 120 + (0x9A ^ 0xAD) - (0xDE ^ 0x95) + (0x9F ^ 0xA4);
        L.lllIlIIlll[294] = -(0xFFFFDF39 & 0x24CF) & (0xFFFFFF7B & 0x64FF);
        L.lllIlIIlll[295] = (0x64 ^ 0x62) + (0xA8 ^ 0x94) - -(0x1D ^ 0x18) + (40 + 43 - -42 + 23);
        L.lllIlIIlll[296] = 61 + 18 - -80 + 55 + 1 - (87 + 44 - 77 + 124) + (59 + 21 - 70 + 173);
        L.lllIlIIlll[297] = 198 + 218 - 214 + 19;
        L.lllIlIIlll[298] = 73 + 21 - -110 + 18;
        L.lllIlIIlll[299] = 181 + 204 - 351 + 189;
        L.lllIlIIlll[300] = 165 + 194 - 183 + 48;
        L.lllIlIIlll[301] = 0xFFFFCFBD & 0x7CEF;
        L.lllIlIIlll[302] = 66 + 14 - 46 + 191;
        L.lllIlIIlll[303] = 62 + 125 - 135 + 174;
        L.lllIlIIlll[304] = (0xA0 ^ 0xB0) + (0xB9 ^ 0x81) - -(18 + 14 - -64 + 31) + (0x35 ^ 0x29);
        L.lllIlIIlll[305] = (0xC9 ^ 0xC2) + (11 + 99 - -7 + 57) - (0x7E ^ 0x75) + (0x2F ^ 0x19);
        L.lllIlIIlll[306] = 151 + 129 - 102 + 51;
        L.lllIlIIlll[307] = (0x33 ^ 0x45) + (41 + 13 - 43 + 126) - (153 + 166 - 301 + 216) + (34 + 124 - 99 + 150);
        L.lllIlIIlll[308] = 96 + 169 - 97 + 63;
        L.lllIlIIlll[309] = (0xB3 ^ 0xA8) + (0xE7 ^ 0xC5) - (0x31 ^ 0x2A) + (96 + 82 - 67 + 87);
        L.lllIlIIlll[310] = (0xFF ^ 0x90) + (32 + 165 - 49 + 27) - (185 + 105 - 117 + 78) + (126 + 110 - 100 + 62);
        L.lllIlIIlll[311] = 159 + 97 - 217 + 139 + (7 ^ 0x6A) - (167 + 41 - 117 + 108) + (82 + 142 - 196 + 118);
        L.lllIlIIlll[312] = 196 + 220 - 186 + 5;
        L.lllIlIIlll[313] = 28 + 54 - -135 + 19;
        L.lllIlIIlll[314] = 44 + 136 - 5 + 62;
        L.lllIlIIlll[315] = 94 + 110 - 126 + 160;
        L.lllIlIIlll[316] = 34 + 160 - 160 + 205;
        L.lllIlIIlll[317] = 100 + 158 - 176 + 158;
        L.lllIlIIlll[318] = 84 + 224 - 119 + 52;
        L.lllIlIIlll[319] = 146 + 186 - 227 + 137;
        L.lllIlIIlll[320] = 190 + 58 - 182 + 177;
        L.lllIlIIlll[321] = (0x6F ^ 0x65) + (91 + 65 - 90 + 147) - (21 + 95 - -24 + 44) + (76 + 73 - 10 + 66);
        L.lllIlIIlll[322] = 186 + 180 - 238 + 117;
        L.lllIlIIlll[323] = (0x69 ^ 0x26) + (67 + 81 - 49 + 137) - (0x46 ^ 0x2C) + (0xB3 ^ 0x96);
        L.lllIlIIlll[324] = 0xFFFFFF7F & 0x7FBF;
        L.lllIlIIlll[325] = 110 + 209 - 74 + 2;
        L.lllIlIIlll[326] = 120 + 24 - 40 + 105 + (0x57 ^ 0x65) - (93 + 173 - 123 + 87) + (13 + 16 - 24 + 214);
        L.lllIlIIlll[327] = 150 + 49 - 109 + 159;
        L.lllIlIIlll[328] = 108 + 8 - 79 + 109 + (73 + 47 - 86 + 99) - (102 + 82 - 61 + 52) + (77 + 16 - -10 + 43);
        L.lllIlIIlll[329] = 104 + 100 - 171 + 218;
        L.lllIlIIlll[330] = 106 + 19 - 75 + 202;
        L.lllIlIIlll[331] = (0xB6 ^ 0xA8) + (0xEB ^ 0x87) - -(0x17 ^ 0x34) + (0x70 ^ 0x20);
        L.lllIlIIlll[332] = 77 + 233 - 200 + 125 + (0 + 41 - -109 + 81) - (0xFFFFD17B & 0x2FCF) + (0xD6 ^ 0xA1);
        L.lllIlIIlll[333] = (0xAA ^ 0x9C) + (176 + 37 - 189 + 182) - (109 + 104 - 122 + 102) + (178 + 187 - 222 + 45);
        L.lllIlIIlll[334] = 0xFFFFB96A & 0x4795;
        L.lllIlIIlll[335] = -(0xFFFFBBFB & 0x741F) & (0xFFFFF7FB & 0x391F);
        L.lllIlIIlll[336] = 0xFFFFFFC5 & 0xEBF;
        L.lllIlIIlll[337] = -(0xFFFFAF6F & 0x73B7) & (0xFFFFFFB7 & 0x2FFE);
        L.lllIlIIlll[338] = -(0xFFFFFF7B & 0x6CFE) & (0xFFFFEDFF & 0x7F7B);
        L.lllIlIIlll[339] = 0xFFFFA1AF & 0x5F53;
        L.lllIlIIlll[340] = -(0xFFFFD2D3 & 0x7DBF) & (0xFFFFF59F & 0x5BF6);
        L.lllIlIIlll[341] = 0xFFFFCB67 & 0x359D;
        L.lllIlIIlll[342] = -(0xFFFFF1FB & 0x5EE6) & (0xFFFFDDE7 & 0x73FF);
        L.lllIlIIlll[343] = 0xFFFFC32F & 0x3DD7;
        L.lllIlIIlll[344] = -(0xFFFFACFD & 0x7B2A) & (0xFFFFEBEF & 0x3D3F);
        L.lllIlIIlll[345] = -(0xFFFFFFE3 & 0x207F) & (0xFFFFF1FF & 0x2F6B);
        L.lllIlIIlll[346] = 0xFFFF9D0B & 0x63FE;
        L.lllIlIIlll[347] = 0xFFFF938F & 0x6D7B;
        L.lllIlIIlll[348] = -(0xE5 ^ 0x87) & (0xFFFF9D7D & 0x63EF);
        L.lllIlIIlll[349] = 0xFFFFF39D & 0xD6F;
        L.lllIlIIlll[350] = -(0xFFFFFAFB & 0x5F97) & (0xFFFFFFFF & 0x7FF7);
        L.lllIlIIlll[351] = -(0xFFFFDBDB & 0x3C36) & (0xFFFFDD3F & 0x3BDF);
        L.lllIlIIlll[352] = -(0xFFFFBC9B & 0x5BE5) & (0xFFFFDBDF & 0x3FFF);
        L.lllIlIIlll[353] = 0xFFFFBB5F & 0x45AF;
        L.lllIlIIlll[354] = 0xFFFF8579 & 0x7B96;
        L.lllIlIIlll[355] = 0xFFFFDF11 & 0x21FF;
        L.lllIlIIlll[356] = 0xFFFFBB13 & 0x45FE;
        L.lllIlIIlll[357] = -(0xFFFFBF05 & 0x43FB) & (0xFFFFBFFF & 0xD77F);
        L.lllIlIIlll[358] = -(0xFFFF94B5 & 0x7B4B) & (0xFFFFFAFF & 0x757B);
        L.lllIlIIlll[359] = -(0xFFFFF4F5 & 0x7BEF) & (0xFFFFF9F7 & 0x77FF);
        L.lllIlIIlll[360] = -(0xFFFFFD4D & 0x76BB) & (0xFFFFF79E & 0x7D7D);
        L.lllIlIIlll[361] = 0xFFFFB595 & 0x4B7F;
        L.lllIlIIlll[362] = -(0xFFFF9FDB & 0x6E6D) & (0xFFFF9F5E & 0x6FFF);
        L.lllIlIIlll[363] = -(0xFFFFABDB & 0x7CE5) & (0xFFFFB9FF & 0x6FD7);
        L.lllIlIIlll[364] = 0xFFFFCBDB & 0x353C;
        L.lllIlIIlll[365] = 0xFFFFC7BD & 0x395B;
        L.lllIlIIlll[366] = -(0xFFFFF7FF & 0x7C65) & (0xFFFFFD7E & 0x77FF);
        L.lllIlIIlll[367] = -(0xFFFFFFF9 & 0x3E67) & (0xFFFFFF7B & 0x3FFF);
        L.lllIlIIlll[368] = -(0xFFFFDD79 & 0x7E87) & (0xFFFFDF7D & 0x7D9E);
        L.lllIlIIlll[369] = 0xFFFFB3FD & 0x4D1F;
        L.lllIlIIlll[370] = -(0xFFFFF9AF & 0x775B) & (0xFFFFF7FF & 0x7DBA);
        L.lllIlIIlll[371] = -(0xFFFFBE36 & 0x61EF) & (0xFFFFBF6F & Short.MAX_VALUE);
        L.lllIlIIlll[372] = 0xFFFF8F9E & 0x717F;
        L.lllIlIIlll[373] = 0xFFFFCB1F & 0x35FF;
        L.lllIlIIlll[374] = 0xFFFFFD3B & 0x3E4;
        L.lllIlIIlll[375] = -(0xFFFFFEDD & 0x4D7F) & (0xFFFFDFFE & 0x6F7D);
        L.lllIlIIlll[376] = -(0xFFFFFC93 & 0x57EF) & (0xFFFFF7EF & 0x5DB3);
        L.lllIlIIlll[377] = 0xFFFFB362 & 0x4DBF;
        L.lllIlIIlll[378] = 0xFFFFAFAF & 0x5173;
        L.lllIlIIlll[379] = 0xFFFFC9BE & 0x3765;
        L.lllIlIIlll[380] = -(0xFFFFB3DF & 0x7EBB) & (0xFFFFF7FF & 0x3BBF);
        L.lllIlIIlll[381] = -(0xFFFFFB83 & 0x3EFD) & (0xFFFFFBE7 & 0x3FBE);
        L.lllIlIIlll[382] = -(0xFFFFFFF9 & 0x188F) & (0xFFFF99FF & 0x7FAF);
        L.lllIlIIlll[383] = -(0xFFFFBB49 & 0x5CBE) & (0xFFFFFD6F & 0x1BBF);
        L.lllIlIIlll[384] = 0xFFFFCF7F & 0x3EEF;
        L.lllIlIIlll[385] = 0xFFFFEF7F & 0x1CE9;
        L.lllIlIIlll[386] = 0xFFFFE9EF & 0x1739;
        L.lllIlIIlll[387] = 0xFFFFFEE6 & 0xF5D;
        L.lllIlIIlll[388] = 0xFFFFFC9F & 0xFE9;
        L.lllIlIIlll[389] = -(0xFFFFFBE1 & 0x7EDF) & (0xFFFFFFEA & 0x7BFF);
        L.lllIlIIlll[390] = 0xFFFFCB7F & 0x35AB;
        L.lllIlIIlll[391] = -(0xFFFFD0D3 & 0x7F2D) & (0xFFFFD7BD & 0x796F);
        L.lllIlIIlll[392] = -(0xFFFFFF89 & 0x5AF7) & (0xFFFFDFEF & 0x7BBE);
        L.lllIlIIlll[393] = -(0xC5 ^ 0x84) & (0xFFFF97EF & 0x697F);
        L.lllIlIIlll[394] = 0xFFFF97F5 & 0x693A;
        L.lllIlIIlll[395] = -(0xFFFFFE5F & 0x3FA9) & (0xFFFFBF3D & 0x7FFB);
        L.lllIlIIlll[396] = -(0xFFFFFDEF & 0x1E92) & (0xFFFFBFBB & 0x5DF7);
        L.lllIlIIlll[397] = 0xFFFF8DF7 & 0x733B;
        L.lllIlIIlll[398] = 0xFFFFFDF7 & 0x33C;
        L.lllIlIIlll[399] = -(0xFFFFFFCB & 0x58FD) & (0xFFFFD9FD & Short.MAX_VALUE);
        L.lllIlIIlll[400] = -(0xFFFFFABF & 0x3F42) & (0xFFFFBFFF & 0x7B37);
        L.lllIlIIlll[401] = 0xFFFFC1B7 & 0x3F7F;
        L.lllIlIIlll[402] = 0xFFFF9D7F & 0x63B8;
        L.lllIlIIlll[403] = 0xFFFFE7FB & 0x1BE7;
        L.lllIlIIlll[404] = 0xFFFFCF7D & 0x31BB;
        L.lllIlIIlll[405] = 0xFFFF9E77 & 0x6F8F;
        L.lllIlIIlll[406] = 0xFFFF9F7E & 0x6CEB;
        L.lllIlIIlll[407] = 0xFFFFFE7F & 0xF88;
        L.lllIlIIlll[408] = -(0xFFFFF1B9 & 0x2FD7) & (0xFFFFADFF & 0x7FFD);
        L.lllIlIIlll[409] = -(0xFFFFF38E & 0x3EF7) & (0xFFFFFBBF & 0x37FF);
        L.lllIlIIlll[410] = 0xFFFF97BB & 0x697F;
        L.lllIlIIlll[411] = 0xFFFFE3FC & 0x1D3F;
        L.lllIlIIlll[412] = 0xFFFFA73D & 0x59FF;
        L.lllIlIIlll[413] = -(0xFFFFBDAD & 0x72F7) & (0xFFFFBFEF & 0x7EB7);
        L.lllIlIIlll[414] = 0xFFFFCCFC & 0x3F67;
        L.lllIlIIlll[415] = -(0xFFFFFC9F & 0x4F61) & (0xFFFFEDFF & 0x5F3E);
        L.lllIlIIlll[416] = 0xFFFFD53F & 0x2BFF;
        L.lllIlIIlll[417] = 0xFFFFC9C2 & 0x377D;
        L.lllIlIIlll[418] = -(0xFFFF9FBB & 0x71FE) & (0xFFFFBFBB & 0x5FFF);
        L.lllIlIIlll[419] = 0xFFFF9DDC & 0x6E7B;
        L.lllIlIIlll[420] = 0xFFFFBF1F & 0x4EF5;
        L.lllIlIIlll[421] = 0xFFFFED5B & 0x1EFF;
        L.lllIlIIlll[422] = 0xFFFFD9ED & 0x2753;
        L.lllIlIIlll[423] = -(0xFFFFF7E9 & 0x3CBF) & (0xFFFFB5EB & 0x7FFE);
        L.lllIlIIlll[424] = 0xFFFFA9E3 & 0x575F;
        L.lllIlIIlll[425] = -(0xFFFFE9BB & 0x7EEF) & (0xFFFFEFEF & 0x79FE);
        L.lllIlIIlll[426] = 0xFFFFD7CF & 0x2975;
        L.lllIlIIlll[427] = -(0xFFFFFFBF & 0x3EFA) & (0xFFFFFFFF & 0x3FFF);
        L.lllIlIIlll[428] = -(0xFFFFC469 & 0x7FBF) & (0xFFFFEDEF & 0x577F);
        L.lllIlIIlll[429] = -(0xFFFFFBDF & 0x76A7) & (0xFFFFFFDE & 0x73EF);
        L.lllIlIIlll[430] = -(116 + 43 - 146 + 154) & (0xFFFFD9EF & 0x27FF);
        L.lllIlIIlll[431] = -(0xFFFFFBF7 & 0x74D9) & (0xFFFFFEDE & Short.MAX_VALUE);
        L.lllIlIIlll[432] = -(0xFFFFF253 & 0x7DBD) & (0xFFFFFEDF & 0x7F3F);
        L.lllIlIIlll[433] = -(0x7A ^ 0x36) & (0xFFFFEFFF & 0x1E5F);
        L.lllIlIIlll[434] = -(0xFFFFC57D & 0x3BD3) & (0xFFFFCDFE & 0x3FDF);
        L.lllIlIIlll[435] = -(0xFFFFBDFB & 0x5366) & (0xFFFFFDF7 & 0x1FFF);
        L.lllIlIIlll[436] = -(0xFFFFD9FB & 0x278F) & (0xFFFFEFFF & 0x1FAB);
        L.lllIlIIlll[437] = -(0xFFFFDFED & 0x7157) & (0xFFFFFDDF & 0x5FF7);
        L.lllIlIIlll[438] = -(0x71 ^ 0x30) & (0xFFFF9DFE & 0x6ED3);
        L.lllIlIIlll[439] = -(0xFFFFFA2F & 0x55D3) & (0xFFFFDE5F & 0x7FBF);
        L.lllIlIIlll[440] = 0xFFFFAF9E & 0x5CE9;
        L.lllIlIIlll[441] = -(0xFFFFB9E3 & 0x67DF) & (0xFFFFBFFB & 0x6FEF);
        L.lllIlIIlll[442] = -(0xFFFFBF29 & 0x63DF) & (0xFFFFBFBD & 0x6FDF);
        L.lllIlIIlll[443] = 0xFFFFBEDF & 0x4F26;
        L.lllIlIIlll[444] = 0xFFFFAD7F & 0x5EFE;
        L.lllIlIIlll[445] = -(0xFFFFB8EF & 0x77FD) & (0xFFFFBEFF & 0x7FFC);
        L.lllIlIIlll[446] = -(0xFFFFF77B & 0x6A9D) & (0xFFFFEFBF & 0x7EDD);
        L.lllIlIIlll[447] = 0xFFFFDE1F & 0x2FED;
        L.lllIlIIlll[448] = 0xFFFFCFAF & 0x3CDD;
        L.lllIlIIlll[449] = 0xFFFF9EED & 0x6F1B;
        L.lllIlIIlll[450] = 0xFFFF8F1F & 0x7EF1;
        L.lllIlIIlll[451] = -(0xFFFFFCE3 & 0x533D) & (0xFFFFDEBD & 0x7F7B);
        L.lllIlIIlll[452] = -(0xFFFFD1EB & 0x2F35) & (0xFFFFFF3F & 0xFFB);
        L.lllIlIIlll[453] = -3 & (0xFFFFCEFA & 0x3F1F);
        L.lllIlIIlll[454] = 0xFFFFDFEF & 0x2C91;
        L.lllIlIIlll[455] = -(0xFFFFF7DD & 0x7B23) & (0xFFFFFFFF & 0x7F7F);
        L.lllIlIIlll[456] = 0xFFFFEEAF & 0x1F75;
        L.lllIlIIlll[457] = 0xFFFFFE77 & 0xFAE;
        L.lllIlIIlll[458] = 0xFFFFEF9F & 0x1CEA;
        L.lllIlIIlll[459] = 0xFFFFCE2C & 0x3FF7;
        L.lllIlIIlll[460] = 0xFFFFECB5 & 0x1FDB;
        L.lllIlIIlll[461] = -(0xFFFFE35E & 0x7DEB) & (0xFFFFEFFF & 0x7F7D);
        L.lllIlIIlll[462] = 0xFFFFCDF6 & 0x3EB9;
        L.lllIlIIlll[463] = 0xFFFF93DE & 0x6D6B;
        L.lllIlIIlll[464] = 0xFFFFF95B & 0x7EF;
        L.lllIlIIlll[465] = -(0xFFFFECDF & 0x1BB3) & (0xFFFFBDDE & 0x4BFF);
        L.lllIlIIlll[466] = 0xFFFFC9FD & 0x374F;
        L.lllIlIIlll[467] = 0xFFFFE56F & 0x1BDE;
        L.lllIlIIlll[468] = 0xFFFFD77F & 0x29CF;
        L.lllIlIIlll[469] = 0xFFFFC797 & 0x7EFE;
        L.lllIlIIlll[470] = 0xFFFFDD75 & 0x23DA;
        L.lllIlIIlll[471] = 0xFFFFBDD5 & 0x437B;
        L.lllIlIIlll[472] = -(0xFFFFBE9F & 0x7FED) & (0xFFFFBFDF & 0x7FFE);
        L.lllIlIIlll[473] = 0xFFFFF79C & 0x4EFB;
        L.lllIlIIlll[474] = 0xFFFFC95F & 0x37F3;
        L.lllIlIIlll[475] = 0xFFFFFBDF & 0x574;
        L.lllIlIIlll[476] = -(0xFFFFFAA1 & 0xFDF) & (0xFFFFABF7 & 0x5FDD);
        L.lllIlIIlll[477] = -(0xFFFFF6CD & 0x2F3B) & (0xFFFFFF5F & 0x27FE);
        L.lllIlIIlll[478] = 0xFFFF99DF & 0x6777;
        L.lllIlIIlll[479] = -(0xFFFFACFE & 0x7F09) & (0xFFFFAFFF & 0x7D5F);
        L.lllIlIIlll[480] = 0xFFFF917F & 0x6FD9;
        L.lllIlIIlll[481] = -(0xFFFFC9BE & 0x3F69) & (0xFFFFCFFF & 0x7FF7);
        L.lllIlIIlll[482] = 0xFFFFF57B & 0xBDE;
        L.lllIlIIlll[483] = 0xFFFFE3DB & 0x1D7F;
        L.lllIlIIlll[484] = 0xFFFFDED3 & 0x67FD;
        L.lllIlIIlll[485] = 0xFFFFB7FC & 0x495F;
        L.lllIlIIlll[486] = -(0xFFFFFFB9 & 0x7E67) & (0xFFFFFF7D & Short.MAX_VALUE);
        L.lllIlIIlll[487] = -(0xFFFFFE93 & 0x7FED) & (0xFFFFFFDE & Short.MAX_VALUE);
        L.lllIlIIlll[488] = 0xFFFFB97F & 0x47DF;
        L.lllIlIIlll[489] = -(0xFFFFFB5B & 0x76B6) & (0xFFFFF3FD & 0x7F73);
        L.lllIlIIlll[490] = -(0xFFFFE4CB & 0x5F3F) & (0xFFFFED7B & 0x57EF);
        L.lllIlIIlll[491] = 0xFFFFD56B & 0x2BF6;
        L.lllIlIIlll[492] = 0xFFFF8963 & 0x77FF;
        L.lllIlIIlll[493] = 0xFFFF91FD & 0x6F66;
        L.lllIlIIlll[494] = -(0xFFFFDDD5 & 0x7A3B) & (0xFFFFDB7F & 0x7DF5);
        L.lllIlIIlll[495] = -(0xFFFFE69E & 0x5BEB) & (0xFFFFD7EF & 0x6BFF);
        L.lllIlIIlll[496] = -(0xFFFFF699 & 0x7B7F) & (0xFFFFF3FF & 0x7F7F);
        L.lllIlIIlll[497] = 0xFFFFBF6F & 0x41F8;
        L.lllIlIIlll[498] = 0xFFFFAFE9 & 0x517F;
        L.lllIlIIlll[499] = -(0xFFFFD4F7 & 0x3B9E) & (0xFFFFD7FF & 0x39FF);
        L.lllIlIIlll[500] = 0xFFFFB36F & 0x4DFB;
        L.lllIlIIlll[501] = 0xFFFF816D & 0x7FFE;
        L.lllIlIIlll[502] = 0xFFFF976D & 0x69FF;
        L.lllIlIIlll[503] = -(0xFFFFA931 & 0x5FDF) & (0xFFFFEFF3 & 0x5FBF);
        L.lllIlIIlll[504] = 0xFFFFFDFF & 0x36E;
        L.lllIlIIlll[505] = 0xFFFF8DEF & 0x737F;
        L.lllIlIIlll[506] = -(0xFFFFFD8D & 0x6EFF) & (0xFFFFEDFD & 0x7FFE);
        L.lllIlIIlll[507] = -(0xFFFFDEFF & 0x7189) & (0xFFFFFBFB & 0x55FD);
        L.lllIlIIlll[508] = -(0xFFFFAD8E & 0x72FB) & (0xFFFFF7FB & 0x29FF);
        L.lllIlIIlll[509] = 0xFFFFB173 & 0x4FFF;
        L.lllIlIIlll[510] = 0xFFFFE77C & 0x19F7;
        L.lllIlIIlll[511] = 0xFFFFBB75 & 0x45FF;
        L.lllIlIIlll[512] = -(0xFFFFEE7B & 0x7F86) & (0xFFFFEF7F & 0x7FF7);
        L.lllIlIIlll[513] = -(0xFFFFEF3D & 0x7CCB) & (0xFFFFFFFF & 0x6D7F);
        L.lllIlIIlll[514] = 0xFFFFFFFB & 0x17C;
        L.lllIlIIlll[515] = 0xFFFFD1FB & 0x2F7D;
        L.lllIlIIlll[516] = -(0xFFFFF39B & 0x7C66) & (0xFFFFF7FB & 0x797F);
        L.lllIlIIlll[517] = 0xFFFFB5FF & 0x4B7B;
        L.lllIlIIlll[518] = 0xFFFFE97E & 0x17FD;
        L.lllIlIIlll[519] = -(0xFFFFBFF3 & 0x628F) & (0xFFFFFBFF & 0x27FF);
        L.lllIlIIlll[520] = -(0xFFFFB457 & 0x7FAA) & (0xFFFFF7FF & 0x3D7F);
        L.lllIlIIlll[521] = 0xFFFFF17F & 0xFFF;
        L.lllIlIIlll[522] = -(0xFFFFF336 & 0x1CFD) & (0xFFFFBFF3 & 0x51BF);
        L.lllIlIIlll[523] = -(0xFFFFFA5F & 0x5DFA) & (0xFFFFD9FB & 0x7FDF);
        L.lllIlIIlll[524] = -(0xFFFFFBF7 & 0xD59) & (0xFFFFFFF9 & 0x4FFF);
        L.lllIlIIlll[525] = 0xFFFFB3E3 & 0x4D9F;
        L.lllIlIIlll[526] = -(0xFFFFFEF3 & 0x556D) & (0xFFFFD5F6 & 0x7FED);
        L.lllIlIIlll[527] = 0xFFFFF38D & 0xDF7;
        L.lllIlIIlll[528] = -(0xFFFFEDED & 0x7E5B) & (0xFFFFFFCF & 0x6DFE);
        L.lllIlIIlll[529] = -(0xFFFFE6BD & 0x5B73) & (0xFFFFC7B7 & 0x7BFF);
        L.lllIlIIlll[530] = -(0xFFFFFE7E & 0x43F7) & (0xFFFFE3FD & 0x5FFF);
        L.lllIlIIlll[531] = -(0xFFFFBAFD & 0x5F73) & (0xFFFFDFFD & 0x3BFB);
        L.lllIlIIlll[532] = 0xFFFFB3CE & 0x4DBB;
        L.lllIlIIlll[533] = 0xFFFFC1DB & 0x3FAF;
        L.lllIlIIlll[534] = 0xFFFFF78E & 0x9FD;
        L.lllIlIIlll[535] = -(0xFFFFF773 & 0x2AED) & (0xFFFFBFFD & 0x63EF);
        L.lllIlIIlll[536] = 0xFFFFC3AF & 0x3DDE;
        L.lllIlIIlll[537] = 0xFFFFDBDF & 0x25AF;
        L.lllIlIIlll[538] = -(0xFFFFD33F & 0x3ECA) & (0xFFFFD3FB & 0x3F9D);
        L.lllIlIIlll[539] = 0xFFFFF7BD & 0x4EEF;
        L.lllIlIIlll[540] = -(0xFFFFFEBD & 0x676F) & (0xFFFFEFBF & 0x77FD);
        L.lllIlIIlll[541] = -(0xFFFFDE7B & 0x7FEE) & (0xFFFFFFFB & 0x5FFF);
        L.lllIlIIlll[542] = -(0xFFFFEE6F & 0x1FF5) & (0xFFFFEFF7 & 0x1FFF);
        L.lllIlIIlll[543] = 0xFFFFB7FF & 0x4994;
        L.lllIlIIlll[544] = 0xFFFF83B5 & 0x7DDF;
        L.lllIlIIlll[545] = -(0xFFFFDFFE & 0x3E63) & (0xFFFFBFF7 & 0x5FFF);
        L.lllIlIIlll[546] = 0xFFFF8BBF & 0x75D7;
        L.lllIlIIlll[547] = 0xFFFFBFBE & 0x41D9;
        L.lllIlIIlll[548] = 0xFFFFEDBB & 0x13DD;
        L.lllIlIIlll[549] = 0xFFFFDFF7 & 0x66B9;
        L.lllIlIIlll[550] = 0xFFFFF5DE & 0xBBB;
        L.lllIlIIlll[551] = 0xFFFFA59F & 0x5BFB;
        L.lllIlIIlll[552] = 0xFFFFDD9C & 0x23FF;
        L.lllIlIIlll[553] = 0xFFFFD3BF & 0x2DDD;
        L.lllIlIIlll[554] = -(0xFFFFBCC3 & 0x7B7D) & (0xFFFFB9FF & 0x7FDE);
        L.lllIlIIlll[555] = 0xFFFFD1FF & 0x2F9F;
        L.lllIlIIlll[556] = 0xFFFFB5B9 & 0x4BE6;
        L.lllIlIIlll[557] = -(0xFFFFEF53 & 0x5AFF) & (0xFFFFEBFF & 0x5FF3);
        L.lllIlIIlll[558] = 0xFFFFF1BB & 0xFE6;
        L.lllIlIIlll[559] = -(0xFFFFFF4F & 0x78F1) & (0xFFFFFFE7 & 0x79FB);
        L.lllIlIIlll[560] = 0xFFFF9DAE & 0x63F5;
        L.lllIlIIlll[561] = -(0xFFFFFC1F & 0x6FFB) & (0xFFFFFFFF & 0x6DBF);
        L.lllIlIIlll[562] = 0xFFFF85F6 & 0x7BAF;
        L.lllIlIIlll[563] = -(0xFFFFF9BF & 0x7E49) & (0xFFFFFDEF & 0x7BBF);
        L.lllIlIIlll[564] = -(0xFFFFDF77 & 0x3CDB) & (0xFFFFBDFA & 0x5FFF);
        L.lllIlIIlll[565] = -(0xFFFFFB5F & 0x34F5) & (0xFFFFFFFF & 0x31FD);
        L.lllIlIIlll[566] = 0xFFFF97EA & 0x69BF;
        L.lllIlIIlll[567] = -(0xFFFFDEB9 & 0x6D57) & (0xFFFFEFBF & 0x5DFB);
        L.lllIlIIlll[568] = -(0xFFFFFF6F & 0x7C94) & (0xFFFFFFBF & 0x7DEF);
        L.lllIlIIlll[569] = 0xFFFFCFEF & 0x31BD;
        L.lllIlIIlll[570] = -(0xFFFFB757 & 0x7EF9) & (0xFFFFB7FF & 0x7FFE);
        L.lllIlIIlll[571] = 0xFFFFBBEF & 0x45BF;
        L.lllIlIIlll[572] = -(0xFFFFDC5E & 0x7FE7) & (0xFFFFDDFF & 0x7FF5);
        L.lllIlIIlll[573] = -(0xFFFF97CF & 0x7A3F) & (0xFFFF9FFF & 0x73BF);
        L.lllIlIIlll[574] = -(0xFFFFF61B & 0x19EE) & (0xFFFFDDFF & 0x33BB);
        L.lllIlIIlll[575] = 0xFFFFDEB7 & 0x2F6F;
        L.lllIlIIlll[576] = 0xFFFFAED7 & 0x5DBF;
        L.lllIlIIlll[577] = 0xFFFFA5BF & 0x5BF3;
        L.lllIlIIlll[578] = -(0xFFFFCF93 & 0x316F) & (0xFFFFDFFF & 0x67BF);
        L.lllIlIIlll[579] = -(0xFFFFDAF9 & 0x7F07) & (0xFFFFDFF6 & 0x7BBD);
        L.lllIlIIlll[580] = -(0xFFFFDDCF & 0x33BD) & (0xFFFF9FFF & 0x7FAF);
        L.lllIlIIlll[581] = -(0xFFFFB965 & 0x57DB) & (0xFFFFDDFA & 0x3FDF);
        L.lllIlIIlll[582] = 0xFFFFFFFF & 0xC9E;
        L.lllIlIIlll[583] = 0xFFFFEDBD & 0x13F7;
        L.lllIlIIlll[584] = -(0xFFFFB1D5 & 0x6F6B) & (0xFFFFF7FF & 0x6FFF);
        L.lllIlIIlll[585] = -(0xFFFFDAD3 & 0x7F6E) & (0xFFFFDBFF & 0x7FF7);
        L.lllIlIIlll[586] = -(0xFFFFDFED & 0x7253) & (0xFFFFFFF0 & 0x5EEF);
        L.lllIlIIlll[587] = 0xFFFF8E2E & 0x7FF9;
        L.lllIlIIlll[588] = 0xFFFFEEFF & 0x1DA8;
        L.lllIlIIlll[589] = -(0xFFFFD5FF & 0x7A49) & (0xFFFFFDFF & 0x53FF);
        L.lllIlIIlll[590] = -(0xFFFFF3FD & 0x3D1F) & (0xFFFFF7DD & Short.MAX_VALUE);
        L.lllIlIIlll[591] = 0xFFFFD3BF & 0x2DF8;
        L.lllIlIIlll[592] = -(0xFFFFB73B & 0x6BCE) & (0xFFFFBFAF & 0x6FFF);
        L.lllIlIIlll[593] = -(0xFFFF9F7F & 0x63CB) & (0xFFFF9FEF & 0x6FFF);
        L.lllIlIIlll[594] = 0xFFFFFDBB & 0x3FD;
        L.lllIlIIlll[595] = 0xFFFFDBBA & 0x25FF;
        L.lllIlIIlll[596] = -(0xFFFFB8D9 & 0x6F67) & (0xFFFFFBFB & 0x2DFF);
        L.lllIlIIlll[597] = 0xFFFFF5FD & 0xBBE;
        L.lllIlIIlll[598] = 0xFFFF89BD & 0x77FF;
        L.lllIlIIlll[599] = -(0xFFFFFC5F & 0x3BE2) & (0xFFFFBDFF & 0x7BFF);
        L.lllIlIIlll[600] = -(0xFFFFC6A5 & 0x3D5B) & (0xFFFF8FBF & 0x75FF);
        L.lllIlIIlll[601] = -(0xFFFFFE35 & 0x5FFF) & (0xFFFFFFFD & 0x5FF6);
        L.lllIlIIlll[602] = -(0xFFFFEF77 & 0x7EBB) & (0xFFFFFFF7 & 0x6FFB);
        L.lllIlIIlll[603] = 0xFFFF89EB & 0x77D6;
        L.lllIlIIlll[604] = -(0xFFFF99B9 & 0x7F7F) & (0xFFFFDFFD & 0x7FFE);
        L.lllIlIIlll[605] = 0xFFFFC1C3 & 0x3FFF;
        L.lllIlIIlll[606] = 0xFFFFDDEC & 0x23D7;
        L.lllIlIIlll[607] = -(0xFFFFFFE7 & 0x3C3B) & (0xFFFFFDFF & 0x3FE7);
        L.lllIlIIlll[608] = -(0xFFFFEA3D & 0x7FFB) & (0xFFFFFBFF & 0x6FFE);
        L.lllIlIIlll[609] = 0xFFFFDDC7 & 0x23FF;
        L.lllIlIIlll[610] = -(0xFFFFFB1E & 0x56F7) & (0xFFFFDBFF & 0x77DD);
        L.lllIlIIlll[611] = 0xFFFFAFCD & 0x51FB;
        L.lllIlIIlll[612] = -(0xFFFFE879 & 0x3FB7) & (0xFFFFBBFE & 0x6DFB);
        L.lllIlIIlll[613] = 0xFFFFA5EF & 0x5BDB;
        L.lllIlIIlll[614] = 0xFFFFCDFE & 0x3EB7;
        L.lllIlIIlll[615] = -(0xFFFFFD06 & 0x73FF) & (0xFFFFFFFF & 0x7F37);
        L.lllIlIIlll[616] = 0xFFFF8DED & 0x7EF7;
        L.lllIlIIlll[617] = 0xFFFFAE3F & 0x5FF6;
        L.lllIlIIlll[618] = -(0xFFFFD199 & 0x7E7E) & (0xFFFFFFFF & 0x5CFF);
        L.lllIlIIlll[619] = 0xFFFFAF7F & 0x5EB3;
        L.lllIlIIlll[620] = -(0xFFFFE19D & 0x3F77) & (0xFFFFFDFD & 0x2FFF);
        L.lllIlIIlll[621] = 0xFFFFDE77 & 0x2FBF;
        L.lllIlIIlll[622] = -(0xFFFFB3FD & 0x6D43) & (0xFFFFAF7A & Short.MAX_VALUE);
        L.lllIlIIlll[623] = 0xFFFFEF78 & 0x1EBF;
        L.lllIlIIlll[624] = -(0xFFFFC997 & 0x77ED) & (0xFFFFCFFD & 0x7FB6);
        L.lllIlIIlll[625] = -(0xFFFFF355 & 0x6FAB) & (0xFFFFEFFE & 0x7FBB);
        L.lllIlIIlll[626] = -(0xFFFFFD03 & 0x4AFD) & (0xFFFFCDCF & 0x7BFC);
        L.lllIlIIlll[627] = -(0xFFFFDC75 & 0x77BB) & (0xFFFFFDFD & 0x57FF);
        L.lllIlIIlll[628] = 0xFFFFA3FE & 0x5DCF;
        L.lllIlIIlll[629] = -(0xFFFFFB3B & 0x3EF5) & (0xFFFFBBFF & Short.MAX_VALUE);
        L.lllIlIIlll[630] = -(0xFFFFDCFF & 0x2F2A) & (0xFFFFBDFF & 0x4FF9);
        L.lllIlIIlll[631] = -(0xFFFFEB29 & 0x7EFF) & (0xFFFFFBFB & 0x6FFD);
        L.lllIlIIlll[632] = -(0xFFFFF689 & 0x7977) & (0xFFFFFEFF & 0x7F3B);
        L.lllIlIIlll[633] = 0xFFFFBEFB & 0x4DEE;
        L.lllIlIIlll[634] = -(0xFFFFF57F & 0x6A8D) & (0xFFFFE1DF & 0x7FFE);
        L.lllIlIIlll[635] = 0xFFFF81F7 & 0x7FDB;
        L.lllIlIIlll[636] = 0xFFFFA9FE & 0x57D5;
        L.lllIlIIlll[637] = 0xFFFFDBDD & 0x25F7;
        L.lllIlIIlll[638] = 0xFFFF91D7 & 0x6FFE;
        L.lllIlIIlll[639] = 0xFFFFD7DF & 0x29F7;
        L.lllIlIIlll[640] = -(0xFFFFFAE3 & 0x5D1E) & (0xFFFFFFD9 & 0x59FF);
        L.lllIlIIlll[641] = -(0xFFFFECB7 & 0x5F6F) & (0xFFFFFFFF & 0x4DFF);
        L.lllIlIIlll[642] = 0xFFFFB7DF & 0x49FA;
        L.lllIlIIlll[643] = -(0xFFFFD687 & 0x7D79) & (0xFFFFDDDF & 0x77FB);
        L.lllIlIIlll[644] = -(0xFFFFB77F & 0x7EA4) & (0xFFFFBFFF & 0x77FF);
        L.lllIlIIlll[645] = 0xFFFFDBDF & 0x25FD;
        L.lllIlIIlll[646] = -(0xFFFFDA23 & 0x6FFD) & (0xFFFFDBFE & 0x6FFF);
        L.lllIlIIlll[647] = 0xFFFFA5FF & 0x5BDF;
        L.lllIlIIlll[648] = 0xFFFFF5FA & 0xBE5;
        L.lllIlIIlll[649] = 0xFFFFCDFB & 0x33E5;
        L.lllIlIIlll[650] = 0xFFFFE7EF & 0x19F2;
        L.lllIlIIlll[651] = 0xFFFFE9FF & 0x17E3;
        L.lllIlIIlll[652] = -(0xFFFF9A4B & 0x7FBF) & (0xFFFF9BFE & 0x7FEF);
        L.lllIlIIlll[653] = -(0xFFFFFFFB & 0x3E1F) & (0xFFFFBFFF & Short.MAX_VALUE);
        L.lllIlIIlll[654] = 0xFFFF9BF7 & 0x65EE;
        L.lllIlIIlll[655] = 0xFFFF99FF & 0x67E7;
        L.lllIlIIlll[656] = 0xFFFF8DE8 & 0x73FF;
        L.lllIlIIlll[657] = 0xFFFFE7ED & 0x19FB;
        L.lllIlIIlll[658] = -(0xFFFFE9BD & 0x5643) & (0xFFFFE9EF & 0x57FA);
        L.lllIlIIlll[659] = -(0xFFFFEFFB & 0x7A15) & (0xFFFFFFFF & 0x6BFB);
        L.lllIlIIlll[660] = 0xFFFF83FD & 0x7DEE;
        L.lllIlIIlll[661] = 0xFFFFA9FF & 0x57ED;
        L.lllIlIIlll[662] = 0xFFFFC9EE & 0x37FF;
        L.lllIlIIlll[663] = 0xFFFFB9FF & 0x47EF;
        L.lllIlIIlll[664] = 0xFFFF8BF6 & 0x75F9;
        L.lllIlIIlll[665] = -(0xFFFFDEDF & 0x7F2F) & (0xFFFFFFFF & 0x5FFF);
        L.lllIlIIlll[666] = 0xFFFF87FB & 0x79F6;
        L.lllIlIIlll[667] = 0xFFFF8FF7 & 0x71FB;
        L.lllIlIIlll[668] = 0xFFFFABF4 & 0x55FF;
        L.lllIlIIlll[669] = 0xFFFFDDD6 & 0x3679;
        L.lllIlIIlll[670] = -(0xFFFFDFE7 & 0x7E1B) & (0xFFFFDFF7 & Short.MAX_VALUE);
        L.lllIlIIlll[671] = 0xFFFFFDFE & 0x3F7;
        L.lllIlIIlll[672] = -1 & (0xFFFF93FF & 0x6DF7);
        L.lllIlIIlll[673] = -(0xFFFFED27 & 0x3EDC) & (0xFFFFEFFB & 0x3DFF);
        L.lllIlIIlll[674] = -(0xFFFFF41F & 0x7BE3) & (0xFFFFFFFB & 0x71FF);
        L.lllIlIIlll[675] = 0xFFFFABFF & 0x55FA;
        L.lllIlIIlll[676] = 0xFFFFB3FF & 0x4DFB;
        L.lllIlIIlll[677] = 0xFFFFA1FE & 0x5FFD;
        L.lllIlIIlll[678] = -(0xFFFFEF97 & 0x366B) & (0xFFFFEFFF & 0x37FF);
        L.lllIlIIlll[679] = -(0xFFFFFF03 & 0x6CFE) & (0xFFFFEFFF & 0x7DFF);
        L.lllIlIIlll[680] = -(0xFFFFF4CD & 0x7F33) & (0xFFFFFDFF & 0x77FF);
        L.lllIlIIlll[681] = -(0xFFFFEBF6 & 0x7CBF) & (0xFFFFFAFF & 0x6FB5);
        L.lllIlIIlll[682] = -(0xFFFFBCF3 & 0x773F) & (0xFFFFBF37 & 0x76FB);
        L.lllIlIIlll[683] = -(0xFFFFFFDE & 0x70F3) & (0xFFFFF7F3 & 0x7ADF);
        L.lllIlIIlll[684] = 0xFFFF9B33 & 0x66CF;
        L.lllIlIIlll[685] = -(0xFFFFBEF4 & 0x79BF) & (0xFFFFBEB7 & 0x7BFF);
        L.lllIlIIlll[686] = 0xFFFF864D & 0x7BB7;
        L.lllIlIIlll[687] = -(0xFFFFD6F9 & 0x3D97) & (0xFFFF9FBE & 0x76D7);
        L.lllIlIIlll[688] = 0xFFFFDE37 & 0x23CF;
        L.lllIlIIlll[689] = -(0xFFFFFDFF & 0x7772) & (0xFFFFFF79 & 0x77FF);
        L.lllIlIIlll[690] = 0xFFFF874B & 0x7ABD;
        L.lllIlIIlll[691] = -(0xFFFFBCDD & 0x6FB7) & (0xFFFFBFDF & 0x6EBE);
        L.lllIlIIlll[692] = -(0xFFFFEDFF & 0x7FD5) & (0xFFFFFFDF & 0x6FFF);
        L.lllIlIIlll[693] = 0xFFFFC27F & 0x3F8C;
        L.lllIlIIlll[694] = 0xFFFF821D & 0x7FEF;
        L.lllIlIIlll[695] = 0xFFFFE3BF & 0x1E4E;
        L.lllIlIIlll[696] = -(0xFFFFB573 & 0x7ECD) & (0xFFFFF74F & 0x3EFF);
        L.lllIlIIlll[697] = 0xFFFF96DF & 0x6B30;
        L.lllIlIIlll[698] = 0xFFFF8213 & 0x7FFD;
        L.lllIlIIlll[699] = -(0xFFFFFFFF & 0x710D) & (0xFFFFF7BE & 0x7B5F);
        L.lllIlIIlll[700] = -(0xFFFFB747 & 0x69FD) & (0xFFFFA35F & 0x7FF7);
        L.lllIlIIlll[701] = 0xFFFF83D7 & 0x7E3C;
        L.lllIlIIlll[702] = 0xFFFF8F5F & 0x72B5;
        L.lllIlIIlll[703] = -(0xFFFFE7FB & 0x7DAD) & (0xFFFFEFFF & 0x77BE);
        L.lllIlIIlll[704] = 0xFFFFCEB7 & 0x335F;
        L.lllIlIIlll[705] = 0xFFFFE7BC & 0x1A5B;
        L.lllIlIIlll[706] = 0xFFFFC39D & 0x3E7B;
        L.lllIlIIlll[707] = 0xFFFFDB1F & 0x26FA;
        L.lllIlIIlll[708] = -(0xFFFFBD0D & 0x5FF7) & (0xFFFFBF9F & 0x5F7F);
        L.lllIlIIlll[709] = 0xFFFF8B1D & 0x76FE;
        L.lllIlIIlll[710] = 0xFFFF9ABF & 0x675D;
        L.lllIlIIlll[711] = 0xFFFFA7BF & 0x5A5E;
        L.lllIlIIlll[712] = -(0xFFFFFDF7 & 0x1FC9) & (0xFFFFFFFF & 0x1FDF);
        L.lllIlIIlll[713] = 0xFFFFA32A & 0x5EF5;
        L.lllIlIIlll[714] = 0xFFFFFF75 & 0x2AB;
        L.lllIlIIlll[715] = 0xFFFF8F2B & 0x72F6;
        L.lllIlIIlll[716] = -(0xFFFFFC6D & 0x2BDF) & (0xFFFFEB6F & 0x3EFF);
        L.lllIlIIlll[717] = -(0xFFFFFBFC & 0x6C5F) & (0xFFFFEA7F & Short.MAX_VALUE);
        L.lllIlIIlll[718] = -(0xFFFFDFFB & 0x7D5F) & (0xFFFFDFFF & 0x7F7F);
        L.lllIlIIlll[719] = 0xFFFFBB67 & 0x46BE;
        L.lllIlIIlll[720] = -(0xFFFFF459 & Short.MAX_VALUE) & (0xFFFFF7FF & 0x7E7F);
        L.lllIlIIlll[721] = -(0xFFFFBB67 & 0x5D9E) & (0xFFFF9F3D & 0x7BEF);
        L.lllIlIIlll[722] = 0xFFFF8E39 & 0x73EF;
        L.lllIlIIlll[723] = -(0xFFFFDDF3 & 0x7F4D) & (0xFFFFDF7B & 0x7FEF);
        L.lllIlIIlll[724] = 0xFFFF8F3E & 0x72ED;
        L.lllIlIIlll[725] = -(0xFFFFDD93 & 0x6EEF) & (0xFFFFEEFF & 0x5FAF);
        L.lllIlIIlll[726] = -(0xFFFFFE6A & 0x65D7) & (0xFFFFF77F & 0x6EEF);
        L.lllIlIIlll[727] = -(0xFFFF95D1 & 0x6FFF) & (0xFFFF97FF & 0x6FFF);
        L.lllIlIIlll[728] = -(0xFFFFBFFD & 0x6DC7) & (0xFFFFEFF4 & 0x3FFF);
        L.lllIlIIlll[729] = -(0xFFFFB1DF & 0x6EE3) & (0xFFFFFEFB & 0x23F7);
        L.lllIlIIlll[730] = -(0xFFFFCFDF & 0x74ED) & (0xFFFFCFFE & 0x76FF);
        L.lllIlIIlll[731] = 0xFFFF83BB & 0x7E77;
        L.lllIlIIlll[732] = 0xFFFF9A3F & 0x67F5;
        L.lllIlIIlll[733] = -(0xFFFFFED3 & 0x2DEE) & (0xFFFFFFFF & 0x2EF7);
        L.lllIlIIlll[734] = -(0xFFFFDD2B & 0x6BDD) & (0xFFFFDF7F & 0x6BBF);
        L.lllIlIIlll[735] = -(0xFFFFFDDF & 0x63A2) & (0xFFFFF3BF & 0x6FF9);
        L.lllIlIIlll[736] = -(0xFFFFFDD1 & 0x3B6F) & (0xFFFFFF7B & 0x3BFD);
        L.lllIlIIlll[737] = 0xFFFFF2BB & 0xF7E;
        L.lllIlIIlll[738] = 0xFFFF8BFF & 0x763B;
        L.lllIlIIlll[739] = 0xFFFF827C & 0x7FBF;
        L.lllIlIIlll[740] = -(0xFFFFF9D1 & 0x5EEF) & (0xFFFFDAFD & Short.MAX_VALUE);
        L.lllIlIIlll[741] = 0xFFFFEFBE & 0x127F;
        L.lllIlIIlll[742] = -(0xFFFFB5DF & 0x7A61) & (0xFFFFFE7F & 0x33FF);
        L.lllIlIIlll[743] = 0xFFFF83DE & 0x7E61;
        L.lllIlIIlll[744] = -(0xFFFFAEDF & 0x7DBD) & (0xFFFFEEDD & 0x3FFF);
        L.lllIlIIlll[745] = 0xFFFFCFFF & 0x3242;
        L.lllIlIIlll[746] = 0xFFFFDA43 & 0x27FF;
        L.lllIlIIlll[747] = -(0xFFFFF7AF & 0x68F1) & (0xFFFFE2ED & 0x7FF6);
        L.lllIlIIlll[748] = -(0xFFFFF4DB & 0x7FAF) & (0xFFFFF6EF & 0x7FDF);
        L.lllIlIIlll[749] = -(0xFFFFFEDF & 0x2B24) & (0xFFFFFEFF & 0xBF77);
        L.lllIlIIlll[750] = -(0xFFFFF7EF & 0x4811) & (0xFFFFCEDF & 0x7366);
        L.lllIlIIlll[751] = 0xFFFF875F & 0x7AE7;
        L.lllIlIIlll[752] = -(0xFFFFB5BB & 0x5FF7) & (0xFFFF9FFB & 0x77FE);
        L.lllIlIIlll[753] = -(0xFFFFE3BF & 0x7DD5) & (0xFFFFF3FF & 0x6FDD);
        L.lllIlIIlll[754] = -(0xFFFFFDB1 & 0x2F5F) & (0xFFFFFF7E & 0x2FDB);
        L.lllIlIIlll[755] = -(0xFFFFDF87 & 0x6A7A) & (0xFFFFFFFD & 0x5F7F);
        L.lllIlIIlll[756] = 0xFFFFE7E8 & 0x79BF;
        L.lllIlIIlll[757] = -(0xFFFFB8FC & 0x7797) & (0xFFFFFEBF & 0x7FF3);
        L.lllIlIIlll[758] = 0xFFFFCDC7 & 0x3BFF;
        L.lllIlIIlll[759] = 0xFFFF8DF7 & 0x7BC9;
        L.lllIlIIlll[760] = -(0xFFFFAFBF & 0x7C7D) & (0xFFFFBFBF & 0x7EFC);
        L.lllIlIIlll[761] = 0xFFFFF75C & 0x1BEF;
        L.lllIlIIlll[762] = -(0xFFFFFF6F & 0x2DFE) & (0xFFFFFFFF & 0x3FEF);
        L.lllIlIIlll[763] = 0xFFFF9377 & 0x7FDA;
        L.lllIlIIlll[764] = 0xFFFFEAFF & 0x174B;
        L.lllIlIIlll[765] = -(0xFFFFA8F3 & 0x7F3E) & (0xFFFFFEFD & 0x2B7F);
        L.lllIlIIlll[766] = 0xFFFFA6CF & 0x5B7D;
        L.lllIlIIlll[767] = -(0xFFFFFBDE & 0x1C23) & (0xFFFFBACF & 0x5F7F);
        L.lllIlIIlll[768] = -(0xFFFFF9AD & 0x5FD3) & (0xFFFFFBEF & 0x5FDF);
        L.lllIlIIlll[769] = -(0xFFFFEBCF & 0x7D3E) & (0xFFFFFF7D & 0x6BDF);
        L.lllIlIIlll[770] = -(0xFFFFBD63 & 0x56BD) & (0xFFFFFE7D & 0x17F3);
        L.lllIlIIlll[771] = 0xFFFF8F7B & 0x72D6;
        L.lllIlIIlll[772] = 0xFFFFFBFB & 0x657;
        L.lllIlIIlll[773] = -(0xFFFFBEEE & 0x6D13) & (0xFFFFEF55 & 0x3EFF);
        L.lllIlIIlll[774] = 0xFFFF9EF7 & 0x635D;
        L.lllIlIIlll[775] = 0xFFFFBADE & 0x4777;
        L.lllIlIIlll[776] = -(0xFFFF9DDB & 0x6EAD) & (0xFFFFFEDF & 0xFFF);
        L.lllIlIIlll[777] = -(0xFFFFFD36 & 0x57EB) & (0xFFFFFFF9 & 0x577F);
        L.lllIlIIlll[778] = -(0xFFFF9BEF & 0x6597) & (0xFFFFFFDF & 0x3FF);
        L.lllIlIIlll[779] = -(0xFFFFD3FF & 0x7C85) & (0xFFFFD3FE & 0x7EDF);
        L.lllIlIIlll[780] = 0xFFFFAEDB & 0x537F;
        L.lllIlIIlll[781] = 0xFFFFB35D & 0x4EFE;
        L.lllIlIIlll[782] = 0xFFFFD25F & 0x2FFD;
        L.lllIlIIlll[783] = -(0xFFFFECB6 & 0x3FCB) & (0xFFFFBFDF & 0x6EFF);
        L.lllIlIIlll[784] = -(0xFFFFBB1D & 0x7DE3) & (0xFFFFFB5F & 0x3FFF);
        L.lllIlIIlll[785] = 0xFFFFBBF7 & 0x4668;
        L.lllIlIIlll[786] = -(0xFFFFB9CB & 0x473D) & (0xFFFFC3ED & 0x3F7B);
        L.lllIlIIlll[787] = -(0xFFFFF7C7 & 0x7DBE) & (0xFFFFFFF7 & 0x77EF);
        L.lllIlIIlll[788] = 0xFFFFCF7B & 0x32E7;
        L.lllIlIIlll[789] = -(0xFFFFDEEE & 0x6D15) & (0xFFFFEEF7 & 0x5F6F);
        L.lllIlIIlll[790] = -(0xFFFFBFAF & 0x695B) & (0xFFFFAFEF & 0x7B7F);
        L.lllIlIIlll[791] = 0xFFFFF2EE & 0xF77;
        L.lllIlIIlll[792] = -(0xFFFFFCEF & 0x7337) & (0xFFFFF7FF & 0x7B7F);
        L.lllIlIIlll[793] = -1 & (0xFFFF83FF & 0x7E67);
        L.lllIlIIlll[794] = -(0xFFFFFCF8 & 0x7B9F) & (0xFFFFFEFF & 0x7BFF);
        L.lllIlIIlll[795] = 0xFFFFC6FD & 0x3B6B;
        L.lllIlIIlll[796] = 0xFFFFE26E & 0x1FFB;
        L.lllIlIIlll[797] = -(0xFFFFFD13 & 0x3EFD) & (0xFFFFFEFF & 0x3F7B);
        L.lllIlIIlll[798] = 0xFFFFD6FC & 0x2B6F;
        L.lllIlIIlll[799] = -(0xFFFFDED1 & 0x79AF) & (0xFFFFDFEF & 0x7AFD);
        L.lllIlIIlll[800] = 0xFFFFAAEF & 0x577E;
        L.lllIlIIlll[801] = 0xFFFF9FFF & 0x626F;
        L.lllIlIIlll[802] = 0xFFFFAEFE & 0x5371;
        L.lllIlIIlll[803] = -(0xFFFFEB67 & 0x5DDC) & (0xFFFFFBFF & 0x4FFF);
        L.lllIlIIlll[804] = -(0xFFFFF78B & 0x2876) & (0xFFFFFBDD & 0x7FEF);
        L.lllIlIIlll[805] = -(0xFFFFDDF7 & 0x366A) & (0xFFFFF7FF & 0x7FFD);
        L.lllIlIIlll[806] = 0xFFFFFDD9 & 0x225736;
        L.lllIlIIlll[807] = -(0xFFFFF2DD & 0x7FEB) & (0xFFFFFEFB & 0x11FFFC);
        L.lllIlIIlll[808] = 0xFFFFFBF5 & 0x24DFA;
        L.lllIlIIlll[809] = -(0xFFFFCBA3 & 0x7CDF) & (0xFFFFFFFE & 0x27EEB);
        L.lllIlIIlll[810] = 0xFFFF8FA9 & 0x2F4DE;
        L.lllIlIIlll[811] = 0xFFFFFEF5 & 0xE7FFA;
        L.lllIlIIlll[812] = -(0xFFFFFEA1 & 0x69DF) & (0xFFFFFDFE & 0x2B7EBF);
        L.lllIlIIlll[813] = -2 & (0xFFFFDFFF & 0x3BFD1F);
        L.lllIlIIlll[814] = 0xFFFFDD9E & 0x29AFFF;
        L.lllIlIIlll[815] = 0xFFFFDF7A & 0x25FD;
        L.lllIlIIlll[816] = 0xFFFFFFE2 & 0x353D;
        L.lllIlIIlll[817] = 0xFFFFF7F5 & 0x4D2E;
        L.lllIlIIlll[818] = -(0xFFFFD9FF & 0x6FF4) & (0xFFFFF9FF & Short.MAX_VALUE);
        L.lllIlIIlll[819] = -(0xFFFF9967 & 0x7EDE) & (0xFFFFBDFF & 0x7F75);
        L.lllIlIIlll[820] = -(0xFFFF93CB & 0x7E3E) & (0xFFFFB3BF & 0x7F7D);
        L.lllIlIIlll[821] = -(0xFFFFDADB & 0x77AF) & (0xFFFFF6DF & 0x7FFE);
        L.lllIlIIlll[822] = 0xFFFFAFDA & 0x57F5;
        L.lllIlIIlll[823] = 0xFFFFE3EE & 0x3F39;
        L.lllIlIIlll[824] = -(0xFFFFBDBE & 0x5343) & (0xFFFFFFFF & 0x3FCD);
        L.lllIlIIlll[825] = -(0xFFFF8D3A & 0x7ED7) & (0xFFFFBED9 & Short.MAX_VALUE);
        L.lllIlIIlll[826] = -(0x40 ^ 0x52) & (0xFFFF9D7F & 0x7FDD);
        L.lllIlIIlll[827] = 0xFFFFE7BD & 0x3D5E;
        L.lllIlIIlll[828] = -(0xFFFFF97D & 0x56CE) & (0xFFFFDFFF & 0x73CF);
        L.lllIlIIlll[829] = 0xFFFFE6FA & 0x1B77;
        L.lllIlIIlll[830] = 0xFFFF9377 & 0x6EFB;
        L.lllIlIIlll[831] = 0xFFFFD67E & 0x2BF5;
        L.lllIlIIlll[832] = 0xFFFFAAF5 & 0x577F;
        L.lllIlIIlll[833] = -(0xFFFFF19A & 0x7FE7) & (0xFFFFF7FF & 0x7BF7);
        L.lllIlIIlll[834] = -(0xFFFFFFD7 & 0x39A9) & (0xFFFFFBFF & 0x3FF7);
        L.lllIlIIlll[835] = 0xFFFFEAF9 & 0x177E;
        L.lllIlIIlll[836] = -(0xFFFFBE9B & 0x7DE5) & (0xFFFFBFFD & 0x7EFB);
        L.lllIlIIlll[837] = -(0xFFFFDD2D & 0x7FD3) & (0xFFFFDFFA & 0x7F7F);
        L.lllIlIIlll[838] = 0xFFFFFF7B & 0x2FF;
        L.lllIlIIlll[839] = -(0xFFFFECF7 & 0x578A) & (0xFFFFE6FD & 0x5FFF);
        L.lllIlIIlll[840] = 0xFFFFFE7D & 0x3FF;
        L.lllIlIIlll[841] = 0xFFFFF67E & 0xBFF;
        L.lllIlIIlll[842] = 0xFFFFB3FF & 0x4E7F;
        L.lllIlIIlll[843] = 0xFFFFFED7 & 0x3A8;
        L.lllIlIIlll[844] = -(0xFFFFC9FF & 0x7F7B) & (0xFFFFEFFF & 0x5BFB);
        L.lllIlIIlll[845] = 0xFFFFD7FE & 0x2A83;
        L.lllIlIIlll[846] = 0xFFFFEF95 & 0x1EFB;
        L.lllIlIIlll[847] = 0xFFFFBFF6 & 0x4CFF;
        L.lllIlIIlll[848] = 0xFFFF8EFF & 0x7FA6;
        L.lllIlIIlll[849] = 0xFFFFCDFA & 0x3EE7;
        L.lllIlIIlll[850] = -(0xFFFFF297 & 0x3F69) & (0xFFFFBFDF & 0x7FFD);
        L.lllIlIIlll[851] = -(0xFFFFEEFB & 0x7347) & (0xFFFFEFFF & Short.MAX_VALUE);
        L.lllIlIIlll[852] = 0xFFFFDDF3 & 0x2F7F;
        L.lllIlIIlll[853] = 0xFFFFDF9E & 0x2DFF;
        L.lllIlIIlll[854] = -(0xFFFFECF3 & 0x536F) & (0xFFFFF67B & 0x6FF7);
        L.lllIlIIlll[855] = 0xFFFF9F1E & 0x6EFB;
        L.lllIlIIlll[856] = 0xFFFFEFE9 & 0x361F;
        L.lllIlIIlll[857] = -(0xFFFFE2E2 & 0x7FDF) & (0xFFFFFFFB & 0x6FE7);
        L.lllIlIIlll[858] = 0xFFFFFE5F & 0xDFF;
        L.lllIlIIlll[859] = 0xFFFFDF5F & 0x2EFB;
        L.lllIlIIlll[860] = 0xFFFF9CFF & 0x6F62;
        L.lllIlIIlll[861] = -(0xFFFFFAF3 & 0x75FF) & (0xFFFFFEFA & 0x7FF7);
        L.lllIlIIlll[862] = -(0xFFFFE9DD & 0x76F7) & (0xFFFFFFDF & 0x6DF7);
        L.lllIlIIlll[863] = 0xFFFFEE7F & 0x1DF4;
        L.lllIlIIlll[864] = 0xFFFFDB93 & 0x26EF;
        L.lllIlIIlll[865] = 0xFFFFE6D6 & 0x1BAD;
        L.lllIlIIlll[866] = 0xFFFFA687 & 0x5BFD;
        L.lllIlIIlll[867] = 0xFFFF83CE & 0x7EB7;
        L.lllIlIIlll[868] = 0xFFFFB287 & 0x4FFF;
        L.lllIlIIlll[869] = 0xFFFF9EAF & 0x63D8;
        L.lllIlIIlll[870] = -(0xFFFFED7F & 0x32A5) & (0xFFFFF7FD & 0x2AAF);
        L.lllIlIIlll[871] = 0xFFFFDA9F & 0x27EA;
        L.lllIlIIlll[872] = -(0xFFFFEF8F & 0x5175) & (0xFFFFEFBF & 0x53CF);
        L.lllIlIIlll[873] = 0xFFFFD6AD & 0x2BDE;
        L.lllIlIIlll[874] = -(0xFFFFEE7F & 0x1DA1) & (0xFFFF9EBF & 0x6FED);
        L.lllIlIIlll[875] = 0xFFFF869F & 0x7BEE;
        L.lllIlIIlll[876] = -(0xFFFFFEF3 & 0x594D) & (0xFFFFDEDF & 0x7BEF);
        L.lllIlIIlll[877] = 0xFFFFC3FD & 0x3E92;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cE() {
        int n2;
        int[] nArray = new int[lllIlIIlll[0]];
        nArray[L.lllIlIIlll[1]] = lllIlIIlll[294];
        if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[lllIlIIlll[0]];
            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[400]];
            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIlIIlll[0]];
                stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[401]];
                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIlIIlll[0]];
                    stringArray3[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[402]];
                    if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIlIIlll[0]];
                        nArray2[L.lllIlIIlll[1]] = lllIlIIlll[217];
                        if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lllIlIIlll[0]];
                            nArray3[L.lllIlIIlll[1]] = lllIlIIlll[403];
                            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lllIlIIlll[0]];
                                nArray4[L.lllIlIIlll[1]] = lllIlIIlll[42];
                                if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lllIlIIlll[0]];
                                    nArray5[L.lllIlIIlll[1]] = lllIlIIlll[33];
                                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                        n2 = lllIlIIlll[0];
                                        0;
                                        if (1 > 0) return n2 != 0;
                                        return ((0x38 ^ 0x3F ^ (0x92 ^ 0xC6)) & (0x6C ^ 0x7A ^ (0x55 ^ 0x10) ^ -1)) != 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIlIIlll[1];
        return n2 != 0;
    }

    private static boolean llIIIlIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static int llIIIlIllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIlIllIIII(int n2) {
        return n2 > 0;
    }

    public static void cJ() {
        block92: {
            List lllllllllllllllllIllIllIlIlllllI2;
            block93: {
                Object lllllllllllllllllIllIllIlIllllII;
                Object lllllllllllllllllIllIllIlIllllIl;
                block95: {
                    block94: {
                        Object lllllllllllllllllIllIllIlIllllll;
                        block89: {
                            block91: {
                                block90: {
                                    block86: {
                                        block88: {
                                            block87: {
                                                block81: {
                                                    block85: {
                                                        block84: {
                                                            block83: {
                                                                block82: {
                                                                    block80: {
                                                                        block79: {
                                                                            String[] stringArray = new String[lllIlIIlll[0]];
                                                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[638]];
                                                                            g.a(stringArray);
                                                                            String[] stringArray2 = new String[lllIlIIlll[0]];
                                                                            stringArray2[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[639]];
                                                                            if (!L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray2))) break block79;
                                                                            String[] stringArray3 = new String[lllIlIIlll[0]];
                                                                            stringArray3[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[640]];
                                                                            if (!L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray3))) break block80;
                                                                        }
                                                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[641]];
                                                                        String[] stringArray = new String[lllIlIIlll[0]];
                                                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[642]];
                                                                        if (L.llIIIlIllIIIl(NPCs.getNearest((String[])stringArray).getHealthRatio(), lllIlIIlll[32])) {
                                                                            String[] stringArray4 = new String[lllIlIIlll[0]];
                                                                            stringArray4[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[643]];
                                                                            if (L.llIIIlIllIIlI(NPCs.getNearest((String[])stringArray4).getHealthRatio(), lllIlIIlll[106])) {
                                                                                String[] stringArray5 = new String[lllIlIIlll[0]];
                                                                                stringArray5[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[644]];
                                                                                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                                                    String[] stringArray6 = new String[lllIlIIlll[0]];
                                                                                    stringArray6[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[645]];
                                                                                    String[] stringArray7 = new String[lllIlIIlll[0]];
                                                                                    stringArray7[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[646]];
                                                                                    Inventory.getFirst((String[])stringArray6).useOn((Actor)NPCs.getNearest((String[])stringArray7));
                                                                                    Time.sleepTicks((int)lllIlIIlll[6]);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (L.llIIIlIlIlllI(Skills.getLevel((Skill)Skill.STRENGTH) + lllIlIIlll[21], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && L.llIIIlIlIlIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                                                            Inventory.getFirst((int[])f.aY).interact(lllIlIIllI[lllIlIIlll[647]]);
                                                                        }
                                                                        if (L.llIIIlIlIlIlI(Prayers.getPoints(), lllIlIIlll[65])) {
                                                                            Inventory.getFirst((int[])f.aX).interact(lllIlIIllI[lllIlIIlll[648]]);
                                                                        }
                                                                        if (L.llIIIlIllIIll(L.llIIIlIllIlll(e.w(), 63.0))) {
                                                                            String[] stringArray8 = new String[lllIlIIlll[0]];
                                                                            stringArray8[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[649]];
                                                                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                                                                String[] stringArray9 = new String[lllIlIIlll[0]];
                                                                                stringArray9[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[650]];
                                                                                Inventory.getFirst((String[])stringArray9).interact(lllIlIIllI[lllIlIIlll[651]]);
                                                                            }
                                                                        }
                                                                        String[] stringArray10 = new String[lllIlIIlll[0]];
                                                                        stringArray10[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[652]];
                                                                        if (L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray10))) {
                                                                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                                                                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                                                            }
                                                                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                                                                Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                                                            }
                                                                            String[] stringArray11 = new String[lllIlIIlll[0]];
                                                                            stringArray11[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[653]];
                                                                            if (L.llIIIlIlIlIll(Equipment.contains((String[])stringArray11) ? 1 : 0)) {
                                                                                String[] stringArray12 = new String[lllIlIIlll[0]];
                                                                                stringArray12[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[654]];
                                                                                Inventory.getFirst((String[])stringArray12).interact(lllIlIIllI[lllIlIIlll[655]]);
                                                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                                                0;
                                                                            }
                                                                            if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIllllll = NPCs.getNearest(nPC2 -> {
                                                                                int n2;
                                                                                NPC lllllllllllllllllIllIllIlIlIlIII;
                                                                                int n3;
                                                                                int n4 = nPC2.getName().toLowerCase().contains(lllIlIIllI[lllIlIIlll[841]]);
                                                                                if (L.llIIIlIlIlIll(nPC2.isDead() ? 1 : 0)) {
                                                                                    n3 = lllIlIIlll[0];
                                                                                    0;
                                                                                    if (-2 > 0) {
                                                                                        return ((0x10 ^ 0x15 ^ (0xC2 ^ 0x86)) & (0x27 ^ 0x18 ^ (0xFB ^ 0x85) ^ -1)) != 0;
                                                                                    }
                                                                                } else {
                                                                                    n3 = lllIlIIlll[1];
                                                                                }
                                                                                if (L.llIIIlIlIlIIl(n4 & n3) && L.llIIIlIlllIlI(lllllllllllllllllIllIllIlIlIlIII.getInteracting(), NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(lllIlIIllI[lllIlIIlll[842]])))) {
                                                                                    n2 = lllIlIIlll[0];
                                                                                    0;
                                                                                    if (1 < 0) {
                                                                                        return ((0xEE ^ 0xB7) & ~(0xC3 ^ 0x9A)) != 0;
                                                                                    }
                                                                                } else {
                                                                                    n2 = lllIlIIlll[1];
                                                                                }
                                                                                return n2 != 0;
                                                                            }))) {
                                                                                lllllllllllllllllIllIllIlIllllll.interact(lllIlIIllI[lllIlIIlll[656]]);
                                                                                Time.sleepTicks((int)lllIlIIlll[6]);
                                                                                0;
                                                                            }
                                                                            if (L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                                                                                String[] stringArray13 = new String[lllIlIIlll[0]];
                                                                                stringArray13[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[657]];
                                                                                NPCs.getNearest((String[])stringArray13).interact(lllIlIIllI[lllIlIIlll[658]]);
                                                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                                                0;
                                                                            }
                                                                        }
                                                                        String[] stringArray14 = new String[lllIlIIlll[0]];
                                                                        stringArray14[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[659]];
                                                                        if (L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray14))) {
                                                                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                                            }
                                                                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                                                                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                                                            }
                                                                            if (L.llIIIlIlIlIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                                                                                Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                                                                            }
                                                                            int[] nArray = new int[lllIlIIlll[0]];
                                                                            nArray[L.lllIlIIlll[1]] = lllIlIIlll[217];
                                                                            if (L.llIIIlIlIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                                                int[] nArray2 = new int[lllIlIIlll[0]];
                                                                                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[217];
                                                                                Inventory.getFirst((int[])nArray2).interact(lllIlIIllI[lllIlIIlll[660]]);
                                                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                                                0;
                                                                            }
                                                                            String[] stringArray15 = new String[lllIlIIlll[0]];
                                                                            stringArray15[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[661]];
                                                                            lllllllllllllllllIllIllIlIllllll = NPCs.getAll((String[])stringArray15);
                                                                            if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllllll.isEmpty() ? 1 : 0)) {
                                                                                int lllllllllllllllllIllIllIlIlllllI2 = lllIlIIlll[1];
                                                                                while (L.llIIIlIlIlIlI(lllllllllllllllllIllIllIlIlllllI2, lllllllllllllllllIllIllIlIllllll.size())) {
                                                                                    lllllllllllllllllIllIllIlIllllIl = ((NPC)lllllllllllllllllIllIllIlIllllll.get(lllllllllllllllllIllIllIlIlllllI2)).getInteracting();
                                                                                    if (L.llIIIlIlIlIIl(lllllllllllllllllIllIllIlIllllIl.getName().equalsIgnoreCase(lllIlIIllI[lllIlIIlll[662]]) ? 1 : 0) && L.llIIIlIlIlIll(Players.getLocal().getInteracting().equals(lllllllllllllllllIllIllIlIllllll.get(lllllllllllllllllIllIllIlIlllllI2)) ? 1 : 0)) {
                                                                                        ((NPC)lllllllllllllllllIllIllIlIllllll.get(lllllllllllllllllIllIllIlIlllllI2)).interact(lllIlIIllI[lllIlIIlll[663]]);
                                                                                        Time.sleepTicks((int)lllIlIIlll[0]);
                                                                                        0;
                                                                                        0;
                                                                                        if (((0x10 ^ 0x46 ^ (0x7B ^ 0x18)) & (139 + 33 - 46 + 63 ^ 74 + 131 - 181 + 112 ^ -1)) < 2) break;
                                                                                        return;
                                                                                    }
                                                                                    ++lllllllllllllllllIllIllIlIlllllI2;
                                                                                    0;
                                                                                    if (((0x8D ^ 0xC6 ^ (0xE7 ^ 0xB8)) & (5 + 49 - 4 + 117 ^ 55 + 56 - -66 + 2 ^ -1)) < 1) continue;
                                                                                    return;
                                                                                }
                                                                            }
                                                                            if (L.llIIIlIllIlII(Players.getLocal().getInteracting())) {
                                                                                String[] stringArray16 = new String[lllIlIIlll[0]];
                                                                                stringArray16[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[664]];
                                                                                NPCs.getNearest((String[])stringArray16).interact(lllIlIIllI[lllIlIIlll[665]]);
                                                                                Time.sleepTicks((int)lllIlIIlll[0]);
                                                                                0;
                                                                            }
                                                                        }
                                                                        String[] stringArray17 = new String[lllIlIIlll[0]];
                                                                        stringArray17[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[666]];
                                                                        if (L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray17))) {
                                                                            TileObject lllllllllllllllllIllIllIlIlllllI2;
                                                                            String[] stringArray18 = new String[lllIlIIlll[0]];
                                                                            stringArray18[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[667]];
                                                                            if (L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray18)) && L.llIIIlIlIllll(lllllllllllllllllIllIllIlIlllllI2 = TileObjects.getNearest((Predicate)(lllllllllllllllllIllIllIlIllllll = tileObject -> {
                                                                                String[] stringArray = new String[lllIlIIlll[0]];
                                                                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[840]];
                                                                                return tileObject.hasAction(stringArray);
                                                                            }))) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                                                                lllllllllllllllllIllIllIlIlllllI2.interact(lllIlIIllI[lllIlIIlll[668]]);
                                                                                Time.sleepUntil(() -> {
                                                                                    boolean bl;
                                                                                    if (L.llIIIlIlIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                        bl = lllIlIIlll[0];
                                                                                        0;
                                                                                        if (-3 >= 0) {
                                                                                            return ((0x3B ^ 0x5F ^ (0xF7 ^ 0xBD)) & (0x62 ^ 0x5F ^ (0x9E ^ 0x8D) ^ -1)) != 0;
                                                                                        }
                                                                                    } else {
                                                                                        bl = lllIlIIlll[1];
                                                                                    }
                                                                                    return bl;
                                                                                }, (int)Rand.nextInt((int)lllIlIIlll[445], (int)lllIlIIlll[669]));
                                                                                0;
                                                                            }
                                                                        }
                                                                    }
                                                                    String[] stringArray = new String[lllIlIIlll[0]];
                                                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[670]];
                                                                    if (L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray))) {
                                                                        TileObject lllllllllllllllllIllIllIlIlllllI2;
                                                                        String[] stringArray19 = new String[lllIlIIlll[0]];
                                                                        stringArray19[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[671]];
                                                                        if (L.llIIIlIllIlII(NPCs.getNearest((String[])stringArray19)) && L.llIIIlIlIllll(lllllllllllllllllIllIllIlIlllllI2 = TileObjects.getNearest(lllllllllllllllllIllIllIlIllllll = tileObject -> {
                                                                            String[] stringArray = new String[lllIlIIlll[0]];
                                                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[839]];
                                                                            return tileObject.hasAction(stringArray);
                                                                        })) && L.llIIIlIlIlIIl(Reachable.isInteractable((Locatable)lllllllllllllllllIllIllIlIlllllI2) ? 1 : 0) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                                                            lllllllllllllllllIllIllIlIlllllI2.interact(lllIlIIllI[lllIlIIlll[672]]);
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (L.llIIIlIlIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = lllIlIIlll[0];
                                                                                    0;
                                                                                    if (((0xB5 ^ 0x9F ^ (0xA6 ^ 0x8B)) & (49 + 145 - 141 + 108 ^ 22 + 9 - 7 + 142 ^ -1)) != 0) {
                                                                                        return ((0x30 ^ 0x69 ^ (0xC1 ^ 0x83)) & (0x41 ^ 0x47 ^ (0x1E ^ 3) ^ -1)) != 0;
                                                                                    }
                                                                                } else {
                                                                                    bl = lllIlIIlll[1];
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)lllIlIIlll[445], (int)lllIlIIlll[669]));
                                                                            0;
                                                                        }
                                                                    }
                                                                    String[] stringArray20 = new String[lllIlIIlll[0]];
                                                                    stringArray20[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[673]];
                                                                    if (L.llIIIlIlIllll(NPCs.getNearest((String[])stringArray20)) && L.llIIIlIlIlIll(aL.nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.llIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(aL.nI), lllIlIIlll[7])) {
                                                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[674]];
                                                                        lllllllllllllllllIllIllIlIllllll = tileObject -> {
                                                                            String[] stringArray = new String[lllIlIIlll[0]];
                                                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[838]];
                                                                            return tileObject.hasAction(stringArray);
                                                                        };
                                                                        TileObject lllllllllllllllllIllIllIlIlllllI2 = TileObjects.getNearest(lllllllllllllllllIllIllIlIllllll);
                                                                        if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIlllllI2)) {
                                                                            lllllllllllllllllIllIllIlIlllllI2.interact(lllIlIIllI[lllIlIIlll[675]]);
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (L.llIIIlIlIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = lllIlIIlll[0];
                                                                                    0;
                                                                                    if ((0xC7 ^ 0xC3) <= 2) {
                                                                                        return ((0x8B ^ 0x87) & ~(0x79 ^ 0x75)) != 0;
                                                                                    }
                                                                                } else {
                                                                                    bl = lllIlIIlll[1];
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)lllIlIIlll[445], (int)lllIlIIlll[669]));
                                                                            0;
                                                                        }
                                                                    }
                                                                    String[] stringArray21 = new String[lllIlIIlll[0]];
                                                                    stringArray21[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[676]];
                                                                    if (!L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray21))) break block81;
                                                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[677]];
                                                                    String[] stringArray22 = new String[lllIlIIlll[0]];
                                                                    stringArray22[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[678]];
                                                                    if (L.llIIIlIllIlII(TileObjects.getNearest((String[])stringArray22))) {
                                                                        TileItem lllllllllllllllllIllIllIlIlllllI2;
                                                                        String[] stringArray23 = new String[lllIlIIlll[0]];
                                                                        stringArray23[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[679]];
                                                                        lllllllllllllllllIllIllIlIllllll = TileItems.getNearest((String[])stringArray23);
                                                                        if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIllllll)) {
                                                                            lllllllllllllllllIllIllIlIllllll.interact(lllIlIIllI[lllIlIIlll[680]]);
                                                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                                                            0;
                                                                        }
                                                                        if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIlllllI2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(lllIlIIllI[lllIlIIlll[837]])))) {
                                                                            lllllllllllllllllIllIllIlIlllllI2.interact(lllIlIIllI[lllIlIIlll[681]]);
                                                                            Time.sleepTicks((int)lllIlIIlll[0]);
                                                                            0;
                                                                        }
                                                                        String[] stringArray24 = new String[lllIlIIlll[0]];
                                                                        stringArray24[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[682]];
                                                                        lllllllllllllllllIllIllIlIllllIl = NPCs.getNearest((String[])stringArray24);
                                                                        if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIllllIl) && L.llIIIlIlllIII(LocalPlayer.get().getInteracting(), lllllllllllllllllIllIllIlIllllIl) && L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllllIl.isDead() ? 1 : 0) && L.llIIIlIlIlIIl(Reachable.isInteractable((Locatable)lllllllllllllllllIllIllIlIllllIl) ? 1 : 0)) {
                                                                            lllllllllllllllllIllIllIlIllllIl.interact(lllIlIIllI[lllIlIIlll[683]]);
                                                                        }
                                                                    }
                                                                    String[] stringArray25 = new String[lllIlIIlll[0]];
                                                                    stringArray25[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[684]];
                                                                    if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray25) ? 1 : 0)) break block82;
                                                                    String[] stringArray26 = new String[lllIlIIlll[0]];
                                                                    stringArray26[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[685]];
                                                                    if (!L.llIIIlIlIlIlI(Inventory.getAll((String[])stringArray26).size(), lllIlIIlll[3])) break block83;
                                                                }
                                                                String[] stringArray = new String[lllIlIIlll[0]];
                                                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[686]];
                                                                if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray)) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                                    String[] stringArray27 = new String[lllIlIIlll[0]];
                                                                    stringArray27[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[687]];
                                                                    TileObjects.getNearest((String[])stringArray27).interact(lllIlIIllI[lllIlIIlll[688]]);
                                                                    Time.sleepTicks((int)lllIlIIlll[6]);
                                                                    0;
                                                                }
                                                            }
                                                            String[] stringArray = new String[lllIlIIlll[0]];
                                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[689]];
                                                            if (!L.llIIIlIlIlIlI(Inventory.getAll((String[])stringArray).size(), lllIlIIlll[3])) break block84;
                                                            String[] stringArray28 = new String[lllIlIIlll[0]];
                                                            stringArray28[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[690]];
                                                            if (!L.llIIIlIlIllII(Inventory.getAll((String[])stringArray28).size(), lllIlIIlll[3])) break block85;
                                                        }
                                                        String[] stringArray = new String[lllIlIIlll[0]];
                                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[691]];
                                                        if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                            String[] stringArray29 = new String[lllIlIIlll[0]];
                                                            stringArray29[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[692]];
                                                            String[] stringArray30 = new String[lllIlIIlll[0]];
                                                            stringArray30[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[693]];
                                                            Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                                            0;
                                                        }
                                                        String[] stringArray31 = new String[lllIlIIlll[0]];
                                                        stringArray31[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[694]];
                                                        if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray31) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                            String[] stringArray32 = new String[lllIlIIlll[0]];
                                                            stringArray32[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[695]];
                                                            String[] stringArray33 = new String[lllIlIIlll[0]];
                                                            stringArray33[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[696]];
                                                            Inventory.getFirst((String[])stringArray32).useOn(TileObjects.getNearest((String[])stringArray33));
                                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                                            0;
                                                        }
                                                    }
                                                    String[] stringArray = new String[lllIlIIlll[0]];
                                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[697]];
                                                    g.a(stringArray);
                                                }
                                                String[] stringArray = new String[lllIlIIlll[0]];
                                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[698]];
                                                if (!L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) break block86;
                                                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[699]];
                                                String[] stringArray34 = new String[lllIlIIlll[0]];
                                                stringArray34[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[700]];
                                                if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray34) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                    String[] stringArray35 = new String[lllIlIIlll[0]];
                                                    stringArray35[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[701]];
                                                    if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray35))) {
                                                        String[] stringArray36 = new String[lllIlIIlll[0]];
                                                        stringArray36[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[702]];
                                                        TileObjects.getNearest((String[])stringArray36).interact(lllIlIIllI[lllIlIIlll[703]]);
                                                        Time.sleepTicks((int)lllIlIIlll[6]);
                                                        0;
                                                    }
                                                }
                                                String[] stringArray37 = new String[lllIlIIlll[0]];
                                                stringArray37[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[704]];
                                                if (!L.llIIIlIlIlIll(Inventory.contains((String[])stringArray37) ? 1 : 0)) break block87;
                                                String[] stringArray38 = new String[lllIlIIlll[0]];
                                                stringArray38[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[705]];
                                                if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray38) ? 1 : 0)) break block88;
                                            }
                                            String[] stringArray = new String[lllIlIIlll[0]];
                                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[706]];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                String[] stringArray39 = new String[lllIlIIlll[0]];
                                                stringArray39[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[707]];
                                                String[] stringArray40 = new String[lllIlIIlll[0]];
                                                stringArray40[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[708]];
                                                Inventory.getFirst((String[])stringArray39).useOn(TileObjects.getNearest((String[])stringArray40));
                                                Time.sleepTicks((int)lllIlIIlll[6]);
                                                0;
                                            }
                                            String[] stringArray41 = new String[lllIlIIlll[0]];
                                            stringArray41[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[709]];
                                            if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray41) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                                String[] stringArray42 = new String[lllIlIIlll[0]];
                                                stringArray42[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[710]];
                                                String[] stringArray43 = new String[lllIlIIlll[0]];
                                                stringArray43[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[711]];
                                                Inventory.getFirst((String[])stringArray42).useOn(TileObjects.getNearest((String[])stringArray43));
                                                Time.sleepTicks((int)lllIlIIlll[6]);
                                                0;
                                            }
                                            String[] stringArray44 = new String[lllIlIIlll[0]];
                                            stringArray44[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[712]];
                                            TileObjects.getNearest((String[])stringArray44).interact(lllIlIIllI[lllIlIIlll[713]]);
                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                            0;
                                        }
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[714]];
                                        g.a(stringArray);
                                    }
                                    String[] stringArray = new String[lllIlIIlll[0]];
                                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[715]];
                                    if (!L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) break block89;
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[716]];
                                    String[] stringArray45 = new String[lllIlIIlll[0]];
                                    stringArray45[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[717]];
                                    if (L.llIIIlIlIlIll(Inventory.contains((String[])stringArray45) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                        String[] stringArray46 = new String[lllIlIIlll[0]];
                                        stringArray46[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[718]];
                                        if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray46))) {
                                            String[] stringArray47 = new String[lllIlIIlll[0]];
                                            stringArray47[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[719]];
                                            TileObjects.getNearest((String[])stringArray47).interact(lllIlIIllI[lllIlIIlll[720]]);
                                            Time.sleepTicks((int)lllIlIIlll[6]);
                                            0;
                                        }
                                    }
                                    String[] stringArray48 = new String[lllIlIIlll[0]];
                                    stringArray48[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[721]];
                                    if (!L.llIIIlIlIlIll(Inventory.contains((String[])stringArray48) ? 1 : 0)) break block90;
                                    String[] stringArray49 = new String[lllIlIIlll[0]];
                                    stringArray49[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[722]];
                                    if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray49) ? 1 : 0)) break block91;
                                }
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[33]];
                                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                    String[] stringArray50 = new String[lllIlIIlll[0]];
                                    stringArray50[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[723]];
                                    String[] stringArray51 = new String[lllIlIIlll[0]];
                                    stringArray51[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[724]];
                                    Inventory.getFirst((String[])stringArray50).useOn(TileObjects.getNearest((String[])stringArray51));
                                    Time.sleepTicks((int)lllIlIIlll[6]);
                                    0;
                                }
                                String[] stringArray52 = new String[lllIlIIlll[0]];
                                stringArray52[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[725]];
                                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray52) ? 1 : 0) && L.llIIIlIlIllIl(Players.getLocal().getAnimation(), lllIlIIlll[106])) {
                                    String[] stringArray53 = new String[lllIlIIlll[0]];
                                    stringArray53[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[726]];
                                    String[] stringArray54 = new String[lllIlIIlll[0]];
                                    stringArray54[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[727]];
                                    Inventory.getFirst((String[])stringArray53).useOn(TileObjects.getNearest((String[])stringArray54));
                                    Time.sleepTicks((int)lllIlIIlll[6]);
                                    0;
                                }
                                String[] stringArray55 = new String[lllIlIIlll[0]];
                                stringArray55[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[728]];
                                TileObjects.getNearest((String[])stringArray55).interact(lllIlIIllI[lllIlIIlll[729]]);
                                Time.sleepTicks((int)lllIlIIlll[6]);
                                0;
                            }
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[730]];
                            g.a(stringArray);
                        }
                        String[] stringArray = new String[lllIlIIlll[0]];
                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[731]];
                        if (L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray))) {
                            String[] stringArray56 = new String[lllIlIIlll[0]];
                            stringArray56[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[42]];
                            lllllllllllllllllIllIllIlIllllll = TileObjects.getAll((String[])stringArray56);
                            List lllllllllllllllllIllIllIlIlllllI2 = lllllllllllllllllIllIllIlIllllll.stream().filter(tileObject -> {
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[836]];
                                return tileObject.hasAction(stringArray);
                            }).collect(Collectors.toList());
                            lllllllllllllllllIllIllIlIllllIl = null;
                            lllllllllllllllllIllIllIlIllllII = TileObjects.getNearest(tileObject -> {
                                int n2;
                                String[] stringArray = new String[lllIlIIlll[0]];
                                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[834]];
                                if (L.llIIIlIlIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && L.llIIIlIlIlIIl(tileObject.getName().equals(lllIlIIllI[lllIlIIlll[835]]) ? 1 : 0)) {
                                    n2 = lllIlIIlll[0];
                                    0;
                                    if (((0x24 ^ 0x19) & ~(0x12 ^ 0x2F)) < 0) {
                                        return ((0x90 ^ 0xC0) & ~(0x12 ^ 0x42)) != 0;
                                    }
                                } else {
                                    n2 = lllIlIIlll[1];
                                }
                                return n2 != 0;
                            });
                            if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIllllII)) {
                                if (L.llIIIlIlIllII(Players.getLocal().getWorldX(), lllllllllllllllllIllIllIlIllllII.getWorldX())) {
                                    lllllllllllllllllIllIllIlIllllIl = TileObjects.getNearest(tileObject -> {
                                        String[] stringArray = new String[lllIlIIlll[0]];
                                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[833]];
                                        return tileObject.hasAction(stringArray);
                                    });
                                    if (L.llIIIlIlIllll(lllllllllllllllllIllIllIlIllllIl)) {
                                        AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[732]];
                                        lllllllllllllllllIllIllIlIllllIl.interact(lllIlIIllI[lllIlIIlll[733]]);
                                        Time.sleepTicks((int)e.c(lllIlIIlll[3], lllIlIIlll[11]));
                                        0;
                                        0;
                                        if (null != null) {
                                            return;
                                        }
                                    }
                                } else {
                                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[734]];
                                    lllllllllllllllllIllIllIlIllllII.interact(lllIlIIllI[lllIlIIlll[735]]);
                                    Time.sleepTicks((int)lllIlIIlll[9]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray57 = new String[lllIlIIlll[0]];
                        stringArray57[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[736]];
                        if (!L.llIIIlIlIllll(TileObjects.getNearest((String[])stringArray57))) break block92;
                        String[] stringArray58 = new String[lllIlIIlll[0]];
                        stringArray58[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[737]];
                        lllllllllllllllllIllIllIlIllllll = TileObjects.getAll((String[])stringArray58);
                        lllllllllllllllllIllIllIlIlllllI2 = lllllllllllllllllIllIllIlIllllll.stream().filter(tileObject -> {
                            String[] stringArray = new String[lllIlIIlll[0]];
                            stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[832]];
                            return tileObject.hasAction(stringArray);
                        }).collect(Collectors.toList());
                        if (!L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIlllllI2.isEmpty() ? 1 : 0)) break block92;
                        if (!L.llIIIlIlIlIll(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllllIllIllIlIlllllI2.get(lllIlIIlll[1]))) ? 1 : 0)) break block93;
                        String[] stringArray59 = new String[lllIlIIlll[0]];
                        stringArray59[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[738]];
                        if (!L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray59) ? 1 : 0)) break block94;
                        String[] stringArray60 = new String[lllIlIIlll[0]];
                        stringArray60[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[739]];
                        if (!L.llIIIlIlIlIlI(Inventory.getAll((String[])stringArray60).size(), lllIlIIlll[3])) break block95;
                    }
                    AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[740]];
                    String[] stringArray = new String[lllIlIIlll[0]];
                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[741]];
                    lllllllllllllllllIllIllIlIllllIl = TileObjects.getAll((String[])stringArray);
                    lllllllllllllllllIllIllIlIllllII = lllllllllllllllllIllIllIlIllllIl.stream().filter(tileObject -> {
                        String[] stringArray = new String[lllIlIIlll[0]];
                        stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[831]];
                        return tileObject.hasAction(stringArray);
                    }).collect(Collectors.toList());
                    if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllllII.isEmpty() ? 1 : 0)) {
                        ((TileObject)lllllllllllllllllIllIllIlIllllII.get(lllIlIIlll[1])).interact(lllIlIIllI[lllIlIIlll[742]]);
                        Time.sleepTicks((int)lllIlIIlll[6]);
                        0;
                    }
                }
                String[] stringArray = new String[lllIlIIlll[0]];
                stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[743]];
                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray61 = new String[lllIlIIlll[0]];
                    stringArray61[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[744]];
                    if (L.llIIIlIlIllII(Inventory.getAll((String[])stringArray61).size(), lllIlIIlll[3])) {
                        String[] stringArray62 = new String[lllIlIIlll[0]];
                        stringArray62[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[745]];
                        String[] stringArray63 = new String[lllIlIIlll[0]];
                        stringArray63[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[746]];
                        Inventory.getFirst((String[])stringArray62).useOn((Item)Inventory.getAll((String[])stringArray63).get(lllIlIIlll[0]));
                    }
                }
                String[] stringArray64 = new String[lllIlIIlll[0]];
                stringArray64[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[747]];
                if (L.llIIIlIlIlIIl(Inventory.contains((String[])stringArray64) ? 1 : 0)) {
                    String[] stringArray65 = new String[lllIlIIlll[0]];
                    stringArray65[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[748]];
                    int[] nArray = new int[lllIlIIlll[0]];
                    nArray[L.lllIlIIlll[1]] = lllIlIIlll[749];
                    Inventory.getFirst((String[])stringArray65).useOn(TileObjects.getNearest((int[])nArray));
                    Time.sleepTicks((int)lllIlIIlll[13]);
                    0;
                }
                String[] stringArray66 = new String[lllIlIIlll[0]];
                stringArray66[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[750]];
                lllllllllllllllllIllIllIlIllllIl = TileObjects.getAll((String[])stringArray66);
                lllllllllllllllllIllIllIlIllllII = lllllllllllllllllIllIllIlIllllIl.stream().filter(tileObject -> {
                    String[] stringArray = new String[lllIlIIlll[0]];
                    stringArray[L.lllIlIIlll[1]] = lllIlIIllI[lllIlIIlll[830]];
                    return tileObject.hasAction(stringArray);
                }).collect(Collectors.toList());
                if (L.llIIIlIlIlIll(lllllllllllllllllIllIllIlIllllII.isEmpty() ? 1 : 0)) {
                    ((TileObject)lllllllllllllllllIllIllIlIllllII.get(lllIlIIlll[1])).interact(lllIlIIllI[lllIlIIlll[751]]);
                    Time.sleepTicks((int)lllIlIIlll[13]);
                    0;
                }
            }
            if (L.llIIIlIlIlIIl(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllllIllIllIlIlllllI2.get(lllIlIIlll[1]))) ? 1 : 0) && L.llIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = lllIlIIllI[lllIlIIlll[752]];
                ((TileObject)lllllllllllllllllIllIllIlIlllllI2.get(lllIlIIlll[1])).interact(lllIlIIllI[lllIlIIlll[753]]);
                Time.sleepTicks((int)e.c(lllIlIIlll[3], lllIlIIlll[11]));
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lllllllllllllllllIllIllIlIllIIll;
        int[] nArray = new int[lllIlIIlll[11]];
        nArray[L.lllIlIIlll[1]] = lllIlIIlll[69];
        nArray[L.lllIlIIlll[0]] = lllIlIIlll[40];
        nArray[L.lllIlIIlll[6]] = lllIlIIlll[68];
        nArray[L.lllIlIIlll[3]] = lllIlIIlll[35];
        nArray[L.lllIlIIlll[9]] = lllIlIIlll[30];
        int[] nArray2 = nArray;
        int lllllllllllllllllIllIllIlIllIIlI = lllIlIIlll[1];
        while (L.llIIIlIlIlIlI(lllllllllllllllllIllIllIlIllIIlI, ((void)lllllllllllllllllIllIllIlIllIIll).length)) {
            int[] nArray3 = new int[lllIlIIlll[0]];
            nArray3[L.lllIlIIlll[1]] = lllllllllllllllllIllIllIlIllIIll[lllllllllllllllllIllIllIlIllIIlI];
            if (L.llIIIlIlIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIlIIlll[1];
            }
            ++lllllllllllllllllIllIllIlIllIIlI;
            0;
            if (3 <= (95 + 27 - 12 + 19 ^ 8 + 56 - 52 + 121)) continue;
            return ((144 + 72 - 98 + 38 ^ 29 + 20 - 40 + 179) & (0xBE ^ 0x81 ^ (0x22 ^ 0x3D) ^ -1)) != 0;
        }
        return lllIlIIlll[0];
    }

    private static boolean llIIIlIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIIIlIlIIlIl(String lllllllllllllllllIllIllIlIIIlIIl, String lllllllllllllllllIllIllIlIIIlIII) {
        lllllllllllllllllIllIllIlIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIllIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIllIlIIIllII = new StringBuilder();
        char[] lllllllllllllllllIllIllIlIIIlIll = lllllllllllllllllIllIllIlIIIlIII.toCharArray();
        int lllllllllllllllllIllIllIlIIIlIlI = lllIlIIlll[1];
        char[] lllllllllllllllllIllIllIlIIIIlII = lllllllllllllllllIllIllIlIIIlIIl.toCharArray();
        int lllllllllllllllllIllIllIlIIIIIll = lllllllllllllllllIllIllIlIIIIlII.length;
        int lllllllllllllllllIllIllIlIIIIIlI = lllIlIIlll[1];
        while (L.llIIIlIlIlIlI(lllllllllllllllllIllIllIlIIIIIlI, lllllllllllllllllIllIllIlIIIIIll)) {
            char lllllllllllllllllIllIllIlIIIllll = lllllllllllllllllIllIllIlIIIIlII[lllllllllllllllllIllIllIlIIIIIlI];
            lllllllllllllllllIllIllIlIIIllII.append((char)(lllllllllllllllllIllIllIlIIIllll ^ lllllllllllllllllIllIllIlIIIlIll[lllllllllllllllllIllIllIlIIIlIlI % lllllllllllllllllIllIllIlIIIlIll.length]));
            0;
            ++lllllllllllllllllIllIllIlIIIlIlI;
            ++lllllllllllllllllIllIllIlIIIIIlI;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllIllIlIIIllII);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cD() {
        int n2;
        int[] nArray = new int[lllIlIIlll[0]];
        nArray[L.lllIlIIlll[1]] = lllIlIIlll[27];
        if (L.llIIIlIlIllII(Inventory.getAll((int[])nArray).size(), lllIlIIlll[9])) {
            int[] nArray2 = new int[lllIlIIlll[0]];
            nArray2[L.lllIlIIlll[1]] = lllIlIIlll[24];
            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIlIIlll[0]];
                nArray3[L.lllIlIIlll[1]] = lllIlIIlll[22];
                if (L.llIIIlIlIllII(Inventory.getAll((int[])nArray3).size(), lllIlIIlll[23])) {
                    int[] nArray4 = new int[lllIlIIlll[0]];
                    nArray4[L.lllIlIIlll[1]] = lllIlIIlll[352];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lllIlIIlll[0]];
                        nArray5[L.lllIlIIlll[1]] = lllIlIIlll[69];
                        if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            n2 = lllIlIIlll[0];
                            0;
                            if (((0xE4 ^ 0x94 ^ (0x92 ^ 0xBB)) & (0xE ^ 0x72 ^ (0x78 ^ 0x5D) ^ -1)) < 1) return n2 != 0;
                            return ((4 ^ 0x47 ^ (0x68 ^ 0x1E)) & (0x1A ^ 0x4B ^ (0x40 ^ 0x24) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lllIlIIlll[1];
        return n2 != 0;
    }

    private static String llIIIlIlIIIll(String lllllllllllllllllIllIllIIlllIlll, String lllllllllllllllllIllIllIIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllllIllIllIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIllIIlllIllI.getBytes(StandardCharsets.UTF_8)), lllIlIIlll[16]), "DES");
            Cipher lllllllllllllllllIllIllIIllllIll = Cipher.getInstance("DES");
            lllllllllllllllllIllIllIIllllIll.init(lllIlIIlll[6], lllllllllllllllllIllIllIIlllllII);
            return new String(lllllllllllllllllIllIllIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIllIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllIllIIllllIlI) {
            lllllllllllllllllIllIllIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static int llIIIlIlIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cG() {
        int n2;
        block6: {
            block7: {
                int[] nArray = new int[lllIlIIlll[0]];
                nArray[L.lllIlIIlll[1]] = lllIlIIlll[403];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lllIlIIlll[0]];
                nArray2[L.lllIlIIlll[1]] = lllIlIIlll[35];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block6;
                int[] nArray3 = new int[lllIlIIlll[0]];
                nArray3[L.lllIlIIlll[1]] = lllIlIIlll[69];
                if (!L.llIIIlIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block6;
                int[] nArray4 = new int[lllIlIIlll[0]];
                nArray4[L.lllIlIIlll[1]] = lllIlIIlll[217];
                if (!L.llIIIlIlIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                int[] nArray5 = new int[lllIlIIlll[0]];
                nArray5[L.lllIlIIlll[1]] = lllIlIIlll[217];
                if (!L.llIIIlIlIlIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block6;
            }
            int[] nArray = new int[lllIlIIlll[0]];
            nArray[L.lllIlIIlll[1]] = lllIlIIlll[43];
            if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray6 = new int[lllIlIIlll[0]];
                nArray6[L.lllIlIIlll[1]] = lllIlIIlll[24];
                if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lllIlIIlll[0]];
                    nArray7[L.lllIlIIlll[1]] = lllIlIIlll[68];
                    if (L.llIIIlIlIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                        n2 = lllIlIIlll[0];
                        0;
                        if (null == null) return n2 != 0;
                        return ((0x4F ^ 0x34 ^ (0x6C ^ 0x59)) & (10 + 165 - -19 + 2 ^ 110 + 134 - 141 + 35 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lllIlIIlll[1];
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            L.cB();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0xC0 ^ 0xC4) > 0) {
            return (0x28 ^ 0x11) & ~(0x1B ^ 0x22);
        }
        return lllIlIIlll[142];
    }
}

