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
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
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

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        D var3;
        NPC nPC = this.w();
        if nPC == null {
            this.ai.clear();
            return 0;
        }
        Item var4 = var3.v();
        if var4 != null {
            String[] stringArray = new String[1];
            stringArray[0] = var1[0];
            stringArray[2] = var1[2];
            var4.interact(stringArray);
        }
        int[] nArray = new int[3];
        nArray[0] = 4;
        nArray[2] = 5;
        nArray[1] = 6;
        nArray[7] = 8;
        if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
            void var5;
            SpellBook.Ancient ancient;
            if ((Skills.getBoostedLevel((SkiSkill.MAGIC) >= 9)) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;
                0;
                if (((0x18 ^ 0x24) & ~(0xE ^ 0x32)) >= 2) {
                    return ((0x9F ^ 0x93) & ~(3 ^ 0xF)) != 0;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            SpellBook.Ancient var6 = ancient;
            Magic.cast((Spevar6, (NPC)var5);
            return 2;
        }
        nPC.interact(var1[1]);
        return 2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if (actor != null && (actor.getId() == var2[10])) {
            this.ai.add((NPC)actor);
            0;
            if ((Equipment.fromSlot(EquipmentInventorySlotEquipmentInventorySlot.WEAPON).getName().contains(var1[3]) ? 1 : 0)) {
                this.ai.addAll(NPCs.getAll(nPC -> {
                    int n2;
                    if ((nPC.getId() == var2[10]) && (nPC.distanceTo((Locatable)actor) <= 7)) {
                        n2 = 2;
                        0;
                        if (((0x76 ^ 0x36) & ~(0xE9 ^ 0xA9)) != 0) {
                            return ((0xC4 ^ 0x97) & ~(0x92 ^ 0xC1)) != 0;
                        }
                    } else {
                        n2 = 0;
                    }
                    return n2 != 0;
                }));
                0;
            }
        }
    }

    private NPC w() {
        D var7;
        if ((Equipment.fromSlot(EquipmentInventorySlotEquipmentInventorySlot.WEAPON).getName().contains(var1[7]) ? 1 : 0)) {
            return NPCs.getAll(nPC -> {
                int n2;
                if ((this.ai.contains(nPC == 0) ? 1 : 0) && (nPC.getId() == var2[10]) && (nPC.isDead( == 0) ? 1 : 0) && (nPC.getOverheadText( != null))) {
                    n2 = 2;
                    0;
                    if (-1 > 3) {
                        return ((0x4A ^ 0x17 ^ (0x57 ^ 0x36)) & (0xB9 ^ 0xA6 ^ (7 ^ 0x24) ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            }).stream().max(Comparator.comparingInt(Locatable::getWorldY)).orElse(NPCs.getNearest(nPC -> {
                int n2;
                if ((this.ai.contains(nPC == 0) ? 1 : 0) && (nPC.getId() == var2[10]) && (nPC.isDead( == 0) ? 1 : 0) && (nPC.getOverheadText( != null))) {
                    n2 = 2;
                    0;
                    if null != null {
                        return ((58 + 135 - 164 + 131 ^ 23 + 69 - -27 + 59) & (78 + 114 - 97 + 42 ^ 82 + 147 - 78 + 4 ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            }));
        }
        NPC var8 = NPCs.getNearest(nPC -> {
            int n2;
            if ((this.ai.contains(nPC == 0) ? 1 : 0) && (nPC.getId() == var2[10]) && (nPC.isDead( == 0) ? 1 : 0) && (nPC.getOverheadText( != null)) && (nPC.getOverheadText( != 0).contains(var1[var2[12]]) ? 1 : 0)) {
                n2 = 2;
                0;
                if (3 < 2) {
                    return ((0xBB ^ 0xBD) & ~(0xD ^ 0xB)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var8 != null {
            return var8;
        }
        NPC var9 = NPCs.getNearest(nPC -> {
            int n2;
            if ((this.ai.contains(nPC == 0) ? 1 : 0) && (nPC.getId() == var2[10]) && (nPC.isDead( == 0) ? 1 : 0) && (nPC.getOverheadText( != null)) && (nPC.getOverheadText( != 0).contains(var1[var2[11]]) ? 1 : 0)) {
                n2 = 2;
                0;
                
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var9 != null {
            return var9;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if ((this.ai.contains(nPC == 0) ? 1 : 0) && (nPC.getId() == var2[10])) {
                n2 = 2;
                0;
                if null != null {
                    return ((213 + 37 - 136 + 133 ^ 66 + 150 - 116 + 91) & (0x52 ^ 0x4C ^ (0xEF ^ 0xB9) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private Item v() {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[14]]));
        if item2 != null {
            void var10;
            return var10;
        }
        return Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[13]]));
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0x70 ^ 0x2B) & ~(0x4A ^ 0x11)) == 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public KillingSetOfGhostsTask() {
        this.ai = new HashSet<NPC>();
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }
}

