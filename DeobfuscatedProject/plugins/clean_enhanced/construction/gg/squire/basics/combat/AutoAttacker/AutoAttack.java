/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.combat.AutoAttacker;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.combat.AutoAttacker.AutoAttackConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.combat.AutoAttacker.GameEnum11;
import gg.squire.basics.combat.AutoAttacker.GameEnum7;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@SquireUtil
@PluginDescriptor(name="Squire Auto Attacker", description="Auto Attacks when idle", enabledByDefault=false)
public class AutoAttack
extends SquirePlugin {
     WorldPoint bC;
    @Inject
     AutoAttackConfig bz;
    @Inject
     ConfigManager bA;
    private  int bD;
    private static  String[] lIlIIIl;
    private  int bE;
    @Inject
     ClientThread bB;
    private static  int[] lIlIIlI;

    private static boolean lIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllII(Object object) {
        return object != null;
    }

    public void k(int n2) {
        this.bD = n2;
    }

    private static boolean lIlIlIIII(Object object) {
        return object == null;
    }

    protected void onStart() {
        if (AutoAttack.lIlIIlIIl(this.bz.safeSpot() ? 1 : 0)) {
            this.bC = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean lIlIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIIIll(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var5 = lIlIIlI[2];
        char[] var6 = var1.toCharArray();
        int var7 = var6.length;
        int var8 = lIlIIlI[2];
        while (AutoAttack.lIlIIlllI(var8, var7)) {
            char var9 = var6[var8];
            var3.append((char)(var9 ^ var4[var5 % var4.length]));
            0;
            ++var5;
            ++var8;
            0;
            if (2 != ((0x38 ^ 0x20 ^ (0x6F ^ 0x28)) & (0x67 ^ 2 ^ (0xAF ^ 0x95) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static void lIlIIIllI() {
        lIlIIIl = new String[lIlIIlI[35]];
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[2]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[1]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[6]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[7]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[8]] = "No inventory space to put on spec weapon.";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[9]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[10]] = "gargoyle";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[11]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[12]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[13]] = "gargoyle";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[14]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[15]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[16]] = "completed your task!";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[17]] = "squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[18]] = "npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[19]] = "empty";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[20]] = "No teleport tabs left in inventory";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[21]] = "Break";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[22]] = "Wear";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[23]] = "Break";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[27]] = "s";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[28]] = "bird";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[29]] = "Chicken";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[30]] = "squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[31]] = "npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[32]] = "squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[33]] = "npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[34]] = "Attack";
    }

    private static boolean lIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public int ap() {
        return this.bD;
    }

    protected Class<?>[] tasks() {
        return new Class[lIlIIlI[2]];
    }

    private static boolean lIlIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    public int aq() {
        return this.bE;
    }

    /*
     * WARNING - void declaration
     */
    private void ao() {
        void var10;
        void var11;
        H h2 = this.bz.teleportItem();
        int n2 = h2.aw();
        int[] nArray = h2.av();
        String string = h2.au();
        if (AutoAttack.lIlIIlIIl(n2) && AutoAttack.lIlIIlIII(Equipment.contains((int[])nArray) ? 1 : 0) && AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.a(nArray);
        }
        if (AutoAttack.lIlIIlIIl(Equipment.contains((int[])var11) ? 1 : 0)) {
            Equipment.getFirst((int[])var11).interact((String)var10);
        }
        if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])var11) ? 1 : 0)) {
            Inventory.getFirst((int[])var11).interact((String)var10);
        }
    }

    public void l(int n2) {
        this.bE = n2;
    }

    protected void onStop() {
    }

    private static boolean lIlIIlIII(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Item var12;
        Object var13;
        AutoAttack var14;
        if (AutoAttack.lIlIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        if (AutoAttack.lIlIIlIIl(var14.bz.safeSpot() ? 1 : 0) && AutoAttack.lIlIIlIlI(var14.bC.distanceTo((Locatable)Players.getLocal()), var14.bz.safeSpotRadius()) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (AutoAttack.lIlIIlIll(var14.bC.distanceTo((Locatable)Players.getLocal()), lIlIIlI[3])) {
                return;
            }
            Movement.walkTo((WorldPoint)var14.bC);
            0;
            return;
        }
        if (AutoAttack.lIlIIlIII(Combat.isSpecEnabled() ? 1 : 0) && AutoAttack.lIlIIllII(var13 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && AutoAttack.lIlIIllIl(var13.getId(), var14.bz.specWeapon().ar()) && AutoAttack.lIlIIllII(var12 = Widgets.get((int)lIlIIlI[4], (int)lIlIIlI[5]))) {
            var12.interact(lIlIIlI[2]);
        }
        if (AutoAttack.lIlIIllII(Players.getLocal().getInteracting())) {
            if (AutoAttack.lIlIIlllI(Combat.getSpecEnergy(), var14.bz.specWeapon().as())) {
                var13 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
                if (AutoAttack.lIlIIllII(var13) && AutoAttack.lIlIIllll(var13.getId(), var14.ap())) {
                    int[] nArray = new int[lIlIIlI[1]];
                    nArray[AutoAttack.lIlIIlI[2]] = var14.ap();
                    if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIIlI[1]];
                        nArray2[AutoAttack.lIlIIlI[2]] = var14.ap();
                        Inventory.getFirst((int[])nArray2).interact(lIlIIIl[lIlIIlI[2]]);
                    }
                }
                var12 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
                if (AutoAttack.lIlIIllll(var14.aq(), lIlIIlI[0]) && (!AutoAttack.lIlIIllII(var12) || AutoAttack.lIlIIllll(var12.getId(), var14.aq()))) {
                    int[] nArray = new int[lIlIIlI[1]];
                    nArray[AutoAttack.lIlIIlI[2]] = var14.aq();
                    if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIIlI[1]];
                        nArray3[AutoAttack.lIlIIlI[2]] = var14.aq();
                        Inventory.getFirst((int[])nArray3).interact(lIlIIIl[lIlIIlI[1]]);
                    }
                }
            }
            if (AutoAttack.lIlIIlIll(Combat.getSpecEnergy(), var14.bz.specWeapon().as())) {
                var13 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
                var12 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
                if (AutoAttack.lIlIIllII(var13) && AutoAttack.lIlIIllll(var13.getId(), var14.bz.specWeapon().ar())) {
                    int[] nArray = new int[lIlIIlI[1]];
                    nArray[AutoAttack.lIlIIlI[2]] = var14.bz.specWeapon().ar();
                    if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int n2;
                        var14.k(var13.getId());
                        if (AutoAttack.lIlIlIIII(var12)) {
                            n2 = lIlIIlI[0];
                            0;
                            if (3 > (7 + 115 - 80 + 142 ^ 46 + 62 - -44 + 36)) {
                                return;
                            }
                        } else {
                            n2 = var12.getId();
                        }
                        var14.l(n2);
                        if (AutoAttack.lIlIIlIII(var14.bz.specWeapon().at() ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIIlI[1]];
                            nArray4[AutoAttack.lIlIIlI[2]] = var14.bz.specWeapon().ar();
                            Inventory.getFirst((int[])nArray4).interact(lIlIIIl[lIlIIlI[6]]);
                        }
                        if (AutoAttack.lIlIIlIIl(var14.bz.specWeapon().at() ? 1 : 0) && AutoAttack.lIlIIlIlI(Inventory.getFreeSlots(), lIlIIlI[6])) {
                            int[] nArray5 = new int[lIlIIlI[1]];
                            nArray5[AutoAttack.lIlIIlI[2]] = var14.bz.specWeapon().ar();
                            Inventory.getFirst((int[])nArray5).interact(lIlIIIl[lIlIIlI[7]]);
                            0;
                            if (((0x42 ^ 0x26 ^ (0xC4 ^ 0xAE)) & (0x2E ^ 0x17 ^ (0x7F ^ 0x48) ^ -1)) != 0) {
                                return;
                            }
                        } else {
                            System.out.println(lIlIIIl[lIlIIlI[8]]);
                        }
                    }
                }
            }
            return;
        }
        var13 = NPCs.getAll(nPC -> {
            int n2;
            if (AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIIl(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIIlI[1]];
                stringArray[AutoAttack.lIlIIlI[2]] = lIlIIIl[lIlIIlI[34]];
                if (AutoAttack.lIlIIlIIl(nPC.hasAction(stringArray) ? 1 : 0) && AutoAttack.lIlIIlIIl(nPC.getName().contains(this.bz.npcName()) ? 1 : 0)) {
                    n2 = lIlIIlI[1];
                    0;
                    if (1 <= 1) return n2 != 0;
                    return ((0x2F ^ 0x6E) & ~(0x3F ^ 0x7E)) != 0;
                }
            }
            n2 = lIlIIlI[2];
            return n2 != 0;
        });
        if (AutoAttack.lIlIIlIII(var13.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIIl(Players.getLocal().isIdle() ? 1 : 0)) {
            ((NPC)var13.get(lIlIIlI[2])).interact(lIlIIIl[lIlIIlI[9]]);
        }
        if (AutoAttack.lIlIIlIIl(var14.bz.exactName() ? 1 : 0)) {
            var12 = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (AutoAttack.lIlIIlIIl(nPC.getName().equalsIgnoreCase(this.bz.npcName()) ? 1 : 0) && AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIlI(nPC.distanceTo((Locatable)Players.getLocal()), this.bz.npcDistance()) && AutoAttack.lIlIlIIlI(Walker.buildPath((WorldPoint)nPC.getWorldLocation()).size(), this.bz.npcDistance())) {
                    n2 = lIlIIlI[1];
                    0;
                    if (2 == (0x36 ^ 0x32)) {
                        return ((0xA2 ^ 0xA9) & ~(7 ^ 0xC)) != 0;
                    }
                } else {
                    n2 = lIlIIlI[2];
                }
                return n2 != 0;
            });
            if (AutoAttack.lIlIlIIII(var12)) {
                return;
            }
            if (AutoAttack.lIlIIlIIl(var12.getName().equalsIgnoreCase(lIlIIIl[lIlIIlI[10]]) ? 1 : 0) && AutoAttack.lIlIIlIIl(var13.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                var12.interact(lIlIIIl[lIlIIlI[11]]);
                Time.sleep((long)2L);
                0;
            }
            if (AutoAttack.lIlIIlIIl(var13.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && AutoAttack.lIlIIlIII(var12.isDead() ? 1 : 0)) {
                var12.interact(lIlIIIl[lIlIIlI[12]]);
                Time.sleep((long)2L);
                0;
            }
        }
        if (AutoAttack.lIlIIlIII(var14.bz.exactName() ? 1 : 0)) {
            var12 = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (AutoAttack.lIlIIlIIl(nPC.getName().toLowerCase().contains(this.bz.npcName().toLowerCase()) ? 1 : 0) && AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIlI(nPC.distanceTo((Locatable)Players.getLocal()), this.bz.npcDistance()) && AutoAttack.lIlIlIIlI(Walker.buildPath((WorldPoint)nPC.getWorldLocation()).size(), this.bz.npcDistance())) {
                    n2 = lIlIIlI[1];
                    0;
                    if null != null {
                        return ((0x6B ^ 3 ^ (0xED ^ 0xB1)) & (0xE2 ^ 0xC4 ^ (0x27 ^ 0x35) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIlI[2];
                }
                return n2 != 0;
            });
            if (AutoAttack.lIlIlIIII(var12)) {
                return;
            }
            if (AutoAttack.lIlIIlIIl(var12.getName().equalsIgnoreCase(lIlIIIl[lIlIIlI[13]]) ? 1 : 0) && AutoAttack.lIlIIlIIl(var13.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                var12.interact(lIlIIIl[lIlIIlI[14]]);
                Time.sleep((long)2L);
                0;
            }
            if (AutoAttack.lIlIIlIIl(var13.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && AutoAttack.lIlIIlIII(var12.isDead() ? 1 : 0)) {
                var12.interact(lIlIIIl[lIlIIlI[15]]);
                Time.sleep((long)2L);
                0;
            }
        }
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private void a(int[] nArray) {
        Inventory.getFirst((int[])nArray).interact(lIlIIIl[lIlIIlI[22]]);
    }

    private static boolean lIlIlIIIl(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlll() {
        lIlIIlI = new int[36];
        AutoAttack.lIlIIlI[0] = -1;
        AutoAttack.lIlIIlI[1] = 1;
        AutoAttack.lIlIIlI[2] = (0xBE ^ 0xC5 ^ (0x58 ^ 0xA)) & (0x61 ^ 0x39 ^ (9 ^ 0x78) ^ -1);
        AutoAttack.lIlIIlI[3] = 0x77 ^ 5 ^ (0x37 ^ 0xE);
        AutoAttack.lIlIIlI[4] = (4 ^ 0x4B) + (0xC5 ^ 0x9B) - (0xAF ^ 0x8A) + (0xB3 ^ 0xAB);
        AutoAttack.lIlIIlI[5] = 113 + 41 - 153 + 146 ^ 104 + 67 - 143 + 148;
        AutoAttack.lIlIIlI[6] = 2;
        AutoAttack.lIlIIlI[7] = 3;
        AutoAttack.lIlIIlI[8] = 0x90 ^ 0x8B ^ (0x70 ^ 0x6F);
        AutoAttack.lIlIIlI[9] = 0x5A ^ 0x5F;
        AutoAttack.lIlIIlI[10] = 105 + 119 - 199 + 133 ^ 72 + 140 - 95 + 35;
        AutoAttack.lIlIIlI[11] = 0x12 ^ 0x15;
        AutoAttack.lIlIIlI[12] = 0xA8 ^ 0xA0;
        AutoAttack.lIlIIlI[13] = 0x5B ^ 0x52;
        AutoAttack.lIlIIlI[14] = 92 + 121 - 85 + 0 ^ 23 + 32 - -5 + 78;
        AutoAttack.lIlIIlI[15] = 0x3E ^ 5 ^ (0x82 ^ 0xB2);
        AutoAttack.lIlIIlI[16] = 0x9F ^ 0x93;
        AutoAttack.lIlIIlI[17] = 0xBB ^ 0xB6;
        AutoAttack.lIlIIlI[18] = 0x45 ^ 0x4B;
        AutoAttack.lIlIIlI[19] = 0x38 ^ 0x7B ^ (0xEE ^ 0xA2);
        AutoAttack.lIlIIlI[20] = 0x11 ^ 0x6A ^ (0xC8 ^ 0xA3);
        AutoAttack.lIlIIlI[21] = 0x21 ^ 6 ^ (0x4B ^ 0x7D);
        AutoAttack.lIlIIlI[22] = 0x11 ^ 0x2F ^ (0x65 ^ 0x49);
        AutoAttack.lIlIIlI[23] = 0x26 ^ 0x35;
        AutoAttack.lIlIIlI[24] = -(0xFFFFBF7B & 0x62F6) & (0xFFFFE7FB & 0x3BFF);
        AutoAttack.lIlIIlI[25] = -(0xFFFFF649 & 0x5DF7) & (0xFFFFFFF5 & 0x56FF);
        AutoAttack.lIlIIlI[26] = 0xFFFFDDBF & 0x23CB;
        AutoAttack.lIlIIlI[27] = 0x63 ^ 0x7F ^ (0xA1 ^ 0xA9);
        AutoAttack.lIlIIlI[28] = 0x50 ^ 0x5F ^ (0x52 ^ 0x48);
        AutoAttack.lIlIIlI[29] = 0xB9 ^ 0xAF;
        AutoAttack.lIlIIlI[30] = 0x24 ^ 0x51 ^ (0x1C ^ 0x7E);
        AutoAttack.lIlIIlI[31] = 0x69 ^ 0x1D ^ (0x1F ^ 0x73);
        AutoAttack.lIlIIlI[32] = 0x15 ^ 0xC;
        AutoAttack.lIlIIlI[33] = 0x77 ^ 0x6D;
        AutoAttack.lIlIIlI[34] = 0x6F ^ 0x67 ^ (0xB ^ 0x18);
        AutoAttack.lIlIIlI[35] = 7 ^ 0x1B;
    }

    private void am() {
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIIlI[1]];
            stringArray[AutoAttack.lIlIIlI[2]] = lIlIIIl[lIlIIlI[23]];
            return item.hasAction(stringArray);
        });
        if (AutoAttack.lIlIlIIII(item2)) {
            System.out.println(lIlIIIl[lIlIIlI[20]]);
            return;
        }
        item2.interact(lIlIIIl[lIlIIlI[21]]);
    }

    @Provides
    AutoAttackConfig c(ConfigManager configManager) {
        return (AutoAttackConfig)configManager.getConfig(AutoAttackConfig.class);
    }

    public static String b(String string) {
        return AutoAttack.a(string, lIlIIlI[1]);
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        AutoAttack var25;
        if (!AutoAttack.lIlIIlIIl(chatMessage.getMessage().contains(lIlIIIl[lIlIIlI[16]]) ? 1 : 0) || AutoAttack.lIlIIlIII(this.bz.teleportAfterTask() ? 1 : 0)) {
            return;
        }
        I var26 = var25.bz.teleportType();
        if (AutoAttack.lIlIlIIIl((Object)var26, (Object)I.TAB)) {
            var25.am();
            0;
            if (1 < 0) {
                return;
            }
        } else if (AutoAttack.lIlIlIIIl((Object)var26, (Object)I.SPELL)) {
            var25.an();
            0;
            if ((0xAE ^ 0xAA) == -1) {
                return;
            }
        } else if (AutoAttack.lIlIlIIIl((Object)var26, (Object)I.ITEM)) {
            var25.ao();
        }
        this.bA.setConfiguration(lIlIIIl[lIlIIlI[17]], lIlIIIl[lIlIIlI[18]], lIlIIIl[lIlIIlI[19]]);
    }

    private static boolean lIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public AutoAttack() {
        this.bD = lIlIIlI[0];
        this.bE = lIlIIlI[0];
    }

    private static boolean lIlIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIl(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.bB.invokeLater(() -> {
            if (AutoAttack.lIlIIlIIl(this.bz.fillSlayer() ? 1 : 0) && AutoAttack.lIlIIllIl(varbitChanged.getIndex(), lIlIIlI[24])) {
                AutoAttack var27;
                String string = Static.getClient().getEnum(lIlIIlI[25]).getStringValue(Vars.getVarp((int)lIlIIlI[26]));
                if (AutoAttack.lIlIIlIIl(string.endsWith(lIlIIIl[lIlIIlI[27]]) ? 1 : 0)) {
                    String var28;
                    String string2 = AutoAttack.b(string);
                    if (AutoAttack.lIlIIlIIl(string2.equals(lIlIIIl[lIlIIlI[28]]) ? 1 : 0)) {
                        var28 = lIlIIIl[lIlIIlI[29]];
                    }
                    var27.bA.setConfiguration(lIlIIIl[lIlIIlI[30]], lIlIIIl[lIlIIlI[31]], var28);
                    0;
                    if (-3 > 0) {
                        return;
                    }
                } else {
                    void var29;
                    var27.bA.setConfiguration(lIlIIIl[lIlIIlI[32]], lIlIIIl[lIlIIlI[33]], (String)var29);
                }
            }
        });
    }

    public static String a(String string, int n2) {
        return string.substring(lIlIIlI[2], string.length() - n2);
    }

    private void an() {
        Magic.cast((Spethis.bz.teleportSpell().getSpell());
    }
}

