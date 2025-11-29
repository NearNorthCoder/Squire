/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Ancient
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking a baboon", priority=10)
public class AttackingABaboonTask
extends AutotoaManager {
    private final  Set<NPC> ei;
    
    private  String ej;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private Predicate<NPC> a(String ... stringArray) {
        return nPC -> {
            int n2;
            if (aQ.var9(Stream.of(stringArray).anyMatch(string -> string.equals(nPC.getName())) ? 1 : 0) && aQ.var10(nPC.isDead() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if null != null {
                    return (3 & (3 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        };
    }

    private static void var11() {
        var2 = new String[var1[3]];
        aQ.var2[aQ.var1[0]] = aQ.var12("bCQytJOXsIk=", "dWzAS");
        aQ.var2[aQ.var1[1]] = aQ.var3("29AHS+agYZ0=", "sIhlP");
        aQ.var2[aQ.var1[4]] = "Venom pool";
        aQ.var2[aQ.var1[2]] = "Baboon Thrall";
        aQ.var2[aQ.var1[6]] = "Baboon Brawler";
        aQ.var2[aQ.var1[8]] = "Cursed Baboon";
        aQ.var2[aQ.var1[9]] = "Attack";
        aQ.var2[aQ.var1[10]] = "Cursed Baboon";
        aQ.var2[aQ.var1[12]] = "Cursed Baboon";
        aQ.var2[aQ.var1[13]] = "Baboon Shaman";
        aQ.var2[aQ.var1[14]] = "Baboon Thrall";
        aQ.var2[aQ.var1[15]] = "Cursed Baboon";
        aQ.var2[aQ.var1[16]] = "Baboon Mage";
        aQ.var2[aQ.var1[17]] = "Baboon Thrower";
        aQ.var2[aQ.var1[18]] = "Cursed Baboon";
        aQ.var2[aQ.var1[19]] = "Baboon Brawler";
        aQ.var2[aQ.var1[20]] = "Baboon Thrall";
        aQ.var2[aQ.var1[22]] = "Baboon Thrall";
        aQ.var2[aQ.var1[23]] = "Baboon Brawler";
        aQ.var2[aQ.var1[24]] = "Cursed Baboon";
        aQ.var2[aQ.var1[25]] = "Baboon Thrower";
        aQ.var2[aQ.var1[26]] = "Baboon Mage";
        aQ.var2[aQ.var1[27]] = "Baboon Shaman";
        aQ.var2[aQ.var1[28]] = "Baboon thrall";
        aQ.var2[aQ.var1[29]] = "Baboon thrall";
    }

    @Override
    public boolean bC() {
        int var13;
        int n2;
        SpellBook.Ancient llllllllllllllllIIlIllllIIlllIlI2;
        SpellBook.Ancient ancient;
        aQ var14;
        WorldPoint worldPoint2;
        WorldPoint worldPoint3 = Players.getLocal().getWorldLocation();
        if (aQ.var9(this.p(worldPoint3) ? 1 : 0) && aQ.var15(worldPoint2 = (WorldPoint)worldPoint3.createWorldArea(var1[2]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (aQ.var10(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                if (((0xB4 ^ 0xA8 ^ (0x1D ^ 0x4C)) & (0x28 ^ 0x2F ^ (0x5B ^ 0x11) ^ -1)) > ((0x73 ^ 0x2A ^ (0x2B ^ 0x67)) & (0x50 ^ 2 ^ (0x68 ^ 0x2F) ^ -1))) {
                    return ((164 + 24 - 64 + 81 ^ 113 + 47 - 96 + 89) & (129 + 180 - 131 + 59 ^ 81 + 111 - 140 + 133 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).findFirst().orElse(null))) {
            Movement.setDestination((WorldPoint)worldPoint2);
            return var1[1];
        }
        NPC var16 = var14.bG();
        if (aQ.var17(var16)) {
            return var1[0];
        }
        var14.aY.a(var1[3]);
        var14.ej = var16.getName();
        var14.bp();
        String[] stringArray = new String[var1[1]];
        stringArray[aQ.var1[0]] = var2[var1[4]];
        if (aQ.var10(TileObjects.getAll((String[])stringArray).isEmpty() ? 1 : 0) && (!aQ.var18(var16.distanceTo((Locatable)Players.getLocal()), var14.bg()) || aQ.var10(Players.getLocal().getWorldArea().hasLineOfSightTo(var14.cu.getTopLevelWorldView(), var16.getWorldLocation()) ? 1 : 0))) {
            WorldPoint llllllllllllllllIIlIllllIIlllIlI2;
            int n3;
            WorldPoint worldPoint4 = var16.getWorldLocation();
            if (aQ.var18(var14.bg(), var1[4])) {
                n3 = var1[1];
                0;
                if (2 <= 0) {
                    return ((0x68 ^ 0x27 ^ (0x20 ^ 0x52)) & (1 ^ (0x1F ^ 0x23) ^ -1)) != 0;
                }
            } else {
                n3 = var1[4];
            }
            if (aQ.var17(llllllllllllllllIIlIllllIIlllIlI2 = (WorldPoint)worldPoint4.createWorldArea(n3).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (aQ.var9(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aQ.var10(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (3 <= 0) {
                        return ((7 ^ 0x27) & ~(0x9D ^ 0xBD)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            }).findFirst().orElse(null))) {
                return var1[0];
            }
            var14.g(llllllllllllllllIIlIllllIIlllIlI2);
            return var1[1];
        }
        if (aQ.var19(Skills.getBoostedLevel((SkiSkill.MAGIC), var1[5])) {
            ancient = SpellBook.Ancient.BLOOD_BURST;
            0;
            if (((0xE1 ^ 0xAB) & ~(0x48 ^ 2)) > 3) {
                return ((0x7A ^ 0x3D) & ~(0x57 ^ 0x10)) != 0;
            }
        } else {
            ancient = llllllllllllllllIIlIllllIIlllIlI2 = SpellBook.Ancient.BLOOD_BARRAGE;
        }
        if (!aQ.var10(var14.ej.equals(var2[var1[2]]) ? 1 : 0) || aQ.var9(var14.ej.equals(var2[var1[6]]) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (2 != 2) {
                return ((89 + 78 - 123 + 108 ^ 130 + 159 - 275 + 159) & (0xA1 ^ 0xB0 ^ (0x85 ^ 0xA1) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        if (aQ.var9(var13 = n2) && aQ.var9(llllllllllllllllIIlIllllIIlllIlI2.canCast() ? 1 : 0)) {
            Magic.cast((SpellllllllllllllllIIlIllllIIlllIlI2, (NPC)var16);
            0;
            if (-3 >= 0) {
                return ((0x45 ^ 0x42) & ~(0x97 ^ 0x90)) != 0;
            }
        } else {
            SpellBook.Ancient var20;
            SpellBook.Ancient ancient2;
            if (aQ.var19(Skills.getBoostedLevel((SkiSkill.MAGIC), var1[7])) {
                ancient2 = SpellBook.Ancient.ICE_BLITZ;
                0;
                if (-(0x27 ^ 0x36 ^ (0x3C ^ 0x29)) >= 0) {
                    return (((0x65 ^ 0x42) & ~(0x63 ^ 0x44) ^ (9 ^ 0x5E)) & (225 + 153 - 353 + 211 ^ 34 + 155 - 28 + 26 ^ -1)) != 0;
                }
            } else {
                ancient2 = var20 = SpellBook.Ancient.ICE_BARRAGE;
            }
            if (aQ.var9(var14.ej.equals(var2[var1[8]]) ? 1 : 0) && aQ.var9(var20.canCast() ? 1 : 0)) {
                Magic.cast((Spevar20, (NPC)var16);
                0;
                if (3 == 1) {
                    return ((0x6B ^ 0x41 ^ (0x2E ^ 0)) & (0x5B ^ 0x6F ^ (0x89 ^ 0xB9) ^ -1)) != 0;
                }
            } else {
                var16.interact(var2[var1[9]]);
            }
        }
        return var1[1];
    }

    @Override
    public void r() {
        this.ei.clear();
        this.ej = var2[var1[1]];
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        ConfigStorageBox<EquipmentSetup> configStorageBox2 = this.l(this.ej);
        if (aQ.var17(configStorageBox2)) {
            configStorageBox = this.cW.mageGearAkkha();
            0;
            
        } else {
            configStorageBox = configStorageBox2;
        }
        return configStorageBox;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var22(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    @Inject
    protected AttackingABaboonTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.ei = new HashSet<NPC>();
        this.ej = var2[var1[0]];
    }

    /*
     * WARNING - void declaration
     */
    public ConfigStorageBox<EquipmentSetup> l(String string) {
        int var28;
        String string2 = string;
        int n2 = var1[21];
        switch (string2.hashCode()) {
            case 1911983736: {
                void var29;
                if (!aQ.var9(var29.equals(var2[var1[22]]) ? 1 : 0)) break;
                var28 = var1[0];
                0;
                if (2 > ((0x7C ^ 0x23) & ~(0x67 ^ 0x38))) break;
                return null;
            }
            case 618003550: {
                void var29;
                if (!aQ.var9(var29.equals(var2[var1[23]]) ? 1 : 0)) break;
                var28 = var1[1];
                0;
                if (3 != 0) break;
                return null;
            }
            case 556951929: {
                void var29;
                if (!aQ.var9(var29.equals(var2[var1[24]]) ? 1 : 0)) break;
                var28 = var1[4];
                0;
                if (((9 ^ 0x42) & ~(0x14 ^ 0x5F)) == 0) break;
                return null;
            }
            case -857618786: {
                void var29;
                if (!aQ.var9(var29.equals(var2[var1[25]]) ? 1 : 0)) break;
                var28 = var1[2];
                0;
                if (((0x79 ^ 0x47 ^ (0x68 ^ 0x5C)) & (0x99 ^ 0x89 ^ (0x92 ^ 0x88) ^ -1)) == 0) break;
                return null;
            }
            case 1829704903: {
                void var29;
                if (!aQ.var9(var29.equals(var2[var1[26]]) ? 1 : 0)) break;
                var28 = var1[6];
                0;
                if ((0x63 ^ 0x67) >= 1) break;
                return null;
            }
            case 1882859331: {
                void var29;
                if (!aQ.var9(var29.equals(var2[var1[27]]) ? 1 : 0)) break;
                var28 = var1[8];
            }
        }
        switch (var28) {
            case 0: {
                aQ var30;
                return var30.cW.mageGearBaboons();
            }
            case 1: 
            case 2: {
                aQ var30;
                return var30.cW.mageGearBaboons();
            }
            case 3: {
                aQ var30;
                return var30.cW.meleeGearBaboons();
            }
            case 4: 
            case 5: {
                aQ var30;
                return var30.cW.rangeGearBaboons();
            }
        }
        return null;
    }

    private static void var31() {
        var1 = new int[30];
        aQ.var1[0] = 1 & (1 ^ -1);
        aQ.var1[1] = 1;
        aQ.var1[2] = 3;
        aQ.var1[3] = 0xF7 ^ 0x8C ^ (0xE3 ^ 0x81);
        aQ.var1[4] = 2;
        aQ.var1[5] = 0x64 ^ 0x38;
        aQ.var1[6] = 0xC ^ 8;
        aQ.var1[7] = 0x38 ^ 3 ^ (0x44 ^ 0x21);
        aQ.var1[8] = 140 + 158 - 234 + 129 ^ 127 + 107 - 106 + 68;
        aQ.var1[9] = 27 + 47 - -7 + 63 ^ 69 + 127 - 185 + 139;
        aQ.var1[10] = 0xAF ^ 0x80 ^ (0x68 ^ 0x40);
        aQ.var1[11] = -(0xFFFFF32F & 0x2EDB) & (0xFFFFFBFB & 0x277F);
        aQ.var1[12] = 0x36 ^ 0x30 ^ (0x7B ^ 0x75);
        aQ.var1[13] = 0x33 ^ 0x3A;
        aQ.var1[14] = 0x3F ^ 0x26 ^ (0x65 ^ 0x76);
        aQ.var1[15] = 0x3D ^ 0x36;
        aQ.var1[16] = 3 ^ (0x49 ^ 0x46);
        aQ.var1[17] = 0x6A ^ 0x6D ^ (0x83 ^ 0x89);
        aQ.var1[18] = 0x93 ^ 0x9D;
        aQ.var1[19] = 0x18 ^ 0x17;
        aQ.var1[20] = 0x26 ^ 0x36;
        aQ.var1[21] = -1;
        aQ.var1[22] = 7 + 96 - 5 + 71 ^ 91 + 113 - 183 + 163;
        aQ.var1[23] = 145 + 98 - 116 + 59 ^ 116 + 21 - -12 + 19;
        aQ.var1[24] = 30 + 113 - 127 + 165 ^ 54 + 122 - 91 + 81;
        aQ.var1[25] = 59 + 62 - 17 + 45 ^ 110 + 90 - 127 + 56;
        aQ.var1[26] = 32 + 103 - 124 + 141 ^ 44 + 109 - 110 + 98;
        aQ.var1[27] = 2 ^ (0xD4 ^ 0xC0);
        aQ.var1[28] = 8 ^ 0x1F;
        aQ.var1[29] = 0x72 ^ 0x6A;
    }

    static {
        aQ.var31();
        aQ.var11();
    }

    private NPC bG() {
        aQ var32;
        NPC var33;
        String[] stringArray = new String[var1[1]];
        stringArray[aQ.var1[0]] = var2[var1[10]];
        NPC nPC2 = NPCs.getNearest(this.a(stringArray).and(nPC -> {
            boolean bl2;
            if (aQ.var10(this.ei.contains(nPC) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                if (2 >= (151 + 118 - 207 + 92 ^ 35 + 6 - -115 + 2)) {
                    return ((0xA3 ^ 0xBE ^ (0xB2 ^ 0x9B)) & (2 + 167 - 17 + 39 ^ 47 + 119 - 33 + 6 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }));
        if (aQ.var15(nPC2)) {
            if (aQ.var22(nPC2.getGraphic(), var1[11])) {
                this.ei.add(nPC2);
                0;
                0;
                if (-1 == 1) {
                    return null;
                }
            } else {
                return var33;
            }
        }
        String[] stringArray2 = new String[var1[1]];
        stringArray2[aQ.var1[0]] = var2[var1[12]];
        Predicate<NPC> predicate = var32.a(stringArray2);
        Set<NPC> set = var32.ei;
        Objects.requireNonNull(set);
        0;
        var33 = NPCs.getNearest(predicate.and(set::contains).and(Actor::isMoving));
        if (aQ.var15(var33)) {
            var32.ei.remove(var33);
            0;
            return var33;
        }
        String[] stringArray3 = new String[var1[1]];
        stringArray3[aQ.var1[0]] = var2[var1[13]];
        NPC var34 = NPCs.getNearest(var32.a(stringArray3));
        if (aQ.var15(var34)) {
            return var34;
        }
        String[] stringArray4 = new String[var1[1]];
        stringArray4[aQ.var1[0]] = var2[var1[14]];
        List var35 = NPCs.getAll(var32.a(stringArray4));
        if (aQ.var21(var35.size(), var1[8])) {
            return var35.stream().max(Comparator.comparingInt(nPC -> {
                String[] stringArray = new String[var1[1]];
                stringArray[aQ.var1[0]] = var2[var1[29]];
                return NPCs.getAll(this.a(stringArray).and(nPC2 -> {
                    boolean bl2;
                    if (aQ.var19(nPC2.getWorldLocation().distanceTo(nPC.getWorldLocation()), var1[4])) {
                        bl2 = var1[1];
                        0;
                        if (-1 >= 0) {
                            return ((73 + 74 - 105 + 112 ^ 119 + 64 - 177 + 136) & (135 + 147 - 249 + 148 ^ 149 + 121 - 203 + 94 ^ -1)) != 0;
                        }
                    } else {
                        bl2 = var1[0];
                    }
                    return bl2;
                })).size();
            })).get();
        }
        String[] stringArray5 = new String[var1[1]];
        stringArray5[aQ.var1[0]] = var2[var1[15]];
        List var36 = NPCs.getAll(var32.a(stringArray5).and(Actor::isMoving));
        if (aQ.var21(var36.size(), var1[1])) {
            return (NPC)var36.get(var1[0]);
        }
        String[] stringArray6 = new String[var1[4]];
        stringArray6[aQ.var1[0]] = var2[var1[16]];
        stringArray6[aQ.var1[1]] = var2[var1[17]];
        var34 = NPCs.getNearest(var32.a(stringArray6));
        if (aQ.var15(var34)) {
            return var34;
        }
        if (aQ.var21(var35.size(), var1[2])) {
            return var35.stream().max(Comparator.comparingInt(nPC -> {
                String[] stringArray = new String[var1[1]];
                stringArray[aQ.var1[0]] = var2[var1[28]];
                return NPCs.getAll(this.a(stringArray).and(nPC2 -> {
                    boolean bl2;
                    if (aQ.var19(nPC2.getWorldLocation().distanceTo(nPC.getWorldLocation()), var1[4])) {
                        bl2 = var1[1];
                        0;
                        
                    } else {
                        bl2 = var1[0];
                    }
                    return bl2;
                })).size();
            })).get();
        }
        String[] stringArray7 = new String[var1[4]];
        stringArray7[aQ.var1[0]] = var2[var1[18]];
        stringArray7[aQ.var1[1]] = var2[var1[19]];
        var33 = NPCs.getNearest(var32.a(stringArray7));
        if (aQ.var15(var33)) {
            return var33;
        }
        String[] stringArray8 = new String[var1[1]];
        stringArray8[aQ.var1[0]] = var2[var1[20]];
        return NPCs.getNearest(this.a(stringArray8));
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static String var37(String var38, String var39) {
        var38 = new String(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var40 = new StringBuilder();
        char[] var41 = var39.toCharArray();
        int var42 = var1[0];
        char[] var43 = var38.toCharArray();
        int var44 = var43.length;
        int var45 = var1[0];
        while (aQ.var19(var45, var44)) {
            char var46 = var43[var45];
            var40.append((char)(var46 ^ var41[var42 % var41.length]));
            0;
            ++var42;
            ++var45;
            0;
            
            return null;
        }
        return String.valueOf(var40);
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }
}

