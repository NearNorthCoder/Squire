/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Ancient
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Killing set of ghosts -> KillingsetofghostsTask */
@TaskDesc(name="Killing set of ghosts", priority=50, register=true, blocking=true)
public class KillingSetOfGhostsTask
extends u_Unknown {
    private static /* synthetic */ String[] lIlIllIlIIIll;
    private static /* synthetic */ int[] lIlIllIlIIlIl;
    private final /* synthetic */ Set<NPC> ai;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
    }

    private static void llIIIIIlIIlIIIl() {
        lIlIllIlIIlIl = new int[16];
        D.lIlIllIlIIlIl[0] = (0x15 ^ 0x2B) & ~(0xBF ^ 0x81);
        D.lIlIllIlIIlIl[1] = 2;
        D.lIlIllIlIIlIl[2] = 1;
        D.lIlIllIlIIlIl[3] = 0x9B ^ 0x9F;
        D.lIlIllIlIIlIl[4] = -(0xFFFFA7EE & 0x7CDF) & (0xFFFFBFFF & 0x7FCF);
        D.lIlIllIlIIlIl[5] = 0xFFFFDBD7 & 0x7478;
        D.lIlIllIlIIlIl[6] = -(0xFFFF953D & 0x6FF3) & (0xFFFFDF3F & 0x77FE);
        D.lIlIllIlIIlIl[7] = 3;
        D.lIlIllIlIIlIl[8] = -(0xFFFFE291 & 0x3DFF) & (0xFFFFFEFA & 0x7DDF);
        D.lIlIllIlIIlIl[9] = 0x5B ^ 5;
        D.lIlIllIlIIlIl[10] = 0xFFFFEFF4 & 0x3FBF;
        D.lIlIllIlIIlIl[11] = 89 + 120 - 202 + 135 ^ 104 + 19 - -9 + 7;
        D.lIlIllIlIIlIl[12] = 0xA4 ^ 0xA2;
        D.lIlIllIlIIlIl[13] = 78 + 164 - 120 + 58 ^ 125 + 136 - 85 + 3;
        D.lIlIllIlIIlIl[14] = 0xF3 ^ 0xA1 ^ (0x23 ^ 0x79);
        D.lIlIllIlIIlIl[15] = 0xA ^ 0x4F ^ (0x8F ^ 0xC3);
    }

    private static boolean llIIIIIlIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        D var24;
        NPC nPC = this.w();
        if (D.llIIIIIlIIlIIlI(nPC)) {
            this.ai.clear();
            return lIlIllIlIIlIl[0];
        }
        Item var16 = var24.v();
        if (D.llIIIIIlIIlIIll(var16)) {
            String[] stringArray = new String[lIlIllIlIIlIl[1]];
            stringArray[D.lIlIllIlIIlIl[0]] = lIlIllIlIIIll[lIlIllIlIIlIl[0]];
            stringArray[D.lIlIllIlIIlIl[2]] = lIlIllIlIIIll[lIlIllIlIIlIl[2]];
            var16.interact(stringArray);
        }
        int[] nArray = new int[lIlIllIlIIlIl[3]];
        nArray[D.lIlIllIlIIlIl[0]] = lIlIllIlIIlIl[4];
        nArray[D.lIlIllIlIIlIl[2]] = lIlIllIlIIlIl[5];
        nArray[D.lIlIllIlIIlIl[1]] = lIlIllIlIIlIl[6];
        nArray[D.lIlIllIlIIlIl[7]] = lIlIllIlIIlIl[8];
        if (D.llIIIIIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
            void var20;
            SpellBook.Ancient ancient;
            if (D.llIIIIIlIIlIlIl(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIllIlIIlIl[9])) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;
                0;
                if (((0x18 ^ 0x24) & ~(0xE ^ 0x32)) >= 2) {
                    return false;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            SpellBook.Ancient var4 = ancient;
            Magic.cast((Spell)var4, (NPC)var20);
            return lIlIllIlIIlIl[2];
        }
        nPC.interact(lIlIllIlIIIll[lIlIllIlIIlIl[1]]);
        return lIlIllIlIIlIl[2];
    }

    private static boolean llIIIIIlIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if (D.llIIIIIlIIlIIll(actor) && D.llIIIIIlIIlIllI(actor.getId(), lIlIllIlIIlIl[10])) {
            this.ai.add((NPC)actor);
            0;
            if (D.llIIIIIlIIlIlII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getName().contains(lIlIllIlIIIll[lIlIllIlIIlIl[3]]) ? 1 : 0)) {
                this.ai.addAll(NPCs.getAll(nPC -> {
                    int n2;
                    if (D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIlIlll(nPC.distanceTo((Locatable)actor), lIlIllIlIIlIl[7])) {
                        n2 = lIlIllIlIIlIl[2];
                        0;
                        if (((0x76 ^ 0x36) & ~(0xE9 ^ 0xA9)) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIllIlIIlIl[0];
                    }
                    return n2 != 0;
                }));
                0;
            }
        }
    }

    private NPC w() {
        D llllllllllllllIllIlIIlIIIIIIIIII;
        if (D.llIIIIIlIIlIlII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getName().contains(lIlIllIlIIIll[lIlIllIlIIlIl[7]]) ? 1 : 0)) {
            return NPCs.getAll(nPC -> {
                int n2;
                if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText())) {
                    n2 = lIlIllIlIIlIl[2];
                    0;
                    if (-1 > 3) {
                        return ((0x4A ^ 0x17 ^ (0x57 ^ 0x36)) & (0xB9 ^ 0xA6 ^ (7 ^ 0x24) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIllIlIIlIl[0];
                }
                return n2 != 0;
            }).stream().max(Comparator.comparingInt(Locatable::getWorldY)).orElse(NPCs.getNearest(nPC -> {
                int n2;
                if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText())) {
                    n2 = lIlIllIlIIlIl[2];
                    0;
                    
                    }
                } else {
                    n2 = lIlIllIlIIlIl[0];
                }
                return n2 != 0;
            }));
        }
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText()) && D.llIIIIIlIIlIlII(nPC.getOverheadText().contains(lIlIllIlIIIll[lIlIllIlIIlIl[12]]) ? 1 : 0)) {
                n2 = lIlIllIlIIlIl[2];
                0;
                if (3 < 2) {
                    return false;
                }
            } else {
                n2 = lIlIllIlIIlIl[0];
            }
            return n2 != 0;
        });
        if (D.llIIIIIlIIlIIll(var7)) {
            return var7;
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText()) && D.llIIIIIlIIlIlII(nPC.getOverheadText().contains(lIlIllIlIIIll[lIlIllIlIIlIl[11]]) ? 1 : 0)) {
                n2 = lIlIllIlIIlIl[2];
                0;
                if (2 == 0) {
                    return false;
                }
            } else {
                n2 = lIlIllIlIIlIl[0];
            }
            return n2 != 0;
        });
        if (D.llIIIIIlIIlIIll(var2)) {
            return var2;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10])) {
                n2 = lIlIllIlIIlIl[2];
                0;
                
                }
            } else {
                n2 = lIlIllIlIIlIl[0];
            }
            return n2 != 0;
        });
    }

    private static boolean llIIIIIlIIlIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private Item v() {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIll[lIlIllIlIIlIl[14]]));
        if (D.llIIIIIlIIlIIll(item2)) {
            void var21;
            return var21;
        }
        return Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIll[lIlIllIlIIlIl[13]]));
    }

    private static boolean llIIIIIlIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static String llIIIIIlIIIIllI(String var11, String var10) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var18 = var10.toCharArray();
        int var25 = lIlIllIlIIlIl[0];
        char[] var1 = var11.toCharArray();
        int var19 = var1.length;
        int var3 = lIlIllIlIIlIl[0];
        while (D.llIIIIIlIIllIIl(var3, var19)) {
            char var26 = var1[var3];
            var13.append((char)(var26 ^ var18[var25 % var18.length]));
            0;
            ++var25;
            ++var3;
            0;
            if (((0x70 ^ 0x2B) & ~(0x4A ^ 0x11)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        D.llIIIIIlIIlIIIl();
        D.llIIIIIlIIlIIII();
    }

    private static String llIIIIIlIIIIlll(String var8, String var15) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIllIlIIlIl[1], var23);
            return new String(var12.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIIIlIIlIIII() {
        lIlIllIlIIIll = new String[lIlIllIlIIlIl[15]];
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[0]] = D."Wield";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[2]] = D."Wear";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[1]] = D."Attack";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[7]] = D."Venator";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[3]] = D."Venator";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[11]] = D."Sanitas!";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[12]] = D."Mors!";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[13]] = D."bow";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[14]] = D."blowpipe";
    }

    private static boolean llIIIIIlIIllIII(int n2) {
        return n2 == 0;
    }

    public D() {
        this.ai = new HashSet<NPC>();
    }

    private static String llIIIIIlIIIllIl(String var5, String var22) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIlIl[14]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIllIlIIlIl[1], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

