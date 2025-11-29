/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.moons.tasks.PrepSuppliesTask;

@TaskDesc(name="Cave nav")
public class CaveNavTask
extends Task {
    public static  int Y;
    final  WorldPoint W;
    final  WorldArea V;
    private final  SquireMoonsOfPerilConfig R;
    final  WorldArea U;
    final  WorldPoint X;
    public static  int ab;
    final  WorldArea S;
    public static  int aa;
    
    public static  int Z;
    final  WorldArea T;

    private static void var3() {
        var1 = new String[var2[3]];
        h.var1[h.var2[4]] = "Nav to streambound door";
        h.var1[h.var2[16]] = "Passing entrance";
        h.var1[h.var2[24]] = "Pass-through";
        h.var1[h.var2[26]] = "Drinking tea";
        h.var1[h.var2[27]] = "Make-cuppa";
        h.var1[h.var2[29]] = "Nav to eclipse moon";
        h.var1[h.var2[30]] = "Enter eclipse moon";
        h.var1[h.var2[31]] = "Entrance";
        h.var1[h.var2[32]] = "Pass-through";
        h.var1[h.var2[28]] = "Nav to streambound door";
        h.var1[h.var2[34]] = "Passing entrance";
        h.var1[h.var2[35]] = "Pass-through";
        h.var1[h.var2[36]] = "Drinking tea";
        h.var1[h.var2[37]] = "Make-cuppa";
        h.var1[h.var2[40]] = "Nav to earthbound door";
        h.var1[h.var2[41]] = "Passing entrance";
        h.var1[h.var2[42]] = "Pass-through";
        h.var1[h.var2[43]] = "Drinking tea";
        h.var1[h.var2[44]] = "Make-cuppa";
        h.var1[h.var2[47]] = "Nav to earthbound door";
        h.var1[h.var2[48]] = "Passing entrance";
        h.var1[h.var2[49]] = "Pass-through";
        h.var1[h.var2[50]] = "Drinking tea";
        h.var1[h.var2[51]] = "Make-cuppa";
        h.var1[h.var2[54]] = "Nav to blue moon";
        h.var1[h.var2[55]] = "Enter blue moon";
        h.var1[h.var2[56]] = "Entrance";
        h.var1[h.var2[57]] = "Pass-through";
        h.var1[h.var2[59]] = "Nav to streambound door";
        h.var1[h.var2[60]] = "Passing entrance";
        h.var1[h.var2[61]] = "Pass-through";
        h.var1[h.var2[62]] = "Drinking tea";
        h.var1[h.var2[63]] = "Make-cuppa";
        h.var1[h.var2[66]] = "Nav to ancient prison door";
        h.var1[h.var2[67]] = "Passing entrance";
        h.var1[h.var2[68]] = "Pass-through";
        h.var1[h.var2[69]] = "Drinking tea";
        h.var1[h.var2[70]] = "Make-cuppa";
        h.var1[h.var2[71]] = "Nav to earthbound door";
        h.var1[h.var2[72]] = "Passing entrance";
        h.var1[h.var2[73]] = "Pass-through";
        h.var1[h.var2[74]] = "Drinking tea";
        h.var1[h.var2[75]] = "Make-cuppa";
        h.var1[h.var2[76]] = "Nav to blood moon";
        h.var1[h.var2[77]] = "Enter blood moon";
        h.var1[h.var2[78]] = "Entrance";
        h.var1[h.var2[15]] = "Pass-through";
        h.var1[h.var2[79]] = "Raw bream";
        h.var1[h.var2[80]] = "Cooked bream";
        h.var1[h.var2[81]] = "Raw bream";
        h.var1[h.var2[14]] = "Cooked bream";
        h.var1[h.var2[82]] = "Raw bream";
        h.var1[h.var2[83]] = "Cooking stove";
        h.var1[h.var2[2]] = "Entrance";
        h.var1[h.var2[84]] = "Cooking stove";
        h.var1[h.var2[85]] = "Entrance";
        h.var1[h.var2[86]] = "Cooking stove";
        h.var1[h.var2[87]] = "Entrance";
        h.var1[h.var2[88]] = "Cooking stove";
        h.var1[h.var2[89]] = "Entrance";
        h.var1[h.var2[10]] = "Cooking stove";
        h.var1[h.var2[90]] = "Entrance";
        h.var1[h.var2[91]] = "Cooking stove";
        h.var1[h.var2[11]] = "Entrance";
        h.var1[h.var2[92]] = "Cooking stove";
        h.var1[h.var2[93]] = "Entrance";
    }

    private static  boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[87]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[29])) {
            n = var2[16];
            0;
            if (((0x67 ^ 0x5F) & ~(0xA ^ 0x32)) > 1) {
                return ((0x50 ^ 0x55) & ~(0xAF ^ 0xAA)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    private static  boolean g(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[93]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[29])) {
            n = var2[16];
            0;
            if (3 <= -1) {
                return ((0x5D ^ 0x73 ^ (0xA9 ^ 0x95)) & (0x86 ^ 0xA0 ^ (0xF2 ^ 0xC6) ^ -1)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    public boolean run() {
        TileObject var6;
        TileObject var7;
        TileObject var8;
        h var9;
        ab = this.R.minimumFood();
        Y = this.R.minimumBlueMoonFood();
        aa = this.R.minimumBloodMoonFood();
        Z = this.R.minimumEclipseMoonFood();
        if (h.var10(Vars.getBit((int)var2[21]))) {
            if (h.var10(h.d() ? 1 : 0) && h.var10(k.j() ? 1 : 0)) {
                k.f();
                return var2[4];
            }
            if (h.var4(h.d() ? 1 : 0)) {
                if (h.var4(var9.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var8 = new WorldPoint(var2[22], var2[23], var2[16]);
                    var7 = TileObjects.getNearest(arg_0 -> h.g((WorldPoint)var8, arg_0));
                    if (h.var11(var7)) {
                        SquireMoonsOfPeril.g = var1[var2[4]];
                        Movement.walkTo((WorldPoint)var8);
                        0;
                        return var2[4];
                    }
                    if (h.var12(var7)) {
                        SquireMoonsOfPeril.g = var1[var2[16]];
                        var7.interact(var1[var2[24]]);
                        return var2[4];
                    }
                }
                if (h.var4(var9.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var8 = TileObjects.getNearest(tileObject -> {
                        int n;
                        if (h.var4(tileObject.getName().contains(var1[var2[92]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                            n = var2[16];
                            0;
                            if null != null {
                                return ((0x51 ^ 0xE ^ (0x67 ^ 0x7D)) & (127 + 114 - 216 + 185 ^ 149 + 48 - 93 + 47 ^ -1)) != 0;
                            }
                        } else {
                            n = var2[4];
                        }
                        return n != 0;
                    });
                    if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                        SquireMoonsOfPeril.g = var1[var2[26]];
                        var8.interact(var1[var2[27]]);
                        return var2[16];
                    }
                    if (h.var14(Players.getLocal().getWorldLocation().distanceTo(var9.X), var2[28]) && (!h.var13(Movement.getRunEnergy(), var2[25]) || !h.var12(var8) || h.var12(var8) && h.var14(Players.getLocal().getWorldLocation().distanceTo(var8.getWorldLocation()), var2[29]))) {
                        SquireMoonsOfPeril.g = var1[var2[29]];
                        Movement.walkTo((WorldPoint)var9.X);
                        0;
                        return var2[16];
                    }
                    if (h.var5(Players.getLocal().getWorldLocation().distanceTo(var9.X), var2[28])) {
                        SquireMoonsOfPeril.g = var1[var2[30]];
                        String[] stringArray = new String[var2[16]];
                        stringArray[h.var2[4]] = var1[var2[31]];
                        var7 = TileObjects.getNearest((String[])stringArray);
                        if (h.var12(var7)) {
                            var7.interact(var1[var2[32]]);
                            return var2[16];
                        }
                    }
                }
            }
        }
        if (h.var15(Vars.getBit((int)var2[21]), var2[16]) && h.var10(Vars.getBit((int)var2[33]))) {
            if (h.var10(h.d() ? 1 : 0) && h.var10(k.j() ? 1 : 0)) {
                k.f();
                return var2[4];
            }
            if (h.var4(var9.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var8 = new WorldPoint(var2[22], var2[23], var2[16]);
                var7 = TileObjects.getNearest(arg_0 -> h.f((WorldPoint)var8, arg_0));
                if (h.var11(var7)) {
                    SquireMoonsOfPeril.g = var1[var2[28]];
                    Movement.walkTo((WorldPoint)var8);
                    0;
                    return var2[4];
                }
                if (h.var12(var7)) {
                    SquireMoonsOfPeril.g = var1[var2[34]];
                    var7.interact(var1[var2[35]]);
                    return var2[4];
                }
            }
            if (h.var4(var9.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var8 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.var4(tileObject.getName().contains(var1[var2[91]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                        n = var2[16];
                        0;
                        if (((0xA6 ^ 0xB8) & ~(0x67 ^ 0x79)) != 0) {
                            return ((0x48 ^ 0x5F) & ~(0x6B ^ 0x7C)) != 0;
                        }
                    } else {
                        n = var2[4];
                    }
                    return n != 0;
                });
                if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                    SquireMoonsOfPeril.g = var1[var2[36]];
                    var8.interact(var1[var2[37]]);
                    return var2[16];
                }
                var7 = new WorldPoint(var2[38], var2[39], var2[4]);
                var6 = TileObjects.getNearest(arg_0 -> h.e((WorldPoint)var7, arg_0));
                if (h.var11(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[40]];
                    Movement.walkTo((WorldPoint)var7);
                    0;
                    return var2[4];
                }
                if (h.var12(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[41]];
                    var6.interact(var1[var2[42]]);
                    return var2[4];
                }
            }
            if (h.var4(var9.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var8 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.var4(tileObject.getName().contains(var1[var2[10]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                        n = var2[16];
                        0;
                        if (-1 == 3) {
                            return ((58 + 202 - 228 + 181 ^ 79 + 183 - 219 + 154) & (0x30 ^ 0x4A ^ (0x1F ^ 0x75) ^ -1)) != 0;
                        }
                    } else {
                        n = var2[4];
                    }
                    return n != 0;
                });
                if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                    SquireMoonsOfPeril.g = var1[var2[43]];
                    var8.interact(var1[var2[44]]);
                    return var2[16];
                }
                var7 = new WorldPoint(var2[45], var2[46], var2[4]);
                var6 = TileObjects.getNearest(arg_0 -> h.d((WorldPoint)var7, arg_0));
                if (h.var11(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[47]];
                    Movement.walkTo((WorldPoint)var7);
                    0;
                    return var2[4];
                }
                if (h.var12(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[48]];
                    var6.interact(var1[var2[49]]);
                    return var2[4];
                }
            }
            if (h.var4(var9.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && h.var4(h.d() ? 1 : 0)) {
                var8 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.var4(tileObject.getName().contains(var1[var2[88]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                        n = var2[16];
                        0;
                        if (((0x80 ^ 0xBE) & ~(8 ^ 0x36)) > (0x61 ^ 0x65)) {
                            return ((0x6B ^ 0x6C) & ~(0x97 ^ 0x90)) != 0;
                        }
                    } else {
                        n = var2[4];
                    }
                    return n != 0;
                });
                if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                    SquireMoonsOfPeril.g = var1[var2[50]];
                    var8.interact(var1[var2[51]]);
                    return var2[16];
                }
                var7 = new WorldPoint(var2[52], var2[53], var2[4]);
                if (h.var14(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), var2[28]) && (!h.var13(Movement.getRunEnergy(), var2[25]) || !h.var12(var8) || h.var12(var8) && h.var14(Players.getLocal().getWorldLocation().distanceTo(var8.getWorldLocation()), var2[29]))) {
                    SquireMoonsOfPeril.g = var1[var2[54]];
                    Movement.walkTo((WorldPoint)var7);
                    0;
                    return var2[16];
                }
                if (h.var5(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), var2[28])) {
                    SquireMoonsOfPeril.g = var1[var2[55]];
                    String[] stringArray = new String[var2[16]];
                    stringArray[h.var2[4]] = var1[var2[56]];
                    var6 = TileObjects.getNearest((String[])stringArray);
                    if (h.var12(var6)) {
                        var6.interact(var1[var2[57]]);
                        return var2[16];
                    }
                }
            }
        }
        if (h.var15(Vars.getBit((int)var2[21]), var2[16]) && h.var15(Vars.getBit((int)var2[33]), var2[16]) && h.var10(Vars.getBit((int)var2[58]))) {
            if (h.var10(h.d() ? 1 : 0) && h.var10(k.j() ? 1 : 0)) {
                k.f();
                return var2[4];
            }
            if (h.var4(var9.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var8 = new WorldPoint(var2[22], var2[23], var2[16]);
                var7 = TileObjects.getNearest(arg_0 -> h.c((WorldPoint)var8, arg_0));
                if (h.var11(var7)) {
                    SquireMoonsOfPeril.g = var1[var2[59]];
                    Movement.walkTo((WorldPoint)var8);
                    0;
                    return var2[4];
                }
                if (h.var12(var7)) {
                    SquireMoonsOfPeril.g = var1[var2[60]];
                    var7.interact(var1[var2[61]]);
                    return var2[4];
                }
            }
            if (h.var4(var9.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var8 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.var4(tileObject.getName().contains(var1[var2[86]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                        n = var2[16];
                        0;
                        if (3 <= 2) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        n = var2[4];
                    }
                    return n != 0;
                });
                if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                    SquireMoonsOfPeril.g = var1[var2[62]];
                    var8.interact(var1[var2[63]]);
                    return var2[16];
                }
                var7 = new WorldPoint(var2[64], var2[65], var2[4]);
                var6 = TileObjects.getNearest(arg_0 -> h.b((WorldPoint)var7, arg_0));
                if (h.var11(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[66]];
                    Movement.walkTo((WorldPoint)var7);
                    0;
                    return var2[4];
                }
                if (h.var12(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[67]];
                    var6.interact(var1[var2[68]]);
                    return var2[4];
                }
            }
            if (h.var4(var9.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var8 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.var4(tileObject.getName().contains(var1[var2[84]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                        n = var2[16];
                        0;
                        if (1 <= ((83 + 16 - 85 + 139 ^ 128 + 71 - 182 + 162) & (0x3D ^ 0x16 ^ 1 ^ -1))) {
                            return ((118 + 2 - 99 + 124 ^ 53 + 160 - 78 + 45) & (0xF4 ^ 0x89 ^ (0xC2 ^ 0x9A) ^ -1)) != 0;
                        }
                    } else {
                        n = var2[4];
                    }
                    return n != 0;
                });
                if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                    SquireMoonsOfPeril.g = var1[var2[69]];
                    var8.interact(var1[var2[70]]);
                    return var2[16];
                }
                var7 = new WorldPoint(var2[45], var2[46], var2[4]);
                var6 = TileObjects.getNearest(arg_0 -> h.a((WorldPoint)var7, arg_0));
                if (h.var11(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[71]];
                    Movement.walkTo((WorldPoint)var7);
                    0;
                    return var2[4];
                }
                if (h.var12(var6)) {
                    SquireMoonsOfPeril.g = var1[var2[72]];
                    var6.interact(var1[var2[73]]);
                    return var2[4];
                }
            }
            if (h.var4(var9.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && h.var4(h.d() ? 1 : 0)) {
                var8 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.var4(tileObject.getName().contains(var1[var2[83]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[29])) {
                        n = var2[16];
                        0;
                        if (-3 > 0) {
                            return ((0x87 ^ 0xBE) & ~(0x70 ^ 0x49)) != 0;
                        }
                    } else {
                        n = var2[4];
                    }
                    return n != 0;
                });
                if (h.var12(var8) && h.var13(Movement.getRunEnergy(), var2[25])) {
                    SquireMoonsOfPeril.g = var1[var2[74]];
                    var8.interact(var1[var2[75]]);
                    return var2[16];
                }
                if (h.var14(Players.getLocal().getWorldLocation().distanceTo(var9.W), var2[28]) && (!h.var13(Movement.getRunEnergy(), var2[25]) || !h.var12(var8) || h.var12(var8) && h.var14(Players.getLocal().getWorldLocation().distanceTo(var8.getWorldLocation()), var2[29]))) {
                    SquireMoonsOfPeril.g = var1[var2[76]];
                    Movement.walkTo((WorldPoint)var9.W);
                    0;
                    return var2[16];
                }
                if (h.var5(Players.getLocal().getWorldLocation().distanceTo(var9.W), var2[28])) {
                    SquireMoonsOfPeril.g = var1[var2[77]];
                    String[] stringArray = new String[var2[16]];
                    stringArray[h.var2[4]] = var1[var2[78]];
                    var7 = TileObjects.getNearest((String[])stringArray);
                    if (h.var12(var7)) {
                        var7.interact(var1[var2[15]]);
                        return var2[16];
                    }
                }
            }
        }
        return var2[4];
    }

    private static boolean var13(int n, int n2) {
        return n < n2;
    }

    static {
        h.var16();
        h.var3();
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void var16() {
        var2 = new int[94];
        h.var2[0] = 0xFFFFB53E & 0x4FFF;
        h.var2[1] = 0xFFFFA7FF & 0x7D3D;
        h.var2[2] = 73 + 163 - 143 + 73 ^ 125 + 101 - 146 + 67;
        h.var2[3] = 0x99 ^ 0x93 ^ (0x67 ^ 0x2F);
        h.var2[4] = (0x9F ^ 0x92) & ~(0x94 ^ 0x99);
        h.var2[5] = -(0xFFFFFFDF & 0x1261) & (0xFFFFBFFE & 0x77FF);
        h.var2[6] = 0x50 ^ 2 ^ (0x81 ^ 0x97);
        h.var2[7] = 0x46 ^ 0x79 ^ (0xAB ^ 0xC0);
        h.var2[8] = -(0xFFFFFCBF & 0x536F) & (0xFFFFD7EF & 0x7DFF);
        h.var2[9] = -(0xFFFF98F7 & 0x7F49) & (0xFFFFFFFF & 0x3DFF);
        h.var2[10] = 61 + 116 - 167 + 129 ^ 39 + 157 - 130 + 117;
        h.var2[11] = 158 + 62 - 164 + 113 ^ 5 + 147 - 40 + 38;
        h.var2[12] = -(0xFFFFFB7D & 0x3C8B) & (0xFFFFFFBE & 0x3DCF);
        h.var2[13] = -(0xFFFFF3ED & 0x4C53) & (0xFFFFFFDF & 0x65EB);
        h.var2[14] = 0x5D ^ 0x6F;
        h.var2[15] = 0x2F ^ 1;
        h.var2[16] = 1;
        h.var2[17] = -(0xFFFFFF9E & 0x38E7) & (0xFFFFBFEF & 0x7DFF);
        h.var2[18] = -(0xFFFFA81F & 0x5FE1) & (0xFFFFFDF6 & 0x2F7F);
        h.var2[19] = -(0xFFFF86A7 & 0x7B5B) & (0xFFFFD7EF & 0x2FF7);
        h.var2[20] = 0xFFFFEDDF & 0x37EB;
        h.var2[21] = 0xFFFFA687 & 0x7FFC;
        h.var2[22] = -(0xFFFFEF9C & 0x5A6F) & (0xFFFFDFFB & 0x6FBF);
        h.var2[23] = 0xFFFFE7FA & 0x3DB5;
        h.var2[24] = 2;
        h.var2[25] = 0x76 ^ 0x30;
        h.var2[26] = 3;
        h.var2[27] = 0xAD ^ 0xA9;
        h.var2[28] = 0xBD ^ 0xB4;
        h.var2[29] = 0xDC ^ 0x90 ^ (0x74 ^ 0x3D);
        h.var2[30] = 0x14 ^ 0x12;
        h.var2[31] = 0xEE ^ 0xA7 ^ (0x1A ^ 0x54);
        h.var2[32] = 116 + 105 - 59 + 42 ^ 11 + 130 - 77 + 132;
        h.var2[33] = -(0xFFFFCAD9 & 0x7D7F) & (0xFFFFFFFF & 0x6EDB);
        h.var2[34] = 0x35 ^ 0x3F;
        h.var2[35] = 0xCA ^ 0xC1;
        h.var2[36] = 0x3D ^ 0x29 ^ (0xA7 ^ 0xBF);
        h.var2[37] = 0x9B ^ 0x96;
        h.var2[38] = -(0xFFFFDBFF & 0x76B1) & (0xFFFFFFFC & 0x57F7);
        h.var2[39] = 0xFFFFAF77 & 0x75FF;
        h.var2[40] = 0x18 ^ 0x16;
        h.var2[41] = 8 ^ 2 ^ (0x23 ^ 0x26);
        h.var2[42] = 42 + 53 - -35 + 2 ^ 10 + 79 - -47 + 12;
        h.var2[43] = 0x71 ^ 0x60;
        h.var2[44] = 0xBA ^ 0xA8;
        h.var2[45] = -(0xFFFFB1F6 & 0x6E0F) & (0xFFFFF7F7 & 0x2DFF);
        h.var2[46] = 0xFFFFF5F7 & 0x2FFF;
        h.var2[47] = 0x60 ^ 0x43 ^ (0xAF ^ 0x9F);
        h.var2[48] = 3 ^ 0x1F ^ (0xAB ^ 0xA3);
        h.var2[49] = 0x2E ^ 0x12 ^ (0x57 ^ 0x7E);
        h.var2[50] = 0xD7 ^ 0xC1;
        h.var2[51] = 0xE6 ^ 0x8D ^ (0xED ^ 0x91);
        h.var2[52] = 0xFFFF857B & Short.MAX_VALUE;
        h.var2[53] = -(0xFFFFFFBB & 0x5257) & (0xFFFFFFFA & 0x77FF);
        h.var2[54] = 0xFF ^ 0xB3 ^ (0x39 ^ 0x6D);
        h.var2[55] = 0x11 ^ 8;
        h.var2[56] = 0x4B ^ 0x68 ^ (0x7E ^ 0x47);
        h.var2[57] = 0x11 ^ 0xA;
        h.var2[58] = -(0xFFFFDB33 & 0x2DDD) & (0xFFFFAFBE & 0x7FD3);
        h.var2[59] = 4 ^ 0x18;
        h.var2[60] = 0x79 ^ 0x64;
        h.var2[61] = 0x28 ^ 0x3D ^ (0x8D ^ 0x86);
        h.var2[62] = 141 + 130 - 176 + 128 ^ 111 + 52 - 90 + 119;
        h.var2[63] = 0xB4 ^ 0x94 ^ (0x33 ^ 0x27) & ~(2 ^ 0x16);
        h.var2[64] = -(0xFFFFA9E7 & 0x7E39) & (0xFFFFEF7D & 0x3DFF);
        h.var2[65] = -(0xFFFFFF7B & 0x1A8F) & (0xFFFFBFFF & 0x7FCF);
        h.var2[66] = 0x4C ^ 0x6D;
        h.var2[67] = 0xAB ^ 0x89;
        h.var2[68] = 0x13 ^ 0x24 ^ (0x83 ^ 0x97);
        h.var2[69] = 0x4A ^ 0x6B ^ (0x3C ^ 0x39);
        h.var2[70] = 0x60 ^ 0x45;
        h.var2[71] = 0x5D ^ 0x4A ^ (7 ^ 0x36);
        h.var2[72] = 0x68 ^ 0x4F;
        h.var2[73] = 59 + 153 - 60 + 37 ^ 99 + 98 - 156 + 108;
        h.var2[74] = 6 ^ 0x25 ^ (0x31 ^ 0x3B);
        h.var2[75] = 0xF3 ^ 0x80 ^ (0x69 ^ 0x30);
        h.var2[76] = 0x14 ^ 0x3F;
        h.var2[77] = 0x45 ^ 0x69;
        h.var2[78] = 0x38 ^ 0x15;
        h.var2[79] = 0xC ^ 0x2B ^ (0x8E ^ 0x86);
        h.var2[80] = 109 + 179 - 146 + 44 ^ 32 + 45 - 15 + 76;
        h.var2[81] = 0xC7 ^ 0xA5 ^ (0xD ^ 0x5E);
        h.var2[82] = 0x49 ^ 0x35 ^ (0x6E ^ 0x21);
        h.var2[83] = 0x37 ^ 0x72 ^ (0x20 ^ 0x51);
        h.var2[84] = 0x43 ^ 0x7D ^ (0x2C ^ 0x24);
        h.var2[85] = 0x42 ^ 0x75;
        h.var2[86] = 0x12 ^ 0x2A;
        h.var2[87] = 0xB3 ^ 0x8A;
        h.var2[88] = 0x70 ^ 0x4A;
        h.var2[89] = 0x8D ^ 0xB6;
        h.var2[90] = 0xB2 ^ 0x8F;
        h.var2[91] = 79 + 48 - 4 + 12 ^ 166 + 71 - 210 + 158;
        h.var2[92] = 0x66 ^ 0x3E ^ (0xA2 ^ 0xBA);
        h.var2[93] = 0x5B ^ 0x46 ^ (0xD ^ 0x51);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n, int n2) {
        return n <= n2;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static  boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[85]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[31])) {
            n = var2[16];
            0;
            if null != null {
                return ((0x71 ^ 0x78) & ~(0x3C ^ 0x35)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    private static  boolean f(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[11]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[29])) {
            n = var2[16];
            0;
            if (-1 >= 1) {
                return ((0x19 ^ 0x2B) & ~(0x28 ^ 0x1A)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var2[4];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var2[4];
        while (h.var13(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var32);
    }

    @Inject
    public CaveNavTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.S = new WorldArea(var2[0], var2[1], var2[2], var2[3], var2[4]);
        this.T = new WorldArea(var2[0], var2[5], var2[6], var2[7], var2[4]);
        this.U = new WorldArea(var2[8], var2[9], var2[10], var2[11], var2[4]);
        this.V = new WorldArea(var2[12], var2[13], var2[14], var2[15], var2[16]);
        this.W = new WorldPoint(var2[17], var2[18], var2[4]);
        this.X = new WorldPoint(var2[19], var2[20], var2[4]);
        this.R = squireMoonsOfPerilConfig;
    }

    private static boolean var10(int n) {
        return n == 0;
    }

    private static  boolean d(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[89]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[29])) {
            n = var2[16];
            0;
            if (((0x5A ^ 0x10) & ~(0x1D ^ 0x57)) < 0) {
                return ((0xAA ^ 0x96) & ~(0x76 ^ 0x4A)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[2]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[29])) {
            n = var2[16];
            0;
            if (2 > 2) {
                return ((0x79 ^ 0xD ^ (0xF0 ^ 0xB9)) & (2 ^ 0x28 ^ (0x64 ^ 0x73) ^ -1)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    private static  boolean e(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.var4(tileObject.getName().contains(var1[var2[90]]) ? 1 : 0) && h.var5(tileObject.getWorldLocation().distanceTo(worldPoint), var2[29])) {
            n = var2[16];
            0;
            if (-3 > 0) {
                return ((0x44 ^ 0x6F ^ (0x8D ^ 0x94)) & (0x63 ^ 0x7E ^ (0x44 ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            n = var2[4];
        }
        return n != 0;
    }

    private static boolean var15(int n, int n2) {
        return n == n2;
    }

    private static boolean var39(int n, int n2) {
        return n >= n2;
    }

    public static boolean d() {
        block10: {
            block11: {
                block8: {
                    block9: {
                        block6: {
                            block7: {
                                if (!h.var10(Vars.getBit((int)var2[21])) || !h.var10(Vars.getBit((int)var2[33])) || !h.var10(Vars.getBit((int)var2[58]))) break block6;
                                if (!h.var4(Inventory.isFull() ? 1 : 0)) break block7;
                                String[] stringArray = new String[var2[16]];
                                stringArray[h.var2[4]] = var1[var2[79]];
                                if (!h.var4(Inventory.contains((String[])stringArray) ? 1 : 0)) break block6;
                            }
                            return var2[4];
                        }
                        if (!h.var15(Vars.getBit((int)var2[21]), var2[16]) || !h.var10(Vars.getBit((int)var2[33]))) break block8;
                        String[] stringArray = new String[var2[16]];
                        stringArray[h.var2[4]] = var1[var2[80]];
                        if (!h.var39(Inventory.getCount((String[])stringArray), Y)) break block9;
                        String[] stringArray2 = new String[var2[16]];
                        stringArray2[h.var2[4]] = var1[var2[81]];
                        if (!h.var4(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
                    }
                    return var2[4];
                }
                if (!h.var15(Vars.getBit((int)var2[21]), var2[16]) || !h.var15(Vars.getBit((int)var2[33]), var2[16]) || !h.var10(Vars.getBit((int)var2[58]))) break block10;
                String[] stringArray = new String[var2[16]];
                stringArray[h.var2[4]] = var1[var2[14]];
                if (!h.var39(Inventory.getCount((String[])stringArray), aa)) break block11;
                String[] stringArray3 = new String[var2[16]];
                stringArray3[h.var2[4]] = var1[var2[82]];
                if (!h.var4(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block10;
            }
            return var2[4];
        }
        return var2[16];
    }

    private static boolean var14(int n, int n2) {
        return n > n2;
    }

    private static boolean var4(int n) {
        return n != 0;
    }
}

