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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking a baboon", priority=10)
public class AttackingABaboonTask
extends AutotoaTaskBase {
    private final  Set<NPC> ei;
    
    private  String ej;

    private Predicate<NPC> a(String ... stringArray) {
        return nPC -> {
            int n2;
            if (aQ.lIlIlIIlIIIllI(Stream.of(stringArray).anyMatch(string -> string.equals(nPC.getName())) ? 1 : 0) && aQ.lIlIlIIlIIlIII(nPC.isDead() ? 1 : 0)) {
                n2 = llIllIIIlll[1];

                }
            } else {
                n2 = llIllIIIlll[0];
            }
            return n2 != 0;
        };
    }

    private static void lIlIlIIIlIlIlI() {
        llIllIIIIlI = new String[llIllIIIlll[3]];
        aQ.llIllIIIIlI[aQ.llIllIIIlll[0]] = aQ.lIlIlIIIlIIlll("bCQytJOXsIk=", "dWzAS");
        aQ.llIllIIIIlI[aQ.llIllIIIlll[1]] = aQ.lIlIlIIIlIlIII("29AHS+agYZ0=", "sIhlP");
        aQ.llIllIIIIlI[aQ.llIllIIIlll[4]] = "Venom pool";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[2]] = "Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[6]] = "Baboon Brawler";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[8]] = "Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[9]] = "Attack";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[10]] = "Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[12]] = "Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[13]] = "Baboon Shaman";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[14]] = "Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[15]] = "Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[16]] = "Baboon Mage";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[17]] = "Baboon Thrower";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[18]] = "Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[19]] = "Baboon Brawler";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[20]] = "Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[22]] = "Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[23]] = "Baboon Brawler";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[24]] = "Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[25]] = "Baboon Thrower";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[26]] = "Baboon Mage";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[27]] = "Baboon Shaman";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[28]] = "Baboon thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[29]] = "Baboon thrall";
    }

    @Override
    public boolean bC() {
        int var1;
        int n2;
        SpellBook.Ancient llllllllllllllllIIlIllllIIlllIlI2;
        SpellBook.Ancient ancient;
        aQ var2;
        WorldPoint worldPoint2;
        WorldPoint worldPoint3 = Players.getLocal().getWorldLocation();
        if (aQ.lIlIlIIlIIIllI(this.p(worldPoint3) ? 1 : 0) && aQ.lIlIlIIlIIIlll(worldPoint2 = (WorldPoint)worldPoint3.createWorldArea(llIllIIIlll[2]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (aQ.lIlIlIIlIIlIII(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIllIIIlll[1];

                if (((0xB4 ^ 0xA8 ^ (0x1D ^ 0x4C)) & (0x28 ^ 0x2F ^ (0x5B ^ 0x11) ^ -1)) > ((0x73 ^ 0x2A ^ (0x2B ^ 0x67)) & (0x50 ^ 2 ^ (0x68 ^ 0x2F) ^ -1))) {
                    return false;
                }
            } else {
                bl2 = llIllIIIlll[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).findFirst().orElse(null))) {
            Movement.setDestination((WorldPoint)worldPoint2);
            return llIllIIIlll[1];
        }
        NPC var3 = var2.bG();
        if (aQ.lIlIlIIlIIIlIl(var3)) {
            return llIllIIIlll[0];
        }
        var2.aY.a(llIllIIIlll[3]);
        var2.ej = var3.getName();
        var2.bp();
        String[] stringArray = new String[llIllIIIlll[1]];
        stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[4]];
        if (aQ.lIlIlIIlIIlIII(TileObjects.getAll((String[])stringArray).isEmpty() ? 1 : 0) && (!aQ.lIlIlIIlIIlIIl(var3.distanceTo((Locatable)Players.getLocal()), var2.bg()) || aQ.lIlIlIIlIIlIII(Players.getLocal().getWorldArea().hasLineOfSightTo(var2.cu.getTopLevelWorldView(), var3.getWorldLocation()) ? 1 : 0))) {
            WorldPoint llllllllllllllllIIlIllllIIlllIlI2;
            int n3;
            WorldPoint worldPoint4 = var3.getWorldLocation();
            if (aQ.lIlIlIIlIIlIIl(var2.bg(), llIllIIIlll[4])) {
                n3 = llIllIIIlll[1];

                if (2 <= 0) {
                    return ((0x68 ^ 0x27 ^ (0x20 ^ 0x52)) & (1 ^ (0x1F ^ 0x23) ^ -1)) != 0;
                }
            } else {
                n3 = llIllIIIlll[4];
            }
            if (aQ.lIlIlIIlIIIlIl(llllllllllllllllIIlIllllIIlllIlI2 = (WorldPoint)worldPoint4.createWorldArea(n3).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (aQ.lIlIlIIlIIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aQ.lIlIlIIlIIlIII(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                    n2 = llIllIIIlll[1];

                    if (3 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIllIIIlll[0];
                }
                return n2 != 0;
            }).findFirst().orElse(null))) {
                return llIllIIIlll[0];
            }
            var2.g(llllllllllllllllIIlIllllIIlllIlI2);
            return llIllIIIlll[1];
        }
        if (aQ.lIlIlIIlIIlIlI(Skills.getBoostedLevel((Skill)Skill.MAGIC), llIllIIIlll[5])) {
            ancient = SpellBook.Ancient.BLOOD_BURST;

            if (((0xE1 ^ 0xAB) & ~(0x48 ^ 2)) > 3) {
                return false;
            }
        } else {
            ancient = llllllllllllllllIIlIllllIIlllIlI2 = SpellBook.Ancient.BLOOD_BARRAGE;
        }
        if (!aQ.lIlIlIIlIIlIII(var2.ej.equals(llIllIIIIlI[llIllIIIlll[2]]) ? 1 : 0) || aQ.lIlIlIIlIIIllI(var2.ej.equals(llIllIIIIlI[llIllIIIlll[6]]) ? 1 : 0)) {
            n2 = llIllIIIlll[1];

            if (2 != 2) {
                return ((89 + 78 - 123 + 108 ^ 130 + 159 - 275 + 159) & (0xA1 ^ 0xB0 ^ (0x85 ^ 0xA1) ^ -1)) != 0;
            }
        } else {
            n2 = llIllIIIlll[0];
        }
        if (aQ.lIlIlIIlIIIllI(var1 = n2) && aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlllIlI2.canCast() ? 1 : 0)) {
            Magic.cast((Spell)llllllllllllllllIIlIllllIIlllIlI2, (NPC)var3);

        } else {
            SpellBook.Ancient var4;
            SpellBook.Ancient ancient2;
            if (aQ.lIlIlIIlIIlIlI(Skills.getBoostedLevel((Skill)Skill.MAGIC), llIllIIIlll[7])) {
                ancient2 = SpellBook.Ancient.ICE_BLITZ;

                if (-(0x27 ^ 0x36 ^ (0x3C ^ 0x29)) >= 0) {
                    return (((0x65 ^ 0x42) & ~(0x63 ^ 0x44) ^ (9 ^ 0x5E)) & (225 + 153 - 353 + 211 ^ 34 + 155 - 28 + 26 ^ -1)) != 0;
                }
            } else {
                ancient2 = var4 = SpellBook.Ancient.ICE_BARRAGE;
            }
            if (aQ.lIlIlIIlIIIllI(var2.ej.equals(llIllIIIIlI[llIllIIIlll[8]]) ? 1 : 0) && aQ.lIlIlIIlIIIllI(var4.canCast() ? 1 : 0)) {
                Magic.cast((Spell)var4, (NPC)var3);

                if (3 == 1) {
                    return ((0x6B ^ 0x41 ^ (0x2E ^ 0)) & (0x5B ^ 0x6F ^ (0x89 ^ 0xB9) ^ -1)) != 0;
                }
            } else {
                var3.interact(llIllIIIIlI[llIllIIIlll[9]]);
            }
        }
        return llIllIIIlll[1];
    }

    @Override
    public void r() {
        this.ei.clear();
        this.ej = llIllIIIIlI[llIllIIIlll[1]];
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        ConfigStorageBox<EquipmentSetup> configStorageBox2 = this.l(this.ej);
        if (aQ.lIlIlIIlIIIlIl(configStorageBox2)) {
            configStorageBox = this.cW.mageGearAkkha();

            if (1 == 0) {
                return null;
            }
        } else {
            configStorageBox = configStorageBox2;
        }
        return configStorageBox;
    }

    private static boolean lIlIlIIlIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIlIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected AttackingABaboonTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.ei = new HashSet<NPC>();
        this.ej = llIllIIIIlI[llIllIIIlll[0]];
    }

    /*
     * WARNING - void declaration
     */
    public ConfigStorageBox<EquipmentSetup> l(String string) {
        int var5;
        String string2 = string;
        int n2 = llIllIIIlll[21];
        switch (string2.hashCode()) {
            case 1911983736: {
                void var6;
                if (!aQ.lIlIlIIlIIIllI(var6.equals(llIllIIIIlI[llIllIIIlll[22]]) ? 1 : 0)) break;
                var5 = llIllIIIlll[0];

                if (2 > ((0x7C ^ 0x23) & ~(0x67 ^ 0x38))) break;
                return null;
            }
            case 618003550: {
                void var6;
                if (!aQ.lIlIlIIlIIIllI(var6.equals(llIllIIIIlI[llIllIIIlll[23]]) ? 1 : 0)) break;
                var5 = llIllIIIlll[1];

                if (3 != 0) break;
                return null;
            }
            case 556951929: {
                void var6;
                if (!aQ.lIlIlIIlIIIllI(var6.equals(llIllIIIIlI[llIllIIIlll[24]]) ? 1 : 0)) break;
                var5 = llIllIIIlll[4];

                if (((9 ^ 0x42) & ~(0x14 ^ 0x5F)) == 0) break;
                return null;
            }
            case -857618786: {
                void var6;
                if (!aQ.lIlIlIIlIIIllI(var6.equals(llIllIIIIlI[llIllIIIlll[25]]) ? 1 : 0)) break;
                var5 = llIllIIIlll[2];

                if (((0x79 ^ 0x47 ^ (0x68 ^ 0x5C)) & (0x99 ^ 0x89 ^ (0x92 ^ 0x88) ^ -1)) == 0) break;
                return null;
            }
            case 1829704903: {
                void var6;
                if (!aQ.lIlIlIIlIIIllI(var6.equals(llIllIIIIlI[llIllIIIlll[26]]) ? 1 : 0)) break;
                var5 = llIllIIIlll[6];

                if ((0x63 ^ 0x67) >= 1) break;
                return null;
            }
            case 1882859331: {
                void var6;
                if (!aQ.lIlIlIIlIIIllI(var6.equals(llIllIIIIlI[llIllIIIlll[27]]) ? 1 : 0)) break;
                var5 = llIllIIIlll[8];
            }
        }
        switch (var5) {
            case 0: {
                aQ var7;
                return var7.cW.mageGearBaboons();
            }
            case 1: 
            case 2: {
                aQ var7;
                return var7.cW.mageGearBaboons();
            }
            case 3: {
                aQ var7;
                return var7.cW.meleeGearBaboons();
            }
            case 4: 
            case 5: {
                aQ var7;
                return var7.cW.rangeGearBaboons();
            }
        }
        return null;
    }

    static {
        aQ.lIlIlIIlIIIlII();
        aQ.lIlIlIIIlIlIlI();
    }

    private NPC bG() {
        aQ var8;
        NPC var9;
        String[] stringArray = new String[llIllIIIlll[1]];
        stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[10]];
        NPC nPC2 = NPCs.getNearest(this.a(stringArray).and(nPC -> {
            boolean bl2;
            if (aQ.lIlIlIIlIIlIII(this.ei.contains(nPC) ? 1 : 0)) {
                bl2 = llIllIIIlll[1];

                if (2 >= (151 + 118 - 207 + 92 ^ 35 + 6 - -115 + 2)) {
                    return ((0xA3 ^ 0xBE ^ (0xB2 ^ 0x9B)) & (2 + 167 - 17 + 39 ^ 47 + 119 - 33 + 6 ^ -1)) != 0;
                }
            } else {
                bl2 = llIllIIIlll[0];
            }
            return bl2;
        }));
        if (aQ.lIlIlIIlIIIlll(nPC2)) {
            if (aQ.lIlIlIIlIIlIll(nPC2.getGraphic(), llIllIIIlll[11])) {
                this.ei.add(nPC2);

                if (-1 == 1) {
                    return null;
                }
            } else {
                return var9;
            }
        }
        String[] stringArray2 = new String[llIllIIIlll[1]];
        stringArray2[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[12]];
        Predicate<NPC> predicate = var8.a(stringArray2);
        Set<NPC> set = var8.ei;
        Objects.requireNonNull(set);

        var9 = NPCs.getNearest(predicate.and(set::contains).and(Actor::isMoving));
        if (aQ.lIlIlIIlIIIlll(var9)) {
            var8.ei.remove(var9);

            return var9;
        }
        String[] stringArray3 = new String[llIllIIIlll[1]];
        stringArray3[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[13]];
        NPC var10 = NPCs.getNearest(var8.a(stringArray3));
        if (aQ.lIlIlIIlIIIlll(var10)) {
            return var10;
        }
        String[] stringArray4 = new String[llIllIIIlll[1]];
        stringArray4[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[14]];
        List var11 = NPCs.getAll(var8.a(stringArray4));
        if (aQ.lIlIlIIlIIllII(var11.size(), llIllIIIlll[8])) {
            return var11.stream().max(Comparator.comparingInt(nPC -> {
                String[] stringArray = new String[llIllIIIlll[1]];
                stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[29]];
                return NPCs.getAll(this.a(stringArray).and(nPC2 -> {
                    boolean bl2;
                    if (aQ.lIlIlIIlIIlIlI(nPC2.getWorldLocation().distanceTo(nPC.getWorldLocation()), llIllIIIlll[4])) {
                        bl2 = llIllIIIlll[1];

                    } else {
                        bl2 = llIllIIIlll[0];
                    }
                    return bl2;
                })).size();
            })).get();
        }
        String[] stringArray5 = new String[llIllIIIlll[1]];
        stringArray5[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[15]];
        List var12 = NPCs.getAll(var8.a(stringArray5).and(Actor::isMoving));
        if (aQ.lIlIlIIlIIllII(var12.size(), llIllIIIlll[1])) {
            return (NPC)var12.get(llIllIIIlll[0]);
        }
        String[] stringArray6 = new String[llIllIIIlll[4]];
        stringArray6[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[16]];
        stringArray6[aQ.llIllIIIlll[1]] = llIllIIIIlI[llIllIIIlll[17]];
        var10 = NPCs.getNearest(var8.a(stringArray6));
        if (aQ.lIlIlIIlIIIlll(var10)) {
            return var10;
        }
        if (aQ.lIlIlIIlIIllII(var11.size(), llIllIIIlll[2])) {
            return var11.stream().max(Comparator.comparingInt(nPC -> {
                String[] stringArray = new String[llIllIIIlll[1]];
                stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[28]];
                return NPCs.getAll(this.a(stringArray).and(nPC2 -> {
                    boolean bl2;
                    if (aQ.lIlIlIIlIIlIlI(nPC2.getWorldLocation().distanceTo(nPC.getWorldLocation()), llIllIIIlll[4])) {
                        bl2 = llIllIIIlll[1];

                        if (3 == 0) {
                            return ((15 + 153 - 85 + 72 ^ 112 + 118 - 226 + 171) & (0x10 ^ 0x47 ^ (0x14 ^ 0x77) ^ -1)) != 0;
                        }
                    } else {
                        bl2 = llIllIIIlll[0];
                    }
                    return bl2;
                })).size();
            })).get();
        }
        String[] stringArray7 = new String[llIllIIIlll[4]];
        stringArray7[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[18]];
        stringArray7[aQ.llIllIIIlll[1]] = llIllIIIIlI[llIllIIIlll[19]];
        var9 = NPCs.getNearest(var8.a(stringArray7));
        if (aQ.lIlIlIIlIIIlll(var9)) {
            return var9;
        }
        String[] stringArray8 = new String[llIllIIIlll[1]];
        stringArray8[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[20]];
        return NPCs.getNearest(this.a(stringArray8));
    }

    private static boolean lIlIlIIlIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIlIIIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var13);
    }

    private static boolean lIlIlIIlIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }
}

