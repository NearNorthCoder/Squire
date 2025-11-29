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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
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

        return String.valueOf(var1);
    }

    private static boolean llllllIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        A.llllllIlllIllI();
        A.llllllIlllIlIl();
        bK = llIIllIlIIIl[1];
    }

    private static boolean llllllIllllIlI(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if (A.llllllIlllIlll(actor instanceof NPC) && A.llllllIllllIIl(actor.getName()) && A.llllllIlllIlll(e.aw.contains(actor.getName()) ? 1 : 0) && A.llllllIlllIlll(e.aD.contains(projectileSpawned.getProjectile().getId()) ? 1 : 0)) {
            this.bO = this.bL.z();
            bK += llIIllIlIIIl[0];
        }
    }

    @Override
    public boolean be() {
        if (A.llllllIlllIlll(this.ba.h().makeT3Offhand() ? 1 : 0)) {
            return this.bz();
        }
        return this.bA();
    }

    private static boolean llllllIllllIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC nPC = npcChanged.getNpc();
        if (A.llllllIllllIIl(nPC) && A.llllllIllllIIl(nPC.getName()) && A.llllllIlllIlll(e.aw.contains(nPC.getName()) ? 1 : 0)) {
            void var2;
            RSNPCComposition rSNPCComposition = (RSNPCComposition)npcChanged.getNpc().getComposition();
            short[] sArray = rSNPCComposition.getRsOverheadIcons();
            if (A.llllllIlllllII(sArray)) {
                return;
            }
            var3.bN = HeadIcon.values()[var2[llIIllIlIIIl[1]]];
            bK = llIIllIlIIIl[1];
        }
    }

    private static boolean llllllIlllIlll(int n2) {
        return n2 != 0;
    }

    private boolean bz() {
        HeadIcon headIcon = this.ba.X().aD();
        if (A.llllllIllllIII(headIcon, HeadIcon.MAGIC)) {
            Item item2 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[10]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];

                    if (3 < 2) {
                        return ((0x62 ^ 0x2D ^ (0xBB ^ 0xB6)) & (4 + 45 - 26 + 108 ^ 27 + 132 - 121 + 155 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(item2)) {
                item2.interact(llIIllIlIIII[llIIllIlIIIl[1]]);
                return llIIllIlIIIl[0];
            }

            if ((0xC2 ^ 0xA6 ^ (0x4C ^ 0x2C)) == ((135 + 112 - 124 + 88 ^ 133 + 123 - 197 + 140) & (42 + 190 - 201 + 183 ^ 111 + 55 - 147 + 175 ^ -1))) {
                return ((0xAB ^ 0xC5 ^ (0xDC ^ 0x93)) & (0xF2 ^ 0xA3 ^ (0x75 ^ 5) ^ -1)) != 0;
            }
        } else {
            Item var4 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[9]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];

                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(var4)) {
                var4.interact(llIIllIlIIII[llIIllIlIIIl[0]]);
                return llIIllIlIIIl[0];
            }
        }
        return llIIllIlIIIl[1];
    }

    private static boolean llllllIllllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllIllllIIl(Object object) {
        return object != null;
    }

    private static boolean llllllIlllllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bA() {
        void var5;
        HeadIcon headIcon = this.ba.X().aD();
        if (A.llllllIllllIlI(bK)) {
            Item item2 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[8]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];

                    if (3 > 3) {
                        return (3 & ~3) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(item2)) {
                item2.interact(llIIllIlIIII[llIIllIlIIIl[2]]);
                return llIIllIlIIIl[0];
            }

            }
        } else if (A.llllllIllllIll(bK, llIIllIlIIIl[3]) && A.llllllIllllIlI(HeadIcon.RANGED.equals((Object)var5) ? 1 : 0)) {
            Item var6 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[7]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];

                    if (((0x7A ^ 0x6B ^ (0xB0 ^ 0xC2)) & (0xA0 ^ 0x90 ^ (0x1C ^ 0x4F) ^ -1)) != 0) {
                        return ((0x36 ^ 0x56 ^ (0xFF ^ 0xB5)) & (0x34 ^ 0x15 ^ (0x93 ^ 0x98) ^ -1) & ((0xD2 ^ 0x83 ^ (0x66 ^ 8)) & (1 ^ (0x93 ^ 0xAD) ^ -1) & ((0x79 ^ 0x7F ^ (0xE4 ^ 0xA8)) & (119 + 179 - 147 + 41 ^ 11 + 44 - -13 + 70 ^ -1) ^ -1) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(var6)) {
                var6.interact(llIIllIlIIII[llIIllIlIIIl[4]]);
                return llIIllIlIIIl[0];
            }

            if (3 < 0) {
                return ((0x3F ^ 0x2E ^ (0x14 ^ 0x1D)) & (53 + 198 - 132 + 104 ^ 1 + 22 - -91 + 85 ^ -1)) != 0;
            }
        } else if (A.llllllIllllIll(bK, llIIllIlIIIl[3])) {
            Item var6 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            Player var7 = Players.getLocal();
            WorldPoint var8 = var7.getWorldLocation();
            if (A.llllllIllllIIl(var6)) {
                A var9;
                Item var10;
                if (A.llllllIllllIlI(Inventory.getFreeSlots()) && A.llllllIllllIIl(var10 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llIIllIlIIIl[0]];
                    stringArray[A.llIIllIlIIIl[1]] = llIIllIlIIII[llIIllIlIIIl[6]];
                    return item.hasAction(stringArray);
                }))) {
                    var10.interact(llIIllIlIIII[llIIllIlIIIl[5]]);
                }
                var10 = ScenePoint.fromWorld((WorldPoint)var8);
                List<WorldPoint> var11 = var9.bM.c(var8, var9.ba.X().aI().getWorldLocation());
                u u2 = var9.bM;
                Stream stream = var11.stream();
                u u3 = var9.bM;
                Objects.requireNonNull(u3);

                if (A.llllllIllllIlI(u2.d(stream.filter(u3::n).collect(Collectors.toList())) ? 1 : 0)) {
                    Movement.setDestination((int)var10.getX(), (int)var10.getY());
                    Time.sleepTick();

                }
                var6.interact(llIIllIlIIII[llIIllIlIIIl[3]]);
                return llIIllIlIIIl[0];
            }
        }
        return llIIllIlIIIl[1];
    }

    private static void llllllIlllIlIl() {
        llIIllIlIIII = new String[llIIllIlIIIl[11]];
        A.llIIllIlIIII[A.llIIllIlIIIl[1]] = "Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[0]] = "Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[2]] = "Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[4]] = "Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[5]] = "Eat";
        A.llIIllIlIIII[A.llIIllIlIIIl[3]] = "Remove";
        A.llIIllIlIIII[A.llIIllIlIIIl[6]] = "Eat";
        A.llIIllIlIIII[A.llIIllIlIIIl[7]] = "bow";
        A.llIIllIlIIII[A.llIIllIlIIIl[8]] = "staff";
        A.llIIllIlIIII[A.llIIllIlIIIl[9]] = "staff";
        A.llIIllIlIIII[A.llIIllIlIIIl[10]] = "bow";
    }

    @Inject
    public SwappingWeaponTask(c c2, b b2, u u2) {
        d[] dArray = new d[llIIllIlIIIl[0]];
        dArray[A.llIIllIlIIIl[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bN = null;
        this.bL = b2;
        this.bM = u2;
    }

}

