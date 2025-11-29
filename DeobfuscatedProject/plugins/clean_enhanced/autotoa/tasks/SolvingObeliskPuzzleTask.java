/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Solving obelisk puzzle", register=true, priority=5, blocking=true)
public class SolvingObeliskPuzzleTask
extends AutotoaManager {
    private  int ft;
    private final  List<WorldPoint> fr;
    private static final  int fq;
    
    private  int fu;
    private final  Set<WorldPoint> fs;
    
    private static final  int fp;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var5;
        if (bp.var3(npcChanged.getNpc().getId(), var2[10])) {
            NPC nPC = npcChanged.getNpc();
            if (bp.var6(this.fr.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                this.fr.add(nPC.getWorldLocation());
                0;
            }
            var7.ft += var2[2];
            0;
            if (1 != 1) {
                return;
            }
        } else if (bp.var3(var5.getNpc().getId(), var2[3])) {
            var7.ft = var2[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean cc() {
        void var1_1;
        if (bp.var6(this.cd() ? 1 : 0)) {
            return var2[1];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            Item var9;
            String[] stringArray = new String[var2[6]];
            stringArray[bp.var2[1]] = var1[var2[14]];
            stringArray[bp.var2[2]] = var1[var2[15]];
            stringArray[bp.var2[5]] = var1[var2[16]];
            if (bp.var6(item.hasAction(stringArray) ? 1 : 0)) {
                return var2[1];
            }
            String var10 = var9.getName().toLowerCase();
            if (!(bp.var6(var10.contains(var1[var2[17]]) ? 1 : 0) && bp.var6(var10.contains(var1[var2[18]]) ? 1 : 0) && bp.var6(var10.contains(var1[var2[19]]) ? 1 : 0) && bp.var6(var10.contains(var1[var2[20]]) ? 1 : 0) && bp.var6(var10.contains(var1[var2[21]]) ? 1 : 0) && !bp.var11(var10.contains(var1[var2[22]]) ? 1 : 0))) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((0x6F ^ 0x4A) & ~(0x81 ^ 0xA4)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (bp.var12(var8)) {
            return var2[1];
        }
        Item var13 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
        if (bp.var14(var13) && bp.var11(Inventory.isFull() ? 1 : 0)) {
            Item var15 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[2]];
                stringArray[bp.var2[1]] = var1[var2[13]];
                return item.hasAction(stringArray);
            });
            if (bp.var12(var15)) {
                var15 = Inventory.getFirst(item -> {
                    int n2;
                    if (bp.var11(item.getName().contains(var1[var2[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[var2[2]];
                        stringArray[bp.var2[1]] = var1[var2[4]];
                        if (bp.var11(item.hasAction(stringArray) ? 1 : 0)) {
                            n2 = var2[2];
                            0;
                            if (2 > 1) return n2 != 0;
                            return ((0x1C ^ 1) & ~(0x1A ^ 7)) != 0;
                        }
                    }
                    n2 = var2[1];
                    return n2 != 0;
                });
            }
            if (bp.var12(var15)) {
                return var2[1];
            }
            var15.interact(var1[var2[6]]);
            return var2[2];
        }
        String[] stringArray = new String[var2[6]];
        stringArray[bp.var2[1]] = var1[var2[7]];
        stringArray[bp.var2[2]] = var1[var2[8]];
        stringArray[bp.var2[5]] = var1[var2[0]];
        var1_1.interact(stringArray);
        return var2[2];
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
        this.fs.add(worldPoint);
        0;
    }

    static {
        bp.var16();
        bp.var17();
        fp = var2[3];
        fq = var2[10];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    public List<WorldPoint> ce() {
        return this.fr;
    }

    private static void var16() {
        var2 = new int[24];
        bp.var2[0] = 0x8F ^ 0x82 ^ (0x40 ^ 0x4B);
        bp.var2[1] = (0x77 ^ 0x17 ^ (0x43 ^ 0x14)) & (176 + 240 - 218 + 49 ^ 184 + 139 - 162 + 31 ^ -1);
        bp.var2[2] = 1;
        bp.var2[3] = -(0xFFFFFE4F & 0x53FD) & (0xFFFFFFFE & Short.MAX_VALUE);
        bp.var2[4] = 6 ^ 0xC;
        bp.var2[5] = 2;
        bp.var2[6] = 3;
        bp.var2[7] = 0x97 ^ 0xAF ^ (0x45 ^ 0x79);
        bp.var2[8] = 181 + 56 - 190 + 149 ^ 156 + 61 - 163 + 139;
        bp.var2[9] = 0x13 ^ 0x14;
        bp.var2[10] = 0xFFFFBFFB & 0x6DB7;
        bp.var2[11] = 0xC6 ^ 0x87 ^ (0x51 ^ 0x18);
        bp.var2[12] = 0x89 ^ 0x80;
        bp.var2[13] = 0x3E ^ 0x35;
        bp.var2[14] = 9 ^ 5;
        bp.var2[15] = 0x1B ^ 0x78 ^ (0x4F ^ 0x21);
        bp.var2[16] = 0xBF ^ 0xB1;
        bp.var2[17] = 0 + 73 - -57 + 9 ^ 99 + 62 - 154 + 125;
        bp.var2[18] = 0x11 ^ 0x1F ^ (0x61 ^ 0x7F);
        bp.var2[19] = 0x3A ^ 0x41 ^ (0xF3 ^ 0x99);
        bp.var2[20] = 0x22 ^ 0xD ^ (0x65 ^ 0x58);
        bp.var2[21] = 48 + 91 - 128 + 202 ^ 177 + 50 - 62 + 33;
        bp.var2[22] = 0xF0 ^ 0xB5 ^ (0x6C ^ 0x3D);
        bp.var2[23] = 0x71 ^ 0x64;
    }

    @Override
    public int bZ() {
        String[] stringArray = new String[var2[2]];
        stringArray[bp.var2[1]] = var1[var2[5]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bp.var14(nPC)) {
            return nPC.getWorldLocation().getX();
        }
        return var2[1];
    }

    private static void var17() {
        var1 = new String[var2[23]];
        bp.var1[bp.var2[1]] = "Hit";
        bp.var1[bp.var2[2]] = "Hit";
        bp.var1[bp.var2[5]] = "Obelisk";
        bp.var1[bp.var2[6]] = "Drop";
        bp.var1[bp.var2[7]] = "Wield";
        bp.var1[bp.var2[8]] = "Wear";
        bp.var1[bp.var2[0]] = "Equip";
        bp.var1[bp.var2[9]] = "shadow";
        bp.var1[bp.var2[11]] = "Your party failed to complete the challenge";
        bp.var1[bp.var2[12]] = "(";
        bp.var1[bp.var2[4]] = "Empty";
        bp.var1[bp.var2[13]] = "Eat";
        bp.var1[bp.var2[14]] = "Equip";
        bp.var1[bp.var2[15]] = "Wield";
        bp.var1[bp.var2[16]] = "Wear";
        bp.var1[bp.var2[17]] = "bow";
        bp.var1[bp.var2[18]] = "staff";
        bp.var1[bp.var2[19]] = "toxic";
        bp.var1[bp.var2[20]] = "trident";
        bp.var1[bp.var2[21]] = "crossbow";
        bp.var1[bp.var2[22]] = "blowpipe";
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cd() {
        boolean bl2;
        void var24;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bp.var12(item)) {
            return var2[2];
        }
        if (bp.var11(var24.getName().toLowerCase().contains(var1[var2[9]]) ? 1 : 0)) {
            return var2[2];
        }
        if (bp.var25(WeaponMap.StyleMap.getOrDefault(var24.getId(), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            bl2 = var2[2];
            0;
            if null != null {
                return ((8 ^ 0x28) & ~(0x52 ^ 0x72)) != 0;
            }
        } else {
            bl2 = var2[1];
        }
        return bl2;
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[var2[2]];
        nArray[bp.var2[1]] = var2[3];
        return NPCs.getAll((int[])nArray).stream().anyMatch(Reachable::isInteractable);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var2[1];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var2[1];
        while (bp.var4(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if (((0 ^ 0x4E ^ (0x14 ^ 0x12)) & (222 + 100 - 211 + 144 ^ 125 + 28 - -22 + 8 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    private static boolean var36(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[var2[2]];
        nArray[bp.var2[1]] = var2[3];
        if (bp.var12(NPCs.getNearest((int[])nArray))) {
            bl2 = var2[2];
            0;
            if ((0x34 ^ 0x30) != (0xA0 ^ 0xA4)) {
                return ((0xC3 ^ 0x98) & ~(0xCB ^ 0x90)) != 0;
            }
        } else {
            bl2 = var2[1];
        }
        return bl2;
    }

    @Override
    public boolean bY() {
        NPC var37;
        Object var38;
        bp var39;
        if (bp.var11(this.cc() ? 1 : 0)) {
            return var2[2];
        }
        WorldPoint var40 = Players.getLocal().getWorldLocation();
        if (bp.var11(var39.fs.contains(var40) ? 1 : 0) && bp.var11(((Optional)(var38 = var40.createWorldArea(var2[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bp.var6(this.fs.contains(worldPoint) ? 1 : 0)) {
                bl2 = var2[2];
                0;
                if (-2 > 0) {
                    return ((0x2D ^ 0x1F) & ~(0x16 ^ 0x24)) != 0;
                }
            } else {
                bl2 = var2[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var40))))).isPresent() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)((WorldPoint)((Optionavar38).get()));
            var39.sleep(var2[2]);
            var39.fs.clear();
            return var2[2];
        }
        if (bp.var36(var39.fr.size(), var39.ft) && bp.var14(var37 = NPCs.getNearest(arg_0 -> bp.h((WorldPoint)(var38 = var39.fr.get(var39.ft)), arg_0)))) {
            var37.interact(var1[var2[1]]);
            var39.sleep(var2[2]);
            return var2[2];
        }
        var38 = NPCs.getAll(nPC -> {
            boolean bl2;
            if (bp.var3(nPC.getId(), var2[3])) {
                bl2 = var2[2];
                0;
                
            } else {
                bl2 = var2[1];
            }
            return bl2;
        });
        int n2 = var39.fu;
        var39.fu = n2 + var2[2];
        var37 = (NPC)var38.get(n2 % var38.size());
        if (bp.var14(var37)) {
            var37.interact(var1[var2[2]]);
            var39.sleep(var2[2]);
            return var2[2];
        }
        return var2[1];
    }

        catch (Exception var46) {
            var46.printStackTrace();
            return null;
        }
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (bp.var11(chatMessage.getMessage().startsWith(var1[var2[11]]) ? 1 : 0)) {
            this.ft = var2[1];
            this.fr.clear();
        }
    }

    private static  boolean h(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (bp.var3(nPC.getId(), var2[3]) && bp.var11(nPC.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = var2[2];
            0;
            if (-1 > -1) {
                return ((0x13 ^ 7 ^ (0x8D ^ 0x83)) & (0xD3 ^ 0xB1 ^ (0x5C ^ 0x24) ^ -1)) != 0;
            }
        } else {
            n2 = var2[1];
        }
        return n2 != 0;
    }

    private static boolean var25(Object object, Object object2) {
        return object == object2;
    }

    public int cf() {
        return this.ft;
    }

    @Override
    public void r() {
        this.ft = var2[1];
        this.fr.clear();
        this.fs.clear();
        this.fu = var2[1];
    }

    @Inject
    protected SolvingObeliskPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fr = new ArrayList<WorldPoint>(var2[0]);
        this.fs = new HashSet<WorldPoint>();
        this.ft = var2[1];
        this.fu = var2[1];
    }
}

