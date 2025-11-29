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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aT;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking a baboon", priority=10)
public class aQ
extends aT {
    private final /* synthetic */ Set<NPC> ei;
    private static /* synthetic */ int[] llIllIIIlll;
    private /* synthetic */ String ej;
    private static /* synthetic */ String[] llIllIIIIlI;

    private static String lIlIlIIIlIlIII(String llllllllllllllllIIlIlllIlllllIIl, String llllllllllllllllIIlIlllIlllllIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllIlllllIII.getBytes(StandardCharsets.UTF_8)), llIllIIIlll[12]), "DES");
            Cipher llllllllllllllllIIlIlllIlllllIll = Cipher.getInstance("DES");
            llllllllllllllllIIlIlllIlllllIll.init(llIllIIIlll[4], llllllllllllllllIIlIlllIllllllII);
            return new String(llllllllllllllllIIlIlllIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlllIlllllIlI) {
            llllllllllllllllIIlIlllIlllllIlI.printStackTrace();
            return null;
        }
    }

    private Predicate<NPC> a(String ... stringArray) {
        return nPC -> {
            int n2;
            if (aQ.lIlIlIIlIIIllI(Stream.of(stringArray).anyMatch(string -> string.equals(nPC.getName())) ? 1 : 0) && aQ.lIlIlIIlIIlIII(nPC.isDead() ? 1 : 0)) {
                n2 = llIllIIIlll[1];
                0;
                if (null != null) {
                    return (3 & (3 ^ -1)) != 0;
                }
            } else {
                n2 = llIllIIIlll[0];
            }
            return n2 != 0;
        };
    }

    private static void lIlIlIIIlIlIlI() {
        llIllIIIIlI = new String[llIllIIIlll[3]];
        aQ.llIllIIIIlI[aQ.llIllIIIlll[0]] = aQ."";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[1]] = aQ."";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[4]] = aQ."Venom pool";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[2]] = aQ."Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[6]] = aQ."Baboon Brawler";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[8]] = aQ."Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[9]] = aQ."Attack";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[10]] = aQ."Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[12]] = aQ."Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[13]] = aQ."Baboon Shaman";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[14]] = aQ."Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[15]] = aQ."Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[16]] = aQ."Baboon Mage";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[17]] = aQ."Baboon Thrower";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[18]] = aQ."Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[19]] = aQ."Baboon Brawler";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[20]] = aQ."Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[22]] = aQ."Baboon Thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[23]] = aQ."Baboon Brawler";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[24]] = aQ."Cursed Baboon";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[25]] = aQ."Baboon Thrower";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[26]] = aQ."Baboon Mage";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[27]] = aQ."Baboon Shaman";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[28]] = aQ."Baboon thrall";
        aQ.llIllIIIIlI[aQ.llIllIIIlll[29]] = aQ."Baboon thrall";
    }

    @Override
    public boolean bC() {
        int llllllllllllllllIIlIllllIIlllIIl;
        int n2;
        SpellBook.Ancient llllllllllllllllIIlIllllIIlllIlI2;
        SpellBook.Ancient ancient;
        aQ llllllllllllllllIIlIllllIIllllIl;
        WorldPoint worldPoint2;
        WorldPoint worldPoint3 = Players.getLocal().getWorldLocation();
        if (aQ.lIlIlIIlIIIllI(this.p(worldPoint3) ? 1 : 0) && aQ.lIlIlIIlIIIlll(worldPoint2 = (WorldPoint)worldPoint3.createWorldArea(llIllIIIlll[2]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (aQ.lIlIlIIlIIlIII(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIllIIIlll[1];
                0;
                if (((0xB4 ^ 0xA8 ^ (0x1D ^ 0x4C)) & (0x28 ^ 0x2F ^ (0x5B ^ 0x11) ^ -1)) > ((0x73 ^ 0x2A ^ (0x2B ^ 0x67)) & (0x50 ^ 2 ^ (0x68 ^ 0x2F) ^ -1))) {
                    return ((164 + 24 - 64 + 81 ^ 113 + 47 - 96 + 89) & (129 + 180 - 131 + 59 ^ 81 + 111 - 140 + 133 ^ -1)) != 0;
                }
            } else {
                bl2 = llIllIIIlll[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).findFirst().orElse(null))) {
            Movement.setDestination((WorldPoint)worldPoint2);
            return llIllIIIlll[1];
        }
        NPC llllllllllllllllIIlIllllIIlllIll = llllllllllllllllIIlIllllIIllllIl.bG();
        if (aQ.lIlIlIIlIIIlIl(llllllllllllllllIIlIllllIIlllIll)) {
            return llIllIIIlll[0];
        }
        llllllllllllllllIIlIllllIIllllIl.aY.a(llIllIIIlll[3]);
        llllllllllllllllIIlIllllIIllllIl.ej = llllllllllllllllIIlIllllIIlllIll.getName();
        llllllllllllllllIIlIllllIIllllIl.bp();
        String[] stringArray = new String[llIllIIIlll[1]];
        stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[4]];
        if (aQ.lIlIlIIlIIlIII(TileObjects.getAll((String[])stringArray).isEmpty() ? 1 : 0) && (!aQ.lIlIlIIlIIlIIl(llllllllllllllllIIlIllllIIlllIll.distanceTo((Locatable)Players.getLocal()), llllllllllllllllIIlIllllIIllllIl.bg()) || aQ.lIlIlIIlIIlIII(Players.getLocal().getWorldArea().hasLineOfSightTo(llllllllllllllllIIlIllllIIllllIl.cu.getTopLevelWorldView(), llllllllllllllllIIlIllllIIlllIll.getWorldLocation()) ? 1 : 0))) {
            WorldPoint llllllllllllllllIIlIllllIIlllIlI2;
            int n3;
            WorldPoint worldPoint4 = llllllllllllllllIIlIllllIIlllIll.getWorldLocation();
            if (aQ.lIlIlIIlIIlIIl(llllllllllllllllIIlIllllIIllllIl.bg(), llIllIIIlll[4])) {
                n3 = llIllIIIlll[1];
                0;
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
                    0;
                    if (3 <= 0) {
                        return ((7 ^ 0x27) & ~(0x9D ^ 0xBD)) != 0;
                    }
                } else {
                    n2 = llIllIIIlll[0];
                }
                return n2 != 0;
            }).findFirst().orElse(null))) {
                return llIllIIIlll[0];
            }
            llllllllllllllllIIlIllllIIllllIl.g(llllllllllllllllIIlIllllIIlllIlI2);
            return llIllIIIlll[1];
        }
        if (aQ.lIlIlIIlIIlIlI(Skills.getBoostedLevel((Skill)Skill.MAGIC), llIllIIIlll[5])) {
            ancient = SpellBook.Ancient.BLOOD_BURST;
            0;
            if (((0xE1 ^ 0xAB) & ~(0x48 ^ 2)) > 3) {
                return ((0x7A ^ 0x3D) & ~(0x57 ^ 0x10)) != 0;
            }
        } else {
            ancient = llllllllllllllllIIlIllllIIlllIlI2 = SpellBook.Ancient.BLOOD_BARRAGE;
        }
        if (!aQ.lIlIlIIlIIlIII(llllllllllllllllIIlIllllIIllllIl.ej.equals(llIllIIIIlI[llIllIIIlll[2]]) ? 1 : 0) || aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIllllIl.ej.equals(llIllIIIIlI[llIllIIIlll[6]]) ? 1 : 0)) {
            n2 = llIllIIIlll[1];
            0;
            if (2 != 2) {
                return ((89 + 78 - 123 + 108 ^ 130 + 159 - 275 + 159) & (0xA1 ^ 0xB0 ^ (0x85 ^ 0xA1) ^ -1)) != 0;
            }
        } else {
            n2 = llIllIIIlll[0];
        }
        if (aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlllIIl = n2) && aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlllIlI2.canCast() ? 1 : 0)) {
            Magic.cast((Spell)llllllllllllllllIIlIllllIIlllIlI2, (NPC)llllllllllllllllIIlIllllIIlllIll);
            0;
            if (-3 >= 0) {
                return ((0x45 ^ 0x42) & ~(0x97 ^ 0x90)) != 0;
            }
        } else {
            SpellBook.Ancient llllllllllllllllIIlIllllIIlllIII;
            SpellBook.Ancient ancient2;
            if (aQ.lIlIlIIlIIlIlI(Skills.getBoostedLevel((Skill)Skill.MAGIC), llIllIIIlll[7])) {
                ancient2 = SpellBook.Ancient.ICE_BLITZ;
                0;
                if (-(0x27 ^ 0x36 ^ (0x3C ^ 0x29)) >= 0) {
                    return (((0x65 ^ 0x42) & ~(0x63 ^ 0x44) ^ (9 ^ 0x5E)) & (225 + 153 - 353 + 211 ^ 34 + 155 - 28 + 26 ^ -1)) != 0;
                }
            } else {
                ancient2 = llllllllllllllllIIlIllllIIlllIII = SpellBook.Ancient.ICE_BARRAGE;
            }
            if (aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIllllIl.ej.equals(llIllIIIIlI[llIllIIIlll[8]]) ? 1 : 0) && aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlllIII.canCast() ? 1 : 0)) {
                Magic.cast((Spell)llllllllllllllllIIlIllllIIlllIII, (NPC)llllllllllllllllIIlIllllIIlllIll);
                0;
                if (3 == 1) {
                    return ((0x6B ^ 0x41 ^ (0x2E ^ 0)) & (0x5B ^ 0x6F ^ (0x89 ^ 0xB9) ^ -1)) != 0;
                }
            } else {
                llllllllllllllllIIlIllllIIlllIll.interact(llIllIIIIlI[llIllIIIlll[9]]);
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
            0;
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

    private static String lIlIlIIIlIIlll(String llllllllllllllllIIlIllllIIIIIllI, String llllllllllllllllIIlIllllIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIllllIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllllIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllllIIIIlIII.init(llIllIIIlll[4], llllllllllllllllIIlIllllIIIIlIIl);
            return new String(llllllllllllllllIIlIllllIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllllIIIIIlll) {
            llllllllllllllllIIlIllllIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aQ(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.ei = new HashSet<NPC>();
        this.ej = llIllIIIIlI[llIllIIIlll[0]];
    }

    /*
     * WARNING - void declaration
     */
    public ConfigStorageBox<EquipmentSetup> l(String string) {
        int llllllllllllllllIIlIllllIIlIIllI;
        String string2 = string;
        int n2 = llIllIIIlll[21];
        switch (string2.hashCode()) {
            case 1911983736: {
                void llllllllllllllllIIlIllllIIlIIlll;
                if (!aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlIIlll.equals(llIllIIIIlI[llIllIIIlll[22]]) ? 1 : 0)) break;
                llllllllllllllllIIlIllllIIlIIllI = llIllIIIlll[0];
                0;
                if (2 > ((0x7C ^ 0x23) & ~(0x67 ^ 0x38))) break;
                return null;
            }
            case 618003550: {
                void llllllllllllllllIIlIllllIIlIIlll;
                if (!aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlIIlll.equals(llIllIIIIlI[llIllIIIlll[23]]) ? 1 : 0)) break;
                llllllllllllllllIIlIllllIIlIIllI = llIllIIIlll[1];
                0;
                if (3 != 0) break;
                return null;
            }
            case 556951929: {
                void llllllllllllllllIIlIllllIIlIIlll;
                if (!aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlIIlll.equals(llIllIIIIlI[llIllIIIlll[24]]) ? 1 : 0)) break;
                llllllllllllllllIIlIllllIIlIIllI = llIllIIIlll[4];
                0;
                if (((9 ^ 0x42) & ~(0x14 ^ 0x5F)) == 0) break;
                return null;
            }
            case -857618786: {
                void llllllllllllllllIIlIllllIIlIIlll;
                if (!aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlIIlll.equals(llIllIIIIlI[llIllIIIlll[25]]) ? 1 : 0)) break;
                llllllllllllllllIIlIllllIIlIIllI = llIllIIIlll[2];
                0;
                if (((0x79 ^ 0x47 ^ (0x68 ^ 0x5C)) & (0x99 ^ 0x89 ^ (0x92 ^ 0x88) ^ -1)) == 0) break;
                return null;
            }
            case 1829704903: {
                void llllllllllllllllIIlIllllIIlIIlll;
                if (!aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlIIlll.equals(llIllIIIIlI[llIllIIIlll[26]]) ? 1 : 0)) break;
                llllllllllllllllIIlIllllIIlIIllI = llIllIIIlll[6];
                0;
                if ((0x63 ^ 0x67) >= 1) break;
                return null;
            }
            case 1882859331: {
                void llllllllllllllllIIlIllllIIlIIlll;
                if (!aQ.lIlIlIIlIIIllI(llllllllllllllllIIlIllllIIlIIlll.equals(llIllIIIIlI[llIllIIIlll[27]]) ? 1 : 0)) break;
                llllllllllllllllIIlIllllIIlIIllI = llIllIIIlll[8];
            }
        }
        switch (llllllllllllllllIIlIllllIIlIIllI) {
            case 0: {
                aQ llllllllllllllllIIlIllllIIlIlIIl;
                return llllllllllllllllIIlIllllIIlIlIIl.cW.mageGearBaboons();
            }
            case 1: 
            case 2: {
                aQ llllllllllllllllIIlIllllIIlIlIIl;
                return llllllllllllllllIIlIllllIIlIlIIl.cW.mageGearBaboons();
            }
            case 3: {
                aQ llllllllllllllllIIlIllllIIlIlIIl;
                return llllllllllllllllIIlIllllIIlIlIIl.cW.meleeGearBaboons();
            }
            case 4: 
            case 5: {
                aQ llllllllllllllllIIlIllllIIlIlIIl;
                return llllllllllllllllIIlIllllIIlIlIIl.cW.rangeGearBaboons();
            }
        }
        return null;
    }

    private static void lIlIlIIlIIIlII() {
        llIllIIIlll = new int[30];
        aQ.llIllIIIlll[0] = 1 & (1 ^ -1);
        aQ.llIllIIIlll[1] = 1;
        aQ.llIllIIIlll[2] = 3;
        aQ.llIllIIIlll[3] = 0xF7 ^ 0x8C ^ (0xE3 ^ 0x81);
        aQ.llIllIIIlll[4] = 2;
        aQ.llIllIIIlll[5] = 0x64 ^ 0x38;
        aQ.llIllIIIlll[6] = 0xC ^ 8;
        aQ.llIllIIIlll[7] = 0x38 ^ 3 ^ (0x44 ^ 0x21);
        aQ.llIllIIIlll[8] = 140 + 158 - 234 + 129 ^ 127 + 107 - 106 + 68;
        aQ.llIllIIIlll[9] = 27 + 47 - -7 + 63 ^ 69 + 127 - 185 + 139;
        aQ.llIllIIIlll[10] = 0xAF ^ 0x80 ^ (0x68 ^ 0x40);
        aQ.llIllIIIlll[11] = -(0xFFFFF32F & 0x2EDB) & (0xFFFFFBFB & 0x277F);
        aQ.llIllIIIlll[12] = 0x36 ^ 0x30 ^ (0x7B ^ 0x75);
        aQ.llIllIIIlll[13] = 0x33 ^ 0x3A;
        aQ.llIllIIIlll[14] = 0x3F ^ 0x26 ^ (0x65 ^ 0x76);
        aQ.llIllIIIlll[15] = 0x3D ^ 0x36;
        aQ.llIllIIIlll[16] = 3 ^ (0x49 ^ 0x46);
        aQ.llIllIIIlll[17] = 0x6A ^ 0x6D ^ (0x83 ^ 0x89);
        aQ.llIllIIIlll[18] = 0x93 ^ 0x9D;
        aQ.llIllIIIlll[19] = 0x18 ^ 0x17;
        aQ.llIllIIIlll[20] = 0x26 ^ 0x36;
        aQ.llIllIIIlll[21] = -1;
        aQ.llIllIIIlll[22] = 7 + 96 - 5 + 71 ^ 91 + 113 - 183 + 163;
        aQ.llIllIIIlll[23] = 145 + 98 - 116 + 59 ^ 116 + 21 - -12 + 19;
        aQ.llIllIIIlll[24] = 30 + 113 - 127 + 165 ^ 54 + 122 - 91 + 81;
        aQ.llIllIIIlll[25] = 59 + 62 - 17 + 45 ^ 110 + 90 - 127 + 56;
        aQ.llIllIIIlll[26] = 32 + 103 - 124 + 141 ^ 44 + 109 - 110 + 98;
        aQ.llIllIIIlll[27] = 2 ^ (0xD4 ^ 0xC0);
        aQ.llIllIIIlll[28] = 8 ^ 0x1F;
        aQ.llIllIIIlll[29] = 0x72 ^ 0x6A;
    }

    static {
        aQ.lIlIlIIlIIIlII();
        aQ.lIlIlIIIlIlIlI();
    }

    private NPC bG() {
        aQ llllllllllllllllIIlIllllIIllIIlI;
        NPC llllllllllllllllIIlIllllIIllIIIl;
        String[] stringArray = new String[llIllIIIlll[1]];
        stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[10]];
        NPC nPC2 = NPCs.getNearest(this.a(stringArray).and(nPC -> {
            boolean bl2;
            if (aQ.lIlIlIIlIIlIII(this.ei.contains(nPC) ? 1 : 0)) {
                bl2 = llIllIIIlll[1];
                0;
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
                0;
                0;
                if (-1 == 1) {
                    return null;
                }
            } else {
                return llllllllllllllllIIlIllllIIllIIIl;
            }
        }
        String[] stringArray2 = new String[llIllIIIlll[1]];
        stringArray2[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[12]];
        Predicate<NPC> predicate = llllllllllllllllIIlIllllIIllIIlI.a(stringArray2);
        Set<NPC> set = llllllllllllllllIIlIllllIIllIIlI.ei;
        Objects.requireNonNull(set);
        0;
        llllllllllllllllIIlIllllIIllIIIl = NPCs.getNearest(predicate.and(set::contains).and(Actor::isMoving));
        if (aQ.lIlIlIIlIIIlll(llllllllllllllllIIlIllllIIllIIIl)) {
            llllllllllllllllIIlIllllIIllIIlI.ei.remove(llllllllllllllllIIlIllllIIllIIIl);
            0;
            return llllllllllllllllIIlIllllIIllIIIl;
        }
        String[] stringArray3 = new String[llIllIIIlll[1]];
        stringArray3[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[13]];
        NPC llllllllllllllllIIlIllllIIllIIII = NPCs.getNearest(llllllllllllllllIIlIllllIIllIIlI.a(stringArray3));
        if (aQ.lIlIlIIlIIIlll(llllllllllllllllIIlIllllIIllIIII)) {
            return llllllllllllllllIIlIllllIIllIIII;
        }
        String[] stringArray4 = new String[llIllIIIlll[1]];
        stringArray4[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[14]];
        List llllllllllllllllIIlIllllIIlIllll = NPCs.getAll(llllllllllllllllIIlIllllIIllIIlI.a(stringArray4));
        if (aQ.lIlIlIIlIIllII(llllllllllllllllIIlIllllIIlIllll.size(), llIllIIIlll[8])) {
            return llllllllllllllllIIlIllllIIlIllll.stream().max(Comparator.comparingInt(nPC -> {
                String[] stringArray = new String[llIllIIIlll[1]];
                stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[29]];
                return NPCs.getAll(this.a(stringArray).and(nPC2 -> {
                    boolean bl2;
                    if (aQ.lIlIlIIlIIlIlI(nPC2.getWorldLocation().distanceTo(nPC.getWorldLocation()), llIllIIIlll[4])) {
                        bl2 = llIllIIIlll[1];
                        0;
                        if (-1 >= 0) {
                            return ((73 + 74 - 105 + 112 ^ 119 + 64 - 177 + 136) & (135 + 147 - 249 + 148 ^ 149 + 121 - 203 + 94 ^ -1)) != 0;
                        }
                    } else {
                        bl2 = llIllIIIlll[0];
                    }
                    return bl2;
                })).size();
            })).get();
        }
        String[] stringArray5 = new String[llIllIIIlll[1]];
        stringArray5[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[15]];
        List llllllllllllllllIIlIllllIIlIlllI = NPCs.getAll(llllllllllllllllIIlIllllIIllIIlI.a(stringArray5).and(Actor::isMoving));
        if (aQ.lIlIlIIlIIllII(llllllllllllllllIIlIllllIIlIlllI.size(), llIllIIIlll[1])) {
            return (NPC)llllllllllllllllIIlIllllIIlIlllI.get(llIllIIIlll[0]);
        }
        String[] stringArray6 = new String[llIllIIIlll[4]];
        stringArray6[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[16]];
        stringArray6[aQ.llIllIIIlll[1]] = llIllIIIIlI[llIllIIIlll[17]];
        llllllllllllllllIIlIllllIIllIIII = NPCs.getNearest(llllllllllllllllIIlIllllIIllIIlI.a(stringArray6));
        if (aQ.lIlIlIIlIIIlll(llllllllllllllllIIlIllllIIllIIII)) {
            return llllllllllllllllIIlIllllIIllIIII;
        }
        if (aQ.lIlIlIIlIIllII(llllllllllllllllIIlIllllIIlIllll.size(), llIllIIIlll[2])) {
            return llllllllllllllllIIlIllllIIlIllll.stream().max(Comparator.comparingInt(nPC -> {
                String[] stringArray = new String[llIllIIIlll[1]];
                stringArray[aQ.llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[28]];
                return NPCs.getAll(this.a(stringArray).and(nPC2 -> {
                    boolean bl2;
                    if (aQ.lIlIlIIlIIlIlI(nPC2.getWorldLocation().distanceTo(nPC.getWorldLocation()), llIllIIIlll[4])) {
                        bl2 = llIllIIIlll[1];
                        0;
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
        llllllllllllllllIIlIllllIIllIIIl = NPCs.getNearest(llllllllllllllllIIlIllllIIllIIlI.a(stringArray7));
        if (aQ.lIlIlIIlIIIlll(llllllllllllllllIIlIllllIIllIIIl)) {
            return llllllllllllllllIIlIllllIIllIIIl;
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

    private static String lIlIlIIIlIlIIl(String llllllllllllllllIIlIlllIlllIlIIl, String llllllllllllllllIIlIlllIlllIlIII) {
        llllllllllllllllIIlIlllIlllIlIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlllIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlllIlllIIlll = new StringBuilder();
        char[] llllllllllllllllIIlIlllIlllIIllI = llllllllllllllllIIlIlllIlllIlIII.toCharArray();
        int llllllllllllllllIIlIlllIlllIIlIl = llIllIIIlll[0];
        char[] llllllllllllllllIIlIlllIllIlllll = llllllllllllllllIIlIlllIlllIlIIl.toCharArray();
        int llllllllllllllllIIlIlllIllIllllI = llllllllllllllllIIlIlllIllIlllll.length;
        int llllllllllllllllIIlIlllIllIlllIl = llIllIIIlll[0];
        while (aQ.lIlIlIIlIIlIlI(llllllllllllllllIIlIlllIllIlllIl, llllllllllllllllIIlIlllIllIllllI)) {
            char llllllllllllllllIIlIlllIlllIlIlI = llllllllllllllllIIlIlllIllIlllll[llllllllllllllllIIlIlllIllIlllIl];
            llllllllllllllllIIlIlllIlllIIlll.append((char)(llllllllllllllllIIlIlllIlllIlIlI ^ llllllllllllllllIIlIlllIlllIIllI[llllllllllllllllIIlIlllIlllIIlIl % llllllllllllllllIIlIlllIlllIIllI.length]));
            0;
            ++llllllllllllllllIIlIlllIlllIIlIl;
            ++llllllllllllllllIIlIlllIllIlllIl;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlllIlllIIlll);
    }

    private static boolean lIlIlIIlIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }
}

