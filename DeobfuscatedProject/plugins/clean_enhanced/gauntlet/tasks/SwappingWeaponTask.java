/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.rs.api.RSNPCComposition
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import gg.squire.gauntlet.tasks.EscapingHazardTask;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.rs.api.RSNPCComposition;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Swapping weapon", priority=4, register=true)
public class SwappingWeaponTask
extends GauntletTaskBase {
    private final  u bM;
    private  HeadIcon bN;
    public static  int bK;
    private final  b bL;
    private  int bO;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 != ((0x2E ^ 0x6F ^ (0x49 ^ 0x1F)) & (0x44 ^ 7 ^ (0x76 ^ 0x22) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        A.var13();
        A.var14();
        bK = 1;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if ((actor instanceof NPC != 0) && (actor.getName( != null)) && (e.aw.contains(actor.getName( != 0)) ? 1 : 0) && (e.aD.contains(projectileSpawned.getProjectile( != 0).getId()) ? 1 : 0)) {
            this.bO = this.bL.z();
            bK += 0;
        }
    }

    @Override
    public boolean be() {
        if ((this.ba.h( != 0).makeT3Offhand() ? 1 : 0)) {
            return this.bz();
        }
        return this.bA();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC nPC = npcChanged.getNpc();
        if (nPC != null && (nPC.getName( != null)) && (e.aw.contains(nPC.getName( != 0)) ? 1 : 0)) {
            void var21;
            RSNPCComposition rSNPCComposition = (RSNPCComposition)npcChanged.getNpc().getComposition();
            short[] sArray = rSNPCComposition.getRsOverheadIcons();
            if sArray == null {
                return;
            }
            var22.bN = HeadIcon.values()[var21[1]];
            bK = 1;
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private boolean bz() {
        HeadIcon headIcon = this.ba.X().aD();
        if (headIcon == headIcon2) {
            Item item2 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (string != null && (string.contains(var1[var2[10]] != 0) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (3 < 2) {
                        return ((0x62 ^ 0x2D ^ (0xBB ^ 0xB6)) & (4 + 45 - 26 + 108 ^ 27 + 132 - 121 + 155 ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if item2 != null {
                item2.interact(var1[1]);
                return 0;
            }
            0;
            if ((0xC2 ^ 0xA6 ^ (0x4C ^ 0x2C)) == ((135 + 112 - 124 + 88 ^ 133 + 123 - 197 + 140) & (42 + 190 - 201 + 183 ^ 111 + 55 - 147 + 175 ^ -1))) {
                return ((0xAB ^ 0xC5 ^ (0xDC ^ 0x93)) & (0xF2 ^ 0xA3 ^ (0x75 ^ 5) ^ -1)) != 0;
            }
        } else {
            Item var29 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (string != null && (string.contains(var1[9] != 0) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (-2 >= 0) {
                        return ((172 + 34 - 167 + 135 ^ 17 + 10 - -29 + 95) & (0x12 ^ 0x72 ^ (0x62 ^ 0x3B) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if var29 != null {
                var29.interact(var1[0]);
                return 0;
            }
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bA() {
        void var30;
        HeadIcon headIcon = this.ba.X().aD();
        if (bK == 0) {
            Item item2 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (string != null && (string.contains(var1[8] != 0) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (3 > 3) {
                        return (3 & ~3) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if item2 != null {
                item2.interact(var1[2]);
                return 0;
            }
            0;
            if null != null {
                return ((1 ^ (0x2F ^ 0x21)) & (0xF7 ^ 0xC7 ^ (0xA6 ^ 0x99) ^ -1)) != 0;
            }
        } else if ((bK == 3) && (HeadIcon.RANGED.equals((Object == 0)var30) ? 1 : 0)) {
            Item var31 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (string != null && (string.contains(var1[7] != 0) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (((0x7A ^ 0x6B ^ (0xB0 ^ 0xC2)) & (0xA0 ^ 0x90 ^ (0x1C ^ 0x4F) ^ -1)) != 0) {
                        return ((0x36 ^ 0x56 ^ (0xFF ^ 0xB5)) & (0x34 ^ 0x15 ^ (0x93 ^ 0x98) ^ -1) & ((0xD2 ^ 0x83 ^ (0x66 ^ 8)) & (1 ^ (0x93 ^ 0xAD) ^ -1) & ((0x79 ^ 0x7F ^ (0xE4 ^ 0xA8)) & (119 + 179 - 147 + 41 ^ 11 + 44 - -13 + 70 ^ -1) ^ -1) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if var31 != null {
                var31.interact(var1[4]);
                return 0;
            }
            0;
            if (3 < 0) {
                return ((0x3F ^ 0x2E ^ (0x14 ^ 0x1D)) & (53 + 198 - 132 + 104 ^ 1 + 22 - -91 + 85 ^ -1)) != 0;
            }
        } else if (bK == 3) {
            Item var31 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            Player var32 = Players.getLocal();
            WorldPoint var33 = var32.getWorldLocation();
            if var31 != null {
                A var34;
                Item var35;
                if ((Inventory.getFreeSlots( == 0)) && (var35 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[0];
                    stringArray[1] = var1[6];
                    return item.hasActionstringArray != null;
                }))) {
                    var35.interact(var1[5]);
                }
                var35 = ScenePoint.fromWorld((WorldPoint)var33);
                List<WorldPoint> var36 = var34.bM.c(var33, var34.ba.X().aI().getWorldLocation());
                u u2 = var34.bM;
                Stream stream = var36.stream();
                u u3 = var34.bM;
                Objects.requireNonNull(u3);
                0;
                if ((u2.d(stream.filter(u3::n == 0).collect(Collectors.toList())) ? 1 : 0)) {
                    Movement.setDestination((int)var35.getX(), (int)var35.getY());
                    Time.sleepTick();
                    0;
                }
                var31.interact(var1[3]);
                return 0;
            }
        }
        return 1;
    }

    @Inject
    public SwappingWeaponTask(c c2, b b2, u u2) {
        d[] dArray = new d[0];
        dArray[1] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bN = null;
        this.bL = b2;
        this.bM = u2;
    }
}

