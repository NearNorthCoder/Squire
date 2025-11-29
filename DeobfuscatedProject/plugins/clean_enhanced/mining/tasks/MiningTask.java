/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.util.List;
import gg.squire.mining.tasks.GameEnum5;
import gg.squire.mining.tasks.GameEnum4;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Mining", register=true)
public class MiningTask
extends Task {
    private  boolean C;
    
    private final  int[] z;
    private  int A;
    
    private  boolean B;
    private final  SquireMinerConfig y;
    private final  SquireMiner x;

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var6(Object object, Object object2) {
        return object == object2;
    }

    private WorldPoint MiningTask() {
        return Players.getLocal().getWorldLocation();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var7;
        String string = chatMessage.getMessage();
        if (s.var8(string.contains(var1[var2[27]]) ? 1 : 0)) {
            this.B = var2[3];
            if (s.var8(Movement.isRunEnabled() ? 1 : 0)) {
                this.sleep(var2[3]);
                0;
                if (((158 + 108 - 91 + 68 ^ 35 + 114 - 76 + 96) & (176 + 177 - 235 + 122 ^ 66 + 74 - 35 + 65 ^ -1)) < 0) {
                    return;
                }
            } else {
                s var9;
                var9.sleep(var2[5]);
            }
        }
        if (s.var8(var7.contains(var1[var2[28]]) ? 1 : 0)) {
            var9.C = var2[1];
        }
        if (s.var8(var7.contains(var1[var2[29]]) ? 1 : 0)) {
            var9.C = var2[3];
        }
    }

    public boolean run() {
        s var10;
        if (s.var5((Object)this.y.activity(), (Object)a.GRANITE)) {
            return var2[1];
        }
        if (s.var8(var10.y.waterskins()) && s.var11(Inventory.contains((int[])var10.z) ? 1 : 0)) {
            int[] nArray = new int[var2[3]];
            nArray[s.var2[1]] = var2[9];
            if (s.var11(Equipment.contains((int[])nArray) ? 1 : 0)) {
                System.out.println(var1[var2[1]]);
                return var2[1];
            }
        }
        int[] nArray = new int[var2[3]];
        nArray[s.var2[1]] = var2[2];
        if (s.var12(Inventory.getCount((int[])nArray), var10.y.waterskins())) {
            int[] nArray2 = new int[var2[3]];
            nArray2[s.var2[1]] = var2[2];
            Inventory.getFirst((int[])nArray2).interact(var1[var2[3]]);
            return var2[3];
        }
        if (s.var13(Inventory.getFreeSlots(), var2[5]) && s.var8(Inventory.contains(item -> item.getName().contains(var1[var2[30]])) ? 1 : 0)) {
            Inventory.dropAll(item -> item.getName().contains(var1[var2[10]]));
            0;
        }
        if (s.var11(Movement.isRunEnabled() ? 1 : 0) && s.var12(Movement.getRunEnergy(), var2[10])) {
            Movement.toggleRun();
            return var2[3];
        }
        if (s.var8(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var2[1];
        }
        Player var14 = Players.getLocal();
        if (s.var15(var14)) {
            return var2[1];
        }
        if (s.var4(var10.A, var2[11]) && s.var13(var14.distanceTo(c.SOUTH_FOUR.d()), var2[12])) {
            Log.info((String)var1[var2[5]]);
            var10.C = var2[3];
        }
        if (!s.var11(Inventory.isFull() ? 1 : 0) || s.var8(var14.isAnimating() ? 1 : 0) && s.var11(var10.a(var14) ? 1 : 0)) {
            return var2[1];
        }
        int[] nArray3 = new int[var2[3]];
        nArray3[s.var2[1]] = var2[15];
        List var16 = TileObjects.getAt((WorldPoint)new WorldPoint(var2[13], var2[14], var2[1]), (int[])nArray3);
        int[] nArray4 = new int[var2[3]];
        nArray4[s.var2[1]] = var2[15];
        List var17 = TileObjects.getAt((WorldPoint)new WorldPoint(var2[13], var2[16], var2[1]), (int[])nArray4);
        int[] nArray5 = new int[var2[3]];
        nArray5[s.var2[1]] = var2[15];
        List var18 = TileObjects.getAt((WorldPoint)new WorldPoint(var2[13], var2[17], var2[1]), (int[])nArray5);
        int[] nArray6 = new int[var2[3]];
        nArray6[s.var2[1]] = var2[15];
        List var19 = TileObjects.getAt((WorldPoint)new WorldPoint(var2[18], var2[19], var2[1]), (int[])nArray6);
        TileObject var20 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.var21(tileObject.getId(), var2[15]) && s.var8(c.SOUTH_FOUR.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if (-2 >= 0) {
                    return ((0xEB ^ 0xA5) & ~(0xF7 ^ 0xB9)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (s.var15(var20)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var2[20], var2[21], var2[1]));
            0;
            return var2[3];
        }
        if (s.var11(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var2[20], var2[21], var2[1]));
            0;
            return var2[3];
        }
        if (s.var8(var10.C) && s.var8(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var2[1];
        }
        WorldPoint var22 = new WorldPoint(var2[22], var2[14], var2[1]);
        if (s.var8(var10.MiningTask().equals((Object)var22) ? 1 : 0) && !s.var11(var10.B) || !s.var11(var10.C) || s.var12(var22.distanceTo2D(var10.MiningTask()), var2[11])) {
            var10.sleep(var2[23]);
            var10.B = var2[1];
            var10.x.a();
            ((TileObject)var17.get(var2[1])).interact(var1[var2[7]]);
            return var2[1];
        }
        if (s.var8(var10.MiningTask().equals((Object)new WorldPoint(var2[22], var2[16], var2[1])) ? 1 : 0) && s.var8(var10.B)) {
            var10.B = var2[1];
            var10.C = var2[1];
            var10.x.a();
            ((TileObject)var18.get(var2[1])).interact(var1[var2[0]]);
            return var2[1];
        }
        if (s.var8(var10.MiningTask().equals((Object)new WorldPoint(var2[22], var2[17], var2[1])) ? 1 : 0) && s.var8(var10.B)) {
            var10.B = var2[1];
            var10.C = var2[1];
            var10.x.a();
            ((TileObject)var19.get(var2[1])).interact(var1[var2[23]]);
            return var2[1];
        }
        if (s.var8(var10.MiningTask().equals((Object)new WorldPoint(var2[18], var2[17], var2[1])) ? 1 : 0) && s.var8(var10.B)) {
            var10.B = var2[1];
            var10.C = var2[1];
            var10.x.a();
            ((TileObject)var16.get(var2[1])).interact(var1[var2[24]]);
            return var2[1];
        }
        return var2[3];
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    private static void var23() {
        var1 = new String[var2[11]];
        s.var1[s.var2[1]] = "Config says we're using waterskins, we do not have any + no circlet of water.";
        s.var1[s.var2[3]] = "Drop";
        s.var1[s.var2[5]] = "Missed 4 cycles in a row, resetting.";
        s.var1[s.var2[7]] = "Mine";
        s.var1[s.var2[0]] = "Mine";
        s.var1[s.var2[23]] = "Mine";
        s.var1[s.var2[24]] = "Mine";
        s.var1[s.var2[27]] = "You swing your pick at the rock.";
        s.var1[s.var2[28]] = "You manage to quarry some granite.";
        s.var1[s.var2[29]] = "Shantay Pass";
        s.var1[s.var2[10]] = "Granite";
        s.var1[s.var2[30]] = "Granite";
    }

    private boolean a(Player player) {
        boolean bl;
        if (!s.var21(player.getAnimation(), var2[25]) || s.var3(player.getAnimation(), var2[26])) {
            bl = var2[3];
            0;
            if (2 <= 0) {
                return ((12 + 64 - -34 + 22 ^ 149 + 136 - 280 + 167) & (133 + 76 - 55 + 30 ^ 137 + 22 - 122 + 107 ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.A += var2[3];
    }

    private static boolean var12(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static String var37(String var38, String var39) {
        var38 = new String(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var40 = new StringBuilder();
        char[] var41 = var39.toCharArray();
        int var42 = var2[1];
        char[] var43 = var38.toCharArray();
        int var44 = var43.length;
        int var45 = var2[1];
        while (s.var24(var45, var44)) {
            char var46 = var43[var45];
            var40.append((char)(var46 ^ var41[var42 % var41.length]));
            0;
            ++var42;
            ++var45;
            0;
            if (((0x40 ^ 0x5E) & ~(0x1D ^ 3)) == ((0xBE ^ 0x87) & ~(0x26 ^ 0x1F))) continue;
            return null;
        }
        return String.valueOf(var40);
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    @Inject
    public MiningTask(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] nArray = new int[var2[0]];
        nArray[s.var2[1]] = var2[2];
        nArray[s.var2[3]] = var2[4];
        nArray[s.var2[5]] = var2[6];
        nArray[s.var2[7]] = var2[8];
        this.z = nArray;
        this.A = var2[1];
        this.C = var2[3];
        this.x = squireMiner;
        this.y = squireMinerConfig;
    }

    private static boolean var13(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.var47();
        s.var23();
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (s.var6(experienceGained.getSkill(), Skill.MINING)) {
            this.A = var2[1];
        }
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static void var47() {
        var2 = new int[31];
        s.var2[0] = 0x49 ^ 0x4D;
        s.var2[1] = (0x91 ^ 0x80) & ~(0x87 ^ 0x96);
        s.var2[2] = -(0xFFFFDEF9 & 0x6147) & (0xFFFFEF7F & 0x57DF);
        s.var2[3] = 1;
        s.var2[4] = 0xFFFFB761 & 0x4FBF;
        s.var2[5] = 2;
        s.var2[6] = -(0xFFFFE85D & 0x7FB7) & (0xFFFFFF37 & 0x6FFF);
        s.var2[7] = 3;
        s.var2[8] = 0xFFFF8F37 & 0x77ED;
        s.var2[9] = -(0xFFFF86F7 & 0x7DAF) & (0xFFFFEFFF & 0x7DFF);
        s.var2[10] = 0x65 ^ 0x6F;
        s.var2[11] = 1 ^ 0xD;
        s.var2[12] = 66 + 94 - 35 + 22 ^ 83 + 26 - 6 + 53;
        s.var2[13] = 0xFFFF9EDF & 0x6D7D;
        s.var2[14] = 0xFFFF9B7E & 0x6FDD;
        s.var2[15] = 0xFFFFECFF & 0x3F7B;
        s.var2[16] = -(0xFFFFF4A3 & 0x2F7F) & (0xFFFFFF7F & 0x2FFF);
        s.var2[17] = -(0xFFFFFDB7 & 0x726A) & (0xFFFFFFFF & 0x7B7F);
        s.var2[18] = -1 & (0xFFFFFCDF & 0xF7F);
        s.var2[19] = -(0xFFFF9565 & 0x7EBB) & (0xFFFFFF7F & 0x1FFF);
        s.var2[20] = -(0xFFFFE6FF & 0x5B91) & (0xFFFFCEF1 & 0x7FFE);
        s.var2[21] = -(0x19 ^ 6) & (0xFFFF9F7E & 0x6BFF);
        s.var2[22] = 0xFFFFFF7E & 0xCDF;
        s.var2[23] = 0x4C ^ 0x49;
        s.var2[24] = 78 + 145 - 169 + 107 ^ 31 + 49 - 76 + 163;
        s.var2[25] = 0xFFFFDCB7 & 0x37C9;
        s.var2[26] = -(0xFFFFB99F & 0x6F78) & (0xFFFFEDFF & 0x3FF7);
        s.var2[27] = 0x42 ^ 0x45;
        s.var2[28] = 0x34 ^ 0x3C;
        s.var2[29] = 0xBE ^ 0xB7;
        s.var2[30] = 3 ^ (0xCC ^ 0xC4);
    }
}

