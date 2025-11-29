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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static void lIIlIlllIlllIll() {
        lIIIIIIlIIlIl = new String[lIIIIIIlIIllI[3]];
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[4]] = "Nav to streambound door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[16]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[24]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[26]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[27]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[29]] = "Nav to eclipse moon";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[30]] = "Enter eclipse moon";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[31]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[32]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[28]] = "Nav to streambound door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[34]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[35]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[36]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[37]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[40]] = "Nav to earthbound door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[41]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[42]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[43]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[44]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[47]] = "Nav to earthbound door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[48]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[49]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[50]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[51]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[54]] = "Nav to blue moon";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[55]] = "Enter blue moon";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[56]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[57]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[59]] = "Nav to streambound door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[60]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[61]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[62]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[63]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[66]] = "Nav to ancient prison door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[67]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[68]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[69]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[70]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[71]] = "Nav to earthbound door";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[72]] = "Passing entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[73]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[74]] = "Drinking tea";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[75]] = "Make-cuppa";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[76]] = "Nav to blood moon";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[77]] = "Enter blood moon";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[78]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[15]] = "Pass-through";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[79]] = "Raw bream";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[80]] = "Cooked bream";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[81]] = "Raw bream";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[14]] = "Cooked bream";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[82]] = "Raw bream";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[83]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[2]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[84]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[85]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[86]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[87]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[88]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[89]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[10]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[90]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[91]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[11]] = "Entrance";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[92]] = "Cooking stove";
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[93]] = "Entrance";
    }

    private static  boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[87]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];

            if (((0x67 ^ 0x5F) & ~(0xA ^ 0x32)) > 1) {
                return false;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static  boolean g(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[93]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];

            if (3 <= -1) {
                return ((0x5D ^ 0x73 ^ (0xA9 ^ 0x95)) & (0x86 ^ 0xA0 ^ (0xF2 ^ 0xC6) ^ -1)) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    public boolean run() {
        TileObject var1;
        TileObject var2;
        TileObject var3;
        h var4;
        ab = this.R.minimumFood();
        Y = this.R.minimumBlueMoonFood();
        aa = this.R.minimumBloodMoonFood();
        Z = this.R.minimumEclipseMoonFood();
        if (h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[21]))) {
            if (h.lIIlIlllIllllIl(h.d() ? 1 : 0) && h.lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (h.lIIlIlllIlllllI(h.d() ? 1 : 0)) {
                if (h.lIIlIlllIlllllI(var4.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var3 = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                    var2 = TileObjects.getNearest(arg_0 -> h.g((WorldPoint)var3, arg_0));
                    if (h.lIIlIlllIllllll(var2)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[4]];
                        Movement.walkTo((WorldPoint)var3);

                        return lIIIIIIlIIllI[4];
                    }
                    if (h.lIIlIllllIIIIII(var2)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[16]];
                        var2.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[24]]);
                        return lIIIIIIlIIllI[4];
                    }
                }
                if (h.lIIlIlllIlllllI(var4.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var3 = TileObjects.getNearest(tileObject -> {
                        int n;
                        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[92]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                            n = lIIIIIIlIIllI[16];

                            }
                        } else {
                            n = lIIIIIIlIIllI[4];
                        }
                        return n != 0;
                    });
                    if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[26]];
                        var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[27]]);
                        return lIIIIIIlIIllI[16];
                    }
                    if (h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(var4.X), lIIIIIIlIIllI[28]) && (!h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !h.lIIlIllllIIIIII(var3) || h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(var3.getWorldLocation()), lIIIIIIlIIllI[29]))) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[29]];
                        Movement.walkTo((WorldPoint)var4.X);

                        return lIIIIIIlIIllI[16];
                    }
                    if (h.lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(var4.X), lIIIIIIlIIllI[28])) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[30]];
                        String[] stringArray = new String[lIIIIIIlIIllI[16]];
                        stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[31]];
                        var2 = TileObjects.getNearest((String[])stringArray);
                        if (h.lIIlIllllIIIIII(var2)) {
                            var2.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[32]]);
                            return lIIIIIIlIIllI[16];
                        }
                    }
                }
            }
        }
        if (h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[33]))) {
            if (h.lIIlIlllIllllIl(h.d() ? 1 : 0) && h.lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (h.lIIlIlllIlllllI(var4.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var3 = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                var2 = TileObjects.getNearest(arg_0 -> h.f((WorldPoint)var3, arg_0));
                if (h.lIIlIlllIllllll(var2)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[28]];
                    Movement.walkTo((WorldPoint)var3);

                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(var2)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[34]];
                    var2.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[35]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(var4.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var3 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[91]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];

                        if (((0xA6 ^ 0xB8) & ~(0x67 ^ 0x79)) != 0) {
                            return false;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[36]];
                    var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[37]]);
                    return lIIIIIIlIIllI[16];
                }
                var2 = new WorldPoint(lIIIIIIlIIllI[38], lIIIIIIlIIllI[39], lIIIIIIlIIllI[4]);
                var1 = TileObjects.getNearest(arg_0 -> h.e((WorldPoint)var2, arg_0));
                if (h.lIIlIlllIllllll(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[40]];
                    Movement.walkTo((WorldPoint)var2);

                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[41]];
                    var1.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[42]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(var4.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var3 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[10]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];

                        if (-1 == 3) {
                            return ((58 + 202 - 228 + 181 ^ 79 + 183 - 219 + 154) & (0x30 ^ 0x4A ^ (0x1F ^ 0x75) ^ -1)) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[43]];
                    var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[44]]);
                    return lIIIIIIlIIllI[16];
                }
                var2 = new WorldPoint(lIIIIIIlIIllI[45], lIIIIIIlIIllI[46], lIIIIIIlIIllI[4]);
                var1 = TileObjects.getNearest(arg_0 -> h.d((WorldPoint)var2, arg_0));
                if (h.lIIlIlllIllllll(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[47]];
                    Movement.walkTo((WorldPoint)var2);

                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[48]];
                    var1.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[49]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(var4.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && h.lIIlIlllIlllllI(h.d() ? 1 : 0)) {
                var3 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[88]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];

                        if (((0x80 ^ 0xBE) & ~(8 ^ 0x36)) > (0x61 ^ 0x65)) {
                            return false;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[50]];
                    var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[51]]);
                    return lIIIIIIlIIllI[16];
                }
                var2 = new WorldPoint(lIIIIIIlIIllI[52], lIIIIIIlIIllI[53], lIIIIIIlIIllI[4]);
                if (h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIIIIIlIIllI[28]) && (!h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !h.lIIlIllllIIIIII(var3) || h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(var3.getWorldLocation()), lIIIIIIlIIllI[29]))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[54]];
                    Movement.walkTo((WorldPoint)var2);

                    return lIIIIIIlIIllI[16];
                }
                if (h.lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIIIIIlIIllI[28])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[55]];
                    String[] stringArray = new String[lIIIIIIlIIllI[16]];
                    stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[56]];
                    var1 = TileObjects.getNearest((String[])stringArray);
                    if (h.lIIlIllllIIIIII(var1)) {
                        var1.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[57]]);
                        return lIIIIIIlIIllI[16];
                    }
                }
            }
        }
        if (h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[33]), lIIIIIIlIIllI[16]) && h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[58]))) {
            if (h.lIIlIlllIllllIl(h.d() ? 1 : 0) && h.lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (h.lIIlIlllIlllllI(var4.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var3 = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                var2 = TileObjects.getNearest(arg_0 -> h.c((WorldPoint)var3, arg_0));
                if (h.lIIlIlllIllllll(var2)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[59]];
                    Movement.walkTo((WorldPoint)var3);

                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(var2)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[60]];
                    var2.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[61]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(var4.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var3 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[86]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];

                        if (3 <= 2) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[62]];
                    var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[63]]);
                    return lIIIIIIlIIllI[16];
                }
                var2 = new WorldPoint(lIIIIIIlIIllI[64], lIIIIIIlIIllI[65], lIIIIIIlIIllI[4]);
                var1 = TileObjects.getNearest(arg_0 -> h.b((WorldPoint)var2, arg_0));
                if (h.lIIlIlllIllllll(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[66]];
                    Movement.walkTo((WorldPoint)var2);

                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[67]];
                    var1.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[68]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(var4.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var3 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[84]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];

                        if (1 <= ((83 + 16 - 85 + 139 ^ 128 + 71 - 182 + 162) & (0x3D ^ 0x16 ^ 1 ^ -1))) {
                            return ((118 + 2 - 99 + 124 ^ 53 + 160 - 78 + 45) & (0xF4 ^ 0x89 ^ (0xC2 ^ 0x9A) ^ -1)) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[69]];
                    var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[70]]);
                    return lIIIIIIlIIllI[16];
                }
                var2 = new WorldPoint(lIIIIIIlIIllI[45], lIIIIIIlIIllI[46], lIIIIIIlIIllI[4]);
                var1 = TileObjects.getNearest(arg_0 -> h.a((WorldPoint)var2, arg_0));
                if (h.lIIlIlllIllllll(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[71]];
                    Movement.walkTo((WorldPoint)var2);

                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(var1)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[72]];
                    var1.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[73]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(var4.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && h.lIIlIlllIlllllI(h.d() ? 1 : 0)) {
                var3 = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[83]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];

                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[74]];
                    var3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[75]]);
                    return lIIIIIIlIIllI[16];
                }
                if (h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(var4.W), lIIIIIIlIIllI[28]) && (!h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !h.lIIlIllllIIIIII(var3) || h.lIIlIllllIIIIII(var3) && h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(var3.getWorldLocation()), lIIIIIIlIIllI[29]))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[76]];
                    Movement.walkTo((WorldPoint)var4.W);

                    return lIIIIIIlIIllI[16];
                }
                if (h.lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(var4.W), lIIIIIIlIIllI[28])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[77]];
                    String[] stringArray = new String[lIIIIIIlIIllI[16]];
                    stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[78]];
                    var2 = TileObjects.getNearest((String[])stringArray);
                    if (h.lIIlIllllIIIIII(var2)) {
                        var2.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[15]]);
                        return lIIIIIIlIIllI[16];
                    }
                }
            }
        }
        return lIIIIIIlIIllI[4];
    }

    private static boolean lIIlIllllIIIIIl(int n, int n2) {
        return n < n2;
    }

    static {
        h.lIIlIlllIllllII();
        h.lIIlIlllIlllIll();
    }

    private static boolean lIIlIllllIIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIllllIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllIllllll(Object object) {
        return object == null;
    }

    private static  boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[85]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[31])) {
            n = lIIIIIIlIIllI[16];

            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static  boolean f(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[11]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];

            if (-1 >= 1) {
                return false;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

        return String.valueOf(var5);
    }

    @Inject
    public CaveNavTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.S = new WorldArea(lIIIIIIlIIllI[0], lIIIIIIlIIllI[1], lIIIIIIlIIllI[2], lIIIIIIlIIllI[3], lIIIIIIlIIllI[4]);
        this.T = new WorldArea(lIIIIIIlIIllI[0], lIIIIIIlIIllI[5], lIIIIIIlIIllI[6], lIIIIIIlIIllI[7], lIIIIIIlIIllI[4]);
        this.U = new WorldArea(lIIIIIIlIIllI[8], lIIIIIIlIIllI[9], lIIIIIIlIIllI[10], lIIIIIIlIIllI[11], lIIIIIIlIIllI[4]);
        this.V = new WorldArea(lIIIIIIlIIllI[12], lIIIIIIlIIllI[13], lIIIIIIlIIllI[14], lIIIIIIlIIllI[15], lIIIIIIlIIllI[16]);
        this.W = new WorldPoint(lIIIIIIlIIllI[17], lIIIIIIlIIllI[18], lIIIIIIlIIllI[4]);
        this.X = new WorldPoint(lIIIIIIlIIllI[19], lIIIIIIlIIllI[20], lIIIIIIlIIllI[4]);
        this.R = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIlllIllllIl(int n) {
        return n == 0;
    }

    private static  boolean d(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[89]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];

            if (((0x5A ^ 0x10) & ~(0x1D ^ 0x57)) < 0) {
                return false;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[2]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];

            if (2 > 2) {
                return ((0x79 ^ 0xD ^ (0xF0 ^ 0xB9)) & (2 ^ 0x28 ^ (0x64 ^ 0x73) ^ -1)) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static  boolean e(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[90]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];

        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static boolean lIIlIllllIIIlII(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIllllIIIlIl(int n, int n2) {
        return n >= n2;
    }

    public static boolean d() {
        block10: {
            block11: {
                block8: {
                    block9: {
                        block6: {
                            block7: {
                                if (!h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[21])) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[33])) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[58]))) break block6;
                                if (!h.lIIlIlllIlllllI(Inventory.isFull() ? 1 : 0)) break block7;
                                String[] stringArray = new String[lIIIIIIlIIllI[16]];
                                stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[79]];
                                if (!h.lIIlIlllIlllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block6;
                            }
                            return lIIIIIIlIIllI[4];
                        }
                        if (!h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[33]))) break block8;
                        String[] stringArray = new String[lIIIIIIlIIllI[16]];
                        stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[80]];
                        if (!h.lIIlIllllIIIlIl(Inventory.getCount((String[])stringArray), Y)) break block9;
                        String[] stringArray2 = new String[lIIIIIIlIIllI[16]];
                        stringArray2[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[81]];
                        if (!h.lIIlIlllIlllllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
                    }
                    return lIIIIIIlIIllI[4];
                }
                if (!h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) || !h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[33]), lIIIIIIlIIllI[16]) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[58]))) break block10;
                String[] stringArray = new String[lIIIIIIlIIllI[16]];
                stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[14]];
                if (!h.lIIlIllllIIIlIl(Inventory.getCount((String[])stringArray), aa)) break block11;
                String[] stringArray3 = new String[lIIIIIIlIIllI[16]];
                stringArray3[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[82]];
                if (!h.lIIlIlllIlllllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block10;
            }
            return lIIIIIIlIIllI[4];
        }
        return lIIIIIIlIIllI[16];
    }

    private static boolean lIIlIllllIIIIlI(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIlllIlllllI(int n) {
        return n != 0;
    }
}

