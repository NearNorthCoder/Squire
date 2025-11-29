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
package gg.squire.whisperer.tasks;

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
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Killing set of ghosts", priority=50, register=true, blocking=true)
public class KillingSetOfGhostsTask
extends WhispererTaskBase {

    private final  Set<NPC> ai;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
    }

    private static boolean llIIIIIlIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        D var1;
        NPC nPC = this.w();
        if (D.llIIIIIlIIlIIlI(nPC)) {
            this.ai.clear();
            return lIlIllIlIIlIl[0];
        }
        Item var2 = var1.v();
        if (D.llIIIIIlIIlIIll(var2)) {
            String[] stringArray = new String[lIlIllIlIIlIl[1]];
            stringArray[D.lIlIllIlIIlIl[0]] = lIlIllIlIIIll[lIlIllIlIIlIl[0]];
            stringArray[D.lIlIllIlIIlIl[2]] = lIlIllIlIIIll[lIlIllIlIIlIl[2]];
            var2.interact(stringArray);
        }
        int[] nArray = new int[lIlIllIlIIlIl[3]];
        nArray[D.lIlIllIlIIlIl[0]] = lIlIllIlIIlIl[4];
        nArray[D.lIlIllIlIIlIl[2]] = lIlIllIlIIlIl[5];
        nArray[D.lIlIllIlIIlIl[1]] = lIlIllIlIIlIl[6];
        nArray[D.lIlIllIlIIlIl[7]] = lIlIllIlIIlIl[8];
        if (D.llIIIIIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
            void var3;
            SpellBook.Ancient ancient;
            if (D.llIIIIIlIIlIlIl(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIllIlIIlIl[9])) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;

                if (((0x18 ^ 0x24) & ~(0xE ^ 0x32)) >= 2) {
                    return false;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            SpellBook.Ancient var4 = ancient;
            Magic.cast((Spell)var4, (NPC)var3);
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

            if (D.llIIIIIlIIlIlII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getName().contains(lIlIllIlIIIll[lIlIllIlIIlIl[3]]) ? 1 : 0)) {
                this.ai.addAll(NPCs.getAll(nPC -> {
                    int n2;
                    if (D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIlIlll(nPC.distanceTo((Locatable)actor), lIlIllIlIIlIl[7])) {
                        n2 = lIlIllIlIIlIl[2];

                        if (((0x76 ^ 0x36) & ~(0xE9 ^ 0xA9)) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIllIlIIlIl[0];
                    }
                    return n2 != 0;
                }));

            }
        }
    }

    private NPC w() {
        D var5;
        if (D.llIIIIIlIIlIlII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getName().contains(lIlIllIlIIIll[lIlIllIlIIlIl[7]]) ? 1 : 0)) {
            return NPCs.getAll(nPC -> {
                int n2;
                if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText())) {
                    n2 = lIlIllIlIIlIl[2];

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

                    }
                } else {
                    n2 = lIlIllIlIIlIl[0];
                }
                return n2 != 0;
            }));
        }
        NPC var6 = NPCs.getNearest(nPC -> {
            int n2;
            if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText()) && D.llIIIIIlIIlIlII(nPC.getOverheadText().contains(lIlIllIlIIIll[lIlIllIlIIlIl[12]]) ? 1 : 0)) {
                n2 = lIlIllIlIIlIl[2];

                if (3 < 2) {
                    return false;
                }
            } else {
                n2 = lIlIllIlIIlIl[0];
            }
            return n2 != 0;
        });
        if (D.llIIIIIlIIlIIll(var6)) {
            return var6;
        }
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10]) && D.llIIIIIlIIllIII(nPC.isDead() ? 1 : 0) && D.llIIIIIlIIlIIll(nPC.getOverheadText()) && D.llIIIIIlIIlIlII(nPC.getOverheadText().contains(lIlIllIlIIIll[lIlIllIlIIlIl[11]]) ? 1 : 0)) {
                n2 = lIlIllIlIIlIl[2];

                if (2 == 0) {
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
        return NPCs.getNearest(nPC -> {
            int n2;
            if (D.llIIIIIlIIllIII(this.ai.contains(nPC) ? 1 : 0) && D.llIIIIIlIIlIllI(nPC.getId(), lIlIllIlIIlIl[10])) {
                n2 = lIlIllIlIIlIl[2];

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
            void var8;
            return var8;
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

        return String.valueOf(var9);
    }

    static {
        D.llIIIIIlIIlIIIl();
        D.llIIIIIlIIlIIII();
    }

    private static boolean llIIIIIlIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIIIlIIlIIII() {
        lIlIllIlIIIll = new String[lIlIllIlIIlIl[15]];
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[0]] = "Wield";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[2]] = "Wear";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[1]] = "Attack";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[7]] = "Venator";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[3]] = "Venator";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[11]] = "Sanitas!";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[12]] = "Mors!";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[13]] = "bow";
        D.lIlIllIlIIIll[D.lIlIllIlIIlIl[14]] = "blowpipe";
    }

    private static boolean llIIIIIlIIllIII(int n2) {
        return n2 == 0;
    }

    public KillingSetOfGhostsTask() {
        this.ai = new HashSet<NPC>();
    }

}

